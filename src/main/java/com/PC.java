package com;

class PC extends Ps_2 {
   private final byte[] x;

   public PC(byte[] var1) {
      this.x = var1;
      this.c();
      this.N();
   }

   @Override
   void c() {
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
      // 04: dup
      // 05: getfield com/PC.p I
      // 08: bipush 1
      // 09: iadd
      // 0a: putfield com/PC.p I
      // 0d: astore 1
      // 0e: aload 0
      // 0f: aload 1
      // 10: ifnonnull 42
      // 13: getfield com/PC.p I
      // 16: aload 0
      // 17: getfield com/PC.x [B
      // 1a: arraylength
      // 1b: if_icmplt 3a
      // 1e: goto 25
      // 21: invokestatic com/PC.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 24: athrow
      // 25: aload 0
      // 26: bipush 0
      // 27: putfield com/PC.D C
      // 2a: aload 0
      // 2b: bipush 1
      // 2c: putfield com/PC.o Z
      // 2f: aload 1
      // 30: ifnull 4f
      // 33: goto 3a
      // 36: invokestatic com/PC.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 42
      // 3e: invokestatic com/PC.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/PC.x [B
      // 46: aload 0
      // 47: getfield com/PC.p I
      // 4a: baload
      // 4b: i2c
      // 4c: putfield com/PC.D C
      // 4f: return
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





