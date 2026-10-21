package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class wA_3 extends JMenu implements com.au_2, com.yb_4 {
   public wA_3() {
   }

   public wA_3(Icon var1) {
      this.setIcon(var1);
   }

   public wA_3(String var1) {
      super(var1);
   }

   public wA_3(Action var1) {
      super(var1);
   }

   public wA_3(String var1, Icon var2) {
      super(var1);
      this.setIcon(var2);
   }

   @Override
   protected Point getPopupMenuOrigin() {
      int[] var10000 = pb_4.g();
      Point var2 = super.getPopupMenuOrigin();
      int[] var1 = var10000;
      if (var1 != null) {
         if (this.getParent() instanceof JPopupMenu) {
            return var2;
         }

         var2.x = var2.x + com.c.c(121576595834410543L).getInt(null);
      }

      var2.y = var2.y + com.c.c(371410735235064228L).getInt(null);
      return var2;
   }

   @Override
   public void setPopupMenuVisible(boolean var1) {
      super.setPopupMenuVisible(var1);
   }

   public int z() {
      return this.I().F();
   }

   public void T(int var1) {
      this.I().C(var1);
   }

   public int J() {
      return this.I().t();
   }

   public void r(int var1) {
      this.I().P(var1);
   }

   @Override
   public Insets getMargin() {
      return this.I().o();
   }

   @Override
   public void setMargin(Insets var1) {
      this.I().S(var1);
   }

   public int r() {
      return this.I().q();
   }

   public void p(int var1) {
      this.I().f(var1);
   }

   public Color T() {
      return this.I().P();
   }

   public void i(Color var1) {
      this.I().E(var1);
   }

   public Color W() {
      return this.I().w();
   }

   public void x(Color var1) {
      this.I().l(var1);
   }

   public Color G() {
      return this.I().Q();
   }

   public void q(Color var1) {
      this.I().W(var1);
   }

   public int W$int() {
      return this.I().L();
   }

   public void F(int var1) {
      this.I().v(var1);
   }

   public boolean S() {
      return this.I().T();
   }

   public void h(boolean var1) {
      this.I().K(var1);
   }

   public int y() {
      return this.I().f();
   }

   public void t(int var1) {
      this.I().a(var1);
   }

   public com.og_4 u() {
      return this.I().P();
   }

   public void o(com.og_4 var1) {
      this.I().z(var1);
   }

   public com.oC_3 I() {
      return (com.oC_3)this.getUI();
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
      // 00: invokestatic com/pb_4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/wA_3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/wA_3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/oC_3
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.O Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 175
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/oC_3
      // 40: invokevirtual com/wA_3.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/oC_3
      // 50: dup
      // 51: invokespecial com/oC_3.<init> ()V
      // 54: invokevirtual com/wA_3.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/wA_3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/wA_3.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/wA_3.getPopupMenu ()Ljavax/swing/JPopupMenu;
      // 6e: aload 1
      // 6f: ifnull 87
      // 72: ifnull 8a
      // 75: goto 7c
      // 78: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 0
      // 7d: invokevirtual com/wA_3.getPopupMenu ()Ljavax/swing/JPopupMenu;
      // 80: goto 87
      // 83: invokestatic com/wA_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: invokevirtual javax/swing/JPopupMenu.updateUI ()V
      // 8a: return
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

   public wA_3 O() {
      return (wA_3)com.FN.A(this);
   }

   public wA_3 P(boolean var1) {
      return (wA_3)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public wA_3 V() {
      return (wA_3)com.FN.u(this);
   }

   public wA_3 B(boolean var1) {
      return (wA_3)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public wA_3 f() {
      return (wA_3)com.FN.C(this);
   }

   public wA_3 i(boolean var1) {
      return (wA_3)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public wA_3 D(boolean var1, boolean var2) {
      return (wA_3)com.FN.K(this, var1, var2);
   }

   public wA_3 v(int var1) {
      return (wA_3)com.FN.p(this, var1);
   }

   public wA_3 A(int var1) {
      return (wA_3)com.FN.O(this, var1);
   }

   public wA_3 Y(int var1) {
      return (wA_3)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public wA_3 T(int var1, boolean var2, boolean var3) {
      return (wA_3)com.FN.d(this, var1, var2, var3);
   }

   public wA_3 A(int var1, int var2) {
      return (wA_3)com.FN.m(this, var1, var2);
   }

   public wA_3 s(String var1) {
      return (wA_3)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.s(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.A(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.T(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.Y(var1);
   }

   @Override
   public Component o(int var1) {
      return this.A(var1);
   }

   @Override
   public Component i(int var1) {
      return this.v(var1);
   }

   @Override
   public Component D$Component(boolean var1, boolean var2) {
      return this.D(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.i(var1);
   }

   @Override
   public Component Q() {
      return this.f();
   }

   @Override
   public Component u(boolean var1) {
      return this.B(var1);
   }

   @Override
   public Component R() {
      return this.V();
   }

   @Override
   public Component c(boolean var1) {
      return this.P(var1);
   }

   @Override
   public Component a() {
      return this.O();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





