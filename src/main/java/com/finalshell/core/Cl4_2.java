package com.finalshell.core;

import com.finalshell.ui.model.Dr4;
import com.finalshell.ui.model.UX;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JComponent;

public class Cl4_2 {
   public static Map X;
   public static String D;
   public static String f;
   public static String S;
   public static String H;
   public static String Q;
   public static Map B;
   public static Map u;
   public static Map e;
   public static Map m;
   public static boolean U;
   public static boolean R;
   public static Object V;
   public static long a;
   public static WC_2 c;
   public static List J;
   public static boolean A;
   public static boolean L;
   public static boolean C;
   public static boolean h;
   public static String d;
   public static String[] b;
   public static String[] g;

   public static synchronized void L() {
      String var0 = I();

      boolean var10000;
      label20: {
         try {
            var10000 = h;
            if (var0 != null) {
               break label20;
            }

            if (h) {
               return;
            }
         } catch (ClassCastException var1) {
            throw a(var1);
         }

         var10000 = true;
      }

      h = var10000;
      PM.m(UX.class);
      PM.m(Dr4.class);
      PM.m(com.finalshell.ui.model.W2.class);
      W92.A();
   }

   public static List V() {
      return AL_2.J(e.values());
   }

   public static Map M() {
      return e;
   }

   public static void c(JComponent var0, String var1) {
      e(var0, var1, null);
   }

   public static void x(JComponent var0, String var1, java.lang.Class var2) {
      e(var0, var1, E(var2));
   }

   public static void e(JComponent var0, String var1, Object var2) {
      a(var0, Q, var1, var2);
   }

   public static void B(JComponent var0, String var1, String var2) {
      a(var0, var1, var2, null);
   }

   public static void t(JComponent var0, String var1, String var2, java.lang.Class var3) {
      a(var0, var1, var2, E(var3));
   }

   public static void a(JComponent var0, String var1, String var2, Object var3) {
      y(var0, var1, var2, var3, true, true);
   }

   public static void l(JComponent var0, String var1, boolean var2, boolean var3) {
      X(var0, var1, null, var2, var3);
   }

   public static void X(JComponent var0, String var1, java.lang.Class var2, boolean var3, boolean var4) {
      A(var0, var1, E(var2), var3, var4);
   }

   public static void A(JComponent var0, String var1, Object var2, boolean var3, boolean var4) {
      y(var0, Q, var1, var2, var3, var4);
   }

   public static void L(JComponent var0, String var1, String var2, java.lang.Class var3, boolean var4, boolean var5) {
      y(var0, var1, var2, E(var3), var4, var5);
   }

   public static void y(JComponent var0, String var1, String var2, Object var3, boolean var4, boolean var5) {
      W92.C(new AS(var0, var1, var2, var3, var4, var5));
   }

   public static void a(JComponent var0, IB var1) {
      W92.J(var0, var1);
   }

   public static void O(JComponent var0) {
      W92.M(var0);
   }

   public static void G(JComponent var0) {
      W92.C(var0);
   }

   public static void H(JComponent var0) {
      W92.h(var0);
   }

   public static void s(java.lang.Class var0, java.lang.Class var1) {
      W92.d(var0, var1);
   }

   public static Boolean o$Boolean(String var0) {
      return (Boolean)s(var0, (Boolean)null);
   }

   public static Boolean m(String var0, String var1) {
      return (Boolean)v(var0, var1, (Boolean)null);
   }

   public static String h(String var0) {
      return (String)s(var0, (String)null);
   }

   public static String t(String var0, String var1) {
      return (String)v(var0, var1, (String)null);
   }

   public static Integer b$Integer(String var0) {
      return (Integer)s(var0, (Integer)null);
   }

   public static Integer j(String var0, String var1) {
      return (Integer)v(var0, var1, (Integer)null);
   }

   public static Long o$Long(String var0) {
      return (Long)s(var0, (Long)null);
   }

   public static Long k(String var0, String var1) {
      return (Long)v(var0, var1, (Long)null);
   }

   public static Float d(String var0) {
      return (Float)s(var0, (Float)null);
   }

   public static Float Z(String var0, String var1) {
      return (Float)v(var0, var1, (Float)null);
   }

   public static Double D(String var0) {
      return (Double)s(var0, (Double)null);
   }

   public static Double a(String var0, String var1) {
      return (Double)v(var0, var1, (Double)null);
   }

   public static Dimension T$Dimension(String var0) {
      return (Dimension)s(var0, (Dimension)null);
   }

   public static Dimension V(String var0, String var1) {
      return (Dimension)v(var0, var1, (Dimension)null);
   }

   public static Point l$Point(String var0) {
      return (Point)s(var0, (Point)null);
   }

   public static Point p(String var0, String var1) {
      return (Point)v(var0, var1, (Point)null);
   }

   public static Color S$Color(String var0) {
      return (Color)s(var0, (Color)null);
   }

   public static Color K(String var0, String var1) {
      return (Color)v(var0, var1, (Color)null);
   }

   public static Rectangle u$Rectangle(String var0) {
      return (Rectangle)s(var0, (Rectangle)null);
   }

   public static Rectangle H(String var0, String var1) {
      return (Rectangle)v(var0, var1, (Rectangle)null);
   }

   public static Insets a(String var0) {
      return (Insets)s(var0, (Insets)null);
   }

   public static Insets e(String var0, String var1) {
      return (Insets)v(var0, var1, (Insets)null);
   }

   public static Object A$Object(String var0) {
      return s(var0, null);
   }

   public static Km4 e(String var0, java.lang.Class var1) {
      return (Km4)v(Q, var0, E(var1));
   }

   public static Object s(String var0, Object var1) {
      return v(Q, var0, var1);
   }

   public static Km4 I(String var0, String var1, java.lang.Class var2) {
      return (Km4)v(var0, var1, E(var2));
   }

   public static Object v(String param0, String param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: invokestatic com/finalshell/core/Cl4_2.L ()V
      // 06: astore 3
      // 07: aload 0
      // 08: invokestatic com/finalshell/core/Cl4_2.l$uX (Ljava/lang/String;)Lcom/finalshell/ui/model/UX;
      // 0b: astore 4
      // 0d: aload 4
      // 0f: aload 1
      // 10: invokevirtual com/finalshell/ui/model/UX.O (Ljava/lang/String;)Ljava/lang/Object;
      // 13: astore 5
      // 15: aload 5
      // 17: aload 3
      // 18: ifnonnull 60
      // 1b: ifnonnull 5e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 2
      // 26: aload 3
      // 27: ifnonnull 60
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifnull 5e
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 2
      // 3c: aload 3
      // 3d: ifnonnull 60
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: astore 5
      // 49: getstatic com/finalshell/core/Cl4_2.R Z
      // 4c: ifeq 5e
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 5
      // 53: invokestatic com/finalshell/core/Cl4_2.A (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 56: pop
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 5
      // 60: areturn
      // 61: astore 6
      // 63: ldc com/finalshell/core/Cl4_2
      // 65: aload 3
      // 66: ifnonnull b9
      // 69: new java/lang/StringBuilder
      // 6c: dup
      // 6d: invokespecial java/lang/StringBuilder.<init> ()V
      // 70: sipush 15789
      // 73: sipush -31686
      // 76: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 79: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c: aload 0
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: sipush 15800
      // 83: sipush 19595
      // 86: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: aload 1
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: sipush 15786
      // 93: sipush 7469
      // 96: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9f: aload 6
      // a1: invokestatic com/finalshell/core/NE3.i (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
      // a4: getstatic com/finalshell/core/Cl4_2.R Z
      // a7: ifeq b8
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: aload 0
      // b2: aload 1
      // b3: aload 2
      // b4: invokestatic com/finalshell/core/Cl4_2.A (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // b7: pop
      // b8: aload 2
      // b9: areturn
   }

