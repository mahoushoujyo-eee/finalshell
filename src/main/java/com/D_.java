package com;

// $VF: synthetic class
class D_ {
   static final int[] K = new int[GQ.values().length];

   static {
      try {
         K[GQ.root.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         K[GQ.folder.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         K[GQ.leaf.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





