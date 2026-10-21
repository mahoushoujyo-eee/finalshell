package com.finalshell.core;

import com.finalshell.ui.model.U0;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.text.JTextComponent;

public class TC extends T4 {
   public static Insets F;
   public U0 e = new U0();
   public JTextComponent y;
   public static String[] a;
   public static String[] b;

   public TC(JTextComponent var1) {
      this.y = var1;
   }

   @Override
   public void A(Component param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ne4.m$boolean ()Z
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: istore 3
      // 0a: aload 4
      // 0c: iload 3
      // 0d: ifne 1c
      // 10: ifnull 4e
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 4
      // 1c: sipush 1509
      // 1f: sipush 3730
      // 22: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 25: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28: iload 3
      // 29: ifne 4b
      // 2c: ifne 63
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 4
      // 38: sipush 1508
      // 3b: sipush -10603
      // 3e: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 41: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: ifne 63
      // 4e: new java/lang/IllegalArgumentException
      // 51: dup
      // 52: sipush 1510
      // 55: sipush 4198
      // 58: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 5b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 5e: athrow
      // 5f: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: aload 0
      // 64: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 67: aload 1
      // 68: aload 4
      // 6a: invokevirtual com/finalshell/ui/model/U0.A (Ljava/lang/Object;Ljava/lang/Object;)V
      // 6d: return
   }