   public static Km4 E(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 2a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: sipush 15778
      // 1d: sipush -25822
      // 20: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 23: bipush 0
      // 24: anewarray 4
      // 27: invokestatic com/finalshell/core/Kp2.W (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast com/finalshell/core/Km4
      // 2d: areturn
   }

   public static Object b(String var0, Object var1) {
      return A(Q, var0, var1);
   }

   public static Object A(String param0, String param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.L ()V
      // 03: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 06: aload 0
      // 07: invokestatic com/finalshell/core/Cl4_2.l$uX (Ljava/lang/String;)Lcom/finalshell/ui/model/UX;
      // 0a: astore 4
      // 0c: astore 3
      // 0d: aload 4
      // 0f: aload 1
      // 10: aload 2
      // 11: invokevirtual com/finalshell/ui/model/UX.J (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 14: astore 5
      // 16: aload 3
      // 17: ifnonnull 38
      // 1a: getstatic com/finalshell/core/Cl4_2.U Z
      // 1d: ifeq 32
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: invokestatic com/finalshell/core/Cl4_2.x (Ljava/lang/String;)V
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: aload 2
      // 35: invokestatic com/finalshell/core/Cl4_2.L (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
      // 38: aload 5
      // 3a: areturn
   }

   public static void U() {
      m(Q);
   }

   public static void m(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: new java/io/File
      // 06: dup
      // 07: aload 0
      // 08: invokestatic com/finalshell/core/Cl4_2.V (Ljava/lang/String;)Ljava/lang/String;
      // 0b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0e: astore 2
      // 0f: astore 1
      // 10: aload 2
      // 11: invokevirtual java/io/File.exists ()Z
      // 14: aload 1
      // 15: ifnonnull 6c
      // 18: ifeq 58
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 2
      // 23: invokevirtual java/io/File.isDirectory ()Z
      // 26: aload 1
      // 27: ifnonnull 6c
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifeq 58
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 2
      // 3d: invokestatic com/finalshell/core/Cl4_2.w (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 40: astore 3
      // 41: aload 0
      // 42: aload 2
      // 43: invokestatic com/finalshell/core/Cl4_2.U (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 46: astore 4
      // 48: bipush 2
      // 49: anewarray 4
      // 4c: dup
      // 4d: bipush 0
      // 4e: aload 3
      // 4f: aastore
      // 50: dup
      // 51: bipush 1
      // 52: aload 4
      // 54: aastore
      // 55: invokestatic com/finalshell/core/Cz2.D ([Ljava/lang/Object;)V
      // 58: getstatic com/finalshell/core/Cl4_2.e Ljava/util/Map;
      // 5b: aload 0
      // 5c: aload 1
      // 5d: ifnonnull 7a
      // 60: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: ifeq 80
      // 6f: getstatic com/finalshell/core/Cl4_2.e Ljava/util/Map;
      // 72: aload 0
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7f: pop
      // 80: return
   }

   public static void b$void(String var0) {
      l(Q, var0);
   }

   public static Object l(String param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 3
      // 05: astore 2
      // 06: aload 0
      // 07: invokestatic com/finalshell/core/Cl4_2.l$uX (Ljava/lang/String;)Lcom/finalshell/ui/model/UX;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: aload 2
      // 0f: ifnonnull 29
      // 12: ifnull 2a
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 4
      // 1e: aload 1
      // 1f: invokevirtual com/finalshell/ui/model/UX.D (Ljava/lang/String;)Ljava/lang/Object;
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: astore 3
      // 2a: aload 3
      // 2b: aload 2
      // 2c: ifnonnull 45
      // 2f: ifnull 44
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 0
      // 3a: invokestatic com/finalshell/core/Cl4_2.Y (Ljava/lang/String;)V
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 3
      // 45: areturn
   }

   public static UX l$uX(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 1
      // 04: getstatic com/finalshell/core/Cl4_2.e Ljava/util/Map;
      // 07: aload 0
      // 08: aload 1
      // 09: ifnonnull 26
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifeq 2f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.e Ljava/util/Map;
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast com/finalshell/ui/model/UX
      // 2e: areturn
      // 2f: aload 0
      // 30: invokestatic com/finalshell/core/Cl4_2.i (Ljava/lang/String;)Lcom/finalshell/ui/model/UX;
      // 33: areturn
   }

