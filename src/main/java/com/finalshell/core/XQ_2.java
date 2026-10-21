package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Jj2;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import org.icmp4j.j;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV4DestinationUnreachablePacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IcmpV4EchoReplyPacket;
import org.pcap4j.packet.IcmpV4TimeExceededPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.util.MacAddress;

public class XQ_2 {
   public MacAddress T;
   public MacAddress i;
   public PcapHandle z;
   public String A;
   public int k;
   public String v;
   public PcapNetworkInterface B;
   public PcapNetworkInterface c;
   public final int S;
   public int u;
   public static D82_2 x;
   public final int M;
   public LinkedBlockingQueue n;
   public Random I;
   public boolean G;
   public short V;
   public boolean E;
   public boolean h;
   public boolean e;
   public boolean R;
   public Inet4Address j;
   public static ScheduledExecutorService W;
   public HashMap Q;
   public HashMap s;
   public HashSet t;
   public HashSet C;
   public static String[] b;
   public static String[] d;
   public static String[] f;
   public static long[] a;
   public static Integer[] g;
   public static long[] l;
   public static Long[] m;

   static {
      __vfClinit__();
   }

   public XQ_2(boolean var1, boolean var2) {
      String[] var10000 = B();
      this.A = a(7881, 20547);
      String[] var3 = var10000;
      this.k = a(28505, 1083944260511327002L);
      this.v = "";
      this.S = -1;
      this.u = 1;
      this.M = a(13056, 1352336992268664652L);
      this.n = new LinkedBlockingQueue();
      this.I = new Random();
      this.G = false;
      this.E = true;
      this.h = false;
      this.e = false;
      this.R = true;
      this.j = null;
      Registry.emptyArgs();
      long var4 = 253808553645062345L;
      Object var10001 = Ref.h2(253808553645062345L, var4);

      try {
         var10001 = (Boolean)var10001;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      label51: {
         if (var3 != null) {
            if (var10001 == null) {
               this.u = 1;
               if (var3 != null) {
                  break label51;
               }
            }

            var10001 = Registry.emptyArgs();
            long var6 = 561847341732101275L;
            Object var10002 = Ref.h2(561847341732101275L, var6);

            try {
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }
         }

         if (var3 != null) {
            if (var10001 == null) {
               this.u = 0;
               if (var3 != null) {
                  break label51;
               }
            }

            var10001 = Registry.emptyArgs();
            long var8 = 454647487873911743L;
            Object var14 = Ref.h2(454647487873911743L, var8);

            try {
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         if (var10001 == null) {
            this.u = 1;
         }
      }

      this.Q = new HashMap();
      this.s = new HashMap();
      this.t = new HashSet();
      this.C = new HashSet();
      this.G = var1;
      this.R = var2;
   }

   public void u() throws Exception {
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Do2(this), a(20555, 2451780543939697678L));
      long var2 = 201859364639460244L;
      Object[] var1 = var10001;
      Ref.h(201859364639460244L, var1, var2);
   }

   public void x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: invokestatic org/pcap4j/core/Pcaps.findAllDevs ()Ljava/util/List;
      // 09: astore 2
      // 0a: goto 0f
      // 0d: astore 3
      // 0e: return
      // 0f: aload 2
      // 10: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 15: astore 4
      // 17: aload 1
      // 18: ifnonnull 9e
      // 1b: aload 4
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast org/pcap4j/core/PcapNetworkInterface
      // 25: astore 3
      // 26: aload 0
      // 27: getfield com/finalshell/core/XQ_2.t Ljava/util/HashSet;
      // 2a: aload 3
      // 2b: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 2e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 31: aload 1
      // 32: ifnull a5
      // 35: ifne 9e
      // 38: aload 0
      // 39: getfield com/finalshell/core/XQ_2.C Ljava/util/HashSet;
      // 3c: aload 3
      // 3d: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 40: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 43: aload 1
      // 44: ifnull a5
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: ifne 9e
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: aload 3
      // 5a: invokevirtual com/finalshell/core/XQ_2.D (Lorg/pcap4j/core/PcapNetworkInterface;)V
      // 5d: aload 0
      // 5e: getfield com/finalshell/core/XQ_2.t Ljava/util/HashSet;
      // 61: aload 3
      // 62: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 65: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 68: pop
      // 69: goto 9e
      // 6c: astore 5
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/XQ_2.C Ljava/util/HashSet;
      // 72: aload 3
      // 73: invokevirtual org/pcap4j/core/PcapNetworkInterface.getName ()Ljava/lang/String;
      // 76: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 79: pop
      // 7a: aload 5
      // 7c: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 7f: sipush 7880
      // 82: sipush 16312
      // 85: invokestatic com/finalshell/core/XQ_2.a (II)Ljava/lang/String;
      // 88: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 8b: pop
      // 8c: aload 5
      // 8e: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 91: sipush 7886
      // 94: sipush -11627
      // 97: invokestatic com/finalshell/core/XQ_2.a (II)Ljava/lang/String;
      // 9a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 9d: pop
      // 9e: aload 4
      // a0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a5: ifne 1b
      // a8: aload 1
      // a9: ifnull 9e
      // ac: return
   }

   public void D(PcapNetworkInterface var1) throws PcapNativeException, NotOpenException {
      PcapHandle var2 = var1.openLive(a(19596, 7166196519583858892L), this.r(var1), this.u);
      String var3 = "";
      String var10000 = this.A;
      var3 = a(7884, -26074) + var10000 + ")";
      Kg2 var4 = new Kg2(this, var1, var2);
      Jj2 var5 = new Jj2(this, var2, var4, var1);
      var5.start();
   }

   public PcapNetworkInterface.PromiscuousMode r(PcapNetworkInterface var1) {
      PcapNetworkInterface.PromiscuousMode var2 = null;
      String var3 = (var1.getDescription() + ":" + var1.getName()).toLowerCase();
      if (var3.contains(a(7883, 15128))) {
         var2 = PcapNetworkInterface.PromiscuousMode.NONPROMISCUOUS;
      } else {
         var2 = PcapNetworkInterface.PromiscuousMode.PROMISCUOUS;
      }

      return var2;
   }

   public j E(InetAddress param1, int param2, int param3, Q0 param4) throws PcapNativeException, NotOpenException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 6
      // 06: astore 5
      // 08: aload 0
      // 09: getfield com/finalshell/core/XQ_2.i Lorg/pcap4j/util/MacAddress;
      // 0c: ifnonnull 24
      // 0f: new org/pcap4j/core/NotOpenException
      // 12: dup
      // 13: sipush 7885
      // 16: sipush 8237
      // 19: invokestatic com/finalshell/core/XQ_2.a (II)Ljava/lang/String;
      // 1c: invokespecial org/pcap4j/core/NotOpenException.<init> (Ljava/lang/String;)V
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: aload 5
      // 27: ifnull 3f
      // 2a: instanceof java/net/Inet4Address
      // 2d: ifeq bd
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 1
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: checkcast java/net/Inet4Address
      // 42: astore 7
      // 44: aload 0
      // 45: getfield com/finalshell/core/XQ_2.i Lorg/pcap4j/util/MacAddress;
      // 48: aload 0
      // 49: getfield com/finalshell/core/XQ_2.T Lorg/pcap4j/util/MacAddress;
      // 4c: aload 0
      // 4d: getfield com/finalshell/core/XQ_2.j Ljava/net/Inet4Address;
      // 50: aload 7
      // 52: iload 2
      // 53: iload 3
      // 54: invokestatic com/finalshell/core/GQ.A (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;Ljava/net/Inet4Address;II)Lorg/pcap4j/packet/Packet;
      // 57: astore 8
      // 59: new org/icmp4j/j
      // 5c: dup
      // 5d: invokespecial org/icmp4j/j.<init> ()V
      // 60: astore 6
      // 62: aload 6
      // 64: aload 4
      // 66: invokevirtual org/icmp4j/j.a (Lcom/finalshell/core/Q0;)V
      // 69: aload 6
      // 6b: aload 1
      // 6c: invokevirtual org/icmp4j/j.f (Ljava/net/InetAddress;)V
      // 6f: aload 6
      // 71: iload 2
      // 72: invokevirtual org/icmp4j/j.q (I)V
      // 75: aload 6
      // 77: invokevirtual org/icmp4j/j.H ()I
      // 7a: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
      // 7f: astore 9
      // 81: aload 0
      // 82: getfield com/finalshell/core/XQ_2.s Ljava/util/HashMap;
      // 85: aload 9
      // 87: aload 6
      // 89: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 8c: pop
      // 8d: getstatic com/finalshell/core/XQ_2.W Ljava/util/concurrent/ScheduledExecutorService;
      // 90: new com/finalshell/task/O5
      // 93: dup
      // 94: aload 0
      // 95: aload 9
      // 97: invokespecial com/finalshell/task/O5.<init> (Lcom/finalshell/core/XQ_2;Ljava/lang/String;)V
      // 9a: sipush 17691
      // 9d: ldc2_w 935767074703057388
      // a0: invokestatic com/finalshell/core/XQ_2.b (IJ)J
      // a3: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // a6: invokeinterface java/util/concurrent/ScheduledExecutorService.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; 5
      // ab: pop
      // ac: aload 0
      // ad: getfield com/finalshell/core/XQ_2.z Lorg/pcap4j/core/PcapHandle;
      // b0: aload 8
      // b2: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // b5: aload 6
      // b7: invokestatic java/lang/System.currentTimeMillis ()J
      // ba: invokevirtual org/icmp4j/j.R (J)V
      // bd: aload 6
      // bf: areturn
   }

