package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

class aN implements LayoutManager {
   public static String I;
   public static String v;
   public static String Q;
   private Component n;
   private Component Y;
   private Component T;
   private static final String[] a;
   private static final String[] b;

   private aN() {
   }

   @Override
   public void addLayoutComponent(String param1, Component param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: istore 3
      // 04: getstatic com/aN.I Ljava/lang/String;
      // 07: aload 1
      // 08: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b: iload 3
      // 0c: ifne 37
      // 0f: ifeq 29
      // 12: goto 19
      // 15: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 2
      // 1b: putfield com/aN.n Ljava/awt/Component;
      // 1e: iload 3
      // 1f: ifeq 9c
      // 22: goto 29
      // 25: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: getstatic com/aN.Q Ljava/lang/String;
      // 2c: aload 1
      // 2d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30: goto 37
      // 33: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: iload 3
      // 38: ifne 63
      // 3b: ifeq 55
      // 3e: goto 45
      // 41: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: aload 0
      // 46: aload 2
      // 47: putfield com/aN.T Ljava/awt/Component;
      // 4a: iload 3
      // 4b: ifeq 9c
      // 4e: goto 55
      // 51: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: getstatic com/aN.v Ljava/lang/String;
      // 58: aload 1
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: goto 63
      // 5f: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: ifeq 76
      // 66: aload 0
      // 67: aload 2
      // 68: putfield com/aN.Y Ljava/awt/Component;
      // 6b: iload 3
      // 6c: ifeq 9c
      // 6f: goto 76
      // 72: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 75: athrow
      // 76: new java/lang/IllegalArgumentException
      // 79: dup
      // 7a: new java/lang/StringBuilder
      // 7d: dup
      // 7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 81: sipush -32378
      // 84: sipush -11121
      // 87: invokestatic com/aN.a (II)Ljava/lang/String;
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: aload 1
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 94: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 97: athrow
      // 98: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9b: athrow
      // 9c: return
   }

   @Override
   public void removeLayoutComponent(Component param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield com/aN.n Ljava/awt/Component;
      // 09: iload 2
      // 0a: ifeq 28
      // 0d: if_acmpne 23
      // 10: goto 17
      // 13: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: aload 0
      // 18: aconst_null
      // 19: putfield com/aN.n Ljava/awt/Component;
      // 1c: goto 23
      // 1f: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 1
      // 24: aload 0
      // 25: getfield com/aN.Y Ljava/awt/Component;
      // 28: iload 2
      // 29: ifeq 47
      // 2c: if_acmpne 42
      // 2f: goto 36
      // 32: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 0
      // 37: aconst_null
      // 38: putfield com/aN.Y Ljava/awt/Component;
      // 3b: goto 42
      // 3e: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 1
      // 43: aload 0
      // 44: getfield com/aN.T Ljava/awt/Component;
      // 47: if_acmpne 56
      // 4a: aload 0
      // 4b: aconst_null
      // 4c: putfield com/aN.T Ljava/awt/Component;
      // 4f: goto 56
      // 52: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55: athrow
      // 56: return
   }

