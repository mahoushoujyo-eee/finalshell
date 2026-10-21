package com;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;

public class Xa_2 extends JEditorPane implements RS, Pp_2, com.au_2, Eh_2, com.yb_4 {
   public Xa_2() {
   }

   public Xa_2(URL var1) throws IOException {
      super(var1);
   }

   public Xa_2(String var1, String var2) {
      super(var1, var2);
   }

   public Xa_2(String var1) throws IOException {
      super(var1);
   }

   public void E() {
      this.setText("");
   }

   public com.DU g() {
      return (com.DU)this.getUI();
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
      // 00: invokestatic com/ne_4.m ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/Xa_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/Xa_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/Xa_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/Xa_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/DU
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/Xa_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zm Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 65
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/DU
      // 40: invokevirtual com/Xa_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/DU
      // 50: dup
      // 51: invokespecial com/DU.<init> ()V
      // 54: invokevirtual com/Xa_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/Xa_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/Xa_2.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/Xa_2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/Xa_2.invalidate ()V
      // 6e: return
   }

   @Override
   public com.F5 i(Rk_2 var1) {
      return com.Fs_2.X(this, var1);
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
   public void w() {
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

   public Xa_2 G() {
      return (Xa_2)com.FN.A(this);
   }

   public Xa_2 K(boolean var1) {
      return (Xa_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public Xa_2 K() {
      return (Xa_2)com.FN.u(this);
   }

   public Xa_2 R(boolean var1) {
      return (Xa_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K$boolean() {
      return com.FN.U(this);
   }

   public Xa_2 x() {
      return (Xa_2)com.FN.C(this);
   }

   public Xa_2 m(boolean var1) {
      return (Xa_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public Xa_2 w(boolean var1, boolean var2) {
      return (Xa_2)com.FN.K(this, var1, var2);
   }

   public Xa_2 x(int var1) {
      return (Xa_2)com.FN.p(this, var1);
   }

   public Xa_2 i(int var1) {
      return (Xa_2)com.FN.O(this, var1);
   }

   public Xa_2 U(int var1) {
      return (Xa_2)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public Xa_2 z(int var1, boolean var2, boolean var3) {
      return (Xa_2)com.FN.d(this, var1, var2, var3);
   }

   public Xa_2 d(int var1, int var2) {
      return (Xa_2)com.FN.m(this, var1, var2);
   }

   public Xa_2 T(String var1) {
      return (Xa_2)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.T(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.d(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.z(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.U(var1);
   }

   @Override
   public Component o(int var1) {
      return this.i(var1);
   }

   @Override
   public Component i$Component(int var1) {
      return this.x(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.w(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.m(var1);
   }

   @Override
   public Component Q() {
      return this.x();
   }

   @Override
   public Component u(boolean var1) {
      return this.R(var1);
   }

   @Override
   public Component R() {
      return this.K();
   }

   @Override
   public Component c(boolean var1) {
      return this.K(var1);
   }

   @Override
   public Component a() {
      return this.G();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





