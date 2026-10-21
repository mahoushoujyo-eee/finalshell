package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pq4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public Pq4(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 3:
               return b(19376, 4435609268750268143L);
            case 32:
               return b(15666, 7887783927718625380L);
            case 59:
               return b(22765, 3676874647023527349L);
            case 60:
               return b(16136, 1571257213642228319L);
            case 61:
               return b(10756, 8656336647490623312L);
            case 62:
               return b(28624, 8423946668774658697L);
            case 63:
               return b(19379, 2786405475314513640L);
            case 64:
               return b(3281, 1412997684481651083L);
            case 91:
               return b(20302, 6510346966320919058L);
            case 92:
               return b(5082, 7413038728197009039L);
            case 93:
               return b(10381, 1038557458687415760L);
            case 94:
               return b(18099, 3829272397685767149L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32095;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3420720960302243833L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "'F÷ðøÆiï\u008aýó9æÈäïáïyêai\nÕðå\u008c[f\u0095í\u000f\u0084s9Ò¾ßiù\u0011H7H©v.\u0086¬äi*\rªM\u009eÂ\u008ar\u0015Aöz¥\u0095¿¨Ç\u0097f\u001dAð7\u0086\u009e\u00168\u001f}";
      int var5 = "'F÷ðøÆiï\u008aýó9æÈäïáïyêai\nÕðå\u008c[f\u0095í\u000f\u0084s9Ò¾ßiù\u0011H7H©v.\u0086¬äi*\rªM\u009eÂ\u008ar\u0015Aöz¥\u0095¿¨Ç\u0097f\u001dAð7\u0086\u009e\u00168\u001f}"
         .length();
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
                     d = new Integer[12];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = " H}´vé1\u0080¤êp\u000f£S\u0088C";
                  var5 = " H}´vé1\u0080¤êp\u000f£S\u0088C".length();
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





