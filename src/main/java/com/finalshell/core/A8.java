package com.finalshell.core;

import javax.swing.SortOrder;

// $VF: synthetic class
public class A8 {
   public static int[] e;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      e = new int[SortOrder.values().length];

      try {
         e[SortOrder.ASCENDING.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         e[SortOrder.DESCENDING.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         e[SortOrder.UNSORTED.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





