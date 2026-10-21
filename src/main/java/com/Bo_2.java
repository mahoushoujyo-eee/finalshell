package com;

class Bo_2 implements Runnable {
   final int B;
   final com.D2 F;

   Bo_2(com.D2 var1, int var2) {
      this.F = var1;
      this.B = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.F).setMaximum(this.B);
   }
}





