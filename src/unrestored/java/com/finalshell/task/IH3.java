package com.finalshell.task;

import java.io.File;

public class IH3 implements Runnable {
   public final File L;
   public final Ih2 V;
   public static long a;

   public IH3(Ih2 var1, File var2) {
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6208050666475947065L;
      long var10002 = 6208050666475949953L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





