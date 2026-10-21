package com.finalshell.core;

// $VF: synthetic class
public class C_2 {
   static int[] q;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      q = new int[com.finalshell.ui.model.M.values().length];

      try {
         q[com.finalshell.ui.model.M.simple.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         q[com.finalshell.ui.model.M.dropdown.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





