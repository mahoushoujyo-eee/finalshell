public abstract class Ub_2 {
   private static String[] J;

   public abstract Ky_2 R();

   public static void i(String[] var0) {
      J = var0;
   }

   public static String[] A() {
      return J;
   }

   static {
      if (A() != null) {
         i(new String[1]);
      }
   }
}





