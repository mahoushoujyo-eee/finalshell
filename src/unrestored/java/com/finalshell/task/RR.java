package com.finalshell.task;

public class RR implements Runnable {
   public final int J;
   public final QD H;

   public RR(QD var1, int var2) {
      this.H = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      this.H.z.setValue(this.J);
   }
}





