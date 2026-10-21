package com.finalshell.core;

public class OM3 implements A0_2 {
   public static OM3 f;

   @Override
   public Object Y(Ph4 param1, Object param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 5
      // 06: astore 4
      // 08: aload 3
      // 09: aload 4
      // 0b: ifnonnull 23
      // 0e: instanceof java/util/Collection
      // 11: ifeq b3
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1a: athrow
      // 1b: aload 3
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 22: athrow
      // 23: checkcast java/util/Collection
      // 26: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2b: astore 6
      // 2d: aload 6
      // 2f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 34: ifeq b0
      // 37: aload 6
      // 39: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3e: astore 7
      // 40: aload 7
      // 42: aload 4
      // 44: ifnonnull bd
      // 47: aload 4
      // 49: ifnonnull 6b
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 52: athrow
      // 53: ifnonnull 69
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5c: athrow
      // 5d: aload 4
      // 5f: ifnull 2d
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 68: athrow
      // 69: aload 5
      // 6b: aload 4
      // 6d: ifnonnull 8c
      // 70: ifnonnull 83
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 79: athrow
      // 7a: aload 7
      // 7c: astore 5
      // 7e: aload 4
      // 80: ifnull ab
      // 83: aload 5
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 8b: athrow
      // 8c: aload 4
      // 8e: ifnonnull a9
      // 91: aload 7
      // 93: invokestatic com/finalshell/core/Ph4.x (Ljava/lang/Object;Ljava/lang/Object;)I
      // 96: ifge ab
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 9f: athrow
      // a0: aload 7
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/OM3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // a8: athrow
      // a9: astore 5
      // ab: aload 4
      // ad: ifnull 2d
      // b0: goto bb
      // b3: new java/lang/UnsupportedOperationException
      // b6: dup
      // b7: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // ba: athrow
      // bb: aload 5
      // bd: areturn
   }

   @Override
   public void Z(Ph4 var1, Yn4 var2, KE var3) {
      throw new UnsupportedOperationException();
   }

   static {
      __vfClinit__();
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      f = new OM3();
   }
}





