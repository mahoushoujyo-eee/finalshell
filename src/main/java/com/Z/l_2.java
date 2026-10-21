package com.Z;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class l_2 implements PropertyChangeListener {
   final com.ky_4 M;
   final com.Z.T U;

   l_2(com.Z.T var1, com.ky_4 var2) {
      this.U = var1;
      this.M = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.U.I.setPreferredSize(null);
      this.U.a.setPreferredSize(null);
      this.U.I.p(this.U.I.getText());
      this.U.a.p(this.U.a.getText());
      com.FN.b(new Component[]{this.U.I, this.U.a});
      this.M.revalidate();
   }
}





