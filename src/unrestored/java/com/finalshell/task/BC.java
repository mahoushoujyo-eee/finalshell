package com.finalshell.task;

import com.finalshell.core.Qu2;
import com.finalshell.core.We2;
import java.net.UnknownHostException;

public class BC implements Runnable {
   public final Qu2 H;
   public final We2 A;

   public BC(Qu2 var1, We2 var2) {
      this.H = var1;
      this.A = var2;
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
      // 03: aload 0
      // 04: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 07: aload 0
      // 08: getfield com/finalshell/task/BC.A Lcom/finalshell/core/We2;
      // 0b: invokevirtual com/finalshell/core/We2.r ()Ljava/lang/String;
      // 0e: putfield com/finalshell/core/Qu2.M Ljava/lang/String;
      // 11: astore 1
      // 12: aload 0
      // 13: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 16: aload 0
      // 17: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 1a: getfield com/finalshell/core/Qu2.M Ljava/lang/String;
      // 1d: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 20: putfield com/finalshell/core/Qu2.s Ljava/net/InetAddress;
      // 23: goto 2b
      // 26: astore 2
      // 27: aload 2
      // 28: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 2b: aload 0
      // 2c: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 2f: aload 0
      // 30: getfield com/finalshell/task/BC.A Lcom/finalshell/core/We2;
      // 33: invokevirtual com/finalshell/core/We2.x ()I
      // 36: putfield com/finalshell/core/Qu2.F I
      // 39: aload 0
      // 3a: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 3d: aload 1
      // 3e: ifnull 6b
      // 41: getfield com/finalshell/core/Qu2.N Z
      // 44: ifne 60
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/task/BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 52: invokevirtual com/finalshell/core/Qu2.X ()V
      // 55: aload 1
      // 56: ifnonnull 6e
      // 59: goto 60
      // 5c: invokestatic com/finalshell/task/BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield com/finalshell/task/BC.H Lcom/finalshell/core/Qu2;
      // 64: goto 6b
      // 67: invokestatic com/finalshell/task/BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 6a: athrow
      // 6b: invokevirtual com/finalshell/core/Qu2.b ()V
      // 6e: return
   }

   public static UnknownHostException a(UnknownHostException var0) {
      return var0;
   }
}