   @Override
   public void F(Component var1) {
      this.e.T(var1);
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
      // 00: invokestatic com/finalshell/core/Ne4.A$boolean ()Z
      // 03: aload 0
      // 04: aload 1
      // 05: invokespecial com/finalshell/core/TC.Q (Ljava/awt/Container;)Ljava/awt/Insets;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 0e: sipush 1509
      // 11: sipush 3730
      // 14: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 17: iload 2
      // 18: ifeq 3c
      // 1b: invokevirtual com/finalshell/ui/model/U0.A$boolean (Ljava/lang/Object;)Z
      // 1e: ifeq 48
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 2c: sipush 1509
      // 2f: sipush 3730
      // 32: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b: athrow
      // 3c: invokevirtual com/finalshell/ui/model/U0.A$Object (Ljava/lang/Object;)Ljava/lang/Object;
      // 3f: checkcast java/awt/Component
      // 42: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 45: goto 4f
      // 48: new java/awt/Dimension
      // 4b: dup
      // 4c: invokespecial java/awt/Dimension.<init> ()V
      // 4f: astore 4
      // 51: aload 0
      // 52: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 55: sipush 1508
      // 58: sipush -10603
      // 5b: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 5e: iload 2
      // 5f: ifeq 83
      // 62: invokevirtual com/finalshell/ui/model/U0.A$boolean (Ljava/lang/Object;)Z
      // 65: ifeq 8f
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 73: sipush 1508
      // 76: sipush -10603
      // 79: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82: athrow
      // 83: invokevirtual com/finalshell/ui/model/U0.A$Object (Ljava/lang/Object;)Ljava/lang/Object;
      // 86: checkcast java/awt/Component
      // 89: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 8c: goto 96
      // 8f: new java/awt/Dimension
      // 92: dup
      // 93: invokespecial java/awt/Dimension.<init> ()V
      // 96: astore 5
      // 98: new java/awt/Dimension
      // 9b: dup
      // 9c: aload 3
      // 9d: getfield java/awt/Insets.left I
      // a0: aload 4
      // a2: getfield java/awt/Dimension.width I
      // a5: iadd
      // a6: aload 5
      // a8: getfield java/awt/Dimension.width I
      // ab: iadd
      // ac: aload 3
      // ad: getfield java/awt/Insets.right I
      // b0: iadd
      // b1: aload 3
      // b2: getfield java/awt/Insets.top I
      // b5: aload 4
      // b7: getfield java/awt/Dimension.height I
      // ba: aload 5
      // bc: getfield java/awt/Dimension.height I
      // bf: invokestatic java/lang/Math.max (II)I
      // c2: iadd
      // c3: aload 3
      // c4: getfield java/awt/Insets.bottom I
      // c7: iadd
      // c8: invokespecial java/awt/Dimension.<init> (II)V
      // cb: areturn
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
      // 000: invokestatic com/finalshell/core/Ne4.A$boolean ()Z
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 007: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 00a: istore 3
      // 00b: istore 2
      // 00c: aload 0
      // 00d: aload 1
      // 00e: invokespecial com/finalshell/core/TC.Q (Ljava/awt/Container;)Ljava/awt/Insets;
      // 011: astore 4
      // 013: aload 0
      // 014: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 017: sipush 1504
      // 01a: sipush 2047
      // 01d: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 020: invokevirtual com/finalshell/ui/model/U0.A$boolean (Ljava/lang/Object;)Z
      // 023: iload 2
      // 024: ifeq 0d6
      // 027: ifeq 0bb
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: aload 0
      // 032: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 035: sipush 1509
      // 038: sipush 3730
      // 03b: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 03e: invokevirtual com/finalshell/ui/model/U0.A$Object (Ljava/lang/Object;)Ljava/lang/Object;
      // 041: checkcast java/awt/Component
      // 044: astore 5
      // 046: aload 5
      // 048: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 04b: getfield java/awt/Dimension.width I
      // 04e: istore 6
      // 050: iload 2
      // 051: ifeq 08a
      // 054: iload 3
      // 055: ifeq 08e
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 5
      // 061: aload 4
      // 063: getfield java/awt/Insets.left I
      // 066: iload 6
      // 068: isub
      // 069: aload 4
      // 06b: getfield java/awt/Insets.top I
      // 06e: iload 6
      // 070: aload 1
      // 071: invokevirtual java/awt/Container.getHeight ()I
      // 074: aload 4
      // 076: getfield java/awt/Insets.top I
      // 079: isub
      // 07a: aload 4
      // 07c: getfield java/awt/Insets.bottom I
      // 07f: isub
      // 080: invokevirtual java/awt/Component.setBounds (IIII)V
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifne 0bb
      // 08e: aload 5
      // 090: aload 1
      // 091: invokevirtual java/awt/Container.getWidth ()I
      // 094: aload 4
      // 096: getfield java/awt/Insets.right I
      // 099: isub
      // 09a: aload 4
      // 09c: getfield java/awt/Insets.top I
      // 09f: iload 6
      // 0a1: aload 1
      // 0a2: invokevirtual java/awt/Container.getHeight ()I
      // 0a5: aload 4
      // 0a7: getfield java/awt/Insets.top I
      // 0aa: isub
      // 0ab: aload 4
      // 0ad: getfield java/awt/Insets.bottom I
      // 0b0: isub
      // 0b1: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 0bf: sipush 1511
      // 0c2: sipush -12904
      // 0c5: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 0c8: iload 2
      // 0c9: ifeq 0ed
      // 0cc: invokevirtual com/finalshell/ui/model/U0.A$boolean (Ljava/lang/Object;)Z
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d5: athrow
      // 0d6: ifeq 16a
      // 0d9: aload 0
      // 0da: getfield com/finalshell/core/TC.e Lcom/finalshell/ui/model/U0;
      // 0dd: sipush 1508
      // 0e0: sipush -10603
      // 0e3: invokestatic com/finalshell/core/TC.a (II)Ljava/lang/String;
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ec: athrow
      // 0ed: invokevirtual com/finalshell/ui/model/U0.A$Object (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f0: checkcast java/awt/Component
      // 0f3: astore 5
      // 0f5: aload 5
      // 0f7: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 0fa: getfield java/awt/Dimension.width I
      // 0fd: istore 6
      // 0ff: iload 2
      // 100: ifeq 13b
      // 103: iload 3
      // 104: ifeq 13f
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10d: athrow
      // 10e: aload 5
      // 110: aload 1
      // 111: invokevirtual java/awt/Container.getWidth ()I
      // 114: aload 4
      // 116: getfield java/awt/Insets.right I
      // 119: isub
      // 11a: aload 4
      // 11c: getfield java/awt/Insets.top I
      // 11f: iload 6
      // 121: aload 1
      // 122: invokevirtual java/awt/Container.getHeight ()I
      // 125: aload 4
      // 127: getfield java/awt/Insets.top I
      // 12a: isub
      // 12b: aload 4
      // 12d: getfield java/awt/Insets.bottom I
      // 130: isub
      // 131: invokevirtual java/awt/Component.setBounds (IIII)V
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13a: athrow
      // 13b: iload 2
      // 13c: ifne 16a
      // 13f: aload 5
      // 141: aload 4
      // 143: getfield java/awt/Insets.left I
      // 146: iload 6
      // 148: isub
      // 149: aload 4
      // 14b: getfield java/awt/Insets.top I
      // 14e: iload 6
      // 150: aload 1
      // 151: invokevirtual java/awt/Container.getHeight ()I
      // 154: aload 4
      // 156: getfield java/awt/Insets.top I
      // 159: isub
      // 15a: aload 4
      // 15c: getfield java/awt/Insets.bottom I
      // 15f: isub
      // 160: invokevirtual java/awt/Component.setBounds (IIII)V
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 169: athrow
      // 16a: return
   }

