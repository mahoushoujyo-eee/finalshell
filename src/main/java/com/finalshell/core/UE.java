package com.finalshell.core;

import com.finalshell.ui.model.WF;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class UE extends JCheckBox implements W2_3, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public static boolean t;

   public UE() {
   }

   public UE(boolean var1) {
      super("", var1);
   }

   public UE(Icon var1) {
      super(var1);
   }

   public UE(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public UE(String var1) {
      super(var1);
   }

   public UE(Action var1) {
      super(var1);
   }

   public UE(String var1, boolean var2) {
      super(var1, var2);
   }

   public UE(String var1, Icon var2) {
      super(var1, var2);
   }

   public UE(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public DN_2 R(Integer var1) {
      return this.d(new com.finalshell.ui.model.Cs2(var1));
   }

   public DN_2 X(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.d(new com.finalshell.ui.model.Cs2(var1, var2, var3, var4));
   }

   public DN_2 d(com.finalshell.ui.model.Cs2 var1) {
      return W62.R(this, var1);
   }

   public DN_2 d(com.finalshell.ui.model.Cs2 var1, boolean var2) {
      return W62.T(this, var1, var2);
   }

   public DN_2 w(com.finalshell.ui.model.Cs2 var1, WF var2) {
      return W62.y(this, var1, var2);
   }

   public DN_2 f(Component var1, com.finalshell.ui.model.Cs2 var2) {
      return W62.k(var1, this, var2);
   }

   public DN_2 I(Component var1, com.finalshell.ui.model.Cs2 var2, boolean var3) {
      return W62.R(var1, this, var2, var3);
   }

   public DN_2 B(Component var1, com.finalshell.ui.model.Cs2 var2, WF var3) {
      return W62.V(var1, this, var2, var3);
   }

   public List a$List() {
      return W62.g((JComponent)this);
   }

   public void b(DN_2 var1) {
      W62.n(var1);
   }

   public void X() {
      W62.A(this);
   }

   @Override
   public Insets getMargin() {
      return this.M$Fm_2().k();
   }

   @Override
   public void setMargin(Insets var1) {
      this.M$Fm_2().G(var1);
   }

   public void f(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void D$void(int var1) {
      this.f(var1, var1, var1, var1);
   }

   public boolean L() {
      return this.M$Fm_2().O();
   }

   public void w(boolean var1) {
      this.M$Fm_2().C(var1);
   }

   public boolean j() {
      return this.M$Fm_2().h$boolean();
   }

   public void r(boolean var1) {
      this.M$Fm_2().m(var1);
   }

   public Color V() {
      return this.M$Fm_2().J();
   }

   public void J(Color var1) {
      this.M$Fm_2().Z(var1);
   }

   public Color a$Color() {
      return this.M$Fm_2().e();
   }

   public void A(Color var1) {
      this.M$Fm_2().p(var1);
   }

   public Color I() {
      return this.M$Fm_2().p$Color();
   }

   public void T(Color var1) {
      this.M$Fm_2().O(var1);
   }

   public Color H() {
      return this.M$Fm_2().h$Color();
   }

   public void Q(Color var1) {
      this.M$Fm_2().R(var1);
   }

   public Color g() {
      return this.M$Fm_2().a();
   }

   public void c(Color var1) {
      this.M$Fm_2().b(var1);
   }

   public Color N() {
      return this.M$Fm_2().n$Color();
   }

   public void D(Color var1) {
      this.M$Fm_2().B(var1);
   }

   public Color D$Color() {
      return this.M$Fm_2().S();
   }

   public void b(Color var1) {
      this.M$Fm_2().n(var1);
   }

   public int y() {
      return this.M$Fm_2().n$int();
   }

   public void Y(int var1) {
      this.M$Fm_2().i(var1);
   }

   public int z() {
      return this.M$Fm_2().V();
   }

   public void e(int var1) {
      this.M$Fm_2().f(var1);
   }

   public int q() {
      return this.M$Fm_2().H$int();
   }

   public void G$void(int var1) {
      this.M$Fm_2().P(var1);
   }

   public int B$int() {
      return this.M$Fm_2().R();
   }

   public void u(int var1) {
      this.M$Fm_2().t(var1);
   }

   @Override
   public void setSelected(boolean var1) {
      this.M(var1, this.isShowing());
   }

   public void M(boolean var1, boolean var2) {
      boolean var5;
      UE var6;
      boolean var10001;
      label31: {
         boolean var4;
         boolean var10000 = o();
         var4 = this.L();
         boolean var3 = var10000;
         var5 = var2;
         label27:
         if (var3) {
            if (!var2) {
               var5 = var4;
               if (!var3) {
                  break label27;
               }

               if (var4) {
                  this.w(false);
               }
            }

            var6 = this;
            var10001 = var1;
            if (!var3) {
               break label31;
            }

            super.setSelected(var1);
            var5 = var2;
         }

         if (var5) {
            return;
         }

         var6 = this;
         var10001 = var4;
      }

      var6.w(var10001);
   }

   public Shape B$Shape() {
      return this.M$Fm_2().B();
   }

   public Fm2 M$Fm_2() {
      return (Fm2)this.getUI();
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
      // 00: invokestatic com/finalshell/core/UE.Z ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/core/UE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/UE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/UE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/UE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/Fm2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/UE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.E Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 268
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Fm2
      // 40: invokevirtual com/finalshell/core/UE.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Fm2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Fm2.<init> ()V
      // 54: invokevirtual com/finalshell/core/UE.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/UE.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/UE.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/UE.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   public boolean k$boolean() {
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

   public UE T() {
      return (UE)FN.A(this);
   }

   public UE K(boolean var1) {
      return (UE)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public UE k$uE() {
      return (UE)FN.u(this);
   }

   public UE A(boolean var1) {
      return (UE)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public UE f() {
      return (UE)FN.C(this);
   }

   public UE W(boolean var1) {
      return (UE)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public UE t(boolean var1, boolean var2) {
      return (UE)FN.K(this, var1, var2);
   }

   public UE l(int var1) {
      return (UE)FN.p(this, var1);
   }

   public UE D$uE(int var1) {
      return (UE)FN.O(this, var1);
   }

   public UE q(int var1) {
      return (UE)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public UE B(int var1, boolean var2, boolean var3) {
      return (UE)FN.d(this, var1, var2, var3);
   }

   public UE U(int var1, int var2) {
      return (UE)FN.m(this, var1, var2);
   }

   public UE r(String var1) {
      return (UE)FN.s(this, var1);
   }

   public String D$String() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public UE G$uE(int var1) {
      return (UE)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public UE g(int var1) {
      return (UE)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public UE o$uE(int var1) {
      return (UE)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public UE z(int var1) {
      return (UE)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public UE m(int var1) {
      return (UE)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public UE S(int var1) {
      return (UE)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public UE Y(int var1, int var2) {
      return (UE)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.r(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.B(var1, var2, var3);
   }

   public Component G$Component(int var1) {
      return this.q(var1);
   }

   public Component o$Component(int var1) {
      return this.D$uE(var1);
   }

   @Override
   public Component i(int var1) {
      return this.l(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.t(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.W(var1);
   }

   public Component Q$Component() {
      return this.f();
   }

   @Override
   public Component u(boolean var1) {
      return this.A(var1);
   }

   @Override
   public Component R() {
      return this.k$uE();
   }

   @Override
   public Component c(boolean var1) {
      return this.K(var1);
   }

   public Component a$Component() {
      return this.T();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.Y(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.S(var1);
   }

   @Override
   public Component p(int var1) {
      return this.m(var1);
   }

   public Component D$Component(int var1) {
      return this.z(var1);
   }

   @Override
   public Component V(int var1) {
      return this.o$uE(var1);
   }

   @Override
   public Component x(int var1) {
      return this.g(var1);
   }

   @Override
   public Component O(int var1) {
      return this.G$uE(var1);
   }

   public static void X(boolean var0) {
      t = var0;
   }

   public static boolean Z() {
      return t;
   }

   public static boolean o() {
      boolean var0 = Z();
      return !var0;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (Z()) {
         X(true);
      }
   }
}





