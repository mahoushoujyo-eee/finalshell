package com.finalshell.ui.model;

import com.finalshell.core.C_9;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class N implements Iterator {
   public final Stack i = new Stack();
   @C_9
   public Object S;
   public boolean M;

   public N(Iterator var1) {
      this.i.push(var1);
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
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/N.M Z
      // 08: iload 1
      // 09: ifeq 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial com/finalshell/ui/model/N.p ()Z
      // 1a: iload 1
      // 1b: ifeq 30
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
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
      // 00: invokestatic com/finalshell/core/F3_3.s ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/N.M Z
      // 08: iload 1
      // 09: ifeq 4e
      // 0c: ifne 3b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial com/finalshell/ui/model/N.p ()Z
      // 1a: iload 1
      // 1b: ifeq 4e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 24: athrow
      // 25: ifne 3b
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2e: athrow
      // 2f: new java/util/NoSuchElementException
      // 32: dup
      // 33: invokespecial java/util/NoSuchElementException.<init> ()V
      // 36: athrow
      // 37: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: iload 1
      // 3d: ifeq 7a
      // 40: bipush 0
      // 41: putfield com/finalshell/ui/model/N.M Z
      // 44: getstatic com/finalshell/ui/model/N.Y Z
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 4d: athrow
      // 4e: ifne 76
      // 51: aload 0
      // 52: getfield com/finalshell/ui/model/N.S Ljava/lang/Object;
      // 55: iload 1
      // 56: ifeq 7a
      // 59: goto 60
      // 5c: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 5f: athrow
      // 60: ifnonnull 76
      // 63: goto 6a
      // 66: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 69: athrow
      // 6a: new java/lang/AssertionError
      // 6d: dup
      // 6e: invokespecial java/lang/AssertionError.<init> ()V
      // 71: athrow
      // 72: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 75: athrow
      // 76: aload 0
      // 77: getfield com/finalshell/ui/model/N.S Ljava/lang/Object;
      // 7a: areturn
   }

   public boolean p() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/F3_3.s ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 008: invokevirtual java/util/Stack.empty ()Z
      // 00b: ifne 136
      // 00e: aload 0
      // 00f: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 012: invokevirtual java/util/Stack.peek ()Ljava/lang/Object;
      // 015: checkcast java/util/Iterator
      // 018: astore 2
      // 019: aload 2
      // 01a: iload 1
      // 01b: ifeq 051
      // 01e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 023: iload 1
      // 024: ifeq 137
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 02d: athrow
      // 02e: ifne 04b
      // 031: goto 038
      // 034: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 037: athrow
      // 038: aload 0
      // 039: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 03c: invokevirtual java/util/Stack.pop ()Ljava/lang/Object;
      // 03f: pop
      // 040: iload 1
      // 041: ifne 004
      // 044: goto 04b
      // 047: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 04a: athrow
      // 04b: aload 2
      // 04c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 051: astore 3
      // 052: aload 3
      // 053: instanceof java/util/Iterator
      // 056: iload 1
      // 057: ifeq 086
      // 05a: ifeq 07b
      // 05d: goto 064
      // 060: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 063: athrow
      // 064: aload 0
      // 065: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 068: aload 3
      // 069: checkcast java/util/Iterator
      // 06c: invokevirtual java/util/Stack.push (Ljava/lang/Object;)Ljava/lang/Object;
      // 06f: pop
      // 070: iload 1
      // 071: ifne 132
      // 074: goto 07b
      // 077: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 07a: athrow
      // 07b: aload 3
      // 07c: instanceof [Ljava/lang/Object;
      // 07f: goto 086
      // 082: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 085: athrow
      // 086: iload 1
      // 087: ifeq 0be
      // 08a: ifeq 0b3
      // 08d: goto 094
      // 090: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 093: athrow
      // 094: aload 0
      // 095: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 098: aload 3
      // 099: checkcast [Ljava/lang/Object;
      // 09c: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 09f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a4: invokevirtual java/util/Stack.push (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a7: pop
      // 0a8: iload 1
      // 0a9: ifne 132
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: instanceof java/util/Collection
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0bd: athrow
      // 0be: iload 1
      // 0bf: ifeq 0f3
      // 0c2: ifeq 0e8
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 0d0: aload 3
      // 0d1: checkcast java/util/Collection
      // 0d4: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0d9: invokevirtual java/util/Stack.push (Ljava/lang/Object;)Ljava/lang/Object;
      // 0dc: pop
      // 0dd: iload 1
      // 0de: ifne 132
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: instanceof java/util/Enumeration
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0f2: athrow
      // 0f3: iload 1
      // 0f4: ifeq 131
      // 0f7: ifeq 11f
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 100: athrow
      // 101: aload 0
      // 102: getfield com/finalshell/ui/model/N.i Ljava/util/Stack;
      // 105: new com/finalshell/ui/model/G_2
      // 108: dup
      // 109: aload 3
      // 10a: checkcast java/util/Enumeration
      // 10d: invokespecial com/finalshell/ui/model/G_2.<init> (Ljava/util/Enumeration;)V
      // 110: invokevirtual java/util/Stack.push (Ljava/lang/Object;)Ljava/lang/Object;
      // 113: pop
      // 114: iload 1
      // 115: ifne 132
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 11e: athrow
      // 11f: aload 0
      // 120: aload 3
      // 121: putfield com/finalshell/ui/model/N.S Ljava/lang/Object;
      // 124: aload 0
      // 125: bipush 1
      // 126: putfield com/finalshell/ui/model/N.M Z
      // 129: bipush 1
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/ui/model/N.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 130: athrow
      // 131: ireturn
      // 132: iload 1
      // 133: ifne 004
      // 136: bipush 0
      // 137: ireturn
   }

   @Override
   public void remove() {
      ((Iterator)this.i.peek()).remove();
   }

   static {
      __vfClinit__();
   }

   public static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      boolean Y;
      boolean var10000;
      label16: {
         try {
            if (!N.class.desiredAssertionStatus()) {
               var10000 = true;
               break label16;
            }
         } catch (NoSuchElementException var0) {
            throw a(var0);
         }

         var10000 = false;
      }

      Y = var10000;
   }
}





