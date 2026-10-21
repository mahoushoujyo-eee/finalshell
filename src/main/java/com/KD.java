package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

public class KD extends JButton implements com.W2, Pp_2, rF_3, com.au_2, com.yb_4, Sa_2 {
   private static int[] G;

   public KD() {
   }

   public KD(Icon var1) {
      super(var1);
      this.s(SG.T);
      this.O(SG.M);
   }

   public KD(Icon var1, Icon var2) {
      super(var1);
      this.setRolloverIcon(var2);
      this.s(SG.T);
      this.O(SG.M);
   }

   public KD(String var1) {
      super(var1);
   }

   public KD(String var1, Icon var2) {
      super(var1, var2);
   }

   public KD(ActionListener var1) {
      this.addActionListener(var1);
   }

   public KD(Icon var1, ActionListener var2) {
      super(var1);
      this.s(SG.T);
      this.O(SG.M);
      this.addActionListener(var2);
   }

   public KD(String var1, ActionListener var2) {
      super(var1);
      this.addActionListener(var2);
   }

   public KD(String var1, Icon var2, ActionListener var3) {
      super(var1, var2);
      this.addActionListener(var3);
   }

   public KD(Action var1) {
      super(var1);
   }

   public KD(com.og_4 var1) {
      this.U(var1);
   }

   public com.DN U(Integer var1) {
      return this.p(new com.Cs_2(var1));
   }

   public com.DN K(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.p(new com.Cs_2(var1, var2, var3, var4));
   }

   public com.DN p(com.Cs_2 var1) {
      return w6_2.R(this, var1);
   }

   public com.DN C(com.Cs_2 var1, boolean var2) {
      return w6_2.T(this, var1, var2);
   }

   public com.DN G(com.Cs_2 var1, com.WF var2) {
      return w6_2.y(this, var1, var2);
   }

   public com.DN Y(Component var1, com.Cs_2 var2) {
      return w6_2.k(var1, this, var2);
   }

   public com.DN Q(Component var1, com.Cs_2 var2, boolean var3) {
      return w6_2.R(var1, this, var2, var3);
   }

   public com.DN d(Component var1, com.Cs_2 var2, com.WF var3) {
      return w6_2.V(var1, this, var2, var3);
   }

   public List v() {
      return w6_2.g((JComponent)this);
   }

   public void l(com.DN var1) {
      w6_2.n(var1);
   }

   public void h() {
      w6_2.A(this);
   }

   public Color D() {
      return this.f().Y();
   }

   public com.KD n(Color var1) {
      this.f().d(var1);
      return this;
   }

   public Color Q() {
      return this.f().z();
   }

   public com.KD l(Color var1) {
      this.f().Q(var1);
      return this;
   }

   public Color N() {
      return this.f().k();
   }

   public com.KD e(Color var1) {
      this.f().J(var1);
      return this;
   }

   public Color n() {
      return this.f().i();
   }

   public com.KD G(Color var1) {
      this.f().w(var1);
      return this;
   }

   public Color t() {
      return this.f().H();
   }

   public com.KD t(Color var1) {
      this.f().j(var1);
      return this;
   }

   public boolean g() {
      return this.f().H();
   }

   public com.KD g(boolean var1) {
      this.f().f(var1);
      return this;
   }

   public boolean e() {
      return this.f().G();
   }

   public com.KD S(boolean var1) {
      this.f().y(var1);
      return this;
   }

   public Color M() {
      return this.f().l();
   }

   public com.KD u(Color var1) {
      this.f().u(var1);
      return this;
   }

   public int h$int() {
      return this.f().C();
   }

   public com.KD s(int var1) {
      this.f().D(var1);
      return this;
   }

   public boolean u() {
      return this.f().R();
   }

   public com.KD a(boolean var1) {
      this.f().w(var1);
      return this;
   }

   public boolean T() {
      return this.f().U();
   }

   public com.KD h(boolean var1) {
      this.f().d(var1);
      return this;
   }

   public boolean q() {
      return this.f().k();
   }

   public com.KD b(boolean var1) {
      this.f().A(var1);
      return this;
   }