   public j p(InetAddress param1, int param2, Q0 param3) throws PcapNativeException, NotOpenException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 5
      // 06: astore 4
      // 08: aload 0
      // 09: getfield com/finalshell/core/XQ_2.i Lorg/pcap4j/util/MacAddress;
      // 0c: ifnonnull 24
      // 0f: new org/pcap4j/core/NotOpenException
      // 12: dup
      // 13: sipush 7887
      // 16: sipush 22357
      // 19: invokestatic com/finalshell/core/XQ_2.a (II)Ljava/lang/String;
      // 1c: invokespecial org/pcap4j/core/NotOpenException.<init> (Ljava/lang/String;)V
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: aload 4
      // 27: ifnull 3f
      // 2a: instanceof java/net/Inet4Address
      // 2d: ifeq c3
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 1
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: checkcast java/net/Inet4Address
      // 42: astore 6
      // 44: aload 0
      // 45: getfield com/finalshell/core/XQ_2.i Lorg/pcap4j/util/MacAddress;
      // 48: aload 0
      // 49: getfield com/finalshell/core/XQ_2.T Lorg/pcap4j/util/MacAddress;
      // 4c: aload 0
      // 4d: getfield com/finalshell/core/XQ_2.j Ljava/net/Inet4Address;
      // 50: aload 6
      // 52: iload 2
      // 53: invokestatic com/finalshell/core/GQ.S (Lorg/pcap4j/util/MacAddress;Lorg/pcap4j/util/MacAddress;Ljava/net/Inet4Address;Ljava/net/Inet4Address;I)Lorg/pcap4j/packet/Packet;
      // 56: astore 7
      // 58: new org/icmp4j/j
      // 5b: dup
      // 5c: invokespecial org/icmp4j/j.<init> ()V
      // 5f: astore 5
      // 61: aload 5
      // 63: aload 3
      // 64: invokevirtual org/icmp4j/j.a (Lcom/finalshell/core/Q0;)V
      // 67: aload 5
      // 69: aload 1
      // 6a: invokevirtual org/icmp4j/j.f (Ljava/net/InetAddress;)V
      // 6d: aload 5
      // 6f: iload 2
      // 70: invokevirtual org/icmp4j/j.q (I)V
      // 73: aload 5
      // 75: invokevirtual org/icmp4j/j.Y ()Ljava/net/InetAddress;
      // 78: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 7b: aload 5
      // 7d: invokevirtual org/icmp4j/j.H ()I
      // 80: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
      // 85: astore 8
      // 87: aload 0
      // 88: getfield com/finalshell/core/XQ_2.Q Ljava/util/HashMap;
      // 8b: aload 8
      // 8d: aload 5
      // 8f: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 92: pop
      // 93: getstatic com/finalshell/core/XQ_2.W Ljava/util/concurrent/ScheduledExecutorService;
      // 96: new com/finalshell/task/Jn2
      // 99: dup
      // 9a: aload 0
      // 9b: aload 8
      // 9d: invokespecial com/finalshell/task/Jn2.<init> (Lcom/finalshell/core/XQ_2;Ljava/lang/String;)V
      // a0: sipush 19456
      // a3: ldc2_w 2949232511153416438
      // a6: invokestatic com/finalshell/core/XQ_2.b (IJ)J
      // a9: getstatic java/util/concurrent/TimeUnit.MILLISECONDS Ljava/util/concurrent/TimeUnit;
      // ac: invokeinterface java/util/concurrent/ScheduledExecutorService.schedule (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; 5
      // b1: pop
      // b2: aload 0
      // b3: getfield com/finalshell/core/XQ_2.z Lorg/pcap4j/core/PcapHandle;
      // b6: aload 7
      // b8: invokevirtual org/pcap4j/core/PcapHandle.sendPacket (Lorg/pcap4j/packet/Packet;)V
      // bb: aload 5
      // bd: invokestatic java/lang/System.currentTimeMillis ()J
      // c0: invokevirtual org/icmp4j/j.R (J)V
      // c3: aload 5
      // c5: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void i(Packet var1) {
      String[] var2 = B();

