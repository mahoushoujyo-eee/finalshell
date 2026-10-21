package com.finalshell.core;

import com.finalshell.ui.model.EL3;

// $VF: synthetic class
public class Sf2 {
   public static int[] s;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 427997150341841222L;
      long var10002 = -6865518103279615680L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      s = new int[EL3.values().length];

      try {
         s[EL3.aboveStart.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         s[EL3.aboveMiddle.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         s[EL3.aboveEnd.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         s[EL3.belowStart.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         s[EL3.belowMiddle.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         s[EL3.belowEnd.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





