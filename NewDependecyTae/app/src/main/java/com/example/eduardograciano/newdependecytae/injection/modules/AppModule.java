package com.example.eduardograciano.newdependecytae.injection.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

@Module
public class AppModule {

  @Provides
  @Singleton
  Context provideContext(Application application) {
    return application;
  }

  @Provides
  @Singleton
  SharedPreferences providePreference(Application application) {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }
}
