package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;

public class Vp2 {
   public static boolean T;
   public static long[] a;
   public static Integer[] b;

   public static boolean w(int var0) {
      Ky4[] var1 = YT3_2.c();
      int var10000 = var0;
      int var10001 = a(21356, 987563240864451930L);
      if (var1 != null) {
         if (var0 < var10001) {
            return 0 != 0;
         }

         var10000 = var0;
         if (var1 == null) {
            return var0 != 0;
         }

         var10001 = a(25388, 3795853034977049881L);
      }

      return ((var10000 <= var10001 ? 1 : 0) != 0);
   }

   public static char B(int var0) {
      boolean var5;
      Ky4[] var1 = YT3_2.c();
      char var10000 = (Registry.lookupField(522380536751185200L).getBoolean(null)) ? 1 : 0;
      if (var1 != null) {
         if (var10000 == 0) {
            Object var6 = Registry.packArgs(var0);
            long var2 = 536530111645880732L;
            Object var10001 = Ref.h2(536530111645880732L, var2);

            try {
               var5 = (Boolean)var10001;
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            if (var1 == null) {
               return (char)var6;
            }

            if (!var5) {
               throw new AssertionError();
            }
         }

         var10000 = (char)(
            a(18218, 5148575415272577309L) | var0 - a(2558, 3550467623185274831L) >> a(23659, 7852434749248766555L) & a(28606, 8392334620802265482L)
         );
      }

      return var10000;
   }

   public static char Q(int var0) {
      boolean var5;
      Ky4[] var1 = YT3_2.c();
      char var10000 = (Registry.lookupField(522380536751185200L).getBoolean(null)) ? 1 : 0;
      if (var1 != null) {
         if (var10000 == 0) {
            Object var6 = Registry.packArgs(var0);
            long var2 = 536530111645880732L;
            Object var10001 = Ref.h2(536530111645880732L, var2);

            try {
               var5 = (Boolean)var10001;
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            if (var1 == null) {
               return (char)var6;
            }

            if (!var5) {
               throw new AssertionError();
            }
         }

         var10000 = (char)(a(4779, 1814794869388594329L) | var0 - a(2558, 3550467623185274831L) & a(2521, 7457785910482589674L));
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24112;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      boolean var5;
      long var0 = 2501025936524877641L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "]\u0081õzrr\u009d\u0018¤`BÍbàH\u0086äØ\rH\u0012\u0081\u008fÐ\\Âo\u0098] Ë\\·\u009eh0\u001d»-<cüÈüÁï]¯";
      var5 = ("]\u0081õzrr\u009d\u0018¤`BÍbàH\u0086äØ\rH\u0012\u0081\u008fÐ\\Âo\u0098] Ë\\·\u009eh0\u001d»-<cüÈüÁï]¯".length()) != 0;
      byte var2 = 0;

      label26:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     b = new Integer[8];
                     T = !Oo2.class.desiredAssertionStatus();
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label26;
                  }

                  var4 = "V\u0010\u0015n\u009cn\u0012\u0013/l_uN;ÞT";
                  var5 = ("V\u0010\u0015n\u009cn\u0012\u0013/l_uN;ÞT".length()) != 0;
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
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





