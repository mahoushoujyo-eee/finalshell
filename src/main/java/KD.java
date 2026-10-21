import org.pcap4j.core.PcapHandle;

class KD implements Runnable {
   final Li_2 O;
   private final PcapHandle p;

   KD(Li_2 var1, PcapHandle var2) {
      this.O = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      this.p.close();
   }
}





