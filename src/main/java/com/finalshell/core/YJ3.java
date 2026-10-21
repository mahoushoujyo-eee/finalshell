package com.finalshell.core;

import javax.swing.LayoutStyle.ComponentPlacement;

// $VF: synthetic class
public class YJ3 {
   static int[] W;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      W = new int[ComponentPlacement.values().length];

      try {
         W[ComponentPlacement.INDENT.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         W[ComponentPlacement.RELATED.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         W[ComponentPlacement.UNRELATED.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





