package com.finalshell.task;

import com.finalshell.connection.Connection3;

public class WM extends Thread {
   public static long a;
   public static long b;

   @Override
   public void run() {
      byte[] var1 = new byte[(int)a];
      boolean var2 = false;

      while (true) {
         try {
            Thread.sleep(b);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }

         Connection3.j = Connection3.s / 2;
         Connection3.s = 0;
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 2123588059801587817L;
      long var10002 = 813483654242905833L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 4246234471418882046L;
      var10002 = 4246234471418880046L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





