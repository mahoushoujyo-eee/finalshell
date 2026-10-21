package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Co2;
import com.finalshell.ui.panel.OQ;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class F42 implements PropertyChangeListener {
   final Co2 U;
   final OQ a;

   F42(OQ var1, Co2 var2) {
      this.a = var1;
      this.U = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      boolean var2 = this.U.isEnabled();
      this.a.z.setEnabled(var2);
      this.a.a.setEnabled(var2);
      this.a.o.setEnabled(var2);
      this.a.U.setEnabled(var2);
   }
}





