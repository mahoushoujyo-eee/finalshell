package com.finalshell.core;

import com.finalshell.ui.model.OV;

// $VF: synthetic class
public class NG3 {
   static int[] c;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 235052728393233188L;
      long var10002 = -3658938821738925278L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      c = new int[OV.values().length];

      try {
         c[OV.none.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         c[OV.fillFirst.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         c[OV.fillMiddle.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         c[OV.fillLast.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         c[OV.fillFirstAndLast.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         c[OV.fillAll.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





