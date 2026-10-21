package com;

import java.io.File;

class a5 implements Runnable {
   final File g;
   final u2 r;

   a5(u2 var1, File var2) {
      this.r = var1;
      this.g = var2;
   }

   @Override
   public void run() {
      com.cY_3 var1 = this.r.d(this.g);
      if (var1 != null) {
         this.r.b(var1);
      }
   }
}





