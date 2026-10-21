package com.finalshell.task;

import com.finalshell.core.G9;
import com.finalshell.core.UR;
import com.finalshell.crypto.PingMessageR;
import java.util.HashMap;

public class Bz2 implements Runnable {
   Thread D;
   HashMap M = new HashMap();

   public Bz2() {
      this.D = new Thread(this);
      this.D.start();
   }

   synchronized void Q(UR var1, int var2) {
      String[] var3 = PingMessageR.N();
      HashMap var10000 = this.M;
      Integer var10001 = var1.v;
      if (var3 != null) {
         if (!var10000.containsKey(var10001)) {
            G9 var4 = new G9(var1);
            this.M.put(var1.v, var4);
         }

         var10000 = this.M;
         var10001 = var1.v;
      }

      G9 var5 = (G9)var10000.get(var10001);
      var5.S(var2);
   }

   synchronized void u(UR var1) {
      if (!this.M.containsKey(var1.v)) {
         G9 var2 = new G9(var1);
         this.M.put(var1.v, var2);
      }
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
      // 04: aload 0
      // 05: dup
      // 06: astore 2
      // 07: monitorenter
      // 08: aload 0
      // 09: getfield com/finalshell/task/Bz2.M Ljava/util/HashMap;
      // 0c: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // 0f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 14: astore 3
      // 15: aload 1
      // 16: ifnonnull 44
      // 19: aload 3
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: goto 26
      // 22: invokestatic com/finalshell/task/Bz2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 25: athrow
      // 26: checkcast java/lang/Integer
      // 29: invokevirtual java/lang/Integer.intValue ()I
      // 2c: istore 4
      // 2e: aload 0
      // 2f: getfield com/finalshell/task/Bz2.M Ljava/util/HashMap;
      // 32: iload 4
      // 34: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3a: checkcast com/finalshell/core/G9
      // 3d: astore 5
      // 3f: aload 5
      // 41: invokevirtual com/finalshell/core/G9.x ()V
      // 44: aload 3
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifne 19
      // 4d: aload 0
      // 4e: getfield com/finalshell/task/Bz2.M Ljava/util/HashMap;
      // 51: invokevirtual java/util/HashMap.clear ()V
      // 54: aload 0
      // 55: aconst_null
      // 56: putfield com/finalshell/task/Bz2.M Ljava/util/HashMap;
      // 59: aload 0
      // 5a: new java/util/HashMap
      // 5d: dup
      // 5e: invokespecial java/util/HashMap.<init> ()V
      // 61: putfield com/finalshell/task/Bz2.M Ljava/util/HashMap;
      // 64: aload 2
      // 65: aload 1
      // 66: ifnull 26
      // 69: monitorexit
      // 6a: goto 70
      // 6d: aload 2
      // 6e: monitorexit
      // 6f: athrow
      // 70: getstatic com/finalshell/core/Yh2.M I
      // 73: i2l
      // 74: invokestatic java/lang/Thread.sleep (J)V
      // 77: goto 04
      // 7a: astore 2
      // 7b: aload 2
      // 7c: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 7f: goto 04
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





