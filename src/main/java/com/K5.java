package com;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class K5 implements PropertyChangeListener {
   final com.ky_4 v;
   final com.DK z;

   K5(com.DK var1, com.ky_4 var2) {
      this.z = var1;
      this.v = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.z.j.setPreferredSize(null);
      this.z.L.setPreferredSize(null);
      com.FN.b(new Component[]{this.z.j, this.z.L});
      this.v.revalidate();
   }
}





