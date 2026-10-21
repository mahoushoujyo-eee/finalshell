package com.finalshell.task;

public class UE implements Runnable {
   final Mo2 B;

   UE(Mo2 var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      this.B.o();
   }
}





