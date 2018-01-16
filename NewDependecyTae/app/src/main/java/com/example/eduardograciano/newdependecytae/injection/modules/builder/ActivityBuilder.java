package com.example.eduardograciano.newdependecytae.injection.modules.builder;

import com.example.eduardograciano.newdependecytae.MainActivity;
import com.example.eduardograciano.newdependecytae.injection.modules.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

@Module
public abstract class ActivityBuilder {

  @ContributesAndroidInjector(modules = MainActivityModule.class)
  abstract MainActivity bindMainActivity();
}
