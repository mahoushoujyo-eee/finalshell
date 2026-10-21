package com;

class ck_4 extends com.c4_2 {
   final com.kz_4 o;

   ck_4(com.kz_4 var1) {
      this.o = var1;
   }

   @Override
   public void f(boolean var1) {
      this.o.o = var1;
      this.o.repaint();
   }
}





