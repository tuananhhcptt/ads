package com.example.adslib.ads.openads;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public abstract class OpenAdsApplication extends Application {
    private static volatile AppOpenManager appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                    }
                });

        if(appOpenManager == null) {
            appOpenManager = new AppOpenManager(this, getOpenAdsId());
        }
    }

    protected abstract String getOpenAdsId();
}
