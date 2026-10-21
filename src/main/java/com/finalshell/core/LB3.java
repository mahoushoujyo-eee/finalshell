package com.finalshell.core;

import com.finalshell.ui.model.B1;

// $VF: synthetic class
public class LB3 {
   static int[] z;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      z = new int[B1.values().length];

      try {
         z[B1.up.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         z[B1.down.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         z[B1.left.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         z[B1.right.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}





