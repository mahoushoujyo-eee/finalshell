package com.finalshell.task;

import com.finalshell.core.Qu2;
import java.io.IOException;

public class Z6 implements Runnable {
   final Qu2 j;
   public static long a;

   Z6(Qu2 var1) {
      this.j = var1;
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
      // 03: astore 1
      // 04: aload 1
      // 05: ifnonnull 49
      // 08: getstatic com/finalshell/task/Z6.a J
      // 0b: l2i
      // 0c: newarray 8
      // 0e: astore 2
      // 0f: new java/net/DatagramPacket
      // 12: dup
      // 13: aload 2
      // 14: aload 2
      // 15: arraylength
      // 16: invokespecial java/net/DatagramPacket.<init> ([BI)V
      // 19: astore 3
      // 1a: aload 0
      // 1b: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 1e: getfield com/finalshell/core/Qu2.T Ljava/net/DatagramSocket;
      // 21: aload 3
      // 22: invokevirtual java/net/DatagramSocket.receive (Ljava/net/DatagramPacket;)V
      // 25: aload 0
      // 26: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 29: aload 3
      // 2a: invokevirtual com/finalshell/core/Qu2.K (Ljava/net/DatagramPacket;)V
      // 2d: aload 3
      // 2e: invokevirtual java/net/DatagramPacket.getLength ()I
      // 31: aload 1
      // 32: ifnull 50
      // 35: getstatic com/finalshell/core/Qu2.Y I
      // 38: if_icmple 49
      // 3b: aload 3
      // 3c: invokevirtual java/net/DatagramPacket.getLength ()I
      // 3f: putstatic com/finalshell/core/Qu2.Y I
      // 42: goto 49
      // 45: invokestatic com/finalshell/task/Z6.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 4d: getfield com/finalshell/core/Qu2.n Z
      // 50: ifne 08
      // 53: aload 1
      // 54: ifnull 49
      // 57: goto 71
      // 5a: astore 2
      // 5b: aload 0
      // 5c: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 5f: invokevirtual com/finalshell/core/Qu2.T ()V
      // 62: goto 78
      // 65: astore 4
      // 67: aload 0
      // 68: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 6b: invokevirtual com/finalshell/core/Qu2.T ()V
      // 6e: aload 4
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/finalshell/task/Z6.j Lcom/finalshell/core/Qu2;
      // 75: invokevirtual com/finalshell/core/Qu2.T ()V
      // 78: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7554952516090738692L;
      long var10002 = 5314606972162031064L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





