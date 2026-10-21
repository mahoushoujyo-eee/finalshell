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
import javax.swing.JTextField;
import javax.swing.text.Document;

public class ne_4 extends JTextField implements com.W2, RS, Pp_2, rF_3, com.au_2, Eh_2, com.yb_4, Sa_2 {
   private static boolean J;

   public ne_4() {
   }

   public ne_4(boolean var1) {
      this.y(var1);
   }

   public ne_4(String var1) {
      super(var1);
   }

   public ne_4(String var1, boolean var2) {
      super(var1);
      this.y(var2);
   }

   public ne_4(int var1) {
      super(var1);
   }

   public ne_4(int var1, boolean var2) {
      super(var1);
      this.y(var2);
   }

   public ne_4(String var1, int var2) {
      super(var1, var2);
   }

   public ne_4(String var1, int var2, boolean var3) {
      super(var1, var2);
      this.y(var3);
   }

   public ne_4(Document var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   public ne_4(Document var1, String var2, int var3, boolean var4) {
      super(var1, var2, var3);
      this.y(var4);
   }

   public void g() {
      this.setText("");
   }

   public boolean g$boolean() {
      return this.j().R();
   }

   public void y(boolean var1) {
      this.j().R(var1);
   }

   public boolean H() {
      return this.j().C();
   }

   public void c(boolean var1) {
      this.j().o(var1);
   }

   public JComponent I() {
      return this.j().v();
   }

   public void v(JComponent var1) {
      this.j().o(var1);
   }

   public JComponent n() {
      return this.j().d();
   }

   public void z(JComponent var1) {
      this.j().z(var1);
   }

   public void I(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void n(int var1) {
      this.I(var1, var1, var1, var1);
   }

   public void l(Insets var1) {
      this.j().T(var1);
   }

   public void d(int var1, int var2, int var3, int var4) {
      this.l(new Insets(var1, var2, var3, var4));
   }

   public void J(int var1) {
      this.d(var1, var1, var1, var1);
   }

   public Insets p() {
      return this.j().Z();
   }

   public int z() {
      return this.j().k();
   }

   public void h(int var1) {
      this.j().T(var1);
   }

   public boolean V() {
      return this.j().T();
   }

   public void L(boolean var1) {
      this.j().h(var1);
   }

   public int L() {
      return this.j().a();
   }

   public void F(int var1) {
      this.j().g(var1);
   }

   public boolean a() {
      return this.j().G();
   }

   public void P(boolean var1) {
      this.j().L(var1);
   }

   public boolean M() {
      return this.j().q();
   }

   public void T(boolean var1) {
      this.j().D(var1);
   }

   public com.og_4 f() {
      return this.j().i();
   }

   public void F(com.og_4 var1) {
      this.j().Y(var1);
   }

   public String t() {
      return this.j().F();
   }

   public void P(String var1) {
      this.j().F(var1);
   }

   public Font I$Font() {
      return this.j().n();
   }

   public void v(Font var1) {
      this.j().B(var1);
   }

   public Color O() {
      return this.j().u();
   }

   public void B(Color var1) {
      this.j().w(var1);
   }

   public int u() {
      return this.j().O();
   }

   public void j(int var1) {
      this.j().e(var1);
   }

   public boolean f$boolean() {
      return this.j().A();
   }

   public void z(boolean var1) {
      this.j().k(var1);
   }

   @Override
   public Shape B() {
      return this.j().B();
   }

   public com.QH j() {
      return (com.QH)this.getUI();
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
      // 09: invokevirtual com/ne_4.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/ne_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/ne_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/ne_4.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/QH
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/ne_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zP Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 206
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/QH
      // 40: invokevirtual com/ne_4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/QH
      // 50: dup
      // 51: invokespecial com/QH.<init> ()V
      // 54: invokevirtual com/ne_4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/ne_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/ne_4.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/ne_4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/ne_4.invalidate ()V
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

   public ne_4 o() {
      return (ne_4)com.FN.A(this);
   }

   public ne_4 C(boolean var1) {
      return (ne_4)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public ne_4 R() {
      return (ne_4)com.FN.u(this);
   }

   public ne_4 Q(boolean var1) {
      return (ne_4)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public ne_4 Q() {
      return (ne_4)com.FN.C(this);
   }

   public ne_4 H(boolean var1) {
      return (ne_4)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public ne_4 S(boolean var1, boolean var2) {
      return (ne_4)com.FN.K(this, var1, var2);
   }

   public ne_4 g(int var1) {
      return (ne_4)com.FN.p(this, var1);
   }

   public ne_4 j$ne_4(int var1) {
      return (ne_4)com.FN.O(this, var1);
   }

   public ne_4 u(int var1) {
      return (ne_4)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public ne_4 C(int var1, boolean var2, boolean var3) {
      return (ne_4)com.FN.d(this, var1, var2, var3);
   }

   public ne_4 A(int var1, int var2) {
      return (ne_4)com.FN.m(this, var1, var2);
   }

   public ne_4 i(String var1) {
      return (ne_4)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public ne_4 M(int var1) {
      return (ne_4)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public ne_4 H(int var1) {
      return (ne_4)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public ne_4 R(int var1) {
      return (ne_4)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public ne_4 Z(int var1) {
      return (ne_4)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public ne_4 S(int var1) {
      return (ne_4)PY.b(this, var1);
   }

   @Override
   public int a$int() {
      return PY.i(this);
   }

   public ne_4 p(int var1) {
      return (ne_4)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public ne_4 H(int var1, int var2) {
      return (ne_4)PY.O(this, var1, var2);
   }

   public static ne_4 i$ne_4() {
      return k(GO.d);
   }

   public static ne_4 k(boolean var0) {
      return s(var0, GO.FT);
   }

   public static ne_4 s(boolean var0, int var1) {
      return r(var0, var1, GO.FG);
   }

   public static ne_4 r(boolean var0, int var1, int var2) {
      ne_4 var3 = new ne_4();
      var3.y(var0);
      var3.h(var1);
      var3.F(var2);
      return var3;
   }

   @Override
   public Component N(String var1) {
      return this.i(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.A(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.C(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.u(var1);
   }

   @Override
   public Component o(int var1) {
      return this.j(var1);
   }

   @Override
   public Component i(int var1) {
      return this.g(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.S(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.H(var1);
   }

   @Override
   public Component Q$Component() {
      return this.Q();
   }

   @Override
   public Component u(boolean var1) {
      return this.Q(var1);
   }

   @Override
   public Component R$Component() {
      return this.R();
   }

   @Override
   public Component c$Component(boolean var1) {
      return this.C(var1);
   }

   @Override
   public Component a$Component() {
      return this.o();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.H(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.p(var1);
   }

   @Override
   public Component p$Component(int var1) {
      return this.S(var1);
   }

   @Override
   public Component D(int var1) {
      return this.Z(var1);
   }

   @Override
   public Component V(int var1) {
      return this.R(var1);
   }

   @Override
   public Component x(int var1) {
      return this.H(var1);
   }

   @Override
   public Component O(int var1) {
      return this.M(var1);
   }

   public static void p(boolean var0) {
      J = var0;
   }

   public static boolean m$boolean() {
      return J;
   }

   public static boolean A$boolean() {
      boolean var0 = m();
      return !var0;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (m()) {
         p(true);
      }
   }
}





