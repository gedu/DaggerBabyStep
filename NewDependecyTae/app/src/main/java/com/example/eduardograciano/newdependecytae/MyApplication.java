package com.example.eduardograciano.newdependecytae;

import android.app.Activity;
import android.app.Application;

import com.example.eduardograciano.newdependecytae.injection.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

public class MyApplication extends Application implements HasActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();

    DaggerAppComponent.builder().application(this).build().inject(this);
  }

  @Override
  public AndroidInjector<Activity> activityInjector() {
    return mActivityDispatchingAndroidInjector;
  }
}
