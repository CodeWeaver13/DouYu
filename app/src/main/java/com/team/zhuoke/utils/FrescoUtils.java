package com.team.zhuoke.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;


/**
 * Author： yolanda
 * <p>
 * CreateTime： 2016/9/22 0022 上午 10:50
 * <p>
 * description：Fresco 使用API
 */

public class FrescoUtils {
    /**
     * Author： yolanda
     * <p>
     * CreateTime： 2016/9/22 0022 下午 1:42
     * <p>
     * description：显示图片
     *
     * @param simpleDraweeView 显示图片的控件
     * @param url              图片加载的url
     * @param resources        在Activity中直接使用getResource方法即可
     * @param fadeDuration     渐变加载的时间
     * @return
     */
    public static void showPic(SimpleDraweeView simpleDraweeView, String url, Resources resources, int fadeDuration) {
        GenericDraweeHierarchy hierarchy = new GenericDraweeHierarchyBuilder(resources)
                .setFadeDuration(fadeDuration)
                .build();
        simpleDraweeView.setHierarchy(hierarchy);
        simpleDraweeView.setImageURI(Uri.parse(url));
    }

    private static boolean isInit = false;

    /**
     * Author： yolanda
     * <p>
     * CreateTime： 2016/9/22  下午 1:42
     * <p>
     * description：显示图片的缩略图
     */
    public static void showThumb(SimpleDraweeView draweeView, String url, int resizeWidthDp, int resizeHeightDp) {
        if (url == null || "".equals(url))
            return;
        if (draweeView == null)
            return;
        initialize(draweeView.getContext());
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(Uri.parse(url))
                .setResizeOptions(new ResizeOptions( resizeWidthDp,resizeHeightDp))
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setOldController(draweeView.getController())
                .setControllerListener(new BaseControllerListener<>())
                .build();
        draweeView.setController(controller);
    }

    /**
     * Author： yolanda
     * <p>
     * CreateTime： 2016/9/22  下午 1:42
     * <p>
     * description：
     */
    public static void initialize(Context context) {
        if (isInit)
            return;
        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(context)
                .setDownsampleEnabled(true)
                .build();
        Fresco.initialize(context, config);
        isInit = true;
    }
}
