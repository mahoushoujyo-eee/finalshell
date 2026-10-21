package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class N72 implements Runnable {
   public final int J;
   public final D2 L;

   public N72(D2 var1, int var2) {
      this.L = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      D2.G(this.L).setMinimum(this.J);
   }
}





