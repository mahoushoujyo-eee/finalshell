package com;

class kQ_3 implements Runnable {
   final String X;
   final com.D2 J;

   kQ_3(com.D2 var1, String var2) {
      this.J = var1;
      this.X = var2;
   }

   @Override
   public void run() {
      com.D2.k(this.J).setText(this.X);
   }
}





