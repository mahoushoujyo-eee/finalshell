package com.finalshell.core;

import javax.swing.BorderFactory;

public class W_3_2 extends KD {
   public final D_2_2 Z;
   public static long[] a;
   public static Integer[] b;

   public W_3_2(D_2_2 var1) {
   super();
      this.Z = var1;
      this.setEnabled(D_2_2.s(this.Z).isClosable());
      this.g(false);
      this.f(0);
      this.s(GO.FT);
      int[] var10000 = D_2_2.W();
      this.x(2);
      int[] var2 = var10000;
      this.setFocusable(false);
      label14:
      if (var2 == null) {
         if (this.Z.j()) {
            this.x(false);
            this.M(false);
            this.l(false);
            this.Z(true);
            if (var2 == null) {
               break label14;
            }
         }

         this.x(false);
         this.M(false);
      }

      this.setBorder(BorderFactory.createEmptyBorder(4, a(16078, 495565053790828178L), 4, a(13343, 2628641478758349890L)));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2141;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8165982302118528202L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "RsÍ\u0099\u0018Ùx\u008fäCÙè\u0005ªr^";
      int var5 = "RsÍ\u0099\u0018Ùx\u008fäCÙè\u0005ªr^".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





