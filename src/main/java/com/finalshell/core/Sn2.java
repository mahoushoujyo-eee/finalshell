package com.finalshell.core;

import com.finalshell.ui.model.Pt2;

// $VF: synthetic class
public class Sn2 {
   static int[] A;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      A = new int[Pt2.values().length];

      try {
         A[Pt2.unchecked.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         A[Pt2.checked.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         A[Pt2.mixed.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