      try {
         EthernetPacket var3 = (EthernetPacket)var1;
         IpV4Packet var4 = null;

         label67: {
            label66: {
               Packet var15;
               label65: {
                  label64: {
                     try {
                        var10000 = this.e;
                        if (var2 == null) {
                           break label64;
                        }

                        if (this.e) {
                           break label66;
                        }
                     } catch (IllegalRawDataException var9) {
                        throw a(var9);
                     }

                     try {
                        var15 = var3.getPayload();
                        if (var2 == null) {
                           break label65;
                        }

                        var10000 = var15 instanceof IpV4Packet;
                     } catch (IllegalRawDataException var8) {
                        throw a(var8);
                     }
                  }

                  try {
                     if (!var10000) {
                        break label67;
                     }

                     var15 = var3.getPayload();
                  } catch (IllegalRawDataException var7) {
                     throw a(var7);
                  }
               }

               var4 = (IpV4Packet)var15;
               break label67;
            }

            var4 = this.n(var3);
         }

         IpV4Packet var16;
         label92: {
            try {
               var16 = var4;
               if (var2 == null) {
                  break label92;
               }

               if (var4 == null) {
                  return;
               }
            } catch (IllegalRawDataException var13) {
               throw a(var13);
            }

            var16 = var4;
         }

         IpV4Packet.IpV4Header var5 = var16.getHeader$IpV4Packet_IpV4Header();

         label100: {
            try {
               boolean var17 = var4.getPayload() instanceof IcmpV4CommonPacket;
               if (var2 == null) {
                  return;
               }

               if (!var17) {
                  break label100;
               }
            } catch (IllegalRawDataException var12) {
               throw a(var12);
            }

            IcmpV4CommonPacket var6 = (IcmpV4CommonPacket)var4.getPayload();

            try {
               this.C(var6, var5);
               if (var2 != null) {
                  return;
               }
            } catch (IllegalRawDataException var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            boolean var19 = var3.getPayload() instanceof IllegalPacket;
         } catch (IllegalRawDataException var10) {
            boolean var20 = false;
            throw a(var10);
         }
      } catch (IllegalRawDataException var14) {
         var14.printStackTrace();
      }
   }

