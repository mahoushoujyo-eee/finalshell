package com.V;

import com.HT;
import com.Pp_2;
import com.Sr_2;
import com.rF_3;
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

public class q extends JSpinner implements Pp_2, rF_3, com.W2, com.yb_4 {
   public q() {
   }

   public q(SpinnerModel var1) {
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

   public void o(int var1) {
      this.t().p(var1);
   }

   public boolean E() {
      return this.t().R();
   }

   public void V(boolean var1) {
      this.t().a(var1);
   }

   public boolean u() {
      return this.t().S();
   }

   public void u(boolean var1) {
      this.t().G(var1);
   }

   @Override
   protected JComponent createEditor(SpinnerModel var1) {
      int[] var2 = t.S();
      boolean var10000 = var1 instanceof SpinnerDateModel;
      if (var2 != null) {
         if (var10000) {
            DateEditor var6 = new DateEditor(this);
            t.M(var6.getTextField(), this);
            return var6;
         }

         var10000 = var1 instanceof SpinnerListModel;
      }

      if (var2 != null) {
         if (var10000) {
            ListEditor var5 = new ListEditor(this);
            t.M(var5.getTextField(), this);
            return var5;
         }

         var10000 = var1 instanceof SpinnerNumberModel;
      }

      if (var10000) {
         NumberEditor var4 = new NumberEditor(this);
         t.M(var4.getTextField(), this);
         return var4;
      } else {
         DefaultEditor var3 = new DefaultEditor(this);
         t.M(var3.getTextField(), this);
         return var3;
      }
   }

   @Override
   public Shape B() {
      return this.t().B();
   }

   public t t() {
      return (t)this.getUI();
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
      // 00: invokestatic com/V/t.S ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/V/q.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/V/q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/V/q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/V/q.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 25: instanceof com/V/t
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/V/q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.H Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 118
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/V/t
      // 40: invokevirtual com/V/q.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/V/t
      // 50: dup
      // 51: invokespecial com/V/t.<init> ()V
      // 54: invokevirtual com/V/q.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/V/q.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/V/q.getUI ()Ljavax/swing/plaf/SpinnerUI;
      // 67: invokevirtual com/V/q.setUI (Ljavax/swing/plaf/SpinnerUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/V/q.revalidate ()V
      // 6e: return
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

   public q k() {
      return (q)com.FN.A(this);
   }

   public q B(boolean var1) {
      return (q)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public q A() {
      return (q)com.FN.u(this);
   }

   public q d(boolean var1) {
      return (q)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public q T() {
      return (q)com.FN.C(this);
   }

   public q j(boolean var1) {
      return (q)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public q j(boolean var1, boolean var2) {
      return (q)com.FN.K(this, var1, var2);
   }

   public q s(int var1) {
      return (q)com.FN.p(this, var1);
   }

   public q l(int var1) {
      return (q)com.FN.O(this, var1);
   }

   public q i(int var1) {
      return (q)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public q G(int var1, boolean var2, boolean var3) {
      return (q)com.FN.d(this, var1, var2, var3);
   }

   public q x(int var1, int var2) {
      return (q)com.FN.m(this, var1, var2);
   }

   public q H(String var1) {
      return (q)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
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
      return this.i(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.l(var1);
   }

   @Override
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

   @Override
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

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





