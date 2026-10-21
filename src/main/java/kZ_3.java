import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.Packet;

class kZ_3 implements PacketListener {
   final Li_2 p;
   private final PcapNetworkInterface e;
   private static final long a;

   kZ_3(Li_2 var1, PcapNetworkInterface var2) {
      this.p = var1;
      this.e = var2;
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
      // 000: invokestatic Li_2.I ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnonnull 01e
      // 009: instanceof org/pcap4j/packet/EthernetPacket
      // 00c: ifeq 24f
      // 00f: goto 016
      // 012: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 1
      // 017: goto 01e
      // 01a: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: checkcast org/pcap4j/packet/EthernetPacket
      // 021: astore 3
      // 022: aload 3
      // 023: invokevirtual org/pcap4j/packet/EthernetPacket.getHeader ()Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;
      // 026: astore 4
      // 028: aload 4
      // 02a: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getType ()Lorg/pcap4j/packet/namednumber/EtherType;
      // 02d: invokevirtual org/pcap4j/packet/namednumber/EtherType.value ()Ljava/lang/Number;
      // 030: checkcast java/lang/Short
      // 033: invokevirtual java/lang/Short.shortValue ()S
      // 036: aload 2
      // 037: ifnonnull 05e
      // 03a: getstatic kZ_3.a J
      // 03d: l2i
      // 03e: if_icmpne 061
      // 041: goto 048
      // 044: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: getfield kZ_3.p LLi_2;
      // 04c: bipush 1
      // 04d: putfield Li_2.k Z
      // 050: aload 0
      // 051: getfield kZ_3.p LLi_2;
      // 054: getfield Li_2.k Z
      // 057: goto 05e
      // 05a: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: putstatic W1.A Z
      // 061: aconst_null
      // 062: astore 5
      // 064: aconst_null
      // 065: astore 6
      // 067: aload 0
      // 068: getfield kZ_3.p LLi_2;
      // 06b: getfield Li_2.k Z
      // 06e: aload 2
      // 06f: ifnonnull 09b
      // 072: ifeq 089
      // 075: goto 07c
      // 078: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield kZ_3.p LLi_2;
      // 080: aload 3
      // 081: invokevirtual Li_2.v (Lorg/pcap4j/packet/EthernetPacket;)Lorg/pcap4j/packet/IpV4Packet;
      // 084: astore 5
      // 086: goto 0ae
      // 089: aload 3
      // 08a: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 08d: aload 2
      // 08e: ifnonnull 0a9
      // 091: instanceof org/pcap4j/packet/IpV4Packet
      // 094: goto 09b
      // 097: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: ifeq 0ae
      // 09e: aload 3
      // 09f: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 0a2: goto 0a9
      // 0a5: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: checkcast org/pcap4j/packet/IpV4Packet
      // 0ac: astore 5
      // 0ae: aload 5
      // 0b0: aload 2
      // 0b1: ifnonnull 0c0
      // 0b4: ifnull 24f
      // 0b7: goto 0be
      // 0ba: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 5
      // 0c0: invokevirtual org/pcap4j/packet/IpV4Packet.getHeader ()Lorg/pcap4j/packet/IpV4Packet$IpV4Header;
      // 0c3: astore 6
      // 0c5: aload 6
      // 0c7: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 0ca: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 0cd: aload 0
      // 0ce: getfield kZ_3.p LLi_2;
      // 0d1: getfield Li_2.l Ljava/lang/String;
      // 0d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d7: aload 2
      // 0d8: ifnonnull 15a
      // 0db: ifeq 148
      // 0de: goto 0e5
      // 0e1: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield kZ_3.p LLi_2;
      // 0e9: aload 4
      // 0eb: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getDstAddr ()Lorg/pcap4j/util/MacAddress;
      // 0ee: putfield Li_2.F Lorg/pcap4j/util/MacAddress;
      // 0f1: aload 0
      // 0f2: getfield kZ_3.p LLi_2;
      // 0f5: aload 4
      // 0f7: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 0fa: putfield Li_2.c Lorg/pcap4j/util/MacAddress;
      // 0fd: aload 0
      // 0fe: getfield kZ_3.p LLi_2;
      // 101: aload 6
      // 103: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 106: putfield Li_2.W Ljava/net/Inet4Address;
      // 109: aload 0
      // 10a: getfield kZ_3.p LLi_2;
      // 10d: aload 0
      // 10e: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 111: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 114: putfield Li_2.U Ljava/lang/String;
      // 117: aload 0
      // 118: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 11b: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 11e: aload 2
      // 11f: ifnonnull 150
      // 122: goto 129
      // 125: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: ifnull 148
      // 12c: goto 133
      // 12f: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 0
      // 134: getfield kZ_3.p LLi_2;
      // 137: aload 0
      // 138: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 13b: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 13e: putfield Li_2.g Ljava/lang/String;
      // 141: goto 148
      // 144: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 6
      // 14a: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 14d: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 150: aload 0
      // 151: getfield kZ_3.p LLi_2;
      // 154: getfield Li_2.l Ljava/lang/String;
      // 157: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15a: aload 2
      // 15b: ifnonnull 1e8
      // 15e: ifeq 1cb
      // 161: goto 168
      // 164: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 0
      // 169: getfield kZ_3.p LLi_2;
      // 16c: aload 4
      // 16e: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 171: putfield Li_2.F Lorg/pcap4j/util/MacAddress;
      // 174: aload 0
      // 175: getfield kZ_3.p LLi_2;
      // 178: aload 4
      // 17a: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getDstAddr ()Lorg/pcap4j/util/MacAddress;
      // 17d: putfield Li_2.c Lorg/pcap4j/util/MacAddress;
      // 180: aload 0
      // 181: getfield kZ_3.p LLi_2;
      // 184: aload 6
      // 186: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 189: putfield Li_2.W Ljava/net/Inet4Address;
      // 18c: aload 0
      // 18d: getfield kZ_3.p LLi_2;
      // 190: aload 0
      // 191: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 194: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 197: putfield Li_2.U Ljava/lang/String;
      // 19a: aload 0
      // 19b: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 19e: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 1a1: aload 2
      // 1a2: ifnonnull 1d3
      // 1a5: goto 1ac
      // 1a8: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab: athrow
      // 1ac: ifnull 1cb
      // 1af: goto 1b6
      // 1b2: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: aload 0
      // 1b7: getfield kZ_3.p LLi_2;
      // 1ba: aload 0
      // 1bb: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 1be: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 1c1: putfield Li_2.g Ljava/lang/String;
      // 1c4: goto 1cb
      // 1c7: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: aload 6
      // 1cd: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 1d0: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 1d3: aload 2
      // 1d4: ifnonnull 236
      // 1d7: aload 0
      // 1d8: getfield kZ_3.p LLi_2;
      // 1db: getfield Li_2.Y Ljava/lang/String;
      // 1de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e1: goto 1e8
      // 1e4: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: ifeq 24f
      // 1eb: aload 0
      // 1ec: getfield kZ_3.p LLi_2;
      // 1ef: aload 4
      // 1f1: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 1f4: putfield Li_2.F Lorg/pcap4j/util/MacAddress;
      // 1f7: aload 0
      // 1f8: getfield kZ_3.p LLi_2;
      // 1fb: aload 4
      // 1fd: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getDstAddr ()Lorg/pcap4j/util/MacAddress;
      // 200: putfield Li_2.c Lorg/pcap4j/util/MacAddress;
      // 203: aload 0
      // 204: getfield kZ_3.p LLi_2;
      // 207: aload 6
      // 209: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 20c: putfield Li_2.W Ljava/net/Inet4Address;
      // 20f: aload 0
      // 210: getfield kZ_3.p LLi_2;
      // 213: aload 0
      // 214: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 217: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 21a: putfield Li_2.U Ljava/lang/String;
      // 21d: aload 0
      // 21e: aload 2
      // 21f: ifnonnull 23a
      // 222: goto 229
      // 225: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 228: athrow
      // 229: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 22c: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 22f: goto 236
      // 232: invokestatic kZ_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: ifnull 24f
      // 239: aload 0
      // 23a: getfield kZ_3.p LLi_2;
      // 23d: aload 0
      // 23e: getfield kZ_3.e Lorg/pcap4j/core/PcapNetworkInterface;
      // 241: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 244: putfield Li_2.g Ljava/lang/String;
      // 247: goto 24f
      // 24a: astore 3
      // 24b: aload 3
      // 24c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 24f: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 6654318502173289387L;
      long var10002 = 5470697924774503375L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





