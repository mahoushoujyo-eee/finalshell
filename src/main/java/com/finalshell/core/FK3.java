package com.finalshell.core;

import com.finalshell.ui.model.Ks2;

// $VF: synthetic class
public class FK3 {
   static int[] s;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      s = new int[Ks2.values().length];

      try {
         s[Ks2.Little.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         s[Ks2.Big.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





