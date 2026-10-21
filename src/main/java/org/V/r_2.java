package org.v;

import org.I;
import org.T.x;

public class r_2 implements org.Y {
   private final x[] r;
   private final org.Y e;

   public r_2(x[] var1, org.Y var2) {
      this.r = var1;
      this.e = var2;
   }

   @Override
   public void U(@org.F.c String param1, String param2, @org.F.c I param3) throws org.b_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: ifnull 27
      // 09: aload 0
      // 0a: aload 4
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic org/v/r_2.a (Lorg/b_2;)Lorg/b_2;
      // 15: athrow
      // 16: getfield org/v/r_2.r [Lorg/T/x;
      // 19: aload 1
      // 1a: invokestatic org/T/x.h ([Lorg/T/x;Ljava/lang/String;)Z
      // 1d: ifeq 3a
      // 20: goto 27
      // 23: invokestatic org/v/r_2.a (Lorg/b_2;)Lorg/b_2;
      // 26: athrow
      // 27: aload 0
      // 28: getfield org/v/r_2.e Lorg/Y;
      // 2b: goto 32
      // 2e: invokestatic org/v/r_2.a (Lorg/b_2;)Lorg/b_2;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokeinterface org/Y.U (Ljava/lang/String;Ljava/lang/String;Lorg/I;)V 4
      // 3a: return
   }

   private static org.b_2 a(org.b_2 var0) {
      return var0;
   }
}





