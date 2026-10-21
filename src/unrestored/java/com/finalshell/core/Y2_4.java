package com.finalshell.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Y2_4 {
   public static long a;

   public static byte[] X(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      O(var0, var1);
      return var1.toByteArray();
   }

   public static void O(InputStream var0, OutputStream var1) throws IOException {
      String var10000 = W_7.v();
      byte[] var3 = new byte[(int)a];
      String var2 = var10000;

      do {
         int var4 = var0.read(var3);
         if (var4 == -1) {
            break;
         }

         var1.write(var3, 0, var4);
      } while (var2 != null);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5793394336463350730L;
      long var10002 = 5293954141757393866L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





