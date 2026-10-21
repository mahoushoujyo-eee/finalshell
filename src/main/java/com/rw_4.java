package com;

class rw_4 implements Runnable {
   final String e;
   final com.D2 w;

   rw_4(com.D2 var1, String var2) {
      this.w = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      com.D2.G(this.w).setString(this.e);
   }
}