   @Override
   public Dimension preferredLayoutSize(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.M ()I
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getTreeLock ()Ljava/lang/Object;
      // 007: dup
      // 008: astore 3
      // 009: monitorenter
      // 00a: istore 2
      // 00b: new java/awt/Dimension
      // 00e: dup
      // 00f: bipush 0
      // 010: bipush 0
      // 011: invokespecial java/awt/Dimension.<init> (II)V
      // 014: astore 4
      // 016: aload 0
      // 017: getfield com/aN.n Ljava/awt/Component;
      // 01a: iload 2
      // 01b: ifeq 059
      // 01e: ifnull 055
      // 021: goto 028
      // 024: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/aN.n Ljava/awt/Component;
      // 02c: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 02f: astore 5
      // 031: aload 4
      // 033: aload 5
      // 035: getfield java/awt/Dimension.width I
      // 038: aload 4
      // 03a: getfield java/awt/Dimension.width I
      // 03d: invokestatic java/lang/Math.max (II)I
      // 040: putfield java/awt/Dimension.width I
      // 043: aload 4
      // 045: aload 5
      // 047: getfield java/awt/Dimension.height I
      // 04a: aload 4
      // 04c: getfield java/awt/Dimension.height I
      // 04f: invokestatic java/lang/Math.max (II)I
      // 052: putfield java/awt/Dimension.height I
      // 055: aload 0
      // 056: getfield com/aN.Y Ljava/awt/Component;
      // 059: iload 2
      // 05a: ifeq 095
      // 05d: ifnull 091
      // 060: goto 067
      // 063: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 066: athrow
      // 067: aload 0
      // 068: getfield com/aN.Y Ljava/awt/Component;
      // 06b: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 06e: astore 5
      // 070: aload 4
      // 072: dup
      // 073: getfield java/awt/Dimension.width I
      // 076: aload 5
      // 078: getfield java/awt/Dimension.width I
      // 07b: iadd
      // 07c: putfield java/awt/Dimension.width I
      // 07f: aload 4
      // 081: aload 5
      // 083: getfield java/awt/Dimension.height I
      // 086: aload 4
      // 088: getfield java/awt/Dimension.height I
      // 08b: invokestatic java/lang/Math.max (II)I
      // 08e: putfield java/awt/Dimension.height I
      // 091: aload 0
      // 092: getfield com/aN.T Ljava/awt/Component;
      // 095: iload 2
      // 096: ifeq 0ae
      // 099: ifnull 0d7
      // 09c: goto 0a3
      // 09f: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield com/aN.T Ljava/awt/Component;
      // 0a7: goto 0ae
      // 0aa: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 0b1: astore 5
      // 0b3: aload 4
      // 0b5: aload 5
      // 0b7: getfield java/awt/Dimension.width I
      // 0ba: aload 4
      // 0bc: getfield java/awt/Dimension.width I
      // 0bf: invokestatic java/lang/Math.max (II)I
      // 0c2: putfield java/awt/Dimension.width I
      // 0c5: aload 4
      // 0c7: aload 5
      // 0c9: getfield java/awt/Dimension.height I
      // 0cc: aload 4
      // 0ce: getfield java/awt/Dimension.height I
      // 0d1: invokestatic java/lang/Math.max (II)I
      // 0d4: putfield java/awt/Dimension.height I
      // 0d7: aload 1
      // 0d8: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 0db: astore 5
      // 0dd: aload 4
      // 0df: dup
      // 0e0: getfield java/awt/Dimension.width I
      // 0e3: aload 5
      // 0e5: getfield java/awt/Insets.left I
      // 0e8: aload 5
      // 0ea: getfield java/awt/Insets.right I
      // 0ed: iadd
      // 0ee: iadd
      // 0ef: putfield java/awt/Dimension.width I
      // 0f2: aload 4
      // 0f4: dup
      // 0f5: getfield java/awt/Dimension.height I
      // 0f8: aload 5
      // 0fa: getfield java/awt/Insets.top I
      // 0fd: aload 5
      // 0ff: getfield java/awt/Insets.bottom I
      // 102: iadd
      // 103: iadd
      // 104: putfield java/awt/Dimension.height I
      // 107: aload 4
      // 109: aload 3
      // 10a: monitorexit
      // 10b: areturn
      // 10c: astore 6
      // 10e: aload 3
      // 10f: monitorexit
      // 110: aload 6
      // 112: athrow
   }

