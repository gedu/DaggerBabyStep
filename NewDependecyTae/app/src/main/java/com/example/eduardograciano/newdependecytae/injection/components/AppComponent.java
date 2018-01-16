package com.example.eduardograciano.newdependecytae.injection.components;

import android.app.Application;

import com.example.eduardograciano.newdependecytae.MyApplication;
import com.example.eduardograciano.newdependecytae.injection.modules.AppModule;
import com.example.eduardograciano.newdependecytae.injection.modules.builder.ActivityBuilder;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder application(Application application);
    AppComponent build();
  }

  void inject(MyApplication application);
}
