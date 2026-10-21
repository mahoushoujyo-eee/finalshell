package com.finalshell.core;

import java.net.Inet4Address;
import java.util.ArrayList;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.MacAddress;

public class W1 {
   public static byte R;
   public static short s;
   public static byte N;
   public static short e;
   public static boolean A;
   public static byte[] v;
   public static long[] a;
   public static Integer[] b;

   static {
      __vfClinit__();
   }

   public static Packet u(MacAddress var0, MacAddress var1, IpV4Packet.Builder var2) {
      Object var3 = null;
      Object var4 = null;
      Object var5 = null;
      if (A) {
         var4 = EtherType.PPPOE_SESSION_STAGE;
         UnknownPacket.Builder var6 = new UnknownPacket.Builder();
         byte[] var7 = var2.build$IpV4Packet().getRawData();
         byte[] var8 = new byte[2];
         B8.P((short)(var7.length + 2), var8, 0);
         byte[] var9 = new byte[a(24615, 6763004697356350990L)];
         System.arraycopy(v, 0, var9, 0, var9.length);
         System.arraycopy(var8, 0, var9, 4, 2);
         byte[] var10 = new byte[var9.length + var7.length];
         System.arraycopy(var9, 0, var10, 0, var9.length);
         System.arraycopy(var7, 0, var10, a(10649, 8129016643178495923L), var7.length);
         var6.rawData(var10);
         var3 = var6;
      } else {
         var4 = EtherType.IPV4;
         var3 = var2;
      }

      EthernetPacket.Builder var13 = new EthernetPacket.Builder();
      var13.dstAddr(var1).srcAddr(var0).type((EtherType)var4).payloadBuilder$EthernetPacket_Builder((Packet.Builder)var3).paddingAtBuild(true);
      return var13.build$EthernetPacket();
   }

   public static Packet S(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, byte[] var6, short var7) {
      Object var8 = null;
      UdpPacket.Builder var9 = new UdpPacket.Builder();
      var9.payloadBuilder$UdpPacket_Builder(new UnknownPacket.Builder().rawData(var6));
      var9.correctChecksumAtBuild$UdpPacket_Builder(true);
      var9.correctLengthAtBuild$UdpPacket_Builder(true);
      var9.dstAddr(var4);
      var9.dstPort(new UdpPort(var5, ""));
      var9.srcAddr(var2);
      var9.srcPort(new UdpPort(var3, ""));
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var10.correctLengthAtBuild$IpV4Packet_Builder(true);
      var10.dontFragmentFlag(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var4);
      var10.fragmentOffset((short)0);
      var10.identification(var7);
      var10.ihl((byte)5);
      var10.moreFragmentFlag(false);
      var10.protocol(IpNumber.UDP);
      var10.srcAddr(var2);
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.ttl(R);
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder$IpV4Packet_Builder(var9);
      return u(var0, var1, var10);
   }

