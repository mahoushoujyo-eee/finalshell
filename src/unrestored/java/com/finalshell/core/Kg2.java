package com.finalshell.core;

import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.Packet;

public class Kg2 implements PacketListener {
   public final XQ_2 s;
   public final PcapNetworkInterface m;
   public final PcapHandle X;
   public static long a;

   public Kg2(XQ_2 var1, PcapNetworkInterface var2, PcapHandle var3) {
      this.s = var1;
      this.m = var2;
      this.X = var3;
   }

   @Override
   public void gotPacket(Packet param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnull 01e
      // 009: instanceof org/pcap4j/packet/EthernetPacket
      // 00c: ifeq 1c9
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 1
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: checkcast org/pcap4j/packet/EthernetPacket
      // 021: astore 3
      // 022: aload 3
      // 023: invokevirtual org/pcap4j/packet/EthernetPacket.getHeader$EthernetPacket_EthernetHeader ()Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;
      // 026: astore 4
      // 028: aload 4
      // 02a: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getType ()Lorg/pcap4j/packet/namednumber/EtherType;
      // 02d: invokevirtual org/pcap4j/packet/namednumber/EtherType.value ()Ljava/lang/Number;
      // 030: checkcast java/lang/Short
      // 033: invokevirtual java/lang/Short.shortValue ()S
      // 036: aload 2
      // 037: ifnull 05e
      // 03a: getstatic com/finalshell/core/Kg2.a J
      // 03d: l2i
      // 03e: if_icmpne 061
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 04c: bipush 1
      // 04d: putfield com/finalshell/core/XQ_2.e Z
      // 050: aload 0
      // 051: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 054: getfield com/finalshell/core/XQ_2.e Z
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: putstatic com/finalshell/core/GQ.c Z
      // 061: aconst_null
      // 062: astore 5
      // 064: aconst_null
      // 065: astore 6
      // 067: aload 0
      // 068: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 06b: getfield com/finalshell/core/XQ_2.e Z
      // 06e: aload 2
      // 06f: ifnull 09b
      // 072: ifeq 089
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 080: aload 3
      // 081: invokevirtual com/finalshell/core/XQ_2.n (Lorg/pcap4j/packet/EthernetPacket;)Lorg/pcap4j/packet/IpV4Packet;
      // 084: astore 5
      // 086: goto 0ae
      // 089: aload 3
      // 08a: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 08d: aload 2
      // 08e: ifnull 0a9
      // 091: instanceof org/pcap4j/packet/IpV4Packet
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: ifeq 0ae
      // 09e: aload 3
      // 09f: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: checkcast org/pcap4j/packet/IpV4Packet
      // 0ac: astore 5
      // 0ae: aload 5
      // 0b0: aload 2
      // 0b1: ifnull 0c0
      // 0b4: ifnull 1c9
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 5
      // 0c0: invokevirtual org/pcap4j/packet/IpV4Packet.getHeader$IpV4Packet_IpV4Header ()Lorg/pcap4j/packet/IpV4Packet$IpV4Header;
      // 0c3: astore 6
      // 0c5: aload 6
      // 0c7: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 0ca: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 0cd: aload 0
      // 0ce: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 0d1: getfield com/finalshell/core/XQ_2.A Ljava/lang/String;
      // 0d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d7: aload 2
      // 0d8: ifnull 1a2
      // 0db: ifeq 18f
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 0e9: aload 4
      // 0eb: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 0ee: putfield com/finalshell/core/XQ_2.i Lorg/pcap4j/util/MacAddress;
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 0f5: aload 4
      // 0f7: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getDstAddr ()Lorg/pcap4j/util/MacAddress;
      // 0fa: putfield com/finalshell/core/XQ_2.T Lorg/pcap4j/util/MacAddress;
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 101: aload 6
      // 103: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 106: putfield com/finalshell/core/XQ_2.j Ljava/net/Inet4Address;
      // 109: aload 0
      // 10a: getfield com/finalshell/core/Kg2.m Lorg/pcap4j/core/PcapNetworkInterface;
      // 10d: aload 2
      // 10e: ifnull 14c
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 11b: ifnull 13a
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: aload 0
      // 126: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 129: aload 0
      // 12a: getfield com/finalshell/core/Kg2.m Lorg/pcap4j/core/PcapNetworkInterface;
      // 12d: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 130: putfield com/finalshell/core/XQ_2.v Ljava/lang/String;
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: aload 0
      // 13b: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 13e: aload 2
      // 13f: ifnull 185
      // 142: getfield com/finalshell/core/XQ_2.c Lorg/pcap4j/core/PcapNetworkInterface;
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: ifnull 16b
      // 14f: aload 0
      // 150: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 153: getfield com/finalshell/core/XQ_2.c Lorg/pcap4j/core/PcapNetworkInterface;
      // 156: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 159: aload 0
      // 15a: getfield com/finalshell/core/Kg2.m Lorg/pcap4j/core/PcapNetworkInterface;
      // 15d: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 160: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 163: pop
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 16f: aload 0
      // 170: getfield com/finalshell/core/Kg2.m Lorg/pcap4j/core/PcapNetworkInterface;
      // 173: putfield com/finalshell/core/XQ_2.B Lorg/pcap4j/core/PcapNetworkInterface;
      // 176: aload 0
      // 177: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 17a: aload 0
      // 17b: getfield com/finalshell/core/Kg2.X Lorg/pcap4j/core/PcapHandle;
      // 17e: putfield com/finalshell/core/XQ_2.z Lorg/pcap4j/core/PcapHandle;
      // 181: aload 0
      // 182: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 185: aload 0
      // 186: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 189: getfield com/finalshell/core/XQ_2.B Lorg/pcap4j/core/PcapNetworkInterface;
      // 18c: putfield com/finalshell/core/XQ_2.c Lorg/pcap4j/core/PcapNetworkInterface;
      // 18f: aload 5
      // 191: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 194: aload 2
      // 195: ifnull 1b1
      // 198: instanceof org/pcap4j/packet/IcmpV4CommonPacket
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: ifeq 1c9
      // 1a5: aload 5
      // 1a7: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/Kg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: checkcast org/pcap4j/packet/IcmpV4CommonPacket
      // 1b4: astore 7
      // 1b6: aload 0
      // 1b7: getfield com/finalshell/core/Kg2.s Lcom/finalshell/core/XQ_2;
      // 1ba: aload 7
      // 1bc: aload 6
      // 1be: invokevirtual com/finalshell/core/XQ_2.C (Lorg/pcap4j/packet/IcmpV4CommonPacket;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;)V
      // 1c1: goto 1c9
      // 1c4: astore 3
      // 1c5: aload 3
      // 1c6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1c9: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6843179982232383708L;
      long var10002 = -3639904535772006216L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





