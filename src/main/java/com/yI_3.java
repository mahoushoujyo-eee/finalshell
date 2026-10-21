package com;

class yI_3 implements Runnable {
   final IR E;

   yI_3(IR var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      this.E.X();
   }
}





