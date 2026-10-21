package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class VO {
   public static int p;
   public static int W;
   public static int M;
   public static int w;
   public static int Y;
   public static int T;
   public static int h;
   public int u;
   public YI o;
   public boolean a;

   public VO(YI var1, int var2) {
      long var4 = 617652087972751592L;
      Ref.s(617652087972751592L, var1, var4);
      Ref.s(261995540413557922L, this, var2);
   }

   public YI d() {
      Object var1 = 617652087972751592L;
      return (YI)Ref.g(617652087972751592L, var1);
   }

   public void Q(YI var1) {
      long var3 = 617652087972751592L;
      Ref.s(617652087972751592L, var1, var3);
   }

   public int k() {
      return ((Integer)Ref.g(261995540413557922L, this)).intValue();
   }

   public void H(int var1) {
      Ref.s(261995540413557922L, this, var1);
   }

   public boolean Z() {
      return ((Boolean)Ref.g(209262969121480945L, this)).booleanValue();
   }

   public void Y(boolean var1) {
      Ref.s(209262969121480945L, this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 5563211259712631272L;
      long[] var0 = new long[7];
      int var4 = 0;
      String var5 = "é[\u001aza\u009fñ\u008dF\u00015\u009da\u009fñ!\u0003Ý#va\u009fñ\u008fM\u009býßa\u009fñj:4¼Äa\u009fñ\u0092";
      int var6 = "é[\u001aza\u009fñ\u008dF\u00015\u009da\u009fñ!\u0003Ý#va\u009fñ\u008fM\u009býßa\u009fñj:4¼Äa\u009fñ\u0092".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     Ref.setInt(355995585155017665L, null, (int)var0[5]);
                     Ref.setInt(372857647671097670L, null, (int)var0[0]);
                     Ref.setInt(396404222353826257L, null, (int)var0[6]);
                     Ref.setInt(503069149042327914L, null, (int)var0[2]);
                     Ref.setInt(242649790291880610L, null, (int)var0[4]);
                     Ref.setInt(352927757876034743L, null, (int)var0[3]);
                     Ref.setInt(129638889012486075L, null, (int)var0[1]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "ì\u0080<³a\u009fñ\u008cå\u0019ÜGa\u009fñ\u008e";
                  var6 = "ì\u0080<³a\u009fñ\u008cå\u0019ÜGa\u009fñ\u008e".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





