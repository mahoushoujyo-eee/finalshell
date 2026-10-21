package com.finalshell.core;

import com.finalshell.ui.model.We4;

// $VF: synthetic class
public class NU {
   public static int[] N;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      N = new int[We4.values().length];

      try {
         N[We4.loading.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         N[We4.loaded.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         N[We4.failed.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





