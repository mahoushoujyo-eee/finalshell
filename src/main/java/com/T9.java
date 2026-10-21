package com;

class T9 implements Runnable {
   final String y;
   final com.D2 f;

   T9(com.D2 var1, String var2) {
      this.f = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      com.D2.k(this.f).u(this.y, new Object[0]);
   }
}





