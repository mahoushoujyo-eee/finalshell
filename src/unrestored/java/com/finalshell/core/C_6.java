package com.finalshell.core;

import com.finalshell.ui.model.Pt2;

// $VF: synthetic class
public class C_6 {
   public static int[] g;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      g = new int[Pt2.values().length];

      try {
         g[Pt2.mixed.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         g[Pt2.unchecked.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         g[Pt2.checked.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





