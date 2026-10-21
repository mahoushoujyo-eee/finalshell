package com.finalshell.task;

import com.finalshell.core.PK;

public class BR implements Runnable {
   final Ra4 N;

   BR(Ra4 var1) {
      this.N = var1;
   }

   @Override
   public void run() {
      PK.u(this.N.g);
   }
}





