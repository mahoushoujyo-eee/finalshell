package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Az2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.O5;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sr2;
import com.finalshell.core.T4_2;
import com.finalshell.core.W2_3;
import com.finalshell.core.Yb4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.Component;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JSpinner.ListEditor;
import javax.swing.JSpinner.NumberEditor;

public class Q2 extends JSpinner implements Pp2, RF3, W2_3, Yb4 {
   public Q2() {
   }

   public Q2(SpinnerModel var1) {
      super(var1);
   }

   public int o() {
      return this.t().v();
   }

   public void t(int var1) {
      this.t().w(var1);
   }

   public int s() {
      return this.t().o();
   }

   public void o$void(int var1) {
      this.t().p(var1);
   }

   public boolean E() {
      return this.t().R();
   }

   public void V(boolean var1) {
      this.t().a(var1);
   }

   public boolean u() {
      return this.t().S$boolean();
   }

   public void u$void(boolean var1) {
      this.t().G(var1);
   }

   @Override
   public JComponent createEditor(SpinnerModel var1) {
      int[] var2 = T4_2.S$arrint();
      boolean var10000 = var1 instanceof SpinnerDateModel;
      if (var2 != null) {
         if (var10000) {
            DateEditor var6 = new DateEditor(this);
            T4_2.M(var6.getTextField(), this);
            return var6;
         }

         var10000 = var1 instanceof SpinnerListModel;
      }

      if (var2 != null) {
         if (var10000) {
            ListEditor var5 = new ListEditor(this);
            T4_2.M(var5.getTextField(), this);
            return var5;
         }

         var10000 = var1 instanceof SpinnerNumberModel;
      }

      if (var10000) {
         NumberEditor var4 = new NumberEditor(this);
         T4_2.M(var4.getTextField(), this);
         return var4;
      } else {
         DefaultEditor var3 = new DefaultEditor(this);
         T4_2.M(var3.getTextField(), this);
         return var3;
      }
   }

   @Override
   public Shape B() {
      return this.t().B();
   }

   public T4_2 t() {
      return (T4_2)this.getUI();
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
      // 00: invokestatic com/finalshell/core/T4_2.S$arrint ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/ui/panel/Q2.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/Q2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/Q2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/Q2.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 25: instanceof com/finalshell/core/T4_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/Q2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.H Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 119
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/T4_2
      // 40: invokevirtual com/finalshell/ui/panel/Q2.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/T4_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/T4_2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/Q2.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/Q2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/Q2.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 67: invokevirtual com/finalshell/ui/panel/Q2.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/ui/panel/Q2.revalidate ()V
      // 6e: return
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

   @Override
   public Wd2 p(String var1) {
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

   public Q2 k() {
      return (Q2)FN.A(this);
   }

   public Q2 B(boolean var1) {
      return (Q2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Q2 A() {
      return (Q2)FN.u(this);
   }

   public Q2 d(boolean var1) {
      return (Q2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Q2 T() {
      return (Q2)FN.C(this);
   }

   public Q2 j(boolean var1) {
      return (Q2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Q2 j(boolean var1, boolean var2) {
      return (Q2)FN.K(this, var1, var2);
   }

   public Q2 s(int var1) {
      return (Q2)FN.p(this, var1);
   }

   public Q2 l(int var1) {
      return (Q2)FN.O(this, var1);
   }

   public Q2 i$q(int var1) {
      return (Q2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Q2 G(int var1, boolean var2, boolean var3) {
      return (Q2)FN.d(this, var1, var2, var3);
   }

   public Q2 x(int var1, int var2) {
      return (Q2)FN.m(this, var1, var2);
   }

   public Q2 H(String var1) {
      return (Q2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public Component N(String var1) {
      return this.H(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.x(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.G(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.i$q(var1);
   }

   public Component o$Component(int var1) {
      return this.l(var1);
   }

   public Component i$Component(int var1) {
      return this.s(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.j(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.j(var1);
   }

   @Override
   public Component Q() {
      return this.T();
   }

   public Component u$Component(boolean var1) {
      return this.d(var1);
   }

   @Override
   public Component R() {
      return this.A();
   }

   @Override
   public Component c(boolean var1) {
      return this.B(var1);
   }

   @Override
   public Component a() {
      return this.k();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