   @Override
   public Dimension minimumLayoutSize(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/_y_2.y ()I
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getTreeLock ()Ljava/lang/Object;
      // 007: dup
      // 008: astore 3
      // 009: monitorenter
      // 00a: istore 2
      // 00b: new java/awt/Dimension
      // 00e: dup
      // 00f: bipush 0
      // 010: bipush 0
      // 011: invokespecial java/awt/Dimension.<init> (II)V
      // 014: astore 4
      // 016: aload 0
      // 017: getfield com/aN.n Ljava/awt/Component;
      // 01a: iload 2
      // 01b: ifne 059
      // 01e: ifnull 055
      // 021: goto 028
      // 024: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/aN.n Ljava/awt/Component;
      // 02c: invokevirtual java/awt/Component.getMinimumSize ()Ljava/awt/Dimension;
      // 02f: astore 5
      // 031: aload 4
      // 033: aload 5
      // 035: getfield java/awt/Dimension.width I
      // 038: aload 4
      // 03a: getfield java/awt/Dimension.width I
      // 03d: invokestatic java/lang/Math.max (II)I
      // 040: putfield java/awt/Dimension.width I
      // 043: aload 4
      // 045: aload 5
      // 047: getfield java/awt/Dimension.height I
      // 04a: aload 4
      // 04c: getfield java/awt/Dimension.height I
      // 04f: invokestatic java/lang/Math.max (II)I
      // 052: putfield java/awt/Dimension.height I
      // 055: aload 0
      // 056: getfield com/aN.Y Ljava/awt/Component;
      // 059: iload 2
      // 05a: ifne 095
      // 05d: ifnull 091
      // 060: goto 067
      // 063: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 066: athrow
      // 067: aload 0
      // 068: getfield com/aN.Y Ljava/awt/Component;
      // 06b: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 06e: astore 5
      // 070: aload 4
      // 072: dup
      // 073: getfield java/awt/Dimension.width I
      // 076: aload 5
      // 078: getfield java/awt/Dimension.width I
      // 07b: iadd
      // 07c: putfield java/awt/Dimension.width I
      // 07f: aload 4
      // 081: aload 5
      // 083: getfield java/awt/Dimension.height I
      // 086: aload 4
      // 088: getfield java/awt/Dimension.height I
      // 08b: invokestatic java/lang/Math.max (II)I
      // 08e: putfield java/awt/Dimension.height I
      // 091: aload 0
      // 092: getfield com/aN.T Ljava/awt/Component;
      // 095: iload 2
      // 096: ifne 0ae
      // 099: ifnull 0d7
      // 09c: goto 0a3
      // 09f: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield com/aN.T Ljava/awt/Component;
      // 0a7: goto 0ae
      // 0aa: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: invokevirtual java/awt/Component.getMinimumSize ()Ljava/awt/Dimension;
      // 0b1: astore 5
      // 0b3: aload 4
      // 0b5: aload 5
      // 0b7: getfield java/awt/Dimension.width I
      // 0ba: aload 4
      // 0bc: getfield java/awt/Dimension.width I
      // 0bf: invokestatic java/lang/Math.max (II)I
      // 0c2: putfield java/awt/Dimension.width I
      // 0c5: aload 4
      // 0c7: aload 5
      // 0c9: getfield java/awt/Dimension.height I
      // 0cc: aload 4
      // 0ce: getfield java/awt/Dimension.height I
      // 0d1: invokestatic java/lang/Math.max (II)I
      // 0d4: putfield java/awt/Dimension.height I
      // 0d7: aload 1
      // 0d8: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 0db: astore 5
      // 0dd: aload 4
      // 0df: dup
      // 0e0: getfield java/awt/Dimension.width I
      // 0e3: aload 5
      // 0e5: getfield java/awt/Insets.left I
      // 0e8: aload 5
      // 0ea: getfield java/awt/Insets.right I
      // 0ed: iadd
      // 0ee: iadd
      // 0ef: putfield java/awt/Dimension.width I
      // 0f2: aload 4
      // 0f4: dup
      // 0f5: getfield java/awt/Dimension.height I
      // 0f8: aload 5
      // 0fa: getfield java/awt/Insets.top I
      // 0fd: aload 5
      // 0ff: getfield java/awt/Insets.bottom I
      // 102: iadd
      // 103: iadd
      // 104: putfield java/awt/Dimension.height I
      // 107: aload 4
      // 109: aload 3
      // 10a: monitorexit
      // 10b: areturn
      // 10c: astore 6
      // 10e: aload 3
      // 10f: monitorexit
      // 110: aload 6
      // 112: athrow
   }

