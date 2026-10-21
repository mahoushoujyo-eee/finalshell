package com.finalshell.task;

public class IF3 implements Runnable {
   final Cw2 d;

   IF3(Cw2 var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      this.d.i.p(this.d.A, this.d.r, this.d.H, this.d.Z, this.d.G);
   }
}





