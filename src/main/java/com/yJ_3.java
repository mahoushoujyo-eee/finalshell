package com;

import javax.swing.LayoutStyle.ComponentPlacement;

// $VF: synthetic class
class yJ_3 {
   static final int[] W = new int[ComponentPlacement.values().length];

   static {
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





