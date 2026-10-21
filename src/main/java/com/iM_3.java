package com;

class iM_3 implements Runnable {
   final int h;
   final iI_3 u;

   iM_3(iI_3 var1, int var2) {
      this.u = var1;
      this.h = var2;
   }

   @Override
   public void run() {
      this.u.A.setValue(this.h);
   }
}