   public static UX i(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: new java/io/File
      // 009: dup
      // 00a: aload 0
      // 00b: invokestatic com/finalshell/core/Cl4_2.V (Ljava/lang/String;)Ljava/lang/String;
      // 00e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 011: astore 3
      // 012: aload 3
      // 013: aload 1
      // 014: ifnonnull 251
      // 017: invokevirtual java/io/File.exists ()Z
      // 01a: ifeq 23e
      // 01d: goto 024
      // 020: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 3
      // 025: aload 1
      // 026: ifnonnull 251
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: invokevirtual java/io/File.isDirectory ()Z
      // 033: ifeq 23e
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 0
      // 03e: aload 3
      // 03f: invokestatic com/finalshell/core/Cl4_2.w (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 042: astore 4
      // 044: aload 0
      // 045: aload 3
      // 046: invokestatic com/finalshell/core/Cl4_2.U (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 049: astore 5
      // 04b: aload 4
      // 04d: invokevirtual java/io/File.exists ()Z
      // 050: aload 1
      // 051: ifnonnull 08f
      // 054: ifeq 078
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 4
      // 060: invokevirtual java/io/File.isFile ()Z
      // 063: aload 1
      // 064: ifnonnull 0b4
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: ifne 0ac
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 1
      // 07b: ifnonnull 20b
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: invokevirtual java/io/File.exists ()Z
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: ifeq 1f8
      // 092: aload 5
      // 094: aload 1
      // 095: ifnonnull 20b
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: invokevirtual java/io/File.isFile ()Z
      // 0a2: ifeq 1f8
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: bipush 0
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: istore 6
      // 0b6: aload 5
      // 0b8: invokevirtual java/io/File.exists ()Z
      // 0bb: aload 1
      // 0bc: ifnonnull 0f8
      // 0bf: ifeq 0f3
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 5
      // 0cb: invokevirtual java/io/File.isFile ()Z
      // 0ce: aload 1
      // 0cf: ifnonnull 0f8
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: ifeq 0f3
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 5
      // 0e5: aload 4
      // 0e7: invokestatic com/finalshell/core/Cz2.v (Ljava/io/File;Ljava/io/File;)Z
      // 0ea: pop
      // 0eb: aload 5
      // 0ed: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 0f0: bipush 1
      // 0f1: istore 6
      // 0f3: aload 4
      // 0f5: invokevirtual java/io/File.exists ()Z
      // 0f8: aload 1
      // 0f9: ifnonnull 11d
      // 0fc: ifeq 1f5
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 4
      // 108: aload 1
      // 109: ifnonnull 125
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: invokevirtual java/io/File.isFile ()Z
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: ifeq 1f5
      // 120: aload 4
      // 122: invokestatic com/finalshell/core/PM.a (Ljava/io/File;)Ljava/lang/Object;
      // 125: checkcast com/finalshell/ui/model/UX
      // 128: astore 2
      // 129: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 12c: aload 0
      // 12d: new com/finalshell/ui/model/Dr4
      // 130: dup
      // 131: iload 6
      // 133: ifeq 140
      // 136: getstatic com/finalshell/ui/model/W2.restored Lcom/finalshell/ui/model/W2;
      // 139: goto 143
      // 13c: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: getstatic com/finalshell/ui/model/W2.ok Lcom/finalshell/ui/model/W2;
      // 143: invokespecial com/finalshell/ui/model/Dr4.<init> (Lcom/finalshell/ui/model/W2;)V
      // 146: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 14b: pop
      // 14c: iload 6
      // 14e: ifeq 15d
      // 151: sipush 15776
      // 154: sipush 21192
      // 157: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 15a: goto 166
      // 15d: sipush 15803
      // 160: sipush -30486
      // 163: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 166: astore 7
      // 168: ldc com/finalshell/core/Cl4_2
      // 16a: new java/lang/StringBuilder
      // 16d: dup
      // 16e: invokespecial java/lang/StringBuilder.<init> ()V
      // 171: sipush 15780
      // 174: sipush -27727
      // 177: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: aload 0
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: sipush 15790
      // 184: sipush -23420
      // 187: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: aload 7
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: sipush 15788
      // 195: sipush 24450
      // 198: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a1: bipush 0
      // 1a2: anewarray 4
      // 1a5: invokestatic com/finalshell/core/NE3.n (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1a8: goto 1f5
      // 1ab: astore 7
      // 1ad: ldc com/finalshell/core/Cl4_2
      // 1af: new java/lang/StringBuilder
      // 1b2: dup
      // 1b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b6: sipush 15779
      // 1b9: sipush -3899
      // 1bc: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: aload 0
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: sipush 15804
      // 1c9: sipush 24646
      // 1cc: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: aload 7
      // 1d7: invokestatic com/finalshell/core/NE3.i (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1da: aload 4
      // 1dc: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 1df: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 1e2: aload 0
      // 1e3: new com/finalshell/ui/model/Dr4
      // 1e6: dup
      // 1e7: getstatic com/finalshell/ui/model/W2.failed Lcom/finalshell/ui/model/W2;
      // 1ea: aload 7
      // 1ec: invokespecial com/finalshell/ui/model/Dr4.<init> (Lcom/finalshell/ui/model/W2;Ljava/lang/Throwable;)V
      // 1ef: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1f4: pop
      // 1f5: goto 23b
      // 1f8: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 1fb: aload 0
      // 1fc: new com/finalshell/ui/model/Dr4
      // 1ff: dup
      // 200: getstatic com/finalshell/ui/model/W2.created Lcom/finalshell/ui/model/W2;
      // 203: invokespecial com/finalshell/ui/model/Dr4.<init> (Lcom/finalshell/ui/model/W2;)V
      // 206: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 20b: pop
      // 20c: ldc com/finalshell/core/Cl4_2
      // 20e: new java/lang/StringBuilder
      // 211: dup
      // 212: invokespecial java/lang/StringBuilder.<init> ()V
      // 215: sipush 15780
      // 218: sipush -27727
      // 21b: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: aload 0
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: sipush 15787
      // 228: sipush -15772
      // 22b: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 22e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 231: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 234: bipush 0
      // 235: anewarray 4
      // 238: invokestatic com/finalshell/core/NE3.n (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
      // 23b: goto 281
      // 23e: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 241: aload 0
      // 242: new com/finalshell/ui/model/Dr4
      // 245: dup
      // 246: getstatic com/finalshell/ui/model/W2.created Lcom/finalshell/ui/model/W2;
      // 249: invokespecial com/finalshell/ui/model/Dr4.<init> (Lcom/finalshell/ui/model/W2;)V
      // 24c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 251: pop
      // 252: ldc com/finalshell/core/Cl4_2
      // 254: new java/lang/StringBuilder
      // 257: dup
      // 258: invokespecial java/lang/StringBuilder.<init> ()V
      // 25b: sipush 15780
      // 25e: sipush -27727
      // 261: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 264: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 267: aload 0
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: sipush 15783
      // 26e: sipush -184
      // 271: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27a: bipush 0
      // 27b: anewarray 4
      // 27e: invokestatic com/finalshell/core/NE3.n (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
      // 281: aload 2
      // 282: aload 1
      // 283: ifnonnull 2a5
      // 286: ifnonnull 299
      // 289: goto 290
      // 28c: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28f: athrow
      // 290: new com/finalshell/ui/model/UX
      // 293: dup
      // 294: aload 0
      // 295: invokespecial com/finalshell/ui/model/UX.<init> (Ljava/lang/String;)V
      // 298: astore 2
      // 299: getstatic com/finalshell/core/Cl4_2.e Ljava/util/Map;
      // 29c: aload 0
      // 29d: aload 2
      // 29e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2a3: pop
      // 2a4: aload 2
      // 2a5: aload 1
      // 2a6: ifnull 2b7
      // 2a9: bipush 5
      // 2aa: anewarray 150
      // 2ad: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b6: athrow
      // 2b7: areturn
   }

   public static void p() {
      String var10000 = I();
      Iterator var1 = e.entrySet().iterator();
      String var0 = var10000;

      while (true) {
         if (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();

            try {
               b((UX)var2.getValue());
               if (var0 != null) {
                  break;
               }

               if (var0 == null) {
                  continue;
               }
            } catch (ClassCastException var4) {
               throw a(var4);
            }
         }

         var1 = m.entrySet().iterator();
         break;
      }

      while (true) {
         if (var1.hasNext()) {
            Entry var5 = (Entry)var1.next();

            try {
               P((String)var5.getKey(), var5.getValue());
               if (var0 != null) {
                  break;
               }

               if (var0 == null) {
                  continue;
               }
            } catch (ClassCastException var3) {
               throw a(var3);
            }
         }

         W92.y();
         break;
      }
   }

