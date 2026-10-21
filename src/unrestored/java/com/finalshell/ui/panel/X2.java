package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Ax2;
import com.finalshell.core.Az2;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.Eh2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.IB;
import com.finalshell.core.M3;
import com.finalshell.core.O5;
import com.finalshell.core.PY;
import com.finalshell.core.Pp2;
import com.finalshell.core.Q3;
import com.finalshell.core.RF3;
import com.finalshell.core.Sa2;
import com.finalshell.core.Sr2;
import com.finalshell.core.W2_3;
import com.finalshell.core.Yb4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class X2 extends JComboBox implements W2_3, Pp2, RF3, Eh2, Yb4, Sa2 {
   public X2() {
   }

   public X2(Vector var1) {
      super(var1);
   }

   public X2(Vector var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X2(Vector var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   public X2(Object[] var1) {
      super(var1);
   }

   public X2(Object[] var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X2(Object[] var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   public X2(ComboBoxModel var1) {
      super(var1);
   }

   public X2(ComboBoxModel var1, int var2) {
      super(var1);
      this.setSelectedIndex(var2);
   }

   public X2(ComboBoxModel var1, Object var2) {
      super(var1);
      this.setSelectedItem(var2);
   }

   @Override
   public int getSelectedIndex() {
      int var5;
      Object var2 = this.dataModel.getSelectedItem();
      Ky4[] var10000 = M3.X();
      int var3 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var3 < this.dataModel.getSize()) {
            Object var4 = this.dataModel.getElementAt(var3);
            if (var1 == null) {
               var5 = (Ax2.Z(var4, new Object[]{var2})) ? 1 : 0;
               if (var1 != null) {
                  break;
               }

               if (var5 != 0) {
                  return var3;
               }

               var3++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var5 = -1;
         break;
      }

      return var5;
   }

   public void W(int var1) {
      this.M$m().m(var1);
   }

   public boolean v() {
      return this.M$m().m();
   }

   public void P(boolean var1) {
      this.M$m().G(var1);
   }

   public ImageIcon g() {
      return this.M$m().d();
   }

   public void V(ImageIcon var1) {
      this.M$m().k(var1);
   }

   public ImageIcon A$ImageIcon() {
      return this.M$m().L$ImageIcon();
   }

   public void y(ImageIcon var1) {
      this.M$m().h(var1);
   }

   public int w$int() {
      return this.M$m().B$int();
   }

   public void l(int var1) {
      this.M$m().D(var1);
   }

   public boolean E() {
      return this.M$m().k();
   }

   public void B(boolean var1) {
      this.M$m().n(var1);
   }

   public boolean V() {
      return this.M$m().J$boolean();
   }

   public void y(boolean var1) {
      this.M$m().E(var1);
   }

   public Color n$Color() {
      return this.M$m().U();
   }

   public void z(Color var1) {
      this.M$m().l(var1);
   }

   public boolean C() {
      return this.M$m().f();
   }

   public void M(boolean var1) {
      this.M$m().a(var1);
   }

   public int l$int() {
      return this.M$m().N();
   }

   public void a(int var1) {
      this.M$m().P(var1);
   }

   public int t() {
      return this.M$m().J$int();
   }

   public void x$void(int var1) {
      this.M$m().A(var1);
   }

   public boolean n$boolean() {
      return this.M$m().G();
   }

   public void Y$void(boolean var1) {
      this.M$m().W(var1);
   }

   @Override
   public Shape B() {
      return this.M$m().B$Shape();
   }

   public Q3 n$Q() {
      return (Q3)this.getRenderer();
   }

   public M3 M$m() {
      return (M3)this.getUI();
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
      // 00: invokestatic com/finalshell/core/M3.X ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/ui/panel/X2.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/X2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/X2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/X2.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 25: instanceof com/finalshell/core/M3
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/X2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.F Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 71
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/M3
      // 40: invokevirtual com/finalshell/ui/panel/X2.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/M3
      // 50: dup
      // 51: invokespecial com/finalshell/core/M3.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/X2.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/X2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/X2.getUI ()Ljavax/swing/plaf/ComboBoxUI;
      // 67: invokevirtual com/finalshell/ui/panel/X2.setUI (Ljavax/swing/plaf/ComboBoxUI;)V
      // 6a: return
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, O5 var2) {
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
   public MouseAdapter L(HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, O5 var2) {
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
   public KeyAdapter I(Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(Cs2 var1, Sr2 var2) {
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

   public Wd2 p$Wd_2(String var1) {
      return Ac2.I(this, var1);
   }

   @Override
   public Wd2 d(Icon var1, String var2) {
      return Ac2.d(this, var1, var2);
   }

   @Override
   public Wd2 V(String var1, WF var2) {
      return Ac2.B(this, var1, var2);
   }

   @Override
   public Wd2 X(Icon var1, String var2, WF var3) {
      return Ac2.g(this, var1, var2, var3);
   }

   @Override
   public Wd2 y(String var1, WF var2, int var3) {
      return Ac2.l(this, var1, var2, var3);
   }

   @Override
   public Wd2 Y(Icon var1, String var2, WF var3, int var4) {
      return Ac2.R(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 g(JComponent var1) {
      return Ac2.k(this, var1);
   }

   @Override
   public Wd2 I(JComponent var1, int var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 j(JComponent var1, WF var2) {
      return Ac2.R(this, var1, var2);
   }

   @Override
   public Wd2 g(JComponent var1, WF var2, int var3) {
      return Ac2.B(this, var1, var2, var3);
   }

   @Override
   public Wd2 s(String var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 u(Icon var1, String var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 u(String var1, WF var2) {
      return Ac2.q(this, var1, var2);
   }

   @Override
   public Wd2 h(Icon var1, String var2, WF var3) {
      return Ac2.P(this, var1, var2, var3);
   }

   @Override
   public Wd2 f(String var1, WF var2, int var3) {
      return Ac2.r(this, var1, var2, var3);
   }

   @Override
   public Wd2 o(Icon var1, String var2, WF var3, int var4) {
      return Ac2.V(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 B(JComponent var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 p(JComponent var1, int var2) {
      return Ac2.S(this, var1, var2);
   }

   @Override
   public Wd2 n(JComponent var1, WF var2) {
      return Ac2.I(this, var1, var2);
   }

   @Override
   public Wd2 X(JComponent var1, WF var2, int var3) {
      return Ac2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(Wd2 var1) {
      Ac2.s(this, var1);
   }

   @Override
   public void O() {
      Ac2.o(this);
   }

   @Override
   public void q(Wd2[] var1) {
      Ac2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      Ac2.S(this, var1);
   }

   public void p$void(String var1) {
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

   public X2 a$X() {
      return (X2)FN.A(this);
   }

   public X2 t(boolean var1) {
      return (X2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public X2 J() {
      return (X2)FN.u(this);
   }

   public X2 c$X(boolean var1) {
      return (X2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public X2 b() {
      return (X2)FN.C(this);
   }

   public X2 Y$X(boolean var1) {
      return (X2)FN.q(this, var1);
   }

   public boolean l$boolean() {
      return FN.G(this);
   }

   public X2 J(boolean var1, boolean var2) {
      return (X2)FN.K(this, var1, var2);
   }

   public X2 v(int var1) {
      return (X2)FN.p(this, var1);
   }

   public X2 X(int var1) {
      return (X2)FN.O(this, var1);
   }

   public X2 V$X(int var1) {
      return (X2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public X2 X(int var1, boolean var2, boolean var3) {
      return (X2)FN.d(this, var1, var2, var3);
   }

   public X2 p(int var1, int var2) {
      return (X2)FN.m(this, var1, var2);
   }

   public X2 r(String var1) {
      return (X2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   public int M$int() {
      return PY.f(this);
   }

   public X2 u(int var1) {
      return (X2)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public X2 x$X(int var1) {
      return (X2)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public X2 e(int var1) {
      return (X2)PY.N(this, var1);
   }

   public int Q$int() {
      return PY.Z(this);
   }

   public X2 Z(int var1) {
      return (X2)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public X2 R(int var1) {
      return (X2)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public X2 i$X(int var1) {
      return (X2)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public X2 U(int var1, int var2) {
      return (X2)PY.O(this, var1, var2);
   }

   @Override
   public Component N(String var1) {
      return this.r(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.p(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.X(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.V$X(var1);
   }

   @Override
   public Component o(int var1) {
      return this.X(var1);
   }

   public Component i$Component(int var1) {
      return this.v(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.J(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.Y$X(var1);
   }

   public Component Q$Component() {
      return this.b();
   }

   @Override
   public Component u(boolean var1) {
      return this.c$X(var1);
   }

   @Override
   public Component R() {
      return this.J();
   }

   public Component c$Component(boolean var1) {
      return this.t(var1);
   }

   public Component a$Component() {
      return this.a$X();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.U(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.i$X(var1);
   }

   @Override
   public Component p(int var1) {
      return this.R(var1);
   }

   @Override
   public Component D(int var1) {
      return this.Z(var1);
   }

   public Component V$Component(int var1) {
      return this.e(var1);
   }

   public Component x$Component(int var1) {
      return this.x$X(var1);
   }

   @Override
   public Component O(int var1) {
      return this.u(var1);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