   public static Packet V(
      MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, byte[] var8, short var9
   ) {
      Object var10 = null;
      TcpPacket.Builder var11 = new TcpPacket.Builder();
      var11.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var8));
      var11.correctChecksumAtBuild$TcpPacket_Builder(true);
      var11.correctLengthAtBuild$TcpPacket_Builder(true);
      var11.paddingAtBuild(true);
      var11.ack(true);
      var11.acknowledgmentNumber(var7);
      var11.dstAddr(var4);
      var11.dstPort(new TcpPort(var5, ""));
      var11.fin(false);
      var11.psh(false);
      var11.reserved((byte)0);
      var11.rst(false);
      var11.sequenceNumber(var6);
      var11.srcAddr(var2);
      var11.srcPort(new TcpPort(var3, ""));
      var11.syn(false);
      var11.urg(false);
      var11.window(e);
      IpV4Packet.Builder var12 = new IpV4Packet.Builder();
      var12.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var12.correctLengthAtBuild$IpV4Packet_Builder(true);
      var12.dontFragmentFlag(true);
      var12.paddingAtBuild(true);
      var12.dstAddr(var4);
      var12.fragmentOffset((short)0);
      var12.identification(var9);
      var12.ihl((byte)5);
      var12.moreFragmentFlag(false);
      var12.protocol(IpNumber.TCP);
      var12.srcAddr(var2);
      var12.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var12.ttl(R);
      var12.version(IpVersion.IPV4);
      var12.payloadBuilder$IpV4Packet_Builder(var11);
      return u(var0, var1, var12);
   }

   public static Packet X(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, short var8) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild$TcpPacket_Builder(true);
      var9.correctLengthAtBuild$TcpPacket_Builder(true);
      var9.paddingAtBuild(true);
      var9.ack(true);
      var9.acknowledgmentNumber(var6);
      var9.dstAddr(var4);
      var9.dstPort(new TcpPort(var5, ""));
      var9.psh(false);
      var9.reserved((byte)0);
      var9.rst(false);
      var9.sequenceNumber(var7);
      var9.srcAddr(var2);
      var9.srcPort(new TcpPort(var3, ""));
      var9.syn(false);
      var9.urg(false);
      var9.window(e);
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var10.correctLengthAtBuild$IpV4Packet_Builder(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var4);
      var10.dontFragmentFlag(true);
      var10.fragmentOffset((short)0);
      var10.identification(var8);
      var10.ihl((byte)5);
      var10.protocol(IpNumber.TCP);
      var10.srcAddr(var2);
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.ttl(R);
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder$IpV4Packet_Builder(var9);
      return u(var0, var1, var10);
   }

   public static Packet o(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, short var8) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild$TcpPacket_Builder(true);
      var9.correctLengthAtBuild$TcpPacket_Builder(true);
      var9.paddingAtBuild(true);
      var9.ack(true);
      var9.acknowledgmentNumber(var6);
      var9.dstAddr(var4);
      var9.dstPort(new TcpPort(var5, ""));
      ArrayList var10 = new ArrayList();
      TcpNoOperationOption var11 = TcpNoOperationOption.getInstance();
      TcpMaximumSegmentSizeOption var12 = new TcpMaximumSegmentSizeOption.Builder()
         .maxSegSize(s)
         .correctLengthAtBuild$TcpMaximumSegmentSizeOption_Builder(true)
         .build$TcpMaximumSegmentSizeOption();
      var10.add(var12);
      var10.add(var11);
      var10.add(var11);
      TcpSackPermittedOption var13 = TcpSackPermittedOption.getInstance();
      var10.add(var13);
      var10.add(var11);
      TcpWindowScaleOption var14 = new TcpWindowScaleOption.Builder()
         .shiftCount(N)
         .correctLengthAtBuild$TcpWindowScaleOption_Builder(true)
         .build$TcpWindowScaleOption();
      var10.add(var14);
      var9.options(var10);
      var9.psh(false);
      var9.reserved((byte)0);
      var9.rst(false);
      var9.sequenceNumber(var7);
      var9.srcAddr(var2);
      var9.srcPort(new TcpPort(var3, ""));
      var9.syn(true);
      var9.urg(false);
      var9.window(e);
      IpV4Packet.Builder var15 = new IpV4Packet.Builder();
      var15.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var15.correctLengthAtBuild$IpV4Packet_Builder(true);
      var15.paddingAtBuild(true);
      var15.dstAddr(var4);
      var15.dontFragmentFlag(true);
      var15.fragmentOffset((short)0);
      var15.identification(var8);
      var15.ihl((byte)5);
      var15.protocol(IpNumber.TCP);
      var15.srcAddr(var2);
      var15.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var15.ttl(R);
      var15.version(IpVersion.IPV4);
      var15.payloadBuilder$IpV4Packet_Builder(var9);
      return u(var0, var1, var15);
   }

   public static Packet j(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, short var7) {
      TcpPacket.Builder var8 = new TcpPacket.Builder();
      var8.correctChecksumAtBuild$TcpPacket_Builder(true);
      var8.correctLengthAtBuild$TcpPacket_Builder(true);
      var8.paddingAtBuild(true);
      var8.dstAddr(var4);
      var8.dstPort(new TcpPort(var5, ""));
      TcpNoOperationOption var9 = TcpNoOperationOption.getInstance();
      ArrayList var10 = new ArrayList();
      TcpMaximumSegmentSizeOption var11 = new TcpMaximumSegmentSizeOption.Builder()
         .maxSegSize(s)
         .correctLengthAtBuild$TcpMaximumSegmentSizeOption_Builder(true)
         .build$TcpMaximumSegmentSizeOption();
      var10.add(var11);
      var10.add(var9);
      TcpWindowScaleOption var12 = new TcpWindowScaleOption.Builder()
         .shiftCount((byte)a(23614, 471096908037851666L))
         .correctLengthAtBuild$TcpWindowScaleOption_Builder(true)
         .build$TcpWindowScaleOption();
      var10.add(var12);
      var10.add(var9);
      var10.add(var9);
      TcpSackPermittedOption var13 = TcpSackPermittedOption.getInstance();
      var10.add(var13);
      var8.options(var10);
      var8.psh(false);
      var8.reserved((byte)0);
      var8.rst(false);
      var8.sequenceNumber(var6);
      var8.srcAddr(var2);
      var8.srcPort(new TcpPort(var3, ""));
      var8.syn(true);
      var8.urg(false);
      var8.window(e);
      IpV4Packet.Builder var14 = new IpV4Packet.Builder();
      var14.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var14.correctLengthAtBuild$IpV4Packet_Builder(true);
      var14.paddingAtBuild(true);
      var14.dstAddr(var4);
      var14.dontFragmentFlag(true);
      var14.fragmentOffset((short)0);
      var14.identification(var7);
      var14.ihl((byte)5);
      var14.protocol(IpNumber.TCP);
      var14.srcAddr(var2);
      var14.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var14.ttl(R);
      var14.version(IpVersion.IPV4);
      var14.payloadBuilder$IpV4Packet_Builder(var8);
      return u(var0, var1, var14);
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22060;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4988440534531918095L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "\u001fd>Â)\u008eÃ\u001b1])s±yÜ\u0005É\u008dõÐª?i\u0015ª\u0012¬\u009cT6\u001b2\u009a© ¤Ì%.\u008dªd&øÃÖ\u007f\t$\teR6\u000b6´m\nã¨¯ÄñÅººü¼<\u008f|à";
      int var5 = "\u001fd>Â)\u008eÃ\u001b1])s±yÜ\u0005É\u008dõÐª?i\u0015ª\u0012¬\u009cT6\u001b2\u009a© ¤Ì%.\u008dªd&øÃÖ\u007f\t$\teR6\u000b6´m\nã¨¯ÄñÅººü¼<\u008f|à"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var14 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var14;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[11];
                     R = (byte)a(1032, 2917806376082887213L);
                     s = (short)a(434, 5793923162418272157L);
                     N = (byte)a(30258, 6758803618474762268L);
                     e = -1;
                     A = false;
                     byte[] var9 = new byte[a(10649, 8129016643178495923L)];
                     var9[0] = (byte)a(18710, 1966758087010361136L);
                     var9[2] = (byte)a(28325, 8194617786931853454L);
                     var9[3] = (byte)a(12782, 9044307431664543686L);
                     var9[5] = (byte)a(12782, 9044307431664543686L);
                     var9[a(25548, 7853854860261733864L)] = (byte)a(17158, 8125069690584601899L);
                     v = var9;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var14;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "}\nAºâ%\u001bb;¾Åë4\u008eV.";
                  var5 = "}\nAºâ%\u001bb;¾Åë4\u008eV.".length();
                  var2 = 0;
            }

            byte var11 = var2;
            var2 += 8;
            var7 = var4.substring(var11, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





