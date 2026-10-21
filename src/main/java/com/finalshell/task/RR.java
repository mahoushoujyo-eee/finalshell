package com.finalshell.task;

public class RR implements Runnable {
   final int J;
   final QD H;

   RR(QD var1, int var2) {
      this.H = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      this.H.z.setValue(this.J);
   }
}





