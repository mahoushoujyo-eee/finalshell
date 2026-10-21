import javax.swing.JPanel;

public class Tm_2 extends JPanel {
   private static int c;

   public static void R(int var0) {
      c = var0;
   }

   public static int o() {
      return c;
   }

   public static int r() {
      int var0 = o();
      return var0 == 0 ? 89 : 0;
   }

   static {
      if (o() == 0) {
         R(62);
      }
   }
}





