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
import javax.swing.JButton;
import javax.swing.JComponent;

public class KD extends JButton implements W2_3, Pp2, RF3, Au2, Yb4, Sa2 {
   public static int[] G;

   public KD() {
   }

   public KD(Icon var1) {
      super(var1);
      this.s(SG.T);
      this.O$KD(SG.M);
   }

   public KD(Icon var1, Icon var2) {
      super(var1);
      this.setRolloverIcon(var2);
      this.s(SG.T);
      this.O$KD(SG.M);
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
      this.O$KD(SG.M);
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

   public KD(Og4 var1) {
      this.U(var1);
   }

   public DN_2 U(Integer var1) {
      return this.p(new com.finalshell.ui.model.Cs2(var1));
   }

   public DN_2 K(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.p(new com.finalshell.ui.model.Cs2(var1, var2, var3, var4));
   }

   public DN_2 p(com.finalshell.ui.model.Cs2 var1) {
      return W62.R(this, var1);
   }

   public DN_2 C(com.finalshell.ui.model.Cs2 var1, boolean var2) {
      return W62.T(this, var1, var2);
   }

   public DN_2 G(com.finalshell.ui.model.Cs2 var1, WF var2) {
      return W62.y(this, var1, var2);
   }

   public DN_2 Y(Component var1, com.finalshell.ui.model.Cs2 var2) {
      return W62.k(var1, this, var2);
   }

   public DN_2 Q(Component var1, com.finalshell.ui.model.Cs2 var2, boolean var3) {
      return W62.R(var1, this, var2, var3);
   }

   public DN_2 d(Component var1, com.finalshell.ui.model.Cs2 var2, WF var3) {
      return W62.V(var1, this, var2, var3);
   }

   public List v() {
      return W62.g((JComponent)this);
   }

   public void l(DN_2 var1) {
      W62.n(var1);
   }

   public void h$void() {
      W62.A(this);
   }

   public Color D$Color() {
      return this.f().Y$Color();
   }

   public KD n(Color var1) {
      this.f().d(var1);
      return this;
   }

   public Color Q$Color() {
      return this.f().z();
   }

   public KD l(Color var1) {
      this.f().Q(var1);
      return this;
   }

   public Color N() {
      return this.f().k$Color();
   }

   public KD e(Color var1) {
      this.f().J(var1);
      return this;
   }

   public Color n() {
      return this.f().i$Color();
   }

   public KD G(Color var1) {
      this.f().w(var1);
      return this;
   }

   public Color t() {
      return this.f().H$Color();
   }

   public KD t(Color var1) {
      this.f().j(var1);
      return this;
   }

   public boolean g() {
      return this.f().H$boolean();
   }

   public KD g(boolean var1) {
      this.f().f(var1);
      return this;
   }

   public boolean e() {
      return this.f().G();
   }

   public KD S(boolean var1) {
      this.f().y(var1);
      return this;
   }

   public Color M$Color() {
      return this.f().l$Color();
   }

   public KD u(Color var1) {
      this.f().u(var1);
      return this;
   }

   public int h$int() {
      return this.f().C$int();
   }

   public KD s(int var1) {
      this.f().D(var1);
      return this;
   }

   public boolean u() {
      return this.f().R$boolean();
   }

   public KD a(boolean var1) {
      this.f().w(var1);
      return this;
   }

   public boolean T() {
      return this.f().U();
   }

   public KD h(boolean var1) {
      this.f().d(var1);
      return this;
   }

   public boolean q$boolean() {
      return this.f().k$boolean();
   }

   public KD b(boolean var1) {
      this.f().A(var1);
      return this;
   }

   public int q$int() {
      return this.f().d();
   }

   public KD f(int var1) {
      this.f().z(var1);
      return this;
   }

   public Color U() {
      return this.f().V();
   }

   public KD H(Color var1) {
      this.f().F(var1);
      return this;
   }

   public int b$int() {
      return this.f().Z$int();
   }

   public KD x$KD(int var1) {
      this.f().r(var1);
      return this;
   }

   public Color s$Color() {
      return this.f().t();
   }

   public KD z(Color var1) {
      this.f().O(var1);
      return this;
   }

   public Color C$Color() {
      return this.f().E();
   }

   public KD s(Color var1) {
      this.f().s(var1);
      return this;
   }

   public int r() {
      return this.f().N();
   }

   public KD O$KD(int var1) {
      this.f().l(var1);
      return this;
   }

   public boolean j() {
      return this.f().x();
   }

   public KD K(boolean var1) {
      this.f().q(var1);
      return this;
   }

   public boolean Y$boolean() {
      return this.f().m();
   }

   public KD j(boolean var1) {
      this.f().k(var1);
      return this;
   }

   public boolean m$boolean() {
      return this.f().o();
   }

   public KD G(boolean var1) {
      this.f().l(var1);
      return this;
   }

   public Og4 l$og_4() {
      return this.f().R$og_4();
   }

   public KD U(Og4 var1) {
      this.f().S(var1);
      return this;
   }

   public boolean I() {
      return this.f().K();
   }

   public KD t(boolean var1) {
      this.f().B(var1);
      return this;
   }

   public boolean z() {
      return this.f().A$boolean();
   }

   public KD r(boolean var1) {
      this.f().M(var1);
      return this;
   }

   public boolean V() {
      return this.f().n();
   }

   public KD l(boolean var1) {
      this.f().r(var1);
      return this;
   }

   public boolean C$boolean() {
      return this.f().i$boolean();
   }

   public KD x(boolean var1) {
      this.f().m(var1);
      return this;
   }

   public boolean P() {
      return this.f().C$boolean();
   }

   public KD X(boolean var1) {
      this.f().E(var1);
      return this;
   }

   public boolean Z() {
      return this.f().Y$boolean();
   }

   public KD W(boolean var1) {
      this.f().J(var1);
      return this;
   }

   public KD E(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.f().Z(var1, var2, var3, var4);
      return this;
   }

   public boolean b$boolean() {
      return this.f().F();
   }

   public KD z(boolean var1) {
      this.f().L(var1);
      return this;
   }

   public boolean c$boolean() {
      return this.f().B$boolean();
   }

   public KD M(boolean var1) {
      this.f().Q(var1);
      return this;
   }

   public boolean w() {
      return this.f().W();
   }

   public KD Z(boolean var1) {
      this.f().W(var1);
      return this;
   }

   public boolean s$boolean() {
      return this.f().I();
   }

   public KD u$KD(boolean var1) {
      this.f().K(var1);
      return this;
   }

   public KD h(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.f().a(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Insets getMargin() {
      return this.f().A$Insets();
   }

   @Override
   public void setMargin(Insets var1) {
      this.f().Q(var1);
   }

   public KD V(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
      return this;
   }

   public KD e(int var1) {
      return this.V(var1, var1, var1, var1);
   }

   public Shape B$Shape() {
      return this.f().B$Shape();
   }

   public Gi2 f() {
      return (Gi2)this.getUI();
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
      // 09: invokevirtual com/finalshell/core/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/Gi2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.r Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 384
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Gi2
      // 40: invokevirtual com/finalshell/core/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Gi2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Gi2.<init> ()V
      // 54: invokevirtual com/finalshell/core/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/KD.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/KD.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/KD.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   @Override
   public com.finalshell.ui.panel.Wd2 p(String var1) {
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

   public KD B$KD() {
      return (KD)FN.A(this);
   }

   public KD N$KD(boolean var1) {
      return (KD)FN.O(this, var1);
   }

   public boolean h$boolean() {
      return FN.k(this);
   }

   public KD c$KD() {
      return (KD)FN.u(this);
   }

   public KD P(boolean var1) {
      return (KD)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public KD s$KD() {
      return (KD)FN.C(this);
   }

   public KD m(boolean var1) {
      return (KD)FN.q(this, var1);
   }

   public boolean l$boolean() {
      return FN.G(this);
   }

   public KD c(boolean var1, boolean var2) {
      return (KD)FN.K(this, var1, var2);
   }

   public KD F(int var1) {
      return (KD)FN.p(this, var1);
   }

   public KD j(int var1) {
      return (KD)FN.O(this, var1);
   }

   public KD J(int var1) {
      return (KD)FN.K(this, var1);
   }

   public int Y$int() {
      return FN.r$int(this);
   }

   public KD G(int var1, boolean var2, boolean var3) {
      return (KD)FN.d(this, var1, var2, var3);
   }

   public KD o(int var1, int var2) {
      return (KD)FN.m(this, var1, var2);
   }

   public KD j(String var1) {
      return (KD)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public KD Y(int var1) {
      return (KD)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public KD M(int var1) {
      return (KD)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public KD z(int var1) {
      return (KD)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public KD X(int var1) {
      return (KD)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public KD P(int var1) {
      return (KD)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public KD t(int var1) {
      return (KD)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public KD m(int var1, int var2) {
      return (KD)PY.O(this, var1, var2);
   }

   public static KD y(ImageIcon var0) {
      return d(var0, GO.Fx);
   }

   public static KD d(ImageIcon var0, int var1) {
      return l(var0, var1, GO.FG);
   }

   public static KD l(ImageIcon var0, int var1, int var2) {
      return r(var0, var1, var2, GO.f);
   }

   public static KD r(ImageIcon var0, int var1, int var2, int var3) {
      return W(var0, var1, var2, var3, GO.Fg);
   }

   public static KD M(ImageIcon var0, boolean var1) {
      return K(var0, GO.Fx, var1);
   }

   public static KD K(ImageIcon var0, int var1, boolean var2) {
      return S(var0, var1, GO.FG, GO.f, var2, GO.Fl);
   }

   public static KD W(ImageIcon var0, int var1, int var2, int var3, boolean var4) {
      return S(var0, var1, var2, var3, var4, GO.Fl);
   }

   public static KD S(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      return F(var0, var1, var2, var3, var4, var5, true);
   }

   public static KD F(ImageIcon var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      KD var7 = a(var1, var2, var3, 0, var4, var5, var6);
      var7.setIcon(var0);
      return var7;
   }

   public static KD a(int var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      KD var7 = new KD();
      var7.s(var0);
      var7.f(var1);
      var7.x$KD(var2);
      var7.O$KD(var3);
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

   public Component N$Component(boolean var1) {
      return this.m(var1);
   }

   public Component Q$Component() {
      return this.s$KD();
   }

   public Component u$Component(boolean var1) {
      return this.P(var1);
   }

   @Override
   public Component R() {
      return this.c$KD();
   }

   @Override
   public Component c(boolean var1) {
      return this.N$KD(var1);
   }

   public Component a$Component() {
      return this.B$KD();
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

   public Component x$Component(int var1) {
      return this.M(var1);
   }

   public Component O$Component(int var1) {
      return this.Y(var1);
   }

   public static void u(int[] var0) {
      G = var0;
   }

   public static int[] s$arrint() {
      return G;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (s$arrint() != null) {
         u(new int[2]);
      }
   }
}





