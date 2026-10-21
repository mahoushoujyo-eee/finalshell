package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class PY3 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public PY3(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         switch (var1) {
            case 32:
               return b(24167, 149725523880917170L);
            case 59:
               return b(16999, 4364697251133924542L);
            case 60:
               return b(20963, 5107410575469983545L);
            case 61:
               return b(32093, 1282153989084093314L);
            case 62:
               return b(9188, 4610583158368847161L);
            case 64:
               return b(14169, 5479489850987073922L);
            case 91:
               return b(1372, 8094833791896773506L);
            case 92:
               return b(10038, 4864462999229350370L);
            case 93:
               return b(20498, 1235397027494246094L);
            case 94:
               return b(17041, 8529037775487902793L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26333;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3470964666879434981L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "\nî\u0011\u0005\u001c¾¥\u0000Æ~Wÿi\u0019ÖÎ\u0087\t2£÷òû¢\u00102åYt\u0092\u0003\u0081{j«\u0080(±Ä\u009d §¨é~\u009fÄPj°³7\u009b6±\u0083\u0016Ç¦aÍ±×\u0004";
      int var5 = "\nî\u0011\u0005\u001c¾¥\u0000Æ~Wÿi\u0019ÖÎ\u0087\t2£÷òû¢\u00102åYt\u0092\u0003\u0081{j«\u0080(±Ä\u009d §¨é~\u009fÄPj°³7\u009b6±\u0083\u0016Ç¦aÍ±×\u0004"
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
                     c = var6;
                     d = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "}\u008f\u0083\u0093eüØ\u0093p\\EJY_!ÿ";
                  var5 = "}\u008f\u0083\u0093eüØ\u0093p\\EJY_!ÿ".length();
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





