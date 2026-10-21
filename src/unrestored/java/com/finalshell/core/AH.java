package com.finalshell.core;

import com.finalshell.ui.model.Xx2;

// $VF: synthetic class
public class AH {
   public static int[] H;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      H = new int[Xx2.values().length];

      try {
         H[Xx2.preferred.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         H[Xx2.fitComponent.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         H[Xx2.repeat.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





