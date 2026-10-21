package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class Kq4 implements Runnable {
   public final int V;
   public final D2 u;

   public Kq4(D2 var1, int var2) {
      this.u = var1;
      this.V = var2;
   }

   @Override
   public void run() {
      D2.G(this.u).setValue(this.V);
   }
}





