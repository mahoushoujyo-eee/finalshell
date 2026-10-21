import com._y_2;

class tO_3 implements Runnable {
   final _y_2 n;
   final _y_2 P;
   final Qw_2 t;
   private static final long a;

   tO_3(Qw_2 var1, _y_2 var2, _y_2 var3) {
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
      // 00: invokestatic kA_3.y ()[Lcom/ky_4;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: iload 2
      // 07: bipush 3
      // 08: if_icmpge 94
      // 0b: getstatic tO_3.a J
      // 0e: invokestatic java/lang/Thread.sleep (J)V
      // 11: goto 19
      // 14: astore 3
      // 15: aload 3
      // 16: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 19: aload 0
      // 1a: ldc2_w 349316912833002607
      // 1d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 20: swap
      // 21: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 24: checkcast com/_y_2
      // 27: invokevirtual com/_y_2.t ()LCB;
      // 2a: aload 1
      // 2b: ifnonnull 50
      // 2e: ifnull 8d
      // 31: goto 38
      // 34: invokestatic tO_3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 37: athrow
      // 38: aload 0
      // 39: ldc2_w 349316912833002607
      // 3c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3f: swap
      // 40: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 43: checkcast com/_y_2
      // 46: invokevirtual com/_y_2.t ()LCB;
      // 49: goto 50
      // 4c: invokestatic tO_3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 4f: athrow
      // 50: invokestatic com/c.f ()[Ljava/lang/Object;
      // 53: ldc2_w 265460201950227144
      // 56: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 59: dup_x2
      // 5a: pop
      // 5b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5e: pop
      // 5f: goto 66
      // 62: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 0
      // 67: ldc2_w 532964093397907785
      // 6a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 6d: swap
      // 6e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 71: checkcast com/_y_2
      // 74: invokevirtual com/_y_2.x ()LU;
      // 77: invokestatic com/c.f ()[Ljava/lang/Object;
      // 7a: ldc2_w 526151509200330945
      // 7d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 80: dup_x2
      // 81: pop
      // 82: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 85: pop
      // 86: goto 8d
      // 89: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: iinc 2 1
      // 90: aload 1
      // 91: ifnull 06
      // 94: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 6017299143411389852L;
      long var10002 = 6017299143411389780L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





