package com.finalshell.core;

public class DX implements A0_2 {
   public final int D;

   public DX(int var1) {
      this.D = var1;
   }

   @Override
   public Object Y(Ph4 var1, Object var2, Object var3) {
      return var1.n(var3, this.D);
   }

   public boolean a(Ph4 var1, Object var2, Object var3) {
      return var1.I(var1, var2, this.D, var3);
   }

   public boolean s(Ph4 var1, Object var2) {
      return var1.B(var1, var2, this.D);
   }

   @Override
   public void Z(Ph4 param1, Yn4 param2, KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 2
      // 04: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 07: checkcast com/finalshell/core/U9
      // 0a: astore 5
      // 0c: astore 4
      // 0e: aload 5
      // 10: aload 0
      // 11: getfield com/finalshell/core/DX.D I
      // 14: invokevirtual com/finalshell/core/U9.p (I)Z
      // 17: aload 4
      // 19: ifnonnull 3d
      // 1c: ifeq 48
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/DX.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 25: athrow
      // 26: aload 3
      // 27: aload 4
      // 29: ifnonnull 41
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/DX.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 32: athrow
      // 33: getfield com/finalshell/core/KE.o Z
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/DX.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3c: athrow
      // 3d: ifeq 48
      // 40: aload 3
      // 41: aload 2
      // 42: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 45: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 48: return
   }

   public static int n(DX var0) {
      return var0.D;
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





