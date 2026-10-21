package com;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class c3_2 implements EU {
   private BufferedBlockCipher q;
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public int w() {
      return a(18899, 3617493055858331449L);
   }

   @Override
   public int u() {
      return a(4097, 5813600699454101226L);
   }

   @Override
   public void z(int var1, byte[] var2, byte[] var3) throws Exception {
      String var4 = com.K4.z();

      label61: {
         int var10000;
         label65: {
            int var10001;
            label59: {
               label58: {
                  try {
                     var10000 = var3.length;
                     var10001 = a(7809, 8319515567597885544L);
                     if (var4 != null) {
                        break label59;
                     }

                     if (var10000 <= var10001) {
                        break label58;
                     }
                  } catch (Exception var10) {
                     throw a(var10);
                  }

                  byte[] var5 = new byte[a(18899, 3617493055858331449L)];
                  System.arraycopy(var3, 0, var5, 0, var5.length);
                  var3 = var5;
               }

               try {
                  var10000 = var2.length;
                  if (var4 != null) {
                     break label65;
                  }

                  var10001 = a(7906, 532473451379070986L);
               } catch (Exception var9) {
                  throw a(var9);
               }
            }

            if (var10000 <= var10001) {
               break label61;
            }

            var10000 = a(7906, 532473451379070986L);
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
                  this.q = new DefaultBufferedBlockCipher(CBCBlockCipher.newInstance(new CAST5Engine()));
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

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 2800153939881299565L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "eX1SY\b\u0016\rä\nL\u009dNÏ\u0096w";
      int var5 = "eX1SY\b\u0016\rä\nL\u009dNÏ\u0096w".length();
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

                  var4 = "\u0087Q\u009dóëå\u0098\u0097§¥¾\u009f¼éÁ\\";
                  var5 = "\u0087Q\u009dóëå\u0098\u0097§¥¾\u009f¼éÁ\\".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1769;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





