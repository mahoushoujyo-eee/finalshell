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
import javax.swing.JTextField;
import javax.swing.text.Document;

public class Ne4 extends JTextField implements W2_3, RS, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public static boolean J;

   public Ne4() {
   }

   public Ne4(boolean var1) {
      this.y(var1);
   }

   public Ne4(String var1) {
      super(var1);
   }

   public Ne4(String var1, boolean var2) {
      super(var1);
      this.y(var2);
   }

   public Ne4(int var1) {
      super(var1);
   }

   public Ne4(int var1, boolean var2) {
      super(var1);
      this.y(var2);
   }

   public Ne4(String var1, int var2) {
      super(var1, var2);
   }

   public Ne4(String var1, int var2, boolean var3) {
      super(var1, var2);
      this.y(var3);
   }

   public Ne4(Document var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   public Ne4(Document var1, String var2, int var3, boolean var4) {
      super(var1, var2, var3);
      this.y(var4);
   }

   public void g$void() {
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

   public void c$void(boolean var1) {
      this.j().o(var1);
   }

   public JComponent I$JComponent() {
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

   public boolean a$boolean() {
      return this.j().G();
   }

   public void P(boolean var1) {
      this.j().L(var1);
   }

   public boolean M$boolean() {
      return this.j().q();
   }

   public void T(boolean var1) {
      this.j().D(var1);
   }

   public Og4 f$og_4() {
      return this.j().i();
   }

   public void F(Og4 var1) {
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

   public Color O$Color() {
      return this.j().u();
   }

   public void B(Color var1) {
      this.j().w(var1);
   }

   public int u() {
      return this.j().O();
   }

   public void j$void(int var1) {
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
      return this.j().B$Shape();
   }

   public QH j() {
      return (QH)this.getUI();
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
      // 09: invokevirtual com/finalshell/core/Ne4.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ne4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Ne4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/Ne4.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/finalshell/core/QH
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Ne4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zP Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 217
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/QH
      // 40: invokevirtual com/finalshell/core/Ne4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/QH
      // 50: dup
      // 51: invokespecial com/finalshell/core/QH.<init> ()V
      // 54: invokevirtual com/finalshell/core/Ne4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Ne4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Ne4.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/finalshell/core/Ne4.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/core/Ne4.invalidate ()V
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

   public Ne4 o() {
      return (Ne4)FN.A(this);
   }

   public Ne4 C(boolean var1) {
      return (Ne4)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Ne4 R$ne_4() {
      return (Ne4)FN.u(this);
   }

   public Ne4 Q(boolean var1) {
      return (Ne4)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Ne4 Q$ne_4() {
      return (Ne4)FN.C(this);
   }

   public Ne4 H(boolean var1) {
      return (Ne4)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Ne4 S(boolean var1, boolean var2) {
      return (Ne4)FN.K(this, var1, var2);
   }

   public Ne4 g(int var1) {
      return (Ne4)FN.p(this, var1);
   }

   public Ne4 j$ne_4(int var1) {
      return (Ne4)FN.O(this, var1);
   }

   public Ne4 u(int var1) {
      return (Ne4)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Ne4 C(int var1, boolean var2, boolean var3) {
      return (Ne4)FN.d(this, var1, var2, var3);
   }

   public Ne4 A(int var1, int var2) {
      return (Ne4)FN.m(this, var1, var2);
   }

   public Ne4 i(String var1) {
      return (Ne4)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public Ne4 M(int var1) {
      return (Ne4)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public Ne4 H(int var1) {
      return (Ne4)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public Ne4 R(int var1) {
      return (Ne4)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public Ne4 Z(int var1) {
      return (Ne4)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public Ne4 S(int var1) {
      return (Ne4)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public Ne4 p$ne_4(int var1) {
      return (Ne4)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public Ne4 H(int var1, int var2) {
      return (Ne4)PY.O(this, var1, var2);
   }

   public static Ne4 i$ne_4() {
      return k(GO.d);
   }

   public static Ne4 k(boolean var0) {
      return s(var0, GO.FT);
   }

   public static Ne4 s(boolean var0, int var1) {
      return r(var0, var1, GO.FG);
   }

   public static Ne4 r(boolean var0, int var1, int var2) {
      Ne4 var3 = new Ne4();
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
      return this.j$ne_4(var1);
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

   public Component Q$Component() {
      return this.Q$ne_4();
   }

   @Override
   public Component u(boolean var1) {
      return this.Q(var1);
   }

   public Component R$Component() {
      return this.R$ne_4();
   }

   public Component c$Component(boolean var1) {
      return this.C(var1);
   }

   public Component a$Component() {
      return this.o();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.H(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.p$ne_4(var1);
   }

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
      boolean var0 = m$boolean();
      return !var0;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (m$boolean()) {
         p(true);
      }
   }
}





