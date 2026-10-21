package com;

class Yu_2 implements Runnable {
   final pA_3 P;

   Yu_2(pA_3 var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      int var1 = _y_2.y();
      pA_3 var10000 = this.P;
      if (var1 == 0) {
         if (pA_3.A(this.P) == null) {
            return;
         }

         var10000 = this.P;
      }

      com.OT var2 = var10000.n();
      com.OT var3 = var2;
      if (var1 == 0) {
         if (var2 == null) {
            return;
         }

         var2 = IR.V(var2);
         var3 = this.P.N;
      }

      boolean var4 = var3.equals(var2);
      label24:
      if (var1 == 0) {
         if (var4) {
            boolean var5 = pA_3.H(this.P);
            if (var1 != 0) {
               break label24;
            }

            if (var5) {
               return;
            }
         }

         pA_3.u(this.P, true);
      }

      pA_3.H(this.P).R();
      pA_3.A(this.P).J(var2, wF_3.User);
   }
}





