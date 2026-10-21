package com.finalshell.task;

import com.finalshell.core.Dl2;

public class P2 extends Thread {
   public final Dl2 s;
   public static long a;

   public P2(Dl2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.s.D();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2537106207605726704L;
      long var10002 = 2537106207605726744L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





