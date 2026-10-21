package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.K8;
import com.finalshell.ui.listener.Wh4;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public final class FN extends FV_2 {
   public static Integer m;
   public static JLabel y;
   public static String[] s;
   public static Font[] k;
   public static Thread Q;
   public static Thread P;
   public static GE[] A;
   public static int R;
   public static Set H;
   public static boolean h;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static boolean l(JComponent param0) {
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
      // 05: invokestatic com/finalshell/core/FN.e (Ljavax/swing/JComponent;)Z
      // 08: aload 1
      // 09: ifnonnull 5c
      // 0c: ifeq 5b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual javax/swing/JComponent.getBorder ()Ljavax/swing/border/Border;
      // 1a: astore 2
      // 1b: aload 2
      // 1c: aload 1
      // 1d: ifnonnull 2b
      // 20: ifnull 59
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: instanceof javax/swing/plaf/UIResource
      // 2e: aload 1
      // 2f: ifnonnull 47
      // 32: ifne 59
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 2
      // 3d: instanceof com/finalshell/core/KS
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 1
      // 48: ifnonnull 56
      // 4b: ifne 59
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
      // 5b: bipush 0
      // 5c: ireturn
   }

   public static boolean e(JComponent param0) {
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
      // 04: sipush 11278
      // 07: sipush 29065
      // 0a: invokestatic com/finalshell/core/FN.a (II)Ljava/lang/String;
      // 0d: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 10: aload 1
      // 11: ifnonnull 47
      // 14: ifne 46
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 21: aload 0
      // 22: sipush 11274
      // 25: sipush 6522
      // 28: invokestatic com/finalshell/core/FN.a (II)Ljava/lang/String;
      // 2b: invokevirtual javax/swing/JComponent.getClientProperty (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e: invokevirtual java/lang/Boolean.equals (Ljava/lang/Object;)Z
      // 31: aload 1
      // 32: ifnonnull 47
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: ifeq 4a
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public static boolean O$boolean(Component param0) {
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
      // 04: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 19
      // 0e: ifnull 3b
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual javax/swing/JRootPane.getUI ()Ljavax/swing/plaf/RootPaneUI;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: instanceof com/finalshell/core/D
      // 21: aload 1
      // 22: ifnonnull 3c
      // 25: ifeq 3b
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 3
      // 30: checkcast com/finalshell/core/D
      // 33: invokevirtual com/finalshell/core/D.r$boolean ()Z
      // 36: ireturn
      // 37: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
   }

   public static boolean B(MouseEvent var0) {
      String var1 = FV_2.D();

      try {
         int var10000 = var0.getModifiers() & a(953, 4114700576983152474L);
         if (var1 != null) {
            return var10000 != 0;
         }

         if (var10000 != 0) {
            return 1 != 0;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return 0 != 0;
   }

   public static boolean N(MouseEvent param0) {
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
      // 05: invokevirtual java/awt/event/MouseEvent.getModifiers ()I
      // 08: sipush 15049
      // 0b: ldc2_w 5744758837620035116
      // 0e: invokestatic com/finalshell/core/FN.a (IJ)I
      // 11: iand
      // 12: aload 1
      // 13: ifnonnull 31
      // 16: sipush 10014
      // 19: ldc2_w 8454854018315867132
      // 1c: invokestatic com/finalshell/core/FN.a (IJ)I
      // 1f: if_icmpne 34
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   public static boolean L(MouseEvent param0) {
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
      // 05: invokevirtual java/awt/event/MouseEvent.getModifiers ()I
      // 08: bipush 4
      // 09: iand
      // 0a: aload 1
      // 0b: ifnonnull 21
      // 0e: bipush 4
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static void g(JTable param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: iload 2
      // 07: aload 0
      // 08: invokevirtual javax/swing/JTable.getRowCount ()I
      // 0b: if_icmpge 83
      // 0e: bipush 0
      // 0f: istore 3
      // 10: bipush 0
      // 11: istore 4
      // 13: iload 4
      // 15: aload 0
      // 16: invokevirtual javax/swing/JTable.getColumnCount ()I
      // 19: if_icmpge 76
      // 1c: aload 0
      // 1d: iload 2
      // 1e: iload 4
      // 20: invokevirtual javax/swing/JTable.getCellRenderer (II)Ljavax/swing/table/TableCellRenderer;
      // 23: astore 5
      // 25: aload 0
      // 26: iload 2
      // 27: iload 4
      // 29: invokevirtual javax/swing/JTable.getValueAt (II)Ljava/lang/Object;
      // 2c: astore 6
      // 2e: aload 5
      // 30: aload 0
      // 31: aload 6
      // 33: bipush 0
      // 34: bipush 0
      // 35: iload 2
      // 36: iload 4
      // 38: invokeinterface javax/swing/table/TableCellRenderer.getTableCellRendererComponent (Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component; 7
      // 3d: astore 7
      // 3f: aload 1
      // 40: ifnonnull 7f
      // 43: aload 7
      // 45: aload 1
      // 46: ifnonnull 5c
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: ifnull 65
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 7
      // 5c: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 5f: getfield java/awt/Dimension.height I
      // 62: goto 66
      // 65: bipush 0
      // 66: istore 8
      // 68: iload 8
      // 6a: iload 3
      // 6b: invokestatic java/lang/Math.max (II)I
      // 6e: istore 3
      // 6f: iinc 4 1
      // 72: aload 1
      // 73: ifnull 13
      // 76: aload 0
      // 77: iload 2
      // 78: iload 3
      // 79: invokevirtual javax/swing/JTable.setRowHeight (II)V
      // 7c: iinc 2 1
      // 7f: aload 1
      // 80: ifnull 06
      // 83: return
   }

   public static void q(JTable var0) {
      S(var0, GO.FV);
   }

   public static void S(JTable var0, int var1) {
      String var10000 = FV_2.D();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < var0.getColumnCount()) {
         q(var0, var3, var1);
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   public static void V(JTable var0, int var1) {
      q(var0, var1, GO.FV);
   }

   public static void q(JTable var0, int var1, int var2) {
      TableCellRenderer var15;
      Component var8;
      String var10000 = FV_2.D();
      DefaultTableColumnModel var4 = (DefaultTableColumnModel)var0.getColumnModel();
      TableColumn var5 = var4.getColumn(var1);
      String var3 = var10000;
      TableCellRenderer var7 = var5.getHeaderRenderer();

      label41: {
         label40: {
            try {
               var15 = var7;
               if (var3 != null) {
                  break label41;
               }

               if (var7 != null) {
                  break label40;
               }
            } catch (RuntimeException var11) {
               throw a(var11);
            }

            var7 = var0.getTableHeader().getDefaultRenderer();
         }

         var15 = var7;
      }

      var8 = var15.getTableCellRendererComponent(var0, var5.getHeaderValue(), false, false, 0, 0);
      int var6 = var8.getPreferredSize().width;
      int var9 = 0;

      while (true) {
         if (var9 < var0.getRowCount()) {
            var7 = var0.getCellRenderer(var9, var1);
            var8 = var7.getTableCellRendererComponent(var0, var0.getValueAt(var9, var1), false, false, var9, var1);
            var6 = Math.max(var6, var8.getPreferredSize().width);

            try {
               var9++;
               if (var3 != null) {
                  break;
               }

               if (var3 == null) {
                  continue;
               }
            } catch (RuntimeException var10) {
               throw a(var10);
            }
         }

         var6 += 2 * var2;
         var5.setPreferredWidth(var6);
         var5.setWidth(var6);
         break;
      }
   }

   public static boolean W(MouseEvent param0) {
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
      // 05: invokevirtual java/awt/event/MouseEvent.isPopupTrigger ()Z
      // 08: aload 1
      // 09: ifnonnull 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic javax/swing/SwingUtilities.isRightMouseButton (Ljava/awt/event/MouseEvent;)Z
      // 1a: aload 1
      // 1b: ifnonnull 30
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public static void j(Container param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokestatic com/finalshell/core/FN.I (Ljava/awt/Container;)Ljava/util/List;
      // 007: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 00c: astore 2
      // 00d: astore 1
      // 00e: aload 2
      // 00f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 014: ifeq 1b4
      // 017: aload 2
      // 018: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01d: checkcast java/awt/Container
      // 020: astore 3
      // 021: aload 3
      // 022: invokevirtual java/awt/Container.removeAll ()V
      // 025: aload 3
      // 026: aconst_null
      // 027: invokevirtual java/awt/Container.setLayout (Ljava/awt/LayoutManager;)V
      // 02a: aload 3
      // 02b: invokevirtual java/awt/Container.getMouseListeners ()[Ljava/awt/event/MouseListener;
      // 02e: astore 4
      // 030: aload 4
      // 032: arraylength
      // 033: istore 5
      // 035: bipush 0
      // 036: istore 6
      // 038: iload 6
      // 03a: iload 5
      // 03c: if_icmpge 05e
      // 03f: aload 4
      // 041: iload 6
      // 043: aaload
      // 044: astore 7
      // 046: aload 3
      // 047: aload 7
      // 049: invokevirtual java/awt/Container.removeMouseListener (Ljava/awt/event/MouseListener;)V
      // 04c: iinc 6 1
      // 04f: aload 1
      // 050: ifnonnull 1b0
      // 053: aload 1
      // 054: ifnull 038
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 3
      // 05f: invokevirtual java/awt/Container.getMouseMotionListeners ()[Ljava/awt/event/MouseMotionListener;
      // 062: astore 4
      // 064: aload 4
      // 066: arraylength
      // 067: istore 5
      // 069: bipush 0
      // 06a: istore 6
      // 06c: iload 6
      // 06e: iload 5
      // 070: if_icmpge 092
      // 073: aload 4
      // 075: iload 6
      // 077: aaload
      // 078: astore 7
      // 07a: aload 3
      // 07b: aload 7
      // 07d: invokevirtual java/awt/Container.removeMouseMotionListener (Ljava/awt/event/MouseMotionListener;)V
      // 080: iinc 6 1
      // 083: aload 1
      // 084: ifnonnull 1b0
      // 087: aload 1
      // 088: ifnull 06c
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: aload 3
      // 093: invokevirtual java/awt/Container.getMouseWheelListeners ()[Ljava/awt/event/MouseWheelListener;
      // 096: astore 4
      // 098: aload 4
      // 09a: arraylength
      // 09b: istore 5
      // 09d: bipush 0
      // 09e: istore 6
      // 0a0: iload 6
      // 0a2: iload 5
      // 0a4: if_icmpge 0c6
      // 0a7: aload 4
      // 0a9: iload 6
      // 0ab: aaload
      // 0ac: astore 7
      // 0ae: aload 3
      // 0af: aload 7
      // 0b1: invokevirtual java/awt/Container.removeMouseWheelListener (Ljava/awt/event/MouseWheelListener;)V
      // 0b4: iinc 6 1
      // 0b7: aload 1
      // 0b8: ifnonnull 1b0
      // 0bb: aload 1
      // 0bc: ifnull 0a0
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 3
      // 0c7: invokevirtual java/awt/Container.getKeyListeners ()[Ljava/awt/event/KeyListener;
      // 0ca: astore 4
      // 0cc: aload 4
      // 0ce: arraylength
      // 0cf: istore 5
      // 0d1: bipush 0
      // 0d2: istore 6
      // 0d4: iload 6
      // 0d6: iload 5
      // 0d8: if_icmpge 0fa
      // 0db: aload 4
      // 0dd: iload 6
      // 0df: aaload
      // 0e0: astore 7
      // 0e2: aload 3
      // 0e3: aload 7
      // 0e5: invokevirtual java/awt/Container.removeKeyListener (Ljava/awt/event/KeyListener;)V
      // 0e8: iinc 6 1
      // 0eb: aload 1
      // 0ec: ifnonnull 1b0
      // 0ef: aload 1
      // 0f0: ifnull 0d4
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: invokevirtual java/awt/Container.getComponentListeners ()[Ljava/awt/event/ComponentListener;
      // 0fe: astore 4
      // 100: aload 4
      // 102: arraylength
      // 103: istore 5
      // 105: bipush 0
      // 106: istore 6
      // 108: iload 6
      // 10a: iload 5
      // 10c: if_icmpge 12e
      // 10f: aload 4
      // 111: iload 6
      // 113: aaload
      // 114: astore 7
      // 116: aload 3
      // 117: aload 7
      // 119: invokevirtual java/awt/Container.removeComponentListener (Ljava/awt/event/ComponentListener;)V
      // 11c: iinc 6 1
      // 11f: aload 1
      // 120: ifnonnull 1b0
      // 123: aload 1
      // 124: ifnull 108
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 3
      // 12f: invokevirtual java/awt/Container.getContainerListeners ()[Ljava/awt/event/ContainerListener;
      // 132: astore 4
      // 134: aload 4
      // 136: arraylength
      // 137: istore 5
      // 139: bipush 0
      // 13a: istore 6
      // 13c: iload 6
      // 13e: iload 5
      // 140: if_icmpge 162
      // 143: aload 4
      // 145: iload 6
      // 147: aaload
      // 148: astore 7
      // 14a: aload 3
      // 14b: aload 7
      // 14d: invokevirtual java/awt/Container.removeContainerListener (Ljava/awt/event/ContainerListener;)V
      // 150: iinc 6 1
      // 153: aload 1
      // 154: ifnonnull 1b0
      // 157: aload 1
      // 158: ifnull 13c
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 3
      // 163: aload 1
      // 164: ifnonnull 17c
      // 167: instanceof javax/swing/JComponent
      // 16a: ifeq 1b0
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: aload 3
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: checkcast javax/swing/JComponent
      // 17f: astore 4
      // 181: aload 4
      // 183: invokevirtual javax/swing/JComponent.getAncestorListeners ()[Ljavax/swing/event/AncestorListener;
      // 186: astore 5
      // 188: aload 5
      // 18a: arraylength
      // 18b: istore 6
      // 18d: bipush 0
      // 18e: istore 7
      // 190: iload 7
      // 192: iload 6
      // 194: if_icmpge 1b0
      // 197: aload 5
      // 199: iload 7
      // 19b: aaload
      // 19c: astore 8
      // 19e: aload 4
      // 1a0: aload 8
      // 1a2: invokevirtual javax/swing/JComponent.removeAncestorListener (Ljavax/swing/event/AncestorListener;)V
      // 1a5: iinc 7 1
      // 1a8: aload 1
      // 1a9: ifnonnull 00e
      // 1ac: aload 1
      // 1ad: ifnull 190
      // 1b0: aload 1
      // 1b1: ifnull 00e
      // 1b4: return
   }

   public static List I(Container var0) {
      return A(var0, new ArrayList());
   }

   public static List A(Container param0, List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 07: pop
      // 08: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 0b: aload 0
      // 0c: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 0f: astore 3
      // 10: astore 2
      // 11: aload 3
      // 12: arraylength
      // 13: istore 4
      // 15: bipush 0
      // 16: istore 5
      // 18: iload 5
      // 1a: iload 4
      // 1c: if_icmpge 50
      // 1f: aload 3
      // 20: iload 5
      // 22: aaload
      // 23: astore 6
      // 25: aload 2
      // 26: ifnonnull 4c
      // 29: aload 6
      // 2b: instanceof java/awt/Container
      // 2e: ifeq 49
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 6
      // 3a: checkcast java/awt/Container
      // 3d: aload 1
      // 3e: invokestatic com/finalshell/core/FN.A (Ljava/awt/Container;Ljava/util/List;)Ljava/util/List;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: iinc 5 1
      // 4c: aload 2
      // 4d: ifnull 18
      // 50: aload 1
      // 51: areturn
   }

   public static Component L(Component param0, int param1, int param2) {
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
      // 04: iload 1
      // 05: iload 2
      // 06: invokevirtual java/awt/Component.getComponentAt (II)Ljava/awt/Component;
      // 09: astore 4
      // 0b: astore 3
      // 0c: aload 4
      // 0e: aload 3
      // 0f: ifnonnull 3f
      // 12: aload 0
      // 13: if_acmpeq 37
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 4
      // 1f: aload 3
      // 20: ifnonnull 42
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: instanceof java/awt/Container
      // 2d: ifne 40
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: areturn
      // 40: aload 4
      // 42: invokevirtual java/awt/Component.getBounds ()Ljava/awt/Rectangle;
      // 45: astore 5
      // 47: aload 4
      // 49: iload 1
      // 4a: aload 5
      // 4c: getfield java/awt/Rectangle.x I
      // 4f: isub
      // 50: iload 2
      // 51: aload 5
      // 53: getfield java/awt/Rectangle.y I
      // 56: isub
      // 57: invokestatic com/finalshell/core/FN.L (Ljava/awt/Component;II)Ljava/awt/Component;
      // 5a: areturn
   }

   public static void g(Frame var0, Frame var1) {
      var0.addWindowListener(new com.finalshell.ui.listener.HL(var1, var0));
      var1.addWindowListener(new K8(var0, var1));
      var0.setVisible(true);

      try {
         new Y22(var0).z();
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   public static ButtonGroup n(Container var0) {
      return G(var0, false);
   }

   public static ButtonGroup G(Container var0, boolean var1) {
      ButtonGroup var2 = new ButtonGroup();
      F(var0, var1, var2);
      return var2;
   }

   public static void F(Container param0, boolean param1, ButtonGroup param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 04: astore 4
      // 06: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 09: aload 4
      // 0b: arraylength
      // 0c: istore 5
      // 0e: bipush 0
      // 0f: istore 6
      // 11: astore 3
      // 12: iload 6
      // 14: iload 5
      // 16: if_icmpge 75
      // 19: aload 4
      // 1b: iload 6
      // 1d: aaload
      // 1e: astore 7
      // 20: aload 7
      // 22: instanceof javax/swing/AbstractButton
      // 25: aload 3
      // 26: ifnonnull 44
      // 29: ifeq 43
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 2
      // 34: aload 7
      // 36: checkcast javax/swing/AbstractButton
      // 39: invokevirtual javax/swing/ButtonGroup.add (Ljavax/swing/AbstractButton;)V
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: iload 1
      // 44: aload 3
      // 45: ifnonnull 5e
      // 48: ifeq 6e
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 7
      // 54: instanceof java/awt/Container
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: ifeq 6e
      // 61: aload 0
      // 62: bipush 1
      // 63: invokestatic com/finalshell/core/FN.G (Ljava/awt/Container;Z)Ljavax/swing/ButtonGroup;
      // 66: pop
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: iinc 6 1
      // 71: aload 3
      // 72: ifnull 12
      // 75: return
   }

   public static ButtonGroup n(AbstractButton[] var0) {
      ButtonGroup var1 = new ButtonGroup();
      O(var1, var0);
      return var1;
   }

   public static void O(ButtonGroup var0, AbstractButton[] var1) {
      int var5;
      AbstractButton[] var3 = var1;
      int var4 = var1.length;
      String var10000 = FV_2.D();
      var5 = 0;
      String var2 = var10000;

      while (var5 < var4) {
         AbstractButton var6 = var3[var5];
         var0.add(var6);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   public static void y(Component var0, Component var1) {
      ComponentOrientation var2 = var0.getComponentOrientation();

      try {
         if (var2.isLeftToRight() != var1.getComponentOrientation().isLeftToRight()) {
            var1.applyComponentOrientation(var2);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   public static void D() {
      T(A9.t());
   }

   public static void T(ComponentOrientation param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/awt/Window.getWindows ()[Ljava/awt/Window;
      // 03: astore 2
      // 04: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: astore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 64
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: aload 5
      // 1c: aload 0
      // 1d: invokevirtual java/awt/Window.applyComponentOrientation (Ljava/awt/ComponentOrientation;)V
      // 20: aload 5
      // 22: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 25: astore 6
      // 27: aload 1
      // 28: ifnonnull 58
      // 2b: aload 6
      // 2d: ifnull 4c
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 6
      // 39: invokevirtual javax/swing/JRootPane.revalidate ()V
      // 3c: aload 6
      // 3e: invokevirtual javax/swing/JRootPane.repaint ()V
      // 41: aload 1
      // 42: ifnull 5d
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 5
      // 4e: invokevirtual java/awt/Window.invalidate ()V
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 5
      // 5a: invokevirtual java/awt/Window.repaint ()V
      // 5d: iinc 4 1
      // 60: aload 1
      // 61: ifnull 0e
      // 64: return
   }

   public static void Y(Component var0) {
      U(var0, false);
   }

   public static void U(Component param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: invokestatic com/finalshell/core/A9.t ()Ljava/awt/ComponentOrientation;
      // 06: astore 3
      // 07: astore 2
      // 08: iload 1
      // 09: aload 2
      // 0a: ifnonnull 22
      // 0d: ifne 2c
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 3
      // 18: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual java/awt/Component.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 26: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 29: if_icmpeq 38
      // 2c: aload 0
      // 2d: aload 3
      // 2e: invokevirtual java/awt/Component.setComponentOrientation (Ljava/awt/ComponentOrientation;)V
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: return
   }

   public static void M(Component var0) {
      Q(var0, false);
   }

   public static void Q(Component param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: invokestatic com/finalshell/core/A9.t ()Ljava/awt/ComponentOrientation;
      // 06: astore 3
      // 07: astore 2
      // 08: iload 1
      // 09: aload 2
      // 0a: ifnonnull 22
      // 0d: ifne 2c
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 3
      // 18: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual java/awt/Component.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 26: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 29: if_icmpeq 38
      // 2c: aload 0
      // 2d: aload 3
      // 2e: invokevirtual java/awt/Component.applyComponentOrientation (Ljava/awt/ComponentOrientation;)V
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: return
   }

   public static int f(Component[] var0) {
      int var5;
      int var7;
      int var2 = 0;
      String var10000 = FV_2.D();
      Component[] var3 = var0;
      String var1 = var10000;
      int var4 = var0.length;
      var5 = 0;

      while (true) {
         if (var5 < var4) {
            Component var6 = var3[var5];
            var7 = Math.max(var2, var6.getPreferredSize().width);
            if (var1 != null) {
               break;
            }

            var2 = var7;
            var5++;
            if (var1 == null) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static int T(Component[] var0) {
      int var5;
      int var7;
      String var10000 = FV_2.D();
      int var2 = 0;
      String var1 = var10000;
      Component[] var3 = var0;
      int var4 = var0.length;
      var5 = 0;

      while (true) {
         if (var5 < var4) {
            Component var6 = var3[var5];
            var7 = Math.max(var2, var6.getPreferredSize().height);
            if (var1 != null) {
               break;
            }

            var2 = var7;
            var5++;
            if (var1 == null) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static boolean u(Window param0) {
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
      // 06: ifnonnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1d: invokevirtual java/lang/Class.getCanonicalName ()Ljava/lang/String;
      // 20: astore 2
      // 21: aload 2
      // 22: aload 1
      // 23: ifnonnull 31
      // 26: ifnull 4f
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 2
      // 31: sipush 11279
      // 34: sipush -6986
      // 37: invokestatic com/finalshell/core/FN.a (II)Ljava/lang/String;
      // 3a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3d: aload 1
      // 3e: ifnonnull 4c
      // 41: ifeq 4f
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   public static Container B(Component param0, java.lang.Class param1) {
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
      // 04: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 1
      // 0a: aload 3
      // 0b: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 0e: ifne 34
      // 11: aload 3
      // 12: aload 2
      // 13: ifnonnull 38
      // 16: aload 2
      // 17: ifnonnull 38
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: ifnull 34
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 3
      // 2c: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 2f: astore 3
      // 30: aload 2
      // 31: ifnull 09
      // 34: aload 3
      // 35: checkcast java/awt/Container
      // 38: areturn
   }

   public static Component C(Container var0, java.lang.Class var1) {
      return q(var0, var1, false);
   }

   public static Component q(Container param0, java.lang.Class param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 4
      // 06: astore 3
      // 07: iload 4
      // 09: aload 0
      // 0a: invokevirtual java/awt/Container.getComponentCount ()I
      // 0d: if_icmpge 8d
      // 10: aload 0
      // 11: iload 4
      // 13: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 16: astore 5
      // 18: aload 1
      // 19: aload 5
      // 1b: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 1e: aload 3
      // 1f: ifnonnull 34
      // 22: ifeq 33
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 5
      // 2e: areturn
      // 2f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iload 2
      // 34: aload 3
      // 35: ifnonnull 59
      // 38: ifeq 86
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 5
      // 44: aload 3
      // 45: ifnonnull 6d
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: instanceof java/awt/Container
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: ifeq 86
      // 5c: aload 5
      // 5e: checkcast java/awt/Container
      // 61: aload 1
      // 62: iload 2
      // 63: invokestatic com/finalshell/core/FN.q (Ljava/awt/Container;Ljava/lang/Class;Z)Ljava/awt/Component;
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: astore 6
      // 6f: aload 3
      // 70: ifnonnull 89
      // 73: aload 6
      // 75: ifnull 86
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 6
      // 81: areturn
      // 82: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: iinc 4 1
      // 89: aload 3
      // 8a: ifnull 07
      // 8d: aconst_null
      // 8e: areturn
   }

   public static JComponent V(Component param0) {
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
      // 04: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 39
      // 0e: instanceof javax/swing/JComponent
      // 11: ifeq 38
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 2
      // 1c: checkcast javax/swing/JComponent
      // 1f: astore 3
      // 20: aload 3
      // 21: aload 1
      // 22: ifnonnull 3c
      // 25: invokevirtual javax/swing/JComponent.getTransferHandler ()Ljavax/swing/TransferHandler;
      // 28: ifnull 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: areturn
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 2
      // 39: invokestatic com/finalshell/core/FN.V (Ljava/awt/Component;)Ljavax/swing/JComponent;
      // 3c: areturn
   }

   public static JRootPane a$JRootPane(Component param0) {
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
      // 06: ifnonnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: instanceof javax/swing/JFrame
      // 1d: aload 1
      // 1e: ifnonnull 3b
      // 21: ifeq 37
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: checkcast javax/swing/JFrame
      // 2f: invokevirtual javax/swing/JFrame.getRootPane ()Ljavax/swing/JRootPane;
      // 32: areturn
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: instanceof javax/swing/JDialog
      // 3b: aload 1
      // 3c: ifnonnull 59
      // 3f: ifeq 55
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 0
      // 4a: checkcast javax/swing/JDialog
      // 4d: invokevirtual javax/swing/JDialog.getRootPane ()Ljavax/swing/JRootPane;
      // 50: areturn
      // 51: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: instanceof javax/swing/JWindow
      // 59: aload 1
      // 5a: ifnonnull 77
      // 5d: ifeq 73
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: checkcast javax/swing/JWindow
      // 6b: invokevirtual javax/swing/JWindow.getRootPane ()Ljavax/swing/JRootPane;
      // 6e: areturn
      // 6f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aload 0
      // 74: instanceof javax/swing/JApplet
      // 77: aload 1
      // 78: ifnonnull a0
      // 7b: ifeq 91
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 0
      // 86: checkcast javax/swing/JApplet
      // 89: invokevirtual javax/swing/JApplet.getRootPane ()Ljavax/swing/JRootPane;
      // 8c: areturn
      // 8d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 0
      // 92: aload 1
      // 93: ifnonnull ad
      // 96: instanceof javax/swing/JRootPane
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: ifeq ac
      // a3: aload 0
      // a4: checkcast javax/swing/JRootPane
      // a7: areturn
      // a8: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: aload 0
      // ad: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // b0: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // b3: areturn
   }

   public static Window N() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: invokestatic com/finalshell/core/FN.q ()Ljava/awt/Window;
      // 006: astore 1
      // 007: astore 0
      // 008: aload 1
      // 009: aload 0
      // 00a: ifnonnull 018
      // 00d: ifnull 064
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 1
      // 018: aload 0
      // 019: ifnonnull 063
      // 01c: instanceof javax/swing/JFrame
      // 01f: ifne 05b
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 1
      // 02a: aload 0
      // 02b: ifnonnull 063
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: instanceof javax/swing/JDialog
      // 038: ifne 05b
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 1
      // 043: aload 0
      // 044: ifnonnull 063
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: instanceof javax/swing/JWindow
      // 051: ifeq 064
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 1
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: areturn
      // 064: invokestatic java/awt/Window.getWindows ()[Ljava/awt/Window;
      // 067: astore 2
      // 068: aload 2
      // 069: aload 0
      // 06a: ifnonnull 078
      // 06d: ifnull 116
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 2
      // 078: aload 0
      // 079: ifnonnull 08f
      // 07c: arraylength
      // 07d: ifle 116
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 2
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: astore 3
      // 090: aload 3
      // 091: arraylength
      // 092: istore 4
      // 094: bipush 0
      // 095: istore 5
      // 097: iload 5
      // 099: iload 4
      // 09b: if_icmpge 116
      // 09e: aload 3
      // 09f: iload 5
      // 0a1: aaload
      // 0a2: astore 6
      // 0a4: aload 0
      // 0a5: ifnonnull 112
      // 0a8: aload 6
      // 0aa: invokevirtual java/awt/Window.isShowing ()Z
      // 0ad: ifeq 10f
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 6
      // 0b9: aload 0
      // 0ba: ifnonnull 10e
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: instanceof javax/swing/JFrame
      // 0c7: ifne 105
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 6
      // 0d3: aload 0
      // 0d4: ifnonnull 10e
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: instanceof javax/swing/JDialog
      // 0e1: ifne 105
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: aload 6
      // 0ed: aload 0
      // 0ee: ifnonnull 10e
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: instanceof javax/swing/JWindow
      // 0fb: ifeq 10f
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 6
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: areturn
      // 10f: iinc 5 1
      // 112: aload 0
      // 113: ifnull 097
      // 116: aconst_null
      // 117: areturn
   }

   public static Container r$Container(Component param0) {
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
      // 04: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 23
      // 0e: ifnull 26
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual javax/swing/JRootPane.getContentPane ()Ljava/awt/Container;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: goto 27
      // 26: aconst_null
      // 27: areturn
   }

   public static JLayeredPane b$JLayeredPane(Component var0) {
      String var10000 = FV_2.D();
      JRootPane var2 = a$JRootPane(var0);
      String var1 = var10000;

      try {
         if (var1 != null) {
            return var2.getLayeredPane();
         }

         if (var2 == null) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return var2.getLayeredPane();
   }

   public static Component w(Component param0) {
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
      // 04: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 23
      // 0e: ifnull 26
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual javax/swing/JRootPane.getGlassPane ()Ljava/awt/Component;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: goto 27
      // 26: aconst_null
      // 27: areturn
   }

   public static JComponent A(JComponent var0, int var1) {
      return t(var0, GA.V(var1));
   }

   public static JComponent g(JComponent var0, int var1, int var2, int var3, int var4) {
      return t(var0, GA.C(var1, var2, var3, var4));
   }

   public static JComponent t(JComponent var0, Border var1) {
      var0.setBorder(var1);
      return var0;
   }

   public static boolean k(Component param0) {
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
      // 09: ifnull 41
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 41
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/awt/Font.isPlain ()Z
      // 33: aload 1
      // 34: ifnonnull 42
      // 37: ifeq 45
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static Component A(Component var0) {
      return O(var0, true);
   }

   public static Component O(Component param0, boolean param1) {
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
      // 04: iload 1
      // 05: ifeq 4a
      // 08: aload 0
      // 09: aload 2
      // 0a: ifnonnull 4b
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: ifnull 4a
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: ifnonnull 4b
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 2d: ifnull 4a
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 3c: bipush 0
      // 3d: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 40: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: areturn
   }

   public static boolean U(Component param0) {
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
      // 09: ifnull 45
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 45
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/awt/Font.isBold ()Z
      // 33: aload 1
      // 34: ifnonnull 42
      // 37: ifeq 45
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static Component u(Component var0) {
      return D(var0, true);
   }

   public static Component D(Component param0, boolean param1) {
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
      // 04: iload 1
      // 05: ifeq 4a
      // 08: aload 0
      // 09: aload 2
      // 0a: ifnonnull 4b
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: ifnull 4a
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: ifnonnull 4b
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 2d: ifnull 4a
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 3c: bipush 1
      // 3d: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 40: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: areturn
   }

   public static boolean G(Component param0) {
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
      // 09: ifnull 45
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 45
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/awt/Font.isItalic ()Z
      // 33: aload 1
      // 34: ifnonnull 42
      // 37: ifeq 45
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static Component C(Component var0) {
      return q(var0, true);
   }

   public static Component q(Component param0, boolean param1) {
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
      // 04: iload 1
      // 05: ifeq 4a
      // 08: aload 0
      // 09: aload 2
      // 0a: ifnonnull 4b
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: ifnull 4a
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: ifnonnull 4b
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 2d: ifnull 4a
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 3c: bipush 2
      // 3d: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 40: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: areturn
   }

   public static Component O(Component param0, int param1) {
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
      // 05: aload 2
      // 06: ifnonnull 41
      // 09: ifnull 40
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: ifnonnull 41
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 22: ifnull 40
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 31: iload 1
      // 32: i2f
      // 33: invokevirtual java/awt/Font.deriveFont (F)Ljava/awt/Font;
      // 36: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 0
      // 41: areturn
   }

   public static Component K(Component param0, int param1) {
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
      // 05: aload 2
      // 06: ifnonnull 42
      // 09: ifnull 41
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: ifnonnull 42
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 22: ifnull 41
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 30: astore 3
      // 31: aload 0
      // 32: aload 3
      // 33: aload 3
      // 34: invokevirtual java/awt/Font.getSize ()I
      // 37: i2f
      // 38: iload 1
      // 39: i2f
      // 3a: fadd
      // 3b: invokevirtual java/awt/Font.deriveFont (F)Ljava/awt/Font;
      // 3e: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 41: aload 0
      // 42: areturn
   }

   public static int r$int(Component param0) {
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
      // 09: ifnull 34
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 34
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/awt/Font.getSize ()I
      // 33: ireturn
      // 34: bipush -1
      // 35: ireturn
   }

   public static Component K(Component param0, boolean param1, boolean param2) {
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
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 32
      // 09: ifeq 31
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: iload 2
      // 14: aload 3
      // 15: ifnonnull 32
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: ifeq 31
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 3
      // 2a: goto 5c
      // 2d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: iload 1
      // 32: aload 3
      // 33: ifnonnull 49
      // 36: ifeq 48
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 5c
      // 44: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 2
      // 49: aload 3
      // 4a: ifnonnull 58
      // 4d: ifeq 5b
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: bipush 2
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: istore 4
      // 5e: aload 0
      // 5f: iload 4
      // 61: invokestatic com/finalshell/core/FN.p (Ljava/awt/Component;I)Ljava/awt/Component;
      // 64: areturn
   }

   public static Component p(Component param0, int param1) {
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
      // 05: aload 2
      // 06: ifnonnull 40
      // 09: ifnull 3f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: ifnonnull 40
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 22: ifnull 3f
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 31: iload 1
      // 32: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 35: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: areturn
   }

   public static Component d(Component param0, int param1, boolean param2, boolean param3) {
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
      // 05: iload 2
      // 06: aload 4
      // 08: ifnonnull 35
      // 0b: ifeq 34
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: iload 3
      // 16: aload 4
      // 18: ifnonnull 35
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: ifeq 34
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 3
      // 2d: goto 61
      // 30: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: iload 2
      // 35: aload 4
      // 37: ifnonnull 4d
      // 3a: ifeq 4c
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: bipush 1
      // 45: goto 61
      // 48: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: iload 3
      // 4d: aload 4
      // 4f: ifnonnull 5d
      // 52: ifeq 60
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: bipush 2
      // 5d: goto 61
      // 60: bipush 0
      // 61: istore 5
      // 63: aload 0
      // 64: iload 1
      // 65: iload 5
      // 67: invokestatic com/finalshell/core/FN.m (Ljava/awt/Component;II)Ljava/awt/Component;
      // 6a: areturn
   }

   public static Component m(Component param0, int param1, int param2) {
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
      // 05: aload 3
      // 06: ifnonnull 42
      // 09: ifnull 41
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 3
      // 15: ifnonnull 42
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 22: ifnull 41
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 31: iload 2
      // 32: iload 1
      // 33: i2f
      // 34: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 37: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 0
      // 42: areturn
   }

   public static Component s(Component param0, String param1) {
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
      // 05: aload 2
      // 06: ifnonnull 46
      // 09: ifnull 45
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: ifnonnull 46
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 22: ifnull 45
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 30: astore 3
      // 31: aload 0
      // 32: new java/awt/Font
      // 35: dup
      // 36: aload 1
      // 37: aload 3
      // 38: invokevirtual java/awt/Font.getStyle ()I
      // 3b: aload 3
      // 3c: invokevirtual java/awt/Font.getSize ()I
      // 3f: invokespecial java/awt/Font.<init> (Ljava/lang/String;II)V
      // 42: invokevirtual java/awt/Component.setFont (Ljava/awt/Font;)V
      // 45: aload 0
      // 46: areturn
   }

   public static String b$String(Component param0) {
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
      // 09: ifnull 34
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 34
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getFont ()Ljava/awt/Font;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/awt/Font.getFontName ()Ljava/lang/String;
      // 33: areturn
      // 34: aconst_null
      // 35: areturn
   }

   public static Dimension R(Dimension var0) {
      return new Dimension(var0);
   }

   public static Point B(Point var0) {
      return new Point(var0);
   }

   public static Rectangle l(Rectangle var0) {
      return new Rectangle(var0);
   }

   public static Insets K(Insets var0) {
      return new Insets(var0.top, var0.left, var0.bottom, var0.right);
   }

   public static Color q(Color var0) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var0.getAlpha());
   }

   public static Rectangle N(Component var0) {
      return new Rectangle(0, 0, var0.getWidth(), var0.getHeight());
   }

   public static Rectangle I(Component var0) {
      String var1 = FV_2.D();

      label27: {
         try {
            if (var1 != null) {
               return N(var0);
            }

            if (var0 instanceof JComponent) {
               break label27;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         return N(var0);
      }

      Insets var2 = ((JComponent)var0).getInsets();
      return new Rectangle(var2.left, var2.top, var0.getWidth() - var2.left - var2.right, var0.getHeight() - var2.top - var2.bottom);
   }

   public static Insets Z(Insets param0, Insets param1) {
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
      // 05: aload 2
      // 06: ifnonnull 62
      // 09: ifnull 61
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 62
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: ifnull 61
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: new java/awt/Insets
      // 2c: dup
      // 2d: aload 0
      // 2e: getfield java/awt/Insets.top I
      // 31: aload 1
      // 32: getfield java/awt/Insets.top I
      // 35: invokestatic java/lang/Math.max (II)I
      // 38: aload 0
      // 39: getfield java/awt/Insets.left I
      // 3c: aload 1
      // 3d: getfield java/awt/Insets.left I
      // 40: invokestatic java/lang/Math.max (II)I
      // 43: aload 0
      // 44: getfield java/awt/Insets.bottom I
      // 47: aload 1
      // 48: getfield java/awt/Insets.bottom I
      // 4b: invokestatic java/lang/Math.max (II)I
      // 4e: aload 0
      // 4f: getfield java/awt/Insets.right I
      // 52: aload 1
      // 53: getfield java/awt/Insets.right I
      // 56: invokestatic java/lang/Math.max (II)I
      // 59: invokespecial java/awt/Insets.<init> (IIII)V
      // 5c: areturn
      // 5d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 0
      // 62: aload 2
      // 63: ifnonnull 77
      // 66: ifnull 76
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 0
      // 71: areturn
      // 72: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 1
      // 77: aload 2
      // 78: ifnonnull 86
      // 7b: ifnull 87
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 1
      // 86: areturn
      // 87: aconst_null
      // 88: areturn
   }

   public static Insets Y(Insets param0, Insets param1) {
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
      // 05: aload 2
      // 06: ifnonnull 62
      // 09: ifnull 61
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 62
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: ifnull 61
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: new java/awt/Insets
      // 2c: dup
      // 2d: aload 0
      // 2e: getfield java/awt/Insets.top I
      // 31: aload 1
      // 32: getfield java/awt/Insets.top I
      // 35: invokestatic java/lang/Math.min (II)I
      // 38: aload 0
      // 39: getfield java/awt/Insets.left I
      // 3c: aload 1
      // 3d: getfield java/awt/Insets.left I
      // 40: invokestatic java/lang/Math.min (II)I
      // 43: aload 0
      // 44: getfield java/awt/Insets.bottom I
      // 47: aload 1
      // 48: getfield java/awt/Insets.bottom I
      // 4b: invokestatic java/lang/Math.min (II)I
      // 4e: aload 0
      // 4f: getfield java/awt/Insets.right I
      // 52: aload 1
      // 53: getfield java/awt/Insets.right I
      // 56: invokestatic java/lang/Math.min (II)I
      // 59: invokespecial java/awt/Insets.<init> (IIII)V
      // 5c: areturn
      // 5d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 0
      // 62: aload 2
      // 63: ifnonnull 77
      // 66: ifnull 76
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 0
      // 71: areturn
      // 72: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 1
      // 77: aload 2
      // 78: ifnonnull 86
      // 7b: ifnull 87
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 1
      // 86: areturn
      // 87: aconst_null
      // 88: areturn
   }

   public static Dimension V(Component var0, Component var1) {
      return h(var0.getPreferredSize(), var1.getPreferredSize());
   }

   public static Dimension P(Component[] param0) {
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
      // 06: ifnonnull 1c
      // 09: arraylength
      // 0a: ifle 24
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: aload 0
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: aaload
      // 1e: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 21: goto 2d
      // 24: new java/awt/Dimension
      // 27: dup
      // 28: bipush 0
      // 29: bipush 0
      // 2a: invokespecial java/awt/Dimension.<init> (II)V
      // 2d: astore 2
      // 2e: bipush 1
      // 2f: istore 3
      // 30: iload 3
      // 31: aload 0
      // 32: arraylength
      // 33: if_icmpge 4c
      // 36: aload 2
      // 37: aload 0
      // 38: iload 3
      // 39: aaload
      // 3a: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 3d: invokestatic com/finalshell/core/FN.h (Ljava/awt/Dimension;Ljava/awt/Dimension;)Ljava/awt/Dimension;
      // 40: aload 1
      // 41: ifnonnull 4d
      // 44: astore 2
      // 45: iinc 3 1
      // 48: aload 1
      // 49: ifnull 30
      // 4c: aload 2
      // 4d: areturn
   }

   public static Dimension h(Dimension param0, Dimension param1) {
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
      // 05: aload 2
      // 06: ifnonnull 30
      // 09: ifnonnull 2f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 30
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aconst_null
      // 2a: areturn
      // 2b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 2
      // 31: ifnonnull 45
      // 34: ifnonnull 44
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 1
      // 3f: areturn
      // 40: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 1
      // 45: aload 2
      // 46: ifnonnull 76
      // 49: ifnonnull 59
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 0
      // 54: areturn
      // 55: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: new java/awt/Dimension
      // 5c: dup
      // 5d: aload 0
      // 5e: getfield java/awt/Dimension.width I
      // 61: aload 1
      // 62: getfield java/awt/Dimension.width I
      // 65: invokestatic java/lang/Math.max (II)I
      // 68: aload 0
      // 69: getfield java/awt/Dimension.height I
      // 6c: aload 1
      // 6d: getfield java/awt/Dimension.height I
      // 70: invokestatic java/lang/Math.max (II)I
      // 73: invokespecial java/awt/Dimension.<init> (II)V
      // 76: areturn
   }

   public static Dimension R(Component var0, Component var1) {
      return p(var0.getPreferredSize(), var1.getPreferredSize());
   }

   public static Dimension p(Dimension param0, Dimension param1) {
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
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 22
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 45
      // 18: ifnonnull 28
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: new java/awt/Dimension
      // 2b: dup
      // 2c: aload 0
      // 2d: getfield java/awt/Dimension.width I
      // 30: aload 1
      // 31: getfield java/awt/Dimension.width I
      // 34: invokestatic java/lang/Math.min (II)I
      // 37: aload 0
      // 38: getfield java/awt/Dimension.height I
      // 3b: aload 1
      // 3c: getfield java/awt/Dimension.height I
      // 3f: invokestatic java/lang/Math.min (II)I
      // 42: invokespecial java/awt/Dimension.<init> (II)V
      // 45: areturn
   }

   public static void F(Component var0, boolean var1) {
      s(var0, var1, false);
   }

   public static void s(Component param0, boolean param1, boolean param2) {
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
      // 05: instanceof javax/swing/JComponent
      // 08: aload 3
      // 09: ifnonnull 47
      // 0c: ifeq 38
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast javax/swing/JComponent
      // 1a: astore 4
      // 1c: iload 2
      // 1d: aload 3
      // 1e: ifnonnull 47
      // 21: ifne 38
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 4
      // 2d: iload 1
      // 2e: invokevirtual javax/swing/JComponent.setOpaque (Z)V
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: aload 3
      // 3a: ifnonnull 4b
      // 3d: instanceof java/awt/Container
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: ifeq 77
      // 4a: aload 0
      // 4b: checkcast java/awt/Container
      // 4e: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 51: astore 4
      // 53: aload 4
      // 55: arraylength
      // 56: istore 5
      // 58: bipush 0
      // 59: istore 6
      // 5b: iload 6
      // 5d: iload 5
      // 5f: if_icmpge 77
      // 62: aload 4
      // 64: iload 6
      // 66: aaload
      // 67: astore 7
      // 69: aload 7
      // 6b: iload 1
      // 6c: bipush 0
      // 6d: invokestatic com/finalshell/core/FN.s (Ljava/awt/Component;ZZ)V
      // 70: iinc 6 1
      // 73: aload 3
      // 74: ifnull 5b
      // 77: return
   }

   public static void S(Component var0, boolean var1) {
      X(var0, var1, false);
   }

   public static void X(Component param0, boolean param1, boolean param2) {
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
      // 05: instanceof javax/swing/JComponent
      // 08: aload 3
      // 09: ifnonnull 47
      // 0c: ifeq 38
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast javax/swing/JComponent
      // 1a: astore 4
      // 1c: iload 2
      // 1d: aload 3
      // 1e: ifnonnull 47
      // 21: ifne 38
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 4
      // 2d: iload 1
      // 2e: invokevirtual javax/swing/JComponent.setDoubleBuffered (Z)V
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: aload 3
      // 3a: ifnonnull 4b
      // 3d: instanceof java/awt/Container
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: ifeq 77
      // 4a: aload 0
      // 4b: checkcast java/awt/Container
      // 4e: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 51: astore 4
      // 53: aload 4
      // 55: arraylength
      // 56: istore 5
      // 58: bipush 0
      // 59: istore 6
      // 5b: iload 6
      // 5d: iload 5
      // 5f: if_icmpge 77
      // 62: aload 4
      // 64: iload 6
      // 66: aaload
      // 67: astore 7
      // 69: aload 7
      // 6b: iload 1
      // 6c: bipush 0
      // 6d: invokestatic com/finalshell/core/FN.X (Ljava/awt/Component;ZZ)V
      // 70: iinc 6 1
      // 73: aload 3
      // 74: ifnull 5b
      // 77: return
   }

   public static void g(JComponent var0) {
      var0.putClientProperty(a(11277, -11189), Boolean.TRUE);
   }

   public static void I(JComponent var0) {
      var0.putClientProperty(a(11275, 20638), Boolean.FALSE);
   }

   public static boolean z(Component param0) {
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
      // 05: instanceof javax/swing/JComponent
      // 08: aload 1
      // 09: ifnonnull 6b
      // 0c: ifeq 6a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast javax/swing/JComponent
      // 1a: sipush 11275
      // 1d: sipush 20638
      // 20: invokestatic com/finalshell/core/FN.a (II)Ljava/lang/String;
      // 23: invokevirtual javax/swing/JComponent.getClientProperty (Ljava/lang/Object;)Ljava/lang/Object;
      // 26: astore 2
      // 27: aload 2
      // 28: aload 1
      // 29: ifnonnull 37
      // 2c: ifnull 6a
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 2
      // 37: instanceof java/lang/Boolean
      // 3a: aload 1
      // 3b: ifnonnull 6b
      // 3e: ifeq 6a
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 2
      // 49: checkcast java/lang/Boolean
      // 4c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4f: aload 1
      // 50: ifnonnull 6b
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: ifeq 6a
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: bipush 1
      // 65: ireturn
      // 66: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: bipush 0
      // 6b: ireturn
   }

   public static void o(Component var0, boolean var1) {
      o(var0, var1, false);
   }

   public static void o(Component param0, boolean param1, boolean param2) {
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
      // 05: ifnonnull 0d
      // 08: return
      // 09: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c: athrow
      // 0d: iload 2
      // 0e: aload 3
      // 0f: ifnonnull 2c
      // 12: ifne 28
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: invokevirtual java/awt/Component.setEnabled (Z)V
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 0
      // 29: instanceof java/awt/Container
      // 2c: aload 3
      // 2d: ifnonnull 3b
      // 30: ifeq 90
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: iload 2
      // 3b: aload 3
      // 3c: ifnonnull 5f
      // 3f: ifne 63
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 3
      // 4b: ifnonnull 64
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: invokestatic com/finalshell/core/FN.z (Ljava/awt/Component;)Z
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: ifeq 63
      // 62: return
      // 63: aload 0
      // 64: checkcast java/awt/Container
      // 67: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 6a: astore 4
      // 6c: aload 4
      // 6e: arraylength
      // 6f: istore 5
      // 71: bipush 0
      // 72: istore 6
      // 74: iload 6
      // 76: iload 5
      // 78: if_icmpge 90
      // 7b: aload 4
      // 7d: iload 6
      // 7f: aaload
      // 80: astore 7
      // 82: aload 7
      // 84: iload 1
      // 85: bipush 0
      // 86: invokestatic com/finalshell/core/FN.o (Ljava/awt/Component;ZZ)V
      // 89: iinc 6 1
      // 8c: aload 3
      // 8d: ifnull 74
      // 90: return
   }

   public static List Y(Component var0, boolean var1, boolean var2, Component[] var3) {
      return r(var0, var1, var2, Arrays.asList(var3));
   }

   public static List r(Component var0, boolean var1, boolean var2, List var3) {
      ArrayList var4 = new ArrayList();
      f(var0, var1, var2, var3, var4);
      return var4;
   }

   public static void f(Component param0, boolean param1, boolean param2, List param3, List param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 5
      // 005: iload 1
      // 006: aload 5
      // 008: ifnonnull 023
      // 00b: ifne 067
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 3
      // 016: aload 0
      // 017: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 5
      // 025: ifnonnull 03d
      // 028: ifne 067
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: instanceof javax/swing/JPanel
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 5
      // 03f: ifnonnull 064
      // 042: ifeq 063
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: iload 2
      // 04d: aload 5
      // 04f: ifnonnull 064
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: ifne 067
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: bipush 1
      // 064: goto 068
      // 067: bipush 0
      // 068: istore 6
      // 06a: iload 6
      // 06c: aload 5
      // 06e: ifnonnull 0ae
      // 071: ifeq 0aa
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 0
      // 07c: invokevirtual java/awt/Component.isEnabled ()Z
      // 07f: aload 5
      // 081: ifnonnull 0ae
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: ifeq 0aa
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: aload 0
      // 096: bipush 0
      // 097: invokevirtual java/awt/Component.setEnabled (Z)V
      // 09a: aload 4
      // 09c: aload 0
      // 09d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a2: pop
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: instanceof java/awt/Container
      // 0ae: aload 5
      // 0b0: ifnonnull 0bf
      // 0b3: ifeq 11e
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: iload 6
      // 0bf: aload 5
      // 0c1: ifnonnull 0e5
      // 0c4: ifeq 0e9
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: aload 5
      // 0d1: ifnonnull 0ea
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: invokestatic com/finalshell/core/FN.z (Ljava/awt/Component;)Z
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: ifeq 0e9
      // 0e8: return
      // 0e9: aload 0
      // 0ea: checkcast java/awt/Container
      // 0ed: astore 7
      // 0ef: aload 7
      // 0f1: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 0f4: astore 8
      // 0f6: aload 8
      // 0f8: arraylength
      // 0f9: istore 9
      // 0fb: bipush 0
      // 0fc: istore 10
      // 0fe: iload 10
      // 100: iload 9
      // 102: if_icmpge 11e
      // 105: aload 8
      // 107: iload 10
      // 109: aaload
      // 10a: astore 11
      // 10c: aload 11
      // 10e: bipush 0
      // 10f: iload 2
      // 110: aload 3
      // 111: aload 4
      // 113: invokestatic com/finalshell/core/FN.f (Ljava/awt/Component;ZZLjava/util/List;Ljava/util/List;)V
      // 116: iinc 10 1
      // 119: aload 5
      // 11b: ifnull 0fe
      // 11e: return
   }

   public static void Q(List var0) {
      String var10000 = FV_2.D();
      Iterator var2 = var0.iterator();
      String var1 = var10000;

      while (var2.hasNext()) {
         Component var3 = (Component)var2.next();
         var3.setEnabled(true);
         if (var1 != null) {
            break;
         }
      }
   }

   public static void a(JComponent var0, boolean var1) {
      w(var0, var1, false);
   }

   public static void w(JComponent param0, boolean param1, boolean param2) {
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
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull 20
      // 09: ifne 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: invokevirtual javax/swing/JComponent.setFocusable (Z)V
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: invokevirtual javax/swing/JComponent.getComponentCount ()I
      // 28: if_icmpge 5e
      // 2b: aload 0
      // 2c: iload 4
      // 2e: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 31: aload 3
      // 32: ifnonnull 4f
      // 35: instanceof javax/swing/JComponent
      // 38: ifeq 57
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: iload 4
      // 45: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: checkcast javax/swing/JComponent
      // 52: iload 1
      // 53: bipush 0
      // 54: invokestatic com/finalshell/core/FN.w (Ljavax/swing/JComponent;ZZ)V
      // 57: iinc 4 1
      // 5a: aload 3
      // 5b: ifnull 22
      // 5e: return
   }

   public static void P(Component var0, Color var1) {
      l(var0, var1, false);
   }

   public static void l(Component param0, Color param1, boolean param2) {
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
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull 2e
      // 09: ifne 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual java/awt/Component.setBackground (Ljava/awt/Color;)V
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 3
      // 21: ifnonnull 32
      // 24: instanceof java/awt/Container
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ifeq 5e
      // 31: aload 0
      // 32: checkcast java/awt/Container
      // 35: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 38: astore 4
      // 3a: aload 4
      // 3c: arraylength
      // 3d: istore 5
      // 3f: bipush 0
      // 40: istore 6
      // 42: iload 6
      // 44: iload 5
      // 46: if_icmpge 5e
      // 49: aload 4
      // 4b: iload 6
      // 4d: aaload
      // 4e: astore 7
      // 50: aload 7
      // 52: aload 1
      // 53: bipush 0
      // 54: invokestatic com/finalshell/core/FN.l (Ljava/awt/Component;Ljava/awt/Color;Z)V
      // 57: iinc 6 1
      // 5a: aload 3
      // 5b: ifnull 42
      // 5e: return
   }

   public static void v(JComponent var0, Color var1) {
      z(var0, var1, false);
   }

   public static void z(JComponent param0, Color param1, boolean param2) {
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
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull 20
      // 09: ifne 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual javax/swing/JComponent.setForeground (Ljava/awt/Color;)V
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: invokevirtual javax/swing/JComponent.getComponentCount ()I
      // 28: if_icmpge 5e
      // 2b: aload 0
      // 2c: iload 4
      // 2e: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 31: aload 3
      // 32: ifnonnull 4f
      // 35: instanceof javax/swing/JComponent
      // 38: ifeq 57
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: iload 4
      // 45: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: checkcast javax/swing/JComponent
      // 52: aload 1
      // 53: bipush 0
      // 54: invokestatic com/finalshell/core/FN.z (Ljavax/swing/JComponent;Ljava/awt/Color;Z)V
      // 57: iinc 4 1
      // 5a: aload 3
      // 5b: ifnull 22
      // 5e: return
   }

   public static void j(JComponent var0, Font var1) {
      M(var0, var1, false);
   }

   public static void M(JComponent param0, Font param1, boolean param2) {
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
      // 04: iload 2
      // 05: aload 3
      // 06: ifnonnull 20
      // 09: ifne 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual javax/swing/JComponent.setFont (Ljava/awt/Font;)V
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: invokevirtual javax/swing/JComponent.getComponentCount ()I
      // 28: if_icmpge 5e
      // 2b: aload 0
      // 2c: iload 4
      // 2e: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 31: aload 3
      // 32: ifnonnull 4f
      // 35: instanceof javax/swing/JComponent
      // 38: ifeq 57
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: iload 4
      // 45: invokevirtual javax/swing/JComponent.getComponent (I)Ljava/awt/Component;
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: checkcast javax/swing/JComponent
      // 52: aload 1
      // 53: bipush 0
      // 54: invokestatic com/finalshell/core/FN.M (Ljavax/swing/JComponent;Ljava/awt/Font;Z)V
      // 57: iinc 4 1
      // 5a: aload 3
      // 5b: ifnull 22
      // 5e: return
   }

   public static BufferedImage J(Component var0) {
      return O(var0, var0.getWidth(), var0.getHeight());
   }

   public static BufferedImage p(Component var0, float var1) {
      return s(var0, var0.getWidth(), var0.getHeight(), var1);
   }

   public static BufferedImage O(Component var0, int var1, int var2) {
      return s(var0, var1, var2, 1.0F);
   }

   public static BufferedImage s(Component var0, int var1, int var2, float var3) {
      BufferedImage var5;
      Graphics2D var7;
      String var10000 = FV_2.D();
      var5 = Xg2.g(var1, var2, 3);
      String var4 = var10000;
      if (var0 != null) {
         Graphics2D var6 = var5.createGraphics();
         var0.setSize(var1, var2);
         var0.paintAll(var6);
         var6.dispose();
      }

      label24: {
         try {
            float var11;
            var10 = (var11 = var3 - 1.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var4 != null) {
               break label24;
            }

            if (var10 >= 0) {
               return var5;
            }
         } catch (RuntimeException var8) {
      String var10;
            throw a(var8);
         }

         var10 = var1;
      }

      BufferedImage var9 = Xg2.g(var10, var2, 3);
      var7 = var9.createGraphics();
      RV.p(var7, var3);
      var7.drawImage(var5, 0, 0, null);
      var7.dispose();
      return var9;
   }

   public static void H(JMenuItem param0, com.finalshell.ui.model.Cs2 param1) {
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
      // 09: ifnull 95
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual com/finalshell/ui/model/Cs2.g ()Z
      // 17: aload 2
      // 18: ifnonnull 30
      // 1b: ifeq 95
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual com/finalshell/ui/model/Cs2.I ()Z
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 2
      // 31: ifnonnull 41
      // 34: ifeq 44
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: invokestatic com/finalshell/core/FN.I ()I
      // 41: goto 45
      // 44: bipush 0
      // 45: istore 3
      // 46: aload 1
      // 47: invokevirtual com/finalshell/ui/model/Cs2.p ()Z
      // 4a: aload 2
      // 4b: ifnonnull 61
      // 4e: ifeq 64
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: sipush 10014
      // 5b: ldc2_w 8454854018315867132
      // 5e: invokestatic com/finalshell/core/FN.a (IJ)I
      // 61: goto 65
      // 64: bipush 0
      // 65: istore 4
      // 67: aload 1
      // 68: invokevirtual com/finalshell/ui/model/Cs2.w ()Z
      // 6b: aload 2
      // 6c: ifnonnull 7a
      // 6f: ifeq 7d
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: bipush 1
      // 7a: goto 7e
      // 7d: bipush 0
      // 7e: istore 5
      // 80: aload 0
      // 81: aload 1
      // 82: invokevirtual com/finalshell/ui/model/Cs2.c ()Ljava/lang/Integer;
      // 85: invokevirtual java/lang/Integer.intValue ()I
      // 88: iload 3
      // 89: iload 4
      // 8b: ior
      // 8c: iload 5
      // 8e: ior
      // 8f: invokestatic javax/swing/KeyStroke.getKeyStroke (II)Ljavax/swing/KeyStroke;
      // 92: invokevirtual javax/swing/JMenuItem.setAccelerator (Ljavax/swing/KeyStroke;)V
      // 95: return
   }

   public static Window q() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/awt/Window.getWindows ()[Ljava/awt/Window;
      // 03: astore 1
      // 04: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 07: aconst_null
      // 08: astore 2
      // 09: astore 0
      // 0a: aload 1
      // 0b: astore 3
      // 0c: aload 3
      // 0d: arraylength
      // 0e: istore 4
      // 10: bipush 0
      // 11: istore 5
      // 13: iload 5
      // 15: iload 4
      // 17: if_icmpge 73
      // 1a: aload 3
      // 1b: iload 5
      // 1d: aaload
      // 1e: astore 6
      // 20: aload 0
      // 21: ifnonnull 70
      // 24: aload 6
      // 26: invokevirtual java/awt/Window.isShowing ()Z
      // 29: ifeq 6d
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 6
      // 35: invokevirtual java/awt/Window.isActive ()Z
      // 38: aload 0
      // 39: ifnonnull 64
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ifeq 6d
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 6
      // 4f: aload 0
      // 50: ifnonnull 69
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: invokevirtual java/awt/Window.isFocused ()Z
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: ifeq 6d
      // 67: aload 6
      // 69: astore 2
      // 6a: goto 73
      // 6d: iinc 5 1
      // 70: goto 13
      // 73: aload 2
      // 74: areturn
   }

   public static boolean i(InputEvent var0) {
      String var1 = FV_2.D();

      try {
         int var10000 = var0.getModifiers() & I();
         if (var1 != null) {
            return (var10000 != 0);
         }

         if (var10000 != 0) {
            return (1 != 0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return (0 != 0);
   }

   public static int I() {
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
      // 04: getstatic com/finalshell/core/FN.m Ljava/lang/Integer;
      // 07: aload 0
      // 08: ifnonnull 2b
      // 0b: ifnonnull 28
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 18: invokevirtual java/awt/Toolkit.getMenuShortcutKeyMask ()I
      // 1b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e: putstatic com/finalshell/core/FN.m Ljava/lang/Integer;
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: getstatic com/finalshell/core/FN.m Ljava/lang/Integer;
      // 2b: invokevirtual java/lang/Integer.intValue ()I
      // 2e: ireturn
   }

   public static String k(KeyEvent var0) {
      return N(m(var0), O(var0), y(var0), var0.getKeyCode());
   }

   public static String r(com.finalshell.ui.model.Cs2 var0) {
      return N(var0.I(), var0.p(), var0.w(), var0.c());
   }

   public static String Y(KeyStroke var0) {
      Registry.packArgs(var0);
      long var1 = 329556535328595089L;
      Object var10001 = Ref.h2(329556535328595089L, var1);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static String N(boolean param0, boolean param1, boolean param2, Integer param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 4
      // 005: new java/lang/StringBuilder
      // 008: dup
      // 009: invokespecial java/lang/StringBuilder.<init> ()V
      // 00c: ldc_w ""
      // 00f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 012: iload 0
      // 013: ifeq 065
      // 016: new java/lang/StringBuilder
      // 019: dup
      // 01a: invokespecial java/lang/StringBuilder.<init> ()V
      // 01d: invokestatic com/finalshell/core/FN.I ()I
      // 020: invokestatic java/awt/event/KeyEvent.getKeyModifiersText (I)Ljava/lang/String;
      // 023: aload 4
      // 025: ifnonnull 056
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 032: iload 1
      // 033: ifne 04c
      // 036: iload 2
      // 037: ifne 04c
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 3
      // 042: ifnull 059
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: ldc_w "+"
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: goto 05c
      // 059: ldc_w ""
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 062: goto 068
      // 065: ldc_w ""
      // 068: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06b: iload 1
      // 06c: ifeq 0b9
      // 06f: new java/lang/StringBuilder
      // 072: dup
      // 073: invokespecial java/lang/StringBuilder.<init> ()V
      // 076: sipush 10014
      // 079: ldc2_w 8454854018315867132
      // 07c: invokestatic com/finalshell/core/FN.a (IJ)I
      // 07f: invokestatic java/awt/event/KeyEvent.getKeyModifiersText (I)Ljava/lang/String;
      // 082: aload 4
      // 084: ifnonnull 0aa
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 091: iload 2
      // 092: ifne 0a0
      // 095: aload 3
      // 096: ifnull 0ad
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: ldc_w "+"
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: goto 0b0
      // 0ad: ldc_w ""
      // 0b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b6: goto 0bc
      // 0b9: ldc_w ""
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: iload 2
      // 0c0: ifeq 0fa
      // 0c3: new java/lang/StringBuilder
      // 0c6: dup
      // 0c7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ca: bipush 1
      // 0cb: invokestatic java/awt/event/KeyEvent.getKeyModifiersText (I)Ljava/lang/String;
      // 0ce: aload 4
      // 0d0: ifnonnull 0eb
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 3
      // 0de: ifnull 0ee
      // 0e1: ldc_w "+"
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: goto 0f1
      // 0ee: ldc_w ""
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f7: goto 0fd
      // 0fa: ldc_w ""
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: aload 3
      // 101: aload 4
      // 103: ifnonnull 111
      // 106: ifnull 11a
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 3
      // 111: invokevirtual java/lang/Integer.intValue ()I
      // 114: invokestatic java/awt/event/KeyEvent.getKeyText (I)Ljava/lang/String;
      // 117: goto 11d
      // 11a: ldc_w ""
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 123: areturn
   }

   public static boolean m(InputEvent var0) {
      return k(var0.getModifiers());
   }

   public static boolean k(int var0) {
      String var1 = FV_2.D();

      try {
         int var10000 = var0 & 2;
         if (var1 != null) {
            return (var10000 != 0);
         }

         if (var10000 != 0) {
            return (1 != 0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return (0 != 0);
   }

   public static boolean O(InputEvent var0) {
      return g(var0.getModifiers());
   }

   public static boolean g(int var0) {
      String var1 = FV_2.D();

      try {
         int var10000 = var0 & a(10014, 8454854018315867132L);
         if (var1 != null) {
            return (var10000 != 0);
         }

         if (var10000 != 0) {
            return (1 != 0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return (0 != 0);
   }

   public static boolean y(InputEvent var0) {
      return J(var0.getModifiers());
   }

   public static boolean J(int var0) {
      String var1 = FV_2.D();

      try {
         int var10000 = var0 & 1;
         if (var1 != null) {
            return (var10000 != 0);
         }

         if (var10000 != 0) {
            return (1 != 0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return (0 != 0);
   }

   public static com.finalshell.ui.model.Cs2 h(KeyStroke var0) {
      int var1 = var0.getModifiers();
      return new com.finalshell.ui.model.Cs2(k(var1), g(var1), J(var1), var0.getKeyCode());
   }

   public static Font V() {
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
      // 04: getstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 07: aload 0
      // 08: ifnonnull 29
      // 0b: ifnonnull 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new javax/swing/JLabel
      // 18: dup
      // 19: invokespecial javax/swing/JLabel.<init> ()V
      // 1c: putstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: getstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 29: invokevirtual javax/swing/JLabel.getFont ()Ljava/awt/Font;
      // 2c: areturn
   }

   public static FontMetrics E$FontMetrics() {
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
      // 04: getstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 07: aload 0
      // 08: ifnonnull 29
      // 0b: ifnonnull 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new javax/swing/JLabel
      // 18: dup
      // 19: invokespecial javax/swing/JLabel.<init> ()V
      // 1c: putstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: getstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 29: getstatic com/finalshell/core/FN.y Ljavax/swing/JLabel;
      // 2c: invokevirtual javax/swing/JLabel.getFont ()Ljava/awt/Font;
      // 2f: invokevirtual javax/swing/JLabel.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 32: areturn
   }

   public static JScrollPane a$JScrollPane(Component param0) {
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
      // 09: ifnull 8e
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifnull 8e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 1
      // 31: ifnonnull 4f
      // 34: instanceof javax/swing/JViewport
      // 37: ifeq 8e
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 0
      // 42: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 45: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 1
      // 50: ifnonnull 6b
      // 53: ifnull 8e
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 61: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 1
      // 6c: ifnonnull 8a
      // 6f: instanceof javax/swing/JScrollPane
      // 72: ifeq 8e
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 0
      // 7d: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 80: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: checkcast javax/swing/JScrollPane
      // 8d: areturn
      // 8e: aconst_null
      // 8f: areturn
   }

   public static Component R(Container param0) {
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
      // 04: invokevirtual java/awt/Container.getFocusTraversalPolicy ()Ljava/awt/FocusTraversalPolicy;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 1
      // 0b: ifnonnull 19
      // 0e: ifnull 1e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: aload 0
      // 1a: invokevirtual java/awt/FocusTraversalPolicy.getFirstComponent (Ljava/awt/Container;)Ljava/awt/Component;
      // 1d: areturn
      // 1e: aload 0
      // 1f: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 22: astore 3
      // 23: aload 3
      // 24: arraylength
      // 25: istore 4
      // 27: bipush 0
      // 28: istore 5
      // 2a: iload 5
      // 2c: iload 4
      // 2e: if_icmpge 93
      // 31: aload 3
      // 32: iload 5
      // 34: aaload
      // 35: astore 6
      // 37: aload 6
      // 39: invokevirtual java/awt/Component.isFocusable ()Z
      // 3c: aload 1
      // 3d: ifnonnull 61
      // 40: ifeq 51
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 6
      // 4c: areturn
      // 4d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 6
      // 53: aload 1
      // 54: ifnonnull 73
      // 57: instanceof java/awt/Container
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: ifeq 8c
      // 64: aload 6
      // 66: checkcast java/awt/Container
      // 69: invokestatic com/finalshell/core/FN.R (Ljava/awt/Container;)Ljava/awt/Component;
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: astore 7
      // 75: aload 1
      // 76: ifnonnull 8f
      // 79: aload 7
      // 7b: ifnull 8c
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 7
      // 87: areturn
      // 88: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: iinc 5 1
      // 8f: aload 1
      // 90: ifnull 2a
      // 93: aconst_null
      // 94: areturn
   }

   public static List C(String var0, Component var1) {
      return C(var0, var1, new ArrayList());
   }

   public static List C(String param0, Component param1, List param2) {
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
      // 009: ifnull 028
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aload 0
      // 014: ldc_w ""
      // 017: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01a: aload 3
      // 01b: ifnonnull 039
      // 01e: ifeq 02a
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 2
      // 029: areturn
      // 02a: aload 1
      // 02b: aload 3
      // 02c: ifnonnull 088
      // 02f: instanceof com/finalshell/ui/panel/Kz4
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: ifne 087
      // 03c: aload 1
      // 03d: aload 3
      // 03e: ifnonnull 088
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: instanceof com/finalshell/ui/panel/K42
      // 04b: ifne 087
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 1
      // 056: aload 3
      // 057: ifnonnull 088
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: instanceof com/finalshell/core/Lk4
      // 064: ifne 087
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 1
      // 06f: instanceof com/finalshell/ui/panel/KV3
      // 072: aload 3
      // 073: ifnonnull 0fa
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: ifeq 0ef
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 1
      // 088: checkcast java/awt/Container
      // 08b: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 08e: astore 4
      // 090: aload 4
      // 092: arraylength
      // 093: istore 5
      // 095: bipush 0
      // 096: istore 6
      // 098: iload 6
      // 09a: iload 5
      // 09c: if_icmpge 0eb
      // 09f: aload 4
      // 0a1: iload 6
      // 0a3: aaload
      // 0a4: astore 7
      // 0a6: aload 3
      // 0a7: ifnonnull 0e7
      // 0aa: aload 0
      // 0ab: aload 7
      // 0ad: invokestatic com/finalshell/core/FN.C (Ljava/lang/String;Ljava/awt/Component;)Ljava/util/List;
      // 0b0: aload 3
      // 0b1: ifnonnull 46c
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: invokeinterface java/util/List.size ()I 1
      // 0c0: ifle 0dd
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: aload 2
      // 0cb: aload 1
      // 0cc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0d1: pop
      // 0d2: aload 3
      // 0d3: ifnull 0eb
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: iinc 6 1
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 3
      // 0e8: ifnull 098
      // 0eb: aload 3
      // 0ec: ifnull 466
      // 0ef: aload 1
      // 0f0: instanceof com/finalshell/ui/panel/K32
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: ifnonnull 14b
      // 0fe: ifeq 140
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 0
      // 109: aload 1
      // 10a: checkcast com/finalshell/ui/panel/K32
      // 10d: invokevirtual com/finalshell/ui/panel/K32.g ()Lcom/finalshell/ui/panel/Ky4;
      // 110: invokestatic com/finalshell/core/FN.C (Ljava/lang/String;Ljava/awt/Component;)Ljava/util/List;
      // 113: invokeinterface java/util/List.size ()I 1
      // 118: aload 3
      // 119: ifnonnull 13b
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: ifle 466
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 2
      // 12e: aload 1
      // 12f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: pop
      // 13c: aload 3
      // 13d: ifnull 466
      // 140: aload 1
      // 141: instanceof javax/swing/JComboBox
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: aload 3
      // 14c: ifnonnull 236
      // 14f: ifeq 22b
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: aload 1
      // 15a: checkcast javax/swing/JComboBox
      // 15d: astore 4
      // 15f: aload 4
      // 161: invokevirtual javax/swing/JComboBox.getSelectedItem ()Ljava/lang/Object;
      // 164: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 167: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 16a: aload 0
      // 16b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 16e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 171: aload 3
      // 172: ifnonnull 19e
      // 175: ifeq 192
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 2
      // 180: aload 1
      // 181: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 186: pop
      // 187: aload 3
      // 188: ifnull 227
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: aload 4
      // 194: invokevirtual javax/swing/JComboBox.isEditable ()Z
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: aload 3
      // 19f: ifnonnull 20a
      // 1a2: ifeq 1e7
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: aload 4
      // 1af: invokevirtual javax/swing/JComboBox.getEditor ()Ljavax/swing/ComboBoxEditor;
      // 1b2: invokeinterface javax/swing/ComboBoxEditor.getEditorComponent ()Ljava/awt/Component; 1
      // 1b7: invokestatic com/finalshell/core/FN.C (Ljava/lang/String;Ljava/awt/Component;)Ljava/util/List;
      // 1ba: invokeinterface java/util/List.size ()I 1
      // 1bf: aload 3
      // 1c0: ifnonnull 1e2
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: ifle 227
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: aload 2
      // 1d5: aload 1
      // 1d6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1db: goto 1e2
      // 1de: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e1: athrow
      // 1e2: pop
      // 1e3: aload 3
      // 1e4: ifnull 227
      // 1e7: aload 0
      // 1e8: aload 4
      // 1ea: invokevirtual javax/swing/JComboBox.getRenderer ()Ljavax/swing/ListCellRenderer;
      // 1ed: aconst_null
      // 1ee: aload 4
      // 1f0: invokevirtual javax/swing/JComboBox.getSelectedItem ()Ljava/lang/Object;
      // 1f3: bipush -1
      // 1f4: bipush 1
      // 1f5: bipush 1
      // 1f6: invokeinterface javax/swing/ListCellRenderer.getListCellRendererComponent (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component; 6
      // 1fb: invokestatic com/finalshell/core/FN.C (Ljava/lang/String;Ljava/awt/Component;)Ljava/util/List;
      // 1fe: invokeinterface java/util/List.size ()I 1
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 3
      // 20b: ifnonnull 226
      // 20e: ifle 227
      // 211: goto 218
      // 214: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: aload 2
      // 219: aload 1
      // 21a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 21f: goto 226
      // 222: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 225: athrow
      // 226: pop
      // 227: aload 3
      // 228: ifnull 466
      // 22b: aload 1
      // 22c: instanceof javax/swing/JSpinner
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 235: athrow
      // 236: aload 3
      // 237: ifnonnull 28b
      // 23a: ifeq 280
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 243: athrow
      // 244: aload 1
      // 245: checkcast javax/swing/JSpinner
      // 248: invokevirtual javax/swing/JSpinner.getValue ()Ljava/lang/Object;
      // 24b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 24e: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 251: aload 0
      // 252: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 255: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 258: aload 3
      // 259: ifnonnull 27b
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: ifeq 466
      // 266: goto 26d
      // 269: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: aload 2
      // 26e: aload 1
      // 26f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27a: athrow
      // 27b: pop
      // 27c: aload 3
      // 27d: ifnull 466
      // 280: aload 1
      // 281: instanceof javax/swing/JLabel
      // 284: goto 28b
      // 287: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28a: athrow
      // 28b: aload 3
      // 28c: ifnonnull 2dd
      // 28f: ifeq 2d2
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: aload 1
      // 29a: checkcast javax/swing/JLabel
      // 29d: invokevirtual javax/swing/JLabel.getText ()Ljava/lang/String;
      // 2a0: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2a3: aload 0
      // 2a4: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2a7: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2aa: aload 3
      // 2ab: ifnonnull 2cd
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: ifeq 466
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: aload 2
      // 2c0: aload 1
      // 2c1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: pop
      // 2ce: aload 3
      // 2cf: ifnull 466
      // 2d2: aload 1
      // 2d3: instanceof javax/swing/AbstractButton
      // 2d6: goto 2dd
      // 2d9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: aload 3
      // 2de: ifnonnull 32f
      // 2e1: ifeq 324
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: aload 1
      // 2ec: checkcast javax/swing/AbstractButton
      // 2ef: invokevirtual javax/swing/AbstractButton.getText ()Ljava/lang/String;
      // 2f2: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2f5: aload 0
      // 2f6: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2f9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2fc: aload 3
      // 2fd: ifnonnull 31f
      // 300: goto 307
      // 303: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 306: athrow
      // 307: ifeq 466
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 310: athrow
      // 311: aload 2
      // 312: aload 1
      // 313: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31e: athrow
      // 31f: pop
      // 320: aload 3
      // 321: ifnull 466
      // 324: aload 1
      // 325: instanceof javax/swing/text/JTextComponent
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32e: athrow
      // 32f: aload 3
      // 330: ifnonnull 3ee
      // 333: ifeq 3e3
      // 336: goto 33d
      // 339: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: aload 1
      // 33e: checkcast javax/swing/text/JTextComponent
      // 341: aload 3
      // 342: ifnonnull 36e
      // 345: goto 34c
      // 348: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34b: athrow
      // 34c: invokevirtual javax/swing/text/JTextComponent.getText ()Ljava/lang/String;
      // 34f: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 352: aload 0
      // 353: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 356: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 359: ifeq 466
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 362: athrow
      // 363: aload 1
      // 364: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 367: goto 36e
      // 36a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36d: athrow
      // 36e: aload 3
      // 36f: ifnonnull 38a
      // 372: ifnull 3d0
      // 375: goto 37c
      // 378: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37b: athrow
      // 37c: aload 1
      // 37d: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 380: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 383: goto 38a
      // 386: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 389: athrow
      // 38a: aload 3
      // 38b: ifnonnull 3a6
      // 38e: ifnull 3d0
      // 391: goto 398
      // 394: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 397: athrow
      // 398: aload 1
      // 399: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 39c: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 39f: goto 3a6
      // 3a2: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a5: athrow
      // 3a6: instanceof javax/swing/JScrollPane
      // 3a9: aload 3
      // 3aa: ifnonnull 3de
      // 3ad: ifeq 3d0
      // 3b0: goto 3b7
      // 3b3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b6: athrow
      // 3b7: aload 2
      // 3b8: aload 1
      // 3b9: invokevirtual java/awt/Component.getParent ()Ljava/awt/Container;
      // 3bc: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 3bf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3c4: pop
      // 3c5: aload 3
      // 3c6: ifnull 466
      // 3c9: goto 3d0
      // 3cc: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: aload 2
      // 3d1: aload 1
      // 3d2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3d7: goto 3de
      // 3da: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dd: athrow
      // 3de: pop
      // 3df: aload 3
      // 3e0: ifnull 466
      // 3e3: aload 1
      // 3e4: instanceof javax/swing/JTabbedPane
      // 3e7: goto 3ee
      // 3ea: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ed: athrow
      // 3ee: aload 3
      // 3ef: ifnonnull 453
      // 3f2: ifeq 448
      // 3f5: goto 3fc
      // 3f8: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fb: athrow
      // 3fc: aload 1
      // 3fd: checkcast javax/swing/JTabbedPane
      // 400: astore 4
      // 402: bipush 0
      // 403: istore 5
      // 405: iload 5
      // 407: aload 4
      // 409: invokevirtual javax/swing/JTabbedPane.getTabCount ()I
      // 40c: if_icmpge 444
      // 40f: aload 3
      // 410: ifnonnull 466
      // 413: aload 4
      // 415: iload 5
      // 417: invokevirtual javax/swing/JTabbedPane.getComponentAt (I)Ljava/awt/Component;
      // 41a: instanceof java/awt/Container
      // 41d: ifeq 43d
      // 420: goto 427
      // 423: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 426: athrow
      // 427: aload 0
      // 428: aload 4
      // 42a: iload 5
      // 42c: invokevirtual javax/swing/JTabbedPane.getComponentAt (I)Ljava/awt/Component;
      // 42f: checkcast java/awt/Container
      // 432: aload 2
      // 433: invokestatic com/finalshell/core/FN.i (Ljava/lang/String;Ljava/awt/Container;Ljava/util/List;)V
      // 436: goto 43d
      // 439: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43c: athrow
      // 43d: iinc 5 1
      // 440: aload 3
      // 441: ifnull 405
      // 444: aload 3
      // 445: ifnull 466
      // 448: aload 1
      // 449: instanceof java/awt/Container
      // 44c: goto 453
      // 44f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 452: athrow
      // 453: ifeq 466
      // 456: aload 0
      // 457: aload 1
      // 458: checkcast java/awt/Container
      // 45b: aload 2
      // 45c: invokestatic com/finalshell/core/FN.i (Ljava/lang/String;Ljava/awt/Container;Ljava/util/List;)V
      // 45f: goto 466
      // 462: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 465: athrow
      // 466: goto 46b
      // 469: astore 4
      // 46b: aload 2
      // 46c: areturn
   }

   public static void i(String var0, Container var1, List var2) {
      String var10000 = FV_2.D();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int var6 = 0;
      String var3 = var10000;

      while (var6 < var5) {
         Component var7 = var4[var6];
         C(var0, var7, var2);
         var6++;
         if (var3 != null) {
            break;
         }
      }
   }

   public static Rectangle f$Rectangle(Component var0) {
      return new Rectangle(var0.getLocationOnScreen(), var0.getSize());
   }

   public static Rectangle O$Rectangle(Component param0) {
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
      // 06: ifnonnull 37
      // 09: instanceof java/awt/Window
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 41
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: instanceof javax/swing/JApplet
      // 25: ifeq 40
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 3a: invokevirtual javax/swing/JRootPane.getBounds ()Ljava/awt/Rectangle;
      // 3d: goto 48
      // 40: aload 0
      // 41: aload 0
      // 42: invokestatic com/finalshell/core/FN.a$JRootPane (Ljava/awt/Component;)Ljavax/swing/JRootPane;
      // 45: invokestatic com/finalshell/core/FN.J (Ljava/awt/Component;Ljava/awt/Component;)Ljava/awt/Rectangle;
      // 48: areturn
   }

   public static Rectangle J(Component var0, Component var1) {
      return new Rectangle(n(var0, var1), var0.getSize());
   }

   public static Point n(Component var0, Component var1) {
      Point var2 = var0.getLocationOnScreen();
      Point var3 = var1.getLocationOnScreen();
      return new Point(var2.x - var3.x, var2.y - var3.y);
   }

   public static boolean q(Component var0, Component var1) {
      try {
         if (L(var0) == L(var1)) {
            return true;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return false;
   }

   public static Map B(Container var0) {
      HashMap var7;
      int var2 = var0.getComponentCount();
      String var10000 = FV_2.D();
      HashMap var3 = new HashMap(var2);
      int var4 = 0;
      String var1 = var10000;

      while (true) {
         if (var4 < var2) {
            Component var5 = var0.getComponent(var4);

            try {
               var7 = var3;
               if (var1 != null) {
                  break;
               }

               var3.put(var5, var5.getPreferredSize());
               var4++;
               if (var1 == null) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw a(var6);
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public static void b(Component[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/awt/Dimension
      // 03: dup
      // 04: bipush 0
      // 05: bipush 0
      // 06: invokespecial java/awt/Dimension.<init> (II)V
      // 09: astore 2
      // 0a: aload 0
      // 0b: astore 3
      // 0c: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 0f: aload 3
      // 10: arraylength
      // 11: istore 4
      // 13: astore 1
      // 14: bipush 0
      // 15: istore 5
      // 17: iload 5
      // 19: iload 4
      // 1b: if_icmpge 6d
      // 1e: aload 3
      // 1f: iload 5
      // 21: aaload
      // 22: astore 6
      // 24: aload 1
      // 25: ifnonnull 69
      // 28: aload 6
      // 2a: aload 1
      // 2b: ifnonnull 90
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: ifnull 66
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 6
      // 41: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 44: astore 7
      // 46: aload 2
      // 47: aload 2
      // 48: getfield java/awt/Dimension.width I
      // 4b: aload 7
      // 4d: getfield java/awt/Dimension.width I
      // 50: invokestatic java/lang/Math.max (II)I
      // 53: putfield java/awt/Dimension.width I
      // 56: aload 2
      // 57: aload 2
      // 58: getfield java/awt/Dimension.height I
      // 5b: aload 7
      // 5d: getfield java/awt/Dimension.height I
      // 60: invokestatic java/lang/Math.max (II)I
      // 63: putfield java/awt/Dimension.height I
      // 66: iinc 5 1
      // 69: aload 1
      // 6a: ifnull 17
      // 6d: aload 0
      // 6e: astore 3
      // 6f: aload 3
      // 70: arraylength
      // 71: istore 4
      // 73: bipush 0
      // 74: istore 5
      // 76: iload 5
      // 78: iload 4
      // 7a: if_icmpge a7
      // 7d: aload 3
      // 7e: iload 5
      // 80: aaload
      // 81: astore 6
      // 83: aload 1
      // 84: ifnonnull a3
      // 87: aload 6
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: ifnull a0
      // 93: aload 6
      // 95: aload 2
      // 96: invokevirtual java/awt/Component.setPreferredSize (Ljava/awt/Dimension;)V
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: iinc 5 1
      // a3: aload 1
      // a4: ifnull 76
      // a7: return
   }

   public static void z(Component[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 0
      // 07: astore 3
      // 08: aload 3
      // 09: arraylength
      // 0a: istore 4
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: iload 5
      // 11: iload 4
      // 13: if_icmpge 4b
      // 16: aload 3
      // 17: iload 5
      // 19: aaload
      // 1a: astore 6
      // 1c: aload 1
      // 1d: ifnonnull 47
      // 20: aload 6
      // 22: aload 1
      // 23: ifnonnull 6e
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ifnull 44
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: iload 2
      // 38: aload 6
      // 3a: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 3d: getfield java/awt/Dimension.width I
      // 40: invokestatic java/lang/Math.max (II)I
      // 43: istore 2
      // 44: iinc 5 1
      // 47: aload 1
      // 48: ifnull 0f
      // 4b: aload 0
      // 4c: astore 3
      // 4d: aload 3
      // 4e: arraylength
      // 4f: istore 4
      // 51: bipush 0
      // 52: istore 5
      // 54: iload 5
      // 56: iload 4
      // 58: if_icmpge c5
      // 5b: aload 3
      // 5c: iload 5
      // 5e: aaload
      // 5f: astore 6
      // 61: aload 1
      // 62: ifnonnull c1
      // 65: aload 6
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: ifnull be
      // 71: aload 6
      // 73: aload 1
      // 74: ifnonnull ab
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: instanceof com/finalshell/core/Sa2
      // 81: ifeq a2
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 6
      // 8d: checkcast com/finalshell/core/Sa2
      // 90: iload 2
      // 91: invokeinterface com/finalshell/core/Sa2.O (I)Ljava/awt/Component; 2
      // 96: pop
      // 97: aload 1
      // 98: ifnull be
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: aload 6
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: new java/awt/Dimension
      // ae: dup
      // af: iload 2
      // b0: aload 6
      // b2: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // b5: getfield java/awt/Dimension.height I
      // b8: invokespecial java/awt/Dimension.<init> (II)V
      // bb: invokevirtual java/awt/Component.setPreferredSize (Ljava/awt/Dimension;)V
      // be: iinc 5 1
      // c1: aload 1
      // c2: ifnull 54
      // c5: return
   }

   public static void n(Component[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 0
      // 07: astore 3
      // 08: aload 3
      // 09: arraylength
      // 0a: istore 4
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: iload 5
      // 11: iload 4
      // 13: if_icmpge 4b
      // 16: aload 3
      // 17: iload 5
      // 19: aaload
      // 1a: astore 6
      // 1c: aload 1
      // 1d: ifnonnull 47
      // 20: aload 6
      // 22: aload 1
      // 23: ifnonnull 6e
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ifnull 44
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: iload 2
      // 38: aload 6
      // 3a: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 3d: getfield java/awt/Dimension.height I
      // 40: invokestatic java/lang/Math.max (II)I
      // 43: istore 2
      // 44: iinc 5 1
      // 47: aload 1
      // 48: ifnull 0f
      // 4b: aload 0
      // 4c: astore 3
      // 4d: aload 3
      // 4e: arraylength
      // 4f: istore 4
      // 51: bipush 0
      // 52: istore 5
      // 54: iload 5
      // 56: iload 4
      // 58: if_icmpge c5
      // 5b: aload 3
      // 5c: iload 5
      // 5e: aaload
      // 5f: astore 6
      // 61: aload 1
      // 62: ifnonnull c1
      // 65: aload 6
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: ifnull be
      // 71: aload 6
      // 73: aload 1
      // 74: ifnonnull ab
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: instanceof com/finalshell/core/Sa2
      // 81: ifeq a2
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 6
      // 8d: checkcast com/finalshell/core/Sa2
      // 90: iload 2
      // 91: invokeinterface com/finalshell/core/Sa2.x (I)Ljava/awt/Component; 2
      // 96: pop
      // 97: aload 1
      // 98: ifnull be
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: aload 6
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: new java/awt/Dimension
      // ae: dup
      // af: aload 6
      // b1: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // b4: getfield java/awt/Dimension.width I
      // b7: iload 2
      // b8: invokespecial java/awt/Dimension.<init> (II)V
      // bb: invokevirtual java/awt/Component.setPreferredSize (Ljava/awt/Dimension;)V
      // be: iinc 5 1
      // c1: aload 1
      // c2: ifnull 54
      // c5: return
   }

   public static boolean a(Component param0, Component param1) {
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
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 2
      // 1c: ifnonnull 40
      // 1f: ifnonnull 3f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 1
      // 2a: aload 2
      // 2b: ifnonnull 40
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: ifnonnull 64
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 2
      // 41: ifnonnull 6b
      // 44: ifnull 6a
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 1
      // 4f: aload 2
      // 50: ifnonnull 6b
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: ifnonnull 6a
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: bipush 0
      // 65: ireturn
      // 66: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: instanceof java/awt/Container
      // 6e: aload 2
      // 6f: ifnonnull c7
      // 72: ifeq c6
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 0
      // 7d: checkcast java/awt/Container
      // 80: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 83: astore 3
      // 84: aload 3
      // 85: arraylength
      // 86: istore 4
      // 88: bipush 0
      // 89: istore 5
      // 8b: iload 5
      // 8d: iload 4
      // 8f: if_icmpge c4
      // 92: aload 3
      // 93: iload 5
      // 95: aaload
      // 96: astore 6
      // 98: aload 2
      // 99: ifnonnull c0
      // 9c: aload 6
      // 9e: aload 1
      // 9f: invokestatic com/finalshell/core/FN.a (Ljava/awt/Component;Ljava/awt/Component;)Z
      // a2: aload 2
      // a3: ifnonnull c5
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: ifeq bd
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: bipush 1
      // b8: ireturn
      // b9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: iinc 5 1
      // c0: aload 2
      // c1: ifnull 8b
      // c4: bipush 0
      // c5: ireturn
      // c6: bipush 0
      // c7: ireturn
   }

   public static boolean l(Component param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: invokestatic javax/swing/FocusManager.getCurrentManager ()Ljavax/swing/FocusManager;
      // 06: invokevirtual javax/swing/FocusManager.getFocusOwner ()Ljava/awt/Component;
      // 09: astore 2
      // 0a: astore 1
      // 0b: aload 0
      // 0c: aload 1
      // 0d: ifnonnull 23
      // 10: aload 2
      // 11: if_acmpeq 51
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: instanceof java/awt/Container
      // 26: aload 1
      // 27: ifnonnull 43
      // 2a: ifeq 55
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: checkcast java/awt/Container
      // 38: aload 2
      // 39: invokevirtual java/awt/Container.isAncestorOf (Ljava/awt/Component;)Z
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: ifnonnull 52
      // 47: ifeq 55
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public static boolean v(Container param0) {
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
      // 04: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: arraylength
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 78
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokevirtual java/awt/Component.isFocusable ()Z
      // 20: aload 1
      // 21: ifnonnull 79
      // 24: aload 1
      // 25: ifnonnull 44
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: ifeq 3f
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: bipush 1
      // 3a: ireturn
      // 3b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 5
      // 41: instanceof java/awt/Container
      // 44: aload 1
      // 45: ifnonnull 61
      // 48: ifeq 71
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 5
      // 54: checkcast java/awt/Container
      // 57: invokestatic com/finalshell/core/FN.v (Ljava/awt/Container;)Z
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 1
      // 62: ifnonnull 70
      // 65: ifeq 71
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: bipush 1
      // 70: ireturn
      // 71: iinc 4 1
      // 74: aload 1
      // 75: ifnull 0f
      // 78: bipush 0
      // 79: ireturn
   }

   public static String[] o() {
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
      // 04: getstatic com/finalshell/core/FN.s [Ljava/lang/String;
      // 07: aload 0
      // 08: ifnonnull 28
      // 0b: ifnonnull 25
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic java/awt/GraphicsEnvironment.getLocalGraphicsEnvironment ()Ljava/awt/GraphicsEnvironment;
      // 18: invokevirtual java/awt/GraphicsEnvironment.getAvailableFontFamilyNames ()[Ljava/lang/String;
      // 1b: putstatic com/finalshell/core/FN.s [Ljava/lang/String;
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic com/finalshell/core/FN.s [Ljava/lang/String;
      // 28: areturn
   }

   public static Font[] K() {
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
      // 04: getstatic com/finalshell/core/FN.k [Ljava/awt/Font;
      // 07: aload 0
      // 08: ifnonnull 28
      // 0b: ifnonnull 25
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic com/finalshell/core/FN.o ()[Ljava/lang/String;
      // 18: invokestatic com/finalshell/core/FN.P ([Ljava/lang/String;)[Ljava/awt/Font;
      // 1b: putstatic com/finalshell/core/FN.k [Ljava/awt/Font;
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic com/finalshell/core/FN.k [Ljava/awt/Font;
      // 28: areturn
   }

   public static Font[] P(String[] var0) {
      Font[] var5;
      Font[] var2 = new Font[var0.length];
      String var10000 = FV_2.D();
      int var3 = 0;
      String var1 = var10000;

      while (true) {
         if (var3 < var0.length) {
            try {
               var5 = var2;
               if (var1 != null) {
                  break;
               }

               var2[var3] = new Font(var0[var3], 0, a(718, 7370037866362861103L));
               var3++;
               if (var1 == null) {
                  continue;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public static void u(long var0, Runnable var2) {
      WC_2.n(a(11276, 25934), var0, false, new Wh4(var2));
   }

   public static void J(Wc2 param0, KeyEvent param1) {
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
      // 05: ifnonnull 23
      // 08: invokestatic javax/swing/SwingUtilities.isEventDispatchThread ()Z
      // 0b: ifeq 27
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokeinterface com/finalshell/core/Wc2.j (Ljava/awt/event/KeyEvent;)V 2
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 2
      // 24: ifnull 3a
      // 27: new com/finalshell/task/KL3
      // 2a: dup
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokespecial com/finalshell/task/KL3.<init> (Lcom/finalshell/core/Wc2;Ljava/awt/event/KeyEvent;)V
      // 30: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: return
   }

   public static Insets p(Insets var0) {
      return new Insets(var0.top, var0.right, var0.bottom, var0.left);
   }

   public static Point f$Point(Component var0) {
      Point var1 = MouseInfo.getPointerInfo().getLocation();
      Point var2 = var0.getLocationOnScreen();
      return new Point(var1.x - var2.x, var1.y - var2.y);
   }

   public static void g(JScrollPane param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual javax/swing/JScrollPane.getHorizontalScrollBar ()Ljavax/swing/JScrollBar;
      // 004: astore 4
      // 006: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 009: aload 0
      // 00a: invokevirtual javax/swing/JScrollPane.getVerticalScrollBar ()Ljavax/swing/JScrollBar;
      // 00d: astore 5
      // 00f: astore 3
      // 010: aload 0
      // 011: invokevirtual javax/swing/JScrollPane.getViewport ()Ljavax/swing/JViewport;
      // 014: invokevirtual javax/swing/JViewport.getSize ()Ljava/awt/Dimension;
      // 017: astore 6
      // 019: iload 1
      // 01a: aload 4
      // 01c: invokevirtual javax/swing/JScrollBar.getMaximum ()I
      // 01f: aload 6
      // 021: getfield java/awt/Dimension.width I
      // 024: isub
      // 025: aload 3
      // 026: ifnonnull 044
      // 029: if_icmple 048
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 4
      // 035: invokevirtual javax/swing/JScrollBar.getMaximum ()I
      // 038: aload 6
      // 03a: getfield java/awt/Dimension.width I
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: isub
      // 045: goto 049
      // 048: iload 1
      // 049: istore 1
      // 04a: iload 2
      // 04b: aload 5
      // 04d: invokevirtual javax/swing/JScrollBar.getMaximum ()I
      // 050: aload 6
      // 052: getfield java/awt/Dimension.height I
      // 055: isub
      // 056: aload 3
      // 057: ifnonnull 075
      // 05a: if_icmple 079
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 5
      // 066: invokevirtual javax/swing/JScrollBar.getMaximum ()I
      // 069: aload 6
      // 06b: getfield java/awt/Dimension.height I
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: isub
      // 076: goto 07a
      // 079: iload 2
      // 07a: istore 2
      // 07b: iload 1
      // 07c: aload 3
      // 07d: ifnonnull 08b
      // 080: ifge 08e
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: bipush 0
      // 08b: goto 08f
      // 08e: iload 1
      // 08f: istore 7
      // 091: iload 2
      // 092: aload 3
      // 093: ifnonnull 0a1
      // 096: ifge 0a4
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: bipush 0
      // 0a1: goto 0a5
      // 0a4: iload 2
      // 0a5: istore 8
      // 0a7: aload 4
      // 0a9: invokevirtual javax/swing/JScrollBar.getValue ()I
      // 0ac: aload 3
      // 0ad: ifnonnull 0c4
      // 0b0: iload 7
      // 0b2: if_icmple 0c7
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: bipush -1
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: goto 0c8
      // 0c7: bipush 1
      // 0c8: istore 9
      // 0ca: aload 5
      // 0cc: invokevirtual javax/swing/JScrollBar.getValue ()I
      // 0cf: aload 3
      // 0d0: ifnonnull 0e7
      // 0d3: iload 8
      // 0d5: if_icmple 0ea
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: bipush -1
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: goto 0eb
      // 0ea: bipush 1
      // 0eb: istore 10
      // 0ed: new java/lang/Thread
      // 0f0: dup
      // 0f1: new com/finalshell/task/II3
      // 0f4: dup
      // 0f5: aload 4
      // 0f7: iload 7
      // 0f9: iload 9
      // 0fb: invokespecial com/finalshell/task/II3.<init> (Ljavax/swing/JScrollBar;II)V
      // 0fe: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 101: astore 11
      // 103: aload 11
      // 105: bipush 1
      // 106: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 109: new java/lang/Thread
      // 10c: dup
      // 10d: new com/finalshell/task/QD
      // 110: dup
      // 111: aload 5
      // 113: iload 8
      // 115: iload 10
      // 117: invokespecial com/finalshell/task/QD.<init> (Ljavax/swing/JScrollBar;II)V
      // 11a: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 11d: astore 12
      // 11f: aload 12
      // 121: bipush 1
      // 122: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 125: aload 11
      // 127: invokevirtual java/lang/Thread.start ()V
      // 12a: aload 12
      // 12c: invokevirtual java/lang/Thread.start ()V
      // 12f: return
   }

   public static void W(Graphics var0, String var1, int var2, int var3, int var4) {
      String var5;
      int var8;
      String var10000 = FV_2.D();
      Q(var0, var1, var3, var4);
      var5 = var10000;

      label22: {
         try {
            var8 = var2;
            if (var5 != null) {
               break label22;
            }

            if (var2 < 0) {
               return;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         var8 = var2;
      }

      if (var8 < var1.length()) {
         FontMetrics var6 = var0.getFontMetrics();
         var0.fillRect(var3 + var6.stringWidth(var1.substring(0, var2)), var4 + var6.getDescent() - 1, var6.charWidth(var1.charAt(var2)), 1);
      }
   }

   public static void Q(Graphics var0, String var1, int var2, int var3) {
      var0.drawString(var1, var2, var3);
   }

   public static Map B(Graphics var0) {
      return Y((Graphics2D)var0);
   }

   public static Map Y(Graphics2D var0) {
      return d(var0, GO.e);
   }

   public static Map R(Graphics var0, Map var1) {
      return d((Graphics2D)var0, var1);
   }

   public static Map d(Graphics2D param0, Map param1) {
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
      // 06: ifnonnull 20
      // 09: ifnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: aconst_null
      // 16: invokestatic com/finalshell/core/FN.R (Ljava/awt/Graphics2D;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: astore 3
      // 21: aload 0
      // 22: aload 1
      // 23: invokevirtual java/awt/Graphics2D.addRenderingHints (Ljava/util/Map;)V
      // 26: aload 3
      // 27: areturn
      // 28: aconst_null
      // 29: areturn
   }

   public static void O(Graphics var0, Map var1) {
      k((Graphics2D)var0, var1);
   }

   public static void k(Graphics2D var0, Map var1) {
      try {
         if (var1 != null) {
            var0.addRenderingHints(var1);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }
   }

   public static Map R(Graphics2D param0, Map param1, Map param2) {
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
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 28
      // 09: ifnonnull 20
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/awt/RenderingHints
      // 16: dup
      // 17: aconst_null
      // 18: invokespecial java/awt/RenderingHints.<init> (Ljava/util/Map;)V
      // 1b: astore 2
      // 1c: aload 3
      // 1d: ifnull 2d
      // 20: aload 2
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: invokeinterface java/util/Map.clear ()V 1
      // 2d: aload 1
      // 2e: aload 3
      // 2f: ifnonnull 5f
      // 32: ifnull 57
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: aload 3
      // 3e: ifnonnull 61
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: invokeinterface java/util/Map.size ()I 1
      // 4d: ifne 60
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 2
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: areturn
      // 60: aload 1
      // 61: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 66: astore 4
      // 68: aload 4
      // 6a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 6f: astore 5
      // 71: aload 5
      // 73: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 78: ifeq b9
      // 7b: aload 5
      // 7d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 82: astore 6
      // 84: aload 6
      // 86: checkcast java/awt/RenderingHints$Key
      // 89: astore 7
      // 8b: aload 0
      // 8c: aload 7
      // 8e: invokevirtual java/awt/Graphics2D.getRenderingHint (Ljava/awt/RenderingHints$Key;)Ljava/lang/Object;
      // 91: astore 8
      // 93: aload 8
      // 95: aload 3
      // 96: ifnonnull b4
      // 99: ifnull b5
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: aload 2
      // a4: aload 7
      // a6: aload 8
      // a8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: pop
      // b5: aload 3
      // b6: ifnull 71
      // b9: aload 2
      // ba: areturn
   }

   public static FontMetrics L(JComponent var0, Graphics var1) {
      return P(var0, var1, var1.getFont());
   }

   public static FontMetrics P(JComponent var0, Graphics var1, Font var2) {
      String var3 = FV_2.D();

      try {
         if (var3 != null) {
            return var0.getFontMetrics(var2);
         }

         if (var0 == null) {
            return var1.getFontMetrics(var2);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return var0.getFontMetrics(var2);
   }

   public static int y(FontMetrics param0, String param1) {
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
      // 09: ifnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: ldc_w ""
      // 17: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a: aload 2
      // 1b: ifnonnull 33
      // 1e: ifeq 2e
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
      // 2a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual java/awt/FontMetrics.stringWidth (Ljava/lang/String;)I
      // 33: ireturn
   }

   public static int S(JComponent param0, FontMetrics param1, String param2) {
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
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 2
      // 14: invokevirtual java/lang/String.length ()I
      // 17: aload 3
      // 18: ifnonnull 35
      // 1b: ifne 2b
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: invokevirtual java/lang/String.charAt (I)C
      // 32: invokestatic com/finalshell/core/FN.v (Ljavax/swing/JComponent;Ljava/awt/FontMetrics;C)I
      // 35: ireturn
   }

   public static int v(JComponent var0, FontMetrics var1, char var2) {
      return o(var0, var1, var2, true);
   }

   public static int c(JComponent param0, FontMetrics param1, String param2) {
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
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 2
      // 14: invokevirtual java/lang/String.length ()I
      // 17: aload 3
      // 18: ifnonnull 3a
      // 1b: ifne 2b
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 2
      // 2e: aload 2
      // 2f: invokevirtual java/lang/String.length ()I
      // 32: bipush 1
      // 33: isub
      // 34: invokevirtual java/lang/String.charAt (I)C
      // 37: invokestatic com/finalshell/core/FN.H (Ljavax/swing/JComponent;Ljava/awt/FontMetrics;C)I
      // 3a: ireturn
   }

   public static int H(JComponent var0, FontMetrics var1, char var2) {
      return o(var0, var1, var2, false);
   }

   public static int o(JComponent param0, FontMetrics param1, char param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: ifnonnull 02f
      // 009: aload 0
      // 00a: aload 4
      // 00c: ifnonnull 027
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 0
      // 027: aload 0
      // 028: invokevirtual javax/swing/JComponent.getFont ()Ljava/awt/Font;
      // 02b: invokevirtual javax/swing/JComponent.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 02e: astore 1
      // 02f: ldc com/finalshell/core/FN
      // 031: dup
      // 032: astore 5
      // 034: monitorenter
      // 035: new com/finalshell/core/GE
      // 038: dup
      // 039: aload 1
      // 03a: invokespecial com/finalshell/core/GE.<init> (Ljava/awt/FontMetrics;)V
      // 03d: astore 6
      // 03f: aconst_null
      // 040: astore 7
      // 042: getstatic com/finalshell/core/FN.A [Lcom/finalshell/core/GE;
      // 045: astore 8
      // 047: aload 8
      // 049: arraylength
      // 04a: istore 9
      // 04c: bipush 0
      // 04d: istore 10
      // 04f: iload 10
      // 051: iload 9
      // 053: if_icmpge 080
      // 056: aload 8
      // 058: iload 10
      // 05a: aaload
      // 05b: astore 11
      // 05d: aload 4
      // 05f: ifnonnull 07d
      // 062: aload 6
      // 064: aload 11
      // 066: invokevirtual com/finalshell/core/GE.equals (Ljava/lang/Object;)Z
      // 069: ifeq 07a
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 11
      // 075: astore 7
      // 077: goto 080
      // 07a: iinc 10 1
      // 07d: goto 04f
      // 080: aload 7
      // 082: aload 4
      // 084: ifnonnull 119
      // 087: ifnonnull 117
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: getstatic com/finalshell/core/FN.H Ljava/util/Set;
      // 094: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 099: astore 8
      // 09b: aload 8
      // 09d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a2: ifeq 117
      // 0a5: aload 8
      // 0a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ac: checkcast java/lang/ref/SoftReference
      // 0af: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 0b2: checkcast com/finalshell/core/GE
      // 0b5: astore 9
      // 0b7: aload 9
      // 0b9: aload 4
      // 0bb: ifnonnull 119
      // 0be: aload 4
      // 0c0: ifnonnull 0e9
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: ifnonnull 0e7
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 8
      // 0d6: invokeinterface java/util/Iterator.remove ()V 1
      // 0db: aload 4
      // 0dd: ifnull 09b
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 6
      // 0e9: aload 4
      // 0eb: ifnonnull 103
      // 0ee: aload 9
      // 0f0: invokevirtual com/finalshell/core/GE.equals (Ljava/lang/Object;)Z
      // 0f3: ifeq 10b
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 9
      // 0ff: astore 7
      // 101: aload 7
      // 103: invokestatic com/finalshell/core/FN.h (Lcom/finalshell/core/GE;)V
      // 106: aload 4
      // 108: ifnull 117
      // 10b: aload 4
      // 10d: ifnull 09b
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 7
      // 119: aload 4
      // 11b: ifnonnull 12e
      // 11e: ifnonnull 131
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 6
      // 12a: astore 7
      // 12c: aload 7
      // 12e: invokestatic com/finalshell/core/FN.a (Lcom/finalshell/core/GE;)V
      // 131: iload 3
      // 132: aload 4
      // 134: ifnonnull 14e
      // 137: ifeq 151
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 7
      // 143: iload 2
      // 144: invokevirtual com/finalshell/core/GE.G (C)I
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: goto 157
      // 151: aload 7
      // 153: iload 2
      // 154: invokevirtual com/finalshell/core/GE.g (C)I
      // 157: aload 5
      // 159: monitorexit
      // 15a: ireturn
      // 15b: astore 12
      // 15d: aload 5
      // 15f: monitorexit
      // 160: aload 12
      // 162: athrow
   }

   public static synchronized void a(GE param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/FN.A [Lcom/finalshell/core/GE;
      // 06: getstatic com/finalshell/core/FN.R I
      // 09: aaload
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 2
      // 0d: aload 1
      // 0e: ifnonnull 34
      // 11: ifnull 33
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/FN.H Ljava/util/Set;
      // 1e: new java/lang/ref/SoftReference
      // 21: dup
      // 22: aload 2
      // 23: invokespecial java/lang/ref/SoftReference.<init> (Ljava/lang/Object;)V
      // 26: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2b: pop
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/FN.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: invokestatic com/finalshell/core/FN.h (Lcom/finalshell/core/GE;)V
      // 37: return
   }

   public static synchronized void h(GE var0) {
      A[R] = var0;
      R = (R + 1) % a(19445, 5594446782800183061L);
   }

   public static Thread B(Thread var0) {
      Q = var0;
      return var0;
   }

   public static Thread Z() {
      return Q;
   }

   public static Thread M(Thread var0) {
      P = var0;
      return var0;
   }

   public static Thread E$Thread() {
      return P;
   }

   static {
      __vfClinit__();
   }

   public static void g(boolean var0) {
      h = var0;
   }

   public static boolean W() {
      return h;
   }

   public static boolean n() {
      boolean var0 = W();

      try {
         return !var0;
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ 11279) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 37;
               break;
            case 1:
               var10000 = 4;
               break;
            case 2:
               var10000 = 205;
               break;
            case 3:
               var10000 = 157;
               break;
            case 4:
               var10000 = 247;
               break;
            case 5:
               var10000 = 112;
               break;
            case 6:
               var10000 = 48;
               break;
            case 7:
               var10000 = 162;
               break;
            case 8:
               var10000 = 215;
               break;
            case 9:
               var10000 = 198;
               break;
            case 10:
               var10000 = 196;
               break;
            case 11:
               var10000 = 75;
               break;
            case 12:
               var10000 = 177;
               break;
            case 13:
               var10000 = 62;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 200;
               break;
            case 16:
               var10000 = 94;
               break;
            case 17:
               var10000 = 55;
               break;
            case 18:
               var10000 = 250;
               break;
            case 19:
               var10000 = 240;
               break;
            case 20:
               var10000 = 193;
               break;
            case 21:
               var10000 = 86;
               break;
            case 22:
               var10000 = 234;
               break;
            case 23:
               var10000 = 214;
               break;
            case 24:
               var10000 = 98;
               break;
            case 25:
               var10000 = 102;
               break;
            case 26:
               var10000 = 116;
               break;
            case 27:
               var10000 = 24;
               break;
            case 28:
               var10000 = 179;
               break;
            case 29:
               var10000 = 199;
               break;
            case 30:
               var10000 = 95;
               break;
            case 31:
               var10000 = 202;
               break;
            case 32:
               var10000 = 132;
               break;
            case 33:
               var10000 = 20;
               break;
            case 34:
               var10000 = 249;
               break;
            case 35:
               var10000 = 194;
               break;
            case 36:
               var10000 = 88;
               break;
            case 37:
               var10000 = 103;
               break;
            case 38:
               var10000 = 233;
               break;
            case 39:
               var10000 = 41;
               break;
            case 40:
               var10000 = 23;
               break;
            case 41:
               var10000 = 227;
               break;
            case 42:
               var10000 = 53;
               break;
            case 43:
               var10000 = 71;
               break;
            case 44:
               var10000 = 93;
               break;
            case 45:
               var10000 = 135;
               break;
            case 46:
               var10000 = 208;
               break;
            case 47:
               var10000 = 255;
               break;
            case 48:
               var10000 = 89;
               break;
            case 49:
               var10000 = 149;
               break;
            case 50:
               var10000 = 36;
               break;
            case 51:
               var10000 = 120;
               break;
            case 52:
               var10000 = 40;
               break;
            case 53:
               var10000 = 195;
               break;
            case 54:
               var10000 = 11;
               break;
            case 55:
               var10000 = 15;
               break;
            case 56:
               var10000 = 76;
               break;
            case 57:
               var10000 = 231;
               break;
            case 58:
               var10000 = 90;
               break;
            case 59:
               var10000 = 91;
               break;
            case 60:
               var10000 = 43;
               break;
            case 61:
               var10000 = 96;
               break;
            case 62:
               var10000 = 140;
               break;
            case 63:
               var10000 = 87;
               break;
            case 64:
               var10000 = 79;
               break;
            case 65:
               var10000 = 134;
               break;
            case 66:
               var10000 = 122;
               break;
            case 67:
               var10000 = 49;
               break;
            case 68:
               var10000 = 152;
               break;
            case 69:
               var10000 = 0;
               break;
            case 70:
               var10000 = 228;
               break;
            case 71:
               var10000 = 164;
               break;
            case 72:
               var10000 = 104;
               break;
            case 73:
               var10000 = 192;
               break;
            case 74:
               var10000 = 252;
               break;
            case 75:
               var10000 = 184;
               break;
            case 76:
               var10000 = 18;
               break;
            case 77:
               var10000 = 165;
               break;
            case 78:
               var10000 = 1;
               break;
            case 79:
               var10000 = 70;
               break;
            case 80:
               var10000 = 160;
               break;
            case 81:
               var10000 = 77;
               break;
            case 82:
               var10000 = 34;
               break;
            case 83:
               var10000 = 220;
               break;
            case 84:
               var10000 = 3;
               break;
            case 85:
               var10000 = 111;
               break;
            case 86:
               var10000 = 166;
               break;
            case 87:
               var10000 = 185;
               break;
            case 88:
               var10000 = 5;
               break;
            case 89:
               var10000 = 183;
               break;
            case 90:
               var10000 = 248;
               break;
            case 91:
               var10000 = 163;
               break;
            case 92:
               var10000 = 159;
               break;
            case 93:
               var10000 = 81;
               break;
            case 94:
               var10000 = 59;
               break;
            case 95:
               var10000 = 131;
               break;
            case 96:
               var10000 = 67;
               break;
            case 97:
               var10000 = 66;
               break;
            case 98:
               var10000 = 84;
               break;
            case 99:
               var10000 = 207;
               break;
            case 100:
               var10000 = 209;
               break;
            case 101:
               var10000 = 14;
               break;
            case 102:
               var10000 = 167;
               break;
            case 103:
               var10000 = 254;
               break;
            case 104:
               var10000 = 97;
               break;
            case 105:
               var10000 = 216;
               break;
            case 106:
               var10000 = 141;
               break;
            case 107:
               var10000 = 51;
               break;
            case 108:
               var10000 = 213;
               break;
            case 109:
               var10000 = 45;
               break;
            case 110:
               var10000 = 39;
               break;
            case 111:
               var10000 = 65;
               break;
            case 112:
               var10000 = 236;
               break;
            case 113:
               var10000 = 99;
               break;
            case 114:
               var10000 = 47;
               break;
            case 115:
               var10000 = 161;
               break;
            case 116:
               var10000 = 191;
               break;
            case 117:
               var10000 = 210;
               break;
            case 118:
               var10000 = 136;
               break;
            case 119:
               var10000 = 2;
               break;
            case 120:
               var10000 = 42;
               break;
            case 121:
               var10000 = 92;
               break;
            case 122:
               var10000 = 219;
               break;
            case 123:
               var10000 = 176;
               break;
            case 124:
               var10000 = 241;
               break;
            case 125:
               var10000 = 61;
               break;
            case 126:
               var10000 = 21;
               break;
            case 127:
               var10000 = 251;
               break;
            case 128:
               var10000 = 105;
               break;
            case 129:
               var10000 = 68;
               break;
            case 130:
               var10000 = 203;
               break;
            case 131:
               var10000 = 225;
               break;
            case 132:
               var10000 = 187;
               break;
            case 133:
               var10000 = 224;
               break;
            case 134:
               var10000 = 180;
               break;
            case 135:
               var10000 = 121;
               break;
            case 136:
               var10000 = 238;
               break;
            case 137:
               var10000 = 172;
               break;
            case 138:
               var10000 = 72;
               break;
            case 139:
               var10000 = 27;
               break;
            case 140:
               var10000 = 83;
               break;
            case 141:
               var10000 = 128;
               break;
            case 142:
               var10000 = 139;
               break;
            case 143:
               var10000 = 19;
               break;
            case 144:
               var10000 = 106;
               break;
            case 145:
               var10000 = 211;
               break;
            case 146:
               var10000 = 113;
               break;
            case 147:
               var10000 = 168;
               break;
            case 148:
               var10000 = 29;
               break;
            case 149:
               var10000 = 154;
               break;
            case 150:
               var10000 = 142;
               break;
            case 151:
               var10000 = 129;
               break;
            case 152:
               var10000 = 181;
               break;
            case 153:
               var10000 = 25;
               break;
            case 154:
               var10000 = 28;
               break;
            case 155:
               var10000 = 30;
               break;
            case 156:
               var10000 = 138;
               break;
            case 157:
               var10000 = 114;
               break;
            case 158:
               var10000 = 150;
               break;
            case 159:
               var10000 = 13;
               break;
            case 160:
               var10000 = 9;
               break;
            case 161:
               var10000 = 232;
               break;
            case 162:
               var10000 = 147;
               break;
            case 163:
               var10000 = 137;
               break;
            case 164:
               var10000 = 226;
               break;
            case 165:
               var10000 = 148;
               break;
            case 166:
               var10000 = 109;
               break;
            case 167:
               var10000 = 145;
               break;
            case 168:
               var10000 = 146;
               break;
            case 169:
               var10000 = 101;
               break;
            case 170:
               var10000 = 169;
               break;
            case 171:
               var10000 = 8;
               break;
            case 172:
               var10000 = 204;
               break;
            case 173:
               var10000 = 54;
               break;
            case 174:
               var10000 = 123;
               break;
            case 175:
               var10000 = 171;
               break;
            case 176:
               var10000 = 217;
               break;
            case 177:
               var10000 = 58;
               break;
            case 178:
               var10000 = 173;
               break;
            case 179:
               var10000 = 69;
               break;
            case 180:
               var10000 = 242;
               break;
            case 181:
               var10000 = 229;
               break;
            case 182:
               var10000 = 38;
               break;
            case 183:
               var10000 = 124;
               break;
            case 184:
               var10000 = 117;
               break;
            case 185:
               var10000 = 221;
               break;
            case 186:
               var10000 = 190;
               break;
            case 187:
               var10000 = 100;
               break;
            case 188:
               var10000 = 32;
               break;
            case 189:
               var10000 = 35;
               break;
            case 190:
               var10000 = 63;
               break;
            case 191:
               var10000 = 119;
               break;
            case 192:
               var10000 = 235;
               break;
            case 193:
               var10000 = 85;
               break;
            case 194:
               var10000 = 50;
               break;
            case 195:
               var10000 = 174;
               break;
            case 196:
               var10000 = 56;
               break;
            case 197:
               var10000 = 74;
               break;
            case 198:
               var10000 = 118;
               break;
            case 199:
               var10000 = 82;
               break;
            case 200:
               var10000 = 115;
               break;
            case 201:
               var10000 = 108;
               break;
            case 202:
               var10000 = 16;
               break;
            case 203:
               var10000 = 222;
               break;
            case 204:
               var10000 = 44;
               break;
            case 205:
               var10000 = 60;
               break;
            case 206:
               var10000 = 126;
               break;
            case 207:
               var10000 = 46;
               break;
            case 208:
               var10000 = 80;
               break;
            case 209:
               var10000 = 7;
               break;
            case 210:
               var10000 = 130;
               break;
            case 211:
               var10000 = 151;
               break;
            case 212:
               var10000 = 237;
               break;
            case 213:
               var10000 = 197;
               break;
            case 214:
               var10000 = 243;
               break;
            case 215:
               var10000 = 170;
               break;
            case 216:
               var10000 = 155;
               break;
            case 217:
               var10000 = 31;
               break;
            case 218:
               var10000 = 26;
               break;
            case 219:
               var10000 = 186;
               break;
            case 220:
               var10000 = 127;
               break;
            case 221:
               var10000 = 253;
               break;
            case 222:
               var10000 = 245;
               break;
            case 223:
               var10000 = 143;
               break;
            case 224:
               var10000 = 52;
               break;
            case 225:
               var10000 = 230;
               break;
            case 226:
               var10000 = 175;
               break;
            case 227:
               var10000 = 64;
               break;
            case 228:
               var10000 = 178;
               break;
            case 229:
               var10000 = 246;
               break;
            case 230:
               var10000 = 6;
               break;
            case 231:
               var10000 = 223;
               break;
            case 232:
               var10000 = 107;
               break;
            case 233:
               var10000 = 110;
               break;
            case 234:
               var10000 = 239;
               break;
            case 235:
               var10000 = 244;
               break;
            case 236:
               var10000 = 78;
               break;
            case 237:
               var10000 = 218;
               break;
            case 238:
               var10000 = 188;
               break;
            case 239:
               var10000 = 153;
               break;
            case 240:
               var10000 = 12;
               break;
            case 241:
               var10000 = 33;
               break;
            case 242:
               var10000 = 156;
               break;
            case 243:
               var10000 = 22;
               break;
            case 244:
               var10000 = 189;
               break;
            case 245:
               var10000 = 201;
               break;
            case 246:
               var10000 = 73;
               break;
            case 247:
               var10000 = 182;
               break;
            case 248:
               var10000 = 144;
               break;
            case 249:
               var10000 = 125;
               break;
            case 250:
               var10000 = 206;
               break;
            case 251:
               var10000 = 133;
               break;
            case 252:
               var10000 = 212;
               break;
            case 253:
               var10000 = 17;
               break;
            case 254:
               var10000 = 10;
               break;
            default:
               var10000 = 158;
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
            var8 = var7 % 2;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29920;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var33;
      boolean var5;
      byte[] var7;
      String[] var13 = new String[6];
      int var11 = 0;
      var10 = "\b\u0016djyÐ\u0085\u0096\u008f»\u0019\u0084ÂÚ \u0006Þ\u001f1J¼Û\u0017£\u0092ï«µ\u0087úic\u0092t\u0093\u0092^ñ\u0085)»\u000fësw\u0011ï)\u0002\u0014@\u0097BÈBâG¶\u0005i\u001b)4óDQ-Eîö\u0010\u0080\u0099Ñ\u008ccçÍ²äÀl\u0093WZ\u009aR";
      int var12 = "\b\u0016djyÐ\u0085\u0096\u008f»\u0019\u0084ÂÚ \u0006Þ\u001f1J¼Û\u0017£\u0092ï«µ\u0087úic\u0092t\u0093\u0092^ñ\u0085)»\u000fësw\u0011ï)\u0002\u0014@\u0097BÈBâG¶\u0005i\u001b)4óDQ-Eîö\u0010\u0080\u0099Ñ\u008ccçÍ²äÀl\u0093WZ\u009aR"
         .length();
      g(false);
      char var9 = 17;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 113;
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
                        var65 = 34;
                        break;
                     case 1:
                        var65 = 67;
                        break;
                     case 2:
                        var65 = 94;
                        break;
                     case 3:
                        var65 = 32;
                        break;
                     case 4:
                        var65 = 85;
                        break;
                     case 5:
                        var65 = 41;
                        break;
                     default:
                        var65 = 108;
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
                     a = var13;
                     b = new String[6];
                     long var0 = 7240975162100753556L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "ÈtsHÿÐ\u009b\u008bê`y¹\u0081ÍR¶E\u0083/»¹ñw`\u0083ô¢\nd]ÓÞ";
                     var5 = "ÈtsHÿÐ\u009b\u008bê`y¹\u0081ÍR¶E\u0083/»¹ñw`\u0083ô¢\nd]ÓÞ".length();
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
                                    c = var6;
                                    d = new Integer[6];
                                    m = null;
                                    y = null;
                                    A = new GE[a(29970, 7666754210457092598L)];
                                    R = 0;
                                    H = new HashSet();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = ("´Eã\u001b\"÷¥hYG\u0099°`Ñê°") != 0;
                                 var5 = "´Eã\u001b\"÷¥hYG\u0099°`Ñê°".length();
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

                  var10 = "\u000e0\t¾©®¸½x\u008a6×\u0013®\"xcâ¥\u0080\u001e÷\u0003æpÞT)\u0093^¸»Ùl\u0085°*UÛ\u0004ZLÞ\u0000s\u001e~K2êÏ";
                  var12 = "\u000e0\t¾©®¸½x\u008a6×\u0013®\"xcâ¥\u0080\u001e÷\u0003æpÞT)\u0093^¸»Ùl\u0085°*UÛ\u0004ZLÞ\u0000s\u001e~K2êÏ".length();
                  var9 = 20;
                  var17 = -1;
            }

            var10000 = 30;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





