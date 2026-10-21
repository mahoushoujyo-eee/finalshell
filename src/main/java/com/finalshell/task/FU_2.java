package com.finalshell.task;

public class FU_2 implements Runnable {
   final Xb4 m;

   FU_2(Xb4 var1) {
      this.m = var1;
   }

   @Override
   public void run() {
      Xb4.X(this.m).O(Xb4.z(this.m));
   }
}





