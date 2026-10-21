package com.finalshell.core;

import com.finalshell.ui.model.S6;

// $VF: synthetic class
public class L12 {
   public static int[] U;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 6331593490958894143L;
      long var10002 = -8133001543218117575L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      U = new int[S6.values().length];

      try {
         U[S6.EQ.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         U[S6.NE.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         U[S6.GE.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         U[S6.GT.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         U[S6.LE.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         U[S6.LT.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