   public Insets Q(Container var1) {
      Insets var2 = var1.getInsets();
      Insets var3 = this.A();
      boolean var4 = var1.getComponentOrientation().isLeftToRight();

      Insets var10000;
      Insets var10001;
      int var10002;
      int var10003;
      int var10004;
      label22: {
         try {
            var10000 = null;
            var10001 = var10000;
            var10002 = var2.top - var3.top;
            var10003 = var2.left;
            if (var4) {
               var10004 = var3.left;
               break label22;
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }

         var10004 = var3.right;
      }

var10001 = new Insets(var10002, var10003 - var10004, var2.bottom - var3.bottom, var2.right - (var4 ? var3.right : var3.left));
      return var10000;
   }

   public Insets A() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ne4.m$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/TC.y Ljavax/swing/text/JTextComponent;
      // 07: invokevirtual javax/swing/text/JTextComponent.getUI ()Ljavax/swing/plaf/TextUI;
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 2
      // 0d: instanceof com/finalshell/core/QH
      // 10: iload 1
      // 11: ifne 39
      // 14: ifeq 2a
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: aload 2
      // 1f: checkcast com/finalshell/core/QH
      // 22: invokevirtual com/finalshell/core/QH.Z ()Ljava/awt/Insets;
      // 25: areturn
      // 26: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: aload 2
      // 2b: iload 1
      // 2c: ifne 3d
      // 2f: instanceof com/finalshell/core/Hl2
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/TC.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: ifeq 44
      // 3c: aload 2
      // 3d: checkcast com/finalshell/core/Hl2
      // 40: invokevirtual com/finalshell/core/Hl2.v ()Ljava/awt/Insets;
      // 43: areturn
      // 44: getstatic com/finalshell/core/TC.F Ljava/awt/Insets;
      // 47: areturn
   }

