package com.finalshell.core;

import com.finalshell.ui.panel.EX;
import com.finalshell.ui.panel.KD3;

public class X2_2 implements Hc2 {
   final EX y;
   final KD3 m;

   X2_2(KD3 var1, EX var2) {
      this.m = var1;
      this.y = var2;
   }

   @Override
   public void X() {
      this.y.removeChangeListener(KD3.i(this.m));
      this.y.setValue(KD3.c(this.m).F());
      this.y.addChangeListener(KD3.i(this.m));
   }
}





