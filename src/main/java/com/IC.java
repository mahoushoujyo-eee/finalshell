package com;

class IC implements Runnable {
   final com.kD_3 Y;

   IC(com.kD_3 var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      com.kD_3.n(this.Y, true);
   }
}