   static {
      __vfClinit__();
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1508) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 152;
               break;
            case 1:
               var10000 = 236;
               break;
            case 2:
               var10000 = 252;
               break;
            case 3:
               var10000 = 100;
               break;
            case 4:
               var10000 = 188;
               break;
            case 5:
               var10000 = 139;
               break;
            case 6:
               var10000 = 107;
               break;
            case 7:
               var10000 = 38;
               break;
            case 8:
               var10000 = 177;
               break;
            case 9:
               var10000 = 254;
               break;
            case 10:
               var10000 = 174;
               break;
            case 11:
               var10000 = 244;
               break;
            case 12:
               var10000 = 82;
               break;
            case 13:
               var10000 = 224;
               break;
            case 14:
               var10000 = 187;
               break;
            case 15:
               var10000 = 229;
               break;
            case 16:
               var10000 = 91;
               break;
            case 17:
               var10000 = 88;
               break;
            case 18:
               var10000 = 48;
               break;
            case 19:
               var10000 = 189;
               break;
            case 20:
               var10000 = 15;
               break;
            case 21:
               var10000 = 76;
               break;
            case 22:
               var10000 = 72;
               break;
            case 23:
               var10000 = 71;
               break;
            case 24:
               var10000 = 238;
               break;
            case 25:
               var10000 = 182;
               break;
            case 26:
               var10000 = 5;
               break;
            case 27:
               var10000 = 131;
               break;
            case 28:
               var10000 = 13;
               break;
            case 29:
               var10000 = 144;
               break;
            case 30:
               var10000 = 42;
               break;
            case 31:
               var10000 = 186;
               break;
            case 32:
               var10000 = 63;
               break;
            case 33:
               var10000 = 98;
               break;
            case 34:
               var10000 = 206;
               break;
            case 35:
               var10000 = 25;
               break;
            case 36:
               var10000 = 49;
               break;
            case 37:
               var10000 = 161;
               break;
            case 38:
               var10000 = 92;
               break;
            case 39:
               var10000 = 166;
               break;
            case 40:
               var10000 = 39;
               break;
            case 41:
               var10000 = 241;
               break;
            case 42:
               var10000 = 242;
               break;
            case 43:
               var10000 = 207;
               break;
            case 44:
               var10000 = 246;
               break;
            case 45:
               var10000 = 136;
               break;
            case 46:
               var10000 = 68;
               break;
            case 47:
               var10000 = 24;
               break;
            case 48:
               var10000 = 53;
               break;
            case 49:
               var10000 = 233;
               break;
            case 50:
               var10000 = 2;
               break;
            case 51:
               var10000 = 243;
               break;
            case 52:
               var10000 = 27;
               break;
            case 53:
               var10000 = 250;
               break;
            case 54:
               var10000 = 4;
               break;
            case 55:
               var10000 = 132;
               break;
            case 56:
               var10000 = 46;
               break;
            case 57:
               var10000 = 117;
               break;
            case 58:
               var10000 = 157;
               break;
            case 59:
               var10000 = 16;
               break;
            case 60:
               var10000 = 116;
               break;
            case 61:
               var10000 = 143;
               break;
            case 62:
               var10000 = 249;
               break;
            case 63:
               var10000 = 248;
               break;
            case 64:
               var10000 = 227;
               break;
            case 65:
               var10000 = 133;
               break;
            case 66:
               var10000 = 214;
               break;
            case 67:
               var10000 = 129;
               break;
            case 68:
               var10000 = 135;
               break;
            case 69:
               var10000 = 18;
               break;
            case 70:
               var10000 = 128;
               break;
            case 71:
               var10000 = 10;
               break;
            case 72:
               var10000 = 104;
               break;
            case 73:
               var10000 = 212;
               break;
            case 74:
               var10000 = 134;
               break;
            case 75:
               var10000 = 77;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 221;
               break;
            case 78:
               var10000 = 192;
               break;
            case 79:
               var10000 = 109;
               break;
            case 80:
               var10000 = 115;
               break;
            case 81:
               var10000 = 87;
               break;
            case 82:
               var10000 = 180;
               break;
            case 83:
               var10000 = 209;
               break;
            case 84:
               var10000 = 44;
               break;
            case 85:
               var10000 = 237;
               break;
            case 86:
               var10000 = 7;
               break;
            case 87:
               var10000 = 196;
               break;
            case 88:
               var10000 = 194;
               break;
            case 89:
               var10000 = 219;
               break;
            case 90:
               var10000 = 84;
               break;
            case 91:
               var10000 = 56;
               break;
            case 92:
               var10000 = 54;
               break;
            case 93:
               var10000 = 51;
               break;
            case 94:
               var10000 = 41;
               break;
            case 95:
               var10000 = 195;
               break;
            case 96:
               var10000 = 239;
               break;
            case 97:
               var10000 = 83;
               break;
            case 98:
               var10000 = 20;
               break;
            case 99:
               var10000 = 205;
               break;
            case 100:
               var10000 = 121;
               break;
            case 101:
               var10000 = 164;
               break;
            case 102:
               var10000 = 12;
               break;
            case 103:
               var10000 = 130;
               break;
            case 104:
               var10000 = 80;
               break;
            case 105:
               var10000 = 89;
               break;
            case 106:
               var10000 = 234;
               break;
            case 107:
               var10000 = 79;
               break;
            case 108:
               var10000 = 208;
               break;
            case 109:
               var10000 = 60;
               break;
            case 110:
               var10000 = 9;
               break;
            case 111:
               var10000 = 31;
               break;
            case 112:
               var10000 = 211;
               break;
            case 113:
               var10000 = 96;
               break;
            case 114:
               var10000 = 50;
               break;
            case 115:
               var10000 = 146;
               break;
            case 116:
               var10000 = 47;
               break;
            case 117:
               var10000 = 169;
               break;
            case 118:
               var10000 = 204;
               break;
            case 119:
               var10000 = 159;
               break;
            case 120:
               var10000 = 168;
               break;
            case 121:
               var10000 = 255;
               break;
            case 122:
               var10000 = 158;
               break;
            case 123:
               var10000 = 176;
               break;
            case 124:
               var10000 = 137;
               break;
            case 125:
               var10000 = 95;
               break;
            case 126:
               var10000 = 247;
               break;
            case 127:
               var10000 = 118;
               break;
            case 128:
               var10000 = 70;
               break;
            case 129:
               var10000 = 145;
               break;
            case 130:
               var10000 = 23;
               break;
            case 131:
               var10000 = 156;
               break;
            case 132:
               var10000 = 57;
               break;
            case 133:
               var10000 = 216;
               break;
            case 134:
               var10000 = 148;
               break;
            case 135:
               var10000 = 110;
               break;
            case 136:
               var10000 = 114;
               break;
            case 137:
               var10000 = 170;
               break;
            case 138:
               var10000 = 35;
               break;
            case 139:
               var10000 = 230;
               break;
            case 140:
               var10000 = 52;
               break;
            case 141:
               var10000 = 22;
               break;
            case 142:
               var10000 = 108;
               break;
            case 143:
               var10000 = 226;
               break;
            case 144:
               var10000 = 43;
               break;
            case 145:
               var10000 = 203;
               break;
            case 146:
               var10000 = 67;
               break;
            case 147:
               var10000 = 119;
               break;
            case 148:
               var10000 = 140;
               break;
            case 149:
               var10000 = 33;
               break;
            case 150:
               var10000 = 171;
               break;
            case 151:
               var10000 = 127;
               break;
            case 152:
               var10000 = 37;
               break;
            case 153:
               var10000 = 162;
               break;
            case 154:
               var10000 = 65;
               break;
            case 155:
               var10000 = 185;
               break;
            case 156:
               var10000 = 124;
               break;
            case 157:
               var10000 = 184;
               break;
            case 158:
               var10000 = 94;
               break;
            case 159:
               var10000 = 202;
               break;
            case 160:
               var10000 = 217;
               break;
            case 161:
               var10000 = 17;
               break;
            case 162:
               var10000 = 106;
               break;
            case 163:
               var10000 = 1;
               break;
            case 164:
               var10000 = 251;
               break;
            case 165:
               var10000 = 61;
               break;
            case 166:
               var10000 = 103;
               break;
            case 167:
               var10000 = 222;
               break;
            case 168:
               var10000 = 74;
               break;
            case 169:
               var10000 = 19;
               break;
            case 170:
               var10000 = 183;
               break;
            case 171:
               var10000 = 151;
               break;
            case 172:
               var10000 = 86;
               break;
            case 173:
               var10000 = 73;
               break;
            case 174:
               var10000 = 201;
               break;
            case 175:
               var10000 = 197;
               break;
            case 176:
               var10000 = 3;
               break;
            case 177:
               var10000 = 29;
               break;
            case 178:
               var10000 = 165;
               break;
            case 179:
               var10000 = 142;
               break;
            case 180:
               var10000 = 113;
               break;
            case 181:
               var10000 = 120;
               break;
            case 182:
               var10000 = 163;
               break;
            case 183:
               var10000 = 40;
               break;
            case 184:
               var10000 = 102;
               break;
            case 185:
               var10000 = 240;
               break;
            case 186:
               var10000 = 210;
               break;
            case 187:
               var10000 = 147;
               break;
            case 188:
               var10000 = 141;
               break;
            case 189:
               var10000 = 178;
               break;
            case 190:
               var10000 = 172;
               break;
            case 191:
               var10000 = 21;
               break;
            case 192:
               var10000 = 190;
               break;
            case 193:
               var10000 = 36;
               break;
            case 194:
               var10000 = 149;
               break;
            case 195:
               var10000 = 112;
               break;
            case 196:
               var10000 = 99;
               break;
            case 197:
               var10000 = 122;
               break;
            case 198:
               var10000 = 58;
               break;
            case 199:
               var10000 = 28;
               break;
            case 200:
               var10000 = 111;
               break;
            case 201:
               var10000 = 66;
               break;
            case 202:
               var10000 = 228;
               break;
            case 203:
               var10000 = 78;
               break;
            case 204:
               var10000 = 200;
               break;
            case 205:
               var10000 = 198;
               break;
            case 206:
               var10000 = 97;
               break;
            case 207:
               var10000 = 14;
               break;
            case 208:
               var10000 = 215;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 223;
               break;
            case 211:
               var10000 = 64;
               break;
            case 212:
               var10000 = 167;
               break;
            case 213:
               var10000 = 175;
               break;
            case 214:
               var10000 = 199;
               break;
            case 215:
               var10000 = 160;
               break;
            case 216:
               var10000 = 232;
               break;
            case 217:
               var10000 = 26;
               break;
            case 218:
               var10000 = 123;
               break;
            case 219:
               var10000 = 105;
               break;
            case 220:
               var10000 = 30;
               break;
            case 221:
               var10000 = 34;
               break;
            case 222:
               var10000 = 153;
               break;
            case 223:
               var10000 = 235;
               break;
            case 224:
               var10000 = 126;
               break;
            case 225:
               var10000 = 154;
               break;
            case 226:
               var10000 = 75;
               break;
            case 227:
               var10000 = 69;
               break;
            case 228:
               var10000 = 213;
               break;
            case 229:
               var10000 = 150;
               break;
            case 230:
               var10000 = 253;
               break;
            case 231:
               var10000 = 32;
               break;
            case 232:
               var10000 = 245;
               break;
            case 233:
               var10000 = 90;
               break;
            case 234:
               var10000 = 45;
               break;
            case 235:
               var10000 = 231;
               break;
            case 236:
               var10000 = 191;
               break;
            case 237:
               var10000 = 6;
               break;
            case 238:
               var10000 = 155;
               break;
            case 239:
               var10000 = 11;
               break;
            case 240:
               var10000 = 0;
               break;
            case 241:
               var10000 = 125;
               break;
            case 242:
               var10000 = 8;
               break;
            case 243:
               var10000 = 181;
               break;
            case 244:
               var10000 = 218;
               break;
            case 245:
               var10000 = 225;
               break;
            case 246:
               var10000 = 81;
               break;
            case 247:
               var10000 = 138;
               break;
            case 248:
               var10000 = 62;
               break;
            case 249:
               var10000 = 173;
               break;
            case 250:
               var10000 = 193;
               break;
            case 251:
               var10000 = 179;
               break;
            case 252:
               var10000 = 101;
               break;
            case 253:
               var10000 = 85;
               break;
            case 254:
               var10000 = 220;
               break;
            default:
               var10000 = 55;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u008d\"c\u0088ù7\u0097z\u0007æ\r\u0015\u00952?BGfüÄ!äü\u001d¿¾\u0093\u0082^\u00142×^/tvw\f\u008fÂ÷¤¿L»©\u007f[BXÐy\u0012Ý2¾·Ö;\t¼è£\u008dùµ$deG¾ü\u0084µRªòÌÚ\u009d@aõáa ]\u008c";
      int var4 = "\u008d\"c\u0088ù7\u0097z\u0007æ\r\u0015\u00952?BGfüÄ!äü\u001d¿¾\u0093\u0082^\u00142×^/tvw\f\u008fÂ÷¤¿L»©\u007f[BXÐy\u0012Ý2¾·Ö;\t¼è£\u008dùµ$deG¾ü\u0084µRªòÌÚ\u009d@aõáa ]\u008c"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 119;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
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
                        var46 = 101;
                        break;
                     case 1:
                        var46 = 11;
                        break;
                     case 2:
                        var46 = 120;
                        break;
                     case 3:
                        var46 = 101;
                        break;
                     case 4:
                        var46 = 38;
                        break;
                     case 5:
                        var46 = 58;
                        break;
                     default:
                        var46 = 126;
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
                     b = new String[5];
                     F = new Insets(0, 0, 0, 0);
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

                  var2 = "iZÀ¸²\u000eÁb\u0007\u009a\u0005¥«\u001bÇX";
                  var4 = "iZÀ¸²\u000eÁb\u0007\u009a\u0005¥«\u001bÇX".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





