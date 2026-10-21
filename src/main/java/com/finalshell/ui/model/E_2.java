package com.finalshell.ui.model;

import com.finalshell.core.A_4;
import com.finalshell.core.C_9;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class E_2 implements Iterator {
   public M_2 K;
   @C_9
   public Object h;
   public final Iterator n;
   public final A_4 C;

   public E_2(Iterator var1, A_4 var2) {
      this.n = var1;
      this.C = var2;
      this.K = M_2.DEFAULT;
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
      // 00: invokestatic com/finalshell/core/F3_3.s ()Z
      // 03: istore 1
      // 04: getstatic com/finalshell/core/F_2_4.O [I
      // 07: aload 0
      // 08: getfield com/finalshell/ui/model/E_2.K Lcom/finalshell/ui/model/M_2;
      // 0b: invokevirtual com/finalshell/ui/model/M_2.ordinal ()I
      // 0e: iaload
      // 0f: iload 1
      // 10: ifeq 40
      // 13: tableswitch 131 1 3 29 127 129
      // 2c: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/finalshell/ui/model/E_2.n Ljava/util/Iterator;
      // 34: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3f: athrow
      // 40: ifeq 89
      // 43: aload 0
      // 44: getfield com/finalshell/ui/model/E_2.n Ljava/util/Iterator;
      // 47: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4c: astore 2
      // 4d: aload 0
      // 4e: getfield com/finalshell/ui/model/E_2.C Lcom/finalshell/core/A_4;
      // 51: aload 2
      // 52: invokeinterface com/finalshell/core/A_4.k (Ljava/lang/Object;)Z 2
      // 57: iload 1
      // 58: ifeq 91
      // 5b: iload 1
      // 5c: ifeq 84
      // 5f: goto 66
      // 62: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 65: athrow
      // 66: ifeq 85
      // 69: goto 70
      // 6c: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: putfield com/finalshell/ui/model/E_2.h Ljava/lang/Object;
      // 75: aload 0
      // 76: getstatic com/finalshell/ui/model/M_2.READ_AHEAD Lcom/finalshell/ui/model/M_2;
      // 79: putfield com/finalshell/ui/model/E_2.K Lcom/finalshell/ui/model/M_2;
      // 7c: bipush 1
      // 7d: goto 84
      // 80: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 83: athrow
      // 84: ireturn
      // 85: iload 1
      // 86: ifne 30
      // 89: aload 0
      // 8a: getstatic com/finalshell/ui/model/M_2.AT_END Lcom/finalshell/ui/model/M_2;
      // 8d: putfield com/finalshell/ui/model/E_2.K Lcom/finalshell/ui/model/M_2;
      // 90: bipush 0
      // 91: ireturn
      // 92: bipush 1
      // 93: ireturn
      // 94: bipush 0
      // 95: ireturn
      // 96: new java/lang/AssertionError
      // 99: dup
      // 9a: aload 0
      // 9b: getfield com/finalshell/ui/model/E_2.K Lcom/finalshell/ui/model/M_2;
      // 9e: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // a1: athrow
   }

   @C_9
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
      // 00: invokestatic com/finalshell/core/F3_3.G ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2d
      // 09: invokevirtual com/finalshell/ui/model/E_2.hasNext ()Z
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 15: athrow
      // 16: new java/util/NoSuchElementException
      // 19: dup
      // 1a: invokespecial java/util/NoSuchElementException.<init> ()V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/ui/model/E_2.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 21: athrow
      // 22: aload 0
      // 23: getstatic com/finalshell/ui/model/M_2.DEFAULT Lcom/finalshell/ui/model/M_2;
      // 26: putfield com/finalshell/ui/model/E_2.K Lcom/finalshell/ui/model/M_2;
      // 29: aload 0
      // 2a: getfield com/finalshell/ui/model/E_2.h Ljava/lang/Object;
      // 2d: astore 2
      // 2e: aload 0
      // 2f: aconst_null
      // 30: putfield com/finalshell/ui/model/E_2.h Ljava/lang/Object;
      // 33: aload 2
      // 34: areturn
   }

   @Override
   public void remove() {
      this.n.remove();
   }

   public static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}





