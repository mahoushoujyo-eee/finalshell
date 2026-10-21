package com.finalshell.task;

import com.finalshell.connection.DelayedAckSACK;

public class YO extends Thread {
   final DelayedAckSACK U;
   public static long a;

   YO(DelayedAckSACK var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.U.R();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8393351857207357747L;
      long var10002 = 8393351857207357741L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





