package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class C5 implements Runnable {
   public final boolean I;
   public final D2 h;

   public C5(D2 var1, boolean var2) {
      this.h = var1;
      this.I = var2;
   }

   @Override
   public void run() {
      D2.G(this.h).setIndeterminate(this.I);
   }
}





