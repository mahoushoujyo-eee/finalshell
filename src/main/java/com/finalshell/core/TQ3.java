package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;

public class TQ3 extends Ty4 {
   public String u;
   public String x;
   public int w;
   public static int Q;
   public static int U;
   public static int O;
   public static int b;
   public static int v;
   public static int z;
   public static int S;
   public static int R;
   public static int d;
   public static int m;
   public int L;

   public TQ3(String var1, int var2, int var3) {
   super();
      Ky4[] var10000 = Ty4.Y();
      Ky4[] var4 = var10000;
      Registry.lookupField(548098573368557380L).setInt(this, var2);
      long var6 = 325713135597124793L;
      Ref.s(325713135597124793L, var1, var6);
      Registry.lookupField(187458427007181257L).setInt(this, var3);
      if (var4 == null) {
         Ky4.K(new String[4]);
      }
   }

   public String r() {
      Object var1 = 325713135597124793L;
      return (String)Ref.g(325713135597124793L, var1);
   }

   public void M(String var1) {
      long var3 = 325713135597124793L;
      Ref.s(325713135597124793L, var1, var3);
   }

   @Override
   public int D() {
      return Registry.lookupField(548098573368557380L).getInt(this);
   }

   @Override
   public void L(int var1) {
      Registry.lookupField(548098573368557380L).setInt(this, var1);
   }

   public String e() {
      Object var1 = 317875142441894671L;
      return (String)Ref.g(317875142441894671L, var1);
   }

   public void I(String var1) {
      long var3 = 317875142441894671L;
      Ref.s(317875142441894671L, var1, var3);
   }

   public int n() {
      return Registry.lookupField(187458427007181257L).getInt(this);
   }

   public void T(int var1) {
      Registry.lookupField(187458427007181257L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 3110855944704954187L;
      long[] var0 = new long[9];
      int var4 = 0;
      String var5 = "F+\u0080Æë\u008d\u000fOï[Ô0ë\u008d\u000fNã-)>ë\u008d\u000fI)·ã¯ë\u008d\u000fL~Æ½\u0091ë\u008d\u000fH\u0093&ñ)ë\u008d\u000fAÿfIcë\u008d\u000f@";
      int var6 = "F+\u0080Æë\u008d\u000fOï[Ô0ë\u008d\u000fNã-)>ë\u008d\u000fI)·ã¯ë\u008d\u000fL~Æ½\u0091ë\u008d\u000fH\u0093&ñ)ë\u008d\u000fAÿfIcë\u008d\u000f@"
         .length();
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
                     Registry.lookupField(141097745113806009L).setInt(null, 1);
                     Registry.lookupField(230499244448933173L).setInt(null, (int)var0[2]);
                     Registry.lookupField(119984829432323123L).setInt(null, (int)var0[4]);
                     Registry.lookupField(428968525961987582L).setInt(null, (int)var0[0]);
                     Registry.lookupField(360540448640992052L).setInt(null, (int)var0[1]);
                     Registry.lookupField(174477257053866423L).setInt(null, (int)var0[7]);
                     Registry.lookupField(596294270063838005L).setInt(null, (int)var0[3]);
                     Registry.lookupField(530374631343329180L).setInt(null, (int)var0[8]);
                     Registry.lookupField(234937930320207719L).setInt(null, (int)var0[5]);
                     Registry.lookupField(592636579672783356L).setInt(null, (int)var0[6]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "Ö+\u0081Fë\u008d\u000fM]×z®ë\u008d\u000fC";
                  var6 = "Ö+\u0081Fë\u008d\u000fM]×z®ë\u008d\u000fC".length();
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





