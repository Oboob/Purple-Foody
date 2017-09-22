// Generated code from Butter Knife. Do not modify!
package settings.androidhive.info.purplefoody;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.tx_option1 = Utils.findRequiredViewAsType(source, R.id.text1, "field 'tx_option1'", TextView.class);
    target.tx_option2 = Utils.findRequiredViewAsType(source, R.id.text2, "field 'tx_option2'", TextView.class);
    target.tx_option3 = Utils.findRequiredViewAsType(source, R.id.text3, "field 'tx_option3'", TextView.class);
    target.tx_option4 = Utils.findRequiredViewAsType(source, R.id.text4, "field 'tx_option4'", TextView.class);
    target.tx_option5 = Utils.findRequiredViewAsType(source, R.id.text5, "field 'tx_option5'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tx_option1 = null;
    target.tx_option2 = null;
    target.tx_option3 = null;
    target.tx_option4 = null;
    target.tx_option5 = null;

    this.target = null;
  }
}
