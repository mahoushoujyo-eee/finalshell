package org.v;

import java.io.IOException;
import org.V.J;

class E_3 extends J {
   final W_3 v;

   E_3(W_3 var1) {
      this.v = var1;
   }

   @org.F.c
   @Override
   public org.V.N J(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: invokestatic org/z/t.c ()Lorg/z/t;
      // 07: invokevirtual org/z/t.W ()Ljava/util/Set;
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
      // 24: invokestatic org/v/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 4
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: goto 36
      // 32: invokestatic org/v/E_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: checkcast org/z/D
      // 39: astore 5
      // 3b: aload 5
      // 3d: invokevirtual org/z/D.H ()Lorg/h/x_3;
      // 40: invokevirtual org/h/x_3.l ()Ljava/lang/Object;
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
      // 75: new org/v/Rt_2
      // 78: dup
      // 79: aload 0
      // 7a: aload 8
      // 7c: aload 6
      // 7e: aload 1
      // 7f: invokespecial org/v/Rt_2.<init> (Lorg/v/E_3;Ljava/net/URLConnection;Ljava/net/URI;Ljava/lang/String;)V
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

   private static IOException a(IOException var0) {
      return var0;
   }
}





