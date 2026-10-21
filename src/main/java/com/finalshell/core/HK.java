package com.finalshell.core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class HK implements ParameterizedType {
   public final Type[] N;
   public final Type F;
   public final Type r;
   public static long[] a;
   public static Integer[] b;

   public HK(Type[] var1, Type var2, Type var3) {
      this.N = var1;
      this.F = var2;
      this.r = var3;
   }

   @Override
   public Type[] getActualTypeArguments() {
      return this.N;
   }

   @Override
   public Type getOwnerType() {
      return this.F;
   }

   @Override
   public Type getRawType() {
      return this.r;
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = Ph2.u();
      Object var10000 = this;
      if (var2 == 0) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var2 == 0) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         HK var3 = (HK)var10000;
         var10000 = this;
         if (var2 == 0) {
            if (!Arrays.equals((Object[])this.N, (Object[])var3.N)) {
               return false;
            }

            var10000 = this.F;
         }

         label62: {
            label79: {
               if (var2 == 0) {
                  if (var10000 != null) {
                     var10000 = this.F;
                     if (var2 != 0) {
                        break label62;
                     }

                     if (!this.F.equals(var3.F)) {
                        return false;
                     }
                     break label79;
                  }

                  var10000 = var3.F;
               }

               if (var2 != 0) {
                  break label62;
               }

               if (var10000 != null) {
                  return false;
               }
            }

            var10000 = this.r;
         }

         if (var2 == 0) {
            if (var10000 != null) {
               return this.r.equals(var3.r);
            }

            var10000 = var3.r;
         }

         return var10000 == null;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1;
      int var4;
      label36: {
         var1 = Ph2.w();
         Type[] var10000 = this.N;
         if (var1 != 0) {
            if (this.N == null) {
               var4 = 0;
               break label36;
            }

            var10000 = this.N;
         }

         var4 = Arrays.hashCode((Object[])var10000);
      }

      int var7;
      label30: {
         int var2 = var4;
         var4 = a(9313, 5546234599347969587L) * var2;
         Type var10001 = this.F;
         if (var1 != 0) {
            if (this.F == null) {
               var7 = 0;
               break label30;
            }

            var10001 = this.F;
         }

         var7 = var10001.hashCode();
      }

      int var3 = var4 + var7;
      var4 = a(1592, 1061809867294375019L) * var3;
      Type var8 = this.r;
      if (var1 != 0) {
         if (this.r == null) {
            return var4 + 0;
         }

         var8 = this.r;
      }

      return var4 + var8.hashCode();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31314;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8577501372899740196L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0014*\u001cÖ\u0007\u0000\u0094\b&yy\u0005O\b¶P";
      int var5 = "\u0014*\u001cÖ\u0007\u0000\u0094\b&yy\u0005O\b¶P".length();
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





