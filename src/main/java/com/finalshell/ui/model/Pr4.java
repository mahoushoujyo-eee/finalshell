package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pr4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   Pr4(String var1, int var2, int[] var3) {
      super(var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 32:
               return b(19585, 3979752955014015984L);
            case 59:
               return b(2890, 319373105984187448L);
            case 60:
               return b(23881, 1429729133533854271L);
            case 61:
               return b(20643, 634825667695212508L);
            case 62:
               return b(13863, 6638119491227259223L);
            case 91:
               return b(19453, 8418836532459793545L);
            case 92:
               return b(19031, 4264301273325825316L);
            case 93:
               return b(8837, 7325482692077946352L);
            case 94:
               return b(12345, 970999309534762830L);
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10103;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6695793044248409802L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "\u0095¸{\u0014z\r!\u007f\u00ad|Å8*ºÌ\u0012¢ê<\u001e\u0006a3Ò\u0092ÕpÃè\u00adÚªþ<Ð=p!Û\u0017×¥ïÀ\u0096õ\u001a\u0010t¥\tÅZ\u009eÝÚ";
      int var5 = "\u0095¸{\u0014z\r!\u007f\u00ad|Å8*ºÌ\u0012¢ê<\u001e\u0006a3Ò\u0092ÕpÃè\u00adÚªþ<Ð=p!Û\u0017×¥ïÀ\u0096õ\u001a\u0010t¥\tÅZ\u009eÝÚ".length();
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
                     d = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ãèÆ·\u0088Ç§se#\u0090+\u0092°Áü";
                  var5 = "ãèÆ·\u0088Ç§se#\u0090+\u0092°Áü".length();
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





