package com.finalshell.core;

import com.finalshell.ui.model.MR;

// $VF: synthetic class
public class DB {
   static int[] t;
   static int[] X;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 5073275504973760296L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "\u001a\u009eÊ*A¦Ç.½\u0014LåA¦Ç Ú´\t\u0007A¦Ç/";
      int var6 = "\u001a\u009eÊ*A¦Ç.½\u0014LåA¦Ç Ú´\t\u0007A¦Ç/".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      X = new int[MR.values().length];

      try {
         X[MR.NOTHING.ordinal()] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         X[MR.FILENAME.ordinal()] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         X[MR.DATA.ordinal()] = 3;
      } catch (NoSuchFieldError var17) {
      }

      t = new int[com.finalshell.ui.model.X9.values().length];

      try {
         t[com.finalshell.ui.model.X9.ZRQINIT.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZFILE.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZEOF.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZDATA.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZFIN.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZCRCW.ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var11) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZCRCQ.ordinal()] = (int)var0[2];
      } catch (NoSuchFieldError var10) {
      }

      try {
         t[com.finalshell.ui.model.X9.ZCRCE.ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var9) {
      }
   }
}





