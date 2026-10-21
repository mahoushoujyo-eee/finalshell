// $VF: synthetic class
class fK_3 {
   static final int[] s = new int[Ks_2.values().length];

   static {
      try {
         s[Ks_2.Little.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         s[Ks_2.Big.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





