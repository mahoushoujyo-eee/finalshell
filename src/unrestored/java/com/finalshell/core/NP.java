package com.finalshell.core;

import java.awt.Container;
import java.awt.Insets;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

public class NP extends LayoutStyle {
   public static NP U;
   public static boolean S;
   public static String[] a;
   public static String[] b;
   public static long[] e;
   public static Integer[] f;

   public static LayoutStyle a() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 0
      // 04: getstatic com/finalshell/core/NP.U Lcom/finalshell/core/NP;
      // 07: aload 0
      // 08: ifnonnull 29
      // 0b: ifnonnull 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 14: athrow
      // 15: new com/finalshell/core/NP
      // 18: dup
      // 19: invokespecial com/finalshell/core/NP.<init> ()V
      // 1c: putstatic com/finalshell/core/NP.U Lcom/finalshell/core/NP;
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25: athrow
      // 26: getstatic com/finalshell/core/NP.U Lcom/finalshell/core/NP;
      // 29: areturn
   }

   @Override
   public int getPreferredGap(JComponent param1, JComponent param2, ComponentPlacement param3, int param4, Container param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 6
      // 05: aload 1
      // 06: aload 6
      // 08: ifnonnull 16
      // 0b: ifnull 30
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 14: athrow
      // 15: aload 2
      // 16: ifnull 30
      // 19: aload 3
      // 1a: aload 6
      // 1c: ifnonnull 3d
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25: athrow
      // 26: ifnonnull 3c
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2f: athrow
      // 30: new java/lang/NullPointerException
      // 33: dup
      // 34: invokespecial java/lang/NullPointerException.<init> ()V
      // 37: athrow
      // 38: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b: athrow
      // 3c: aload 3
      // 3d: getstatic javax/swing/LayoutStyle$ComponentPlacement.INDENT Ljavax/swing/LayoutStyle$ComponentPlacement;
      // 40: aload 6
      // 42: ifnonnull b1
      // 45: if_acmpne ad
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4e: athrow
      // 4f: iload 4
      // 51: aload 6
      // 53: ifnonnull 97
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5c: athrow
      // 5d: bipush 3
      // 5e: if_icmpeq 89
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: iload 4
      // 6a: aload 6
      // 6c: ifnonnull 97
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 75: athrow
      // 76: sipush 21498
      // 79: ldc2_w 7901008834659366989
      // 7c: invokestatic com/finalshell/core/NP.a (IJ)I
      // 7f: if_icmpne ad
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 88: athrow
      // 89: aload 0
      // 8a: aload 1
      // 8b: iload 4
      // 8d: invokevirtual com/finalshell/core/NP.i (Ljavax/swing/JComponent;I)I
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 96: athrow
      // 97: istore 7
      // 99: iload 7
      // 9b: aload 6
      // 9d: ifnonnull ac
      // a0: ifle ad
      // a3: goto aa
      // a6: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a9: athrow
      // aa: iload 7
      // ac: ireturn
      // ad: aload 3
      // ae: getstatic javax/swing/LayoutStyle$ComponentPlacement.UNRELATED Ljavax/swing/LayoutStyle$ComponentPlacement;
      // b1: if_acmpne c4
      // b4: sipush 2821
      // b7: ldc2_w 7862806072955297971
      // ba: invokestatic com/finalshell/core/NP.a (IJ)I
      // bd: goto cd
      // c0: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // c3: athrow
      // c4: sipush 15943
      // c7: ldc2_w 4778612243949540855
      // ca: invokestatic com/finalshell/core/NP.a (IJ)I
      // cd: ireturn
   }

   @Override
   public int getContainerGap(JComponent param1, int param2, Container param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 4
      // 07: ifnonnull 26
      // 0a: aload 1
      // 0b: ifnonnull 21
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 14: athrow
      // 15: new java/lang/NullPointerException
      // 18: dup
      // 19: invokespecial java/lang/NullPointerException.<init> ()V
      // 1c: athrow
      // 1d: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 20: athrow
      // 21: aload 0
      // 22: iload 2
      // 23: invokespecial com/finalshell/core/NP.w (I)V
      // 26: sipush 31356
      // 29: ldc2_w 6104638099686625743
      // 2c: invokestatic com/finalshell/core/NP.a (IJ)I
      // 2f: ireturn
   }

   public boolean E(JComponent param1, JComponent param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 4
      // 05: iload 3
      // 06: aload 4
      // 08: ifnonnull 41
      // 0b: bipush 3
      // 0c: if_icmpeq 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 15: athrow
      // 16: iload 3
      // 17: aload 4
      // 19: ifnonnull 93
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 22: athrow
      // 23: sipush 12736
      // 26: ldc2_w 2010120451082115705
      // 29: invokestatic com/finalshell/core/NP.a (IJ)I
      // 2c: if_icmpne 92
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 35: athrow
      // 36: aload 1
      // 37: instanceof javax/swing/JLabel
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 40: athrow
      // 41: istore 5
      // 43: aload 2
      // 44: instanceof javax/swing/JLabel
      // 47: istore 6
      // 49: iload 5
      // 4b: aload 4
      // 4d: ifnonnull 74
      // 50: ifne 72
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 59: athrow
      // 5a: iload 6
      // 5c: aload 4
      // 5e: ifnonnull 74
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 67: athrow
      // 68: ifeq 90
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 71: athrow
      // 72: iload 5
      // 74: aload 4
      // 76: ifnonnull 8d
      // 79: iload 6
      // 7b: if_icmpeq 90
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8c: athrow
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
      // 92: bipush 0
      // 93: ireturn
   }

   public int M(JComponent param1, JComponent param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: iload 4
      // 05: aload 0
      // 06: aload 1
      // 07: iload 3
      // 08: invokevirtual com/finalshell/core/NP.T (Ljavax/swing/JComponent;I)I
      // 0b: isub
      // 0c: istore 4
      // 0e: astore 5
      // 10: iload 4
      // 12: aload 5
      // 14: ifnonnull 32
      // 17: ifle 30
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 20: athrow
      // 21: iload 4
      // 23: aload 0
      // 24: aload 2
      // 25: aload 0
      // 26: iload 3
      // 27: invokevirtual com/finalshell/core/NP.i (I)I
      // 2a: invokevirtual com/finalshell/core/NP.T (Ljavax/swing/JComponent;I)I
      // 2d: isub
      // 2e: istore 4
      // 30: iload 4
      // 32: aload 5
      // 34: ifnonnull 49
      // 37: ifge 47
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 40: athrow
      // 41: bipush 0
      // 42: ireturn
      // 43: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 46: athrow
      // 47: iload 4
      // 49: ireturn
   }

   public int I(JComponent var1, int var2, int var3) {
      var3 -= this.T(var1, var2);
      return Math.max(var3, 0);
   }

   public int T(JComponent param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual javax/swing/JComponent.getUIClassID ()Ljava/lang/String;
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: sipush 31299
      // 0f: sipush -16401
      // 12: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 15: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18: aload 3
      // 19: ifnonnull 57
      // 1c: ifne 49
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25: athrow
      // 26: aload 4
      // 28: sipush 31296
      // 2b: sipush 24693
      // 2e: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 31: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 34: aload 3
      // 35: ifnonnull 8a
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3e: athrow
      // 3f: ifeq 89
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 1
      // 4a: checkcast javax/swing/AbstractButton
      // 4d: invokevirtual javax/swing/AbstractButton.isBorderPainted ()Z
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 56: athrow
      // 57: aload 3
      // 58: ifnonnull 8a
      // 5b: ifne 89
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 64: athrow
      // 65: aload 1
      // 66: invokevirtual javax/swing/JComponent.getBorder ()Ljavax/swing/border/Border;
      // 69: astore 5
      // 6b: aload 5
      // 6d: instanceof javax/swing/plaf/UIResource
      // 70: aload 3
      // 71: ifnonnull 8a
      // 74: ifeq 89
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: iload 2
      // 81: invokespecial com/finalshell/core/NP.w (Ljavax/swing/JComponent;I)I
      // 84: ireturn
      // 85: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 88: athrow
      // 89: bipush 0
      // 8a: ireturn
   }

   public void w(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: bipush 1
      // 06: aload 2
      // 07: ifnonnull 1d
      // 0a: if_icmpeq 62
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 13: athrow
      // 14: iload 1
      // 15: bipush 5
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: ifnonnull 3c
      // 21: if_icmpeq 62
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2a: athrow
      // 2b: iload 1
      // 2c: sipush 12736
      // 2f: ldc2_w 2010120451082115705
      // 32: invokestatic com/finalshell/core/NP.a (IJ)I
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3b: athrow
      // 3c: aload 2
      // 3d: ifnonnull 53
      // 40: if_icmpeq 62
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 49: athrow
      // 4a: iload 1
      // 4b: bipush 3
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 52: athrow
      // 53: if_icmpeq 62
      // 56: new java/lang/IllegalArgumentException
      // 59: dup
      // 5a: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 5d: athrow
      // 5e: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 61: athrow
      // 62: return
   }

   public int i(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnonnull 4f
      // 09: tableswitch 67 1 7 47 67 55 67 53 67 65
      // 34: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 37: athrow
      // 38: bipush 5
      // 39: ireturn
      // 3a: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: ireturn
      // 40: sipush 12736
      // 43: ldc2_w 2010120451082115705
      // 46: invokestatic com/finalshell/core/NP.a (IJ)I
      // 49: ireturn
      // 4a: bipush 3
      // 4b: ireturn
      // 4c: getstatic com/finalshell/core/NP.S Z
      // 4f: aload 2
      // 50: ifnonnull 6a
      // 53: ifne 69
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5c: athrow
      // 5d: new java/lang/AssertionError
      // 60: dup
      // 61: invokespecial java/lang/AssertionError.<init> ()V
      // 64: athrow
      // 65: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 68: athrow
      // 69: bipush 0
      // 6a: ireturn
   }

   public int i(JComponent param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual javax/swing/JComponent.getUIClassID ()Ljava/lang/String;
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: sipush 31297
      // 0f: sipush -16829
      // 12: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 15: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18: aload 3
      // 19: ifnonnull 3b
      // 1c: ifne 49
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25: athrow
      // 26: aload 4
      // 28: sipush 31303
      // 2b: sipush 29878
      // 2e: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 31: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3a: athrow
      // 3b: aload 3
      // 3c: ifnonnull b9
      // 3f: ifeq b8
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 1
      // 4a: checkcast javax/swing/AbstractButton
      // 4d: astore 5
      // 4f: aload 1
      // 50: invokevirtual javax/swing/JComponent.getInsets ()Ljava/awt/Insets;
      // 53: astore 6
      // 55: aload 0
      // 56: aload 5
      // 58: invokespecial com/finalshell/core/NP.e (Ljavax/swing/AbstractButton;)Ljavax/swing/Icon;
      // 5b: astore 7
      // 5d: aload 5
      // 5f: invokevirtual javax/swing/AbstractButton.getIconTextGap ()I
      // 62: istore 8
      // 64: aload 0
      // 65: aload 5
      // 67: iload 2
      // 68: invokespecial com/finalshell/core/NP.l (Ljavax/swing/AbstractButton;I)Z
      // 6b: aload 3
      // 6c: ifnonnull 95
      // 6f: ifeq 8e
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 78: athrow
      // 79: aload 6
      // 7b: getfield java/awt/Insets.left I
      // 7e: aload 7
      // 80: invokeinterface javax/swing/Icon.getIconWidth ()I 1
      // 85: iadd
      // 86: iload 8
      // 88: iadd
      // 89: ireturn
      // 8a: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 5
      // 91: iload 2
      // 92: invokespecial com/finalshell/core/NP.X (Ljavax/swing/AbstractButton;I)Z
      // 95: aload 3
      // 96: ifnonnull b9
      // 99: ifeq b8
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a2: athrow
      // a3: aload 6
      // a5: getfield java/awt/Insets.right I
      // a8: aload 7
      // aa: invokeinterface javax/swing/Icon.getIconWidth ()I 1
      // af: iadd
      // b0: iload 8
      // b2: iadd
      // b3: ireturn
      // b4: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // b7: athrow
      // b8: bipush 0
      // b9: ireturn
   }

   public Icon e(AbstractButton param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual javax/swing/AbstractButton.getIcon ()Ljavax/swing/Icon;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: aload 2
      // 0b: ifnonnull 19
      // 0e: ifnull 1a
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 17: athrow
      // 18: aload 3
      // 19: areturn
      // 1a: aconst_null
      // 1b: astore 4
      // 1d: aload 1
      // 1e: instanceof javax/swing/JCheckBox
      // 21: aload 2
      // 22: ifnonnull 41
      // 25: ifeq 3d
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 2e: athrow
      // 2f: sipush 31302
      // 32: sipush 4593
      // 35: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 38: astore 4
      // 3a: goto 4f
      // 3d: aload 1
      // 3e: instanceof javax/swing/JRadioButton
      // 41: ifeq 4f
      // 44: sipush 31298
      // 47: sipush -4259
      // 4a: invokestatic com/finalshell/core/NP.a (II)Ljava/lang/String;
      // 4d: astore 4
      // 4f: aload 4
      // 51: aload 2
      // 52: ifnonnull 6b
      // 55: ifnull 8d
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5e: athrow
      // 5f: aload 4
      // 61: invokestatic javax/swing/UIManager.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6a: athrow
      // 6b: astore 5
      // 6d: aload 5
      // 6f: aload 2
      // 70: ifnonnull 89
      // 73: instanceof javax/swing/Icon
      // 76: ifeq 8d
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7f: athrow
      // 80: aload 5
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 88: athrow
      // 89: checkcast javax/swing/Icon
      // 8c: areturn
      // 8d: aconst_null
      // 8e: areturn
   }

   public boolean l(AbstractButton param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 3
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull b1
      // 09: sipush 12736
      // 0c: ldc2_w 2010120451082115705
      // 0f: invokestatic com/finalshell/core/NP.a (IJ)I
      // 12: if_icmpne b0
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual javax/swing/AbstractButton.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 20: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 23: istore 4
      // 25: aload 1
      // 26: invokevirtual javax/swing/AbstractButton.getHorizontalAlignment ()I
      // 29: istore 5
      // 2b: iload 4
      // 2d: aload 3
      // 2e: ifnonnull 7c
      // 31: ifeq 73
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3a: athrow
      // 3b: iload 5
      // 3d: aload 3
      // 3e: ifnonnull ab
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 47: athrow
      // 48: bipush 2
      // 49: if_icmpeq a3
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 52: athrow
      // 53: iload 5
      // 55: aload 3
      // 56: ifnonnull ab
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 5f: athrow
      // 60: sipush 18454
      // 63: ldc2_w 7998893165685679015
      // 66: invokestatic com/finalshell/core/NP.a (IJ)I
      // 69: if_icmpeq a3
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 72: athrow
      // 73: iload 4
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 7b: athrow
      // 7c: aload 3
      // 7d: ifnonnull 8c
      // 80: ifne ae
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 89: athrow
      // 8a: iload 5
      // 8c: aload 3
      // 8d: ifnonnull ab
      // 90: sipush 30577
      // 93: ldc2_w 7971332408335080645
      // 96: invokestatic com/finalshell/core/NP.a (IJ)I
      // 99: if_icmpne ae
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a2: athrow
      // a3: bipush 1
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // aa: athrow
      // ab: goto af
      // ae: bipush 0
      // af: ireturn
      // b0: bipush 0
      // b1: ireturn
   }

   public boolean X(AbstractButton param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 3
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull a9
      // 09: bipush 3
      // 0a: if_icmpne a8
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 13: athrow
      // 14: aload 1
      // 15: invokevirtual javax/swing/AbstractButton.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 18: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 1b: istore 4
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/AbstractButton.getHorizontalAlignment ()I
      // 21: istore 5
      // 23: iload 4
      // 25: aload 3
      // 26: ifnonnull 74
      // 29: ifeq 6b
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 32: athrow
      // 33: iload 5
      // 35: aload 3
      // 36: ifnonnull a3
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3f: athrow
      // 40: bipush 4
      // 41: if_icmpeq 9b
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 4a: athrow
      // 4b: iload 5
      // 4d: aload 3
      // 4e: ifnonnull a3
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 57: athrow
      // 58: sipush 14480
      // 5b: ldc2_w 1405490834396304162
      // 5e: invokestatic com/finalshell/core/NP.a (IJ)I
      // 61: if_icmpeq 9b
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6a: athrow
      // 6b: iload 4
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 73: athrow
      // 74: aload 3
      // 75: ifnonnull 84
      // 78: ifne a6
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 81: athrow
      // 82: iload 5
      // 84: aload 3
      // 85: ifnonnull a3
      // 88: sipush 26519
      // 8b: ldc2_w 3798442477397478434
      // 8e: invokestatic com/finalshell/core/NP.a (IJ)I
      // 91: if_icmpne a6
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 9a: athrow
      // 9b: bipush 1
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // a2: athrow
      // a3: goto a7
      // a6: bipush 0
      // a7: ireturn
      // a8: bipush 0
      // a9: ireturn
   }

   public int w(JComponent var1, int var2) {
      return this.z(var1.getInsets(), var2);
   }

   public int z(Insets param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/XD3.U ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 0d: athrow
      // 0e: iload 2
      // 0f: aload 3
      // 10: ifnonnull 5b
      // 13: tableswitch 69 1 7 45 69 59 69 54 69 64
      // 3c: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 3f: athrow
      // 40: aload 1
      // 41: getfield java/awt/Insets.top I
      // 44: ireturn
      // 45: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: aload 1
      // 4a: getfield java/awt/Insets.bottom I
      // 4d: ireturn
      // 4e: aload 1
      // 4f: getfield java/awt/Insets.right I
      // 52: ireturn
      // 53: aload 1
      // 54: getfield java/awt/Insets.left I
      // 57: ireturn
      // 58: getstatic com/finalshell/core/NP.S Z
      // 5b: aload 3
      // 5c: ifnonnull 76
      // 5f: ifne 75
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 68: athrow
      // 69: new java/lang/AssertionError
      // 6c: dup
      // 6d: invokespecial java/lang/AssertionError.<init> ()V
      // 70: athrow
      // 71: invokestatic com/finalshell/core/NP.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 74: athrow
      // 75: bipush 0
      // 76: ireturn
   }

   static {
      __vfClinit__();
   }

   public static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 31298) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 166;
               break;
            case 1:
               var10000 = 4;
               break;
            case 2:
               var10000 = 62;
               break;
            case 3:
               var10000 = 21;
               break;
            case 4:
               var10000 = 64;
               break;
            case 5:
               var10000 = 181;
               break;
            case 6:
               var10000 = 174;
               break;
            case 7:
               var10000 = 31;
               break;
            case 8:
               var10000 = 165;
               break;
            case 9:
               var10000 = 74;
               break;
            case 10:
               var10000 = 37;
               break;
            case 11:
               var10000 = 242;
               break;
            case 12:
               var10000 = 106;
               break;
            case 13:
               var10000 = 80;
               break;
            case 14:
               var10000 = 8;
               break;
            case 15:
               var10000 = 19;
               break;
            case 16:
               var10000 = 51;
               break;
            case 17:
               var10000 = 46;
               break;
            case 18:
               var10000 = 216;
               break;
            case 19:
               var10000 = 227;
               break;
            case 20:
               var10000 = 118;
               break;
            case 21:
               var10000 = 29;
               break;
            case 22:
               var10000 = 98;
               break;
            case 23:
               var10000 = 20;
               break;
            case 24:
               var10000 = 238;
               break;
            case 25:
               var10000 = 24;
               break;
            case 26:
               var10000 = 93;
               break;
            case 27:
               var10000 = 105;
               break;
            case 28:
               var10000 = 34;
               break;
            case 29:
               var10000 = 191;
               break;
            case 30:
               var10000 = 61;
               break;
            case 31:
               var10000 = 229;
               break;
            case 32:
               var10000 = 59;
               break;
            case 33:
               var10000 = 201;
               break;
            case 34:
               var10000 = 121;
               break;
            case 35:
               var10000 = 132;
               break;
            case 36:
               var10000 = 122;
               break;
            case 37:
               var10000 = 231;
               break;
            case 38:
               var10000 = 194;
               break;
            case 39:
               var10000 = 113;
               break;
            case 40:
               var10000 = 90;
               break;
            case 41:
               var10000 = 79;
               break;
            case 42:
               var10000 = 163;
               break;
            case 43:
               var10000 = 63;
               break;
            case 44:
               var10000 = 149;
               break;
            case 45:
               var10000 = 15;
               break;
            case 46:
               var10000 = 202;
               break;
            case 47:
               var10000 = 11;
               break;
            case 48:
               var10000 = 183;
               break;
            case 49:
               var10000 = 36;
               break;
            case 50:
               var10000 = 134;
               break;
            case 51:
               var10000 = 52;
               break;
            case 52:
               var10000 = 245;
               break;
            case 53:
               var10000 = 189;
               break;
            case 54:
               var10000 = 123;
               break;
            case 55:
               var10000 = 69;
               break;
            case 56:
               var10000 = 243;
               break;
            case 57:
               var10000 = 151;
               break;
            case 58:
               var10000 = 196;
               break;
            case 59:
               var10000 = 12;
               break;
            case 60:
               var10000 = 161;
               break;
            case 61:
               var10000 = 175;
               break;
            case 62:
               var10000 = 207;
               break;
            case 63:
               var10000 = 6;
               break;
            case 64:
               var10000 = 3;
               break;
            case 65:
               var10000 = 26;
               break;
            case 66:
               var10000 = 153;
               break;
            case 67:
               var10000 = 81;
               break;
            case 68:
               var10000 = 226;
               break;
            case 69:
               var10000 = 150;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 222;
               break;
            case 72:
               var10000 = 107;
               break;
            case 73:
               var10000 = 139;
               break;
            case 74:
               var10000 = 168;
               break;
            case 75:
               var10000 = 173;
               break;
            case 76:
               var10000 = 112;
               break;
            case 77:
               var10000 = 225;
               break;
            case 78:
               var10000 = 92;
               break;
            case 79:
               var10000 = 250;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 230;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 235;
               break;
            case 84:
               var10000 = 218;
               break;
            case 85:
               var10000 = 5;
               break;
            case 86:
               var10000 = 115;
               break;
            case 87:
               var10000 = 9;
               break;
            case 88:
               var10000 = 114;
               break;
            case 89:
               var10000 = 148;
               break;
            case 90:
               var10000 = 213;
               break;
            case 91:
               var10000 = 102;
               break;
            case 92:
               var10000 = 13;
               break;
            case 93:
               var10000 = 234;
               break;
            case 94:
               var10000 = 89;
               break;
            case 95:
               var10000 = 180;
               break;
            case 96:
               var10000 = 187;
               break;
            case 97:
               var10000 = 7;
               break;
            case 98:
               var10000 = 140;
               break;
            case 99:
               var10000 = 0;
               break;
            case 100:
               var10000 = 94;
               break;
            case 101:
               var10000 = 177;
               break;
            case 102:
               var10000 = 200;
               break;
            case 103:
               var10000 = 217;
               break;
            case 104:
               var10000 = 55;
               break;
            case 105:
               var10000 = 65;
               break;
            case 106:
               var10000 = 76;
               break;
            case 107:
               var10000 = 110;
               break;
            case 108:
               var10000 = 253;
               break;
            case 109:
               var10000 = 223;
               break;
            case 110:
               var10000 = 50;
               break;
            case 111:
               var10000 = 254;
               break;
            case 112:
               var10000 = 137;
               break;
            case 113:
               var10000 = 41;
               break;
            case 114:
               var10000 = 233;
               break;
            case 115:
               var10000 = 109;
               break;
            case 116:
               var10000 = 251;
               break;
            case 117:
               var10000 = 23;
               break;
            case 118:
               var10000 = 38;
               break;
            case 119:
               var10000 = 124;
               break;
            case 120:
               var10000 = 208;
               break;
            case 121:
               var10000 = 25;
               break;
            case 122:
               var10000 = 87;
               break;
            case 123:
               var10000 = 141;
               break;
            case 124:
               var10000 = 188;
               break;
            case 125:
               var10000 = 203;
               break;
            case 126:
               var10000 = 82;
               break;
            case 127:
               var10000 = 99;
               break;
            case 128:
               var10000 = 91;
               break;
            case 129:
               var10000 = 88;
               break;
            case 130:
               var10000 = 157;
               break;
            case 131:
               var10000 = 127;
               break;
            case 132:
               var10000 = 44;
               break;
            case 133:
               var10000 = 86;
               break;
            case 134:
               var10000 = 248;
               break;
            case 135:
               var10000 = 142;
               break;
            case 136:
               var10000 = 210;
               break;
            case 137:
               var10000 = 18;
               break;
            case 138:
               var10000 = 40;
               break;
            case 139:
               var10000 = 179;
               break;
            case 140:
               var10000 = 205;
               break;
            case 141:
               var10000 = 53;
               break;
            case 142:
               var10000 = 16;
               break;
            case 143:
               var10000 = 204;
               break;
            case 144:
               var10000 = 224;
               break;
            case 145:
               var10000 = 70;
               break;
            case 146:
               var10000 = 97;
               break;
            case 147:
               var10000 = 117;
               break;
            case 148:
               var10000 = 136;
               break;
            case 149:
               var10000 = 186;
               break;
            case 150:
               var10000 = 206;
               break;
            case 151:
               var10000 = 111;
               break;
            case 152:
               var10000 = 164;
               break;
            case 153:
               var10000 = 125;
               break;
            case 154:
               var10000 = 56;
               break;
            case 155:
               var10000 = 236;
               break;
            case 156:
               var10000 = 84;
               break;
            case 157:
               var10000 = 30;
               break;
            case 158:
               var10000 = 126;
               break;
            case 159:
               var10000 = 143;
               break;
            case 160:
               var10000 = 160;
               break;
            case 161:
               var10000 = 101;
               break;
            case 162:
               var10000 = 133;
               break;
            case 163:
               var10000 = 116;
               break;
            case 164:
               var10000 = 57;
               break;
            case 165:
               var10000 = 192;
               break;
            case 166:
               var10000 = 184;
               break;
            case 167:
               var10000 = 182;
               break;
            case 168:
               var10000 = 135;
               break;
            case 169:
               var10000 = 66;
               break;
            case 170:
               var10000 = 232;
               break;
            case 171:
               var10000 = 130;
               break;
            case 172:
               var10000 = 146;
               break;
            case 173:
               var10000 = 198;
               break;
            case 174:
               var10000 = 1;
               break;
            case 175:
               var10000 = 156;
               break;
            case 176:
               var10000 = 100;
               break;
            case 177:
               var10000 = 214;
               break;
            case 178:
               var10000 = 10;
               break;
            case 179:
               var10000 = 22;
               break;
            case 180:
               var10000 = 138;
               break;
            case 181:
               var10000 = 219;
               break;
            case 182:
               var10000 = 145;
               break;
            case 183:
               var10000 = 2;
               break;
            case 184:
               var10000 = 72;
               break;
            case 185:
               var10000 = 246;
               break;
            case 186:
               var10000 = 158;
               break;
            case 187:
               var10000 = 255;
               break;
            case 188:
               var10000 = 28;
               break;
            case 189:
               var10000 = 249;
               break;
            case 190:
               var10000 = 58;
               break;
            case 191:
               var10000 = 103;
               break;
            case 192:
               var10000 = 120;
               break;
            case 193:
               var10000 = 169;
               break;
            case 194:
               var10000 = 67;
               break;
            case 195:
               var10000 = 170;
               break;
            case 196:
               var10000 = 47;
               break;
            case 197:
               var10000 = 71;
               break;
            case 198:
               var10000 = 75;
               break;
            case 199:
               var10000 = 252;
               break;
            case 200:
               var10000 = 147;
               break;
            case 201:
               var10000 = 128;
               break;
            case 202:
               var10000 = 167;
               break;
            case 203:
               var10000 = 178;
               break;
            case 204:
               var10000 = 154;
               break;
            case 205:
               var10000 = 199;
               break;
            case 206:
               var10000 = 209;
               break;
            case 207:
               var10000 = 239;
               break;
            case 208:
               var10000 = 176;
               break;
            case 209:
               var10000 = 27;
               break;
            case 210:
               var10000 = 73;
               break;
            case 211:
               var10000 = 14;
               break;
            case 212:
               var10000 = 159;
               break;
            case 213:
               var10000 = 119;
               break;
            case 214:
               var10000 = 212;
               break;
            case 215:
               var10000 = 39;
               break;
            case 216:
               var10000 = 195;
               break;
            case 217:
               var10000 = 77;
               break;
            case 218:
               var10000 = 45;
               break;
            case 219:
               var10000 = 247;
               break;
            case 220:
               var10000 = 244;
               break;
            case 221:
               var10000 = 33;
               break;
            case 222:
               var10000 = 152;
               break;
            case 223:
               var10000 = 144;
               break;
            case 224:
               var10000 = 17;
               break;
            case 225:
               var10000 = 185;
               break;
            case 226:
               var10000 = 240;
               break;
            case 227:
               var10000 = 49;
               break;
            case 228:
               var10000 = 193;
               break;
            case 229:
               var10000 = 171;
               break;
            case 230:
               var10000 = 237;
               break;
            case 231:
               var10000 = 129;
               break;
            case 232:
               var10000 = 172;
               break;
            case 233:
               var10000 = 155;
               break;
            case 234:
               var10000 = 190;
               break;
            case 235:
               var10000 = 197;
               break;
            case 236:
               var10000 = 228;
               break;
            case 237:
               var10000 = 241;
               break;
            case 238:
               var10000 = 104;
               break;
            case 239:
               var10000 = 54;
               break;
            case 240:
               var10000 = 32;
               break;
            case 241:
               var10000 = 215;
               break;
            case 242:
               var10000 = 68;
               break;
            case 243:
               var10000 = 96;
               break;
            case 244:
               var10000 = 48;
               break;
            case 245:
               var10000 = 95;
               break;
            case 246:
               var10000 = 35;
               break;
            case 247:
               var10000 = 78;
               break;
            case 248:
               var10000 = 108;
               break;
            case 249:
               var10000 = 85;
               break;
            case 250:
               var10000 = 43;
               break;
            case 251:
               var10000 = 42;
               break;
            case 252:
               var10000 = 83;
               break;
            case 253:
               var10000 = 131;
               break;
            case 254:
               var10000 = 220;
               break;
            default:
               var10000 = 211;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27569;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var21;
      char[] var35;
      String[] var13 = new String[6];
      int var11 = 0;
      String var10 = "\nã~á\u008aÄÎÒ\u008c\u008c¼ÿ£\u001fkx\n\u007fÈâ¦<g\u0086ªý(\r\tK\u001eô\u0086fO\u0086¼\u0006ºÕC\n¥Y¹\u0094W!ëbP1";
      int var12 = "\nã~á\u008aÄÎÒ\u008c\u008c¼ÿ£\u001fkx\n\u007fÈâ¦<g\u0086ªý(\r\tK\u001eô\u0086fO\u0086¼\u0006ºÕC\n¥Y¹\u0094W!ëbP1".length();
      char var9 = 16;
      int var18 = -1;

      label85:
      while (true) {
         byte var10000 = 75;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
            label80: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label80;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var66 = var57[var10006];
                  byte var67;
                  switch (var14 % 7) {
                     case 0:
                        var67 = 121;
                        break;
                     case 1:
                        var67 = 53;
                        break;
                     case 2:
                        var67 = 78;
                        break;
                     case 3:
                        var67 = 61;
                        break;
                     case 4:
                        var67 = 41;
                        break;
                     case 5:
                        var67 = 123;
                        break;
                     default:
                        var67 = 111;
                  }

                  var57[var10006] = (char)(var66 ^ var51 ^ var67);
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var18 += var9) >= var12) {
                     a = var13;
                     b = new String[6];
                     long var0 = 9034160099878943178L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "J\u0099\u009aU¥´\u001ag´`\u0003Ýj»l;v¥\u009cqëi¨\u0003¶çö\u0081r\bêãæç\u0086B\bBµâ\u008a\u008d\"ª\u0084\u0015¥\u0004YåÈ\u0097\u0090R\u0081\u0080";
                     int var5 = "J\u0099\u009aU¥´\u001ag´`\u0003Ýj»l;v¥\u009cqëi¨\u0003¶çö\u0081r\bêãæç\u0086B\bBµâ\u008a\u008d\"ª\u0084\u0015¥\u0004YåÈ\u0097\u0090R\u0081\u0080"
                        .length();
                     byte var2 = 0;

                     label59:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        long[] var20 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var20[var29] = var56;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[9];

                                    label48: {
                                       try {
                                          if (!NP.class.desiredAssertionStatus()) {
                                             var21 = true;
                                             break label48;
                                          }
                                       } catch (NullPointerException var15) {
                                          throw new RuntimeException(a(var15));
                                       }

                                       var21 = false;
                                    }

                                    S = var21;
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var29] = var56;
                                 if (var2 < var5) {
                                    continue label59;
                                 }

                                 var4 = "\u008b\u009fÉñ\t\u0002Yu¤_º®\u009f5ã´";
                                 var5 = "\u008b\u009fÉñ\t\u0002Yu¤_º®\u009f5ã´".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var20 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label85;
                  }

                  var10 = "f!Á\u009bXÀ\n^\u0017\u0096Ó;å\rtÍ±$s|ñÅkn@Ø\u001c";
                  var12 = "f!Á\u009bXÀ\n^\u0017\u0096Ó;å\rtÍ±$s|ñÅkn@Ø\u001c".length();
                  var9 = '\r';
                  var18 = -1;
            }

            var10000 = 75;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}





