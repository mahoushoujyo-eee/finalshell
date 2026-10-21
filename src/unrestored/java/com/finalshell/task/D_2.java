package com.finalshell.task;

import com.finalshell.core.YT3_2;

public class D_2 implements Runnable {
   public final YT3_2 h;

   public D_2(YT3_2 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      System.gc();
   }
}





