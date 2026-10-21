package com.finalshell.core;

import com.finalshell.ui.model.Pt2;

// $VF: synthetic class
public class Yn2 {
   static int[] M;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      M = new int[Pt2.values().length];

      try {
         M[Pt2.unchecked.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         M[Pt2.checked.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         M[Pt2.mixed.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





