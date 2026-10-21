package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class NP_2 extends T4 implements SwingConstants {
   public Map E;
   public Insets H;
   public Insets r;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public NP_2() {
      HashMap var10001 = new HashMap();
      long var2 = 232621628964701672L;
      HashMap var1 = var10001;
      Ref.s(232621628964701672L, var1, var2);
      long var4 = 319278625247167072L;
      Object var3 = null;
      Ref.s(319278625247167072L, var3, var4);
      long var6 = 449571377597292178L;
      Object var5 = null;
      Ref.s(449571377597292178L, var5, var6);
   }

   public Insets H() {
      Object var1 = 319278625247167072L;
      return (Insets)Ref.g(319278625247167072L, var1);
   }

   public void A(int var1) {
      Object[] var10001 = Registry.packArgs(var1, var1, var1, var1);
      long var3 = 366364782117642186L;
      Object[] var2 = var10001;
      Ref.h(366364782117642186L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void w(int var1, int var2, int var3, int var4) {
      Object[] var10001 = Registry.packArgs(new Insets(var1, var2, var3, var4));
      long var6 = 592667338758188707L;
      Object[] var5 = var10001;
      Ref.h(592667338758188707L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void x(Insets var1) {
      long var3 = 319278625247167072L;
      Ref.s(319278625247167072L, var1, var3);
   }

   public Insets w() {
      Object var1 = 449571377597292178L;
      return (Insets)Ref.g(449571377597292178L, var1);
   }

   public void V(int var1) {
      Object[] var10001 = Registry.packArgs(var1, var1, var1, var1);
      long var3 = 204170067243007436L;
      Object[] var2 = var10001;
      Ref.h(204170067243007436L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void F(int var1, int var2, int var3, int var4) {
      Object[] var10001 = Registry.packArgs(new Insets(var1, var2, var3, var4));
      long var6 = 539827804849763183L;
      Object[] var5 = var10001;
      Ref.h(539827804849763183L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void q(Insets var1) {
      long var3 = 449571377597292178L;
      Ref.s(449571377597292178L, var1, var3);
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
      // 00: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: aload 3
      // 0d: ifnonnull 1c
      // 10: ifnull 59
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 4
      // 1c: aload 3
      // 1d: ifnonnull 87
      // 20: sipush -21869
      // 23: sipush 27444
      // 26: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: ifne 6e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 4
      // 38: aload 3
      // 39: ifnonnull 87
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: sipush -21872
      // 46: sipush 12452
      // 49: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: ifne 6e
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: new java/lang/IllegalArgumentException
      // 5c: dup
      // 5d: sipush -21870
      // 60: sipush 25675
      // 63: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 66: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 69: athrow
      // 6a: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: aload 0
      // 6f: ldc2_w 232621628964701672
      // 72: astore 5
      // 74: ldc2_w 232621628964701672
      // 77: aload 5
      // 79: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 7c: checkcast java/util/Map
      // 7f: aload 1
      // 80: aload 4
      // 82: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 87: pop
      // 88: return
   }

   @Override
   public void F(Component var1) {
      Object var2 = 232621628964701672L;
      ((Map)Ref.g(232621628964701672L, var2)).remove(var1);
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
      // 07: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a: ldc2_w 488644587593575643
      // 0d: astore 13
      // 0f: astore 12
      // 11: ldc2_w 488644587593575643
      // 14: aload 12
      // 16: aload 13
      // 18: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b: checkcast java/awt/Insets
      // 1e: goto 25
      // 21: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24: athrow
      // 25: astore 4
      // 27: new java/awt/Dimension
      // 2a: dup
      // 2b: invokespecial java/awt/Dimension.<init> ()V
      // 2e: astore 5
      // 30: aload 1
      // 31: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 34: astore 6
      // 36: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 39: aload 6
      // 3b: arraylength
      // 3c: istore 7
      // 3e: astore 2
      // 3f: bipush 0
      // 40: istore 8
      // 42: iload 8
      // 44: iload 7
      // 46: if_icmpge e7
      // 49: aload 6
      // 4b: iload 8
      // 4d: aaload
      // 4e: astore 9
      // 50: aload 0
      // 51: ldc2_w 232621628964701672
      // 54: astore 14
      // 56: ldc2_w 232621628964701672
      // 59: aload 14
      // 5b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5e: checkcast java/util/Map
      // 61: aload 9
      // 63: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 68: checkcast java/lang/String
      // 6b: astore 10
      // 6d: aload 2
      // 6e: ifnonnull e3
      // 71: aload 10
      // 73: ifnull e0
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c: athrow
      // 7d: aload 10
      // 7f: sipush -21869
      // 82: sipush 27444
      // 85: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 88: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8b: ifeq e0
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 94: athrow
      // 95: aload 9
      // 97: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 9a: astore 11
      // 9c: aload 5
      // 9e: new java/awt/Dimension
      // a1: dup
      // a2: aload 3
      // a3: getfield java/awt/Insets.left I
      // a6: aload 4
      // a8: getfield java/awt/Insets.left I
      // ab: iadd
      // ac: aload 11
      // ae: getfield java/awt/Dimension.width I
      // b1: iadd
      // b2: aload 4
      // b4: getfield java/awt/Insets.right I
      // b7: iadd
      // b8: aload 3
      // b9: getfield java/awt/Insets.right I
      // bc: iadd
      // bd: aload 3
      // be: getfield java/awt/Insets.top I
      // c1: aload 4
      // c3: getfield java/awt/Insets.top I
      // c6: iadd
      // c7: aload 11
      // c9: getfield java/awt/Dimension.height I
      // cc: iadd
      // cd: aload 4
      // cf: getfield java/awt/Insets.bottom I
      // d2: iadd
      // d3: aload 3
      // d4: getfield java/awt/Insets.bottom I
      // d7: iadd
      // d8: invokespecial java/awt/Dimension.<init> (II)V
      // db: invokestatic com/finalshell/core/FN.h (Ljava/awt/Dimension;Ljava/awt/Dimension;)Ljava/awt/Dimension;
      // de: astore 5
      // e0: iinc 8 1
      // e3: aload 2
      // e4: ifnull 42
      // e7: aload 5
      // e9: areturn
   }

   public Insets J(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ldc2_w 319278625247167072
      // 04: astore 2
      // 05: ldc2_w 319278625247167072
      // 08: aload 2
      // 09: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c: checkcast java/awt/Insets
      // 0f: ifnull 52
      // 12: aload 1
      // 13: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 16: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 19: ifeq 3b
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 0
      // 24: ldc2_w 319278625247167072
      // 27: astore 4
      // 29: ldc2_w 319278625247167072
      // 2c: aload 4
      // 2e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 31: checkcast java/awt/Insets
      // 34: goto 5d
      // 37: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: ldc2_w 319278625247167072
      // 3f: astore 6
      // 41: ldc2_w 319278625247167072
      // 44: aload 6
      // 46: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 49: checkcast java/awt/Insets
      // 4c: invokestatic com/finalshell/core/FN.p (Ljava/awt/Insets;)Ljava/awt/Insets;
      // 4f: goto 5d
      // 52: new java/awt/Insets
      // 55: dup
      // 56: bipush 0
      // 57: bipush 0
      // 58: bipush 0
      // 59: bipush 0
      // 5a: invokespecial java/awt/Insets.<init> (IIII)V
      // 5d: areturn
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
      // 000: aload 1
      // 001: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 004: astore 3
      // 005: aload 0
      // 006: aload 1
      // 007: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 00a: ldc2_w 488644587593575643
      // 00d: astore 21
      // 00f: astore 20
      // 011: ldc2_w 488644587593575643
      // 014: aload 20
      // 016: aload 21
      // 018: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01b: checkcast java/awt/Insets
      // 01e: goto 025
      // 021: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 024: athrow
      // 025: astore 4
      // 027: aload 1
      // 028: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 02b: astore 5
      // 02d: aload 5
      // 02f: arraylength
      // 030: istore 6
      // 032: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 035: bipush 0
      // 036: istore 7
      // 038: astore 2
      // 039: iload 7
      // 03b: iload 6
      // 03d: if_icmpge 3ee
      // 040: aload 5
      // 042: iload 7
      // 044: aaload
      // 045: astore 8
      // 047: aload 0
      // 048: ldc2_w 232621628964701672
      // 04b: astore 22
      // 04d: ldc2_w 232621628964701672
      // 050: aload 22
      // 052: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 055: checkcast java/util/Map
      // 058: aload 8
      // 05a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05f: checkcast java/lang/String
      // 062: astore 9
      // 064: aload 2
      // 065: ifnonnull 3ea
      // 068: aload 9
      // 06a: ifnull 3e7
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: aload 1
      // 075: invokevirtual java/awt/Container.getWidth ()I
      // 078: istore 10
      // 07a: aload 1
      // 07b: invokevirtual java/awt/Container.getHeight ()I
      // 07e: istore 11
      // 080: aload 9
      // 082: sipush -21866
      // 085: sipush 15761
      // 088: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 08b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08e: aload 2
      // 08f: ifnonnull 105
      // 092: ifeq 0f0
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09b: athrow
      // 09c: aload 8
      // 09e: aload 3
      // 09f: getfield java/awt/Insets.left I
      // 0a2: aload 4
      // 0a4: getfield java/awt/Insets.left I
      // 0a7: iadd
      // 0a8: aload 3
      // 0a9: getfield java/awt/Insets.top I
      // 0ac: aload 4
      // 0ae: getfield java/awt/Insets.top I
      // 0b1: iadd
      // 0b2: iload 10
      // 0b4: aload 3
      // 0b5: getfield java/awt/Insets.left I
      // 0b8: isub
      // 0b9: aload 3
      // 0ba: getfield java/awt/Insets.right I
      // 0bd: isub
      // 0be: aload 4
      // 0c0: getfield java/awt/Insets.left I
      // 0c3: isub
      // 0c4: aload 4
      // 0c6: getfield java/awt/Insets.right I
      // 0c9: isub
      // 0ca: iload 11
      // 0cc: aload 3
      // 0cd: getfield java/awt/Insets.top I
      // 0d0: isub
      // 0d1: aload 3
      // 0d2: getfield java/awt/Insets.bottom I
      // 0d5: isub
      // 0d6: aload 4
      // 0d8: getfield java/awt/Insets.top I
      // 0db: isub
      // 0dc: aload 4
      // 0de: getfield java/awt/Insets.bottom I
      // 0e1: isub
      // 0e2: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0e5: aload 2
      // 0e6: ifnull 3e7
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: aload 9
      // 0f2: sipush -21871
      // 0f5: sipush -19497
      // 0f8: invokestatic com/finalshell/core/NP_2.a (II)Ljava/lang/String;
      // 0fb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 104: athrow
      // 105: ifeq 3e7
      // 108: aload 1
      // 109: checkcast com/finalshell/ui/panel/Mj2
      // 10c: astore 12
      // 10e: aload 12
      // 110: aload 8
      // 112: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 115: ldc2_w 301251920477522944
      // 118: astore 25
      // 11a: astore 24
      // 11c: ldc2_w 301251920477522944
      // 11f: aload 24
      // 121: aload 25
      // 123: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 126: checkcast com/finalshell/core/C_1
      // 129: goto 130
      // 12c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12f: athrow
      // 130: astore 13
      // 132: aload 0
      // 133: ldc2_w 449571377597292178
      // 136: astore 26
      // 138: ldc2_w 449571377597292178
      // 13b: aload 26
      // 13d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 140: checkcast java/awt/Insets
      // 143: aload 2
      // 144: ifnonnull 169
      // 147: ifnull 16c
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 150: athrow
      // 151: aload 0
      // 152: ldc2_w 449571377597292178
      // 155: astore 28
      // 157: ldc2_w 449571377597292178
      // 15a: aload 28
      // 15c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15f: checkcast java/awt/Insets
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: goto 177
      // 16c: new java/awt/Insets
      // 16f: dup
      // 170: bipush 0
      // 171: bipush 0
      // 172: bipush 0
      // 173: bipush 0
      // 174: invokespecial java/awt/Insets.<init> (IIII)V
      // 177: astore 14
      // 179: aload 13
      // 17b: invokevirtual com/finalshell/core/C_1.c ()Lcom/finalshell/ui/model/Rk4;
      // 17e: ldc2_w 450139753234189664
      // 181: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 184: aconst_null
      // 185: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 188: checkcast com/finalshell/ui/model/Ci4
      // 18b: invokevirtual com/finalshell/ui/model/Rk4.equals (Ljava/lang/Object;)Z
      // 18e: aload 2
      // 18f: ifnonnull 20c
      // 192: ifeq 1f0
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: aload 8
      // 19e: aload 3
      // 19f: getfield java/awt/Insets.left I
      // 1a2: aload 14
      // 1a4: getfield java/awt/Insets.left I
      // 1a7: iadd
      // 1a8: aload 3
      // 1a9: getfield java/awt/Insets.top I
      // 1ac: aload 14
      // 1ae: getfield java/awt/Insets.top I
      // 1b1: iadd
      // 1b2: iload 10
      // 1b4: aload 3
      // 1b5: getfield java/awt/Insets.left I
      // 1b8: isub
      // 1b9: aload 14
      // 1bb: getfield java/awt/Insets.left I
      // 1be: isub
      // 1bf: aload 3
      // 1c0: getfield java/awt/Insets.right I
      // 1c3: isub
      // 1c4: aload 14
      // 1c6: getfield java/awt/Insets.right I
      // 1c9: isub
      // 1ca: iload 11
      // 1cc: aload 3
      // 1cd: getfield java/awt/Insets.top I
      // 1d0: isub
      // 1d1: aload 14
      // 1d3: getfield java/awt/Insets.top I
      // 1d6: isub
      // 1d7: aload 3
      // 1d8: getfield java/awt/Insets.bottom I
      // 1db: isub
      // 1dc: aload 14
      // 1de: getfield java/awt/Insets.bottom I
      // 1e1: isub
      // 1e2: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1e5: aload 2
      // 1e6: ifnull 3e7
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ef: athrow
      // 1f0: aload 13
      // 1f2: invokevirtual com/finalshell/core/C_1.c ()Lcom/finalshell/ui/model/Rk4;
      // 1f5: ldc2_w 125951356802921136
      // 1f8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1fb: aconst_null
      // 1fc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ff: checkcast com/finalshell/ui/model/Ci4
      // 202: invokevirtual com/finalshell/ui/model/Rk4.equals (Ljava/lang/Object;)Z
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20b: athrow
      // 20c: ifeq 3ce
      // 20f: aload 8
      // 211: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 214: astore 15
      // 216: aload 0
      // 217: aload 8
      // 219: aload 13
      // 21b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 21e: ldc2_w 558852456288832772
      // 221: astore 31
      // 223: astore 30
      // 225: ldc2_w 558852456288832772
      // 228: aload 30
      // 22a: aload 31
      // 22c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22f: checkcast java/lang/Integer
      // 232: invokevirtual java/lang/Integer.intValue ()I
      // 235: goto 23c
      // 238: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: istore 17
      // 23e: iload 17
      // 240: bipush 2
      // 241: aload 2
      // 242: ifnonnull 277
      // 245: if_icmpeq 267
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24e: athrow
      // 24f: iload 17
      // 251: bipush -1
      // 252: aload 2
      // 253: ifnonnull 288
      // 256: goto 25d
      // 259: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25c: athrow
      // 25d: if_icmpne 27e
      // 260: goto 267
      // 263: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 266: athrow
      // 267: aload 3
      // 268: getfield java/awt/Insets.left I
      // 26b: aload 14
      // 26d: getfield java/awt/Insets.left I
      // 270: goto 277
      // 273: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 276: athrow
      // 277: iadd
      // 278: istore 16
      // 27a: aload 2
      // 27b: ifnull 2c4
      // 27e: iload 17
      // 280: bipush 4
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 287: athrow
      // 288: aload 2
      // 289: ifnonnull 2c1
      // 28c: if_icmpne 2af
      // 28f: goto 296
      // 292: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 295: athrow
      // 296: iload 10
      // 298: aload 3
      // 299: getfield java/awt/Insets.right I
      // 29c: isub
      // 29d: aload 14
      // 29f: getfield java/awt/Insets.right I
      // 2a2: isub
      // 2a3: aload 15
      // 2a5: getfield java/awt/Dimension.width I
      // 2a8: isub
      // 2a9: istore 16
      // 2ab: aload 2
      // 2ac: ifnull 2c4
      // 2af: iload 10
      // 2b1: bipush 2
      // 2b2: idiv
      // 2b3: aload 15
      // 2b5: getfield java/awt/Dimension.width I
      // 2b8: bipush 2
      // 2b9: idiv
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c0: athrow
      // 2c1: isub
      // 2c2: istore 16
      // 2c4: aload 13
      // 2c6: invokevirtual com/finalshell/core/C_1.X ()I
      // 2c9: istore 19
      // 2cb: iload 19
      // 2cd: bipush 1
      // 2ce: aload 2
      // 2cf: ifnonnull 304
      // 2d2: if_icmpeq 2f4
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2db: athrow
      // 2dc: iload 19
      // 2de: bipush -1
      // 2df: aload 2
      // 2e0: ifnonnull 315
      // 2e3: goto 2ea
      // 2e6: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e9: athrow
      // 2ea: if_icmpne 30b
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f3: athrow
      // 2f4: aload 3
      // 2f5: getfield java/awt/Insets.top I
      // 2f8: aload 14
      // 2fa: getfield java/awt/Insets.top I
      // 2fd: goto 304
      // 300: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 303: athrow
      // 304: iadd
      // 305: istore 18
      // 307: aload 2
      // 308: ifnull 351
      // 30b: iload 19
      // 30d: bipush 3
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 314: athrow
      // 315: aload 2
      // 316: ifnonnull 34e
      // 319: if_icmpne 33c
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 322: athrow
      // 323: iload 11
      // 325: aload 3
      // 326: getfield java/awt/Insets.bottom I
      // 329: isub
      // 32a: aload 14
      // 32c: getfield java/awt/Insets.bottom I
      // 32f: isub
      // 330: aload 15
      // 332: getfield java/awt/Dimension.height I
      // 335: isub
      // 336: istore 18
      // 338: aload 2
      // 339: ifnull 351
      // 33c: iload 11
      // 33e: bipush 2
      // 33f: idiv
      // 340: aload 15
      // 342: getfield java/awt/Dimension.height I
      // 345: bipush 2
      // 346: idiv
      // 347: goto 34e
      // 34a: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34d: athrow
      // 34e: isub
      // 34f: istore 18
      // 351: aload 8
      // 353: iload 16
      // 355: iload 18
      // 357: iload 17
      // 359: bipush -1
      // 35a: aload 2
      // 35b: ifnonnull 386
      // 35e: if_icmpne 38a
      // 361: goto 368
      // 364: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 367: athrow
      // 368: iload 10
      // 36a: aload 3
      // 36b: getfield java/awt/Insets.left I
      // 36e: isub
      // 36f: aload 14
      // 371: getfield java/awt/Insets.left I
      // 374: isub
      // 375: aload 3
      // 376: getfield java/awt/Insets.right I
      // 379: isub
      // 37a: aload 14
      // 37c: getfield java/awt/Insets.right I
      // 37f: goto 386
      // 382: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 385: athrow
      // 386: isub
      // 387: goto 38f
      // 38a: aload 15
      // 38c: getfield java/awt/Dimension.width I
      // 38f: iload 19
      // 391: bipush -1
      // 392: aload 2
      // 393: ifnonnull 3be
      // 396: if_icmpne 3c2
      // 399: goto 3a0
      // 39c: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39f: athrow
      // 3a0: iload 11
      // 3a2: aload 3
      // 3a3: getfield java/awt/Insets.top I
      // 3a6: isub
      // 3a7: aload 14
      // 3a9: getfield java/awt/Insets.top I
      // 3ac: isub
      // 3ad: aload 3
      // 3ae: getfield java/awt/Insets.bottom I
      // 3b1: isub
      // 3b2: aload 14
      // 3b4: getfield java/awt/Insets.bottom I
      // 3b7: goto 3be
      // 3ba: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3bd: athrow
      // 3be: isub
      // 3bf: goto 3c7
      // 3c2: aload 15
      // 3c4: getfield java/awt/Dimension.height I
      // 3c7: invokevirtual java/awt/Component.setBounds (IIII)V
      // 3ca: aload 2
      // 3cb: ifnull 3e7
      // 3ce: aload 8
      // 3d0: aload 13
      // 3d2: invokevirtual com/finalshell/core/C_1.Q ()Lcom/finalshell/core/E_2;
      // 3d5: invokeinterface com/finalshell/core/E_2.J ()Ljava/lang/Object; 1
      // 3da: checkcast java/awt/Rectangle
      // 3dd: invokevirtual java/awt/Component.setBounds (Ljava/awt/Rectangle;)V
      // 3e0: goto 3e7
      // 3e3: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e6: athrow
      // 3e7: iinc 7 1
      // 3ea: aload 2
      // 3eb: ifnull 039
      // 3ee: return
   }

   public int W(Component param1, C_1 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/awt/Component.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 07: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 0a: istore 4
      // 0c: astore 3
      // 0d: aload 2
      // 0e: invokevirtual com/finalshell/core/C_1.r ()I
      // 11: sipush 8371
      // 14: ldc2_w 7981408119552749152
      // 17: invokestatic com/finalshell/core/NP_2.b (IJ)I
      // 1a: aload 3
      // 1b: ifnonnull 5d
      // 1e: if_icmpne 45
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: iload 4
      // 2a: aload 3
      // 2b: ifnonnull 40
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: bipush 2
      // 40: goto 44
      // 43: bipush 4
      // 44: ireturn
      // 45: aload 2
      // 46: invokevirtual com/finalshell/core/C_1.r ()I
      // 49: aload 3
      // 4a: ifnonnull 81
      // 4d: sipush 26253
      // 50: ldc2_w 6556506702773315679
      // 53: invokestatic com/finalshell/core/NP_2.b (IJ)I
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: if_icmpne 7d
      // 60: iload 4
      // 62: aload 3
      // 63: ifnonnull 78
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: ifeq 7b
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/NP_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      int var2 = (var0 ^ -21870) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 173;
               break;
            case 1:
               var10000 = 211;
               break;
            case 2:
               var10000 = 4;
               break;
            case 3:
               var10000 = 195;
               break;
            case 4:
               var10000 = 118;
               break;
            case 5:
               var10000 = 79;
               break;
            case 6:
               var10000 = 38;
               break;
            case 7:
               var10000 = 16;
               break;
            case 8:
               var10000 = 99;
               break;
            case 9:
               var10000 = 166;
               break;
            case 10:
               var10000 = 33;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 127;
               break;
            case 13:
               var10000 = 218;
               break;
            case 14:
               var10000 = 3;
               break;
            case 15:
               var10000 = 110;
               break;
            case 16:
               var10000 = 102;
               break;
            case 17:
               var10000 = 36;
               break;
            case 18:
               var10000 = 53;
               break;
            case 19:
               var10000 = 57;
               break;
            case 20:
               var10000 = 154;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 1;
               break;
            case 23:
               var10000 = 65;
               break;
            case 24:
               var10000 = 55;
               break;
            case 25:
               var10000 = 84;
               break;
            case 26:
               var10000 = 119;
               break;
            case 27:
               var10000 = 58;
               break;
            case 28:
               var10000 = 245;
               break;
            case 29:
               var10000 = 164;
               break;
            case 30:
               var10000 = 39;
               break;
            case 31:
               var10000 = 229;
               break;
            case 32:
               var10000 = 196;
               break;
            case 33:
               var10000 = 188;
               break;
            case 34:
               var10000 = 248;
               break;
            case 35:
               var10000 = 70;
               break;
            case 36:
               var10000 = 9;
               break;
            case 37:
               var10000 = 230;
               break;
            case 38:
               var10000 = 44;
               break;
            case 39:
               var10000 = 148;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 242;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 29;
               break;
            case 44:
               var10000 = 204;
               break;
            case 45:
               var10000 = 143;
               break;
            case 46:
               var10000 = 206;
               break;
            case 47:
               var10000 = 181;
               break;
            case 48:
               var10000 = 56;
               break;
            case 49:
               var10000 = 30;
               break;
            case 50:
               var10000 = 46;
               break;
            case 51:
               var10000 = 205;
               break;
            case 52:
               var10000 = 168;
               break;
            case 53:
               var10000 = 74;
               break;
            case 54:
               var10000 = 26;
               break;
            case 55:
               var10000 = 48;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 86;
               break;
            case 58:
               var10000 = 15;
               break;
            case 59:
               var10000 = 122;
               break;
            case 60:
               var10000 = 177;
               break;
            case 61:
               var10000 = 250;
               break;
            case 62:
               var10000 = 128;
               break;
            case 63:
               var10000 = 232;
               break;
            case 64:
               var10000 = 106;
               break;
            case 65:
               var10000 = 223;
               break;
            case 66:
               var10000 = 150;
               break;
            case 67:
               var10000 = 5;
               break;
            case 68:
               var10000 = 175;
               break;
            case 69:
               var10000 = 191;
               break;
            case 70:
               var10000 = 184;
               break;
            case 71:
               var10000 = 222;
               break;
            case 72:
               var10000 = 88;
               break;
            case 73:
               var10000 = 236;
               break;
            case 74:
               var10000 = 161;
               break;
            case 75:
               var10000 = 146;
               break;
            case 76:
               var10000 = 201;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 237;
               break;
            case 79:
               var10000 = 96;
               break;
            case 80:
               var10000 = 113;
               break;
            case 81:
               var10000 = 231;
               break;
            case 82:
               var10000 = 202;
               break;
            case 83:
               var10000 = 149;
               break;
            case 84:
               var10000 = 24;
               break;
            case 85:
               var10000 = 121;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 227;
               break;
            case 89:
               var10000 = 95;
               break;
            case 90:
               var10000 = 75;
               break;
            case 91:
               var10000 = 112;
               break;
            case 92:
               var10000 = 209;
               break;
            case 93:
               var10000 = 137;
               break;
            case 94:
               var10000 = 108;
               break;
            case 95:
               var10000 = 152;
               break;
            case 96:
               var10000 = 0;
               break;
            case 97:
               var10000 = 187;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 189;
               break;
            case 101:
               var10000 = 165;
               break;
            case 102:
               var10000 = 115;
               break;
            case 103:
               var10000 = 193;
               break;
            case 104:
               var10000 = 254;
               break;
            case 105:
               var10000 = 37;
               break;
            case 106:
               var10000 = 144;
               break;
            case 107:
               var10000 = 31;
               break;
            case 108:
               var10000 = 17;
               break;
            case 109:
               var10000 = 235;
               break;
            case 110:
               var10000 = 178;
               break;
            case 111:
               var10000 = 216;
               break;
            case 112:
               var10000 = 73;
               break;
            case 113:
               var10000 = 186;
               break;
            case 114:
               var10000 = 132;
               break;
            case 115:
               var10000 = 228;
               break;
            case 116:
               var10000 = 91;
               break;
            case 117:
               var10000 = 19;
               break;
            case 118:
               var10000 = 210;
               break;
            case 119:
               var10000 = 198;
               break;
            case 120:
               var10000 = 109;
               break;
            case 121:
               var10000 = 87;
               break;
            case 122:
               var10000 = 62;
               break;
            case 123:
               var10000 = 120;
               break;
            case 124:
               var10000 = 60;
               break;
            case 125:
               var10000 = 169;
               break;
            case 126:
               var10000 = 14;
               break;
            case 127:
               var10000 = 83;
               break;
            case 128:
               var10000 = 220;
               break;
            case 129:
               var10000 = 42;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 107;
               break;
            case 132:
               var10000 = 54;
               break;
            case 133:
               var10000 = 35;
               break;
            case 134:
               var10000 = 224;
               break;
            case 135:
               var10000 = 124;
               break;
            case 136:
               var10000 = 67;
               break;
            case 137:
               var10000 = 185;
               break;
            case 138:
               var10000 = 251;
               break;
            case 139:
               var10000 = 22;
               break;
            case 140:
               var10000 = 182;
               break;
            case 141:
               var10000 = 142;
               break;
            case 142:
               var10000 = 133;
               break;
            case 143:
               var10000 = 92;
               break;
            case 144:
               var10000 = 141;
               break;
            case 145:
               var10000 = 156;
               break;
            case 146:
               var10000 = 163;
               break;
            case 147:
               var10000 = 43;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 213;
               break;
            case 150:
               var10000 = 183;
               break;
            case 151:
               var10000 = 239;
               break;
            case 152:
               var10000 = 40;
               break;
            case 153:
               var10000 = 82;
               break;
            case 154:
               var10000 = 147;
               break;
            case 155:
               var10000 = 90;
               break;
            case 156:
               var10000 = 153;
               break;
            case 157:
               var10000 = 111;
               break;
            case 158:
               var10000 = 241;
               break;
            case 159:
               var10000 = 85;
               break;
            case 160:
               var10000 = 139;
               break;
            case 161:
               var10000 = 100;
               break;
            case 162:
               var10000 = 78;
               break;
            case 163:
               var10000 = 126;
               break;
            case 164:
               var10000 = 50;
               break;
            case 165:
               var10000 = 176;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 240;
               break;
            case 168:
               var10000 = 171;
               break;
            case 169:
               var10000 = 77;
               break;
            case 170:
               var10000 = 208;
               break;
            case 171:
               var10000 = 140;
               break;
            case 172:
               var10000 = 200;
               break;
            case 173:
               var10000 = 252;
               break;
            case 174:
               var10000 = 66;
               break;
            case 175:
               var10000 = 114;
               break;
            case 176:
               var10000 = 28;
               break;
            case 177:
               var10000 = 192;
               break;
            case 178:
               var10000 = 138;
               break;
            case 179:
               var10000 = 63;
               break;
            case 180:
               var10000 = 10;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 170;
               break;
            case 183:
               var10000 = 98;
               break;
            case 184:
               var10000 = 103;
               break;
            case 185:
               var10000 = 2;
               break;
            case 186:
               var10000 = 130;
               break;
            case 187:
               var10000 = 71;
               break;
            case 188:
               var10000 = 174;
               break;
            case 189:
               var10000 = 155;
               break;
            case 190:
               var10000 = 6;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 134;
               break;
            case 193:
               var10000 = 23;
               break;
            case 194:
               var10000 = 190;
               break;
            case 195:
               var10000 = 238;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 101;
               break;
            case 198:
               var10000 = 27;
               break;
            case 199:
               var10000 = 158;
               break;
            case 200:
               var10000 = 219;
               break;
            case 201:
               var10000 = 7;
               break;
            case 202:
               var10000 = 197;
               break;
            case 203:
               var10000 = 131;
               break;
            case 204:
               var10000 = 157;
               break;
            case 205:
               var10000 = 217;
               break;
            case 206:
               var10000 = 72;
               break;
            case 207:
               var10000 = 215;
               break;
            case 208:
               var10000 = 51;
               break;
            case 209:
               var10000 = 162;
               break;
            case 210:
               var10000 = 221;
               break;
            case 211:
               var10000 = 41;
               break;
            case 212:
               var10000 = 214;
               break;
            case 213:
               var10000 = 89;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 129;
               break;
            case 216:
               var10000 = 21;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 68;
               break;
            case 219:
               var10000 = 20;
               break;
            case 220:
               var10000 = 94;
               break;
            case 221:
               var10000 = 180;
               break;
            case 222:
               var10000 = 244;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 160;
               break;
            case 225:
               var10000 = 203;
               break;
            case 226:
               var10000 = 69;
               break;
            case 227:
               var10000 = 145;
               break;
            case 228:
               var10000 = 97;
               break;
            case 229:
               var10000 = 116;
               break;
            case 230:
               var10000 = 93;
               break;
            case 231:
               var10000 = 136;
               break;
            case 232:
               var10000 = 104;
               break;
            case 233:
               var10000 = 18;
               break;
            case 234:
               var10000 = 199;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 61;
               break;
            case 237:
               var10000 = 81;
               break;
            case 238:
               var10000 = 25;
               break;
            case 239:
               var10000 = 159;
               break;
            case 240:
               var10000 = 123;
               break;
            case 241:
               var10000 = 12;
               break;
            case 242:
               var10000 = 249;
               break;
            case 243:
               var10000 = 105;
               break;
            case 244:
               var10000 = 255;
               break;
            case 245:
               var10000 = 80;
               break;
            case 246:
               var10000 = 59;
               break;
            case 247:
               var10000 = 76;
               break;
            case 248:
               var10000 = 32;
               break;
            case 249:
               var10000 = 243;
               break;
            case 250:
               var10000 = 225;
               break;
            case 251:
               var10000 = 233;
               break;
            case 252:
               var10000 = 11;
               break;
            case 253:
               var10000 = 64;
               break;
            case 254:
               var10000 = 207;
               break;
            default:
               var10000 = 49;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3794;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "ñß·ç\u0098\u0013\u0087¡\u0000Ñ÷\u0004\u008dl\u0007x´\u0012\u0017\u008c5\u0013\bå_ï\u0004¤Cq\u0087!Ñ\u008b]\u009a´¢1·\u0010.=ù\rö¨òÀÏ\u0011\u0095ã¼\u0012\u0003\u0001»y«Cì\u0007Y\u001eµLDÞ-Ñ6\tÏýSvcâ¹Í>\u0007fîã,\u007fäE";
      int var12 = "ñß·ç\u0098\u0013\u0087¡\u0000Ñ÷\u0004\u008dl\u0007x´\u0012\u0017\u008c5\u0013\bå_ï\u0004¤Cq\u0087!Ñ\u008b]\u009a´¢1·\u0010.=ù\rö¨òÀÏ\u0011\u0095ã¼\u0012\u0003\u0001»y«Cì\u0007Y\u001eµLDÞ-Ñ6\tÏýSvcâ¹Í>\u0007fîã,\u007fäE"
         .length();
      char var9 = 'H';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 88;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
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
                        var58 = 70;
                        break;
                     case 1:
                        var58 = 35;
                        break;
                     case 2:
                        var58 = 87;
                        break;
                     case 3:
                        var58 = 8;
                        break;
                     case 4:
                        var58 = 27;
                        break;
                     case 5:
                        var58 = 106;
                        break;
                     default:
                        var58 = 6;
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
                     long var0 = 7011778143450801173L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "?;\u0012íö~ÌA³&\u0085\u0003ñg\u008a\u007f";
                     int var5 = "?;\u0012íö~ÌA³&\u0085\u0003ñg\u008a\u007f".length();
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

                  var10 = "\u008cÔ\u0099L\u0017Ïo\tROÇ\u0007Öë(Ë+";
                  var12 = "\u008cÔ\u0099L\u0017Ïo\tROÇ\u0007Öë(Ë+".length();
                  var9 = 7;
                  var16 = -1;
            }

            var10000 = 50;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





