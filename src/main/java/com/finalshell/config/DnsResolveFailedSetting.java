package com.finalshell.config;

import com.finalshell.core.ConnectTimeout;
import com.finalshell.core.Jy2;
import com.finalshell.network.Tunnel;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.MacAddress;

public class DnsResolveFailedSetting {
   public MacAddress c;
   public MacAddress F;
   Inet4Address W;
   public PcapHandle h;
   Tunnel f;
   String l = "";
   String Y = a(-17268, 13934);
   String U = null;
   String g = "";
   PcapNetworkInterface E;
   public final int Q = -1;
   public final int G = 1;
   public final int A = a(114, 4234654109733814218L);
   HashMap C = new HashMap();
   LinkedBlockingQueue o = new LinkedBlockingQueue();
   Random y = new Random();
   boolean j = false;
   short d;
   ConnectTimeout Z = null;
   DnsResolveFailedSetting b;
   Thread q;
   boolean I = true;
   public boolean T = false;
   boolean k = false;
   public boolean s = true;
   public static String[] J;
   public static String[] e;
   public static String[] i;
   public static long[] a;
   public static Integer[] m;
   public static long[] n;
   public static Long[] p;

   public DnsResolveFailedSetting(boolean var1, boolean var2) {
      this.b = this;
      this.j = var1;
      this.s = var2;
      this.Z = new ConnectTimeout(this);
   }

