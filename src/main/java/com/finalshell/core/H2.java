package com.finalshell.core;

public abstract class H2 implements Wr4 {
   public static ThreadLocal d;
   public static ThreadLocal H;
   public static Character c;
   public static long[] a;
   public static Integer[] b;

   public final char y(NL3 var1, Object var2, char var3) {
      NL3 var4 = (NL3)d.get();
      d.set(var1);
      H.set(var3);
      this.Z(var2);
      d.set(var4);
      return (Character)H.get();
   }

   public final void P(String var1, Object var2) {
      String var10000 = Nv4.o();
      NL3 var4 = (NL3)d.get();
      String var3 = var10000;
      char var5 = (Character)H.get();
      byte var6 = (byte)((var4.S(var2)) ? 1 : 0);
      var4.A(var5, var1, var2);
      char var7 = (char)var6;
      if (var3 != null) {
         if (var6 == 0 && var3 != null && var4.Y != null) {
            var4.Y.remove(var2);
         }

         var7 = var5;
      }

      if (var7 != a(5396, 3179395681238325068L)) {
         H.set(c);
      }
   }

   public abstract void Z(Object var1);

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 600;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1184427867990045711L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "°\u0015¤\\9\u0001£o\u001f7:±ù-\u000e\u000e";
      int var5 = "°\u0015¤\\9\u0001£o\u001f7:±ù-\u000e\u000e".length();
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
      d = new ThreadLocal();
      H = new ThreadLocal();
      c = Character.valueOf((char)a(14452, 2319432642836281901L));
   }
}





