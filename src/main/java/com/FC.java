package com;

class FC implements Runnable {
   final com.QU t;

   FC(com.QU var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      PK.a(this.t.p);
   }
}





