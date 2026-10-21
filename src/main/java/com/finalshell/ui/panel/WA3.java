package com.finalshell.ui.panel;

import com.finalshell.core.Au2;
import com.finalshell.core.FN;
import com.finalshell.core.I22;
import com.finalshell.core.Ld4;
import com.finalshell.core.OC3;
import com.finalshell.core.Og4;
import com.finalshell.core.Yb4;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class WA3 extends JMenu implements Au2, Yb4 {
   public WA3() {
   }

   public WA3(Icon var1) {
      this.setIcon(var1);
   }

   public WA3(String var1) {
      super(var1);
   }

   public WA3(Action var1) {
      super(var1);
   }

   public WA3(String var1, Icon var2) {
      super(var1);
      this.setIcon(var2);
   }

   @Override
   protected Point getPopupMenuOrigin() {
      int[] var10000 = Pb4.g();
      Point var2 = super.getPopupMenuOrigin();
      int[] var1 = var10000;
      if (var1 != null) {
         if (this.getParent() instanceof JPopupMenu) {
            return var2;
         }

         var2.x = var2.x + Registry.lookupField(121576595834410543L).getInt(null);
      }

      var2.y = var2.y + Registry.lookupField(371410735235064228L).getInt(null);
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
      return this.I().P$Color();
   }

   public void i(Color var1) {
      this.I().E(var1);
   }

   public Color W$Color() {
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

   public Og4 u() {
      return this.I().P$og_4();
   }

   public void o(Og4 var1) {
      this.I().z(var1);
   }

   public OC3 I() {
      return (OC3)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Pb4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/WA3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/WA3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/OC3
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.O Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 177
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/OC3
      // 40: invokevirtual com/finalshell/ui/panel/WA3.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/OC3
      // 50: dup
      // 51: invokespecial com/finalshell/core/OC3.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/WA3.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/WA3.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/ui/panel/WA3.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/ui/panel/WA3.getPopupMenu ()Ljavax/swing/JPopupMenu;
      // 6e: aload 1
      // 6f: ifnull 87
      // 72: ifnull 8a
      // 75: goto 7c
      // 78: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 0
      // 7d: invokevirtual com/finalshell/ui/panel/WA3.getPopupMenu ()Ljavax/swing/JPopupMenu;
      // 80: goto 87
      // 83: invokestatic com/finalshell/ui/panel/WA3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: invokevirtual javax/swing/JPopupMenu.updateUI ()V
      // 8a: return
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

   @Override
   public void M() {
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

   public WA3 O() {
      return (WA3)FN.A(this);
   }

   public WA3 P(boolean var1) {
      return (WA3)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public WA3 V() {
      return (WA3)FN.u(this);
   }

   public WA3 B(boolean var1) {
      return (WA3)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public WA3 f() {
      return (WA3)FN.C(this);
   }

   public WA3 i(boolean var1) {
      return (WA3)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public WA3 D$wA_3(boolean var1, boolean var2) {
      return (WA3)FN.K(this, var1, var2);
   }

   public WA3 v(int var1) {
      return (WA3)FN.p(this, var1);
   }

   public WA3 A(int var1) {
      return (WA3)FN.O(this, var1);
   }

   public WA3 Y(int var1) {
      return (WA3)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public WA3 T(int var1, boolean var2, boolean var3) {
      return (WA3)FN.d(this, var1, var2, var3);
   }

   public WA3 A(int var1, int var2) {
      return (WA3)FN.m(this, var1, var2);
   }

   public WA3 s(String var1) {
      return (WA3)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
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

   public Component D$Component(boolean var1, boolean var2) {
      return this.D$wA_3(var1, var2);
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

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





