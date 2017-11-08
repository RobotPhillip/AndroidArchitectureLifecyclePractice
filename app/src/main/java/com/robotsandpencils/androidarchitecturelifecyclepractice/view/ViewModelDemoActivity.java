package com.robotsandpencils.androidarchitecturelifecyclepractice.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.robotsandpencils.androidarchitecturelifecyclepractice.R;
import com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel.ClickCounterViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pwray on 2017-11-07.
 */

public class ViewModelDemoActivity extends AppCompatActivity {

    @BindView(R.id.click_count_text)
    protected TextView clickCountText;

    private ClickCounterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel_layout);
        ButterKnife.bind(this);

        // lifecycle
        viewModel = ViewModelProviders.of(this).get(ClickCounterViewModel.class);

        displayClickCount(viewModel.getCount());
    }


    @OnClick(R.id.increment_button)
    public void incrementClickCount(View button) {
        viewModel.setCount(viewModel.getCount() + 1);
        displayClickCount(viewModel.getCount());
    }

    private void displayClickCount(int clickCount) {
        clickCountText.setText(String.valueOf(clickCount));
    }

}
