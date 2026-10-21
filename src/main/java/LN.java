import java.io.IOException;

class LN extends Thread {
   final Process a;

   LN(Process var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: No successor exists for {If}:17
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getFirstSuccessor(Statement.java:834)
      //   at org.jetbrains.java.decompiler.modules.decompiler.IfNode.build(IfNode.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.IfHelper.mergeIfs(IfHelper.java:75)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:73)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:71)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:71)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:71)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SimplifyExprentsHelper.simplifyStackVarsStatement(SimplifyExprentsHelper.java:71)
      //   at org.jetbrains.java.decompiler.modules.decompiler.EliminateLoopsHelper.eliminateLoops(EliminateLoopsHelper.java:24)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:262)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ldc2_w 287131094784319895
      // 04: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 07: swap
      // 08: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: checkcast java/lang/Process
      // 0e: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 11: astore 2
      // 12: invokestatic yT_3.c ()[Lcom/ky_4;
      // 15: new java/io/BufferedReader
      // 18: dup
      // 19: new java/io/InputStreamReader
      // 1c: dup
      // 1d: aload 2
      // 1e: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 21: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 24: astore 3
      // 25: astore 1
      // 26: aload 3
      // 27: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: ifnonnull 35
      // 31: aload 1
      // 32: ifnonnull 46
      // 35: goto 26
      // 38: invokestatic LN.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3b: athrow
      // 3c: astore 5
      // 3e: aload 5
      // 40: invokevirtual java/io/IOException.printStackTrace ()V
      // 43: goto 46
      // 46: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





