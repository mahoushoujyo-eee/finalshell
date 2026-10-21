package com;

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

public class By_2 extends JProgressBar implements com.W2, Pp_2, rF_3, com.au_2, com.yb_4, Sa_2 {
   private static int g;

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

   private void z() {
      this.getUI().installUI(this);
   }

   public int W() {
      return this.Z().A();
   }

   public void n(int var1) {
      this.Z().K(var1);
   }

   public int K() {
      return this.Z().W();
   }

   public void s(int var1) {
      this.Z().y(var1);
   }

   public int q() {
      return this.Z().J();
   }

   public void Q(int var1) {
      this.Z().i(var1);
   }

   public boolean H() {
      return this.Z().f();
   }

   public void s(boolean var1) {
      this.Z().i(var1);
   }

   public int h() {
      return this.Z().Y();
   }

   public void W(int var1) {
      this.Z().j(var1);
   }

   public Color R() {
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

   public Color O() {
      return this.Z().J();
   }

   public void j(Color var1) {
      this.Z().e(var1);
   }

   @Override
   public Shape B() {
      return this.Z().B();
   }

   public Ej_2 Z() {
      return (Ej_2)this.getUI();
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
      // 00: invokestatic com/By_2.y ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 25: instanceof com/Ej_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zQ Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 157
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Ej_2
      // 40: invokevirtual com/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Ej_2
      // 50: dup
      // 51: invokespecial com/Ej_2.<init> ()V
      // 54: invokevirtual com/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/By_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/By_2.getUI ()Ljavax/swing/plaf/ProgressBarUI;
      // 67: invokevirtual com/By_2.setUI (Ljavax/swing/plaf/ProgressBarUI;)V
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

   public com.By_2 n() {
      return (com.By_2)com.FN.A(this);
   }

   public com.By_2 u(boolean var1) {
      return (com.By_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public com.By_2 t() {
      return (com.By_2)com.FN.u(this);
   }

   public com.By_2 d(boolean var1) {
      return (com.By_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K$boolean() {
      return com.FN.U(this);
   }

   public com.By_2 L() {
      return (com.By_2)com.FN.C(this);
   }

   public com.By_2 s$comBy_2(boolean var1) {
      return (com.By_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.By_2 v(boolean var1, boolean var2) {
      return (com.By_2)com.FN.K(this, var1, var2);
   }

   public com.By_2 k(int var1) {
      return (com.By_2)com.FN.p(this, var1);
   }

   public com.By_2 U(int var1) {
      return (com.By_2)com.FN.O(this, var1);
   }

   public com.By_2 V(int var1) {
      return (com.By_2)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.By_2 F(int var1, boolean var2, boolean var3) {
      return (com.By_2)com.FN.d(this, var1, var2, var3);
   }

   public com.By_2 R(int var1, int var2) {
      return (com.By_2)com.FN.m(this, var1, var2);
   }

   public com.By_2 A(String var1) {
      return (com.By_2)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.By_2 E(int var1) {
      return (com.By_2)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public com.By_2 t(int var1) {
      return (com.By_2)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public com.By_2 g(int var1) {
      return (com.By_2)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public com.By_2 S(int var1) {
      return (com.By_2)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public com.By_2 M(int var1) {
      return (com.By_2)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public com.By_2 R(int var1) {
      return (com.By_2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.By_2 P(int var1, int var2) {
      return (com.By_2)PY.O(this, var1, var2);
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
      return this.V(var1);
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
      return this.s(var1);
   }

   @Override
   public Component Q$Component() {
      return this.L();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.d(var1);
   }

   @Override
   public Component R$Component() {
      return this.t();
   }

   @Override
   public Component c(boolean var1) {
      return this.u(var1);
   }

   @Override
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

   @Override
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

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (y() == 0) {
         Z(61);
      }
   }
}





