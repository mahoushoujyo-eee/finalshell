package com.finalshell.task;

import com.finalshell.config.DnsResolveFailedSetting;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapStat;

public class CJ3 extends Thread {
   final DnsResolveFailedSetting m;
   public final PacketListener X;

   CJ3(DnsResolveFailedSetting var1, PacketListener var2) {
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





