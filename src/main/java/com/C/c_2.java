package com.C;

// $VF: synthetic class
class c_2 {
   static final int[] q = new int[com.C.M.values().length];

   static {
      try {
         q[com.C.M.simple.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         q[com.C.M.dropdown.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





