package com.finalshell.task;

import com.finalshell.core.BN3;
import com.finalshell.core.Bi4;

public class BI3 implements Runnable {
   public static long a;

   @Override
   public void run() {
      byte[] var1 = new byte[(int)a];
      Bi4.O = true;

      try {
         while (true) {
            BN3.y.write(var1, 0, var1.length);
         }
      } catch (Exception var3) {
         Bi4.B = true;
         Bi4.O = false;
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1816430452161470275L;
      long var10002 = 8094915517783560003L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





