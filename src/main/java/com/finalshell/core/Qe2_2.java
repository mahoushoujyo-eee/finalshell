package com.finalshell.core;

import com.finalshell.ui.model.WF;
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
import javax.swing.JComponent;
import javax.swing.JToggleButton;

public class Qe2_2 extends JToggleButton implements W2_3, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public Qe2_2() {
   }

   public Qe2_2(Icon var1) {
      super(var1);
      this.k(SG.T);
      this.K(SG.M);
   }

   public Qe2_2(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public Qe2_2(String var1) {
      super(var1);
   }

   public Qe2_2(String var1, boolean var2) {
      super(var1, var2);
   }

   public Qe2_2(String var1, Icon var2) {
      super(var1, var2);
   }

   public Qe2_2(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public Qe2_2(ActionListener var1) {
      this.addActionListener(var1);
   }

   public Qe2_2(Icon var1, ActionListener var2) {
      super(var1);
      this.k(SG.T);
      this.K(SG.M);
      this.addActionListener(var2);
   }

   public Qe2_2(Icon var1, boolean var2, ActionListener var3) {
      super(var1, var2);
      this.addActionListener(var3);
   }

   public Qe2_2(String var1, ActionListener var2) {
      super(var1);
      this.addActionListener(var2);
   }

   public Qe2_2(String var1, boolean var2, ActionListener var3) {
      super(var1, var2);
      this.addActionListener(var3);
   }

   public Qe2_2(String var1, Icon var2, ActionListener var3) {
      super(var1, var2);
      this.addActionListener(var3);
   }

   public Qe2_2(String var1, Icon var2, boolean var3, ActionListener var4) {
      super(var1, var2, var3);
      this.addActionListener(var4);
   }

   public Qe2_2(Action var1) {
      super(var1);
   }

   public DN_2 G(Integer var1) {
      return this.H(new com.finalshell.ui.model.Cs2(var1));
   }

   public DN_2 G(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.H(new com.finalshell.ui.model.Cs2(var1, var2, var3, var4));
   }

   public DN_2 H(com.finalshell.ui.model.Cs2 var1) {
      return W62.R(this, var1);
   }

   public DN_2 Z(com.finalshell.ui.model.Cs2 var1, boolean var2) {
      return W62.T(this, var1, var2);
   }

   public DN_2 T(com.finalshell.ui.model.Cs2 var1, WF var2) {
      return W62.y(this, var1, var2);
   }

   public DN_2 X(Component var1, com.finalshell.ui.model.Cs2 var2) {
      return W62.k(var1, this, var2);
   }

   public DN_2 L(Component var1, com.finalshell.ui.model.Cs2 var2, boolean var3) {
      return W62.R(var1, this, var2, var3);
   }

   public DN_2 L(Component var1, com.finalshell.ui.model.Cs2 var2, WF var3) {
      return W62.V(var1, this, var2, var3);
   }

   public List y() {
      return W62.g((JComponent)this);
   }

   public void k(DN_2 var1) {
      W62.n(var1);
   }

   public void A$void() {
      W62.A(this);
   }

   public Color I() {
      return this.E$G8().Y();
   }

   public Qe2_2 M(Color var1) {
      this.E$G8().d(var1);
      return this;
   }

   public Color e$Color() {
      return this.E$G8().z();
   }

   public Qe2_2 C(Color var1) {
      this.E$G8().Q(var1);
      return this;
   }

   public Color i$Color() {
      return this.E$G8().k();
   }

   public Qe2_2 R(Color var1) {
      this.E$G8().J(var1);
      return this;
   }

   public Color E$Color() {
      return this.E$G8().i();
   }

   public Qe2_2 j(Color var1) {
      this.E$G8().w(var1);
      return this;
   }

   public Color t$Color() {
      return this.E$G8().H();
   }

   public Qe2_2 r(Color var1) {
      this.E$G8().j(var1);
      return this;
   }

   public boolean o() {
      return this.E$G8().H();
   }

   public Qe2_2 M(boolean var1) {
      this.E$G8().f(var1);
      return this;
   }

   public boolean A$boolean() {
      return this.E$G8().G();
   }

   public Qe2_2 p(boolean var1) {
      this.E$G8().y(var1);
      return this;
   }

   public Color b() {
      return this.E$G8().l();
   }

   public Qe2_2 q(Color var1) {
      this.E$G8().u(var1);
      return this;
   }

   public int W$int() {
      return this.E$G8().C();
   }

   public Qe2_2 k(int var1) {
      this.E$G8().D(var1);
      return this;
   }

   public boolean Q$boolean() {
      return this.E$G8().U();
   }

   public Qe2_2 H(boolean var1) {
      this.E$G8().d(var1);
      return this;
   }

   public boolean B$boolean() {
      return this.E$G8().k();
   }

   public Qe2_2 V(boolean var1) {
      this.E$G8().A(var1);
      return this;
   }

   public int N() {
      return this.E$G8().d();
   }

   public Qe2_2 N(int var1) {
      this.E$G8().z(var1);
      return this;
   }

   public Color v$Color() {
      return this.E$G8().V();
   }

   public Qe2_2 g(Color var1) {
      this.E$G8().F(var1);
      return this;
   }

   public int r() {
      return this.E$G8().Z();
   }

   public Qe2_2 W(int var1) {
      this.E$G8().r(var1);
      return this;
   }

   public Color M$Color() {
      return this.E$G8().t();
   }

   public Qe2_2 X(Color var1) {
      this.E$G8().O(var1);
      return this;
   }

   public int P$int() {
      return this.E$G8().N();
   }

   public Qe2_2 K(int var1) {
      this.E$G8().l(var1);
      return this;
   }

   public boolean x() {
      return this.E$G8().x();
   }

   public Qe2_2 G(boolean var1) {
      this.E$G8().q(var1);
      return this;
   }

   public boolean W$boolean() {
      return this.E$G8().m();
   }

   public Qe2_2 l(boolean var1) {
      this.E$G8().k(var1);
      return this;
   }

   public boolean c() {
      return this.E$G8().o();
   }

   public Qe2_2 R(boolean var1) {
      this.E$G8().l(var1);
      return this;
   }

   public Og4 U() {
      return this.E$G8().R();
   }

   public Qe2_2 V(Og4 var1) {
      this.E$G8().S(var1);
      return this;
   }

   public boolean Z() {
      return this.E$G8().K();
   }

   public Qe2_2 T(boolean var1) {
      this.E$G8().B(var1);
      return this;
   }

   public boolean p() {
      return this.E$G8().A();
   }

   public Qe2_2 m(boolean var1) {
      this.E$G8().M(var1);
      return this;
   }

   public boolean v$boolean() {
      return this.E$G8().l();
   }

   public Qe2_2 A(boolean var1) {
      this.E$G8().u(var1);
      return this;
   }

   public float E$float() {
      return this.E$G8().Z();
   }

   public Qe2_2 O(float var1) {
      this.E$G8().j(var1);
      return this;
   }

   public boolean t$boolean() {
      return this.E$G8().n();
   }

   public Qe2_2 W(boolean var1) {
      this.E$G8().r(var1);
      return this;
   }

   public boolean P$boolean() {
      return this.E$G8().i();
   }

   public Qe2_2 b(boolean var1) {
      this.E$G8().m(var1);
      return this;
   }

   public boolean X() {
      return this.E$G8().C();
   }

   public Qe2_2 t(boolean var1) {
      this.E$G8().E(var1);
      return this;
   }

   public boolean s() {
      return this.E$G8().Y();
   }

   public Qe2_2 S(boolean var1) {
      this.E$G8().J(var1);
      return this;
   }

   public Qe2_2 l(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.E$G8().Z(var1, var2, var3, var4);
      return this;
   }

   public boolean T$boolean() {
      return this.E$G8().F();
   }

   public Qe2_2 I(boolean var1) {
      this.E$G8().L(var1);
      return this;
   }

   public boolean z() {
      return this.E$G8().B();
   }

   public Qe2_2 C(boolean var1) {
      this.E$G8().Q(var1);
      return this;
   }

   public boolean n() {
      return this.E$G8().W();
   }

   public Qe2_2 Y(boolean var1) {
      this.E$G8().W(var1);
      return this;
   }

   public boolean R$boolean() {
      return this.E$G8().I();
   }

   public Qe2_2 y(boolean var1) {
      this.E$G8().K(var1);
      return this;
   }

   public Qe2_2 o(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.E$G8().a(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Insets getMargin() {
      return this.E$G8().A();
   }

   @Override
   public void setMargin(Insets var1) {
      this.E$G8().Q(var1);
   }

   public Qe2_2 v(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
      return this;
   }

   public Qe2_2 t(int var1) {
      return this.v(var1, var1, var1, var1);
   }

   public Shape B$Shape() {
      return this.E$G8().B();
   }

   public G8 E$G8() {
      return (G8)this.getUI();
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
      // 00: invokestatic com/finalshell/core/KD.s$arrint ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/core/Qe2_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Qe2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Qe2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/Qe2_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/G8
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Qe2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.Z Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 380
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/G8
      // 40: invokevirtual com/finalshell/core/Qe2_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/G8
      // 50: dup
      // 51: invokespecial com/finalshell/core/G8.<init> ()V
      // 54: invokevirtual com/finalshell/core/Qe2_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Qe2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Qe2_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/Qe2_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: return
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(O5 var1) {
      return Fs2_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(O5 var1) {
      return Fs2_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(O5 var1) {
      return Fs2_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(O5 var1) {
      return Fs2_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(O5 var1) {
      return Fs2_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr2 var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(Az2 var1) {
      return Fs2_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(Az2 var1) {
      return Fs2_2.t(this, var1);
   }

   public com.finalshell.ui.panel.Wd2 p$Wd_2(String var1) {
      return Ac2.I(this, var1);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 d(Icon var1, String var2) {
      return Ac2.d(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 V(String var1, WF var2) {
      return Ac2.B(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 X(Icon var1, String var2, WF var3) {
      return Ac2.g(this, var1, var2, var3);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 y(String var1, WF var2, int var3) {
      return Ac2.l(this, var1, var2, var3);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 Y(Icon var1, String var2, WF var3, int var4) {
      return Ac2.R(this, var1, var2, var3, var4);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 g(JComponent var1) {
      return Ac2.k(this, var1);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 I(JComponent var1, int var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 j(JComponent var1, WF var2) {
      return Ac2.R(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 g(JComponent var1, WF var2, int var3) {
      return Ac2.B(this, var1, var2, var3);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 s(String var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 u(Icon var1, String var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 u(String var1, WF var2) {
      return Ac2.q(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 h(Icon var1, String var2, WF var3) {
      return Ac2.P(this, var1, var2, var3);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 f(String var1, WF var2, int var3) {
      return Ac2.r(this, var1, var2, var3);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 o(Icon var1, String var2, WF var3, int var4) {
      return Ac2.V(this, var1, var2, var3, var4);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 B(JComponent var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 p(JComponent var1, int var2) {
      return Ac2.S(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 n(JComponent var1, WF var2) {
      return Ac2.I(this, var1, var2);
   }

   @Override
   public com.finalshell.ui.panel.Wd2 X(JComponent var1, WF var2, int var3) {
      return Ac2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(com.finalshell.ui.panel.Wd2 var1) {
      Ac2.s(this, var1);
   }

   @Override
   public void O() {
      Ac2.o(this);
   }

   @Override
   public void q(com.finalshell.ui.panel.Wd2[] var1) {
      Ac2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      Ac2.S(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this, var1, var2);
   }

   public void M$void() {
      I22.L(this);
   }

   @Override
   public boolean k() {
      return I22.Z(this);
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this, var1);
   }

   public void i$void() {
      I22.o(this);
   }

   public void p$void(String var1) {
      Cl4_2.c(this, var1);
   }

   @Override
   public void a(String var1, java.lang.Class var2) {
      Cl4_2.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, java.lang.Class var3) {
      Cl4_2.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, java.lang.Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, java.lang.Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this, var1);
   }

   @Override
   public void w() {
      Cl4_2.O(this);
   }

   public void m$void() {
      Cl4_2.G(this);
   }

   public void e$void() {
      Cl4_2.H(this);
   }

   public Qe2_2 t$Qe_2() {
      return (Qe2_2)FN.A(this);
   }

   public Qe2_2 x(boolean var1) {
      return (Qe2_2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Qe2_2 T$Qe_2() {
      return (Qe2_2)FN.u(this);
   }

   public Qe2_2 r(boolean var1) {
      return (Qe2_2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Qe2_2 m$Qe_2() {
      return (Qe2_2)FN.C(this);
   }

   public Qe2_2 k(boolean var1) {
      return (Qe2_2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Qe2_2 q(boolean var1, boolean var2) {
      return (Qe2_2)FN.K(this, var1, var2);
   }

   public Qe2_2 O$Qe_2(int var1) {
      return (Qe2_2)FN.p(this, var1);
   }

   public Qe2_2 l(int var1) {
      return (Qe2_2)FN.O(this, var1);
   }

   public Qe2_2 M(int var1) {
      return (Qe2_2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Qe2_2 q(int var1, boolean var2, boolean var3) {
      return (Qe2_2)FN.d(this, var1, var2, var3);
   }

   public Qe2_2 N(int var1, int var2) {
      return (Qe2_2)FN.m(this, var1, var2);
   }

   public Qe2_2 e(String var1) {
      return (Qe2_2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public Qe2_2 i$Qe_2(int var1) {
      return (Qe2_2)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public Qe2_2 j(int var1) {
      return (Qe2_2)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public Qe2_2 V$Qe_2(int var1) {
      return (Qe2_2)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public Qe2_2 T(int var1) {
      return (Qe2_2)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public Qe2_2 e(int var1) {
      return (Qe2_2)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public Qe2_2 X(int var1) {
      return (Qe2_2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public Qe2_2 Q(int var1, int var2) {
      return (Qe2_2)PY.O(this, var1, var2);
   }

   public static Qe2_2 T(ImageIcon var0) {
      return A(var0, GO.Fx);
   }

   public static Qe2_2 A(ImageIcon var0, int var1) {
      return y(var0, var1, GO.FG);
   }

   public static Qe2_2 y(ImageIcon var0, int var1, int var2) {
      return q(var0, var1, var2, GO.f);
   }

   public static Qe2_2 q(ImageIcon var0, int var1, int var2, int var3) {
      return k(var0, var1, var2, var3, GO.Fg);
   }

   public static Qe2_2 k(ImageIcon var0, int var1, int var2, int var3, boolean var4) {
      return r(var0, var1, var2, var3, var4, GO.Fl);
   }

   public static Qe2_2 r(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      return v(var0, var1, var2, var3, var4, var5, true);
   }

   public static Qe2_2 v(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      Qe2_2 var7 = F(var1, var2, var3, 0, var4, var5, var6);
      var7.setIcon(var0);
      return var7;
   }

   public static Qe2_2 F(int var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      Qe2_2 var7 = new Qe2_2();
      var7.k(var0);
      var7.N(var1);
      var7.W(var2);
      var7.K(var3);
      var7.G(var4);
      var7.R(var5);
      var7.m(var6);
      return var7;
   }

   @Override
   public Component N(String var1) {
      return this.e(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.N(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.q(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.M(var1);
   }

   @Override
   public Component o(int var1) {
      return this.l(var1);
   }

   public Component i$Component(int var1) {
      return this.O$Qe_2(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.q(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.k(var1);
   }

   public Component Q$Component() {
      return this.m$Qe_2();
   }

   @Override
   public Component u(boolean var1) {
      return this.r(var1);
   }

   public Component R$Component() {
      return this.T$Qe_2();
   }

   @Override
   public Component c(boolean var1) {
      return this.x(var1);
   }

   public Component a$Component() {
      return this.t$Qe_2();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.Q(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.X(var1);
   }

   @Override
   public Component p(int var1) {
      return this.e(var1);
   }

   @Override
   public Component D(int var1) {
      return this.T(var1);
   }

   public Component V$Component(int var1) {
      return this.V$Qe_2(var1);
   }

   @Override
   public Component x(int var1) {
      return this.j(var1);
   }

   public Component O$Component(int var1) {
      return this.i$Qe_2(var1);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





