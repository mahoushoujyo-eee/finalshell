package com.finalshell.core;

import com.finalshell.config.DnsResolveFailedSetting;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.util.MacAddress;

public class SecondHandshake {
   public HashMap l = new HashMap();
   public HashMap h = new HashMap();
   public int x;
   public static Random W;
   public PcapHandle P;
   public HashSet A;
   public HashMap j;
   public MacAddress z;
   public int N;
   public boolean I;
   public short q;
   public ArrayList Z;
   public HashMap r;
   public HashMap s;
   public HashMap X;
   public HashMap Y;
   public ArrayList Q;
   public Object k;
   public int e;
   public int t;
   public long y;
   public long w;
   public Object U;
   public boolean n;
   public boolean v;
   public DnsResolveFailedSetting p;
   public Inet4Address o;
   public short S;
   public int G;
   public int B;
   public int m;
   public Inet4Address f;
   public short i;
   public int c;
   public int b;
   public int u;
   public Object R;
   public long a;
   public long L;
   public long M;
   public String T;
   public Object J;
   public static String[] d;
   public static String[] g;
   public static long[] C;
   public static Integer[] D;
   public static long[] E;
   public static Long[] F;

   static {
      __vfClinit__();
   }

   public SecondHandshake(DnsResolveFailedSetting var1, Inet4Address var2, short var3, MacAddress var4, MacAddress var5) {
      this.x = a(3703, 9014151815894142528L);
      this.A = new HashSet();
      this.j = new HashMap();
      this.N = -1;
      this.I = false;
      this.q = (short)a(8346, 2833999502224335015L);
      this.Z = new ArrayList();
      this.r = new HashMap();
      this.s = new HashMap();
      this.X = new HashMap();
      this.Y = new HashMap();
      this.Q = new ArrayList();
      this.k = new Object();
      this.e = a(21189, 7510058056251560698L);
      this.t = 0;
      this.y = 0L;
      this.w = b(20043, 9184715366709865543L);
      this.U = new Object();
      this.n = false;
      this.v = false;
      this.c = W.nextInt();
      this.u = W.nextInt(a(15937, 5884202028882017911L));
      this.R = new Object();
      this.M = System.currentTimeMillis();
      this.J = new Object();
      this.p = var1;
      this.P = var1.h;
      this.o = var2;
      this.S = var3;
      this.f = var1.W;
      this.i = (short)(W.nextInt(a(28399, 1108740448026848983L)) + a(15929, 2532844386358803968L));
      Packet var6 = null;

      try {
         var6 = W1.j(var4, var5, this.f, this.i, var2, var3, this.c, this.x());

         try {
            this.P.sendPacket(var6);
            this.b = this.c + 1;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      Jy2.g(a(27346, -1121) + this.u);
      Jy2.g("" + var6);
   }

   public SecondHandshake(DnsResolveFailedSetting var1, Inet4Address var2, short var3) {
      this.x = a(21189, 7510058056251560698L);
      this.A = new HashSet();
      this.j = new HashMap();
      this.N = -1;
      this.I = false;
      this.q = (short)a(9402, 4949397124704773252L);
      this.Z = new ArrayList();
      this.r = new HashMap();
      this.s = new HashMap();
      this.X = new HashMap();
      this.Y = new HashMap();
      this.Q = new ArrayList();
      this.k = new Object();
      this.e = a(21189, 7510058056251560698L);
      this.t = 0;
      this.y = 0L;
      this.w = b(9902, 264494635952587939L);
      this.U = new Object();
      this.n = false;
      this.v = false;
      this.c = W.nextInt();
      this.u = W.nextInt(a(29784, 7214297505542665314L));
      this.R = new Object();
      this.M = System.currentTimeMillis();
      this.J = new Object();
      this.p = var1;
      this.o = var2;
      this.S = var3;
      this.P = this.p.h;
      this.i = var1.d;
      this.f = this.p.W;
   }

   public void b(Inet4Address var1, int var2, Inet4Address var3, int var4, int var5) {
   }

   public void E(Inet4Address var1, int var2, Inet4Address var3, int var4, int var5, int var6) {
   }

   public void w(Packet param1, EthernetPacket.EthernetHeader param2, IpV4Packet.IpV4Header param3, TcpPacket param4, boolean param5) {
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
      // 00a: astore 6
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/SecondHandshake.v Z
      // 010: aload 6
      // 012: ifnonnull 02a
      // 015: ifne 312
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield com/finalshell/core/SecondHandshake.n Z
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: aload 6
      // 02c: ifnonnull 04d
      // 02f: ifne 298
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 0
      // 03a: aload 2
      // 03b: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // 03e: putfield com/finalshell/core/SecondHandshake.z Lorg/pcap4j/util/MacAddress;
      // 041: aload 7
      // 043: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 6
      // 04f: ifnonnull 1d2
      // 052: ifeq 1cd
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: aload 7
      // 05e: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 061: aload 6
      // 063: ifnonnull 1d2
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: ifne 1cd
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 0
      // 078: aload 7
      // 07a: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 07d: putfield com/finalshell/core/SecondHandshake.G I
      // 080: aload 0
      // 081: aload 0
      // 082: getfield com/finalshell/core/SecondHandshake.G I
      // 085: bipush 1
      // 086: iadd
      // 087: putfield com/finalshell/core/SecondHandshake.B I
      // 08a: aload 0
      // 08b: aload 0
      // 08c: getfield com/finalshell/core/SecondHandshake.B I
      // 08f: putfield com/finalshell/core/SecondHandshake.m I
      // 092: new java/lang/StringBuilder
      // 095: dup
      // 096: sipush 27356
      // 099: sipush 1100
      // 09c: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 09f: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0a2: aload 0
      // 0a3: getfield com/finalshell/core/SecondHandshake.o Ljava/net/Inet4Address;
      // 0a6: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: ldc_w ":"
      // 0af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b2: aload 0
      // 0b3: getfield com/finalshell/core/SecondHandshake.S S
      // 0b6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b9: sipush 27332
      // 0bc: sipush -10829
      // 0bf: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 0c9: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: ldc_w ":"
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: aload 0
      // 0d6: getfield com/finalshell/core/SecondHandshake.i S
      // 0d9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0dc: sipush 27338
      // 0df: sipush 3140
      // 0e2: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: aload 3
      // 0e9: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 0ec: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f2: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 0f5: new java/lang/StringBuilder
      // 0f8: dup
      // 0f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fc: aload 1
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 106: aload 0
      // 107: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 10a: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 10d: aload 0
      // 10e: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 111: getfield com/finalshell/config/DnsResolveFailedSetting.c Lorg/pcap4j/util/MacAddress;
      // 114: aload 0
      // 115: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 118: aload 0
      // 119: getfield com/finalshell/core/SecondHandshake.i S
      // 11c: aload 3
      // 11d: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 120: aload 7
      // 122: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 125: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 128: checkcast java/lang/Short
      // 12b: invokevirtual java/lang/Short.shortValue ()S
      // 12e: aload 7
      // 130: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 133: bipush 1
      // 134: iadd
      // 135: aload 0
      // 136: getfield com/finalshell/core/SecondHandshake.c I
      // 139: bipush 0
      // 13a: invokestatic com/finalshell/core/W1.o (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;SLjava/net/Inet4Address;SIIS)Lorg/pcap4j/packet/Packet;
      // 13d: astore 8
      // 13f: aload 0
      // 140: getfield com/finalshell/core/SecondHandshake.P Lorg/pcap4j/core/PcapHandle;
      // 143: aload 8
      // 145: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 148: goto 152
      // 14b: astore 9
      // 14d: aload 9
      // 14f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 152: aload 0
      // 153: aload 0
      // 154: getfield com/finalshell/core/SecondHandshake.c I
      // 157: bipush 1
      // 158: iadd
      // 159: putfield com/finalshell/core/SecondHandshake.b I
      // 15c: new java/lang/StringBuilder
      // 15f: dup
      // 160: sipush 27351
      // 163: sipush 17830
      // 166: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 169: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 16c: aload 0
      // 16d: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 170: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 176: sipush 27359
      // 179: sipush 16191
      // 17c: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 17f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 182: aload 0
      // 183: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 186: getfield com/finalshell/config/DnsResolveFailedSetting.c Lorg/pcap4j/util/MacAddress;
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18c: ldc_w " "
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: aload 0
      // 193: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 199: sipush 27359
      // 19c: sipush 16191
      // 19f: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: sipush 27349
      // 1a8: sipush 26796
      // 1ab: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 1ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b1: bipush 0
      // 1b2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b8: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 1bb: new java/lang/StringBuilder
      // 1be: dup
      // 1bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c2: aload 8
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ca: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 1cd: aload 7
      // 1cf: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 1d2: aload 6
      // 1d4: ifnonnull 359
      // 1d7: ifne 354
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: aload 7
      // 1e3: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 1e6: aload 6
      // 1e8: ifnonnull 359
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: ifeq 354
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: aload 4
      // 1fe: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 201: aload 6
      // 203: ifnonnull 282
      // 206: goto 20d
      // 209: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: ifnonnull 273
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: aload 7
      // 219: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 21c: aload 6
      // 21e: ifnonnull 291
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: aload 0
      // 229: getfield com/finalshell/core/SecondHandshake.b I
      // 22c: if_icmpne 273
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: new java/lang/StringBuilder
      // 239: dup
      // 23a: sipush 27328
      // 23d: sipush 11813
      // 240: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 243: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 246: aload 3
      // 247: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 24a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 24d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 250: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 253: new java/lang/StringBuilder
      // 256: dup
      // 257: invokespecial java/lang/StringBuilder.<init> ()V
      // 25a: aload 1
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 25e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 261: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 264: new com/finalshell/task/FS
      // 267: dup
      // 268: aload 0
      // 269: invokespecial com/finalshell/task/FS.<init> (Lcom/finalshell/core/SecondHandshake;)V
      // 26c: astore 8
      // 26e: aload 0
      // 26f: bipush 1
      // 270: putfield com/finalshell/core/SecondHandshake.n Z
      // 273: aload 0
      // 274: getfield com/finalshell/core/SecondHandshake.l Ljava/util/HashMap;
      // 277: aload 7
      // 279: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 27c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27f: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 282: pop
      // 283: aload 0
      // 284: getfield com/finalshell/core/SecondHandshake.A Ljava/util/HashSet;
      // 287: aload 3
      // 288: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 28b: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 28e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 291: istore 8
      // 293: aload 6
      // 295: ifnull 354
      // 298: aload 4
      // 29a: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 29d: ifnull 354
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: bipush 1
      // 2a9: putfield com/finalshell/core/SecondHandshake.v Z
      // 2ac: aload 0
      // 2ad: aload 4
      // 2af: aload 7
      // 2b1: aload 3
      // 2b2: invokevirtual com/finalshell/core/SecondHandshake.i (Lorg/pcap4j/packet/TcpPacket;Lorg/pcap4j/packet/TcpPacket$TcpHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;)V
      // 2b5: new java/lang/String
      // 2b8: dup
      // 2b9: aload 4
      // 2bb: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 2be: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 2c3: invokespecial java/lang/String.<init> ([B)V
      // 2c6: astore 8
      // 2c8: new java/lang/StringBuilder
      // 2cb: dup
      // 2cc: sipush 27334
      // 2cf: sipush 13098
      // 2d2: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 2d5: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 2d8: aload 3
      // 2d9: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 2dc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e2: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 2e5: new java/lang/StringBuilder
      // 2e8: dup
      // 2e9: sipush 27330
      // 2ec: sipush -17442
      // 2ef: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 2f2: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 2f5: aload 0
      // 2f6: getfield com/finalshell/core/SecondHandshake.u I
      // 2f9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ff: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 302: invokestatic com/finalshell/core/SecondHandshake.K ()[B
      // 305: astore 9
      // 307: aload 0
      // 308: aload 9
      // 30a: invokevirtual com/finalshell/core/SecondHandshake.P ([B)V
      // 30d: aload 6
      // 30f: ifnull 354
      // 312: aload 4
      // 314: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 317: ifnull 354
      // 31a: goto 321
      // 31d: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 320: athrow
      // 321: aload 0
      // 322: aload 4
      // 324: aload 7
      // 326: aload 3
      // 327: invokevirtual com/finalshell/core/SecondHandshake.i (Lorg/pcap4j/packet/TcpPacket;Lorg/pcap4j/packet/TcpPacket$TcpHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;)V
      // 32a: new com/finalshell/core/UL
      // 32d: dup
      // 32e: invokespecial com/finalshell/core/UL.<init> ()V
      // 331: astore 8
      // 333: aload 8
      // 335: aload 0
      // 336: putfield com/finalshell/core/UL.V Lcom/finalshell/core/SecondHandshake;
      // 339: aload 8
      // 33b: aload 4
      // 33d: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 340: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 345: putfield com/finalshell/core/UL.W [B
      // 348: aload 0
      // 349: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 34c: getfield com/finalshell/config/DnsResolveFailedSetting.f Lcom/finalshell/network/Tunnel;
      // 34f: aload 8
      // 351: invokevirtual com/finalshell/network/Tunnel.T (Lcom/finalshell/core/UL;)V
      // 354: aload 7
      // 356: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getRst ()Z
      // 359: ifeq 3e7
      // 35c: new java/lang/StringBuilder
      // 35f: dup
      // 360: sipush 27345
      // 363: sipush -17989
      // 366: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 369: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 36c: aload 3
      // 36d: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 370: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 373: ldc_w " "
      // 376: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 379: aload 7
      // 37b: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 37e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 381: ldc_w " "
      // 384: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 387: aload 0
      // 388: getfield com/finalshell/core/SecondHandshake.o Ljava/net/Inet4Address;
      // 38b: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 38e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 391: ldc_w ":"
      // 394: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 397: aload 0
      // 398: getfield com/finalshell/core/SecondHandshake.S S
      // 39b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 39e: sipush 27359
      // 3a1: sipush 16191
      // 3a4: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 3a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3aa: aload 0
      // 3ab: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 3ae: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 3b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b4: ldc_w ":"
      // 3b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ba: aload 0
      // 3bb: getfield com/finalshell/core/SecondHandshake.i S
      // 3be: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3c1: ldc_w " "
      // 3c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c7: sipush 27349
      // 3ca: sipush 26796
      // 3cd: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 3d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d3: aload 3
      // 3d4: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 3d7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3dd: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 3e0: goto 3e7
      // 3e3: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e6: athrow
      // 3e7: return
   }

   public void P(
      DnsResolveFailedSetting param1, Packet param2, EthernetPacket.EthernetHeader param3, IpV4Packet.IpV4Header param4, TcpPacket param5, boolean param6
   ) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: aload 5
      // 005: invokevirtual org/pcap4j/packet/TcpPacket.getHeader$TcpPacket_TcpHeader ()Lorg/pcap4j/packet/TcpPacket$TcpHeader;
      // 008: astore 8
      // 00a: astore 7
      // 00c: aconst_null
      // 00d: astore 9
      // 00f: aload 5
      // 011: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 014: aload 7
      // 016: ifnonnull 02f
      // 019: ifnull 036
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 5
      // 025: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 034: astore 9
      // 036: aload 0
      // 037: getfield com/finalshell/core/SecondHandshake.v Z
      // 03a: aload 7
      // 03c: ifnonnull 054
      // 03f: ifne 203
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/finalshell/core/SecondHandshake.n Z
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: aload 7
      // 056: ifnonnull 06f
      // 059: ifne 1af
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 8
      // 065: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAck ()Z
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 7
      // 071: ifnonnull 248
      // 074: ifeq 243
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 8
      // 080: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSyn ()Z
      // 083: aload 7
      // 085: ifnonnull 248
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: ifeq 243
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 8
      // 09b: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getAcknowledgmentNumber ()I
      // 09e: aload 7
      // 0a0: ifnonnull 248
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield com/finalshell/core/SecondHandshake.c I
      // 0ae: bipush 1
      // 0af: iadd
      // 0b0: if_icmpne 243
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: new java/lang/StringBuilder
      // 0bd: dup
      // 0be: sipush 27352
      // 0c1: sipush -18948
      // 0c4: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 0c7: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0ca: aload 4
      // 0cc: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 0cf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d5: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 0d8: new java/lang/StringBuilder
      // 0db: dup
      // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0df: aload 2
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e6: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 0e9: aload 0
      // 0ea: aload 8
      // 0ec: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 0ef: putfield com/finalshell/core/SecondHandshake.G I
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/core/SecondHandshake.G I
      // 0f7: bipush 1
      // 0f8: iadd
      // 0f9: putfield com/finalshell/core/SecondHandshake.B I
      // 0fc: aload 0
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/SecondHandshake.B I
      // 101: putfield com/finalshell/core/SecondHandshake.m I
      // 104: aload 1
      // 105: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 108: aload 1
      // 109: getfield com/finalshell/config/DnsResolveFailedSetting.c Lorg/pcap4j/util/MacAddress;
      // 10c: aload 1
      // 10d: getfield com/finalshell/config/DnsResolveFailedSetting.W Ljava/net/Inet4Address;
      // 110: aload 0
      // 111: getfield com/finalshell/core/SecondHandshake.i S
      // 114: aload 0
      // 115: getfield com/finalshell/core/SecondHandshake.o Ljava/net/Inet4Address;
      // 118: aload 0
      // 119: getfield com/finalshell/core/SecondHandshake.S S
      // 11c: aload 0
      // 11d: getfield com/finalshell/core/SecondHandshake.B I
      // 120: aload 0
      // 121: getfield com/finalshell/core/SecondHandshake.b I
      // 124: aload 0
      // 125: invokevirtual com/finalshell/core/SecondHandshake.x ()S
      // 128: invokestatic com/finalshell/core/W1.X (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;SLjava/net/Inet4Address;SIIS)Lorg/pcap4j/packet/Packet;
      // 12b: astore 10
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/SecondHandshake.P Lorg/pcap4j/core/PcapHandle;
      // 131: aload 10
      // 133: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 136: new java/lang/StringBuilder
      // 139: dup
      // 13a: sipush 27348
      // 13d: sipush 29870
      // 140: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 143: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 146: aload 0
      // 147: getfield com/finalshell/core/SecondHandshake.u I
      // 14a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 153: new java/lang/StringBuilder
      // 156: dup
      // 157: invokespecial java/lang/StringBuilder.<init> ()V
      // 15a: aload 10
      // 15c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 162: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 165: aload 0
      // 166: bipush 1
      // 167: putfield com/finalshell/core/SecondHandshake.n Z
      // 16a: aload 0
      // 16b: getfield com/finalshell/core/SecondHandshake.S S
      // 16e: invokestatic com/finalshell/core/SecondHandshake.A (I)[B
      // 171: astore 11
      // 173: aload 0
      // 174: aload 11
      // 176: invokevirtual com/finalshell/core/SecondHandshake.P ([B)V
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: sipush 27354
      // 180: sipush -10773
      // 183: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 186: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 189: aload 0
      // 18a: getfield com/finalshell/core/SecondHandshake.u I
      // 18d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 190: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 193: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 196: goto 243
      // 199: astore 11
      // 19b: aload 11
      // 19d: invokevirtual org/pcap4j/core/PcapNativeException.printStackTrace ()V
      // 1a0: goto 243
      // 1a3: astore 11
      // 1a5: aload 11
      // 1a7: invokevirtual org/pcap4j/core/NotOpenException.printStackTrace ()V
      // 1aa: aload 7
      // 1ac: ifnull 243
      // 1af: aload 5
      // 1b1: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1b4: ifnull 243
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: bipush 1
      // 1c0: putfield com/finalshell/core/SecondHandshake.v Z
      // 1c3: aload 0
      // 1c4: aload 5
      // 1c6: aload 8
      // 1c8: aload 4
      // 1ca: invokevirtual com/finalshell/core/SecondHandshake.i (Lorg/pcap4j/packet/TcpPacket;Lorg/pcap4j/packet/TcpPacket$TcpHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;)V
      // 1cd: new java/lang/String
      // 1d0: dup
      // 1d1: aload 5
      // 1d3: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 1d6: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 1db: invokespecial java/lang/String.<init> ([B)V
      // 1de: astore 10
      // 1e0: new java/lang/StringBuilder
      // 1e3: dup
      // 1e4: sipush 27350
      // 1e7: sipush -20690
      // 1ea: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 1ed: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1f0: aload 4
      // 1f2: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 1f5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fb: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 1fe: aload 7
      // 200: ifnull 243
      // 203: aload 5
      // 205: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 208: ifnull 243
      // 20b: goto 212
      // 20e: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: aload 0
      // 213: aload 5
      // 215: aload 8
      // 217: aload 4
      // 219: invokevirtual com/finalshell/core/SecondHandshake.i (Lorg/pcap4j/packet/TcpPacket;Lorg/pcap4j/packet/TcpPacket$TcpHeader;Lorg/pcap4j/packet/IpV4Packet$IpV4Header;)V
      // 21c: new com/finalshell/core/UL
      // 21f: dup
      // 220: invokespecial com/finalshell/core/UL.<init> ()V
      // 223: astore 10
      // 225: aload 10
      // 227: aload 0
      // 228: putfield com/finalshell/core/UL.V Lcom/finalshell/core/SecondHandshake;
      // 22b: aload 10
      // 22d: aload 5
      // 22f: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 232: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 237: putfield com/finalshell/core/UL.W [B
      // 23a: aload 1
      // 23b: getfield com/finalshell/config/DnsResolveFailedSetting.f Lcom/finalshell/network/Tunnel;
      // 23e: aload 10
      // 240: invokevirtual com/finalshell/network/Tunnel.T (Lcom/finalshell/core/UL;)V
      // 243: aload 8
      // 245: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getRst ()Z
      // 248: ifeq 2be
      // 24b: new java/lang/StringBuilder
      // 24e: dup
      // 24f: sipush 27329
      // 252: sipush -32623
      // 255: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 258: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 25b: aload 4
      // 25d: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getIdentification ()S
      // 260: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 263: ldc_w " "
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 269: aload 8
      // 26b: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 26e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 271: ldc_w " "
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: aload 0
      // 278: getfield com/finalshell/core/SecondHandshake.o Ljava/net/Inet4Address;
      // 27b: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 27e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 281: ldc_w ":"
      // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 287: aload 0
      // 288: getfield com/finalshell/core/SecondHandshake.S S
      // 28b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 28e: sipush 27359
      // 291: sipush 16191
      // 294: invokestatic com/finalshell/core/SecondHandshake.a (II)Ljava/lang/String;
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29a: aload 0
      // 29b: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 29e: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: ldc_w ":"
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: aload 0
      // 2ab: getfield com/finalshell/core/SecondHandshake.i S
      // 2ae: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b4: invokestatic com/finalshell/core/Jy2.g (Ljava/lang/String;)V
      // 2b7: goto 2be
      // 2ba: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bd: athrow
      // 2be: return
   }

   public void i(TcpPacket param1, TcpPacket.TcpHeader param2, IpV4Packet.IpV4Header param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: astore 4
      // 05: invokestatic java/lang/System.currentTimeMillis ()J
      // 08: aload 0
      // 09: getfield com/finalshell/core/SecondHandshake.a J
      // 0c: lsub
      // 0d: sipush 10895
      // 10: ldc2_w 7366791687657310336
      // 13: invokestatic com/finalshell/core/SecondHandshake.b (IJ)J
      // 16: lcmp
      // 17: aload 4
      // 19: ifnonnull 3c
      // 1c: ifle ad
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSequenceNumber ()I
      // 2a: aload 1
      // 2b: invokevirtual org/pcap4j/packet/TcpPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 2e: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 33: arraylength
      // 34: iadd
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: istore 5
      // 3e: iload 5
      // 40: aload 0
      // 41: getfield com/finalshell/core/SecondHandshake.m I
      // 44: if_icmple 54
      // 47: aload 0
      // 48: iload 5
      // 4a: putfield com/finalshell/core/SecondHandshake.m I
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/SecondHandshake.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 58: getfield com/finalshell/config/DnsResolveFailedSetting.F Lorg/pcap4j/util/MacAddress;
      // 5b: aload 0
      // 5c: getfield com/finalshell/core/SecondHandshake.p Lcom/finalshell/config/DnsResolveFailedSetting;
      // 5f: getfield com/finalshell/config/DnsResolveFailedSetting.c Lorg/pcap4j/util/MacAddress;
      // 62: aload 0
      // 63: getfield com/finalshell/core/SecondHandshake.f Ljava/net/Inet4Address;
      // 66: aload 0
      // 67: getfield com/finalshell/core/SecondHandshake.i S
      // 6a: aload 3
      // 6b: invokevirtual org/pcap4j/packet/IpV4Packet$IpV4Header.getSrcAddr ()Ljava/net/Inet4Address;
      // 6e: aload 2
      // 6f: invokevirtual org/pcap4j/packet/TcpPacket$TcpHeader.getSrcPort ()Lorg/pcap4j/packet/namednumber/TcpPort;
      // 72: invokevirtual org/pcap4j/packet/namednumber/TcpPort.value ()Ljava/lang/Number;
      // 75: checkcast java/lang/Short
      // 78: invokevirtual java/lang/Short.shortValue ()S
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/SecondHandshake.m I
      // 7f: aload 0
      // 80: getfield com/finalshell/core/SecondHandshake.b I
      // 83: aload 0
      // 84: invokevirtual com/finalshell/core/SecondHandshake.x ()S
      // 87: invokestatic com/finalshell/core/W1.X (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;SLjava/net/Inet4Address;SIIS)Lorg/pcap4j/packet/Packet;
      // 8a: astore 6
      // 8c: aload 0
      // 8d: getfield com/finalshell/core/SecondHandshake.P Lorg/pcap4j/core/PcapHandle;
      // 90: aload 6
      // 92: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 95: goto 9f
      // 98: astore 7
      // 9a: aload 7
      // 9c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 9f: aload 0
      // a0: invokestatic java/lang/System.currentTimeMillis ()J
      // a3: putfield com/finalshell/core/SecondHandshake.a J
      // a6: aload 0
      // a7: invokestatic java/lang/System.currentTimeMillis ()J
      // aa: putfield com/finalshell/core/SecondHandshake.L J
      // ad: return
   }

   public void P(byte[] var1) {
      Packet var2 = W1.V(this.p.F, this.p.c, this.f, this.i, this.o, this.S, this.b, this.m, var1, this.x());
      synchronized (this.R) {
         try {
            this.P.sendPacket(var2);
            this.b += var1.length;
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public short x() {
      String[] var10000 = DnsResolveFailedSetting.I$arrString();
      Object var2 = this.J;
      synchronized (this.J){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         this.u++;
         var10000 = this;
         if (var1 == null) {
            if (this.u >= a(1562, 7439966017211434529L)) {
               this.u = 0;
            }

            var10000 = (String[])var2;
         }

         // $VF: monitorexit
      } catch (Throwable var4) {
         // $VF: monitorexit
         throw var4;
      }

      return (short)this.u;
   }

   public static byte[] K() {
      StringBuffer var0 = new StringBuffer();
      var0.append(a(27340, 31877));
      var0.append(a(27331, 15506));
      var0.append(a(27336, -8392));
      var0.append(a(27380, 6290) + Math.abs(W.nextInt()) + a(27358, -2322));
      var0.append(a(27344, 26317));
      var0.append(a(27337, 27657));
      var0.append(a(27353, -17131));
      String var1 = var0.toString();
      byte[] var2 = var1.getBytes();
      int var3 = var2.length;
      return var2;
   }

   public static byte[] A(int var0) {
      StringBuffer var1 = new StringBuffer();
      String var2 = f(5 + W.nextInt(a(10764, 9129136843777059376L))) + a(27335, -27882);
      var1.append(
         a(27355, -27588)
            + f(a(19358, 2880729365847919530L) + W.nextInt(a(2389, 5394392816280602976L)))
            + "."
            + f(2 + W.nextInt(5))
            + a(27333, -3101)
            + a(27353, -17131)
      );
      var1.append(a(27342, -30645));
      var1.append(a(27343, 23582));
      var1.append(a(27347, -4345));
      var1.append(a(27339, -26907));
      var1.append(a(27381, -32003) + var2 + a(27353, -17131));
      var1.append(a(27357, -27636));
      var1.append(a(27353, -17131));
      String var3 = var1.toString();
      return var3.getBytes();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String f(int var0) {
      String[] var10000 = DnsResolveFailedSetting.I$arrString();
      String var2 = a(27341, 15682);
      Random var3 = new Random();
      String[] var1 = var10000;
      StringBuffer var4 = new StringBuffer();
      int var5 = 0;
      if (var1 == null && var5 >= var0) {
         return var4.toString();
      } else {
         do {
            int var6 = var3.nextInt(var2.length());
            var4.append(var2.charAt(var6));
         } while (++var5 < var0);

         return var4.toString();
      }
   }

   public InetAddress U() {
      return this.f;
   }

   public int D() {
      return this.i;
   }

   public void G(short var1) {
      this.i = var1;
   }

   public boolean P() {
      return this.n;
   }

   public void a(boolean var1) {
      this.n = var1;
   }

   public String u() {
      return this.T;
   }

   public void u(String var1) {
      this.T = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 27349) & 65535;
      if (g[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 69;
               break;
            case 1:
               var10000 = 200;
               break;
            case 2:
               var10000 = 214;
               break;
            case 3:
               var10000 = 9;
               break;
            case 4:
               var10000 = 249;
               break;
            case 5:
               var10000 = 105;
               break;
            case 6:
               var10000 = 117;
               break;
            case 7:
               var10000 = 40;
               break;
            case 8:
               var10000 = 161;
               break;
            case 9:
               var10000 = 253;
               break;
            case 10:
               var10000 = 134;
               break;
            case 11:
               var10000 = 158;
               break;
            case 12:
               var10000 = 20;
               break;
            case 13:
               var10000 = 73;
               break;
            case 14:
               var10000 = 254;
               break;
            case 15:
               var10000 = 101;
               break;
            case 16:
               var10000 = 18;
               break;
            case 17:
               var10000 = 184;
               break;
            case 18:
               var10000 = 204;
               break;
            case 19:
               var10000 = 31;
               break;
            case 20:
               var10000 = 98;
               break;
            case 21:
               var10000 = 126;
               break;
            case 22:
               var10000 = 80;
               break;
            case 23:
               var10000 = 143;
               break;
            case 24:
               var10000 = 150;
               break;
            case 25:
               var10000 = 206;
               break;
            case 26:
               var10000 = 151;
               break;
            case 27:
               var10000 = 121;
               break;
            case 28:
               var10000 = 14;
               break;
            case 29:
               var10000 = 227;
               break;
            case 30:
               var10000 = 191;
               break;
            case 31:
               var10000 = 78;
               break;
            case 32:
               var10000 = 197;
               break;
            case 33:
               var10000 = 217;
               break;
            case 34:
               var10000 = 248;
               break;
            case 35:
               var10000 = 55;
               break;
            case 36:
               var10000 = 183;
               break;
            case 37:
               var10000 = 250;
               break;
            case 38:
               var10000 = 129;
               break;
            case 39:
               var10000 = 224;
               break;
            case 40:
               var10000 = 81;
               break;
            case 41:
               var10000 = 7;
               break;
            case 42:
               var10000 = 52;
               break;
            case 43:
               var10000 = 115;
               break;
            case 44:
               var10000 = 3;
               break;
            case 45:
               var10000 = 5;
               break;
            case 46:
               var10000 = 174;
               break;
            case 47:
               var10000 = 72;
               break;
            case 48:
               var10000 = 255;
               break;
            case 49:
               var10000 = 148;
               break;
            case 50:
               var10000 = 131;
               break;
            case 51:
               var10000 = 180;
               break;
            case 52:
               var10000 = 66;
               break;
            case 53:
               var10000 = 24;
               break;
            case 54:
               var10000 = 110;
               break;
            case 55:
               var10000 = 203;
               break;
            case 56:
               var10000 = 27;
               break;
            case 57:
               var10000 = 240;
               break;
            case 58:
               var10000 = 19;
               break;
            case 59:
               var10000 = 181;
               break;
            case 60:
               var10000 = 231;
               break;
            case 61:
               var10000 = 142;
               break;
            case 62:
               var10000 = 62;
               break;
            case 63:
               var10000 = 141;
               break;
            case 64:
               var10000 = 94;
               break;
            case 65:
               var10000 = 82;
               break;
            case 66:
               var10000 = 190;
               break;
            case 67:
               var10000 = 21;
               break;
            case 68:
               var10000 = 107;
               break;
            case 69:
               var10000 = 26;
               break;
            case 70:
               var10000 = 70;
               break;
            case 71:
               var10000 = 230;
               break;
            case 72:
               var10000 = 212;
               break;
            case 73:
               var10000 = 219;
               break;
            case 74:
               var10000 = 36;
               break;
            case 75:
               var10000 = 233;
               break;
            case 76:
               var10000 = 133;
               break;
            case 77:
               var10000 = 195;
               break;
            case 78:
               var10000 = 8;
               break;
            case 79:
               var10000 = 192;
               break;
            case 80:
               var10000 = 25;
               break;
            case 81:
               var10000 = 252;
               break;
            case 82:
               var10000 = 170;
               break;
            case 83:
               var10000 = 243;
               break;
            case 84:
               var10000 = 102;
               break;
            case 85:
               var10000 = 104;
               break;
            case 86:
               var10000 = 144;
               break;
            case 87:
               var10000 = 108;
               break;
            case 88:
               var10000 = 202;
               break;
            case 89:
               var10000 = 171;
               break;
            case 90:
               var10000 = 226;
               break;
            case 91:
               var10000 = 39;
               break;
            case 92:
               var10000 = 56;
               break;
            case 93:
               var10000 = 53;
               break;
            case 94:
               var10000 = 244;
               break;
            case 95:
               var10000 = 32;
               break;
            case 96:
               var10000 = 23;
               break;
            case 97:
               var10000 = 182;
               break;
            case 98:
               var10000 = 89;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 6;
               break;
            case 101:
               var10000 = 237;
               break;
            case 102:
               var10000 = 74;
               break;
            case 103:
               var10000 = 60;
               break;
            case 104:
               var10000 = 111;
               break;
            case 105:
               var10000 = 216;
               break;
            case 106:
               var10000 = 159;
               break;
            case 107:
               var10000 = 236;
               break;
            case 108:
               var10000 = 88;
               break;
            case 109:
               var10000 = 185;
               break;
            case 110:
               var10000 = 218;
               break;
            case 111:
               var10000 = 93;
               break;
            case 112:
               var10000 = 246;
               break;
            case 113:
               var10000 = 245;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 61;
               break;
            case 116:
               var10000 = 96;
               break;
            case 117:
               var10000 = 44;
               break;
            case 118:
               var10000 = 222;
               break;
            case 119:
               var10000 = 221;
               break;
            case 120:
               var10000 = 10;
               break;
            case 121:
               var10000 = 90;
               break;
            case 122:
               var10000 = 234;
               break;
            case 123:
               var10000 = 167;
               break;
            case 124:
               var10000 = 205;
               break;
            case 125:
               var10000 = 225;
               break;
            case 126:
               var10000 = 146;
               break;
            case 127:
               var10000 = 43;
               break;
            case 128:
               var10000 = 30;
               break;
            case 129:
               var10000 = 58;
               break;
            case 130:
               var10000 = 75;
               break;
            case 131:
               var10000 = 211;
               break;
            case 132:
               var10000 = 229;
               break;
            case 133:
               var10000 = 48;
               break;
            case 134:
               var10000 = 213;
               break;
            case 135:
               var10000 = 46;
               break;
            case 136:
               var10000 = 79;
               break;
            case 137:
               var10000 = 106;
               break;
            case 138:
               var10000 = 120;
               break;
            case 139:
               var10000 = 113;
               break;
            case 140:
               var10000 = 136;
               break;
            case 141:
               var10000 = 239;
               break;
            case 142:
               var10000 = 95;
               break;
            case 143:
               var10000 = 145;
               break;
            case 144:
               var10000 = 149;
               break;
            case 145:
               var10000 = 47;
               break;
            case 146:
               var10000 = 130;
               break;
            case 147:
               var10000 = 84;
               break;
            case 148:
               var10000 = 132;
               break;
            case 149:
               var10000 = 87;
               break;
            case 150:
               var10000 = 15;
               break;
            case 151:
               var10000 = 37;
               break;
            case 152:
               var10000 = 16;
               break;
            case 153:
               var10000 = 49;
               break;
            case 154:
               var10000 = 13;
               break;
            case 155:
               var10000 = 116;
               break;
            case 156:
               var10000 = 152;
               break;
            case 157:
               var10000 = 176;
               break;
            case 158:
               var10000 = 35;
               break;
            case 159:
               var10000 = 169;
               break;
            case 160:
               var10000 = 163;
               break;
            case 161:
               var10000 = 164;
               break;
            case 162:
               var10000 = 2;
               break;
            case 163:
               var10000 = 34;
               break;
            case 164:
               var10000 = 17;
               break;
            case 165:
               var10000 = 173;
               break;
            case 166:
               var10000 = 140;
               break;
            case 167:
               var10000 = 51;
               break;
            case 168:
               var10000 = 209;
               break;
            case 169:
               var10000 = 122;
               break;
            case 170:
               var10000 = 193;
               break;
            case 171:
               var10000 = 97;
               break;
            case 172:
               var10000 = 196;
               break;
            case 173:
               var10000 = 119;
               break;
            case 174:
               var10000 = 153;
               break;
            case 175:
               var10000 = 137;
               break;
            case 176:
               var10000 = 22;
               break;
            case 177:
               var10000 = 215;
               break;
            case 178:
               var10000 = 124;
               break;
            case 179:
               var10000 = 68;
               break;
            case 180:
               var10000 = 235;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 187;
               break;
            case 183:
               var10000 = 201;
               break;
            case 184:
               var10000 = 162;
               break;
            case 185:
               var10000 = 63;
               break;
            case 186:
               var10000 = 42;
               break;
            case 187:
               var10000 = 208;
               break;
            case 188:
               var10000 = 156;
               break;
            case 189:
               var10000 = 91;
               break;
            case 190:
               var10000 = 92;
               break;
            case 191:
               var10000 = 50;
               break;
            case 192:
               var10000 = 188;
               break;
            case 193:
               var10000 = 189;
               break;
            case 194:
               var10000 = 223;
               break;
            case 195:
               var10000 = 83;
               break;
            case 196:
               var10000 = 207;
               break;
            case 197:
               var10000 = 71;
               break;
            case 198:
               var10000 = 199;
               break;
            case 199:
               var10000 = 29;
               break;
            case 200:
               var10000 = 247;
               break;
            case 201:
               var10000 = 57;
               break;
            case 202:
               var10000 = 186;
               break;
            case 203:
               var10000 = 177;
               break;
            case 204:
               var10000 = 125;
               break;
            case 205:
               var10000 = 103;
               break;
            case 206:
               var10000 = 135;
               break;
            case 207:
               var10000 = 232;
               break;
            case 208:
               var10000 = 154;
               break;
            case 209:
               var10000 = 12;
               break;
            case 210:
               var10000 = 1;
               break;
            case 211:
               var10000 = 123;
               break;
            case 212:
               var10000 = 139;
               break;
            case 213:
               var10000 = 241;
               break;
            case 214:
               var10000 = 45;
               break;
            case 215:
               var10000 = 59;
               break;
            case 216:
               var10000 = 76;
               break;
            case 217:
               var10000 = 179;
               break;
            case 218:
               var10000 = 38;
               break;
            case 219:
               var10000 = 157;
               break;
            case 220:
               var10000 = 155;
               break;
            case 221:
               var10000 = 165;
               break;
            case 222:
               var10000 = 28;
               break;
            case 223:
               var10000 = 128;
               break;
            case 224:
               var10000 = 54;
               break;
            case 225:
               var10000 = 0;
               break;
            case 226:
               var10000 = 210;
               break;
            case 227:
               var10000 = 147;
               break;
            case 228:
               var10000 = 112;
               break;
            case 229:
               var10000 = 109;
               break;
            case 230:
               var10000 = 4;
               break;
            case 231:
               var10000 = 11;
               break;
            case 232:
               var10000 = 33;
               break;
            case 233:
               var10000 = 251;
               break;
            case 234:
               var10000 = 242;
               break;
            case 235:
               var10000 = 198;
               break;
            case 236:
               var10000 = 194;
               break;
            case 237:
               var10000 = 238;
               break;
            case 238:
               var10000 = 85;
               break;
            case 239:
               var10000 = 138;
               break;
            case 240:
               var10000 = 64;
               break;
            case 241:
               var10000 = 228;
               break;
            case 242:
               var10000 = 168;
               break;
            case 243:
               var10000 = 166;
               break;
            case 244:
               var10000 = 220;
               break;
            case 245:
               var10000 = 65;
               break;
            case 246:
               var10000 = 127;
               break;
            case 247:
               var10000 = 41;
               break;
            case 248:
               var10000 = 118;
               break;
            case 249:
               var10000 = 86;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 77;
               break;
            case 252:
               var10000 = 67;
               break;
            case 253:
               var10000 = 178;
               break;
            case 254:
               var10000 = 100;
               break;
            default:
               var10000 = 175;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 61;
      if (D[var3] == null) {
         D[var3] = (int)(C[var3] ^ var1);
      }

      return D[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 25101) & 32767;
      if (F[var3] == null) {
         F[var3] = E[var3] ^ var1;
      }

      return F[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var43;
      String[] var21 = new String[34];
      int var19 = 0;
      String var18 = "7@â\u0010¨¨\u0001\u000f匴遐笅丛歚掽抒¸U\u001eÓ\u0090ë8\f\b匚道節仾毢挴抅\u0089\f捤攌吔廜¤ªNçí>96\r\u0099ö8K\u001c\u0097\u009eEËÊ*Y»\u0018´{\u0097ºF\u0080â\u0084Ìþ\u0018.\"\u0013ñÞ\u009eÝE¬¨F¥O Á±veÃ\u0006¼\u008dt{{v\u0093ß£g\u009bÏ_\f9\u001b|ê÷¡Lhî nþ\u000f厉邏箲仩殬揋扌v\u008eÇ¨«\u0084_á\u0018Lb\u0088\u0099¥ä\u009e\bCoé\u001c\u001cU6\u0016fÄZ\u008fK\"ÙÃ\b挵斤篟九欁捝拹¤\u00028Q\u0002ø\u008d\u0002}¨\u000f揅旷篁亻毂掜抁\u009c7\u009a\u009f\u0000b*=\u0005uÕ\u0011N¡\f卓郗謲沠\u001d)y\u0097\u000b0å÷\t&Äð´âp \u00187\u0002Á\u008a\u0004lØM@\f掷救譔没Ñ\tà\u00938°\u0083ç\r&zÏÚâ¥A\u00030\u0002U@T\u000f挪攺笼亇歽挮扶ÊÉP@Y\u0099\u0001B Äþ\u0097YÙö_0Ò\u0016k\u00ad_HS÷Ê\u0081îb\u0094\u0089,\u0012ôu4ÕÝ0Ë9\f厷郾咔幓´[LÙ\u00adù1Î\u0017Øªq&6]ÿ\u009b\u001a?\u0012:\u0086#.MÉøÇ¤¯\u0086ý\u0011ì\u0093ÌÅ\u001aÄ0LÈè4+\u0087\u008bmßÁ\u0018oõ£íy\u0017ë¦\u0091;!ÃÙSáÞ\u0091å\f³0B%\u0081|ÚO\u0015º¯ý&\u0097Ýâ¿<÷\u0092),E)ð\u009fRæUc~b æäÎZÅB\u008bJ©âò¥e\u0086\u009c\n2¦Åä¶î\u008f\u0010á\u0006\\À\u009eÏ\u00ad\u0099\u0019k\u0099!j;(µî\u0082QNîM\u00adþ\u0005`ö§9 =\u0099ð\u0088>òÖ\u0088t&r\u0083\u0013¬»J´\u0086\u0081\u0083\u008b'\u001dWÄÅqZ»F\u001b×\u0003TO¦\u009f\u001d\u0082\u00adQK=(Á29\u0089\u0093²X* ð\u0083_#\u0095\u008aã(W`\u007f¾fö\u001dÍ|b±HYÃö\u00835\u0088ËI\u0099P\u008b\u0016\u009e=\u009dô¾4\u0013Ü\u008e©Â\u0081·T9\u0090>q\u0086°\u0083óV{h±[ \u0001lÞm\"\rì\u0086A¼Æ\u008aÉ£à\u009b\nÕÎ\u009dØà_Î\"\u0002\u008c\u008bÕ\u0096ï?³\u001fÔÃ\u0006á/èU¤/-E¦g¦å\u0003é\u0084s\u0095\u009bb\u0004òÂ¡Y\u000b~q^úØJoÇÛ5/q\fS\u000f\u0006¶Ôï\u0007©¢1LÒ#N";
      int var20 = "7@â\u0010¨¨\u0001\u000f匴遐笅丛歚掽抒¸U\u001eÓ\u0090ë8\f\b匚道節仾毢挴抅\u0089\f捤攌吔廜¤ªNçí>96\r\u0099ö8K\u001c\u0097\u009eEËÊ*Y»\u0018´{\u0097ºF\u0080â\u0084Ìþ\u0018.\"\u0013ñÞ\u009eÝE¬¨F¥O Á±veÃ\u0006¼\u008dt{{v\u0093ß£g\u009bÏ_\f9\u001b|ê÷¡Lhî nþ\u000f厉邏箲仩殬揋扌v\u008eÇ¨«\u0084_á\u0018Lb\u0088\u0099¥ä\u009e\bCoé\u001c\u001cU6\u0016fÄZ\u008fK\"ÙÃ\b挵斤篟九欁捝拹¤\u00028Q\u0002ø\u008d\u0002}¨\u000f揅旷篁亻毂掜抁\u009c7\u009a\u009f\u0000b*=\u0005uÕ\u0011N¡\f卓郗謲沠\u001d)y\u0097\u000b0å÷\t&Äð´âp \u00187\u0002Á\u008a\u0004lØM@\f掷救譔没Ñ\tà\u00938°\u0083ç\r&zÏÚâ¥A\u00030\u0002U@T\u000f挪攺笼亇歽挮扶ÊÉP@Y\u0099\u0001B Äþ\u0097YÙö_0Ò\u0016k\u00ad_HS÷Ê\u0081îb\u0094\u0089,\u0012ôu4ÕÝ0Ë9\f厷郾咔幓´[LÙ\u00adù1Î\u0017Øªq&6]ÿ\u009b\u001a?\u0012:\u0086#.MÉøÇ¤¯\u0086ý\u0011ì\u0093ÌÅ\u001aÄ0LÈè4+\u0087\u008bmßÁ\u0018oõ£íy\u0017ë¦\u0091;!ÃÙSáÞ\u0091å\f³0B%\u0081|ÚO\u0015º¯ý&\u0097Ýâ¿<÷\u0092),E)ð\u009fRæUc~b æäÎZÅB\u008bJ©âò¥e\u0086\u009c\n2¦Åä¶î\u008f\u0010á\u0006\\À\u009eÏ\u00ad\u0099\u0019k\u0099!j;(µî\u0082QNîM\u00adþ\u0005`ö§9 =\u0099ð\u0088>òÖ\u0088t&r\u0083\u0013¬»J´\u0086\u0081\u0083\u008b'\u001dWÄÅqZ»F\u001b×\u0003TO¦\u009f\u001d\u0082\u00adQK=(Á29\u0089\u0093²X* ð\u0083_#\u0095\u008aã(W`\u007f¾fö\u001dÍ|b±HYÃö\u00835\u0088ËI\u0099P\u008b\u0016\u009e=\u009dô¾4\u0013Ü\u008e©Â\u0081·T9\u0090>q\u0086°\u0083óV{h±[ \u0001lÞm\"\rì\u0086A¼Æ\u008aÉ£à\u009b\nÕÎ\u009dØà_Î\"\u0002\u008c\u008bÕ\u0096ï?³\u001fÔÃ\u0006á/èU¤/-E¦g¦å\u0003é\u0084s\u0095\u009bb\u0004òÂ¡Y\u000b~q^úØJoÇÛ5/q\fS\u000f\u0006¶Ôï\u0007©¢1LÒ#N"
         .length();
      char var17 = 7;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 21;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 100;
                        break;
                     case 1:
                        var77 = 30;
                        break;
                     case 2:
                        var77 = 127;
                        break;
                     case 3:
                        var77 = 77;
                        break;
                     case 4:
                        var77 = 42;
                        break;
                     case 5:
                        var77 = 9;
                        break;
                     default:
                        var77 = 101;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     d = var21;
                     g = new String[34];
                     long var8 = 510751862828541980L;
                     long[] var14 = new long[12];
                     int var11 = 0;
                     String var12 = "\u001cßiTÏô\u0088ßå\bPg¯\u0000\u0082&n\u008e\u0080\u001fe,úæ©ûgÞÆ\u001d\u008cüE¿§Ë8\u0001±\föGÑYÐü\u001e$Ah«{t\u009eQÂÊÕÏ\u0000A\u0098£å$\f¿¯q\u0010¡v3ý]'\u0089%c¾";
                     int var13 = "\u001cßiTÏô\u0088ßå\bPg¯\u0000\u0082&n\u008e\u0080\u001fe,úæ©ûgÞÆ\u001d\u008cüE¿§Ë8\u0001±\föGÑYÐü\u001e$Ah«{t\u009eQÂÊÕÏ\u0000A\u0098£å$\f¿¯q\u0010¡v3ý]'\u0089%c¾"
                        .length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    C = var14;
                                    D = new Integer[12];
                                    long var0 = 933695728441103365L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "\u000f^\u008b):ûQ\u008as\u0083\u008e§õØ9njÉ=S#\u0015_m";
                                    int var5 = "\u000f^\u008b):ûQ\u008as\u0083\u008e§õØ9njÉ=S#\u0015_m".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
                                             ((long)var7[0] & 255L) << 56
                                                | ((long)var7[1] & 255L) << 48
                                                | ((long)var7[2] & 255L) << 40
                                                | ((long)var7[3] & 255L) << 32
                                                | ((long)var7[4] & 255L) << 24
                                                | ((long)var7[5] & 255L) << 16
                                                | ((long)var7[6] & 255L) << 8
                                                | (long)var7[7] & 255L
                                          )
                                          ^ var0;
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    E = var6;
                                    F = new Long[3];
                                    W = new Random();
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "\u0089mäP1\u0093¦\\\u0011>\u009b¾>féð";
                                 var13 = "\u0089mäP1\u0093¦\\\u0011>\u009b¾>féð".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "¤d½\u001c½\u0011\u0010Ò\u0002\u0004ÐkÆ\u0018ûï\u00890²\u0099}^°";
                  var20 = "¤d½\u001c½\u0011\u0010Ò\u0002\u0004ÐkÆ\u0018ûï\u00890²\u0099}^°".length();
                  var17 = 6;
                  var25 = -1;
            }

            var10000 = 100;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





