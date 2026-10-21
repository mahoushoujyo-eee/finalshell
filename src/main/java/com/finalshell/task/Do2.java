package com.finalshell.task;

import com.finalshell.core.XQ_2;

public class Do2 implements Runnable {
   final XQ_2 D;
   public static long a;

   Do2(XQ_2 var1) {
      this.D = var1;
   }

   @Override
   public void run() {
      this.D.x();

      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
      }

      this.D.d();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3013584503645805643L;
      long var10002 = 3013584503645806499L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





