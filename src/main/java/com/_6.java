package com;

// $VF: synthetic class
class _6 {
   static final int[] g = new int[Pt_2.values().length];

   static {
      try {
         g[Pt_2.mixed.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         g[Pt_2.unchecked.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         g[Pt_2.checked.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





