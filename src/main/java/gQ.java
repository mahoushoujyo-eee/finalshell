import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.util.ArrayList;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.IpV4Rfc791Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IcmpV4Code;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.MacAddress;

public class gQ {
   static byte y;
   static short w;
   static byte r;
   static short v;
   public static boolean c;
   public static byte[] V;
   private static final long[] a;
   private static final Integer[] b;

   static {
      long var0 = 4170119649347847823L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "@eþ»X\u001f·þ@æ9MJÐî\u0001\\\u001e¾\u0002ú\u0019Ä*\u0016ÿ\u0082¬5ÛÊådé\u0013\u009cNÁo$¹#<ÝX#,8\u0001\u001c:1t\"Óî\u0084Ï\";ÇðuFvb\nà\u007fÓÜd!·æÃà\u0017\u0088\u0094";
      int var5 = "@eþ»X\u001f·þ@æ9MJÐî\u0001\\\u001e¾\u0002ú\u0019Ä*\u0016ÿ\u0082¬5ÛÊådé\u0013\u009cNÁo$¹#<ÝX#,8\u0001\u001c:1t\"Óî\u0084Ï\";ÇðuFvb\nà\u007fÓÜd!·æÃà\u0017\u0088\u0094"
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
                     b = new Integer[12];
                     y = (byte)a(12879, 6948827077934976897L);
                     w = (short)a(13324, 5002668535703046602L);
                     r = (byte)a(16228, 4524753934339310243L);
                     v = -1;
                     c = false;
                     byte[] var9 = new byte[a(10410, 7944810590095250793L)];
                     var9[0] = (byte)a(29638, 4767486644055363082L);
                     var9[2] = (byte)a(10082, 1386174394242603695L);
                     var9[3] = (byte)a(5390, 9082958188656044234L);
                     var9[5] = (byte)a(5390, 9082958188656044234L);
                     var9[a(19379, 7876906249386686076L)] = (byte)a(3626, 42066682808710120L);
                     V = var9;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var14;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ov\u009d=\u0019þ0ô\"\u008bHW#¯IN";
                  var5 = "Ov\u009d=\u0019þ0ô\"\u008bHW#¯IN".length();
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

   public static Packet Z(MacAddress var0, MacAddress var1, IpV4Packet.Builder var2) {
      Object var3 = null;
      Object var4 = null;
      Object var5 = null;
      if (c) {
         var4 = EtherType.PPPOE_SESSION_STAGE;
         UnknownPacket.Builder var6 = new UnknownPacket.Builder();
         byte[] var7 = var2.build().getRawData();
         byte[] var8 = new byte[2];
         Object[] var10002 = com.c.a((short)(var7.length + 2), var8, 0);
         Method var15 = com.c.d(196389687671494385L);
         Object[] var17 = var10002;
         Object var16 = null;

         try {
            var15.invoke(var16, var17);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         byte[] var9 = new byte[a(5218, 8272875314577680803L)];
         System.arraycopy(V, 0, var9, 0, var9.length);
         System.arraycopy(var8, 0, var9, 4, 2);
         byte[] var10 = new byte[var9.length + var7.length];
         System.arraycopy(var9, 0, var10, 0, var9.length);
         System.arraycopy(var7, 0, var10, a(10410, 7944810590095250793L), var7.length);
         var6.rawData(var10);
         var3 = var6;
      } else {
         var4 = EtherType.IPV4;
         var3 = var2;
      }

      EthernetPacket.Builder var14 = new EthernetPacket.Builder();
      var14.dstAddr(var1).srcAddr(var0).type((EtherType)var4).payloadBuilder((Packet.Builder)var3).paddingAtBuild(true);
      return var14.build();
   }

   public static Packet A(MacAddress var0, MacAddress var1, Inet4Address var2, Inet4Address var3, int var4, int var5) {
      IcmpV4EchoPacket.Builder var6 = new IcmpV4EchoPacket.Builder();
      var6.identifier((short)3).sequenceNumber((short)var4);
      IcmpV4CommonPacket.Builder var7 = new IcmpV4CommonPacket.Builder();
      var7.type(IcmpV4Type.ECHO).code(IcmpV4Code.NO_CODE).payloadBuilder(var6).correctChecksumAtBuild(true);
      IpV4Packet.Builder var8 = new IpV4Packet.Builder();
      var8.version(IpVersion.IPV4)
         .tos(IpV4Rfc791Tos.newInstance((byte)0))
         .ttl((byte)var5)
         .protocol(IpNumber.ICMPV4)
         .srcAddr(var2)
         .dstAddr(var3)
         .payloadBuilder(var7)
         .correctChecksumAtBuild(true)
         .correctLengthAtBuild(true);
      return Z(var0, var1, var8);
   }

   public static Packet S(MacAddress var0, MacAddress var1, Inet4Address var2, Inet4Address var3, int var4) {
      IcmpV4EchoPacket.Builder var5 = new IcmpV4EchoPacket.Builder();
      var5.identifier((short)3).sequenceNumber((short)var4);
      IcmpV4CommonPacket.Builder var6 = new IcmpV4CommonPacket.Builder();
      var6.type(IcmpV4Type.ECHO).code(IcmpV4Code.NO_CODE).payloadBuilder(var5).correctChecksumAtBuild(true);
      IpV4Packet.Builder var7 = new IpV4Packet.Builder();
      var7.version(IpVersion.IPV4)
         .tos(IpV4Rfc791Tos.newInstance((byte)0))
         .ttl((byte)a(22327, 1989301605759085303L))
         .protocol(IpNumber.ICMPV4)
         .srcAddr(var2)
         .dstAddr(var3)
         .payloadBuilder(var6)
         .correctChecksumAtBuild(true)
         .correctLengthAtBuild(true);
      return Z(var0, var1, var7);
   }

   public static Packet q(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, byte[] var6, short var7) {
      Object var8 = null;
      UdpPacket.Builder var9 = new UdpPacket.Builder();
      var9.payloadBuilder(new UnknownPacket.Builder().rawData(var6));
      var9.correctChecksumAtBuild(true);
      var9.correctLengthAtBuild(true);
      var9.dstAddr(var4);
      var9.dstPort(new UdpPort(var5, ""));
      var9.srcAddr(var2);
      var9.srcPort(new UdpPort(var3, ""));
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild(true);
      var10.correctLengthAtBuild(true);
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
      var10.ttl(y);
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder(var9);
      return Z(var0, var1, var10);
   }

   static Packet i(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, byte[] var8, short var9) {
      Object var10 = null;
      TcpPacket.Builder var11 = new TcpPacket.Builder();
      var11.payloadBuilder(new UnknownPacket.Builder().rawData(var8));
      var11.correctChecksumAtBuild(true);
      var11.correctLengthAtBuild(true);
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
      var11.window(v);
      IpV4Packet.Builder var12 = new IpV4Packet.Builder();
      var12.correctChecksumAtBuild(true);
      var12.correctLengthAtBuild(true);
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
      var12.ttl(y);
      var12.version(IpVersion.IPV4);
      var12.payloadBuilder(var11);
      return Z(var0, var1, var12);
   }

   static Packet B(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, short var8) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild(true);
      var9.correctLengthAtBuild(true);
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
      var9.window(v);
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild(true);
      var10.correctLengthAtBuild(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var4);
      var10.dontFragmentFlag(true);
      var10.fragmentOffset((short)0);
      var10.identification(var8);
      var10.ihl((byte)5);
      var10.protocol(IpNumber.TCP);
      var10.srcAddr(var2);
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.ttl(y);
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder(var9);
      return Z(var0, var1, var10);
   }

   static Packet I(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, int var7, short var8) {
      TcpPacket.Builder var10 = new TcpPacket.Builder();
      var10.correctChecksumAtBuild(true);
      var10.correctLengthAtBuild(true);
      var10.paddingAtBuild(true);
      var10.ack(true);
      var10.acknowledgmentNumber(var6);
      var10.dstAddr(var4);
      var10.dstPort(new TcpPort(var5, ""));
      ArrayList var11 = new ArrayList();
      TcpNoOperationOption var12 = TcpNoOperationOption.getInstance();
      TcpMaximumSegmentSizeOption var13 = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(w).correctLengthAtBuild(true).build();
      var11.add(var13);
      var11.add(var12);
      var11.add(var12);
      TcpSackPermittedOption var14 = TcpSackPermittedOption.getInstance();
      var11.add(var14);
      var11.add(var12);
      TcpWindowScaleOption var15 = new TcpWindowScaleOption.Builder().shiftCount(r).correctLengthAtBuild(true).build();
      var11.add(var15);
      var10.options(var11);
      var10.psh(false);
      var10.reserved((byte)0);
      var10.rst(false);
      var10.sequenceNumber(var7);
      var10.srcAddr(var2);
      var10.srcPort(new TcpPort(var3, ""));
      var10.syn(true);
      var10.urg(false);
      var10.window(v);
      IpV4Packet.Builder var16 = new IpV4Packet.Builder();
      var16.correctChecksumAtBuild(true);
      String[] var10000 = xQ.B();
      var16.correctLengthAtBuild(true);
      var16.paddingAtBuild(true);
      var16.dstAddr(var4);
      var16.dontFragmentFlag(true);
      var16.fragmentOffset((short)0);
      var16.identification(var8);
      String[] var9 = var10000;
      var16.ihl((byte)5);
      var16.protocol(IpNumber.TCP);
      var16.srcAddr(var2);
      var16.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var16.ttl(y);
      var16.version(IpVersion.IPV4);
      var16.payloadBuilder(var10);
      Packet var17 = Z(var0, var1, var16);
      if (var9 == null) {
         com.ky_4.K(new String[2]);
      }

      return var17;
   }

   static Packet G(MacAddress var0, MacAddress var1, Inet4Address var2, short var3, Inet4Address var4, short var5, int var6, short var7) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild(true);
      var9.correctLengthAtBuild(true);
      var9.paddingAtBuild(true);
      var9.dstAddr(var4);
      var9.dstPort(new TcpPort(var5, ""));
      TcpNoOperationOption var10 = TcpNoOperationOption.getInstance();
      xQ.B();
      ArrayList var11 = new ArrayList();
      TcpMaximumSegmentSizeOption var12 = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(w).correctLengthAtBuild(true).build();
      var11.add(var12);
      var11.add(var10);
      TcpWindowScaleOption var13 = new TcpWindowScaleOption.Builder().shiftCount((byte)a(19634, 7411835535085203831L)).correctLengthAtBuild(true).build();
      var11.add(var13);
      var11.add(var10);
      var11.add(var10);
      TcpSackPermittedOption var14 = TcpSackPermittedOption.getInstance();
      var11.add(var14);
      var9.options(var11);
      var9.psh(false);
      var9.reserved((byte)0);
      var9.rst(false);
      var9.sequenceNumber(var6);
      var9.srcAddr(var2);
      var9.srcPort(new TcpPort(var3, ""));
      var9.syn(true);
      var9.urg(false);
      var9.window(v);
      IpV4Packet.Builder var15 = new IpV4Packet.Builder();
      var15.correctChecksumAtBuild(true);
      var15.correctLengthAtBuild(true);
      var15.paddingAtBuild(true);
      var15.dstAddr(var4);
      var15.dontFragmentFlag(true);
      var15.fragmentOffset((short)0);
      var15.identification(var7);
      var15.ihl((byte)5);
      var15.protocol(IpNumber.TCP);
      var15.srcAddr(var2);
      var15.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var15.ttl(y);
      var15.version(IpVersion.IPV4);
      var15.payloadBuilder(var9);
      Packet var16 = Z(var0, var1, var15);
      if (com.ky_4.F() != null) {
         xQ.I(new String[4]);
      }

      return var16;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15813;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