   public int q$int() {
      return this.f().d();
   }

   public com.KD f(int var1) {
      this.f().z(var1);
      return this;
   }

   public Color U() {
      return this.f().V();
   }

   public com.KD H(Color var1) {
      this.f().F(var1);
      return this;
   }

   public int b() {
      return this.f().Z();
   }

   public com.KD x(int var1) {
      this.f().r(var1);
      return this;
   }

   public Color s() {
      return this.f().t();
   }

   public com.KD z(Color var1) {
      this.f().O(var1);
      return this;
   }

   public Color C() {
      return this.f().E();
   }

   public com.KD s(Color var1) {
      this.f().s(var1);
      return this;
   }

   public int r() {
      return this.f().N();
   }

   public com.KD O(int var1) {
      this.f().l(var1);
      return this;
   }

   public boolean j() {
      return this.f().x();
   }

   public com.KD K(boolean var1) {
      this.f().q(var1);
      return this;
   }

   public boolean Y() {
      return this.f().m();
   }

   public com.KD j(boolean var1) {
      this.f().k(var1);
      return this;
   }

   public boolean m() {
      return this.f().o();
   }

   public com.KD G(boolean var1) {
      this.f().l(var1);
      return this;
   }

   public com.og_4 l() {
      return this.f().R();
   }

   public com.KD U(com.og_4 var1) {
      this.f().S(var1);
      return this;
   }

   public boolean I() {
      return this.f().K();
   }

   public com.KD t(boolean var1) {
      this.f().B(var1);
      return this;
   }

   public boolean z() {
      return this.f().A();
   }

   public com.KD r(boolean var1) {
      this.f().M(var1);
      return this;
   }

   public boolean V() {
      return this.f().n();
   }

   public com.KD l(boolean var1) {
      this.f().r(var1);
      return this;
   }

   public boolean C$boolean() {
      return this.f().i();
   }

   public com.KD x(boolean var1) {
      this.f().m(var1);
      return this;
   }

   public boolean P() {
      return this.f().C();
   }

   public com.KD X(boolean var1) {
      this.f().E(var1);
      return this;
   }

   public boolean Z() {
      return this.f().Y();
   }

   public com.KD W(boolean var1) {
      this.f().J(var1);
      return this;
   }

   public com.KD E(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.f().Z(var1, var2, var3, var4);
      return this;
   }

   public boolean b$boolean() {
      return this.f().F();
   }

   public com.KD z(boolean var1) {
      this.f().L(var1);
      return this;
   }

   public boolean c() {
      return this.f().B();
   }

   public com.KD M(boolean var1) {
      this.f().Q(var1);
      return this;
   }

   public boolean w() {
      return this.f().W();
   }

   public com.KD Z(boolean var1) {
      this.f().W(var1);
      return this;
   }

   public boolean s$boolean() {
      return this.f().I();
   }

   public com.KD u(boolean var1) {
      this.f().K(var1);
      return this;
   }

