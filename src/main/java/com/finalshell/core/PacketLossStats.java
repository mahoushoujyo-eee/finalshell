package com.finalshell.core;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Random;

public class PacketLossStats {
   public int l = a(12904, 1325376257774792025L);
   public String a;
   public InetAddress L;
   public int b;
   public DatagramSocket k;
   public static Random U;
   public int t = 0;
   public int R = 1;
   public HashMap C = new HashMap();
   public static String[] c;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   static {
      __vfClinit__();
   }

   public static void main(String[] var0) {
      PacketLossStats var1 = new PacketLossStats(a(6485, -5718), a(13866, 2399233809382811934L));
      byte var2 = 1;
      int var3 = a(4768, 7537065388340219283L);
      int var4 = a(26151, 4882483235990698257L);
      B22 var5 = var1.e(a(6486, -23236), a(31935, 1050548075150173071L), var4, var3, var2);
      Jy2.g(a(6487, 28755) + var5.t + a(6484, 26379) + (1.0F - var5.g) * 100.0F + "%");
      System.exit(0);
   }

   public PacketLossStats(String var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public B22 e(String param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: new com/finalshell/core/B22
      // 006: dup
      // 007: invokespecial com/finalshell/core/B22.<init> ()V
      // 00a: astore 7
      // 00c: astore 6
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield com/finalshell/core/PacketLoss.a Ljava/lang/String;
      // 013: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 016: putfield com/finalshell/core/PacketLoss.L Ljava/net/InetAddress;
      // 019: aload 0
      // 01a: new java/net/DatagramSocket
      // 01d: dup
      // 01e: invokespecial java/net/DatagramSocket.<init> ()V
      // 021: putfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 024: iload 3
      // 025: sipush 15070
      // 028: ldc2_w 6055578192322471404
      // 02b: invokestatic com/finalshell/core/PacketLoss.a (IJ)I
      // 02e: iadd
      // 02f: istore 8
      // 031: aload 0
      // 032: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 035: iload 8
      // 037: invokevirtual java/net/DatagramSocket.setSoTimeout (I)V
      // 03a: getstatic com/finalshell/core/PacketLoss.U Ljava/util/Random;
      // 03d: invokevirtual java/util/Random.nextInt ()I
      // 040: invokestatic java/lang/Math.abs (I)I
      // 043: istore 9
      // 045: new com/finalshell/core/WR
      // 048: dup
      // 049: iload 9
      // 04b: aload 1
      // 04c: iload 2
      // 04d: iload 3
      // 04e: iload 4
      // 050: iload 5
      // 052: invokespecial com/finalshell/core/WR.<init> (ILjava/lang/String;IIII)V
      // 055: astore 10
      // 057: aload 10
      // 059: invokevirtual com/finalshell/core/WR.H ()Ljava/net/DatagramPacket;
      // 05c: astore 11
      // 05e: aload 11
      // 060: aload 0
      // 061: getfield com/finalshell/core/PacketLoss.L Ljava/net/InetAddress;
      // 064: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 067: aload 11
      // 069: aload 0
      // 06a: getfield com/finalshell/core/PacketLoss.b I
      // 06d: invokevirtual java/net/DatagramPacket.setPort (I)V
      // 070: aload 0
      // 071: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 074: aload 11
      // 076: invokevirtual java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 079: aload 0
      // 07a: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 07d: aload 11
      // 07f: invokevirtual java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 082: aload 0
      // 083: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 086: aload 11
      // 088: invokevirtual java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 08b: goto 095
      // 08e: astore 12
      // 090: aload 12
      // 092: invokevirtual java/io/IOException.printStackTrace ()V
      // 095: sipush 18391
      // 098: ldc2_w 4337513126538991840
      // 09b: invokestatic com/finalshell/core/PacketLoss.a (IJ)I
      // 09e: newarray 8
      // 0a0: astore 12
      // 0a2: new java/net/DatagramPacket
      // 0a5: dup
      // 0a6: aload 12
      // 0a8: aload 12
      // 0aa: arraylength
      // 0ab: invokespecial java/net/DatagramPacket.<init> ([BI)V
      // 0ae: astore 13
      // 0b0: aload 0
      // 0b1: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 0b4: aload 13
      // 0b6: invokevirtual java/net/DatagramSocket.receive (Ljava/net/DatagramPacket;)V
      // 0b9: aload 13
      // 0bb: invokevirtual java/net/DatagramPacket.getData ()[B
      // 0be: astore 14
      // 0c0: aload 14
      // 0c2: bipush 0
      // 0c3: invokestatic com/finalshell/core/LH3_2.z ([BI)I
      // 0c6: istore 15
      // 0c8: iload 15
      // 0ca: getstatic com/finalshell/core/D6.n0 S
      // 0cd: if_icmpne 164
      // 0d0: new com/finalshell/core/WH
      // 0d3: dup
      // 0d4: aload 13
      // 0d6: invokespecial com/finalshell/core/WH.<init> (Ljava/net/DatagramPacket;)V
      // 0d9: astore 16
      // 0db: aload 7
      // 0dd: aload 16
      // 0df: invokevirtual com/finalshell/core/WH.J ()I
      // 0e2: putfield com/finalshell/core/B22.t I
      // 0e5: aload 7
      // 0e7: aload 16
      // 0e9: invokevirtual com/finalshell/core/WH.B ()F
      // 0ec: putfield com/finalshell/core/B22.g F
      // 0ef: goto 164
      // 0f2: astore 8
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 0f8: aload 6
      // 0fa: ifnull 112
      // 0fd: ifnull 185
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 106: athrow
      // 107: aload 0
      // 108: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 111: athrow
      // 112: invokevirtual java/net/DatagramSocket.close ()V
      // 115: goto 185
      // 118: astore 8
      // 11a: aload 0
      // 11b: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 11e: aload 6
      // 120: ifnull 138
      // 123: ifnull 185
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 137: athrow
      // 138: invokevirtual java/net/DatagramSocket.close ()V
      // 13b: goto 185
      // 13e: astore 17
      // 140: aload 0
      // 141: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 144: aload 6
      // 146: ifnull 15e
      // 149: ifnull 161
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 152: athrow
      // 153: aload 0
      // 154: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15d: athrow
      // 15e: invokevirtual java/net/DatagramSocket.close ()V
      // 161: aload 17
      // 163: athrow
      // 164: aload 0
      // 165: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 168: aload 6
      // 16a: ifnull 182
      // 16d: ifnull 185
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 176: athrow
      // 177: aload 0
      // 178: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 181: athrow
      // 182: invokevirtual java/net/DatagramSocket.close ()V
      // 185: aload 7
      // 187: areturn
   }

   public B22 W(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 3
      // 002: putfield com/finalshell/core/PacketLoss.R I
      // 005: aload 0
      // 006: iload 1
      // 007: i2f
      // 008: iload 2
      // 009: i2f
      // 00a: fdiv
      // 00b: f2i
      // 00c: putfield com/finalshell/core/PacketLoss.t I
      // 00f: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 012: new com/finalshell/core/B22
      // 015: dup
      // 016: invokespecial com/finalshell/core/B22.<init> ()V
      // 019: astore 5
      // 01b: astore 4
      // 01d: aload 0
      // 01e: aload 0
      // 01f: getfield com/finalshell/core/PacketLoss.a Ljava/lang/String;
      // 022: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 025: putfield com/finalshell/core/PacketLoss.L Ljava/net/InetAddress;
      // 028: aload 0
      // 029: new java/net/DatagramSocket
      // 02c: dup
      // 02d: invokespecial java/net/DatagramSocket.<init> ()V
      // 030: putfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 033: aload 0
      // 034: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 037: sipush 29464
      // 03a: ldc2_w 5661313871450729507
      // 03d: invokestatic com/finalshell/core/PacketLoss.a (IJ)I
      // 040: invokevirtual java/net/DatagramSocket.setSoTimeout (I)V
      // 043: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 046: new com/finalshell/task/Yz4
      // 049: dup
      // 04a: aload 0
      // 04b: invokespecial com/finalshell/task/Yz4.<init> (Lcom/finalshell/core/PacketLoss;)V
      // 04e: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 051: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 054: new com/finalshell/task/KX
      // 057: dup
      // 058: aload 0
      // 059: iload 2
      // 05a: invokespecial com/finalshell/task/KX.<init> (Lcom/finalshell/core/PacketLoss;I)V
      // 05d: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 060: goto 074
      // 063: astore 6
      // 065: aload 6
      // 067: invokevirtual java/net/SocketException.printStackTrace ()V
      // 06a: goto 074
      // 06d: astore 6
      // 06f: aload 6
      // 071: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 074: iload 1
      // 075: sipush 12904
      // 078: ldc2_w 1325376257774792025
      // 07b: invokestatic com/finalshell/core/PacketLoss.a (IJ)I
      // 07e: iadd
      // 07f: i2l
      // 080: invokestatic java/lang/Thread.sleep (J)V
      // 083: goto 08d
      // 086: astore 6
      // 088: aload 6
      // 08a: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 08d: aload 0
      // 08e: aload 4
      // 090: ifnull 0af
      // 093: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 096: ifnull 0ae
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 0a4: invokevirtual java/net/DatagramSocket.close ()V
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield com/finalshell/core/PacketLoss.C Ljava/util/HashMap;
      // 0b2: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // 0b5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ba: astore 6
      // 0bc: sipush 11208
      // 0bf: bipush 0
      // 0c0: istore 7
      // 0c2: ldc2_w 5485557679211066621
      // 0c5: invokestatic com/finalshell/core/PacketLoss.a (IJ)I
      // 0c8: istore 8
      // 0ca: bipush 0
      // 0cb: istore 9
      // 0cd: aload 4
      // 0cf: ifnonnull 130
      // 0d2: aload 6
      // 0d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d9: checkcast java/lang/Integer
      // 0dc: invokevirtual java/lang/Integer.intValue ()I
      // 0df: istore 10
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/PacketLoss.C Ljava/util/HashMap;
      // 0e5: iload 10
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ed: checkcast com/finalshell/core/Lc4_2
      // 0f0: astore 11
      // 0f2: aload 11
      // 0f4: getfield com/finalshell/core/Lc4_2.B Z
      // 0f7: aload 4
      // 0f9: ifnull 137
      // 0fc: ifeq 130
      // 0ff: iinc 7 1
      // 102: aload 11
      // 104: getfield com/finalshell/core/Lc4_2.o I
      // 107: iload 8
      // 109: aload 4
      // 10b: ifnull 12d
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 114: athrow
      // 115: if_icmpge 126
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/PacketLoss.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 11e: athrow
      // 11f: aload 11
      // 121: getfield com/finalshell/core/Lc4_2.o I
      // 124: istore 8
      // 126: iload 9
      // 128: aload 11
      // 12a: getfield com/finalshell/core/Lc4_2.o I
      // 12d: iadd
      // 12e: istore 9
      // 130: aload 6
      // 132: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 137: ifne 0d2
      // 13a: iload 9
      // 13c: i2f
      // 13d: iload 7
      // 13f: i2f
      // 140: fdiv
      // 141: f2i
      // 142: istore 10
      // 144: aload 0
      // 145: iload 10
      // 147: putfield com/finalshell/core/PacketLoss.l I
      // 14a: aload 0
      // 14b: getfield com/finalshell/core/PacketLoss.C Ljava/util/HashMap;
      // 14e: invokevirtual java/util/HashMap.size ()I
      // 151: i2f
      // 152: iload 7
      // 154: i2f
      // 155: fsub
      // 156: aload 0
      // 157: getfield com/finalshell/core/PacketLoss.C Ljava/util/HashMap;
      // 15a: invokevirtual java/util/HashMap.size ()I
      // 15d: i2f
      // 15e: fdiv
      // 15f: fstore 11
      // 161: aload 5
      // 163: aload 0
      // 164: getfield com/finalshell/core/PacketLoss.l I
      // 167: putfield com/finalshell/core/B22.t I
      // 16a: aload 5
      // 16c: fconst_1
      // 16d: fload 11
      // 16f: fsub
      // 170: putfield com/finalshell/core/B22.g F
      // 173: aload 5
      // 175: aload 4
      // 177: ifnull 0ed
      // 17a: areturn
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 6487) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 70;
               break;
            case 1:
               var10000 = 252;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 68;
               break;
            case 4:
               var10000 = 134;
               break;
            case 5:
               var10000 = 56;
               break;
            case 6:
               var10000 = 105;
               break;
            case 7:
               var10000 = 243;
               break;
            case 8:
               var10000 = 251;
               break;
            case 9:
               var10000 = 170;
               break;
            case 10:
               var10000 = 106;
               break;
            case 11:
               var10000 = 228;
               break;
            case 12:
               var10000 = 244;
               break;
            case 13:
               var10000 = 86;
               break;
            case 14:
               var10000 = 107;
               break;
            case 15:
               var10000 = 174;
               break;
            case 16:
               var10000 = 78;
               break;
            case 17:
               var10000 = 67;
               break;
            case 18:
               var10000 = 249;
               break;
            case 19:
               var10000 = 172;
               break;
            case 20:
               var10000 = 39;
               break;
            case 21:
               var10000 = 175;
               break;
            case 22:
               var10000 = 237;
               break;
            case 23:
               var10000 = 47;
               break;
            case 24:
               var10000 = 30;
               break;
            case 25:
               var10000 = 216;
               break;
            case 26:
               var10000 = 91;
               break;
            case 27:
               var10000 = 128;
               break;
            case 28:
               var10000 = 135;
               break;
            case 29:
               var10000 = 179;
               break;
            case 30:
               var10000 = 63;
               break;
            case 31:
               var10000 = 110;
               break;
            case 32:
               var10000 = 155;
               break;
            case 33:
               var10000 = 16;
               break;
            case 34:
               var10000 = 215;
               break;
            case 35:
               var10000 = 148;
               break;
            case 36:
               var10000 = 129;
               break;
            case 37:
               var10000 = 229;
               break;
            case 38:
               var10000 = 13;
               break;
            case 39:
               var10000 = 171;
               break;
            case 40:
               var10000 = 81;
               break;
            case 41:
               var10000 = 127;
               break;
            case 42:
               var10000 = 19;
               break;
            case 43:
               var10000 = 210;
               break;
            case 44:
               var10000 = 126;
               break;
            case 45:
               var10000 = 138;
               break;
            case 46:
               var10000 = 108;
               break;
            case 47:
               var10000 = 254;
               break;
            case 48:
               var10000 = 218;
               break;
            case 49:
               var10000 = 241;
               break;
            case 50:
               var10000 = 60;
               break;
            case 51:
               var10000 = 190;
               break;
            case 52:
               var10000 = 136;
               break;
            case 53:
               var10000 = 51;
               break;
            case 54:
               var10000 = 220;
               break;
            case 55:
               var10000 = 232;
               break;
            case 56:
               var10000 = 24;
               break;
            case 57:
               var10000 = 189;
               break;
            case 58:
               var10000 = 3;
               break;
            case 59:
               var10000 = 5;
               break;
            case 60:
               var10000 = 217;
               break;
            case 61:
               var10000 = 111;
               break;
            case 62:
               var10000 = 119;
               break;
            case 63:
               var10000 = 131;
               break;
            case 64:
               var10000 = 99;
               break;
            case 65:
               var10000 = 158;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 96;
               break;
            case 68:
               var10000 = 145;
               break;
            case 69:
               var10000 = 196;
               break;
            case 70:
               var10000 = 26;
               break;
            case 71:
               var10000 = 235;
               break;
            case 72:
               var10000 = 144;
               break;
            case 73:
               var10000 = 194;
               break;
            case 74:
               var10000 = 168;
               break;
            case 75:
               var10000 = 37;
               break;
            case 76:
               var10000 = 246;
               break;
            case 77:
               var10000 = 45;
               break;
            case 78:
               var10000 = 8;
               break;
            case 79:
               var10000 = 203;
               break;
            case 80:
               var10000 = 89;
               break;
            case 81:
               var10000 = 71;
               break;
            case 82:
               var10000 = 2;
               break;
            case 83:
               var10000 = 195;
               break;
            case 84:
               var10000 = 93;
               break;
            case 85:
               var10000 = 32;
               break;
            case 86:
               var10000 = 165;
               break;
            case 87:
               var10000 = 255;
               break;
            case 88:
               var10000 = 236;
               break;
            case 89:
               var10000 = 206;
               break;
            case 90:
               var10000 = 20;
               break;
            case 91:
               var10000 = 157;
               break;
            case 92:
               var10000 = 188;
               break;
            case 93:
               var10000 = 180;
               break;
            case 94:
               var10000 = 233;
               break;
            case 95:
               var10000 = 125;
               break;
            case 96:
               var10000 = 177;
               break;
            case 97:
               var10000 = 137;
               break;
            case 98:
               var10000 = 214;
               break;
            case 99:
               var10000 = 57;
               break;
            case 100:
               var10000 = 173;
               break;
            case 101:
               var10000 = 87;
               break;
            case 102:
               var10000 = 163;
               break;
            case 103:
               var10000 = 18;
               break;
            case 104:
               var10000 = 185;
               break;
            case 105:
               var10000 = 178;
               break;
            case 106:
               var10000 = 159;
               break;
            case 107:
               var10000 = 153;
               break;
            case 108:
               var10000 = 250;
               break;
            case 109:
               var10000 = 94;
               break;
            case 110:
               var10000 = 69;
               break;
            case 111:
               var10000 = 90;
               break;
            case 112:
               var10000 = 154;
               break;
            case 113:
               var10000 = 98;
               break;
            case 114:
               var10000 = 36;
               break;
            case 115:
               var10000 = 184;
               break;
            case 116:
               var10000 = 161;
               break;
            case 117:
               var10000 = 46;
               break;
            case 118:
               var10000 = 103;
               break;
            case 119:
               var10000 = 23;
               break;
            case 120:
               var10000 = 84;
               break;
            case 121:
               var10000 = 160;
               break;
            case 122:
               var10000 = 92;
               break;
            case 123:
               var10000 = 44;
               break;
            case 124:
               var10000 = 49;
               break;
            case 125:
               var10000 = 100;
               break;
            case 126:
               var10000 = 116;
               break;
            case 127:
               var10000 = 101;
               break;
            case 128:
               var10000 = 41;
               break;
            case 129:
               var10000 = 21;
               break;
            case 130:
               var10000 = 219;
               break;
            case 131:
               var10000 = 133;
               break;
            case 132:
               var10000 = 191;
               break;
            case 133:
               var10000 = 122;
               break;
            case 134:
               var10000 = 226;
               break;
            case 135:
               var10000 = 247;
               break;
            case 136:
               var10000 = 202;
               break;
            case 137:
               var10000 = 140;
               break;
            case 138:
               var10000 = 17;
               break;
            case 139:
               var10000 = 240;
               break;
            case 140:
               var10000 = 248;
               break;
            case 141:
               var10000 = 53;
               break;
            case 142:
               var10000 = 117;
               break;
            case 143:
               var10000 = 22;
               break;
            case 144:
               var10000 = 132;
               break;
            case 145:
               var10000 = 211;
               break;
            case 146:
               var10000 = 40;
               break;
            case 147:
               var10000 = 231;
               break;
            case 148:
               var10000 = 197;
               break;
            case 149:
               var10000 = 35;
               break;
            case 150:
               var10000 = 54;
               break;
            case 151:
               var10000 = 10;
               break;
            case 152:
               var10000 = 198;
               break;
            case 153:
               var10000 = 181;
               break;
            case 154:
               var10000 = 183;
               break;
            case 155:
               var10000 = 152;
               break;
            case 156:
               var10000 = 77;
               break;
            case 157:
               var10000 = 59;
               break;
            case 158:
               var10000 = 104;
               break;
            case 159:
               var10000 = 52;
               break;
            case 160:
               var10000 = 156;
               break;
            case 161:
               var10000 = 61;
               break;
            case 162:
               var10000 = 162;
               break;
            case 163:
               var10000 = 73;
               break;
            case 164:
               var10000 = 118;
               break;
            case 165:
               var10000 = 95;
               break;
            case 166:
               var10000 = 245;
               break;
            case 167:
               var10000 = 75;
               break;
            case 168:
               var10000 = 208;
               break;
            case 169:
               var10000 = 43;
               break;
            case 170:
               var10000 = 80;
               break;
            case 171:
               var10000 = 192;
               break;
            case 172:
               var10000 = 176;
               break;
            case 173:
               var10000 = 124;
               break;
            case 174:
               var10000 = 230;
               break;
            case 175:
               var10000 = 213;
               break;
            case 176:
               var10000 = 253;
               break;
            case 177:
               var10000 = 85;
               break;
            case 178:
               var10000 = 83;
               break;
            case 179:
               var10000 = 234;
               break;
            case 180:
               var10000 = 142;
               break;
            case 181:
               var10000 = 204;
               break;
            case 182:
               var10000 = 141;
               break;
            case 183:
               var10000 = 6;
               break;
            case 184:
               var10000 = 120;
               break;
            case 185:
               var10000 = 66;
               break;
            case 186:
               var10000 = 239;
               break;
            case 187:
               var10000 = 33;
               break;
            case 188:
               var10000 = 50;
               break;
            case 189:
               var10000 = 130;
               break;
            case 190:
               var10000 = 164;
               break;
            case 191:
               var10000 = 88;
               break;
            case 192:
               var10000 = 65;
               break;
            case 193:
               var10000 = 167;
               break;
            case 194:
               var10000 = 112;
               break;
            case 195:
               var10000 = 150;
               break;
            case 196:
               var10000 = 109;
               break;
            case 197:
               var10000 = 115;
               break;
            case 198:
               var10000 = 58;
               break;
            case 199:
               var10000 = 209;
               break;
            case 200:
               var10000 = 64;
               break;
            case 201:
               var10000 = 114;
               break;
            case 202:
               var10000 = 151;
               break;
            case 203:
               var10000 = 166;
               break;
            case 204:
               var10000 = 72;
               break;
            case 205:
               var10000 = 227;
               break;
            case 206:
               var10000 = 28;
               break;
            case 207:
               var10000 = 205;
               break;
            case 208:
               var10000 = 29;
               break;
            case 209:
               var10000 = 199;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 221;
               break;
            case 212:
               var10000 = 31;
               break;
            case 213:
               var10000 = 149;
               break;
            case 214:
               var10000 = 225;
               break;
            case 215:
               var10000 = 42;
               break;
            case 216:
               var10000 = 7;
               break;
            case 217:
               var10000 = 187;
               break;
            case 218:
               var10000 = 76;
               break;
            case 219:
               var10000 = 186;
               break;
            case 220:
               var10000 = 146;
               break;
            case 221:
               var10000 = 147;
               break;
            case 222:
               var10000 = 169;
               break;
            case 223:
               var10000 = 14;
               break;
            case 224:
               var10000 = 102;
               break;
            case 225:
               var10000 = 74;
               break;
            case 226:
               var10000 = 121;
               break;
            case 227:
               var10000 = 242;
               break;
            case 228:
               var10000 = 223;
               break;
            case 229:
               var10000 = 4;
               break;
            case 230:
               var10000 = 48;
               break;
            case 231:
               var10000 = 62;
               break;
            case 232:
               var10000 = 38;
               break;
            case 233:
               var10000 = 212;
               break;
            case 234:
               var10000 = 97;
               break;
            case 235:
               var10000 = 193;
               break;
            case 236:
               var10000 = 201;
               break;
            case 237:
               var10000 = 113;
               break;
            case 238:
               var10000 = 143;
               break;
            case 239:
               var10000 = 79;
               break;
            case 240:
               var10000 = 222;
               break;
            case 241:
               var10000 = 82;
               break;
            case 242:
               var10000 = 1;
               break;
            case 243:
               var10000 = 9;
               break;
            case 244:
               var10000 = 55;
               break;
            case 245:
               var10000 = 11;
               break;
            case 246:
               var10000 = 207;
               break;
            case 247:
               var10000 = 34;
               break;
            case 248:
               var10000 = 123;
               break;
            case 249:
               var10000 = 139;
               break;
            case 250:
               var10000 = 200;
               break;
            case 251:
               var10000 = 12;
               break;
            case 252:
               var10000 = 25;
               break;
            case 253:
               var10000 = 224;
               break;
            case 254:
               var10000 = 0;
               break;
            default:
               var10000 = 182;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7987;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "幕载ð\u000e\u009b?\u0005²f\u008f6K?\u001e\u0017\"<o";
      int var12 = "幕载ð\u000e\u009b?\u0005²f\u008f6K?\u001e\u0017\"<o".length();
      char var9 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 112;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 1;
                        break;
                     case 1:
                        var65 = 61;
                        break;
                     case 2:
                        var65 = 12;
                        break;
                     case 3:
                        var65 = 82;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 50;
                        break;
                     default:
                        var65 = 19;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     c = var13;
                     d = new String[4];
                     long var0 = 4849719462914729173L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "±NÈÖ·½ª®î\u000b \u0087!¯\u0006éº%\u0004¸93\u008ad/TN2\u0091\u009fG\u0002<Ú³\u0096\f§ø5Y92\u0080`RÖ|EåÍüW\u001e78";
                     int var5 = "±NÈÖ·½ª®î\u000b \u0087!¯\u0006éº%\u0004¸93\u008ad/TN2\u0091\u009fG\u0002<Ú³\u0096\f§ø5Y92\u0080`RÖ|EåÍüW\u001e78".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[9];
                                    U = new Random();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Æ+8@\n\n\rI\u008dô°ý\u008a\u009bO&";
                                 var5 = "Æ+8@\n\n\rI\u008dô°ý\u008a\u009bO&".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "?@dEû\u008eÆ\u008bæ\u0003\u008a¤\t×¦\u0004Å丧匴Ö";
                  var12 = "?@dEû\u008eÆ\u008bæ\u0003\u008a¤\t×¦\u0004Å丧匴Ö".length();
                  var9 = 15;
                  var17 = -1;
            }

            var10000 = 37;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





