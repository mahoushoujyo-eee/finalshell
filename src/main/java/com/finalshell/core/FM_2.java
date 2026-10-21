package com.finalshell.core;

// $VF: synthetic class
public class FM_2 {
   static int[] Z;
   static int[] s;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 3705866394280606081L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "Ï)¬\u0086à'9\u0087\u0010\u0002\u0012éà'9\u0088";
      int var6 = "Ï)¬\u0086à'9\u0087\u0010\u0002\u0012éà'9\u0088".length();
      byte var3 = 0;

      label98:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
         var10001 = var4++;
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
            long var26 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var26;
                  if (var3 >= var6) {
                     s = new int[com.finalshell.ui.model.D4.values().length];

                     try {
                        s[com.finalshell.ui.model.D4.VOID.ordinal()] = 1;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.BYTE.ordinal()] = 2;
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.SHORT.ordinal()] = 3;
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.CHAR.ordinal()] = 4;
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.INT.ordinal()] = 5;
                     } catch (NoSuchFieldError var16) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.LONG.ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var15) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.FLOAT.ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var14) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.DOUBLE.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var13) {
                     }

                     try {
                        s[com.finalshell.ui.model.D4.BOOLEAN.ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var12) {
                     }

                     Z = new int[com.finalshell.ui.model.FX.values().length];

                     try {
                        Z[com.finalshell.ui.model.FX.ENUM.ordinal()] = 1;
                     } catch (NoSuchFieldError var11) {
                     }

                     try {
                        Z[com.finalshell.ui.model.FX.INT.ordinal()] = 2;
                     } catch (NoSuchFieldError var10) {
                     }

                     try {
                        Z[com.finalshell.ui.model.FX.STRING.ordinal()] = 3;
                     } catch (NoSuchFieldError var9) {
                     }

                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var26;
                  if (var3 < var6) {
                     continue label98;
                  }

                  var5 = "`gõ^à'9\u0086ç=\u0011cà'9\u0089";
                  var6 = "`gõ^à'9\u0086ç=\u0011cà'9\u0089".length();
                  var3 = 0;
            }

            byte var23 = var3;
            var3 += 8;
            var7 = var5.substring(var23, var3).getBytes("ISO-8859-1");
            var10000 = var0;
            var10001 = var4++;
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





