package com.finalshell.ui.listener;

import com.finalshell.core.I22;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

public class F7 extends FY {
   final WeakReference m;

   F7(WeakReference var1) {
      this.m = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      I22.s((JComponent)this.m.get());
   }
}





