package com.finalshell.task;

import com.finalshell.io.To2;

public class OC implements Runnable {
   final To2 w;

   OC(To2 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      this.w.v();
   }
}





