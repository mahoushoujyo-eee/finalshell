package com.finalshell.task;

import com.finalshell.config.DnsResolveFailedSetting;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapStat;

public class OP extends Thread {
   public final DnsResolveFailedSetting d;
   public final PcapHandle v;
   public final PacketListener M;

   public OP(DnsResolveFailedSetting var1, PcapHandle var2, PacketListener var3) {
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





