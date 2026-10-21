import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class WC {
   protected short W = Yh_2.i;
   protected short T = 0;
   protected DatagramPacket g;
   public int l;
   public int H;
   private static com.ky_4[] d;

   public int y() {
      return this.T;
   }

   public int M() {
      return this.W;
   }

   public DatagramPacket H() {
      return this.g;
   }

   public void K(InetAddress var1) {
      this.g.setAddress(var1);
   }

   public void S(int var1) {
      this.g.setPort(var1);
   }

   public int w() {
      return this.l;
   }

   public void Q(int var1) {
      this.l = var1;
   }

   public int Z() {
      return this.H;
   }

   public void u(int var1) {
      this.H = var1;
   }

   public static void X(com.ky_4[] var0) {
      d = var0;
   }

   public static com.ky_4[] U() {
      return d;
   }

   static {
      if (U() == null) {
         X(new com.ky_4[4]);
      }
   }
}





