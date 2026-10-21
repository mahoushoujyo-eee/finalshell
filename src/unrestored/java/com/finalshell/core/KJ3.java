package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class KJ3 {
   public static long[] a;
   public static Integer[] b;

   public static byte[] S(String var0) {
      byte[] var1 = new byte[4];
      StringTokenizer var2 = new StringTokenizer(var0, ".");

      try {
         var1[0] = (byte)(Integer.parseInt(var2.nextToken()) & a(20937, 6539434023919883758L));
         var1[1] = (byte)(Integer.parseInt(var2.nextToken()) & a(1576, 3146209006710637070L));
         var1[2] = (byte)(Integer.parseInt(var2.nextToken()) & a(1576, 3146209006710637070L));
         var1[3] = (byte)(Integer.parseInt(var2.nextToken()) & a(1576, 3146209006710637070L));
      } catch (Exception var4) {
         System.out.println(var4.getMessage());
      }

      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void main(String[] var0) {
      int var10000 = Wi2.d();
      byte[] var2 = S(var0[0]);
      int var1 = var10000;
      int var3 = 0;
      if (var1 != 0) {
         System.out.println(var2[var3]);
         var3++;
      }

      while (true) {
         while (var3 < var2.length) {
            System.out.println(var2[var3]);
            var3++;
         }

         System.out.println(U(var2));
         if (var1 == 0) {
            return;
         }

         var3++;
      }
   }

   public static String W(String var0, String var1, String var2) {
      try {
         return new String(var0.getBytes(var1), var2);
      } catch (UnsupportedEncodingException var4) {
         return var0;
      }
   }

   public static String k(byte[] var0, String var1) {
      try {
         return new String(var0, var1);
      } catch (UnsupportedEncodingException var3) {
         return new String(var0);
      }
   }

   public static String Q(byte[] var0, int var1, int var2, String var3) {
      try {
         return new String(var0, var1, var2, var3);
      } catch (UnsupportedEncodingException var5) {
         return new String(var0, var1, var2);
      }
   }

   public static String U(byte[] var0) {
      StringBuffer var2 = new StringBuffer();
      var2.append(var0[0] & a(1576, 3146209006710637070L));
      int var10000 = Wi2.p();
      var2.append((char)a(20700, 925339894766310649L));
      var2.append(var0[1] & a(1576, 3146209006710637070L));
      var2.append((char)a(22683, 7727710058535886015L));
      var2.append(var0[2] & a(1576, 3146209006710637070L));
      int var1 = var10000;
      var2.append((char)a(22683, 7727710058535886015L));
      var2.append(var0[3] & a(1576, 3146209006710637070L));
      String var3 = var2.toString();
      if (var1 == 0) {
         Ky4.K(new String[5]);
      }

      return var3;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17445;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4744847809801099659L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "ø6ÔÀÔw\r\\VÀ\u0018\u00ad~B\u0085\u001a";
      int var5 = "ø6ÔÀÔw\r\\VÀ\u0018\u00ad~B\u0085\u001a".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var4 = "Ê%E/s¥\f\u009a?Aø\u0096\u0082c[z";
                  var5 = "Ê%E/s¥\f\u009a?Aø\u0096\u0082c[z".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





