package com.finalshell.task;

public class UE implements Runnable {
   public final Mo2 B;

   public UE(Mo2 var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      this.B.o();
   }
}





