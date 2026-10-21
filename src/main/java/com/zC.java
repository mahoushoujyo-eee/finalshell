package com;

class zC implements com.a0 {
   public static final com.zC Q = new com.zC();

   @Override
   public Object Y(ph_4 param1, Object param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 3
      // 06: aload 4
      // 08: ifnonnull 79
      // 0b: instanceof com/Oc_2
      // 0e: ifeq 75
      // 11: goto 18
      // 14: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 3
      // 19: checkcast com/Oc_2
      // 1c: invokevirtual com/Oc_2.clone ()Ljava/lang/Object;
      // 1f: checkcast com/Oc_2
      // 22: astore 5
      // 24: bipush 0
      // 25: istore 6
      // 27: iload 6
      // 29: aload 5
      // 2b: invokevirtual com/Oc_2.size ()I
      // 2e: if_icmpge 72
      // 31: aload 5
      // 33: aload 4
      // 35: ifnonnull 74
      // 38: iload 6
      // 3a: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 3d: astore 7
      // 3f: aload 7
      // 41: invokestatic com/zC.g (Ljava/lang/Object;)Ljava/lang/Object;
      // 44: astore 8
      // 46: aload 4
      // 48: ifnonnull 6d
      // 4b: aload 8
      // 4d: aload 7
      // 4f: if_acmpeq 6a
      // 52: goto 59
      // 55: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 58: athrow
      // 59: aload 5
      // 5b: iload 6
      // 5d: aload 8
      // 5f: invokevirtual com/Oc_2.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: goto 6a
      // 66: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 69: athrow
      // 6a: iinc 6 1
      // 6d: aload 4
      // 6f: ifnull 27
      // 72: aload 5
      // 74: areturn
      // 75: aload 3
      // 76: invokestatic com/zC.g (Ljava/lang/Object;)Ljava/lang/Object;
      // 79: areturn
   }

   private static Object g(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnonnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Float
      // 01d: aload 1
      // 01e: ifnonnull 042
      // 021: ifeq 03e
      // 024: goto 02b
      // 027: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Float
      // 02f: invokevirtual java/lang/Float.floatValue ()F
      // 032: f2d
      // 033: invokestatic java/lang/Math.floor (D)D
      // 036: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 039: areturn
      // 03a: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: instanceof java/lang/Double
      // 042: aload 1
      // 043: ifnonnull 066
      // 046: ifeq 062
      // 049: goto 050
      // 04c: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 04f: athrow
      // 050: aload 0
      // 051: checkcast java/lang/Double
      // 054: invokevirtual java/lang/Double.doubleValue ()D
      // 057: invokestatic java/lang/Math.floor (D)D
      // 05a: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 05d: areturn
      // 05e: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 061: athrow
      // 062: aload 0
      // 063: instanceof java/math/BigDecimal
      // 066: aload 1
      // 067: ifnonnull 091
      // 06a: ifeq 082
      // 06d: goto 074
      // 070: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 073: athrow
      // 074: aload 0
      // 075: checkcast java/math/BigDecimal
      // 078: astore 2
      // 079: aload 2
      // 07a: bipush 0
      // 07b: getstatic java/math/RoundingMode.FLOOR Ljava/math/RoundingMode;
      // 07e: invokevirtual java/math/BigDecimal.setScale (ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
      // 081: areturn
      // 082: aload 0
      // 083: aload 1
      // 084: ifnonnull 100
      // 087: instanceof java/lang/Byte
      // 08a: goto 091
      // 08d: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 090: athrow
      // 091: ifne 0f8
      // 094: aload 0
      // 095: aload 1
      // 096: ifnonnull 100
      // 099: goto 0a0
      // 09c: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 09f: athrow
      // 0a0: instanceof java/lang/Short
      // 0a3: ifne 0f8
      // 0a6: goto 0ad
      // 0a9: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: ifnonnull 100
      // 0b2: goto 0b9
      // 0b5: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0b8: athrow
      // 0b9: instanceof java/lang/Integer
      // 0bc: ifne 0f8
      // 0bf: goto 0c6
      // 0c2: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: ifnonnull 100
      // 0cb: goto 0d2
      // 0ce: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0d1: athrow
      // 0d2: instanceof java/lang/Long
      // 0d5: ifne 0f8
      // 0d8: goto 0df
      // 0db: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 1
      // 0e1: ifnonnull 100
      // 0e4: goto 0eb
      // 0e7: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ea: athrow
      // 0eb: instanceof java/math/BigInteger
      // 0ee: ifeq 101
      // 0f1: goto 0f8
      // 0f4: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: goto 100
      // 0fc: invokestatic com/zC.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ff: athrow
      // 100: areturn
      // 101: new java/lang/UnsupportedOperationException
      // 104: dup
      // 105: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 108: athrow
   }

   @Override
   public void Z(ph_4 var1, com.yn_4 var2, com.KE var3) {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}





