class Qx_2 extends Thread {
   final Li_2 q;
   private static final long a;
   private static final long b;

   Qx_2(Li_2 var1) {
      this.q = var1;
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
      // 00: invokestatic Li_2.I ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 1
      // 07: ifnull 38
      // 0a: aload 0
      // 0b: getfield Qx_2.q LLi_2;
      // 0e: invokevirtual Li_2.E ()Z
      // 11: istore 3
      // 12: aload 1
      // 13: ifnonnull 2b
      // 16: iload 3
      // 17: ifeq 25
      // 1a: aload 1
      // 1b: ifnull 40
      // 1e: goto 25
      // 21: invokestatic Qx_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 24: athrow
      // 25: getstatic Qx_2.b J
      // 28: invokestatic java/lang/Thread.sleep (J)V
      // 2b: goto 35
      // 2e: astore 4
      // 30: aload 4
      // 32: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 35: iinc 2 1
      // 38: iload 2
      // 39: getstatic Qx_2.a J
      // 3c: l2i
      // 3d: if_icmpgt 0a
      // 40: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var2 = 4584791071525074752L;
      long var10002 = -8990527681185286326L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 5055224283347089703L;
      var10002 = 5055224283347030855L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





