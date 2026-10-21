package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class L92 {
   public static long[] a;
   public static Integer[] b;

   public static void main(String[] var0) {
      int var1 = a(4368, 5677158845292390560L);
      Registry.packArgs((short)var1);
      long var3 = 233249557846916492L;
      Object var10001 = Ref.h2(233249557846916492L, var3);

      try {
         var9 = (Byte)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      byte var2 = var9;
      Registry.packArgs(var2);
      long var5 = 615845032149445429L;
      Object var10002 = Ref.h2(615845032149445429L, var5);

      try {
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public static byte b(short var0) {
      return (byte)(var0 >> 0 & a(16585, 2850341305828538744L));
   }

   public static short w(byte var0) {
      byte var1 = 0;
      return (short)(var1 + ((var0 & a(12955, 2005873560951589672L)) << 0));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14769;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2871667241359255863L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\r\u000f \tôÐP°î\u009f]Ý9F\u0081\u009fÔÙ\u0092¿b\u0086\"à";
      int var5 = "\r\u000f \tôÐP°î\u009f]Ý9F\u0081\u009fÔÙ\u0092¿b\u0086\"à".length();
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
      b = new Integer[3];
   }
}





