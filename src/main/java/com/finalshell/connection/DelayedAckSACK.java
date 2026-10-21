package com.finalshell.connection;

import com.finalshell.config.DnsResolveFailedSetting;
import com.finalshell.core.Fl2;
import com.finalshell.ui.panel.Ky4;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.MacAddress;

public class DelayedAckSACK {
   InetAddress b;
   int o;
   HashMap t = new HashMap();
   HashMap X = new HashMap();
   int G = a(30717, 7622254120363138489L);
   Random A = new Random();
   PcapHandle y;
   HashSet Y = new HashSet();
   HashMap v = new HashMap();
   MacAddress O;
   int D = -1;
   boolean w = false;
   int L;
   int F;
   int Q;
   Packet g;
   short j = (short)a(10692, 9107184885653521295L);
   Fl2 x;
   Fl2 m;
   int q;
   ArrayList U = new ArrayList();
   HashMap C = new HashMap();
   HashMap p = new HashMap();
   HashMap d = new HashMap();
   HashMap k = new HashMap();
   ArrayList S = new ArrayList();
   Object I = new Object();
   int e = a(32125, 1756407798871136060L);
   int V = 0;
   long n = 0L;
   long T = b(10845, 7076075993947414457L);
   Object a = new Object();
   Thread M;
   public static String[] c;
   public static String[] f;
   public static long[] h;
   public static Integer[] i;
   public static long[] l;
   public static Long[] r;

   DelayedAckSACK(PcapHandle var1) {
      this.y = var1;
   }

