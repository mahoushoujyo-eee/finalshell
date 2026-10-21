package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class Bo2 implements Runnable {
   public final int B;
   public final D2 F;

   public Bo2(D2 var1, int var2) {
      this.F = var1;
      this.B = var2;
   }

   @Override
   public void run() {
      D2.G(this.F).setMaximum(this.B);
   }
}





