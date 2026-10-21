import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.PcapStat;

class Jj_2 extends Thread {
   final xQ H;
   private final PcapHandle C;
   private final PacketListener a;
   private final PcapNetworkInterface Y;

   Jj_2(xQ var1, PcapHandle var2, PacketListener var3, PcapNetworkInterface var4) {
      this.H = var1;
      this.C = var2;
      this.a = var3;
      this.Y = var4;
   }

   @Override
   public void run() {
      try {
         this.C.loop(-1, this.a);
         PcapStat var1 = this.C.getStats();
         this.C.close();
      } catch (Exception var2) {
      }

      this.H.t.remove(this.Y.getName());
   }
}





