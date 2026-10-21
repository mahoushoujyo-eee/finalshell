import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class Vb_2 {
   protected short V = Cs_2.a;
   protected short E = 0;
   protected DatagramPacket O;
   public int p;
   public int x;
   private static com.ky_4[] h;

   public int V() {
      return this.E;
   }

   public int M() {
      return this.V;
   }

   public DatagramPacket S() {
      return this.O;
   }

   public void D(InetAddress var1) {
      this.O.setAddress(var1);
   }

   public void A(int var1) {
      this.O.setPort(var1);
   }

   public int J() {
      return this.p;
   }

   public void x(int var1) {
      this.p = var1;
   }

   public int w() {
      return this.x;
   }

   public void T(int var1) {
      this.x = var1;
   }

   public static void x(com.ky_4[] var0) {
      h = var0;
   }

   public static com.ky_4[] U() {
      return h;
   }

   static {
      if (U() == null) {
         x(new com.ky_4[2]);
      }
   }
}





