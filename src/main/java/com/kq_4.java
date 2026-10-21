package com;

class kq_4 implements Runnable {
   final int V;
   final com.D2 u;

   kq_4(com.D2 var1, int var2) {
      this.u = var1;
      this.V = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.u).setValue(this.V);
   }
}





