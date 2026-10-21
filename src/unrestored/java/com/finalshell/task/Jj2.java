package com.finalshell.task;

import com.finalshell.core.XQ_2;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.PcapStat;

public class Jj2 extends Thread {
   public final XQ_2 H;
   public final PcapHandle C;
   public final PacketListener a;
   public final PcapNetworkInterface Y;

   public Jj2(XQ_2 var1, PcapHandle var2, PacketListener var3, PcapNetworkInterface var4) {
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





