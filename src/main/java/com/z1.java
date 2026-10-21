package com;

import java.awt.image.BufferedImage;

public class z1 extends com.zH {
   private int k;
   private int w;
   private int T = 1;
   private static final long[] a;
   private static final Integer[] b;

   public z1() {
   }

   public z1(int var1, int var2, int var3) {
      this.Y(var1);
      this.l(var2);
      this.x(var3);
   }

   public void Y(int var1) {
      this.k = var1;
   }

   public int t() {
      return this.k;
   }

   public void l(int var1) {
      this.w = var1;
   }

   public int G() {
      return this.w;
   }

   public void b(int var1) {
      this.k = this.w = var1;
   }

   public int R() {
      return this.k;
   }

   public void x(int var1) {
      this.T = var1;
   }

   public int a() {
      return this.T;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label27: {
         String[] var10000 = com.zH.U();
         var4 = var1.getWidth();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var9 = var2;
         if (var3 == null) {
            if (var2 != null) {
               break label27;
            }

            var9 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var9;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.Q(var1, 0, 0, var4, var5, var6);
      int var8 = 0;

      while (true) {
         if (var8 < this.T) {
            f(var6, var7, var4, var5, this.k);
            f(var7, var6, var5, var4, this.w);
            var8++;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         this.K(var2, 0, 0, var4, var5, var6);
         break;
      }

      return var2;
   }

   public static void f(int[] var0, int[] var1, int var2, int var3, int var4) {
      int var6 = var2 - 1;
      int var7 = 2 * var4 + 1;
      String[] var10000 = com.zH.U();
      int[] var8 = new int[a(9621, 4722121071187177455L) * var7];
      String[] var5 = var10000;
      int var9 = 0;

      while (true) {
         if (var9 < a(2242, 9130586610204312254L) * var7) {
            var8[var9] = var9 / var7;
            var9++;
            if (var5 != null) {
               break;
            }

            if (var5 == null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      int var10 = 0;

      while (var10 < var3) {
         int var11 = var10;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = -var4;

         while (true) {
            if (var16 <= var4) {
               int var17 = var0[var9 + com.W1.M(var16, 0, var2 - 1)];
               var12 += var17 >> a(4994, 7848603824047200763L) & a(17793, 5600491412542312436L);
               var13 += var17 >> a(18569, 5762793078058271479L) & a(14643, 4750109682705937223L);
               var14 += var17 >> a(8209, 4207314697483397742L) & a(14643, 4750109682705937223L);
               var15 += var17 & a(14643, 4750109682705937223L);
               var16++;
               if (var5 != null) {
                  break;
               }

               if (var5 == null) {
                  continue;
               }
            }

            var16 = 0;
            break;
         }

         int var10001;
         while (true) {
            if (var16 < var2) {
               var1[var11] = var8[var12] << a(1822, 6355398124496719203L)
                  | var8[var13] << a(12667, 2395567619170220812L)
                  | var8[var14] << a(23584, 208357688667330136L)
                  | var8[var15];
               int var21 = var16 + var4 + 1;
               var22 = var21;
               var10001 = var6;
               if (var5 != null) {
                  break;
               }

               if (var5 == null) {
                  if (var21 > var6) {
                     var21 = var6;
                  }

                  var22 = var16;
                  var10001 = var4;
               }

               int var18 = var22 - var10001;
               int var23 = var18;
               if (var5 == null) {
                  if (var18 < 0) {
                     var18 = 0;
                  }

                  var23 = var0[var9 + var21];
               }

               int var19 = var23;
               int var20 = var0[var9 + var18];
               var12 += (var19 >> a(1822, 6355398124496719203L) & a(14643, 4750109682705937223L))
                  - (var20 >> a(1822, 6355398124496719203L) & a(14643, 4750109682705937223L));
               var13 += (var19 & a(8770, 2694386035190835257L)) - (var20 & a(23963, 8255283038259206120L)) >> a(12667, 2395567619170220812L);
               var14 += (var19 & a(19058, 7217039634520621060L)) - (var20 & a(25204, 6463050569279105030L)) >> a(23584, 208357688667330136L);
               var15 += (var19 & a(14643, 4750109682705937223L)) - (var20 & a(14643, 4750109682705937223L));
               var11 += var3;
               var16++;
               if (var5 == null) {
                  continue;
               }
            }

            var22 = var9;
            var10001 = var2;
            break;
         }

         var9 = var22 + var10001;
         var10++;
         if (var5 != null) {
            break;
         }
      }
   }

   static {
      long var0 = 4595265328061805451L;
      long[] var6 = new long[14];
      int var3 = 0;
      String var4 = "\u0005tò)\u0006\rÙíâ\u0093>K\u008ct±l\u001e\u000b\u001cs\u0017\u0005~ðnÊH\u0006sàp5î\u001e×{Äg[²w\u0006'À}µ]d:q÷¥4Ñêh\u000fd6ôÔö%Û¼\ti\t§ÛH\u0097þ++jvNL\u008f½K:ÊKÿ<\u0080KÇ¯\u0002Î\u001e@3";
      int var5 = "\u0005tò)\u0006\rÙíâ\u0093>K\u008ct±l\u001e\u000b\u001cs\u0017\u0005~ðnÊH\u0006sàp5î\u001e×{Äg[²w\u0006'À}µ]d:q÷¥4Ñêh\u000fd6ôÔö%Û¼\ti\t§ÛH\u0097þ++jvNL\u008f½K:ÊKÿ<\u0080KÇ¯\u0002Î\u001e@3"
         .length();
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
                     b = new Integer[14];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0088ØIÃ@\u008a¤c&\u000b-3\u0014\u008ed\u008d";
                  var5 = "\u0088ØIÃ@\u008a¤c&\u000b-3\u0014\u008ed\u008d".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2687;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





