package com.example.adslib;

import android.app.Activity;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adslib.ads.AdsInterstitial;
import com.example.adslib.ads.AdsNative;

public class AdsUtils {
    private AdsUtils() {
    }
    public static AdsUtils INSTANCE = new AdsUtils();

    public static String TAG = "AdsUtils";

    public static final String TEST_INTERSTITIAL_ID = "ca-app-pub-3940256099942544/1033173712";
    public static final String TEST_NATIVE_ID = "ca-app-pub-3940256099942544/2247696110";

    public AdsInterstitial createAdsInterstitial (Activity activity, String adId) {
        return new AdsInterstitial(activity, adId);
    }

    public AdsNative createAdsNative (Activity activity, String adId, FrameLayout adContainer, int layoutAdId) {
        return new AdsNative(activity, adId, adContainer, layoutAdId);
    }

    public AdsNative createAdsNativeWithShimmer (Activity activity, String adId, FrameLayout adContainer,
                                                   int layoutAdId, int shimmerLayoutId) {
        AdsNative nativeAd = new AdsNative(activity, adId, adContainer, layoutAdId);
        nativeAd.enableShimmer(shimmerLayoutId);
        return nativeAd;
    }

    public AdsNative createAdsBannerNativeWithShimmer(Activity activity, String adId, FrameLayout adContainer) {
        AdsNative nativeAd = new AdsNative(activity, adId, adContainer, R.layout.ads_native_banner);
        nativeAd.enableShimmer(R.layout.shimmer_native_banner);
        return nativeAd;
    }

    public AdsNative createAdsMediumNativeWithShimmer(Activity activity, String adId, FrameLayout adContainer) {
        AdsNative nativeAd = new AdsNative(activity, adId, adContainer, R.layout.ads_native_medium);
        nativeAd.enableShimmer(R.layout.shimmer_native_medium);
        return nativeAd;
    }

    public AdsNative createAdsBigNativeWithShimmer(Activity activity, String adId, FrameLayout adContainer) {
        AdsNative nativeAd = new AdsNative(activity, adId, adContainer, R.layout.ads_native_big);
        nativeAd.enableShimmer(R.layout.shimmer_native_big);
        return nativeAd;
    }


}
