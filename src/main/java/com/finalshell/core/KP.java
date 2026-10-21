package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class KP {
   public static long[] a;
   public static Integer[] b;

   public UK g(String var1, long var2) {
      return this.g(var1, var2, 0L, "0", 0, 0L);
   }

   public UK g(String var1, long var2, long var4, String var6, int var7, long var8) {
      StringBuilder var11 = new StringBuilder();
      var11.append(var1);
      var11.append('\u0000');
      var11.append(var2);
      var11.append((char)a(32479, 8964787587379403610L));
      var11.append(var4);
      var11.append((char)a(14955, 6621270195120496620L));
      var11.append(var6);
      String[] var10000 = Ub2.A();
      var11.append((char)a(14955, 6621270195120496620L));
      String[] var10 = var10000;
      var11.append((char)a(21552, 6143441846560240054L));
      var11.append((char)a(14955, 6621270195120496620L));
      var11.append(var7);
      var11.append((char)a(14955, 6621270195120496620L));
      var11.append(var8);
      var11.append((char)a(16656, 4265651251991225492L));
      UK var12 = new UK(com.finalshell.ui.model.X9.ZCRCW, var11.toString().getBytes());
      if (var10 != null) {
         Ky4.K(new String[4]);
      }

      return var12;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25988;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5868620250671853939L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u009bYØ\u0003ÈV\u0095×<\u0006_©ba*\t";
      int var5 = "\u009bYØ\u0003ÈV\u0095×<\u0006_©ba*\t".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
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
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "¾é\r×0\u008b\u0080õÆ\u0085Éð\u0004ün¿";
                  var5 = "¾é\r×0\u008b\u0080õÆ\u0085Éð\u0004ün¿".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
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





