package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class Tl2_2 extends T4 implements SwingConstants {
   public Map Z = new HashMap();
   public Insets N = null;
   public Insets r = null;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public Insets z() {
      return this.N;
   }

   public void P(int var1) {
      this.S(var1, var1, var1, var1);
   }

   public void S(int var1, int var2, int var3, int var4) {
      this.D(new Insets(var1, var2, var3, var4));
   }

   public void D(Insets var1) {
      this.N = var1;
   }

   public Insets w() {
      return this.r;
   }

   public void j(int var1) {
      this.H(var1, var1, var1, var1);
   }

   public void H(int var1, int var2, int var3, int var4) {
      this.o(new Insets(var1, var2, var3, var4));
   }

   public void o(Insets var1) {
      this.r = var1;
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
      // 00: invokestatic com/finalshell/core/T4.O ()I
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: istore 3
      // 0a: aload 4
      // 0c: iload 3
      // 0d: ifne 1c
      // 10: ifnull 59
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 4
      // 1c: iload 3
      // 1d: ifne 7a
      // 20: sipush -2023
      // 23: sipush -24706
      // 26: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: ifne 6e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 4
      // 38: iload 3
      // 39: ifne 7a
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: sipush -2017
      // 46: sipush 26168
      // 49: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: ifne 6e
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: new java/lang/IllegalArgumentException
      // 5c: dup
      // 5d: sipush -2024
      // 60: sipush 21477
      // 63: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 66: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 69: athrow
      // 6a: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/Tl2_2.Z Ljava/util/Map;
      // 72: aload 1
      // 73: aload 4
      // 75: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7a: pop
      // 7b: return
   }

   @Override
   public void F(Component var1) {
      this.Z.remove(var1);
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
      // 00: aload 1
      // 01: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 04: astore 3
      // 05: aload 0
      // 06: aload 1
      // 07: invokevirtual com/finalshell/core/Tl2_2.K (Ljava/awt/Container;)Ljava/awt/Insets;
      // 0a: astore 4
      // 0c: invokestatic com/finalshell/core/T4.b ()I
      // 0f: new java/awt/Dimension
      // 12: dup
      // 13: invokespecial java/awt/Dimension.<init> ()V
      // 16: astore 5
      // 18: aload 1
      // 19: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 1c: astore 6
      // 1e: aload 6
      // 20: arraylength
      // 21: istore 7
      // 23: istore 2
      // 24: bipush 0
      // 25: istore 8
      // 27: iload 8
      // 29: iload 7
      // 2b: if_icmpge bf
      // 2e: aload 6
      // 30: iload 8
      // 32: aaload
      // 33: astore 9
      // 35: aload 0
      // 36: getfield com/finalshell/core/Tl2_2.Z Ljava/util/Map;
      // 39: aload 9
      // 3b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 40: checkcast java/lang/String
      // 43: astore 10
      // 45: iload 2
      // 46: ifeq bb
      // 49: aload 10
      // 4b: ifnull b8
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: aload 10
      // 57: sipush -2022
      // 5a: sipush 29998
      // 5d: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 60: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 63: ifeq b8
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: aload 9
      // 6f: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 72: astore 11
      // 74: aload 5
      // 76: new java/awt/Dimension
      // 79: dup
      // 7a: aload 3
      // 7b: getfield java/awt/Insets.left I
      // 7e: aload 4
      // 80: getfield java/awt/Insets.left I
      // 83: iadd
      // 84: aload 11
      // 86: getfield java/awt/Dimension.width I
      // 89: iadd
      // 8a: aload 4
      // 8c: getfield java/awt/Insets.right I
      // 8f: iadd
      // 90: aload 3
      // 91: getfield java/awt/Insets.right I
      // 94: iadd
      // 95: aload 3
      // 96: getfield java/awt/Insets.top I
      // 99: aload 4
      // 9b: getfield java/awt/Insets.top I
      // 9e: iadd
      // 9f: aload 11
      // a1: getfield java/awt/Dimension.height I
      // a4: iadd
      // a5: aload 4
      // a7: getfield java/awt/Insets.bottom I
      // aa: iadd
      // ab: aload 3
      // ac: getfield java/awt/Insets.bottom I
      // af: iadd
      // b0: invokespecial java/awt/Dimension.<init> (II)V
      // b3: invokestatic com/finalshell/core/FN.h (Ljava/awt/Dimension;Ljava/awt/Dimension;)Ljava/awt/Dimension;
      // b6: astore 5
      // b8: iinc 8 1
      // bb: iload 2
      // bc: ifne 27
      // bf: aload 5
      // c1: areturn
   }

   public Insets K(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Tl2_2.N Ljava/awt/Insets;
      // 04: ifnull 2d
      // 07: aload 1
      // 08: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 0b: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 0e: ifeq 23
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/core/Tl2_2.N Ljava/awt/Insets;
      // 1c: goto 38
      // 1f: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield com/finalshell/core/Tl2_2.N Ljava/awt/Insets;
      // 27: invokestatic com/finalshell/core/FN.p (Ljava/awt/Insets;)Ljava/awt/Insets;
      // 2a: goto 38
      // 2d: new java/awt/Insets
      // 30: dup
      // 31: bipush 0
      // 32: bipush 0
      // 33: bipush 0
      // 34: bipush 0
      // 35: invokespecial java/awt/Insets.<init> (IIII)V
      // 38: areturn
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
      // 000: invokestatic com/finalshell/core/T4.b ()I
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/Tl2_2.K (Ljava/awt/Container;)Ljava/awt/Insets;
      // 00e: astore 4
      // 010: aload 1
      // 011: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 014: astore 5
      // 016: aload 5
      // 018: arraylength
      // 019: istore 6
      // 01b: bipush 0
      // 01c: istore 7
      // 01e: iload 7
      // 020: iload 6
      // 022: if_icmpge 35f
      // 025: aload 5
      // 027: iload 7
      // 029: aaload
      // 02a: astore 8
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/Tl2_2.Z Ljava/util/Map;
      // 030: aload 8
      // 032: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 037: checkcast java/lang/String
      // 03a: astore 9
      // 03c: iload 2
      // 03d: ifeq 35b
      // 040: aload 9
      // 042: ifnull 358
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual java/awt/Container.getWidth ()I
      // 050: istore 10
      // 052: aload 1
      // 053: invokevirtual java/awt/Container.getHeight ()I
      // 056: istore 11
      // 058: aload 9
      // 05a: sipush -2023
      // 05d: sipush -24706
      // 060: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 063: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 066: iload 2
      // 067: ifeq 0dd
      // 06a: ifeq 0c8
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: aload 8
      // 076: aload 3
      // 077: getfield java/awt/Insets.left I
      // 07a: aload 4
      // 07c: getfield java/awt/Insets.left I
      // 07f: iadd
      // 080: aload 3
      // 081: getfield java/awt/Insets.top I
      // 084: aload 4
      // 086: getfield java/awt/Insets.top I
      // 089: iadd
      // 08a: iload 10
      // 08c: aload 3
      // 08d: getfield java/awt/Insets.left I
      // 090: isub
      // 091: aload 3
      // 092: getfield java/awt/Insets.right I
      // 095: isub
      // 096: aload 4
      // 098: getfield java/awt/Insets.left I
      // 09b: isub
      // 09c: aload 4
      // 09e: getfield java/awt/Insets.right I
      // 0a1: isub
      // 0a2: iload 11
      // 0a4: aload 3
      // 0a5: getfield java/awt/Insets.top I
      // 0a8: isub
      // 0a9: aload 3
      // 0aa: getfield java/awt/Insets.bottom I
      // 0ad: isub
      // 0ae: aload 4
      // 0b0: getfield java/awt/Insets.top I
      // 0b3: isub
      // 0b4: aload 4
      // 0b6: getfield java/awt/Insets.bottom I
      // 0b9: isub
      // 0ba: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0bd: iload 2
      // 0be: ifne 358
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: aload 9
      // 0ca: sipush -2021
      // 0cd: sipush 28384
      // 0d0: invokestatic com/finalshell/core/Tl2_2.a (II)Ljava/lang/String;
      // 0d3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: ifeq 358
      // 0e0: aload 1
      // 0e1: checkcast com/finalshell/ui/panel/K52
      // 0e4: astore 12
      // 0e6: aload 12
      // 0e8: aload 8
      // 0ea: invokevirtual com/finalshell/ui/panel/K52.t (Ljava/awt/Component;)Lcom/finalshell/core/C_1;
      // 0ed: astore 13
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/Tl2_2.r Ljava/awt/Insets;
      // 0f3: iload 2
      // 0f4: ifeq 10c
      // 0f7: ifnull 10f
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 100: athrow
      // 101: aload 0
      // 102: getfield com/finalshell/core/Tl2_2.r Ljava/awt/Insets;
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10b: athrow
      // 10c: goto 11a
      // 10f: new java/awt/Insets
      // 112: dup
      // 113: bipush 0
      // 114: bipush 0
      // 115: bipush 0
      // 116: bipush 0
      // 117: invokespecial java/awt/Insets.<init> (IIII)V
      // 11a: astore 14
      // 11c: aload 13
      // 11e: invokevirtual com/finalshell/core/C_1.c ()Lcom/finalshell/ui/model/Rk4;
      // 121: getstatic com/finalshell/ui/model/Rk4.fill Lcom/finalshell/ui/model/Rk4;
      // 124: invokevirtual com/finalshell/ui/model/Rk4.equals (Ljava/lang/Object;)Z
      // 127: iload 2
      // 128: ifeq 19b
      // 12b: ifeq 189
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 134: athrow
      // 135: aload 8
      // 137: aload 3
      // 138: getfield java/awt/Insets.left I
      // 13b: aload 14
      // 13d: getfield java/awt/Insets.left I
      // 140: iadd
      // 141: aload 3
      // 142: getfield java/awt/Insets.top I
      // 145: aload 14
      // 147: getfield java/awt/Insets.top I
      // 14a: iadd
      // 14b: iload 10
      // 14d: aload 3
      // 14e: getfield java/awt/Insets.left I
      // 151: isub
      // 152: aload 14
      // 154: getfield java/awt/Insets.left I
      // 157: isub
      // 158: aload 3
      // 159: getfield java/awt/Insets.right I
      // 15c: isub
      // 15d: aload 14
      // 15f: getfield java/awt/Insets.right I
      // 162: isub
      // 163: iload 11
      // 165: aload 3
      // 166: getfield java/awt/Insets.top I
      // 169: isub
      // 16a: aload 14
      // 16c: getfield java/awt/Insets.top I
      // 16f: isub
      // 170: aload 3
      // 171: getfield java/awt/Insets.bottom I
      // 174: isub
      // 175: aload 14
      // 177: getfield java/awt/Insets.bottom I
      // 17a: isub
      // 17b: invokevirtual java/awt/Component.setBounds (IIII)V
      // 17e: iload 2
      // 17f: ifne 358
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 188: athrow
      // 189: aload 13
      // 18b: invokevirtual com/finalshell/core/C_1.c ()Lcom/finalshell/ui/model/Rk4;
      // 18e: getstatic com/finalshell/ui/model/Rk4.align Lcom/finalshell/ui/model/Rk4;
      // 191: invokevirtual com/finalshell/ui/model/Rk4.equals (Ljava/lang/Object;)Z
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19a: athrow
      // 19b: ifeq 33f
      // 19e: aload 8
      // 1a0: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 1a3: astore 15
      // 1a5: aload 0
      // 1a6: aload 8
      // 1a8: aload 13
      // 1aa: invokevirtual com/finalshell/core/Tl2_2.g (Ljava/awt/Component;Lcom/finalshell/core/C_1;)I
      // 1ad: istore 17
      // 1af: iload 17
      // 1b1: bipush 2
      // 1b2: iload 2
      // 1b3: ifeq 1e8
      // 1b6: if_icmpeq 1d8
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bf: athrow
      // 1c0: iload 17
      // 1c2: bipush -1
      // 1c3: iload 2
      // 1c4: ifeq 1f9
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cd: athrow
      // 1ce: if_icmpne 1ef
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d7: athrow
      // 1d8: aload 3
      // 1d9: getfield java/awt/Insets.left I
      // 1dc: aload 14
      // 1de: getfield java/awt/Insets.left I
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e7: athrow
      // 1e8: iadd
      // 1e9: istore 16
      // 1eb: iload 2
      // 1ec: ifne 235
      // 1ef: iload 17
      // 1f1: bipush 4
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f8: athrow
      // 1f9: iload 2
      // 1fa: ifeq 232
      // 1fd: if_icmpne 220
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 206: athrow
      // 207: iload 10
      // 209: aload 3
      // 20a: getfield java/awt/Insets.right I
      // 20d: isub
      // 20e: aload 14
      // 210: getfield java/awt/Insets.right I
      // 213: isub
      // 214: aload 15
      // 216: getfield java/awt/Dimension.width I
      // 219: isub
      // 21a: istore 16
      // 21c: iload 2
      // 21d: ifne 235
      // 220: iload 10
      // 222: bipush 2
      // 223: idiv
      // 224: aload 15
      // 226: getfield java/awt/Dimension.width I
      // 229: bipush 2
      // 22a: idiv
      // 22b: goto 232
      // 22e: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 231: athrow
      // 232: isub
      // 233: istore 16
      // 235: aload 13
      // 237: invokevirtual com/finalshell/core/C_1.X ()I
      // 23a: istore 19
      // 23c: iload 19
      // 23e: bipush 1
      // 23f: iload 2
      // 240: ifeq 275
      // 243: if_icmpeq 265
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24c: athrow
      // 24d: iload 19
      // 24f: bipush -1
      // 250: iload 2
      // 251: ifeq 286
      // 254: goto 25b
      // 257: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25a: athrow
      // 25b: if_icmpne 27c
      // 25e: goto 265
      // 261: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 264: athrow
      // 265: aload 3
      // 266: getfield java/awt/Insets.top I
      // 269: aload 14
      // 26b: getfield java/awt/Insets.top I
      // 26e: goto 275
      // 271: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 274: athrow
      // 275: iadd
      // 276: istore 18
      // 278: iload 2
      // 279: ifne 2c2
      // 27c: iload 19
      // 27e: bipush 3
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 285: athrow
      // 286: iload 2
      // 287: ifeq 2bf
      // 28a: if_icmpne 2ad
      // 28d: goto 294
      // 290: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 293: athrow
      // 294: iload 11
      // 296: aload 3
      // 297: getfield java/awt/Insets.bottom I
      // 29a: isub
      // 29b: aload 14
      // 29d: getfield java/awt/Insets.bottom I
      // 2a0: isub
      // 2a1: aload 15
      // 2a3: getfield java/awt/Dimension.height I
      // 2a6: isub
      // 2a7: istore 18
      // 2a9: iload 2
      // 2aa: ifne 2c2
      // 2ad: iload 11
      // 2af: bipush 2
      // 2b0: idiv
      // 2b1: aload 15
      // 2b3: getfield java/awt/Dimension.height I
      // 2b6: bipush 2
      // 2b7: idiv
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2be: athrow
      // 2bf: isub
      // 2c0: istore 18
      // 2c2: aload 8
      // 2c4: iload 16
      // 2c6: iload 18
      // 2c8: iload 17
      // 2ca: bipush -1
      // 2cb: iload 2
      // 2cc: ifeq 2f7
      // 2cf: if_icmpne 2fb
      // 2d2: goto 2d9
      // 2d5: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d8: athrow
      // 2d9: iload 10
      // 2db: aload 3
      // 2dc: getfield java/awt/Insets.left I
      // 2df: isub
      // 2e0: aload 14
      // 2e2: getfield java/awt/Insets.left I
      // 2e5: isub
      // 2e6: aload 3
      // 2e7: getfield java/awt/Insets.right I
      // 2ea: isub
      // 2eb: aload 14
      // 2ed: getfield java/awt/Insets.right I
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f6: athrow
      // 2f7: isub
      // 2f8: goto 300
      // 2fb: aload 15
      // 2fd: getfield java/awt/Dimension.width I
      // 300: iload 19
      // 302: bipush -1
      // 303: iload 2
      // 304: ifeq 32f
      // 307: if_icmpne 333
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 310: athrow
      // 311: iload 11
      // 313: aload 3
      // 314: getfield java/awt/Insets.top I
      // 317: isub
      // 318: aload 14
      // 31a: getfield java/awt/Insets.top I
      // 31d: isub
      // 31e: aload 3
      // 31f: getfield java/awt/Insets.bottom I
      // 322: isub
      // 323: aload 14
      // 325: getfield java/awt/Insets.bottom I
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32e: athrow
      // 32f: isub
      // 330: goto 338
      // 333: aload 15
      // 335: getfield java/awt/Dimension.height I
      // 338: invokevirtual java/awt/Component.setBounds (IIII)V
      // 33b: iload 2
      // 33c: ifne 358
      // 33f: aload 8
      // 341: aload 13
      // 343: invokevirtual com/finalshell/core/C_1.Q ()Lcom/finalshell/core/E_2;
      // 346: invokeinterface com/finalshell/core/E_2.J ()Ljava/lang/Object; 1
      // 34b: checkcast java/awt/Rectangle
      // 34e: invokevirtual java/awt/Component.setBounds (Ljava/awt/Rectangle;)V
      // 351: goto 358
      // 354: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 357: athrow
      // 358: iinc 7 1
      // 35b: iload 2
      // 35c: ifne 01e
      // 35f: return
   }

   public int g(Component param1, C_1 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/T4.b ()I
      // 03: aload 1
      // 04: invokevirtual java/awt/Component.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 07: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 0a: istore 4
      // 0c: istore 3
      // 0d: aload 2
      // 0e: invokevirtual com/finalshell/core/C_1.r ()I
      // 11: sipush 32548
      // 14: ldc2_w 4088805968362956966
      // 17: invokestatic com/finalshell/core/Tl2_2.b (IJ)I
      // 1a: iload 3
      // 1b: ifeq 5d
      // 1e: if_icmpne 45
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: iload 4
      // 2a: iload 3
      // 2b: ifeq 40
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: bipush 2
      // 40: goto 44
      // 43: bipush 4
      // 44: ireturn
      // 45: aload 2
      // 46: invokevirtual com/finalshell/core/C_1.r ()I
      // 49: iload 3
      // 4a: ifeq 81
      // 4d: sipush 2086
      // 50: ldc2_w 547958800876478373
      // 53: invokestatic com/finalshell/core/Tl2_2.b (IJ)I
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: if_icmpne 7d
      // 60: iload 4
      // 62: iload 3
      // 63: ifeq 78
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: ifeq 7b
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Tl2_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 76: athrow
      // 77: bipush 4
      // 78: goto 7c
      // 7b: bipush 2
      // 7c: ireturn
      // 7d: aload 2
      // 7e: invokevirtual com/finalshell/core/C_1.r ()I
      // 81: ireturn
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -2021) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 49;
               break;
            case 1:
               var10000 = 75;
               break;
            case 2:
               var10000 = 4;
               break;
            case 3:
               var10000 = 167;
               break;
            case 4:
               var10000 = 83;
               break;
            case 5:
               var10000 = 86;
               break;
            case 6:
               var10000 = 12;
               break;
            case 7:
               var10000 = 65;
               break;
            case 8:
               var10000 = 74;
               break;
            case 9:
               var10000 = 54;
               break;
            case 10:
               var10000 = 180;
               break;
            case 11:
               var10000 = 233;
               break;
            case 12:
               var10000 = 150;
               break;
            case 13:
               var10000 = 171;
               break;
            case 14:
               var10000 = 31;
               break;
            case 15:
               var10000 = 200;
               break;
            case 16:
               var10000 = 251;
               break;
            case 17:
               var10000 = 145;
               break;
            case 18:
               var10000 = 143;
               break;
            case 19:
               var10000 = 87;
               break;
            case 20:
               var10000 = 163;
               break;
            case 21:
               var10000 = 93;
               break;
            case 22:
               var10000 = 230;
               break;
            case 23:
               var10000 = 5;
               break;
            case 24:
               var10000 = 213;
               break;
            case 25:
               var10000 = 15;
               break;
            case 26:
               var10000 = 79;
               break;
            case 27:
               var10000 = 46;
               break;
            case 28:
               var10000 = 240;
               break;
            case 29:
               var10000 = 58;
               break;
            case 30:
               var10000 = 42;
               break;
            case 31:
               var10000 = 157;
               break;
            case 32:
               var10000 = 173;
               break;
            case 33:
               var10000 = 36;
               break;
            case 34:
               var10000 = 174;
               break;
            case 35:
               var10000 = 44;
               break;
            case 36:
               var10000 = 131;
               break;
            case 37:
               var10000 = 245;
               break;
            case 38:
               var10000 = 112;
               break;
            case 39:
               var10000 = 159;
               break;
            case 40:
               var10000 = 10;
               break;
            case 41:
               var10000 = 37;
               break;
            case 42:
               var10000 = 118;
               break;
            case 43:
               var10000 = 205;
               break;
            case 44:
               var10000 = 208;
               break;
            case 45:
               var10000 = 126;
               break;
            case 46:
               var10000 = 8;
               break;
            case 47:
               var10000 = 88;
               break;
            case 48:
               var10000 = 202;
               break;
            case 49:
               var10000 = 144;
               break;
            case 50:
               var10000 = 121;
               break;
            case 51:
               var10000 = 19;
               break;
            case 52:
               var10000 = 211;
               break;
            case 53:
               var10000 = 130;
               break;
            case 54:
               var10000 = 78;
               break;
            case 55:
               var10000 = 55;
               break;
            case 56:
               var10000 = 32;
               break;
            case 57:
               var10000 = 59;
               break;
            case 58:
               var10000 = 164;
               break;
            case 59:
               var10000 = 35;
               break;
            case 60:
               var10000 = 90;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 56;
               break;
            case 63:
               var10000 = 20;
               break;
            case 64:
               var10000 = 191;
               break;
            case 65:
               var10000 = 27;
               break;
            case 66:
               var10000 = 220;
               break;
            case 67:
               var10000 = 172;
               break;
            case 68:
               var10000 = 68;
               break;
            case 69:
               var10000 = 43;
               break;
            case 70:
               var10000 = 166;
               break;
            case 71:
               var10000 = 250;
               break;
            case 72:
               var10000 = 91;
               break;
            case 73:
               var10000 = 123;
               break;
            case 74:
               var10000 = 197;
               break;
            case 75:
               var10000 = 181;
               break;
            case 76:
               var10000 = 162;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 137;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 244;
               break;
            case 81:
               var10000 = 222;
               break;
            case 82:
               var10000 = 246;
               break;
            case 83:
               var10000 = 3;
               break;
            case 84:
               var10000 = 217;
               break;
            case 85:
               var10000 = 21;
               break;
            case 86:
               var10000 = 39;
               break;
            case 87:
               var10000 = 204;
               break;
            case 88:
               var10000 = 82;
               break;
            case 89:
               var10000 = 158;
               break;
            case 90:
               var10000 = 47;
               break;
            case 91:
               var10000 = 114;
               break;
            case 92:
               var10000 = 249;
               break;
            case 93:
               var10000 = 40;
               break;
            case 94:
               var10000 = 224;
               break;
            case 95:
               var10000 = 80;
               break;
            case 96:
               var10000 = 179;
               break;
            case 97:
               var10000 = 199;
               break;
            case 98:
               var10000 = 140;
               break;
            case 99:
               var10000 = 219;
               break;
            case 100:
               var10000 = 61;
               break;
            case 101:
               var10000 = 124;
               break;
            case 102:
               var10000 = 183;
               break;
            case 103:
               var10000 = 146;
               break;
            case 104:
               var10000 = 96;
               break;
            case 105:
               var10000 = 38;
               break;
            case 106:
               var10000 = 33;
               break;
            case 107:
               var10000 = 196;
               break;
            case 108:
               var10000 = 52;
               break;
            case 109:
               var10000 = 177;
               break;
            case 110:
               var10000 = 133;
               break;
            case 111:
               var10000 = 135;
               break;
            case 112:
               var10000 = 51;
               break;
            case 113:
               var10000 = 247;
               break;
            case 114:
               var10000 = 195;
               break;
            case 115:
               var10000 = 92;
               break;
            case 116:
               var10000 = 152;
               break;
            case 117:
               var10000 = 9;
               break;
            case 118:
               var10000 = 209;
               break;
            case 119:
               var10000 = 193;
               break;
            case 120:
               var10000 = 243;
               break;
            case 121:
               var10000 = 165;
               break;
            case 122:
               var10000 = 169;
               break;
            case 123:
               var10000 = 136;
               break;
            case 124:
               var10000 = 17;
               break;
            case 125:
               var10000 = 236;
               break;
            case 126:
               var10000 = 70;
               break;
            case 127:
               var10000 = 11;
               break;
            case 128:
               var10000 = 206;
               break;
            case 129:
               var10000 = 238;
               break;
            case 130:
               var10000 = 107;
               break;
            case 131:
               var10000 = 229;
               break;
            case 132:
               var10000 = 139;
               break;
            case 133:
               var10000 = 81;
               break;
            case 134:
               var10000 = 168;
               break;
            case 135:
               var10000 = 186;
               break;
            case 136:
               var10000 = 66;
               break;
            case 137:
               var10000 = 175;
               break;
            case 138:
               var10000 = 218;
               break;
            case 139:
               var10000 = 248;
               break;
            case 140:
               var10000 = 225;
               break;
            case 141:
               var10000 = 235;
               break;
            case 142:
               var10000 = 223;
               break;
            case 143:
               var10000 = 119;
               break;
            case 144:
               var10000 = 57;
               break;
            case 145:
               var10000 = 201;
               break;
            case 146:
               var10000 = 64;
               break;
            case 147:
               var10000 = 53;
               break;
            case 148:
               var10000 = 221;
               break;
            case 149:
               var10000 = 216;
               break;
            case 150:
               var10000 = 125;
               break;
            case 151:
               var10000 = 142;
               break;
            case 152:
               var10000 = 115;
               break;
            case 153:
               var10000 = 89;
               break;
            case 154:
               var10000 = 84;
               break;
            case 155:
               var10000 = 226;
               break;
            case 156:
               var10000 = 26;
               break;
            case 157:
               var10000 = 253;
               break;
            case 158:
               var10000 = 108;
               break;
            case 159:
               var10000 = 41;
               break;
            case 160:
               var10000 = 71;
               break;
            case 161:
               var10000 = 24;
               break;
            case 162:
               var10000 = 198;
               break;
            case 163:
               var10000 = 228;
               break;
            case 164:
               var10000 = 127;
               break;
            case 165:
               var10000 = 100;
               break;
            case 166:
               var10000 = 6;
               break;
            case 167:
               var10000 = 147;
               break;
            case 168:
               var10000 = 22;
               break;
            case 169:
               var10000 = 154;
               break;
            case 170:
               var10000 = 210;
               break;
            case 171:
               var10000 = 109;
               break;
            case 172:
               var10000 = 252;
               break;
            case 173:
               var10000 = 254;
               break;
            case 174:
               var10000 = 28;
               break;
            case 175:
               var10000 = 151;
               break;
            case 176:
               var10000 = 227;
               break;
            case 177:
               var10000 = 76;
               break;
            case 178:
               var10000 = 241;
               break;
            case 179:
               var10000 = 184;
               break;
            case 180:
               var10000 = 190;
               break;
            case 181:
               var10000 = 102;
               break;
            case 182:
               var10000 = 185;
               break;
            case 183:
               var10000 = 34;
               break;
            case 184:
               var10000 = 187;
               break;
            case 185:
               var10000 = 23;
               break;
            case 186:
               var10000 = 29;
               break;
            case 187:
               var10000 = 63;
               break;
            case 188:
               var10000 = 237;
               break;
            case 189:
               var10000 = 60;
               break;
            case 190:
               var10000 = 77;
               break;
            case 191:
               var10000 = 113;
               break;
            case 192:
               var10000 = 161;
               break;
            case 193:
               var10000 = 212;
               break;
            case 194:
               var10000 = 141;
               break;
            case 195:
               var10000 = 207;
               break;
            case 196:
               var10000 = 85;
               break;
            case 197:
               var10000 = 188;
               break;
            case 198:
               var10000 = 95;
               break;
            case 199:
               var10000 = 149;
               break;
            case 200:
               var10000 = 13;
               break;
            case 201:
               var10000 = 182;
               break;
            case 202:
               var10000 = 106;
               break;
            case 203:
               var10000 = 50;
               break;
            case 204:
               var10000 = 14;
               break;
            case 205:
               var10000 = 99;
               break;
            case 206:
               var10000 = 120;
               break;
            case 207:
               var10000 = 129;
               break;
            case 208:
               var10000 = 138;
               break;
            case 209:
               var10000 = 110;
               break;
            case 210:
               var10000 = 7;
               break;
            case 211:
               var10000 = 0;
               break;
            case 212:
               var10000 = 103;
               break;
            case 213:
               var10000 = 153;
               break;
            case 214:
               var10000 = 94;
               break;
            case 215:
               var10000 = 215;
               break;
            case 216:
               var10000 = 148;
               break;
            case 217:
               var10000 = 239;
               break;
            case 218:
               var10000 = 117;
               break;
            case 219:
               var10000 = 67;
               break;
            case 220:
               var10000 = 69;
               break;
            case 221:
               var10000 = 25;
               break;
            case 222:
               var10000 = 122;
               break;
            case 223:
               var10000 = 62;
               break;
            case 224:
               var10000 = 234;
               break;
            case 225:
               var10000 = 155;
               break;
            case 226:
               var10000 = 255;
               break;
            case 227:
               var10000 = 132;
               break;
            case 228:
               var10000 = 18;
               break;
            case 229:
               var10000 = 116;
               break;
            case 230:
               var10000 = 111;
               break;
            case 231:
               var10000 = 214;
               break;
            case 232:
               var10000 = 203;
               break;
            case 233:
               var10000 = 101;
               break;
            case 234:
               var10000 = 178;
               break;
            case 235:
               var10000 = 194;
               break;
            case 236:
               var10000 = 232;
               break;
            case 237:
               var10000 = 30;
               break;
            case 238:
               var10000 = 192;
               break;
            case 239:
               var10000 = 1;
               break;
            case 240:
               var10000 = 134;
               break;
            case 241:
               var10000 = 170;
               break;
            case 242:
               var10000 = 48;
               break;
            case 243:
               var10000 = 73;
               break;
            case 244:
               var10000 = 2;
               break;
            case 245:
               var10000 = 160;
               break;
            case 246:
               var10000 = 156;
               break;
            case 247:
               var10000 = 128;
               break;
            case 248:
               var10000 = 45;
               break;
            case 249:
               var10000 = 176;
               break;
            case 250:
               var10000 = 16;
               break;
            case 251:
               var10000 = 98;
               break;
            case 252:
               var10000 = 104;
               break;
            case 253:
               var10000 = 189;
               break;
            case 254:
               var10000 = 242;
               break;
            default:
               var10000 = 97;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6019;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "H\u0095\u001aV]#\u0090\t\u001dþ5\u0003²Ä\u0012\u0013ì\tâ\u0099ÊïMYí \u0013";
      int var12 = "H\u0095\u001aV]#\u0090\t\u001dþ5\u0003²Ä\u0012\u0013ì\tâ\u0099ÊïMYí \u0013".length();
      char var9 = 7;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 36;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 65;
                        break;
                     case 1:
                        var58 = 23;
                        break;
                     case 2:
                        var58 = 120;
                        break;
                     case 3:
                        var58 = 104;
                        break;
                     case 4:
                        var58 = 16;
                        break;
                     case 5:
                        var58 = 29;
                        break;
                     default:
                        var58 = 5;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[5];
                     long var0 = 978012220266766411L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "dÎk\u000fó7\u007få/²µ\u009cÝ8\u0088ç";
                     int var5 = "dÎk\u000fó7\u007få/²µ\u009cÝ8\u0088ç".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     d = var6;
                     e = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "]Û¬ÀTÍ=ÒB1\u0018·J9WÇ0B(¼ñ½\u0085¾I+ü\u001fô\u0013ÿÊqÌjÚG$èÈ\u0011âµu\u0092Àô\u000ehø\u0011ýD\u001eÜtp@ÙsøÍSÕ\u0081ª\u0018\bn\u0087ov\u0007¦·u \u0002OÉ";
                  var12 = "]Û¬ÀTÍ=ÒB1\u0018·J9WÇ0B(¼ñ½\u0085¾I+ü\u001fô\u0013ÿÊqÌjÚG$èÈ\u0011âµu\u0092Àô\u000ehø\u0011ýD\u001eÜtp@ÙsøÍSÕ\u0081ª\u0018\bn\u0087ov\u0007¦·u \u0002OÉ"
                     .length();
                  var9 = 'H';
                  var16 = -1;
            }

            var10000 = 16;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





