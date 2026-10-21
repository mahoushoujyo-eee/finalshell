package com.finalshell.task;

import com.finalshell.core.HandshakeTimeoutMonitor;

public class Oe4 extends Thread {
   public final HandshakeTimeoutMonitor X;
   public static long a;

   public Oe4(HandshakeTimeoutMonitor var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.X.s();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8819303886834341408L;
      long var10002 = 8819303886834341320L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





