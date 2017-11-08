// Generated code from Butter Knife. Do not modify!
package com.robotsandpencils.androidarchitecturelifecyclepractice.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.robotsandpencils.androidarchitecturelifecyclepractice.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LiveDataDemoActivity_ViewBinding implements Unbinder {
  private LiveDataDemoActivity target;

  @UiThread
  public LiveDataDemoActivity_ViewBinding(LiveDataDemoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LiveDataDemoActivity_ViewBinding(LiveDataDemoActivity target, View source) {
    this.target = target;

    target.timerValueText = Utils.findRequiredViewAsType(source, R.id.timer_value_text, "field 'timerValueText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LiveDataDemoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.timerValueText = null;
  }
}
