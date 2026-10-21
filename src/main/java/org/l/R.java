package org.l;

import java.util.Iterator;

class R implements Iterator {
   @org.F.c
   private Iterator G;
   final C K;

   R(C var1) {
      this.K = var1;
      this.G = C.K(this.K).iterator();
   }

   @Override
   public Object next() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/l/F.s ()Z
      // 03: aload 0
      // 04: getfield org/l/R.G Ljava/util/Iterator;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 52
      // 0e: ifnull 46
      // 11: goto 18
      // 14: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 2
      // 19: iload 1
      // 1a: ifeq 40
      // 1d: goto 24
      // 20: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 23: athrow
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 41
      // 2c: goto 33
      // 2f: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 32: athrow
      // 33: aload 2
      // 34: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39: goto 40
      // 3c: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 3f: athrow
      // 40: areturn
      // 41: aload 0
      // 42: aconst_null
      // 43: putfield org/l/R.G Ljava/util/Iterator;
      // 46: aload 0
      // 47: getfield org/l/R.K Lorg/l/C;
      // 4a: invokestatic org/l/C.R (Lorg/l/C;)Ljava/util/Iterator;
      // 4d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 52: astore 3
      // 53: aload 0
      // 54: getfield org/l/R.K Lorg/l/C;
      // 57: invokestatic org/l/C.K (Lorg/l/C;)Ljava/util/List;
      // 5a: aload 3
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 3
      // 62: areturn
   }

   @Override
   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/l/F.s ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield org/l/R.G Ljava/util/Iterator;
      // 08: iload 1
      // 09: ifeq 42
      // 0c: ifnull 34
      // 0f: goto 16
      // 12: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield org/l/R.G Ljava/util/Iterator;
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: iload 1
      // 20: ifeq 56
      // 23: goto 2a
      // 26: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 29: athrow
      // 2a: ifne 55
      // 2d: goto 34
      // 30: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield org/l/R.K Lorg/l/C;
      // 38: invokestatic org/l/C.R (Lorg/l/C;)Ljava/util/Iterator;
      // 3b: goto 42
      // 3e: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 41: athrow
      // 42: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 47: iload 1
      // 48: ifeq 56
      // 4b: ifeq 59
      // 4e: goto 55
      // 51: invokestatic org/l/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}





