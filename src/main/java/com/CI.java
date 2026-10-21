package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;

public class CI extends JList implements Pp_2, com.yb_4, Sa_2 {
   protected List U = new ArrayList(1);
   protected boolean k = false;
   protected com.K3 D = null;
   protected Rq_2 t = null;
   protected int x = -1;
   protected boolean X = true;
   private static String[] B;

   public CI() {
   }

   public CI(List var1) {
      super(var1.toArray());
   }

   public CI(Vector var1) {
      super(var1);
   }

   public CI(Object[] var1) {
      super(var1);
   }

   public CI(ListModel var1) {
      super(var1);
   }

   public void A(boolean var1) {
      String[] var2 = c();
      int var10001 = var1;
      if (var2 == null) {
         var10001 = var1 != 0 ? 2 : 0;
      }

      this.setSelectionMode(var10001);
   }

   public com.Oq_2 f() {
      String[] var10000 = c();
      ListCellRenderer var2 = this.getCellRenderer();
      String[] var1 = var10000;
      ListCellRenderer var3 = var2;
      if (var1 == null) {
         if (!(var2 instanceof com.Oq_2)) {
            return null;
         }

         var3 = var2;
      }

      return (com.Oq_2)var3;
   }

   public eD_3 A() {
      String[] var10000 = c();
      ListModel var2 = this.getModel();
      String[] var1 = var10000;
      ListModel var3 = var2;
      if (var1 == null) {
         if (!(var2 instanceof eD_3)) {
            return null;
         }

         var3 = var2;
      }

      return (eD_3)var3;
   }

   public void s(Object var1) {
      this.setSelectedValue(var1, true);
   }

   public void N(Object[] var1) {
      this.I(com.aL.o(var1));
   }

   public void x(Collection var1) {
      this.I(new ArrayList(var1));
   }

   public void I(List var1) {
      String[] var10000 = c();
      ArrayList var3 = new ArrayList();
      String[] var2 = var10000;
      ListModel var4 = this.getModel();
      int var5 = 0;

      while (true) {
         if (var5 < var4.getSize()) {
            if (var2 != null) {
               break;
            }

            if (var2 == null && var1.contains(var4.getElementAt(var5))) {
               var3.add(var5);
            }

            var5++;
            if (var2 == null) {
               continue;
            }
         }

         this.setSelectedIndices(com.aL.J((List)var3));
         break;
      }
   }

   public boolean z() {
      return this.k;
   }

   public void M(boolean var1) {
      String[] var2 = c();
      com.CI var10000 = this;
      if (var2 == null) {
         this.k = var1;
         if (!var1) {
            return;
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.D != null) {
            return;
         }

         var10000 = this;
      }

      var10000.J(this.O());
   }

   public boolean f$boolean() {
      return com.cI_3.V(this);
   }

   public void d(boolean var1) {
      com.CI var4;
      label33: {
         String[] var2 = c();
         boolean var10000 = var1;
         if (var2 == null) {
            if (var1) {
               var4 = this;
               if (var2 == null) {
                  if (this.f()) {
                     return;
                  }

                  this.L(false);
                  var4 = this;
               }

               com.cI_3.w(var4);
               if (var2 == null) {
                  return;
               }
            }

            var4 = this;
            if (var2 != null) {
               break label33;
            }

            var10000 = this.f();
         }

         if (!var10000) {
            return;
         }

         var4 = this;
      }

      com.cI_3.z(var4);
   }

   public void J(com.K3 var1) {
      this.L();
      this.D = var1;
      var1.V(this);
   }

   protected com.K3 O() {
      return new w3_2();
   }

   public com.K3 S() {
      return this.D;
   }

   public void L() {
      String[] var1 = c();
      com.K3 var10000 = this.D;
      if (var1 == null) {
         if (this.D == null) {
            return;
         }

         var10000 = this.D;
      }

      var10000.S(this);
      this.D = null;
   }

   public void R() {
      this.z(this.getSelectedIndex());
   }

   public void z(int var1) {
      String[] var10000 = c();
      com.K3 var3 = this.S();
      String[] var2 = var10000;
      if (var1 != -1) {
         com.K3 var4 = var3;
         if (var2 == null) {
            if (var3 == null) {
               return;
            }

            this.setSelectedIndex(var1);
            var4 = var3;
         }

         var4.N(this, var1);
      }
   }

