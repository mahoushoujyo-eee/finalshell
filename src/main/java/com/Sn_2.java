package com;

// $VF: synthetic class
class Sn_2 {
   static final int[] A = new int[Pt_2.values().length];

   static {
      try {
         A[Pt_2.unchecked.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         A[Pt_2.checked.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         A[Pt_2.mixed.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





