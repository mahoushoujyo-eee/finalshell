package com.finalshell.core;

import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class Gd2 implements EU {
   public SICBlockCipher E;
   public static long[] a;
   public static Integer[] b;

   @Override
   public int w() {
      return a(26068, 6218604703012177085L);
   }

   @Override
   public int u() {
      return a(25621, 750415618141767037L);
   }

   @Override
   public void z(int var1, byte[] var2, byte[] var3) throws Exception {
      String var4 = K4.z();

      label61: {
         int var10000;
         label65: {
            int var10001;
            label59: {
               label58: {
                  try {
                     var10000 = var3.length;
                     var10001 = a(32343, 408347346317303612L);
                     if (var4 != null) {
                        break label59;
                     }

                     if (var10000 <= var10001) {
                        break label58;
                     }
                  } catch (Exception var10) {
                     throw a(var10);
                  }

                  byte[] var5 = new byte[a(32343, 408347346317303612L)];
                  System.arraycopy(var3, 0, var5, 0, var5.length);
                  var3 = var5;
               }

               try {
                  var10000 = var2.length;
                  if (var4 != null) {
                     break label65;
                  }

                  var10001 = a(20735, 2639437444571099541L);
               } catch (Exception var9) {
                  throw a(var9);
               }
            }

            if (var10000 <= var10001) {
               break label61;
            }

            var10000 = a(20735, 2639437444571099541L);
         }

         byte[] var11 = new byte[var10000];
         System.arraycopy(var2, 0, var11, 0, var11.length);
         var2 = var11;
      }

      try {
         ParametersWithIV var6 = new ParametersWithIV(new KeyParameter(var2, 0, var2.length), var3, 0, var3.length);

         SICBlockCipher var12;
         int var13;
         label41: {
            label40: {
               try {
                  this.E = new SICBlockCipher(new CAST5Engine());
                  var12 = this.E;
                  var13 = var1;
                  if (var4 != null) {
                     break label41;
                  }

                  if (var1 == 0) {
                     break label40;
                  }
               } catch (Exception var7) {
                  throw a(var7);
               }

               var13 = 0;
               break label41;
            }

            var13 = 1;
         }

         var12.init((boolean)var13, var6);
      } catch (Exception var8) {
         this.E = null;
         throw var8;
      }
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.E.processBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean Y() {
      return false;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8552;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6751519979253033201L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "7Ê\rA\bj\u00ad\u009c\u0083¢\u0007\u0082ÈÉ,D";
      int var5 = "7Ê\rA\bj\u00ad\u009c\u0083¢\u0007\u0082ÈÉ,D".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u009fß\u008dwsÒ\u0019tÀh\u0001\u0017\u0013c7Å";
                  var5 = "\u009fß\u008dwsÒ\u0019tÀh\u0001\u0017\u0013c7Å".length();
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





