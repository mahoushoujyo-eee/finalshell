package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public final class GA {
   public static AffineTransform e;
   public static AffineTransform N;
   public static AffineTransform d;
   public static AffineTransform P;
   public static Map i;
   public static int a;
   public static int o;
   public static int u;
   public static int U;
   public static PF3 g;
   public static PF3 M;
   public static PF3 l;
   public static PF3 V;
   public static PF3 z;
   public static PF3 j;
   public static PF3 F;
   public static PF3 C;
   public static PF3 B;
   public static ImageIcon x;
   public static Map q;
   public static String[] b;
   public static String[] c;
   public static long[] f;
   public static Integer[] h;

   public static Border y(Insets var0) {
      return new KS(var0.top, var0.left, var0.bottom, var0.right);
   }

   public static Border C(int var0, int var1, int var2, int var3) {
      return new KS(var0, var1, var2, var3);
   }

   public static Border V(int var0) {
      return new KS(var0, var0, var0, var0);
   }

   public static Og4 u(Og4 param0, java.lang.Class param1, java.lang.Class param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: aconst_null
      // 09: goto 3d
      // 0c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f: athrow
      // 10: aload 1
      // 11: aload 3
      // 12: ifnonnull 3a
      // 15: aload 0
      // 16: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 19: invokestatic com/finalshell/core/Kp2.d (Ljava/lang/Class;Ljava/lang/Class;)Z
      // 1c: ifeq 2e
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: aload 0
      // 27: goto 3d
      // 2a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: aload 2
      // 2f: bipush 1
      // 30: anewarray 4
      // 33: dup
      // 34: bipush 0
      // 35: aload 0
      // 36: aastore
      // 37: invokestatic com/finalshell/core/Kp2.U (Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3a: checkcast com/finalshell/core/Og4
      // 3d: areturn
   }

   public static Og4 m(Og4 param0) {
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
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 36
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: ifnonnull 33
      // 18: instanceof com/finalshell/core/LP
      // 1b: ifeq 36
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: aload 0
      // 26: checkcast com/finalshell/core/LP
      // 29: invokevirtual com/finalshell/core/LP.J ()Lcom/finalshell/core/Og4;
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: goto 37
      // 36: aload 0
      // 37: areturn
   }

   public static void q(JComponent var0, Og4 var1, Og4 var2) {
      try {
         Kp2.j(var0, a(-31936, -19648), new Object[]{a(-31913, 20788), var1, var2});
      } catch (NoSuchMethodException var4) {
         NE3.g(GA.class, var4);
      } catch (InvocationTargetException var5) {
         NE3.g(GA.class, var5);
      } catch (IllegalAccessException var6) {
         NE3.g(GA.class, var6);
      }
   }

   public static void B(JScrollPane param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual javax/swing/JScrollPane.getVerticalScrollBar ()Ljavax/swing/JScrollBar;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: aload 2
      // 0b: ifnonnull 42
      // 0e: ifnull 3e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 3
      // 19: aload 2
      // 1a: ifnonnull 42
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: invokevirtual javax/swing/JScrollBar.getUI ()Ljavax/swing/plaf/ScrollBarUI;
      // 27: astore 4
      // 29: aload 4
      // 2b: instanceof com/finalshell/core/Xm2
      // 2e: ifeq 3e
      // 31: aload 4
      // 33: checkcast com/finalshell/core/Xm2
      // 36: astore 5
      // 38: aload 5
      // 3a: aload 1
      // 3b: invokevirtual com/finalshell/core/Xm2.S (Ljava/lang/String;)V
      // 3e: aload 0
      // 3f: invokevirtual javax/swing/JScrollPane.getHorizontalScrollBar ()Ljavax/swing/JScrollBar;
      // 42: astore 4
      // 44: aload 4
      // 46: aload 2
      // 47: ifnonnull 56
      // 4a: ifnull 82
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 4
      // 56: invokevirtual javax/swing/JScrollBar.getUI ()Ljavax/swing/plaf/ScrollBarUI;
      // 59: astore 5
      // 5b: aload 5
      // 5d: aload 2
      // 5e: ifnonnull 77
      // 61: instanceof com/finalshell/core/Xm2
      // 64: ifeq 82
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6d: athrow
      // 6e: aload 5
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: checkcast com/finalshell/core/Xm2
      // 7a: astore 6
      // 7c: aload 6
      // 7e: aload 1
      // 7f: invokevirtual com/finalshell/core/Xm2.S (Ljava/lang/String;)V
      // 82: return
   }

   public static ComponentUI Z(Component var0) {
      return (ComponentUI)Kp2.I(var0, a(-31909, 25504), new Object[0]);
   }

   public static void Z(JComponent param0, Insets param1, Og4 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: aload 3
      // 006: ifnonnull 014
      // 009: ifnull 16c
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 012: athrow
      // 013: aload 0
      // 014: invokestatic com/finalshell/core/FN.l (Ljavax/swing/JComponent;)Z
      // 017: aload 3
      // 018: ifnonnull 02d
      // 01b: ifeq 026
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 024: athrow
      // 025: return
      // 026: aload 0
      // 027: invokevirtual javax/swing/JComponent.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 02a: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 02d: istore 4
      // 02f: new java/awt/Insets
      // 032: dup
      // 033: bipush 0
      // 034: bipush 0
      // 035: bipush 0
      // 036: bipush 0
      // 037: invokespecial java/awt/Insets.<init> (IIII)V
      // 03a: astore 5
      // 03c: aload 1
      // 03d: aload 3
      // 03e: ifnonnull 06d
      // 041: ifnull 0c0
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04a: athrow
      // 04b: aload 5
      // 04d: dup
      // 04e: getfield java/awt/Insets.top I
      // 051: aload 1
      // 052: aload 3
      // 053: ifnonnull 082
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: getfield java/awt/Insets.top I
      // 060: iadd
      // 061: putfield java/awt/Insets.top I
      // 064: aload 5
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06c: athrow
      // 06d: dup
      // 06e: getfield java/awt/Insets.left I
      // 071: iload 4
      // 073: ifeq 081
      // 076: aload 1
      // 077: getfield java/awt/Insets.left I
      // 07a: goto 085
      // 07d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 080: athrow
      // 081: aload 1
      // 082: getfield java/awt/Insets.right I
      // 085: iadd
      // 086: putfield java/awt/Insets.left I
      // 089: aload 5
      // 08b: dup
      // 08c: getfield java/awt/Insets.bottom I
      // 08f: aload 1
      // 090: aload 3
      // 091: ifnonnull 0b9
      // 094: getfield java/awt/Insets.bottom I
      // 097: iadd
      // 098: putfield java/awt/Insets.bottom I
      // 09b: aload 5
      // 09d: dup
      // 09e: getfield java/awt/Insets.right I
      // 0a1: iload 4
      // 0a3: ifeq 0b8
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: getfield java/awt/Insets.right I
      // 0b1: goto 0bc
      // 0b4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: getfield java/awt/Insets.left I
      // 0bc: iadd
      // 0bd: putfield java/awt/Insets.right I
      // 0c0: aload 2
      // 0c1: aload 3
      // 0c2: ifnonnull 0d0
      // 0c5: ifnull 163
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: aload 0
      // 0d1: invokeinterface com/finalshell/core/Og4.B (Ljavax/swing/JComponent;)Ljava/awt/Insets; 2
      // 0d6: astore 6
      // 0d8: aload 6
      // 0da: aload 3
      // 0db: ifnonnull 10b
      // 0de: ifnull 163
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: dup
      // 0eb: getfield java/awt/Insets.top I
      // 0ee: aload 6
      // 0f0: aload 3
      // 0f1: ifnonnull 122
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fa: athrow
      // 0fb: getfield java/awt/Insets.top I
      // 0fe: iadd
      // 0ff: putfield java/awt/Insets.top I
      // 102: aload 5
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: dup
      // 10c: getfield java/awt/Insets.left I
      // 10f: iload 4
      // 111: ifeq 120
      // 114: aload 6
      // 116: getfield java/awt/Insets.left I
      // 119: goto 125
      // 11c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11f: athrow
      // 120: aload 6
      // 122: getfield java/awt/Insets.right I
      // 125: iadd
      // 126: putfield java/awt/Insets.left I
      // 129: aload 5
      // 12b: dup
      // 12c: getfield java/awt/Insets.bottom I
      // 12f: aload 6
      // 131: aload 3
      // 132: ifnonnull 15c
      // 135: getfield java/awt/Insets.bottom I
      // 138: iadd
      // 139: putfield java/awt/Insets.bottom I
      // 13c: aload 5
      // 13e: dup
      // 13f: getfield java/awt/Insets.right I
      // 142: iload 4
      // 144: ifeq 15a
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14d: athrow
      // 14e: aload 6
      // 150: getfield java/awt/Insets.right I
      // 153: goto 15f
      // 156: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 159: athrow
      // 15a: aload 6
      // 15c: getfield java/awt/Insets.left I
      // 15f: iadd
      // 160: putfield java/awt/Insets.right I
      // 163: aload 0
      // 164: aload 5
      // 166: invokestatic com/finalshell/core/GA.y (Ljava/awt/Insets;)Ljavax/swing/border/Border;
      // 169: invokevirtual javax/swing/JComponent.setBorder (Ljavax/swing/border/Border;)V
      // 16c: return
   }

   public static Dimension a(JComponent var0, Og4 var1) {
      Og4 var10000;
      Dimension var6;
      String var2 = FV_2.D();

      label28: {
         label27: {
            label26: {
               try {
                  var10000 = var1;
                  if (var2 != null) {
                     break label27;
                  }

                  if (var1 == null) {
                     break label26;
                  }
               } catch (RuntimeException var5) {
                  throw a(var5);
               }

               var10000 = var1;
               break label27;
            }

            var6 = new Dimension(0, 0);
            break label28;
         }

         var6 = var10000.d$Dimension(var0);
      }

      Dimension var3 = var6;
      LayoutManager var4 = var0.getLayout();
      if (var4 != null) {
         var3 = FN.h(var3, var4.preferredLayoutSize(var0));
      }

      return var3;
   }

   public static void A(Graphics param0, JComponent param1) {
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
      // 04: aload 2
      // 05: ifnonnull 25
      // 08: aload 1
      // 09: invokevirtual javax/swing/JComponent.isOpaque ()Z
      // 0c: ifeq 2a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual javax/swing/JComponent.getBackground ()Ljava/awt/Color;
      // 1b: invokevirtual java/awt/Graphics.setColor (Ljava/awt/Color;)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: invokestatic com/finalshell/core/GA.L (Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
      // 2a: return
   }

   public static void L(Graphics var0, JComponent var1) {
      String var10000;
      Rectangle var4;
      Shape var6;
      Rectangle var7;
      var10000 = FV_2.D();
      Shape var3 = var0.getClip();
      String var2 = var10000;

      label24: {
         label23: {
            label22: {
               try {
                  var6 = var3;
                  if (var2 != null) {
                     break label23;
                  }

                  if (var3 == null) {
                     break label22;
                  }
               } catch (RuntimeException var5) {
                  throw a(var5);
               }

               var6 = var3;
               break label23;
            }

            var7 = var1.getVisibleRect();
            break label24;
         }

         var7 = var6.getBounds();
      }

      var4 = var7;
      var0.fillRect(var4.x, var4.y, var4.width, var4.height);
   }

   public static void G(JButton var0) {
      var0.setUI(new BasicButtonUI());
      var0.setMargin(new Insets(0, 0, 0, 0));
      var0.setBorder(null);
      var0.setBorderPainted(false);
      var0.setContentAreaFilled(false);
      var0.setFocusable(false);
      var0.setOpaque(false);
   }

   public static Shape K(int param0, int[] param1) {
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
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: aload 1
      // 14: arraylength
      // 15: bipush 2
      // 16: irem
      // 17: aload 2
      // 18: ifnonnull 3e
      // 1b: ifeq 3a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: new java/lang/RuntimeException
      // 28: dup
      // 29: sipush -31907
      // 2c: sipush 10790
      // 2f: invokestatic com/finalshell/core/GA.a (II)Ljava/lang/String;
      // 32: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: aload 1
      // 3b: arraylength
      // 3c: bipush 2
      // 3d: idiv
      // 3e: anewarray 276
      // 41: astore 3
      // 42: bipush 0
      // 43: istore 4
      // 45: iload 4
      // 47: aload 1
      // 48: arraylength
      // 49: if_icmpge 6a
      // 4c: aload 3
      // 4d: iload 4
      // 4f: bipush 2
      // 50: idiv
      // 51: new java/awt/Point
      // 54: dup
      // 55: aload 1
      // 56: iload 4
      // 58: iaload
      // 59: aload 1
      // 5a: iload 4
      // 5c: bipush 1
      // 5d: iadd
      // 5e: iaload
      // 5f: invokespecial java/awt/Point.<init> (II)V
      // 62: aastore
      // 63: iinc 4 2
      // 66: aload 2
      // 67: ifnull 45
      // 6a: iload 0
      // 6b: aload 3
      // 6c: invokestatic com/finalshell/core/GA.a (I[Ljava/awt/Point;)Ljava/awt/Shape;
      // 6f: areturn
   }

   public static Shape a(int var0, Point[] var1) {
      return m(var0, var1, null);
   }

   public static Shape m(int param0, Point[] param1, boolean[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnonnull 014
      // 009: ifnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 012: athrow
      // 013: aload 1
      // 014: arraylength
      // 015: bipush 3
      // 016: if_icmpge 02e
      // 019: new java/lang/RuntimeException
      // 01c: dup
      // 01d: sipush -31934
      // 020: sipush -12111
      // 023: invokestatic com/finalshell/core/GA.a (II)Ljava/lang/String;
      // 026: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 029: athrow
      // 02a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02d: athrow
      // 02e: aload 2
      // 02f: aload 3
      // 030: ifnonnull 03e
      // 033: ifnull 059
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03c: athrow
      // 03d: aload 2
      // 03e: arraylength
      // 03f: aload 1
      // 040: arraylength
      // 041: if_icmpeq 059
      // 044: new java/lang/RuntimeException
      // 047: dup
      // 048: sipush -31918
      // 04b: sipush 17304
      // 04e: invokestatic com/finalshell/core/GA.a (II)Ljava/lang/String;
      // 051: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 054: athrow
      // 055: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 058: athrow
      // 059: new java/awt/geom/GeneralPath
      // 05c: dup
      // 05d: bipush 0
      // 05e: invokespecial java/awt/geom/GeneralPath.<init> (I)V
      // 061: astore 4
      // 063: bipush 0
      // 064: istore 5
      // 066: iload 5
      // 068: aload 1
      // 069: arraylength
      // 06a: if_icmpge 261
      // 06d: aload 1
      // 06e: iload 5
      // 070: aaload
      // 071: astore 6
      // 073: iload 5
      // 075: aload 3
      // 076: ifnonnull 1a3
      // 079: ifne 19b
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 082: athrow
      // 083: aload 1
      // 084: aload 1
      // 085: arraylength
      // 086: bipush 1
      // 087: isub
      // 088: aaload
      // 089: astore 7
      // 08b: aload 3
      // 08c: ifnonnull 0dc
      // 08f: iload 0
      // 090: ifeq 0c4
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 099: athrow
      // 09a: aload 2
      // 09b: aload 3
      // 09c: ifnonnull 0b1
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a5: athrow
      // 0a6: ifnull 0e0
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0af: athrow
      // 0b0: aload 2
      // 0b1: aload 1
      // 0b2: arraylength
      // 0b3: bipush 1
      // 0b4: isub
      // 0b5: baload
      // 0b6: aload 3
      // 0b7: ifnonnull 0e8
      // 0ba: ifne 0e0
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c3: athrow
      // 0c4: aload 4
      // 0c6: aload 7
      // 0c8: getfield java/awt/Point.x I
      // 0cb: i2f
      // 0cc: aload 7
      // 0ce: getfield java/awt/Point.y I
      // 0d1: i2f
      // 0d2: invokevirtual java/awt/geom/GeneralPath.moveTo (FF)V
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0db: athrow
      // 0dc: aload 3
      // 0dd: ifnull 102
      // 0e0: iload 0
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e7: athrow
      // 0e8: aload 7
      // 0ea: aload 6
      // 0ec: invokestatic com/finalshell/core/GA.U (ILjava/awt/Point;Ljava/awt/Point;)Ljava/awt/Point;
      // 0ef: astore 8
      // 0f1: aload 4
      // 0f3: aload 8
      // 0f5: getfield java/awt/Point.x I
      // 0f8: i2f
      // 0f9: aload 8
      // 0fb: getfield java/awt/Point.y I
      // 0fe: i2f
      // 0ff: invokevirtual java/awt/geom/GeneralPath.moveTo (FF)V
      // 102: iload 0
      // 103: ifeq 12e
      // 106: aload 2
      // 107: aload 3
      // 108: ifnonnull 11d
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 111: athrow
      // 112: ifnull 14a
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: aload 2
      // 11d: iload 5
      // 11f: baload
      // 120: aload 3
      // 121: ifnonnull 152
      // 124: ifne 14a
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12d: athrow
      // 12e: aload 4
      // 130: aload 6
      // 132: getfield java/awt/Point.x I
      // 135: i2f
      // 136: aload 6
      // 138: getfield java/awt/Point.y I
      // 13b: i2f
      // 13c: invokevirtual java/awt/geom/GeneralPath.lineTo (FF)V
      // 13f: aload 3
      // 140: ifnull 197
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 149: athrow
      // 14a: iload 0
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 151: athrow
      // 152: aload 6
      // 154: aload 7
      // 156: invokestatic com/finalshell/core/GA.U (ILjava/awt/Point;Ljava/awt/Point;)Ljava/awt/Point;
      // 159: astore 8
      // 15b: iload 0
      // 15c: aload 6
      // 15e: aload 1
      // 15f: iload 5
      // 161: bipush 1
      // 162: iadd
      // 163: aaload
      // 164: invokestatic com/finalshell/core/GA.U (ILjava/awt/Point;Ljava/awt/Point;)Ljava/awt/Point;
      // 167: astore 9
      // 169: aload 4
      // 16b: aload 8
      // 16d: getfield java/awt/Point.x I
      // 170: i2f
      // 171: aload 8
      // 173: getfield java/awt/Point.y I
      // 176: i2f
      // 177: invokevirtual java/awt/geom/GeneralPath.lineTo (FF)V
      // 17a: aload 4
      // 17c: aload 6
      // 17e: getfield java/awt/Point.x I
      // 181: i2f
      // 182: aload 6
      // 184: getfield java/awt/Point.y I
      // 187: i2f
      // 188: aload 9
      // 18a: getfield java/awt/Point.x I
      // 18d: i2f
      // 18e: aload 9
      // 190: getfield java/awt/Point.y I
      // 193: i2f
      // 194: invokevirtual java/awt/geom/GeneralPath.quadTo (FFFF)V
      // 197: aload 3
      // 198: ifnull 25a
      // 19b: iload 0
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a2: athrow
      // 1a3: ifeq 1ce
      // 1a6: aload 2
      // 1a7: aload 3
      // 1a8: ifnonnull 1bd
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b1: athrow
      // 1b2: ifnull 1ea
      // 1b5: goto 1bc
      // 1b8: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bb: athrow
      // 1bc: aload 2
      // 1bd: iload 5
      // 1bf: baload
      // 1c0: aload 3
      // 1c1: ifnonnull 1f2
      // 1c4: ifne 1ea
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1cd: athrow
      // 1ce: aload 4
      // 1d0: aload 6
      // 1d2: getfield java/awt/Point.x I
      // 1d5: i2f
      // 1d6: aload 6
      // 1d8: getfield java/awt/Point.y I
      // 1db: i2f
      // 1dc: invokevirtual java/awt/geom/GeneralPath.lineTo (FF)V
      // 1df: aload 3
      // 1e0: ifnull 25a
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e9: athrow
      // 1ea: iload 0
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f1: athrow
      // 1f2: aload 6
      // 1f4: aload 1
      // 1f5: iload 5
      // 1f7: bipush 1
      // 1f8: isub
      // 1f9: aaload
      // 1fa: invokestatic com/finalshell/core/GA.U (ILjava/awt/Point;Ljava/awt/Point;)Ljava/awt/Point;
      // 1fd: astore 7
      // 1ff: iload 0
      // 200: aload 6
      // 202: aload 1
      // 203: iload 5
      // 205: aload 1
      // 206: arraylength
      // 207: bipush 1
      // 208: isub
      // 209: aload 3
      // 20a: ifnonnull 221
      // 20d: if_icmpge 225
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 216: athrow
      // 217: iload 5
      // 219: bipush 1
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 220: athrow
      // 221: iadd
      // 222: goto 226
      // 225: bipush 0
      // 226: aaload
      // 227: invokestatic com/finalshell/core/GA.U (ILjava/awt/Point;Ljava/awt/Point;)Ljava/awt/Point;
      // 22a: astore 8
      // 22c: aload 4
      // 22e: aload 7
      // 230: getfield java/awt/Point.x I
      // 233: i2f
      // 234: aload 7
      // 236: getfield java/awt/Point.y I
      // 239: i2f
      // 23a: invokevirtual java/awt/geom/GeneralPath.lineTo (FF)V
      // 23d: aload 4
      // 23f: aload 6
      // 241: getfield java/awt/Point.x I
      // 244: i2f
      // 245: aload 6
      // 247: getfield java/awt/Point.y I
      // 24a: i2f
      // 24b: aload 8
      // 24d: getfield java/awt/Point.x I
      // 250: i2f
      // 251: aload 8
      // 253: getfield java/awt/Point.y I
      // 256: i2f
      // 257: invokevirtual java/awt/geom/GeneralPath.quadTo (FFFF)V
      // 25a: iinc 5 1
      // 25d: aload 3
      // 25e: ifnull 066
      // 261: aload 4
      // 263: areturn
   }

   public static Point U(int param0, Point param1, Point param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: getfield java/awt/Point.y I
      // 08: aload 2
      // 09: getfield java/awt/Point.y I
      // 0c: aload 3
      // 0d: ifnonnull 83
      // 10: if_icmpne 7b
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 3
      // 1c: ifnonnull 7a
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: getfield java/awt/Point.x I
      // 29: aload 2
      // 2a: getfield java/awt/Point.x I
      // 2d: if_icmpge 5b
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 36: athrow
      // 37: new java/awt/Point
      // 3a: dup
      // 3b: aload 1
      // 3c: getfield java/awt/Point.x I
      // 3f: iload 0
      // 40: aload 2
      // 41: getfield java/awt/Point.x I
      // 44: aload 1
      // 45: getfield java/awt/Point.x I
      // 48: isub
      // 49: bipush 2
      // 4a: idiv
      // 4b: invokestatic java/lang/Math.min (II)I
      // 4e: iadd
      // 4f: aload 1
      // 50: getfield java/awt/Point.y I
      // 53: invokespecial java/awt/Point.<init> (II)V
      // 56: areturn
      // 57: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5a: athrow
      // 5b: new java/awt/Point
      // 5e: dup
      // 5f: aload 1
      // 60: getfield java/awt/Point.x I
      // 63: iload 0
      // 64: aload 1
      // 65: getfield java/awt/Point.x I
      // 68: aload 2
      // 69: getfield java/awt/Point.x I
      // 6c: isub
      // 6d: bipush 2
      // 6e: idiv
      // 6f: invokestatic java/lang/Math.min (II)I
      // 72: isub
      // 73: aload 1
      // 74: getfield java/awt/Point.y I
      // 77: invokespecial java/awt/Point.<init> (II)V
      // 7a: areturn
      // 7b: aload 1
      // 7c: getfield java/awt/Point.x I
      // 7f: aload 2
      // 80: getfield java/awt/Point.x I
      // 83: aload 3
      // 84: ifnonnull ab
      // 87: if_icmpne f2
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90: athrow
      // 91: aload 1
      // 92: aload 3
      // 93: ifnonnull f1
      // 96: goto 9d
      // 99: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: getfield java/awt/Point.y I
      // a0: aload 2
      // a1: getfield java/awt/Point.y I
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // aa: athrow
      // ab: if_icmpge d2
      // ae: new java/awt/Point
      // b1: dup
      // b2: aload 1
      // b3: getfield java/awt/Point.x I
      // b6: aload 1
      // b7: getfield java/awt/Point.y I
      // ba: iload 0
      // bb: aload 2
      // bc: getfield java/awt/Point.y I
      // bf: aload 1
      // c0: getfield java/awt/Point.y I
      // c3: isub
      // c4: bipush 2
      // c5: idiv
      // c6: invokestatic java/lang/Math.min (II)I
      // c9: iadd
      // ca: invokespecial java/awt/Point.<init> (II)V
      // cd: areturn
      // ce: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d1: athrow
      // d2: new java/awt/Point
      // d5: dup
      // d6: aload 1
      // d7: getfield java/awt/Point.x I
      // da: aload 1
      // db: getfield java/awt/Point.y I
      // de: iload 0
      // df: aload 1
      // e0: getfield java/awt/Point.y I
      // e3: aload 2
      // e4: getfield java/awt/Point.y I
      // e7: isub
      // e8: bipush 2
      // e9: idiv
      // ea: invokestatic java/lang/Math.min (II)I
      // ed: isub
      // ee: invokespecial java/awt/Point.<init> (II)V
      // f1: areturn
      // f2: aconst_null
      // f3: areturn
   }

   public static void r(Graphics2D var0, Rectangle var1) {
      o(var0, var1.x, var1.y, var1.width, var1.height);
   }

   public static void o(Graphics2D var0, int var1, int var2, int var3, int var4) {
      r(var0, var1, var2, var3, var4, GO.FD);
   }

   public static void e(Graphics2D var0, Rectangle var1, int var2) {
      r(var0, var1.x, var1.y, var1.width, var1.height, var2);
   }

   public static void r(Graphics2D var0, int var1, int var2, int var3, int var4, int var5) {
      h(var0, var1, var2, var3, var4, var5, GO.v, GO.i);
   }

   public static void F(Graphics2D var0, Rectangle var1, int var2, Color var3, Color var4) {
      h(var0, var1.x, var1.y, var1.width, var1.height, var2, var3, var4);
   }

   public static void h(Graphics2D param0, int param1, int param2, int param3, int param4, int param5, Color param6, Color param7) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: iload 5
      // 003: idiv
      // 004: bipush 1
      // 005: iadd
      // 006: istore 9
      // 008: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 00b: iload 4
      // 00d: iload 5
      // 00f: idiv
      // 010: bipush 1
      // 011: iadd
      // 012: istore 10
      // 014: bipush 0
      // 015: istore 12
      // 017: astore 8
      // 019: iload 12
      // 01b: iload 9
      // 01d: if_icmpge 106
      // 020: bipush 0
      // 021: istore 13
      // 023: iload 13
      // 025: iload 10
      // 027: if_icmpge 0fe
      // 02a: iload 12
      // 02c: iload 13
      // 02e: iadd
      // 02f: bipush 2
      // 030: irem
      // 031: aload 8
      // 033: ifnonnull 01b
      // 036: aload 8
      // 038: ifnonnull 046
      // 03b: ifne 049
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: bipush 1
      // 046: goto 04a
      // 049: bipush 0
      // 04a: istore 11
      // 04c: iload 11
      // 04e: ifeq 05a
      // 051: aload 6
      // 053: goto 05c
      // 056: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 059: athrow
      // 05a: aload 7
      // 05c: astore 14
      // 05e: aload 8
      // 060: ifnonnull 0f9
      // 063: aload 14
      // 065: ifnull 0f6
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 14
      // 072: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 075: iload 1
      // 076: iload 12
      // 078: iload 5
      // 07a: imul
      // 07b: iadd
      // 07c: iload 5
      // 07e: iadd
      // 07f: iload 1
      // 080: iload 3
      // 081: iadd
      // 082: aload 8
      // 084: ifnonnull 0a5
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: if_icmple 0a9
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: iload 3
      // 099: iload 12
      // 09b: iload 5
      // 09d: imul
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: isub
      // 0a6: goto 0ab
      // 0a9: iload 5
      // 0ab: istore 15
      // 0ad: iload 2
      // 0ae: iload 13
      // 0b0: iload 5
      // 0b2: imul
      // 0b3: iadd
      // 0b4: iload 5
      // 0b6: iadd
      // 0b7: iload 2
      // 0b8: iload 4
      // 0ba: iadd
      // 0bb: aload 8
      // 0bd: ifnonnull 0d8
      // 0c0: if_icmple 0dc
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c9: athrow
      // 0ca: iload 4
      // 0cc: iload 13
      // 0ce: iload 5
      // 0d0: imul
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d7: athrow
      // 0d8: isub
      // 0d9: goto 0de
      // 0dc: iload 5
      // 0de: istore 16
      // 0e0: aload 0
      // 0e1: iload 1
      // 0e2: iload 12
      // 0e4: iload 5
      // 0e6: imul
      // 0e7: iadd
      // 0e8: iload 2
      // 0e9: iload 13
      // 0eb: iload 5
      // 0ed: imul
      // 0ee: iadd
      // 0ef: iload 15
      // 0f1: iload 16
      // 0f3: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 0f6: iinc 13 1
      // 0f9: aload 8
      // 0fb: ifnull 023
      // 0fe: iinc 12 1
      // 101: aload 8
      // 103: ifnull 019
      // 106: return
   }

   public static Rectangle M(String var0, Graphics var1, Font var2) {
      return h(var0, (Graphics2D)var1, var2);
   }

   public static Rectangle h(String var0, Graphics2D var1, Font var2) {
      FontRenderContext var3 = var1.getFontRenderContext();
      GlyphVector var4 = var2.createGlyphVector(var3, var0);
      return var4.getVisualBounds().getBounds();
   }

   public static Shape z(Graphics2D var0, JComponent var1) {
      return x(var0, var1, GO.r, GO.FG, GO.Fx);
   }

   public static Shape x(Graphics2D var0, JComponent var1, Color var2, int var3, int var4) {
      return i(var0, var1, var2, var3, var4, true);
   }

   public static Shape i(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5) {
      return r(var0, var1, var2, var3, var4, var5, false);
   }

   public static Shape r(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5, boolean var6) {
      return m(var0, var1, var2, var3, var4, var5, var6, GO.Ff, GO.FX);
   }

   public static Shape O(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5, boolean var6, float var7) {
      return Y(var0, var1, var2, var3, var4, var5, var6, GO.Ff, GO.FX, var7);
   }

   public static Shape R(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5, boolean var6, Color var7) {
      return m(var0, var1, var2, var3, var4, var5, var6, var7, var7);
   }

   public static Shape m(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5, boolean var6, Color var7, Color var8) {
      return Y(var0, var1, var2, var3, var4, var5, var6, var7, var8, 1.0F);
   }

   public static Shape Y(Graphics2D var0, JComponent var1, Color var2, int var3, int var4, boolean var5, boolean var6, Color var7, Color var8, float var9) {
      return Z(var0, var1, var2, var3, var4, var5, var6, var7, var8, var1.getBackground(), var9);
   }

   public static Shape Z(
      Graphics2D param0,
      JComponent param1,
      Color param2,
      int param3,
      int param4,
      boolean param5,
      boolean param6,
      Color param7,
      Color param8,
      Color param9,
      float param10
   ) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 11
      // 005: fload 10
      // 007: fconst_0
      // 008: fcmpg
      // 009: aload 11
      // 00b: ifnonnull 023
      // 00e: ifle 026
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 017: athrow
      // 018: fload 10
      // 01a: fconst_1
      // 01b: fcmpl
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 022: athrow
      // 023: ifle 02c
      // 026: aconst_null
      // 027: areturn
      // 028: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 030: astore 12
      // 032: aload 0
      // 033: fload 10
      // 035: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 038: fload 10
      // 03a: fconst_1
      // 03b: fcmpg
      // 03c: aload 11
      // 03e: ifnonnull 04c
      // 041: ifge 04f
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04a: athrow
      // 04b: bipush 1
      // 04c: goto 050
      // 04f: bipush 0
      // 050: invokestatic com/finalshell/core/RV.a (Ljava/awt/Graphics2D;Ljava/lang/Float;Z)Ljava/awt/Composite;
      // 053: astore 13
      // 055: aload 1
      // 056: iload 3
      // 057: iload 4
      // 059: invokestatic com/finalshell/core/GA.X (Ljavax/swing/JComponent;II)Ljava/awt/Shape;
      // 05c: astore 14
      // 05e: aload 1
      // 05f: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 062: aload 11
      // 064: ifnonnull 08d
      // 067: ifeq 08b
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: aload 2
      // 072: ifnull 08b
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: aload 14
      // 07f: aload 2
      // 080: iload 3
      // 081: invokestatic com/finalshell/core/RV.Y (Ljava/awt/Graphics2D;Ljava/awt/Shape;Ljava/awt/Color;I)V
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08a: athrow
      // 08b: iload 5
      // 08d: ifeq 119
      // 090: aload 0
      // 091: iload 6
      // 093: aload 11
      // 095: ifnonnull 0aa
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09e: athrow
      // 09f: ifeq 0b8
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a8: athrow
      // 0a9: bipush 0
      // 0aa: iload 3
      // 0ab: bipush 0
      // 0ac: aload 1
      // 0ad: invokevirtual javax/swing/JComponent.getHeight ()I
      // 0b0: iload 3
      // 0b1: isub
      // 0b2: invokestatic com/finalshell/core/GA.m (IIII)Ljava/awt/GradientPaint;
      // 0b5: goto 0ba
      // 0b8: aload 9
      // 0ba: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 0bd: aload 11
      // 0bf: ifnonnull 0f7
      // 0c2: iload 4
      // 0c4: ifle 0fc
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: iload 3
      // 0d0: iload 3
      // 0d1: aload 1
      // 0d2: invokevirtual javax/swing/JComponent.getWidth ()I
      // 0d5: iload 3
      // 0d6: bipush 2
      // 0d7: imul
      // 0d8: isub
      // 0d9: aload 1
      // 0da: invokevirtual javax/swing/JComponent.getHeight ()I
      // 0dd: iload 3
      // 0de: bipush 2
      // 0df: imul
      // 0e0: isub
      // 0e1: iload 4
      // 0e3: bipush 2
      // 0e4: imul
      // 0e5: bipush 2
      // 0e6: iadd
      // 0e7: iload 4
      // 0e9: bipush 2
      // 0ea: imul
      // 0eb: bipush 2
      // 0ec: iadd
      // 0ed: invokevirtual java/awt/Graphics2D.fillRoundRect (IIIIII)V
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f6: athrow
      // 0f7: aload 11
      // 0f9: ifnull 119
      // 0fc: aload 0
      // 0fd: iload 3
      // 0fe: iload 3
      // 0ff: aload 1
      // 100: invokevirtual javax/swing/JComponent.getWidth ()I
      // 103: iload 3
      // 104: bipush 2
      // 105: imul
      // 106: isub
      // 107: aload 1
      // 108: invokevirtual javax/swing/JComponent.getHeight ()I
      // 10b: iload 3
      // 10c: bipush 2
      // 10d: imul
      // 10e: isub
      // 10f: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 118: athrow
      // 119: aload 7
      // 11b: ifnull 141
      // 11e: aload 0
      // 11f: aload 1
      // 120: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 123: ifeq 136
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12c: athrow
      // 12d: aload 7
      // 12f: goto 138
      // 132: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 135: athrow
      // 136: aload 8
      // 138: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 13b: aload 0
      // 13c: aload 14
      // 13e: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 141: aload 0
      // 142: aload 13
      // 144: fload 10
      // 146: fconst_1
      // 147: fcmpg
      // 148: aload 11
      // 14a: ifnonnull 158
      // 14d: ifge 15b
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 156: athrow
      // 157: bipush 1
      // 158: goto 15c
      // 15b: bipush 0
      // 15c: invokestatic com/finalshell/core/RV.E (Ljava/awt/Graphics2D;Ljava/awt/Composite;Z)V
      // 15f: aload 0
      // 160: aload 12
      // 162: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 165: aload 14
      // 167: areturn
   }

   public static GradientPaint w(Rectangle var0) {
      return m(var0.x, var0.y, var0.x, var0.y + var0.height);
   }

   public static GradientPaint m(int param0, int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: iload 0
      // 0b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e: ldc_w ";"
      // 11: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14: iload 1
      // 15: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 18: ldc_w ";"
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: iload 2
      // 1f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 22: ldc_w ";"
      // 25: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28: iload 3
      // 29: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f: astore 5
      // 31: astore 4
      // 33: getstatic com/finalshell/core/GA.i Ljava/util/Map;
      // 36: aload 5
      // 38: aload 4
      // 3a: ifnonnull 58
      // 3d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 42: ifeq 61
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: getstatic com/finalshell/core/GA.i Ljava/util/Map;
      // 4f: aload 5
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5d: checkcast java/awt/GradientPaint
      // 60: areturn
      // 61: new java/awt/GradientPaint
      // 64: dup
      // 65: iload 0
      // 66: i2f
      // 67: iload 1
      // 68: i2f
      // 69: getstatic com/finalshell/core/GO.FR Ljava/awt/Color;
      // 6c: iload 2
      // 6d: i2f
      // 6e: iload 3
      // 6f: i2f
      // 70: getstatic com/finalshell/core/GO.Q Ljava/awt/Color;
      // 73: invokespecial java/awt/GradientPaint.<init> (FFLjava/awt/Color;FFLjava/awt/Color;)V
      // 76: astore 6
      // 78: getstatic com/finalshell/core/GA.i Ljava/util/Map;
      // 7b: aload 5
      // 7d: aload 6
      // 7f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 84: pop
      // 85: aload 6
      // 87: areturn
   }

   public static Shape X(JComponent var0, int var1, int var2) {
      try {
         if (var2 > 0) {
            return new Double(
               (double)var1,
               (double)var1,
               (double)(var0.getWidth() - var1 * 2 - 1),
               (double)(var0.getHeight() - var1 * 2 - 1),
               (double)(var2 * 2),
               (double)(var2 * 2)
            );
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return new java.awt.geom.Rectangle2D.Double(
         (double)var1, (double)var1, (double)(var0.getWidth() - var1 * 2 - 1), (double)(var0.getHeight() - var1 * 2 - 1)
      );
   }

   public static void i(Graphics2D var0, JComponent var1, Shape var2, Color var3, int var4, boolean var5, boolean var6) {
      e(var0, var1, var2, var3, var4, var5, var6, (Color)Registry.lookupField(571142938009582455L).get(null), Color.LIGHT_GRAY);
   }

   public static void e(Graphics2D var0, JComponent var1, Shape var2, Color var3, int var4, boolean var5, boolean var6, Color var7, Color var8) {
      R(var0, var1, var2, var3, var4, var5, var6, var7, var8, var1.getBackground());
   }

   public static void R(
      Graphics2D param0, JComponent param1, Shape param2, Color param3, int param4, boolean param5, boolean param6, Color param7, Color param8, Color param9
   ) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 07: astore 11
      // 09: astore 10
      // 0b: aload 1
      // 0c: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 0f: aload 10
      // 11: ifnonnull 2f
      // 14: ifeq 2d
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: aload 3
      // 21: iload 4
      // 23: invokestatic com/finalshell/core/RV.Y (Ljava/awt/Graphics2D;Ljava/awt/Shape;Ljava/awt/Color;I)V
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: iload 5
      // 2f: aload 10
      // 31: ifnonnull 40
      // 34: ifeq 8c
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 6
      // 40: ifeq 7a
      // 43: aload 2
      // 44: invokeinterface java/awt/Shape.getBounds ()Ljava/awt/Rectangle; 1
      // 49: astore 12
      // 4b: aload 0
      // 4c: new java/awt/GradientPaint
      // 4f: dup
      // 50: fconst_0
      // 51: aload 12
      // 53: getfield java/awt/Rectangle.y I
      // 56: i2f
      // 57: getstatic com/finalshell/core/GO.FR Ljava/awt/Color;
      // 5a: fconst_0
      // 5b: aload 12
      // 5d: getfield java/awt/Rectangle.y I
      // 60: aload 12
      // 62: getfield java/awt/Rectangle.height I
      // 65: iadd
      // 66: i2f
      // 67: getstatic com/finalshell/core/GO.Q Ljava/awt/Color;
      // 6a: invokespecial java/awt/GradientPaint.<init> (FFLjava/awt/Color;FFLjava/awt/Color;)V
      // 6d: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 70: aload 0
      // 71: aload 2
      // 72: invokevirtual java/awt/Graphics2D.fill (Ljava/awt/Shape;)V
      // 75: aload 10
      // 77: ifnull 8c
      // 7a: aload 0
      // 7b: aload 9
      // 7d: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 80: aload 0
      // 81: aload 2
      // 82: invokevirtual java/awt/Graphics2D.fill (Ljava/awt/Shape;)V
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8b: athrow
      // 8c: aload 7
      // 8e: ifnull b3
      // 91: aload 0
      // 92: aload 1
      // 93: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 96: ifeq a9
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9f: athrow
      // a0: aload 7
      // a2: goto ab
      // a5: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a8: athrow
      // a9: aload 8
      // ab: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // ae: aload 0
      // af: aload 2
      // b0: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // b3: aload 0
      // b4: aload 11
      // b6: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // b9: return
   }

   public static boolean w(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, int var3, int var4) {
      return m(var0, var1, var2, var3, var4, null);
   }

   public static boolean m(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, int var3, int var4, Boolean var5) {
      return b(var0, var1, var2, var3, var4, var5, null);
   }

   public static boolean b(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, int var3, int var4, Boolean var5, Boolean var6) {
      Graphics2D var10000;
      JComponent var10001;
      com.finalshell.ui.model.Hq2 var10002;
      int var10003;
      int var10004;
      Boolean var10005;
      Boolean var10006;
      try {
         var10000 = var0;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
         var10005 = var5;
         var10006 = var6;
         if (var2.equals(com.finalshell.ui.model.Hq2.componentFocus)) {
            return W(var0, var1, var2, var3, var4, var5, var6, GO.x);
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      return W(var10000, var10001, var10002, var10003, var10004, var10005, var10006, GO.c);
   }

   public static boolean W(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, int var3, int var4, Boolean var5, Boolean var6, Color var7) {
      Graphics2D var10000;
      JComponent var10001;
      com.finalshell.ui.model.Hq2 var10002;
      int var10003;
      int var10004;
      Boolean var10005;
      Boolean var10006;
      Color var10007;
      try {
         var10000 = var0;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
         var10005 = var5;
         var10006 = var6;
         var10007 = var7;
         if (var2.equals(com.finalshell.ui.model.Hq2.componentFocus)) {
            return j(var0, var1, var2, var3, var4, var5, var6, var7, GO.B);
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      return j(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007, GO.FE);
   }

   public static boolean j(
      Graphics2D param0,
      JComponent param1,
      com.finalshell.ui.model.Hq2 param2,
      int param3,
      int param4,
      Boolean param5,
      Boolean param6,
      Color param7,
      Stroke param8
   ) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 9
      // 005: aload 6
      // 007: aload 9
      // 009: ifnonnull 018
      // 00c: ifnull 01e
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 015: athrow
      // 016: aload 6
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: goto 050
      // 01e: aload 1
      // 01f: invokevirtual javax/swing/JComponent.hasFocus ()Z
      // 022: aload 9
      // 024: ifnonnull 03c
      // 027: ifeq 04f
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: aload 9
      // 03e: ifnonnull 04c
      // 041: ifeq 04f
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04a: athrow
      // 04b: bipush 1
      // 04c: goto 050
      // 04f: bipush 0
      // 050: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 053: astore 6
      // 055: aload 6
      // 057: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05a: aload 9
      // 05c: ifnonnull 0bb
      // 05f: ifeq 0b4
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: aload 2
      // 06a: getstatic com/finalshell/ui/model/Hq2.componentFocus Lcom/finalshell/ui/model/Hq2;
      // 06d: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 070: aload 9
      // 072: ifnonnull 0bb
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07b: athrow
      // 07c: ifeq 0b4
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 085: athrow
      // 086: aload 0
      // 087: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 08a: astore 10
      // 08c: aload 0
      // 08d: aload 8
      // 08f: invokestatic com/finalshell/core/RV.M (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)Ljava/awt/Stroke;
      // 092: astore 11
      // 094: aload 0
      // 095: aload 7
      // 097: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 09a: aload 0
      // 09b: aload 1
      // 09c: aload 2
      // 09d: iload 3
      // 09e: iload 4
      // 0a0: invokestatic com/finalshell/core/GA.n (Ljavax/swing/JComponent;Lcom/finalshell/ui/model/Hq2;II)Ljava/awt/Shape;
      // 0a3: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 0a6: aload 0
      // 0a7: aload 11
      // 0a9: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)V
      // 0ac: aload 0
      // 0ad: aload 10
      // 0af: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 0b2: bipush 1
      // 0b3: ireturn
      // 0b4: aload 2
      // 0b5: getstatic com/finalshell/ui/model/Hq2.fieldFocus Lcom/finalshell/ui/model/Hq2;
      // 0b8: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 0bb: aload 9
      // 0bd: ifnonnull 147
      // 0c0: ifeq 146
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c9: athrow
      // 0ca: aload 6
      // 0cc: aload 9
      // 0ce: ifnonnull 11c
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d7: athrow
      // 0d8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0db: ifne 111
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e4: athrow
      // 0e5: aload 5
      // 0e7: aload 9
      // 0e9: ifnonnull 0ff
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f2: athrow
      // 0f3: ifnull 146
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fc: athrow
      // 0fd: aload 5
      // 0ff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 102: aload 9
      // 104: ifnonnull 147
      // 107: ifeq 146
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 110: athrow
      // 111: aload 0
      // 112: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: astore 10
      // 11e: aload 0
      // 11f: aload 8
      // 121: invokestatic com/finalshell/core/RV.M (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)Ljava/awt/Stroke;
      // 124: astore 11
      // 126: aload 0
      // 127: aload 7
      // 129: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 12c: aload 0
      // 12d: aload 1
      // 12e: aload 2
      // 12f: iload 3
      // 130: iload 4
      // 132: invokestatic com/finalshell/core/GA.n (Ljavax/swing/JComponent;Lcom/finalshell/ui/model/Hq2;II)Ljava/awt/Shape;
      // 135: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 138: aload 0
      // 139: aload 11
      // 13b: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)V
      // 13e: aload 0
      // 13f: aload 10
      // 141: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 144: bipush 1
      // 145: ireturn
      // 146: bipush 0
      // 147: ireturn
   }

   public static Shape n(JComponent param0, com.finalshell.ui.model.Hq2 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: getstatic com/finalshell/ui/model/Hq2.componentFocus Lcom/finalshell/ui/model/Hq2;
      // 09: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 0c: aload 4
      // 0e: ifnonnull 1c
      // 11: ifeq 1f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 2
      // 1c: goto 20
      // 1f: bipush 0
      // 20: istore 5
      // 22: aload 1
      // 23: getstatic com/finalshell/ui/model/Hq2.componentFocus Lcom/finalshell/ui/model/Hq2;
      // 26: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 29: aload 4
      // 2b: ifnonnull 46
      // 2e: ifeq 49
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: bipush 0
      // 39: iload 3
      // 3a: bipush 2
      // 3b: isub
      // 3c: invokestatic java/lang/Math.max (II)I
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: goto 4a
      // 49: iload 3
      // 4a: istore 3
      // 4b: iload 3
      // 4c: ifle 8d
      // 4f: new java/awt/geom/RoundRectangle2D$Double
      // 52: dup
      // 53: iload 2
      // 54: iload 5
      // 56: iadd
      // 57: i2d
      // 58: iload 2
      // 59: iload 5
      // 5b: iadd
      // 5c: i2d
      // 5d: aload 0
      // 5e: invokevirtual javax/swing/JComponent.getWidth ()I
      // 61: iload 2
      // 62: bipush 2
      // 63: imul
      // 64: isub
      // 65: iload 5
      // 67: bipush 2
      // 68: imul
      // 69: isub
      // 6a: bipush 1
      // 6b: isub
      // 6c: i2d
      // 6d: aload 0
      // 6e: invokevirtual javax/swing/JComponent.getHeight ()I
      // 71: iload 2
      // 72: bipush 2
      // 73: imul
      // 74: isub
      // 75: iload 5
      // 77: bipush 2
      // 78: imul
      // 79: isub
      // 7a: bipush 1
      // 7b: isub
      // 7c: i2d
      // 7d: iload 3
      // 7e: bipush 2
      // 7f: imul
      // 80: i2d
      // 81: iload 3
      // 82: bipush 2
      // 83: imul
      // 84: i2d
      // 85: invokespecial java/awt/geom/RoundRectangle2D$Double.<init> (DDDDDD)V
      // 88: areturn
      // 89: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8c: athrow
      // 8d: new java/awt/geom/Rectangle2D$Double
      // 90: dup
      // 91: iload 2
      // 92: iload 5
      // 94: iadd
      // 95: i2d
      // 96: iload 2
      // 97: iload 5
      // 99: iadd
      // 9a: i2d
      // 9b: aload 0
      // 9c: invokevirtual javax/swing/JComponent.getWidth ()I
      // 9f: iload 2
      // a0: bipush 2
      // a1: imul
      // a2: isub
      // a3: iload 5
      // a5: bipush 2
      // a6: imul
      // a7: isub
      // a8: bipush 1
      // a9: isub
      // aa: i2d
      // ab: aload 0
      // ac: invokevirtual javax/swing/JComponent.getHeight ()I
      // af: iload 2
      // b0: bipush 2
      // b1: imul
      // b2: isub
      // b3: iload 5
      // b5: bipush 2
      // b6: imul
      // b7: isub
      // b8: bipush 1
      // b9: isub
      // ba: i2d
      // bb: invokespecial java/awt/geom/Rectangle2D$Double.<init> (DDDD)V
      // be: areturn
   }

   public static void i(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, Shape var3) {
      U(var0, var1, var2, var3, null);
   }

   public static void U(Graphics2D var0, JComponent var1, com.finalshell.ui.model.Hq2 var2, Shape var3, Boolean var4) {
      l(var0, var1, var2, var3, var4, null);
   }

   public static void l(Graphics2D param0, JComponent param1, com.finalshell.ui.model.Hq2 param2, Shape param3, Boolean param4, Boolean param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 6
      // 005: aload 5
      // 007: aload 6
      // 009: ifnonnull 018
      // 00c: ifnull 01e
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 015: athrow
      // 016: aload 5
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: goto 050
      // 01e: aload 1
      // 01f: invokevirtual javax/swing/JComponent.hasFocus ()Z
      // 022: aload 6
      // 024: ifnonnull 03c
      // 027: ifeq 04f
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual javax/swing/JComponent.isEnabled ()Z
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: aload 6
      // 03e: ifnonnull 04c
      // 041: ifeq 04f
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04a: athrow
      // 04b: bipush 1
      // 04c: goto 050
      // 04f: bipush 0
      // 050: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 053: astore 5
      // 055: aload 5
      // 057: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05a: aload 6
      // 05c: ifnonnull 0c0
      // 05f: ifeq 0b2
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: aload 2
      // 06a: getstatic com/finalshell/ui/model/Hq2.componentFocus Lcom/finalshell/ui/model/Hq2;
      // 06d: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 070: aload 6
      // 072: ifnonnull 0c0
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07b: athrow
      // 07c: ifeq 0b2
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 085: athrow
      // 086: aload 0
      // 087: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 08a: astore 7
      // 08c: aload 0
      // 08d: getstatic com/finalshell/core/GO.B Ljava/awt/Stroke;
      // 090: invokestatic com/finalshell/core/RV.M (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)Ljava/awt/Stroke;
      // 093: astore 8
      // 095: aload 0
      // 096: getstatic com/finalshell/core/GO.x Ljava/awt/Color;
      // 099: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 09c: aload 0
      // 09d: aload 3
      // 09e: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 0a1: aload 0
      // 0a2: aload 8
      // 0a4: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)V
      // 0a7: aload 0
      // 0a8: aload 7
      // 0aa: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 0ad: aload 6
      // 0af: ifnull 156
      // 0b2: aload 2
      // 0b3: getstatic com/finalshell/ui/model/Hq2.fieldFocus Lcom/finalshell/ui/model/Hq2;
      // 0b6: invokevirtual com/finalshell/ui/model/Hq2.equals (Ljava/lang/Object;)Z
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bf: athrow
      // 0c0: aload 6
      // 0c2: ifnonnull 0e7
      // 0c5: ifeq 156
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 5
      // 0d1: aload 6
      // 0d3: ifnonnull 121
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0dc: athrow
      // 0dd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e6: athrow
      // 0e7: ifne 116
      // 0ea: aload 4
      // 0ec: aload 6
      // 0ee: ifnonnull 104
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f7: athrow
      // 0f8: ifnull 156
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: aload 4
      // 104: aload 6
      // 106: ifnonnull 121
      // 109: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10c: ifeq 156
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 115: athrow
      // 116: aload 0
      // 117: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 120: athrow
      // 121: astore 7
      // 123: aload 0
      // 124: getstatic com/finalshell/core/GO.FE Ljava/awt/Stroke;
      // 127: invokestatic com/finalshell/core/RV.M (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)Ljava/awt/Stroke;
      // 12a: astore 8
      // 12c: aload 0
      // 12d: aload 5
      // 12f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 132: ifeq 13f
      // 135: getstatic com/finalshell/core/GO.c Ljava/awt/Color;
      // 138: goto 142
      // 13b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13e: athrow
      // 13f: getstatic com/finalshell/core/GO.n Ljava/awt/Color;
      // 142: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 145: aload 0
      // 146: aload 3
      // 147: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 14a: aload 0
      // 14b: aload 8
      // 14d: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)V
      // 150: aload 0
      // 151: aload 7
      // 153: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 156: return
   }

   public static void H(Graphics2D var0, Color var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
      t(var0, var1, new Rectangle(var2, var3, var4, var5), var6, var7, var8);
   }

   public static void S(Graphics2D var0, Color var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      P(var0, var1, new Rectangle(var2, var3, var4, var5), var6, var7, var8, var9);
   }

   public static void t(Graphics2D var0, Color var1, Rectangle var2, boolean var3, boolean var4, boolean var5) {
      P(var0, var1, var2, var3, var4, var5, true);
   }

   public static void P(Graphics2D param0, Color param1, Rectangle param2, boolean param3, boolean param4, boolean param5, boolean param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: aload 2
      // 004: invokestatic com/finalshell/core/Rv4.q (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
      // 007: astore 2
      // 008: aload 0
      // 009: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;)Ljava/lang/Object;
      // 00c: astore 8
      // 00e: astore 7
      // 010: new java/awt/geom/Area
      // 013: dup
      // 014: invokespecial java/awt/geom/Area.<init> ()V
      // 017: astore 9
      // 019: iload 4
      // 01b: aload 7
      // 01d: ifnonnull 100
      // 020: ifeq 0ff
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 029: athrow
      // 02a: iload 3
      // 02b: aload 7
      // 02d: ifnonnull 0b1
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 036: athrow
      // 037: ifeq 0af
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 040: athrow
      // 041: aload 9
      // 043: new java/awt/geom/Area
      // 046: dup
      // 047: new java/awt/geom/Ellipse2D$Double
      // 04a: dup
      // 04b: aload 2
      // 04c: getfield java/awt/Rectangle.x I
      // 04f: getstatic com/finalshell/core/GA.a I
      // 052: isub
      // 053: i2d
      // 054: aload 2
      // 055: getfield java/awt/Rectangle.y I
      // 058: getstatic com/finalshell/core/GA.a I
      // 05b: isub
      // 05c: i2d
      // 05d: getstatic com/finalshell/core/GA.a I
      // 060: bipush 2
      // 061: imul
      // 062: i2d
      // 063: getstatic com/finalshell/core/GA.a I
      // 066: bipush 2
      // 067: imul
      // 068: i2d
      // 069: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 06c: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 06f: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 072: aload 9
      // 074: new java/awt/geom/Area
      // 077: dup
      // 078: new java/awt/geom/Ellipse2D$Double
      // 07b: dup
      // 07c: aload 2
      // 07d: getfield java/awt/Rectangle.x I
      // 080: aload 2
      // 081: getfield java/awt/Rectangle.width I
      // 084: iadd
      // 085: getstatic com/finalshell/core/GA.a I
      // 088: isub
      // 089: i2d
      // 08a: aload 2
      // 08b: getfield java/awt/Rectangle.y I
      // 08e: getstatic com/finalshell/core/GA.a I
      // 091: isub
      // 092: i2d
      // 093: getstatic com/finalshell/core/GA.a I
      // 096: bipush 2
      // 097: imul
      // 098: i2d
      // 099: getstatic com/finalshell/core/GA.a I
      // 09c: bipush 2
      // 09d: imul
      // 09e: i2d
      // 09f: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 0a2: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 0a5: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ae: athrow
      // 0af: iload 6
      // 0b1: aload 7
      // 0b3: ifnonnull 100
      // 0b6: ifeq 0ff
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bf: athrow
      // 0c0: aload 9
      // 0c2: new java/awt/geom/Area
      // 0c5: dup
      // 0c6: new java/awt/geom/Ellipse2D$Double
      // 0c9: dup
      // 0ca: aload 2
      // 0cb: getfield java/awt/Rectangle.x I
      // 0ce: aload 2
      // 0cf: getfield java/awt/Rectangle.width I
      // 0d2: bipush 2
      // 0d3: idiv
      // 0d4: iadd
      // 0d5: getstatic com/finalshell/core/GA.a I
      // 0d8: isub
      // 0d9: i2d
      // 0da: aload 2
      // 0db: getfield java/awt/Rectangle.y I
      // 0de: getstatic com/finalshell/core/GA.a I
      // 0e1: isub
      // 0e2: i2d
      // 0e3: getstatic com/finalshell/core/GA.a I
      // 0e6: bipush 2
      // 0e7: imul
      // 0e8: i2d
      // 0e9: getstatic com/finalshell/core/GA.a I
      // 0ec: bipush 2
      // 0ed: imul
      // 0ee: i2d
      // 0ef: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 0f2: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 0f5: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fe: athrow
      // 0ff: iload 3
      // 100: aload 7
      // 102: ifnonnull 1a5
      // 105: ifeq 1a3
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: iload 6
      // 111: aload 7
      // 113: ifnonnull 1a5
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11c: athrow
      // 11d: ifeq 1a3
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 126: athrow
      // 127: aload 9
      // 129: new java/awt/geom/Area
      // 12c: dup
      // 12d: new java/awt/geom/Ellipse2D$Double
      // 130: dup
      // 131: aload 2
      // 132: getfield java/awt/Rectangle.x I
      // 135: getstatic com/finalshell/core/GA.a I
      // 138: isub
      // 139: i2d
      // 13a: aload 2
      // 13b: getfield java/awt/Rectangle.y I
      // 13e: aload 2
      // 13f: getfield java/awt/Rectangle.height I
      // 142: bipush 2
      // 143: idiv
      // 144: iadd
      // 145: getstatic com/finalshell/core/GA.a I
      // 148: isub
      // 149: i2d
      // 14a: getstatic com/finalshell/core/GA.a I
      // 14d: bipush 2
      // 14e: imul
      // 14f: i2d
      // 150: getstatic com/finalshell/core/GA.a I
      // 153: bipush 2
      // 154: imul
      // 155: i2d
      // 156: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 159: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 15c: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 15f: aload 9
      // 161: new java/awt/geom/Area
      // 164: dup
      // 165: new java/awt/geom/Ellipse2D$Double
      // 168: dup
      // 169: aload 2
      // 16a: getfield java/awt/Rectangle.x I
      // 16d: aload 2
      // 16e: getfield java/awt/Rectangle.width I
      // 171: iadd
      // 172: getstatic com/finalshell/core/GA.a I
      // 175: isub
      // 176: i2d
      // 177: aload 2
      // 178: getfield java/awt/Rectangle.y I
      // 17b: aload 2
      // 17c: getfield java/awt/Rectangle.height I
      // 17f: bipush 2
      // 180: idiv
      // 181: iadd
      // 182: getstatic com/finalshell/core/GA.a I
      // 185: isub
      // 186: i2d
      // 187: getstatic com/finalshell/core/GA.a I
      // 18a: bipush 2
      // 18b: imul
      // 18c: i2d
      // 18d: getstatic com/finalshell/core/GA.a I
      // 190: bipush 2
      // 191: imul
      // 192: i2d
      // 193: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 196: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 199: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a2: athrow
      // 1a3: iload 4
      // 1a5: aload 7
      // 1a7: ifnonnull 29a
      // 1aa: ifeq 298
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b3: athrow
      // 1b4: iload 3
      // 1b5: aload 7
      // 1b7: ifnonnull 245
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c0: athrow
      // 1c1: ifeq 243
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ca: athrow
      // 1cb: aload 9
      // 1cd: new java/awt/geom/Area
      // 1d0: dup
      // 1d1: new java/awt/geom/Ellipse2D$Double
      // 1d4: dup
      // 1d5: aload 2
      // 1d6: getfield java/awt/Rectangle.x I
      // 1d9: getstatic com/finalshell/core/GA.a I
      // 1dc: isub
      // 1dd: i2d
      // 1de: aload 2
      // 1df: getfield java/awt/Rectangle.y I
      // 1e2: aload 2
      // 1e3: getfield java/awt/Rectangle.height I
      // 1e6: iadd
      // 1e7: getstatic com/finalshell/core/GA.a I
      // 1ea: isub
      // 1eb: i2d
      // 1ec: getstatic com/finalshell/core/GA.a I
      // 1ef: bipush 2
      // 1f0: imul
      // 1f1: i2d
      // 1f2: getstatic com/finalshell/core/GA.a I
      // 1f5: bipush 2
      // 1f6: imul
      // 1f7: i2d
      // 1f8: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 1fb: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 1fe: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 201: aload 9
      // 203: new java/awt/geom/Area
      // 206: dup
      // 207: new java/awt/geom/Ellipse2D$Double
      // 20a: dup
      // 20b: aload 2
      // 20c: getfield java/awt/Rectangle.x I
      // 20f: aload 2
      // 210: getfield java/awt/Rectangle.width I
      // 213: iadd
      // 214: getstatic com/finalshell/core/GA.a I
      // 217: isub
      // 218: i2d
      // 219: aload 2
      // 21a: getfield java/awt/Rectangle.y I
      // 21d: aload 2
      // 21e: getfield java/awt/Rectangle.height I
      // 221: iadd
      // 222: getstatic com/finalshell/core/GA.a I
      // 225: isub
      // 226: i2d
      // 227: getstatic com/finalshell/core/GA.a I
      // 22a: bipush 2
      // 22b: imul
      // 22c: i2d
      // 22d: getstatic com/finalshell/core/GA.a I
      // 230: bipush 2
      // 231: imul
      // 232: i2d
      // 233: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 236: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 239: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 242: athrow
      // 243: iload 6
      // 245: aload 7
      // 247: ifnonnull 29a
      // 24a: ifeq 298
      // 24d: goto 254
      // 250: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 253: athrow
      // 254: aload 9
      // 256: new java/awt/geom/Area
      // 259: dup
      // 25a: new java/awt/geom/Ellipse2D$Double
      // 25d: dup
      // 25e: aload 2
      // 25f: getfield java/awt/Rectangle.x I
      // 262: aload 2
      // 263: getfield java/awt/Rectangle.width I
      // 266: bipush 2
      // 267: idiv
      // 268: iadd
      // 269: getstatic com/finalshell/core/GA.a I
      // 26c: isub
      // 26d: i2d
      // 26e: aload 2
      // 26f: getfield java/awt/Rectangle.y I
      // 272: aload 2
      // 273: getfield java/awt/Rectangle.height I
      // 276: iadd
      // 277: getstatic com/finalshell/core/GA.a I
      // 27a: isub
      // 27b: i2d
      // 27c: getstatic com/finalshell/core/GA.a I
      // 27f: bipush 2
      // 280: imul
      // 281: i2d
      // 282: getstatic com/finalshell/core/GA.a I
      // 285: bipush 2
      // 286: imul
      // 287: i2d
      // 288: invokespecial java/awt/geom/Ellipse2D$Double.<init> (DDDD)V
      // 28b: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 28e: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 291: goto 298
      // 294: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 297: athrow
      // 298: iload 5
      // 29a: ifeq 323
      // 29d: new java/awt/geom/Area
      // 2a0: dup
      // 2a1: new java/awt/geom/RoundRectangle2D$Double
      // 2a4: dup
      // 2a5: aload 2
      // 2a6: getfield java/awt/Rectangle.x I
      // 2a9: getstatic com/finalshell/core/GA.u I
      // 2ac: isub
      // 2ad: i2d
      // 2ae: aload 2
      // 2af: getfield java/awt/Rectangle.y I
      // 2b2: getstatic com/finalshell/core/GA.u I
      // 2b5: isub
      // 2b6: i2d
      // 2b7: aload 2
      // 2b8: getfield java/awt/Rectangle.width I
      // 2bb: getstatic com/finalshell/core/GA.u I
      // 2be: bipush 2
      // 2bf: imul
      // 2c0: iadd
      // 2c1: i2d
      // 2c2: aload 2
      // 2c3: getfield java/awt/Rectangle.height I
      // 2c6: getstatic com/finalshell/core/GA.u I
      // 2c9: bipush 2
      // 2ca: imul
      // 2cb: iadd
      // 2cc: i2d
      // 2cd: ldc2_w 5.0
      // 2d0: ldc2_w 5.0
      // 2d3: invokespecial java/awt/geom/RoundRectangle2D$Double.<init> (DDDDDD)V
      // 2d6: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 2d9: astore 10
      // 2db: aload 10
      // 2dd: new java/awt/geom/Area
      // 2e0: dup
      // 2e1: new java/awt/geom/RoundRectangle2D$Double
      // 2e4: dup
      // 2e5: aload 2
      // 2e6: getfield java/awt/Rectangle.x I
      // 2e9: getstatic com/finalshell/core/GA.u I
      // 2ec: iadd
      // 2ed: i2d
      // 2ee: aload 2
      // 2ef: getfield java/awt/Rectangle.y I
      // 2f2: getstatic com/finalshell/core/GA.u I
      // 2f5: iadd
      // 2f6: i2d
      // 2f7: aload 2
      // 2f8: getfield java/awt/Rectangle.width I
      // 2fb: getstatic com/finalshell/core/GA.u I
      // 2fe: bipush 2
      // 2ff: imul
      // 300: isub
      // 301: i2d
      // 302: aload 2
      // 303: getfield java/awt/Rectangle.height I
      // 306: getstatic com/finalshell/core/GA.u I
      // 309: bipush 2
      // 30a: imul
      // 30b: isub
      // 30c: i2d
      // 30d: ldc2_w 3.0
      // 310: ldc2_w 3.0
      // 313: invokespecial java/awt/geom/RoundRectangle2D$Double.<init> (DDDDDD)V
      // 316: invokespecial java/awt/geom/Area.<init> (Ljava/awt/Shape;)V
      // 319: invokevirtual java/awt/geom/Area.subtract (Ljava/awt/geom/Area;)V
      // 31c: aload 9
      // 31e: aload 10
      // 320: invokevirtual java/awt/geom/Area.add (Ljava/awt/geom/Area;)V
      // 323: aload 0
      // 324: aload 9
      // 326: getstatic java/awt/Color.GRAY Ljava/awt/Color;
      // 329: getstatic com/finalshell/core/GA.U I
      // 32c: invokestatic com/finalshell/core/RV.Y (Ljava/awt/Graphics2D;Ljava/awt/Shape;Ljava/awt/Color;I)V
      // 32f: aload 0
      // 330: getstatic java/awt/Color.GRAY Ljava/awt/Color;
      // 333: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 336: aload 0
      // 337: aload 9
      // 339: invokevirtual java/awt/Graphics2D.draw (Ljava/awt/Shape;)V
      // 33c: aload 0
      // 33d: aload 1
      // 33e: invokevirtual java/awt/Graphics2D.setPaint (Ljava/awt/Paint;)V
      // 341: aload 0
      // 342: aload 9
      // 344: invokevirtual java/awt/Graphics2D.fill (Ljava/awt/Shape;)V
      // 347: aload 0
      // 348: aload 8
      // 34a: invokestatic com/finalshell/core/RV.X (Ljava/awt/Graphics2D;Ljava/lang/Object;)V
      // 34d: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void S(Graphics2D var0, Color var1, Rectangle var2, int var3) {
      int var29;
      String var4;
      java.awt.geom.Ellipse2D.Double var6;
      String var10000;
      var10000 = FV_2.D();
      var2 = Rv4.q(var2);
      Object var5 = RV.X(var0);
      var4 = var10000;

      label221: {
         int var10001;
         label243: {
            label222: {
               try {
                  var29 = var3;
                  var10001 = a(14906, 1280795380835452763L);
                  if (var4 != null) {
                     break label243;
                  }

                  if (var3 != var10001) {
                     break label222;
                  }
               } catch (RuntimeException var27) {
                  throw a(var27);
               }

               var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x - o), (double)(var2.y - o), (double)(o * 2), (double)(o * 2));

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var26) {
                  boolean var37 = false;
                  throw a(var26);
               }
            }

            try {
               var29 = var3;
               var10001 = 1;
            } catch (RuntimeException var25) {
               boolean var38 = false;
               throw a(var25);
            }
         }

         label244: {
            label223: {
               try {
                  if (var4 != null) {
                     break label244;
                  }

                  if (var29 != var10001) {
                     break label223;
                  }
               } catch (RuntimeException var24) {
                  throw a(var24);
               }

               var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x + var2.width / 2 - o), (double)(var2.y - o), (double)(o * 2), (double)(o * 2));

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var23) {
                  boolean var39 = false;
                  throw a(var23);
               }
            }

            try {
               var29 = var3;
               var10001 = 2;
            } catch (RuntimeException var22) {
               boolean var40 = false;
               throw a(var22);
            }
         }

         label245: {
            label224: {
               try {
                  if (var4 != null) {
                     break label245;
                  }

                  if (var29 != var10001) {
                     break label224;
                  }
               } catch (RuntimeException var21) {
                  throw a(var21);
               }

               var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x + var2.width - o), (double)(var2.y - o), (double)(o * 2), (double)(o * 2));

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var20) {
                  boolean var41 = false;
                  throw a(var20);
               }
            }

            try {
               var29 = var3;
               var10001 = a(29499, 4558395549346877016L);
            } catch (RuntimeException var19) {
               boolean var42 = false;
               throw a(var19);
            }
         }

         label246: {
            label225: {
               try {
                  if (var4 != null) {
                     break label246;
                  }

                  if (var29 != var10001) {
                     break label225;
                  }
               } catch (RuntimeException var18) {
                  throw a(var18);
               }

               var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x - o), (double)(var2.y + var2.height / 2 - o), (double)(o * 2), (double)(o * 2));

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var17) {
                  boolean var43 = false;
                  throw a(var17);
               }
            }

            try {
               var29 = var3;
               var10001 = 3;
            } catch (RuntimeException var16) {
               boolean var44 = false;
               throw a(var16);
            }
         }

         label247: {
            label226: {
               try {
                  if (var4 != null) {
                     break label247;
                  }

                  if (var29 != var10001) {
                     break label226;
                  }
               } catch (RuntimeException var15) {
                  throw a(var15);
               }

               var6 = new java.awt.geom.Ellipse2D.Double(
                  (double)(var2.x + var2.width - o), (double)(var2.y + var2.height / 2 - o), (double)(o * 2), (double)(o * 2)
               );

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var14) {
                  boolean var45 = false;
                  throw a(var14);
               }
            }

            try {
               var29 = var3;
               var10001 = a(2919, 3558482257251874307L);
            } catch (RuntimeException var13) {
               boolean var46 = false;
               throw a(var13);
            }
         }

         label248: {
            label227: {
               try {
                  if (var4 != null) {
                     break label248;
                  }

                  if (var29 != var10001) {
                     break label227;
                  }
               } catch (RuntimeException var12) {
                  throw a(var12);
               }

               var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x - o), (double)(var2.y + var2.height - o), (double)(o * 2), (double)(o * 2));

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var11) {
                  boolean var47 = false;
                  throw a(var11);
               }
            }

            try {
               var29 = var3;
               var10001 = 5;
            } catch (RuntimeException var10) {
               boolean var48 = false;
               throw a(var10);
            }
         }

         label249: {
            label228: {
               try {
                  if (var4 != null) {
                     break label249;
                  }

                  if (var29 != var10001) {
                     break label228;
                  }
               } catch (RuntimeException var9) {
                  throw a(var9);
               }

               var6 = new java.awt.geom.Ellipse2D.Double(
                  (double)(var2.x + var2.width / 2 - o), (double)(var2.y + var2.height - o), (double)(o * 2), (double)(o * 2)
               );

               try {
                  if (var4 == null) {
                     break label221;
                  }
               } catch (RuntimeException var8) {
                  boolean var49 = false;
                  throw a(var8);
               }
            }

            try {
               var29 = var3;
               var10001 = 4;
            } catch (RuntimeException var7) {
               boolean var50 = false;
               throw a(var7);
            }
         }

         if (var29 == var10001) {
            var6 = new java.awt.geom.Ellipse2D.Double((double)(var2.x + var2.width - o), (double)(var2.y + var2.height - o), (double)(o * 2), (double)(o * 2));
            if (var4 == null) {
               break label221;
            }
         }

         var6 = null;
      }

      var0.setPaint(var1);
      var0.fill(var6);
      RV.X(var0, var5);
   }

   public static void z(Graphics2D var0, Rectangle var1, boolean var2, boolean var3, boolean var4) {
      C(var0, var1, var2, var3, var4, true);
   }

   public static void C(Graphics2D param0, Rectangle param1, boolean param2, boolean param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokestatic com/finalshell/core/Rv4.q (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
      // 004: astore 1
      // 005: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 008: aload 1
      // 009: invokestatic com/finalshell/core/GA.Y (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
      // 00c: astore 7
      // 00e: astore 6
      // 010: iload 4
      // 012: aload 6
      // 014: ifnonnull 178
      // 017: ifeq 170
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 020: athrow
      // 021: iload 2
      // 022: aload 6
      // 024: ifnonnull 06c
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02d: athrow
      // 02e: ifne 064
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: iload 3
      // 039: aload 6
      // 03b: ifnonnull 06c
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: ifne 064
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04e: athrow
      // 04f: getstatic com/finalshell/core/GA.g Lcom/finalshell/core/PF3;
      // 052: aload 0
      // 053: aload 7
      // 055: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 058: aload 6
      // 05a: ifnull 277
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 063: athrow
      // 064: iload 2
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06b: athrow
      // 06c: aload 6
      // 06e: ifnonnull 0c7
      // 071: ifeq 0bf
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07a: athrow
      // 07b: iload 3
      // 07c: aload 6
      // 07e: ifnonnull 0c7
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 087: athrow
      // 088: ifne 0bf
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 091: athrow
      // 092: iload 5
      // 094: aload 6
      // 096: ifnonnull 0c7
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09f: athrow
      // 0a0: ifeq 0bf
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a9: athrow
      // 0aa: getstatic com/finalshell/core/GA.M Lcom/finalshell/core/PF3;
      // 0ad: aload 0
      // 0ae: aload 7
      // 0b0: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 0b3: aload 6
      // 0b5: ifnull 277
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0be: athrow
      // 0bf: iload 2
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c6: athrow
      // 0c7: aload 6
      // 0c9: ifnonnull 122
      // 0cc: ifne 11a
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d5: athrow
      // 0d6: iload 3
      // 0d7: aload 6
      // 0d9: ifnonnull 122
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e2: athrow
      // 0e3: ifeq 11a
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: iload 5
      // 0ef: aload 6
      // 0f1: ifnonnull 122
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fa: athrow
      // 0fb: ifeq 11a
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 104: athrow
      // 105: getstatic com/finalshell/core/GA.l Lcom/finalshell/core/PF3;
      // 108: aload 0
      // 109: aload 7
      // 10b: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 10e: aload 6
      // 110: ifnull 277
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 119: athrow
      // 11a: iload 2
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 121: athrow
      // 122: aload 6
      // 124: ifnonnull 132
      // 127: ifeq 277
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 130: athrow
      // 131: iload 3
      // 132: aload 6
      // 134: ifnonnull 143
      // 137: ifeq 277
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 140: athrow
      // 141: iload 5
      // 143: ifeq 15b
      // 146: getstatic com/finalshell/core/GA.z Lcom/finalshell/core/PF3;
      // 149: aload 0
      // 14a: aload 7
      // 14c: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 14f: aload 6
      // 151: ifnull 277
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15a: athrow
      // 15b: getstatic com/finalshell/core/GA.V Lcom/finalshell/core/PF3;
      // 15e: aload 0
      // 15f: aload 7
      // 161: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 164: aload 6
      // 166: ifnull 277
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16f: athrow
      // 170: iload 2
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 177: athrow
      // 178: aload 6
      // 17a: ifnonnull 1d3
      // 17d: ifeq 1cb
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 186: athrow
      // 187: iload 3
      // 188: aload 6
      // 18a: ifnonnull 1d3
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 193: athrow
      // 194: ifne 1cb
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19d: athrow
      // 19e: iload 5
      // 1a0: aload 6
      // 1a2: ifnonnull 1d3
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ab: athrow
      // 1ac: ifeq 1cb
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b5: athrow
      // 1b6: getstatic com/finalshell/core/GA.j Lcom/finalshell/core/PF3;
      // 1b9: aload 0
      // 1ba: aload 7
      // 1bc: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 1bf: aload 6
      // 1c1: ifnull 277
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ca: athrow
      // 1cb: iload 2
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d2: athrow
      // 1d3: aload 6
      // 1d5: ifnonnull 22e
      // 1d8: ifne 226
      // 1db: goto 1e2
      // 1de: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: iload 3
      // 1e3: aload 6
      // 1e5: ifnonnull 22e
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ee: athrow
      // 1ef: ifeq 226
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f8: athrow
      // 1f9: iload 5
      // 1fb: aload 6
      // 1fd: ifnonnull 22e
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 206: athrow
      // 207: ifeq 226
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 210: athrow
      // 211: getstatic com/finalshell/core/GA.F Lcom/finalshell/core/PF3;
      // 214: aload 0
      // 215: aload 7
      // 217: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 21a: aload 6
      // 21c: ifnull 277
      // 21f: goto 226
      // 222: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 225: athrow
      // 226: iload 2
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22d: athrow
      // 22e: aload 6
      // 230: ifnonnull 23e
      // 233: ifeq 277
      // 236: goto 23d
      // 239: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23c: athrow
      // 23d: iload 3
      // 23e: aload 6
      // 240: ifnonnull 24f
      // 243: ifeq 277
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24c: athrow
      // 24d: iload 5
      // 24f: ifeq 267
      // 252: getstatic com/finalshell/core/GA.B Lcom/finalshell/core/PF3;
      // 255: aload 0
      // 256: aload 7
      // 258: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 25b: aload 6
      // 25d: ifnull 277
      // 260: goto 267
      // 263: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 266: athrow
      // 267: getstatic com/finalshell/core/GA.C Lcom/finalshell/core/PF3;
      // 26a: aload 0
      // 26b: aload 7
      // 26d: invokevirtual com/finalshell/core/PF3.n (Ljava/awt/Graphics2D;Ljava/awt/Rectangle;)V
      // 270: goto 277
      // 273: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 276: athrow
      // 277: return
   }

   public static void f(Graphics2D var0, Rectangle var1, int var2) {
      var1 = Rv4.q(var1);
      Rectangle var3 = Y(var1);
      r(var2).n(var0, var3);
   }

   public static void k(Graphics2D var0, Point var1) {
      j(var0, var1.x, var1.y);
   }

   public static void j(Graphics2D var0, int var1, int var2) {
      var0.drawImage(x.getImage(), var1 - x.getIconWidth() / 2, var2 - x.getIconHeight() / 2, null);
   }

   public static Rectangle Y(Rectangle var0) {
      return new Rectangle(var0.x - a - U, var0.y - a - U, var0.width + a * 2 + U * 2, var0.height + a * 2 + U * 2);
   }

   public static PF3 r(int param0) {
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
      // 04: getstatic com/finalshell/core/GA.q Ljava/util/Map;
      // 07: iload 0
      // 08: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b: aload 1
      // 0c: ifnonnull 2c
      // 0f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 14: ifeq 35
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: getstatic com/finalshell/core/GA.q Ljava/util/Map;
      // 21: iload 0
      // 22: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast com/finalshell/core/PF3
      // 34: areturn
      // 35: new com/finalshell/core/PF3
      // 38: dup
      // 39: ldc com/finalshell/core/GA
      // 3b: new java/lang/StringBuilder
      // 3e: dup
      // 3f: invokespecial java/lang/StringBuilder.<init> ()V
      // 42: sipush -31920
      // 45: sipush 24707
      // 48: invokestatic com/finalshell/core/GA.a (II)Ljava/lang/String;
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e: iload 0
      // 4f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 52: sipush -31917
      // 55: sipush -13296
      // 58: invokestatic com/finalshell/core/GA.a (II)Ljava/lang/String;
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 61: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 64: invokespecial com/finalshell/core/PF3.<init> (Ljava/net/URL;)V
      // 67: astore 2
      // 68: getstatic com/finalshell/core/GA.q Ljava/util/Map;
      // 6b: iload 0
      // 6c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6f: aload 2
      // 70: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 75: pop
      // 76: aload 2
      // 77: areturn
   }

   public static void h(Graphics2D var0, BufferedImage var1, BufferedImage var2, Shape var3, Shape var4) {
      Shape var7;
      Object var5 = RV.X(var0);
      Rectangle var6 = var3.getBounds();
      var0.setPaint(new TexturePaint(var1, new Rectangle(var6.getLocation(), new Dimension(var1.getWidth(), var1.getHeight()))));
      var0.fill(var3);
      var7 = var0.getClip();
      Area var8 = new Area(var7);
      var8.intersect(new Area(var4));
      var0.setClip(var8);
      var0.setPaint(new TexturePaint(var2, new Rectangle(var6.getLocation(), new Dimension(var2.getWidth(), var2.getHeight()))));
      var0.fill(var4);
      RV.Y(var0, var4, Color.BLACK, 4);
      var0.setClip(var7);
      var0.setPaint(Color.DARK_GRAY);
      var0.draw(var4);
      RV.X(var0, var5);
   }

   public static void g(Graphics2D var0, String var1) {
      v(var0, var1, Color.LIGHT_GRAY);
   }

   public static void v(Graphics2D var0, String var1, Color var2) {
      M(var0, var1, P9.M(var2), 2, -2.0, -1.0, true);
   }

   public static void X(Graphics2D var0, String var1, Color var2) {
      M(var0, var1, P9.M(var2), 2, -2.0, -2.0, false);
   }

   public static void M(Graphics2D param0, String param1, Color param2, int param3, double param4, double param6, boolean param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: ldc_w 0.8
      // 006: fstore 10
      // 008: astore 9
      // 00a: aload 0
      // 00b: invokevirtual java/awt/Graphics2D.getComposite ()Ljava/awt/Composite;
      // 00e: astore 11
      // 010: aload 0
      // 011: invokevirtual java/awt/Graphics2D.getColor ()Ljava/awt/Color;
      // 014: astore 12
      // 016: ldc_w 0.4
      // 019: fstore 13
      // 01b: aload 11
      // 01d: instanceof java/awt/AlphaComposite
      // 020: aload 9
      // 022: ifnonnull 06c
      // 025: ifeq 05d
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02e: athrow
      // 02f: aload 11
      // 031: checkcast java/awt/AlphaComposite
      // 034: invokevirtual java/awt/AlphaComposite.getRule ()I
      // 037: aload 9
      // 039: ifnonnull 06c
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 042: athrow
      // 043: bipush 3
      // 044: if_icmpne 05d
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: aload 11
      // 050: checkcast java/awt/AlphaComposite
      // 053: invokevirtual java/awt/AlphaComposite.getAlpha ()F
      // 056: fload 13
      // 058: invokestatic java/lang/Math.min (FF)F
      // 05b: fstore 13
      // 05d: aload 0
      // 05e: aload 2
      // 05f: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 062: aload 0
      // 063: dload 4
      // 065: dload 6
      // 067: invokevirtual java/awt/Graphics2D.translate (DD)V
      // 06a: iload 8
      // 06c: aload 9
      // 06e: ifnonnull 085
      // 071: ifeq 088
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07a: athrow
      // 07b: iload 3
      // 07c: bipush 1
      // 07d: isub
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: goto 089
      // 088: iload 3
      // 089: istore 14
      // 08b: iload 3
      // 08c: ineg
      // 08d: istore 15
      // 08f: iload 15
      // 091: iload 14
      // 093: if_icmpgt 123
      // 096: aload 9
      // 098: ifnonnull 140
      // 09b: iload 3
      // 09c: ineg
      // 09d: istore 16
      // 09f: iload 16
      // 0a1: iload 14
      // 0a3: if_icmpgt 11b
      // 0a6: iload 15
      // 0a8: iload 15
      // 0aa: imul
      // 0ab: iload 16
      // 0ad: iload 16
      // 0af: imul
      // 0b0: iadd
      // 0b1: i2d
      // 0b2: dstore 17
      // 0b4: ldc_w 0.8
      // 0b7: fstore 19
      // 0b9: dload 17
      // 0bb: dconst_0
      // 0bc: dcmpl
      // 0bd: aload 9
      // 0bf: ifnonnull 091
      // 0c2: aload 9
      // 0c4: ifnonnull 0f6
      // 0c7: ifle 0df
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: dconst_1
      // 0d2: dload 17
      // 0d4: iload 3
      // 0d5: i2d
      // 0d6: dmul
      // 0d7: ldc2_w 0.800000011920929
      // 0da: dmul
      // 0db: ddiv
      // 0dc: d2f
      // 0dd: fstore 19
      // 0df: fload 19
      // 0e1: fload 13
      // 0e3: fmul
      // 0e4: fstore 19
      // 0e6: aload 9
      // 0e8: ifnonnull 116
      // 0eb: fload 19
      // 0ed: fconst_1
      // 0ee: fcmpl
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f5: athrow
      // 0f6: ifle 0fc
      // 0f9: fconst_1
      // 0fa: fstore 19
      // 0fc: aload 0
      // 0fd: bipush 3
      // 0fe: fload 19
      // 100: invokestatic java/awt/AlphaComposite.getInstance (IF)Ljava/awt/AlphaComposite;
      // 103: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 106: aload 0
      // 107: aload 1
      // 108: iload 15
      // 10a: iload 3
      // 10b: iadd
      // 10c: iload 16
      // 10e: iload 3
      // 10f: iadd
      // 110: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 113: iinc 16 1
      // 116: aload 9
      // 118: ifnull 09f
      // 11b: iinc 15 1
      // 11e: aload 9
      // 120: ifnull 08f
      // 123: aload 0
      // 124: dload 4
      // 126: dneg
      // 127: dload 6
      // 129: dneg
      // 12a: invokevirtual java/awt/Graphics2D.translate (DD)V
      // 12d: aload 0
      // 12e: aload 11
      // 130: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 133: aload 0
      // 134: aload 12
      // 136: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 139: aload 0
      // 13a: aload 1
      // 13b: bipush 0
      // 13c: bipush 0
      // 13d: invokevirtual java/awt/Graphics2D.drawString (Ljava/lang/String;II)V
      // 140: return
   }

   public static void i(Graphics2D var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      W(var0, var1, var2, var3, var4, var5, var6, 0.0F);
   }

   public static void W(Graphics2D param0, int param1, int param2, int param3, int param4, int param5, int param6, float param7) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 8
      // 05: iload 3
      // 06: iload 1
      // 07: aload 8
      // 09: ifnonnull 2c
      // 0c: if_icmplt 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: iload 4
      // 18: aload 8
      // 1a: ifnonnull 31
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: iload 2
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: if_icmpge 30
      // 2f: return
      // 30: bipush 2
      // 31: newarray 6
      // 33: dup
      // 34: bipush 0
      // 35: iload 5
      // 37: i2f
      // 38: fastore
      // 39: dup
      // 3a: bipush 1
      // 3b: iload 6
      // 3d: i2f
      // 3e: fastore
      // 3f: astore 9
      // 41: new java/awt/BasicStroke
      // 44: dup
      // 45: fconst_1
      // 46: bipush 1
      // 47: bipush 1
      // 48: ldc_w 10.0
      // 4b: aload 9
      // 4d: fload 7
      // 4f: invokespecial java/awt/BasicStroke.<init> (FIIF[FF)V
      // 52: astore 10
      // 54: aload 0
      // 55: aload 10
      // 57: invokestatic com/finalshell/core/RV.M (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)Ljava/awt/Stroke;
      // 5a: astore 11
      // 5c: aload 0
      // 5d: iload 1
      // 5e: iload 2
      // 5f: iload 3
      // 60: iload 1
      // 61: isub
      // 62: iload 4
      // 64: iload 2
      // 65: isub
      // 66: invokevirtual java/awt/Graphics2D.drawRect (IIII)V
      // 69: aload 0
      // 6a: aload 11
      // 6c: invokestatic com/finalshell/core/RV.p (Ljava/awt/Graphics2D;Ljava/awt/Stroke;)V
      // 6f: return
   }

   public static GeneralPath f(int var0, int var1, int var2, int var3, int var4, int var5) {
      GeneralPath var6;
      var6 = new GeneralPath(0);
      var6.moveTo((float)var0, (float)(var1 + var5));
      var6.quadTo((float)var0, (float)var1, (float)(var0 + var4), (float)var1);
      var6.lineTo((float)(var0 + var2 - var4), (float)var1);
      var6.quadTo((float)(var0 + var2), (float)var1, (float)(var0 + var2), (float)(var1 + var5));
      var6.lineTo((float)(var0 + var2), (float)(var1 + var3 - var5));
      var6.quadTo((float)(var0 + var2), (float)(var1 + var3), (float)(var0 + var2 - var4), (float)(var1 + var3));
      var6.lineTo((float)(var0 + var4), (float)(var1 + var3));
      var6.quadTo((float)var0, (float)(var1 + var3), (float)var0, (float)(var1 + var3 - var5));
      var6.closePath();
      return var6;
   }

   public static Point A(FontMetrics var0, String var1) {
      return new Point(C(var0, var1), d(var0));
   }

   public static int C(FontMetrics var0, String var1) {
      return -var0.stringWidth(var1) / 2;
   }

   public static int d(FontMetrics var0) {
      return (var0.getAscent() - var0.getLeading() - var0.getDescent()) / 2;
   }

   public static boolean i(Component var0) {
      String var10000;
      L0_2 var4;
      var10000 = FV_2.D();
      L0_2 var2 = J(var0);
      String var1 = var10000;

      label22: {
         try {
            var4 = var2;
            if (var1 != null) {
               break label22;
            }

            if (var2 == null) {
               return false;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         var4 = var2;
      }

      var4.h();
      return true;
   }

   public static L0_2 J(Component param0) {
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
      // 05: aload 1
      // 06: ifnonnull 20
      // 09: instanceof com/finalshell/core/L0_2
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast com/finalshell/core/L0_2
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokestatic com/finalshell/core/GA.Z (Ljava/awt/Component;)Ljavax/swing/plaf/ComponentUI;
      // 23: astore 2
      // 24: aload 2
      // 25: aload 1
      // 26: ifnonnull 34
      // 29: ifnull 51
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 2
      // 34: aload 1
      // 35: ifnonnull 4d
      // 38: instanceof com/finalshell/core/L0_2
      // 3b: ifeq 51
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 2
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: checkcast com/finalshell/core/L0_2
      // 50: areturn
      // 51: aconst_null
      // 52: areturn
   }

   public static W2_3 e(Component param0) {
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
      // 05: aload 1
      // 06: ifnonnull 20
      // 09: instanceof com/finalshell/core/W2_3
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast com/finalshell/core/W2_3
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokestatic com/finalshell/core/GA.Z (Ljava/awt/Component;)Ljavax/swing/plaf/ComponentUI;
      // 23: astore 2
      // 24: aload 2
      // 25: aload 1
      // 26: ifnonnull 34
      // 29: ifnull 51
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 2
      // 34: aload 1
      // 35: ifnonnull 4d
      // 38: instanceof com/finalshell/core/W2_3
      // 3b: ifeq 51
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 2
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: checkcast com/finalshell/core/W2_3
      // 50: areturn
      // 51: aconst_null
      // 52: areturn
   }

   public static D7 y(Component param0) {
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
      // 05: aload 1
      // 06: ifnonnull 20
      // 09: instanceof com/finalshell/core/D7
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast com/finalshell/core/D7
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokestatic com/finalshell/core/GA.Z (Ljava/awt/Component;)Ljavax/swing/plaf/ComponentUI;
      // 23: astore 2
      // 24: aload 2
      // 25: aload 1
      // 26: ifnonnull 34
      // 29: ifnull 51
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 2
      // 34: aload 1
      // 35: ifnonnull 4d
      // 38: instanceof com/finalshell/core/D7
      // 3b: ifeq 51
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 2
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: checkcast com/finalshell/core/D7
      // 50: areturn
      // 51: aconst_null
      // 52: areturn
   }

   public static Rectangle p(com.finalshell.ui.panel.O param0, Ne4 param1) {
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
      // 04: aload 1
      // 05: bipush 0
      // 06: aload 0
      // 07: aload 2
      // 08: ifnonnull 20
      // 0b: invokevirtual com/finalshell/ui/panel/O.getIcon ()Ljavax/swing/Icon;
      // 0e: ifnull 26
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/GA.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: invokevirtual com/finalshell/ui/panel/O.getIconTextGap ()I
      // 23: goto 27
      // 26: bipush 0
      // 27: bipush 0
      // 28: bipush 0
      // 29: invokevirtual com/finalshell/core/Ne4.d (IIII)V
      // 2c: new java/awt/Rectangle
      // 2f: dup
      // 30: bipush 0
      // 31: bipush 0
      // 32: aload 0
      // 33: invokevirtual com/finalshell/ui/panel/O.getWidth ()I
      // 36: aload 0
      // 37: invokevirtual com/finalshell/ui/panel/O.getHeight ()I
      // 3a: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 3d: astore 3
      // 3e: aload 0
      // 3f: invokevirtual com/finalshell/ui/panel/O.getInsets ()Ljava/awt/Insets;
      // 42: astore 4
      // 44: aload 3
      // 45: dup
      // 46: getfield java/awt/Rectangle.x I
      // 49: aload 4
      // 4b: getfield java/awt/Insets.left I
      // 4e: iadd
      // 4f: putfield java/awt/Rectangle.x I
      // 52: aload 3
      // 53: dup
      // 54: getfield java/awt/Rectangle.y I
      // 57: aload 4
      // 59: getfield java/awt/Insets.top I
      // 5c: iadd
      // 5d: putfield java/awt/Rectangle.y I
      // 60: aload 3
      // 61: dup
      // 62: getfield java/awt/Rectangle.width I
      // 65: aload 4
      // 67: getfield java/awt/Insets.left I
      // 6a: aload 4
      // 6c: getfield java/awt/Insets.right I
      // 6f: iadd
      // 70: isub
      // 71: putfield java/awt/Rectangle.width I
      // 74: aload 3
      // 75: dup
      // 76: getfield java/awt/Rectangle.height I
      // 79: aload 4
      // 7b: getfield java/awt/Insets.top I
      // 7e: aload 4
      // 80: getfield java/awt/Insets.bottom I
      // 83: iadd
      // 84: isub
      // 85: putfield java/awt/Rectangle.height I
      // 88: aload 1
      // 89: invokevirtual com/finalshell/core/Ne4.getMargin ()Ljava/awt/Insets;
      // 8c: astore 5
      // 8e: bipush 1
      // 8f: aload 1
      // 90: invokevirtual com/finalshell/core/Ne4.L ()I
      // 93: iadd
      // 94: istore 6
      // 96: aload 3
      // 97: dup
      // 98: getfield java/awt/Rectangle.x I
      // 9b: aload 5
      // 9d: getfield java/awt/Insets.left I
      // a0: iload 6
      // a2: iadd
      // a3: isub
      // a4: putfield java/awt/Rectangle.x I
      // a7: aload 3
      // a8: dup
      // a9: getfield java/awt/Rectangle.y I
      // ac: aload 5
      // ae: getfield java/awt/Insets.top I
      // b1: iload 6
      // b3: iadd
      // b4: isub
      // b5: putfield java/awt/Rectangle.y I
      // b8: aload 3
      // b9: dup
      // ba: getfield java/awt/Rectangle.width I
      // bd: aload 5
      // bf: getfield java/awt/Insets.left I
      // c2: aload 5
      // c4: getfield java/awt/Insets.right I
      // c7: iadd
      // c8: iload 6
      // ca: bipush 2
      // cb: imul
      // cc: iadd
      // cd: iadd
      // ce: putfield java/awt/Rectangle.width I
      // d1: aload 3
      // d2: dup
      // d3: getfield java/awt/Rectangle.height I
      // d6: aload 5
      // d8: getfield java/awt/Insets.top I
      // db: aload 5
      // dd: getfield java/awt/Insets.bottom I
      // e0: iadd
      // e1: iload 6
      // e3: bipush 2
      // e4: imul
      // e5: iadd
      // e6: iadd
      // e7: putfield java/awt/Rectangle.height I
      // ea: aload 3
      // eb: dup
      // ec: getfield java/awt/Rectangle.width I
      // ef: bipush 1
      // f0: iadd
      // f1: putfield java/awt/Rectangle.width I
      // f4: aload 3
      // f5: areturn
   }

   public static Rectangle T(com.finalshell.ui.panel.O var0, Ky4 var1) {
      Rectangle var2 = new Rectangle(0, 0, var0.getWidth(), var0.getHeight());
      Insets var3 = var0.getInsets();
      var2.x = var2.x + var3.left;
      var2.y = var2.y + var3.top;
      var2.width = var2.width - (var3.left + var3.right);
      var2.height = var2.height - (var3.top + var3.bottom);
      Insets var4 = var1.O$Insets();
      int var5 = 2 + var1.E();
      var2.x = var2.x - (var4.left + var5);
      var2.y = var2.y - (var4.top + var5);
      var2.width = var2.width + var4.left + var4.right + var5 * 2;
      var2.height = var2.height + var4.top + var4.bottom + var5 * 2;
      var2.width++;
      return var2;
   }

   public static Lo2 p(Object var0) {
      return R(PM.P(var0));
   }

   public static Lo2 R(com.finalshell.ui.model.F2 var0) {
      return new Lo2(PM.j(var0));
   }

   public static boolean I(java.lang.Class var0) {
      return t(var0.getCanonicalName());
   }

   public static boolean t(String var0) {
      try {
         UIManager.setLookAndFeel(var0);
         return true;
      } catch (Throwable var2) {
         NE3.g().error(a(-31908, -1560) + var0, var2);
         return false;
      }
   }

   static {
      __vfClinit__();
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var10000;
      int var6;
      short var4;
      int var2 = (var0 ^ -31920) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 59;
               break;
            case 1:
               var10000 = 129;
               break;
            case 2:
               var10000 = 97;
               break;
            case 3:
               var10000 = 189;
               break;
            case 4:
               var10000 = 107;
               break;
            case 5:
               var10000 = 70;
               break;
            case 6:
               var10000 = 228;
               break;
            case 7:
               var10000 = 114;
               break;
            case 8:
               var10000 = 229;
               break;
            case 9:
               var10000 = 187;
               break;
            case 10:
               var10000 = 57;
               break;
            case 11:
               var10000 = 207;
               break;
            case 12:
               var10000 = 200;
               break;
            case 13:
               var10000 = 140;
               break;
            case 14:
               var10000 = 40;
               break;
            case 15:
               var10000 = 188;
               break;
            case 16:
               var10000 = 10;
               break;
            case 17:
               var10000 = 60;
               break;
            case 18:
               var10000 = 64;
               break;
            case 19:
               var10000 = 51;
               break;
            case 20:
               var10000 = 212;
               break;
            case 21:
               var10000 = 170;
               break;
            case 22:
               var10000 = 68;
               break;
            case 23:
               var10000 = 223;
               break;
            case 24:
               var10000 = 135;
               break;
            case 25:
               var10000 = 196;
               break;
            case 26:
               var10000 = 143;
               break;
            case 27:
               var10000 = 21;
               break;
            case 28:
               var10000 = 24;
               break;
            case 29:
               var10000 = 32;
               break;
            case 30:
               var10000 = 254;
               break;
            case 31:
               var10000 = 109;
               break;
            case 32:
               var10000 = 100;
               break;
            case 33:
               var10000 = 42;
               break;
            case 34:
               var10000 = 205;
               break;
            case 35:
               var10000 = 149;
               break;
            case 36:
               var10000 = 29;
               break;
            case 37:
               var10000 = 157;
               break;
            case 38:
               var10000 = 215;
               break;
            case 39:
               var10000 = 155;
               break;
            case 40:
               var10000 = 0;
               break;
            case 41:
               var10000 = 52;
               break;
            case 42:
               var10000 = 236;
               break;
            case 43:
               var10000 = 92;
               break;
            case 44:
               var10000 = 145;
               break;
            case 45:
               var10000 = 63;
               break;
            case 46:
               var10000 = 124;
               break;
            case 47:
               var10000 = 185;
               break;
            case 48:
               var10000 = 132;
               break;
            case 49:
               var10000 = 142;
               break;
            case 50:
               var10000 = 217;
               break;
            case 51:
               var10000 = 103;
               break;
            case 52:
               var10000 = 14;
               break;
            case 53:
               var10000 = 54;
               break;
            case 54:
               var10000 = 84;
               break;
            case 55:
               var10000 = 95;
               break;
            case 56:
               var10000 = 199;
               break;
            case 57:
               var10000 = 110;
               break;
            case 58:
               var10000 = 139;
               break;
            case 59:
               var10000 = 22;
               break;
            case 60:
               var10000 = 154;
               break;
            case 61:
               var10000 = 178;
               break;
            case 62:
               var10000 = 13;
               break;
            case 63:
               var10000 = 220;
               break;
            case 64:
               var10000 = 153;
               break;
            case 65:
               var10000 = 35;
               break;
            case 66:
               var10000 = 214;
               break;
            case 67:
               var10000 = 233;
               break;
            case 68:
               var10000 = 82;
               break;
            case 69:
               var10000 = 46;
               break;
            case 70:
               var10000 = 39;
               break;
            case 71:
               var10000 = 136;
               break;
            case 72:
               var10000 = 56;
               break;
            case 73:
               var10000 = 93;
               break;
            case 74:
               var10000 = 163;
               break;
            case 75:
               var10000 = 2;
               break;
            case 76:
               var10000 = 11;
               break;
            case 77:
               var10000 = 27;
               break;
            case 78:
               var10000 = 244;
               break;
            case 79:
               var10000 = 255;
               break;
            case 80:
               var10000 = 174;
               break;
            case 81:
               var10000 = 53;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 65;
               break;
            case 84:
               var10000 = 181;
               break;
            case 85:
               var10000 = 17;
               break;
            case 86:
               var10000 = 6;
               break;
            case 87:
               var10000 = 165;
               break;
            case 88:
               var10000 = 76;
               break;
            case 89:
               var10000 = 208;
               break;
            case 90:
               var10000 = 186;
               break;
            case 91:
               var10000 = 116;
               break;
            case 92:
               var10000 = 9;
               break;
            case 93:
               var10000 = 73;
               break;
            case 94:
               var10000 = 131;
               break;
            case 95:
               var10000 = 224;
               break;
            case 96:
               var10000 = 173;
               break;
            case 97:
               var10000 = 203;
               break;
            case 98:
               var10000 = 90;
               break;
            case 99:
               var10000 = 1;
               break;
            case 100:
               var10000 = 12;
               break;
            case 101:
               var10000 = 43;
               break;
            case 102:
               var10000 = 113;
               break;
            case 103:
               var10000 = 197;
               break;
            case 104:
               var10000 = 61;
               break;
            case 105:
               var10000 = 118;
               break;
            case 106:
               var10000 = 192;
               break;
            case 107:
               var10000 = 176;
               break;
            case 108:
               var10000 = 99;
               break;
            case 109:
               var10000 = 209;
               break;
            case 110:
               var10000 = 45;
               break;
            case 111:
               var10000 = 37;
               break;
            case 112:
               var10000 = 137;
               break;
            case 113:
               var10000 = 230;
               break;
            case 114:
               var10000 = 69;
               break;
            case 115:
               var10000 = 81;
               break;
            case 116:
               var10000 = 16;
               break;
            case 117:
               var10000 = 20;
               break;
            case 118:
               var10000 = 33;
               break;
            case 119:
               var10000 = 183;
               break;
            case 120:
               var10000 = 193;
               break;
            case 121:
               var10000 = 101;
               break;
            case 122:
               var10000 = 120;
               break;
            case 123:
               var10000 = 235;
               break;
            case 124:
               var10000 = 47;
               break;
            case 125:
               var10000 = 180;
               break;
            case 126:
               var10000 = 15;
               break;
            case 127:
               var10000 = 127;
               break;
            case 128:
               var10000 = 162;
               break;
            case 129:
               var10000 = 211;
               break;
            case 130:
               var10000 = 177;
               break;
            case 131:
               var10000 = 144;
               break;
            case 132:
               var10000 = 245;
               break;
            case 133:
               var10000 = 108;
               break;
            case 134:
               var10000 = 238;
               break;
            case 135:
               var10000 = 34;
               break;
            case 136:
               var10000 = 190;
               break;
            case 137:
               var10000 = 168;
               break;
            case 138:
               var10000 = 182;
               break;
            case 139:
               var10000 = 226;
               break;
            case 140:
               var10000 = 249;
               break;
            case 141:
               var10000 = 128;
               break;
            case 142:
               var10000 = 121;
               break;
            case 143:
               var10000 = 213;
               break;
            case 144:
               var10000 = 248;
               break;
            case 145:
               var10000 = 41;
               break;
            case 146:
               var10000 = 86;
               break;
            case 147:
               var10000 = 125;
               break;
            case 148:
               var10000 = 117;
               break;
            case 149:
               var10000 = 219;
               break;
            case 150:
               var10000 = 74;
               break;
            case 151:
               var10000 = 148;
               break;
            case 152:
               var10000 = 239;
               break;
            case 153:
               var10000 = 166;
               break;
            case 154:
               var10000 = 62;
               break;
            case 155:
               var10000 = 172;
               break;
            case 156:
               var10000 = 36;
               break;
            case 157:
               var10000 = 210;
               break;
            case 158:
               var10000 = 94;
               break;
            case 159:
               var10000 = 198;
               break;
            case 160:
               var10000 = 151;
               break;
            case 161:
               var10000 = 234;
               break;
            case 162:
               var10000 = 161;
               break;
            case 163:
               var10000 = 19;
               break;
            case 164:
               var10000 = 243;
               break;
            case 165:
               var10000 = 138;
               break;
            case 166:
               var10000 = 25;
               break;
            case 167:
               var10000 = 179;
               break;
            case 168:
               var10000 = 164;
               break;
            case 169:
               var10000 = 49;
               break;
            case 170:
               var10000 = 159;
               break;
            case 171:
               var10000 = 89;
               break;
            case 172:
               var10000 = 105;
               break;
            case 173:
               var10000 = 122;
               break;
            case 174:
               var10000 = 58;
               break;
            case 175:
               var10000 = 4;
               break;
            case 176:
               var10000 = 106;
               break;
            case 177:
               var10000 = 133;
               break;
            case 178:
               var10000 = 104;
               break;
            case 179:
               var10000 = 247;
               break;
            case 180:
               var10000 = 75;
               break;
            case 181:
               var10000 = 194;
               break;
            case 182:
               var10000 = 134;
               break;
            case 183:
               var10000 = 156;
               break;
            case 184:
               var10000 = 246;
               break;
            case 185:
               var10000 = 38;
               break;
            case 186:
               var10000 = 87;
               break;
            case 187:
               var10000 = 146;
               break;
            case 188:
               var10000 = 152;
               break;
            case 189:
               var10000 = 71;
               break;
            case 190:
               var10000 = 204;
               break;
            case 191:
               var10000 = 30;
               break;
            case 192:
               var10000 = 158;
               break;
            case 193:
               var10000 = 102;
               break;
            case 194:
               var10000 = 50;
               break;
            case 195:
               var10000 = 112;
               break;
            case 196:
               var10000 = 23;
               break;
            case 197:
               var10000 = 227;
               break;
            case 198:
               var10000 = 126;
               break;
            case 199:
               var10000 = 242;
               break;
            case 200:
               var10000 = 80;
               break;
            case 201:
               var10000 = 83;
               break;
            case 202:
               var10000 = 26;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 7;
               break;
            case 205:
               var10000 = 96;
               break;
            case 206:
               var10000 = 77;
               break;
            case 207:
               var10000 = 31;
               break;
            case 208:
               var10000 = 91;
               break;
            case 209:
               var10000 = 147;
               break;
            case 210:
               var10000 = 201;
               break;
            case 211:
               var10000 = 28;
               break;
            case 212:
               var10000 = 85;
               break;
            case 213:
               var10000 = 191;
               break;
            case 214:
               var10000 = 250;
               break;
            case 215:
               var10000 = 251;
               break;
            case 216:
               var10000 = 253;
               break;
            case 217:
               var10000 = 79;
               break;
            case 218:
               var10000 = 72;
               break;
            case 219:
               var10000 = 123;
               break;
            case 220:
               var10000 = 175;
               break;
            case 221:
               var10000 = 231;
               break;
            case 222:
               var10000 = 167;
               break;
            case 223:
               var10000 = 237;
               break;
            case 224:
               var10000 = 66;
               break;
            case 225:
               var10000 = 78;
               break;
            case 226:
               var10000 = 252;
               break;
            case 227:
               var10000 = 171;
               break;
            case 228:
               var10000 = 169;
               break;
            case 229:
               var10000 = 55;
               break;
            case 230:
               var10000 = 150;
               break;
            case 231:
               var10000 = 88;
               break;
            case 232:
               var10000 = 18;
               break;
            case 233:
               var10000 = 3;
               break;
            case 234:
               var10000 = 98;
               break;
            case 235:
               var10000 = 184;
               break;
            case 236:
               var10000 = 206;
               break;
            case 237:
               var10000 = 218;
               break;
            case 238:
               var10000 = 195;
               break;
            case 239:
               var10000 = 115;
               break;
            case 240:
               var10000 = 222;
               break;
            case 241:
               var10000 = 240;
               break;
            case 242:
               var10000 = 67;
               break;
            case 243:
               var10000 = 141;
               break;
            case 244:
               var10000 = 130;
               break;
            case 245:
               var10000 = 225;
               break;
            case 246:
               var10000 = 232;
               break;
            case 247:
               var10000 = 216;
               break;
            case 248:
               var10000 = 160;
               break;
            case 249:
               var10000 = 202;
               break;
            case 250:
               var10000 = 111;
               break;
            case 251:
               var10000 = 44;
               break;
            case 252:
               var10000 = 48;
               break;
            case 253:
               var10000 = 119;
               break;
            case 254:
               var10000 = 241;
               break;
            default:
               var10000 = 8;
         }

         var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15713;
      if (h[var3] == null) {
         h[var3] = (int)(f[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long[] var6;
      byte[] var7;
      String[] var13 = new String[19];
      int var11 = 0;
      String var10 = "xUo\u0091Ü0ÚI\u008fÎ)¤Í.sÍõL\u000f«L(LÆ\u001aY\u001bKXX\tJn\u009d*k8\u0085½z¿Ä\b9c\u0085\u0016ÐçÅ%4à\u008a:ç9µáÓÜ\u0083çÿT¬<\u000f\u0091þ\u009ft\u0091\t¶\u007f6c:SIp£Úù\u000bt\u000b`=ºW\t\u001f½\u0010Ã\u0005ýCµÅtÒ\u0006\u0088Ó\u009fN¶^\u001d§\u0010\u00949£%5ër\u009a\u0096.:\u007f\u008dç,\bÁ\u0004Ì\u0001ÐæÚÙ»\u0091\u008e\u001f\u0015¨Â.iÇl·Y\u0011ó_\u0096Q\u0018\"\u008d¡·\rgÃ\u0092Rä\u0007\u0088\n\u009fa¡\u0018!9D\u001c¹\u0081v\u007f\u001a\b\u009b|\u009b5¹®³7ymÅ#\u00986\u0007Ãù$Ft\u0080)\"ðs~Uþ¨\u009eZ\u0007¬8èï§7üm`\u0010ntü\u0091·\u0016í-~Èð\u0097*·Ò\u001dµsÖUë¨<ZS¬²è¾§\u001dü'}\u009a~§N½\u000fwä\u000e68\u0018K~\tô\u0010\u009cCÜ¼|Oò\u0001äê\u0094Àf-\u0093OüÉÍ\u0005\u0097^F\r»)¦¢\u0001ÏÁ<ÖÚ4Ê7ÓE\u0082enÏ³¢Ùn^j\u0003ÕH\u007fþ\u00ad%¶\u0090\u0084¢\u0082Ç°}d\u0095ë!UvâXáuJ\u0011QFò\u0000Þ¦\u000e:èýtq\u0084\u0019\u0011ýR\u008eG\u0082A×ÖLµ\u001b\u0011EB\u0093ypnA\u0019Ïû\u0084\u0097*8M\u0088K3«}\u008e\u0006}ÖêM\u001aXûkD\\\u008aÊ\u001e\u008d$iùÅ\u0085r¸Àò\u001eg#Ô\u0004¿_.\u0012Ø@\u0088s½[\u00adÇ÷¿\u0019r\u0014_(Ed4";
      int var12 = "xUo\u0091Ü0ÚI\u008fÎ)¤Í.sÍõL\u000f«L(LÆ\u001aY\u001bKXX\tJn\u009d*k8\u0085½z¿Ä\b9c\u0085\u0016ÐçÅ%4à\u008a:ç9µáÓÜ\u0083çÿT¬<\u000f\u0091þ\u009ft\u0091\t¶\u007f6c:SIp£Úù\u000bt\u000b`=ºW\t\u001f½\u0010Ã\u0005ýCµÅtÒ\u0006\u0088Ó\u009fN¶^\u001d§\u0010\u00949£%5ër\u009a\u0096.:\u007f\u008dç,\bÁ\u0004Ì\u0001ÐæÚÙ»\u0091\u008e\u001f\u0015¨Â.iÇl·Y\u0011ó_\u0096Q\u0018\"\u008d¡·\rgÃ\u0092Rä\u0007\u0088\n\u009fa¡\u0018!9D\u001c¹\u0081v\u007f\u001a\b\u009b|\u009b5¹®³7ymÅ#\u00986\u0007Ãù$Ft\u0080)\"ðs~Uþ¨\u009eZ\u0007¬8èï§7üm`\u0010ntü\u0091·\u0016í-~Èð\u0097*·Ò\u001dµsÖUë¨<ZS¬²è¾§\u001dü'}\u009a~§N½\u000fwä\u000e68\u0018K~\tô\u0010\u009cCÜ¼|Oò\u0001äê\u0094Àf-\u0093OüÉÍ\u0005\u0097^F\r»)¦¢\u0001ÏÁ<ÖÚ4Ê7ÓE\u0082enÏ³¢Ùn^j\u0003ÕH\u007fþ\u00ad%¶\u0090\u0084¢\u0082Ç°}d\u0095ë!UvâXáuJ\u0011QFò\u0000Þ¦\u000e:èýtq\u0084\u0019\u0011ýR\u008eG\u0082A×ÖLµ\u001b\u0011EB\u0093ypnA\u0019Ïû\u0084\u0097*8M\u0088K3«}\u008e\u0006}ÖêM\u001aXûkD\\\u008aÊ\u001e\u008d$iùÅ\u0085r¸Àò\u001eg#Ô\u0004¿_.\u0012Ø@\u0088s½[\u00adÇ÷¿\u0019r\u0014_(Ed4"
         .length();
      char var9 = 24;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 33;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 73;
                        break;
                     case 1:
                        var65 = 65;
                        break;
                     case 2:
                        var65 = 103;
                        break;
                     case 3:
                        var65 = 119;
                        break;
                     case 4:
                        var65 = 41;
                        break;
                     case 5:
                        var65 = 101;
                        break;
                     default:
                        var65 = 15;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     c = new String[19];
                     long var0 = 5972639322288249823L;
                     var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u000e04áP-Ü\u008c\u0082\u008c¶\u009bØBß¹OwVÛp\u000f\u0095\u0080\u0088\u0093|\u0080)N6¢";
                     int var5 = "\u000e04áP-Ü\u008c\u0082\u008c¶\u009bØBß¹OwVÛp\u000f\u0095\u0080\u0088\u0093|\u0080)N6¢".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    f = var6;
                                    h = new Integer[6];
                                    e = new EH3();
                                    N = new Pp4();
                                    d = new WQ_2();
                                    P = new LB_2();
                                    i = new HashMap();
                                    a = a(20507, 1036857957273005433L);
                                    o = a(14596, 2721872801761297508L);
                                    u = 1;
                                    U = a(5658, 7393847499690453887L);
                                    g = new PF3(GA.class.getResource(a(-31919, -22810)));
                                    M = new PF3(GA.class.getResource(a(-31911, 22427)));
                                    l = new PF3(GA.class.getResource(a(-31916, 12997)));
                                    V = new PF3(GA.class.getResource(a(-31912, 24544)));
                                    z = new PF3(GA.class.getResource(a(-31915, 24520)));
                                    j = new PF3(GA.class.getResource(a(-31914, -26755)));
                                    F = new PF3(GA.class.getResource(a(-31910, 4831)));
                                    C = new PF3(GA.class.getResource(a(-31935, 25762)));
                                    B = new PF3(GA.class.getResource(a(-31905, 31965)));
                                    x = new ImageIcon(GA.class.getResource(a(-31906, -21643)));
                                    q = new HashMap();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = ")\u0082XìÖðð¢¡\u0088ûÄÛ\u0082mÚ";
                                 var5 = ")\u0082XìÖðð¢¡\u0088ûÄÛ\u0082mÚ".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "<üG\u0004y\"Î«\u00ad2Í\u009bñiT\u0085¡ï)?óvÁ7æC\u009cbÊ.e°üûSM_¥\u009cO\u00876\u001fÃâs\u001fÄ¢)[ßW-\u009e\u0089u¾·;¤Öã\u0018Ã\u0093§ôXåj\u009f~Kâ\r";
                  var12 = "<üG\u0004y\"Î«\u00ad2Í\u009bñiT\u0085¡ï)?óvÁ7æC\u009cbÊ.e°üûSM_¥\u009cO\u00876\u001fÃâs\u001fÄ¢)[ßW-\u009e\u0089u¾·;¤Öã\u0018Ã\u0093§ôXåj\u009f~Kâ\r"
                     .length();
                  var9 = 29;
                  var17 = -1;
            }

            var10000 = 5;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





