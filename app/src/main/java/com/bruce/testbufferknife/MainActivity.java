package com.bruce.testbufferknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.TextView)
    android.widget.TextView TextView;
    @Bind(R.id.Name)
    android.widget.TextView Name;
    @Bind(R.id.ImgBtn)
    Button ImgBtn;
    @Bind(R.id.Layout)
    LinearLayout Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.TextView, R.id.Name, R.id.ImgBtn, R.id.Layout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.TextView:
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_LONG).show();
                break;
            case R.id.Name:
                break;
            case R.id.ImgBtn:
                break;
            case R.id.Layout:
                break;
        }
    }

    static class ViewHolder {
        @Bind(R.id.Layout)
        LinearLayout Layout;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
