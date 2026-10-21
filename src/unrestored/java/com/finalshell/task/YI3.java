package com.finalshell.task;

import com.finalshell.core.Connect_2;

public class YI3 implements Runnable {
   public final Connect_2 E;

   public YI3(Connect_2 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      this.E.X();
   }
}