   public void I$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/config/DnsResolveFailedSetting.R ()Z
      // 07: pop
      // 08: new com/finalshell/task/L5
      // 0b: dup
      // 0c: aload 0
      // 0d: invokespecial com/finalshell/task/L5.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;)V
      // 10: astore 2
      // 11: astore 1
      // 12: aload 0
      // 13: aload 1
      // 14: ifnonnull 38
      // 17: getfield com/finalshell/config/DnsResolveFailedSetting.j Z
      // 1a: ifne 3e
      // 1d: goto 24
      // 20: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: new com/finalshell/task/Qx2
      // 28: dup
      // 29: aload 0
      // 2a: invokespecial com/finalshell/task/Qx2.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;)V
      // 2d: putfield com/finalshell/config/DnsResolveFailedSetting.q Ljava/lang/Thread;
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: getfield com/finalshell/config/DnsResolveFailedSetting.q Ljava/lang/Thread;
      // 3b: invokevirtual java/lang/Thread.start ()V
      // 3e: new com/finalshell/task/RestoreTask
      // 41: dup
      // 42: aload 0
      // 43: invokespecial com/finalshell/task/RestoreTask.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;)V
      // 46: astore 3
      // 47: aload 3
      // 48: invokevirtual java/lang/Thread.start ()V
      // 4b: return
   }

   boolean E() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: sipush -17275
      // 03: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 06: sipush 17829
      // 09: ldc2_w 4755476341250006799
      // 0c: invokestatic com/finalshell/config/DnsResolveFailedSetting.b (IJ)J
      // 0f: lstore 2
      // 10: astore 1
      // 11: sipush 14995
      // 14: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 17: astore 4
      // 19: bipush 0
      // 1a: istore 5
      // 1c: bipush 0
      // 1d: istore 6
      // 1f: aload 1
      // 20: ifnull 4b
      // 23: aload 4
      // 25: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 28: astore 7
      // 2a: bipush 1
      // 2b: istore 5
      // 2d: goto 64
      // 30: astore 7
      // 32: sipush 8731
      // 35: ldc2_w 5289423528204007603
      // 38: invokestatic com/finalshell/config/DnsResolveFailedSetting.b (IJ)J
      // 3b: invokestatic java/lang/Thread.sleep (J)V
      // 3e: goto 48
      // 41: astore 8
      // 43: aload 8
      // 45: invokevirtual java/lang/Exception.printStackTrace ()V
      // 48: iinc 6 1
      // 4b: iload 6
      // 4d: aload 1
      // 4e: ifnonnull 66
      // 51: sipush 22401
      // 54: ldc2_w 2655153416470046773
      // 57: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 5a: if_icmplt 23
      // 5d: goto 64
      // 60: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: iload 5
      // 66: aload 1
      // 67: ifnonnull 8d
      // 6a: ifne 8b
      // 6d: goto 74
      // 70: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: sipush -17270
      // 77: sipush 9253
      // 7a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 7d: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 80: bipush 0
      // 81: invokestatic java/lang/System.exit (I)V
      // 84: goto 8b
      // 87: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: iload 5
      // 8d: ireturn
   }

   PcapNetworkInterface.PromiscuousMode Z(PcapNetworkInterface var1) {
      PcapNetworkInterface.PromiscuousMode var2 = null;
      String var3 = (var1.getDescription() + ":" + var1.getName()).toLowerCase();
      if (var3.contains(a(-17280, -27172))) {
         var2 = PcapNetworkInterface.PromiscuousMode.NONPROMISCUOUS;
      } else {
         var2 = PcapNetworkInterface.PromiscuousMode.PROMISCUOUS;
      }

      return var2;
   }

   boolean R() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: aload 0
      // 003: invokevirtual com/finalshell/config/DnsResolveFailedSetting.e ()V
      // 006: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 009: aconst_null
      // 00a: astore 3
      // 00b: astore 1
      // 00c: invokestatic org/pcap4j/core/Pcaps.findAllDevs ()Ljava/util/List;
      // 00f: astore 3
      // 010: goto 025
      // 013: astore 4
      // 015: aload 4
      // 017: invokevirtual java/lang/Error.printStackTrace ()V
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: astore 4
      // 01e: aload 4
      // 020: invokevirtual java/lang/Exception.printStackTrace ()V
      // 023: bipush 0
      // 024: ireturn
      // 025: sipush -17263
      // 028: sipush 2220
      // 02b: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 02e: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 031: aload 3
      // 032: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 037: astore 5
      // 039: aload 1
      // 03a: ifnull 0db
      // 03d: aload 5
      // 03f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 044: checkcast org/pcap4j/core/PcapNetworkInterface
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: astore 4
      // 050: ldc ""
      // 052: astore 6
      // 054: aload 4
      // 056: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 059: aload 1
      // 05a: ifnonnull 09b
      // 05d: ifnull 067
      // 060: aload 4
      // 062: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 065: astore 6
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: sipush -17274
      // 06e: sipush -12873
      // 071: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 074: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 077: aload 6
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07c: sipush -17271
      // 07f: sipush -9733
      // 082: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: aload 4
      // 08a: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 090: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 093: invokestatic com/finalshell/core/Jy2.b (Ljava/lang/Object;)V
      // 096: aload 4
      // 098: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 09b: aload 0
      // 09c: getfield com/finalshell/config/DnsResolveFailedSetting.U Ljava/lang/String;
      // 09f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a2: aload 1
      // 0a3: ifnonnull 0e2
      // 0a6: ifeq 0db
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: aload 6
      // 0b2: aload 0
      // 0b3: getfield com/finalshell/config/DnsResolveFailedSetting.g Ljava/lang/String;
      // 0b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b9: aload 1
      // 0ba: ifnonnull 0e2
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: ifeq 0db
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: aload 4
      // 0d1: putfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 5
      // 0dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e2: ifne 03d
      // 0e5: aload 0
      // 0e6: aload 1
      // 0e7: ifnonnull 17a
      // 0ea: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 0ed: aload 1
      // 0ee: ifnonnull 04e
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: ifnull 172
      // 0fb: ldc ""
      // 0fd: astore 4
      // 0ff: aload 0
      // 100: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 103: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 106: aload 1
      // 107: ifnonnull 14d
      // 10a: ifnull 11d
      // 10d: goto 114
      // 110: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 0
      // 115: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 118: invokevirtual org/pcap4j/core/PcapNetworkInterface.getDescription ()Ljava/lang/String;
      // 11b: astore 4
      // 11d: bipush 1
      // 11e: istore 2
      // 11f: new java/lang/StringBuilder
      // 122: dup
      // 123: sipush -17264
      // 126: sipush -22399
      // 129: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 12c: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 12f: aload 4
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: sipush -17276
      // 137: sipush 14221
      // 13a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: aload 0
      // 141: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 144: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14d: invokestatic com/finalshell/core/Jy2.b (Ljava/lang/Object;)V
      // 150: aload 0
      // 151: getfield com/finalshell/config/DnsResolveFailedSetting.s Z
      // 154: aload 1
      // 155: ifnonnull 18e
      // 158: ifeq 18a
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 0
      // 163: bipush 1
      // 164: putfield com/finalshell/config/DnsResolveFailedSetting.T Z
      // 167: aload 1
      // 168: ifnull 18a
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 0
      // 173: goto 17a
      // 176: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: bipush 0
      // 17b: putfield com/finalshell/config/DnsResolveFailedSetting.T Z
      // 17e: sipush -17267
      // 181: sipush 6762
      // 184: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 187: invokestatic com/finalshell/core/Jy2.b (Ljava/lang/Object;)V
      // 18a: aload 0
      // 18b: getfield com/finalshell/config/DnsResolveFailedSetting.T Z
      // 18e: aload 1
      // 18f: ifnonnull 227
      // 192: ifeq 223
      // 195: goto 19c
      // 198: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 0
      // 19d: aload 0
      // 19e: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 1a1: bipush 114
      // 1a3: ldc2_w 4234654109733814218
      // 1a6: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: getfield com/finalshell/config/DnsResolveFailedSetting.E Lorg/pcap4j/core/PcapNetworkInterface;
      // 1ae: invokevirtual com/finalshell/config/DnsResolveFailedSetting.Z (Lorg/pcap4j/core/PcapNetworkInterface;)Lorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;
      // 1b1: bipush 1
      // 1b2: invokevirtual org/pcap4j/core/PcapNetworkInterface.openLive (ILorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;I)Lorg/pcap4j/core/PcapHandle;
      // 1b5: putfield com/finalshell/config/DnsResolveFailedSetting.h Lorg/pcap4j/core/PcapHandle;
      // 1b8: ldc ""
      // 1ba: astore 4
      // 1bc: aload 1
      // 1bd: ifnonnull 1ed
      // 1c0: aload 0
      // 1c1: getfield com/finalshell/config/DnsResolveFailedSetting.j Z
      // 1c4: ifne 1f1
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: new java/lang/StringBuilder
      // 1d1: dup
      // 1d2: sipush -17266
      // 1d5: sipush 6624
      // 1d8: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 1db: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1de: aload 0
      // 1df: getfield com/finalshell/config/DnsResolveFailedSetting.d S
      // 1e2: invokestatic com/finalshell/config/DnsResolveFailedSetting.S (S)I
      // 1e5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1eb: astore 4
      // 1ed: aload 1
      // 1ee: ifnull 1fc
      // 1f1: sipush -17262
      // 1f4: sipush 19235
      // 1f7: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 1fa: astore 4
      // 1fc: aload 0
      // 1fd: getfield com/finalshell/config/DnsResolveFailedSetting.h Lorg/pcap4j/core/PcapHandle;
      // 200: aload 4
      // 202: getstatic org/pcap4j/core/BpfProgram$BpfCompileMode.OPTIMIZE Lorg/pcap4j/core/BpfProgram$BpfCompileMode;
      // 205: invokevirtual org/pcap4j/core/PcapHandle.setFilter (Ljava/lang/String;Lorg/pcap4j/core/BpfProgram$BpfCompileMode;)V
      // 208: new com/finalshell/core/LB
      // 20b: dup
      // 20c: aload 0
      // 20d: invokespecial com/finalshell/core/LB.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;)V
      // 210: astore 5
      // 212: new com/finalshell/task/CJ3
      // 215: dup
      // 216: aload 0
      // 217: aload 5
      // 219: invokespecial com/finalshell/task/CJ3.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Lorg/pcap4j/core/PacketListener;)V
      // 21c: astore 6
      // 21e: aload 6
      // 220: invokevirtual java/lang/Thread.start ()V
      // 223: aload 0
      // 224: getfield com/finalshell/config/DnsResolveFailedSetting.j Z
      // 227: aload 1
      // 228: ifnonnull 249
      // 22b: ifne 248
      // 22e: goto 235
      // 231: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: sipush -17258
      // 238: sipush 20231
      // 23b: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 23e: invokestatic com/finalshell/core/Jy2.b (Ljava/lang/Object;)V
      // 241: goto 248
      // 244: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 247: athrow
      // 248: iload 2
      // 249: ireturn
   }

   void B(Packet param1) {
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
      // 005: checkcast org/pcap4j/packet/EthernetPacket
      // 008: astore 3
      // 009: aload 3
      // 00a: invokevirtual org/pcap4j/packet/EthernetPacket.getHeader$EthernetPacket_EthernetHeader ()Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;
      // 00d: astore 4
      // 00f: aconst_null
      // 010: astore 5
      // 012: aload 0
      // 013: getfield com/finalshell/config/DnsResolveFailedSetting.k Z
      // 016: aload 2
      // 017: ifnonnull 040
      // 01a: ifeq 02e
      // 01d: goto 024
      // 020: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: aload 3
      // 026: invokevirtual com/finalshell/config/DnsResolveFailedSetting.v (Lorg/pcap4j/packet/EthernetPacket;)Lorg/pcap4j/packet/IpV4Packet;
      // 029: astore 5
      // 02b: goto 053
      // 02e: aload 3
      // 02f: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 032: aload 2
      // 033: ifnonnull 04e
      // 036: instanceof org/pcap4j/packet/IpV4Packet
      // 039: goto 040
      // 03c: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: ifeq 053
      // 043: aload 3
      // 044: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: checkcast org/pcap4j/packet/IpV4Packet
      // 051: astore 5
      // 053: aload 5
      // 055: aload 2
      // 056: ifnonnull 065
      // 059: ifnull 20c
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 5
      // 065: invokevirtual org/pcap4j/packet/IpV4Packet.getHeader$IpV4Packet_IpV4Header ()Lorg/pcap4j/packet/IpV4Packet$IpV4Header;
      // 068: astore 6
      // 06a: aload 5
      // 06c: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 06f: instanceof org/pcap4j/packet/TcpPacket
      // 072: aload 2
      // 073: ifnonnull 1f5
      // 076: ifeq 1e7
      // 079: goto 080
      // 07c: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 5
      // 082: invokevirtual org/pcap4j/packet/IpV4Packet.getPayload ()Lorg/pcap4j/packet/Packet;
      // 085: checkcast org/pcap4j/packet/TcpPacket
      // 088: astore 7
      // 08a: aload 7
      // 08c: invokevirtual org/pcap4j/packet/TcpPacket.getHeader$TcpPacket_TcpHeader ()Lorg/pcap4j/packet/TcpPacket$TcpHeader;
      // 08f: astore 8
      // 091: aload 0
      // 092: aload 2
      // 093: ifnonnull 0ab
      // 096: getfield com/finalshell/config/DnsResolveFailedSetting.j Z
      // 099: ifeq 0fc
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 0ae: aload 6
      // 0b0: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 0b3: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 0b6: aload 8
      // 0b8: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0bb: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 0be: checkcast java/lang/Short
      // 0c1: invokevirtual java/lang/Short.shortValue ()S
      // 0c4: aload 8
      // 0c6: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 0c9: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 0cc: checkcast java/lang/Short
      // 0cf: invokevirtual java/lang/Short.shortValue ()S
      // 0d2: invokevirtual com/finalshell/core/ConnectTimeout.u (Ljava/lang/String;SS)Lcom/finalshell/core/SecondHandshake;
      // 0d5: astore 9
      // 0d7: aload 9
      // 0d9: aload 2
      // 0da: ifnonnull 0e9
      // 0dd: ifnull 20c
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 9
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/config/DnsResolveFailedSetting.b Lcom/finalshell/config/DnsResolveFailedSetting;
      // 0ed: aload 1
      // 0ee: aload 4
      // 0f0: aload 6
      // 0f2: aload 7
      // 0f4: bipush 0
      // 0f5: invokevirtual com/finalshell/core/SecondHandshake.P (Lcom/finalshell/config/DnsResolveFailedSetting;Lorg/pcap4j/packet/Packet;Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;Lorg/pcap4j/packet/TcpPacket;Z)V
      // 0f8: aload 2
      // 0f9: ifnull 20c
      // 0fc: aconst_null
      // 0fd: astore 9
      // 0ff: aload 0
      // 100: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 103: aload 6
      // 105: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 108: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 10b: aload 8
      // 10d: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 110: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 113: checkcast java/lang/Short
      // 116: invokevirtual java/lang/Short.shortValue ()S
      // 119: invokevirtual com/finalshell/core/ConnectTimeout.z (Ljava/lang/String;S)Lcom/finalshell/core/SecondHandshake;
      // 11c: astore 9
      // 11e: aload 8
      // 120: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getDstPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 123: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 126: checkcast java/lang/Short
      // 129: invokevirtual java/lang/Short.shortValue ()S
      // 12c: aload 2
      // 12d: ifnonnull 14a
      // 130: aload 0
      // 131: getfield com/finalshell/config/DnsResolveFailedSetting.d S
      // 134: if_icmpne 20c
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 8
      // 140: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 143: goto 14a
      // 146: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 2
      // 14b: ifnonnull 164
      // 14e: ifeq 1a7
      // 151: goto 158
      // 154: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 8
      // 15a: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 15d: goto 164
      // 160: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: ifne 1a7
      // 167: aload 9
      // 169: aload 2
      // 16a: ifnonnull 1c8
      // 16d: goto 174
      // 170: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: ifnonnull 1a7
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: new com/finalshell/core/SecondHandshake
      // 181: dup
      // 182: aload 0
      // 183: getfield com/finalshell/config/DnsResolveFailedSetting.b Lcom/finalshell/config/DnsResolveFailedSetting;
      // 186: aload 6
      // 188: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 18b: aload 8
      // 18d: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 190: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 193: checkcast java/lang/Short
      // 196: invokevirtual java/lang/Short.shortValue ()S
      // 199: invokespecial com/finalshell/core/SecondHandshake.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Ljava/net/Inet4Address;S)V
      // 19c: astore 9
      // 19e: aload 0
      // 19f: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 1a2: aload 9
      // 1a4: invokevirtual com/finalshell/core/ConnectTimeout.p (Lcom/finalshell/core/SecondHandshake;)V
      // 1a7: aload 0
      // 1a8: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 1ab: aload 6
      // 1ad: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 1b0: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 1b3: aload 8
      // 1b5: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 1b8: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 1bb: checkcast java/lang/Short
      // 1be: invokevirtual java/lang/Short.shortValue ()S
      // 1c1: invokevirtual com/finalshell/core/ConnectTimeout.z (Ljava/lang/String;S)Lcom/finalshell/core/SecondHandshake;
      // 1c4: astore 9
      // 1c6: aload 9
      // 1c8: aload 2
      // 1c9: ifnonnull 1d8
      // 1cc: ifnull 20c
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: aload 9
      // 1d8: aload 1
      // 1d9: aload 4
      // 1db: aload 6
      // 1dd: aload 7
      // 1df: bipush 1
      // 1e0: invokevirtual com/finalshell/core/SecondHandshake.w (Lorg/pcap4j/packet/Packet;Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;Lorg/pcap4j/packet/TcpPacket;Z)V
      // 1e3: aload 2
      // 1e4: ifnull 20c
      // 1e7: aload 3
      // 1e8: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1eb: instanceof org/pcap4j/packet/IllegalPacket
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: ifeq 20c
      // 1f8: sipush -17277
      // 1fb: sipush -29618
      // 1fe: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 201: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 204: goto 20c
      // 207: astore 3
      // 208: aload 3
      // 209: invokevirtual org/pcap4j/packet/IllegalRawDataException.printStackTrace ()V
      // 20c: return
   }

   void e() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: new java/util/HashMap
      // 09: dup
      // 0a: invokespecial java/util/HashMap.<init> ()V
      // 0d: astore 3
      // 0e: invokestatic org/pcap4j/core/Pcaps.findAllDevs ()Ljava/util/List;
      // 11: astore 2
      // 12: goto 25
      // 15: astore 4
      // 17: aload 4
      // 19: invokevirtual java/lang/Error.printStackTrace ()V
      // 1c: return
      // 1d: astore 4
      // 1f: aload 4
      // 21: invokevirtual java/lang/Exception.printStackTrace ()V
      // 24: return
      // 25: aload 2
      // 26: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2b: astore 5
      // 2d: aload 1
      // 2e: ifnull 88
      // 31: aload 5
      // 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: checkcast org/pcap4j/core/PcapNetworkInterface
      // 42: astore 4
      // 44: aload 4
      // 46: sipush 32053
      // 49: ldc2_w 5519602852039787146
      // 4c: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 4f: aload 0
      // 50: aload 4
      // 52: invokevirtual com/finalshell/config/DnsResolveFailedSetting.Z (Lorg/pcap4j/core/PcapNetworkInterface;)Lorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;
      // 55: bipush 1
      // 56: invokevirtual org/pcap4j/core/PcapNetworkInterface.openLive (ILorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;I)Lorg/pcap4j/core/PcapHandle;
      // 59: astore 6
      // 5b: aload 3
      // 5c: aload 4
      // 5e: aload 6
      // 60: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 63: pop
      // 64: new com/finalshell/core/KZ3
      // 67: dup
      // 68: aload 0
      // 69: aload 4
      // 6b: invokespecial com/finalshell/core/KZ3.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Lorg/pcap4j/core/PcapNetworkInterface;)V
      // 6e: astore 7
      // 70: new com/finalshell/task/OP
      // 73: dup
      // 74: aload 0
      // 75: aload 6
      // 77: aload 7
      // 79: invokespecial com/finalshell/task/OP.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Lorg/pcap4j/core/PcapHandle;Lorg/pcap4j/core/PacketListener;)V
      // 7c: astore 8
      // 7e: aload 8
      // 80: invokevirtual java/lang/Thread.start ()V
      // 83: goto 88
      // 86: astore 6
      // 88: aload 5
      // 8a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8f: ifne 31
      // 92: aload 0
      // 93: aload 1
      // 94: ifnonnull 3f
      // 97: invokespecial com/finalshell/config/DnsResolveFailedSetting.y ()V
      // 9a: goto a4
      // 9d: astore 4
      // 9f: aload 4
      // a1: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // a4: aload 3
      // a5: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // a8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // ad: astore 4
      // af: aload 1
      // b0: ifnull e9
      // b3: aload 4
      // b5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ba: checkcast org/pcap4j/core/PcapNetworkInterface
      // bd: astore 5
      // bf: aload 3
      // c0: aload 5
      // c2: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // c5: checkcast org/pcap4j/core/PcapHandle
      // c8: astore 6
      // ca: aload 6
      // cc: invokevirtual org/pcap4j/core/PcapHandle.breakLoop ()V
      // cf: goto d9
      // d2: astore 7
      // d4: aload 7
      // d6: invokevirtual org/pcap4j/core/NotOpenException.printStackTrace ()V
      // d9: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // dc: new com/finalshell/task/KD
      // df: dup
      // e0: aload 0
      // e1: aload 6
      // e3: invokespecial com/finalshell/task/KD.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Lorg/pcap4j/core/PcapHandle;)V
      // e6: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // e9: aload 4
      // eb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // f0: ifne b3
      // f3: return
   }

   IpV4Packet v(EthernetPacket param1) throws IllegalRawDataException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 3
      // 05: astore 2
      // 06: aload 1
      // 07: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 0a: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 0f: astore 4
      // 11: aload 4
      // 13: arraylength
      // 14: sipush 18125
      // 17: ldc2_w 4065531694929852792
      // 1a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 1d: aload 2
      // 1e: ifnonnull 52
      // 21: if_icmple ec
      // 24: goto 2b
      // 27: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 4
      // 2d: sipush 25837
      // 30: ldc2_w 28280717075553114
      // 33: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 36: baload
      // 37: aload 2
      // 38: ifnonnull 56
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 26558
      // 45: ldc2_w 7800019661343102991
      // 48: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: if_icmpne ec
      // 55: bipush 2
      // 56: newarray 8
      // 58: astore 5
      // 5a: aload 4
      // 5c: bipush 4
      // 5d: aload 5
      // 5f: bipush 0
      // 60: bipush 2
      // 61: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 64: aload 5
      // 66: bipush 0
      // 67: invokestatic com/finalshell/core/B8.M$short ([BI)S
      // 6a: istore 6
      // 6c: iload 6
      // 6e: invokestatic com/finalshell/config/DnsResolveFailedSetting.S (S)I
      // 71: bipush 2
      // 72: isub
      // 73: istore 7
      // 75: iload 7
      // 77: newarray 8
      // 79: astore 8
      // 7b: aload 4
      // 7d: arraylength
      // 7e: sipush 25837
      // 81: ldc2_w 28280717075553114
      // 84: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 87: isub
      // 88: istore 9
      // 8a: getstatic com/finalshell/core/W1.v [B
      // 8d: bipush 2
      // 8e: aload 4
      // 90: bipush 2
      // 91: baload
      // 92: bastore
      // 93: getstatic com/finalshell/core/W1.v [B
      // 96: bipush 3
      // 97: aload 4
      // 99: bipush 3
      // 9a: baload
      // 9b: bastore
      // 9c: aload 2
      // 9d: ifnonnull d3
      // a0: iload 7
      // a2: aload 4
      // a4: arraylength
      // a5: sipush 25837
      // a8: ldc2_w 28280717075553114
      // ab: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // ae: isub
      // af: if_icmpne e0
      // b2: goto b9
      // b5: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: aload 4
      // bb: sipush 25837
      // be: ldc2_w 28280717075553114
      // c1: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // c4: aload 8
      // c6: bipush 0
      // c7: iload 7
      // c9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // cc: goto d3
      // cf: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d2: athrow
      // d3: aload 8
      // d5: bipush 0
      // d6: aload 8
      // d8: arraylength
      // d9: invokestatic org/pcap4j/packet/IpV4Packet.newPacket ([BII)Lorg/pcap4j/packet/IpV4Packet;
      // dc: astore 3
      // dd: goto ec
      // e0: sipush -17272
      // e3: sipush -20753
      // e6: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // e9: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // ec: aload 3
      // ed: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String r(byte[] var0) {
      StringBuffer var2 = new StringBuffer();
      String[] var10000 = I$arrString();
      int var3 = 0;
      String[] var1 = var10000;
      String var6;
      if (var1 != null) {
         var6 = Integer.toHexString(var0[var3] & a(18642, 936627641441236844L));
      } else if (var3 >= var0.length) {
         var6 = var2.toString();
         if (var1 == null) {
            return var6;
         }
      } else {
         var6 = Integer.toHexString(var0[var3] & a(18642, 936627641441236844L));
      }

      while (true) {
         String var4 = var6;
         var4 = var4.replaceAll(":", " ");
         if (var1 == null) {
            if (var4.length() == 1) {
               var4 = a(2593, 1737502362660992410L) + var4;
            }

            var2.append(var4 + " ");
         }

         if (++var3 >= var0.length) {
            var6 = var2.toString();
            if (var1 == null) {
               return var6;
            }
         } else {
            var6 = Integer.toHexString(var0[var3] & a(18642, 936627641441236844L));
         }
      }
   }

   public void w(String param1, short param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokestatic java/net/Inet4Address.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 07: checkcast java/net/Inet4Address
      // 0a: astore 4
      // 0c: new com/finalshell/core/SecondHandshake
      // 0f: dup
      // 10: aload 0
      // 11: aload 4
      // 13: iload 2
      // 14: aload 0
      // 15: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 18: aload 0
      // 19: getfield com/finalshell/config/DnsResolveFailedSetting.c Lorg/pcap4j/util/MacAddress;
      // 1c: invokespecial com/finalshell/core/SecondHandshake.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;Ljava/net/Inet4Address;SLorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;)V
      // 1f: astore 5
      // 21: aload 0
      // 22: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 25: aload 5
      // 27: invokevirtual com/finalshell/core/ConnectTimeout.l (Lcom/finalshell/core/SecondHandshake;)V
      // 2a: bipush 0
      // 2b: istore 6
      // 2d: astore 3
      // 2e: bipush 0
      // 2f: istore 7
      // 31: aload 3
      // 32: ifnull 68
      // 35: sipush 12438
      // 38: ldc2_w 8235661184933128765
      // 3b: invokestatic com/finalshell/config/DnsResolveFailedSetting.b (IJ)J
      // 3e: invokestatic java/lang/Thread.sleep (J)V
      // 41: goto 4b
      // 44: astore 8
      // 46: aload 8
      // 48: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 4b: aload 5
      // 4d: getfield com/finalshell/core/SecondHandshake.v Z
      // 50: aload 3
      // 51: ifnonnull 58
      // 54: ifeq 5e
      // 57: bipush 1
      // 58: istore 6
      // 5a: aload 3
      // 5b: ifnull 76
      // 5e: iinc 7 1
      // 61: goto 68
      // 64: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: iload 7
      // 6a: sipush 19878
      // 6d: ldc2_w 7686055020522353183
      // 70: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 73: if_icmplt 35
      // 76: iload 6
      // 78: aload 3
      // 79: ifnonnull 50
      // 7c: ifeq 93
      // 7f: aload 0
      // 80: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 83: aload 5
      // 85: invokevirtual com/finalshell/core/ConnectTimeout.E (Lcom/finalshell/core/SecondHandshake;)V
      // 88: aload 3
      // 89: ifnull b9
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: aload 0
      // 94: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 97: aload 5
      // 99: invokevirtual com/finalshell/core/ConnectTimeout.M (Lcom/finalshell/core/SecondHandshake;)V
      // 9c: aload 0
      // 9d: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // a0: aconst_null
      // a1: invokevirtual com/finalshell/core/ConnectTimeout.E (Lcom/finalshell/core/SecondHandshake;)V
      // a4: new java/lang/Exception
      // a7: dup
      // a8: sipush -17261
      // ab: sipush 30409
      // ae: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // b1: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // b4: athrow
      // b5: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: return
   }

   public void y() throws UnknownHostException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: sipush -17273
      // 09: sipush -12320
      // 0c: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 0f: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 12: astore 2
      // 13: goto 49
      // 16: astore 3
      // 17: aload 3
      // 18: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 1b: sipush -17265
      // 1e: sipush 28228
      // 21: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 24: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 27: astore 2
      // 28: goto 49
      // 2b: astore 4
      // 2d: aload 4
      // 2f: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 32: sipush -17279
      // 35: sipush -6805
      // 38: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 3b: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 3e: astore 2
      // 3f: goto 49
      // 42: astore 5
      // 44: aload 5
      // 46: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 49: aload 2
      // 4a: ifnonnull 5e
      // 4d: sipush -17269
      // 50: sipush 7579
      // 53: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (II)Ljava/lang/String;
      // 56: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 59: return
      // 5a: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: sipush 5317
      // 61: ldc2_w 2038973188262947703
      // 64: invokestatic com/finalshell/config/DnsResolveFailedSetting.a (IJ)I
      // 67: istore 3
      // 68: aload 0
      // 69: aload 2
      // 6a: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 6d: putfield com/finalshell/config/DnsResolveFailedSetting.l Ljava/lang/String;
      // 70: bipush 0
      // 71: istore 4
      // 73: aload 1
      // 74: ifnull b3
      // 77: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 7a: new com/finalshell/task/Xu2
      // 7d: dup
      // 7e: aload 0
      // 7f: invokespecial com/finalshell/task/Xu2.<init> (Lcom/finalshell/config/DnsResolveFailedSetting;)V
      // 82: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 85: sipush 6082
      // 88: ldc2_w 7400185198242155883
      // 8b: invokestatic com/finalshell/config/DnsResolveFailedSetting.b (IJ)J
      // 8e: invokestatic java/lang/Thread.sleep (J)V
      // 91: aload 0
      // 92: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 95: ifnull b0
      // 98: goto b9
      // 9b: astore 5
      // 9d: aload 5
      // 9f: invokevirtual java/lang/Exception.printStackTrace ()V
      // a2: lconst_1
      // a3: invokestatic java/lang/Thread.sleep (J)V
      // a6: goto b0
      // a9: astore 6
      // ab: aload 6
      // ad: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // b0: iinc 4 1
      // b3: iload 4
      // b5: bipush 5
      // b6: if_icmplt 77
      // b9: aload 1
      // ba: ifnonnull 91
      // bd: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void p() {
      String[] var10000 = I$arrString();
      int var2 = 0;
      String[] var1 = var10000;
      if (var1 != null || var2 < a(25698, 3320641701648473041L)) {
         do {
            try {
               DatagramSocket var3 = new DatagramSocket();
               DatagramPacket var4 = new DatagramPacket(new byte[a(1623, 7826633246941215207L)], a(3039, 1410208639654130786L));
               var4.setAddress(InetAddress.getByName(this.Y));
               var4.setPort(a(4994, 7698246445091974200L));
               var3.send(var4);
               var3.close();
               Thread.sleep(b(6082, 7400185198242155883L));
               if (this.F != null) {
                  break;
               }
            } catch (Exception var6) {
               var6.printStackTrace();

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var5) {
                  var5.printStackTrace();
               }
            }
         } while (++var2 < a(25698, 3320641701648473041L));
      }
   }

   public short f() {
      return this.d;
   }

   public void m(short var1) {
      this.d = var1;
      if (!this.j) {
         Jy2.b(a(-17278, 19352) + S(var1));
      }
   }

   public static int S(short var0) {
      return var0 & a(31153, 3624991499218781703L);
   }

   public static void K(String[] var0) {
      J = var0;
   }

   public static String[] I$arrString() {
      return J;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17278) & 65535;
      if (i[var2] == null) {
         char[] var3 = e[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 217;
               break;
            case 1:
               var10000 = 223;
               break;
            case 2:
               var10000 = 56;
               break;
            case 3:
               var10000 = 84;
               break;
            case 4:
               var10000 = 236;
               break;
            case 5:
               var10000 = 45;
               break;
            case 6:
               var10000 = 112;
               break;
            case 7:
               var10000 = 158;
               break;
            case 8:
               var10000 = 124;
               break;
            case 9:
               var10000 = 34;
               break;
            case 10:
               var10000 = 73;
               break;
            case 11:
               var10000 = 164;
               break;
            case 12:
               var10000 = 160;
               break;
            case 13:
               var10000 = 180;
               break;
            case 14:
               var10000 = 171;
               break;
            case 15:
               var10000 = 59;
               break;
            case 16:
               var10000 = 8;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 189;
               break;
            case 19:
               var10000 = 70;
               break;
            case 20:
               var10000 = 2;
               break;
            case 21:
               var10000 = 129;
               break;
            case 22:
               var10000 = 39;
               break;
            case 23:
               var10000 = 212;
               break;
            case 24:
               var10000 = 218;
               break;
            case 25:
               var10000 = 15;
               break;
            case 26:
               var10000 = 95;
               break;
            case 27:
               var10000 = 49;
               break;
            case 28:
               var10000 = 77;
               break;
            case 29:
               var10000 = 135;
               break;
            case 30:
               var10000 = 79;
               break;
            case 31:
               var10000 = 7;
               break;
            case 32:
               var10000 = 123;
               break;
            case 33:
               var10000 = 33;
               break;
            case 34:
               var10000 = 44;
               break;
            case 35:
               var10000 = 17;
               break;
            case 36:
               var10000 = 254;
               break;
            case 37:
               var10000 = 19;
               break;
            case 38:
               var10000 = 106;
               break;
            case 39:
               var10000 = 141;
               break;
            case 40:
               var10000 = 175;
               break;
            case 41:
               var10000 = 76;
               break;
            case 42:
               var10000 = 220;
               break;
            case 43:
               var10000 = 83;
               break;
            case 44:
               var10000 = 196;
               break;
            case 45:
               var10000 = 191;
               break;
            case 46:
               var10000 = 244;
               break;
            case 47:
               var10000 = 232;
               break;
            case 48:
               var10000 = 237;
               break;
            case 49:
               var10000 = 13;
               break;
            case 50:
               var10000 = 99;
               break;
            case 51:
               var10000 = 247;
               break;
            case 52:
               var10000 = 143;
               break;
            case 53:
               var10000 = 230;
               break;
            case 54:
               var10000 = 139;
               break;
            case 55:
               var10000 = 75;
               break;
            case 56:
               var10000 = 157;
               break;
            case 57:
               var10000 = 23;
               break;
            case 58:
               var10000 = 89;
               break;
            case 59:
               var10000 = 116;
               break;
            case 60:
               var10000 = 78;
               break;
            case 61:
               var10000 = 238;
               break;
            case 62:
               var10000 = 67;
               break;
            case 63:
               var10000 = 216;
               break;
            case 64:
               var10000 = 29;
               break;
            case 65:
               var10000 = 22;
               break;
            case 66:
               var10000 = 118;
               break;
            case 67:
               var10000 = 179;
               break;
            case 68:
               var10000 = 30;
               break;
            case 69:
               var10000 = 208;
               break;
            case 70:
               var10000 = 227;
               break;
            case 71:
               var10000 = 41;
               break;
            case 72:
               var10000 = 121;
               break;
            case 73:
               var10000 = 60;
               break;
            case 74:
               var10000 = 205;
               break;
            case 75:
               var10000 = 87;
               break;
            case 76:
               var10000 = 181;
               break;
            case 77:
               var10000 = 93;
               break;
            case 78:
               var10000 = 86;
               break;
            case 79:
               var10000 = 234;
               break;
            case 80:
               var10000 = 150;
               break;
            case 81:
               var10000 = 154;
               break;
            case 82:
               var10000 = 14;
               break;
            case 83:
               var10000 = 231;
               break;
            case 84:
               var10000 = 31;
               break;
            case 85:
               var10000 = 219;
               break;
            case 86:
               var10000 = 243;
               break;
            case 87:
               var10000 = 146;
               break;
            case 88:
               var10000 = 250;
               break;
            case 89:
               var10000 = 195;
               break;
            case 90:
               var10000 = 210;
               break;
            case 91:
               var10000 = 25;
               break;
            case 92:
               var10000 = 177;
               break;
            case 93:
               var10000 = 9;
               break;
            case 94:
               var10000 = 255;
               break;
            case 95:
               var10000 = 197;
               break;
            case 96:
               var10000 = 26;
               break;
            case 97:
               var10000 = 166;
               break;
            case 98:
               var10000 = 134;
               break;
            case 99:
               var10000 = 110;
               break;
            case 100:
               var10000 = 194;
               break;
            case 101:
               var10000 = 66;
               break;
            case 102:
               var10000 = 173;
               break;
            case 103:
               var10000 = 192;
               break;
            case 104:
               var10000 = 228;
               break;
            case 105:
               var10000 = 163;
               break;
            case 106:
               var10000 = 20;
               break;
            case 107:
               var10000 = 159;
               break;
            case 108:
               var10000 = 111;
               break;
            case 109:
               var10000 = 229;
               break;
            case 110:
               var10000 = 92;
               break;
            case 111:
               var10000 = 48;
               break;
            case 112:
               var10000 = 90;
               break;
            case 113:
               var10000 = 214;
               break;
            case 114:
               var10000 = 253;
               break;
            case 115:
               var10000 = 88;
               break;
            case 116:
               var10000 = 102;
               break;
            case 117:
               var10000 = 215;
               break;
            case 118:
               var10000 = 127;
               break;
            case 119:
               var10000 = 125;
               break;
            case 120:
               var10000 = 105;
               break;
            case 121:
               var10000 = 161;
               break;
            case 122:
               var10000 = 226;
               break;
            case 123:
               var10000 = 183;
               break;
            case 124:
               var10000 = 103;
               break;
            case 125:
               var10000 = 58;
               break;
            case 126:
               var10000 = 122;
               break;
            case 127:
               var10000 = 107;
               break;
            case 128:
               var10000 = 242;
               break;
            case 129:
               var10000 = 162;
               break;
            case 130:
               var10000 = 198;
               break;
            case 131:
               var10000 = 28;
               break;
            case 132:
               var10000 = 64;
               break;
            case 133:
               var10000 = 81;
               break;
            case 134:
               var10000 = 252;
               break;
            case 135:
               var10000 = 165;
               break;
            case 136:
               var10000 = 206;
               break;
            case 137:
               var10000 = 10;
               break;
            case 138:
               var10000 = 46;
               break;
            case 139:
               var10000 = 57;
               break;
            case 140:
               var10000 = 190;
               break;
            case 141:
               var10000 = 233;
               break;
            case 142:
               var10000 = 6;
               break;
            case 143:
               var10000 = 16;
               break;
            case 144:
               var10000 = 53;
               break;
            case 145:
               var10000 = 186;
               break;
            case 146:
               var10000 = 1;
               break;
            case 147:
               var10000 = 40;
               break;
            case 148:
               var10000 = 178;
               break;
            case 149:
               var10000 = 224;
               break;
            case 150:
               var10000 = 51;
               break;
            case 151:
               var10000 = 109;
               break;
            case 152:
               var10000 = 97;
               break;
            case 153:
               var10000 = 37;
               break;
            case 154:
               var10000 = 153;
               break;
            case 155:
               var10000 = 113;
               break;
            case 156:
               var10000 = 24;
               break;
            case 157:
               var10000 = 47;
               break;
            case 158:
               var10000 = 251;
               break;
            case 159:
               var10000 = 52;
               break;
            case 160:
               var10000 = 132;
               break;
            case 161:
               var10000 = 240;
               break;
            case 162:
               var10000 = 222;
               break;
            case 163:
               var10000 = 188;
               break;
            case 164:
               var10000 = 133;
               break;
            case 165:
               var10000 = 27;
               break;
            case 166:
               var10000 = 0;
               break;
            case 167:
               var10000 = 115;
               break;
            case 168:
               var10000 = 168;
               break;
            case 169:
               var10000 = 21;
               break;
            case 170:
               var10000 = 221;
               break;
            case 171:
               var10000 = 202;
               break;
            case 172:
               var10000 = 119;
               break;
            case 173:
               var10000 = 147;
               break;
            case 174:
               var10000 = 169;
               break;
            case 175:
               var10000 = 120;
               break;
            case 176:
               var10000 = 36;
               break;
            case 177:
               var10000 = 43;
               break;
            case 178:
               var10000 = 138;
               break;
            case 179:
               var10000 = 104;
               break;
            case 180:
               var10000 = 4;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 156;
               break;
            case 183:
               var10000 = 117;
               break;
            case 184:
               var10000 = 85;
               break;
            case 185:
               var10000 = 245;
               break;
            case 186:
               var10000 = 94;
               break;
            case 187:
               var10000 = 12;
               break;
            case 188:
               var10000 = 18;
               break;
            case 189:
               var10000 = 211;
               break;
            case 190:
               var10000 = 246;
               break;
            case 191:
               var10000 = 80;
               break;
            case 192:
               var10000 = 155;
               break;
            case 193:
               var10000 = 62;
               break;
            case 194:
               var10000 = 213;
               break;
            case 195:
               var10000 = 136;
               break;
            case 196:
               var10000 = 151;
               break;
            case 197:
               var10000 = 248;
               break;
            case 198:
               var10000 = 201;
               break;
            case 199:
               var10000 = 130;
               break;
            case 200:
               var10000 = 128;
               break;
            case 201:
               var10000 = 42;
               break;
            case 202:
               var10000 = 98;
               break;
            case 203:
               var10000 = 249;
               break;
            case 204:
               var10000 = 65;
               break;
            case 205:
               var10000 = 114;
               break;
            case 206:
               var10000 = 50;
               break;
            case 207:
               var10000 = 131;
               break;
            case 208:
               var10000 = 149;
               break;
            case 209:
               var10000 = 174;
               break;
            case 210:
               var10000 = 152;
               break;
            case 211:
               var10000 = 100;
               break;
            case 212:
               var10000 = 193;
               break;
            case 213:
               var10000 = 204;
               break;
            case 214:
               var10000 = 176;
               break;
            case 215:
               var10000 = 96;
               break;
            case 216:
               var10000 = 142;
               break;
            case 217:
               var10000 = 61;
               break;
            case 218:
               var10000 = 225;
               break;
            case 219:
               var10000 = 209;
               break;
            case 220:
               var10000 = 172;
               break;
            case 221:
               var10000 = 72;
               break;
            case 222:
               var10000 = 54;
               break;
            case 223:
               var10000 = 199;
               break;
            case 224:
               var10000 = 170;
               break;
            case 225:
               var10000 = 3;
               break;
            case 226:
               var10000 = 68;
               break;
            case 227:
               var10000 = 187;
               break;
            case 228:
               var10000 = 241;
               break;
            case 229:
               var10000 = 239;
               break;
            case 230:
               var10000 = 91;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 200;
               break;
            case 233:
               var10000 = 144;
               break;
            case 234:
               var10000 = 11;
               break;
            case 235:
               var10000 = 71;
               break;
            case 236:
               var10000 = 145;
               break;
            case 237:
               var10000 = 167;
               break;
            case 238:
               var10000 = 137;
               break;
            case 239:
               var10000 = 203;
               break;
            case 240:
               var10000 = 32;
               break;
            case 241:
               var10000 = 82;
               break;
            case 242:
               var10000 = 140;
               break;
            case 243:
               var10000 = 63;
               break;
            case 244:
               var10000 = 69;
               break;
            case 245:
               var10000 = 101;
               break;
            case 246:
               var10000 = 35;
               break;
            case 247:
               var10000 = 185;
               break;
            case 248:
               var10000 = 108;
               break;
            case 249:
               var10000 = 126;
               break;
            case 250:
               var10000 = 235;
               break;
            case 251:
               var10000 = 148;
               break;
            case 252:
               var10000 = 184;
               break;
            case 253:
               var10000 = 207;
               break;
            case 254:
               var10000 = 5;
               break;
            default:
               var10000 = 55;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32691;
      if (m[var3] == null) {
         m[var3] = (int)(a[var3] ^ var1);
      }

      return m[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 23208) & 32767;
      if (p[var3] == null) {
         p[var3] = n[var3] ^ var1;
      }

      return p[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[21];
      int var19 = 0;
      String var18 = "î5%\u0094/r\u008f\u0014\u009eFþ5à)g\u000bx\u00104ØÄ\u009díoÙ}\u0093ØV\u0082Ì;Ïk\bW\u008dO\u0092J\u008aXf\t\u0090\u0004a\u0090Ä©±<|\u0002#>\b\u008dº¿v\u0089R6¥\u0003\u0015Èè\u0010O)\u0088\u0083èûc|\u0093=½þ<!\u008en/\u0013/gXFµ¢q=ª\u001fóå×\u0093\u0014`9á_\u009e>\u001e\u0014\u0018ÎhÆ¨*æ\fõ\u0014vn\u0010I\u0094ë A`\u009d\u0015\u000fb\u0010坙吂覢松変贜\u0099譸桲枭ÐQñ讐翤r\u0005闾廯丌箫ÿ\u0003¸Q]\r,ïAÐÁ9'\u0097F÷Æû°\u0007\u0091ãX Îä8\u0007\u001aÂ«\u009f B!8Ñ\\!%Um\u0006\u0094©/\u0089\u0083®\u001aD$\u008c\u0092¤®¸\u0005öÆó\u0084OÐE\u0013c\u0085\u0014\f`fóaó\u0088´¯\u0086º\u0010^ÛééøøÈþ\u0089ÇY\u0003ðÔÚ\u0007刬帓阔邖夓趺×\u001e½i¬\u0083ä¹u$ol®\u008d\u001f§\u00855âëå\u001dù¦¸ÇÜ#Ú$\u008bÇ";
      int var20 = "î5%\u0094/r\u008f\u0014\u009eFþ5à)g\u000bx\u00104ØÄ\u009díoÙ}\u0093ØV\u0082Ì;Ïk\bW\u008dO\u0092J\u008aXf\t\u0090\u0004a\u0090Ä©±<|\u0002#>\b\u008dº¿v\u0089R6¥\u0003\u0015Èè\u0010O)\u0088\u0083èûc|\u0093=½þ<!\u008en/\u0013/gXFµ¢q=ª\u001fóå×\u0093\u0014`9á_\u009e>\u001e\u0014\u0018ÎhÆ¨*æ\fõ\u0014vn\u0010I\u0094ë A`\u009d\u0015\u000fb\u0010坙吂覢松変贜\u0099譸桲枭ÐQñ讐翤r\u0005闾廯丌箫ÿ\u0003¸Q]\r,ïAÐÁ9'\u0097F÷Æû°\u0007\u0091ãX Îä8\u0007\u001aÂ«\u009f B!8Ñ\\!%Um\u0006\u0094©/\u0089\u0083®\u001aD$\u008c\u0092¤®¸\u0005öÆó\u0084OÐE\u0013c\u0085\u0014\f`fóaó\u0088´¯\u0086º\u0010^ÛééøøÈþ\u0089ÇY\u0003ðÔÚ\u0007刬帓阔邖夓趺×\u001e½i¬\u0083ä¹u$ol®\u008d\u001f§\u00855âëå\u001dù¦¸ÇÜ#Ú$\u008bÇ"
         .length();
      K(null);
      char var17 = 17;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 8;
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
                        var84 = 3;
                        break;
                     case 1:
                        var84 = 8;
                        break;
                     case 2:
                        var84 = 39;
                        break;
                     case 3:
                        var84 = 10;
                        break;
                     case 4:
                        var84 = 30;
                        break;
                     case 5:
                        var84 = 60;
                        break;
                     default:
                        var84 = 73;
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
                     e = var21;
                     i = new String[21];
                     long var8 = 4925468971200896039L;
                     long[] var14 = new long[15];
                     int var11 = 0;
                     String var12 = "o×g>a¸Gü\u00ad»P1\fV7\u0000ÛÂËÛ\u009fÈDm\u0097àÈV[\u0092&(\u008eb¯ESëGu7\u0003¸cÜ\u001c¥ßÇ\u0094¨W\u008fÁåW\u001cóô-(\u007fôv,Ès|®l)\u008d\u0085)\u0082Ê\r½¥¬\u0082üâIJôî>\u007f\u0005ªºÙ÷\u008bír\f1³\u001d³ö\u00ad";
                     int var13 = "o×g>a¸Gü\u00ad»P1\fV7\u0000ÛÂËÛ\u009fÈDm\u0097àÈV[\u0092&(\u008eb¯ESëGu7\u0003¸cÜ\u001c¥ßÇ\u0094¨W\u008fÁåW\u001cóô-(\u007fôv,Ès|®l)\u008d\u0085)\u0082Ê\r½¥¬\u0082üâIJôî>\u007f\u0005ªºÙ÷\u008bír\f1³\u001d³ö\u00ad"
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
                                    a = var14;
                                    m = new Integer[15];
                                    long var0 = 3946130602888375247L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "\u007f¤¶L\u0097D¦LPqÅÚë&gP";
                                    int var5 = "\u007f¤¶L\u0097D¦LPqÅÚë&gP".length();
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
                                                   n = var6;
                                                   p = new Long[4];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "w= xÀäàbD\u0089\u008aÖ¬\u001cÀ\u0006";
                                                var5 = "w= xÀäàbD\u0089\u008aÖ¬\u001cÀ\u0006".length();
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

                                 var12 = "êè~}BIë´\u0086[S'\u009df+\u00ad";
                                 var13 = "êè~}BIë´\u0086[S'\u009df+\u00ad".length();
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

                  var18 = "Á=*´\u008c¦TêBöñDm\u000bÒ/\u0093g«zï]]\u0090\u0015ü\t53£w±\u0083áí\u0019Øä¾ï.¤\u0002´!\u0089";
                  var20 = "Á=*´\u008c¦TêBöñDm\u000bÒ/\u0093g«zï]]\u0090\u0015ü\t53£w±\u0083áí\u0019Øä¾ï.¤\u0002´!\u0089".length();
                  var17 = 24;
                  var26 = -1;
            }

            var10000 = 79;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





