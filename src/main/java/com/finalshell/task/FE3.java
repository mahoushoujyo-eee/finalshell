package com.finalshell.task;

import com.finalshell.core.BN3;
import com.finalshell.core.Bj4;
import java.io.IOException;

public class FE3 implements Runnable {
   final byte[] l;
   public static long a;

   FE3(byte[] var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Bj4.t = true;
      Bj4.x = true;

      try {
         Bj4.F = BN3.J.read(this.l, 0, (int)a);
         Bj4.T = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      Bj4.t = false;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 541338869980506280L;
      long var10002 = 1132557778453047528L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





