package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class PX3 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   PX3(String var1, int var2, int[] var3) {
      super(var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 3:
               return b(8307, 3189281565131678484L);
            case 32:
               return b(17552, 936681257791866864L);
            case 59:
               return b(16594, 2836195937549534134L);
            case 60:
               return b(16791, 8602162182752551669L);
            case 61:
               return b(31419, 3088093356107921880L);
            case 91:
               return b(29935, 4899663059372832650L);
            case 92:
               return b(26504, 8360447719875568873L);
            case 93:
               return b(25758, 3578324073185175544L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 870;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1604056807351349569L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u0014=.¿À×\u0016^Õ²4FsÙRö6ÎÌ\u0007B²²Vy%\u008cD$¼\u0006{+¶¼3:ú³eù\u008cÔ\u008e-·\b&";
      int var5 = "\u0014=.¿À×\u0016^Õ²4FsÙRö6ÎÌ\u0007B²²Vy%\u008cD$¼\u0006{+¶¼3:ú³eù\u008cÔ\u008e-·\b&".length();
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
                     d = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ò\u001f\u0015¢ÏÊ6\u0016½2\u0003}3Ñ\u0015Y";
                  var5 = "Ò\u001f\u0015¢ÏÊ6\u0016½2\u0003}3Ñ\u0015Y".length();
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





