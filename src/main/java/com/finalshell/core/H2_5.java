package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class H2_5 extends ClassLoader {
   final J_5 M;

   H2_5(ClassLoader var1, J_5 var2) {
      super(var1);
      this.M = var2;
   }

   @F_4(false)
   @Override
   public URL getResource(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/GO.B ()Z
      // 03: aload 0
      // 04: aload 1
      // 05: invokespecial java/lang/ClassLoader.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 1a
      // 0f: ifnull 1b
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 18: athrow
      // 19: aload 3
      // 1a: areturn
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/H2_5.M Lcom/finalshell/core/J_5;
      // 1f: aload 1
      // 20: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 23: astore 3
      // 24: aload 3
      // 25: iload 2
      // 26: ifne 3a
      // 29: ifnonnull 39
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 32: athrow
      // 33: aconst_null
      // 34: areturn
      // 35: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 38: athrow
      // 39: aload 3
      // 3a: iload 2
      // 3b: ifne 4c
      // 3e: instanceof com/finalshell/core/T_4
      // 41: ifeq 59
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: checkcast com/finalshell/core/T_4
      // 4f: invokeinterface com/finalshell/core/T_4.T ()Ljava/net/URL; 1
      // 54: areturn
      // 55: astore 4
      // 57: aconst_null
      // 58: areturn
      // 59: aconst_null
      // 5a: areturn
   }

   @F_4(false)
   @Override
   public InputStream getResourceAsStream(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/GO.B ()Z
      // 03: aload 0
      // 04: aload 1
      // 05: invokespecial java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 27
      // 0f: ifnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 18: athrow
      // 19: aload 3
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/H2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/H2_5.M Lcom/finalshell/core/J_5;
      // 23: aload 1
      // 24: invokevirtual com/finalshell/core/J_5.l (Ljava/lang/String;)Ljava/io/InputStream;
      // 27: areturn
      // 28: astore 3
      // 29: aconst_null
      // 2a: areturn
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





