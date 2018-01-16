package com.example.eduardograciano.newdependecytae;

import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by eduardo.graciano on 1/16/18.
 */

public class MainPresenter {

  private SharedPreferences mSharedPreferences;

  @Inject
  public MainPresenter(SharedPreferences sharedPreferences) {
    mSharedPreferences = sharedPreferences;
  }

  public void save(String something) {
    mSharedPreferences.edit().putString("hola", something).apply();
  }

  public String restore() {
    return mSharedPreferences.getString("hola", "Nada guardado");
  }
}
