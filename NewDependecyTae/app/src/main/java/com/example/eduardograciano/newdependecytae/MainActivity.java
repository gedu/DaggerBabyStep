package com.example.eduardograciano.newdependecytae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

  @Inject
  MainPresenter mPresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AndroidInjection.inject(this);
    setContentView(R.layout.activity_main);

    final TextView text = findViewById(R.id.msg_text);

    findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mPresenter.save(((EditText) findViewById(R.id.text_input)).getText().toString());
      }
    });

    findViewById(R.id.restore_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        text.setText(mPresenter.restore());
      }
    });

    text.setText(mPresenter.restore());
  }
}
