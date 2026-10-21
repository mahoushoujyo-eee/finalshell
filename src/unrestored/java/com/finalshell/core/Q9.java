package com.finalshell.core;

public class Q9 {
   public static int Z;
   public static int O;
   public static int u;
   public static int h;
   public static int a;
   public static int z;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 458143082706300642L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "÷n\u001bmÕ\n¡a\u0005îm\u0019Õ\u0002îÈ";
      int var6 = "÷n\u001bmÕ\n¡a\u0005îm\u0019Õ\u0002îÈ".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var0;
         var10001 = var4++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     Z = 1;
                     O = 0;
                     u = (int)var0[2];
                     h = (int)var0[1];
                     a = (int)var0[3];
                     z = (int)var0[0];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "ìL\u001a Õ\u0002îË5\u008b9iÕU=À";
                  var6 = "ìL\u001a Õ\u0002îË5\u008b9iÕU=À".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var0;
            var10001 = var4++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





