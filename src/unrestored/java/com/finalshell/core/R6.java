package com.finalshell.core;

import com.finalshell.ui.model.WF;
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

public class R6 extends JPasswordField implements W2_3, RS, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public static long a;

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

   public boolean a$boolean() {
      return this.q$Hl_2().K();
   }

   public void x(boolean var1) {
      this.q$Hl_2().g(var1);
   }

   public boolean S() {
      return this.q$Hl_2().X();
   }

   public void o(boolean var1) {
      this.q$Hl_2().X(var1);
   }

   public JComponent x() {
      return this.q$Hl_2().w();
   }

   public void w(JComponent var1) {
      this.q$Hl_2().K(var1);
   }

   public JComponent l$JComponent() {
      return this.q$Hl_2().f();
   }

   public void y(JComponent var1) {
      this.q$Hl_2().b(var1);
   }

   public void g(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void I(int var1) {
      this.g(var1, var1, var1, var1);
   }

   public void z(Insets var1) {
      this.q$Hl_2().S(var1);
   }

   public void v(int var1, int var2, int var3, int var4) {
      this.z(new Insets(var1, var2, var3, var4));
   }

   public void j(int var1) {
      this.v(var1, var1, var1, var1);
   }

   public Insets Q$Insets() {
      return this.q$Hl_2().v();
   }

   public int O$int() {
      return this.q$Hl_2().b$int();
   }

   public void z(int var1) {
      this.q$Hl_2().b(var1);
   }

   public boolean t() {
      return this.q$Hl_2().Z();
   }

   public void m(boolean var1) {
      this.q$Hl_2().A(var1);
   }

   public int q$int() {
      return this.q$Hl_2().G();
   }

   public void x$void(int var1) {
      this.q$Hl_2().M(var1);
   }

   public boolean o() {
      return this.q$Hl_2().b$boolean();
   }

   public void Y(boolean var1) {
      this.q$Hl_2().Y(var1);
   }

   public boolean W$boolean() {
      return this.q$Hl_2().C();
   }

   public void J(boolean var1) {
      this.q$Hl_2().m(var1);
   }

   public Og4 J() {
      return this.q$Hl_2().o();
   }

   public void f(Og4 var1) {
      this.q$Hl_2().f(var1);
   }

   public String p() {
      return this.q$Hl_2().P();
   }

   public void G(String var1) {
      this.q$Hl_2().w(var1);
   }

   public Font Q$Font() {
      return this.q$Hl_2().M();
   }

   public void r(Font var1) {
      this.q$Hl_2().G(var1);
   }

   public Color D$Color() {
      return this.q$Hl_2().t();
   }

   public void I(Color var1) {
      this.q$Hl_2().o(var1);
   }

   public int h$int() {
      return this.q$Hl_2().s();
   }

   public void M(int var1) {
      this.q$Hl_2().U(var1);
   }

   public boolean u() {
      return this.q$Hl_2().D();
   }

   public void r(boolean var1) {
      this.q$Hl_2().T(var1);
   }

   @Override
   public Shape B() {
      return this.q$Hl_2().B();
   }

   public Hl2 q$Hl_2() {
      return (Hl2)this.getUI();
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
      // 00: invokestatic com/finalshell/core/Ne4.A$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 26
      // 09: invokevirtual com/finalshell/core/R6.echoCharIsSet ()Z
      // 0c: ifne 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic com/finalshell/core/R6.a J
      // 1a: l2i
      // 1b: invokevirtual com/finalshell/core/R6.setEchoChar (C)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: ifeq 54
      // 2a: invokevirtual com/finalshell/core/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 2d: ifnull 53
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: iload 1
      // 39: ifeq 84
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: invokevirtual com/finalshell/core/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 46: instanceof com/finalshell/core/Hl2
      // 49: ifne 7c
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 0
      // 54: getstatic com/finalshell/core/A9.w Ljava/lang/String;
      // 57: bipush 0
      // 58: anewarray 219
      // 5b: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5e: checkcast com/finalshell/core/Hl2
      // 61: invokevirtual com/finalshell/core/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 64: goto 8b
      // 67: astore 2
      // 68: aload 0
      // 69: aload 2
      // 6a: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 6d: aload 0
      // 6e: new com/finalshell/core/Hl2
      // 71: dup
      // 72: invokespecial com/finalshell/core/Hl2.<init> ()V
      // 75: invokevirtual com/finalshell/core/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 78: iload 1
      // 79: ifne 8b
      // 7c: aload 0
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/R6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: aload 0
      // 85: invokevirtual com/finalshell/core/R6.getUI ()Ljavax/swing/plaf/TextUI;
      // 88: invokevirtual com/finalshell/core/R6.setUI (Ljavax/swing/plaf/TextUI;)V
      // 8b: aload 0
      // 8c: invokevirtual com/finalshell/core/R6.invalidate ()V
      // 8f: return
   }

   @Override
   public com.finalshell.ui.model.F5 i(Rk2 var1) {
      return Fs2_2.X(this, var1);
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

   public void O$void() {
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

   @Override
   public void e() {
      Cl4_2.H(this);
   }

   public R6 W$R6() {
      return (R6)FN.A(this);
   }

   public R6 V(boolean var1) {
      return (R6)FN.O(this, var1);
   }

   public boolean h$boolean() {
      return FN.k(this);
   }

   public R6 g() {
      return (R6)FN.u(this);
   }

   public R6 H(boolean var1) {
      return (R6)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public R6 M$R6() {
      return (R6)FN.C(this);
   }

   public R6 P(boolean var1) {
      return (R6)FN.q(this, var1);
   }

   public boolean l$boolean() {
      return FN.G(this);
   }

   public R6 Z(boolean var1, boolean var2) {
      return (R6)FN.K(this, var1, var2);
   }

   public R6 p$R6(int var1) {
      return (R6)FN.p(this, var1);
   }

   public R6 K(int var1) {
      return (R6)FN.O(this, var1);
   }

   public R6 O$R6(int var1) {
      return (R6)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public R6 O(int var1, boolean var2, boolean var3) {
      return (R6)FN.d(this, var1, var2, var3);
   }

   public R6 V(int var1, int var2) {
      return (R6)FN.m(this, var1, var2);
   }

   public R6 K(String var1) {
      return (R6)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public R6 t(int var1) {
      return (R6)PY.Q(this, var1);
   }

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

   public int Q$int() {
      return PY.Z(this);
   }

   public R6 f(int var1) {
      return (R6)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public R6 C(int var1) {
      return (R6)PY.b(this, var1);
   }

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
      return this.O$R6(var1);
   }

   @Override
   public Component o(int var1) {
      return this.K(var1);
   }

   @Override
   public Component i(int var1) {
      return this.p$R6(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.Z(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.P(var1);
   }

   public Component Q$Component() {
      return this.M$R6();
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

   public Component a$Component() {
      return this.W$R6();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.K(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.T(var1);
   }

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

   public Component x$Component(int var1) {
      return this.m(var1);
   }

   public Component O$Component(int var1) {
      return this.t(var1);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8953872291300177252L;
      long var10002 = -5860367380380060338L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





