package com.finalshell.task;

import com.finalshell.core.CK;

public class Jw2 implements Runnable {
   public final UX W;

   public Jw2(UX var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      try {
         CK.s();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





