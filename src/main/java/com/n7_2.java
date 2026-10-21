package com;

class n7_2 implements Runnable {
   final int J;
   final com.D2 L;

   n7_2(com.D2 var1, int var2) {
      this.L = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.L).setMinimum(this.J);
   }
}





