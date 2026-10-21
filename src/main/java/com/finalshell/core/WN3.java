package com.finalshell.core;

import com.finalshell.ui.model.QE;

// $VF: synthetic class
public class WN3 {
   static int[] Z;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      Z = new int[QE.values().length];

      try {
         Z[QE.list.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         Z[QE.roll.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         Z[QE.star.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         Z[QE.shutter.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      try {
         Z[QE.fade.ordinal()] = 5;
      } catch (NoSuchFieldError var1) {
      }
   }
}





