package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class CT3 {
   public String M;
   public long w;
   public String k;
   public static int o;
   public static int r;
   public static int R;
   public static int Y;
   public static int U;
   public static int y;
   public static int i;
   public int l;

   public CT3(String var1, String var2, long var3, int var5) {
      Registry.lookupField(466423498630046229L).setInt(this, Registry.lookupField(341718875000366390L).getInt(null));
      long var7 = 121519761132144266L;
      Ref.s(121519761132144266L, var1, var7);
      long var9 = 322141930679153907L;
      Ref.s(322141930679153907L, var2, var9);
      Registry.lookupField(223578710576528393L).setLong(this, var3);
      Registry.lookupField(466423498630046229L).setInt(this, var5);
   }

   public String F() {
      Object var1 = 121519761132144266L;
      return (String)Ref.g(121519761132144266L, var1);
   }

   public void o(String var1) {
      long var3 = 121519761132144266L;
      Ref.s(121519761132144266L, var1, var3);
   }

   public long o() {
      return Registry.lookupField(223578710576528393L).getLong(this);
   }

   public void k(long var1) {
      Registry.lookupField(223578710576528393L).setLong(this, var1);
   }

   public String U() {
      Object var1 = 322141930679153907L;
      return (String)Ref.g(322141930679153907L, var1);
   }

   public void N(String var1) {
      long var3 = 322141930679153907L;
      Ref.s(322141930679153907L, var1, var3);
   }

   public int f() {
      return Registry.lookupField(466423498630046229L).getInt(this);
   }

   public void i(int var1) {
      Registry.lookupField(466423498630046229L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 4767125306674118903L;
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "²\u009d9µ\u0088\u0016\u0000ðiF´=\u0088\u0016\u0000õºw\t°\u0088\u0016\u0000ò¢c\bz\u0088\u0016\u0000ô";
      int var6 = "²\u009d9µ\u0088\u0016\u0000ðiF´=\u0088\u0016\u0000õºw\t°\u0088\u0016\u0000ò¢c\bz\u0088\u0016\u0000ô".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
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
                     Registry.lookupField(341718875000366390L).setInt(null, 1);
                     Registry.lookupField(374091936438414305L).setInt(null, (int)var0[1]);
                     Registry.lookupField(533852929194464166L).setInt(null, (int)var0[3]);
                     Registry.lookupField(213538898722647981L).setInt(null, (int)var0[4]);
                     Registry.lookupField(589216127597200618L).setInt(null, (int)var0[2]);
                     Registry.lookupField(216428498330897051L).setInt(null, (int)var0[5]);
                     Registry.lookupField(163332929561227942L).setInt(null, (int)var0[0]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "6ÓØp\u0088\u0016\u0000óÍú\u00adå\u0088\u0016\u0000ñ";
                  var6 = "6ÓØp\u0088\u0016\u0000óÍú\u00adå\u0088\u0016\u0000ñ".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
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





