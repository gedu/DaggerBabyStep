package com.example.eduardograciano.newdependecytae.injection.modules;

import android.content.SharedPreferences;

import com.example.eduardograciano.newdependecytae.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

@Module
public class MainActivityModule {

  @Provides
  MainPresenter providePresenter(SharedPreferences sharedPreferences) {
    return new MainPresenter(sharedPreferences);
  }
}
