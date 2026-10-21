package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Px4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public Px4(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 59:
               return b(17634, 8158491398154588901L);
            case 60:
               return b(4111, 4400060073116190217L);
            case 61:
               return b(26468, 7892364082867679589L);
            case 62:
               return b(16948, 4060266920002458673L);
            case 64:
               return b(14024, 6079148805039939776L);
            case 91:
               return b(21883, 1596295713671512953L);
            case 92:
               return b(14245, 1244260763619778982L);
            case 93:
               return b(10359, 8899212740959862387L);
            case 94:
               return b(28458, 2647895776840595754L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22016;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 845870773022665261L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "¸ûÓ²\u008b1\u0093ûEû%uÚ\u0087\u009b\u008d\u009f)xhþ8)°Fß_ZðeË}\u0005rZlúlT»áÅ'6ãâ¾À(\u0081\u0001\u008cw\u009eìð";
      int var5 = "¸ûÓ²\u008b1\u0093ûEû%uÚ\u0087\u009b\u008d\u009f)xhþ8)°Fß_ZðeË}\u0005rZlúlT»áÅ'6ãâ¾À(\u0081\u0001\u008cw\u009eìð".length();
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

                  var4 = "æ\u001c>\u0006ýó8\f \u008dÕõ¢ÃÊ\u0004";
                  var5 = "æ\u001c>\u0006ýó8\f \u008dÕõ¢ÃÊ\u0004".length();
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





