package com.finalshell.core;

import com.finalshell.ui.panel.SZ;
import java.awt.Dimension;

public class KJ_2 extends KD {
   final Xm2 J;

   KJ_2(Xm2 var1, Og4 var2) {
      super(var2);
      this.J = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = SZ.L();
      Xm2 var10000 = this.J;
      if (var1 == null) {
         if (this.J.E == null) {
            return new Dimension(0, 0);
         }

         if (var1 != null) {
            return super.getPreferredSize();
         }

         var10000 = this.J;
      }

      return var10000.e ? super.getPreferredSize() : new Dimension(0, 0);
   }
}





