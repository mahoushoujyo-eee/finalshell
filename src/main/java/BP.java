import java.util.concurrent.CyclicBarrier;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;

class BP implements Runnable {
   private final PcapHandle I;
   private final PacketListener c;
   private final CyclicBarrier e;
   private String q;
   private String v;
   final u_2 f;

   public BP(u_2 var1, PcapHandle var2, PacketListener var3, CyclicBarrier var4) {
      this.f = var1;
      this.I = var2;
      this.c = var3;
      this.e = var4;
   }

   public void F(String var1, String var2) {
      this.q = var1;
      this.v = var2;
   }

   @Override
   public void run() {
      try {
         this.e.await();
         this.I.loop(this.f.J, this.c);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





