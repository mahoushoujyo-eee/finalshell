package com.finalshell.ui.listener;

import com.finalshell.core.E_2;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DL implements PropertyChangeListener {
   public final Component m;
   public final E_2 a;
   public final Rt2 Q;
   public final com.finalshell.ui.dialog.Ds2 D;

   public DL(com.finalshell.ui.dialog.Ds2 var1, Component var2, E_2 var3, Rt2 var4) {
      this.D = var1;
      this.m = var2;
      this.a = var3;
      this.Q = var4;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.D.F(this.m, this.a);
      this.Q.s$void();
   }
}





