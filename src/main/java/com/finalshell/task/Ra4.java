package com.finalshell.task;

import java.io.File;

public class Ra4 implements Runnable {
   public final File g;
   public final com.finalshell.ui.panel.Oj2 N;

   public Ra4(com.finalshell.ui.panel.Oj2 var1, File var2) {
      this.N = var1;
      this.g = var2;
   }

   @Override
   public void run() {
      this.N.d.execute(new BR(this));
   }
}





