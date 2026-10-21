package com.finalshell.task;

import java.io.File;

public class A2 implements Runnable {
   public final File X;
   public final com.finalshell.ui.panel.T N;

   public A2(com.finalshell.ui.panel.T var1, File var2) {
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





