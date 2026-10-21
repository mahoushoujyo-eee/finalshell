package com;

import java.awt.Dimension;

class KJ extends com.KD {
   final Xm_2 J;

   KJ(Xm_2 var1, com.og_4 var2) {
      super(var2);
      this.J = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = SZ.L();
      Xm_2 var10000 = this.J;
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





