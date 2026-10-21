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
import java.text.Format;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;

public class l4_2 extends JFormattedTextField implements com.W2, RS, Pp_2, rF_3, com.au_2, Eh_2, com.yb_4, Sa_2 {
   public l4_2() {
   }

   public l4_2(AbstractFormatterFactory var1) {
      super(var1);
   }

   public l4_2(AbstractFormatterFactory var1, Object var2) {
      super(var1, var2);
   }

   public l4_2(Format var1) {
      super(var1);
   }

   public l4_2(AbstractFormatter var1) {
      super(var1);
   }

   public l4_2(Object var1) {
      super(var1);
   }

   public void X() {
      this.setText("");
   }

   public boolean b() {
      return this.v().R();
   }

   public void j(boolean var1) {
      this.v().R(var1);
   }

   public boolean Y() {
      return this.v().C();
   }

   public void S(boolean var1) {
      this.v().o(var1);
   }

   public JComponent V() {
      return this.v().v();
   }

   public void C(JComponent var1) {
      this.v().o(var1);
   }

   public JComponent s() {
      return this.v().d();
   }

   public void o(JComponent var1) {
      this.v().z(var1);
   }

   public void Z(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void F(int var1) {
      this.Z(var1, var1, var1, var1);
   }

   public void j(Insets var1) {
      this.v().T(var1);
   }

   public void x(int var1, int var2, int var3, int var4) {
      this.j(new Insets(var1, var2, var3, var4));
   }

   public void w(int var1) {
      this.x(var1, var1, var1, var1);
   }

   public Insets U() {
      return this.v().Z();
   }

   public int K() {
      return this.v().k();
   }

   public void C(int var1) {
      this.v().T(var1);
   }

   public boolean A() {
      return this.v().T();
   }

   public void O(boolean var1) {
      this.v().h(var1);
   }

   public int s$int() {
      return this.v().a();
   }

   public void z(int var1) {
      this.v().g(var1);
   }

   public boolean N() {
      return this.v().G();
   }

   public void y(boolean var1) {
      this.v().L(var1);
   }

   public boolean n() {
      return this.v().q();
   }

   public void n(boolean var1) {
      this.v().D(var1);
   }

   public com.og_4 i() {
      return this.v().i();
   }

   public void H(com.og_4 var1) {
      this.v().Y(var1);
   }

   public String F() {
      return this.v().F();
   }

   public void d(String var1) {
      this.v().F(var1);
   }

   public Font S() {
      return this.v().n();
   }

   public void a(Font var1) {
      this.v().B(var1);
   }

   public Color a() {
      return this.v().u();
   }

   public void L(Color var1) {
      this.v().w(var1);
   }

   public int L() {
      return this.v().O();
   }

   public void T(int var1) {
      this.v().e(var1);
   }

   public boolean e() {
      return this.v().A();
   }

   public void s(boolean var1) {
      this.v().k(var1);
   }

   @Override
   public Shape B() {
      return this.v().B();
   }

   public com.Q1 v() {
      return (com.Q1)this.getUI();
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
      // 06: ifeq 33
      // 09: invokevirtual com/l4_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/l4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/l4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/l4_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/Q1
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/l4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.L Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 205
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Q1
      // 40: invokevirtual com/l4_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Q1
      // 50: dup
      // 51: invokespecial com/Q1.<init> ()V
      // 54: invokevirtual com/l4_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/l4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/l4_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/l4_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/l4_2.invalidate ()V
      // 6e: return
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
   public void i$void() {
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
   public void e$void() {
      com.cl_4.H(this);
   }

   public com.l4_2 S$coml4_2() {
      return (com.l4_2)com.FN.A(this);
   }

   public com.l4_2 w(boolean var1) {
      return (com.l4_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.l4_2 r() {
      return (com.l4_2)com.FN.u(this);
   }

   public com.l4_2 a(boolean var1) {
      return (com.l4_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K$boolean() {
      return com.FN.U(this);
   }

   public com.l4_2 X$coml4_2() {
      return (com.l4_2)com.FN.C(this);
   }

   public com.l4_2 u(boolean var1) {
      return (com.l4_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.l4_2 O(boolean var1, boolean var2) {
      return (com.l4_2)com.FN.K(this, var1, var2);
   }

   public com.l4_2 A(int var1) {
      return (com.l4_2)com.FN.p(this, var1);
   }

   public com.l4_2 O(int var1) {
      return (com.l4_2)com.FN.O(this, var1);
   }

   public com.l4_2 h(int var1) {
      return (com.l4_2)com.FN.K(this, var1);
   }

   @Override
   public int Y$int() {
      return com.FN.r(this);
   }

   public com.l4_2 q(int var1, boolean var2, boolean var3) {
      return (com.l4_2)com.FN.d(this, var1, var2, var3);
   }

   public com.l4_2 s(int var1, int var2) {
      return (com.l4_2)com.FN.m(this, var1, var2);
   }

   public com.l4_2 G(String var1) {
      return (com.l4_2)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.l4_2 S(int var1) {
      return (com.l4_2)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public com.l4_2 C$coml4_2(int var1) {
      return (com.l4_2)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public com.l4_2 f(int var1) {
      return (com.l4_2)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public com.l4_2 b(int var1) {
      return (com.l4_2)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public com.l4_2 o(int var1) {
      return (com.l4_2)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public com.l4_2 M(int var1) {
      return (com.l4_2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.l4_2 W(int var1, int var2) {
      return (com.l4_2)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.G(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.s(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.q(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.h(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.O(var1);
   }

   @Override
   public Component i(int var1) {
      return this.A(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.O(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.u(var1);
   }

   @Override
   public Component Q$Component() {
      return this.X();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.a(var1);
   }

   @Override
   public Component R() {
      return this.r();
   }

   @Override
   public Component c(boolean var1) {
      return this.w(var1);
   }

   @Override
   public Component a$Component() {
      return this.S();
   }

   @Override
   public Component W$Component(int var1, int var2) {
      return this.W(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.M(var1);
   }

   @Override
   public Component p(int var1) {
      return this.o(var1);
   }

   @Override
   public Component D(int var1) {
      return this.b(var1);
   }

   @Override
   public Component V(int var1) {
      return this.f(var1);
   }

   @Override
   public Component x(int var1) {
      return this.C(var1);
   }

   @Override
   public Component O$Component(int var1) {
      return this.S(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





