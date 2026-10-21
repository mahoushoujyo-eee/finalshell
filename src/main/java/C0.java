// $VF: synthetic class
class C0 {
   static final int[] k = new int[gV.values().length];

   static {
      try {
         k[gV.HEADER.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         k[gV.DATA.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         k[gV.CANCEL.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





