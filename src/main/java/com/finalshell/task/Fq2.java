package com.finalshell.task;

import com.finalshell.core.Timeout;

public class Fq2 extends Thread {
   final Timeout e;
   public static long a;

   Fq2(Timeout var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.e.T();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 9045522668680755593L;
      long var10002 = 9045522668680755809L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





