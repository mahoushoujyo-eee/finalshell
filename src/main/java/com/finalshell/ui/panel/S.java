package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.K5_2;
import com.finalshell.core.L4_2;
import com.finalshell.core.Rv4;
import com.finalshell.core.U4;
import com.finalshell.core.Yb4;
import com.finalshell.ui.listener.D3;
import com.finalshell.ui.listener.R3;
import com.finalshell.ui.model.P2;
import com.finalshell.ui.model.Q_2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.JTree.DynamicUtilTreeNode;
import javax.swing.event.CellEditorListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class S extends JTree implements Yb4 {
   public List I = new ArrayList(1);
   public TreeSelectionListener z = null;
   public static String J;
   public static String[] a;
   public static String[] b;

   public S() {
      this(u());
   }

   public S(Object[] var1) {
      this(V(var1));
      this.setRootVisible(false);
      this.setShowsRootHandles(true);
      this.t();
   }

   public S(Vector var1) {
      this(V(var1));
      this.setRootVisible(false);
      this.setShowsRootHandles(true);
      this.t();
   }

   public S(Hashtable var1) {
      this(V(var1));
      this.setRootVisible(false);
      this.setShowsRootHandles(true);
      this.t();
   }

   public S(DefaultMutableTreeNode var1) {
      this(new L4_2(var1));
   }

   public S(DefaultMutableTreeNode var1, boolean var2) {
      this(new L4_2(var1, var2));
   }

   public S(TreeModel var1) {
      super(var1);
      this.B$void();
   }

   public void B$void() {
   }

   @Override
   public void setCellEditor(TreeCellEditor var1) {
      String var10000 = d();
      Iterator var3 = this.I.iterator();
      String var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            CellEditorListener var4 = (CellEditorListener)var3.next();
            this.cellEditor.removeCellEditorListener(var4);
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         super.setCellEditor(var1);
         break;
      }

      for (CellEditorListener var6 : this.I) {
         this.cellEditor.addCellEditorListener(var6);
         if (var2 == null) {
            break;
         }
      }
   }

   public void h(CellEditorListener var1) {
      String var10000 = d();
      this.I.add(var1);
      String var2 = var10000;
      TreeCellEditor var3 = this.cellEditor;
      if (var2 != null) {
         if (this.cellEditor == null) {
            return;
         }

         var3 = this.cellEditor;
      }

      var3.addCellEditorListener(var1);
   }

   public void f(CellEditorListener var1) {
      String var10000 = d();
      this.I.remove(var1);
      String var2 = var10000;
      TreeCellEditor var3 = this.cellEditor;
      if (var2 != null) {
         if (this.cellEditor == null) {
            return;
         }

         var3 = this.cellEditor;
      }

      var3.removeCellEditorListener(var1);
   }

   public void t() {
      String var10000 = d();
      TreeModel var2 = this.getModel();
      String var1 = var10000;
      var10000 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return;
         }

         var10000 = (String)var2.getRoot();
      }

      if (var10000 != null) {
         this.expandPath(new TreePath(var2.getRoot()));
      }
   }

   public void H$void() {
      String var10000 = d();
      int var2 = 0;
      String var1 = var10000;

      while (var2 < this.getRowCount()) {
         this.expandRow(var2);
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public void P(DefaultMutableTreeNode var1) {
      this.expandPath(this.N(var1));
   }

   public boolean I(DefaultMutableTreeNode var1) {
      return this.isExpanded(this.N(var1));
   }

   public Rectangle Z(DefaultMutableTreeNode var1) {
      return this.getPathBounds(this.N(var1));
   }

   public Rectangle O(List var1) {
      Rectangle var6;
      String var2 = d();
      List var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      if (var10000.size() != 0) {
         Rectangle var3 = null;
         Iterator var4 = var1.iterator();

         while (true) {
            if (var4.hasNext()) {
               DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var4.next();
               var6 = Rv4.B(var3, this.Z(var5));
               if (var2 == null) {
                  break;
               }

               var3 = var6;
               if (var2 != null) {
                  continue;
               }
            }

            var6 = var3;
            break;
         }

         return var6;
      } else {
         return null;
      }
   }

   public DefaultMutableTreeNode l(int var1) {
      return this.b(this.getPathForRow(var1));
   }

   public TreePath N(DefaultMutableTreeNode var1) {
      return var1 != null ? new TreePath(var1.getPath()) : null;
   }

   public DefaultMutableTreeNode b(TreePath var1) {
      String var2 = d();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1.getLastPathComponent();
      }

      return (DefaultMutableTreeNode)var10000;
   }

   public DefaultMutableTreeNode q(Point var1) {
      return this.H(var1.x, var1.y);
   }

   public DefaultMutableTreeNode H(int var1, int var2) {
      return this.b(this.getPathForLocation(var1, var2));
   }

   public TreePath K(Point var1) {
      return this.getPathForLocation(var1.x, var1.y);
   }

   public DefaultMutableTreeNode D(Point var1) {
      return this.q(var1.x, var1.y);
   }

   public DefaultMutableTreeNode q(int var1, int var2) {
      return this.b(this.getClosestPathForLocation(var1, var2));
   }

   public TreePath X(Point var1) {
      return this.getClosestPathForLocation(var1.x, var1.y);
   }

   public boolean T(DefaultMutableTreeNode var1) {
      return this.isPathSelected(this.N(var1));
   }

   public DefaultMutableTreeNode Q$DefaultMutableTreeNode() {
      return this.b(this.getSelectionPath());
   }

   public List V() {
      int var6;
      ArrayList var2 = new ArrayList();
      String var10000 = d();
      TreePath[] var3 = this.getSelectionPaths();
      String var1 = var10000;
      TreePath[] var8 = var3;
      if (var1 != null) {
         if (var3 == null) {
            return var2;
         }

         var8 = var3;
      }

      TreePath[] var4 = var8;
      int var5 = var4.length;
      var6 = 0;

      while (var6 < var5) {
         TreePath var7 = var4[var6];
         if (var1 == null) {
            return var2;
         }

         var2.add(this.b(var7));
         var6++;
         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public void s(Point var1) {
      this.G(var1.x, var1.y);
   }

   public void G(int var1, int var2) {
      this.setSelectionPath(this.getPathForLocation(var1, var2));
   }

   public void s(DefaultMutableTreeNode var1) {
      TreePath var2 = this.N(var1);
      if (var2 != null) {
         this.setSelectionPath(var2);
      }
   }

   public void R(List var1) {
      String var10000 = d();
      TreePath[] var3 = new TreePath[var1.size()];
      String var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var1.size()) {
            var3[var4] = this.N((DefaultMutableTreeNode)var1.get(var4));
            var4++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.setSelectionPaths(var3);
         break;
      }
   }

   public void E(DefaultMutableTreeNode[] var1) {
      String var10000 = d();
      TreePath[] var3 = new TreePath[var1.length];
      int var4 = 0;
      String var2 = var10000;

      while (true) {
         if (var4 < var1.length) {
            var3[var4] = this.N(var1[var4]);
            var4++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.setSelectionPaths(var3);
         break;
      }
   }

   public DefaultMutableTreeNode E$DefaultMutableTreeNode() {
      String var10000 = d();
      int var2 = 0;
      String var1 = var10000;

      while (var2 < this.getRowCount()) {
         DefaultMutableTreeNode var3 = this.l(var2);
         if (var1 != null) {
            if (this.getModel().isLeaf(var3)) {
               return var3;
            }

            var2++;
         }

         if (var1 == null) {
            break;
         }
      }

      return null;
   }

   public void f() {
      DefaultMutableTreeNode var1 = this.E$DefaultMutableTreeNode();
      if (var1 != null) {
         this.s(var1);
      }
   }

   public void Y$void() {
      this.b(true);
   }

   public void b(boolean var1) {
      label33: {
         String var2;
         int var4;
         label34: {
            String var10000 = d();
            int var3 = this.getLeadSelectionRow();
            var2 = var10000;
            var4 = var3;
            int var10001 = -1;
            if (var2 != null) {
               if (var3 == -1) {
                  break label33;
               }

               var4 = var3;
               if (var2 == null) {
                  break label34;
               }

               var10001 = this.getRowCount() - 1;
            }

            if (var4 < var10001) {
               this.setSelectionRow(var3 + 1);
               if (var2 != null) {
                  return;
               }
            }

            var4 = (var1) ? 1 : 0;
         }

         if (var4 == 0) {
            return;
         }

         this.setSelectionRow(0);
         if (var2 != null) {
            return;
         }
      }

      this.setSelectionRow(0);
   }

   public void G$void() {
      this.T(true);
   }

   public void T(boolean var1) {
      label31: {
         String var10000 = d();
         int var3 = this.getLeadSelectionRow();
         String var2 = var10000;
         int var4 = var3;
         if (var2 != null) {
            if (var3 == -1) {
               break label31;
            }

            var4 = var3;
         }

         if (var2 != null) {
            if (var4 > 0) {
               this.setSelectionRow(var3 - 1);
               if (var2 != null) {
                  return;
               }
            }

            var4 = (var1) ? 1 : 0;
         }

         if (var4 == 0) {
            return;
         }

         this.setSelectionRow(this.getRowCount() - 1);
         if (var2 != null) {
            return;
         }
      }

      this.setSelectionRow(this.getRowCount() - 1);
   }

   public DefaultMutableTreeNode M$DefaultMutableTreeNode() {
      return (DefaultMutableTreeNode)this.getModel().getRoot();
   }

   public List W() {
      ArrayList var1 = new ArrayList();
      this.W(var1, this.M$DefaultMutableTreeNode());
      return var1;
   }

   public void W(List var1, DefaultMutableTreeNode var2) {
      String var10000 = d();
      var1.add(var2);
      String var3 = var10000;
      int var4 = 0;

      while (var4 < var2.getChildCount()) {
         this.W(var1, (DefaultMutableTreeNode)var2.getChildAt(var4));
         var4++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void T(int var1) {
      this.getSelectionModel().setSelectionMode(var1);
   }

   public void d(boolean var1) {
      String var2 = d();
      int var10001 = (var1) ? 1 : 0;
      if (var2 != null) {
         var10001 = var1 != 0 ? 4 : 1;
      }

      this.T(var10001);
   }

   public boolean S$boolean() {
      return this.z != null;
   }

   public void D(boolean var1) {
      S var4;
      label33: {
         String var2 = d();
         boolean var10000 = var1;
         if (var2 != null) {
            if (var1) {
               var4 = this;
               if (var2 != null) {
                  if (this.S$boolean()) {
                     return;
                  }

                  this.z = new D3(this);
                  var4 = this;
               }

               var4.addTreeSelectionListener(this.z);
               if (var2 != null) {
                  return;
               }
            }

            var4 = this;
            if (var2 == null) {
               break label33;
            }

            var10000 = this.S$boolean();
         }

         if (!var10000) {
            return;
         }

         this.removeTreeSelectionListener(this.z);
         var4 = this;
      }

      var4.z = null;
   }

   public void J() {
      this.scrollRectToVisible(new Rectangle(0, 0, 1, 1));
   }

   public void U$void() {
      Rectangle var1 = this.getPathBounds(this.getSelectionPath());
      if (var1 != null) {
         this.scrollRectToVisible(var1);
      }
   }

   public void O(DefaultMutableTreeNode var1) {
      Rectangle var2 = this.Z(var1);
      if (var2 != null) {
         this.scrollRectToVisible(var2);
      }
   }

   public void S$void() {
      TreePath var1 = this.getSelectionPath();
      if (var1 != null) {
         this.startEditingAtPath(var1);
      }
   }

   public void b(DefaultMutableTreeNode var1) {
      TreePath var2 = this.N(var1);
      if (var2 != null) {
         this.startEditingAtPath(var2);
      }
   }

   public void M$void() {
      this.revalidate();
      this.repaint();
   }

   public P2 B$p_2() {
      return U4.q(this);
   }

   public P2 V(boolean var1) {
      return U4.L(this, var1);
   }

   public void P(P2 var1) {
      U4.A(this, var1);
   }

   public void G(P2 var1, boolean var2) {
      U4.T(this, var1, var2);
   }

   public boolean p() {
      return this.E$K().q$boolean();
   }

   public void o(boolean var1) {
      this.E$K().O(var1);
   }

   public boolean Y$boolean() {
      return R3.t(this);
   }

   public void f(boolean var1) {
      S var4;
      label33: {
         String var2 = d();
         boolean var10000 = var1;
         if (var2 != null) {
            if (var1) {
               var4 = this;
               if (var2 != null) {
                  if (this.Y$boolean()) {
                     return;
                  }

                  this.z(false);
                  var4 = this;
               }

               R3.E(var4);
               if (var2 != null) {
                  return;
               }
            }

            var4 = this;
            if (var2 == null) {
               break label33;
            }

            var10000 = this.Y$boolean();
         }

         if (!var10000) {
            return;
         }

         var4 = this;
      }

      R3.s(var4);
   }

   public boolean q() {
      return this.E$K().H$boolean();
   }

   public void z(boolean var1) {
      this.E$K().D(var1);
   }

   public boolean Q$boolean() {
      return this.E$K().x();
   }

   public void r(boolean var1) {
      this.E$K().S(var1);
   }

   public Color b() {
      return this.E$K().Z();
   }

   public void b(Color var1) {
      this.E$K().e(var1);
   }

   public com.finalshell.ui.model.T k$T() {
      return this.E$K().q$T();
   }

   public void b(com.finalshell.ui.model.T var1) {
      this.E$K().O(var1);
   }

   public int T() {
      return this.E$K().i();
   }

   public void S$void(int var1) {
      this.E$K().z(var1);
   }

   public int E$int() {
      return this.E$K().A();
   }

   public void y(int var1) {
      this.E$K().U(var1);
   }

   public boolean k$boolean() {
      return this.E$K().E$boolean();
   }

   public void j(boolean var1) {
      this.E$K().B(var1);
   }

   public Color K$Color() {
      return this.E$K().j();
   }

   public void l(Color var1) {
      this.E$K().J(var1);
   }

   public Color C() {
      return this.E$K().o$Color();
   }

   public void q(Color var1) {
      this.E$K().m(var1);
   }

   public int L() {
      return this.E$K().E$int();
   }

   public void q(int var1) {
      this.E$K().y(var1);
   }

   public BasicStroke U$BasicStroke() {
      return this.E$K().R();
   }

   public void H(BasicStroke var1) {
      this.E$K().A(var1);
   }

   public int m() {
      return this.E$K().H$int();
   }

   public void D(int var1) {
      this.E$K().e(var1);
   }

   public K5_2 E$K() {
      return (K5_2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/S.d ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/S.getUI ()Ljavax/swing/plaf/TreeUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/S.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 62
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/S.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/S.getUI ()Ljavax/swing/plaf/TreeUI;
      // 25: instanceof com/finalshell/core/K5_2
      // 28: ifne 5a
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/S.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zr Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 473
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/K5_2
      // 40: invokevirtual com/finalshell/ui/panel/S.setUI (Ljavax/swing/plaf/TreeUI;)V
      // 43: goto 69
      // 46: astore 2
      // 47: aload 2
      // 48: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 4b: aload 0
      // 4c: new com/finalshell/core/K5_2
      // 4f: dup
      // 50: invokespecial com/finalshell/core/K5_2.<init> ()V
      // 53: invokevirtual com/finalshell/ui/panel/S.setUI (Ljavax/swing/plaf/TreeUI;)V
      // 56: aload 1
      // 57: ifnonnull 69
      // 5a: aload 0
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/ui/panel/S.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 0
      // 63: invokevirtual com/finalshell/ui/panel/S.getUI ()Ljavax/swing/plaf/TreeUI;
      // 66: invokevirtual com/finalshell/ui/panel/S.setUI (Ljavax/swing/plaf/TreeUI;)V
      // 69: return
   }

   public void H(int var1) {
      this.repaint(this.E$K().G(var1));
   }

   public void x(int var1, int var2) {
      K5_2 var3 = this.E$K();
      Rectangle var4 = var3.G(var1);
      Rectangle var5 = var3.G(var2);
      Rectangle var6 = Rv4.B(var4, var5);
      if (var6 != null) {
         this.repaint(var6);
      }
   }

   public void k(DefaultMutableTreeNode var1) {
      if (var1 != null) {
         this.repaint(this.Z(var1));
      }
   }

   public void t(List var1) {
      String var2 = d();
      List var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if (var10000.size() > 0) {
         Rectangle var3 = null;

         for (DefaultMutableTreeNode var5 : var1) {
            var3 = Rv4.B(var3, this.Z(var5));
            if (var2 == null) {
               return;
            }

            if (var2 == null) {
               break;
            }
         }

         if (var3 != null) {
            this.repaint(var3);
         }
      }
   }

   public S G$s() {
      return (S)FN.A(this);
   }

   public S Q(boolean var1) {
      return (S)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public S c() {
      return (S)FN.u(this);
   }

   public S p(boolean var1) {
      return (S)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public S H$s() {
      return (S)FN.C(this);
   }

   public S S(boolean var1) {
      return (S)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public S X(boolean var1, boolean var2) {
      return (S)FN.K(this, var1, var2);
   }

   public S G$s(int var1) {
      return (S)FN.p(this, var1);
   }

   public S u(int var1) {
      return (S)FN.O(this, var1);
   }

   public S S$s(int var1) {
      return (S)FN.K(this, var1);
   }

   public int Y$int() {
      return FN.r$int(this);
   }

   public S z(int var1, boolean var2, boolean var3) {
      return (S)FN.d(this, var1, var2, var3);
   }

   public S J(int var1, int var2) {
      return (S)FN.m(this, var1, var2);
   }

   public S d(String var1) {
      return (S)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public static TreeModel V(Object var0) {
      label28: {
         String var1;
         label31: {
            var1 = d();
            boolean var10000 = var0 instanceof Object[];
            if (var1 != null) {
               if (var10000) {
                  break label31;
               }

               var10000 = var0 instanceof Hashtable;
            }

            if (var1 != null) {
               if (var10000) {
                  break label31;
               }

               var10000 = var0 instanceof Vector;
            }

            if (!var10000) {
               break label28;
            }
         }

         DefaultMutableTreeNode var2 = new DefaultMutableTreeNode(a(11339, -23087));
         DynamicUtilTreeNode.createChildren(var2, var0);
         if (var1 != null) {
            return new L4_2(var2, false);
         }
      }

      DynamicUtilTreeNode var3 = new DynamicUtilTreeNode(a(11350, 25982), var0);
      return new L4_2(var3, false);
   }

   public static TreeModel u() {
      Q_2 var1 = new Q_2(a(11347, 1586));
      String var10000 = d();
      Q_2 var2 = new Q_2(a(11357, -22538));
      var2.add(new Q_2(a(11355, -30251)));
      String var0 = var10000;
      var2.add(new Q_2(a(11353, 3215)));
      var2.add(new Q_2(a(11352, 25081)));
      var2.add(new Q_2(a(11344, -18492)));
      var1.add(var2);
      var2 = new Q_2(a(11346, 27681));
      var2.add(new Q_2(a(11348, 23612)));
      var2.add(new Q_2(a(11338, 28038)));
      var2.add(new Q_2(a(11345, 12702)));
      var2.add(new Q_2(a(11358, -7795)));
      var1.add(var2);
      var2 = new Q_2(a(11359, 7863));
      var2.add(new Q_2(a(11351, 22592)));
      var2.add(new Q_2(a(11354, -31747)));
      var2.add(new Q_2(a(11356, 4041)));
      var2.add(new Q_2(a(11349, 10336)));
      var1.add(var2);
      L4_2 var5 = new L4_2(var1);
      if (var0 == null) {
         Ky4.K(new String[5]);
      }

      return var5;
   }

   @Override
   public Component N(String var1) {
      return this.d(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.J(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.z(var1, var2, var3);
   }

   public Component G$Component(int var1) {
      return this.S$s(var1);
   }

   @Override
   public Component o(int var1) {
      return this.u(var1);
   }

   @Override
   public Component i(int var1) {
      return this.G$s(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.X(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.S(var1);
   }

   public Component Q$Component() {
      return this.H$s();
   }

   @Override
   public Component u(boolean var1) {
      return this.p(var1);
   }

   @Override
   public Component R() {
      return this.c();
   }

   @Override
   public Component c(boolean var1) {
      return this.Q(var1);
   }

   @Override
   public Component a() {
      return this.G$s();
   }

   public static void W(String var0) {
      J = var0;
   }

   public static String d() {
      return J;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ 11355) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 206;
               break;
            case 1:
               var10000 = 218;
               break;
            case 2:
               var10000 = 211;
               break;
            case 3:
               var10000 = 121;
               break;
            case 4:
               var10000 = 23;
               break;
            case 5:
               var10000 = 11;
               break;
            case 6:
               var10000 = 79;
               break;
            case 7:
               var10000 = 233;
               break;
            case 8:
               var10000 = 191;
               break;
            case 9:
               var10000 = 89;
               break;
            case 10:
               var10000 = 67;
               break;
            case 11:
               var10000 = 214;
               break;
            case 12:
               var10000 = 12;
               break;
            case 13:
               var10000 = 76;
               break;
            case 14:
               var10000 = 172;
               break;
            case 15:
               var10000 = 2;
               break;
            case 16:
               var10000 = 131;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 43;
               break;
            case 19:
               var10000 = 50;
               break;
            case 20:
               var10000 = 45;
               break;
            case 21:
               var10000 = 44;
               break;
            case 22:
               var10000 = 163;
               break;
            case 23:
               var10000 = 143;
               break;
            case 24:
               var10000 = 158;
               break;
            case 25:
               var10000 = 119;
               break;
            case 26:
               var10000 = 118;
               break;
            case 27:
               var10000 = 201;
               break;
            case 28:
               var10000 = 177;
               break;
            case 29:
               var10000 = 42;
               break;
            case 30:
               var10000 = 117;
               break;
            case 31:
               var10000 = 40;
               break;
            case 32:
               var10000 = 95;
               break;
            case 33:
               var10000 = 168;
               break;
            case 34:
               var10000 = 38;
               break;
            case 35:
               var10000 = 147;
               break;
            case 36:
               var10000 = 29;
               break;
            case 37:
               var10000 = 195;
               break;
            case 38:
               var10000 = 125;
               break;
            case 39:
               var10000 = 129;
               break;
            case 40:
               var10000 = 84;
               break;
            case 41:
               var10000 = 36;
               break;
            case 42:
               var10000 = 57;
               break;
            case 43:
               var10000 = 154;
               break;
            case 44:
               var10000 = 55;
               break;
            case 45:
               var10000 = 46;
               break;
            case 46:
               var10000 = 250;
               break;
            case 47:
               var10000 = 179;
               break;
            case 48:
               var10000 = 238;
               break;
            case 49:
               var10000 = 80;
               break;
            case 50:
               var10000 = 91;
               break;
            case 51:
               var10000 = 60;
               break;
            case 52:
               var10000 = 208;
               break;
            case 53:
               var10000 = 13;
               break;
            case 54:
               var10000 = 194;
               break;
            case 55:
               var10000 = 186;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 30;
               break;
            case 58:
               var10000 = 205;
               break;
            case 59:
               var10000 = 196;
               break;
            case 60:
               var10000 = 48;
               break;
            case 61:
               var10000 = 164;
               break;
            case 62:
               var10000 = 87;
               break;
            case 63:
               var10000 = 65;
               break;
            case 64:
               var10000 = 171;
               break;
            case 65:
               var10000 = 188;
               break;
            case 66:
               var10000 = 153;
               break;
            case 67:
               var10000 = 155;
               break;
            case 68:
               var10000 = 234;
               break;
            case 69:
               var10000 = 243;
               break;
            case 70:
               var10000 = 174;
               break;
            case 71:
               var10000 = 210;
               break;
            case 72:
               var10000 = 144;
               break;
            case 73:
               var10000 = 47;
               break;
            case 74:
               var10000 = 231;
               break;
            case 75:
               var10000 = 192;
               break;
            case 76:
               var10000 = 116;
               break;
            case 77:
               var10000 = 124;
               break;
            case 78:
               var10000 = 54;
               break;
            case 79:
               var10000 = 37;
               break;
            case 80:
               var10000 = 149;
               break;
            case 81:
               var10000 = 157;
               break;
            case 82:
               var10000 = 99;
               break;
            case 83:
               var10000 = 110;
               break;
            case 84:
               var10000 = 140;
               break;
            case 85:
               var10000 = 152;
               break;
            case 86:
               var10000 = 136;
               break;
            case 87:
               var10000 = 21;
               break;
            case 88:
               var10000 = 113;
               break;
            case 89:
               var10000 = 1;
               break;
            case 90:
               var10000 = 221;
               break;
            case 91:
               var10000 = 58;
               break;
            case 92:
               var10000 = 212;
               break;
            case 93:
               var10000 = 228;
               break;
            case 94:
               var10000 = 248;
               break;
            case 95:
               var10000 = 141;
               break;
            case 96:
               var10000 = 74;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 146;
               break;
            case 99:
               var10000 = 246;
               break;
            case 100:
               var10000 = 187;
               break;
            case 101:
               var10000 = 173;
               break;
            case 102:
               var10000 = 0;
               break;
            case 103:
               var10000 = 216;
               break;
            case 104:
               var10000 = 16;
               break;
            case 105:
               var10000 = 27;
               break;
            case 106:
               var10000 = 145;
               break;
            case 107:
               var10000 = 120;
               break;
            case 108:
               var10000 = 100;
               break;
            case 109:
               var10000 = 78;
               break;
            case 110:
               var10000 = 62;
               break;
            case 111:
               var10000 = 169;
               break;
            case 112:
               var10000 = 150;
               break;
            case 113:
               var10000 = 251;
               break;
            case 114:
               var10000 = 148;
               break;
            case 115:
               var10000 = 235;
               break;
            case 116:
               var10000 = 127;
               break;
            case 117:
               var10000 = 240;
               break;
            case 118:
               var10000 = 166;
               break;
            case 119:
               var10000 = 56;
               break;
            case 120:
               var10000 = 126;
               break;
            case 121:
               var10000 = 14;
               break;
            case 122:
               var10000 = 139;
               break;
            case 123:
               var10000 = 83;
               break;
            case 124:
               var10000 = 17;
               break;
            case 125:
               var10000 = 101;
               break;
            case 126:
               var10000 = 142;
               break;
            case 127:
               var10000 = 64;
               break;
            case 128:
               var10000 = 204;
               break;
            case 129:
               var10000 = 26;
               break;
            case 130:
               var10000 = 20;
               break;
            case 131:
               var10000 = 176;
               break;
            case 132:
               var10000 = 241;
               break;
            case 133:
               var10000 = 5;
               break;
            case 134:
               var10000 = 237;
               break;
            case 135:
               var10000 = 170;
               break;
            case 136:
               var10000 = 4;
               break;
            case 137:
               var10000 = 104;
               break;
            case 138:
               var10000 = 28;
               break;
            case 139:
               var10000 = 225;
               break;
            case 140:
               var10000 = 249;
               break;
            case 141:
               var10000 = 109;
               break;
            case 142:
               var10000 = 105;
               break;
            case 143:
               var10000 = 134;
               break;
            case 144:
               var10000 = 189;
               break;
            case 145:
               var10000 = 156;
               break;
            case 146:
               var10000 = 18;
               break;
            case 147:
               var10000 = 96;
               break;
            case 148:
               var10000 = 220;
               break;
            case 149:
               var10000 = 102;
               break;
            case 150:
               var10000 = 135;
               break;
            case 151:
               var10000 = 32;
               break;
            case 152:
               var10000 = 128;
               break;
            case 153:
               var10000 = 226;
               break;
            case 154:
               var10000 = 209;
               break;
            case 155:
               var10000 = 167;
               break;
            case 156:
               var10000 = 230;
               break;
            case 157:
               var10000 = 162;
               break;
            case 158:
               var10000 = 217;
               break;
            case 159:
               var10000 = 61;
               break;
            case 160:
               var10000 = 103;
               break;
            case 161:
               var10000 = 53;
               break;
            case 162:
               var10000 = 253;
               break;
            case 163:
               var10000 = 183;
               break;
            case 164:
               var10000 = 161;
               break;
            case 165:
               var10000 = 202;
               break;
            case 166:
               var10000 = 97;
               break;
            case 167:
               var10000 = 98;
               break;
            case 168:
               var10000 = 9;
               break;
            case 169:
               var10000 = 8;
               break;
            case 170:
               var10000 = 199;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 106;
               break;
            case 173:
               var10000 = 111;
               break;
            case 174:
               var10000 = 77;
               break;
            case 175:
               var10000 = 138;
               break;
            case 176:
               var10000 = 178;
               break;
            case 177:
               var10000 = 112;
               break;
            case 178:
               var10000 = 70;
               break;
            case 179:
               var10000 = 213;
               break;
            case 180:
               var10000 = 3;
               break;
            case 181:
               var10000 = 7;
               break;
            case 182:
               var10000 = 94;
               break;
            case 183:
               var10000 = 193;
               break;
            case 184:
               var10000 = 19;
               break;
            case 185:
               var10000 = 215;
               break;
            case 186:
               var10000 = 81;
               break;
            case 187:
               var10000 = 66;
               break;
            case 188:
               var10000 = 160;
               break;
            case 189:
               var10000 = 232;
               break;
            case 190:
               var10000 = 63;
               break;
            case 191:
               var10000 = 73;
               break;
            case 192:
               var10000 = 69;
               break;
            case 193:
               var10000 = 6;
               break;
            case 194:
               var10000 = 115;
               break;
            case 195:
               var10000 = 24;
               break;
            case 196:
               var10000 = 41;
               break;
            case 197:
               var10000 = 22;
               break;
            case 198:
               var10000 = 137;
               break;
            case 199:
               var10000 = 85;
               break;
            case 200:
               var10000 = 190;
               break;
            case 201:
               var10000 = 34;
               break;
            case 202:
               var10000 = 223;
               break;
            case 203:
               var10000 = 200;
               break;
            case 204:
               var10000 = 133;
               break;
            case 205:
               var10000 = 25;
               break;
            case 206:
               var10000 = 180;
               break;
            case 207:
               var10000 = 15;
               break;
            case 208:
               var10000 = 122;
               break;
            case 209:
               var10000 = 175;
               break;
            case 210:
               var10000 = 31;
               break;
            case 211:
               var10000 = 227;
               break;
            case 212:
               var10000 = 236;
               break;
            case 213:
               var10000 = 88;
               break;
            case 214:
               var10000 = 182;
               break;
            case 215:
               var10000 = 86;
               break;
            case 216:
               var10000 = 90;
               break;
            case 217:
               var10000 = 185;
               break;
            case 218:
               var10000 = 197;
               break;
            case 219:
               var10000 = 92;
               break;
            case 220:
               var10000 = 222;
               break;
            case 221:
               var10000 = 51;
               break;
            case 222:
               var10000 = 207;
               break;
            case 223:
               var10000 = 203;
               break;
            case 224:
               var10000 = 244;
               break;
            case 225:
               var10000 = 132;
               break;
            case 226:
               var10000 = 247;
               break;
            case 227:
               var10000 = 108;
               break;
            case 228:
               var10000 = 10;
               break;
            case 229:
               var10000 = 59;
               break;
            case 230:
               var10000 = 242;
               break;
            case 231:
               var10000 = 245;
               break;
            case 232:
               var10000 = 198;
               break;
            case 233:
               var10000 = 82;
               break;
            case 234:
               var10000 = 33;
               break;
            case 235:
               var10000 = 219;
               break;
            case 236:
               var10000 = 68;
               break;
            case 237:
               var10000 = 165;
               break;
            case 238:
               var10000 = 107;
               break;
            case 239:
               var10000 = 255;
               break;
            case 240:
               var10000 = 229;
               break;
            case 241:
               var10000 = 184;
               break;
            case 242:
               var10000 = 72;
               break;
            case 243:
               var10000 = 39;
               break;
            case 244:
               var10000 = 181;
               break;
            case 245:
               var10000 = 35;
               break;
            case 246:
               var10000 = 239;
               break;
            case 247:
               var10000 = 93;
               break;
            case 248:
               var10000 = 224;
               break;
            case 249:
               var10000 = 114;
               break;
            case 250:
               var10000 = 254;
               break;
            case 251:
               var10000 = 123;
               break;
            case 252:
               var10000 = 71;
               break;
            case 253:
               var10000 = 151;
               break;
            case 254:
               var10000 = 75;
               break;
            default:
               var10000 = 49;
         }

         short var4 = var10000;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "Â§½!\u0005\u00899\u008bHþ\u0006Nó \u0007(\u0098\u0003\u0017¿\u0004\u0004QÆQo\u0006ªæíd\f\u001e\u0006L0TºÂK\u0007è\u0016é·13,\u0005\u000bÞ®1W\u0006\u0018\u0089ÏlÔ/\b\u0010©y\u0092\u0014$!¼\u0006\t\u0001¥Ôáá\brJáºyñAÖ\u0004`!á\u0083\u0007\u0092n¬°\u0083×A\n\u0005AC_Ët3\f\u0096\u001e";
      int var4 = "Â§½!\u0005\u00899\u008bHþ\u0006Nó \u0007(\u0098\u0003\u0017¿\u0004\u0004QÆQo\u0006ªæíd\f\u001e\u0006L0TºÂK\u0007è\u0016é·13,\u0005\u000bÞ®1W\u0006\u0018\u0089ÏlÔ/\b\u0010©y\u0092\u0014$!¼\u0006\t\u0001¥Ôáá\brJáºyñAÖ\u0004`!á\u0083\u0007\u0092n¬°\u0083×A\n\u0005AC_Ët3\f\u0096\u001e"
         .length();
      W("SfdVE");
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 41;
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
                        var46 = 117;
                        break;
                     case 1:
                        var46 = 82;
                        break;
                     case 2:
                        var46 = 28;
                        break;
                     case 3:
                        var46 = 23;
                        break;
                     case 4:
                        var46 = 84;
                        break;
                     case 5:
                        var46 = 3;
                        break;
                     default:
                        var46 = 103;
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
                     b = new String[18];
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

                  var2 = "~8¦$\u0006,þÁë\ri";
                  var4 = "~8¦$\u0006,þÁë\ri".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 45;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





