package com.finalshell.core;

import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public abstract class UV_2 implements Ku2_2 {
   public SecretKeyFactory T;
   public byte[] q;
   public int f;
   public static long[] b;
   public static Integer[] c;

   public abstract String y();

   @Override
   public void l(byte[] var1, int var2) throws Exception {
      this.T = SecretKeyFactory.getInstance(this.y());
      this.q = var1;
      this.f = var2;
   }

   @Override
   public byte[] m(byte[] var1, int var2) {
      char[] var4 = new char[var1.length];
      boolean var10000 = Y12.D();
      int var5 = 0;
      boolean var3 = var10000;

      while (var5 < var1.length) {
         var4[var5] = (char)(var1[var5] & a(4005, 1511622107905857971L));
         var5++;
         if (var3) {
            break;
         }
      }

      try {
         PBEKeySpec var8 = new PBEKeySpec(var4, this.q, this.f, var2 * a(32678, 1833642750866811313L));
         return this.T.generateSecret(var8).getEncoded();
      } catch (InvalidKeySpecException var7) {
         return null;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5655;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8408956735451386150L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "rûÈÌÆW¸\u009f;\u0081(#tnHj";
      int var5 = "rûÈÌÆW¸\u009f;\u0081(#tnHj".length();
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

      b = var6;
      c = new Integer[2];
   }
}





