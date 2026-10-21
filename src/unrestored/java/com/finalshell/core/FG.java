package com.finalshell.core;

import com.finalshell.ui.model.B1;
import com.finalshell.ui.model.YR3;

// $VF: synthetic class
public class FG {
   public static int[] V;
   public static int[] L;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 8303453149883046337L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "Â^\u0089\u0089oà\u0099Æ3\u008f7Noà\u0099È";
      int var6 = "Â^\u0089\u0089oà\u0099Æ3\u008f7Noà\u0099È".length();
      byte var3 = 0;

      label104:
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
            long var27 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var27;
                  if (var3 >= var6) {
                     L = new int[B1.values().length];

                     try {
                        L[B1.up.ordinal()] = 1;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        L[B1.down.ordinal()] = 2;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        L[B1.left.ordinal()] = 3;
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        L[B1.right.ordinal()] = 4;
                     } catch (NoSuchFieldError var18) {
                     }

                     V = new int[YR3.values().length];

                     try {
                        V[YR3.center.ordinal()] = 1;
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        V[YR3.topLeft.ordinal()] = 2;
                     } catch (NoSuchFieldError var16) {
                     }

                     try {
                        V[YR3.topRight.ordinal()] = 3;
                     } catch (NoSuchFieldError var15) {
                     }

                     try {
                        V[YR3.bottomLeft.ordinal()] = 4;
                     } catch (NoSuchFieldError var14) {
                     }

                     try {
                        V[YR3.bottomRight.ordinal()] = 5;
                     } catch (NoSuchFieldError var13) {
                     }

                     try {
                        V[YR3.topCenter.ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var12) {
                     }

                     try {
                        V[YR3.bottomCenter.ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var11) {
                     }

                     try {
                        V[YR3.leftCenter.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var10) {
                     }

                     try {
                        V[YR3.rightCenter.ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var9) {
                     }

                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var27;
                  if (var3 < var6) {
                     continue label104;
                  }

                  var5 = "XäÌÁoà\u0099Ç½äNÐoà\u0099É";
                  var6 = "XäÌÁoà\u0099Ç½äNÐoà\u0099É".length();
                  var3 = 0;
            }

            byte var24 = var3;
            var3 += 8;
            var7 = var5.substring(var24, var3).getBytes("ISO-8859-1");
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