   public static void Y(String var0) {
      b(l$uX(var0));
   }

   public static void b(UX param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 003: astore 1
      // 004: getstatic com/finalshell/core/Cl4_2.C Z
      // 007: ifeq 138
      // 00a: aload 0
      // 00b: invokevirtual com/finalshell/ui/model/UX.J ()Ljava/lang/String;
      // 00e: astore 2
      // 00f: new java/io/File
      // 012: dup
      // 013: aload 2
      // 014: invokestatic com/finalshell/core/Cl4_2.V (Ljava/lang/String;)Ljava/lang/String;
      // 017: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 01a: astore 3
      // 01b: aload 3
      // 01c: aload 1
      // 01d: ifnonnull 039
      // 020: invokestatic com/finalshell/core/Cz2.H$boolean (Ljava/io/File;)Z
      // 023: ifeq 0dc
      // 026: goto 02d
      // 029: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 2
      // 02e: aload 3
      // 02f: invokestatic com/finalshell/core/Cl4_2.w (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: astore 4
      // 03b: aconst_null
      // 03c: astore 5
      // 03e: aload 4
      // 040: aload 1
      // 041: ifnonnull 05d
      // 044: invokevirtual java/io/File.exists ()Z
      // 047: ifeq 067
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 2
      // 052: aload 3
      // 053: invokestatic com/finalshell/core/Cl4_2.U (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: astore 5
      // 05f: aload 4
      // 061: aload 5
      // 063: invokestatic com/finalshell/core/Cz2.v (Ljava/io/File;Ljava/io/File;)Z
      // 066: pop
      // 067: aload 0
      // 068: aload 4
      // 06a: invokestatic com/finalshell/core/PM.b (Ljava/lang/Object;Ljava/io/File;)V
      // 06d: aload 5
      // 06f: aload 1
      // 070: ifnonnull 07f
      // 073: ifnull 09c
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 5
      // 07f: invokevirtual java/io/File.exists ()Z
      // 082: aload 1
      // 083: ifnonnull 09f
      // 086: ifeq 09c
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 5
      // 092: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: getstatic com/finalshell/core/Cl4_2.L Z
      // 09f: ifeq 0d8
      // 0a2: ldc com/finalshell/core/Cl4_2
      // 0a4: new java/lang/StringBuilder
      // 0a7: dup
      // 0a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ab: sipush 15785
      // 0ae: sipush -4864
      // 0b1: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: aload 2
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: sipush 15782
      // 0be: sipush 7754
      // 0c1: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ca: bipush 0
      // 0cb: anewarray 4
      // 0ce: invokestatic com/finalshell/core/NE3.n (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: ifnull 105
      // 0dc: new java/lang/RuntimeException
      // 0df: dup
      // 0e0: new java/lang/StringBuilder
      // 0e3: dup
      // 0e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e7: sipush 15806
      // 0ea: sipush 30712
      // 0ed: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: aload 3
      // 0f4: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fd: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 100: athrow
      // 101: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: goto 138
      // 108: astore 2
      // 109: ldc com/finalshell/core/Cl4_2
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: sipush 15802
      // 115: sipush 13946
      // 118: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: aload 0
      // 11f: invokevirtual com/finalshell/ui/model/UX.J ()Ljava/lang/String;
      // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 125: sipush 15784
      // 128: sipush 20521
      // 12b: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 134: aload 2
      // 135: invokestatic com/finalshell/core/NE3.i (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 138: return
   }

   public static File w(String var0, File var1) {
      return new File(var1, var0 + D);
   }

   public static File U(String var0, File var1) {
      return new File(var1, var0 + D + f);
   }

   public static void x(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 1
      // 04: getstatic com/finalshell/core/Cl4_2.a J
      // 07: lconst_0
      // 08: lcmp
      // 09: ifle cd
      // 0c: getstatic com/finalshell/core/Cl4_2.V Ljava/lang/Object;
      // 0f: dup
      // 10: astore 2
      // 11: monitorenter
      // 12: getstatic com/finalshell/core/Cl4_2.J Ljava/util/List;
      // 15: aload 0
      // 16: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1b: aload 1
      // 1c: ifnonnull 32
      // 1f: ifne 33
      // 22: getstatic com/finalshell/core/Cl4_2.J Ljava/util/List;
      // 25: aload 0
      // 26: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: pop
      // 33: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // 36: aload 1
      // 37: ifnonnull 69
      // 3a: ifnull 5f
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // 47: aload 1
      // 48: ifnonnull c0
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: invokevirtual com/finalshell/core/WC_2.i ()Z
      // 55: ifne bf
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 1
      // 6a: ifnonnull b7
      // 6d: ifnonnull a7
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: new com/finalshell/core/WC_2
      // 7a: dup
      // 7b: sipush 15777
      // 7e: sipush -17909
      // 81: invokestatic com/finalshell/core/Cl4_2.a (II)Ljava/lang/String;
      // 84: getstatic com/finalshell/core/Cl4_2.a J
      // 87: new com/finalshell/ui/listener/DP3
      // 8a: dup
      // 8b: invokespecial com/finalshell/ui/listener/DP3.<init> ()V
      // 8e: invokespecial com/finalshell/core/WC_2.<init> (Ljava/lang/String;JLjava/awt/event/ActionListener;)V
      // 91: putstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // 94: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // 97: bipush 0
      // 98: invokevirtual com/finalshell/core/WC_2.x (Z)Lcom/finalshell/core/WC_2;
      // 9b: pop
      // 9c: aload 1
      // 9d: ifnull b8
      // a0: goto a7
      // a3: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // aa: getstatic com/finalshell/core/Cl4_2.a J
      // ad: invokevirtual com/finalshell/core/WC_2.M (J)Lcom/finalshell/core/WC_2;
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: pop
      // b8: getstatic com/finalshell/core/Cl4_2.c Lcom/finalshell/core/WC_2;
      // bb: invokevirtual com/finalshell/core/WC_2.u$WC ()Lcom/finalshell/core/WC_2;
      // be: pop
      // bf: aload 2
      // c0: monitorexit
      // c1: goto c9
      // c4: astore 3
      // c5: aload 2
      // c6: monitorexit
      // c7: aload 3
      // c8: athrow
      // c9: aload 1
      // ca: ifnull d8
      // cd: aload 0
      // ce: invokestatic com/finalshell/core/Cl4_2.Y (Ljava/lang/String;)V
      // d1: goto d8
      // d4: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d7: athrow
      // d8: return
   }

