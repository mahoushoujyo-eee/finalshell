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
import javax.swing.JComponent;
import javax.swing.JRadioButton;

public class K4_2 extends JRadioButton implements W2_3, Pp2, RF3, Au2, Eh2, Yb4, Sa2 {
   public static boolean h;

   public K4_2() {
   }

   public K4_2(boolean var1) {
      super("", var1);
   }

   public K4_2(Icon var1) {
      super(var1);
   }

   public K4_2(Action var1) {
      super(var1);
   }

   public K4_2(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public K4_2(String var1) {
      super(var1);
   }

   public K4_2(String var1, boolean var2) {
      super(var1, var2);
   }

   public K4_2(String var1, Icon var2) {
      super(var1, var2);
   }

   public K4_2(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public DN_2 h(Integer var1) {
      return this.F(new com.finalshell.ui.model.Cs2(var1));
   }

   public DN_2 N(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.F(new com.finalshell.ui.model.Cs2(var1, var2, var3, var4));
   }

   public DN_2 F(com.finalshell.ui.model.Cs2 var1) {
      return W62.R(this, var1);
   }

   public DN_2 J(com.finalshell.ui.model.Cs2 var1, boolean var2) {
      return W62.T(this, var1, var2);
   }

   public DN_2 s(com.finalshell.ui.model.Cs2 var1, WF var2) {
      return W62.y(this, var1, var2);
   }

   public DN_2 o(Component var1, com.finalshell.ui.model.Cs2 var2) {
      return W62.k(var1, this, var2);
   }

   public DN_2 f(Component var1, com.finalshell.ui.model.Cs2 var2, boolean var3) {
      return W62.R(var1, this, var2, var3);
   }

   public DN_2 U(Component var1, com.finalshell.ui.model.Cs2 var2, WF var3) {
      return W62.V(var1, this, var2, var3);
   }

   public List Q$List() {
      return W62.g((JComponent)this);
   }

   public void H(DN_2 var1) {
      W62.n(var1);
   }

   public void q$void() {
      W62.A(this);
   }

   @Override
   public Insets getMargin() {
      return this.L$c().E();
   }

   @Override
   public void setMargin(Insets var1) {
      this.L$c().t(var1);
   }

   public void k(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void A(int var1) {
      this.k(var1, var1, var1, var1);
   }

   public boolean e$boolean() {
      return this.L$c().w();
   }

   public void U(boolean var1) {
      this.L$c().r(var1);
   }

   public boolean m$boolean() {
      return this.L$c().e();
   }

   public void O(boolean var1) {
      this.L$c().t(var1);
   }

   public Color L$Color() {
      return this.L$c().H();
   }

   public void g(Color var1) {
      this.L$c().i(var1);
   }

   public Color l$Color() {
      return this.L$c().D();
   }

   public void u(Color var1) {
      this.L$c().k(var1);
   }

   public Color r() {
      return this.L$c().k();
   }

   public void m(Color var1) {
      this.L$c().O(var1);
   }

   public Color m$Color() {
      return this.L$c().B$Color();
   }

   public void Z(Color var1) {
      this.L$c().J(var1);
   }

   public Color H() {
      return this.L$c().L();
   }

   public void j(Color var1) {
      this.L$c().G(var1);
   }

   public Color e$Color() {
      return this.L$c().i();
   }

   public void A(Color var1) {
      this.L$c().a(var1);
   }

   public Color Z$Color() {
      return this.L$c().c$Color();
   }

   public void Q(Color var1) {
      this.L$c().T(var1);
   }

   public int I() {
      return this.L$c().V();
   }

   public void u(int var1) {
      this.L$c().u(var1);
   }

   public int K$int() {
      return this.L$c().d();
   }

   public void P(int var1) {
      this.L$c().c(var1);
   }

   public int q$int() {
      return this.L$c().q();
   }

   public void s$void(int var1) {
      this.L$c().G(var1);
   }

   @Override
   public void setSelected(boolean var1) {
      this.y(var1, this.isShowing());
   }

   public void y(boolean var1, boolean var2) {
      boolean var5;
      K4_2 var6;
      boolean var10001;
      label31: {
         boolean var4;
         boolean var10000 = V();
         var4 = this.e$boolean();
         boolean var3 = var10000;
         var5 = var2;
         label27:
         if (!var3) {
            if (!var2) {
               var5 = var4;
               if (var3) {
                  break label27;
               }

               if (var4) {
                  this.U(false);
               }
            }

            var6 = this;
            var10001 = var1;
            if (var3) {
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

      var6.U(var10001);
   }

   @Override
   public Shape B() {
      return this.L$c().B$Shape();
   }

   public com.finalshell.ui.listener.C4 L$c() {
      return (com.finalshell.ui.listener.C4)this.getUI();
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
      // 00: invokestatic com/finalshell/core/K4_2.Z$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/core/K4_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/K4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/K4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/K4_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/ui/listener/C4
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/K4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zx Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 264
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/ui/listener/C4
      // 40: invokevirtual com/finalshell/core/K4_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/ui/listener/C4
      // 50: dup
      // 51: invokespecial com/finalshell/ui/listener/C4.<init> ()V
      // 54: invokevirtual com/finalshell/core/K4_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/K4_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/K4_2.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/K4_2.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   public K4_2 b() {
      return (K4_2)FN.A(this);
   }

   public K4_2 R(boolean var1) {
      return (K4_2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public K4_2 N() {
      return (K4_2)FN.u(this);
   }

   public K4_2 f(boolean var1) {
      return (K4_2)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public K4_2 R$K() {
      return (K4_2)FN.C(this);
   }

   public K4_2 L(boolean var1) {
      return (K4_2)FN.q(this, var1);
   }

   public boolean l$boolean() {
      return FN.G(this);
   }

   public K4_2 X(boolean var1, boolean var2) {
      return (K4_2)FN.K(this, var1, var2);
   }

   public K4_2 f(int var1) {
      return (K4_2)FN.p(this, var1);
   }

   public K4_2 d$K(int var1) {
      return (K4_2)FN.O(this, var1);
   }

   public K4_2 X(int var1) {
      return (K4_2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public K4_2 q(int var1, boolean var2, boolean var3) {
      return (K4_2)FN.d(this, var1, var2, var3);
   }

   public K4_2 w(int var1, int var2) {
      return (K4_2)FN.m(this, var1, var2);
   }

   public K4_2 R(String var1) {
      return (K4_2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public K4_2 h(int var1) {
      return (K4_2)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public K4_2 e(int var1) {
      return (K4_2)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public K4_2 s$K(int var1) {
      return (K4_2)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public K4_2 E(int var1) {
      return (K4_2)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public K4_2 n(int var1) {
      return (K4_2)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public K4_2 v(int var1) {
      return (K4_2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public K4_2 U(int var1, int var2) {
      return (K4_2)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.R(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.w(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.q(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.X(var1);
   }

   @Override
   public Component o(int var1) {
      return this.d$K(var1);
   }

   @Override
   public Component i(int var1) {
      return this.f(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.X(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.L(var1);
   }

   public Component Q$Component() {
      return this.R$K();
   }

   @Override
   public Component u(boolean var1) {
      return this.f(var1);
   }

   public Component R$Component() {
      return this.N();
   }

   @Override
   public Component c(boolean var1) {
      return this.R(var1);
   }

   public Component a$Component() {
      return this.b();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.U(var1, var2);
   }

   public Component d$Component(int var1) {
      return this.v(var1);
   }

   @Override
   public Component p(int var1) {
      return this.n(var1);
   }

   @Override
   public Component D(int var1) {
      return this.E(var1);
   }

   @Override
   public Component V(int var1) {
      return this.s$K(var1);
   }

   @Override
   public Component x(int var1) {
      return this.e(var1);
   }

   @Override
   public Component O(int var1) {
      return this.h(var1);
   }

   public static void G(boolean var0) {
      h = var0;
   }

   public static boolean V() {
      return h;
   }

   public static boolean Z$boolean() {
      boolean var0 = V();
      return !var0;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!Z$boolean()) {
         G(true);
      }
   }
}





