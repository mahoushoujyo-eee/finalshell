package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.ui.panel.ConnectionProperty;

public class TO3 implements Runnable {
   public final ConnectionProperty n;
   public final ConnectionProperty P;
   public final Qw2 t;
   public static long a;

   public TO3(Qw2 var1, ConnectionProperty var2, ConnectionProperty var3) {
      this.t = var1;
      this.n = var2;
      this.P = var3;
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
      // 00: invokestatic com/finalshell/ui/panel/KA_3.y$arrky_4 ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: iload 2
      // 07: bipush 3
      // 08: if_icmpge a9
      // 0b: getstatic com/finalshell/task/TO3.a J
      // 0e: invokestatic java/lang/Thread.sleep (J)V
      // 11: goto 19
      // 14: astore 3
      // 15: aload 3
      // 16: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 19: aload 0
      // 1a: ldc2_w 349316912833002607
      // 1d: astore 4
      // 1f: ldc2_w 349316912833002607
      // 22: aload 4
      // 24: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 2a: invokevirtual com/finalshell/ui/panel/ConnectionProperty.t$CB ()Lcom/finalshell/core/CB;
      // 2d: aload 1
      // 2e: ifnonnull 56
      // 31: ifnull a2
      // 34: goto 3b
      // 37: invokestatic com/finalshell/task/TO3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: ldc2_w 349316912833002607
      // 3f: astore 6
      // 41: ldc2_w 349316912833002607
      // 44: aload 6
      // 46: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 49: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 4c: invokevirtual com/finalshell/ui/panel/ConnectionProperty.t$CB ()Lcom/finalshell/core/CB;
      // 4f: goto 56
      // 52: invokestatic com/finalshell/task/TO3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 55: athrow
      // 56: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 59: ldc2_w 265460201950227144
      // 5c: astore 9
      // 5e: astore 8
      // 60: ldc2_w 265460201950227144
      // 63: aload 8
      // 65: aload 9
      // 67: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6a: pop
      // 6b: goto 72
      // 6e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: ldc2_w 532964093397907785
      // 76: astore 10
      // 78: ldc2_w 532964093397907785
      // 7b: aload 10
      // 7d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 80: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 83: invokevirtual com/finalshell/ui/panel/ConnectionProperty.x$U ()Lcom/finalshell/ui/frame/U;
      // 86: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 89: ldc2_w 526151509200330945
      // 8c: astore 13
      // 8e: astore 12
      // 90: ldc2_w 526151509200330945
      // 93: aload 12
      // 95: aload 13
      // 97: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9a: pop
      // 9b: goto a2
      // 9e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a1: athrow
      // a2: iinc 2 1
      // a5: aload 1
      // a6: ifnull 06
      // a9: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6017299143411389852L;
      long var10002 = 6017299143411389780L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





