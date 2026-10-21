package com;

import java.io.File;
import java.io.IOException;

class p8_2 implements Runnable {
   final CK J;
   final File p;
   final pv_4 l;

   p8_2(pv_4 var1, CK var2, File var3) {
      this.l = var1;
      this.J = var2;
      this.p = var3;
   }

   @Override
   public void run() {
      try {
         this.J.I(this.p);
      } catch (IOException var2) {
         var2.printStackTrace();
         this.l.s = false;
      }
   }
}





