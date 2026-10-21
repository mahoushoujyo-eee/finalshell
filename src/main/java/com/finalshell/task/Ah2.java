package com.finalshell.task;

import com.finalshell.core.IcmpPingService;
import com.finalshell.core.WW3;
import com.finalshell.core.Xq2;
import java.net.InetAddress;
import org.icmp4j.j;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class Ah2 implements Runnable {
   public final InetAddress k;
   public final int Y;
   public final IcmpPingService c;

   public Ah2(IcmpPingService var1, InetAddress var2, int var3) {
      this.c = var1;
      this.k = var2;
      this.Y = var3;
   }

   @Override
   public void run() {
      this.c.n++;

      try {
         j var1 = Xq2.A().p(this.k, this.Y, new WW3(this));
         var1.n(this.c.n);
      } catch (PcapNativeException var3) {
         var3.printStackTrace();
      } catch (NotOpenException var4) {
         var4.printStackTrace();
      }
   }
}





