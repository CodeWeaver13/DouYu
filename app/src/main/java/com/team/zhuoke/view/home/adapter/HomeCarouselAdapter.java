package com.team.zhuoke.view.home.adapter;

import android.net.Uri;
import android.view.ViewTreeObserver;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.team.zhuoke.utils.L;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1702
 */
public class HomeCarouselAdapter implements BGABanner.Adapter<SimpleDraweeView, String> {
    @Override
    public void fillBannerItem(BGABanner banner, SimpleDraweeView itemView, String model, int position) {
        ImageRequestBuilder builder = ImageRequestBuilder.newBuilderWithSource(Uri.parse(model));
            builder.setResizeOptions(new ResizeOptions(1080 , 200));
//        }
        ImageRequest request = builder.build();
        PipelineDraweeController controller = (PipelineDraweeController) Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setTapToRetryEnabled(true)
                .setOldController(itemView.getController())
                .build();
        itemView.setController(controller);

    }
}
