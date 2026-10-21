package com.finalshell.ui.panel;

import com.finalshell.core.Au2;
import com.finalshell.core.CX3_2;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.Eh2;
import com.finalshell.core.FN;
import com.finalshell.core.I22;
import com.finalshell.core.IB;
import com.finalshell.core.KV_2;
import com.finalshell.core.Ld4;
import com.finalshell.core.Og4;
import com.finalshell.core.W2_3;
import com.finalshell.core.Yb4;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ij4;
import com.finalshell.ui.model.So2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JTabbedPane;

public class Hd2 extends JTabbedPane implements W2_3, Au2, Eh2, Yb4, CX3_2 {
   public static String x;

   public Hd2() {
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
   }

   public Hd2(int var1) {
      super(var1);
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
   }

   public Hd2(int var1, int var2) {
      super(var1, var2);
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
   }

   public Hd2(Ij4 var1) {
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
      this.U(var1);
   }

   public Hd2(int var1, Ij4 var2) {
      super(var1);
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
      this.U(var2);
   }

   public Hd2(int var1, int var2, Ij4 var3) {
      super(var1, var2);
      this.setFocusable(false);
      this.setBackground((Color)Registry.lookupField(430348892393272046L).get(null));
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

   public void i$void(int var1) {
      this.P().l(var1);
   }

   public int O$int() {
      return this.P().N$int();
   }

   public void o$void(int var1) {
      this.P().M$void(var1);
   }

   public boolean y() {
      return this.P().S();
   }

   public void s$void(boolean var1) {
      this.P().J(var1);
   }

   public Insets H() {
      return this.P().h$Insets();
   }

   public void f(Insets var1) {
      this.P().Z(var1);
   }

   public Insets o() {
      return this.P().r$Insets();
   }

   public void N(Insets var1) {
      this.P().S(var1);
   }

   public Color Z$Color() {
      return this.P().O();
   }

   public void P(Color var1) {
      this.P().R(var1);
   }

   public Color G$Color() {
      return this.P().n();
   }

   public void M(Color var1) {
      this.P().t(var1);
   }

   public Color g$Color() {
      return this.P().T();
   }

   public void r(Color var1) {
      this.P().T(var1);
   }

   public Color M$Color() {
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

   public void Y(int var1, Og4 var2) {
      this.P().v(var1, var2);
   }

   public Og4 N(int var1) {
      return this.P().k(var1);
   }

   public Ij4 q$ij_4() {
      return this.P().t();
   }

   public void U(Ij4 var1) {
      this.P().e(var1);
   }

   public Og4 V() {
      return this.P().Q();
   }

   public void v(Og4 var1) {
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

   public So2 w$So_2() {
      return this.P().d();
   }

   public void O(So2 var1) {
      this.P().x(var1);
   }

   public Color U() {
      return this.P().r$Color();
   }

   public void U(Color var1) {
      this.P().P(var1);
   }

   public Color h$Color() {
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
      return this.P().h$boolean();
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

   public KV_2 P() {
      return (KV_2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Hd2.X ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/Hd2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/Hd2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/Hd2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/Hd2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 25: instanceof com/finalshell/core/KV_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/Hd2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.z9 Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 272
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/KV_2
      // 40: invokevirtual com/finalshell/ui/panel/Hd2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/KV_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/KV_2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/Hd2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/Hd2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/Hd2.getUI ()Ljavax/swing/plaf/TabbedPaneUI;
      // 67: invokevirtual com/finalshell/ui/panel/Hd2.setUI (Ljavax/swing/plaf/TabbedPaneUI;)V
      // 6a: return
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

   @Override
   public void i() {
      I22.o(this);
   }

   @Override
   public void p(String var1) {
      Cl4_2.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
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
   public void I(String var1, String var2, Class var3) {
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
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
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

   public void w$void() {
      Cl4_2.O(this);
   }

   public void m$void() {
      Cl4_2.G(this);
   }

   @Override
   public void e() {
      Cl4_2.H(this);
   }

   public Hd2 m$Hd_2() {
      return (Hd2)FN.A(this);
   }

   public Hd2 s$Hd_2(boolean var1) {
      return (Hd2)FN.O(this, var1);
   }

   public boolean h$boolean() {
      return FN.k(this);
   }

   public Hd2 R$Hd_2() {
      return (Hd2)FN.u(this);
   }

   public Hd2 z(boolean var1) {
      return (Hd2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Hd2 N() {
      return (Hd2)FN.C(this);
   }

   public Hd2 i(boolean var1) {
      return (Hd2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Hd2 l(boolean var1, boolean var2) {
      return (Hd2)FN.K(this, var1, var2);
   }

   public Hd2 w(int var1) {
      return (Hd2)FN.p(this, var1);
   }

   public Hd2 z(int var1) {
      return (Hd2)FN.O(this, var1);
   }

   public Hd2 K(int var1) {
      return (Hd2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Hd2 M(int var1, boolean var2, boolean var3) {
      return (Hd2)FN.d(this, var1, var2, var3);
   }

   public Hd2 M(int var1, int var2) {
      return (Hd2)FN.m(this, var1, var2);
   }

   public Hd2 u(String var1) {
      return (Hd2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public void o(String var1) {
      I22.f(this, var1);
   }

   @Override
   public void I() {
      I22.p(this);
   }

   public String q$String() {
      return I22.O(this);
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

   public Component o$Component(int var1) {
      return this.z(var1);
   }

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

   public Component R$Component() {
      return this.R$Hd_2();
   }

   @Override
   public Component c(boolean var1) {
      return this.s$Hd_2(var1);
   }

   @Override
   public Component a() {
      return this.m$Hd_2();
   }

   public static void E(String var0) {
      x = var0;
   }

   public static String X() {
      return x;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (X() == null) {
         E("ka6m1");
      }
   }
}





