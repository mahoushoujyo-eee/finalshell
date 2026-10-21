package com.finalshell.task;

import java.io.IOException;

public class Kc4 extends Thread {
   public final Process Y;

   public Kc4(Process var1) {
      this.Y = var1;
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
      // 01: ldc2_w 165830420062484198
      // 04: astore 6
      // 06: ldc2_w 165830420062484198
      // 09: aload 6
      // 0b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e: checkcast java/lang/Process
      // 11: invokevirtual java/lang/Process.getErrorStream ()Ljava/io/InputStream;
      // 14: astore 2
      // 15: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 18: new java/io/BufferedReader
      // 1b: dup
      // 1c: new java/io/InputStreamReader
      // 1f: dup
      // 20: aload 2
      // 21: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 24: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 27: astore 3
      // 28: astore 1
      // 29: aload 3
      // 2a: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2d: astore 4
      // 2f: aload 4
      // 31: ifnonnull 38
      // 34: aload 1
      // 35: ifnonnull 49
      // 38: goto 29
      // 3b: invokestatic com/finalshell/task/Kc4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3e: athrow
      // 3f: astore 5
      // 41: aload 5
      // 43: invokevirtual java/io/IOException.printStackTrace ()V
      // 46: goto 49
      // 49: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





