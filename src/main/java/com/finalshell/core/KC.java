package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Xh2_2;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class KC extends DefaultCellEditor {
   public Ne4 b;
   public com.finalshell.ui.panel.Wb2 O;
   public final Connection4 x;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public KC(Connection4 var1, JTextField var2) {
      super(var2);
      this.x = var1;
      DN var10001 = new DN();
      long var4 = 517915149035093252L;
      DN var3 = var10001;
      Ref.s(517915149035093252L, var3, var4);
      com.finalshell.ui.panel.Wb2 var10002 = new com.finalshell.ui.panel.Wb2();
      long var6 = 321615590296214611L;
      com.finalshell.ui.panel.Wb2 var5 = var10002;
      Ref.s(321615590296214611L, var5, var6);
      Object var7 = 517915149035093252L;
      Ne4 var10003 = (Ne4)Ref.g(517915149035093252L, var7);
      Object var9 = 321615590296214611L;
      this.v((com.finalshell.ui.panel.Wb2)Ref.g(321615590296214611L, var9));
      Object var11 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var11)).setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      Object var13 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var13)).F(0);
      Object var15 = 517915149035093252L;
      Ne4 var10007 = (Ne4)Ref.g(517915149035093252L, var15);
      Object var17 = 321615590296214611L;
      this.v((com.finalshell.ui.panel.Wb2)Ref.g(321615590296214611L, var17));
      Object var19 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var19)).I(0, 0, 1, 0);
      Object var21 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var21)).d(1, 3, 0, 0);
      Object var23 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var23)).addKeyListener(new com.finalshell.ui.listener.Xp2(this));
      Object var25 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var25)).addFocusListener(new com.finalshell.ui.listener.Yt4(this));
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return super.shouldSelectCell(var1);
   }

   @Override
   public Object getCellEditorValue() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 489572751534480599
      // 004: astore 10
      // 006: ldc2_w 489572751534480599
      // 009: aload 10
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: ldc2_w 503294693928161508
      // 011: astore 12
      // 013: ldc2_w 503294693928161508
      // 016: aload 12
      // 018: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 01e: astore 2
      // 01f: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 022: aload 2
      // 023: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 026: astore 3
      // 027: astore 1
      // 028: aload 0
      // 029: ldc2_w 517915149035093252
      // 02c: astore 14
      // 02e: ldc2_w 517915149035093252
      // 031: aload 14
      // 033: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 036: checkcast com/finalshell/core/Ne4
      // 039: invokevirtual com/finalshell/core/Ne4.getText ()Ljava/lang/String;
      // 03c: astore 4
      // 03e: aload 4
      // 040: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 043: astore 4
      // 045: aload 3
      // 046: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 049: ldc com/finalshell/ui/model/Ck4
      // 04b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 04e: aload 1
      // 04f: ifnull 147
      // 052: ifeq 12c
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: aload 3
      // 05d: checkcast com/finalshell/ui/model/Ck4
      // 060: astore 5
      // 062: new java/io/File
      // 065: dup
      // 066: aload 5
      // 068: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06b: ldc2_w 605430732347023634
      // 06e: astore 17
      // 070: astore 16
      // 072: ldc2_w 605430732347023634
      // 075: aload 16
      // 077: aload 17
      // 079: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07c: checkcast java/lang/String
      // 07f: goto 086
      // 082: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 085: athrow
      // 086: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 089: astore 6
      // 08b: new java/io/File
      // 08e: dup
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: aload 6
      // 098: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: getstatic java/io/File.separator Ljava/lang/String;
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: aload 4
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: sipush 7613
      // 0ac: sipush -31259
      // 0af: invokestatic com/finalshell/core/KC.a (II)Ljava/lang/String;
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0bb: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0be: astore 7
      // 0c0: aload 6
      // 0c2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0c5: astore 8
      // 0c7: aload 8
      // 0c9: aload 7
      // 0cb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ce: aload 1
      // 0cf: ifnull 0f1
      // 0d2: ifne 128
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 6
      // 0de: new java/io/File
      // 0e1: dup
      // 0e2: aload 7
      // 0e4: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0e7: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: pop
      // 0f2: aload 0
      // 0f3: ldc2_w 489572751534480599
      // 0f6: astore 18
      // 0f8: ldc2_w 489572751534480599
      // 0fb: aload 18
      // 0fd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 100: aload 8
      // 102: aload 7
      // 104: bipush 1
      // 105: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 108: ldc2_w 548242680714103358
      // 10b: astore 21
      // 10d: astore 20
      // 10f: ldc2_w 548242680714103358
      // 112: aload 20
      // 114: aload 21
      // 116: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 119: checkcast com/finalshell/ui/model/Ck4
      // 11c: goto 123
      // 11f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 122: athrow
      // 123: astore 9
      // 125: aload 9
      // 127: astore 3
      // 128: aload 1
      // 129: ifnonnull 2c8
      // 12c: aload 3
      // 12d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 130: aload 1
      // 131: ifnull 2c9
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: ldc com/finalshell/ui/model/Tf4
      // 13d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: ifeq 2c8
      // 14a: aload 3
      // 14b: checkcast com/finalshell/ui/model/Tf4
      // 14e: astore 5
      // 150: aload 5
      // 152: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 155: ldc2_w 498856411508641826
      // 158: astore 23
      // 15a: astore 22
      // 15c: ldc2_w 498856411508641826
      // 15f: aload 22
      // 161: aload 23
      // 163: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 166: goto 16d
      // 169: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 4
      // 16f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 172: ldc2_w 416107726621374295
      // 175: astore 24
      // 177: ldc2_w 416107726621374295
      // 17a: aload 24
      // 17c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 17f: checkcast java/lang/String
      // 182: goto 189
      // 185: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 188: athrow
      // 189: astore 6
      // 18b: aload 5
      // 18d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 190: ldc2_w 498856411508641826
      // 193: astore 27
      // 195: astore 26
      // 197: ldc2_w 498856411508641826
      // 19a: aload 26
      // 19c: aload 27
      // 19e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a1: checkcast java/lang/String
      // 1a4: goto 1ab
      // 1a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: astore 7
      // 1ad: aload 7
      // 1af: aload 1
      // 1b0: ifnull 2c9
      // 1b3: aload 6
      // 1b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b8: ifne 2c8
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: bipush 1
      // 1c3: istore 8
      // 1c5: aload 1
      // 1c6: ifnull 27b
      // 1c9: aload 5
      // 1cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ce: ldc2_w 490764181082108623
      // 1d1: astore 29
      // 1d3: astore 28
      // 1d5: ldc2_w 490764181082108623
      // 1d8: aload 28
      // 1da: aload 29
      // 1dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1df: checkcast java/lang/Boolean
      // 1e2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e5: goto 1ec
      // 1e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: ifeq 240
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: new java/io/File
      // 1f9: dup
      // 1fa: aload 5
      // 1fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ff: ldc2_w 498856411508641826
      // 202: astore 31
      // 204: astore 30
      // 206: ldc2_w 498856411508641826
      // 209: aload 30
      // 20b: aload 31
      // 20d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 210: checkcast java/lang/String
      // 213: goto 21a
      // 216: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 219: athrow
      // 21a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 21d: astore 9
      // 21f: aload 9
      // 221: new java/io/File
      // 224: dup
      // 225: aload 6
      // 227: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 22a: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 22d: pop
      // 22e: new java/io/File
      // 231: dup
      // 232: aload 6
      // 234: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 237: invokevirtual java/io/File.exists ()Z
      // 23a: istore 8
      // 23c: aload 1
      // 23d: ifnonnull 288
      // 240: aload 0
      // 241: ldc2_w 489572751534480599
      // 244: astore 32
      // 246: ldc2_w 489572751534480599
      // 249: aload 32
      // 24b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24e: ldc2_w 393220934160143516
      // 251: astore 34
      // 253: ldc2_w 393220934160143516
      // 256: aload 34
      // 258: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 25b: aload 7
      // 25d: aload 6
      // 25f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 262: ldc2_w 247777483328047393
      // 265: astore 37
      // 267: astore 36
      // 269: ldc2_w 247777483328047393
      // 26c: aload 36
      // 26e: aload 37
      // 270: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 273: pop
      // 274: goto 27b
      // 277: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27a: athrow
      // 27b: goto 288
      // 27e: astore 9
      // 280: bipush 0
      // 281: istore 8
      // 283: aload 9
      // 285: invokevirtual java/lang/Exception.printStackTrace ()V
      // 288: iload 8
      // 28a: ifeq 2c8
      // 28d: aload 0
      // 28e: ldc2_w 489572751534480599
      // 291: astore 38
      // 293: ldc2_w 489572751534480599
      // 296: aload 38
      // 298: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29b: aload 7
      // 29d: aload 6
      // 29f: aload 4
      // 2a1: bipush 1
      // 2a2: aload 5
      // 2a4: aload 2
      // 2a5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 2a8: ldc2_w 599514589999069238
      // 2ab: astore 41
      // 2ad: astore 40
      // 2af: ldc2_w 599514589999069238
      // 2b2: aload 40
      // 2b4: aload 41
      // 2b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b9: checkcast com/finalshell/ui/model/Tf4
      // 2bc: goto 2c3
      // 2bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: astore 9
      // 2c5: aload 9
      // 2c7: astore 3
      // 2c8: aload 3
      // 2c9: areturn
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Object var7;
      String var10;
      Object var46;
      label64: {
         Object var9;
         label63: {
            Object var13 = 489572751534480599L;
            Ref.g(489572751534480599L, var13);
            long var16 = 503294693928161508L;
            Ref.s(503294693928161508L, var2, var16);
            Connection4.I();
            Object var17 = 489572751534480599L;
            var46 = Ref.g(489572751534480599L, var17);
            Object var19 = 503294693928161508L;
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)Ref.g(503294693928161508L, var19);
            var9 = var8.getUserObject();
            var10 = a(7615, -28835);
            var7 = var46;
            boolean var45 = var9.getClass().equals(com.finalshell.ui.model.Ck4.class);
            if (var7 != null) {
               if (var45) {
                  com.finalshell.ui.model.Ck4 var11 = (com.finalshell.ui.model.Ck4)var9;
                  String var10005 = (String)(Registry.emptyArgs());
                  long var22 = 396085629172753019L;
                  Object[] var21 = var10005;
                  var10005 = Ref.h(396085629172753019L, var21, var22);

                  try {
                     var10005 = (String)var10005;
                  } catch (InvocationTargetException var42) {
                     throw var42.getTargetException();
                  }

                  var10 = var10005;
                  if (var7 != null) {
                     break label63;
                  }
               }

               var46 = var9.getClass();
               if (var7 == null) {
                  break label64;
               }

               var45 = var46.equals(Tf4.class);
            }

            if (var45) {
               Tf4 var43 = (Tf4)var9;
               String var49 = (String)(Registry.emptyArgs());
               long var24 = 179612178163941306L;
               Object[] var23 = var49;
               var49 = Ref.h(179612178163941306L, var23, var24);

               try {
                  var49 = (String)var49;
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               var10 = var49;
            }
         }

         var46 = var9;
      }

      Registry.packArgs(var46);
      long var25 = 205466484628915359L;
      Object var52 = Ref.h2(205466484628915359L, var25);

      try {
         var52 = (Icon)var52;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Icon var44 = (Icon)var52;
      Object var27 = 321615590296214611L;
      ((com.finalshell.ui.panel.Wb2)Ref.g(321615590296214611L, var27)).A(var44);
      Object var29 = 517915149035093252L;
      ((Ne4)Ref.g(517915149035093252L, var29)).setText(var10);
      Object var31 = 517915149035093252L;
      Registry.packArgs(this, ((Ne4)Ref.g(517915149035093252L, var31)).getFont());
      long var33 = 408611976812192060L;
      Object var10009 = Ref.h2(408611976812192060L, var33);

      try {
         var54 = (Integer)var10009;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      int var12 = var54 + a(7878, 5548203170632953656L);
      if (var7 != null) {
         if (var12 < a(7910, 3735743073362767641L)) {
            var12 = a(32106, 8530303197528951959L);
         }

         Object var35 = 517915149035093252L;
         ((Ne4)Ref.g(517915149035093252L, var35)).M(var12);
      }

      Object var37 = 517915149035093252L;
      return (Ne4)Ref.g(517915149035093252L, var37);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      int[] var10000 = Connection4.I();
      byte var3 = 0;
      int[] var2 = var10000;
      EventObject var29 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return true;
         }

         var29 = var1;
      }

      byte var30 = (var29 instanceof MouseEvent) ? 1 : 0;
      if (var2 != null) {
         if (var30 != 0) {
            MouseEvent var4 = (MouseEvent)var1;
            Object var38 = var4.getClickCount();
            if (var2 == null) {
               return (boolean)var38;
            }

            Object var5 = var38;
            Object var8 = 489572751534480599L;
            Ref.g(489572751534480599L, var8);
            DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(((MouseEvent)var1).getPoint()));
            long var11 = 229190360333115919L;
            Object[] var10 = var10002;
            var10002 = Ref.h(229190360333115919L, var10, var11);

            try {
               var10002 = (DefaultMutableTreeNode)var10002;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            DefaultMutableTreeNode var6 = var10002;
            if (var6 != null) {
               Tf4 var7 = (Tf4)var6.getUserObject();
               String var10003 = Registry.emptyArgs();
               long var13 = 498856411508641826L;
               Object[] var12 = var10003;
               var10003 = Ref.h(498856411508641826L, var12, var13);

               try {
                  var10003 = (String)var10003;
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }

               boolean var35 = var10003.contains(a(7614, -20724));
               if (var2 == null) {
                  return (boolean)this;
               }

               if (!var35) {
                  Object[] var10004 = Registry.emptyArgs();
                  long var15 = 498856411508641826L;
                  Object[] var14 = var10004;
                  Registry.packArgs(Ref.h(498856411508641826L, var14, var15));
                  long var16 = 537779894720802184L;
                  Object var10005 = Ref.h2(537779894720802184L, var16);

                  try {
                     var36 = (Boolean)var10005;
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }

                  if (var2 == null) {
                     return (boolean)this;
                  }

                  if (!var36) {
                     Object var18 = 489572751534480599L;
                     Registry.lookupField(417596380711490346L).setInt(Ref.g(489572751534480599L, var18), (int)var5);
                     KC var10006 = (KC)var5;
                     byte var10007 = 1;
                     if (var2 != null) {
                        label73: {
                           if (var5 == null) {
                              var10006 = this;
                              Object var20 = 489572751534480599L;
                              boolean var37 = Registry.lookupField(257707175806650747L).getBoolean(Ref.g(489572751534480599L, var20));
                              if (var2 == null) {
                                 break label73;
                              }

                              if (var37) {
                                 Object var22 = 489572751534480599L;
                                 Registry.lookupField(532071324274744951L).setBoolean(Ref.g(489572751534480599L, var22), false);
                                 var3 = 1;
                                 new Xh2_2(this).start();
                              }
                           }

                           var10006 = (KC)var5;
                        }

                        if (var2 == null) {
                           return (boolean)this;
                        }

                        var10007 = 2;
                     }

                     if (var10006 == var10007) {
                        Object var24 = 489572751534480599L;
                        Registry.lookupField(532071324274744951L).setBoolean(Ref.g(489572751534480599L, var24), true);
                     }
                  }
               }
            }
         }

         var30 = var3;
      }

      return var30 != 0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 7615) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 155;
               break;
            case 1:
               var10000 = 97;
               break;
            case 2:
               var10000 = 166;
               break;
            case 3:
               var10000 = 158;
               break;
            case 4:
               var10000 = 128;
               break;
            case 5:
               var10000 = 54;
               break;
            case 6:
               var10000 = 211;
               break;
            case 7:
               var10000 = 221;
               break;
            case 8:
               var10000 = 48;
               break;
            case 9:
               var10000 = 96;
               break;
            case 10:
               var10000 = 4;
               break;
            case 11:
               var10000 = 244;
               break;
            case 12:
               var10000 = 223;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 240;
               break;
            case 15:
               var10000 = 120;
               break;
            case 16:
               var10000 = 180;
               break;
            case 17:
               var10000 = 56;
               break;
            case 18:
               var10000 = 161;
               break;
            case 19:
               var10000 = 41;
               break;
            case 20:
               var10000 = 123;
               break;
            case 21:
               var10000 = 170;
               break;
            case 22:
               var10000 = 192;
               break;
            case 23:
               var10000 = 172;
               break;
            case 24:
               var10000 = 95;
               break;
            case 25:
               var10000 = 151;
               break;
            case 26:
               var10000 = 80;
               break;
            case 27:
               var10000 = 86;
               break;
            case 28:
               var10000 = 36;
               break;
            case 29:
               var10000 = 15;
               break;
            case 30:
               var10000 = 40;
               break;
            case 31:
               var10000 = 19;
               break;
            case 32:
               var10000 = 127;
               break;
            case 33:
               var10000 = 132;
               break;
            case 34:
               var10000 = 252;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 135;
               break;
            case 37:
               var10000 = 248;
               break;
            case 38:
               var10000 = 238;
               break;
            case 39:
               var10000 = 134;
               break;
            case 40:
               var10000 = 200;
               break;
            case 41:
               var10000 = 27;
               break;
            case 42:
               var10000 = 6;
               break;
            case 43:
               var10000 = 245;
               break;
            case 44:
               var10000 = 26;
               break;
            case 45:
               var10000 = 30;
               break;
            case 46:
               var10000 = 29;
               break;
            case 47:
               var10000 = 165;
               break;
            case 48:
               var10000 = 38;
               break;
            case 49:
               var10000 = 43;
               break;
            case 50:
               var10000 = 126;
               break;
            case 51:
               var10000 = 130;
               break;
            case 52:
               var10000 = 2;
               break;
            case 53:
               var10000 = 108;
               break;
            case 54:
               var10000 = 119;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 246;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 101;
               break;
            case 60:
               var10000 = 249;
               break;
            case 61:
               var10000 = 44;
               break;
            case 62:
               var10000 = 179;
               break;
            case 63:
               var10000 = 143;
               break;
            case 64:
               var10000 = 109;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 174;
               break;
            case 67:
               var10000 = 162;
               break;
            case 68:
               var10000 = 231;
               break;
            case 69:
               var10000 = 42;
               break;
            case 70:
               var10000 = 115;
               break;
            case 71:
               var10000 = 64;
               break;
            case 72:
               var10000 = 94;
               break;
            case 73:
               var10000 = 142;
               break;
            case 74:
               var10000 = 5;
               break;
            case 75:
               var10000 = 217;
               break;
            case 76:
               var10000 = 185;
               break;
            case 77:
               var10000 = 67;
               break;
            case 78:
               var10000 = 197;
               break;
            case 79:
               var10000 = 255;
               break;
            case 80:
               var10000 = 110;
               break;
            case 81:
               var10000 = 189;
               break;
            case 82:
               var10000 = 233;
               break;
            case 83:
               var10000 = 9;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 234;
               break;
            case 86:
               var10000 = 50;
               break;
            case 87:
               var10000 = 198;
               break;
            case 88:
               var10000 = 111;
               break;
            case 89:
               var10000 = 89;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 152;
               break;
            case 92:
               var10000 = 35;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 69;
               break;
            case 95:
               var10000 = 131;
               break;
            case 96:
               var10000 = 28;
               break;
            case 97:
               var10000 = 178;
               break;
            case 98:
               var10000 = 55;
               break;
            case 99:
               var10000 = 31;
               break;
            case 100:
               var10000 = 34;
               break;
            case 101:
               var10000 = 99;
               break;
            case 102:
               var10000 = 133;
               break;
            case 103:
               var10000 = 76;
               break;
            case 104:
               var10000 = 157;
               break;
            case 105:
               var10000 = 122;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 103;
               break;
            case 109:
               var10000 = 153;
               break;
            case 110:
               var10000 = 202;
               break;
            case 111:
               var10000 = 219;
               break;
            case 112:
               var10000 = 52;
               break;
            case 113:
               var10000 = 113;
               break;
            case 114:
               var10000 = 33;
               break;
            case 115:
               var10000 = 195;
               break;
            case 116:
               var10000 = 88;
               break;
            case 117:
               var10000 = 201;
               break;
            case 118:
               var10000 = 199;
               break;
            case 119:
               var10000 = 138;
               break;
            case 120:
               var10000 = 83;
               break;
            case 121:
               var10000 = 228;
               break;
            case 122:
               var10000 = 18;
               break;
            case 123:
               var10000 = 78;
               break;
            case 124:
               var10000 = 176;
               break;
            case 125:
               var10000 = 224;
               break;
            case 126:
               var10000 = 208;
               break;
            case 127:
               var10000 = 21;
               break;
            case 128:
               var10000 = 222;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 47;
               break;
            case 131:
               var10000 = 167;
               break;
            case 132:
               var10000 = 20;
               break;
            case 133:
               var10000 = 144;
               break;
            case 134:
               var10000 = 3;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 226;
               break;
            case 137:
               var10000 = 68;
               break;
            case 138:
               var10000 = 227;
               break;
            case 139:
               var10000 = 106;
               break;
            case 140:
               var10000 = 225;
               break;
            case 141:
               var10000 = 0;
               break;
            case 142:
               var10000 = 214;
               break;
            case 143:
               var10000 = 100;
               break;
            case 144:
               var10000 = 218;
               break;
            case 145:
               var10000 = 59;
               break;
            case 146:
               var10000 = 191;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 236;
               break;
            case 150:
               var10000 = 85;
               break;
            case 151:
               var10000 = 91;
               break;
            case 152:
               var10000 = 190;
               break;
            case 153:
               var10000 = 105;
               break;
            case 154:
               var10000 = 71;
               break;
            case 155:
               var10000 = 188;
               break;
            case 156:
               var10000 = 61;
               break;
            case 157:
               var10000 = 169;
               break;
            case 158:
               var10000 = 193;
               break;
            case 159:
               var10000 = 116;
               break;
            case 160:
               var10000 = 181;
               break;
            case 161:
               var10000 = 213;
               break;
            case 162:
               var10000 = 11;
               break;
            case 163:
               var10000 = 243;
               break;
            case 164:
               var10000 = 79;
               break;
            case 165:
               var10000 = 210;
               break;
            case 166:
               var10000 = 14;
               break;
            case 167:
               var10000 = 215;
               break;
            case 168:
               var10000 = 154;
               break;
            case 169:
               var10000 = 51;
               break;
            case 170:
               var10000 = 77;
               break;
            case 171:
               var10000 = 75;
               break;
            case 172:
               var10000 = 229;
               break;
            case 173:
               var10000 = 250;
               break;
            case 174:
               var10000 = 58;
               break;
            case 175:
               var10000 = 90;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 125;
               break;
            case 178:
               var10000 = 247;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 8;
               break;
            case 181:
               var10000 = 194;
               break;
            case 182:
               var10000 = 7;
               break;
            case 183:
               var10000 = 171;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 60;
               break;
            case 186:
               var10000 = 254;
               break;
            case 187:
               var10000 = 136;
               break;
            case 188:
               var10000 = 187;
               break;
            case 189:
               var10000 = 204;
               break;
            case 190:
               var10000 = 124;
               break;
            case 191:
               var10000 = 253;
               break;
            case 192:
               var10000 = 37;
               break;
            case 193:
               var10000 = 203;
               break;
            case 194:
               var10000 = 145;
               break;
            case 195:
               var10000 = 53;
               break;
            case 196:
               var10000 = 46;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 163;
               break;
            case 199:
               var10000 = 137;
               break;
            case 200:
               var10000 = 22;
               break;
            case 201:
               var10000 = 235;
               break;
            case 202:
               var10000 = 117;
               break;
            case 203:
               var10000 = 241;
               break;
            case 204:
               var10000 = 175;
               break;
            case 205:
               var10000 = 173;
               break;
            case 206:
               var10000 = 1;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 232;
               break;
            case 209:
               var10000 = 81;
               break;
            case 210:
               var10000 = 196;
               break;
            case 211:
               var10000 = 149;
               break;
            case 212:
               var10000 = 74;
               break;
            case 213:
               var10000 = 186;
               break;
            case 214:
               var10000 = 251;
               break;
            case 215:
               var10000 = 207;
               break;
            case 216:
               var10000 = 205;
               break;
            case 217:
               var10000 = 160;
               break;
            case 218:
               var10000 = 66;
               break;
            case 219:
               var10000 = 129;
               break;
            case 220:
               var10000 = 24;
               break;
            case 221:
               var10000 = 237;
               break;
            case 222:
               var10000 = 16;
               break;
            case 223:
               var10000 = 82;
               break;
            case 224:
               var10000 = 13;
               break;
            case 225:
               var10000 = 148;
               break;
            case 226:
               var10000 = 212;
               break;
            case 227:
               var10000 = 242;
               break;
            case 228:
               var10000 = 57;
               break;
            case 229:
               var10000 = 23;
               break;
            case 230:
               var10000 = 209;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 65;
               break;
            case 233:
               var10000 = 102;
               break;
            case 234:
               var10000 = 107;
               break;
            case 235:
               var10000 = 92;
               break;
            case 236:
               var10000 = 139;
               break;
            case 237:
               var10000 = 147;
               break;
            case 238:
               var10000 = 114;
               break;
            case 239:
               var10000 = 62;
               break;
            case 240:
               var10000 = 17;
               break;
            case 241:
               var10000 = 73;
               break;
            case 242:
               var10000 = 93;
               break;
            case 243:
               var10000 = 10;
               break;
            case 244:
               var10000 = 112;
               break;
            case 245:
               var10000 = 72;
               break;
            case 246:
               var10000 = 164;
               break;
            case 247:
               var10000 = 159;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 168;
               break;
            case 250:
               var10000 = 150;
               break;
            case 251:
               var10000 = 39;
               break;
            case 252:
               var10000 = 87;
               break;
            case 253:
               var10000 = 25;
               break;
            case 254:
               var10000 = 118;
               break;
            default:
               var10000 = 121;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29183;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "»\u0099ø\u0002\u0092\u001b\u0005\u001cÔsY8";
      int var12 = "»\u0099ø\u0002\u0092\u001b\u0005\u001cÔsY8".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 85;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 85;
               var10006 = var14;
            } else {
               var23 = 85;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 85;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 94;
                     break;
                  case 1:
                     var41 = 50;
                     break;
                  case 2:
                     var41 = 92;
                     break;
                  case 3:
                     var41 = 50;
                     break;
                  case 4:
                     var41 = 81;
                     break;
                  case 5:
                     var41 = 13;
                     break;
                  default:
                     var41 = 63;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            c = new String[3];
            long var0 = 2454725246204218389L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "\u009d³ð%ZÆcV7Ì°vFjc3ÄlEb\u001a8\u0000Ø";
            int var5 = "\u009d³ð%ZÆcV7Ì°vFjc3ÄlEb\u001a8\u0000Ø".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            d = var6;
            e = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





