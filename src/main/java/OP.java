import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapStat;

class OP extends Thread {
   final Li_2 d;
   private final PcapHandle v;
   private final PacketListener M;

   OP(Li_2 var1, PcapHandle var2, PacketListener var3) {
      this.d = var1;
      this.v = var2;
      this.M = var3;
   }

   @Override
   public void run() {
      try {
         this.v.loop(-1, this.M);
         PcapStat var1 = this.v.getStats();
         this.v.close();
      } catch (Exception var2) {
      }
   }
}