   public com.KD h(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.f().a(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Insets getMargin() {
      return this.f().A();
   }

   @Override
   public void setMargin(Insets var1) {
      this.f().Q(var1);
   }

   public com.KD V(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
      return this;
   }

   public com.KD e(int var1) {
      return this.V(var1, var1, var1, var1);
   }

   @Override
   public Shape B() {
      return this.f().B();
   }

   public Gi_2 f() {
      return (Gi_2)this.getUI();
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
      // 00: invokestatic com/KD.s ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/Gi_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.r Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 350
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Gi_2
      // 40: invokevirtual com/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Gi_2
      // 50: dup
      // 51: invokespecial com/Gi_2.<init> ()V
      // 54: invokevirtual com/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   public com.KD B$comKD() {
      return (com.KD)com.FN.A(this);
   }

   public com.KD N(boolean var1) {
      return (com.KD)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public com.KD c$comKD() {
      return (com.KD)com.FN.u(this);
   }

   public com.KD P(boolean var1) {
      return (com.KD)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.KD s$comKD() {
      return (com.KD)com.FN.C(this);
   }

   public com.KD m(boolean var1) {
      return (com.KD)com.FN.q(this, var1);
   }

   @Override
   public boolean l$boolean() {
      return com.FN.G(this);
   }

   public com.KD c(boolean var1, boolean var2) {
      return (com.KD)com.FN.K(this, var1, var2);
   }

   public com.KD F(int var1) {
      return (com.KD)com.FN.p(this, var1);
   }

   public com.KD j(int var1) {
      return (com.KD)com.FN.O(this, var1);
   }

   public com.KD J(int var1) {
      return (com.KD)com.FN.K(this, var1);
   }

   @Override
   public int Y$int() {
      return com.FN.r(this);
   }

   public com.KD G(int var1, boolean var2, boolean var3) {
      return (com.KD)com.FN.d(this, var1, var2, var3);
   }

   public com.KD o(int var1, int var2) {
      return (com.KD)com.FN.m(this, var1, var2);
   }

   public com.KD j(String var1) {
      return (com.KD)com.FN.s(this, var1);
   }

   @Override
   public String D$String() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.KD Y(int var1) {
      return (com.KD)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public com.KD M(int var1) {
      return (com.KD)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public com.KD z(int var1) {
      return (com.KD)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public com.KD X(int var1) {
      return (com.KD)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public com.KD P(int var1) {
      return (com.KD)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public com.KD t(int var1) {
      return (com.KD)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.KD m(int var1, int var2) {
      return (com.KD)PY.O(this, var1, var2);
   }

   public static com.KD y(ImageIcon var0) {
      return d(var0, GO.Fx);
   }

   public static com.KD d(ImageIcon var0, int var1) {
      return l(var0, var1, GO.FG);
   }

   public static com.KD l(ImageIcon var0, int var1, int var2) {
      return r(var0, var1, var2, GO.f);
   }

   public static com.KD r(ImageIcon var0, int var1, int var2, int var3) {
      return W(var0, var1, var2, var3, GO.Fg);
   }

   public static com.KD M(ImageIcon var0, boolean var1) {
      return K(var0, GO.Fx, var1);
   }

   public static com.KD K(ImageIcon var0, int var1, boolean var2) {
      return S(var0, var1, GO.FG, GO.f, var2, GO.Fl);
   }

   public static com.KD W(ImageIcon var0, int var1, int var2, int var3, boolean var4) {
      return S(var0, var1, var2, var3, var4, GO.Fl);
   }

   public static com.KD S(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      return F(var0, var1, var2, var3, var4, var5, true);
   }

   public static com.KD F(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      com.KD var7 = a(var1, var2, var3, 0, var4, var5, var6);
      var7.setIcon(var0);
      return var7;
   }

   public static com.KD a(int var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      com.KD var7 = new com.KD();
      var7.s(var0);
      var7.f(var1);
      var7.x(var2);
      var7.O(var3);
      var7.K(var4);
      var7.G(var5);
      var7.r(var6);
      return var7;
   }

   @Override
   public Component N(String var1) {
      return this.j(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.o(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.G(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.J(var1);
   }

   @Override
   public Component o(int var1) {
      return this.j(var1);
   }

   @Override
   public Component i(int var1) {
      return this.F(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.c(var1, var2);
   }

   @Override
   public Component N$Component(boolean var1) {
      return this.m(var1);
   }

   @Override
   public Component Q$Component() {
      return this.s();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.P(var1);
   }

   @Override
   public Component R() {
      return this.c();
   }

   @Override
   public Component c(boolean var1) {
      return this.N(var1);
   }

   @Override
   public Component a$Component() {
      return this.B();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.m(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.t(var1);
   }

   @Override
   public Component p(int var1) {
      return this.P(var1);
   }

   @Override
   public Component D(int var1) {
      return this.X(var1);
   }

   @Override
   public Component V(int var1) {
      return this.z(var1);
   }

   @Override
   public Component x$Component(int var1) {
      return this.M(var1);
   }

   @Override
   public Component O$Component(int var1) {
      return this.Y(var1);
   }

   public static void u(int[] var0) {
      G = var0;
   }

   public static int[] s$int() {
      return G;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (s() != null) {
         u(new int[2]);
      }
   }
}





