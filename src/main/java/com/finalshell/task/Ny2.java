package com.finalshell.task;

import com.finalshell.core.Oy4_2;

public class Ny2 extends Thread {
   final Oy4_2 W;
   public static long a;

   Ny2(Oy4_2 var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         System.gc();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6962483420017977830L;
      long var10002 = 6962483420017982062L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





