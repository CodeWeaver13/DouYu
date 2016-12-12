package com.team.zhuoke;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;

import com.team.zhuoke.utils.Utils;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/**
 * Created by renxl on 2016/11/24.
 *
 * // TODO: 2016/11/26  跳转 WebViewActivity 界面的时候不要让其他人 关心需要怎么传参数，只需要 传入参数即可。写一个 PageCtrl 的类来做 所有 Activity 的跳转。试试做做
 *
 * email: renxuelongvip@163.com
 */
public class WebViewActivity extends AppCompatActivity {

    private WebView mWebView;
    private ProgressBar mProgressBar;

    /**
     * 跳转到WebView界面
     *
     * @param context 上下文
     * @param url     网址
     */
    public static void showWebViewActivity(Context context, String url, String title) {
        Intent intent = new Intent(context, WebViewActivity.class);

        // TODO: 2016/11/26  这些地方是需要常量的，别直接给里面写字符串，要复用。这样写容易出错，也不太好统一起来。
        intent.putExtra("web_url", url);
        intent.putExtra("web_title", title);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        // // TODO: 2016/11/26  常量问题
        String url = intent.getStringExtra("web_url");
        url= "http://app.html5.qq.com/navi/index";
        String title = intent.getStringExtra("web_title");
        setTitle(title);

        initView();
        mWebView.loadUrl(url);

    }

    private void initView() {
        mWebView = (WebView) findViewById(R.id.web_main);
        WebSettings webSetting = mWebView.getSettings();
        webSetting.setAllowFileAccess(true);
        webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSetting.setSupportZoom(true);
        webSetting.setBuiltInZoomControls(true);
        webSetting.setUseWideViewPort(true);
        webSetting.setSupportMultipleWindows(false);
        //webSetting.setLoadWithOverviewMode(true);
        webSetting.setAppCacheEnabled(true);
        //webSetting.setDatabaseEnabled(true);
        webSetting.setDomStorageEnabled(true);
        webSetting.setJavaScriptEnabled(true);
        webSetting.setGeolocationEnabled(true);
        webSetting.setAppCacheMaxSize(Long.MAX_VALUE);
        webSetting.setAppCachePath(this.getDir("appcache", 0).getPath());
        webSetting.setDatabasePath(this.getDir("databases", 0).getPath());
        webSetting.setGeolocationDatabasePath(this.getDir("geolocation", 0)
                .getPath());
        // webSetting.setPageCacheCapacity(IX5WebSettings.DEFAULT_CACHE_CAPACITY);
        webSetting.setPluginState(WebSettings.PluginState.ON_DEMAND);
        mProgressBar = (ProgressBar) findViewById(R.id.progressbar_webview);
        initWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initWebView() {
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                webView.loadUrl(s);
                return false;
            }
        });

        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                changeProgress(i);
            }
        });

        WebSettings webSettings = mWebView.getSettings();
        if (Utils.isNetworkConnected(getApplicationContext())) {
            webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        } else {
            webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }

        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);

    }

    private void changeProgress(int i) {
        if (i >= 0 && i < 100) {
            mProgressBar.setProgress(i);
            mProgressBar.setVisibility(View.VISIBLE);
        } else if (i == 100) {
            mProgressBar.setProgress(100);
            mProgressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
