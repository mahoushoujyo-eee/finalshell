package com;

class Pk_2 implements Runnable {
   final boolean e;
   final com.D2 t;

   Pk_2(com.D2 var1, boolean var2) {
      this.t = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.t).setStringPainted(this.e);
      com.D2.t(this.t);
   }
}





