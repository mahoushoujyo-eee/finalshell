package com;

import java.io.File;

class iH_3 implements Runnable {
   final File L;
   final Ih_2 V;
   private static final long a;

   iH_3(Ih_2 var1, File var2) {
      this.V = var1;
      this.L = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
         this.L.delete();
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }
   }

   static {
      long var0 = 6208050666475947065L;
      long var10002 = 6208050666475949953L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





