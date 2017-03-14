package com.team.zhuoke.view.live.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseActivity;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.base.SwipeBackActivity;
import com.team.zhuoke.utils.Utils;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by renxl on 2016/11/24.
 * <p>
 * // TODO: 2016/11/26  跳转 WebViewActivity 界面的时候不要让其他人 关心需要怎么传参数，只需要 传入参数即可。写一个 PageCtrl 的类来做 所有 Activity 的跳转。试试做做
 * <p>
 * email: renxuelongvip@163.com
 */
public class WebViewActivity extends SwipeBackActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.progressbar_webview)
    ProgressBar mProgressBar;
    @BindView(R.id.web_main)
    WebView mWebView;
    @BindView(R.id.activity_web_view)
    LinearLayout activityWebView;
    IX5WebChromeClient.CustomViewCallback callback;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_web_view;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Intent intent = getIntent();
        // // TODO: 2016/11/26  常量问题
        String url = intent.getStringExtra("web_url");
        String title = intent.getStringExtra("web_title");
        setTitle(title);

        initView();
        mWebView.loadUrl(url);
    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getView() {
        return null;
    }
    private void initView() {
        WebSettings webSetting = mWebView.getSettings();
        webSetting.setAllowFileAccess(true);
        webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
//        webSetting.setSupportZoom(true);
//        webSetting.setBuiltInZoomControls(true);
        webSetting.setUseWideViewPort(true);
        webSetting.setSupportMultipleWindows(false);
        webSetting.setLoadWithOverviewMode(true);
        webSetting.setAppCacheEnabled(true);
        //webSetting.setDatabaseEnabled(true);
        webSetting.setDomStorageEnabled(true);
        webSetting.setJavaScriptEnabled(true);
        webSetting.setGeolocationEnabled(true);
        mWebView.setDrawingCacheEnabled(true);
        webSetting.setAppCacheMaxSize(Long.MAX_VALUE);
        webSetting.setAppCachePath(this.getDir("appcache", 0).getPath());
        webSetting.setDatabasePath(this.getDir("databases", 0).getPath());
        webSetting.setGeolocationDatabasePath(this.getDir("geolocation", 0)
                .getPath());
        webSetting.setPluginState(WebSettings.PluginState.ON_DEMAND);
        // webSetting.setPageCacheCapacity(IX5WebSettings.DEFAULT_CACHE_CAPACITY);

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
            /**
             * 全屏播放配置
             */
            @Override
            public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
                callback=customViewCallback;
            }
            @Override
            public void onHideCustomView() {
                if (callback != null) {
                    callback.onCustomViewHidden();
                    callback = null;
                }
                if (mWebView != null) {
                    ViewGroup viewGroup = (ViewGroup) mWebView.getParent();
                    viewGroup.removeView(mWebView);
                }
            }
            @Override
            public void onReceivedTitle(WebView arg0, final String arg1) {
                super.onReceivedTitle(arg0, arg1);
                tvTitle.setText(arg1);

            }
            @Override
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                changeProgress(i);
            }
        });


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
    protected void onDestroy() {
        if (mWebView != null)
            mWebView.destroy();
        super.onDestroy();
    }

    @OnClick(R.id.img_back)
    public void back() {
        finish();
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
