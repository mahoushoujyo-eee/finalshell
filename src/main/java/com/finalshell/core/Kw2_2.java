package com.finalshell.core;

import com.finalshell.ui.panel.SZ;
import java.awt.Dimension;

public class Kw2_2 extends KD {
   final Xm2 K;

   Kw2_2(Xm2 var1, Og4 var2) {
      super(var2);
      this.K = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = SZ.L();
      Xm2 var10000 = this.K;
      if (var1 == null) {
         if (this.K.E == null) {
            return new Dimension(0, 0);
         }

         if (var1 != null) {
            return super.getPreferredSize();
         }

         var10000 = this.K;
      }

      return var10000.e ? super.getPreferredSize() : new Dimension(0, 0);
   }
}





