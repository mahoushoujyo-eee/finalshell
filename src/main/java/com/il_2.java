package com;

class Il_2 implements com.a0 {
   private final int p;
   private final int P;
   private final int g;

   public Il_2(int var1, int var2, int var3) {
      this.p = var1;
      this.P = var2;
      this.g = var3;
   }

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
      // 03: getstatic com/H5.E Lcom/H5;
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual com/H5.T (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;
      // 0c: invokevirtual java/lang/Integer.intValue ()I
      // 0f: istore 5
      // 11: astore 4
      // 13: aload 0
      // 14: getfield com/Il_2.p I
      // 17: aload 4
      // 19: ifnonnull 35
      // 1c: iflt 31
      // 1f: goto 26
      // 22: invokestatic com/Il_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 25: athrow
      // 26: aload 0
      // 27: getfield com/Il_2.p I
      // 2a: goto 38
      // 2d: invokestatic com/Il_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield com/Il_2.p I
      // 35: iload 5
      // 37: iadd
      // 38: istore 6
      // 3a: aload 0
      // 3b: getfield com/Il_2.P I
      // 3e: aload 4
      // 40: ifnonnull 5c
      // 43: iflt 58
      // 46: goto 4d
      // 49: invokestatic com/Il_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield com/Il_2.P I
      // 51: goto 5f
      // 54: invokestatic com/Il_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/Il_2.P I
      // 5c: iload 5
      // 5e: iadd
      // 5f: istore 7
      // 61: iload 7
      // 63: iload 6
      // 65: isub
      // 66: aload 0
      // 67: getfield com/Il_2.g I
      // 6a: idiv
      // 6b: bipush 1
      // 6c: iadd
      // 6d: istore 8
      // 6f: iload 8
      // 71: bipush -1
      // 72: if_icmpne 7b
      // 75: aconst_null
      // 76: areturn
      // 77: invokestatic com/Il_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 7a: athrow
      // 7b: new java/util/ArrayList
      // 7e: dup
      // 7f: iload 8
      // 81: invokespecial java/util/ArrayList.<init> (I)V
      // 84: astore 9
      // 86: iload 6
      // 88: istore 10
      // 8a: iload 10
      // 8c: iload 7
      // 8e: if_icmpgt b9
      // 91: iload 10
      // 93: iload 5
      // 95: if_icmpge b9
      // 98: aload 1
      // 99: aload 3
      // 9a: iload 10
      // 9c: invokevirtual com/ph_4.n (Ljava/lang/Object;I)Ljava/lang/Object;
      // 9f: astore 11
      // a1: aload 9
      // a3: aload 11
      // a5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // aa: pop
      // ab: iload 10
      // ad: aload 0
      // ae: getfield com/Il_2.g I
      // b1: iadd
      // b2: istore 10
      // b4: aload 4
      // b6: ifnull 8a
      // b9: aload 9
      // bb: areturn
   }

   @Override
   public void Z(ph_4 var1, com.yn_4 var2, com.KE var3) {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}





