package com.finalshell.task;

import com.finalshell.core.LA3;

public class Ko2 extends Thread {
   final LA3 c;
   public static long a;

   Ko2(LA3 var1) {
      this.c = var1;
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
      // 000: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aconst_null
      // 005: astore 2
      // 006: aload 0
      // 007: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 00a: getfield com/finalshell/core/LA3.Q Ljava/util/concurrent/LinkedBlockingQueue;
      // 00d: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 010: checkcast java/net/DatagramPacket
      // 013: astore 2
      // 014: goto 01c
      // 017: astore 3
      // 018: aload 3
      // 019: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 01c: aload 2
      // 01d: ifnonnull 02b
      // 020: aload 1
      // 021: ifnonnull 004
      // 024: goto 02b
      // 027: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 02a: athrow
      // 02b: invokestatic java/lang/System.currentTimeMillis ()J
      // 02e: lstore 3
      // 02f: aload 2
      // 030: invokevirtual java/net/DatagramPacket.getData ()[B
      // 033: astore 5
      // 035: bipush 0
      // 036: istore 6
      // 038: aload 2
      // 039: invokevirtual java/net/DatagramPacket.getData ()[B
      // 03c: arraylength
      // 03d: aload 1
      // 03e: ifnull 055
      // 041: bipush 4
      // 042: if_icmpge 051
      // 045: goto 04c
      // 048: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04b: athrow
      // 04c: return
      // 04d: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 050: athrow
      // 051: aload 2
      // 052: invokestatic com/finalshell/core/Ym4_2.y (Ljava/net/DatagramPacket;)I
      // 055: aload 1
      // 056: ifnull 065
      // 059: istore 6
      // 05b: aload 2
      // 05c: ifnull 004
      // 05f: aload 5
      // 061: bipush 4
      // 062: invokestatic com/finalshell/core/CN3.m ([BI)I
      // 065: istore 7
      // 067: aload 5
      // 069: getstatic com/finalshell/task/Ko2.a J
      // 06c: l2i
      // 06d: invokestatic com/finalshell/core/CN3.m ([BI)I
      // 070: istore 8
      // 072: aload 0
      // 073: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 076: getfield com/finalshell/core/LA3.W Ljava/util/HashSet;
      // 079: iload 7
      // 07b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 081: aload 1
      // 082: ifnull 0b3
      // 085: ifeq 0b1
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 08e: athrow
      // 08f: iload 7
      // 091: aload 1
      // 092: ifnull 0b3
      // 095: goto 09c
      // 098: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09b: athrow
      // 09c: ifeq 0b1
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: ifnonnull 004
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b0: athrow
      // 0b1: iload 6
      // 0b3: getstatic com/finalshell/core/BN.y S
      // 0b6: aload 1
      // 0b7: ifnull 0d0
      // 0ba: if_icmpeq 0de
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c3: athrow
      // 0c4: iload 6
      // 0c6: getstatic com/finalshell/core/BN.I S
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0cf: athrow
      // 0d0: aload 1
      // 0d1: ifnull 15f
      // 0d4: if_icmpne 157
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0dd: athrow
      // 0de: aconst_null
      // 0df: astore 9
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 0e5: getfield com/finalshell/core/LA3.i I
      // 0e8: bipush 2
      // 0e9: aload 1
      // 0ea: ifnull 118
      // 0ed: if_icmpne 110
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 0fb: getfield com/finalshell/core/LA3.e Lcom/finalshell/core/Dl2;
      // 0fe: iload 8
      // 100: aload 2
      // 101: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 104: aload 2
      // 105: invokevirtual java/net/DatagramPacket.getPort ()I
      // 108: invokevirtual com/finalshell/core/Dl2.d (ILjava/net/InetAddress;I)Lcom/finalshell/core/F92;
      // 10b: astore 9
      // 10d: goto 14d
      // 110: aload 0
      // 111: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 114: getfield com/finalshell/core/LA3.i I
      // 117: bipush 1
      // 118: if_icmpne 14d
      // 11b: aload 2
      // 11c: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 11f: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 122: aload 2
      // 123: invokevirtual java/net/DatagramPacket.getPort ()I
      // 126: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
      // 12b: astore 10
      // 12d: aload 10
      // 12f: invokevirtual java/lang/String.hashCode ()I
      // 132: invokestatic java/lang/Math.abs (I)I
      // 135: istore 11
      // 137: aload 0
      // 138: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 13b: getfield com/finalshell/core/LA3.e Lcom/finalshell/core/Dl2;
      // 13e: iload 11
      // 140: aload 2
      // 141: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 144: aload 2
      // 145: invokevirtual java/net/DatagramPacket.getPort ()I
      // 148: invokevirtual com/finalshell/core/Dl2.d (ILjava/net/InetAddress;I)Lcom/finalshell/core/F92;
      // 14b: astore 9
      // 14d: aload 9
      // 14f: aload 2
      // 150: invokevirtual com/finalshell/core/F92.g (Ljava/net/DatagramPacket;)V
      // 153: aload 1
      // 154: ifnonnull 004
      // 157: aload 0
      // 158: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 15b: getfield com/finalshell/core/LA3.i I
      // 15e: bipush 1
      // 15f: aload 1
      // 160: ifnull 236
      // 163: if_icmpne 223
      // 166: goto 16d
      // 169: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 171: getfield com/finalshell/core/LA3.k Ljava/util/HashSet;
      // 174: iload 8
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 17c: aload 1
      // 17d: ifnull 235
      // 180: goto 187
      // 183: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 186: athrow
      // 187: ifne 223
      // 18a: goto 191
      // 18d: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 190: athrow
      // 191: aload 2
      // 192: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 195: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 198: aload 2
      // 199: invokevirtual java/net/DatagramPacket.getPort ()I
      // 19c: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
      // 1a1: astore 9
      // 1a3: aload 9
      // 1a5: invokevirtual java/lang/String.hashCode ()I
      // 1a8: invokestatic java/lang/Math.abs (I)I
      // 1ab: istore 10
      // 1ad: aload 0
      // 1ae: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 1b1: getfield com/finalshell/core/LA3.e Lcom/finalshell/core/Dl2;
      // 1b4: iload 10
      // 1b6: aload 2
      // 1b7: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 1ba: aload 2
      // 1bb: invokevirtual java/net/DatagramPacket.getPort ()I
      // 1be: invokevirtual com/finalshell/core/Dl2.d (ILjava/net/InetAddress;I)Lcom/finalshell/core/F92;
      // 1c1: astore 11
      // 1c3: aload 11
      // 1c5: invokevirtual com/finalshell/core/F92.L ()I
      // 1c8: bipush -1
      // 1c9: aload 1
      // 1ca: ifnull 202
      // 1cd: if_icmpne 1e9
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1d6: athrow
      // 1d7: aload 11
      // 1d9: iload 8
      // 1db: invokevirtual com/finalshell/core/F92.F (I)V
      // 1de: aload 1
      // 1df: ifnonnull 213
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1e8: athrow
      // 1e9: aload 11
      // 1eb: invokevirtual com/finalshell/core/F92.L ()I
      // 1ee: aload 1
      // 1ef: ifnull 222
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f8: athrow
      // 1f9: iload 8
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 201: athrow
      // 202: if_icmpeq 213
      // 205: aload 11
      // 207: iload 8
      // 209: invokevirtual com/finalshell/core/F92.Q (I)V
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 212: athrow
      // 213: aload 0
      // 214: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 217: getfield com/finalshell/core/LA3.k Ljava/util/HashSet;
      // 21a: iload 8
      // 21c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21f: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 222: pop
      // 223: aload 0
      // 224: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 227: aload 1
      // 228: ifnull 266
      // 22b: getfield com/finalshell/core/LA3.i I
      // 22e: goto 235
      // 231: invokestatic com/finalshell/task/Ko2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 234: athrow
      // 235: bipush 2
      // 236: if_icmpne 257
      // 239: aload 0
      // 23a: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 23d: aload 2
      // 23e: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 241: aload 2
      // 242: invokevirtual java/net/DatagramPacket.getPort ()I
      // 245: iload 7
      // 247: iload 8
      // 249: invokevirtual com/finalshell/core/LA3.A (Ljava/net/InetAddress;III)Lcom/finalshell/core/Qm2;
      // 24c: pop
      // 24d: goto 257
      // 250: astore 9
      // 252: aload 9
      // 254: invokevirtual java/lang/Exception.printStackTrace ()V
      // 257: aload 0
      // 258: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 25b: getfield com/finalshell/core/LA3.O Ljava/util/HashMap;
      // 25e: iload 7
      // 260: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 263: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 266: checkcast com/finalshell/core/Qm2
      // 269: astore 9
      // 26b: aload 1
      // 26c: ifnull 014
      // 26f: aload 9
      // 271: ifnull 004
      // 274: aload 2
      // 275: astore 10
      // 277: aload 9
      // 279: getfield com/finalshell/core/Qm2.j Lcom/finalshell/connection/Connection;
      // 27c: aload 10
      // 27e: invokevirtual com/finalshell/connection/Connection.t (Ljava/net/DatagramPacket;)V
      // 281: aload 1
      // 282: ifnull 014
      // 285: iload 6
      // 287: getstatic com/finalshell/core/BN.B S
      // 28a: if_icmpne 004
      // 28d: new com/finalshell/core/Cr4
      // 290: dup
      // 291: ldc ""
      // 293: aload 0
      // 294: getfield com/finalshell/task/Ko2.c Lcom/finalshell/core/LA3;
      // 297: getfield com/finalshell/core/LA3.G Ljava/util/Random;
      // 29a: invokevirtual java/util/Random.nextLong ()J
      // 29d: aload 2
      // 29e: invokevirtual java/net/DatagramPacket.getLength ()I
      // 2a1: getstatic com/finalshell/core/Cr4.Z I
      // 2a4: invokespecial com/finalshell/core/Cr4.<init> (Ljava/lang/String;JII)V
      // 2a7: astore 11
      // 2a9: aload 11
      // 2ab: invokestatic com/finalshell/core/LA3.F (Lcom/finalshell/core/Cr4;)V
      // 2ae: goto 004
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4083705893910090027L;
      long var10002 = -5952425430254481117L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





