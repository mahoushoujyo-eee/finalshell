import java.io.IOException;

public abstract class mW {
   private static boolean M;

   public abstract Object Z() throws IOException;

   public static void q(boolean var0) {
      M = var0;
   }

   public static boolean J() {
      return M;
   }

   public static boolean q() {
      boolean var0 = J();
      return !var0;
   }

   static {
      if (!J()) {
         q(true);
      }
   }
}





