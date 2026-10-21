package com.finalshell.core;

public class De2 {
   public int p;
   public int W;
   public int s;
   public int[] O;
   public static long[] a;
   public static Integer[] b;

   public void B(F_2 var1, RE3 var2, int var3, boolean var4) {
      int[] var5 = XB.X();
      int var10000 = this.p & 2;
      if (var5 == null) {
         if (var10000 == 0) {
            if (var4 != 0) {
               this.F(var3, var2.V, a(18642, 8239009293587362182L));
               var2.z(-1);
               if (var5 == null) {
                  return;
               }
            }

            this.F(var3, var2.V, a(10615, 2070205255294504999L));
            var2.G(-1);
            if (var5 == null) {
               return;
            }
         }

         var10000 = (var4) ? 1 : 0;
      }

      if (var10000 != 0) {
         var2.z(this.W - var3);
         if (var5 == null) {
            return;
         }
      }

      var2.G(this.W - var3);
   }

   public void F(int var1, int var2, int var3) {
      int[] var4 = XB.X();
      De2 var10000 = this;
      if (var4 == null) {
         if (this.O == null) {
            this.O = new int[a(23467, 4547883632073679608L)];
         }

         var10000 = this;
      }

      if (var4 == null) {
         if (var10000.s >= this.O.length) {
            int[] var5 = new int[this.O.length + a(10, 995935345284381020L)];
            System.arraycopy(this.O, 0, var5, 0, this.O.length);
            this.O = var5;
         }

         this.O[this.s++] = var1;
         var10000 = this;
      }

      var10000.O[this.s++] = var2 | var3;
   }

   public void y(F_2 var1, int var2, byte[] var3) {
      this.p |= 2;
      int[] var10000 = XB.X();
      this.W = var2;
      int[] var4 = var10000;
      int var5 = 0;

      while (var5 < this.s) {
         label21: {
            int var6 = this.O[var5++];
            int var7 = this.O[var5++];
            int var8 = var7 & a(10906, 1385390787138507723L);
            int var9 = var2 - var6;
            if (var4 == null) {
               if ((var7 & a(6978, 3874610686086275615L)) == a(3347, 1595674863296607300L)) {
                  var3[var8++] = (byte)(var9 >>> a(2147, 6886524580773720380L));
                  var3[var8] = (byte)var9;
                  if (var4 == null) {
                     break label21;
                  }
               }

               var3[var8++] = (byte)(var9 >>> a(22254, 3478865142731321276L));
               var3[var8++] = (byte)(var9 >>> a(2899, 5277821026422714886L));
               var3[var8++] = (byte)(var9 >>> a(9325, 1688988540924615987L));
            }

            var3[var8] = (byte)var9;
         }

         if (var4 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31063;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2073045692133575809L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "»á0L¹\u0016øÅdû^=¨(õÛs\u008c1Á~Åþ\u0097ç\u009aÊÂ\u0017¬=\u0007ÿëf\u0006\u0083V.\u007fóJÄ\u0011\u008f;£%\u0098È\u0090õsD µi¦¼S×?\\¦\u0086á~*|Åýµ";
      int var5 = "»á0L¹\u0016øÅdû^=¨(õÛs\u008c1Á~Åþ\u0097ç\u009aÊÂ\u0017¬=\u0007ÿëf\u0006\u0083V.\u007fóJÄ\u0011\u008f;£%\u0098È\u0090õsD µi¦¼S×?\\¦\u0086á~*|Åýµ"
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
                     b = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "íÕÇ\u009dÉBÑºþ¥0¡ÑÜn\u009e";
                  var5 = "íÕÇ\u009dÉBÑºþ¥0¡ÑÜn\u009e".length();
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





