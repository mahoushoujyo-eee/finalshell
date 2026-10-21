package com.h;

import com.Eh_2;
import com.HT;
import com.IB;
import com.PY;
import com.Pp_2;
import com.Sa_2;
import com.Sr_2;
import com.i2_2;
import com.rF_3;
import com.w6_2;
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

public class K extends JRadioButton implements com.W2, Pp_2, rF_3, com.au_2, Eh_2, com.yb_4, Sa_2 {
   private static boolean h;

   public K() {
   }

   public K(boolean var1) {
      super("", var1);
   }

   public K(Icon var1) {
      super(var1);
   }

   public K(Action var1) {
      super(var1);
   }

   public K(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public K(String var1) {
      super(var1);
   }

   public K(String var1, boolean var2) {
      super(var1, var2);
   }

   public K(String var1, Icon var2) {
      super(var1, var2);
   }

   public K(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public com.DN h(Integer var1) {
      return this.F(new com.Cs_2(var1));
   }

   public com.DN N(boolean var1, boolean var2, boolean var3, Integer var4) {
      return this.F(new com.Cs_2(var1, var2, var3, var4));
   }

   public com.DN F(com.Cs_2 var1) {
      return w6_2.R(this, var1);
   }

   public com.DN J(com.Cs_2 var1, boolean var2) {
      return w6_2.T(this, var1, var2);
   }

   public com.DN s(com.Cs_2 var1, com.WF var2) {
      return w6_2.y(this, var1, var2);
   }

   public com.DN o(Component var1, com.Cs_2 var2) {
      return w6_2.k(var1, this, var2);
   }

   public com.DN f(Component var1, com.Cs_2 var2, boolean var3) {
      return w6_2.R(var1, this, var2, var3);
   }

   public com.DN U(Component var1, com.Cs_2 var2, com.WF var3) {
      return w6_2.V(var1, this, var2, var3);
   }

   public List Q() {
      return w6_2.g((JComponent)this);
   }

   public void H(com.DN var1) {
      w6_2.n(var1);
   }

   public void q() {
      w6_2.A(this);
   }

   @Override
   public Insets getMargin() {
      return this.L().E();
   }

   @Override
   public void setMargin(Insets var1) {
      this.L().t(var1);
   }

   public void k(int var1, int var2, int var3, int var4) {
      this.setMargin(new Insets(var1, var2, var3, var4));
   }

   public void A(int var1) {
      this.k(var1, var1, var1, var1);
   }

   public boolean e() {
      return this.L().w();
   }

   public void U(boolean var1) {
      this.L().r(var1);
   }

   public boolean m() {
      return this.L().e();
   }

   public void O(boolean var1) {
      this.L().t(var1);
   }

   public Color L() {
      return this.L().H();
   }

   public void g(Color var1) {
      this.L().i(var1);
   }

   public Color l() {
      return this.L().D();
   }

   public void u(Color var1) {
      this.L().k(var1);
   }

   public Color r() {
      return this.L().k();
   }

   public void m(Color var1) {
      this.L().O(var1);
   }

   public Color m$Color() {
      return this.L().B();
   }

   public void Z(Color var1) {
      this.L().J(var1);
   }

   public Color H() {
      return this.L().L();
   }

   public void j(Color var1) {
      this.L().G(var1);
   }

   public Color e$Color() {
      return this.L().i();
   }

   public void A(Color var1) {
      this.L().a(var1);
   }

   public Color Z() {
      return this.L().c();
   }

   public void Q(Color var1) {
      this.L().T(var1);
   }

   public int I() {
      return this.L().V();
   }

   public void u(int var1) {
      this.L().u(var1);
   }

   public int K() {
      return this.L().d();
   }

   public void P(int var1) {
      this.L().c(var1);
   }

   public int q$int() {
      return this.L().q();
   }

   public void s(int var1) {
      this.L().G(var1);
   }

   @Override
   public void setSelected(boolean var1) {
      this.y(var1, this.isShowing());
   }

   public void y(boolean var1, boolean var2) {
      com.h.K var6;
      boolean var10001;
      label31: {
         boolean var4;
         boolean var10000 = V();
         var4 = this.e();
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
      return this.L().B();
   }

   public com.h.c L$comhc() {
      return (com.h.c)this.getUI();
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
      // 00: invokestatic com/h/K.Z ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/h/K.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/h/K.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/h/K.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/h/K.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/h/c
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/h/K.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zx Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 248
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/h/c
      // 40: invokevirtual com/h/K.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/h/c
      // 50: dup
      // 51: invokespecial com/h/c.<init> ()V
      // 54: invokevirtual com/h/K.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/h/K.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/h/K.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/h/K.setUI (Ljavax/swing/plaf/ButtonUI;)V
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
   public void O() {
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
   public void m$void() {
      com.cl_4.G(this);
   }

   @Override
   public void e$void() {
      com.cl_4.H(this);
   }

   public com.h.K b() {
      return (com.h.K)com.FN.A(this);
   }

   public com.h.K R(boolean var1) {
      return (com.h.K)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.h.K N() {
      return (com.h.K)com.FN.u(this);
   }

   public com.h.K f(boolean var1) {
      return (com.h.K)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.h.K R() {
      return (com.h.K)com.FN.C(this);
   }

   public com.h.K L(boolean var1) {
      return (com.h.K)com.FN.q(this, var1);
   }

   @Override
   public boolean l$boolean() {
      return com.FN.G(this);
   }

   public com.h.K X(boolean var1, boolean var2) {
      return (com.h.K)com.FN.K(this, var1, var2);
   }

   public com.h.K f(int var1) {
      return (com.h.K)com.FN.p(this, var1);
   }

   public com.h.K d(int var1) {
      return (com.h.K)com.FN.O(this, var1);
   }

   public com.h.K X(int var1) {
      return (com.h.K)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.h.K q(int var1, boolean var2, boolean var3) {
      return (com.h.K)com.FN.d(this, var1, var2, var3);
   }

   public com.h.K w(int var1, int var2) {
      return (com.h.K)com.FN.m(this, var1, var2);
   }

   public com.h.K R(String var1) {
      return (com.h.K)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public int M$int() {
      return PY.f(this);
   }

   public com.h.K h(int var1) {
      return (com.h.K)PY.Q(this, var1);
   }

   @Override
   public int m$int() {
      return PY.m(this);
   }

   public com.h.K e(int var1) {
      return (com.h.K)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public com.h.K s$comhK(int var1) {
      return (com.h.K)PY.N(this, var1);
   }

   @Override
   public int Q$int() {
      return PY.Z(this);
   }

   public com.h.K E(int var1) {
      return (com.h.K)PY.w(this, var1);
   }

   @Override
   public int i$int() {
      return PY.J(this);
   }

   public com.h.K n(int var1) {
      return (com.h.K)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public com.h.K v(int var1) {
      return (com.h.K)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public com.h.K U(int var1, int var2) {
      return (com.h.K)PY.O(this, var1, var2);
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
      return this.d(var1);
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

   @Override
   public Component Q$Component() {
      return this.R();
   }

   @Override
   public Component u(boolean var1) {
      return this.f(var1);
   }

   @Override
   public Component R$Component() {
      return this.N();
   }

   @Override
   public Component c(boolean var1) {
      return this.R(var1);
   }

   @Override
   public Component a$Component() {
      return this.b();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
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
      return this.s(var1);
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

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (!Z()) {
         G(true);
      }
   }
}





