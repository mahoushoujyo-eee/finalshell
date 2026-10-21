package com.finalshell.task;

import com.finalshell.core.PK;

public class FC implements Runnable {
   public final QU t;

   public FC(QU var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      PK.a(this.t.p);
   }
}





