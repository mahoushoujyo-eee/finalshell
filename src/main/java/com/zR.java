package com;

class zR extends com.z8 {
   private final String[] E;
   private final boolean e;

   public zR(String var1, boolean var2, String[] var3, boolean var4) {
      super(var1, var2);
      this.E = var3;
      this.e = var4;
   }

   @Override
   public boolean x(ph_4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: aload 4
      // 08: invokevirtual com/zR.H (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 6
      // 0d: astore 5
      // 0f: aload 0
      // 10: getfield com/zR.E [Ljava/lang/String;
      // 13: astore 7
      // 15: aload 7
      // 17: arraylength
      // 18: istore 8
      // 1a: bipush 0
      // 1b: istore 9
      // 1d: iload 9
      // 1f: iload 8
      // 21: if_icmpge ad
      // 24: aload 7
      // 26: iload 9
      // 28: aaload
      // 29: astore 10
      // 2b: aload 10
      // 2d: aload 5
      // 2f: ifnonnull 60
      // 32: aload 6
      // 34: if_acmpne 5e
      // 37: goto 3e
      // 3a: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zR.e Z
      // 42: aload 5
      // 44: ifnonnull 59
      // 47: goto 4e
      // 4a: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 4d: athrow
      // 4e: ifne 5c
      // 51: goto 58
      // 54: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: aload 10
      // 60: aload 5
      // 62: ifnonnull 71
      // 65: ifnull a5
      // 68: goto 6f
      // 6b: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 6e: athrow
      // 6f: aload 10
      // 71: aload 6
      // 73: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 76: aload 5
      // 78: ifnonnull 90
      // 7b: ifeq a5
      // 7e: goto 85
      // 81: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 84: athrow
      // 85: aload 0
      // 86: getfield com/zR.e Z
      // 89: goto 90
      // 8c: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 8f: athrow
      // 90: aload 5
      // 92: ifnonnull a0
      // 95: ifne a3
      // 98: goto 9f
      // 9b: invokestatic com/zR.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 9e: athrow
      // 9f: bipush 1
      // a0: goto a4
      // a3: bipush 0
      // a4: ireturn
      // a5: iinc 9 1
      // a8: aload 5
      // aa: ifnull 1d
      // ad: aload 0
      // ae: getfield com/zR.e Z
      // b1: ireturn
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