   @Override
   public void layoutContainer(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.M ()I
      // 03: aload 1
      // 04: invokevirtual java/awt/Container.getTreeLock ()Ljava/lang/Object;
      // 07: dup
      // 08: astore 3
      // 09: monitorenter
      // 0a: istore 2
      // 0b: aload 1
      // 0c: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 0f: astore 4
      // 11: aload 4
      // 13: getfield java/awt/Insets.top I
      // 16: istore 5
      // 18: aload 1
      // 19: invokevirtual java/awt/Container.getHeight ()I
      // 1c: aload 4
      // 1e: getfield java/awt/Insets.bottom I
      // 21: isub
      // 22: istore 6
      // 24: aload 4
      // 26: getfield java/awt/Insets.left I
      // 29: istore 7
      // 2b: aload 1
      // 2c: invokevirtual java/awt/Container.getWidth ()I
      // 2f: aload 4
      // 31: getfield java/awt/Insets.right I
      // 34: isub
      // 35: istore 8
      // 37: new java/awt/Dimension
      // 3a: dup
      // 3b: bipush 0
      // 3c: bipush 0
      // 3d: invokespecial java/awt/Dimension.<init> (II)V
      // 40: astore 9
      // 42: aload 0
      // 43: getfield com/aN.Y Ljava/awt/Component;
      // 46: iload 2
      // 47: ifeq 7c
      // 4a: ifnull 78
      // 4d: goto 54
      // 50: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/aN.Y Ljava/awt/Component;
      // 58: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 5b: astore 9
      // 5d: aload 0
      // 5e: getfield com/aN.Y Ljava/awt/Component;
      // 61: iload 8
      // 63: aload 9
      // 65: getfield java/awt/Dimension.width I
      // 68: isub
      // 69: iload 5
      // 6b: aload 9
      // 6d: getfield java/awt/Dimension.width I
      // 70: iload 6
      // 72: iload 5
      // 74: isub
      // 75: invokevirtual java/awt/Component.setBounds (IIII)V
      // 78: aload 0
      // 79: getfield com/aN.n Ljava/awt/Component;
      // 7c: iload 2
      // 7d: ifeq b0
      // 80: ifnull ac
      // 83: goto 8a
      // 86: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: aload 0
      // 8b: getfield com/aN.n Ljava/awt/Component;
      // 8e: iload 7
      // 90: iload 5
      // 92: iload 8
      // 94: iload 7
      // 96: isub
      // 97: aload 9
      // 99: getfield java/awt/Dimension.width I
      // 9c: isub
      // 9d: iload 6
      // 9f: iload 5
      // a1: isub
      // a2: invokevirtual java/awt/Component.setBounds (IIII)V
      // a5: goto ac
      // a8: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab: athrow
      // ac: aload 0
      // ad: getfield com/aN.T Ljava/awt/Component;
      // b0: iload 2
      // b1: ifeq e9
      // b4: ifnull e8
      // b7: goto be
      // ba: invokestatic com/aN.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bd: athrow
      // be: aload 0
      // bf: getfield com/aN.T Ljava/awt/Component;
      // c2: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // c5: astore 10
      // c7: aload 0
      // c8: getfield com/aN.T Ljava/awt/Component;
      // cb: iload 8
      // cd: aload 10
      // cf: getfield java/awt/Dimension.width I
      // d2: isub
      // d3: aload 9
      // d5: getfield java/awt/Dimension.width I
      // d8: isub
      // d9: iload 5
      // db: aload 10
      // dd: getfield java/awt/Dimension.width I
      // e0: aload 10
      // e2: getfield java/awt/Dimension.height I
      // e5: invokevirtual java/awt/Component.setBounds (IIII)V
      // e8: aload 3
      // e9: monitorexit
      // ea: goto f4
      // ed: astore 11
      // ef: aload 3
      // f0: monitorexit
      // f1: aload 11
      // f3: athrow
      // f4: return
   }

