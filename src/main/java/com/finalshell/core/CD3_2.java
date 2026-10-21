package com.finalshell.core;

import com.finalshell.ui.panel.QX;

public class CD3_2 extends C42 {
   final QX n;

   CD3_2(QX var1, boolean var2) {
      super(var2);
      this.n = var1;
   }

   @Override
   public boolean z() {
      return this.n.isShowing();
   }

   @Override
   public void f(boolean var1) {
      this.n.j(var1);
   }
}





