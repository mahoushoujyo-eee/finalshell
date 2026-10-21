package com.finalshell.task;

import com.finalshell.ui.dialog.D2;

public class T9_2 implements Runnable {
   final String y;
   final D2 f;

   T9_2(D2 var1, String var2) {
      this.f = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      D2.k(this.f).u(this.y, new Object[0]);
   }
}





