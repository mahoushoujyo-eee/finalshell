package com.finalshell.core;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IcmpV6NeighborSolicitationPacket;
import org.pcap4j.packet.IpV6NeighborDiscoverySourceLinkLayerAddressOption;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleFlowLabel;
import org.pcap4j.packet.IpV6SimpleTrafficClass;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.ArpOperation;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IcmpV6Code;
import org.pcap4j.packet.namednumber.IcmpV6Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

public class U2_4 {
   public List C = null;
   public Map V = null;
   public byte[] Y = null;
   public byte[] j = null;
   public boolean B = false;
   public Throwable x = null;
   public int U = a(29980, 5094457573368332604L);
   public int e = a(10358, 4342120098637995092L);
   public int a = a(529, 6643621178095040056L);
   public ScheduledExecutorService p;
   public int E = a(9764, 8104528645755490819L);
   public int s = a(21123, 7677547113580603046L);
   public int J = 1;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   static {
      __vfClinit__();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public U2_4() {
      try {
         this.C = Pcaps.findAllDevs();
         this.p = Executors.newScheduledThreadPool(this.E);
         this.Y = Inet6Address.getByName(a(-16171, -20145)).getAddress();
         this.j = MacAddress.getByName(a(-16167, 3220)).getAddress();
         this.V = new HashMap();
         Enumeration var1 = NetworkInterface.getNetworkInterfaces();

         while (true) {
            try {
               if (!var1.hasMoreElements()) {
                  break;
               }
            } catch (Throwable var9) {
               boolean var10001 = false;
               throw new RuntimeException(a(var9));
            }

            NetworkInterface var2 = (NetworkInterface)var1.nextElement();
            byte[] var3 = var2.getHardwareAddress();
            Enumeration var4 = var2.getInetAddresses();

            while (true) {
               try {
                  if (!var4.hasMoreElements()) {
                     break;
                  }
               } catch (Throwable var8) {
                  boolean var11 = false;
                  throw new RuntimeException(a(var8));
               }

               InetAddress var5 = (InetAddress)var4.nextElement();

               try {
                  if (var3 == null) {
                     System.out.println(a(-16170, -7031) + var5);
                     this.V.put(var5, null);
                     continue;
                  }
               } catch (Throwable var6) {
                  throw new RuntimeException(a(var6));
               }

               try {
                  if (var3.length != a(14840, 4469659126805581276L)) {
                     this.V.put(var5, null);
                     System.out.println(String.format(a(-16186, 26740), var5, ByteArrays.toHexString(var3, ":")));
                     continue;
                  }
               } catch (Throwable var7) {
                  throw new RuntimeException(a(var7));
               }

               this.V.put(var5, MacAddress.getByAddress(var3));
            }
         }

         System.out.println(String.format(a(-16161, 15268), this.V.size(), this.E, this.U, this.e, this.a));
         this.B = true;
      } catch (Throwable var10) {
         this.x = var10;
      }
   }

   public static U2_4 K() {
      return O12_2.V;
   }

   public List k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 30
      // 09: getfield com/finalshell/core/U2_4.B Z
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/IllegalStateException
      // 19: dup
      // 1a: sipush -16168
      // 1d: sipush -15327
      // 20: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 23: aload 0
      // 24: getfield com/finalshell/core/U2_4.x Ljava/lang/Throwable;
      // 27: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2a: athrow
      // 2b: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/U2_4.C Ljava/util/List;
      // 33: areturn
   }

   public MacAddress E(InetAddress param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnonnull 1d
      // 08: new java/lang/IllegalArgumentException
      // 0b: dup
      // 0c: sipush -16172
      // 0f: sipush -1075
      // 12: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 15: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 18: athrow
      // 19: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield com/finalshell/core/U2_4.B Z
      // 21: aload 2
      // 22: ifnull 5d
      // 25: ifne 48
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/lang/IllegalStateException
      // 32: dup
      // 33: sipush -16192
      // 36: sipush -1988
      // 39: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 3c: aload 0
      // 3d: getfield com/finalshell/core/U2_4.x Ljava/lang/Throwable;
      // 40: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 43: athrow
      // 44: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: aload 2
      // 4a: ifnull 73
      // 4d: getfield com/finalshell/core/U2_4.V Ljava/util/Map;
      // 50: aload 1
      // 51: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: ifeq 72
      // 60: aload 0
      // 61: getfield com/finalshell/core/U2_4.V Ljava/util/Map;
      // 64: aload 1
      // 65: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6a: checkcast org/pcap4j/util/MacAddress
      // 6d: areturn
      // 6e: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: invokevirtual com/finalshell/core/U2_4.M (Ljava/net/InetAddress;)Lorg/pcap4j/util/MacAddress;
      // 77: areturn
      // 78: astore 3
      // 79: aload 3
      // 7a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 7d: aconst_null
      // 7e: areturn
   }

