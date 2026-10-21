package com;

class zu_2 extends com.z8 {
   private final Long[] d;
   private final boolean e;

   public zu_2(String var1, boolean var2, Long[] var3, boolean var4) {
      super(var1, var2);
      this.d = var3;
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
      // 000: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: aload 4
      // 008: invokevirtual com/zu_2.H (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 6
      // 011: aload 5
      // 013: ifnonnull 07c
      // 016: ifnonnull 07a
      // 019: goto 020
      // 01c: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield com/zu_2.d [Ljava/lang/Long;
      // 024: astore 7
      // 026: aload 7
      // 028: arraylength
      // 029: istore 8
      // 02b: bipush 0
      // 02c: istore 9
      // 02e: iload 9
      // 030: iload 8
      // 032: if_icmpge 075
      // 035: aload 7
      // 037: iload 9
      // 039: aaload
      // 03a: astore 10
      // 03c: aload 5
      // 03e: ifnonnull 070
      // 041: aload 10
      // 043: ifnonnull 06d
      // 046: goto 04d
      // 049: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield com/zu_2.e Z
      // 051: aload 5
      // 053: ifnonnull 068
      // 056: goto 05d
      // 059: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 05c: athrow
      // 05d: ifne 06b
      // 060: goto 067
      // 063: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 066: athrow
      // 067: bipush 1
      // 068: goto 06c
      // 06b: bipush 0
      // 06c: ireturn
      // 06d: iinc 9 1
      // 070: aload 5
      // 072: ifnull 02e
      // 075: aload 0
      // 076: getfield com/zu_2.e Z
      // 079: ireturn
      // 07a: aload 6
      // 07c: instanceof java/lang/Number
      // 07f: aload 5
      // 081: ifnonnull 11b
      // 084: ifeq 117
      // 087: goto 08e
      // 08a: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 08d: athrow
      // 08e: aload 6
      // 090: checkcast java/lang/Number
      // 093: invokestatic com/B8.e (Ljava/lang/Number;)J
      // 096: lstore 7
      // 098: aload 0
      // 099: getfield com/zu_2.d [Ljava/lang/Long;
      // 09c: astore 9
      // 09e: aload 9
      // 0a0: arraylength
      // 0a1: istore 10
      // 0a3: bipush 0
      // 0a4: istore 11
      // 0a6: iload 11
      // 0a8: iload 10
      // 0aa: if_icmpge 117
      // 0ad: aload 9
      // 0af: iload 11
      // 0b1: aaload
      // 0b2: astore 12
      // 0b4: aload 12
      // 0b6: aload 5
      // 0b8: ifnonnull 0da
      // 0bb: ifnonnull 0d1
      // 0be: goto 0c5
      // 0c1: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0c4: athrow
      // 0c5: aload 5
      // 0c7: ifnull 10f
      // 0ca: goto 0d1
      // 0cd: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0d0: athrow
      // 0d1: aload 12
      // 0d3: goto 0da
      // 0d6: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0d9: athrow
      // 0da: invokevirtual java/lang/Long.longValue ()J
      // 0dd: lload 7
      // 0df: lcmp
      // 0e0: aload 5
      // 0e2: ifnonnull 0fa
      // 0e5: ifne 10f
      // 0e8: goto 0ef
      // 0eb: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield com/zu_2.e Z
      // 0f3: goto 0fa
      // 0f6: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0f9: athrow
      // 0fa: aload 5
      // 0fc: ifnonnull 10a
      // 0ff: ifne 10d
      // 102: goto 109
      // 105: invokestatic com/zu_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 108: athrow
      // 109: bipush 1
      // 10a: goto 10e
      // 10d: bipush 0
      // 10e: ireturn
      // 10f: iinc 11 1
      // 112: aload 5
      // 114: ifnull 0a6
      // 117: aload 0
      // 118: getfield com/zu_2.e Z
      // 11b: ireturn
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





