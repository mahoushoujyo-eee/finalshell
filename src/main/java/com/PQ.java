package com;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.EventObject;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class PQ extends JTable implements com.yb_4 {
   private boolean j = true;
   private int P = -1;
   protected Rq_2 p = null;
   private static boolean H;
   private static final String[] a;
   private static final String[] b;

   public PQ() {
   }

   public PQ(TableModel var1) {
      super(var1);
   }

   public PQ(TableModel var1, TableColumnModel var2) {
      super(var1, var2);
   }

   public PQ(TableModel var1, TableColumnModel var2, ListSelectionModel var3) {
      super(var1, var2, var3);
   }

   public PQ(int var1, int var2) {
      super(var1, var2);
   }

   public PQ(Vector var1, Vector var2) {
      super(var1, var2);
   }

   public PQ(Object[][] var1, Object[] var2) {
      super(var1, var2);
   }

   public Rq_2 E() {
      return this.p;
   }

   public void U(Rq_2 var1) {
      this.p = var1;
   }

   public void F(int var1) {
      this.m(var1, true);
   }

   public void m(int var1, boolean var2) {
      int var10000 = G();
      this.clearSelection();
      this.L(var1);
      boolean var3 = (boolean)var10000;
      var10000 = var1;
      if (var3) {
         if (var1 == -1) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 != 0) {
         this.a(var1);
      }
   }

   public void L(int var1) {
      boolean var2 = p();
      if (!var2) {
         if (var1 == -1) {
            return;
         }

         this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
      }

      this.addRowSelectionInterval(var1, var1);
   }

   public void t(int var1, int var2) {
      this.clearSelection();
      this.D(var1, var2);
   }

   public void D(int var1, int var2) {
      boolean var3 = G();
      int var10000 = var1;
      byte var10001 = -1;
      if (var3) {
         if (var1 == -1) {
            return;
         }

         var10000 = var2;
         var10001 = -1;
      }

      if (var10000 != var10001) {
         this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
         this.addRowSelectionInterval(var1, var2);
      }
   }

   public void J(int var1) {
      this.h(var1, true);
   }

   public void h(int var1, boolean var2) {
      boolean var10000 = p();
      this.clearSelection();
      boolean var3 = var10000;
      PQ var4 = this;
      int var10001 = var1;
      if (!var3) {
         this.B(var1);
         if (!var2) {
            return;
         }

         var4 = this;
         var10001 = var1;
      }

      var4.c(var10001);
   }

   public void B(int var1) {
      boolean var2 = G();
      if (var2) {
         if (var1 == -1) {
            return;
         }

         this.addColumnSelectionInterval(var1, var1);
      }

      this.addRowSelectionInterval(0, this.getRowCount() - 1);
   }

   public void d(int var1, int var2) {
      this.clearSelection();
      this.k(var1, var2);
   }

   public void k(int var1, int var2) {
      boolean var3 = G();
      int var10000 = var1;
      byte var10001 = -1;
      if (var3) {
         if (var1 == -1) {
            return;
         }

         var10000 = var2;
         var10001 = -1;
      }

      if (var10000 != var10001) {
         this.addColumnSelectionInterval(var1, var2);
         this.addRowSelectionInterval(0, this.getRowCount() - 1);
      }
   }

   public void a(int var1) {
      Rectangle var2 = this.getCellRect(var1, 0, true);
      Rectangle var3 = this.getCellRect(var1, this.getColumnCount() - 1, true);
      Rectangle var4 = rv_4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   public void c(int var1) {
      Rectangle var2 = this.getCellRect(0, var1, true);
      Rectangle var3 = this.getCellRect(this.getRowCount() - 1, var1, true);
      Rectangle var4 = rv_4.B(var2, var3);
      if (var4 != null) {
         this.scrollRectToVisible(var4);
      }
   }

   @Override
   public boolean editCellAt(int param1, int param2, EventObject param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/PQ.G ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: iload 2
      // 06: aload 3
      // 07: invokespecial javax/swing/JTable.editCellAt (IILjava/util/EventObject;)Z
      // 0a: istore 5
      // 0c: istore 4
      // 0e: iload 5
      // 10: iload 4
      // 12: ifeq 70
      // 15: ifeq 6e
      // 18: goto 1f
      // 1b: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual com/PQ.getCellEditor ()Ljavax/swing/table/TableCellEditor;
      // 23: astore 6
      // 25: aload 6
      // 27: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2a: sipush 21533
      // 2d: sipush -8175
      // 30: invokestatic com/PQ.a (II)Ljava/lang/String;
      // 33: bipush 0
      // 34: anewarray 141
      // 37: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 3a: aload 6
      // 3c: bipush 0
      // 3d: anewarray 132
      // 40: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 43: astore 7
      // 45: aload 7
      // 47: instanceof java/awt/Component
      // 4a: iload 4
      // 4c: ifeq 68
      // 4f: ifeq 69
      // 52: goto 59
      // 55: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 7
      // 5b: checkcast java/awt/Component
      // 5e: invokevirtual java/awt/Component.requestFocusInWindow ()Z
      // 61: goto 68
      // 64: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: pop
      // 69: goto 6e
      // 6c: astore 7
      // 6e: iload 5
      // 70: ireturn
   }

   public boolean O() {
      boolean var10000 = p();
      TableCellEditor var2 = this.getCellEditor();
      boolean var1 = var10000;
      TableCellEditor var3 = var2;
      if (!var1) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      var10000 = var3.stopCellEditing();
      return var1 ? var10000 : var10000;
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      boolean var3 = G();
      boolean var10000 = this.j;
      if (var3) {
         if (!this.j) {
            return false;
         }

         var10000 = super.isCellEditable(var1, var2);
      }

      return !var3 ? var10000 : var10000;
   }

   public boolean Q() {
      return this.j;
   }

   public void v(boolean var1) {
      this.j = var1;
   }

   public void u(int var1) {
      boolean var10000 = p();
      this.P = var1;
      boolean var2 = var10000;
      this.setPreferredScrollableViewportSize(null);
      JScrollPane var3 = com.FN.a(this);
      JScrollPane var4 = var3;
      if (!var2) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      var4.getViewport().invalidate();
   }

   public int x() {
      return this.P;
   }

   @Override
   public Dimension getPreferredScrollableViewportSize() {
      boolean var1 = p();
      Dimension var10000 = this.preferredViewportSize;
      if (!var1) {
         if (this.preferredViewportSize != null) {
            return this.preferredViewportSize;
         }

         var10000 = this.getPreferredSize();
      }

      Dimension var2 = var10000;
      int var5 = this.P;
      if (!var1) {
         if (this.P == -1) {
            return var2;
         }

         var5 = this.getRowCount();
      }

      int var3;
      label26: {
         if (!var1) {
            if (var5 > 0) {
               Rectangle var4 = this.getCellRect(0, 0, true);
               var3 = var4.height;
               if (!var1) {
                  break label26;
               }
            }

            var5 = this.getRowHeight();
         }

         var3 = var5;
      }

      var2.height = this.P * var3;
      return var2;
   }

   @Override
   protected void initializeLocalVars() {
      super.initializeLocalVars();
      this.setPreferredScrollableViewportSize(null);
   }

   public Xs_2 o() {
      return (Xs_2)this.getUI();
   }

   @Override
   public void updateUI() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/PQ.G ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 29
      // 09: invokevirtual com/PQ.getTableHeader ()Ljavax/swing/table/JTableHeader;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/PQ.getTableHeader ()Ljavax/swing/table/JTableHeader;
      // 1a: invokevirtual javax/swing/table/JTableHeader.updateUI ()V
      // 1d: goto 24
      // 20: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: invokespecial com/PQ.h ()V
      // 28: aload 0
      // 29: iload 1
      // 2a: ifeq 57
      // 2d: invokevirtual com/PQ.getUI ()Ljavax/swing/plaf/TableUI;
      // 30: ifnull 56
      // 33: goto 3a
      // 36: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: ifeq 87
      // 3f: goto 46
      // 42: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: invokevirtual com/PQ.getUI ()Ljavax/swing/plaf/TableUI;
      // 49: instanceof com/Xs_2
      // 4c: ifne 7f
      // 4f: goto 56
      // 52: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 0
      // 57: getstatic com/a9.z6 Ljava/lang/String;
      // 5a: bipush 0
      // 5b: anewarray 132
      // 5e: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 61: checkcast com/Xs_2
      // 64: invokevirtual com/PQ.setUI (Ljavax/swing/plaf/TableUI;)V
      // 67: goto 8e
      // 6a: astore 2
      // 6b: aload 0
      // 6c: aload 2
      // 6d: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 70: aload 0
      // 71: new com/Xs_2
      // 74: dup
      // 75: invokespecial com/Xs_2.<init> ()V
      // 78: invokevirtual com/PQ.setUI (Ljavax/swing/plaf/TableUI;)V
      // 7b: iload 1
      // 7c: ifne 8e
      // 7f: aload 0
      // 80: goto 87
      // 83: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 0
      // 88: invokevirtual com/PQ.getUI ()Ljavax/swing/plaf/TableUI;
      // 8b: invokevirtual com/PQ.setUI (Ljavax/swing/plaf/TableUI;)V
      // 8e: return
   }

   private void h() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/PQ.p ()Z
      // 03: aload 0
      // 04: invokevirtual com/PQ.getParent ()Ljava/awt/Container;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 26
      // 0e: instanceof javax/swing/JViewport
      // 11: ifeq eb
      // 14: goto 1b
      // 17: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 2
      // 1c: invokevirtual java/awt/Container.getParent ()Ljava/awt/Container;
      // 1f: goto 26
      // 22: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: astore 3
      // 27: aload 3
      // 28: iload 1
      // 29: ifne 41
      // 2c: instanceof javax/swing/JScrollPane
      // 2f: ifeq eb
      // 32: goto 39
      // 35: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 3
      // 3a: goto 41
      // 3d: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: checkcast javax/swing/JScrollPane
      // 44: astore 4
      // 46: aload 4
      // 48: invokevirtual javax/swing/JScrollPane.getViewport ()Ljavax/swing/JViewport;
      // 4b: astore 5
      // 4d: aload 5
      // 4f: iload 1
      // 50: ifne 69
      // 53: ifnull 78
      // 56: goto 5d
      // 59: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 5
      // 5f: invokevirtual javax/swing/JViewport.getView ()Ljava/awt/Component;
      // 62: goto 69
      // 65: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: iload 1
      // 6a: ifne 8b
      // 6d: aload 0
      // 6e: if_acmpeq 7d
      // 71: goto 78
      // 74: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: return
      // 79: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 4
      // 7f: sipush 21534
      // 82: sipush 5165
      // 85: invokestatic com/PQ.a (II)Ljava/lang/String;
      // 88: invokevirtual javax/swing/JScrollPane.getCorner (Ljava/lang/String;)Ljava/awt/Component;
      // 8b: astore 6
      // 8d: aload 6
      // 8f: iload 1
      // 90: ifne 9f
      // 93: ifnull a5
      // 96: goto 9d
      // 99: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aload 6
      // 9f: instanceof javax/swing/plaf/UIResource
      // a2: ifeq eb
      // a5: aconst_null
      // a6: astore 6
      // a8: sipush 21535
      // ab: sipush 2568
      // ae: invokestatic com/PQ.a (II)Ljava/lang/String;
      // b1: invokestatic javax/swing/UIManager.get (Ljava/lang/Object;)Ljava/lang/Object;
      // b4: astore 7
      // b6: aload 7
      // b8: iload 1
      // b9: ifne d1
      // bc: instanceof java/lang/Class
      // bf: ifeq db
      // c2: goto c9
      // c5: invokestatic com/PQ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c8: athrow
      // c9: aload 7
      // cb: checkcast java/lang/Class
      // ce: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // d1: checkcast java/awt/Component
      // d4: astore 6
      // d6: goto db
      // d9: astore 8
      // db: aload 4
      // dd: sipush 21532
      // e0: sipush -4624
      // e3: invokestatic com/PQ.a (II)Ljava/lang/String;
      // e6: aload 6
      // e8: invokevirtual javax/swing/JScrollPane.setCorner (Ljava/lang/String;Ljava/awt/Component;)V
      // eb: return
   }

   public PQ J() {
      return (PQ)com.FN.A(this);
   }

   public PQ l(boolean var1) {
      return (PQ)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public PQ o$PQ() {
      return (PQ)com.FN.u(this);
   }

   public PQ C(boolean var1) {
      return (PQ)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public PQ x$PQ() {
      return (PQ)com.FN.C(this);
   }

   public PQ O(boolean var1) {
      return (PQ)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public PQ i(boolean var1, boolean var2) {
      return (PQ)com.FN.K(this, var1, var2);
   }

   public PQ A(int var1) {
      return (PQ)com.FN.p(this, var1);
   }

   public PQ b(int var1) {
      return (PQ)com.FN.O(this, var1);
   }

   public PQ F$PQ(int var1) {
      return (PQ)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public PQ b(int var1, boolean var2, boolean var3) {
      return (PQ)com.FN.d(this, var1, var2, var3);
   }

   public PQ o(int var1, int var2) {
      return (PQ)com.FN.m(this, var1, var2);
   }

   public PQ y(String var1) {
      return (PQ)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.y(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.o(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.b(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.F(var1);
   }

   @Override
   public Component o(int var1) {
      return this.b(var1);
   }

   @Override
   public Component i(int var1) {
      return this.A(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.i(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.O(var1);
   }

   @Override
   public Component Q$Component() {
      return this.x();
   }

   @Override
   public Component u(boolean var1) {
      return this.C(var1);
   }

   @Override
   public Component R() {
      return this.o();
   }

   @Override
   public Component c(boolean var1) {
      return this.l(var1);
   }

   @Override
   public Component a() {
      return this.J();
   }

   public static void N$void(boolean var0) {
      H = var0;
   }

   public static boolean G() {
      return H;
   }

   public static boolean p() {
      boolean var0 = G();
      return !var0;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Ó\u009ebU\u008bµ\u0086óV\u0098võè\"f±\u0080Ö7*\u0088\u001f\u0096\u0090Ùª¿7öÍ¨nÜì\u0087¦gå»\u0083á1ÞTHnÖðØµ_bá";
      int var4 = "Ó\u009ebU\u008bµ\u0086óV\u0098võè\"f±\u0080Ö7*\u0088\u001f\u0096\u0090Ùª¿7öÍ¨nÜì\u0087¦gå»\u0083á1ÞTHnÖðØµ_bá".length();
      char var1 = 21;
      N(true);
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 30;
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
                        var46 = 81;
                        break;
                     case 1:
                        var46 = 96;
                        break;
                     case 2:
                        var46 = 64;
                        break;
                     case 3:
                        var46 = 72;
                        break;
                     case 4:
                        var46 = 26;
                        break;
                     case 5:
                        var46 = 121;
                        break;
                     default:
                        var46 = 37;
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

                  var2 = "¿\u008e¡\u0019½r\u000eE\t\u0000Ó¨\u0012ÇwCìÆôf¾\f±±0k\u0012ÈE[ïuç\u0092";
                  var4 = "¿\u008e¡\u0019½r\u000eE\t\u0000Ó¨\u0012ÇwCìÆôf¾\f±±0k\u0012ÈE[ïuç\u0092".length();
                  var1 = 21;
                  var8 = -1;
            }

            var10000 = 53;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 21534) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 202;
               break;
            case 1:
               var10000 = 132;
               break;
            case 2:
               var10000 = 51;
               break;
            case 3:
               var10000 = 221;
               break;
            case 4:
               var10000 = 104;
               break;
            case 5:
               var10000 = 38;
               break;
            case 6:
               var10000 = 39;
               break;
            case 7:
               var10000 = 186;
               break;
            case 8:
               var10000 = 247;
               break;
            case 9:
               var10000 = 101;
               break;
            case 10:
               var10000 = 33;
               break;
            case 11:
               var10000 = 106;
               break;
            case 12:
               var10000 = 67;
               break;
            case 13:
               var10000 = 170;
               break;
            case 14:
               var10000 = 5;
               break;
            case 15:
               var10000 = 134;
               break;
            case 16:
               var10000 = 76;
               break;
            case 17:
               var10000 = 91;
               break;
            case 18:
               var10000 = 194;
               break;
            case 19:
               var10000 = 26;
               break;
            case 20:
               var10000 = 2;
               break;
            case 21:
               var10000 = 195;
               break;
            case 22:
               var10000 = 116;
               break;
            case 23:
               var10000 = 249;
               break;
            case 24:
               var10000 = 61;
               break;
            case 25:
               var10000 = 154;
               break;
            case 26:
               var10000 = 191;
               break;
            case 27:
               var10000 = 152;
               break;
            case 28:
               var10000 = 79;
               break;
            case 29:
               var10000 = 77;
               break;
            case 30:
               var10000 = 127;
               break;
            case 31:
               var10000 = 230;
               break;
            case 32:
               var10000 = 250;
               break;
            case 33:
               var10000 = 64;
               break;
            case 34:
               var10000 = 235;
               break;
            case 35:
               var10000 = 253;
               break;
            case 36:
               var10000 = 27;
               break;
            case 37:
               var10000 = 34;
               break;
            case 38:
               var10000 = 63;
               break;
            case 39:
               var10000 = 166;
               break;
            case 40:
               var10000 = 82;
               break;
            case 41:
               var10000 = 6;
               break;
            case 42:
               var10000 = 228;
               break;
            case 43:
               var10000 = 229;
               break;
            case 44:
               var10000 = 62;
               break;
            case 45:
               var10000 = 125;
               break;
            case 46:
               var10000 = 240;
               break;
            case 47:
               var10000 = 10;
               break;
            case 48:
               var10000 = 96;
               break;
            case 49:
               var10000 = 70;
               break;
            case 50:
               var10000 = 174;
               break;
            case 51:
               var10000 = 18;
               break;
            case 52:
               var10000 = 175;
               break;
            case 53:
               var10000 = 254;
               break;
            case 54:
               var10000 = 8;
               break;
            case 55:
               var10000 = 223;
               break;
            case 56:
               var10000 = 212;
               break;
            case 57:
               var10000 = 217;
               break;
            case 58:
               var10000 = 231;
               break;
            case 59:
               var10000 = 204;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 119;
               break;
            case 62:
               var10000 = 153;
               break;
            case 63:
               var10000 = 118;
               break;
            case 64:
               var10000 = 205;
               break;
            case 65:
               var10000 = 58;
               break;
            case 66:
               var10000 = 136;
               break;
            case 67:
               var10000 = 48;
               break;
            case 68:
               var10000 = 128;
               break;
            case 69:
               var10000 = 246;
               break;
            case 70:
               var10000 = 97;
               break;
            case 71:
               var10000 = 87;
               break;
            case 72:
               var10000 = 73;
               break;
            case 73:
               var10000 = 14;
               break;
            case 74:
               var10000 = 31;
               break;
            case 75:
               var10000 = 74;
               break;
            case 76:
               var10000 = 161;
               break;
            case 77:
               var10000 = 85;
               break;
            case 78:
               var10000 = 133;
               break;
            case 79:
               var10000 = 83;
               break;
            case 80:
               var10000 = 180;
               break;
            case 81:
               var10000 = 177;
               break;
            case 82:
               var10000 = 225;
               break;
            case 83:
               var10000 = 117;
               break;
            case 84:
               var10000 = 59;
               break;
            case 85:
               var10000 = 140;
               break;
            case 86:
               var10000 = 30;
               break;
            case 87:
               var10000 = 252;
               break;
            case 88:
               var10000 = 155;
               break;
            case 89:
               var10000 = 150;
               break;
            case 90:
               var10000 = 29;
               break;
            case 91:
               var10000 = 216;
               break;
            case 92:
               var10000 = 200;
               break;
            case 93:
               var10000 = 93;
               break;
            case 94:
               var10000 = 214;
               break;
            case 95:
               var10000 = 130;
               break;
            case 96:
               var10000 = 189;
               break;
            case 97:
               var10000 = 3;
               break;
            case 98:
               var10000 = 9;
               break;
            case 99:
               var10000 = 248;
               break;
            case 100:
               var10000 = 25;
               break;
            case 101:
               var10000 = 80;
               break;
            case 102:
               var10000 = 190;
               break;
            case 103:
               var10000 = 233;
               break;
            case 104:
               var10000 = 16;
               break;
            case 105:
               var10000 = 47;
               break;
            case 106:
               var10000 = 114;
               break;
            case 107:
               var10000 = 94;
               break;
            case 108:
               var10000 = 239;
               break;
            case 109:
               var10000 = 218;
               break;
            case 110:
               var10000 = 36;
               break;
            case 111:
               var10000 = 113;
               break;
            case 112:
               var10000 = 149;
               break;
            case 113:
               var10000 = 120;
               break;
            case 114:
               var10000 = 54;
               break;
            case 115:
               var10000 = 234;
               break;
            case 116:
               var10000 = 49;
               break;
            case 117:
               var10000 = 4;
               break;
            case 118:
               var10000 = 22;
               break;
            case 119:
               var10000 = 187;
               break;
            case 120:
               var10000 = 92;
               break;
            case 121:
               var10000 = 148;
               break;
            case 122:
               var10000 = 171;
               break;
            case 123:
               var10000 = 184;
               break;
            case 124:
               var10000 = 236;
               break;
            case 125:
               var10000 = 198;
               break;
            case 126:
               var10000 = 241;
               break;
            case 127:
               var10000 = 199;
               break;
            case 128:
               var10000 = 81;
               break;
            case 129:
               var10000 = 138;
               break;
            case 130:
               var10000 = 143;
               break;
            case 131:
               var10000 = 157;
               break;
            case 132:
               var10000 = 12;
               break;
            case 133:
               var10000 = 19;
               break;
            case 134:
               var10000 = 68;
               break;
            case 135:
               var10000 = 139;
               break;
            case 136:
               var10000 = 108;
               break;
            case 137:
               var10000 = 188;
               break;
            case 138:
               var10000 = 88;
               break;
            case 139:
               var10000 = 183;
               break;
            case 140:
               var10000 = 238;
               break;
            case 141:
               var10000 = 255;
               break;
            case 142:
               var10000 = 115;
               break;
            case 143:
               var10000 = 35;
               break;
            case 144:
               var10000 = 99;
               break;
            case 145:
               var10000 = 224;
               break;
            case 146:
               var10000 = 131;
               break;
            case 147:
               var10000 = 109;
               break;
            case 148:
               var10000 = 208;
               break;
            case 149:
               var10000 = 52;
               break;
            case 150:
               var10000 = 121;
               break;
            case 151:
               var10000 = 50;
               break;
            case 152:
               var10000 = 1;
               break;
            case 153:
               var10000 = 237;
               break;
            case 154:
               var10000 = 222;
               break;
            case 155:
               var10000 = 203;
               break;
            case 156:
               var10000 = 100;
               break;
            case 157:
               var10000 = 71;
               break;
            case 158:
               var10000 = 45;
               break;
            case 159:
               var10000 = 156;
               break;
            case 160:
               var10000 = 167;
               break;
            case 161:
               var10000 = 66;
               break;
            case 162:
               var10000 = 151;
               break;
            case 163:
               var10000 = 107;
               break;
            case 164:
               var10000 = 89;
               break;
            case 165:
               var10000 = 28;
               break;
            case 166:
               var10000 = 163;
               break;
            case 167:
               var10000 = 24;
               break;
            case 168:
               var10000 = 145;
               break;
            case 169:
               var10000 = 193;
               break;
            case 170:
               var10000 = 244;
               break;
            case 171:
               var10000 = 44;
               break;
            case 172:
               var10000 = 13;
               break;
            case 173:
               var10000 = 129;
               break;
            case 174:
               var10000 = 185;
               break;
            case 175:
               var10000 = 182;
               break;
            case 176:
               var10000 = 165;
               break;
            case 177:
               var10000 = 242;
               break;
            case 178:
               var10000 = 84;
               break;
            case 179:
               var10000 = 207;
               break;
            case 180:
               var10000 = 206;
               break;
            case 181:
               var10000 = 90;
               break;
            case 182:
               var10000 = 164;
               break;
            case 183:
               var10000 = 197;
               break;
            case 184:
               var10000 = 69;
               break;
            case 185:
               var10000 = 75;
               break;
            case 186:
               var10000 = 135;
               break;
            case 187:
               var10000 = 213;
               break;
            case 188:
               var10000 = 159;
               break;
            case 189:
               var10000 = 210;
               break;
            case 190:
               var10000 = 142;
               break;
            case 191:
               var10000 = 23;
               break;
            case 192:
               var10000 = 201;
               break;
            case 193:
               var10000 = 110;
               break;
            case 194:
               var10000 = 42;
               break;
            case 195:
               var10000 = 32;
               break;
            case 196:
               var10000 = 60;
               break;
            case 197:
               var10000 = 105;
               break;
            case 198:
               var10000 = 173;
               break;
            case 199:
               var10000 = 7;
               break;
            case 200:
               var10000 = 56;
               break;
            case 201:
               var10000 = 181;
               break;
            case 202:
               var10000 = 111;
               break;
            case 203:
               var10000 = 43;
               break;
            case 204:
               var10000 = 112;
               break;
            case 205:
               var10000 = 160;
               break;
            case 206:
               var10000 = 179;
               break;
            case 207:
               var10000 = 55;
               break;
            case 208:
               var10000 = 53;
               break;
            case 209:
               var10000 = 169;
               break;
            case 210:
               var10000 = 232;
               break;
            case 211:
               var10000 = 102;
               break;
            case 212:
               var10000 = 78;
               break;
            case 213:
               var10000 = 95;
               break;
            case 214:
               var10000 = 245;
               break;
            case 215:
               var10000 = 162;
               break;
            case 216:
               var10000 = 65;
               break;
            case 217:
               var10000 = 123;
               break;
            case 218:
               var10000 = 211;
               break;
            case 219:
               var10000 = 98;
               break;
            case 220:
               var10000 = 147;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 15;
               break;
            case 223:
               var10000 = 40;
               break;
            case 224:
               var10000 = 196;
               break;
            case 225:
               var10000 = 178;
               break;
            case 226:
               var10000 = 0;
               break;
            case 227:
               var10000 = 122;
               break;
            case 228:
               var10000 = 215;
               break;
            case 229:
               var10000 = 209;
               break;
            case 230:
               var10000 = 227;
               break;
            case 231:
               var10000 = 103;
               break;
            case 232:
               var10000 = 146;
               break;
            case 233:
               var10000 = 219;
               break;
            case 234:
               var10000 = 72;
               break;
            case 235:
               var10000 = 37;
               break;
            case 236:
               var10000 = 20;
               break;
            case 237:
               var10000 = 57;
               break;
            case 238:
               var10000 = 46;
               break;
            case 239:
               var10000 = 176;
               break;
            case 240:
               var10000 = 86;
               break;
            case 241:
               var10000 = 243;
               break;
            case 242:
               var10000 = 220;
               break;
            case 243:
               var10000 = 226;
               break;
            case 244:
               var10000 = 251;
               break;
            case 245:
               var10000 = 172;
               break;
            case 246:
               var10000 = 144;
               break;
            case 247:
               var10000 = 158;
               break;
            case 248:
               var10000 = 11;
               break;
            case 249:
               var10000 = 17;
               break;
            case 250:
               var10000 = 41;
               break;
            case 251:
               var10000 = 124;
               break;
            case 252:
               var10000 = 21;
               break;
            case 253:
               var10000 = 192;
               break;
            case 254:
               var10000 = 137;
               break;
            default:
               var10000 = 168;
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





