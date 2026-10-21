package com;

import java.awt.Component;
import java.awt.Dimension;

class SX extends SZ {
   final com.k4_2 L;

   SX(com.k4_2 var1, Component var2, boolean var3) {
      super(var2, var3);
      this.L = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      var1.height = com.k4_2.g(this.L).getPreferredSize().height;
      return var1;
   }
}





