package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Au2;
import com.finalshell.core.Az2;
import com.finalshell.core.Ej2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.Ld4;
import com.finalshell.core.O5;
import com.finalshell.core.PY;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sa2;
import com.finalshell.core.Sr2;
import com.finalshell.core.W2_3;
import com.finalshell.core.Yb4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BoundedRangeModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;

public class By_2 extends JProgressBar implements W2_3, Pp2, RF3, Au2, Yb4, Sa2 {
   public static int g;

   public By_2() {
      this.z();
   }

   public By_2(int var1) {
      super(var1);
      this.z();
   }

   public By_2(int var1, int var2) {
      super(var1, var2);
      this.z();
   }

   public By_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.z();
   }

   public By_2(BoundedRangeModel var1) {
      super(var1);
      this.z();
   }

   public void z() {
      this.getUI().installUI(this);
   }

   public int W() {
      return this.Z().A();
   }

   public void n(int var1) {
      this.Z().K(var1);
   }

   public int K$int() {
      return this.Z().W();
   }

   public void s(int var1) {
      this.Z().y(var1);
   }

   public int q() {
      return this.Z().J$int();
   }

   public void Q(int var1) {
      this.Z().i(var1);
   }

   public boolean H() {
      return this.Z().f();
   }

   public void s$void(boolean var1) {
      this.Z().i(var1);
   }

   public int h$int() {
      return this.Z().Y();
   }

   public void W(int var1) {
      this.Z().j(var1);
   }

   public Color R$Color() {
      return this.Z().j();
   }

   public void I(Color var1) {
      this.Z().M(var1);
   }

   public Color U() {
      return this.Z().l();
   }

   public void T(Color var1) {
      this.Z().m(var1);
   }

   public Color j() {
      return this.Z().z();
   }

   public void Y(Color var1) {
      this.Z().f(var1);
   }

   public Color N() {
      return this.Z().p();
   }

   public void y(Color var1) {
      this.Z().G(var1);
   }

   public Color o() {
      return this.Z().N();
   }

   public void s(Color var1) {
      this.Z().Q(var1);
   }

   public Color f() {
      return this.Z().D();
   }

   public void m(Color var1) {
      this.Z().u(var1);
   }

   public Color O$Color() {
      return this.Z().J$Color();
   }

   public void j(Color var1) {
      this.Z().e(var1);
   }

   @Override
   public Shape B() {
      return this.Z().B();
   }

   public Ej2 Z() {
      return (Ej2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/By_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/ui/panel/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 25: instanceof com/finalshell/core/Ej2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zQ Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 160
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Ej2
      // 40: invokevirtual com/finalshell/ui/panel/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Ej2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Ej2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 67: invokevirtual com/finalshell/ui/panel/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
      // 6a: return
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, O5 var2) {
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
   public MouseAdapter L(HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, O5 var2) {
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
   public KeyAdapter I(Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(Cs2 var1, Sr2 var2) {
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
   public Wd2 p(String var1) {
      return Ac2.I(this, var1);
   }

   @Override
   public Wd2 d(Icon var1, String var2) {
      return Ac2.d(this, var1, var2);
   }

   @Override
   public Wd2 V(String var1, WF var2) {
      return Ac2.B(this, var1, var2);
   }

   @Override
   public Wd2 X(Icon var1, String var2, WF var3) {
      return Ac2.g(this, var1, var2, var3);
   }

   @Override
   public Wd2 y(String var1, WF var2, int var3) {
      return Ac2.l(this, var1, var2, var3);
   }

   @Override
   public Wd2 Y(Icon var1, String var2, WF var3, int var4) {
      return Ac2.R(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 g(JComponent var1) {
      return Ac2.k(this, var1);
   }

   @Override
   public Wd2 I(JComponent var1, int var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 j(JComponent var1, WF var2) {
      return Ac2.R(this, var1, var2);
   }

   @Override
   public Wd2 g(JComponent var1, WF var2, int var3) {
      return Ac2.B(this, var1, var2, var3);
   }

   @Override
   public Wd2 s(String var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 u(Icon var1, String var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 u(String var1, WF var2) {
      return Ac2.q(this, var1, var2);
   }

   @Override
   public Wd2 h(Icon var1, String var2, WF var3) {
      return Ac2.P(this, var1, var2, var3);
   }

   @Override
   public Wd2 f(String var1, WF var2, int var3) {
      return Ac2.r(this, var1, var2, var3);
   }

   @Override
   public Wd2 o(Icon var1, String var2, WF var3, int var4) {
      return Ac2.V(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 B(JComponent var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 p(JComponent var1, int var2) {
      return Ac2.S(this, var1, var2);
   }

   @Override
   public Wd2 n(JComponent var1, WF var2) {
      return Ac2.I(this, var1, var2);
   }

   @Override
   public Wd2 X(JComponent var1, WF var2, int var3) {
      return Ac2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(Wd2 var1) {
      Ac2.s(this, var1);
   }

   public void O$void() {
      Ac2.o(this);
   }

   @Override
   public void q(Wd2[] var1) {
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

   public By_2 n() {
      return (By_2)FN.A(this);
   }

   public By_2 u$By_2(boolean var1) {
      return (By_2)FN.O(this, var1);
   }

   public boolean h$boolean() {
      return FN.k(this);
   }

   public By_2 t() {
      return (By_2)FN.u(this);
   }

   public By_2 d(boolean var1) {
      return (By_2)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public By_2 L() {
      return (By_2)FN.C(this);
   }

   public By_2 s$By_2(boolean var1) {
      return (By_2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public By_2 v(boolean var1, boolean var2) {
      return (By_2)FN.K(this, var1, var2);
   }

   public By_2 k(int var1) {
      return (By_2)FN.p(this, var1);
   }

   public By_2 U(int var1) {
      return (By_2)FN.O(this, var1);
   }

   public By_2 V$By_2(int var1) {
      return (By_2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public By_2 F(int var1, boolean var2, boolean var3) {
      return (By_2)FN.d(this, var1, var2, var3);
   }

   public By_2 R(int var1, int var2) {
      return (By_2)FN.m(this, var1, var2);
   }

   public By_2 A(String var1) {
      return (By_2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public By_2 E(int var1) {
      return (By_2)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public By_2 t(int var1) {
      return (By_2)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public By_2 g(int var1) {
      return (By_2)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public By_2 S(int var1) {
      return (By_2)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public By_2 M(int var1) {
      return (By_2)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public By_2 R(int var1) {
      return (By_2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public By_2 P(int var1, int var2) {
      return (By_2)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.A(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.R(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.F(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.V$By_2(var1);
   }

   @Override
   public Component o(int var1) {
      return this.U(var1);
   }

   @Override
   public Component i(int var1) {
      return this.k(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.v(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.s$By_2(var1);
   }

   public Component Q$Component() {
      return this.L();
   }

   public Component u$Component(boolean var1) {
      return this.d(var1);
   }

   public Component R$Component() {
      return this.t();
   }

   @Override
   public Component c(boolean var1) {
      return this.u$By_2(var1);
   }

   public Component a$Component() {
      return this.n();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.P(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.R(var1);
   }

   @Override
   public Component p(int var1) {
      return this.M(var1);
   }

   @Override
   public Component D(int var1) {
      return this.S(var1);
   }

   public Component V$Component(int var1) {
      return this.g(var1);
   }

   @Override
   public Component x(int var1) {
      return this.t(var1);
   }

   @Override
   public Component O(int var1) {
      return this.E(var1);
   }

   public static void Z(int var0) {
      g = var0;
   }

   public static int y() {
      return g;
   }

   public static int J() {
      int var0 = y();
      return var0 == 0 ? 102 : 0;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (y() == 0) {
         Z(61);
      }
   }
}





