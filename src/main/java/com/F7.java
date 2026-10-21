package com;

import java.lang.ref.WeakReference;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

class F7 extends com.FY {
   final WeakReference m;

   F7(WeakReference var1) {
      this.m = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      i2_2.s((JComponent)this.m.get());
   }
}





