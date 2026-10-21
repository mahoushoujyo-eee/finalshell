package com.finalshell.ui.panel;

import java.awt.Component;
import java.awt.Dimension;

public class SX extends SZ {
   final K42 L;

   SX(K42 var1, Component var2, boolean var3) {
      super(var2, var3);
      this.L = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      var1.height = K42.g(this.L).getPreferredSize().height;
      return var1;
   }
}





