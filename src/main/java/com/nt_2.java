package com;

import javax.swing.SwingUtilities;

class Nt_2 implements iL_3 {
   final int l;
   final int Z;
   final pA_3 e;

   Nt_2(pA_3 var1, int var2, int var3) {
      this.e = var1;
      this.l = var2;
      this.Z = var3;
   }

   @Override
   public void s() {
      int var10000 = _y_2.M();
      int var2 = pA_3.D(this.e).T.r - 1;
      int var1 = var10000;
      if (var1 != 0) {
         if (var2 + this.l < this.Z) {
            return;
         }

         pA_3.T(this.e).q(this);
      }

      SwingUtilities.invokeLater(this::lambda$modelChanged$0);
   }

   private void lambda$modelChanged$0() {
      pA_3.T(this.e).w();

      try {
         pA_3.y(this.e).setRangeProperties(0, this.e.N.c(), -pA_3.T(this.e).H(), this.e.N.c(), false);
      } finally {
         pA_3.T(this.e).h();
      }
   }
}





