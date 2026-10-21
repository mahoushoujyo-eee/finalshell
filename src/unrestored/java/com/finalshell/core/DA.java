package com.finalshell.core;

import java.util.Map;

public class DA implements Gn2_2 {
   public Map U;

   public DA(String[][] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic com/finalshell/core/D52_2.k ()Ljava/lang/String;
      // 07: aload 0
      // 08: aconst_null
      // 09: putfield com/finalshell/core/DA.U Ljava/util/Map;
      // 0c: astore 2
      // 0d: aload 2
      // 0e: ifnonnull 33
      // 11: aload 1
      // 12: ifnonnull 28
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: new java/lang/IllegalArgumentException
      // 1f: dup
      // 20: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: new java/util/HashMap
      // 2c: dup
      // 2d: invokespecial java/util/HashMap.<init> ()V
      // 30: putfield com/finalshell/core/DA.U Ljava/util/Map;
      // 33: bipush 0
      // 34: istore 3
      // 35: aload 2
      // 36: ifnull 67
      // 39: aload 1
      // 3a: iload 3
      // 3b: aaload
      // 3c: bipush 0
      // 3d: aaload
      // 3e: astore 4
      // 40: aload 4
      // 42: aload 2
      // 43: ifnonnull 63
      // 46: ifnull 64
      // 49: aload 0
      // 4a: getfield com/finalshell/core/DA.U Ljava/util/Map;
      // 4d: aload 4
      // 4f: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 52: aload 1
      // 53: iload 3
      // 54: aaload
      // 55: bipush 1
      // 56: aaload
      // 57: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: pop
      // 64: iinc 3 1
      // 67: iload 3
      // 68: aload 1
      // 69: arraylength
      // 6a: if_icmplt 39
      // 6d: return
   }

   @Override
   public boolean n(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D52_2.k ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnonnull 29
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/DA.U Ljava/util/Map;
      // 1d: aload 1
      // 1e: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 21: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 26: checkcast java/lang/String
      // 29: astore 4
      // 2b: aload 4
      // 2d: aload 3
      // 2e: ifnonnull 43
      // 31: ifnonnull 41
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: invokestatic com/finalshell/core/DA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 4
      // 43: aload 2
      // 44: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 47: ireturn
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}





