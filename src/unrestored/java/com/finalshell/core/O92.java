package com.finalshell.core;

import com.finalshell.ui.model.RP3;

// $VF: synthetic class
public class O92 {
   public static int[] Q;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 2823886493354802591L;
      long var10002 = -8606250975819219559L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      Q = new int[RP3.values().length];

      try {
         Q[RP3.BLINK_BLOCK.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         Q[RP3.STEADY_BLOCK.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         Q[RP3.BLINK_UNDERLINE.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         Q[RP3.STEADY_UNDERLINE.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         Q[RP3.BLINK_VERTICAL_BAR.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         Q[RP3.STEADY_VERTICAL_BAR.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





