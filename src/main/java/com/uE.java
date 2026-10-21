package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class uE extends JCheckBox implements com.W2, Pp_2, rF_3, com.au_2, Eh_2, com.yb_4, Sa_2 {
   private static boolean t;

   public uE() {
   }

   public uE(boolean var1) {
      super("", var1);
   }

   public uE(Icon var1) {
      super(var1);
   }

   public uE(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public uE(String var1) {
      super(var1);
   }

   public uE(Action var1) {
      super(var1);
   }

   public uE(String var1, boolean var2) {
      super(var1, var2);
   }

   public uE(String var1, Icon var2) {
      super(var1, var2);
   }

   public uE(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public com.DN R(Integer var1) {
      return this.d(new com.Cs_2(var1));
   }

   public com.DN X(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.d(new com.Cs_2(var1, var2, var3, var4));
   }

   public com.DN d(com.Cs_2 var1) {
      return w6_2.R(this, var1);
   }

   public com.DN d(com.Cs_2 var1, boolean var2) {
      return w6_2.T(this, var1, var2);
   }

   public com.DN w(com.Cs_2 var1, com.WF var2) {
      return w6_2.y(this, var1, var2);
   }

   public com.DN f(Component var1, com.Cs_2 var2) {
      return w6_2.k(var1, this, var2);
   }

   public com.DN I(Component var1, com.Cs_2 var2, boolean var3) {
      return w6_2.R(var1, this, var2, var3);
   }

   public com.DN B(Component var1, com.Cs_2 var2, com.WF var3) {
      return w6_2.V(var1, this, var2, var3);
   }

   public List a() {
      return w6_2.g((JComponent)this);
   }

   public void b(com.DN var1) {
      w6_2.n(var1);
   }

   public void X() {
      w6_2.A(this);
   }

   @Override
   public Insets getMargin() {
      return this.M().k();
   }

   @Override
   public void setMargin(Insets var1) {
      this.M().G(var1);
   }

   public void f(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void D(int var1) {
      this.f(var1, var1, var1, var1);
   }

   public boolean L() {
      return this.M().O();
   }

   public void w(boolean var1) {
      this.M().C(var1);
   }

   public boolean j() {
      return this.M().h();
   }

   public void r(boolean var1) {
      this.M().m(var1);
   }

   public Color V() {
      return this.M().J();
   }

   public void J(Color var1) {
      this.M().Z(var1);
   }

   public Color a$Color() {
      return this.M().e();
   }

   public void A(Color var1) {
      this.M().p(var1);
   }

   public Color I() {
      return this.M().p();
   }

   public void T(Color var1) {
      this.M().O(var1);
   }

   public Color H() {
      return this.M().h();
   }

   public void Q(Color var1) {
      this.M().R(var1);
   }

   public Color g() {
      return this.M().a();
   }

   public void c(Color var1) {
      this.M().b(var1);
   }

   public Color N() {
      return this.M().n();
   }

   public void D(Color var1) {
      this.M().B(var1);
   }

   public Color D() {
      return this.M().S();
   }

   public void b(Color var1) {
      this.M().n(var1);
   }

   public int y() {
      return this.M().n();
   }

   public void Y(int var1) {
      this.M().i(var1);
   }

   public int z() {
      return this.M().V();
   }

   public void e(int var1) {
      this.M().f(var1);
   }

   public int q() {
      return this.M().H();
   }

   public void G(int var1) {
      this.M().P(var1);
   }

   public int B() {
      return this.M().R();
   }

   public void u(int var1) {
      this.M().t(var1);
   }

   @Override
   public void setSelected(boolean var1) {
      this.M(var1, this.isShowing());
   }

   public void M(boolean var1, boolean var2) {
      uE var6;
      boolean var10001;
      label31: {
         boolean var4;
         boolean var10000 = o();
         var4 = this.L();
         boolean var3 = var10000;
         var5 = var2;
         label27:
         if (var3) {
            if (!var2) {
               var5 = var4;
               if (!var3) {
                  break label27;
               }

               if (var4) {
                  this.w(false);
               }
            }

            var6 = this;
            var10001 = var1;
            if (!var3) {
               break label31;
            }

            super.setSelected(var1);
            var5 = var2;
         }

         if (var5) {
            return;
         }

         var6 = this;
         var10001 = var4;
      }

      var6.w(var10001);
   }

   @Override
   public Shape B$Shape() {
      return this.M().B();
   }

   public com.Fm_2 M() {
      return (com.Fm_2)this.getUI();
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
      // 00: invokestatic com/uE.Z ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/uE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/uE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/uE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/uE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/Fm_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/uE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.E Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 255
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Fm_2
      // 40: invokevirtual com/uE.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Fm_2
      // 50: dup
      // 51: invokespecial com/Fm_2.<init> ()V
      // 54: invokevirtual com/uE.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/uE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/uE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/uE.setUI (Ljavax/swing/plaf/ButtonUI;)V
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
   public void u(String var1, Object[] var2) {
      i2_2.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this, var1, var2);
   }

   @Override
   public void M$void() {
      i2_2.L(this);
   }

   @Override
   public boolean k() {
      return i2_2.Z(this);
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this, var1);
   }

   @Override
   public void i() {
      i2_2.o(this);
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
   public void w() {
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

   public uE T() {
      return (uE)com.FN.A(this);
   }

   public uE K(boolean var1) {
      return (uE)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public uE k$uE() {
      return (uE)com.FN.u(this);
   }

   public uE A(boolean var1) {
      return (uE)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public uE f() {
      return (uE)com.FN.C(this);
   }

   public uE W(boolean var1) {
      return (uE)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public uE t(boolean var1, boolean var2) {
      return (uE)com.FN.K(this, var1, var2);
   }

   public uE l(int var1) {
      return (uE)com.FN.p(this, var1);
   }

   public uE D$uE(int var1) {
      return (uE)com.FN.O(this, var1);
   }

   public uE q(int var1) {
      return (uE)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public uE B(int var1, boolean var2, boolean var3) {
      return (uE)com.FN.d(this, var1, var2, var3);
   }

   public uE U(int var1, int var2) {
      return (uE)com.FN.m(this, var1, var2);
   }

   public uE r(String var1) {
      return (uE)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public uE G$uE(int var1) {
      return (uE)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public uE g(int var1) {
      return (uE)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public uE o(int var1) {
      return (uE)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public uE z(int var1) {
      return (uE)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public uE m(int var1) {
      return (uE)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public uE S(int var1) {
      return (uE)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public uE Y(int var1, int var2) {
      return (uE)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.r(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.B(var1, var2, var3);
   }

   @Override
   public Component G$Component(int var1) {
      return this.q(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.D(var1);
   }

   @Override
   public Component i(int var1) {
      return this.l(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.t(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.W(var1);
   }

   @Override
   public Component Q$Component() {
      return this.f();
   }

   @Override
   public Component u(boolean var1) {
      return this.A(var1);
   }

   @Override
   public Component R() {
      return this.k();
   }

   @Override
   public Component c(boolean var1) {
      return this.K(var1);
   }

   @Override
   public Component a$Component() {
      return this.T();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.Y(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.S(var1);
   }

   @Override
   public Component p(int var1) {
      return this.m(var1);
   }

   @Override
   public Component D$Component(int var1) {
      return this.z(var1);
   }

   @Override
   public Component V(int var1) {
      return this.o(var1);
   }

   @Override
   public Component x(int var1) {
      return this.g(var1);
   }

   @Override
   public Component O(int var1) {
      return this.G(var1);
   }

   public static void X(boolean var0) {
      t = var0;
   }

   public static boolean Z() {
      return t;
   }

   public static boolean o() {
      boolean var0 = Z();
      return !var0;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (Z()) {
         X(true);
      }
   }
}





