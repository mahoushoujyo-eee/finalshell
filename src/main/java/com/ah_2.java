package com;

import java.net.InetAddress;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

class ah_2 implements Runnable {
   final InetAddress k;
   final int Y;
   final com.c__2 c;

   ah_2(com.c__2 var1, InetAddress var2, int var3) {
      this.c = var1;
      this.k = var2;
      this.Y = var3;
   }

   @Override
   public void run() {
      this.c.n++;

      try {
         org.icmp4j.j var1 = xq_2.A().p(this.k, this.Y, new wW_3(this));
         var1.n(this.c.n);
      } catch (PcapNativeException var3) {
         var3.printStackTrace();
      } catch (NotOpenException var4) {
         var4.printStackTrace();
      }
   }
}





