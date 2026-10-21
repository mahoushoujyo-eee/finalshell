package com;

import java.io.File;

class ra_4 implements Runnable {
   final File g;
   final com.Oj_2 N;

   ra_4(com.Oj_2 var1, File var2) {
      this.N = var1;
      this.g = var2;
   }

   @Override
   public void run() {
      this.N.d.execute(new com.BR(this));
   }
}





