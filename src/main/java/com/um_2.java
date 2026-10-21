package com;

class um_2 implements Runnable {
   final com.cB_3 o;
   final com.zn_2 c;

   um_2(com.zn_2 var1, com.cB_3 var2) {
      this.c = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      this.c.c.w(this.o, new NF(this));
   }
}





