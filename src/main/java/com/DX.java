package com;

class DX implements com.a0 {
   private final int D;

   public DX(int var1) {
      this.D = var1;
   }

   @Override
   public Object Y(ph_4 var1, Object var2, Object var3) {
      return var1.n(var3, this.D);
   }

   public boolean a(ph_4 var1, Object var2, Object var3) {
      return var1.I(var1, var2, this.D, var3);
   }

   public boolean s(ph_4 var1, Object var2) {
      return var1.B(var1, var2, this.D);
   }

   @Override
   public void Z(ph_4 param1, com.yn_4 param2, com.KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 2
      // 04: getfield com/yn_4.N Lcom/P7;
      // 07: checkcast com/u9
      // 0a: astore 5
      // 0c: astore 4
      // 0e: aload 5
      // 10: aload 0
      // 11: getfield com/DX.D I
      // 14: invokevirtual com/u9.p (I)Z
      // 17: aload 4
      // 19: ifnonnull 3d
      // 1c: ifeq 48
      // 1f: goto 26
      // 22: invokestatic com/DX.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 25: athrow
      // 26: aload 3
      // 27: aload 4
      // 29: ifnonnull 41
      // 2c: goto 33
      // 2f: invokestatic com/DX.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 32: athrow
      // 33: getfield com/KE.o Z
      // 36: goto 3d
      // 39: invokestatic com/DX.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3c: athrow
      // 3d: ifeq 48
      // 40: aload 3
      // 41: aload 2
      // 42: invokevirtual com/yn_4.M ()Ljava/lang/Object;
      // 45: putfield com/KE.t Ljava/lang/Object;
      // 48: return
   }

   static int n(com.DX var0) {
      return var0.D;
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





