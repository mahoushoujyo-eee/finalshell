package com.Z;

import java.io.File;

class a_2 implements Runnable {
   final File X;
   final com.Z.T N;

   a_2(com.Z.T var1, File var2) {
      this.N = var1;
      this.X = var2;
   }

   @Override
   public void run() {
      this.N.H.removeTreeSelectionListener(this.N.U);
      this.N.H.s(this.N.H.d(this.X));
      this.N.H.addTreeSelectionListener(this.N.U);
   }
}





