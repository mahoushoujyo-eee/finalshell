package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import java.io.IOException;
import java.lang.reflect.Type;

public class Wk2_2 implements Ak2, X4 {
   public static Wk2_2 b;
   public static long[] a;
   public static Integer[] c;

   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.X(var1, (String)var2);
   }

   public void X(NL3 var1, String var2) {
      String var10000 = Nv4.o();
      YM3 var4 = var1.w;
      String var3 = var10000;
      if (var3 != null) {
         if (var2 == null) {
            var4.x(EP.WriteNullStringAsEmpty);
            return;
         }

         var4.y(var2);
      }
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      String var4 = Nv4.o();
      Type var10000 = var2;
      java.lang.Class<StringBuffer> var10001 = StringBuffer.class;
      if (var4 != null) {
         if (var2 == StringBuffer.class) {
            P7 var7 = var1.N;
            var10000 = (Type)(var7);
            if (var4 != null) {
               if (var7.P() == 4) {
                  String var10 = var7.z();
                  var7.S(a(19544, 8077850927720458294L));
                  return new StringBuffer(var10);
               }

               var10000 = (Type)var1.M();
            }

            Object var9 = var10000;
            if (var9 == null) {
               return null;
            }

            return new StringBuffer(var9.toString());
         }

         var10000 = var2;
         if (var4 == null) {
            return var2;
         }

         var10001 = (Class<StringBuffer>)(StringBuilder.class);
      }

      if (var10000 == var10001) {
         P7 var5 = var1.N;
         var10000 = (Type)(var5);
         if (var4 != null) {
            if (var5.P() == 4) {
               String var8 = var5.z();
               var5.S(a(19544, 8077850927720458294L));
               return new StringBuilder(var8);
            }

            var10000 = (Type)var1.M();
         }

         Object var6 = var10000;
         return var6 == null ? null : new StringBuilder(var6.toString());
      } else {
         return t(var1);
      }
   }

   public static Object t(Yn4 var0) {
      String var1;
      Object var7;
      label32: {
         var7 = Nv4.o();
         P7 var2 = var0.E();
         var1 = (String)var7;
         int var6 = var2.P();
         byte var10001 = 4;
         if (var1 != null) {
            if (var6 == 4) {
               String var5 = var2.z();
               var2.S(a(21857, 6585532094204834062L));
               return var5;
            }

            var7 = var2;
            if (var1 == null) {
               break label32;
            }

            var6 = var2.P();
            var10001 = 2;
         }

         if (var6 == var10001) {
            String var3 = var2.c$String();
            var2.S(a(19544, 8077850927720458294L));
            return var3;
         }

         var7 = var0.M();
      }

      Object var4 = var7;
      var7 = var4;
      if (var1 != null) {
         if (var4 == null) {
            return null;
         }

         var7 = var4;
      }

      return var7.toString();
   }

   @Override
   public int j() {
      return 4;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9327;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6519255642992993200L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "NÒbãÌ\u008d\u0092®è< IWØ\u008b\u0096";
      int var5 = "NÒbãÌ\u008d\u0092®è< IWØ\u008b\u0096".length();
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
      c = new Integer[2];
      b = new Wk2_2();
   }
}





