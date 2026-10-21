package com.finalshell.core;

public class R_2_3 implements Y_5 {
   public final X_5[] r;
   public final Y_5 e;

   public R_2_3(X_5[] var1, Y_5 var2) {
      this.r = var1;
      this.e = var2;
   }

   @Override
   public void U(@C_9 String param1, String param2, @C_9 com.finalshell.ui.model.I param3) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: ifnull 27
      // 09: aload 0
      // 0a: aload 4
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/R_2_3.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: getfield com/finalshell/core/R_2_3.r [Lcom/finalshell/core/X_5;
      // 19: aload 1
      // 1a: invokestatic com/finalshell/core/X_5.h ([Lcom/finalshell/core/X_5;Ljava/lang/String;)Z
      // 1d: ifeq 3a
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/R_2_3.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 26: athrow
      // 27: aload 0
      // 28: getfield com/finalshell/core/R_2_3.e Lcom/finalshell/core/Y_5;
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/R_2_3.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokeinterface com/finalshell/core/Y_5.U (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/ui/model/I;)V 4
      // 3a: return
   }

   public static B2_5 a(B2_5 var0) {
      return var0;
   }
}





