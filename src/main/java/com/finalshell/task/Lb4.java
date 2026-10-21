package com.finalshell.task;

import com.finalshell.core.F0;
import java.io.IOException;
import java.io.InputStream;

public class Lb4 implements Runnable {
   public final F0 n;
   public final InputStream a;
   public static long b;

   public Lb4(F0 var1, InputStream var2) {
      this.n = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      byte[] var1 = new byte[(int)b];
      boolean var2 = false;

      try {
         while (this.a.read(var1) > 0) {
         }
      } catch (IOException var4) {
      }

      this.n.d();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 405675892572364770L;
      long var10002 = -7209564859997414430L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





