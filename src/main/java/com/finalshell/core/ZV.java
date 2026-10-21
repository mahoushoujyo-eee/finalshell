package com.finalshell.core;

public class ZV extends Z8 {
   public final long s;
   public final long I;
   public final boolean N;

   public ZV(String var1, boolean var2, long var3, long var5, boolean var7) {
      super(var1, var2);
      this.s = var3;
      this.I = var5;
      this.N = var7;
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
      // 08: invokevirtual com/finalshell/core/ZV.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 6
      // 0d: astore 5
      // 0f: aload 6
      // 11: aload 5
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 25: athrow
      // 26: aload 6
      // 28: instanceof java/lang/Number
      // 2b: aload 5
      // 2d: ifnonnull 9b
      // 30: ifeq 97
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 39: athrow
      // 3a: aload 6
      // 3c: checkcast java/lang/Number
      // 3f: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 42: lstore 7
      // 44: lload 7
      // 46: aload 0
      // 47: getfield com/finalshell/core/ZV.s J
      // 4a: lcmp
      // 4b: aload 5
      // 4d: ifnonnull 9b
      // 50: iflt 97
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 59: athrow
      // 5a: lload 7
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/ZV.I J
      // 60: lcmp
      // 61: aload 5
      // 63: ifnonnull 9b
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6c: athrow
      // 6d: ifgt 97
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 76: athrow
      // 77: aload 0
      // 78: getfield com/finalshell/core/ZV.N Z
      // 7b: aload 5
      // 7d: ifnonnull 92
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 86: athrow
      // 87: ifne 95
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/ZV.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 90: athrow
      // 91: bipush 1
      // 92: goto 96
      // 95: bipush 0
      // 96: ireturn
      // 97: aload 0
      // 98: getfield com/finalshell/core/ZV.N Z
      // 9b: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





