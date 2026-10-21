package com;

import java.awt.ComponentOrientation;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class wV_3 implements PropertyChangeListener {
   final com.Co_2 t;
   final com.OQ P;

   wV_3(com.OQ var1, com.Co_2 var2) {
      this.P = var1;
      this.t = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      ComponentOrientation var2 = this.t.getComponentOrientation();
      this.P.a.setComponentOrientation(var2);
      this.P.o.setComponentOrientation(var2);
      this.P.U.setComponentOrientation(var2);
   }
}





