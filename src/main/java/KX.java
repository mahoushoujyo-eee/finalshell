class KX implements Runnable {
   final o9_2 e;
   private final int u;

   KX(o9_2 var1, int var2) {
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
      // 00: invokestatic QI.N ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 1
      // 07: ifnonnull b0
      // 0a: getstatic o9_2.U Ljava/util/Random;
      // 0d: invokevirtual java/util/Random.nextInt ()I
      // 10: invokestatic java/lang/Math.abs (I)I
      // 13: istore 3
      // 14: new WX
      // 17: dup
      // 18: iload 3
      // 19: invokespecial WX.<init> (I)V
      // 1c: astore 4
      // 1e: aload 4
      // 20: invokevirtual WX.H ()Ljava/net/DatagramPacket;
      // 23: astore 5
      // 25: aload 5
      // 27: aload 0
      // 28: getfield KX.e Lo9_2;
      // 2b: getfield o9_2.L Ljava/net/InetAddress;
      // 2e: invokevirtual java/net/DatagramPacket.setAddress (Ljava/net/InetAddress;)V
      // 31: aload 5
      // 33: aload 0
      // 34: getfield KX.e Lo9_2;
      // 37: getfield o9_2.b I
      // 3a: invokevirtual java/net/DatagramPacket.setPort (I)V
      // 3d: bipush 0
      // 3e: istore 6
      // 40: aload 1
      // 41: ifnonnull 53
      // 44: aload 0
      // 45: getfield KX.e Lo9_2;
      // 48: getfield o9_2.k Ljava/net/DatagramSocket;
      // 4b: aload 5
      // 4d: invokevirtual java/net/DatagramSocket.send (Ljava/net/DatagramPacket;)V
      // 50: iinc 6 1
      // 53: iload 6
      // 55: aload 0
      // 56: getfield KX.e Lo9_2;
      // 59: getfield o9_2.R I
      // 5c: if_icmplt 44
      // 5f: aload 1
      // 60: ifnull 50
      // 63: goto 70
      // 66: astore 6
      // 68: aload 6
      // 6a: invokevirtual java/io/IOException.printStackTrace ()V
      // 6d: goto b8
      // 70: new lc_4
      // 73: dup
      // 74: invokespecial lc_4.<init> ()V
      // 77: astore 6
      // 79: aload 6
      // 7b: iload 3
      // 7c: putfield lc_4.q I
      // 7f: aload 6
      // 81: invokestatic java/lang/System.currentTimeMillis ()J
      // 84: putfield lc_4.T J
      // 87: aload 0
      // 88: getfield KX.e Lo9_2;
      // 8b: getfield o9_2.C Ljava/util/HashMap;
      // 8e: iload 3
      // 8f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 92: aload 6
      // 94: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 97: pop
      // 98: aload 0
      // 99: getfield KX.e Lo9_2;
      // 9c: getfield o9_2.t I
      // 9f: i2l
      // a0: invokestatic java/lang/Thread.sleep (J)V
      // a3: goto ad
      // a6: astore 7
      // a8: aload 7
      // aa: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // ad: iinc 2 1
      // b0: iload 2
      // b1: aload 0
      // b2: getfield KX.u I
      // b5: if_icmplt 0a
      // b8: return
   }
}





