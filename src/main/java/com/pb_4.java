package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import javax.swing.JPopupMenu;
import javax.swing.JPopupMenu.Separator;
import javax.swing.border.Border;

public class pb_4 extends JPopupMenu implements com.D7, com.W2, Sa_2, com.cX_3 {
   private static int[] u;
   private static final String a;

   public pb_4() {
   }

   public pb_4(String var1) {
      this.S(var1);
   }

   @Override
   public void addSeparator() {
      this.add(new Separator());
   }

   public void o(int var1) {
      this.add(new Separator(), var1);
   }

   public pb_4 n(Component var1) {
      return this.X(var1);
   }

   public pb_4 X(Component var1) {
      this.z(eL_3.aboveStart);
      this.show(var1, 0, 0);
      return this;
   }

   public pb_4 S(Component var1) {
      this.z(eL_3.aboveMiddle);
      this.show(var1, 0, 0);
      return this;
   }

   public pb_4 k(Component var1) {
      this.z(eL_3.aboveEnd);
      this.show(var1, 0, 0);
      return this;
   }

   public pb_4 O(Component var1) {
      return this.f(var1);
   }

   public pb_4 f(Component var1) {
      this.z(eL_3.belowStart);
      this.show(var1, 0, 0);
      return this;
   }

   public pb_4 r(Component var1) {
      this.z(eL_3.belowMiddle);
      this.show(var1, 0, 0);
      return this;
   }

   public pb_4 l(Component var1) {
      this.z(eL_3.belowEnd);
      this.show(var1, 0, 0);
      return this;
   }

   @Override
   public Insets getMargin() {
      return this.X().J();
   }

   public pb_4 p(Insets var1) {
      this.X().u(var1);
      return this;
   }

   public pb_4 s(int var1, int var2, int var3, int var4) {
      return this.p(new Insets(var1, var2, var3, var4));
   }

   public pb_4 X(int var1) {
      return this.s(var1, var1, var1, var1);
   }

   public HQ P() {
      return (HQ)com.ox_4.y(this);
   }

   public pb_4 B(com.C.L var1) {
      com.ox_4.b(this, var1);
      return this;
   }

   public int E() {
      return this.X().n();
   }

   public pb_4 d(int var1) {
      this.X().q(var1);
      return this;
   }

   public boolean G() {
      return this.X().j();
   }

   public pb_4 i(boolean var1) {
      this.X().h(var1);
      return this;
   }

   public pb_4 z(eL_3 var1) {
      this.X().N(var1);
      return this;
   }

   public com.C.M h() {
      return this.X().M();
   }

   public pb_4 M(com.C.M var1) {
      this.X().A(var1);
      return this;
   }

   @Override
   public void setBorder(Border var1) {
   }

   public Color e() {
      return this.X().S();
   }

   public pb_4 I(Color var1) {
      this.X().B(var1);
      return this;
   }

   public int T() {
      return this.X().r();
   }

   public pb_4 I(int var1) {
      this.X().O(var1);
      return this;
   }

   public int y() {
      return this.X().G();
   }

   public pb_4 r(int var1) {
      this.X().T(var1);
      return this;
   }

   public float e$float() {
      return this.X().I();
   }

   public pb_4 f(float var1) {
      this.X().u(var1);
      return this;
   }

   public int Z() {
      return this.X().t();
   }

   public pb_4 c(int var1) {
      this.X().y(var1);
      return this;
   }

   public int C() {
      return this.X().p();
   }

   public void n(int var1) {
      com.ox_4.E(this, a, var1);
   }

   public float b() {
      return this.X().t();
   }

   public pb_4 V(float var1) {
      this.X().x(var1);
      return this;
   }

   @Override
   public String A() {
      return this.X().A();
   }

   @Override
   public void S(String var1) {
      this.X().S(var1);
   }

   @Override
   public Shape B() {
      return this.X().B();
   }

   public com.FJ X() {
      return (com.FJ)this.getUI();
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
      // 09: invokevirtual com/pb_4.getUI ()Ljavax/swing/plaf/PopupMenuUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/pb_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/pb_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/pb_4.getUI ()Ljavax/swing/plaf/PopupMenuUI;
      // 25: instanceof com/FJ
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/pb_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zy Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 237
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/FJ
      // 40: invokevirtual com/pb_4.setUI (Ljavax/swing/plaf/PopupMenuUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/FJ
      // 50: dup
      // 51: invokespecial com/FJ.<init> ()V
      // 54: invokevirtual com/pb_4.setUI (Ljavax/swing/plaf/PopupMenuUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/pb_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/pb_4.getUI ()Ljavax/swing/plaf/PopupMenuUI;
      // 67: invokevirtual com/pb_4.setUI (Ljavax/swing/plaf/PopupMenuUI;)V
      // 6a: return
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public pb_4 C(int var1) {
      return (pb_4)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public pb_4 f(int var1) {
      return (pb_4)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public pb_4 s(int var1) {
      return (pb_4)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public pb_4 p(int var1) {
      return (pb_4)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public pb_4 F(int var1) {
      return (pb_4)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public pb_4 a(int var1) {
      return (pb_4)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public pb_4 D(int var1, int var2) {
      return (pb_4)PY.O(this, var1, var2);
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
   public String q() {
      return i2_2.O(this);
   }

   @Override
   public Component W(int var1, int var2) {
      return this.D(var1, var2);
   }

   @Override
   public Component d$Component(int var1) {
      return this.a(var1);
   }

   @Override
   public Component p$Component(int var1) {
      return this.F(var1);
   }

   @Override
   public Component D(int var1) {
      return this.p(var1);
   }

   @Override
   public Component V(int var1) {
      return this.s(var1);
   }

   @Override
   public Component x(int var1) {
      return this.f(var1);
   }

   @Override
   public Component O(int var1) {
      return this.C(var1);
   }

   public static void C(int[] var0) {
      u = var0;
   }

   public static int[] g() {
      return u;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (g() == null) {
         C(new int[3]);
      }

      char[] var10003 = ":\u0017:Fm\u000b&5\u0011/Fe\u001c\t-".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 31;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 31;
         var10006 = var0;
      } else {
         var6 = 31;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 31;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 70;
               break;
            case 1:
               var23 = 103;
               break;
            case 2:
               var23 = 87;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 102;
               break;
            default:
               var23 = 120;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





