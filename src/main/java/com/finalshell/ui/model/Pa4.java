package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pa4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public Pa4(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 3:
               return b(11984, 3619821435634766103L);
            case 32:
               return b(1316, 6526501022437636838L);
            case 59:
               return b(12199, 6775597358316277860L);
            case 60:
               return b(13470, 5289857034583591768L);
            case 61:
               return b(27826, 4711328600981181302L);
            case 91:
               return b(24425, 4433717266861727916L);
            case 92:
               return b(6771, 4350232914995766706L);
            case 93:
               return b(17495, 7382900220802874265L);
            case 94:
               return b(17145, 6667553264062053689L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32710;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1332122450125769245L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "\u0088®ÖìOå\u0001¢\u008eë4Õ¸K\u001b©I~öCÜ\u008eÙÍÃAyÀxÞêX\u0088!â÷¡\u008f°\u001bò÷ã\u0003n\u0095\u009aÉü_°Wl{÷\u008c";
      int var5 = "\u0088®ÖìOå\u0001¢\u008eë4Õ¸K\u001b©I~öCÜ\u008eÙÍÃAyÀxÞêX\u0088!â÷¡\u008f°\u001bò÷ã\u0003n\u0095\u009aÉü_°Wl{÷\u008c".length();
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

                  var4 = ";ã¼\u0082Ù\u0099/Vsß9H\f\nql";
                  var5 = ";ã¼\u0082Ù\u0099/Vsß9H\f\nql".length();
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





