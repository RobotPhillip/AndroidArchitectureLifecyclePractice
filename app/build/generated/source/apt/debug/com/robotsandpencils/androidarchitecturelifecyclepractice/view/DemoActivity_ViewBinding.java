// Generated code from Butter Knife. Do not modify!
package com.robotsandpencils.androidarchitecturelifecyclepractice.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.robotsandpencils.androidarchitecturelifecyclepractice.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DemoActivity_ViewBinding implements Unbinder {
  private DemoActivity target;

  private View view2131230801;

  @UiThread
  public DemoActivity_ViewBinding(DemoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DemoActivity_ViewBinding(final DemoActivity target, View source) {
    this.target = target;

    View view;
    target.clickCountText = Utils.findRequiredViewAsType(source, R.id.click_count_text, "field 'clickCountText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.increment_button, "method 'incrementClickCount'");
    view2131230801 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.incrementClickCount(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DemoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.clickCountText = null;

    view2131230801.setOnClickListener(null);
    view2131230801 = null;
  }
}