   aN(rb_4 var1) {
      this();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "÷\u0090î0Æ¤ÇÁ\u0088Ó\u009cúJ¼BêU1L\u0015´fÆ\u0006»\u0086¼[±÷";
      int var4 = "÷\u0090î0Æ¤ÇÁ\u0088Ó\u009cúJ¼BêU1L\u0015´fÆ\u0006»\u0086¼[±÷".length();
      char var1 = 23;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 10;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 12;
                        break;
                     case 1:
                        var46 = 61;
                        break;
                     case 2:
                        var46 = 106;
                        break;
                     case 3:
                        var46 = 3;
                        break;
                     case 4:
                        var46 = 116;
                        break;
                     case 5:
                        var46 = 93;
                        break;
                     default:
                        var46 = 54;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[4];
                     I = a(-32379, 28788);
                     v = a(-32377, -31102);
                     Q = a(-32380, -25637);
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0010nQ5\b\u009c¸\u008ck\u0081\u0082ÑD";
                  var4 = "\u0010nQ5\b\u009c¸\u008ck\u0081\u0082ÑD".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 27;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32378) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 241;
               break;
            case 1:
               var10000 = 195;
               break;
            case 2:
               var10000 = 73;
               break;
            case 3:
               var10000 = 171;
               break;
            case 4:
               var10000 = 237;
               break;
            case 5:
               var10000 = 63;
               break;
            case 6:
               var10000 = 157;
               break;
            case 7:
               var10000 = 154;
               break;
            case 8:
               var10000 = 229;
               break;
            case 9:
               var10000 = 38;
               break;
            case 10:
               var10000 = 246;
               break;
            case 11:
               var10000 = 64;
               break;
            case 12:
               var10000 = 60;
               break;
            case 13:
               var10000 = 172;
               break;
            case 14:
               var10000 = 27;
               break;
            case 15:
               var10000 = 228;
               break;
            case 16:
               var10000 = 50;
               break;
            case 17:
               var10000 = 211;
               break;
            case 18:
               var10000 = 185;
               break;
            case 19:
               var10000 = 175;
               break;
            case 20:
               var10000 = 191;
               break;
            case 21:
               var10000 = 181;
               break;
            case 22:
               var10000 = 158;
               break;
            case 23:
               var10000 = 36;
               break;
            case 24:
               var10000 = 186;
               break;
            case 25:
               var10000 = 209;
               break;
            case 26:
               var10000 = 133;
               break;
            case 27:
               var10000 = 34;
               break;
            case 28:
               var10000 = 13;
               break;
            case 29:
               var10000 = 164;
               break;
            case 30:
               var10000 = 9;
               break;
            case 31:
               var10000 = 222;
               break;
            case 32:
               var10000 = 77;
               break;
            case 33:
               var10000 = 253;
               break;
            case 34:
               var10000 = 99;
               break;
            case 35:
               var10000 = 167;
               break;
            case 36:
               var10000 = 193;
               break;
            case 37:
               var10000 = 212;
               break;
            case 38:
               var10000 = 197;
               break;
            case 39:
               var10000 = 183;
               break;
            case 40:
               var10000 = 132;
               break;
            case 41:
               var10000 = 155;
               break;
            case 42:
               var10000 = 4;
               break;
            case 43:
               var10000 = 239;
               break;
            case 44:
               var10000 = 86;
               break;
            case 45:
               var10000 = 131;
               break;
            case 46:
               var10000 = 189;
               break;
            case 47:
               var10000 = 169;
               break;
            case 48:
               var10000 = 81;
               break;
            case 49:
               var10000 = 121;
               break;
            case 50:
               var10000 = 173;
               break;
            case 51:
               var10000 = 199;
               break;
            case 52:
               var10000 = 45;
               break;
            case 53:
               var10000 = 103;
               break;
            case 54:
               var10000 = 8;
               break;
            case 55:
               var10000 = 142;
               break;
            case 56:
               var10000 = 37;
               break;
            case 57:
               var10000 = 20;
               break;
            case 58:
               var10000 = 240;
               break;
            case 59:
               var10000 = 177;
               break;
            case 60:
               var10000 = 65;
               break;
            case 61:
               var10000 = 179;
               break;
            case 62:
               var10000 = 140;
               break;
            case 63:
               var10000 = 139;
               break;
            case 64:
               var10000 = 162;
               break;
            case 65:
               var10000 = 57;
               break;
            case 66:
               var10000 = 112;
               break;
            case 67:
               var10000 = 138;
               break;
            case 68:
               var10000 = 46;
               break;
            case 69:
               var10000 = 224;
               break;
            case 70:
               var10000 = 61;
               break;
            case 71:
               var10000 = 201;
               break;
            case 72:
               var10000 = 135;
               break;
            case 73:
               var10000 = 251;
               break;
            case 74:
               var10000 = 69;
               break;
            case 75:
               var10000 = 26;
               break;
            case 76:
               var10000 = 49;
               break;
            case 77:
               var10000 = 190;
               break;
            case 78:
               var10000 = 110;
               break;
            case 79:
               var10000 = 152;
               break;
            case 80:
               var10000 = 113;
               break;
            case 81:
               var10000 = 67;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 198;
               break;
            case 84:
               var10000 = 206;
               break;
            case 85:
               var10000 = 89;
               break;
            case 86:
               var10000 = 95;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 105;
               break;
            case 89:
               var10000 = 84;
               break;
            case 90:
               var10000 = 7;
               break;
            case 91:
               var10000 = 51;
               break;
            case 92:
               var10000 = 78;
               break;
            case 93:
               var10000 = 170;
               break;
            case 94:
               var10000 = 18;
               break;
            case 95:
               var10000 = 97;
               break;
            case 96:
               var10000 = 66;
               break;
            case 97:
               var10000 = 176;
               break;
            case 98:
               var10000 = 44;
               break;
            case 99:
               var10000 = 19;
               break;
            case 100:
               var10000 = 202;
               break;
            case 101:
               var10000 = 76;
               break;
            case 102:
               var10000 = 245;
               break;
            case 103:
               var10000 = 52;
               break;
            case 104:
               var10000 = 17;
               break;
            case 105:
               var10000 = 232;
               break;
            case 106:
               var10000 = 91;
               break;
            case 107:
               var10000 = 56;
               break;
            case 108:
               var10000 = 116;
               break;
            case 109:
               var10000 = 161;
               break;
            case 110:
               var10000 = 207;
               break;
            case 111:
               var10000 = 184;
               break;
            case 112:
               var10000 = 0;
               break;
            case 113:
               var10000 = 16;
               break;
            case 114:
               var10000 = 32;
               break;
            case 115:
               var10000 = 62;
               break;
            case 116:
               var10000 = 216;
               break;
            case 117:
               var10000 = 192;
               break;
            case 118:
               var10000 = 200;
               break;
            case 119:
               var10000 = 115;
               break;
            case 120:
               var10000 = 2;
               break;
            case 121:
               var10000 = 208;
               break;
            case 122:
               var10000 = 3;
               break;
            case 123:
               var10000 = 217;
               break;
            case 124:
               var10000 = 159;
               break;
            case 125:
               var10000 = 134;
               break;
            case 126:
               var10000 = 124;
               break;
            case 127:
               var10000 = 80;
               break;
            case 128:
               var10000 = 28;
               break;
            case 129:
               var10000 = 160;
               break;
            case 130:
               var10000 = 196;
               break;
            case 131:
               var10000 = 53;
               break;
            case 132:
               var10000 = 234;
               break;
            case 133:
               var10000 = 107;
               break;
            case 134:
               var10000 = 21;
               break;
            case 135:
               var10000 = 194;
               break;
            case 136:
               var10000 = 48;
               break;
            case 137:
               var10000 = 79;
               break;
            case 138:
               var10000 = 55;
               break;
            case 139:
               var10000 = 149;
               break;
            case 140:
               var10000 = 122;
               break;
            case 141:
               var10000 = 136;
               break;
            case 142:
               var10000 = 150;
               break;
            case 143:
               var10000 = 168;
               break;
            case 144:
               var10000 = 163;
               break;
            case 145:
               var10000 = 22;
               break;
            case 146:
               var10000 = 145;
               break;
            case 147:
               var10000 = 182;
               break;
            case 148:
               var10000 = 90;
               break;
            case 149:
               var10000 = 58;
               break;
            case 150:
               var10000 = 101;
               break;
            case 151:
               var10000 = 111;
               break;
            case 152:
               var10000 = 231;
               break;
            case 153:
               var10000 = 30;
               break;
            case 154:
               var10000 = 59;
               break;
            case 155:
               var10000 = 227;
               break;
            case 156:
               var10000 = 225;
               break;
            case 157:
               var10000 = 235;
               break;
            case 158:
               var10000 = 247;
               break;
            case 159:
               var10000 = 220;
               break;
            case 160:
               var10000 = 39;
               break;
            case 161:
               var10000 = 126;
               break;
            case 162:
               var10000 = 87;
               break;
            case 163:
               var10000 = 106;
               break;
            case 164:
               var10000 = 213;
               break;
            case 165:
               var10000 = 178;
               break;
            case 166:
               var10000 = 104;
               break;
            case 167:
               var10000 = 146;
               break;
            case 168:
               var10000 = 242;
               break;
            case 169:
               var10000 = 205;
               break;
            case 170:
               var10000 = 188;
               break;
            case 171:
               var10000 = 102;
               break;
            case 172:
               var10000 = 68;
               break;
            case 173:
               var10000 = 233;
               break;
            case 174:
               var10000 = 119;
               break;
            case 175:
               var10000 = 254;
               break;
            case 176:
               var10000 = 12;
               break;
            case 177:
               var10000 = 130;
               break;
            case 178:
               var10000 = 88;
               break;
            case 179:
               var10000 = 41;
               break;
            case 180:
               var10000 = 129;
               break;
            case 181:
               var10000 = 147;
               break;
            case 182:
               var10000 = 35;
               break;
            case 183:
               var10000 = 174;
               break;
            case 184:
               var10000 = 117;
               break;
            case 185:
               var10000 = 109;
               break;
            case 186:
               var10000 = 219;
               break;
            case 187:
               var10000 = 83;
               break;
            case 188:
               var10000 = 244;
               break;
            case 189:
               var10000 = 148;
               break;
            case 190:
               var10000 = 82;
               break;
            case 191:
               var10000 = 204;
               break;
            case 192:
               var10000 = 72;
               break;
            case 193:
               var10000 = 137;
               break;
            case 194:
               var10000 = 93;
               break;
            case 195:
               var10000 = 24;
               break;
            case 196:
               var10000 = 42;
               break;
            case 197:
               var10000 = 96;
               break;
            case 198:
               var10000 = 236;
               break;
            case 199:
               var10000 = 143;
               break;
            case 200:
               var10000 = 40;
               break;
            case 201:
               var10000 = 114;
               break;
            case 202:
               var10000 = 238;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 15;
               break;
            case 205:
               var10000 = 128;
               break;
            case 206:
               var10000 = 43;
               break;
            case 207:
               var10000 = 230;
               break;
            case 208:
               var10000 = 210;
               break;
            case 209:
               var10000 = 6;
               break;
            case 210:
               var10000 = 141;
               break;
            case 211:
               var10000 = 223;
               break;
            case 212:
               var10000 = 94;
               break;
            case 213:
               var10000 = 31;
               break;
            case 214:
               var10000 = 123;
               break;
            case 215:
               var10000 = 98;
               break;
            case 216:
               var10000 = 156;
               break;
            case 217:
               var10000 = 70;
               break;
            case 218:
               var10000 = 75;
               break;
            case 219:
               var10000 = 10;
               break;
            case 220:
               var10000 = 25;
               break;
            case 221:
               var10000 = 108;
               break;
            case 222:
               var10000 = 151;
               break;
            case 223:
               var10000 = 165;
               break;
            case 224:
               var10000 = 29;
               break;
            case 225:
               var10000 = 14;
               break;
            case 226:
               var10000 = 120;
               break;
            case 227:
               var10000 = 203;
               break;
            case 228:
               var10000 = 125;
               break;
            case 229:
               var10000 = 85;
               break;
            case 230:
               var10000 = 248;
               break;
            case 231:
               var10000 = 214;
               break;
            case 232:
               var10000 = 252;
               break;
            case 233:
               var10000 = 23;
               break;
            case 234:
               var10000 = 218;
               break;
            case 235:
               var10000 = 118;
               break;
            case 236:
               var10000 = 71;
               break;
            case 237:
               var10000 = 243;
               break;
            case 238:
               var10000 = 1;
               break;
            case 239:
               var10000 = 255;
               break;
            case 240:
               var10000 = 187;
               break;
            case 241:
               var10000 = 11;
               break;
            case 242:
               var10000 = 144;
               break;
            case 243:
               var10000 = 215;
               break;
            case 244:
               var10000 = 54;
               break;
            case 245:
               var10000 = 226;
               break;
            case 246:
               var10000 = 92;
               break;
            case 247:
               var10000 = 33;
               break;
            case 248:
               var10000 = 47;
               break;
            case 249:
               var10000 = 74;
               break;
            case 250:
               var10000 = 153;
               break;
            case 251:
               var10000 = 127;
               break;
            case 252:
               var10000 = 250;
               break;
            case 253:
               var10000 = 180;
               break;
            case 254:
               var10000 = 166;
               break;
            default:
               var10000 = 100;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}





