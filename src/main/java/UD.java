import java.net.DatagramPacket;

public class UD {
   private static String[] E;

   public UD(DatagramPacket var1) {
   }

   public void X() {
   }

   public static void W(String[] var0) {
      E = var0;
   }

   public static String[] L() {
      return E;
   }

   static {
      if (L() == null) {
         W(new String[3]);
      }
   }
}