   public Dr4 c(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 2
      // 04: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 07: aload 1
      // 08: aload 2
      // 09: ifnonnull 3a
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifne 36
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 1e: aload 1
      // 1f: new com/finalshell/ui/model/Dr4
      // 22: dup
      // 23: getstatic com/finalshell/ui/model/W2.none Lcom/finalshell/ui/model/W2;
      // 26: invokespecial com/finalshell/ui/model/Dr4.<init> (Lcom/finalshell/ui/model/W2;)V
      // 29: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2e: pop
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: getstatic com/finalshell/core/Cl4_2.u Ljava/util/Map;
      // 39: aload 1
      // 3a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3f: checkcast com/finalshell/ui/model/Dr4
      // 42: areturn
   }

   public static Object O(String var0) {
      return Y(var0, null);
   }

   public static Object Y(String param0, Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 2
      // 04: getstatic com/finalshell/core/Cl4_2.m Ljava/util/Map;
      // 07: aload 2
      // 08: ifnonnull 30
      // 0b: aload 0
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifeq 29
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.m Ljava/util/Map;
      // 1e: aload 0
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: areturn
      // 25: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 0
      // 2a: invokestatic com/finalshell/core/Cl4_2.T$File (Ljava/lang/String;)Ljava/io/File;
      // 2d: invokestatic com/finalshell/core/PM.a (Ljava/io/File;)Ljava/lang/Object;
      // 30: astore 3
      // 31: goto 38
      // 34: astore 4
      // 36: aload 1
      // 37: astore 3
      // 38: getstatic com/finalshell/core/Cl4_2.m Ljava/util/Map;
      // 3b: aload 0
      // 3c: aload 3
      // 3d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 42: pop
      // 43: aload 3
      // 44: areturn
   }

   public static void m(String var0, Object var1) {
      try {
         m.put(var0, var1);
         if (U) {
            P(var0, var1);
         }
      } catch (ClassCastException var2) {
         throw a(var2);
      }
   }

   public static void P(String var0, Object var1) {
      try {
         if (C) {
            PM.b(var1, T$File(var0));
         }
      } catch (ClassCastException var2) {
         throw a(var2);
      }
   }

   public static boolean u$boolean(String var0) {
      return T$File(var0).exists();
   }

   public static File T$File(String var0) {
      return new File(Z(), var0);
   }

   public static String S() {
      return D;
   }

   public static void H(String var0) {
      D = var0;
   }

   public static String a() {
      return f;
   }

   public static void S$void(String var0) {
      f = var0;
   }

