package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import com.finalshell.ui.panel.Ky4;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.MacAddress;

public class EnableServerEmulate {
   public InetAddress U;
   public int k;
   public HashMap O = new HashMap();
   public HashMap b = new HashMap();
   public int p = a(27671, 8373575933482908695L);
   public Random t = new Random();
   public PcapHandle K;
   public HashSet a = new HashSet();
   public HashMap x = new HashMap();
   public MacAddress d;
   public int H;
   public Packet L = null;
   public int u = 0;
   public static String[] c;
   public static String[] e;
   public static long[] f;
   public static Integer[] g;
   public static long h;

   public EnableServerEmulate(int var1, PcapHandle var2) {
      this.K = var2;
      this.H = var1;
   }

   public void L(Packet param1, EthernetPacket.EthernetHeader param2, IpV4Packet.IpV4Header param3, TcpPacket param4, boolean param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 4
      // 002: invokevirtual org/pcap4j/packet/TcpPacket.getHeader$TcpPacket_TcpHeader ()Lorg/pcap4j/packet/TcpPacket$TcpHeader;
      // 005: astore 7
      // 007: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 00a: aconst_null
      // 00b: astore 8
      // 00d: astore 6
      // 00f: aload 4
      // 011: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 014: aload 6
      // 016: ifnull 02f
      // 019: ifnull 036
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 022: athrow
      // 023: aload 4
      // 025: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 02e: athrow
      // 02f: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 034: astore 8
      // 036: iload 5
      // 038: aload 6
      // 03a: ifnull 1cd
      // 03d: ifeq 1c1
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 046: athrow
      // 047: aload 0
      // 048: aload 2
      // 049: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 04c: putfield com/finalshell/core/EnableServerEmulate.d Lorg/pcap4j/util/MacAddress;
      // 04f: aload 7
      // 051: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 054: aload 6
      // 056: ifnull 07c
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 05f: athrow
      // 060: ifeq 077
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 069: athrow
      // 06a: aload 7
      // 06c: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 06f: pop
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 076: athrow
      // 077: aload 7
      // 079: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 07c: aload 6
      // 07e: ifnull 097
      // 081: ifne 0cd
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 08a: athrow
      // 08b: aload 7
      // 08d: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 096: athrow
      // 097: aload 6
      // 099: ifnull 0cb
      // 09c: ifeq 0cd
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield com/finalshell/core/EnableServerEmulate.O Ljava/util/HashMap;
      // 0aa: aload 7
      // 0ac: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 0af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b2: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b5: pop
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/EnableServerEmulate.a Ljava/util/HashSet;
      // 0ba: aload 3
      // 0bb: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 0be: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 0c1: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 0ca: athrow
      // 0cb: istore 9
      // 0cd: aload 4
      // 0cf: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 0d2: ifnull 0e0
      // 0d5: new java/lang/String
      // 0d8: dup
      // 0d9: aload 8
      // 0db: invokespecial java/lang/String.<init> ([B)V
      // 0de: astore 9
      // 0e0: aload 7
      // 0e2: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 0e5: aload 0
      // 0e6: getfield com/finalshell/core/EnableServerEmulate.p I
      // 0e9: aload 6
      // 0eb: ifnull 10e
      // 0ee: if_icmple 108
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: aload 7
      // 0fb: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 0fe: putfield com/finalshell/core/EnableServerEmulate.p I
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 107: athrow
      // 108: getstatic com/finalshell/core/Connect.A I
      // 10b: getstatic com/finalshell/core/Connect.g I
      // 10e: if_icmpne 2f7
      // 111: aload 4
      // 113: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 116: ifnull 2f7
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 11f: athrow
      // 120: aload 7
      // 122: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 125: istore 9
      // 127: aload 0
      // 128: getfield com/finalshell/core/EnableServerEmulate.x Ljava/util/HashMap;
      // 12b: iload 9
      // 12d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 130: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 133: ifne 2f7
      // 136: new com/finalshell/core/AV
      // 139: dup
      // 13a: invokespecial com/finalshell/core/AV.<init> ()V
      // 13d: astore 10
      // 13f: aload 0
      // 140: getfield com/finalshell/core/EnableServerEmulate.x Ljava/util/HashMap;
      // 143: iload 9
      // 145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 148: aload 10
      // 14a: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 14d: pop
      // 14e: iload 9
      // 150: istore 11
      // 152: bipush 0
      // 153: istore 12
      // 155: aload 6
      // 157: ifnonnull 1a4
      // 15a: aload 1
      // 15b: iload 11
      // 15d: aload 0
      // 15e: getfield com/finalshell/core/EnableServerEmulate.t Ljava/util/Random;
      // 161: sipush 26427
      // 164: ldc2_w 3556159475663714101
      // 167: invokestatic com/finalshell/core/EnableServerEmulate.a (IJ)I
      // 16a: invokevirtual java/util/Random.nextInt (I)I
      // 16d: iadd
      // 16e: sipush 29145
      // 171: ldc2_w 5806713907765256659
      // 174: invokestatic com/finalshell/core/EnableServerEmulate.a (IJ)I
      // 177: newarray 8
      // 179: invokestatic com/finalshell/core/EnableServerEmulate.Y (Lorg/pcap4j/packet/Packet;I[B)Lorg/pcap4j/packet/Packet;
      // 17c: astore 13
      // 17e: aload 0
      // 17f: getfield com/finalshell/core/EnableServerEmulate.K Lorg/pcap4j/core/PcapHandle;
      // 182: aload 13
      // 184: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 187: goto 19b
      // 18a: astore 14
      // 18c: aload 14
      // 18e: invokevirtual org/pcap4j/core/PcapNativeException.printStackTrace ()V
      // 191: goto 19b
      // 194: astore 14
      // 196: aload 14
      // 198: invokevirtual org/pcap4j/core/NotOpenException.printStackTrace ()V
      // 19b: getstatic com/finalshell/core/EnableServerEmulate.h J
      // 19e: invokestatic java/lang/Thread.sleep (J)V
      // 1a1: iinc 12 1
      // 1a4: iload 12
      // 1a6: sipush 22102
      // 1a9: ldc2_w 161573514968893019
      // 1ac: invokestatic com/finalshell/core/EnableServerEmulate.a (IJ)I
      // 1af: if_icmplt 15a
      // 1b2: goto 2f7
      // 1b5: astore 10
      // 1b7: aload 10
      // 1b9: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1bc: aload 6
      // 1be: ifnonnull 2f7
      // 1c1: aload 7
      // 1c3: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 1cc: athrow
      // 1cd: aload 6
      // 1cf: ifnull 1e8
      // 1d2: ifeq 1e9
      // 1d5: goto 1dc
      // 1d8: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 1db: athrow
      // 1dc: aload 7
      // 1de: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 1e7: athrow
      // 1e8: pop
      // 1e9: aload 4
      // 1eb: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1ee: ifnull 2f7
      // 1f1: aload 7
      // 1f3: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 1f6: aload 8
      // 1f8: arraylength
      // 1f9: iadd
      // 1fa: istore 9
      // 1fc: aload 0
      // 1fd: getfield com/finalshell/core/EnableServerEmulate.b Ljava/util/HashMap;
      // 200: iload 9
      // 202: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 205: aload 6
      // 207: ifnull 236
      // 20a: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 20d: ifne 22d
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 216: athrow
      // 217: aload 0
      // 218: getfield com/finalshell/core/EnableServerEmulate.b Ljava/util/HashMap;
      // 21b: iload 9
      // 21d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 220: aload 4
      // 222: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 225: pop
      // 226: goto 22d
      // 229: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 22c: athrow
      // 22d: aload 0
      // 22e: getfield com/finalshell/core/EnableServerEmulate.O Ljava/util/HashMap;
      // 231: iload 9
      // 233: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 236: aload 4
      // 238: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 23b: pop
      // 23c: aload 0
      // 23d: aload 0
      // 23e: getfield com/finalshell/core/EnableServerEmulate.d Lorg/pcap4j/util/MacAddress;
      // 241: aload 2
      // 242: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 245: aload 3
      // 246: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 249: aload 7
      // 24b: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 24e: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 251: checkcast java/lang/Short
      // 254: invokevirtual java/lang/Short.shortValue ()S
      // 257: aload 3
      // 258: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 25b: aload 7
      // 25d: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 260: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 263: checkcast java/lang/Short
      // 266: invokevirtual java/lang/Short.shortValue ()S
      // 269: iload 9
      // 26b: aload 0
      // 26c: getfield com/finalshell/core/EnableServerEmulate.p I
      // 26f: invokevirtual com/finalshell/core/EnableServerEmulate.f (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;SLjava/net/Inet4Address;SII)Lorg/pcap4j/packet/Packet;
      // 272: astore 10
      // 274: aload 7
      // 276: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 279: istore 11
      // 27b: aload 0
      // 27c: getfield com/finalshell/core/EnableServerEmulate.x Ljava/util/HashMap;
      // 27f: iload 11
      // 281: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 284: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 287: aload 6
      // 289: ifnull 2db
      // 28c: ifne 2d8
      // 28f: goto 296
      // 292: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 295: athrow
      // 296: new com/finalshell/core/AV
      // 299: dup
      // 29a: invokespecial com/finalshell/core/AV.<init> ()V
      // 29d: astore 12
      // 29f: aload 0
      // 2a0: getfield com/finalshell/core/EnableServerEmulate.x Ljava/util/HashMap;
      // 2a3: iload 11
      // 2a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a8: aload 12
      // 2aa: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 2ad: pop
      // 2ae: bipush 0
      // 2af: istore 13
      // 2b1: aload 6
      // 2b3: ifnonnull 2c0
      // 2b6: iinc 13 1
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 2bf: athrow
      // 2c0: iload 13
      // 2c2: sipush 19552
      // 2c5: ldc2_w 2534144807940103279
      // 2c8: invokestatic com/finalshell/core/EnableServerEmulate.a (IJ)I
      // 2cb: if_icmplt 2b6
      // 2ce: goto 2d8
      // 2d1: astore 12
      // 2d3: aload 12
      // 2d5: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2d8: getstatic com/finalshell/core/Connect.A I
      // 2db: getstatic com/finalshell/core/Connect.Z I
      // 2de: if_icmpne 2f7
      // 2e1: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 2e4: sipush -15728
      // 2e7: sipush 13435
      // 2ea: invokestatic com/finalshell/core/EnableServerEmulate.a (II)Ljava/lang/String;
      // 2ed: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/EnableServerEmulate.a (Lorg/pcap4j/core/PcapNativeException;)Lorg/pcap4j/core/PcapNativeException;
      // 2f6: athrow
      // 2f7: return
   }

