package com.finalshell.core;

import java.awt.image.BufferedImage;

public abstract class Gj4 extends HN3 {
   public int[] f;
   public int[] d;
   public int[] M;
   public boolean N = false;
   public static long[] c;
   public static Integer[] e;

   public Gj4() {
      this.O = true;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 & a(28405, 9196415276138950581L);
      int var5 = var3 >> a(32034, 2745921672547728481L) & a(26676, 3343197330804107633L);
      int var6 = var3 >> a(2629, 7319444743180651266L) & a(18, 2369007058723307862L);
      int var7 = var3 & a(18, 2369007058723307862L);
      var5 = this.f[var5];
      var6 = this.d[var6];
      var7 = this.M[var7];
      return var4 | var5 << a(32034, 2745921672547728481L) | var6 << a(2629, 7319444743180651266L) | var7;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = W5.q();
      Gj4 var10000 = this;
      if (var3 != null) {
         if (!this.N) {
            this.D();
         }

         var10000 = this;
      }

      return var10000.filter(var1, var2);
   }

   public void D() {
      this.N = true;
      this.f = this.d = this.M = this.f();
   }

   public int[] f() {
      int[] var2 = new int[a(25968, 6046869089493836850L)];
      String[] var10000 = W5.q();
      int var3 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var3 < a(25968, 6046869089493836850L)) {
      int[] var4;
            var4 = var2;
            if (var1 == null) {
               break;
            }

            var2[var3] = Iw4.e((int)(255.0F * this.q((float)var3 / 255.0F)));
            var3++;
            if (var1 != null) {
      int[] var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public float q(float var1) {
      return 0.0F;
   }

   public int[] p() {
      String[] var1 = W5.q();
      int var10000 = this.N;
      if (var1 != null) {
         if (!this.N) {
            this.D();
         }

         var10000 = a(6444, 5966400067737917549L);
      }

      int[] var2 = new int[var10000];
      int var3 = 0;

      while (true) {
         if (var3 < a(25968, 6046869089493836850L)) {
            var4 = var2;
            if (var1 == null) {
               break;
            }

            var2[var3] = this.C(
               0, 0, var3 << a(24236, 6614282499635830762L) | var3 << a(24801, 3323669388338913707L) | var3 << a(11028, 813336584640637535L) | var3
            );
            var3++;
            if (var1 != null) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 322;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4176910908618162373L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "ç¢êÝd2%÷d\u0017ÁÝ'ã<´ç\u001bÉ#¤\u009f/p«8þ\u0086GÁY¨.\u0090ðGäC\u009f7ì\u009a\u008a\u0007èÁËÏ)Ý\u009a¿\u001b;Al¬?Ì»2?)K";
      int var5 = "ç¢êÝd2%÷d\u0017ÁÝ'ã<´ç\u001bÉ#¤\u009f/p«8þ\u0086GÁY¨.\u0090ðGäC\u009f7ì\u009a\u008a\u0007èÁËÏ)Ý\u009a¿\u001b;Al¬?Ì»2?)K".length();
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
                     c = var6;
                     e = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "º~,\u0082¬d!~Y\u0095\u0095·Ôöj\u0092";
                  var5 = "º~,\u0082¬d!~Y\u0095\u0095·Ôöj\u0092".length();
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






