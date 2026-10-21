import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapStat;

class cJ_3 extends Thread {
   final Li_2 m;
   private final PacketListener X;

   cJ_3(Li_2 var1, PacketListener var2) {
      this.m = var1;
      this.X = var2;
   }

   @Override
   public void run() {
      try {
         this.m.h.loop(-1, this.X);
         PcapStat var1 = this.m.h.getStats();
         this.m.h.close();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





