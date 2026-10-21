package com;

import javax.swing.SortOrder;

// $VF: synthetic class
class a8 {
   static final int[] e = new int[SortOrder.values().length];

   static {
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





