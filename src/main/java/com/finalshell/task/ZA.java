package com.finalshell.task;

import com.finalshell.core.PK;

public class ZA implements Runnable {
   final Ke2 E;

   ZA(Ke2 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      PK.Q(this.E.T);
   }
}





