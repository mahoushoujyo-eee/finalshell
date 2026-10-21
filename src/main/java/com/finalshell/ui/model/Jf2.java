package com.finalshell.ui.model;

import com.finalshell.config.DnsResolveFailedSetting;
import java.io.Serializable;

public final class Jf2 implements Serializable {
   public static long serialVersionUID;
   public final int N;
   public final int B;
   public static long[] a;
   public static Integer[] b;
   public static long[] c;
   public static Long[] d;

   public Jf2(int var1, int var2) {
      this.N = var1;
      this.B = var2;
   }

   public int c() {
      return this.N;
   }

   public long C() {
      return b(3063, 692935253010402899L) & (long)this.N;
   }

   public int R() {
      return this.B;
   }

   public long y() {
      return b(25509, 7557129819398219264L) & (long)this.B;
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = DnsResolveFailedSetting.I$arrString();
      if (var1 == this) {
         return true;
      } else {
         Object var10000 = this.getClass();
         if (var2 == null) {
            if (!var10000.isInstance(var1)) {
               return false;
            }

            var10000 = var1;
         }

         Jf2 var3 = (Jf2)var10000;
         int var4 = this.N;
         if (var2 == null) {
            if (this.N == var3.N) {
               if (var2 != null) {
                  return (boolean)this.B;
               }

               if (this.B == var3.B) {
                  return true;
               }
            }

            var4 = 0;
         }

         return var4 != 0;
      }
   }

   @Override
   public int hashCode() {
      int var1 = a(20492, 5162799049580820300L);
      var1 = a(13871, 870413273746624876L) * var1 + this.N;
      return a(28584, 3462549945706121450L) * var1 + this.B;
   }

   static int s(Jf2 var0) {
      return var0.N;
   }

   static int v(Jf2 var0) {
      return var0.B;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26434;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 17829) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var8 = 6130841477873745254L;
      long[] var14 = new long[3];
      int var11 = 0;
      String var12 = "mõðYä9µ\u0093\u0013±ª+«\u0096ì\u0015Õ<¼eª\u0018\n;";
      int var13 = "mõðYä9µ\u0093\u0013±ª+«\u0096ì\u0015Õ<¼eª\u0018\n;".length();
      byte var10 = 0;

      do {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
         var10001 = var11++;
         long var10004 = (
               ((long)var15[0] & 255L) << 56
                  | ((long)var15[1] & 255L) << 48
                  | ((long)var15[2] & 255L) << 40
                  | ((long)var15[3] & 255L) << 32
                  | ((long)var15[4] & 255L) << 24
                  | ((long)var15[5] & 255L) << 16
                  | ((long)var15[6] & 255L) << 8
                  | (long)var15[7] & 255L
            )
            ^ var8;
         byte var10003 = -1;
         var14[var10001] = var10004;
      } while (var10 < var13);

      a = var14;
      b = new Integer[3];
      long var0 = 959595619127353271L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "e±z©_Z\u0086H\u0004ÌçÑ¡ãn\u001b\u0010ë\ný\u0007ÊÏE";
      int var5 = "e±z©_Z\u0086H\u0004ÌçÑ¡ãn\u001b\u0010ë\ný\u0007ÊÏE".length();
      byte var2 = 0;

      do {
         int var17 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var17, var2).getBytes("ISO-8859-1");
         var17 = var3++;
         long var20 = (
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
         byte var19 = -1;
         var6[var17] = var20;
      } while (var2 < var5);

      c = var6;
      d = new Long[3];
      serialVersionUID = b(2187, 959991092719406380L);
   }
}





