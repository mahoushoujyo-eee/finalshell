package com.finalshell.network;

import com.finalshell.core.C3;
import com.finalshell.core.JX;
import com.finalshell.core.ProxyMessage;
import com.finalshell.core.Uu4;
import com.finalshell.core.Y2_5;
import com.finalshell.io.B52;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Zc2 extends DatagramSocket {
   public InetAddress n;
   public int j;
   public C3 X;
   public boolean x = false;
   public Uu4 G;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Zc2() throws B52, IOException {
      this(Y2_5.a, 0, null);
   }

   public Zc2(int var1) throws B52, IOException {
      this(Y2_5.a, var1, null);
   }

   public Zc2(int var1, InetAddress var2) throws B52, IOException {
      this(Y2_5.a, var1, var2);
   }

   public Zc2(Y2_5 param1, int param2, InetAddress param3) throws B52, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 2
      // 02: aload 3
      // 03: invokespecial java/net/DatagramSocket.<init> (ILjava/net/InetAddress;)V
      // 06: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 09: aload 0
      // 0a: bipush 0
      // 0b: putfield com/finalshell/network/Zc2.x Z
      // 0e: astore 4
      // 10: aload 1
      // 11: aload 4
      // 13: ifnull 36
      // 16: ifnonnull 35
      // 19: goto 20
      // 1c: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f: athrow
      // 20: new com/finalshell/io/B52
      // 23: dup
      // 24: sipush 11317
      // 27: ldc2_w 1951059412678824939
      // 2a: invokestatic com/finalshell/network/Zc2.a (IJ)I
      // 2d: invokespecial com/finalshell/io/B52.<init> (I)V
      // 30: athrow
      // 31: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 34: athrow
      // 35: aload 1
      // 36: aload 4
      // 38: ifnull 62
      // 3b: instanceof com/finalshell/core/C3
      // 3e: ifne 5e
      // 41: goto 48
      // 44: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 47: athrow
      // 48: new com/finalshell/io/B52
      // 4b: dup
      // 4c: bipush -1
      // 4d: sipush -17999
      // 50: sipush 21902
      // 53: invokestatic com/finalshell/network/Zc2.a (II)Ljava/lang/String;
      // 56: invokespecial com/finalshell/io/B52.<init> (ILjava/lang/String;)V
      // 59: athrow
      // 5a: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5d: athrow
      // 5e: aload 1
      // 5f: getfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 62: ifnull 83
      // 65: new com/finalshell/io/B52
      // 68: dup
      // 69: sipush 9176
      // 6c: ldc2_w 9136890383352028167
      // 6f: invokestatic com/finalshell/network/Zc2.a (IJ)I
      // 72: sipush -18000
      // 75: sipush -27175
      // 78: invokestatic com/finalshell/network/Zc2.a (II)Ljava/lang/String;
      // 7b: invokespecial com/finalshell/io/B52.<init> (ILjava/lang/String;)V
      // 7e: athrow
      // 7f: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 82: athrow
      // 83: aload 0
      // 84: aload 1
      // 85: invokevirtual com/finalshell/core/Y2_5.B ()Lcom/finalshell/core/Y2_5;
      // 88: checkcast com/finalshell/core/C3
      // 8b: putfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 8e: aload 0
      // 8f: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 92: aload 0
      // 93: invokespecial java/net/DatagramSocket.getLocalAddress ()Ljava/net/InetAddress;
      // 96: aload 0
      // 97: invokespecial java/net/DatagramSocket.getLocalPort ()I
      // 9a: invokevirtual com/finalshell/core/C3.F (Ljava/net/InetAddress;I)Lcom/finalshell/core/Jk2;
      // 9d: astore 5
      // 9f: aload 0
      // a0: aload 5
      // a2: getfield com/finalshell/core/Jk2.e Ljava/net/InetAddress;
      // a5: putfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // a8: aload 0
      // a9: aload 4
      // ab: ifnull e6
      // ae: getfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // b1: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // b4: sipush -17997
      // b7: sipush 24916
      // ba: invokestatic com/finalshell/network/Zc2.a (II)Ljava/lang/String;
      // bd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c0: ifeq dc
      // c3: goto ca
      // c6: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // c9: athrow
      // ca: aload 0
      // cb: aload 0
      // cc: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // cf: getfield com/finalshell/core/C3.v Ljava/net/InetAddress;
      // d2: putfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // d5: goto dc
      // d8: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // db: athrow
      // dc: aload 0
      // dd: aload 5
      // df: getfield com/finalshell/core/Jk2.R I
      // e2: putfield com/finalshell/network/Zc2.j I
      // e5: aload 0
      // e6: aload 0
      // e7: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // ea: getfield com/finalshell/core/C3.W Lcom/finalshell/core/Uu4;
      // ed: putfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // f0: return
   }

   public Zc2(boolean var1, Uu4 var2, InetAddress var3, int var4) throws IOException {
      this.x = var1;
      this.n = var3;
      this.j = var4;
      this.G = var2;
      this.X = null;
   }

   @Override
   public void send(DatagramPacket param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 41
      // 09: getfield com/finalshell/network/Zc2.x Z
      // 0c: ifne 40
      // 0f: goto 16
      // 12: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 2
      // 18: ifnull 41
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 25: aload 1
      // 26: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 29: invokevirtual com/finalshell/core/C3.K (Ljava/net/InetAddress;)Z
      // 2c: ifeq 40
      // 2f: goto 36
      // 32: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: aload 0
      // 37: aload 1
      // 38: invokespecial java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 3b: return
      // 3c: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 45: aload 1
      // 46: invokevirtual java/net/DatagramPacket.getPort ()I
      // 49: invokespecial com/finalshell/network/Zc2.l (Ljava/net/InetAddress;I)[B
      // 4c: astore 3
      // 4d: aload 3
      // 4e: arraylength
      // 4f: aload 1
      // 50: invokevirtual java/net/DatagramPacket.getLength ()I
      // 53: iadd
      // 54: newarray 8
      // 56: astore 4
      // 58: aload 1
      // 59: invokevirtual java/net/DatagramPacket.getData ()[B
      // 5c: astore 5
      // 5e: aload 3
      // 5f: bipush 0
      // 60: aload 4
      // 62: bipush 0
      // 63: aload 3
      // 64: arraylength
      // 65: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 68: aload 5
      // 6a: bipush 0
      // 6b: aload 4
      // 6d: aload 3
      // 6e: arraylength
      // 6f: aload 1
      // 70: invokevirtual java/net/DatagramPacket.getLength ()I
      // 73: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 76: aload 0
      // 77: aload 2
      // 78: ifnull 97
      // 7b: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 7e: ifnull 96
      // 81: goto 88
      // 84: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 87: athrow
      // 88: aload 0
      // 89: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 8c: aload 4
      // 8e: bipush 1
      // 8f: invokeinterface com/finalshell/core/Uu4.o ([BZ)[B 3
      // 94: astore 4
      // 96: aload 0
      // 97: new java/net/DatagramPacket
      // 9a: dup
      // 9b: aload 4
      // 9d: aload 4
      // 9f: arraylength
      // a0: aload 0
      // a1: getfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // a4: aload 0
      // a5: getfield com/finalshell/network/Zc2.j I
      // a8: invokespecial java/net/DatagramPacket.<init> ([BILjava/net/InetAddress;I)V
      // ab: invokespecial java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // ae: return
   }

   public void r(DatagramPacket param1, String param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 08: aload 2
      // 09: invokevirtual com/finalshell/core/C3.X (Ljava/lang/String;)Z
      // 0c: aload 3
      // 0d: ifnull 3e
      // 10: ifeq 2c
      // 13: goto 1a
      // 16: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 1f: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 22: aload 0
      // 23: aload 1
      // 24: invokespecial java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 27: return
      // 28: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 3
      // 2e: ifnull 51
      // 31: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 34: getfield com/finalshell/core/C3.j Z
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3d: athrow
      // 3e: ifeq 50
      // 41: aload 1
      // 42: aload 2
      // 43: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 46: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 49: goto 50
      // 4c: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 2
      // 52: aload 1
      // 53: invokevirtual java/net/DatagramPacket.getPort ()I
      // 56: invokespecial com/finalshell/network/Zc2.n (Ljava/lang/String;I)[B
      // 59: astore 4
      // 5b: aload 4
      // 5d: arraylength
      // 5e: aload 1
      // 5f: invokevirtual java/net/DatagramPacket.getLength ()I
      // 62: iadd
      // 63: newarray 8
      // 65: astore 5
      // 67: aload 1
      // 68: invokevirtual java/net/DatagramPacket.getData ()[B
      // 6b: astore 6
      // 6d: aload 4
      // 6f: bipush 0
      // 70: aload 5
      // 72: bipush 0
      // 73: aload 4
      // 75: arraylength
      // 76: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 79: aload 6
      // 7b: bipush 0
      // 7c: aload 5
      // 7e: aload 4
      // 80: arraylength
      // 81: aload 1
      // 82: invokevirtual java/net/DatagramPacket.getLength ()I
      // 85: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 88: aload 0
      // 89: aload 3
      // 8a: ifnull a9
      // 8d: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 90: ifnull a8
      // 93: goto 9a
      // 96: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 9e: aload 5
      // a0: bipush 1
      // a1: invokeinterface com/finalshell/core/Uu4.o ([BZ)[B 3
      // a6: astore 5
      // a8: aload 0
      // a9: new java/net/DatagramPacket
      // ac: dup
      // ad: aload 5
      // af: aload 5
      // b1: arraylength
      // b2: aload 0
      // b3: getfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // b6: aload 0
      // b7: getfield com/finalshell/network/Zc2.j I
      // ba: invokespecial java/net/DatagramPacket.<init> ([BILjava/net/InetAddress;I)V
      // bd: invokespecial java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // c0: return
   }

   @Override
   public void receive(DatagramPacket param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial java/net/DatagramSocket.receive (Ljava/net/DatagramPacket;)V
      // 008: astore 2
      // 009: aload 0
      // 00a: getfield com/finalshell/network/Zc2.x Z
      // 00d: aload 2
      // 00e: ifnull 0cc
      // 011: ifeq 0ba
      // 014: goto 01b
      // 017: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01a: athrow
      // 01b: aload 1
      // 01c: invokevirtual java/net/DatagramPacket.getLength ()I
      // 01f: istore 3
      // 020: aload 0
      // 021: invokevirtual com/finalshell/network/Zc2.getSoTimeout ()I
      // 024: istore 4
      // 026: invokestatic java/lang/System.currentTimeMillis ()J
      // 029: lstore 5
      // 02b: aload 2
      // 02c: ifnonnull 07c
      // 02f: aload 1
      // 030: iload 3
      // 031: invokevirtual java/net/DatagramPacket.setLength (I)V
      // 034: iload 4
      // 036: aload 2
      // 037: ifnull 055
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 040: athrow
      // 041: ifeq 077
      // 044: iload 4
      // 046: invokestatic java/lang/System.currentTimeMillis ()J
      // 049: lload 5
      // 04b: lsub
      // 04c: l2i
      // 04d: goto 054
      // 050: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 053: athrow
      // 054: isub
      // 055: istore 7
      // 057: iload 7
      // 059: ifgt 071
      // 05c: new java/io/InterruptedIOException
      // 05f: dup
      // 060: sipush -17998
      // 063: sipush -1045
      // 066: invokestatic com/finalshell/network/Zc2.a (II)Ljava/lang/String;
      // 069: invokespecial java/io/InterruptedIOException.<init> (Ljava/lang/String;)V
      // 06c: athrow
      // 06d: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 070: athrow
      // 071: aload 0
      // 072: iload 7
      // 074: invokevirtual com/finalshell/network/Zc2.setSoTimeout (I)V
      // 077: aload 0
      // 078: aload 1
      // 079: invokespecial java/net/DatagramSocket.receive (Ljava/net/DatagramPacket;)V
      // 07c: aload 0
      // 07d: getfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // 080: aload 1
      // 081: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 084: invokevirtual java/net/InetAddress.equals (Ljava/lang/Object;)Z
      // 087: ifeq 02f
      // 08a: aload 0
      // 08b: getfield com/finalshell/network/Zc2.j I
      // 08e: aload 2
      // 08f: ifnull 0a6
      // 092: aload 1
      // 093: invokevirtual java/net/DatagramPacket.getPort ()I
      // 096: aload 2
      // 097: ifnull 054
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a0: athrow
      // 0a1: if_icmpne 02f
      // 0a4: iload 4
      // 0a6: ifeq 0f1
      // 0a9: aload 0
      // 0aa: iload 4
      // 0ac: invokevirtual com/finalshell/network/Zc2.setSoTimeout (I)V
      // 0af: aload 2
      // 0b0: ifnonnull 0f1
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield com/finalshell/network/Zc2.n Ljava/net/InetAddress;
      // 0be: aload 1
      // 0bf: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 0c2: invokevirtual java/net/InetAddress.equals (Ljava/lang/Object;)Z
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0cb: athrow
      // 0cc: aload 2
      // 0cd: ifnull 0e5
      // 0d0: ifeq 0ec
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield com/finalshell/network/Zc2.j I
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e4: athrow
      // 0e5: aload 1
      // 0e6: invokevirtual java/net/DatagramPacket.getPort ()I
      // 0e9: if_icmpeq 0f1
      // 0ec: return
      // 0ed: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: invokevirtual java/net/DatagramPacket.getData ()[B
      // 0f5: astore 3
      // 0f6: aload 0
      // 0f7: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 0fa: aload 2
      // 0fb: ifnull 113
      // 0fe: ifnull 11b
      // 101: goto 108
      // 104: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 107: athrow
      // 108: aload 0
      // 109: getfield com/finalshell/network/Zc2.G Lcom/finalshell/core/Uu4;
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 112: athrow
      // 113: aload 3
      // 114: bipush 0
      // 115: invokeinterface com/finalshell/core/Uu4.o ([BZ)[B 3
      // 11a: astore 3
      // 11b: bipush 0
      // 11c: istore 4
      // 11e: new java/io/ByteArrayInputStream
      // 121: dup
      // 122: aload 3
      // 123: iload 4
      // 125: aload 1
      // 126: invokevirtual java/net/DatagramPacket.getLength ()I
      // 129: invokespecial java/io/ByteArrayInputStream.<init> ([BII)V
      // 12c: astore 5
      // 12e: new com/finalshell/core/JX
      // 131: dup
      // 132: aload 5
      // 134: invokespecial com/finalshell/core/JX.<init> (Ljava/io/InputStream;)V
      // 137: astore 6
      // 139: aload 1
      // 13a: aload 6
      // 13c: getfield com/finalshell/core/Jk2.R I
      // 13f: invokevirtual java/net/DatagramPacket.setPort (I)V
      // 142: aload 1
      // 143: aload 6
      // 145: invokevirtual com/finalshell/core/Jk2.g ()Ljava/net/InetAddress;
      // 148: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 14b: aload 5
      // 14d: invokevirtual java/io/ByteArrayInputStream.available ()I
      // 150: istore 7
      // 152: aload 3
      // 153: iload 4
      // 155: aload 1
      // 156: invokevirtual java/net/DatagramPacket.getLength ()I
      // 159: iadd
      // 15a: iload 7
      // 15c: isub
      // 15d: aload 3
      // 15e: iload 4
      // 160: iload 7
      // 162: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 165: aload 1
      // 166: iload 7
      // 168: invokevirtual java/net/DatagramPacket.setLength (I)V
      // 16b: return
   }

   @Override
   public int getLocalPort() {
      String[] var1 = ProxyMessage.Y();
      int var10000 = (this.x) ? 1 : 0;
      if (var1 != null) {
         if (this.x) {
            return super.getLocalPort();
         }

         var10000 = this.j;
      }

      return var10000;
   }

   @Override
   public InetAddress getLocalAddress() {
      String[] var1 = ProxyMessage.Y();
      Zc2 var10000 = this;
      if (var1 != null) {
         if (this.x) {
            return super.getLocalAddress();
         }

         var10000 = this;
      }

      return var10000.n;
   }

   @Override
   public void close() {
      String[] var1 = ProxyMessage.Y();
      Zc2 var10000 = this;
      if (var1 != null) {
         if (!this.x) {
            this.X.F();
         }

         var10000 = this;
      }

      var10000.close();
   }

   public boolean N(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 1d
      // 09: getfield com/finalshell/network/Zc2.x Z
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 20: aload 2
      // 21: ifnull 3d
      // 24: ifnull 5d
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 32: getfield com/finalshell/core/C3.Y Ljava/net/Socket;
      // 35: iload 1
      // 36: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 39: aload 0
      // 3a: getfield com/finalshell/network/Zc2.X Lcom/finalshell/core/C3;
      // 3d: getfield com/finalshell/core/C3.L Ljava/io/InputStream;
      // 40: invokevirtual java/io/InputStream.read ()I
      // 43: istore 3
      // 44: iload 3
      // 45: aload 2
      // 46: ifnull 56
      // 49: ifge 55
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/network/Zc2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 52: athrow
      // 53: bipush 0
      // 54: ireturn
      // 55: bipush 1
      // 56: ireturn
      // 57: astore 3
      // 58: bipush 1
      // 59: ireturn
      // 5a: astore 3
      // 5b: bipush 0
      // 5c: ireturn
      // 5d: bipush 0
      // 5e: ireturn
   }

   public byte[] l(InetAddress var1, int var2) {
      JX var3 = new JX(0, var1, var2);
      var3.Q[0] = 0;
      return var3.Q;
   }

   public byte[] n(String var1, int var2) {
      JX var3 = new JX(0, var1, var2);
      var3.Q[0] = 0;
      return var3.Q;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17997) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 201;
               break;
            case 1:
               var10000 = 0;
               break;
            case 2:
               var10000 = 116;
               break;
            case 3:
               var10000 = 134;
               break;
            case 4:
               var10000 = 221;
               break;
            case 5:
               var10000 = 94;
               break;
            case 6:
               var10000 = 228;
               break;
            case 7:
               var10000 = 107;
               break;
            case 8:
               var10000 = 78;
               break;
            case 9:
               var10000 = 200;
               break;
            case 10:
               var10000 = 161;
               break;
            case 11:
               var10000 = 81;
               break;
            case 12:
               var10000 = 1;
               break;
            case 13:
               var10000 = 252;
               break;
            case 14:
               var10000 = 159;
               break;
            case 15:
               var10000 = 243;
               break;
            case 16:
               var10000 = 50;
               break;
            case 17:
               var10000 = 100;
               break;
            case 18:
               var10000 = 157;
               break;
            case 19:
               var10000 = 120;
               break;
            case 20:
               var10000 = 129;
               break;
            case 21:
               var10000 = 54;
               break;
            case 22:
               var10000 = 111;
               break;
            case 23:
               var10000 = 18;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 255;
               break;
            case 26:
               var10000 = 176;
               break;
            case 27:
               var10000 = 169;
               break;
            case 28:
               var10000 = 197;
               break;
            case 29:
               var10000 = 98;
               break;
            case 30:
               var10000 = 2;
               break;
            case 31:
               var10000 = 75;
               break;
            case 32:
               var10000 = 210;
               break;
            case 33:
               var10000 = 242;
               break;
            case 34:
               var10000 = 193;
               break;
            case 35:
               var10000 = 149;
               break;
            case 36:
               var10000 = 148;
               break;
            case 37:
               var10000 = 96;
               break;
            case 38:
               var10000 = 248;
               break;
            case 39:
               var10000 = 141;
               break;
            case 40:
               var10000 = 113;
               break;
            case 41:
               var10000 = 12;
               break;
            case 42:
               var10000 = 204;
               break;
            case 43:
               var10000 = 167;
               break;
            case 44:
               var10000 = 11;
               break;
            case 45:
               var10000 = 77;
               break;
            case 46:
               var10000 = 175;
               break;
            case 47:
               var10000 = 110;
               break;
            case 48:
               var10000 = 246;
               break;
            case 49:
               var10000 = 166;
               break;
            case 50:
               var10000 = 61;
               break;
            case 51:
               var10000 = 13;
               break;
            case 52:
               var10000 = 88;
               break;
            case 53:
               var10000 = 108;
               break;
            case 54:
               var10000 = 112;
               break;
            case 55:
               var10000 = 118;
               break;
            case 56:
               var10000 = 95;
               break;
            case 57:
               var10000 = 66;
               break;
            case 58:
               var10000 = 199;
               break;
            case 59:
               var10000 = 63;
               break;
            case 60:
               var10000 = 32;
               break;
            case 61:
               var10000 = 254;
               break;
            case 62:
               var10000 = 33;
               break;
            case 63:
               var10000 = 186;
               break;
            case 64:
               var10000 = 224;
               break;
            case 65:
               var10000 = 60;
               break;
            case 66:
               var10000 = 230;
               break;
            case 67:
               var10000 = 47;
               break;
            case 68:
               var10000 = 138;
               break;
            case 69:
               var10000 = 62;
               break;
            case 70:
               var10000 = 158;
               break;
            case 71:
               var10000 = 15;
               break;
            case 72:
               var10000 = 65;
               break;
            case 73:
               var10000 = 124;
               break;
            case 74:
               var10000 = 93;
               break;
            case 75:
               var10000 = 250;
               break;
            case 76:
               var10000 = 152;
               break;
            case 77:
               var10000 = 103;
               break;
            case 78:
               var10000 = 211;
               break;
            case 79:
               var10000 = 135;
               break;
            case 80:
               var10000 = 20;
               break;
            case 81:
               var10000 = 6;
               break;
            case 82:
               var10000 = 189;
               break;
            case 83:
               var10000 = 140;
               break;
            case 84:
               var10000 = 87;
               break;
            case 85:
               var10000 = 208;
               break;
            case 86:
               var10000 = 24;
               break;
            case 87:
               var10000 = 229;
               break;
            case 88:
               var10000 = 155;
               break;
            case 89:
               var10000 = 139;
               break;
            case 90:
               var10000 = 212;
               break;
            case 91:
               var10000 = 239;
               break;
            case 92:
               var10000 = 85;
               break;
            case 93:
               var10000 = 217;
               break;
            case 94:
               var10000 = 79;
               break;
            case 95:
               var10000 = 51;
               break;
            case 96:
               var10000 = 244;
               break;
            case 97:
               var10000 = 90;
               break;
            case 98:
               var10000 = 45;
               break;
            case 99:
               var10000 = 171;
               break;
            case 100:
               var10000 = 136;
               break;
            case 101:
               var10000 = 36;
               break;
            case 102:
               var10000 = 126;
               break;
            case 103:
               var10000 = 67;
               break;
            case 104:
               var10000 = 232;
               break;
            case 105:
               var10000 = 174;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 19;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 130;
               break;
            case 110:
               var10000 = 115;
               break;
            case 111:
               var10000 = 99;
               break;
            case 112:
               var10000 = 42;
               break;
            case 113:
               var10000 = 240;
               break;
            case 114:
               var10000 = 25;
               break;
            case 115:
               var10000 = 80;
               break;
            case 116:
               var10000 = 7;
               break;
            case 117:
               var10000 = 64;
               break;
            case 118:
               var10000 = 170;
               break;
            case 119:
               var10000 = 59;
               break;
            case 120:
               var10000 = 137;
               break;
            case 121:
               var10000 = 122;
               break;
            case 122:
               var10000 = 46;
               break;
            case 123:
               var10000 = 191;
               break;
            case 124:
               var10000 = 151;
               break;
            case 125:
               var10000 = 234;
               break;
            case 126:
               var10000 = 238;
               break;
            case 127:
               var10000 = 39;
               break;
            case 128:
               var10000 = 26;
               break;
            case 129:
               var10000 = 183;
               break;
            case 130:
               var10000 = 68;
               break;
            case 131:
               var10000 = 147;
               break;
            case 132:
               var10000 = 128;
               break;
            case 133:
               var10000 = 133;
               break;
            case 134:
               var10000 = 251;
               break;
            case 135:
               var10000 = 146;
               break;
            case 136:
               var10000 = 22;
               break;
            case 137:
               var10000 = 105;
               break;
            case 138:
               var10000 = 182;
               break;
            case 139:
               var10000 = 83;
               break;
            case 140:
               var10000 = 4;
               break;
            case 141:
               var10000 = 162;
               break;
            case 142:
               var10000 = 172;
               break;
            case 143:
               var10000 = 55;
               break;
            case 144:
               var10000 = 28;
               break;
            case 145:
               var10000 = 104;
               break;
            case 146:
               var10000 = 233;
               break;
            case 147:
               var10000 = 144;
               break;
            case 148:
               var10000 = 123;
               break;
            case 149:
               var10000 = 125;
               break;
            case 150:
               var10000 = 49;
               break;
            case 151:
               var10000 = 70;
               break;
            case 152:
               var10000 = 198;
               break;
            case 153:
               var10000 = 180;
               break;
            case 154:
               var10000 = 57;
               break;
            case 155:
               var10000 = 117;
               break;
            case 156:
               var10000 = 164;
               break;
            case 157:
               var10000 = 71;
               break;
            case 158:
               var10000 = 143;
               break;
            case 159:
               var10000 = 21;
               break;
            case 160:
               var10000 = 237;
               break;
            case 161:
               var10000 = 48;
               break;
            case 162:
               var10000 = 101;
               break;
            case 163:
               var10000 = 14;
               break;
            case 164:
               var10000 = 40;
               break;
            case 165:
               var10000 = 222;
               break;
            case 166:
               var10000 = 226;
               break;
            case 167:
               var10000 = 16;
               break;
            case 168:
               var10000 = 219;
               break;
            case 169:
               var10000 = 9;
               break;
            case 170:
               var10000 = 43;
               break;
            case 171:
               var10000 = 220;
               break;
            case 172:
               var10000 = 58;
               break;
            case 173:
               var10000 = 109;
               break;
            case 174:
               var10000 = 249;
               break;
            case 175:
               var10000 = 82;
               break;
            case 176:
               var10000 = 194;
               break;
            case 177:
               var10000 = 235;
               break;
            case 178:
               var10000 = 192;
               break;
            case 179:
               var10000 = 153;
               break;
            case 180:
               var10000 = 38;
               break;
            case 181:
               var10000 = 41;
               break;
            case 182:
               var10000 = 89;
               break;
            case 183:
               var10000 = 69;
               break;
            case 184:
               var10000 = 247;
               break;
            case 185:
               var10000 = 132;
               break;
            case 186:
               var10000 = 150;
               break;
            case 187:
               var10000 = 187;
               break;
            case 188:
               var10000 = 156;
               break;
            case 189:
               var10000 = 214;
               break;
            case 190:
               var10000 = 114;
               break;
            case 191:
               var10000 = 29;
               break;
            case 192:
               var10000 = 196;
               break;
            case 193:
               var10000 = 188;
               break;
            case 194:
               var10000 = 253;
               break;
            case 195:
               var10000 = 207;
               break;
            case 196:
               var10000 = 236;
               break;
            case 197:
               var10000 = 227;
               break;
            case 198:
               var10000 = 213;
               break;
            case 199:
               var10000 = 223;
               break;
            case 200:
               var10000 = 231;
               break;
            case 201:
               var10000 = 173;
               break;
            case 202:
               var10000 = 142;
               break;
            case 203:
               var10000 = 121;
               break;
            case 204:
               var10000 = 8;
               break;
            case 205:
               var10000 = 160;
               break;
            case 206:
               var10000 = 30;
               break;
            case 207:
               var10000 = 165;
               break;
            case 208:
               var10000 = 102;
               break;
            case 209:
               var10000 = 154;
               break;
            case 210:
               var10000 = 17;
               break;
            case 211:
               var10000 = 145;
               break;
            case 212:
               var10000 = 181;
               break;
            case 213:
               var10000 = 31;
               break;
            case 214:
               var10000 = 52;
               break;
            case 215:
               var10000 = 34;
               break;
            case 216:
               var10000 = 202;
               break;
            case 217:
               var10000 = 241;
               break;
            case 218:
               var10000 = 106;
               break;
            case 219:
               var10000 = 216;
               break;
            case 220:
               var10000 = 131;
               break;
            case 221:
               var10000 = 35;
               break;
            case 222:
               var10000 = 190;
               break;
            case 223:
               var10000 = 86;
               break;
            case 224:
               var10000 = 203;
               break;
            case 225:
               var10000 = 209;
               break;
            case 226:
               var10000 = 119;
               break;
            case 227:
               var10000 = 5;
               break;
            case 228:
               var10000 = 92;
               break;
            case 229:
               var10000 = 195;
               break;
            case 230:
               var10000 = 76;
               break;
            case 231:
               var10000 = 84;
               break;
            case 232:
               var10000 = 44;
               break;
            case 233:
               var10000 = 245;
               break;
            case 234:
               var10000 = 56;
               break;
            case 235:
               var10000 = 91;
               break;
            case 236:
               var10000 = 74;
               break;
            case 237:
               var10000 = 23;
               break;
            case 238:
               var10000 = 225;
               break;
            case 239:
               var10000 = 177;
               break;
            case 240:
               var10000 = 3;
               break;
            case 241:
               var10000 = 53;
               break;
            case 242:
               var10000 = 10;
               break;
            case 243:
               var10000 = 72;
               break;
            case 244:
               var10000 = 218;
               break;
            case 245:
               var10000 = 37;
               break;
            case 246:
               var10000 = 215;
               break;
            case 247:
               var10000 = 73;
               break;
            case 248:
               var10000 = 206;
               break;
            case 249:
               var10000 = 185;
               break;
            case 250:
               var10000 = 163;
               break;
            case 251:
               var10000 = 27;
               break;
            case 252:
               var10000 = 127;
               break;
            case 253:
               var10000 = 97;
               break;
            case 254:
               var10000 = 184;
               break;
            default:
               var10000 = 205;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32734;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "ªËRºÂB\u008e\"ï\u009a¼¥R>sÀè@é>Á\u008a|\u000eßÙÚ±b'\u008b\u0001³T:\u0005\u0090s¬I\u008b\u0019";
      int var12 = "ªËRºÂB\u008e\"ï\u009a¼¥R>sÀè@é>Á\u008a|\u000eßÙÚ±b'\u008b\u0001³T:\u0005\u0090s¬I\u008b\u0019".length();
      char var9 = 7;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 79;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 63;
                        break;
                     case 1:
                        var58 = 93;
                        break;
                     case 2:
                        var58 = 64;
                        break;
                     case 3:
                        var58 = 11;
                        break;
                     case 4:
                        var58 = 32;
                        break;
                     case 5:
                        var58 = 23;
                        break;
                     default:
                        var58 = 114;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[4];
                     long var0 = 5323377591958196520L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ø\u001a(qù\u0097\u0002Ã\u0005\u0094kàÖ\u0096\r/";
                     int var5 = "ø\u001a(qù\u0097\u0002Ã\u0005\u0094kàÖ\u0096\r/".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "9§|<~\u008a\u0017\u0099ØC´^M\u0093BÌ?<M\u0018!R>ÿ\u0016×\u000b\u009fØå2â\u007f\u001c÷¸?/yrt\u0086\u007fÝ7sÜ\u001e4õ]æ@11»\u0001\u008dþc_-\u0086\u0098\u008f\u008ay\n:¹¡S\u0017·NB\u0018h_3Q\u001c\u0004Da";
                  var12 = "9§|<~\u008a\u0017\u0099ØC´^M\u0093BÌ?<M\u0018!R>ÿ\u0016×\u000b\u009fØå2â\u007f\u001c÷¸?/yrt\u0086\u007fÝ7sÜ\u001e4õ]æ@11»\u0001\u008dþc_-\u0086\u0098\u008f\u008ay\n:¹¡S\u0017·NB\u0018h_3Q\u001c\u0004Da"
                     .length();
                  var9 = '%';
                  var16 = -1;
            }

            var10000 = 105;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





