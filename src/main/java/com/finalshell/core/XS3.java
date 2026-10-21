package com.finalshell.core;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class XS3 implements EU {
   public BufferedBlockCipher q;
   public static long[] a;
   public static Integer[] b;

   @Override
   public int w() {
      return a(20804, 7790036181248841007L);
   }

   @Override
   public int u() {
      return a(28705, 6564198414571877451L);
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
                     var10001 = a(28705, 6564198414571877451L);
                     if (var4 != null) {
                        break label59;
                     }

                     if (var10000 <= var10001) {
                        break label58;
                     }
                  } catch (Exception var10) {
                     throw a(var10);
                  }

                  byte[] var5 = new byte[a(28705, 6564198414571877451L)];
                  System.arraycopy(var3, 0, var5, 0, var5.length);
                  var3 = var5;
               }

               try {
                  var10000 = var2.length;
                  if (var4 != null) {
                     break label65;
                  }

                  var10001 = a(28705, 6564198414571877451L);
               } catch (Exception var9) {
                  throw a(var9);
               }
            }

            if (var10000 <= var10001) {
               break label61;
            }

            var10000 = a(28705, 6564198414571877451L);
         }

         byte[] var11 = new byte[var10000];
         System.arraycopy(var2, 0, var11, 0, var11.length);
         var2 = var11;
      }

      try {
         ParametersWithIV var6 = new ParametersWithIV(new KeyParameter(var2, 0, var2.length), var3, 0, var3.length);

         BufferedBlockCipher var12;
         int var13;
         label41: {
            label40: {
               try {
                  this.q = new BufferedBlockCipher(new CBCBlockCipher(new SEEDEngine()));
                  var12 = this.q;
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
         this.q = null;
         throw var8;
      }
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.q.processBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean Y() {
      return true;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17515;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7637294282316528227L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "¸\u0018]ü¬^/\\\u0019\u000bó-i$\u000e8";
      int var5 = "¸\u0018]ü¬^/\\\u0019\u000bó-i$\u000e8".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





