package com.finalshell.core;

import com.finalshell.ui.model.EL3;

// $VF: synthetic class
public class V_2 {
   public static int[] c;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 3181676203567534080L;
      long var10002 = -5600542802964066298L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      c = new int[EL3.values().length];

      try {
         c[EL3.aboveStart.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         c[EL3.aboveMiddle.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         c[EL3.aboveEnd.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         c[EL3.belowStart.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         c[EL3.belowMiddle.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         c[EL3.belowEnd.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





