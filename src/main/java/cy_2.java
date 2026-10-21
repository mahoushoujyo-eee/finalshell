public class Cy_2 extends Exception {
   private static final long serialVersionUID;
   private static int[] i;

   Cy_2() {
   }

   @Override
   public void printStackTrace() {
   }

   public static void c(int[] var0) {
      i = var0;
   }

   public static int[] u() {
      return i;
   }

   static {
      if (u() == null) {
         c(new int[4]);
      }

      long var2 = 1033888976259585596L;
      long var10002 = 6193453239112299938L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      serialVersionUID = var0;
   }
}





