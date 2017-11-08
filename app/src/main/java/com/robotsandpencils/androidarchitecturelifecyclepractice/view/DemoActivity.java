package com.robotsandpencils.androidarchitecturelifecyclepractice.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.robotsandpencils.androidarchitecturelifecyclepractice.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pwray on 2017-11-06.
 */

public class DemoActivity extends AppCompatActivity {

    @BindView(R.id.click_count_text)
    protected TextView clickCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.increment_button)
    public void incrementClickCount(View button) {
        int currentClickCount = Integer.parseInt(clickCountText.getText().toString());
        clickCountText.setText(String.valueOf(++currentClickCount));
    }
}