   public static String Z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 0
      // 04: getstatic com/finalshell/core/Cl4_2.S Ljava/lang/String;
      // 07: aload 0
      // 08: ifnonnull 33
      // 0b: ifnonnull 30
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/StringBuilder
      // 18: dup
      // 19: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c: invokestatic com/finalshell/core/Cz2.f$String ()Ljava/lang/String;
      // 1f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22: getstatic com/finalshell/core/Cl4_2.H Ljava/lang/String;
      // 25: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b: areturn
      // 2c: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: getstatic com/finalshell/core/Cl4_2.S Ljava/lang/String;
      // 33: areturn
   }

   public static void P(String var0) {
      S = var0;
   }

   public static String t() {
      return H;
   }

   public static void B(String var0) {
      H = var0;
   }

   public static String d() {
      return Q;
   }

   public static void y(String var0) {
      Q = var0;
   }

   public static void N(String var0, String var1) {
      B.put(var0, var1);
   }

   public static String V(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 1
      // 04: getstatic com/finalshell/core/Cl4_2.B Ljava/util/Map;
      // 07: aload 0
      // 08: aload 1
      // 09: ifnonnull 26
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifeq 2f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.B Ljava/util/Map;
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast java/lang/String
      // 2e: areturn
      // 2f: invokestatic com/finalshell/core/Cl4_2.Z ()Ljava/lang/String;
      // 32: areturn
   }

   public static boolean X$boolean() {
      return U;
   }

   public static void U(boolean var0) {
      U = var0;
   }

   public static boolean o() {
      return R;
   }

   public static void d(boolean var0) {
      R = var0;
   }

   public static long X$long() {
      return a;
   }

   public static void A(long var0) {
      a = var0;
   }

   public static boolean J() {
      return A;
   }

   public static void w(boolean var0) {
      A = var0;
      NE3.h(Cl4_2.class, var0);
   }

   public static boolean b() {
      return L;
   }

   public static void t(boolean var0) {
      L = var0;
   }

   public static boolean N() {
      return C;
   }

   public static void H(boolean var0) {
      C = var0;
   }

   public static void B() {
      H(false);
   }

   public static void u() {
      H(true);
   }

   public static void s(String var0, R5 var1) {
      S(d(), var0, var1);
   }

   public static void S(String param0, String param1, R5 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 3
      // 04: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 07: aload 0
      // 08: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d: aload 3
      // 0e: ifnonnull 45
      // 11: ifne 33
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 1e: aload 0
      // 1f: new java/util/HashMap
      // 22: dup
      // 23: invokespecial java/util/HashMap.<init> ()V
      // 26: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2b: pop
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 36: aload 0
      // 37: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3c: checkcast java/util/Map
      // 3f: aload 1
      // 40: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 45: aload 3
      // 46: ifnonnull 8f
      // 49: ifne 74
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 56: aload 0
      // 57: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5c: checkcast java/util/Map
      // 5f: aload 1
      // 60: new java/util/ArrayList
      // 63: dup
      // 64: invokespecial java/util/ArrayList.<init> ()V
      // 67: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6c: pop
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 77: aload 0
      // 78: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7d: checkcast java/util/Map
      // 80: aload 1
      // 81: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 86: checkcast java/util/List
      // 89: aload 2
      // 8a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8f: pop
      // 90: return
   }

   public static void C(String var0, R5 var1) {
      B(d(), var0, var1);
   }

   public static void B(String param0, String param1, R5 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 3
      // 04: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 07: aload 0
      // 08: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d: aload 3
      // 0e: ifnonnull 34
      // 11: ifeq 65
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 1e: aload 0
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast java/util/Map
      // 27: aload 1
      // 28: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 3
      // 35: ifnonnull 64
      // 38: ifeq 65
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 45: aload 0
      // 46: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4b: checkcast java/util/Map
      // 4e: aload 1
      // 4f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 54: checkcast java/util/List
      // 57: aload 2
      // 58: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: pop
      // 65: return
   }

   public static void L(String param0, String param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Cl4_2.I ()Ljava/lang/String;
      // 03: astore 3
      // 04: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 07: aload 0
      // 08: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d: aload 3
      // 0e: ifnonnull 3f
      // 11: ifeq 8a
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 1e: aload 0
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast java/util/Map
      // 27: aload 1
      // 28: aload 3
      // 29: ifnonnull 56
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: ifeq 8a
      // 42: getstatic com/finalshell/core/Cl4_2.X Ljava/util/Map;
      // 45: aload 0
      // 46: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4b: checkcast java/util/Map
      // 4e: aload 1
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Cl4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5b: checkcast java/util/Collection
      // 5e: invokestatic com/finalshell/core/AL_2.J (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 61: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 64: astore 4
      // 66: aload 4
      // 68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6d: ifeq 8a
      // 70: aload 4
      // 72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 77: checkcast com/finalshell/core/R5
      // 7a: astore 5
      // 7c: aload 5
      // 7e: aload 0
      // 7f: aload 1
      // 80: aload 2
      // 81: invokeinterface com/finalshell/core/R5.Y (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V 4
      // 86: aload 3
      // 87: ifnull 66
      // 8a: return
   }

   static {
      __vfClinit__();
   }

   public static void A$void(String var0) {
      d = var0;
   }

   public static String I() {
      return d;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 15786) & 65535;
      if (g[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 214;
               break;
            case 1:
               var10000 = 193;
               break;
            case 2:
               var10000 = 46;
               break;
            case 3:
               var10000 = 255;
               break;
            case 4:
               var10000 = 55;
               break;
            case 5:
               var10000 = 49;
               break;
            case 6:
               var10000 = 241;
               break;
            case 7:
               var10000 = 86;
               break;
            case 8:
               var10000 = 50;
               break;
            case 9:
               var10000 = 92;
               break;
            case 10:
               var10000 = 132;
               break;
            case 11:
               var10000 = 9;
               break;
            case 12:
               var10000 = 65;
               break;
            case 13:
               var10000 = 88;
               break;
            case 14:
               var10000 = 177;
               break;
            case 15:
               var10000 = 251;
               break;
            case 16:
               var10000 = 33;
               break;
            case 17:
               var10000 = 147;
               break;
            case 18:
               var10000 = 219;
               break;
            case 19:
               var10000 = 6;
               break;
            case 20:
               var10000 = 54;
               break;
            case 21:
               var10000 = 95;
               break;
            case 22:
               var10000 = 20;
               break;
            case 23:
               var10000 = 43;
               break;
            case 24:
               var10000 = 36;
               break;
            case 25:
               var10000 = 75;
               break;
            case 26:
               var10000 = 100;
               break;
            case 27:
               var10000 = 112;
               break;
            case 28:
               var10000 = 70;
               break;
            case 29:
               var10000 = 63;
               break;
            case 30:
               var10000 = 157;
               break;
            case 31:
               var10000 = 13;
               break;
            case 32:
               var10000 = 151;
               break;
            case 33:
               var10000 = 94;
               break;
            case 34:
               var10000 = 139;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 84;
               break;
            case 37:
               var10000 = 182;
               break;
            case 38:
               var10000 = 3;
               break;
            case 39:
               var10000 = 24;
               break;
            case 40:
               var10000 = 130;
               break;
            case 41:
               var10000 = 22;
               break;
            case 42:
               var10000 = 197;
               break;
            case 43:
               var10000 = 196;
               break;
            case 44:
               var10000 = 204;
               break;
            case 45:
               var10000 = 165;
               break;
            case 46:
               var10000 = 58;
               break;
            case 47:
               var10000 = 215;
               break;
            case 48:
               var10000 = 111;
               break;
            case 49:
               var10000 = 243;
               break;
            case 50:
               var10000 = 150;
               break;
            case 51:
               var10000 = 125;
               break;
            case 52:
               var10000 = 170;
               break;
            case 53:
               var10000 = 224;
               break;
            case 54:
               var10000 = 228;
               break;
            case 55:
               var10000 = 154;
               break;
            case 56:
               var10000 = 153;
               break;
            case 57:
               var10000 = 19;
               break;
            case 58:
               var10000 = 171;
               break;
            case 59:
               var10000 = 136;
               break;
            case 60:
               var10000 = 242;
               break;
            case 61:
               var10000 = 23;
               break;
            case 62:
               var10000 = 15;
               break;
            case 63:
               var10000 = 244;
               break;
            case 64:
               var10000 = 161;
               break;
            case 65:
               var10000 = 252;
               break;
            case 66:
               var10000 = 113;
               break;
            case 67:
               var10000 = 163;
               break;
            case 68:
               var10000 = 164;
               break;
            case 69:
               var10000 = 4;
               break;
            case 70:
               var10000 = 101;
               break;
            case 71:
               var10000 = 11;
               break;
            case 72:
               var10000 = 73;
               break;
            case 73:
               var10000 = 41;
               break;
            case 74:
               var10000 = 192;
               break;
            case 75:
               var10000 = 116;
               break;
            case 76:
               var10000 = 105;
               break;
            case 77:
               var10000 = 166;
               break;
            case 78:
               var10000 = 129;
               break;
            case 79:
               var10000 = 254;
               break;
            case 80:
               var10000 = 8;
               break;
            case 81:
               var10000 = 237;
               break;
            case 82:
               var10000 = 51;
               break;
            case 83:
               var10000 = 213;
               break;
            case 84:
               var10000 = 81;
               break;
            case 85:
               var10000 = 96;
               break;
            case 86:
               var10000 = 30;
               break;
            case 87:
               var10000 = 104;
               break;
            case 88:
               var10000 = 83;
               break;
            case 89:
               var10000 = 119;
               break;
            case 90:
               var10000 = 124;
               break;
            case 91:
               var10000 = 141;
               break;
            case 92:
               var10000 = 146;
               break;
            case 93:
               var10000 = 200;
               break;
            case 94:
               var10000 = 76;
               break;
            case 95:
               var10000 = 249;
               break;
            case 96:
               var10000 = 103;
               break;
            case 97:
               var10000 = 10;
               break;
            case 98:
               var10000 = 190;
               break;
            case 99:
               var10000 = 143;
               break;
            case 100:
               var10000 = 14;
               break;
            case 101:
               var10000 = 209;
               break;
            case 102:
               var10000 = 207;
               break;
            case 103:
               var10000 = 21;
               break;
            case 104:
               var10000 = 134;
               break;
            case 105:
               var10000 = 206;
               break;
            case 106:
               var10000 = 142;
               break;
            case 107:
               var10000 = 26;
               break;
            case 108:
               var10000 = 211;
               break;
            case 109:
               var10000 = 202;
               break;
            case 110:
               var10000 = 225;
               break;
            case 111:
               var10000 = 229;
               break;
            case 112:
               var10000 = 148;
               break;
            case 113:
               var10000 = 114;
               break;
            case 114:
               var10000 = 253;
               break;
            case 115:
               var10000 = 59;
               break;
            case 116:
               var10000 = 226;
               break;
            case 117:
               var10000 = 110;
               break;
            case 118:
               var10000 = 16;
               break;
            case 119:
               var10000 = 128;
               break;
            case 120:
               var10000 = 167;
               break;
            case 121:
               var10000 = 158;
               break;
            case 122:
               var10000 = 120;
               break;
            case 123:
               var10000 = 40;
               break;
            case 124:
               var10000 = 221;
               break;
            case 125:
               var10000 = 60;
               break;
            case 126:
               var10000 = 68;
               break;
            case 127:
               var10000 = 133;
               break;
            case 128:
               var10000 = 108;
               break;
            case 129:
               var10000 = 248;
               break;
            case 130:
               var10000 = 7;
               break;
            case 131:
               var10000 = 198;
               break;
            case 132:
               var10000 = 137;
               break;
            case 133:
               var10000 = 122;
               break;
            case 134:
               var10000 = 220;
               break;
            case 135:
               var10000 = 99;
               break;
            case 136:
               var10000 = 107;
               break;
            case 137:
               var10000 = 115;
               break;
            case 138:
               var10000 = 149;
               break;
            case 139:
               var10000 = 31;
               break;
            case 140:
               var10000 = 135;
               break;
            case 141:
               var10000 = 64;
               break;
            case 142:
               var10000 = 35;
               break;
            case 143:
               var10000 = 79;
               break;
            case 144:
               var10000 = 77;
               break;
            case 145:
               var10000 = 72;
               break;
            case 146:
               var10000 = 184;
               break;
            case 147:
               var10000 = 18;
               break;
            case 148:
               var10000 = 32;
               break;
            case 149:
               var10000 = 131;
               break;
            case 150:
               var10000 = 29;
               break;
            case 151:
               var10000 = 123;
               break;
            case 152:
               var10000 = 38;
               break;
            case 153:
               var10000 = 25;
               break;
            case 154:
               var10000 = 247;
               break;
            case 155:
               var10000 = 191;
               break;
            case 156:
               var10000 = 74;
               break;
            case 157:
               var10000 = 195;
               break;
            case 158:
               var10000 = 117;
               break;
            case 159:
               var10000 = 188;
               break;
            case 160:
               var10000 = 138;
               break;
            case 161:
               var10000 = 217;
               break;
            case 162:
               var10000 = 176;
               break;
            case 163:
               var10000 = 250;
               break;
            case 164:
               var10000 = 234;
               break;
            case 165:
               var10000 = 152;
               break;
            case 166:
               var10000 = 236;
               break;
            case 167:
               var10000 = 230;
               break;
            case 168:
               var10000 = 183;
               break;
            case 169:
               var10000 = 106;
               break;
            case 170:
               var10000 = 235;
               break;
            case 171:
               var10000 = 175;
               break;
            case 172:
               var10000 = 208;
               break;
            case 173:
               var10000 = 181;
               break;
            case 174:
               var10000 = 52;
               break;
            case 175:
               var10000 = 56;
               break;
            case 176:
               var10000 = 212;
               break;
            case 177:
               var10000 = 169;
               break;
            case 178:
               var10000 = 240;
               break;
            case 179:
               var10000 = 227;
               break;
            case 180:
               var10000 = 62;
               break;
            case 181:
               var10000 = 232;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 238;
               break;
            case 184:
               var10000 = 78;
               break;
            case 185:
               var10000 = 145;
               break;
            case 186:
               var10000 = 82;
               break;
            case 187:
               var10000 = 210;
               break;
            case 188:
               var10000 = 2;
               break;
            case 189:
               var10000 = 93;
               break;
            case 190:
               var10000 = 45;
               break;
            case 191:
               var10000 = 201;
               break;
            case 192:
               var10000 = 185;
               break;
            case 193:
               var10000 = 27;
               break;
            case 194:
               var10000 = 44;
               break;
            case 195:
               var10000 = 0;
               break;
            case 196:
               var10000 = 53;
               break;
            case 197:
               var10000 = 17;
               break;
            case 198:
               var10000 = 168;
               break;
            case 199:
               var10000 = 246;
               break;
            case 200:
               var10000 = 194;
               break;
            case 201:
               var10000 = 172;
               break;
            case 202:
               var10000 = 205;
               break;
            case 203:
               var10000 = 28;
               break;
            case 204:
               var10000 = 155;
               break;
            case 205:
               var10000 = 47;
               break;
            case 206:
               var10000 = 34;
               break;
            case 207:
               var10000 = 80;
               break;
            case 208:
               var10000 = 69;
               break;
            case 209:
               var10000 = 156;
               break;
            case 210:
               var10000 = 67;
               break;
            case 211:
               var10000 = 222;
               break;
            case 212:
               var10000 = 231;
               break;
            case 213:
               var10000 = 179;
               break;
            case 214:
               var10000 = 127;
               break;
            case 215:
               var10000 = 121;
               break;
            case 216:
               var10000 = 102;
               break;
            case 217:
               var10000 = 173;
               break;
            case 218:
               var10000 = 48;
               break;
            case 219:
               var10000 = 239;
               break;
            case 220:
               var10000 = 126;
               break;
            case 221:
               var10000 = 162;
               break;
            case 222:
               var10000 = 87;
               break;
            case 223:
               var10000 = 144;
               break;
            case 224:
               var10000 = 178;
               break;
            case 225:
               var10000 = 174;
               break;
            case 226:
               var10000 = 218;
               break;
            case 227:
               var10000 = 5;
               break;
            case 228:
               var10000 = 91;
               break;
            case 229:
               var10000 = 187;
               break;
            case 230:
               var10000 = 199;
               break;
            case 231:
               var10000 = 66;
               break;
            case 232:
               var10000 = 1;
               break;
            case 233:
               var10000 = 61;
               break;
            case 234:
               var10000 = 97;
               break;
            case 235:
               var10000 = 118;
               break;
            case 236:
               var10000 = 189;
               break;
            case 237:
               var10000 = 37;
               break;
            case 238:
               var10000 = 71;
               break;
            case 239:
               var10000 = 233;
               break;
            case 240:
               var10000 = 203;
               break;
            case 241:
               var10000 = 42;
               break;
            case 242:
               var10000 = 89;
               break;
            case 243:
               var10000 = 216;
               break;
            case 244:
               var10000 = 109;
               break;
            case 245:
               var10000 = 159;
               break;
            case 246:
               var10000 = 90;
               break;
            case 247:
               var10000 = 98;
               break;
            case 248:
               var10000 = 186;
               break;
            case 249:
               var10000 = 223;
               break;
            case 250:
               var10000 = 85;
               break;
            case 251:
               var10000 = 180;
               break;
            case 252:
               var10000 = 39;
               break;
            case 253:
               var10000 = 160;
               break;
            case 254:
               var10000 = 245;
               break;
            default:
               var10000 = 12;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var25;
      String[] var9 = new String[23];
      int var7 = 0;
      A$void(null);
      String var6 = "Í\u0096\u0007qWoÄm\u0017* ï\u0099;È@Î\u009ei\u001fª`h§£þ\u008aÖßÃ\u009b0Á\u0081þ°ÓÅÅÈb\t\u0016Aì\u0097)b\u0091¥¤\u001bÇ\u001aSÔ\u0086N\u009dÉ*«j\u0096k\u001eÅ©\u0000\u0086wÂ\u0007\u00ad\u000bøÉ[\u000b\u0086Íü¾\u0017³â¯¾n\u007fP¨ôÔ\n\u0013\u0010¹ÑÀeqÑYT±J\u0082WðL[ä\u0002+\u0000\u0007ÿÁË!&\u0082\u0017\r\u0085b[Ð)\u0099\r7ë4YËZ)eA\u0088\u000bÊÃÌ{ã\u000fpPg¸?½\u001c<ÄýX\"êUÔ\u0015§ÎÎ\u0013ÌË»2x®Ú&KÅÜ\u000fv\u0084\u008bÿ\u0014¼~ößË®\u0018Ìo£\u001f\u0013\u008cF²\u0013ô÷\u009d\u0084Ó\u009cËúË\u008cÓjñ\nD\u0081\u0015Ñ³¢ÚYFg\u0002\n\u0014òZ«\u0014ýã\f\u009aYg\u009fÓK\u008cuåYx«\u0090\"g©\u001bj\n06h1ËN¯ä\u0089Ûç\u009a\u0087MP\u000f<Ïr3_%îpí\bÛE\u0001\u0014(OªNÄ\b\u0010V¨!\u0089f²äRÖ\u0098þ^®\u0016!µ\u009b\u0002ãô\u0095\b\u001dRÚáÌÐMW©s§A\u0017\u000e\u0010H\u0015þý¶Â¡6®\u0006aÞ\u008c}ÔÂ\u0004é\u0018\u0001ú\u001f\t7\u0005Å{\u001aú@%h·²t*¨ÎîR\u009a0\u0093\u009b\u0093bêàP\u0001Fê.\u0006=\u0015\u009d¦a±\u000bÛÑÆ\u0092\u000b8¶ø\u0098L\u0085\u0007Æ¤ìÞ¸\u0013ì\"^¶4\u0017°Üà¼{GÐ¯Û{\u007f\u001f<¼îêª3Ï¥VÔ\u0002\u0091CcZu·1";
      int var8 = "Í\u0096\u0007qWoÄm\u0017* ï\u0099;È@Î\u009ei\u001fª`h§£þ\u008aÖßÃ\u009b0Á\u0081þ°ÓÅÅÈb\t\u0016Aì\u0097)b\u0091¥¤\u001bÇ\u001aSÔ\u0086N\u009dÉ*«j\u0096k\u001eÅ©\u0000\u0086wÂ\u0007\u00ad\u000bøÉ[\u000b\u0086Íü¾\u0017³â¯¾n\u007fP¨ôÔ\n\u0013\u0010¹ÑÀeqÑYT±J\u0082WðL[ä\u0002+\u0000\u0007ÿÁË!&\u0082\u0017\r\u0085b[Ð)\u0099\r7ë4YËZ)eA\u0088\u000bÊÃÌ{ã\u000fpPg¸?½\u001c<ÄýX\"êUÔ\u0015§ÎÎ\u0013ÌË»2x®Ú&KÅÜ\u000fv\u0084\u008bÿ\u0014¼~ößË®\u0018Ìo£\u001f\u0013\u008cF²\u0013ô÷\u009d\u0084Ó\u009cËúË\u008cÓjñ\nD\u0081\u0015Ñ³¢ÚYFg\u0002\n\u0014òZ«\u0014ýã\f\u009aYg\u009fÓK\u008cuåYx«\u0090\"g©\u001bj\n06h1ËN¯ä\u0089Ûç\u009a\u0087MP\u000f<Ïr3_%îpí\bÛE\u0001\u0014(OªNÄ\b\u0010V¨!\u0089f²äRÖ\u0098þ^®\u0016!µ\u009b\u0002ãô\u0095\b\u001dRÚáÌÐMW©s§A\u0017\u000e\u0010H\u0015þý¶Â¡6®\u0006aÞ\u008c}ÔÂ\u0004é\u0018\u0001ú\u001f\t7\u0005Å{\u001aú@%h·²t*¨ÎîR\u009a0\u0093\u009b\u0093bêàP\u0001Fê.\u0006=\u0015\u009d¦a±\u000bÛÑÆ\u0092\u000b8¶ø\u0098L\u0085\u0007Æ¤ìÞ¸\u0013ì\"^¶4\u0017°Üà¼{GÐ¯Û{\u007f\u001f<¼îêª3Ï¥VÔ\u0002\u0091CcZu·1"
         .length();
      char var5 = '*';
      int var12 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
         String var10001 = var6.substring(++var12, var12 + var5);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var10 = 0;
               byte var33 = var10000;
               var25 = var30;
               int var18 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var30;
                  var38 = var10000;
                  var10006 = var10;
               } else {
                  var33 = var10000;
                  var18 = var10004;
                  if (var10004 <= var10) {
                     break label47;
                  }

                  var42 = var30;
                  var38 = var10000;
                  var10006 = var10;
               }

               while (true) {
                  char var51 = var42[var10006];
                  byte var52;
                  switch (var10 % 7) {
                     case 0:
                        var52 = 76;
                        break;
                     case 1:
                        var52 = 5;
                        break;
                     case 2:
                        var52 = 39;
                        break;
                     case 3:
                        var52 = 86;
                        break;
                     case 4:
                        var52 = 10;
                        break;
                     case 5:
                        var52 = 55;
                        break;
                     default:
                        var52 = 1;
                  }

                  var42[var10006] = (char)(var51 ^ var38 ^ var52);
                  var10++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var42 = var25;
                     var38 = var33;
                  } else {
                     if (var18 <= var10) {
                        break;
                     }

                     var42 = var25;
                     var38 = var33;
                     var10006 = var10;
                  }
               }
            }

            String var35 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var9[var7++] = var35;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[23];
                     long var2 = 4100086860790149775L;
                     long var29 = 4100086860790150011L ^ var2;
                     byte var20 = -1;
                     long var0 = var29;
                     X = new HashMap();
                     D = a(15781, 30023);
                     f = a(15807, -3673);
                     S = null;
                     H = a(15791, -30040);
                     Q = a(15801, -5697);
                     B = new HashMap();
                     u = new HashMap();
                     e = new HashMap();
                     m = new HashMap();
                     U = true;
                     R = true;
                     V = new Object();
                     a = var0;
                     c = null;
                     J = new ArrayList();
                     A = true;
                     L = false;
                     C = true;
                     h = false;
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var35;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label52;
                  }

                  var6 = "§t\u009e{U¦Ò\u001eI(ËìTÕ9\u0015\u0096µ ¨l¢{\"2\u0096x\u0088\u008c©PÇÍå\u001d'm7";
                  var8 = "§t\u009e{U¦Ò\u001eI(ËìTÕ9\u0015\u0096µ ¨l¢{\"2\u0096x\u0088\u008c©PÇÍå\u001d'm7".length();
                  var5 = 7;
                  var12 = -1;
            }

            var10000 = 43;
            var10001 = var6.substring(++var12, var12 + var5);
            var10002 = 0;
         }
      }
   }
}





