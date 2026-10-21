package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.text.Document;

public class R6 extends JPasswordField implements com.W2, RS, Pp_2, rF_3, com.au_2, Eh_2, com.yb_4, Sa_2 {
   private static final long a;

   public R6() {
   }

   public R6(String var1) {
      super(var1);
   }

   public R6(int var1) {
      super(var1);
   }

   public R6(String var1, int var2) {
      super(var1, var2);
   }

   public R6(Document var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   public void v() {
      this.setText("");
   }

   public boolean a() {
      return this.q().K();
   }

   public void x(boolean var1) {
      this.q().g(var1);
   }

   public boolean S() {
      return this.q().X();
   }

   public void o(boolean var1) {
      this.q().X(var1);
   }

   public JComponent x() {
      return this.q().w();
   }

   public void w(JComponent var1) {
      this.q().K(var1);
   }

   public JComponent l() {
      return this.q().f();
   }

   public void y(JComponent var1) {
      this.q().b(var1);
   }

   public void g(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void I(int var1) {
      this.g(var1, var1, var1, var1);
   }

   public void z(Insets var1) {
      this.q().S(var1);
   }

   public void v(int var1, int var2, int var3, int var4) {
      this.z(new Insets(var1, var2, var3, var4));
   }

   public void j(int var1) {
      this.v(var1, var1, var1, var1);
   }

   public Insets Q() {
      return this.q().v();
   }

   public int O() {
      return this.q().b();
   }

   public void z(int var1) {
      this.q().b(var1);
   }

   public boolean t() {
      return this.q().Z();
   }

   public void m(boolean var1) {
      this.q().A(var1);
   }

   public int q() {
      return this.q().G();
   }

   public void x(int var1) {
      this.q().M(var1);
   }

   public boolean o() {
      return this.q().b();
   }

   public void Y(boolean var1) {
      this.q().Y(var1);
   }

   public boolean W() {
      return this.q().C();
   }

   public void J(boolean var1) {
      this.q().m(var1);
   }

   public com.og_4 J() {
      return this.q().o();
   }

   public void f(com.og_4 var1) {
      this.q().f(var1);
   }

   public String p() {
      return this.q().P();
   }

   public void G(String var1) {
      this.q().w(var1);
   }

   public Font Q$Font() {
      return this.q().M();
   }

   public void r(Font var1) {
      this.q().G(var1);
   }

   public Color D() {
      return this.q().t();
   }

   public void I(Color var1) {
      this.q().o(var1);
   }

   public int h() {
      return this.q().s();
   }

   public void M(int var1) {
      this.q().U(var1);
   }

   public boolean u() {
      return this.q().D();
   }

   public void r(boolean var1) {
      this.q().T(var1);
   }

   @Override
   public Shape B() {
      return this.q().B();
   }

   public Hl_2 q$Hl_2() {
      return (Hl_2)this.getUI();
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
      // 00: invokestatic com/ne_4.A ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 26
      // 09: invokevirtual com/R6.echoCharIsSet ()Z
      // 0c: ifne 25
      // 0f: goto 16
      // 12: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic com/R6.a J
      // 1a: l2i
      // 1b: invokevirtual com/R6.setEchoChar (C)V
      // 1e: goto 25
      // 21: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: ifeq 54
      // 2a: invokevirtual com/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 2d: ifnull 53
      // 30: goto 37
      // 33: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: iload 1
      // 39: ifeq 84
      // 3c: goto 43
      // 3f: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: invokevirtual com/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 46: instanceof com/Hl_2
      // 49: ifne 7c
      // 4c: goto 53
      // 4f: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 0
      // 54: getstatic com/a9.w Ljava/lang/String;
      // 57: bipush 0
      // 58: anewarray 211
      // 5b: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5e: checkcast com/Hl_2
      // 61: invokevirtual com/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 64: goto 8b
      // 67: astore 2
      // 68: aload 0
      // 69: aload 2
      // 6a: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 6d: aload 0
      // 6e: new com/Hl_2
      // 71: dup
      // 72: invokespecial com/Hl_2.<init> ()V
      // 75: invokevirtual com/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 78: iload 1
      // 79: ifne 8b
      // 7c: aload 0
      // 7d: goto 84
      // 80: invokestatic com/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: aload 0
      // 85: invokevirtual com/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 88: invokevirtual com/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 8b: aload 0
      // 8c: invokevirtual com/R6.invalidate ()V
      // 8f: return
   }

   @Override
   public com.F5 i(Rk_2 var1) {
      return com.Fs_2.X(this, var1);
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
   public void O$void() {
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
   public void M() {
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

   public R6 W$R6() {
      return (R6)com.FN.A(this);
   }

   public R6 V(boolean var1) {
      return (R6)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public R6 g() {
      return (R6)com.FN.u(this);
   }

   public R6 H(boolean var1) {
      return (R6)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public R6 M$R6() {
      return (R6)com.FN.C(this);
   }

   public R6 P(boolean var1) {
      return (R6)com.FN.q(this, var1);
   }

   @Override
   public boolean l$boolean() {
      return com.FN.G(this);
   }

   public R6 Z(boolean var1, boolean var2) {
      return (R6)com.FN.K(this, var1, var2);
   }

   public R6 p(int var1) {
      return (R6)com.FN.p(this, var1);
   }

   public R6 K(int var1) {
      return (R6)com.FN.O(this, var1);
   }

   public R6 O(int var1) {
      return (R6)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public R6 O(int var1, boolean var2, boolean var3) {
      return (R6)com.FN.d(this, var1, var2, var3);
   }

   public R6 V(int var1, int var2) {
      return (R6)com.FN.m(this, var1, var2);
   }

   public R6 K(String var1) {
      return (R6)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public R6 t(int var1) {
      return (R6)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public R6 m(int var1) {
      return (R6)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public R6 P(int var1) {
      return (R6)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public R6 f(int var1) {
      return (R6)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public R6 C(int var1) {
      return (R6)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public R6 T(int var1) {
      return (R6)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public R6 K(int var1, int var2) {
      return (R6)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.K(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.V(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.O(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.O(var1);
   }

   @Override
   public Component o(int var1) {
      return this.K(var1);
   }

   @Override
   public Component i(int var1) {
      return this.p(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.Z(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.P(var1);
   }

   @Override
   public Component Q$Component() {
      return this.M();
   }

   @Override
   public Component u(boolean var1) {
      return this.H(var1);
   }

   @Override
   public Component R() {
      return this.g();
   }

   @Override
   public Component c(boolean var1) {
      return this.V(var1);
   }

   @Override
   public Component a$Component() {
      return this.W();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.K(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.T(var1);
   }

   @Override
   public Component p$Component(int var1) {
      return this.C(var1);
   }

   @Override
   public Component D(int var1) {
      return this.f(var1);
   }

   @Override
   public Component V(int var1) {
      return this.P(var1);
   }

   @Override
   public Component x$Component(int var1) {
      return this.m(var1);
   }

   @Override
   public Component O$Component(int var1) {
      return this.t(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      long var0 = 8953872291300177252L;
      long var10002 = -5860367380380060338L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