   public void B() {
      int var1 = 0;

      while (true) {
         var1++;

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var8) {
            var8.printStackTrace();
         }

         byte var2 = 3;
         AV var3 = new AV();
         this.x.put(Integer.valueOf(var2), var3);
         Packet var4 = Y(this.L, this.u + a(28386, 1027342367398117097L) * var1, new byte[a(24099, 5359861936110964258L)]);

         try {
            this.K.sendPacket(var4);
            System.out.println(a(-15727, -10382) + var4.getRawData().length);
         } catch (PcapNativeException var6) {
            var6.printStackTrace();
         } catch (NotOpenException var7) {
            var7.printStackTrace();
         }
      }
   }

   public static Packet Y(Packet var0, int var1, byte[] var2) {
      Packet var4 = null;
      EthernetPacket var5 = (EthernetPacket)var0;
      EthernetPacket.EthernetHeader var6 = var5.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var7 = (IpV4Packet)var5.getPayload();
      IpV4Packet.IpV4Header var8 = var7.getHeader$IpV4Packet_IpV4Header();
      TcpPacket var9 = (TcpPacket)var7.getPayload();
      TcpPacket.TcpHeader var10 = var9.getHeader$TcpPacket_TcpHeader();
      String[] var10000 = PingMessageR.N();
      short var11 = var10.getSrcPort().value();
      short var12 = var10.getDstPort().value();
      String[] var3 = var10000;
      TcpPacket.Builder var13 = new TcpPacket.Builder();
      if (var3 != null) {
         if (var9.getPayload() != null) {
            var13.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var2));
         }

         var13.correctChecksumAtBuild$TcpPacket_Builder(true);
         var13.correctLengthAtBuild$TcpPacket_Builder(true);
         var13.paddingAtBuild(true);
         var13.ack(true);
         var13.acknowledgmentNumber(var10.getAcknowledgmentNumber());
         var13.checksum(var10.getChecksum());
         var13.dataOffset(var10.getDataOffset());
         var13.dstAddr(var8.getDstAddr());
         var13.dstPort(new TcpPort((short)var12, ""));
         var13.fin(var10.getFin());
         var13.options(var10.getOptions());
         var13.padding(var10.getPadding());
         var13.psh(var10.getPsh());
         var13.reserved(var10.getReserved());
         var13.rst(var10.getRst());
         var13.sequenceNumber(var1);
         var13.srcAddr(var8.getSrcAddr());
         var13.srcPort(new TcpPort((short)var11, ""));
         var13.syn(var10.getSyn());
         var13.urg(var10.getUrg());
         var13.urgentPointer(var10.getUrgentPointer());
         var13.window(var10.getWindow());
      }

      IpV4Packet.Builder var14 = new IpV4Packet.Builder();
      var14.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var14.correctLengthAtBuild$IpV4Packet_Builder(true);
      var14.paddingAtBuild(true);
      var14.dstAddr(var8.getDstAddr());
      var14.fragmentOffset((short)0);
      var14.headerChecksum(var8.getHeaderChecksum());
      var14.identification(var8.getIdentification());
      var14.ihl((byte)5);
      var14.moreFragmentFlag(var8.getMoreFragmentFlag());
      var14.options(var8.getOptions());
      var14.padding(var8.getPadding());
      var14.protocol(IpNumber.TCP);
      var14.reservedFlag(var8.getReservedFlag());
      var14.srcAddr(var8.getSrcAddr());
      var14.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var14.totalLength((short)a(14128, 3302240601966602041L));
      var14.ttl((byte)a(25108, 1795155023343366679L));
      var14.version(IpVersion.IPV4);
      var14.payloadBuilder$IpV4Packet_Builder(var13);
      EthernetPacket.Builder var15 = new EthernetPacket.Builder();
      var15.dstAddr(var6.getDstAddr()).srcAddr(var6.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var14).paddingAtBuild(true);
      var4 = var15.build$EthernetPacket();
      if (var3 == null) {
         Ky4.K(new String[1]);
      }

      return var4;
   }

   public Packet a(Packet var1, int var2) {
      Packet var4 = null;
      EthernetPacket var5 = (EthernetPacket)var1;
      EthernetPacket.EthernetHeader var6 = var5.getHeader$EthernetPacket_EthernetHeader();
      IpV4Packet var7 = (IpV4Packet)var5.getPayload();
      IpV4Packet.IpV4Header var8 = var7.getHeader$IpV4Packet_IpV4Header();
      TcpPacket var9 = (TcpPacket)var7.getPayload();
      TcpPacket.TcpHeader var10 = var9.getHeader$TcpPacket_TcpHeader();
      PingMessageR.N();
      TcpPacket.Builder var11 = new TcpPacket.Builder();
      var11.payloadBuilder$TcpPacket_Builder(new UnknownPacket.Builder().rawData(var9.getPayload().getRawData()));
      var11.correctChecksumAtBuild$TcpPacket_Builder(true);
      var11.correctLengthAtBuild$TcpPacket_Builder(true);
      var11.paddingAtBuild(true);
      var11.ack(true);
      var11.acknowledgmentNumber(var10.getAcknowledgmentNumber());
      var11.checksum(var10.getChecksum());
      var11.dataOffset(var10.getDataOffset());
      var11.dstAddr(var8.getDstAddr());
      var11.dstPort(new TcpPort(var10.getDstPort().value(), ""));
      var11.fin(var10.getFin());
      var11.options(var10.getOptions());
      var11.padding(var10.getPadding());
      var11.psh(var10.getPsh());
      var11.reserved(var10.getReserved());
      var11.rst(var10.getRst());
      var11.sequenceNumber(var2);
      var11.srcAddr(var8.getSrcAddr());
      var11.srcPort(new TcpPort(var10.getSrcPort().value(), ""));
      var11.syn(var10.getSyn());
      var11.urg(var10.getUrg());
      var11.urgentPointer(var10.getUrgentPointer());
      var11.window(var10.getWindow());
      IpV4Packet.Builder var12 = new IpV4Packet.Builder();
      var12.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var12.correctLengthAtBuild$IpV4Packet_Builder(true);
      var12.paddingAtBuild(true);
      var12.dstAddr(var8.getDstAddr());
      var12.fragmentOffset((short)0);
      var12.headerChecksum(var8.getHeaderChecksum());
      var12.identification(var8.getIdentification());
      var12.ihl((byte)5);
      var12.moreFragmentFlag(var8.getMoreFragmentFlag());
      var12.options(var8.getOptions());
      var12.padding(var8.getPadding());
      var12.protocol(IpNumber.TCP);
      var12.reservedFlag(var8.getReservedFlag());
      var12.srcAddr(var8.getSrcAddr());
      var12.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var12.totalLength((short)a(14128, 3302240601966602041L));
      var12.ttl((byte)a(9447, 6315362085436749024L));
      var12.version(IpVersion.IPV4);
      var12.payloadBuilder$IpV4Packet_Builder(var11);
      EthernetPacket.Builder var13 = new EthernetPacket.Builder();
      var13.dstAddr(var6.getDstAddr()).srcAddr(var6.getSrcAddr()).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var12).paddingAtBuild(true);
      var4 = var13.build$EthernetPacket();
      if (Ky4.F$arrString() != null) {
         PingMessageR.p(new String[1]);
      }

      return var4;
   }

   public Packet f(MacAddress var1, MacAddress var2, Inet4Address var3, short var4, Inet4Address var5, short var6, int var7, int var8) {
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
      var9.window((short)a(7403, 2878021800271105255L));
      IpV4Packet.Builder var10 = new IpV4Packet.Builder();
      var10.correctChecksumAtBuild$IpV4Packet_Builder(true);
      var10.correctLengthAtBuild$IpV4Packet_Builder(true);
      var10.paddingAtBuild(true);
      var10.dstAddr(var5);
      var10.dontFragmentFlag(true);
      var10.fragmentOffset((short)0);
      short var11 = (short)Math.abs(this.t.nextInt(a(20504, 6098610844995420176L)));
      var10.identification(var11);
      var10.ihl((byte)5);
      var10.protocol(IpNumber.TCP);
      var10.srcAddr(var3);
      var10.tos(IpV4Rfc1349Tos.newInstance((byte)0));
      var10.totalLength((short)a(19839, 8143512145391689085L));
      var10.ttl((byte)a(14128, 3302240601966602041L));
      var10.version(IpVersion.IPV4);
      var10.payloadBuilder$IpV4Packet_Builder(var9);
      EthernetPacket.Builder var12 = new EthernetPacket.Builder();
      var12.dstAddr(var2).srcAddr(var1).type(EtherType.IPV4).payloadBuilder$EthernetPacket_Builder(var10).paddingAtBuild(true);
      EthernetPacket var13 = var12.build$EthernetPacket();
      IpV4Packet var14 = var10.build$IpV4Packet();
      TcpPacket var15 = var9.build$TcpPacket();
      this.a.add(var11);
      return var13;
   }

   public InetAddress q() {
      return this.U;
   }

   public void w(InetAddress var1) {
      this.U = var1;
   }

   public int c() {
      return this.k;
   }

   public void o(int var1) {
      this.k = var1;
   }

   public int A() {
      return this.H;
   }

   public void l(int var1) {
      this.H = var1;
   }

   public static PcapNativeException a(PcapNativeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -15727) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 158;
               break;
            case 1:
               var10000 = 85;
               break;
            case 2:
               var10000 = 245;
               break;
            case 3:
               var10000 = 243;
               break;
            case 4:
               var10000 = 167;
               break;
            case 5:
               var10000 = 35;
               break;
            case 6:
               var10000 = 110;
               break;
            case 7:
               var10000 = 53;
               break;
            case 8:
               var10000 = 196;
               break;
            case 9:
               var10000 = 28;
               break;
            case 10:
               var10000 = 160;
               break;
            case 11:
               var10000 = 84;
               break;
            case 12:
               var10000 = 203;
               break;
            case 13:
               var10000 = 141;
               break;
            case 14:
               var10000 = 251;
               break;
            case 15:
               var10000 = 189;
               break;
            case 16:
               var10000 = 222;
               break;
            case 17:
               var10000 = 64;
               break;
            case 18:
               var10000 = 179;
               break;
            case 19:
               var10000 = 109;
               break;
            case 20:
               var10000 = 49;
               break;
            case 21:
               var10000 = 205;
               break;
            case 22:
               var10000 = 105;
               break;
            case 23:
               var10000 = 238;
               break;
            case 24:
               var10000 = 228;
               break;
            case 25:
               var10000 = 74;
               break;
            case 26:
               var10000 = 142;
               break;
            case 27:
               var10000 = 98;
               break;
            case 28:
               var10000 = 224;
               break;
            case 29:
               var10000 = 71;
               break;
            case 30:
               var10000 = 6;
               break;
            case 31:
               var10000 = 221;
               break;
            case 32:
               var10000 = 248;
               break;
            case 33:
               var10000 = 117;
               break;
            case 34:
               var10000 = 2;
               break;
            case 35:
               var10000 = 133;
               break;
            case 36:
               var10000 = 65;
               break;
            case 37:
               var10000 = 180;
               break;
            case 38:
               var10000 = 67;
               break;
            case 39:
               var10000 = 130;
               break;
            case 40:
               var10000 = 201;
               break;
            case 41:
               var10000 = 44;
               break;
            case 42:
               var10000 = 119;
               break;
            case 43:
               var10000 = 1;
               break;
            case 44:
               var10000 = 124;
               break;
            case 45:
               var10000 = 94;
               break;
            case 46:
               var10000 = 61;
               break;
            case 47:
               var10000 = 93;
               break;
            case 48:
               var10000 = 4;
               break;
            case 49:
               var10000 = 181;
               break;
            case 50:
               var10000 = 170;
               break;
            case 51:
               var10000 = 129;
               break;
            case 52:
               var10000 = 204;
               break;
            case 53:
               var10000 = 101;
               break;
            case 54:
               var10000 = 157;
               break;
            case 55:
               var10000 = 103;
               break;
            case 56:
               var10000 = 175;
               break;
            case 57:
               var10000 = 11;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 62;
               break;
            case 60:
               var10000 = 112;
               break;
            case 61:
               var10000 = 164;
               break;
            case 62:
               var10000 = 231;
               break;
            case 63:
               var10000 = 146;
               break;
            case 64:
               var10000 = 218;
               break;
            case 65:
               var10000 = 92;
               break;
            case 66:
               var10000 = 225;
               break;
            case 67:
               var10000 = 14;
               break;
            case 68:
               var10000 = 27;
               break;
            case 69:
               var10000 = 36;
               break;
            case 70:
               var10000 = 159;
               break;
            case 71:
               var10000 = 113;
               break;
            case 72:
               var10000 = 18;
               break;
            case 73:
               var10000 = 138;
               break;
            case 74:
               var10000 = 192;
               break;
            case 75:
               var10000 = 42;
               break;
            case 76:
               var10000 = 195;
               break;
            case 77:
               var10000 = 144;
               break;
            case 78:
               var10000 = 45;
               break;
            case 79:
               var10000 = 216;
               break;
            case 80:
               var10000 = 193;
               break;
            case 81:
               var10000 = 127;
               break;
            case 82:
               var10000 = 173;
               break;
            case 83:
               var10000 = 229;
               break;
            case 84:
               var10000 = 246;
               break;
            case 85:
               var10000 = 128;
               break;
            case 86:
               var10000 = 197;
               break;
            case 87:
               var10000 = 200;
               break;
            case 88:
               var10000 = 90;
               break;
            case 89:
               var10000 = 86;
               break;
            case 90:
               var10000 = 249;
               break;
            case 91:
               var10000 = 70;
               break;
            case 92:
               var10000 = 154;
               break;
            case 93:
               var10000 = 17;
               break;
            case 94:
               var10000 = 254;
               break;
            case 95:
               var10000 = 210;
               break;
            case 96:
               var10000 = 178;
               break;
            case 97:
               var10000 = 43;
               break;
            case 98:
               var10000 = 247;
               break;
            case 99:
               var10000 = 151;
               break;
            case 100:
               var10000 = 95;
               break;
            case 101:
               var10000 = 69;
               break;
            case 102:
               var10000 = 207;
               break;
            case 103:
               var10000 = 165;
               break;
            case 104:
               var10000 = 145;
               break;
            case 105:
               var10000 = 155;
               break;
            case 106:
               var10000 = 41;
               break;
            case 107:
               var10000 = 108;
               break;
            case 108:
               var10000 = 73;
               break;
            case 109:
               var10000 = 212;
               break;
            case 110:
               var10000 = 50;
               break;
            case 111:
               var10000 = 46;
               break;
            case 112:
               var10000 = 163;
               break;
            case 113:
               var10000 = 217;
               break;
            case 114:
               var10000 = 169;
               break;
            case 115:
               var10000 = 199;
               break;
            case 116:
               var10000 = 156;
               break;
            case 117:
               var10000 = 37;
               break;
            case 118:
               var10000 = 131;
               break;
            case 119:
               var10000 = 75;
               break;
            case 120:
               var10000 = 3;
               break;
            case 121:
               var10000 = 55;
               break;
            case 122:
               var10000 = 80;
               break;
            case 123:
               var10000 = 242;
               break;
            case 124:
               var10000 = 190;
               break;
            case 125:
               var10000 = 60;
               break;
            case 126:
               var10000 = 116;
               break;
            case 127:
               var10000 = 72;
               break;
            case 128:
               var10000 = 183;
               break;
            case 129:
               var10000 = 152;
               break;
            case 130:
               var10000 = 89;
               break;
            case 131:
               var10000 = 123;
               break;
            case 132:
               var10000 = 137;
               break;
            case 133:
               var10000 = 134;
               break;
            case 134:
               var10000 = 252;
               break;
            case 135:
               var10000 = 176;
               break;
            case 136:
               var10000 = 5;
               break;
            case 137:
               var10000 = 107;
               break;
            case 138:
               var10000 = 219;
               break;
            case 139:
               var10000 = 32;
               break;
            case 140:
               var10000 = 34;
               break;
            case 141:
               var10000 = 202;
               break;
            case 142:
               var10000 = 120;
               break;
            case 143:
               var10000 = 31;
               break;
            case 144:
               var10000 = 63;
               break;
            case 145:
               var10000 = 22;
               break;
            case 146:
               var10000 = 111;
               break;
            case 147:
               var10000 = 166;
               break;
            case 148:
               var10000 = 223;
               break;
            case 149:
               var10000 = 48;
               break;
            case 150:
               var10000 = 237;
               break;
            case 151:
               var10000 = 241;
               break;
            case 152:
               var10000 = 198;
               break;
            case 153:
               var10000 = 250;
               break;
            case 154:
               var10000 = 122;
               break;
            case 155:
               var10000 = 76;
               break;
            case 156:
               var10000 = 118;
               break;
            case 157:
               var10000 = 81;
               break;
            case 158:
               var10000 = 52;
               break;
            case 159:
               var10000 = 39;
               break;
            case 160:
               var10000 = 57;
               break;
            case 161:
               var10000 = 56;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 99;
               break;
            case 164:
               var10000 = 102;
               break;
            case 165:
               var10000 = 66;
               break;
            case 166:
               var10000 = 24;
               break;
            case 167:
               var10000 = 143;
               break;
            case 168:
               var10000 = 104;
               break;
            case 169:
               var10000 = 255;
               break;
            case 170:
               var10000 = 26;
               break;
            case 171:
               var10000 = 13;
               break;
            case 172:
               var10000 = 244;
               break;
            case 173:
               var10000 = 172;
               break;
            case 174:
               var10000 = 168;
               break;
            case 175:
               var10000 = 162;
               break;
            case 176:
               var10000 = 140;
               break;
            case 177:
               var10000 = 233;
               break;
            case 178:
               var10000 = 125;
               break;
            case 179:
               var10000 = 88;
               break;
            case 180:
               var10000 = 213;
               break;
            case 181:
               var10000 = 100;
               break;
            case 182:
               var10000 = 185;
               break;
            case 183:
               var10000 = 58;
               break;
            case 184:
               var10000 = 19;
               break;
            case 185:
               var10000 = 106;
               break;
            case 186:
               var10000 = 10;
               break;
            case 187:
               var10000 = 239;
               break;
            case 188:
               var10000 = 191;
               break;
            case 189:
               var10000 = 97;
               break;
            case 190:
               var10000 = 240;
               break;
            case 191:
               var10000 = 115;
               break;
            case 192:
               var10000 = 77;
               break;
            case 193:
               var10000 = 235;
               break;
            case 194:
               var10000 = 220;
               break;
            case 195:
               var10000 = 59;
               break;
            case 196:
               var10000 = 148;
               break;
            case 197:
               var10000 = 227;
               break;
            case 198:
               var10000 = 33;
               break;
            case 199:
               var10000 = 8;
               break;
            case 200:
               var10000 = 132;
               break;
            case 201:
               var10000 = 114;
               break;
            case 202:
               var10000 = 188;
               break;
            case 203:
               var10000 = 78;
               break;
            case 204:
               var10000 = 54;
               break;
            case 205:
               var10000 = 139;
               break;
            case 206:
               var10000 = 174;
               break;
            case 207:
               var10000 = 150;
               break;
            case 208:
               var10000 = 187;
               break;
            case 209:
               var10000 = 149;
               break;
            case 210:
               var10000 = 177;
               break;
            case 211:
               var10000 = 9;
               break;
            case 212:
               var10000 = 186;
               break;
            case 213:
               var10000 = 7;
               break;
            case 214:
               var10000 = 147;
               break;
            case 215:
               var10000 = 29;
               break;
            case 216:
               var10000 = 38;
               break;
            case 217:
               var10000 = 121;
               break;
            case 218:
               var10000 = 79;
               break;
            case 219:
               var10000 = 136;
               break;
            case 220:
               var10000 = 194;
               break;
            case 221:
               var10000 = 15;
               break;
            case 222:
               var10000 = 153;
               break;
            case 223:
               var10000 = 253;
               break;
            case 224:
               var10000 = 184;
               break;
            case 225:
               var10000 = 51;
               break;
            case 226:
               var10000 = 230;
               break;
            case 227:
               var10000 = 30;
               break;
            case 228:
               var10000 = 82;
               break;
            case 229:
               var10000 = 96;
               break;
            case 230:
               var10000 = 211;
               break;
            case 231:
               var10000 = 68;
               break;
            case 232:
               var10000 = 209;
               break;
            case 233:
               var10000 = 21;
               break;
            case 234:
               var10000 = 171;
               break;
            case 235:
               var10000 = 215;
               break;
            case 236:
               var10000 = 232;
               break;
            case 237:
               var10000 = 23;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 226;
               break;
            case 240:
               var10000 = 182;
               break;
            case 241:
               var10000 = 206;
               break;
            case 242:
               var10000 = 47;
               break;
            case 243:
               var10000 = 126;
               break;
            case 244:
               var10000 = 208;
               break;
            case 245:
               var10000 = 87;
               break;
            case 246:
               var10000 = 20;
               break;
            case 247:
               var10000 = 91;
               break;
            case 248:
               var10000 = 0;
               break;
            case 249:
               var10000 = 161;
               break;
            case 250:
               var10000 = 135;
               break;
            case 251:
               var10000 = 83;
               break;
            case 252:
               var10000 = 236;
               break;
            case 253:
               var10000 = 234;
               break;
            case 254:
               var10000 = 12;
               break;
            default:
               var10000 = 40;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20491;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[2];
      int var13 = 0;
      String var12 = "危遏櫭抁Ù\u0007弣吰杠勻税櫉抹";
      int var14 = "危遏櫭抁Ù\u0007弣吰杠勻税櫉抹".length();
      char var11 = 5;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var31 = 124;
            var10002 = var10003;
            int var19 = var10004;
            byte var36;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var36 = 124;
               var10006 = var16;
            } else {
               var31 = 124;
               var19 = var10004;
               if (var10004 <= var16) {
                  break label56;
               }

               var10005 = var10003;
               var36 = 124;
               var10006 = var16;
            }

            while (true) {
               char var50 = var10005[var10006];
               byte var51;
               switch (var16 % 7) {
                  case 0:
                     var51 = 39;
                     break;
                  case 1:
                     var51 = 82;
                     break;
                  case 2:
                     var51 = 30;
                     break;
                  case 3:
                     var51 = 47;
                     break;
                  case 4:
                     var51 = 113;
                     break;
                  case 5:
                     var51 = 20;
                     break;
                  default:
                     var51 = 104;
               }

               var10005[var10006] = (char)(var50 ^ var36 ^ var51);
               var16++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var36 = var31;
               } else {
                  if (var19 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var36 = var31;
                  var10006 = var16;
               }
            }
         }

         String var33 = new String(var10002).intern();
         int var21 = -1;
         var15[var13++] = var33;
         if ((var10 += var11) >= var14) {
            c = var15;
            e = new String[2];
            long var2 = 3048035834704825174L;
            long[] var8 = new long[13];
            int var5 = 0;
            String var6 = "\u0092H\u0092\u001aáG0c$\u0007¸äî\u0095+©À>\u0081X\u009d)l[Ð\u001fFk)rt¹_j@¾ø\u0095\u0097'µ\u000bºOá\u00ad\u001bsf»\u000fy:ì¬-§Ò9º\u008d<¸\u008dûèÂüÍ\u001d¹\u0001öÛe\u0080,\u0018\u0096\u001fn`\"Ä=6\u0000`";
            int var7 = "\u0092H\u0092\u001aáG0c$\u0007¸äî\u0095+©À>\u0081X\u009d)l[Ð\u001fFk)rt¹_j@¾ø\u0095\u0097'µ\u000bºOá\u00ad\u001bsf»\u000fy:ì¬-§Ò9º\u008d<¸\u008dûèÂüÍ\u001d¹\u0001öÛe\u0080,\u0018\u0096\u001fn`\"Ä=6\u0000`"
               .length();
            byte var4 = 0;

            label40:
            while (true) {
               var21 = var4;
               var4 += 8;
               byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
               long[] var10000 = var8;
               var21 = var5++;
               long var28 = ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L;
               byte var34 = -1;

               while (true) {
                  long var41 = var28 ^ var2;
                  switch (var34) {
                     case 0:
                        var10000[var21] = var41;
                        if (var4 >= var7) {
                           f = var8;
                           g = new Integer[13];
                           long var0 = 7024049030228112637L;
                           long var30 = 7024049030228112638L ^ var0;
                           byte var25 = -1;
                           h = var30;
                           return;
                        }
                        break;
                     default:
                        var10000[var21] = var41;
                        if (var4 < var7) {
                           continue label40;
                        }

                        var6 = "\næíÊ\u0081<7Aÿ]ê#\u0004S\u007fö";
                        var7 = "\næíÊ\u0081<7Aÿ]ê#\u0004S\u007fö".length();
                        var4 = 0;
                  }

                  byte var24 = var4;
                  var4 += 8;
                  var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  var10000 = var8;
                  var21 = var5++;
                  var28 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  var34 = 0;
               }
            }
         }

         var11 = var12.charAt(var10);
      }
   }
}





