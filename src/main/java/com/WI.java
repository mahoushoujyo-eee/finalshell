package com;

// $VF: synthetic class
class WI {
   static final int[] f = new int[uS.values().length];

   static {
      try {
         f[uS.Bash.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f[uS.Zsh.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





