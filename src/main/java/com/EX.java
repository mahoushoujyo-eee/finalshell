package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BoundedRangeModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JSlider;

public class EX extends JSlider implements Pp_2, rF_3, Eh_2, com.yb_4, Sa_2 {
   public EX() {
   }

   public EX(int var1) {
      super(var1);
   }

   public EX(int var1, int var2) {
      super(var1, var2);
   }

   public EX(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public EX(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public EX(BoundedRangeModel var1) {
      super(var1);
   }

   public boolean N() {
      return this.i().h();
   }

   public void u(boolean var1) {
      this.i().J(var1);
   }

   public boolean A() {
      return this.i().f();
   }

   public void l(boolean var1) {
      this.i().F(var1);
   }

   public boolean c() {
      return this.i().G();
   }

   public void c(boolean var1) {
      this.i().j(var1);
   }

   public Color T() {
      return this.i().O();
   }

   public void d(Color var1) {
      this.i().l(var1);
   }

   public Color W() {
      return this.i().u();
   }

   public void j(Color var1) {
      this.i().h(var1);
   }

   public int o() {
      return this.i().Y();
   }

   public void Y(int var1) {
      this.i().y(var1);
   }

   public int E() {
      return this.i().M();
   }

   public void b(int var1) {
      this.i().E(var1);
   }

   public int S() {
      return this.i().P();
   }

   public void S(int var1) {
      this.i().M(var1);
   }

   public boolean r() {
      return this.i().L();
   }

   public void D(boolean var1) {
      this.i().D(var1);
   }

   public Color S$Color() {
      return this.i().d();
   }

   public void D(Color var1) {
      this.i().x(var1);
   }

   public Color w() {
      return this.i().b();
   }

   public void s(Color var1) {
      this.i().w(var1);
   }

   public Color s() {
      return this.i().s();
   }

   public void V(Color var1) {
      this.i().B(var1);
   }

   public int K() {
      return this.i().V();
   }

   public void J(int var1) {
      this.i().s(var1);
   }

   public int r$int() {
      return this.i().h();
   }

   public void d(int var1) {
      this.i().q(var1);
   }

   public boolean M() {
      return this.i().T();
   }

   public void a(boolean var1) {
      this.i().p(var1);
   }

   public Color b() {
      return this.i().A();
   }

   public void L(Color var1) {
      this.i().g(var1);
   }

   public Color R() {
      return this.i().f();
   }

   public void X(Color var1) {
      this.i().k(var1);
   }

   public int y() {
      return this.i().p();
   }

   public void P(int var1) {
      this.i().L(var1);
   }

   public int z() {
      return this.i().I();
   }

   public void H(int var1) {
      this.i().H(var1);
   }

   public int O() {
      return this.i().l();
   }

   public void e(int var1) {
      this.i().j(var1);
   }

   public int D() {
      return this.i().S();
   }

   public void p(int var1) {
      this.i().l(var1);
   }

   public boolean Q() {
      return this.i().x();
   }

   public void Y(boolean var1) {
      this.i().m(var1);
   }

   public boolean O$boolean() {
      return this.i().s();
   }

   public void K(boolean var1) {
      this.i().K(var1);
   }

   public int P() {
      return this.i().i();
   }

   public void a(int var1) {
      this.i().V(var1);
   }

   public Insets V() {
      return this.i().r();
   }

   public void q(Insets var1) {
      this.i().p(var1);
   }

   public EX g(int var1, int var2, int var3, int var4) {
      this.q(new Insets(var1, var2, var3, var4));
      return this;
   }

   public EX R(int var1) {
      return this.g(var1, var1, var1, var1);
   }

   public com.og_4 r$comog_4() {
      return this.i().o();
   }

   public EX y(com.og_4 var1) {
      this.i().S(var1);
      return this;
   }

   public _n_2 i() {
      return (_n_2)this.getUI();
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
      // 00: invokestatic com/_n_2.G ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/EX.getUI ()Ljavax/swing/plaf/SliderUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/EX.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 68
      // 1b: goto 22
      // 1e: invokestatic com/EX.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/EX.getUI ()Ljavax/swing/plaf/SliderUI;
      // 25: instanceof com/_n_2
      // 28: ifne 60
      // 2b: goto 32
      // 2e: invokestatic com/EX.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.b Ljava/lang/String;
      // 36: bipush 1
      // 37: anewarray 227
      // 3a: dup
      // 3b: bipush 0
      // 3c: aload 0
      // 3d: aastore
      // 3e: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 41: checkcast com/_n_2
      // 44: invokevirtual com/EX.setUI (Ljavax/swing/plaf/SliderUI;)V
      // 47: goto 6f
      // 4a: astore 2
      // 4b: aload 0
      // 4c: aload 2
      // 4d: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 50: aload 0
      // 51: new com/_n_2
      // 54: dup
      // 55: aload 0
      // 56: invokespecial com/_n_2.<init> (Ljavax/swing/JSlider;)V
      // 59: invokevirtual com/EX.setUI (Ljavax/swing/plaf/SliderUI;)V
      // 5c: iload 1
      // 5d: ifeq 6f
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic com/EX.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: invokevirtual com/EX.getUI ()Ljavax/swing/plaf/SliderUI;
      // 6c: invokevirtual com/EX.setUI (Ljavax/swing/plaf/SliderUI;)V
      // 6f: return
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

   public EX J() {
      return (EX)com.FN.A(this);
   }

   public EX Z(boolean var1) {
      return (EX)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public EX j() {
      return (EX)com.FN.u(this);
   }

   public EX S(boolean var1) {
      return (EX)com.FN.D(this, var1);
   }

   @Override
   public boolean K$boolean() {
      return com.FN.U(this);
   }

   public EX P$EX() {
      return (EX)com.FN.C(this);
   }

   public EX m(boolean var1) {
      return (EX)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public EX n(boolean var1, boolean var2) {
      return (EX)com.FN.K(this, var1, var2);
   }

   public EX F(int var1) {
      return (EX)com.FN.p(this, var1);
   }

   public EX M(int var1) {
      return (EX)com.FN.O(this, var1);
   }

   public EX T(int var1) {
      return (EX)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public EX i(int var1, boolean var2, boolean var3) {
      return (EX)com.FN.d(this, var1, var2, var3);
   }

   public EX V(int var1, int var2) {
      return (EX)com.FN.m(this, var1, var2);
   }

   public EX P(String var1) {
      return (EX)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public EX q(int var1) {
      return (EX)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public EX m(int var1) {
      return (EX)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public EX p$EX(int var1) {
      return (EX)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public EX i(int var1) {
      return (EX)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public EX Y$EX(int var1) {
      return (EX)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public EX K(int var1) {
      return (EX)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public EX K(int var1, int var2) {
      return (EX)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.P(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.V(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.i(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.T(var1);
   }

   @Override
   public Component o(int var1) {
      return this.M(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.F(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.n(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.m(var1);
   }

   @Override
   public Component Q$Component() {
      return this.P();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.S(var1);
   }

   @Override
   public Component R$Component() {
      return this.j();
   }

   @Override
   public Component c$Component(boolean var1) {
      return this.Z(var1);
   }

   @Override
   public Component a$Component() {
      return this.J();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.K(var1, var2);
   }

   @Override
   public Component d$Component(int var1) {
      return this.K(var1);
   }

   @Override
   public Component p$Component(int var1) {
      return this.Y(var1);
   }

   @Override
   public Component D(int var1) {
      return this.i(var1);
   }

   @Override
   public Component V(int var1) {
      return this.p(var1);
   }

   @Override
   public Component x(int var1) {
      return this.m(var1);
   }

   @Override
   public Component O(int var1) {
      return this.q(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





