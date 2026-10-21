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
import java.text.Format;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;

public class L42 extends JFormattedTextField implements W2_3, RS, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public L42() {
   }

   public L42(AbstractFormatterFactory var1) {
      super(var1);
   }

   public L42(AbstractFormatterFactory var1, Object var2) {
      super(var1, var2);
   }

   public L42(Format var1) {
      super(var1);
   }

   public L42(AbstractFormatter var1) {
      super(var1);
   }

   public L42(Object var1) {
      super(var1);
   }

   public void X$void() {
      this.setText("");
   }

   public boolean b() {
      return this.v().R();
   }

   public void j(boolean var1) {
      this.v().R(var1);
   }

   public boolean Y$boolean() {
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

   public JComponent s$JComponent() {
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

   public int K$int() {
      return this.v().k();
   }

   public void C$void(int var1) {
      this.v().T(var1);
   }

   public boolean A$boolean() {
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

   public Og4 i$og_4() {
      return this.v().i();
   }

   public void H(Og4 var1) {
      this.v().Y(var1);
   }

   public String F() {
      return this.v().F();
   }

   public void d(String var1) {
      this.v().F(var1);
   }

   public Font S$Font() {
      return this.v().n();
   }

   public void a(Font var1) {
      this.v().B(var1);
   }

   public Color a$Color() {
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

   public boolean e$boolean() {
      return this.v().A();
   }

   public void s(boolean var1) {
      this.v().k(var1);
   }

   @Override
   public Shape B() {
      return this.v().B();
   }

   public Q1 v() {
      return (Q1)this.getUI();
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
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/core/L42.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/L42.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/L42.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/L42.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/finalshell/core/Q1
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/L42.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.L Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 215
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Q1
      // 40: invokevirtual com/finalshell/core/L42.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Q1
      // 50: dup
      // 51: invokespecial com/finalshell/core/Q1.<init> ()V
      // 54: invokevirtual com/finalshell/core/L42.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/L42.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/L42.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/finalshell/core/L42.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/core/L42.invalidate ()V
      // 6e: return
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

   public L42 S$l4_2() {
      return (L42)FN.A(this);
   }

   public L42 w(boolean var1) {
      return (L42)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public L42 r() {
      return (L42)FN.u(this);
   }

   public L42 a(boolean var1) {
      return (L42)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public L42 X$l4_2() {
      return (L42)FN.C(this);
   }

   public L42 u$l4_2(boolean var1) {
      return (L42)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public L42 O(boolean var1, boolean var2) {
      return (L42)FN.K(this, var1, var2);
   }

   public L42 A(int var1) {
      return (L42)FN.p(this, var1);
   }

   public L42 O$l4_2(int var1) {
      return (L42)FN.O(this, var1);
   }

   public L42 h(int var1) {
      return (L42)FN.K(this, var1);
   }

   public int Y$int() {
      return FN.r$int(this);
   }

   public L42 q(int var1, boolean var2, boolean var3) {
      return (L42)FN.d(this, var1, var2, var3);
   }

   public L42 s(int var1, int var2) {
      return (L42)FN.m(this, var1, var2);
   }

   public L42 G(String var1) {
      return (L42)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public L42 S(int var1) {
      return (L42)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public L42 C$l4_2(int var1) {
      return (L42)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public L42 f(int var1) {
      return (L42)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public L42 b(int var1) {
      return (L42)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public L42 o$l4_2(int var1) {
      return (L42)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public L42 M(int var1) {
      return (L42)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public L42 W$l4_2(int var1, int var2) {
      return (L42)PY.O(this, var1, var2);
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

   public Component o$Component(int var1) {
      return this.O$l4_2(var1);
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
      return this.u$l4_2(var1);
   }

   public Component Q$Component() {
      return this.X$l4_2();
   }

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

   public Component a$Component() {
      return this.S$l4_2();
   }

   public Component W$Component(int var1, int var2) {
      return this.W$l4_2(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.M(var1);
   }

   @Override
   public Component p(int var1) {
      return this.o$l4_2(var1);
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
      return this.C$l4_2(var1);
   }

   public Component O$Component(int var1) {
      return this.S(var1);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





