package com.L;

import com.Eh_2;
import com.HT;
import com.IB;
import com.PY;
import com.Pp_2;
import com.Sa_2;
import com.Sr_2;
import com.rF_3;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class X extends JComboBox implements com.W2, Pp_2, rF_3, Eh_2, com.yb_4, Sa_2 {
   public X() {
   }

   public X(Vector var1) {
      super(var1);
   }

   public X(Vector var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X(Vector var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   public X(Object[] var1) {
      super(var1);
   }

   public X(Object[] var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X(Object[] var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   public X(ComboBoxModel var1) {
      super(var1);
   }

   public X(ComboBoxModel var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X(ComboBoxModel var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   @Override
   public int getSelectedIndex() {
      Object var2 = this.dataModel.getSelectedItem();
      com.ky_4[] var10000 = m.X();
      int var3 = 0;
      com.ky_4[] var1 = var10000;

      while (true) {
         if (var3 < this.dataModel.getSize()) {
            Object var4 = this.dataModel.getElementAt(var3);
            if (var1 == null) {
               var5 = com.ax_2.Z(var4, new Object[]{var2});
               if (var1 != null) {
                  break;
               }

               if (var5 != 0) {
                  return var3;
               }

               var3++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var5 = -1;
         break;
      }

      return var5;
   }

   public void W(int var1) {
      this.M().m(var1);
   }

   public boolean v() {
      return this.M().m();
   }

   public void P(boolean var1) {
      this.M().G(var1);
   }

   public ImageIcon g() {
      return this.M().d();
   }

   public void V(ImageIcon var1) {
      this.M().k(var1);
   }

   public ImageIcon A() {
      return this.M().L();
   }

   public void y(ImageIcon var1) {
      this.M().h(var1);
   }

   public int w() {
      return this.M().B();
   }

   public void l(int var1) {
      this.M().D(var1);
   }

   public boolean E() {
      return this.M().k();
   }

   public void B(boolean var1) {
      this.M().n(var1);
   }

   public boolean V() {
      return this.M().J();
   }

   public void y(boolean var1) {
      this.M().E(var1);
   }

   public Color n() {
      return this.M().U();
   }

   public void z(Color var1) {
      this.M().l(var1);
   }

   public boolean C() {
      return this.M().f();
   }

   public void M(boolean var1) {
      this.M().a(var1);
   }

   public int l() {
      return this.M().N();
   }

   public void a(int var1) {
      this.M().P(var1);
   }

   public int t() {
      return this.M().J();
   }

   public void x(int var1) {
      this.M().A(var1);
   }

   public boolean n$boolean() {
      return this.M().G();
   }

   public void Y(boolean var1) {
      this.M().W(var1);
   }

   @Override
   public Shape B() {
      return this.M().B();
   }

   public com.L.Q n$comLQ() {
      return (com.L.Q)this.getRenderer();
   }

   public m M() {
      return (m)this.getUI();
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
      // 00: invokestatic com/L/m.X ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/L/X.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/L/X.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/L/X.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/L/X.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 25: instanceof com/L/m
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/L/X.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.F Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 66
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/L/m
      // 40: invokevirtual com/L/X.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/L/m
      // 50: dup
      // 51: invokespecial com/L/m.<init> ()V
      // 54: invokevirtual com/L/X.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/L/X.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/L/X.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 67: invokevirtual com/L/X.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 6a: return
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

   @Override
   public com.Wd_2 p(String var1) {
      return com.ac_2.I(this, var1);
   }

   @Override
   public com.Wd_2 d(Icon var1, String var2) {
      return com.ac_2.d(this, var1, var2);
   }

   @Override
   public com.Wd_2 V(String var1, com.WF var2) {
      return com.ac_2.B(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(Icon var1, String var2, com.WF var3) {
      return com.ac_2.g(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 y(String var1, com.WF var2, int var3) {
      return com.ac_2.l(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 Y(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.R(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 g(JComponent var1) {
      return com.ac_2.k(this, var1);
   }

   @Override
   public com.Wd_2 I(JComponent var1, int var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 j(JComponent var1, com.WF var2) {
      return com.ac_2.R(this, var1, var2);
   }

   @Override
   public com.Wd_2 g(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.B(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 s(String var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 u(Icon var1, String var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 u(String var1, com.WF var2) {
      return com.ac_2.q(this, var1, var2);
   }

   @Override
   public com.Wd_2 h(Icon var1, String var2, com.WF var3) {
      return com.ac_2.P(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 f(String var1, com.WF var2, int var3) {
      return com.ac_2.r(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 o(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.V(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 B(JComponent var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 p(JComponent var1, int var2) {
      return com.ac_2.S(this, var1, var2);
   }

   @Override
   public com.Wd_2 n(JComponent var1, com.WF var2) {
      return com.ac_2.I(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(com.Wd_2 var1) {
      com.ac_2.s(this, var1);
   }

   @Override
   public void O() {
      com.ac_2.o(this);
   }

   @Override
   public void q(com.Wd_2[] var1) {
      com.ac_2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      com.ac_2.S(this, var1);
   }

   @Override
   public void p$void(String var1) {
      com.cl_4.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
      com.cl_4.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      com.cl_4.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      com.cl_4.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      com.cl_4.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      com.cl_4.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      com.cl_4.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      com.cl_4.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      com.cl_4.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      com.cl_4.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      com.cl_4.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      com.cl_4.a(this, var1);
   }

   @Override
   public void w$void() {
      com.cl_4.O(this);
   }

   @Override
   public void m() {
      com.cl_4.G(this);
   }

   @Override
   public void e() {
      com.cl_4.H(this);
   }

   public com.L.X a() {
      return (com.L.X)com.FN.A(this);
   }

   public com.L.X t(boolean var1) {
      return (com.L.X)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.L.X J() {
      return (com.L.X)com.FN.u(this);
   }

   public com.L.X c(boolean var1) {
      return (com.L.X)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.L.X b() {
      return (com.L.X)com.FN.C(this);
   }

   public com.L.X Y$comLX(boolean var1) {
      return (com.L.X)com.FN.q(this, var1);
   }

   @Override
   public boolean l$boolean() {
      return com.FN.G(this);
   }

   public com.L.X J(boolean var1, boolean var2) {
      return (com.L.X)com.FN.K(this, var1, var2);
   }

   public com.L.X v(int var1) {
      return (com.L.X)com.FN.p(this, var1);
   }

   public com.L.X X(int var1) {
      return (com.L.X)com.FN.O(this, var1);
   }

   public com.L.X V(int var1) {
      return (com.L.X)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.L.X X(int var1, boolean var2, boolean var3) {
      return (com.L.X)com.FN.d(this, var1, var2, var3);
   }

   public com.L.X p(int var1, int var2) {
      return (com.L.X)com.FN.m(this, var1, var2);
   }

   public com.L.X r(String var1) {
      return (com.L.X)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.L.X u(int var1) {
      return (com.L.X)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public com.L.X x$comLX(int var1) {
      return (com.L.X)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public com.L.X e(int var1) {
      return (com.L.X)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public com.L.X Z(int var1) {
      return (com.L.X)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public com.L.X R(int var1) {
      return (com.L.X)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public com.L.X i(int var1) {
      return (com.L.X)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.L.X U(int var1, int var2) {
      return (com.L.X)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.r(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.p(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.X(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.V(var1);
   }

   @Override
   public Component o(int var1) {
      return this.X(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.v(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.J(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.Y(var1);
   }

   @Override
   public Component Q$Component() {
      return this.b();
   }

   @Override
   public Component u(boolean var1) {
      return this.c(var1);
   }

   @Override
   public Component R() {
      return this.J();
   }

   @Override
   public Component c$Component(boolean var1) {
      return this.t(var1);
   }

   @Override
   public Component a$Component() {
      return this.a();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.i(var1);
   }

   @Override
   public Component p(int var1) {
      return this.R(var1);
   }

   @Override
   public Component D(int var1) {
      return this.Z(var1);
   }

   @Override
   public Component V$Component(int var1) {
      return this.e(var1);
   }

   @Override
   public Component x$Component(int var1) {
      return this.x(var1);
   }

   @Override
   public Component O(int var1) {
      return this.u(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





