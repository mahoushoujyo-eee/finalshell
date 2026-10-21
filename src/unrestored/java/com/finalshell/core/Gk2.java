package com.finalshell.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Gk2 {
   public static Long C;
   public static Long R;
   public static Long T;
   public static Long o;
   public static long[] a;
   public static Integer[] b;

   public static Long s() {
      return C;
   }

   public static Long y() {
      return R;
   }

   public static void k() {
      C = r();
      R = C;
   }

   public static long N() {
      return t(false);
   }

   public static long t(boolean var0) {
      String var1 = FV_2.D();
      if (var1 == null) {
         if (C != null) {
            long var2 = r();
            long var4 = var0 ? var2 - C : var2 - R;
            R = var2;
            return var4;
         }

         k();
      }

      return 0L;
   }

   public static void p() {
      X(false);
   }

   public static void v(String var0) {
      o(false, var0);
   }

   public static void X(boolean var0) {
      o(var0, "");
   }

   public static void o(boolean var0, String var1) {
      label21: {
         String var2 = FV_2.D();
         if (var2 == null) {
            if (C != null) {
               break label21;
            }

            NE3.n(Gk2.class, var1 + "0", new Object[0]);
            k();
         }

         if (var2 == null) {
            return;
         }
      }

      long var3 = r();
      NE3.n(Gk2.class, var1 + (var0 ? var3 - C : var3 - R), new Object[0]);
      R = var3;
   }

   public static void U() {
      C = null;
      R = null;
   }

   public static Long v() {
      return T;
   }

   public static Long n() {
      return o;
   }

   public static void Y() {
      T = f();
      o = T;
   }

   public static long O() {
      return S(false);
   }

   public static long S(boolean var0) {
      String var1 = FV_2.D();
      if (var1 == null) {
         if (T != null) {
            long var2 = f();
            long var4 = var0 ? var2 - T : var2 - o;
            o = var2;
            return var4;
         }

         Y();
      }

      return 0L;
   }

   public static void H() {
      o(false);
   }

   public static void p(String var0) {
      f(false, var0);
   }

   public static void o(boolean var0) {
      f(var0, "");
   }

   public static void f(boolean var0, String var1) {
      label21: {
         String var2 = FV_2.D();
         if (var2 == null) {
            if (T != null) {
               break label21;
            }

            NE3.n(Gk2.class, var1 + "0", new Object[0]);
            Y();
         }

         if (var2 == null) {
            return;
         }
      }

      long var3 = f();
      NE3.n(Gk2.class, var1 + (var0 ? var3 - T : var3 - o), new Object[0]);
      o = var3;
   }

   public static void a() {
      T = null;
      o = null;
   }

   public static long r() {
      return System.currentTimeMillis();
   }

   public static long f() {
      return System.nanoTime();
   }

   public static Date V() {
      return new Date(r());
   }

   public static boolean N(Date var0, Date var1) {
      return n(var0.getTime(), var1.getTime());
   }

   public static boolean n(Long var0, Long var1) {
      Calendar var2 = Calendar.getInstance();
      Date var3 = var2.getTime();
      var2.setTimeInMillis(var0);
      boolean var4 = i(var2, var1);
      var2.setTime(var3);
      return var4;
   }

   public static boolean X(Calendar var0, Date var1) {
      return i(var0, var1.getTime());
   }

   public static boolean i(Calendar var0, Long var1) {
      long var3;
      int var9;
      label30: {
         label32: {
            String var10000 = FV_2.D();
            var3 = var0.getTimeInMillis();
            String var2 = var10000;
            int var5 = var0.get(1);
            int var6 = var0.get(2);
            int var7 = var0.get(5);
            var0.setTimeInMillis(var1);
            var9 = var5;
            int var10001 = var0.get(1);
            if (var2 == null) {
               if (var5 != var10001) {
                  break label32;
               }

               var9 = var6;
               var10001 = var0.get(2);
            }

            if (var2 == null) {
               if (var9 != var10001) {
                  break label32;
               }

               var9 = var7;
               if (var2 != null) {
                  break label30;
               }

               var10001 = var0.get(5);
            }

            if (var9 == var10001) {
               var9 = 1;
               break label30;
            }
         }

         var9 = 0;
      }

      int var8 = var9;
      var0.setTimeInMillis(var3);
      return var8 != 0;
   }

   public static Date E(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(var0);
      var1.set(a(17741, 6183274106357341088L), 0);
      var1.set(a(29841, 2994919220093020788L), 0);
      var1.set(a(25136, 5339690990995897566L), 0);
      var1.set(a(9957, 8459939535672293379L), 1);
      return var1.getTime();
   }

   public static Date i(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(var0);
      var1.set(a(27462, 5505792831978075565L), a(9962, 1428326353112610816L));
      var1.set(a(23242, 3930480826444039213L), a(24716, 3981677769103015520L));
      var1.set(a(4559, 1425535564778868512L), a(29935, 8169139651951520263L));
      var1.set(a(25749, 4130667496479652476L), a(26405, 643755650370369985L));
      return var1.getTime();
   }

   public static void o(Calendar var0) {
      p(var0, 1);
   }

   public static void J(Calendar var0) {
      p(var0, -1);
   }

   public static void p(Calendar var0, int var1) {
      var0.set(5, var0.get(5) + var1);
   }

   public static String y(String var0) {
      return c(var0, new Date());
   }

   public static String c(String var0, Date var1) {
      return new SimpleDateFormat(var0).format(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7919;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2846972290367792592L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "¯\u000eÕ\u008cÍ\u0094*ý?ä\u0004)\u008ciY\u0003%¾\u0015jÆ\u008c~{ø\u001eH\u001b\u0019´Û\u008bë+\u00adß01PvH\u0097«©ð[\u009dÇ\t³`^8+_¢Å\u0000\u008cF\u0097àOì\u0005Ïðidnáñ[Y¸×\u0089Ç\u001dÝ";
      int var5 = "¯\u000eÕ\u008cÍ\u0094*ý?ä\u0004)\u008ciY\u0003%¾\u0015jÆ\u008c~{ø\u001eH\u001b\u0019´Û\u008bë+\u00adß01PvH\u0097«©ð[\u009dÇ\t³`^8+_¢Å\u0000\u008cF\u0097àOì\u0005Ïðidnáñ[Y¸×\u0089Ç\u001dÝ"
         .length();
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
                     b = new Integer[12];
                     C = null;
                     R = null;
                     T = null;
                     o = null;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ös(\u0088`bÏ¨\u008bþ´°º¹_ö";
                  var5 = "Ös(\u0088`bÏ¨\u008bþ´°º¹_ö".length();
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