   public boolean X() {
      String[] var10000 = c();
      com.K3 var2 = this.S();
      String[] var1 = var10000;
      com.K3 var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      boolean var4 = var3.D();
      if (var1 == null) {
         if (!var4) {
            return false;
         }

         var4 = var2.C(this);
      }

      return var1 != null ? var4 : var4;
   }

   public boolean k() {
      String[] var10000 = c();
      com.K3 var2 = this.S();
      String[] var1 = var10000;
      com.K3 var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      boolean var4 = var3.D();
      return var1 != null ? var4 : var4;
   }

   public Rq_2 m() {
      return this.t;
   }

   public void G(Rq_2 var1) {
      this.t = var1;
   }

   public boolean b() {
      return this.X;
   }

   public void Y(boolean var1) {
      this.X = var1;
      int var2 = this.getLeadSelectionIndex();
      int[] var3 = this.getSelectedIndices();
      this.setSelectionModel((ListSelectionModel)(var1 ? new DefaultListSelectionModel() : new com.Kd_2()));
      this.setSelectedIndices(var3);
      this.getSelectionModel().setLeadSelectionIndex(var2);
   }

   public int J() {
      return this.getModel().getSize();
   }

   public Object D(int var1) {
      return this.getModel().getElementAt(var1);
   }

   public void R(ListDataListener var1) {
      this.getModel().addListDataListener(var1);
   }

   public void g(ListDataListener var1) {
      this.getModel().removeListDataListener(var1);
   }

   public void k(int var1) {
      if (var1 != -1) {
         Rectangle var2 = this.getCellBounds(var1, var1);
         if (var2 != null) {
            this.scrollRectToVisible(var2);
         }
      }
   }

   public boolean e() {
      return this.B().e();
   }

   public void e(boolean var1) {
      this.B().C(var1);
   }

   public boolean q() {
      return this.B().u();
   }

   public void L(boolean var1) {
      this.B().q(var1);
   }

   public int R$int() {
      return this.B().j();
   }

   public void L(int var1) {
      this.B().l(var1);
   }

   public int D() {
      return this.B().y();
   }

   public void a(int var1) {
      this.B().o(var1);
   }

   public boolean L$boolean() {
      return this.B().L();
   }

   public void Z(boolean var1) {
      this.B().l(var1);
   }

   public Color s() {
      return this.B().f();
   }

   public void B(Color var1) {
      this.B().h(var1);
   }

   public Color A$Color() {
      return this.B().w();
   }

   public void j(Color var1) {
      this.B().E(var1);
   }

   public boolean J$boolean() {
      return this.B().M();
   }

   public void s(boolean var1) {
      this.B().t(var1);
   }

   public com.Yc_2 B() {
      return (com.Yc_2)this.getUI();
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
      // 00: invokestatic com/CI.c ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 25: instanceof com/Yc_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.v Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 314
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Yc_2
      // 40: invokevirtual com/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Yc_2
      // 50: dup
      // 51: invokespecial com/Yc_2.<init> ()V
      // 54: invokevirtual com/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/CI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/CI.getUI ()Ljavax/swing/plaf/ListUI;
      // 67: invokevirtual com/CI.setUI (Ljavax/swing/plaf/ListUI;)V
      // 6a: return
   }

