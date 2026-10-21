package com.finalshell.task;

import com.finalshell.config.DnsResolveFailedSetting;
import org.pcap4j.core.PcapHandle;

public class KD implements Runnable {
   public final DnsResolveFailedSetting O;
   public final PcapHandle p;

   public KD(DnsResolveFailedSetting var1, PcapHandle var2) {
      this.O = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      this.p.close();
   }
}





