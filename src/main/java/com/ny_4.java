package com;

class ny_4 implements Runnable {
   final pA_3 d;

   ny_4(pA_3 var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      int var1 = _y_2.y();
      pA_3 var10000 = this.d;
      if (var1 == 0) {
         if (pA_3.A(this.d) == null) {
            return;
         }

         var10000 = this.d;
      }

      com.OT var2 = var10000.n();
      pA_3.A(this.d).J(var2, wF_3.User);
   }
}





