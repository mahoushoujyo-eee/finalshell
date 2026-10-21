package com;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class DL implements PropertyChangeListener {
   final Component m;
   final com.E a;
   final Rt_2 Q;
   final com.Ds_2 D;

   DL(com.Ds_2 var1, Component var2, com.E var3, Rt_2 var4) {
      this.D = var1;
      this.m = var2;
      this.a = var3;
      this.Q = var4;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.D.F(this.m, this.a);
      this.Q.s();
   }
}





