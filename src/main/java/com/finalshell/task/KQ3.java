package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class KQ3 implements Runnable {
   final String X;
   final D2 J;

   KQ3(D2 var1, String var2) {
      this.J = var1;
      this.X = var2;
   }

   @Override
   public void run() {
      D2.k(this.J).setText(this.X);
   }
}