   public void i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/U2_4.p Ljava/util/concurrent/ScheduledExecutorService;
      // 08: aload 1
      // 09: ifnull 21
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/U2_4.p Ljava/util/concurrent/ScheduledExecutorService;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: invokeinterface java/util/concurrent/ScheduledExecutorService.shutdown ()V 1
      // 26: return
   }

   public MacAddress M(InetAddress param1) throws PcapNativeException, NotOpenException, InterruptedException, UnknownHostException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/U2_4.G (Ljava/net/InetAddress;)Lcom/finalshell/core/Jq2;
      // 008: astore 3
      // 009: astore 2
      // 00a: aload 3
      // 00b: getfield com/finalshell/core/Jq2.G Lorg/pcap4j/core/PcapNetworkInterface;
      // 00e: aload 2
      // 00f: ifnull 046
      // 012: ifnonnull 03b
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: new java/lang/IllegalStateException
      // 01f: dup
      // 020: aload 1
      // 021: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 024: sipush -16169
      // 027: sipush 2884
      // 02a: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 02d: swap
      // 02e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 033: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 036: athrow
      // 037: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 3
      // 03c: getfield com/finalshell/core/Jq2.G Lorg/pcap4j/core/PcapNetworkInterface;
      // 03f: invokevirtual org/pcap4j/core/PcapNetworkInterface.getLinkLayerAddresses ()Ljava/util/ArrayList;
      // 042: bipush 0
      // 043: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 046: checkcast org/pcap4j/util/LinkLayerAddress
      // 049: invokevirtual org/pcap4j/util/LinkLayerAddress.getAddress ()[B
      // 04c: invokestatic org/pcap4j/util/MacAddress.getByAddress ([B)Lorg/pcap4j/util/MacAddress;
      // 04f: astore 4
      // 051: aload 3
      // 052: getfield com/finalshell/core/Jq2.D Ljava/net/InetAddress;
      // 055: astore 5
      // 057: aconst_null
      // 058: astore 6
      // 05a: aconst_null
      // 05b: astore 7
      // 05d: new java/util/concurrent/atomic/AtomicReference
      // 060: dup
      // 061: invokespecial java/util/concurrent/atomic/AtomicReference.<init> ()V
      // 064: astore 8
      // 066: aload 1
      // 067: instanceof java/net/Inet4Address
      // 06a: istore 9
      // 06c: aload 3
      // 06d: getfield com/finalshell/core/Jq2.G Lorg/pcap4j/core/PcapNetworkInterface;
      // 070: aload 0
      // 071: getfield com/finalshell/core/U2_4.s I
      // 074: getstatic org/pcap4j/core/PcapNetworkInterface$PromiscuousMode.PROMISCUOUS Lorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;
      // 077: aload 0
      // 078: getfield com/finalshell/core/U2_4.U I
      // 07b: invokevirtual org/pcap4j/core/PcapNetworkInterface.openLive (ILorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;I)Lorg/pcap4j/core/PcapHandle;
      // 07e: astore 6
      // 080: iload 9
      // 082: ifeq 095
      // 085: aload 0
      // 086: aload 1
      // 087: aload 4
      // 089: aload 5
      // 08b: invokevirtual com/finalshell/core/U2_4.e (Ljava/net/InetAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/InetAddress;)Ljava/lang/String;
      // 08e: goto 0a4
      // 091: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: aload 0
      // 096: aload 1
      // 097: checkcast java/net/Inet6Address
      // 09a: aload 4
      // 09c: aload 5
      // 09e: checkcast java/net/Inet6Address
      // 0a1: invokevirtual com/finalshell/core/U2_4.S (Ljava/net/Inet6Address;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet6Address;)Ljava/lang/String;
      // 0a4: astore 10
      // 0a6: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0a9: aload 10
      // 0ab: sipush -16190
      // 0ae: sipush -839
      // 0b1: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 0b4: swap
      // 0b5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0ba: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0bd: aload 6
      // 0bf: aload 10
      // 0c1: getstatic org/pcap4j/core/BpfProgram$BpfCompileMode.OPTIMIZE Lorg/pcap4j/core/BpfProgram$BpfCompileMode;
      // 0c4: invokevirtual org/pcap4j/core/PcapHandle.setFilter (Ljava/lang/String;Lorg/pcap4j/core/BpfProgram$BpfCompileMode;)V
      // 0c7: aload 3
      // 0c8: getfield com/finalshell/core/Jq2.G Lorg/pcap4j/core/PcapNetworkInterface;
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/core/U2_4.s I
      // 0cf: getstatic org/pcap4j/core/PcapNetworkInterface$PromiscuousMode.PROMISCUOUS Lorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/U2_4.U I
      // 0d6: invokevirtual org/pcap4j/core/PcapNetworkInterface.openLive (ILorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;I)Lorg/pcap4j/core/PcapHandle;
      // 0d9: astore 7
      // 0db: iload 9
      // 0dd: aload 8
      // 0df: invokedynamic gotPacket (ZLjava/util/concurrent/atomic/AtomicReference;)Lorg/pcap4j/core/PacketListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lorg/pcap4j/packet/Packet;)V, com/finalshell/core/U2_4.lambda$0 (ZLjava/util/concurrent/atomic/AtomicReference;Lorg/pcap4j/packet/Packet;)V, (Lorg/pcap4j/packet/Packet;)V ]
      // 0e4: astore 11
      // 0e6: new java/util/concurrent/CyclicBarrier
      // 0e9: dup
      // 0ea: bipush 2
      // 0eb: invokespecial java/util/concurrent/CyclicBarrier.<init> (I)V
      // 0ee: astore 12
      // 0f0: new com/finalshell/task/BP
      // 0f3: dup
      // 0f4: aload 0
      // 0f5: aload 6
      // 0f7: aload 11
      // 0f9: aload 12
      // 0fb: invokespecial com/finalshell/task/BP.<init> (Lcom/finalshell/core/U2_4;Lorg/pcap4j/core/PcapHandle;Lorg/pcap4j/core/PacketListener;Ljava/util/concurrent/CyclicBarrier;)V
      // 0fe: astore 13
      // 100: aload 0
      // 101: getfield com/finalshell/core/U2_4.p Ljava/util/concurrent/ScheduledExecutorService;
      // 104: aload 13
      // 106: invokeinterface java/util/concurrent/ScheduledExecutorService.submit (Ljava/lang/Runnable;)Ljava/util/concurrent/Future; 2
      // 10b: astore 14
      // 10d: iload 9
      // 10f: ifeq 122
      // 112: aload 0
      // 113: aload 1
      // 114: aload 4
      // 116: aload 5
      // 118: invokevirtual com/finalshell/core/U2_4.Q (Ljava/net/InetAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/InetAddress;)Lorg/pcap4j/packet/EthernetPacket$Builder;
      // 11b: goto 131
      // 11e: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 0
      // 123: aload 1
      // 124: checkcast java/net/Inet6Address
      // 127: aload 4
      // 129: aload 5
      // 12b: checkcast java/net/Inet6Address
      // 12e: invokevirtual com/finalshell/core/U2_4.u (Ljava/net/Inet6Address;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet6Address;)Lorg/pcap4j/packet/EthernetPacket$Builder;
      // 131: astore 15
      // 133: aload 15
      // 135: invokevirtual org/pcap4j/packet/EthernetPacket$Builder.build$EthernetPacket ()Lorg/pcap4j/packet/EthernetPacket;
      // 138: astore 16
      // 13a: aload 12
      // 13c: aload 0
      // 13d: getfield com/finalshell/core/U2_4.a I
      // 140: i2l
      // 141: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 144: invokevirtual java/util/concurrent/CyclicBarrier.await (JLjava/util/concurrent/TimeUnit;)I
      // 147: pop
      // 148: goto 16b
      // 14b: astore 17
      // 14d: aload 17
      // 14f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 152: aload 8
      // 154: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
      // 157: checkcast org/pcap4j/util/MacAddress
      // 15a: astore 19
      // 15c: aload 0
      // 15d: aload 6
      // 15f: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 162: aload 0
      // 163: aload 7
      // 165: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 168: aload 19
      // 16a: areturn
      // 16b: aload 7
      // 16d: aload 16
      // 16f: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // 172: aload 14
      // 174: aload 0
      // 175: getfield com/finalshell/core/U2_4.e I
      // 178: i2l
      // 179: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // 17c: invokeinterface java/util/concurrent/Future.get (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object; 4
      // 181: pop
      // 182: goto 18c
      // 185: astore 17
      // 187: aload 17
      // 189: invokevirtual java/lang/Exception.printStackTrace ()V
      // 18c: aload 8
      // 18e: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
      // 191: checkcast org/pcap4j/util/MacAddress
      // 194: astore 19
      // 196: aload 0
      // 197: aload 6
      // 199: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 19c: aload 0
      // 19d: aload 7
      // 19f: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 1a2: aload 19
      // 1a4: areturn
      // 1a5: astore 18
      // 1a7: aload 0
      // 1a8: aload 6
      // 1aa: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 1ad: aload 0
      // 1ae: aload 7
      // 1b0: invokevirtual com/finalshell/core/U2_4.x (Lorg/pcap4j/core/PcapHandle;)V
      // 1b3: aload 18
      // 1b5: athrow
   }

   public String e(InetAddress var1, MacAddress var2, InetAddress var3) {
      return String.format(a(-16163, -25627), var1.getHostAddress(), var3.getHostAddress(), Pcaps.toBpfString(var2));
   }

   public String k(String var1) {
      int var2 = var1.indexOf("%");

      try {
         return var2 > 0 ? var1.substring(0, var2) : var1;
      } catch (IllegalStateException var3) {
         throw new RuntimeException(a(var3));
      }
   }

   public String S(Inet6Address var1, MacAddress var2, Inet6Address var3) {
      return String.format(a(-16165, -16328), this.k(var1.getHostAddress()), this.k(var3.getHostAddress()), Pcaps.toBpfString(var2));
   }

   public EthernetPacket.Builder Q(InetAddress var1, MacAddress var2, InetAddress var3) {
      ArpPacket.Builder var4 = new ArpPacket.Builder();
      var4.hardwareType(ArpHardwareType.ETHERNET)
         .protocolType(EtherType.IPV4)
         .hardwareAddrLength((byte)a(11784, 5997725270068648489L))
         .protocolAddrLength((byte)4)
         .srcHardwareAddr(var2)
         .srcProtocolAddr(var3)
         .dstHardwareAddr(MacAddress.ETHER_BROADCAST_ADDRESS)
         .operation(ArpOperation.REQUEST)
         .dstProtocolAddr(var1);
      EthernetPacket.Builder var5 = new EthernetPacket.Builder();
      var5.dstAddr(MacAddress.ETHER_BROADCAST_ADDRESS).srcAddr(var2).type(EtherType.ARP).payloadBuilder$EthernetPacket_Builder(var4).paddingAtBuild(true);
      return var5;
   }

   public EthernetPacket.Builder u(Inet6Address var1, MacAddress var2, Inet6Address var3) throws UnknownHostException {
      MacAddress var4 = this.I(var1);
      Inet6Address var5 = this.y(var1);
      IcmpV6NeighborSolicitationPacket.Builder var6 = new IcmpV6NeighborSolicitationPacket.Builder();
      var6.targetAddress(var1);
      var6.reserved(0);
      IpV6NeighborDiscoverySourceLinkLayerAddressOption.Builder var7 = new IpV6NeighborDiscoverySourceLinkLayerAddressOption.Builder();
      IpV6NeighborDiscoverySourceLinkLayerAddressOption var8 = var7.linkLayerAddress(var2.getAddress())
         .correctLengthAtBuild$IpV6NeighborDiscoverySourceLinkLayerAddressOption_Builder(true)
         .build$IpV6NeighborDiscoverySourceLinkLayerAddressOption();
      ArrayList var9 = new ArrayList();
      var9.add(var8);
      var6.options(var9);
      IcmpV6CommonPacket.Builder var10 = new IcmpV6CommonPacket.Builder();
      var10.type(IcmpV6Type.NEIGHBOR_SOLICITATION)
         .code(IcmpV6Code.NO_CODE)
         .srcAddr(var3)
         .dstAddr(var5)
         .payloadBuilder$IcmpV6CommonPacket_Builder(var6)
         .correctChecksumAtBuild$IcmpV6CommonPacket_Builder(true);
      IpV6Packet.Builder var11 = new IpV6Packet.Builder();
      var11.version(IpVersion.IPV6)
         .trafficClass(IpV6SimpleTrafficClass.newInstance((byte)a(13242, 8643722369097222044L)))
         .flowLabel(IpV6SimpleFlowLabel.newInstance(0))
         .nextHeader(IpNumber.ICMPV6)
         .hopLimit((byte)-1)
         .srcAddr(var3)
         .dstAddr(var5)
         .correctLengthAtBuild$IpV6Packet_Builder(true)
         .payloadBuilder$IpV6Packet_Builder(var10);
      EthernetPacket.Builder var12 = new EthernetPacket.Builder();
      var12.dstAddr(var4).srcAddr(var2).type(EtherType.IPV6).payloadBuilder$EthernetPacket_Builder(var11).paddingAtBuild(true);
      return var12;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void x(PcapHandle var1) {
      String[] var2 = XQ_2.B();

      label36: {
         PcapHandle var10000;
         label35: {
            try {
               var10000 = var1;
               if (var2 == null) {
                  break label35;
               }

               if (var1 == null) {
                  return;
               }
            } catch (Exception var7) {
               throw new RuntimeException(a(var7));
            }

            try {
               var10000 = var1;
            } catch (Exception var6) {
               boolean var10001 = false;
               break label36;
            }
         }

         try {
            var10000.breakLoop();
         } catch (Exception var5) {
            boolean var8 = false;
         }
      }

      try {
         var1.close();
      } catch (Exception var4) {
      }
   }

   public Jq2 G(InetAddress param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 003: sipush 22165
      // 006: ldc2_w 7215053323703231158
      // 009: invokestatic com/finalshell/core/U2_4.a (IJ)I
      // 00c: istore 3
      // 00d: astore 2
      // 00e: new com/finalshell/core/Jq2
      // 011: dup
      // 012: aload 0
      // 013: invokespecial com/finalshell/core/Jq2.<init> (Lcom/finalshell/core/U2_4;)V
      // 016: astore 4
      // 018: aload 1
      // 019: invokevirtual java/net/InetAddress.getAddress ()[B
      // 01c: astore 5
      // 01e: aload 0
      // 01f: getfield com/finalshell/core/U2_4.C Ljava/util/List;
      // 022: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 027: astore 7
      // 029: aload 2
      // 02a: ifnonnull 110
      // 02d: aload 7
      // 02f: aload 2
      // 030: ifnull 112
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03f: checkcast org/pcap4j/core/PcapNetworkInterface
      // 042: astore 6
      // 044: aload 6
      // 046: invokevirtual org/pcap4j/core/PcapNetworkInterface.getAddresses ()Ljava/util/List;
      // 049: astore 8
      // 04b: aload 8
      // 04d: ifnull 110
      // 050: aload 8
      // 052: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 057: astore 10
      // 059: aload 2
      // 05a: ifnonnull 106
      // 05d: aload 10
      // 05f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 064: checkcast org/pcap4j/core/PcapAddress
      // 067: astore 9
      // 069: aload 0
      // 06a: aload 1
      // 06b: aload 9
      // 06d: invokeinterface org/pcap4j/core/PcapAddress.getAddress ()Ljava/net/InetAddress; 1
      // 072: invokevirtual com/finalshell/core/U2_4.F (Ljava/net/InetAddress;Ljava/net/InetAddress;)Z
      // 075: ifne 07c
      // 078: aload 2
      // 079: ifnonnull 106
      // 07c: aload 9
      // 07e: invokeinterface org/pcap4j/core/PcapAddress.getNetmask ()Ljava/net/InetAddress; 1
      // 083: astore 11
      // 085: aload 11
      // 087: aload 2
      // 088: ifnull 0d0
      // 08b: ifnull 0c2
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: aload 1
      // 096: aload 2
      // 097: ifnull 0d0
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 9
      // 0a3: invokeinterface org/pcap4j/core/PcapAddress.getAddress ()Ljava/net/InetAddress; 1
      // 0a8: aload 11
      // 0aa: invokestatic com/finalshell/core/U2_4.U (Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/net/InetAddress;)Z
      // 0ad: ifne 0c2
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 2
      // 0b8: ifnonnull 106
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 9
      // 0c4: invokeinterface org/pcap4j/core/PcapAddress.getAddress ()Ljava/net/InetAddress; 1
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: invokevirtual java/net/InetAddress.getAddress ()[B
      // 0d3: astore 12
      // 0d5: aload 0
      // 0d6: aload 5
      // 0d8: aload 12
      // 0da: invokevirtual com/finalshell/core/U2_4.f ([B[B)I
      // 0dd: istore 13
      // 0df: iload 13
      // 0e1: aload 2
      // 0e2: ifnull 10d
      // 0e5: iload 3
      // 0e6: if_icmple 106
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 4
      // 0f2: aload 6
      // 0f4: putfield com/finalshell/core/Jq2.G Lorg/pcap4j/core/PcapNetworkInterface;
      // 0f7: aload 4
      // 0f9: aload 9
      // 0fb: invokeinterface org/pcap4j/core/PcapAddress.getAddress ()Ljava/net/InetAddress; 1
      // 100: putfield com/finalshell/core/Jq2.D Ljava/net/InetAddress;
      // 103: iload 13
      // 105: istore 3
      // 106: aload 10
      // 108: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10d: ifne 05d
      // 110: aload 7
      // 112: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 117: ifne 02d
      // 11a: aload 4
      // 11c: aload 2
      // 11d: ifnull 03f
      // 120: areturn
   }

   public boolean F(InetAddress param1, InetAddress param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: instanceof java/net/Inet6Address
      // 08: aload 3
      // 09: ifnull 3a
      // 0c: ifeq 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 2
      // 17: instanceof java/net/Inet6Address
      // 1a: aload 3
      // 1b: ifnull 64
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifne 63
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 1
      // 30: instanceof java/net/Inet4Address
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 3
      // 3b: ifnull 62
      // 3e: ifeq 61
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 2
      // 49: instanceof java/net/Inet4Address
      // 4c: aload 3
      // 4d: ifnull 64
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: ifne 63
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: bipush 0
      // 62: ireturn
      // 63: bipush 1
      // 64: ireturn
   }

   public int f(byte[] param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: aload 1
      // 04: arraylength
      // 05: istore 4
      // 07: astore 3
      // 08: bipush 0
      // 09: istore 5
      // 0b: bipush 0
      // 0c: istore 5
      // 0e: aload 3
      // 0f: ifnonnull 1c
      // 12: iinc 5 1
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: iload 5
      // 1e: iload 4
      // 20: if_icmpge 4b
      // 23: aload 1
      // 24: iload 5
      // 26: baload
      // 27: aload 3
      // 28: ifnull 4d
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: ifnull 4d
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 2
      // 3e: iload 5
      // 40: baload
      // 41: if_icmpeq 12
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 5
      // 4d: ireturn
   }

   public static boolean U(InetAddress param0, InetAddress param1, InetAddress param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/net/InetAddress.getAddress ()[B
      // 04: astore 4
      // 06: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 09: aload 1
      // 0a: invokevirtual java/net/InetAddress.getAddress ()[B
      // 0d: astore 5
      // 0f: aload 2
      // 10: invokevirtual java/net/InetAddress.getAddress ()[B
      // 13: astore 6
      // 15: bipush 1
      // 16: istore 7
      // 18: astore 3
      // 19: bipush 0
      // 1a: istore 8
      // 1c: aload 3
      // 1d: ifnonnull 5c
      // 20: aload 4
      // 22: iload 8
      // 24: baload
      // 25: aload 6
      // 27: iload 8
      // 29: baload
      // 2a: iand
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: ifnull 4c
      // 36: aload 5
      // 38: iload 8
      // 3a: baload
      // 3b: aload 6
      // 3d: iload 8
      // 3f: baload
      // 40: iand
      // 41: if_icmpeq 52
      // 44: bipush 0
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: istore 7
      // 4e: aload 3
      // 4f: ifnonnull 64
      // 52: iinc 8 1
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: iload 8
      // 5e: aload 4
      // 60: arraylength
      // 61: if_icmplt 20
      // 64: iload 7
      // 66: aload 3
      // 67: ifnull 32
      // 6a: ireturn
   }

   public Inet6Address y(Inet6Address var1) throws UnknownHostException {
      byte[] var2 = var1.getAddress();
      byte[] var3 = new byte[var2.length];
      System.arraycopy(this.Y, 0, var3, 0, this.Y.length);
      byte var4 = 3;
      System.arraycopy(var2, var2.length - var4, var3, this.Y.length - var4, var4);
      return (Inet6Address)Inet6Address.getByAddress(var3);
   }

   public MacAddress I(Inet6Address var1) {
      byte[] var2 = var1.getAddress();
      byte[] var3 = new byte[this.j.length];
      System.arraycopy(this.j, 0, var3, 0, this.j.length);
      byte var4 = 3;
      System.arraycopy(var2, var2.length - var4, var3, this.j.length - var4, var4);
      return MacAddress.getByAddress(var3);
   }

   public static void main(String[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 003: sipush -16185
      // 006: sipush 30944
      // 009: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 00c: astore 2
      // 00d: aload 2
      // 00e: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 011: astore 3
      // 012: astore 1
      // 013: aload 1
      // 014: ifnull 051
      // 017: aload 3
      // 018: ifnull 030
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: aload 3
      // 023: invokevirtual java/lang/String.isEmpty ()Z
      // 026: ifeq 052
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 033: sipush -16174
      // 036: sipush -16525
      // 039: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 03c: bipush 1
      // 03d: anewarray 4
      // 040: dup
      // 041: bipush 0
      // 042: aload 2
      // 043: aastore
      // 044: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 047: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: return
      // 052: new java/io/File
      // 055: dup
      // 056: aload 3
      // 057: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05a: astore 4
      // 05c: aload 1
      // 05d: ifnull 09f
      // 060: aload 4
      // 062: invokevirtual java/io/File.exists ()Z
      // 065: ifeq 07e
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 4
      // 071: invokevirtual java/io/File.isFile ()Z
      // 074: ifne 0a0
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 081: aload 4
      // 083: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 086: sipush -16173
      // 089: sipush 21706
      // 08c: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 08f: swap
      // 090: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 095: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: return
      // 0a0: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0a3: aload 4
      // 0a5: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0a8: sipush -16188
      // 0ab: sipush 18524
      // 0ae: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 0b1: swap
      // 0b2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0b7: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ba: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0bd: invokevirtual java/io/PrintStream.println ()V
      // 0c0: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0c3: invokestatic org/pcap4j/core/Pcaps.libVersion ()Ljava/lang/String;
      // 0c6: sipush -16164
      // 0c9: sipush -22248
      // 0cc: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 0cf: swap
      // 0d0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0d5: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0d8: invokestatic com/finalshell/core/U2_4.K ()Lcom/finalshell/core/U2_4;
      // 0db: invokevirtual com/finalshell/core/U2_4.k ()Ljava/util/List;
      // 0de: astore 5
      // 0e0: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0e3: sipush -16189
      // 0e6: sipush 5605
      // 0e9: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 0ec: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ef: aload 5
      // 0f1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f6: astore 7
      // 0f8: aload 1
      // 0f9: ifnonnull 11f
      // 0fc: aload 7
      // 0fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: checkcast org/pcap4j/core/PcapNetworkInterface
      // 10d: astore 6
      // 10f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 112: aload 6
      // 114: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 117: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\t\u0001" ]
      // 11c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 11f: aload 7
      // 121: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 126: ifne 0fc
      // 129: aload 0
      // 12a: aload 1
      // 12b: ifnull 10a
      // 12e: aload 1
      // 12f: ifnull 13d
      // 132: ifnull 14c
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: aload 0
      // 13d: aload 1
      // 13e: ifnull 161
      // 141: arraylength
      // 142: ifne 160
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 14f: sipush -16176
      // 152: sipush -14217
      // 155: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 158: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 15b: return
      // 15c: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aload 0
      // 161: dup
      // 162: astore 9
      // 164: arraylength
      // 165: istore 8
      // 167: bipush 0
      // 168: istore 7
      // 16a: aload 1
      // 16b: ifnonnull 1d7
      // 16e: aload 9
      // 170: iload 7
      // 172: aaload
      // 173: astore 6
      // 175: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 178: aload 6
      // 17a: sipush -16187
      // 17d: sipush 8246
      // 180: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 183: swap
      // 184: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 189: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 18c: invokestatic com/finalshell/core/U2_4.K ()Lcom/finalshell/core/U2_4;
      // 18f: aload 6
      // 191: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 194: invokevirtual com/finalshell/core/U2_4.E (Ljava/net/InetAddress;)Lorg/pcap4j/util/MacAddress;
      // 197: astore 10
      // 199: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 19c: aload 10
      // 19e: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 1a1: sipush -16177
      // 1a4: sipush 3322
      // 1a7: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 1aa: swap
      // 1ab: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1b0: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1b3: goto 1d4
      // 1b6: astore 10
      // 1b8: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1bb: aload 6
      // 1bd: sipush -16166
      // 1c0: sipush -13230
      // 1c3: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 1c6: swap
      // 1c7: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 1cc: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1cf: aload 10
      // 1d1: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 1d4: iinc 7 1
      // 1d7: iload 7
      // 1d9: iload 8
      // 1db: if_icmplt 16e
      // 1de: invokestatic com/finalshell/core/U2_4.K ()Lcom/finalshell/core/U2_4;
      // 1e1: invokevirtual com/finalshell/core/U2_4.i ()V
      // 1e4: return
   }

   public static void lambda$0(boolean param0, AtomicReference param1, Packet param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 06: aload 2
      // 07: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0a: sipush -16162
      // 0d: sipush 16349
      // 10: invokestatic com/finalshell/core/U2_4.a (II)Ljava/lang/String;
      // 13: swap
      // 14: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 19: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1c: astore 3
      // 1d: iload 0
      // 1e: aload 3
      // 1f: ifnull 93
      // 22: ifeq 8b
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 2
      // 2d: ldc_w org/pcap4j/packet/ArpPacket
      // 30: invokeinterface org/pcap4j/packet/Packet.contains (Ljava/lang/Class;)Z 2
      // 35: aload 3
      // 36: ifnull 93
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: ifeq 8b
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 2
      // 4b: ldc_w org/pcap4j/packet/ArpPacket
      // 4e: invokeinterface org/pcap4j/packet/Packet.get (Ljava/lang/Class;)Lorg/pcap4j/packet/Packet; 2
      // 53: checkcast org/pcap4j/packet/ArpPacket
      // 56: astore 4
      // 58: aload 3
      // 59: ifnull 87
      // 5c: aload 4
      // 5e: invokevirtual org/pcap4j/packet/ArpPacket.getHeader$ArpPacket_ArpHeader ()Lorg/pcap4j/packet/ArpPacket$ArpHeader;
      // 61: invokevirtual org/pcap4j/packet/ArpPacket$ArpHeader.getOperation ()Lorg/pcap4j/packet/namednumber/ArpOperation;
      // 64: getstatic org/pcap4j/packet/namednumber/ArpOperation.REPLY Lorg/pcap4j/packet/namednumber/ArpOperation;
      // 67: invokevirtual org/pcap4j/packet/namednumber/ArpOperation.equals (Ljava/lang/Object;)Z
      // 6a: ifeq e0
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: aload 1
      // 75: aload 4
      // 77: invokevirtual org/pcap4j/packet/ArpPacket.getHeader$ArpPacket_ArpHeader ()Lorg/pcap4j/packet/ArpPacket$ArpHeader;
      // 7a: invokevirtual org/pcap4j/packet/ArpPacket$ArpHeader.getSrcHardwareAddr ()Lorg/pcap4j/util/MacAddress;
      // 7d: invokevirtual java/util/concurrent/atomic/AtomicReference.set (Ljava/lang/Object;)V
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 3
      // 88: ifnonnull e0
      // 8b: iload 0
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: aload 3
      // 94: ifnull bc
      // 97: ifne e0
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: aload 2
      // a2: ldc_w org/pcap4j/packet/EthernetPacket
      // a5: aload 3
      // a6: ifnull ca
      // a9: goto b0
      // ac: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af: athrow
      // b0: invokeinterface org/pcap4j/packet/Packet.contains (Ljava/lang/Class;)Z 2
      // b5: goto bc
      // b8: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb: athrow
      // bc: ifeq e0
      // bf: aload 2
      // c0: ldc_w org/pcap4j/packet/EthernetPacket
      // c3: goto ca
      // c6: invokestatic com/finalshell/core/U2_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: invokeinterface org/pcap4j/packet/Packet.get (Ljava/lang/Class;)Lorg/pcap4j/packet/Packet; 2
      // cf: checkcast org/pcap4j/packet/EthernetPacket
      // d2: astore 4
      // d4: aload 1
      // d5: aload 4
      // d7: invokevirtual org/pcap4j/packet/EthernetPacket.getHeader$EthernetPacket_EthernetHeader ()Lorg/pcap4j/packet/EthernetPacket$EthernetHeader;
      // da: invokevirtual org/pcap4j/packet/EthernetPacket$EthernetHeader.getSrcAddr ()Lorg/pcap4j/util/MacAddress;
      // dd: invokevirtual java/util/concurrent/atomic/AtomicReference.set (Ljava/lang/Object;)V
      // e0: return
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -16169) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 46;
            case 1 -> 2;
            case 2 -> 137;
            case 3 -> 119;
            case 4 -> 134;
            case 5 -> 151;
            case 6 -> 209;
            case 7 -> 173;
            case 8 -> 240;
            case 9 -> 135;
            case 10 -> 171;
            case 11 -> 80;
            case 12 -> 107;
            case 13 -> 188;
            case 14 -> 78;
            case 15 -> 172;
            case 16 -> 35;
            case 17 -> 233;
            case 18 -> 42;
            case 19 -> 183;
            case 20 -> 60;
            case 21 -> 91;
            case 22 -> 75;
            case 23 -> 12;
            case 24 -> 96;
            case 25 -> 95;
            case 26 -> 101;
            case 27 -> 238;
            case 28 -> 246;
            case 29 -> 150;
            case 30 -> 241;
            case 31 -> 253;
            case 32 -> 187;
            case 33 -> 52;
            case 34 -> 252;
            case 35 -> 69;
            case 36 -> 166;
            case 37 -> 72;
            case 38 -> 244;
            case 39 -> 11;
            case 40 -> 49;
            case 41 -> 81;
            case 42 -> 224;
            case 43 -> 194;
            case 44 -> 203;
            case 45 -> 22;
            case 46 -> 74;
            case 47 -> 211;
            case 48 -> 164;
            case 49 -> 7;
            case 50 -> 61;
            case 51 -> 36;
            case 52 -> 117;
            case 53 -> 87;
            case 54 -> 58;
            case 55 -> 223;
            case 56 -> 133;
            case 57 -> 17;
            case 58 -> 39;
            case 59 -> 45;
            case 60 -> 186;
            case 61 -> 130;
            case 62 -> 57;
            case 63 -> 65;
            case 64 -> 77;
            case 65 -> 197;
            case 66 -> 251;
            case 67 -> 159;
            case 68 -> 66;
            case 69 -> 216;
            case 70 -> 239;
            case 71 -> 198;
            case 72 -> 205;
            case 73 -> 5;
            case 74 -> 237;
            case 75 -> 68;
            case 76 -> 201;
            case 77 -> 24;
            case 78 -> 103;
            case 79 -> 176;
            case 80 -> 34;
            case 81 -> 200;
            case 82 -> 6;
            case 83 -> 168;
            case 84 -> 213;
            case 85 -> 190;
            case 86 -> 54;
            case 87 -> 76;
            case 88 -> 64;
            case 89 -> 18;
            case 90 -> 178;
            case 91 -> 245;
            case 92 -> 165;
            case 93 -> 51;
            case 94 -> 86;
            case 95 -> 248;
            case 96 -> 231;
            case 97 -> 196;
            case 98 -> 16;
            case 99 -> 113;
            case 100 -> 219;
            case 101 -> 93;
            case 102 -> 56;
            case 103 -> 227;
            case 104 -> 92;
            case 105 -> 220;
            case 106 -> 110;
            case 107 -> 174;
            case 108 -> 13;
            case 109 -> 192;
            case 110 -> 180;
            case 111 -> 38;
            case 112 -> 242;
            case 113 -> 170;
            case 114 -> 8;
            case 115 -> 84;
            case 116 -> 218;
            case 117 -> 177;
            case 118 -> 125;
            case 119 -> 85;
            case 120 -> 204;
            case 121 -> 142;
            case 122 -> 112;
            case 123 -> 63;
            case 124 -> 41;
            case 125 -> 184;
            case 126 -> 146;
            case 127 -> 229;
            case 128 -> 143;
            case 129 -> 50;
            case 130 -> 148;
            case 131 -> 222;
            case 132 -> 160;
            case 133 -> 193;
            case 134 -> 14;
            case 135 -> 27;
            case 136 -> 195;
            case 137 -> 254;
            case 138 -> 71;
            case 139 -> 156;
            case 140 -> 121;
            case 141 -> 228;
            case 142 -> 116;
            case 143 -> 99;
            case 144 -> 106;
            case 145 -> 250;
            case 146 -> 152;
            case 147 -> 53;
            case 148 -> 189;
            case 149 -> 29;
            case 150 -> 3;
            case 151 -> 129;
            case 152 -> 161;
            case 153 -> 185;
            case 154 -> 83;
            case 155 -> 30;
            case 156 -> 215;
            case 157 -> 44;
            case 158 -> 162;
            case 159 -> 169;
            case 160 -> 9;
            case 161 -> 179;
            case 162 -> 141;
            case 163 -> 232;
            case 164 -> 37;
            case 165 -> 147;
            case 166 -> 94;
            case 167 -> 127;
            case 168 -> 47;
            case 169 -> 26;
            case 170 -> 114;
            case 171 -> 82;
            case 172 -> 181;
            case 173 -> 206;
            case 174 -> 144;
            case 175 -> 115;
            case 176 -> 109;
            case 177 -> 108;
            case 178 -> 0;
            case 179 -> 1;
            case 180 -> 79;
            case 181 -> 234;
            case 182 -> 40;
            case 183 -> 154;
            case 184 -> 111;
            case 185 -> 4;
            case 186 -> 207;
            case 187 -> 138;
            case 188 -> 235;
            case 189 -> 118;
            case 190 -> 89;
            case 191 -> 221;
            case 192 -> 230;
            case 193 -> 149;
            case 194 -> 155;
            case 195 -> 199;
            case 196 -> 128;
            case 197 -> 19;
            case 198 -> 43;
            case 199 -> 33;
            case 200 -> 236;
            case 201 -> 23;
            case 202 -> 105;
            case 203 -> 225;
            case 204 -> 10;
            case 205 -> 153;
            case 206 -> 175;
            case 207 -> 249;
            case 208 -> 123;
            case 209 -> 247;
            case 210 -> 226;
            case 211 -> 90;
            case 212 -> 217;
            case 213 -> 243;
            case 214 -> 32;
            case 215 -> 73;
            case 216 -> 104;
            case 217 -> 136;
            case 218 -> 59;
            case 219 -> 132;
            case 220 -> 122;
            case 221 -> 212;
            case 222 -> 55;
            case 223 -> 21;
            case 224 -> 255;
            case 225 -> 48;
            case 226 -> 67;
            case 227 -> 98;
            case 228 -> 126;
            case 229 -> 28;
            case 230 -> 214;
            case 231 -> 25;
            case 232 -> 62;
            case 233 -> 202;
            case 234 -> 167;
            case 235 -> 158;
            case 236 -> 102;
            case 237 -> 70;
            case 238 -> 131;
            case 239 -> 31;
            case 240 -> 208;
            case 241 -> 88;
            case 242 -> 15;
            case 243 -> 140;
            case 244 -> 191;
            case 245 -> 210;
            case 246 -> 97;
            case 247 -> 139;
            case 248 -> 157;
            case 249 -> 182;
            case 250 -> 163;
            case 251 -> 20;
            case 252 -> 120;
            case 253 -> 100;
            case 254 -> 124;
            default -> 145;
         };
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29729;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var35;
      String[] var13 = new String[25];
      int var11 = 0;
      String var10 = "c#ZS;;ØÎñ\u008aàwäý¾\u0019\u000b#\u000fþí\u0094Ø9äÝn±³\u0095JUÓ$·ÛÀLhØ²²¼\u0005I\u0082ÞÐRZy?\u0012Ø.EÖ Ìk\u0089\u001e\u009eoCÓ¢@#\u0095\u0011\r\u0086l1&Ú«ø\nW¢óê[ôCë\u000f8fy\u000b\u0005\u009c9J}m\u0096y1Ãu\u0018\u0017\u0081\u0012Y¨\u0086IY\u001f\u0015x$|\u0000 ùÕýA\u00ad\u000fa¡\u00856Õ\u0001J\u0093£CcÁ]4\u009b/\u0097×Z34\u0086d¸\u008a²\u0016ÀEbLìq\u0092\u0010â\u00894Z\u0002È\u008cørXj\u001fôÅd\u000bsyõ\nÚþÝ\u001d\u0082;Æ(\u0084?¬|Âè\u0099þ\u0005\u0081£\f¾Vm^ä]7K\u001cÄ~Q\u0003>ú\u0003\u008bÍ\u0097Zw\u001b'Ê\u0014¿®tê\u0081\u0001ÍÓ<\u0007\u000e\u0098£\u00048î\u0005µi\rïPÌ5\\Å\u0015Éß\u008f\u008e?¶r5G©\u001b\u000b\u0019f/\u001d\ty\u0097{Û8\u0019p}ï}\t\u009fÈ\u00017^E÷Od.î(Jò\u0018\u0010äkU\u0094½Q[\u001e¯¤~¬\u0010ÑÓ=\u000f¾Ñ²cI\u0087\u0010\u0092ù\u000fÅþ\u0086¼Ë\n\u009b\"?ÊË¬K\u0095c\u0019ÎtÖR;\u001b&×~=\u009cÓÊe²\u0096=QÃ\u009bU;÷;\u009dËÒþÝe|ÿû¦`?6\u008cEõ\u0019\u0093{:'\u008b\u0098:\tÉãY}.\u0080N'º\u0094Íï7±\u000f%Sî\u0011\u0010âÈ0v*?\u0084ê\u0092e4\u001aö\r\u009f\u0019\u000b)\u0006\u0090å1\u0007ó\u0088\u008cÉß»\u000bd>\"À´Éf\u0017Ò\u0094?÷LdäøÙM\u0002Ýd\u0084ÿÕNÞ}$J;\u0090\u00966\n\u0012\u0099ßÔ\tZ(\r¥Ö6»\u0010- ôè,³\u0082\u0086\u0096!\u001e\u001b@\u0006mk7\u0000\u0092E\u0000\u0091t\u0016°¶nÅ,®4\u0091\u0098\tjól\u0093\u0016Ò«$§FD\u0093óÁÌv\u001b>\r\u0098\fô\u0011PDÅÕ]\u0082à\u0001\u0093\u0011\u0011À>#.¹ÕÈ\u0004ð\u0090µ¦Ø<3¹\u0016B#Ü\u0018X$cº©nE½~\r`í\u008dO\u0006¼.Î\u001bËgï£¡N\bRV-\u000bFW\u0096éî÷\bFÌêjÔ4\u0088Ë\u008b&b\u001eÄr\u0080\u007f²AJ\u0099À°/Q\u0084A@\u0018Áñ2@å4[\u001c\u00adô(ë\u009f\u008d$Ë\u0004í\u0084'\u0018y\r\u0004t\u001e |\u00adeærþ¹_¾¬ï\u0010øåh<pð\u0013\u0089\u0092Ø2\u0019¹\u0083ç\u0013\u0090@Ø¢uv¡|\u008d,\u00153o£\u0080î4µà{\f_®\u0013Æ@~ÔÏôcÁ\u001aÞ?÷\u0016?Ïå\u0085=\u008e<F±c;\rU\u0095ä\u009cò±@ÁÝk\u001boQ{e3\u0096ZI\u001cNB*~\u001bÌ_S>Ò\nx²\u0086/Â¨Â";
      int var12 = "c#ZS;;ØÎñ\u008aàwäý¾\u0019\u000b#\u000fþí\u0094Ø9äÝn±³\u0095JUÓ$·ÛÀLhØ²²¼\u0005I\u0082ÞÐRZy?\u0012Ø.EÖ Ìk\u0089\u001e\u009eoCÓ¢@#\u0095\u0011\r\u0086l1&Ú«ø\nW¢óê[ôCë\u000f8fy\u000b\u0005\u009c9J}m\u0096y1Ãu\u0018\u0017\u0081\u0012Y¨\u0086IY\u001f\u0015x$|\u0000 ùÕýA\u00ad\u000fa¡\u00856Õ\u0001J\u0093£CcÁ]4\u009b/\u0097×Z34\u0086d¸\u008a²\u0016ÀEbLìq\u0092\u0010â\u00894Z\u0002È\u008cørXj\u001fôÅd\u000bsyõ\nÚþÝ\u001d\u0082;Æ(\u0084?¬|Âè\u0099þ\u0005\u0081£\f¾Vm^ä]7K\u001cÄ~Q\u0003>ú\u0003\u008bÍ\u0097Zw\u001b'Ê\u0014¿®tê\u0081\u0001ÍÓ<\u0007\u000e\u0098£\u00048î\u0005µi\rïPÌ5\\Å\u0015Éß\u008f\u008e?¶r5G©\u001b\u000b\u0019f/\u001d\ty\u0097{Û8\u0019p}ï}\t\u009fÈ\u00017^E÷Od.î(Jò\u0018\u0010äkU\u0094½Q[\u001e¯¤~¬\u0010ÑÓ=\u000f¾Ñ²cI\u0087\u0010\u0092ù\u000fÅþ\u0086¼Ë\n\u009b\"?ÊË¬K\u0095c\u0019ÎtÖR;\u001b&×~=\u009cÓÊe²\u0096=QÃ\u009bU;÷;\u009dËÒþÝe|ÿû¦`?6\u008cEõ\u0019\u0093{:'\u008b\u0098:\tÉãY}.\u0080N'º\u0094Íï7±\u000f%Sî\u0011\u0010âÈ0v*?\u0084ê\u0092e4\u001aö\r\u009f\u0019\u000b)\u0006\u0090å1\u0007ó\u0088\u008cÉß»\u000bd>\"À´Éf\u0017Ò\u0094?÷LdäøÙM\u0002Ýd\u0084ÿÕNÞ}$J;\u0090\u00966\n\u0012\u0099ßÔ\tZ(\r¥Ö6»\u0010- ôè,³\u0082\u0086\u0096!\u001e\u001b@\u0006mk7\u0000\u0092E\u0000\u0091t\u0016°¶nÅ,®4\u0091\u0098\tjól\u0093\u0016Ò«$§FD\u0093óÁÌv\u001b>\r\u0098\fô\u0011PDÅÕ]\u0082à\u0001\u0093\u0011\u0011À>#.¹ÕÈ\u0004ð\u0090µ¦Ø<3¹\u0016B#Ü\u0018X$cº©nE½~\r`í\u008dO\u0006¼.Î\u001bËgï£¡N\bRV-\u000bFW\u0096éî÷\bFÌêjÔ4\u0088Ë\u008b&b\u001eÄr\u0080\u007f²AJ\u0099À°/Q\u0084A@\u0018Áñ2@å4[\u001c\u00adô(ë\u009f\u008d$Ë\u0004í\u0084'\u0018y\r\u0004t\u001e |\u00adeærþ¹_¾¬ï\u0010øåh<pð\u0013\u0089\u0092Ø2\u0019¹\u0083ç\u0013\u0090@Ø¢uv¡|\u008d,\u00153o£\u0080î4µà{\f_®\u0013Æ@~ÔÏôcÁ\u001aÞ?÷\u0016?Ïå\u0085=\u008e<F±c;\rU\u0095ä\u009cò±@ÁÝk\u001boQ{e3\u0096ZI\u001cNB*~\u001bÌ_S>Ò\nx²\u0086/Â¨Â"
         .length();
      char var9 = '!';
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 89;
         String var10001 = var10.substring(++var19, var19 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var51 ^ switch (var14 % 7) {
                     case 0 -> 59;
                     case 1 -> 18;
                     case 2 -> 102;
                     case 3 -> 109;
                     case 4 -> 25;
                     case 5 -> 109;
                     default -> 114;
                  });
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var19 += var9) >= var12) {
                     b = var13;
                     c = new String[25];
                     long var0 = 5972232820219678140L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "×oÝÜ\u0083Ì×\u0093°.\u001b³Jô\u008cäX\u009aÔROÊ¯\n \u0098\u001b\u0084öyV8ú«\u008cs¶STål´\u000e©ýKÀfoc\rc\u008f$_µ";
                     int var5 = "×oÝÜ\u0083Ì×\u0093°.\u001b³Jô\u008cäX\u009aÔROÊ¯\n \u0098\u001b\u0084öyV8ú«\u008cs¶STål´\u000e©ýKÀfoc\rc\u008f$_µ".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        long[] var21 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var21[var29] = var56;
                                 if (var2 >= var5) {
                                    d = var6;
                                    f = new Integer[9];
                                    String var15 = a(-16191, 9246);
                                    String var16 = a(-16175, 398);
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var56;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "É\u009b\u0097<V<Ê2çÌ/\u009e\u0083\u0082h\f";
                                 var5 = "É\u009b\u0097<V<Ê2çÌ/\u009e\u0083\u0082h\f".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var21 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var19);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var19 += var9) < var12) {
                     var9 = var10.charAt(var19);
                     continue label70;
                  }

                  var10 = "Ù\u000bjØKùÄÄ\u0098d¦9ÇX\u0092\u0082\u0016g°|=\u0013\rZ]Fv\u000eü\u0084Ó\u001d\u009b_!\u0098";
                  var12 = "Ù\u000bjØKùÄÄ\u0098d¦9ÇX\u0092\u0082\u0016g°|=\u0013\rZ]Fv\u000eü\u0084Ó\u001d\u009b_!\u0098".length();
                  var9 = 22;
                  var19 = -1;
            }

            var10000 = 21;
            var10001 = var10.substring(++var19, var19 + var9);
            var10002 = 0;
         }
      }
   }
}





