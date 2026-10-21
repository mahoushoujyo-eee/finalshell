package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class F4 implements PropertyChangeListener {
   final com.Co_2 U;
   final com.OQ a;

   F4(com.OQ var1, com.Co_2 var2) {
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





