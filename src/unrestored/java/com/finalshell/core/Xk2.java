package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Shape;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.UIDefaults;

public final class Xk2 {
   public static boolean p;
   public static boolean i;
   public static boolean D;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static boolean L() {
      return D;
   }

   public static void y(boolean var0) {
      D = var0;
   }

   public static void P(UIDefaults var0) {
      try {
         java.lang.Class var1 = Kp2.e(a(-3820, -8701));
         Object var2 = Kp2.O(var1, a(-3827, -11262));
         java.lang.Class var3 = Kp2.l(var1, a(-3829, -25697));
         Object var4 = Kp2.Q(var3, a(-3821, -10351), new Object[]{true});
         var0.put(var2, var4);
      } catch (ClassNotFoundException var5) {
         NE3.g(Xk2.class, var5);
      } catch (NoSuchFieldException var6) {
         NE3.g(Xk2.class, var6);
      } catch (IllegalAccessException var7) {
         NE3.g(Xk2.class, var7);
      } catch (NoSuchMethodException var8) {
         NE3.g(Xk2.class, var8);
      } catch (InvocationTargetException var9) {
         NE3.g(Xk2.class, var9);
      }
   }

   public static boolean R() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/finalshell/core/Xk2.p Z
      // 003: ifeq 0ea
      // 006: sipush -3824
      // 009: sipush 6112
      // 00c: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 00f: invokestatic com/finalshell/core/Kp2.e (Ljava/lang/String;)Ljava/lang/Class;
      // 012: astore 0
      // 013: aload 0
      // 014: sipush -3837
      // 017: sipush 23453
      // 01a: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 01d: invokestatic com/finalshell/core/Kp2.l (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
      // 020: astore 1
      // 021: aload 1
      // 022: sipush -3822
      // 025: sipush -619
      // 028: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 02b: invokestatic com/finalshell/core/Kp2.O (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
      // 02e: astore 2
      // 02f: aload 0
      // 030: sipush -3817
      // 033: sipush 14865
      // 036: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 039: bipush 0
      // 03a: anewarray 4
      // 03d: invokestatic com/finalshell/core/Kp2.Q (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast java/lang/Boolean
      // 043: astore 3
      // 044: aload 0
      // 045: sipush -3826
      // 048: sipush 27650
      // 04b: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 04e: bipush 1
      // 04f: anewarray 4
      // 052: dup
      // 053: bipush 0
      // 054: invokestatic com/finalshell/core/Wx2.S ()Ljava/awt/GraphicsConfiguration;
      // 057: aastore
      // 058: invokestatic com/finalshell/core/Kp2.Q (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05b: checkcast java/lang/Boolean
      // 05e: astore 4
      // 060: aload 0
      // 061: sipush -3830
      // 064: sipush -11675
      // 067: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 06a: bipush 1
      // 06b: anewarray 4
      // 06e: dup
      // 06f: bipush 0
      // 070: aload 2
      // 071: aastore
      // 072: invokestatic com/finalshell/core/Kp2.Q (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 075: checkcast java/lang/Boolean
      // 078: astore 5
      // 07a: aload 3
      // 07b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07e: ifeq 0e8
      // 081: aload 4
      // 083: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 086: ifeq 0e8
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 5
      // 092: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 095: ifeq 0e8
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: invokestatic com/finalshell/core/Wx2.t ()Z
      // 0a2: ifne 0e0
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: invokestatic com/finalshell/core/Wx2.E ()Z
      // 0af: ifne 0e0
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: invokestatic com/finalshell/core/Wx2.G ()Z
      // 0bc: ifne 0e0
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: invokestatic com/finalshell/core/Wx2.O$boolean ()Z
      // 0c9: ifeq 0e8
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: getstatic com/finalshell/core/Xk2.D Z
      // 0d6: ifeq 0e8
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: goto 0e9
      // 0e4: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: bipush 0
      // 0e9: ireturn
      // 0ea: bipush 0
      // 0eb: ireturn
      // 0ec: astore 0
      // 0ed: invokestatic com/finalshell/core/Wx2.t ()Z
      // 0f0: ifne 127
      // 0f3: invokestatic com/finalshell/core/Wx2.E ()Z
      // 0f6: ifne 127
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: invokestatic com/finalshell/core/Wx2.G ()Z
      // 103: ifne 127
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: invokestatic com/finalshell/core/Wx2.O$boolean ()Z
      // 110: ifeq 12f
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: getstatic com/finalshell/core/Xk2.D Z
      // 11d: ifeq 12f
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: bipush 1
      // 128: goto 130
      // 12b: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
   }

   public static void M(boolean var0) {
      p = var0;
   }

   public static boolean d() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 0
      // 04: getstatic com/finalshell/core/Xk2.i Z
      // 07: aload 0
      // 08: ifnonnull a2
      // 0b: ifeq a1
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: sipush -3824
      // 18: sipush 6112
      // 1b: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 1e: invokestatic com/finalshell/core/Kp2.e (Ljava/lang/String;)Ljava/lang/Class;
      // 21: astore 1
      // 22: aload 1
      // 23: sipush -3840
      // 26: sipush -25718
      // 29: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 2c: invokestatic com/finalshell/core/Kp2.l (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
      // 2f: astore 2
      // 30: aload 2
      // 31: sipush -3836
      // 34: sipush 5137
      // 37: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 3a: invokestatic com/finalshell/core/Kp2.O (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
      // 3d: astore 3
      // 3e: aload 1
      // 3f: sipush -3832
      // 42: sipush 15595
      // 45: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 48: bipush 0
      // 49: anewarray 4
      // 4c: invokestatic com/finalshell/core/Kp2.Q (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4f: checkcast java/lang/Boolean
      // 52: astore 4
      // 54: aload 1
      // 55: sipush -3834
      // 58: sipush 28456
      // 5b: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 5e: bipush 1
      // 5f: anewarray 4
      // 62: dup
      // 63: bipush 0
      // 64: aload 3
      // 65: aastore
      // 66: invokestatic com/finalshell/core/Kp2.Q (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 69: checkcast java/lang/Boolean
      // 6c: astore 5
      // 6e: aload 4
      // 70: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 73: aload 0
      // 74: ifnonnull 8d
      // 77: ifeq 9f
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 5
      // 83: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 0
      // 8e: ifnonnull 9c
      // 91: ifeq 9f
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9a: athrow
      // 9b: bipush 1
      // 9c: goto a0
      // 9f: bipush 0
      // a0: ireturn
      // a1: bipush 0
      // a2: ireturn
      // a3: astore 1
      // a4: getstatic com/finalshell/core/Xk2.i Z
      // a7: ireturn
   }

   public static void D(boolean var0) {
      i = var0;
   }

   public static void Z(Window param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: ifnull df
      // 08: invokestatic com/finalshell/core/Xk2.R ()Z
      // 0b: aload 2
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq df
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: aload 2
      // 24: ifnonnull 32
      // 27: ifeq 3a
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: iload 1
      // 32: aload 0
      // 33: invokestatic com/finalshell/core/Xk2.q (ZLjava/awt/Component;)V
      // 36: aload 2
      // 37: ifnull 66
      // 3a: sipush -3812
      // 3d: sipush -801
      // 40: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 43: sipush -3811
      // 46: sipush -5032
      // 49: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 4c: bipush 2
      // 4d: anewarray 4
      // 50: dup
      // 51: bipush 0
      // 52: aload 0
      // 53: aastore
      // 54: dup
      // 55: bipush 1
      // 56: iload 1
      // 57: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5a: aastore
      // 5b: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5e: pop
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 0
      // 67: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 6a: astore 3
      // 6b: aload 3
      // 6c: aload 2
      // 6d: ifnonnull 8f
      // 70: ifnull d5
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: iload 1
      // 7b: aload 3
      // 7c: invokestatic com/finalshell/core/Xk2.q (ZLjava/awt/Component;)V
      // 7f: aload 3
      // 80: iload 1
      // 81: invokevirtual javax/swing/JRootPane.setOpaque (Z)V
      // 84: aload 3
      // 85: invokevirtual javax/swing/JRootPane.getContentPane ()Ljava/awt/Container;
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: astore 4
      // 91: aload 4
      // 93: aload 2
      // 94: ifnonnull b0
      // 97: ifnull d1
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: iload 1
      // a2: aload 4
      // a4: invokestatic com/finalshell/core/Xk2.q (ZLjava/awt/Component;)V
      // a7: aload 4
      // a9: goto b0
      // ac: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af: athrow
      // b0: aload 2
      // b1: ifnonnull ca
      // b4: instanceof javax/swing/JComponent
      // b7: ifeq d1
      // ba: goto c1
      // bd: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0: athrow
      // c1: aload 4
      // c3: goto ca
      // c6: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: checkcast javax/swing/JComponent
      // cd: iload 1
      // ce: invokevirtual javax/swing/JComponent.setOpaque (Z)V
      // d1: aload 3
      // d2: invokevirtual javax/swing/JRootPane.repaint ()V
      // d5: goto df
      // d8: astore 3
      // d9: ldc com/finalshell/core/Xk2
      // db: aload 3
      // dc: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // df: return
   }

   public static void q(boolean var0, Component var1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Color var10000;
      label16: {
         try {
            if (var0) {
               var10000 = GO.R;
               break label16;
            }
         } catch (NoSuchMethodException var3) {
            throw new RuntimeException(a(var3));
         }

         var10000 = GO.l;
      }

      Color var2 = var10000;
      Kp2.j(var1, a(-3819, 15519), new Object[]{var2});
   }

   public static boolean X(Window param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ifnull a5
      // 08: invokestatic com/finalshell/core/Xk2.R ()Z
      // 0b: aload 1
      // 0c: ifnonnull a6
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq a5
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: ifeq 65
      // 26: aload 0
      // 27: sipush -3823
      // 2a: sipush -10917
      // 2d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 30: bipush 0
      // 31: anewarray 4
      // 34: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 37: checkcast java/awt/Color
      // 3a: astore 3
      // 3b: aload 3
      // 3c: invokevirtual java/awt/Color.getAlpha ()I
      // 3f: aload 1
      // 40: ifnonnull 59
      // 43: getstatic com/finalshell/core/Xk2.c J
      // 46: l2i
      // 47: if_icmpne 5c
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 60: astore 2
      // 61: aload 1
      // 62: ifnull 86
      // 65: sipush -3824
      // 68: sipush 6112
      // 6b: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 6e: sipush -3833
      // 71: sipush 2644
      // 74: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 77: bipush 1
      // 78: anewarray 4
      // 7b: dup
      // 7c: bipush 0
      // 7d: aload 0
      // 7e: aastore
      // 7f: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 82: checkcast java/lang/Boolean
      // 85: astore 2
      // 86: aload 2
      // 87: aload 1
      // 88: ifnonnull 96
      // 8b: ifnull 9c
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: aload 2
      // 96: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 99: goto 9d
      // 9c: bipush 1
      // 9d: ireturn
      // 9e: astore 2
      // 9f: ldc com/finalshell/core/Xk2
      // a1: aload 2
      // a2: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // a5: bipush 1
      // a6: ireturn
   }

   public static void f(Window param0, float param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: ifnull 80
      // 08: invokestatic com/finalshell/core/Xk2.R ()Z
      // 0b: aload 2
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq 80
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: ifeq 4a
      // 26: aload 0
      // 27: sipush -3835
      // 2a: sipush -7877
      // 2d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 30: bipush 1
      // 31: anewarray 4
      // 34: dup
      // 35: bipush 0
      // 36: fload 1
      // 37: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3a: aastore
      // 3b: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3e: pop
      // 3f: aload 2
      // 40: ifnull 76
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: sipush -3824
      // 4d: sipush 6112
      // 50: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 53: sipush -3839
      // 56: sipush 31444
      // 59: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 5c: bipush 2
      // 5d: anewarray 4
      // 60: dup
      // 61: bipush 0
      // 62: aload 0
      // 63: aastore
      // 64: dup
      // 65: bipush 1
      // 66: fload 1
      // 67: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 6a: aastore
      // 6b: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 6e: pop
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: goto 80
      // 79: astore 3
      // 7a: ldc com/finalshell/core/Xk2
      // 7c: aload 3
      // 7d: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 80: return
   }

   public static float m(Window param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ifnull 7f
      // 08: invokestatic com/finalshell/core/Xk2.R ()Z
      // 0b: aload 1
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq 7f
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: ifeq 3f
      // 26: aload 0
      // 27: sipush -3825
      // 2a: sipush 23962
      // 2d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 30: bipush 0
      // 31: anewarray 4
      // 34: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 37: checkcast java/lang/Float
      // 3a: astore 2
      // 3b: aload 1
      // 3c: ifnull 60
      // 3f: sipush -3824
      // 42: sipush 6112
      // 45: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 48: sipush -3809
      // 4b: sipush -4973
      // 4e: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 51: bipush 1
      // 52: anewarray 4
      // 55: dup
      // 56: bipush 0
      // 57: aload 0
      // 58: aastore
      // 59: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5c: checkcast java/lang/Float
      // 5f: astore 2
      // 60: aload 2
      // 61: aload 1
      // 62: ifnonnull 70
      // 65: ifnull 76
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 2
      // 70: invokevirtual java/lang/Float.floatValue ()F
      // 73: goto 77
      // 76: fconst_1
      // 77: freturn
      // 78: astore 2
      // 79: ldc com/finalshell/core/Xk2
      // 7b: aload 2
      // 7c: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 7f: fconst_1
      // 80: freturn
   }

   public static void v(Window param0, Shape param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: ifnull 7a
      // 08: invokestatic com/finalshell/core/Xk2.d ()Z
      // 0b: aload 2
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq 7a
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: ifeq 47
      // 26: aload 0
      // 27: sipush -3838
      // 2a: sipush -14158
      // 2d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 30: bipush 1
      // 31: anewarray 4
      // 34: dup
      // 35: bipush 0
      // 36: aload 1
      // 37: aastore
      // 38: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3b: pop
      // 3c: aload 2
      // 3d: ifnull 70
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: sipush -3824
      // 4a: sipush 6112
      // 4d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 50: sipush -3828
      // 53: sipush 30907
      // 56: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 59: bipush 2
      // 5a: anewarray 4
      // 5d: dup
      // 5e: bipush 0
      // 5f: aload 0
      // 60: aastore
      // 61: dup
      // 62: bipush 1
      // 63: aload 1
      // 64: aastore
      // 65: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 68: pop
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: goto 7a
      // 73: astore 3
      // 74: ldc com/finalshell/core/Xk2
      // 76: aload 3
      // 77: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 7a: return
   }

   public static Shape V(Window param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ifnull 69
      // 08: invokestatic com/finalshell/core/Xk2.d ()Z
      // 0b: aload 1
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: ifeq 69
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Xk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokestatic com/finalshell/core/Wx2.R ()Z
      // 23: ifeq 3f
      // 26: aload 0
      // 27: sipush -3818
      // 2a: sipush 13756
      // 2d: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 30: bipush 0
      // 31: anewarray 4
      // 34: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 37: checkcast java/awt/Shape
      // 3a: astore 2
      // 3b: aload 1
      // 3c: ifnull 60
      // 3f: sipush -3824
      // 42: sipush 6112
      // 45: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 48: sipush -3810
      // 4b: sipush 20731
      // 4e: invokestatic com/finalshell/core/Xk2.a (II)Ljava/lang/String;
      // 51: bipush 1
      // 52: anewarray 4
      // 55: dup
      // 56: bipush 0
      // 57: aload 0
      // 58: aastore
      // 59: invokestatic com/finalshell/core/Kp2.x (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5c: checkcast java/awt/Shape
      // 5f: astore 2
      // 60: aload 2
      // 61: areturn
      // 62: astore 2
      // 63: ldc com/finalshell/core/Xk2
      // 65: aload 2
      // 66: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 69: aconst_null
      // 6a: areturn
   }

   public static Popup L(Component var0, Component var1, int var2, int var3) {
      return (Popup)Kp2.I(PopupFactory.getSharedInstance(), a(-3831, 30453), new Object[]{var0, var1, var2, var3, 2});
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3833) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 252;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 93;
               break;
            case 3:
               var10000 = 141;
               break;
            case 4:
               var10000 = 122;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 156;
               break;
            case 7:
               var10000 = 34;
               break;
            case 8:
               var10000 = 173;
               break;
            case 9:
               var10000 = 21;
               break;
            case 10:
               var10000 = 253;
               break;
            case 11:
               var10000 = 137;
               break;
            case 12:
               var10000 = 109;
               break;
            case 13:
               var10000 = 1;
               break;
            case 14:
               var10000 = 191;
               break;
            case 15:
               var10000 = 114;
               break;
            case 16:
               var10000 = 134;
               break;
            case 17:
               var10000 = 204;
               break;
            case 18:
               var10000 = 182;
               break;
            case 19:
               var10000 = 147;
               break;
            case 20:
               var10000 = 70;
               break;
            case 21:
               var10000 = 19;
               break;
            case 22:
               var10000 = 133;
               break;
            case 23:
               var10000 = 53;
               break;
            case 24:
               var10000 = 69;
               break;
            case 25:
               var10000 = 199;
               break;
            case 26:
               var10000 = 68;
               break;
            case 27:
               var10000 = 104;
               break;
            case 28:
               var10000 = 55;
               break;
            case 29:
               var10000 = 251;
               break;
            case 30:
               var10000 = 246;
               break;
            case 31:
               var10000 = 131;
               break;
            case 32:
               var10000 = 22;
               break;
            case 33:
               var10000 = 178;
               break;
            case 34:
               var10000 = 52;
               break;
            case 35:
               var10000 = 64;
               break;
            case 36:
               var10000 = 83;
               break;
            case 37:
               var10000 = 207;
               break;
            case 38:
               var10000 = 217;
               break;
            case 39:
               var10000 = 212;
               break;
            case 40:
               var10000 = 181;
               break;
            case 41:
               var10000 = 30;
               break;
            case 42:
               var10000 = 159;
               break;
            case 43:
               var10000 = 31;
               break;
            case 44:
               var10000 = 218;
               break;
            case 45:
               var10000 = 24;
               break;
            case 46:
               var10000 = 222;
               break;
            case 47:
               var10000 = 232;
               break;
            case 48:
               var10000 = 216;
               break;
            case 49:
               var10000 = 152;
               break;
            case 50:
               var10000 = 220;
               break;
            case 51:
               var10000 = 125;
               break;
            case 52:
               var10000 = 90;
               break;
            case 53:
               var10000 = 112;
               break;
            case 54:
               var10000 = 171;
               break;
            case 55:
               var10000 = 48;
               break;
            case 56:
               var10000 = 243;
               break;
            case 57:
               var10000 = 254;
               break;
            case 58:
               var10000 = 221;
               break;
            case 59:
               var10000 = 195;
               break;
            case 60:
               var10000 = 225;
               break;
            case 61:
               var10000 = 233;
               break;
            case 62:
               var10000 = 51;
               break;
            case 63:
               var10000 = 229;
               break;
            case 64:
               var10000 = 239;
               break;
            case 65:
               var10000 = 63;
               break;
            case 66:
               var10000 = 96;
               break;
            case 67:
               var10000 = 209;
               break;
            case 68:
               var10000 = 85;
               break;
            case 69:
               var10000 = 203;
               break;
            case 70:
               var10000 = 149;
               break;
            case 71:
               var10000 = 192;
               break;
            case 72:
               var10000 = 237;
               break;
            case 73:
               var10000 = 58;
               break;
            case 74:
               var10000 = 200;
               break;
            case 75:
               var10000 = 188;
               break;
            case 76:
               var10000 = 62;
               break;
            case 77:
               var10000 = 35;
               break;
            case 78:
               var10000 = 80;
               break;
            case 79:
               var10000 = 223;
               break;
            case 80:
               var10000 = 5;
               break;
            case 81:
               var10000 = 242;
               break;
            case 82:
               var10000 = 106;
               break;
            case 83:
               var10000 = 238;
               break;
            case 84:
               var10000 = 227;
               break;
            case 85:
               var10000 = 33;
               break;
            case 86:
               var10000 = 59;
               break;
            case 87:
               var10000 = 148;
               break;
            case 88:
               var10000 = 107;
               break;
            case 89:
               var10000 = 157;
               break;
            case 90:
               var10000 = 91;
               break;
            case 91:
               var10000 = 105;
               break;
            case 92:
               var10000 = 37;
               break;
            case 93:
               var10000 = 120;
               break;
            case 94:
               var10000 = 166;
               break;
            case 95:
               var10000 = 245;
               break;
            case 96:
               var10000 = 140;
               break;
            case 97:
               var10000 = 46;
               break;
            case 98:
               var10000 = 8;
               break;
            case 99:
               var10000 = 248;
               break;
            case 100:
               var10000 = 115;
               break;
            case 101:
               var10000 = 142;
               break;
            case 102:
               var10000 = 144;
               break;
            case 103:
               var10000 = 100;
               break;
            case 104:
               var10000 = 196;
               break;
            case 105:
               var10000 = 103;
               break;
            case 106:
               var10000 = 54;
               break;
            case 107:
               var10000 = 6;
               break;
            case 108:
               var10000 = 170;
               break;
            case 109:
               var10000 = 129;
               break;
            case 110:
               var10000 = 119;
               break;
            case 111:
               var10000 = 57;
               break;
            case 112:
               var10000 = 211;
               break;
            case 113:
               var10000 = 13;
               break;
            case 114:
               var10000 = 247;
               break;
            case 115:
               var10000 = 82;
               break;
            case 116:
               var10000 = 26;
               break;
            case 117:
               var10000 = 56;
               break;
            case 118:
               var10000 = 101;
               break;
            case 119:
               var10000 = 180;
               break;
            case 120:
               var10000 = 160;
               break;
            case 121:
               var10000 = 202;
               break;
            case 122:
               var10000 = 198;
               break;
            case 123:
               var10000 = 41;
               break;
            case 124:
               var10000 = 215;
               break;
            case 125:
               var10000 = 135;
               break;
            case 126:
               var10000 = 127;
               break;
            case 127:
               var10000 = 161;
               break;
            case 128:
               var10000 = 75;
               break;
            case 129:
               var10000 = 153;
               break;
            case 130:
               var10000 = 197;
               break;
            case 131:
               var10000 = 12;
               break;
            case 132:
               var10000 = 79;
               break;
            case 133:
               var10000 = 14;
               break;
            case 134:
               var10000 = 18;
               break;
            case 135:
               var10000 = 186;
               break;
            case 136:
               var10000 = 235;
               break;
            case 137:
               var10000 = 231;
               break;
            case 138:
               var10000 = 42;
               break;
            case 139:
               var10000 = 67;
               break;
            case 140:
               var10000 = 25;
               break;
            case 141:
               var10000 = 177;
               break;
            case 142:
               var10000 = 40;
               break;
            case 143:
               var10000 = 38;
               break;
            case 144:
               var10000 = 169;
               break;
            case 145:
               var10000 = 15;
               break;
            case 146:
               var10000 = 60;
               break;
            case 147:
               var10000 = 36;
               break;
            case 148:
               var10000 = 87;
               break;
            case 149:
               var10000 = 240;
               break;
            case 150:
               var10000 = 136;
               break;
            case 151:
               var10000 = 185;
               break;
            case 152:
               var10000 = 123;
               break;
            case 153:
               var10000 = 167;
               break;
            case 154:
               var10000 = 128;
               break;
            case 155:
               var10000 = 138;
               break;
            case 156:
               var10000 = 95;
               break;
            case 157:
               var10000 = 244;
               break;
            case 158:
               var10000 = 0;
               break;
            case 159:
               var10000 = 86;
               break;
            case 160:
               var10000 = 108;
               break;
            case 161:
               var10000 = 183;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 9;
               break;
            case 164:
               var10000 = 172;
               break;
            case 165:
               var10000 = 158;
               break;
            case 166:
               var10000 = 230;
               break;
            case 167:
               var10000 = 76;
               break;
            case 168:
               var10000 = 84;
               break;
            case 169:
               var10000 = 139;
               break;
            case 170:
               var10000 = 65;
               break;
            case 171:
               var10000 = 155;
               break;
            case 172:
               var10000 = 73;
               break;
            case 173:
               var10000 = 44;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 165;
               break;
            case 176:
               var10000 = 168;
               break;
            case 177:
               var10000 = 111;
               break;
            case 178:
               var10000 = 32;
               break;
            case 179:
               var10000 = 205;
               break;
            case 180:
               var10000 = 150;
               break;
            case 181:
               var10000 = 151;
               break;
            case 182:
               var10000 = 50;
               break;
            case 183:
               var10000 = 11;
               break;
            case 184:
               var10000 = 20;
               break;
            case 185:
               var10000 = 23;
               break;
            case 186:
               var10000 = 29;
               break;
            case 187:
               var10000 = 213;
               break;
            case 188:
               var10000 = 145;
               break;
            case 189:
               var10000 = 234;
               break;
            case 190:
               var10000 = 250;
               break;
            case 191:
               var10000 = 66;
               break;
            case 192:
               var10000 = 255;
               break;
            case 193:
               var10000 = 228;
               break;
            case 194:
               var10000 = 74;
               break;
            case 195:
               var10000 = 126;
               break;
            case 196:
               var10000 = 17;
               break;
            case 197:
               var10000 = 194;
               break;
            case 198:
               var10000 = 78;
               break;
            case 199:
               var10000 = 28;
               break;
            case 200:
               var10000 = 184;
               break;
            case 201:
               var10000 = 190;
               break;
            case 202:
               var10000 = 210;
               break;
            case 203:
               var10000 = 163;
               break;
            case 204:
               var10000 = 224;
               break;
            case 205:
               var10000 = 121;
               break;
            case 206:
               var10000 = 162;
               break;
            case 207:
               var10000 = 226;
               break;
            case 208:
               var10000 = 164;
               break;
            case 209:
               var10000 = 81;
               break;
            case 210:
               var10000 = 102;
               break;
            case 211:
               var10000 = 45;
               break;
            case 212:
               var10000 = 154;
               break;
            case 213:
               var10000 = 7;
               break;
            case 214:
               var10000 = 72;
               break;
            case 215:
               var10000 = 113;
               break;
            case 216:
               var10000 = 179;
               break;
            case 217:
               var10000 = 174;
               break;
            case 218:
               var10000 = 146;
               break;
            case 219:
               var10000 = 214;
               break;
            case 220:
               var10000 = 99;
               break;
            case 221:
               var10000 = 132;
               break;
            case 222:
               var10000 = 175;
               break;
            case 223:
               var10000 = 71;
               break;
            case 224:
               var10000 = 110;
               break;
            case 225:
               var10000 = 219;
               break;
            case 226:
               var10000 = 130;
               break;
            case 227:
               var10000 = 94;
               break;
            case 228:
               var10000 = 89;
               break;
            case 229:
               var10000 = 206;
               break;
            case 230:
               var10000 = 10;
               break;
            case 231:
               var10000 = 236;
               break;
            case 232:
               var10000 = 2;
               break;
            case 233:
               var10000 = 201;
               break;
            case 234:
               var10000 = 187;
               break;
            case 235:
               var10000 = 176;
               break;
            case 236:
               var10000 = 47;
               break;
            case 237:
               var10000 = 98;
               break;
            case 238:
               var10000 = 143;
               break;
            case 239:
               var10000 = 88;
               break;
            case 240:
               var10000 = 208;
               break;
            case 241:
               var10000 = 118;
               break;
            case 242:
               var10000 = 124;
               break;
            case 243:
               var10000 = 61;
               break;
            case 244:
               var10000 = 77;
               break;
            case 245:
               var10000 = 193;
               break;
            case 246:
               var10000 = 241;
               break;
            case 247:
               var10000 = 43;
               break;
            case 248:
               var10000 = 39;
               break;
            case 249:
               var10000 = 3;
               break;
            case 250:
               var10000 = 249;
               break;
            case 251:
               var10000 = 97;
               break;
            case 252:
               var10000 = 16;
               break;
            case 253:
               var10000 = 4;
               break;
            case 254:
               var10000 = 116;
               break;
            default:
               var10000 = 117;
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
      char[] var23;
      String[] var7 = new String[28];
      int var5 = 0;
      String var4 = "5ÈÊ\u0014{QZÚ¬Í+G®+\u0017f\u008c£\u0087:Q\u0080\u008aR¬\u008d\u0005è\u0083.yóý\u009e@Ü>/\nË\u0092o\u00ad\u0096\u00816{\u0097-\u0014\u009d¼ÄS8\u009bÛ\u0003ã\u008eã¿Ù4\u0083Ô\u0007ÏG³\f~3\u000fM.\u0095T_\u001eõ\u0010\u0095\b¸\u00ad\u0001VCa\u0084k\u00109¼1pD.Qf\u009f~cù\u0082âDK\fÍñy\u0015à\u009e\u008d>%Ùw\u0010\nÇ¯x\ntujå\u001cþ\u0015#n\u000bÛ/Ú\"û\u0006\u0082\u0007À¹;\u0014z¦\u001a9\u0091\u0095\u0014\u0011Êk\u001dmÖí¹\u0019®Olù|éäÃÜx\u0013\u000eæ\u009eÊ4;¦¾wb@Ä¡~å\nZ\u007f\t\u009av\u001d\tX\r¸\u0017MËÆo\u0096L\u0015)àØÛ\u008b\"RwCØºû¨p#º\b\n¢Á´\\O\u0085\u0088\u0018\nn-À\u0087ËÅ\u0089C¿I\u0013þ\u008b\u0093«óE$JqÐ]û\u001dö\u0012²Ot:»·\u008bb·ï;Ë`ÑÍ\"âmùá\\èãày¼Þ\b\u0087\u0015pAm\u0083A7\r ¼\u0012e(6ÚÁ\u0005£\u0090i^\u0019\u0086\u008cÜ\u001dºÌÚ\u0001RÒë7Þè\u0097Ár×)$IÆ\u009c\u0090\u0011\r&KD\u0098ÂÝ\u00adr\"\u000f©\u0016\n\u0014mÉÚýûN£¹ìÙ\u0002Uåi\u0004\u007f÷ºY\u001d\r\u0090=\u0092U80Ø\u0001E»\u0098j_\u0018¤¸\u0089Âs5ä<tdÎÊ\u0091\u001c`AÙÇ\\&ç\u0086I\u0098\u0010 l\u0084jòm\u0087\u000eEs8XéÖ)Í\u000e_Ákß\u000fÛ8Ø²µÞ\u001f=2";
      int var6 = "5ÈÊ\u0014{QZÚ¬Í+G®+\u0017f\u008c£\u0087:Q\u0080\u008aR¬\u008d\u0005è\u0083.yóý\u009e@Ü>/\nË\u0092o\u00ad\u0096\u00816{\u0097-\u0014\u009d¼ÄS8\u009bÛ\u0003ã\u008eã¿Ù4\u0083Ô\u0007ÏG³\f~3\u000fM.\u0095T_\u001eõ\u0010\u0095\b¸\u00ad\u0001VCa\u0084k\u00109¼1pD.Qf\u009f~cù\u0082âDK\fÍñy\u0015à\u009e\u008d>%Ùw\u0010\nÇ¯x\ntujå\u001cþ\u0015#n\u000bÛ/Ú\"û\u0006\u0082\u0007À¹;\u0014z¦\u001a9\u0091\u0095\u0014\u0011Êk\u001dmÖí¹\u0019®Olù|éäÃÜx\u0013\u000eæ\u009eÊ4;¦¾wb@Ä¡~å\nZ\u007f\t\u009av\u001d\tX\r¸\u0017MËÆo\u0096L\u0015)àØÛ\u008b\"RwCØºû¨p#º\b\n¢Á´\\O\u0085\u0088\u0018\nn-À\u0087ËÅ\u0089C¿I\u0013þ\u008b\u0093«óE$JqÐ]û\u001dö\u0012²Ot:»·\u008bb·ï;Ë`ÑÍ\"âmùá\\èãày¼Þ\b\u0087\u0015pAm\u0083A7\r ¼\u0012e(6ÚÁ\u0005£\u0090i^\u0019\u0086\u008cÜ\u001dºÌÚ\u0001RÒë7Þè\u0097Ár×)$IÆ\u009c\u0090\u0011\r&KD\u0098ÂÝ\u00adr\"\u000f©\u0016\n\u0014mÉÚýûN£¹ìÙ\u0002Uåi\u0004\u007f÷ºY\u001d\r\u0090=\u0092U80Ø\u0001E»\u0098j_\u0018¤¸\u0089Âs5ä<tdÎÊ\u0091\u001c`AÙÇ\\&ç\u0086I\u0098\u0010 l\u0084jòm\u0087\u000eEs8XéÖ)Í\u000e_Ákß\u000fÛ8Ø²µÞ\u001f=2"
         .length();
      char var3 = 14;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 18;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 82;
                        break;
                     case 1:
                        var50 = 123;
                        break;
                     case 2:
                        var50 = 101;
                        break;
                     case 3:
                        var50 = 70;
                        break;
                     case 4:
                        var50 = 13;
                        break;
                     case 5:
                        var50 = 107;
                        break;
                     default:
                        var50 = 8;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[28];
                     long var0 = 3481401435897593168L;
                     long var27 = -6840214779589165649L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     p = true;
                     i = false;
                     D = false;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "¹\u0012\u0005\u0081æ4!\u0001µ¶\u0002Ä\u0098}b\u0018\u001a\u0010zó)7\u008bX½ÌÓû\u0016\u001e´%go¯\u0017½\u0084&ü";
                  var6 = "¹\u0012\u0005\u0081æ4!\u0001µ¶\u0002Ä\u0098}b\u0018\u001a\u0010zó)7\u008bX½ÌÓû\u0016\u001e´%go¯\u0017½\u0084&ü".length();
                  var3 = 15;
                  var10 = -1;
            }

            var10000 = 50;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





