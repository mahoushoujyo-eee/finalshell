package com.finalshell.task;

import com.finalshell.core.ZModemTransfer;

public class Jw2 implements Runnable {
   public final UX W;

   public Jw2(UX var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      try {
         ZModemTransfer.s();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





