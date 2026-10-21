package com.finalshell.core;

import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IpV4Packet;

public class Xq2 extends XQ_2 {
   public static Xq2 p;

   public static synchronized Xq2 A() {
      String[] var0 = XQ_2.B();

      try {
         if (var0 == null) {
            return p;
         }

         if (p != null) {
            return p;
         }
      } catch (Exception var3) {
         throw b(var3);
      }

      p = new Xq2(true, true);

      try {
         p.u();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      return p;
   }

   public Xq2(boolean var1, boolean var2) {
      super(var1, var2);
   }

   @Override
   public void C(IcmpV4CommonPacket var1, IpV4Packet.IpV4Header var2) {
      super.C(var1, var2);
      var2.getSrcAddr().getHostAddress();
   }

   public static Exception b(Exception var0) {
      return var0;
   }
}





