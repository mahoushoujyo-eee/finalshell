package com.finalshell.core;

import org.pcap4j.core.PacketListener;
import org.pcap4j.packet.Packet;

public class ConnectionPacketListener2 implements PacketListener {
   public final LC X;
   public static String[] a;
   public static String[] b;
   public static long c;

   public ConnectionPacketListener2(LC var1) {
      this.X = var1;
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
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnonnull 01e
      // 009: instanceof org/pcap4j/packet/EthernetPacket
      // 00c: ifeq 205
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 1
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: checkcast org/pcap4j/packet/EthernetPacket
      // 021: astore 3
      // 022: aload 3
      // 023: invokevirtual org/pcap4j/packet/EthernetPacket.getHeader$EthernetPacket_EthernetHeader ()Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;
      // 026: astore 4
      // 028: aload 3
      // 029: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 02c: aload 2
      // 02d: ifnonnull 048
      // 030: instanceof org/pcap4j/packet/IpV4Packet
      // 033: ifeq 205
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: aload 3
      // 03e: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: checkcast org/pcap4j/packet/IpV4Packet
      // 04b: astore 5
      // 04d: aload 5
      // 04f: invokevirtual org/pcap4j/packet/IpV4Packet.getHeader$IpV4Packet_IpV4Header ()Lorg/pcap4j/packet/IpV4Packet$IpV4Header;
      // 052: astore 6
      // 054: aload 5
      // 056: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 059: instanceof org/pcap4j/packet/TcpPacket
      // 05c: aload 2
      // 05d: ifnonnull 1eb
      // 060: ifeq 1dd
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 5
      // 06c: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 06f: checkcast org/pcap4j/packet/TcpPacket
      // 072: astore 7
      // 074: aload 7
      // 076: invokevirtual org/pcap4j/packet/TcpPacket.getHeader$TcpPacket_TcpHeader ()Lorg/pcap4j/packet/TcpPacket$TcpHeader;
      // 079: astore 8
      // 07b: aconst_null
      // 07c: astore 9
      // 07e: aload 6
      // 080: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 083: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 086: sipush -7448
      // 089: sipush -28089
      // 08c: invokestatic com/finalshell/core/Connect4.a (II)Ljava/lang/String;
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: aload 2
      // 093: ifnonnull 0b5
      // 096: ifeq 164
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: aload 8
      // 0a2: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0a5: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 0a8: checkcast java/lang/Short
      // 0ab: invokevirtual java/lang/Short.shortValue ()S
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 2
      // 0b6: ifnonnull 0d3
      // 0b9: getstatic com/finalshell/core/Connect4.c J
      // 0bc: l2i
      // 0bd: if_icmpne 164
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 8
      // 0c9: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: ifeq 164
      // 0d6: new com/finalshell/connection/DelayedAckSACK
      // 0d9: dup
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/Connect4.X Lcom/finalshell/core/LC;
      // 0de: getfield com/finalshell/core/LC.k Lorg/pcap4j/core/PcapHandle;
      // 0e1: invokespecial com/finalshell/connection/DelayedAckSACK.<init> (Lorg/pcap4j/core/PcapHandle;)V
      // 0e4: astore 9
      // 0e6: aload 9
      // 0e8: aload 8
      // 0ea: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0ed: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 0f0: invokevirtual com/finalshell/connection/DelayedAckSACK.d (I)V
      // 0f3: aload 9
      // 0f5: aload 6
      // 0f7: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 0fa: invokevirtual com/finalshell/connection/DelayedAckSACK.V (Ljava/net/InetAddress;)V
      // 0fd: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 100: new java/lang/StringBuilder
      // 103: dup
      // 104: sipush -7447
      // 107: sipush 3969
      // 10a: invokestatic com/finalshell/core/Connect4.a (II)Ljava/lang/String;
      // 10d: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 110: aload 6
      // 112: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 115: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: ldc ":"
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: aload 8
      // 122: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 125: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 128: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12b: sipush -7446
      // 12e: sipush 26263
      // 131: invokestatic com/finalshell/core/Connect4.a (II)Ljava/lang/String;
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: aload 6
      // 139: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 13c: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: ldc ":"
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: aload 8
      // 149: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 14c: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 14f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 158: aload 0
      // 159: getfield com/finalshell/core/Connect4.X Lcom/finalshell/core/LC;
      // 15c: getfield com/finalshell/core/LC.o Lcom/finalshell/core/Fm4;
      // 15f: aload 9
      // 161: invokevirtual com/finalshell/core/Fm4.l (Lcom/finalshell/connection/DelayedAckSACK;)V
      // 164: aload 0
      // 165: getfield com/finalshell/core/Connect4.X Lcom/finalshell/core/LC;
      // 168: getfield com/finalshell/core/LC.o Lcom/finalshell/core/Fm4;
      // 16b: aload 6
      // 16d: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 170: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 173: aload 8
      // 175: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 178: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 17b: invokevirtual com/finalshell/core/Fm4.d (Ljava/lang/String;I)Lcom/finalshell/connection/DelayedAckSACK;
      // 17e: astore 9
      // 180: aload 9
      // 182: aload 2
      // 183: ifnonnull 192
      // 186: ifnull 19d
      // 189: goto 190
      // 18c: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: aload 9
      // 192: aload 1
      // 193: aload 4
      // 195: aload 6
      // 197: aload 7
      // 199: bipush 1
      // 19a: invokevirtual com/finalshell/connection/DelayedAckSACK.l (Lorg/pcap4j/packet/Packet;Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;Lorg/pcap4j/packet/TcpPacket;Z)V
      // 19d: aconst_null
      // 19e: astore 10
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/Connect4.X Lcom/finalshell/core/LC;
      // 1a4: getfield com/finalshell/core/LC.o Lcom/finalshell/core/Fm4;
      // 1a7: aload 6
      // 1a9: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getDstAddr ()Ljava/net/Inet4Address;
      // 1ac: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 1af: aload 8
      // 1b1: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 1b4: invokevirtual org/pcap4j/packet/namednumber/TcpPort.valueAsInt ()I
      // 1b7: invokevirtual com/finalshell/core/Fm4.d (Ljava/lang/String;I)Lcom/finalshell/connection/DelayedAckSACK;
      // 1ba: astore 10
      // 1bc: aload 10
      // 1be: aload 2
      // 1bf: ifnonnull 1ce
      // 1c2: ifnull 205
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: aload 10
      // 1ce: aload 1
      // 1cf: aload 4
      // 1d1: aload 6
      // 1d3: aload 7
      // 1d5: bipush 0
      // 1d6: invokevirtual com/finalshell/connection/DelayedAckSACK.l (Lorg/pcap4j/packet/Packet;Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;Lorg/pcap4j/packet/TcpPacket;Z)V
      // 1d9: aload 2
      // 1da: ifnull 205
      // 1dd: aload 3
      // 1de: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1e1: instanceof org/pcap4j/packet/IllegalPacket
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/Connect4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: ifeq 205
      // 1ee: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1f1: sipush -7445
      // 1f4: sipush -28543
      // 1f7: invokestatic com/finalshell/core/Connect4.a (II)Ljava/lang/String;
      // 1fa: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1fd: goto 205
      // 200: astore 3
      // 201: aload 3
      // 202: invokevirtual java/lang/Exception.printStackTrace ()V
      // 205: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -7445) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 238;
               break;
            case 1:
               var10000 = 141;
               break;
            case 2:
               var10000 = 81;
               break;
            case 3:
               var10000 = 128;
               break;
            case 4:
               var10000 = 50;
               break;
            case 5:
               var10000 = 154;
               break;
            case 6:
               var10000 = 58;
               break;
            case 7:
               var10000 = 3;
               break;
            case 8:
               var10000 = 214;
               break;
            case 9:
               var10000 = 96;
               break;
            case 10:
               var10000 = 56;
               break;
            case 11:
               var10000 = 16;
               break;
            case 12:
               var10000 = 9;
               break;
            case 13:
               var10000 = 162;
               break;
            case 14:
               var10000 = 118;
               break;
            case 15:
               var10000 = 184;
               break;
            case 16:
               var10000 = 155;
               break;
            case 17:
               var10000 = 205;
               break;
            case 18:
               var10000 = 143;
               break;
            case 19:
               var10000 = 231;
               break;
            case 20:
               var10000 = 79;
               break;
            case 21:
               var10000 = 26;
               break;
            case 22:
               var10000 = 129;
               break;
            case 23:
               var10000 = 178;
               break;
            case 24:
               var10000 = 0;
               break;
            case 25:
               var10000 = 176;
               break;
            case 26:
               var10000 = 47;
               break;
            case 27:
               var10000 = 55;
               break;
            case 28:
               var10000 = 87;
               break;
            case 29:
               var10000 = 84;
               break;
            case 30:
               var10000 = 59;
               break;
            case 31:
               var10000 = 250;
               break;
            case 32:
               var10000 = 113;
               break;
            case 33:
               var10000 = 8;
               break;
            case 34:
               var10000 = 148;
               break;
            case 35:
               var10000 = 54;
               break;
            case 36:
               var10000 = 117;
               break;
            case 37:
               var10000 = 174;
               break;
            case 38:
               var10000 = 48;
               break;
            case 39:
               var10000 = 246;
               break;
            case 40:
               var10000 = 239;
               break;
            case 41:
               var10000 = 67;
               break;
            case 42:
               var10000 = 103;
               break;
            case 43:
               var10000 = 127;
               break;
            case 44:
               var10000 = 4;
               break;
            case 45:
               var10000 = 7;
               break;
            case 46:
               var10000 = 63;
               break;
            case 47:
               var10000 = 105;
               break;
            case 48:
               var10000 = 68;
               break;
            case 49:
               var10000 = 88;
               break;
            case 50:
               var10000 = 90;
               break;
            case 51:
               var10000 = 114;
               break;
            case 52:
               var10000 = 139;
               break;
            case 53:
               var10000 = 110;
               break;
            case 54:
               var10000 = 124;
               break;
            case 55:
               var10000 = 120;
               break;
            case 56:
               var10000 = 72;
               break;
            case 57:
               var10000 = 2;
               break;
            case 58:
               var10000 = 6;
               break;
            case 59:
               var10000 = 229;
               break;
            case 60:
               var10000 = 123;
               break;
            case 61:
               var10000 = 12;
               break;
            case 62:
               var10000 = 33;
               break;
            case 63:
               var10000 = 198;
               break;
            case 64:
               var10000 = 219;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 32;
               break;
            case 67:
               var10000 = 133;
               break;
            case 68:
               var10000 = 218;
               break;
            case 69:
               var10000 = 187;
               break;
            case 70:
               var10000 = 98;
               break;
            case 71:
               var10000 = 95;
               break;
            case 72:
               var10000 = 34;
               break;
            case 73:
               var10000 = 165;
               break;
            case 74:
               var10000 = 171;
               break;
            case 75:
               var10000 = 190;
               break;
            case 76:
               var10000 = 208;
               break;
            case 77:
               var10000 = 136;
               break;
            case 78:
               var10000 = 146;
               break;
            case 79:
               var10000 = 25;
               break;
            case 80:
               var10000 = 125;
               break;
            case 81:
               var10000 = 247;
               break;
            case 82:
               var10000 = 94;
               break;
            case 83:
               var10000 = 116;
               break;
            case 84:
               var10000 = 17;
               break;
            case 85:
               var10000 = 134;
               break;
            case 86:
               var10000 = 89;
               break;
            case 87:
               var10000 = 71;
               break;
            case 88:
               var10000 = 131;
               break;
            case 89:
               var10000 = 51;
               break;
            case 90:
               var10000 = 1;
               break;
            case 91:
               var10000 = 150;
               break;
            case 92:
               var10000 = 145;
               break;
            case 93:
               var10000 = 153;
               break;
            case 94:
               var10000 = 232;
               break;
            case 95:
               var10000 = 173;
               break;
            case 96:
               var10000 = 27;
               break;
            case 97:
               var10000 = 36;
               break;
            case 98:
               var10000 = 112;
               break;
            case 99:
               var10000 = 254;
               break;
            case 100:
               var10000 = 77;
               break;
            case 101:
               var10000 = 236;
               break;
            case 102:
               var10000 = 138;
               break;
            case 103:
               var10000 = 233;
               break;
            case 104:
               var10000 = 142;
               break;
            case 105:
               var10000 = 70;
               break;
            case 106:
               var10000 = 85;
               break;
            case 107:
               var10000 = 180;
               break;
            case 108:
               var10000 = 253;
               break;
            case 109:
               var10000 = 5;
               break;
            case 110:
               var10000 = 202;
               break;
            case 111:
               var10000 = 166;
               break;
            case 112:
               var10000 = 93;
               break;
            case 113:
               var10000 = 212;
               break;
            case 114:
               var10000 = 121;
               break;
            case 115:
               var10000 = 64;
               break;
            case 116:
               var10000 = 19;
               break;
            case 117:
               var10000 = 243;
               break;
            case 118:
               var10000 = 179;
               break;
            case 119:
               var10000 = 53;
               break;
            case 120:
               var10000 = 168;
               break;
            case 121:
               var10000 = 46;
               break;
            case 122:
               var10000 = 18;
               break;
            case 123:
               var10000 = 109;
               break;
            case 124:
               var10000 = 137;
               break;
            case 125:
               var10000 = 99;
               break;
            case 126:
               var10000 = 132;
               break;
            case 127:
               var10000 = 228;
               break;
            case 128:
               var10000 = 45;
               break;
            case 129:
               var10000 = 44;
               break;
            case 130:
               var10000 = 69;
               break;
            case 131:
               var10000 = 91;
               break;
            case 132:
               var10000 = 191;
               break;
            case 133:
               var10000 = 161;
               break;
            case 134:
               var10000 = 100;
               break;
            case 135:
               var10000 = 251;
               break;
            case 136:
               var10000 = 76;
               break;
            case 137:
               var10000 = 60;
               break;
            case 138:
               var10000 = 140;
               break;
            case 139:
               var10000 = 28;
               break;
            case 140:
               var10000 = 14;
               break;
            case 141:
               var10000 = 225;
               break;
            case 142:
               var10000 = 144;
               break;
            case 143:
               var10000 = 207;
               break;
            case 144:
               var10000 = 82;
               break;
            case 145:
               var10000 = 57;
               break;
            case 146:
               var10000 = 49;
               break;
            case 147:
               var10000 = 159;
               break;
            case 148:
               var10000 = 175;
               break;
            case 149:
               var10000 = 201;
               break;
            case 150:
               var10000 = 169;
               break;
            case 151:
               var10000 = 20;
               break;
            case 152:
               var10000 = 152;
               break;
            case 153:
               var10000 = 220;
               break;
            case 154:
               var10000 = 223;
               break;
            case 155:
               var10000 = 186;
               break;
            case 156:
               var10000 = 188;
               break;
            case 157:
               var10000 = 104;
               break;
            case 158:
               var10000 = 126;
               break;
            case 159:
               var10000 = 13;
               break;
            case 160:
               var10000 = 35;
               break;
            case 161:
               var10000 = 206;
               break;
            case 162:
               var10000 = 167;
               break;
            case 163:
               var10000 = 204;
               break;
            case 164:
               var10000 = 242;
               break;
            case 165:
               var10000 = 222;
               break;
            case 166:
               var10000 = 240;
               break;
            case 167:
               var10000 = 149;
               break;
            case 168:
               var10000 = 41;
               break;
            case 169:
               var10000 = 92;
               break;
            case 170:
               var10000 = 65;
               break;
            case 171:
               var10000 = 10;
               break;
            case 172:
               var10000 = 24;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 157;
               break;
            case 175:
               var10000 = 249;
               break;
            case 176:
               var10000 = 158;
               break;
            case 177:
               var10000 = 52;
               break;
            case 178:
               var10000 = 147;
               break;
            case 179:
               var10000 = 43;
               break;
            case 180:
               var10000 = 230;
               break;
            case 181:
               var10000 = 193;
               break;
            case 182:
               var10000 = 29;
               break;
            case 183:
               var10000 = 252;
               break;
            case 184:
               var10000 = 102;
               break;
            case 185:
               var10000 = 21;
               break;
            case 186:
               var10000 = 244;
               break;
            case 187:
               var10000 = 156;
               break;
            case 188:
               var10000 = 80;
               break;
            case 189:
               var10000 = 209;
               break;
            case 190:
               var10000 = 241;
               break;
            case 191:
               var10000 = 160;
               break;
            case 192:
               var10000 = 181;
               break;
            case 193:
               var10000 = 217;
               break;
            case 194:
               var10000 = 31;
               break;
            case 195:
               var10000 = 83;
               break;
            case 196:
               var10000 = 255;
               break;
            case 197:
               var10000 = 170;
               break;
            case 198:
               var10000 = 97;
               break;
            case 199:
               var10000 = 122;
               break;
            case 200:
               var10000 = 38;
               break;
            case 201:
               var10000 = 74;
               break;
            case 202:
               var10000 = 101;
               break;
            case 203:
               var10000 = 108;
               break;
            case 204:
               var10000 = 115;
               break;
            case 205:
               var10000 = 182;
               break;
            case 206:
               var10000 = 11;
               break;
            case 207:
               var10000 = 37;
               break;
            case 208:
               var10000 = 235;
               break;
            case 209:
               var10000 = 62;
               break;
            case 210:
               var10000 = 130;
               break;
            case 211:
               var10000 = 197;
               break;
            case 212:
               var10000 = 216;
               break;
            case 213:
               var10000 = 248;
               break;
            case 214:
               var10000 = 177;
               break;
            case 215:
               var10000 = 66;
               break;
            case 216:
               var10000 = 135;
               break;
            case 217:
               var10000 = 30;
               break;
            case 218:
               var10000 = 199;
               break;
            case 219:
               var10000 = 189;
               break;
            case 220:
               var10000 = 151;
               break;
            case 221:
               var10000 = 237;
               break;
            case 222:
               var10000 = 215;
               break;
            case 223:
               var10000 = 40;
               break;
            case 224:
               var10000 = 203;
               break;
            case 225:
               var10000 = 75;
               break;
            case 226:
               var10000 = 227;
               break;
            case 227:
               var10000 = 195;
               break;
            case 228:
               var10000 = 61;
               break;
            case 229:
               var10000 = 196;
               break;
            case 230:
               var10000 = 210;
               break;
            case 231:
               var10000 = 163;
               break;
            case 232:
               var10000 = 106;
               break;
            case 233:
               var10000 = 172;
               break;
            case 234:
               var10000 = 211;
               break;
            case 235:
               var10000 = 42;
               break;
            case 236:
               var10000 = 39;
               break;
            case 237:
               var10000 = 224;
               break;
            case 238:
               var10000 = 107;
               break;
            case 239:
               var10000 = 111;
               break;
            case 240:
               var10000 = 22;
               break;
            case 241:
               var10000 = 185;
               break;
            case 242:
               var10000 = 15;
               break;
            case 243:
               var10000 = 234;
               break;
            case 244:
               var10000 = 78;
               break;
            case 245:
               var10000 = 226;
               break;
            case 246:
               var10000 = 213;
               break;
            case 247:
               var10000 = 221;
               break;
            case 248:
               var10000 = 119;
               break;
            case 249:
               var10000 = 73;
               break;
            case 250:
               var10000 = 183;
               break;
            case 251:
               var10000 = 164;
               break;
            case 252:
               var10000 = 200;
               break;
            case 253:
               var10000 = 245;
               break;
            case 254:
               var10000 = 23;
               break;
            default:
               var10000 = 192;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "©\u0081´ï\u0080b\b<]3Ö\u009c\u009f\u0084Eh\u0002y\u0087";
      int var6 = "©\u0081´ï\u0080b\b<]3Ö\u009c\u009f\u0084Eh\u0002y\u0087".length();
      char var3 = 16;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 46;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 97;
                        break;
                     case 1:
                        var50 = 125;
                        break;
                     case 2:
                        var50 = 74;
                        break;
                     case 3:
                        var50 = 31;
                        break;
                     case 4:
                        var50 = 50;
                        break;
                     case 5:
                        var50 = 63;
                        break;
                     default:
                        var50 = 82;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[4];
                     long var0 = 5547447223808892790L;
                     long var27 = 820150641507378670L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "敯辏捷\u0081[\u000f\u0012}ÿ\u001f\u001c\u0018,\u0001Jg#Õ\u0001\u008e\u001c";
                  var6 = "敯辏捷\u0081[\u000f\u0012}ÿ\u001f\u001c\u0018,\u0001Jg#Õ\u0001\u008e\u001c".length();
                  var3 = 5;
                  var10 = -1;
            }

            var10000 = 85;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





