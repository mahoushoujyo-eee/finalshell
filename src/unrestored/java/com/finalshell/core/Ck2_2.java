package com.finalshell.core;

public class Ck2_2 extends CF_2 {
   public int c;
   public int[] w;
   public int[] O;
   public static long[] d;
   public static Integer[] e;

   public Ck2_2() {
      this.c = b(10535, 9211702663563737715L);
      this.w = new int[]{0, 0, b(2768, 241697367397980545L), b(24761, 5491092279887344623L)};
      this.O = new int[]{b(13257, 4718376878064951449L), b(13676, 838596846614472251L), -1, -1};
      this.T();
   }

   public Ck2_2(int[] var1, int[] var2) {
      this.c = b(16497, 6345783189182386978L);
      this.w = new int[]{0, 0, b(24761, 5491092279887344623L), b(24761, 5491092279887344623L)};
      this.O = new int[]{b(13676, 838596846614472251L), b(13676, 838596846614472251L), -1, -1};
      this.w = var1;
      this.O = var2;
      this.c = var1.length;
      this.T();
   }

   public void x(int var1, int var2) {
      this.O[var1] = var2;
      this.T();
   }

   public int S(int var1) {
      return this.O[var1];
   }

   public void T(int var1, int var2) {
      int[] var3 = new int[this.c + 1];
      int[] var4 = new int[this.c + 1];
      System.arraycopy(this.w, 0, var3, 0, this.c);
      System.arraycopy(this.O, 0, var4, 0, this.c);
      this.w = var3;
      this.O = var4;
      this.w[this.c] = var1;
      this.O[this.c] = var2;
      this.c++;
      this.Q();
      this.T();
   }

   public void r(int var1) {
      String[] var2 = W5.q();
      int var10000 = this.c;
      int var10001 = 4;
      if (var2 != null) {
         if (this.c <= 4) {
            return;
         }

         var10000 = var1;
         var10001 = this.c - 1;
      }

      if (var10000 < var10001) {
         System.arraycopy(this.w, var1 + 1, this.w, var1, this.c - var1 - 1);
         System.arraycopy(this.O, var1 + 1, this.O, var1, this.c - var1 - 1);
      }

      this.c--;
      this.T();
   }

   public void M(int var1, int var2) {
      this.w[var1] = Iw4.e(var2);
      this.Q();
      this.T();
   }

   public void T() {
      String[] var10000 = W5.q();
      this.w[0] = -1;
      String[] var1 = var10000;
      this.w[this.c - 1] = b(12431, 9195968329879577562L);
      this.O[0] = this.O[1];
      this.O[this.c - 1] = this.O[this.c - 2];
      int var2 = 0;

      while (var2 < b(14857, 4443526870043191643L)) {
         this.B[var2] = NM.B(var2, this.c, this.w, this.O);
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public void Q() {
      String[] var10000 = W5.q();
      int var2 = 1;
      String[] var1 = var10000;

      label39:
      while (true) {
         int var6 = var2;
         int var10001 = this.c;

         label37:
         while (var6 < var10001) {
            int var3 = 1;

            while (var3 < var2) {
               label31: {
                  var6 = this.w[var2];
                  if (var1 != null) {
                     var10001 = this.w[var3];
                     if (var1 == null) {
                        continue label37;
                     }

                     if (var6 >= var10001) {
                        break label31;
                     }

                     var6 = this.w[var2];
                  }

                  int var4 = var6;
                  this.w[var2] = this.w[var3];
                  this.w[var3] = var4;
                  var4 = this.O[var2];
                  this.O[var2] = this.O[var3];
                  this.O[var3] = var4;
               }

               var3++;
               if (var1 == null) {
                  break;
               }
            }

            var2++;
            if (var1 == null) {
               return;
            }
            continue label39;
         }

         return;
      }
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21330;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3632453507662625412L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u009eÌ÷~\u0005\u0089Òß\u0010d\u0011oW\u0086©¢«ÀþCA Z\u001de3\ro¥½cú\"\u0087|øØÉ\t\u0094w_VTTmÜ¿";
      int var5 = "\u009eÌ÷~\u0005\u0089Òß\u0010d\u0011oW\u0086©¢«ÀþCA Z\u001de3\ro¥½cú\"\u0087|øØÉ\t\u0094w_VTTmÜ¿".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     d = var6;
                     e = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "®d|\nuf@óÃ\u000fß+\u007flØ^";
                  var5 = "®d|\nuf@óÃ\u000fß+\u007flØ^".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





