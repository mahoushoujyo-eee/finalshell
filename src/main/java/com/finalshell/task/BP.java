package com.finalshell.task;

import com.finalshell.core.U2_4;
import java.util.concurrent.CyclicBarrier;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;

public class BP implements Runnable {
   public final PcapHandle I;
   public final PacketListener c;
   public final CyclicBarrier e;
   public String q;
   public String v;
   final U2_4 f;

   public BP(U2_4 var1, PcapHandle var2, PacketListener var3, CyclicBarrier var4) {
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





