package com.finalshell.core;

public abstract class IK implements Wr4 {
   public static ThreadLocal r;
   public static ThreadLocal W;
   public static Character X;
   public static long[] a;
   public static Integer[] b;

   public final char v(NL3 var1, Object var2, char var3) {
      NL3 var4 = (NL3)r.get();
      r.set(var1);
      W.set(var3);
      this.F(var2);
      r.set(var4);
      return (Character)W.get();
   }

   public final void T(String var1, Object var2) {
      NL3 var4 = (NL3)r.get();
      char var5 = (Character)W.get();
      String var10000 = Nv4.o();
      byte var6 = (byte)((var4.Y.containsKey(var2)) ? 1 : 0);
      String var3 = var10000;
      var4.A(var5, var1, var2);
      char var7 = (char)var6;
      if (var3 != null) {
         if (var6 == 0) {
            var4.Y.remove(var2);
         }

         var7 = var5;
      }

      if (var7 != a(2587, 8312443769728312076L)) {
         W.set(X);
      }
   }

   public abstract void F(Object var1);

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10519;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3607503213273654410L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "8¨þÔ\u001fQ\u0007ªÊ\u0090lt,á'ð";
      int var5 = "8¨þÔ\u001fQ\u0007ªÊ\u0090lt,á'ð".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
      r = new ThreadLocal();
      W = new ThreadLocal();
      X = Character.valueOf((char)a(10816, 4816287381485290326L));
   }
}





