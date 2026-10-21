package com.finalshell.task;

public class KX implements Runnable {
   public final com.finalshell.core.PacketLossStats e;
   public final int u;

   public KX(com.finalshell.core.PacketLossStats var1, int var2) {
      this.e = var1;
      this.u = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 1
      // 07: ifnonnull b0
      // 0a: getstatic com/finalshell/core/PacketLoss.U Ljava/util/Random;
      // 0d: invokevirtual java/util/Random.nextInt ()I
      // 10: invokestatic java/lang/Math.abs (I)I
      // 13: istore 3
      // 14: new com/finalshell/core/WX
      // 17: dup
      // 18: iload 3
      // 19: invokespecial com/finalshell/core/WX.<init> (I)V
      // 1c: astore 4
      // 1e: aload 4
      // 20: invokevirtual com/finalshell/core/WX.H ()Ljava/net/DatagramPacket;
      // 23: astore 5
      // 25: aload 5
      // 27: aload 0
      // 28: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 2b: getfield com/finalshell/core/PacketLoss.L Ljava/net/InetAddress;
      // 2e: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 31: aload 5
      // 33: aload 0
      // 34: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 37: getfield com/finalshell/core/PacketLoss.b I
      // 3a: invokevirtual java/net/DatagramPacket.setPort (I)V
      // 3d: bipush 0
      // 3e: istore 6
      // 40: aload 1
      // 41: ifnonnull 53
      // 44: aload 0
      // 45: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 48: getfield com/finalshell/core/PacketLoss.k Ljava/net/DatagramSocket;
      // 4b: aload 5
      // 4d: invokevirtual java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 50: iinc 6 1
      // 53: iload 6
      // 55: aload 0
      // 56: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 59: getfield com/finalshell/core/PacketLoss.R I
      // 5c: if_icmplt 44
      // 5f: aload 1
      // 60: ifnull 50
      // 63: goto 70
      // 66: astore 6
      // 68: aload 6
      // 6a: invokevirtual java/io/IOException.printStackTrace ()V
      // 6d: goto b8
      // 70: new com/finalshell/core/Lc4_2
      // 73: dup
      // 74: invokespecial com/finalshell/core/Lc4_2.<init> ()V
      // 77: astore 6
      // 79: aload 6
      // 7b: iload 3
      // 7c: putfield com/finalshell/core/Lc4_2.q I
      // 7f: aload 6
      // 81: invokestatic java/lang/System.currentTimeMillis ()J
      // 84: putfield com/finalshell/core/Lc4_2.T J
      // 87: aload 0
      // 88: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 8b: getfield com/finalshell/core/PacketLoss.C Ljava/util/HashMap;
      // 8e: iload 3
      // 8f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 92: aload 6
      // 94: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 97: pop
      // 98: aload 0
      // 99: getfield com/finalshell/task/KX.e Lcom/finalshell/core/PacketLoss;
      // 9c: getfield com/finalshell/core/PacketLoss.t I
      // 9f: i2l
      // a0: invokestatic java/lang/Thread.sleep (J)V
      // a3: goto ad
      // a6: astore 7
      // a8: aload 7
      // aa: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // ad: iinc 2 1
      // b0: iload 2
      // b1: aload 0
      // b2: getfield com/finalshell/task/KX.u I
      // b5: if_icmplt 0a
      // b8: return
   }
}