   public void C(IcmpV4CommonPacket var1, IpV4Packet.IpV4Header var2) {
      String[] var10000 = B();
      IcmpV4CommonPacket.IcmpV4CommonHeader var4 = var1.getHeader$IcmpV4CommonPacket_IcmpV4CommonHeader();
      String[] var3 = var10000;
      IcmpV4Type var30 = var4.getType();
      IcmpV4Type var10001 = IcmpV4Type.DESTINATION_UNREACHABLE;
      if (var3 != null) {
         if (var30 == IcmpV4Type.DESTINATION_UNREACHABLE) {
            IcmpV4DestinationUnreachablePacket var5 = (IcmpV4DestinationUnreachablePacket)var1.getPayload();
            IcmpV4DestinationUnreachablePacket.IcmpV4DestinationUnreachableHeader var6 = var5.getHeader$IcmpV4DestinationUnreachablePacket_IcmpV4DestinationUnreachableHeader();
            String var7 = var2.getSrcAddr().getHostAddress() + ":" + var6.getUnused();
            j var8 = (j)this.Q.get(var7);
            if (var8 == null) {
               return;
            }

            long var9 = System.currentTimeMillis() - (long)this.u;
            if (var3 != null) {
               if (var9 < var8.R()) {
                  var9 = var8.R();
               }

               var8.i(var9);
               var8.w((int)(var8.q$long() - var8.R()));
               var8.P(true);
            }

            Q0 var11 = var8.E();
            if (var3 != null) {
               if (var11 != null) {
                  B0 var12 = new B0(B0.t);
                  var12.q(var8);
                  var11.a(var12);
               }

               var8.v(true);
            }

            if (var3 != null) {
               return;
            }
         }

         var30 = var4.getType();
         var10001 = IcmpV4Type.TIME_EXCEEDED;
      }

      if (var3 != null) {
         if (var30 == var10001) {
            IcmpV4TimeExceededPacket var15 = (IcmpV4TimeExceededPacket)var1.getPayload();
            IcmpV4TimeExceededPacket.IcmpV4TimeExceededHeader var17 = var15.getHeader$IcmpV4TimeExceededPacket_IcmpV4TimeExceededHeader();
            IcmpV4EchoPacket var19 = (IcmpV4EchoPacket)var15.getPayload().getPayload().getPayload();
            IcmpV4EchoPacket var31 = var19;
            if (var3 != null) {
               if (var19 == null) {
                  return;
               }

               var31 = var19;
            }

            IcmpV4EchoPacket.IcmpV4EchoHeader var21 = var31.getHeader$IcmpV4EchoPacket_IcmpV4EchoHeader();
            String var23 = var21.getSequenceNumberAsInt() + "";
            j var10 = (j)this.s.get(var23);
            if (var10 == null) {
               return;
            }

            long var26 = System.currentTimeMillis() - (long)this.u;
            if (var3 != null) {
               if (var26 < var10.R()) {
                  var26 = var10.R();
               }

               var10.i(var26);
               var10.w((int)(var10.q$long() - var10.R()));
               var10.P(true);
               var10.S(var2.getSrcAddr().getHostAddress());
            }

            Q0 var13 = var10.E();
            if (var3 != null) {
               if (var13 != null) {
                  B0 var14 = new B0(B0.m);
                  var14.q(var10);
                  var13.a(var14);
               }

               var10.v(true);
            }

            if (var3 != null) {
               return;
            }
         }

         var30 = var4.getType();
         if (var3 == null) {
            return;
         }

         var10001 = IcmpV4Type.ECHO_REPLY;
      }

      if (var30 == var10001) {
         IcmpV4EchoReplyPacket var16 = (IcmpV4EchoReplyPacket)var1.getPayload();
         IcmpV4EchoReplyPacket.IcmpV4EchoReplyHeader var18 = var16.getHeader$IcmpV4EchoReplyPacket_IcmpV4EchoReplyHeader();
         String var20 = var2.getSrcAddr().getHostAddress() + ":" + var18.getSequenceNumberAsInt();
         j var22 = (j)this.Q.get(var20);
         String var24 = var18.getSequenceNumberAsInt() + "";
         j var25 = (j)this.s.get(var24);
         j var32 = var22;
         if (var3 != null) {
            if (var22 == null) {
               var22 = var25;
            }

            var32 = var22;
         }

         if (var3 != null) {
            if (var32 == null) {
               return;
            }

            var32 = var22;
         }

         var32.S(var2.getSrcAddr().getHostAddress());
         long var27 = System.currentTimeMillis() - (long)this.u;
         if (var3 != null) {
            if (var27 < var22.R()) {
               var27 = var22.R();
            }

            var22.i(var27);
            var22.w((int)(var22.q$long() - var22.R()));
            var22.P(true);
         }

         Q0 var28 = var22.E();
         if (var3 != null) {
            if (var28 != null) {
               B0 var29 = new B0(B0.t);
               var29.q(var22);
               var28.a(var29);
            }

            var22.v(true);
         }

         if (var3 != null) {
            return;
         }
      }

      var4.getType();
   }

