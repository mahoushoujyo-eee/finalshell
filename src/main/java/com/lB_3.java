package com;

// $VF: synthetic class
class lB_3 {
   static final int[] z = new int[com.B1.values().length];

   static {
      try {
         z[com.B1.up.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         z[com.B1.down.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         z[com.B1.left.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         z[com.B1.right.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}





