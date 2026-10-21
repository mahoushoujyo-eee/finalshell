package com;

class wR_3 implements Runnable {
   final com.DI A;

   wR_3(com.DI var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      this.A.S();
   }
}





