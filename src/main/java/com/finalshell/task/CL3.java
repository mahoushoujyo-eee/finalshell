package com.finalshell.task;

import com.finalshell.core.E0;

public class CL3 implements Runnable {
   final E0 b;

   CL3(E0 var1) {
      this.b = var1;
   }

   @Override
   public void run() {
      this.b.V();
   }
}