   public void O(Object var1) {
      String[] var10000 = c();
      ListModel var3 = this.getModel();
      String[] var2 = var10000;
      byte var5 = var3 instanceof eD_3;
      if (var2 == null) {
         if (var5 != 0) {
            this.T(((eD_3)var3).J(var1));
            if (var2 == null) {
               return;
            }
         }

         var5 = 0;
      }

      int var4 = var5;

      while (var4 < var3.getSize()) {
         if (var3.getElementAt(var4) == var1) {
            this.T(var4);
            if (var2 == null) {
               break;
            }
         }

         var4++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void T(int var1) {
      this.s(var1, var1);
   }

   public void s(int var1, int var2) {
      Rectangle var3 = this.getCellBounds(var1, var2);
      if (var3 != null) {
         this.repaint(var3);
      }
   }

   public int K() {
      return this.x;
   }

   public void c(com.os_4 var1) {
      this.U.add(var1);
   }

   public void r(com.os_4 var1) {
      this.U.remove(var1);
   }

   public void D$void(int var1) {
      this.x = var1;
      String[] var10000 = c();
      Iterator var3 = com.aL.J((Collection)this.U).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         com.os_4 var4 = (com.os_4)var3.next();
         var4.r(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   public void h(int var1, Object var2, Object var3) {
      String[] var10000 = c();
      this.x = -1;
      Iterator var5 = com.aL.J((Collection)this.U).iterator();
      String[] var4 = var10000;

      while (var5.hasNext()) {
         com.os_4 var6 = (com.os_4)var5.next();
         var6.u(var1, var2, var3);
         if (var4 != null) {
            break;
         }
      }
   }

   public void M(int var1) {
      String[] var10000 = c();
      this.x = -1;
      String[] var2 = var10000;

      for (com.os_4 var4 : com.aL.J((Collection)this.U)) {
         var4.V(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public MouseAdapter o(com.O5 var1) {
      return com.Fs_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, com.O5 var2) {
      return com.Fs_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(com.O5 var1) {
      return com.Fs_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(com.O5 var1) {
      return com.Fs_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(com.O5 var1) {
      return com.Fs_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(HT var1, com.O5 var2) {
      return com.Fs_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(com.O5 var1) {
      return com.Fs_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, com.O5 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(com.O5 var1) {
      return com.Fs_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(com.O5 var1) {
      return com.Fs_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr_2 var1) {
      return com.Fs_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr_2 var1) {
      return com.Fs_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr_2 var1) {
      return com.Fs_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(com.az_2 var1) {
      return com.Fs_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(com.az_2 var1) {
      return com.Fs_2.t(this, var1);
   }

   public com.CI G() {
      return (com.CI)com.FN.A(this);
   }

   public com.CI Q(boolean var1) {
      return (com.CI)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.CI w() {
      return (com.CI)com.FN.u(this);
   }

   public com.CI q(boolean var1) {
      return (com.CI)com.FN.D(this, var1);
   }

   @Override
   public boolean K$boolean() {
      return com.FN.U(this);
   }

   public com.CI A$comCI() {
      return (com.CI)com.FN.C(this);
   }

   public com.CI R(boolean var1) {
      return (com.CI)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.CI y(boolean var1, boolean var2) {
      return (com.CI)com.FN.K(this, var1, var2);
   }

   public com.CI j(int var1) {
      return (com.CI)com.FN.p(this, var1);
   }

   public com.CI z$comCI(int var1) {
      return (com.CI)com.FN.O(this, var1);
   }

   public com.CI h(int var1) {
      return (com.CI)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.CI J(int var1, boolean var2, boolean var3) {
      return (com.CI)com.FN.d(this, var1, var2, var3);
   }

   public com.CI v(int var1, int var2) {
      return (com.CI)com.FN.m(this, var1, var2);
   }

   public com.CI z(String var1) {
      return (com.CI)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public com.CI s(int var1) {
      return (com.CI)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public com.CI D$comCI(int var1) {
      return (com.CI)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public com.CI f(int var1) {
      return (com.CI)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public com.CI t(int var1) {
      return (com.CI)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public com.CI G(int var1) {
      return (com.CI)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public com.CI o(int var1) {
      return (com.CI)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.CI X(int var1, int var2) {
      return (com.CI)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.z(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.v(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.J(var1, var2, var3);
   }

   @Override
   public Component G$Component(int var1) {
      return this.h(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.z(var1);
   }

   @Override
   public Component i(int var1) {
      return this.j(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.y(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.R(var1);
   }

   @Override
   public Component Q$Component() {
      return this.A();
   }

   @Override
   public Component u(boolean var1) {
      return this.q(var1);
   }

   @Override
   public Component R$Component() {
      return this.w();
   }

   @Override
   public Component c(boolean var1) {
      return this.Q(var1);
   }

   @Override
   public Component a$Component() {
      return this.G();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.X(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.o(var1);
   }

   @Override
   public Component p(int var1) {
      return this.G(var1);
   }

   @Override
   public Component D$Component(int var1) {
      return this.t(var1);
   }

   @Override
   public Component V(int var1) {
      return this.f(var1);
   }

   @Override
   public Component x(int var1) {
      return this.D(var1);
   }

   @Override
   public Component O(int var1) {
      return this.s(var1);
   }

   public static void p(String[] var0) {
      B = var0;
   }

   public static String[] c() {
      return B;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (c() != null) {
         p(new String[4]);
      }
   }
}





