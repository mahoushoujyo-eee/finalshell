package com.finalshell.core;

import java.io.IOException;

public class E_3_2 extends J_5 {
   public final W3_6 v;

   public E_3_2(W3_6 var1) {
      this.v = var1;
   }

   @C_9
   @Override
   public N_6 J(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: invokestatic com/finalshell/core/T_7.c ()Lcom/finalshell/core/T_7;
      // 07: invokevirtual com/finalshell/core/T_7.W ()Ljava/util/Set;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 11: astore 4
      // 13: aload 4
      // 15: aload 2
      // 16: ifnull 36
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 89
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/E_3_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 4
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/E_3_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: checkcast com/finalshell/core/D2_7
      // 39: astore 5
      // 3b: aload 5
      // 3d: invokevirtual com/finalshell/core/D2_7.H ()Lcom/finalshell/core/X3_2;
      // 40: invokevirtual com/finalshell/core/X3_2.l ()Ljava/lang/Object;
      // 43: checkcast java/net/URI
      // 46: astore 6
      // 48: new java/net/URL
      // 4b: dup
      // 4c: new java/lang/StringBuilder
      // 4f: dup
      // 50: invokespecial java/lang/StringBuilder.<init> ()V
      // 53: aload 6
      // 55: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 58: ldc "/"
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: aload 1
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 67: astore 7
      // 69: aload 7
      // 6b: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 6e: astore 8
      // 70: aload 8
      // 72: invokevirtual java/net/URLConnection.connect ()V
      // 75: new com/finalshell/core/Rt2
      // 78: dup
      // 79: aload 0
      // 7a: aload 8
      // 7c: aload 6
      // 7e: aload 1
      // 7f: invokespecial com/finalshell/core/Rt2.<init> (Lcom/finalshell/core/E_3_2;Ljava/net/URLConnection;Ljava/net/URI;Ljava/lang/String;)V
      // 82: areturn
      // 83: astore 9
      // 85: aload 2
      // 86: ifnonnull 13
      // 89: aconst_null
      // 8a: areturn
      // 8b: astore 3
      // 8c: new java/lang/AssertionError
      // 8f: dup
      // 90: aload 3
      // 91: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 94: athrow
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





