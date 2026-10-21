package com.finalshell.task;

import com.finalshell.core.F92;
import com.finalshell.core.Qm2;

public class DL implements Runnable {
   final F92 X;
   public final Qm2 i;

   DL(F92 var1, Qm2 var2) {
      this.X = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      this.i.Q = true;
      this.i.u(true);
   }
}





