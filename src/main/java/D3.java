public class D3 {
   private static boolean X;

   public static void m(boolean var0) {
      X = var0;
   }

   public static boolean S() {
      return X;
   }

   public static boolean M() {
      boolean var0 = S();
      return !var0;
   }

   static {
      if (!S()) {
         m(true);
      }
   }
}