   public void l(Packet param1, EthernetPacket.EthernetHeader param2, IpV4Packet.IpV4Header param3, TcpPacket param4, boolean param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: aload 4
      // 005: invokevirtual org/pcap4j/packet/TcpPacket.getHeader$TcpPacket_TcpHeader ()Lorg/pcap4j/packet/TcpPacket$TcpHeader;
      // 008: astore 7
      // 00a: aconst_null
      // 00b: astore 8
      // 00d: astore 6
      // 00f: aload 4
      // 011: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 014: aload 6
      // 016: ifnonnull 02f
      // 019: ifnull 036
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 4
      // 025: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 034: astore 8
      // 036: iload 5
      // 038: aload 6
      // 03a: ifnonnull 535
      // 03d: ifeq 529
      // 040: goto 047
      // 043: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: aload 2
      // 049: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 04c: putfield com/finalshell/connection/DelayedAckSACK.O Lorg/pcap4j/util/MacAddress;
      // 04f: aload 7
      // 051: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 054: aload 6
      // 056: ifnonnull 15d
      // 059: goto 060
      // 05c: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: ifeq 158
      // 063: goto 06a
      // 066: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 7
      // 06c: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 06f: aload 6
      // 071: ifnonnull 15d
      // 074: goto 07b
      // 077: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: ifne 158
      // 07e: goto 085
      // 081: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 0
      // 086: aload 7
      // 088: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 08b: putfield com/finalshell/connection/DelayedAckSACK.F I
      // 08e: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 091: new java/lang/StringBuilder
      // 094: dup
      // 095: sipush 5108
      // 098: sipush -6751
      // 09b: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 09e: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0a1: aload 7
      // 0a3: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 0a6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a9: sipush 5113
      // 0ac: sipush 29245
      // 0af: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: aload 7
      // 0b7: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0ba: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 0bd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c0: sipush 5106
      // 0c3: sipush 1833
      // 0c6: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: aload 7
      // 0ce: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0d1: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 0d4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0da: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0dd: aload 0
      // 0de: aload 2
      // 0df: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getDstAddr ()Lorg/pcap4j/util/MacAddress;
      // 0e2: sipush 5114
      // 0e5: sipush 31041
      // 0e8: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0eb: invokestatic org/pcap4j/util/MacAddress.getByName (Ljava/lang/String;)Lorg/pcap4j/util/MacAddress;
      // 0ee: aload 3
      // 0ef: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 0f2: aload 7
      // 0f4: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0f7: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 0fa: checkcast java/lang/Short
      // 0fd: invokevirtual java/lang/Short.shortValue ()S
      // 100: aload 3
      // 101: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 104: aload 7
      // 106: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 109: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 10c: checkcast java/lang/Short
      // 10f: invokevirtual java/lang/Short.shortValue ()S
      // 112: aload 7
      // 114: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 117: bipush 1
      // 118: iadd
      // 119: sipush 32720
      // 11c: ldc2_w 4488024640078091679
      // 11f: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 122: invokevirtual com/finalshell/connection/DelayedAckSACK.K (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;SLjava/net/Inet4Address;SII)Lorg/pcap4j/packet/Packet;
      // 125: astore 9
      // 127: aload 0
      // 128: getfield com/finalshell/connection/DelayedAckSACK.y Lorg/pcap4j/core/PcapHandle;
      // 12b: aload 9
      // 12d: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 130: goto 13a
      // 133: astore 10
      // 135: aload 10
      // 137: invokevirtual java/lang/Exception.printStackTrace ()V
      // 13a: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 13d: new java/lang/StringBuilder
      // 140: dup
      // 141: sipush 5117
      // 144: sipush -11692
      // 147: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 14a: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 14d: aload 9
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 158: aload 7
      // 15a: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 15d: aload 6
      // 15f: ifnonnull 178
      // 162: ifne 240
      // 165: goto 16c
      // 168: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 7
      // 16e: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 171: goto 178
      // 174: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: ifeq 240
      // 17b: aload 4
      // 17d: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 180: aload 6
      // 182: ifnonnull 22f
      // 185: goto 18c
      // 188: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: ifnonnull 220
      // 18f: goto 196
      // 192: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: aload 7
      // 198: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 19b: aload 6
      // 19d: ifnonnull 23e
      // 1a0: goto 1a7
      // 1a3: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: getfield com/finalshell/connection/DelayedAckSACK.L I
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: if_icmpne 220
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/connection/DelayedAckSACK.L I
      // 1bc: bipush 1
      // 1bd: iadd
      // 1be: putfield com/finalshell/connection/DelayedAckSACK.Q I
      // 1c1: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1c4: new java/lang/StringBuilder
      // 1c7: dup
      // 1c8: sipush 5099
      // 1cb: sipush -26681
      // 1ce: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 1d1: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1d4: aload 7
      // 1d6: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 1d9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1dc: ldc_w " "
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: aload 7
      // 1e4: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDataOffsetAsInt ()I
      // 1e7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ea: ldc_w " "
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: aload 7
      // 1f2: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getWindowAsInt ()I
      // 1f5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fb: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1fe: new com/finalshell/task/Th2
      // 201: dup
      // 202: aload 0
      // 203: invokespecial com/finalshell/task/Th2.<init> (Lcom/finalshell/connection/DelayedAckSACK;)V
      // 206: astore 9
      // 208: aload 9
      // 20a: invokevirtual java/lang/Thread.start ()V
      // 20d: aload 0
      // 20e: new com/finalshell/task/YO
      // 211: dup
      // 212: aload 0
      // 213: invokespecial com/finalshell/task/YO.<init> (Lcom/finalshell/connection/DelayedAckSACK;)V
      // 216: putfield com/finalshell/connection/DelayedAckSACK.M Ljava/lang/Thread;
      // 219: aload 0
      // 21a: getfield com/finalshell/connection/DelayedAckSACK.M Ljava/lang/Thread;
      // 21d: invokevirtual java/lang/Thread.start ()V
      // 220: aload 0
      // 221: getfield com/finalshell/connection/DelayedAckSACK.t Ljava/util/HashMap;
      // 224: aload 7
      // 226: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 229: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 22c: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 22f: pop
      // 230: aload 0
      // 231: getfield com/finalshell/connection/DelayedAckSACK.Y Ljava/util/HashSet;
      // 234: aload 3
      // 235: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 238: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 23b: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 23e: istore 9
      // 240: aload 4
      // 242: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 245: ifnull 26b
      // 248: aload 7
      // 24a: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 24d: aload 4
      // 24f: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 252: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 257: arraylength
      // 258: iadd
      // 259: istore 9
      // 25b: aload 0
      // 25c: aload 0
      // 25d: getfield com/finalshell/connection/DelayedAckSACK.g Lorg/pcap4j/packet/Packet;
      // 260: aload 0
      // 261: getfield com/finalshell/connection/DelayedAckSACK.Q I
      // 264: iload 9
      // 266: invokevirtual com/finalshell/connection/DelayedAckSACK.y (Lorg/pcap4j/packet/Packet;II)Lorg/pcap4j/packet/Packet;
      // 269: astore 10
      // 26b: aload 7
      // 26d: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 270: aload 6
      // 272: ifnonnull 298
      // 275: aload 0
      // 276: getfield com/finalshell/connection/DelayedAckSACK.G I
      // 279: if_icmple 293
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 282: athrow
      // 283: aload 0
      // 284: aload 7
      // 286: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 289: putfield com/finalshell/connection/DelayedAckSACK.G I
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: aload 7
      // 295: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 298: aload 6
      // 29a: ifnonnull 2bf
      // 29d: ifeq 5f8
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a6: athrow
      // 2a7: aload 7
      // 2a9: aload 6
      // 2ab: ifnonnull 2e3
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/connection/DelayedAckSACK.L I
      // 2c3: bipush 1
      // 2c4: iadd
      // 2c5: if_icmpeq 5f8
      // 2c8: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 2cb: ldc_w ""
      // 2ce: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2d1: aload 0
      // 2d2: aload 7
      // 2d4: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 2d7: invokevirtual com/finalshell/connection/DelayedAckSACK.A (I)V
      // 2da: aload 7
      // 2dc: goto 2e3
      // 2df: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e2: athrow
      // 2e3: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getOptions ()Ljava/util/List;
      // 2e6: astore 9
      // 2e8: aload 9
      // 2ea: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2ef: astore 11
      // 2f1: aload 6
      // 2f3: ifnull 515
      // 2f6: aload 11
      // 2f8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2fd: checkcast org/pcap4j/packet/TcpPacket$TcpOption
      // 300: astore 10
      // 302: aload 10
      // 304: invokeinterface org/pcap4j/packet/TcpPacket$TcpOption.getKind ()Lorg/pcap4j/packet/namednumber/TcpOptionKind; 1
      // 309: getstatic org/pcap4j/packet/namednumber/TcpOptionKind.SACK Lorg/pcap4j/packet/namednumber/TcpOptionKind;
      // 30c: invokevirtual org/pcap4j/packet/namednumber/TcpOptionKind.equals (Ljava/lang/Object;)Z
      // 30f: aload 6
      // 311: ifnonnull 51c
      // 314: ifeq 515
      // 317: aload 10
      // 319: invokeinterface org/pcap4j/packet/TcpPacket$TcpOption.getRawData ()[B 1
      // 31e: bipush 0
      // 31f: aload 10
      // 321: invokeinterface org/pcap4j/packet/TcpPacket$TcpOption.getRawData ()[B 1
      // 326: arraylength
      // 327: invokestatic com/finalshell/core/Fi2.Y ([BII)Lcom/finalshell/core/Fi2;
      // 32a: astore 12
      // 32c: aload 12
      // 32e: invokevirtual com/finalshell/core/Fi2.I ()Ljava/util/List;
      // 331: astore 13
      // 333: aload 0
      // 334: getfield com/finalshell/connection/DelayedAckSACK.I Ljava/lang/Object;
      // 337: dup
      // 338: astore 14
      // 33a: monitorenter
      // 33b: aload 13
      // 33d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 342: astore 16
      // 344: aload 6
      // 346: ifnull 4f5
      // 349: aload 16
      // 34b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 350: checkcast com/finalshell/ui/model/Jf2
      // 353: astore 15
      // 355: aload 0
      // 356: getfield com/finalshell/connection/DelayedAckSACK.k Ljava/util/HashMap;
      // 359: aload 15
      // 35b: invokevirtual com/finalshell/ui/model/Jf2.c ()I
      // 35e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 361: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 364: checkcast java/lang/Integer
      // 367: invokevirtual java/lang/Integer.intValue ()I
      // 36a: istore 17
      // 36c: aload 15
      // 36e: invokevirtual com/finalshell/ui/model/Jf2.R ()I
      // 371: istore 18
      // 373: bipush -1
      // 374: istore 19
      // 376: bipush 0
      // 377: istore 20
      // 379: bipush 0
      // 37a: istore 21
      // 37c: aload 6
      // 37e: ifnull 3a9
      // 381: iinc 18 -1
      // 384: iinc 20 1
      // 387: bipush 1
      // 388: istore 21
      // 38a: iload 20
      // 38c: sipush 9522
      // 38f: ldc2_w 7680800267087892331
      // 392: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 395: if_icmple 3a9
      // 398: aload 6
      // 39a: ifnonnull 406
      // 39d: aload 6
      // 39f: ifnull 3bf
      // 3a2: goto 3a9
      // 3a5: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a8: athrow
      // 3a9: aload 0
      // 3aa: getfield com/finalshell/connection/DelayedAckSACK.k Ljava/util/HashMap;
      // 3ad: iload 18
      // 3af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b2: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 3b5: ifeq 381
      // 3b8: goto 3bf
      // 3bb: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3be: athrow
      // 3bf: aload 0
      // 3c0: getfield com/finalshell/connection/DelayedAckSACK.k Ljava/util/HashMap;
      // 3c3: iload 18
      // 3c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c8: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 3cb: aload 6
      // 3cd: ifnonnull 407
      // 3d0: ifne 3f0
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 3dd: sipush 5115
      // 3e0: sipush -8321
      // 3e3: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 3e6: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: getfield com/finalshell/connection/DelayedAckSACK.k Ljava/util/HashMap;
      // 3f4: iload 18
      // 3f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f9: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3fc: checkcast java/lang/Integer
      // 3ff: invokevirtual java/lang/Integer.intValue ()I
      // 402: bipush 1
      // 403: isub
      // 404: istore 19
      // 406: bipush 0
      // 407: istore 22
      // 409: aload 6
      // 40b: ifnull 4a5
      // 40e: iload 17
      // 410: iload 22
      // 412: iadd
      // 413: goto 41a
      // 416: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 419: athrow
      // 41a: istore 23
      // 41c: aload 0
      // 41d: getfield com/finalshell/connection/DelayedAckSACK.d Ljava/util/HashMap;
      // 420: iload 23
      // 422: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 425: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 428: checkcast java/lang/Integer
      // 42b: invokevirtual java/lang/Integer.intValue ()I
      // 42e: istore 24
      // 430: aload 0
      // 431: getfield com/finalshell/connection/DelayedAckSACK.p Ljava/util/HashMap;
      // 434: iload 24
      // 436: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 439: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 43c: checkcast com/finalshell/core/Fl2
      // 43f: astore 25
      // 441: aload 6
      // 443: ifnonnull 45c
      // 446: aload 25
      // 448: ifnull 4a2
      // 44b: aload 0
      // 44c: getfield com/finalshell/connection/DelayedAckSACK.S Ljava/util/ArrayList;
      // 44f: aload 25
      // 451: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 454: pop
      // 455: goto 45c
      // 458: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45b: athrow
      // 45c: invokestatic java/lang/System.currentTimeMillis ()J
      // 45f: aload 25
      // 461: getfield com/finalshell/core/Fl2.q J
      // 464: lsub
      // 465: lstore 26
      // 467: aload 0
      // 468: lload 26
      // 46a: invokevirtual com/finalshell/connection/DelayedAckSACK.q (J)V
      // 46d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 470: new java/lang/StringBuilder
      // 473: dup
      // 474: sipush 5111
      // 477: sipush -31218
      // 47a: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 47d: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 480: iload 23
      // 482: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 485: ldc_w " "
      // 488: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48b: lload 26
      // 48d: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 490: sipush 5096
      // 493: sipush -22119
      // 496: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 499: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49f: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 4a2: iinc 22 1
      // 4a5: iload 22
      // 4a7: iload 19
      // 4a9: iload 17
      // 4ab: isub
      // 4ac: if_icmple 40e
      // 4af: iload 21
      // 4b1: aload 6
      // 4b3: ifnonnull 41a
      // 4b6: aload 6
      // 4b8: ifnonnull 4fc
      // 4bb: ifeq 4f5
      // 4be: goto 4c5
      // 4c1: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c4: athrow
      // 4c5: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 4c8: new java/lang/StringBuilder
      // 4cb: dup
      // 4cc: sipush 5116
      // 4cf: sipush 1808
      // 4d2: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 4d5: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 4d8: iload 20
      // 4da: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4dd: ldc_w " "
      // 4e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e3: iload 19
      // 4e5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4eb: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 4ee: goto 4f5
      // 4f1: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f4: athrow
      // 4f5: aload 16
      // 4f7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4fc: ifne 349
      // 4ff: aload 14
      // 501: monitorexit
      // 502: aload 6
      // 504: ifnonnull 4f5
      // 507: goto 515
      // 50a: aload 14
      // 50c: monitorexit
      // 50d: athrow
      // 50e: astore 12
      // 510: aload 12
      // 512: invokevirtual org/pcap4j/packet/IllegalRawDataException.printStackTrace ()V
      // 515: aload 11
      // 517: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51c: ifne 2f6
      // 51f: aload 6
      // 521: ifnonnull 515
      // 524: aload 6
      // 526: ifnull 5f8
      // 529: aload 7
      // 52b: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 52e: goto 535
      // 531: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 534: athrow
      // 535: aload 6
      // 537: ifnonnull 550
      // 53a: ifeq 5a5
      // 53d: goto 544
      // 540: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 543: athrow
      // 544: aload 7
      // 546: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 549: goto 550
      // 54c: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54f: athrow
      // 550: ifeq 5a5
      // 553: aload 0
      // 554: aload 1
      // 555: putfield com/finalshell/connection/DelayedAckSACK.g Lorg/pcap4j/packet/Packet;
      // 558: aload 0
      // 559: aload 3
      // 55a: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 55d: putfield com/finalshell/connection/DelayedAckSACK.j S
      // 560: aload 0
      // 561: aload 7
      // 563: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 566: putfield com/finalshell/connection/DelayedAckSACK.L I
      // 569: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 56c: new java/lang/StringBuilder
      // 56f: dup
      // 570: sipush 5100
      // 573: sipush 29675
      // 576: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 579: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 57c: aload 7
      // 57e: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 581: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 584: sipush 5105
      // 587: sipush -173
      // 58a: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 58d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 590: aload 7
      // 592: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 595: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 598: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59b: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 59e: goto 5a5
      // 5a1: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a4: athrow
      // 5a5: aload 4
      // 5a7: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 5aa: ifnull 5f8
      // 5ad: aload 7
      // 5af: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 5b2: aload 8
      // 5b4: arraylength
      // 5b5: iadd
      // 5b6: istore 9
      // 5b8: aload 0
      // 5b9: getfield com/finalshell/connection/DelayedAckSACK.X Ljava/util/HashMap;
      // 5bc: iload 9
      // 5be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5c1: aload 6
      // 5c3: ifnonnull 5f2
      // 5c6: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 5c9: ifne 5e9
      // 5cc: goto 5d3
      // 5cf: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d2: athrow
      // 5d3: aload 0
      // 5d4: getfield com/finalshell/connection/DelayedAckSACK.X Ljava/util/HashMap;
      // 5d7: iload 9
      // 5d9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5dc: aload 4
      // 5de: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 5e1: pop
      // 5e2: goto 5e9
      // 5e5: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e8: athrow
      // 5e9: aload 0
      // 5ea: getfield com/finalshell/connection/DelayedAckSACK.t Ljava/util/HashMap;
      // 5ed: iload 9
      // 5ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f2: aload 4
      // 5f4: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 5f7: pop
      // 5f8: return
   }

