package com.finalshell.task;

public class IM3 implements Runnable {
   public final int h;
   public final II3 u;

   public IM3(II3 var1, int var2) {
      this.u = var1;
      this.h = var2;
   }

   @Override
   public void run() {
      this.u.A.setValue(this.h);
   }
}





