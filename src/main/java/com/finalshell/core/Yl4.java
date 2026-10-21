package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;

public class Yl4 {
   ConnectHost v;
   int q;
   public static int O;
   public static int I;
   public static int l;
   public static int N;
   int i;
   public static long[] a;
   public static Integer[] b;

   public Yl4(ConnectHost var1, int var2) {
      Ty4.Y();
      Registry.lookupField(534669677834628032L).setInt(this, a(19066, 7370518447508552269L));
      long var5 = 487377996169177016L;
      Ref.s(487377996169177016L, var1, var5);
      Registry.lookupField(517408582937337833L).setInt(this, var2);
      if (Ky4.F$arrString() != null) {
         Ty4.c(new Ky4[4]);
      }
   }

   public ConnectHost o() {
      Object var1 = 487377996169177016L;
      return (ConnectHost)Ref.g(487377996169177016L, var1);
   }

   public void D(ConnectHost var1) {
      long var3 = 487377996169177016L;
      Ref.s(487377996169177016L, var1, var3);
   }

   public int e() {
      return Registry.lookupField(517408582937337833L).getInt(this);
   }

   public void K(int var1) {
      Registry.lookupField(517408582937337833L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12339;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1825543814015552940L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "G{\u009a\\pÚ#ó^ÉEÁåy\u0096\u0012\u0086§\u0099C½å¿[";
      int var5 = "G{\u009a\\pÚ#ó^ÉEÁåy\u0096\u0012\u0086§\u0099C½å¿[".length();
      byte var2 = 0;

      label20:
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
                     b = new Integer[5];
                     Registry.lookupField(411125898711485254L).setInt(null, a(11198, 8409889248768334732L));
                     Registry.lookupField(292074870577220689L).setInt(null, a(7688, 1681801961949965883L));
                     Registry.lookupField(261180006635811470L).setInt(null, a(986, 6466826928723375082L));
                     Registry.lookupField(462452886233087561L).setInt(null, a(672, 5951886602034393745L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "-ýµ9\n3¾#%§ïK\u000ez÷\u0086";
                  var5 = "-ýµ9\n3¾#%§ïK\u000ez÷\u0086".length();
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





