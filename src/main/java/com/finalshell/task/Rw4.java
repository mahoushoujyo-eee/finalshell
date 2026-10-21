package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class Rw4 implements Runnable {
   public final String e;
   public final D2 w;

   public Rw4(D2 var1, String var2) {
      this.w = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      D2.G(this.w).setString(this.e);
   }
}





