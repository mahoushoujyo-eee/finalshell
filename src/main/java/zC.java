public class zC {
   private static boolean J;

   public static void main(String[] var0) {
      new zC();
   }

   public static void X(boolean var0) {
      J = var0;
   }

   public static boolean z() {
      return J;
   }

   public static boolean u() {
      boolean var0 = z();
      return !var0;
   }

   static {
      if (z()) {
         X(true);
      }
   }
}





