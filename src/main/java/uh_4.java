// $VF: synthetic class
class uh_4 {
   static final int[] y = new int[DZ.values().length];

   static {
      try {
         y[DZ.CRC16.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         y[DZ.CRC32.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}





