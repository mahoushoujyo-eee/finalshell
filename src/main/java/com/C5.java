package com;

class C5 implements Runnable {
   final boolean I;
   final com.D2 h;

   C5(com.D2 var1, boolean var2) {
      this.h = var1;
      this.I = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.h).setIndeterminate(this.I);
   }
}





