package com;

import java.io.File;

class Q3 implements Runnable {
   final File x;
   final com.kF_3 D;

   Q3(com.kF_3 var1, File var2) {
      this.D = var1;
      this.x = var2;
   }

   @Override
   public void run() {
      this.D.a.removeTreeSelectionListener(this.D.u);
      this.D.a.s(this.D.a.d(this.x));
      this.D.a.addTreeSelectionListener(this.D.u);
   }
}





