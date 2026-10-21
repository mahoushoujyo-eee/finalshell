package com;

import java.awt.event.KeyEvent;

class kL_3 implements Runnable {
   final com.Wc_2 k;
   final KeyEvent D;

   kL_3(com.Wc_2 var1, KeyEvent var2) {
      this.k = var1;
      this.D = var2;
   }

   @Override
   public void run() {
      this.k.j(this.D);
   }
}





