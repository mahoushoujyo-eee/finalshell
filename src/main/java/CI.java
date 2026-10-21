import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class CI implements GenericFutureListener {
   final xE q;

   CI(xE var1) {
      this.q = var1;
   }

   @Override
   public void operationComplete(Future param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic xE.I ()I
      // 03: istore 2
      // 04: iload 2
      // 05: ifeq 26
      // 08: aload 1
      // 09: invokeinterface io/netty/util/concurrent/Future.isSuccess ()Z 1
      // 0e: ifeq 2a
      // 11: goto 18
      // 14: invokestatic CI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield CI.q LxE;
      // 1c: invokevirtual xE.j ()V
      // 1f: goto 26
      // 22: invokestatic CI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: iload 2
      // 27: ifne 38
      // 2a: aload 0
      // 2b: getfield CI.q LxE;
      // 2e: invokevirtual xE.V ()V
      // 31: goto 38
      // 34: invokestatic CI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