   public IpV4Packet n(EthernetPacket param1) throws IllegalRawDataException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: invokestatic com/finalshell/core/XQ_2.B ()[Ljava/lang/String;
      // 05: aload 1
      // 06: invokevirtual org/pcap4j/packet/EthernetPacket.getPayload ()Lorg/pcap4j/packet/Packet;
      // 09: invokeinterface org/pcap4j/packet/Packet.getRawData ()[B 1
      // 0e: astore 4
      // 10: astore 2
      // 11: aload 4
      // 13: arraylength
      // 14: sipush 17212
      // 17: ldc2_w 3610664135112806264
      // 1a: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // 1d: aload 2
      // 1e: ifnull 52
      // 21: if_icmple f7
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 4
      // 2d: sipush 25696
      // 30: ldc2_w 1409686679685523490
      // 33: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // 36: baload
      // 37: aload 2
      // 38: ifnull 56
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: sipush 31767
      // 45: ldc2_w 7136118817418735702
      // 48: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: if_icmpne f7
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
      // 67: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 6a: ldc2_w 259396441241254847
      // 6d: astore 10
      // 6f: ldc2_w 259396441241254847
      // 72: aload 10
      // 74: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 77: checkcast java/lang/Short
      // 7a: invokevirtual java/lang/Short.shortValue ()S
      // 7d: goto 84
      // 80: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 83: athrow
      // 84: istore 6
      // 86: iload 6
      // 88: invokestatic com/finalshell/core/XQ_2.c (S)I
      // 8b: bipush 2
      // 8c: isub
      // 8d: istore 7
      // 8f: iload 7
      // 91: newarray 8
      // 93: astore 8
      // 95: aload 4
      // 97: arraylength
      // 98: sipush 25696
      // 9b: ldc2_w 1409686679685523490
      // 9e: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // a1: isub
      // a2: istore 9
      // a4: getstatic com/finalshell/core/GQ.V [B
      // a7: bipush 2
      // a8: aload 4
      // aa: bipush 2
      // ab: baload
      // ac: bastore
      // ad: getstatic com/finalshell/core/GQ.V [B
      // b0: bipush 3
      // b1: aload 4
      // b3: bipush 3
      // b4: baload
      // b5: bastore
      // b6: aload 2
      // b7: ifnull ed
      // ba: iload 7
      // bc: aload 4
      // be: arraylength
      // bf: sipush 25696
      // c2: ldc2_w 1409686679685523490
      // c5: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // c8: isub
      // c9: if_icmpne f7
      // cc: goto d3
      // cf: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: aload 4
      // d5: sipush 25696
      // d8: ldc2_w 1409686679685523490
      // db: invokestatic com/finalshell/core/XQ_2.a (IJ)I
      // de: aload 8
      // e0: bipush 0
      // e1: iload 7
      // e3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // e6: goto ed
      // e9: invokestatic com/finalshell/core/XQ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ec: athrow
      // ed: aload 8
      // ef: bipush 0
      // f0: aload 8
      // f2: arraylength
      // f3: invokestatic org/pcap4j/packet/IpV4Packet.newPacket ([BII)Lorg/pcap4j/packet/IpV4Packet;
      // f6: astore 3
      // f7: aload 3
      // f8: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String F(byte[] var0) {
      String[] var10000 = B();
      StringBuffer var2 = new StringBuffer();
      int var3 = 0;
      String[] var1 = var10000;
      String var6;
      if (var1 == null) {
         var6 = Integer.toHexString(var0[var3] & a(6146, 2752411197042136133L));
      } else if (var3 >= var0.length) {
         var6 = var2.toString();
         if (var1 != null) {
            return var6;
         }
      } else {
         var6 = Integer.toHexString(var0[var3] & a(6146, 2752411197042136133L));
      }

      while (true) {
         String var4 = var6;
         var4 = var4.replaceAll(":", " ");
         if (var1 != null) {
            if (var4.length() == 1) {
               var4 = "0" + var4;
            }

            var2.append(var4 + " ");
         }

         if (++var3 >= var0.length) {
            var6 = var2.toString();
            if (var1 != null) {
               return var6;
            }
         } else {
            var6 = Integer.toHexString(var0[var3] & a(6146, 2752411197042136133L));
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void d() {
      String[] var10000 = B();
      InetAddress var2 = null;
      String[] var1 = var10000;

      try {
         var2 = InetAddress.getByName(this.A);
      } catch (UnknownHostException var9) {
      long var12;
      long var12;
      }

      label53: {
         try {
            var12 = var2;
            if (var1 == null) {
               break label53;
            }

            if (var2 == null) {
               return;
            }
         } catch (UnknownHostException var11) {
            throw a(var11);
         }

         var12 = var2;
      }

      String var3 = var12.getHostAddress();
      int var5 = 0;
      if (var1 == null || var5 < 3) {
         do {
            try {
               DatagramSocket var4 = new DatagramSocket();
               DatagramPacket var6 = new DatagramPacket(new byte[1], 1);
               var6.setAddress(InetAddress.getByName(var3));
               var6.setPort(this.k);
               var4.send(var6);
               var4.close();
               Thread.sleep(b(10040, 2106956996069114829L));
               if (this.i != null) {
                  break;
               }
            } catch (Exception var10) {
               try {
                  Thread.sleep(b(25569, 5396066673679992597L));
               } catch (InterruptedException var8) {
                  var8.printStackTrace();
               }
            }
         } while (++var5 < 3);
      }
   }

   public short E() {
      return this.V;
   }

   public void K(short var1) {
      this.V = var1;
   }

   public static int c(short var0) {
      return var0 & a(32353, 7043884782288663079L);
   }

   public static void I(String[] var0) {
      b = var0;
   }

   public static String[] B() {
      return b;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 7885) & 65535;
      if (f[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 167;
            case 1 -> 55;
            case 2 -> 158;
            case 3 -> 96;
            case 4 -> 116;
            case 5 -> 92;
            case 6 -> 20;
            case 7 -> 171;
            case 8 -> 155;
            case 9 -> 123;
            case 10 -> 98;
            case 11 -> 159;
            case 12 -> 139;
            case 13 -> 66;
            case 14 -> 235;
            case 15 -> 9;
            case 16 -> 228;
            case 17 -> 85;
            case 18 -> 175;
            case 19 -> 152;
            case 20 -> 57;
            case 21 -> 208;
            case 22 -> 128;
            case 23 -> 19;
            case 24 -> 113;
            case 25 -> 59;
            case 26 -> 243;
            case 27 -> 70;
            case 28 -> 166;
            case 29 -> 81;
            case 30 -> 99;
            case 31 -> 217;
            case 32 -> 68;
            case 33 -> 40;
            case 34 -> 174;
            case 35 -> 252;
            case 36 -> 241;
            case 37 -> 125;
            case 38 -> 104;
            case 39 -> 124;
            case 40 -> 148;
            case 41 -> 225;
            case 42 -> 106;
            case 43 -> 37;
            case 44 -> 43;
            case 45 -> 95;
            case 46 -> 17;
            case 47 -> 213;
            case 48 -> 115;
            case 49 -> 232;
            case 50 -> 110;
            case 51 -> 199;
            case 52 -> 206;
            case 53 -> 94;
            case 54 -> 183;
            case 55 -> 74;
            case 56 -> 146;
            case 57 -> 67;
            case 58 -> 86;
            case 59 -> 83;
            case 60 -> 6;
            case 61 -> 242;
            case 62 -> 77;
            case 63 -> 120;
            case 64 -> 53;
            case 65 -> 4;
            case 66 -> 11;
            case 67 -> 204;
            case 68 -> 224;
            case 69 -> 7;
            case 70 -> 103;
            case 71 -> 131;
            case 72 -> 193;
            case 73 -> 89;
            case 74 -> 25;
            case 75 -> 196;
            case 76 -> 44;
            case 77 -> 82;
            case 78 -> 255;
            case 79 -> 218;
            case 80 -> 226;
            case 81 -> 150;
            case 82 -> 22;
            case 83 -> 240;
            case 84 -> 169;
            case 85 -> 173;
            case 86 -> 21;
            case 87 -> 64;
            case 88 -> 119;
            case 89 -> 222;
            case 90 -> 246;
            case 91 -> 178;
            case 92 -> 200;
            case 93 -> 79;
            case 94 -> 63;
            case 95 -> 32;
            case 96 -> 47;
            case 97 -> 97;
            case 98 -> 3;
            case 99 -> 39;
            case 100 -> 34;
            case 101 -> 231;
            case 102 -> 162;
            case 103 -> 163;
            case 104 -> 132;
            case 105 -> 80;
            case 106 -> 214;
            case 107 -> 108;
            case 108 -> 8;
            case 109 -> 16;
            case 110 -> 221;
            case 111 -> 72;
            case 112 -> 51;
            case 113 -> 233;
            case 114 -> 220;
            case 115 -> 189;
            case 116 -> 185;
            case 117 -> 42;
            case 118 -> 50;
            case 119 -> 88;
            case 120 -> 181;
            case 121 -> 177;
            case 122 -> 238;
            case 123 -> 230;
            case 124 -> 38;
            case 125 -> 90;
            case 126 -> 101;
            case 127 -> 176;
            case 128 -> 165;
            case 129 -> 69;
            case 130 -> 192;
            case 131 -> 227;
            case 132 -> 239;
            case 133 -> 102;
            case 134 -> 93;
            case 135 -> 251;
            case 136 -> 0;
            case 137 -> 136;
            case 138 -> 156;
            case 139 -> 24;
            case 140 -> 161;
            case 141 -> 109;
            case 142 -> 201;
            case 143 -> 62;
            case 144 -> 133;
            case 145 -> 15;
            case 146 -> 105;
            case 147 -> 137;
            case 148 -> 129;
            case 149 -> 149;
            case 150 -> 184;
            case 151 -> 5;
            case 152 -> 46;
            case 153 -> 75;
            case 154 -> 28;
            case 155 -> 58;
            case 156 -> 249;
            case 157 -> 65;
            case 158 -> 247;
            case 159 -> 209;
            case 160 -> 170;
            case 161 -> 141;
            case 162 -> 33;
            case 163 -> 56;
            case 164 -> 160;
            case 165 -> 138;
            case 166 -> 71;
            case 167 -> 190;
            case 168 -> 207;
            case 169 -> 172;
            case 170 -> 219;
            case 171 -> 229;
            case 172 -> 107;
            case 173 -> 54;
            case 174 -> 234;
            case 175 -> 45;
            case 176 -> 180;
            case 177 -> 253;
            case 178 -> 1;
            case 179 -> 145;
            case 180 -> 60;
            case 181 -> 26;
            case 182 -> 100;
            case 183 -> 195;
            case 184 -> 14;
            case 185 -> 194;
            case 186 -> 154;
            case 187 -> 52;
            case 188 -> 188;
            case 189 -> 237;
            case 190 -> 142;
            case 191 -> 121;
            case 192 -> 48;
            case 193 -> 122;
            case 194 -> 182;
            case 195 -> 117;
            case 196 -> 147;
            case 197 -> 215;
            case 198 -> 254;
            case 199 -> 203;
            case 200 -> 205;
            case 201 -> 29;
            case 202 -> 144;
            case 203 -> 31;
            case 204 -> 10;
            case 205 -> 73;
            case 206 -> 91;
            case 207 -> 236;
            case 208 -> 84;
            case 209 -> 13;
            case 210 -> 49;
            case 211 -> 153;
            case 212 -> 143;
            case 213 -> 244;
            case 214 -> 78;
            case 215 -> 114;
            case 216 -> 12;
            case 217 -> 118;
            case 218 -> 198;
            case 219 -> 140;
            case 220 -> 191;
            case 221 -> 27;
            case 222 -> 23;
            case 223 -> 151;
            case 224 -> 186;
            case 225 -> 111;
            case 226 -> 18;
            case 227 -> 76;
            case 228 -> 157;
            case 229 -> 164;
            case 230 -> 210;
            case 231 -> 2;
            case 232 -> 168;
            case 233 -> 30;
            case 234 -> 112;
            case 235 -> 35;
            case 236 -> 41;
            case 237 -> 134;
            case 238 -> 187;
            case 239 -> 126;
            case 240 -> 248;
            case 241 -> 223;
            case 242 -> 202;
            case 243 -> 197;
            case 244 -> 127;
            case 245 -> 87;
            case 246 -> 250;
            case 247 -> 179;
            case 248 -> 130;
            case 249 -> 212;
            case 250 -> 211;
            case 251 -> 245;
            case 252 -> 135;
            case 253 -> 61;
            case 254 -> 36;
            default -> 216;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3140;
      if (g[var3] == null) {
         g[var3] = (int)(a[var3] ^ var1);
      }

      return g[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 25844) & 32767;
      if (m[var3] == null) {
         m[var3] = l[var3] ^ var1;
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[7];
      String[] var10000 = new String[1];
      int var19 = 0;
      String var18 = "WBÕ/Ed²R\u0083\u0087Æ\u0098¤J(\u0018\u000b¤õoÂo\u0098Dq1òúf\u0001Ø\u001c\u008f\u0084¥Oiô\u00ad\u001e\u000f,4ºá¨½\u000fi4à0tz×ó\u000fí0× õÞ\u001c|î¾õå\u0090ì\u0087\u0007¤\u0093\u008f3Ë0I";
      int var20 = "WBÕ/Ed²R\u0083\u0087Æ\u0098¤J(\u0018\u000b¤õoÂo\u0098Dq1òúf\u0001Ø\u001c\u008f\u0084¥Oiô\u00ad\u001e\u000f,4ºá¨½\u000fi4à0tz×ó\u000fí0× õÞ\u001c|î¾õå\u0090ì\u0087\u0007¤\u0093\u008f3Ë0I"
         .length();
      I(var10000);
      char var17 = 15;
      int var26 = -1;

      label88:
      while (true) {
         byte var27 = 23;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var55 = var10001.toCharArray();
               int var10004 = var55.length;
               int var22 = 0;
               byte var58 = var27;
               var47 = var55;
               int var35 = var10004;
               byte var67;
               char[] var75;
               int var10006;
               if (var10004 <= 1) {
                  var75 = var55;
                  var67 = var27;
                  var10006 = var22;
               } else {
                  var58 = var27;
                  var35 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var75 = var55;
                  var67 = var27;
                  var10006 = var22;
               }

               while (true) {
                  var75[var10006] = (char)(var75[var10006] ^ var67 ^ switch (var22 % 7) {
                     case 0 -> 82;
                     case 1 -> 75;
                     case 2 -> 2;
                     case 3 -> 24;
                     case 4 -> 41;
                     case 5 -> 101;
                     default -> 70;
                  });
                  var22++;
                  if (var58 == 0) {
                     var10006 = var58;
                     var75 = var47;
                     var67 = var58;
                  } else {
                     if (var35 <= var22) {
                        break;
                     }

                     var75 = var47;
                     var67 = var58;
                     var10006 = var22;
                  }
               }
            }

            String var60 = new String(var47).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var60;
                  if ((var26 += var17) >= var20) {
                     d = var21;
                     f = new String[7];
                     long var8 = 2151814781096946377L;
                     long[] var14 = new long[9];
                     int var11 = 0;
                     String var12 = "OË%î\u0019\u0013¥¹KyPû¥\n±\u0017À\u0087¬S.¯g\u0011;-ÿ¿\u001a6þs\u0097J;ÄµØ\u0002\u0005\u001e{æCò\u008e\u009aÚT\u00ad\u009eVzö\u0082ã";
                     int var13 = "OË%î\u0019\u0013¥¹KyPû¥\n±\u0017À\u0087¬S.¯g\u0011;-ÿ¿\u001a6þs\u0097J;ÄµØ\u0002\u0005\u001e{æCò\u008e\u009aÚT\u00ad\u009eVzö\u0082ã"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var37 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var37, var10).getBytes("ISO-8859-1");
                        long[] var29 = var14;
                        int var38 = var11++;
                        long var51 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var61 = -1;

                        while (true) {
                           long var72 = var51 ^ var8;
                           switch (var61) {
                              case 0:
                                 var29[var38] = var72;
                                 if (var10 >= var13) {
                                    a = var14;
                                    g = new Integer[9];
                                    long var0 = 7246504059379158680L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = ".ro\u0000·½\u0089éy\u00ad«5é\u0001Ì¡";
                                    int var5 = ".ro\u0000·½\u0089éy\u00ad«5é\u0001Ì¡".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var40 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                                       long[] var30 = var6;
                                       int var41 = var3++;
                                       long var53 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var63 = -1;

                                       while (true) {
                                          var72 = var53 ^ var0;
                                          switch (var63) {
                                             case 0:
                                                var30[var41] = var72;
                                                if (var2 >= var5) {
                                                   l = var6;
                                                   m = new Long[4];
                                                   x = new D82_2();
                                                   W = Executors.newSingleThreadScheduledExecutor();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var30[var41] = var72;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "L}\u0006[¹í\u0081~hlB>2\u0096\bd";
                                                var5 = "L}\u0006[¹í\u0081~hlB>2\u0096\bd".length();
                                                var2 = 0;
                                          }

                                          byte var42 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                                          var30 = var6;
                                          var41 = var3++;
                                          var53 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var63 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var29[var38] = var72;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "yÉìþ]®ÐÐ\u0018Êç\u0012Ù|ý\u0085";
                                 var13 = "yÉìþ]®ÐÐ\u0018Êç\u0012Ù|ý\u0085".length();
                                 var10 = 0;
                           }

                           byte var39 = var10;
                           var10 += 8;
                           var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                           var29 = var14;
                           var38 = var11++;
                           var51 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var61 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var60;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "DÇý\u0092«¯\bÈê\u0001¶¢§\u001e\u000b";
                  var20 = "DÇý\u0092«¯\bÈê\u0001¶¢§\u001e\u000b".length();
                  var17 = 6;
                  var26 = -1;
            }

            var27 = 60;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}






