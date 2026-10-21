package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class Pk2 implements Runnable {
   final boolean e;
   final D2 t;

   Pk2(D2 var1, boolean var2) {
      this.t = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      D2.G(this.t).setStringPainted(this.e);
      D2.t(this.t);
   }
}