   void R() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/connection/DelayedAckSACK.I Ljava/lang/Object;
      // 007: dup
      // 008: astore 2
      // 009: monitorenter
      // 00a: astore 1
      // 00b: aload 0
      // 00c: getfield com/finalshell/connection/DelayedAckSACK.S Ljava/util/ArrayList;
      // 00f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 012: astore 4
      // 014: aload 1
      // 015: ifnull 121
      // 018: aload 4
      // 01a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01f: checkcast com/finalshell/core/Fl2
      // 022: astore 3
      // 023: invokestatic java/lang/System.currentTimeMillis ()J
      // 026: aload 3
      // 027: getfield com/finalshell/core/Fl2.q J
      // 02a: lsub
      // 02b: lstore 5
      // 02d: lload 5
      // 02f: l2f
      // 030: aload 0
      // 031: getfield com/finalshell/connection/DelayedAckSACK.T J
      // 034: l2f
      // 035: ldc_w 5.0
      // 038: fmul
      // 039: lconst_1
      // 03a: aload 3
      // 03b: getfield com/finalshell/core/Fl2.K J
      // 03e: ladd
      // 03f: l2f
      // 040: fmul
      // 041: fcmpl
      // 042: aload 1
      // 043: ifnonnull 128
      // 046: ifle 121
      // 049: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 04c: new java/lang/StringBuilder
      // 04f: dup
      // 050: sipush 5101
      // 053: sipush 12398
      // 056: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 059: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 05c: aload 3
      // 05d: getfield com/finalshell/core/Fl2.c I
      // 060: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 063: ldc_w " "
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: lload 5
      // 06b: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 06e: sipush 5112
      // 071: sipush -3201
      // 074: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: sipush 5097
      // 07d: sipush -563
      // 080: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 083: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 086: aload 3
      // 087: getfield com/finalshell/core/Fl2.K J
      // 08a: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 08d: sipush 5098
      // 090: sipush -27702
      // 093: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: aload 0
      // 09a: getfield com/finalshell/connection/DelayedAckSACK.q I
      // 09d: sipush 20795
      // 0a0: ldc2_w 7006528147168738173
      // 0a3: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 0a6: idiv
      // 0a7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0aa: sipush 5102
      // 0ad: sipush 25132
      // 0b0: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b6: sipush 5110
      // 0b9: sipush 6946
      // 0bc: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 0
      // 0c3: getfield com/finalshell/connection/DelayedAckSACK.p Ljava/util/HashMap;
      // 0c6: invokevirtual java/util/HashMap.size ()I
      // 0c9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0cc: sipush 5119
      // 0cf: sipush 10965
      // 0d2: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/connection/DelayedAckSACK.T J
      // 0dc: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0df: sipush 5103
      // 0e2: sipush -25228
      // 0e5: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ee: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/connection/DelayedAckSACK.y Lorg/pcap4j/core/PcapHandle;
      // 0f5: aload 3
      // 0f6: getfield com/finalshell/core/Fl2.l Lorg/pcap4j/packet/Packet;
      // 0f9: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 0fc: goto 110
      // 0ff: astore 7
      // 101: aload 7
      // 103: invokevirtual org/pcap4j/core/PcapNativeException.printStackTrace ()V
      // 106: goto 110
      // 109: astore 7
      // 10b: aload 7
      // 10d: invokevirtual org/pcap4j/core/NotOpenException.printStackTrace ()V
      // 110: aload 3
      // 111: invokestatic java/lang/System.currentTimeMillis ()J
      // 114: putfield com/finalshell/core/Fl2.q J
      // 117: aload 3
      // 118: dup
      // 119: getfield com/finalshell/core/Fl2.K J
      // 11c: lconst_1
      // 11d: ladd
      // 11e: putfield com/finalshell/core/Fl2.K J
      // 121: aload 4
      // 123: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 128: ifne 018
      // 12b: aload 2
      // 12c: monitorexit
      // 12d: aload 1
      // 12e: ifnonnull 121
      // 131: goto 137
      // 134: aload 2
      // 135: monitorexit
      // 136: athrow
      // 137: return
   }

   void q(long var1) {
      this.T = var1;
   }

   void A(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: bipush -1
      // 004: istore 3
      // 005: iload 1
      // 006: istore 4
      // 008: bipush 0
      // 009: istore 5
      // 00b: astore 2
      // 00c: bipush 0
      // 00d: istore 6
      // 00f: aload 2
      // 010: ifnull 02e
      // 013: iinc 4 1
      // 016: iinc 5 -1
      // 019: bipush 1
      // 01a: istore 6
      // 01c: iload 5
      // 01e: sipush 19665
      // 021: ldc2_w 4180409510138160769
      // 024: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 027: if_icmple 02e
      // 02a: aload 2
      // 02b: ifnull 03d
      // 02e: aload 0
      // 02f: getfield com/finalshell/connection/DelayedAckSACK.C Ljava/util/HashMap;
      // 032: iload 4
      // 034: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 037: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 03a: ifeq 013
      // 03d: aload 0
      // 03e: getfield com/finalshell/connection/DelayedAckSACK.C Ljava/util/HashMap;
      // 041: iload 4
      // 043: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 046: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast com/finalshell/core/Fl2
      // 04c: astore 7
      // 04e: iload 6
      // 050: ifeq 07f
      // 053: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 056: new java/lang/StringBuilder
      // 059: dup
      // 05a: sipush 5107
      // 05d: sipush -10002
      // 060: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 063: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 066: iload 5
      // 068: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 06b: ldc_w " "
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: aload 7
      // 073: getfield com/finalshell/core/Fl2.c I
      // 076: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 079: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 07f: aload 7
      // 081: aload 2
      // 082: ifnonnull 08a
      // 085: ifnull 092
      // 088: aload 7
      // 08a: getfield com/finalshell/core/Fl2.c I
      // 08d: istore 3
      // 08e: aload 2
      // 08f: ifnull 0a2
      // 092: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 095: sipush 5104
      // 098: sipush 9490
      // 09b: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 09e: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0a1: return
      // 0a2: aload 7
      // 0a4: getfield com/finalshell/core/Fl2.H I
      // 0a7: istore 8
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/connection/DelayedAckSACK.I Ljava/lang/Object;
      // 0ad: dup
      // 0ae: astore 9
      // 0b0: monitorenter
      // 0b1: aload 2
      // 0b2: ifnonnull 1ab
      // 0b5: iload 8
      // 0b7: aload 0
      // 0b8: getfield com/finalshell/connection/DelayedAckSACK.e I
      // 0bb: if_icmple 1a8
      // 0be: aload 0
      // 0bf: iload 8
      // 0c1: putfield com/finalshell/connection/DelayedAckSACK.e I
      // 0c4: bipush 0
      // 0c5: istore 10
      // 0c7: bipush 0
      // 0c8: istore 11
      // 0ca: aload 2
      // 0cb: ifnull 109
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/connection/DelayedAckSACK.U Ljava/util/ArrayList;
      // 0d2: iload 11
      // 0d4: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0d7: checkcast com/finalshell/core/Fl2
      // 0da: astore 12
      // 0dc: aload 12
      // 0de: getfield com/finalshell/core/Fl2.H I
      // 0e1: aload 12
      // 0e3: getfield com/finalshell/core/Fl2.M I
      // 0e6: iadd
      // 0e7: istore 13
      // 0e9: iload 8
      // 0eb: iload 13
      // 0ed: aload 2
      // 0ee: ifnonnull 0ff
      // 0f1: if_icmplt 0fb
      // 0f4: iinc 10 1
      // 0f7: aload 2
      // 0f8: ifnull 106
      // 0fb: iload 8
      // 0fd: iload 13
      // 0ff: if_icmpge 106
      // 102: aload 2
      // 103: ifnull 1a3
      // 106: iinc 11 1
      // 109: iload 11
      // 10b: aload 0
      // 10c: getfield com/finalshell/connection/DelayedAckSACK.U Ljava/util/ArrayList;
      // 10f: invokevirtual java/util/ArrayList.size ()I
      // 112: if_icmplt 0ce
      // 115: aload 2
      // 116: ifnonnull 1a3
      // 119: aload 2
      // 11a: ifnull 1a3
      // 11d: aload 0
      // 11e: getfield com/finalshell/connection/DelayedAckSACK.U Ljava/util/ArrayList;
      // 121: bipush 0
      // 122: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
      // 125: checkcast com/finalshell/core/Fl2
      // 128: astore 11
      // 12a: aload 0
      // 12b: getfield com/finalshell/connection/DelayedAckSACK.p Ljava/util/HashMap;
      // 12e: aload 11
      // 130: getfield com/finalshell/core/Fl2.H I
      // 133: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 136: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 139: checkcast com/finalshell/core/Fl2
      // 13c: astore 12
      // 13e: aload 2
      // 13f: ifnonnull 157
      // 142: aload 12
      // 144: ifnull 1a0
      // 147: aload 0
      // 148: getfield com/finalshell/connection/DelayedAckSACK.S Ljava/util/ArrayList;
      // 14b: aload 12
      // 14d: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 150: pop
      // 151: aload 0
      // 152: aload 12
      // 154: putfield com/finalshell/connection/DelayedAckSACK.x Lcom/finalshell/core/Fl2;
      // 157: invokestatic java/lang/System.currentTimeMillis ()J
      // 15a: aload 12
      // 15c: getfield com/finalshell/core/Fl2.q J
      // 15f: lsub
      // 160: lstore 13
      // 162: aload 0
      // 163: lload 13
      // 165: invokevirtual com/finalshell/connection/DelayedAckSACK.q (J)V
      // 168: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 16b: new java/lang/StringBuilder
      // 16e: dup
      // 16f: sipush 5118
      // 172: sipush 25974
      // 175: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 178: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 17b: aload 12
      // 17d: getfield com/finalshell/core/Fl2.c I
      // 180: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 183: ldc_w " "
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: lload 13
      // 18b: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 18e: sipush 5096
      // 191: sipush -22119
      // 194: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1a0: iinc 10 -1
      // 1a3: iload 10
      // 1a5: ifgt 11d
      // 1a8: aload 9
      // 1aa: monitorexit
      // 1ab: goto 1b2
      // 1ae: aload 9
      // 1b0: monitorexit
      // 1b1: athrow
      // 1b2: return
   }

   void t() {
      DelayedAckSACK var2;
      label26: {
         String[] var1 = DnsResolveFailedSetting.I$arrString();
         Fl2 var10000 = this.m;
         if (var1 == null) {
            if (this.m == null) {
               return;
            }

            var2 = this;
            if (var1 != null) {
               break label26;
            }

            var10000 = this.x;
         }

         if (var10000 == null) {
            this.q = this.m.H + this.m.M - this.Q;
            if (var1 == null) {
               return;
            }
         }

         var2 = this;
      }

      var2.q = this.m.H + this.m.M - (this.x.H + this.x.M);
   }

   void i(Packet param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/connection/DelayedAckSACK.Q I
      // 007: istore 4
      // 009: astore 3
      // 00a: bipush 0
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield com/finalshell/connection/DelayedAckSACK.j S
      // 011: bipush 1
      // 012: iadd
      // 013: i2s
      // 014: istore 6
      // 016: invokestatic java/lang/System.currentTimeMillis ()J
      // 019: lstore 7
      // 01b: sipush 5109
      // 01e: sipush -13109
      // 021: invokestatic com/finalshell/connection/DelayedAckSACK.a (II)Ljava/lang/String;
      // 024: astore 9
      // 026: sipush 10629
      // 029: aload 9
      // 02b: invokevirtual java/lang/String.getBytes ()[B
      // 02e: astore 10
      // 030: ldc2_w 6355465892062184415
      // 033: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 036: newarray 8
      // 038: astore 10
      // 03a: aload 0
      // 03b: iload 4
      // 03d: putfield com/finalshell/connection/DelayedAckSACK.Q I
      // 040: aload 0
      // 041: invokevirtual com/finalshell/connection/DelayedAckSACK.t ()V
      // 044: aload 3
      // 045: ifnull 05e
      // 048: lconst_1
      // 049: invokestatic java/lang/Thread.sleep (J)V
      // 04c: goto 05a
      // 04f: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: astore 11
      // 055: aload 11
      // 057: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 05a: aload 0
      // 05b: invokevirtual com/finalshell/connection/DelayedAckSACK.t ()V
      // 05e: aload 0
      // 05f: getfield com/finalshell/connection/DelayedAckSACK.q I
      // 062: sipush 24620
      // 065: ldc2_w 7215755022451444320
      // 068: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 06b: if_icmpgt 048
      // 06e: aload 0
      // 06f: aload 3
      // 070: ifnonnull 05b
      // 073: getfield com/finalshell/connection/DelayedAckSACK.p Ljava/util/HashMap;
      // 076: invokevirtual java/util/HashMap.size ()I
      // 079: sipush 10544
      // 07c: ldc2_w 1571649051110327144
      // 07f: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 082: aload 3
      // 083: ifnonnull 093
      // 086: if_icmpgt 048
      // 089: goto 090
      // 08c: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: iload 6
      // 092: bipush 1
      // 093: iadd
      // 094: i2s
      // 095: istore 6
      // 097: aload 0
      // 098: aload 1
      // 099: iload 4
      // 09b: aload 10
      // 09d: iload 6
      // 09f: iload 2
      // 0a0: invokevirtual com/finalshell/connection/DelayedAckSACK.W (Lorg/pcap4j/packet/Packet;I[BSI)Lorg/pcap4j/packet/Packet;
      // 0a3: astore 11
      // 0a5: aload 0
      // 0a6: getfield com/finalshell/connection/DelayedAckSACK.y Lorg/pcap4j/core/PcapHandle;
      // 0a9: aload 11
      // 0ab: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 0ae: goto 0c2
      // 0b1: astore 12
      // 0b3: aload 12
      // 0b5: invokevirtual org/pcap4j/core/PcapNativeException.printStackTrace ()V
      // 0b8: goto 0c2
      // 0bb: astore 12
      // 0bd: aload 12
      // 0bf: invokevirtual org/pcap4j/core/NotOpenException.printStackTrace ()V
      // 0c2: aload 0
      // 0c3: getfield com/finalshell/connection/DelayedAckSACK.I Ljava/lang/Object;
      // 0c6: dup
      // 0c7: astore 12
      // 0c9: monitorenter
      // 0ca: new com/finalshell/core/Fl2
      // 0cd: dup
      // 0ce: invokespecial com/finalshell/core/Fl2.<init> ()V
      // 0d1: astore 13
      // 0d3: aload 13
      // 0d5: iload 4
      // 0d7: putfield com/finalshell/core/Fl2.H I
      // 0da: aload 13
      // 0dc: aload 10
      // 0de: arraylength
      // 0df: putfield com/finalshell/core/Fl2.M I
      // 0e2: aload 13
      // 0e4: aload 11
      // 0e6: putfield com/finalshell/core/Fl2.l Lorg/pcap4j/packet/Packet;
      // 0e9: aload 13
      // 0eb: iload 5
      // 0ed: putfield com/finalshell/core/Fl2.c I
      // 0f0: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f3: lstore 14
      // 0f5: aload 13
      // 0f7: lload 14
      // 0f9: putfield com/finalshell/core/Fl2.J J
      // 0fc: aload 13
      // 0fe: lload 14
      // 100: putfield com/finalshell/core/Fl2.q J
      // 103: aload 0
      // 104: getfield com/finalshell/connection/DelayedAckSACK.U Ljava/util/ArrayList;
      // 107: aload 13
      // 109: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 10c: pop
      // 10d: aload 0
      // 10e: getfield com/finalshell/connection/DelayedAckSACK.C Ljava/util/HashMap;
      // 111: iload 4
      // 113: aload 10
      // 115: arraylength
      // 116: iadd
      // 117: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11a: aload 13
      // 11c: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 11f: pop
      // 120: aload 0
      // 121: getfield com/finalshell/connection/DelayedAckSACK.p Ljava/util/HashMap;
      // 124: iload 4
      // 126: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 129: aload 13
      // 12b: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 12e: pop
      // 12f: aload 0
      // 130: getfield com/finalshell/connection/DelayedAckSACK.S Ljava/util/ArrayList;
      // 133: aload 13
      // 135: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 138: pop
      // 139: aload 0
      // 13a: getfield com/finalshell/connection/DelayedAckSACK.d Ljava/util/HashMap;
      // 13d: aload 13
      // 13f: getfield com/finalshell/core/Fl2.c I
      // 142: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 145: iload 4
      // 147: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14a: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 14d: pop
      // 14e: aload 0
      // 14f: getfield com/finalshell/connection/DelayedAckSACK.k Ljava/util/HashMap;
      // 152: iload 4
      // 154: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 157: aload 13
      // 159: getfield com/finalshell/core/Fl2.c I
      // 15c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15f: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 162: pop
      // 163: aload 0
      // 164: aload 13
      // 166: putfield com/finalshell/connection/DelayedAckSACK.m Lcom/finalshell/core/Fl2;
      // 169: aload 12
      // 16b: monitorexit
      // 16c: goto 173
      // 16f: aload 12
      // 171: monitorexit
      // 172: athrow
      // 173: iload 4
      // 175: aload 10
      // 177: arraylength
      // 178: iadd
      // 179: istore 4
      // 17b: iinc 5 1
      // 17e: iload 6
      // 180: bipush 1
      // 181: iadd
      // 182: i2s
      // 183: istore 6
      // 185: iload 5
      // 187: istore 12
      // 189: bipush 1
      // 18a: istore 13
      // 18c: invokestatic java/lang/System.currentTimeMillis ()J
      // 18f: lload 7
      // 191: lsub
      // 192: lstore 14
      // 194: lload 14
      // 196: sipush 24019
      // 199: ldc2_w 6792029314525784116
      // 19c: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 19f: lcmp
      // 1a0: aload 3
      // 1a1: ifnonnull 1d0
      // 1a4: ifge 1bd
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: sipush 14483
      // 1b1: ldc2_w 7909588994563068624
      // 1b4: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 1b7: istore 13
      // 1b9: aload 3
      // 1ba: ifnull 2c1
      // 1bd: lload 14
      // 1bf: sipush 14485
      // 1c2: ldc2_w 902501413453335923
      // 1c5: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 1c8: lcmp
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 3
      // 1d1: ifnonnull 200
      // 1d4: ifge 1ed
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: sipush 23221
      // 1e1: ldc2_w 7920085693321654525
      // 1e4: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 1e7: istore 13
      // 1e9: aload 3
      // 1ea: ifnull 2c1
      // 1ed: lload 14
      // 1ef: sipush 19341
      // 1f2: ldc2_w 4047038017731296877
      // 1f5: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 1f8: lcmp
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: aload 3
      // 201: ifnonnull 230
      // 204: ifge 21d
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: sipush 13841
      // 211: ldc2_w 6817484015001459807
      // 214: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 217: istore 13
      // 219: aload 3
      // 21a: ifnull 2c1
      // 21d: lload 14
      // 21f: sipush 8502
      // 222: ldc2_w 1981799304617596115
      // 225: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 228: lcmp
      // 229: goto 230
      // 22c: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: aload 3
      // 231: ifnonnull 260
      // 234: ifge 24d
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: sipush 26913
      // 241: ldc2_w 8358765797908087656
      // 244: invokestatic com/finalshell/connection/DelayedAckSACK.a (IJ)I
      // 247: istore 13
      // 249: aload 3
      // 24a: ifnull 2c1
      // 24d: lload 14
      // 24f: sipush 30328
      // 252: ldc2_w 7145823961090966427
      // 255: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 258: lcmp
      // 259: goto 260
      // 25c: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: aload 3
      // 261: ifnonnull 288
      // 264: ifge 275
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: bipush 3
      // 26f: istore 13
      // 271: aload 3
      // 272: ifnull 2c1
      // 275: lload 14
      // 277: sipush 8052
      // 27a: ldc2_w 3019064083911322261
      // 27d: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 280: lcmp
      // 281: goto 288
      // 284: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: aload 3
      // 289: ifnonnull 2bb
      // 28c: ifge 29d
      // 28f: goto 296
      // 292: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 295: athrow
      // 296: bipush 2
      // 297: istore 13
      // 299: aload 3
      // 29a: ifnull 2c1
      // 29d: lload 14
      // 29f: aload 3
      // 2a0: ifnonnull 2c2
      // 2a3: goto 2aa
      // 2a6: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a9: athrow
      // 2aa: sipush 19463
      // 2ad: ldc2_w 6173073564605676005
      // 2b0: invokestatic com/finalshell/connection/DelayedAckSACK.b (IJ)J
      // 2b3: lcmp
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/connection/DelayedAckSACK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: ifge 2c1
      // 2be: bipush 1
      // 2bf: istore 13
      // 2c1: lconst_1
      // 2c2: invokestatic java/lang/Thread.sleep (J)V
      // 2c5: goto 01b
      // 2c8: astore 16
      // 2ca: aload 16
      // 2cc: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 2cf: goto 01b
   }

   Packet K(MacAddress var1, MacAddress var2, Inet4Address var3, short var4, Inet4Address var5, short var6, int var7, int var8) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild$TcpPacket_Builder(true);
      var9.correctLengthAtBuild$TcpPacket_Builder(true);
      var9.paddingAtBuild(true);
      var9.ack(true);
      var9.acknowledgmentNumber(var7);
      var9.dataOffset((byte)a(10524, 6945168932502553438L));
      var9.dstAddr(var5);
      var9.dstPort(new TcpPort(var6, ""));
      ArrayList var10 = new ArrayList();
      TcpMaximumSegmentSizeOption var11 = new TcpMaximumSegmentSizeOption.Builder()
         .maxSegSize((short)a(10474, 6484525272380588724L))
         .correctLengthAtBuild$TcpMaximumSegmentSizeOption_Builder(true)
         .build$TcpMaximumSegmentSizeOption();
      var10.add(var11);
      TcpSackPermittedOption var12 = TcpSackPermittedOption.getInstance();
      var10.add(var12);
      TcpWindowScaleOption var13 = new TcpWindowScaleOption.Builder()
         .shiftCount((byte)a(28247, 7451438915530687511L))
         .correctLengthAtBuild$TcpWindowScaleOption_Builder(true)
         .build$TcpWindowScaleOption();
      var10.add(var13);
      var9.options(var10);
      var9.psh(false);
      var9.reserved((byte)0);
      var9.rst(false);
      var9.sequenceNumber(var8);
      var9.srcAddr(var3);
      var9.srcPort(new TcpPort(var4, ""));
      var9.syn(true);
      var9.urg(false);
      var9.window((short)a(29426, 6545203654348675246L));
      IpV4Packet.Builder var14 = new IpV4Packet.Builder();
      var14.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var14.correctLengthAtBuild$IpV4Packet_Builder(true);
      var14.paddingAtBuild(true);
      var14.dstAddr(var5);
      var14.dontFragmentFlag(true);
      var14.fragmentOffset((short)0);
      short var15 = (short)Math.abs(this.A.nextInt(a(7838, 2957296431174055109L)));
      var14.identification(var15);
      var14.ihl((byte)5);
      var14.protocol(IpNumber.TCP);
      var14.srcAddr(var3);
      var14.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var14.totalLength((short)a(13575, 230848830825750349L));
      var14.ttl((byte)a(13575, 230848830825750349L));
      var14.version(IpVersion.IPV4);
      var14.payloadBuilder$IpV4Packet_Builder(var9);
      EthernetPacket.Builder var16 = new EthernetPacket.Builder();
      var16.dstAddr(var2).srcAddr(var1).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var14).paddingAtBuild(true);
      EthernetPacket var17 = var16.build$EthernetPacket();
      IpV4Packet var18 = var14.build$IpV4Packet();
      TcpPacket var19 = var9.build$TcpPacket();
      this.Y.add(var15);
      return var17;
   }

   Packet D(Packet var1, int var2, byte[] var3) {
      Packet var5 = null;
      EthernetPacket var6 = (EthernetPacket)var1;
      EthernetPacket.EthernetHeader var7 = var6.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var8 = (IpV4Packet)var6.getPayload();
      IpV4Packet.IpV4Header var9 = var8.getHeader$IpV4Packet_IpV4Header();
      TcpPacket var10 = (TcpPacket)var8.getPayload();
      TcpPacket.TcpHeader var11 = var10.getHeader$TcpPacket_TcpHeader();
      TcpPacket.Builder var12 = new TcpPacket.Builder();
      var12.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var3));
      var12.correctChecksumAtBuild$TcpPacket_Builder(true);
      var12.correctLengthAtBuild$TcpPacket_Builder(true);
      var12.paddingAtBuild(true);
      var12.ack(true);
      var12.acknowledgmentNumber(var11.getAcknowledgmentNumber());
      var12.checksum(var11.getChecksum());
      var12.dataOffset(var11.getDataOffset());
      var12.dstAddr(var9.getDstAddr());
      var12.dstPort(new TcpPort(var11.getDstPort().value(), ""));
      var12.fin(var11.getFin());
      var12.options(var11.getOptions());
      var12.padding(var11.getPadding());
      var12.psh(var11.getPsh());
      var12.reserved(var11.getReserved());
      var12.rst(var11.getRst());
      var12.sequenceNumber(var2);
      var12.srcAddr(var9.getSrcAddr());
      var12.srcPort(new TcpPort(var11.getSrcPort().value(), ""));
      var12.syn(var11.getSyn());
      var12.urg(var11.getUrg());
      var12.urgentPointer(var11.getUrgentPointer());
      var12.window(var11.getWindow());
      IpV4Packet.Builder var13 = new IpV4Packet.Builder();
      var13.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var13.correctLengthAtBuild$IpV4Packet_Builder(true);
      var13.paddingAtBuild(true);
      var13.dstAddr(var9.getDstAddr());
      var13.fragmentOffset((short)0);
      var13.headerChecksum(var9.getHeaderChecksum());
      var13.identification(var9.getIdentification());
      String[] var10000 = DnsResolveFailedSetting.I$arrString();
      var13.ihl((byte)5);
      var13.moreFragmentFlag(var9.getMoreFragmentFlag());
      var13.options(var9.getOptions());
      var13.padding(var9.getPadding());
      var13.protocol(IpNumber.TCP);
      String[] var4 = var10000;
      var13.reservedFlag(var9.getReservedFlag());
      var13.srcAddr(var9.getSrcAddr());
      var13.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var13.totalLength((short)a(13575, 230848830825750349L));
      var13.ttl((byte)a(27367, 87871014116491448L));
      var13.version(IpVersion.IPV4);
      var13.payloadBuilder$IpV4Packet_Builder(var12);
      EthernetPacket.Builder var14 = new EthernetPacket.Builder();
      var14.dstAddr(var7.getDstAddr()).srcAddr(var7.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var13).paddingAtBuild(true);
      var5 = var14.build$EthernetPacket();
      if (var4 != null) {
         Ky4.K(new String[3]);
      }

      return var5;
   }

   Packet y(Packet var1, int var2, int var3) {
      Object var4 = null;
      EthernetPacket var5 = (EthernetPacket)var1;
      EthernetPacket.EthernetHeader var6 = var5.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var7 = (IpV4Packet)var5.getPayload();
      IpV4Packet.IpV4Header var8 = var7.getHeader$IpV4Packet_IpV4Header();
      TcpPacket var9 = (TcpPacket)var7.getPayload();
      TcpPacket.TcpHeader var10 = var9.getHeader$TcpPacket_TcpHeader();
      TcpPacket.Builder var11 = new TcpPacket.Builder();
      var11.correctChecksumAtBuild$TcpPacket_Builder(true);
      var11.correctLengthAtBuild$TcpPacket_Builder(true);
      var11.paddingAtBuild(true);
      var11.ack(true);
      var11.acknowledgmentNumber(var3);
      var11.checksum(var10.getChecksum());
      var11.dataOffset(var10.getDataOffset());
      var11.dstAddr(var8.getDstAddr());
      var11.dstPort(new TcpPort(var10.getDstPort().value(), ""));
      var11.fin(false);
      var11.padding(var10.getPadding());
      var11.psh(false);
      var11.reserved(var10.getReserved());
      var11.rst(false);
      var11.sequenceNumber(var2);
      var11.srcAddr(var8.getSrcAddr());
      var11.srcPort(new TcpPort(var10.getSrcPort().value(), ""));
      var11.syn(false);
      var11.urg(false);
      var11.urgentPointer(var10.getUrgentPointer());
      var11.window(var10.getWindow());
      IpV4Packet.Builder var12 = new IpV4Packet.Builder();
      var12.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var12.correctLengthAtBuild$IpV4Packet_Builder(true);
      var12.dontFragmentFlag(true);
      var12.paddingAtBuild(true);
      var12.dstAddr(var8.getDstAddr());
      var12.fragmentOffset((short)0);
      var12.headerChecksum(var8.getHeaderChecksum());
      short var13 = (short)Math.abs(this.A.nextInt(a(22779, 4308538693246530238L)));
      var12.identification(var13);
      var12.ihl((byte)5);
      var12.moreFragmentFlag(false);
      var12.padding(var8.getPadding());
      var12.protocol(IpNumber.TCP);
      var12.srcAddr(var8.getSrcAddr());
      var12.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var12.totalLength((short)a(13575, 230848830825750349L));
      var12.ttl((byte)a(27367, 87871014116491448L));
      var12.version(IpVersion.IPV4);
      var12.payloadBuilder$IpV4Packet_Builder(var11);
      EthernetPacket.Builder var14 = new EthernetPacket.Builder();
      var14.dstAddr(var6.getDstAddr()).srcAddr(var6.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var12).paddingAtBuild(true);
      return var14.build$EthernetPacket();
   }

   Packet W(Packet var1, int var2, byte[] var3, short var4, int var5) {
      Packet var7 = null;
      EthernetPacket var8 = (EthernetPacket)var1;
      DnsResolveFailedSetting.I$arrString();
      EthernetPacket.EthernetHeader var9 = var8.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var10 = (IpV4Packet)var8.getPayload();
      IpV4Packet.IpV4Header var11 = var10.getHeader$IpV4Packet_IpV4Header();
      TcpPacket var12 = (TcpPacket)var10.getPayload();
      TcpPacket.TcpHeader var13 = var12.getHeader$TcpPacket_TcpHeader();
      TcpPacket.Builder var14 = new TcpPacket.Builder();
      var14.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var3));
      var14.correctChecksumAtBuild$TcpPacket_Builder(true);
      var14.correctLengthAtBuild$TcpPacket_Builder(true);
      var14.paddingAtBuild(true);
      var14.ack(true);
      var14.acknowledgmentNumber(var5);
      var14.checksum(var13.getChecksum());
      var14.dataOffset(var13.getDataOffset());
      var14.dstAddr(var11.getDstAddr());
      var14.dstPort(new TcpPort(var13.getDstPort().value(), ""));
      var14.fin(false);
      var14.padding(var13.getPadding());
      var14.psh(false);
      var14.reserved(var13.getReserved());
      var14.rst(false);
      var14.sequenceNumber(var2);
      var14.srcAddr(var11.getSrcAddr());
      var14.srcPort(new TcpPort(var13.getSrcPort().value(), ""));
      var14.syn(false);
      var14.urg(false);
      var14.urgentPointer(var13.getUrgentPointer());
      var14.window(var13.getWindow());
      IpV4Packet.Builder var15 = new IpV4Packet.Builder();
      var15.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var15.correctLengthAtBuild$IpV4Packet_Builder(true);
      var15.dontFragmentFlag(true);
      var15.paddingAtBuild(true);
      var15.dstAddr(var11.getDstAddr());
      var15.fragmentOffset((short)0);
      var15.headerChecksum(var11.getHeaderChecksum());
      short var16 = (short)Math.abs(this.A.nextInt(a(22779, 4308538693246530238L)));
      var15.identification(var4);
      var15.ihl((byte)5);
      var15.moreFragmentFlag(false);
      var15.padding(var11.getPadding());
      var15.protocol(IpNumber.TCP);
      var15.srcAddr(var11.getSrcAddr());
      var15.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var15.totalLength((short)a(13575, 230848830825750349L));
      var15.ttl((byte)a(27367, 87871014116491448L));
      var15.version(IpVersion.IPV4);
      var15.payloadBuilder$IpV4Packet_Builder(var14);
      EthernetPacket.Builder var17 = new EthernetPacket.Builder();
      var17.dstAddr(var9.getDstAddr()).srcAddr(var9.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var15).paddingAtBuild(true);
      var7 = var17.build$EthernetPacket();
      if (Ky4.F$arrString() != null) {
         DnsResolveFailedSetting.K(new String[1]);
      }

      return var7;
   }

   static Packet j(Packet var0) {
      Object var2 = null;
      EthernetPacket var3 = (EthernetPacket)var0;
      EthernetPacket.EthernetHeader var4 = var3.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var5 = (IpV4Packet)var3.getPayload();
      String[] var10000 = DnsResolveFailedSetting.I$arrString();
      IpV4Packet.IpV4Header var6 = var5.getHeader$IpV4Packet_IpV4Header();
      String[] var1 = var10000;
      TcpPacket var7 = (TcpPacket)var5.getPayload();
      TcpPacket.TcpHeader var8 = var7.getHeader$TcpPacket_TcpHeader();
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      if (var1 == null) {
         if (var7.getPayload() != null) {
            var9.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var7.getPayload().getRawData()));
         }

         var9.correctChecksumAtBuild$TcpPacket_Builder(true);
         var9.correctLengthAtBuild$TcpPacket_Builder(true);
         var9.paddingAtBuild(true);
         var9.ack(true);
         var9.acknowledgmentNumber(var8.getAcknowledgmentNumber());
         var9.checksum(var8.getChecksum());
         var9.dataOffset(var8.getDataOffset());
         var9.dstAddr(var6.getDstAddr());
         var9.dstPort(var8.getDstPort());
         var9.fin(var8.getFin());
         var9.options(var8.getOptions());
         var9.padding(var8.getPadding());
         var9.psh(var8.getPsh());
         var9.reserved(var8.getReserved());
         var9.rst(var8.getRst());
         var9.sequenceNumber(var8.getSequenceNumber());
         var9.srcAddr(var6.getSrcAddr());
         var9.srcPort(var8.getSrcPort());
         var9.syn(var8.getSyn());
         var9.urg(var8.getUrg());
         var9.urgentPointer(var8.getUrgentPointer());
         var9.window(var8.getWindow());
      }

      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var10.correctLengthAtBuild$IpV4Packet_Builder(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var6.getDstAddr());
      var10.fragmentOffset((short)0);
      var10.headerChecksum(var6.getHeaderChecksum());
      var10.identification(var6.getIdentification());
      var10.ihl((byte)5);
      var10.moreFragmentFlag(var6.getMoreFragmentFlag());
      var10.options(var6.getOptions());
      var10.padding(var6.getPadding());
      var10.protocol(IpNumber.TCP);
      var10.reservedFlag(var6.getReservedFlag());
      var10.srcAddr(var6.getSrcAddr());
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.totalLength((short)a(18594, 403647554778800895L));
      var10.ttl((byte)a(6176, 6492683245522776685L));
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder$IpV4Packet_Builder(var9);
      EthernetPacket.Builder var11 = new EthernetPacket.Builder();
      var11.dstAddr(var4.getDstAddr()).srcAddr(var4.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var10).paddingAtBuild(true);
      return var11.build$EthernetPacket();
   }

   Packet X(MacAddress var1, MacAddress var2, Inet4Address var3, short var4, Inet4Address var5, short var6, int var7, int var8) {
      TcpPacket.Builder var9 = new TcpPacket.Builder();
      var9.correctChecksumAtBuild$TcpPacket_Builder(true);
      var9.correctLengthAtBuild$TcpPacket_Builder(true);
      var9.paddingAtBuild(true);
      var9.ack(true);
      var9.acknowledgmentNumber(var7);
      var9.dataOffset((byte)5);
      var9.dstAddr(var5);
      var9.dstPort(new TcpPort(var6, ""));
      var9.psh(false);
      var9.reserved((byte)0);
      var9.rst(false);
      var9.sequenceNumber(var8);
      var9.srcAddr(var3);
      var9.srcPort(new TcpPort(var4, ""));
      var9.syn(false);
      var9.urg(false);
      var9.window((short)a(21595, 4149604998274891292L));
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var10.correctLengthAtBuild$IpV4Packet_Builder(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var5);
      var10.dontFragmentFlag(true);
      var10.fragmentOffset((short)0);
      short var11 = (short)Math.abs(this.A.nextInt(a(22779, 4308538693246530238L)));
      var10.identification(var11);
      var10.ihl((byte)5);
      var10.protocol(IpNumber.TCP);
      var10.srcAddr(var3);
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.totalLength((short)a(13575, 230848830825750349L));
      var10.ttl((byte)a(13575, 230848830825750349L));
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder$IpV4Packet_Builder(var9);
      EthernetPacket.Builder var12 = new EthernetPacket.Builder();
      var12.dstAddr(var2).srcAddr(var1).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var10).paddingAtBuild(true);
      EthernetPacket var13 = var12.build$EthernetPacket();
      IpV4Packet var14 = var10.build$IpV4Packet();
      TcpPacket var15 = var9.build$TcpPacket();
      this.Y.add(var11);
      return var13;
   }

   public InetAddress H() {
      return this.b;
   }

   public void V(InetAddress var1) {
      this.b = var1;
   }

   public int c() {
      return this.o;
   }

   public void d(int var1) {
      this.o = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 5112) & 65535;
      if (f[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 253;
               break;
            case 1:
               var10000 = 139;
               break;
            case 2:
               var10000 = 179;
               break;
            case 3:
               var10000 = 239;
               break;
            case 4:
               var10000 = 113;
               break;
            case 5:
               var10000 = 127;
               break;
            case 6:
               var10000 = 171;
               break;
            case 7:
               var10000 = 104;
               break;
            case 8:
               var10000 = 114;
               break;
            case 9:
               var10000 = 166;
               break;
            case 10:
               var10000 = 161;
               break;
            case 11:
               var10000 = 159;
               break;
            case 12:
               var10000 = 254;
               break;
            case 13:
               var10000 = 167;
               break;
            case 14:
               var10000 = 201;
               break;
            case 15:
               var10000 = 85;
               break;
            case 16:
               var10000 = 248;
               break;
            case 17:
               var10000 = 23;
               break;
            case 18:
               var10000 = 240;
               break;
            case 19:
               var10000 = 186;
               break;
            case 20:
               var10000 = 32;
               break;
            case 21:
               var10000 = 206;
               break;
            case 22:
               var10000 = 193;
               break;
            case 23:
               var10000 = 72;
               break;
            case 24:
               var10000 = 49;
               break;
            case 25:
               var10000 = 1;
               break;
            case 26:
               var10000 = 77;
               break;
            case 27:
               var10000 = 188;
               break;
            case 28:
               var10000 = 89;
               break;
            case 29:
               var10000 = 223;
               break;
            case 30:
               var10000 = 189;
               break;
            case 31:
               var10000 = 218;
               break;
            case 32:
               var10000 = 103;
               break;
            case 33:
               var10000 = 88;
               break;
            case 34:
               var10000 = 192;
               break;
            case 35:
               var10000 = 20;
               break;
            case 36:
               var10000 = 79;
               break;
            case 37:
               var10000 = 56;
               break;
            case 38:
               var10000 = 4;
               break;
            case 39:
               var10000 = 153;
               break;
            case 40:
               var10000 = 38;
               break;
            case 41:
               var10000 = 10;
               break;
            case 42:
               var10000 = 169;
               break;
            case 43:
               var10000 = 134;
               break;
            case 44:
               var10000 = 236;
               break;
            case 45:
               var10000 = 160;
               break;
            case 46:
               var10000 = 63;
               break;
            case 47:
               var10000 = 45;
               break;
            case 48:
               var10000 = 225;
               break;
            case 49:
               var10000 = 75;
               break;
            case 50:
               var10000 = 70;
               break;
            case 51:
               var10000 = 17;
               break;
            case 52:
               var10000 = 182;
               break;
            case 53:
               var10000 = 227;
               break;
            case 54:
               var10000 = 170;
               break;
            case 55:
               var10000 = 181;
               break;
            case 56:
               var10000 = 168;
               break;
            case 57:
               var10000 = 150;
               break;
            case 58:
               var10000 = 29;
               break;
            case 59:
               var10000 = 105;
               break;
            case 60:
               var10000 = 185;
               break;
            case 61:
               var10000 = 154;
               break;
            case 62:
               var10000 = 11;
               break;
            case 63:
               var10000 = 180;
               break;
            case 64:
               var10000 = 58;
               break;
            case 65:
               var10000 = 252;
               break;
            case 66:
               var10000 = 27;
               break;
            case 67:
               var10000 = 5;
               break;
            case 68:
               var10000 = 118;
               break;
            case 69:
               var10000 = 92;
               break;
            case 70:
               var10000 = 202;
               break;
            case 71:
               var10000 = 149;
               break;
            case 72:
               var10000 = 247;
               break;
            case 73:
               var10000 = 249;
               break;
            case 74:
               var10000 = 59;
               break;
            case 75:
               var10000 = 141;
               break;
            case 76:
               var10000 = 187;
               break;
            case 77:
               var10000 = 26;
               break;
            case 78:
               var10000 = 61;
               break;
            case 79:
               var10000 = 46;
               break;
            case 80:
               var10000 = 142;
               break;
            case 81:
               var10000 = 205;
               break;
            case 82:
               var10000 = 37;
               break;
            case 83:
               var10000 = 136;
               break;
            case 84:
               var10000 = 233;
               break;
            case 85:
               var10000 = 177;
               break;
            case 86:
               var10000 = 67;
               break;
            case 87:
               var10000 = 212;
               break;
            case 88:
               var10000 = 100;
               break;
            case 89:
               var10000 = 151;
               break;
            case 90:
               var10000 = 2;
               break;
            case 91:
               var10000 = 135;
               break;
            case 92:
               var10000 = 147;
               break;
            case 93:
               var10000 = 224;
               break;
            case 94:
               var10000 = 125;
               break;
            case 95:
               var10000 = 90;
               break;
            case 96:
               var10000 = 172;
               break;
            case 97:
               var10000 = 244;
               break;
            case 98:
               var10000 = 12;
               break;
            case 99:
               var10000 = 107;
               break;
            case 100:
               var10000 = 51;
               break;
            case 101:
               var10000 = 48;
               break;
            case 102:
               var10000 = 211;
               break;
            case 103:
               var10000 = 84;
               break;
            case 104:
               var10000 = 81;
               break;
            case 105:
               var10000 = 220;
               break;
            case 106:
               var10000 = 16;
               break;
            case 107:
               var10000 = 174;
               break;
            case 108:
               var10000 = 232;
               break;
            case 109:
               var10000 = 121;
               break;
            case 110:
               var10000 = 116;
               break;
            case 111:
               var10000 = 208;
               break;
            case 112:
               var10000 = 216;
               break;
            case 113:
               var10000 = 42;
               break;
            case 114:
               var10000 = 198;
               break;
            case 115:
               var10000 = 178;
               break;
            case 116:
               var10000 = 158;
               break;
            case 117:
               var10000 = 204;
               break;
            case 118:
               var10000 = 173;
               break;
            case 119:
               var10000 = 124;
               break;
            case 120:
               var10000 = 203;
               break;
            case 121:
               var10000 = 175;
               break;
            case 122:
               var10000 = 145;
               break;
            case 123:
               var10000 = 235;
               break;
            case 124:
               var10000 = 122;
               break;
            case 125:
               var10000 = 71;
               break;
            case 126:
               var10000 = 228;
               break;
            case 127:
               var10000 = 215;
               break;
            case 128:
               var10000 = 95;
               break;
            case 129:
               var10000 = 86;
               break;
            case 130:
               var10000 = 78;
               break;
            case 131:
               var10000 = 241;
               break;
            case 132:
               var10000 = 230;
               break;
            case 133:
               var10000 = 184;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 119;
               break;
            case 136:
               var10000 = 117;
               break;
            case 137:
               var10000 = 251;
               break;
            case 138:
               var10000 = 219;
               break;
            case 139:
               var10000 = 109;
               break;
            case 140:
               var10000 = 120;
               break;
            case 141:
               var10000 = 138;
               break;
            case 142:
               var10000 = 53;
               break;
            case 143:
               var10000 = 157;
               break;
            case 144:
               var10000 = 199;
               break;
            case 145:
               var10000 = 14;
               break;
            case 146:
               var10000 = 196;
               break;
            case 147:
               var10000 = 91;
               break;
            case 148:
               var10000 = 243;
               break;
            case 149:
               var10000 = 57;
               break;
            case 150:
               var10000 = 133;
               break;
            case 151:
               var10000 = 123;
               break;
            case 152:
               var10000 = 3;
               break;
            case 153:
               var10000 = 15;
               break;
            case 154:
               var10000 = 44;
               break;
            case 155:
               var10000 = 35;
               break;
            case 156:
               var10000 = 226;
               break;
            case 157:
               var10000 = 148;
               break;
            case 158:
               var10000 = 9;
               break;
            case 159:
               var10000 = 54;
               break;
            case 160:
               var10000 = 8;
               break;
            case 161:
               var10000 = 64;
               break;
            case 162:
               var10000 = 73;
               break;
            case 163:
               var10000 = 112;
               break;
            case 164:
               var10000 = 137;
               break;
            case 165:
               var10000 = 162;
               break;
            case 166:
               var10000 = 222;
               break;
            case 167:
               var10000 = 155;
               break;
            case 168:
               var10000 = 190;
               break;
            case 169:
               var10000 = 55;
               break;
            case 170:
               var10000 = 217;
               break;
            case 171:
               var10000 = 115;
               break;
            case 172:
               var10000 = 229;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 43;
               break;
            case 175:
               var10000 = 74;
               break;
            case 176:
               var10000 = 99;
               break;
            case 177:
               var10000 = 28;
               break;
            case 178:
               var10000 = 24;
               break;
            case 179:
               var10000 = 31;
               break;
            case 180:
               var10000 = 131;
               break;
            case 181:
               var10000 = 34;
               break;
            case 182:
               var10000 = 52;
               break;
            case 183:
               var10000 = 234;
               break;
            case 184:
               var10000 = 111;
               break;
            case 185:
               var10000 = 106;
               break;
            case 186:
               var10000 = 82;
               break;
            case 187:
               var10000 = 200;
               break;
            case 188:
               var10000 = 176;
               break;
            case 189:
               var10000 = 237;
               break;
            case 190:
               var10000 = 50;
               break;
            case 191:
               var10000 = 94;
               break;
            case 192:
               var10000 = 87;
               break;
            case 193:
               var10000 = 62;
               break;
            case 194:
               var10000 = 7;
               break;
            case 195:
               var10000 = 108;
               break;
            case 196:
               var10000 = 30;
               break;
            case 197:
               var10000 = 40;
               break;
            case 198:
               var10000 = 210;
               break;
            case 199:
               var10000 = 6;
               break;
            case 200:
               var10000 = 39;
               break;
            case 201:
               var10000 = 110;
               break;
            case 202:
               var10000 = 22;
               break;
            case 203:
               var10000 = 195;
               break;
            case 204:
               var10000 = 47;
               break;
            case 205:
               var10000 = 41;
               break;
            case 206:
               var10000 = 0;
               break;
            case 207:
               var10000 = 146;
               break;
            case 208:
               var10000 = 96;
               break;
            case 209:
               var10000 = 246;
               break;
            case 210:
               var10000 = 152;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 97;
               break;
            case 213:
               var10000 = 65;
               break;
            case 214:
               var10000 = 143;
               break;
            case 215:
               var10000 = 250;
               break;
            case 216:
               var10000 = 128;
               break;
            case 217:
               var10000 = 156;
               break;
            case 218:
               var10000 = 21;
               break;
            case 219:
               var10000 = 83;
               break;
            case 220:
               var10000 = 209;
               break;
            case 221:
               var10000 = 36;
               break;
            case 222:
               var10000 = 126;
               break;
            case 223:
               var10000 = 33;
               break;
            case 224:
               var10000 = 207;
               break;
            case 225:
               var10000 = 13;
               break;
            case 226:
               var10000 = 130;
               break;
            case 227:
               var10000 = 231;
               break;
            case 228:
               var10000 = 69;
               break;
            case 229:
               var10000 = 255;
               break;
            case 230:
               var10000 = 238;
               break;
            case 231:
               var10000 = 93;
               break;
            case 232:
               var10000 = 242;
               break;
            case 233:
               var10000 = 164;
               break;
            case 234:
               var10000 = 68;
               break;
            case 235:
               var10000 = 101;
               break;
            case 236:
               var10000 = 18;
               break;
            case 237:
               var10000 = 245;
               break;
            case 238:
               var10000 = 213;
               break;
            case 239:
               var10000 = 19;
               break;
            case 240:
               var10000 = 221;
               break;
            case 241:
               var10000 = 76;
               break;
            case 242:
               var10000 = 197;
               break;
            case 243:
               var10000 = 140;
               break;
            case 244:
               var10000 = 183;
               break;
            case 245:
               var10000 = 144;
               break;
            case 246:
               var10000 = 102;
               break;
            case 247:
               var10000 = 66;
               break;
            case 248:
               var10000 = 129;
               break;
            case 249:
               var10000 = 80;
               break;
            case 250:
               var10000 = 25;
               break;
            case 251:
               var10000 = 98;
               break;
            case 252:
               var10000 = 191;
               break;
            case 253:
               var10000 = 132;
               break;
            case 254:
               var10000 = 163;
               break;
            default:
               var10000 = 60;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27208;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 13792) & 32767;
      if (r[var3] == null) {
         r[var3] = l[var3] ^ var1;
      }

      return r[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[24];
      int var19 = 0;
      String var18 = "÷8i\u0007\u0083诺污稼厥tÍ\u0011\t7Æ\u009aõ\u0084~F»¸½Z-\u0093\u0097=\u009d\b\u009d\u0085d6\u0088ÖÂg\u000fq\t$\r½%ÌSn`á5¸Ý£\u0006杂刉穼提抶<\t硨诔帯述ò o\u00ad\u009e\u000bD\u0000º\u0017\u000e`\u00987Ã\t\u0090\bq\u001aùÅ;«·¨\u0006\\Þ¡-8ý\u0007F瘏梜窸号ä\u0087\u0013ÉÔ3¶_R\u0090½å½\u0090\u008e\u0096ª\u0019\u0096\u0083U?\u0012筕乘歕捯抄孉扃窫謶汒呆歅¾Ô\u0011\u009194\f\u0090õA{(0gU|\u0083u<\u0007jCpW®\u0017<\n硏譨廋轧n@þé\u0085A\u0002\u0099ò\u000e¤C¢¢\u0098üxøü³`úx\u001a\tL°¨\u0088:fòú¥\u0010筇价欗掲拌寲扊竜吭幪tJ\u0012©ìk\u0018筶主欱挞戈柈剄噆咨幎哨毊g帠謩沆呗欺'4e;á6\u0005赇斗酧厎Ø";
      int var20 = "÷8i\u0007\u0083诺污稼厥tÍ\u0011\t7Æ\u009aõ\u0084~F»¸½Z-\u0093\u0097=\u009d\b\u009d\u0085d6\u0088ÖÂg\u000fq\t$\r½%ÌSn`á5¸Ý£\u0006杂刉穼提抶<\t硨诔帯述ò o\u00ad\u009e\u000bD\u0000º\u0017\u000e`\u00987Ã\t\u0090\bq\u001aùÅ;«·¨\u0006\\Þ¡-8ý\u0007F瘏梜窸号ä\u0087\u0013ÉÔ3¶_R\u0090½å½\u0090\u008e\u0096ª\u0019\u0096\u0083U?\u0012筕乘歕捯抄孉扃窫謶汒呆歅¾Ô\u0011\u009194\f\u0090õA{(0gU|\u0083u<\u0007jCpW®\u0017<\n硏譨廋轧n@þé\u0085A\u0002\u0099ò\u000e¤C¢¢\u0098üxøü³`úx\u001a\tL°¨\u0088:fòú¥\u0010筇价欗掲拌寲扊竜吭幪tJ\u0012©ìk\u0018筶主欱挞戈柈剄噆咨幎哨毊g帠謩沆呗欺'4e;á6\u0005赇斗酧厎Ø"
         .length();
      char var17 = 3;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 122;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var46;
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 2;
                        break;
                     case 1:
                        var84 = 103;
                        break;
                     case 2:
                        var84 = 2;
                        break;
                     case 3:
                        var84 = 92;
                        break;
                     case 4:
                        var84 = 21;
                        break;
                     case 5:
                        var84 = 101;
                        break;
                     default:
                        var84 = 81;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     c = var21;
                     f = new String[24];
                     long var8 = 4931268133112260417L;
                     long[] var14 = new long[25];
                     int var11 = 0;
                     String var12 = "3ßs\u0088³K\u0017µ(j\u0094¸\u0096£$/Þ=\u0090:¨rø8\u0096£\u0017\u00ad»sdª\u001c®[Ñ%>Ý!aÝ\u00811nßÕl\u0099.\u0001H&Lû\u0016xr\u0004úÙSiæ\u001eÏ@ç¯æ£P-÷ÅÌ¢,°}\rJ/¢ ¸ä\u0017\u00109óIÒ\u0019u\u009bä·\u0004X\u0006\\ºø\u0095\u0095\u0090\u0010Q j\u0000\u009ee\u0099Ö>\u0098\u0098<è\fø\u0085!ÿæak\u0084±â]^ç\tÅ\u0017b\\\u0080#îj#§> (&aæ°g|\u008býô¬{\u0095\u0087\u0013\u00199©@Ó\u001a|ÆU\u008bW\u0085\u008a\u0087ôÐh\u0083\u0015àY";
                     int var13 = "3ßs\u0088³K\u0017µ(j\u0094¸\u0096£$/Þ=\u0090:¨rø8\u0096£\u0017\u00ad»sdª\u001c®[Ñ%>Ý!aÝ\u00811nßÕl\u0099.\u0001H&Lû\u0016xr\u0004úÙSiæ\u001eÏ@ç¯æ£P-÷ÅÌ¢,°}\rJ/¢ ¸ä\u0017\u00109óIÒ\u0019u\u009bä·\u0004X\u0006\\ºø\u0095\u0095\u0090\u0010Q j\u0000\u009ee\u0099Ö>\u0098\u0098<è\fø\u0085!ÿæak\u0084±â]^ç\tÅ\u0017b\\\u0080#îj#§> (&aæ°g|\u008býô¬{\u0095\u0087\u0013\u00199©@Ó\u001a|ÆU\u008bW\u0085\u008a\u0087ôÐh\u0083\u0015àY"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    h = var14;
                                    i = new Integer[25];
                                    long var0 = 5015786292918098338L;
                                    long[] var6 = new long[8];
                                    int var3 = 0;
                                    String var4 = "}²P\u00ad\u008d÷ìwl~yÆá\u0004¤G\u00100\u008e¼\\\u0004û\u001f&°¶\u0007NåI±'¨â¯4O\u00877^\u001bdø\u00adq\u0002Ñ";
                                    int var5 = "}²P\u00ad\u008d÷ìwl~yÆá\u0004¤G\u00100\u008e¼\\\u0004û\u001f&°¶\u0007NåI±'¨â¯4O\u00877^\u001bdø\u00adq\u0002Ñ"
                                       .length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   l = var6;
                                                   r = new Long[8];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "I\u001dóOü\u0084\u0093\u0001\u001bÙ\u0085¢\u0006ñr~";
                                                var5 = "I\u001dóOü\u0084\u0093\u0001\u001bÙ\u0085¢\u0006ñr~".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "wî\u0012W°+§¹çî©,\u008d/\u0007\u0080";
                                 var13 = "wî\u0012W°+§¹çî©,\u008d/\u0007\u0080".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "ª\u0088\u0002Fê";
                  var20 = "ª\u0088\u0002Fê".length();
                  var17 = 2;
                  var26 = -1;
            }

            var10000 = 126;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





