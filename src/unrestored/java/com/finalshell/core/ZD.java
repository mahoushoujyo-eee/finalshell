package com.finalshell.core;

import java.util.regex.Pattern;

public class ZD extends Z8 {
   public final Pattern O;
   public final boolean K;

   public ZD(String var1, boolean var2, String var3, boolean var4) {
      super(var1, var2);
      this.O = Pattern.compile(var3);
      this.K = var4;
   }

   @Override
   public boolean x(Ph4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: aload 4
      // 08: invokevirtual com/finalshell/core/ZD.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 6
      // 0d: astore 5
      // 0f: aload 6
      // 11: aload 5
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/ZD.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/core/ZD.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 25: athrow
      // 26: aload 6
      // 28: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 2b: astore 7
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/ZD.O Ljava/util/regex/Pattern;
      // 31: aload 7
      // 33: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 36: astore 8
      // 38: aload 8
      // 3a: invokevirtual java/util/regex/Matcher.matches ()Z
      // 3d: istore 9
      // 3f: aload 0
      // 40: getfield com/finalshell/core/ZD.K Z
      // 43: aload 5
      // 45: ifnonnull 73
      // 48: ifeq 71
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/ZD.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 51: athrow
      // 52: iload 9
      // 54: aload 5
      // 56: ifnonnull 6b
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/ZD.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5f: athrow
      // 60: ifne 6e
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/ZD.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: istore 9
      // 71: iload 9
      // 73: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





