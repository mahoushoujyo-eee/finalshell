package com.finalshell.task;

import com.finalshell.core.NF;

public class BT_2 implements Runnable {
   final Throwable S;
   final NF J;

   BT_2(NF var1, Throwable var2) {
      this.J = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      synchronized (this.J.C.c.K) {
         this.J.C.o.Y(com.finalshell.ui.model.Ux2.failed);
         this.J.C.o.o(this.S);
         this.J.C.c.nodeChanged(this.J.C.o);
      }

      this.J.C.c.r(this.J.C.o, this.S);
   }
}





