package com.finalshell.core;

import com.finalshell.ui.model.US;

// $VF: synthetic class
public class WI_2 {
   public static int[] f;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      f = new int[US.values().length];

      try {
         f[US.Bash.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f[US.Zsh.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





