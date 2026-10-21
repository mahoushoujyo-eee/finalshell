package com.finalshell.core;

public class ZN extends Z8 {
   public final long[] u;
   public final boolean T;

   public ZN(String var1, boolean var2, long[] var3, boolean var4) {
      super(var1, var2);
      this.u = var3;
      this.T = var4;
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
      // 08: invokevirtual com/finalshell/core/ZN.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 6
      // 0d: astore 5
      // 0f: aload 6
      // 11: aload 5
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 25: athrow
      // 26: aload 6
      // 28: instanceof java/lang/Number
      // 2b: aload 5
      // 2d: ifnonnull ac
      // 30: ifeq a8
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 39: athrow
      // 3a: aload 6
      // 3c: checkcast java/lang/Number
      // 3f: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 42: lstore 7
      // 44: aload 0
      // 45: getfield com/finalshell/core/ZN.u [J
      // 48: astore 9
      // 4a: aload 9
      // 4c: arraylength
      // 4d: istore 10
      // 4f: bipush 0
      // 50: istore 11
      // 52: iload 11
      // 54: iload 10
      // 56: if_icmpge a8
      // 59: aload 9
      // 5b: iload 11
      // 5d: laload
      // 5e: lstore 12
      // 60: aload 5
      // 62: ifnonnull a3
      // 65: lload 12
      // 67: lload 7
      // 69: lcmp
      // 6a: aload 5
      // 6c: ifnonnull ac
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 75: athrow
      // 76: ifne a0
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7f: athrow
      // 80: aload 0
      // 81: getfield com/finalshell/core/ZN.T Z
      // 84: aload 5
      // 86: ifnonnull 9b
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8f: athrow
      // 90: ifne 9e
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/ZN.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto 9f
      // 9e: bipush 0
      // 9f: ireturn
      // a0: iinc 11 1
      // a3: aload 5
      // a5: ifnull 52
      // a8: aload 0
      // a9: getfield com/finalshell/core/ZN.T Z
      // ac: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





