package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JTabbedPane;

public class Hd_2 extends JTabbedPane implements com.W2, com.au_2, Eh_2, com.yb_4, com.cX_3 {
   private static String x;

   public Hd_2() {
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
   }

   public Hd_2(int var1) {
      super(var1);
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
   }

   public Hd_2(int var1, int var2) {
      super(var1, var2);
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
   }

   public Hd_2(ij_4 var1) {
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
      this.U(var1);
   }

   public Hd_2(int var1, ij_4 var2) {
      super(var1);
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
      this.U(var2);
   }

   public Hd_2(int var1, int var2, ij_4 var3) {
      super(var1, var2);
      this.setFocusable(false);
      this.setBackground((Color)com.c.c(430348892393272046L).get(null));
      this.U(var3);
   }

   public int N(Point var1) {
      return this.p(var1.x, var1.y);
   }

   public int p(int var1, int var2) {
      return this.indexAtLocation(var1, var2);
   }

   public Rectangle s(Point var1) {
      return this.y(var1.x, var1.y);
   }

   public Rectangle y(int var1, int var2) {
      int var3 = this.p(var1, var2);
      return var3 != -1 ? this.getBoundsAt(var3) : null;
   }

   public int u() {
      return this.P().e();
   }

   public void i(int var1) {
      this.P().l(var1);
   }

   public int O() {
      return this.P().N();
   }

   public void o(int var1) {
      this.P().M(var1);
   }

   public boolean y() {
      return this.P().S();
   }

   public void s(boolean var1) {
      this.P().J(var1);
   }

   public Insets H() {
      return this.P().h();
   }

   public void f(Insets var1) {
      this.P().Z(var1);
   }

   public Insets o() {
      return this.P().r();
   }

   public void N(Insets var1) {
      this.P().S(var1);
   }

   public Color Z() {
      return this.P().O();
   }

   public void P(Color var1) {
      this.P().R(var1);
   }

   public Color G() {
      return this.P().n();
   }

   public void M(Color var1) {
      this.P().t(var1);
   }

   public Color g() {
      return this.P().T();
   }

   public void r(Color var1) {
      this.P().T(var1);
   }

   public Color M() {
      return this.P().z();
   }

   public void y(Color var1) {
      this.P().u(var1);
   }

   public void M(int var1, Color var2) {
      this.P().x(var1, var2);
   }

   public Color s(int var1) {
      return this.P().m(var1);
   }

   public void Y(int var1, com.og_4 var2) {
      this.P().v(var1, var2);
   }

   public com.og_4 N(int var1) {
      return this.P().k(var1);
   }

   public ij_4 q() {
      return this.P().t();
   }

   public void U(ij_4 var1) {
      this.P().e(var1);
   }

   public com.og_4 V() {
      return this.P().Q();
   }

   public void v(com.og_4 var1) {
      this.P().G(var1);
   }

   public int F() {
      return this.P().s();
   }

   public void q(int var1) {
      this.P().g(var1);
   }

   public int G$int() {
      return this.P().c();
   }

   public void R(int var1) {
      this.P().j(var1);
   }

   public So_2 w() {
      return this.P().d();
   }

   public void O(So_2 var1) {
      this.P().x(var1);
   }

   public Color U() {
      return this.P().r();
   }

   public void U(Color var1) {
      this.P().P(var1);
   }

   public Color h() {
      return this.P().k();
   }

   public void j(Color var1) {
      this.P().k(var1);
   }

   public boolean g$boolean() {
      return this.P().U();
   }

   public void A(boolean var1) {
      this.P().I(var1);
   }

   public boolean Z$boolean() {
      return this.P().h();
   }

   public void b(boolean var1) {
      this.P().m(var1);
   }

   public Color L() {
      return this.P().D();
   }

   public void k(Color var1) {
      this.P().H(var1);
   }

   public boolean O$boolean() {
      return this.P().f();
   }

   public void j(boolean var1) {
      this.P().R(var1);
   }

   @Override
   public Shape B() {
      return this.P().B();
   }

   public com.KV P() {
      return (com.KV)this.getUI();
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
      // 00: invokestatic com/Hd_2.X ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/Hd_2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/Hd_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/Hd_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/Hd_2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 25: instanceof com/KV
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/Hd_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.z9 Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 257
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/KV
      // 40: invokevirtual com/Hd_2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/KV
      // 50: dup
      // 51: invokespecial com/KV.<init> ()V
      // 54: invokevirtual com/Hd_2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/Hd_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/Hd_2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 67: invokevirtual com/Hd_2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 6a: return
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
   public void p(String var1) {
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
   public void w$void() {
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

   public Hd_2 m$Hd_2() {
      return (Hd_2)com.FN.A(this);
   }

   public Hd_2 s$Hd_2(boolean var1) {
      return (Hd_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public Hd_2 R() {
      return (Hd_2)com.FN.u(this);
   }

   public Hd_2 z(boolean var1) {
      return (Hd_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public Hd_2 N() {
      return (Hd_2)com.FN.C(this);
   }

   public Hd_2 i(boolean var1) {
      return (Hd_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public Hd_2 l(boolean var1, boolean var2) {
      return (Hd_2)com.FN.K(this, var1, var2);
   }

   public Hd_2 w(int var1) {
      return (Hd_2)com.FN.p(this, var1);
   }

   public Hd_2 z(int var1) {
      return (Hd_2)com.FN.O(this, var1);
   }

   public Hd_2 K(int var1) {
      return (Hd_2)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public Hd_2 M(int var1, boolean var2, boolean var3) {
      return (Hd_2)com.FN.d(this, var1, var2, var3);
   }

   public Hd_2 M(int var1, int var2) {
      return (Hd_2)com.FN.m(this, var1, var2);
   }

   public Hd_2 u(String var1) {
      return (Hd_2)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public void o(String var1) {
      i2_2.f(this, var1);
   }

   @Override
   public void I() {
      i2_2.p(this);
   }

   @Override
   public String q$String() {
      return i2_2.O(this);
   }

   @Override
   public Component N(String var1) {
      return this.u(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.M(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.M(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.K(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.z(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.w(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.l(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.i(var1);
   }

   @Override
   public Component Q() {
      return this.N();
   }

   @Override
   public Component u(boolean var1) {
      return this.z(var1);
   }

   @Override
   public Component R$Component() {
      return this.R();
   }

   @Override
   public Component c(boolean var1) {
      return this.s(var1);
   }

   @Override
   public Component a() {
      return this.m();
   }

   public static void E(String var0) {
      x = var0;
   }

   public static String X() {
      return x;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (X() == null) {
         E("ka6m1");
      }
   }
}





