package com.finalshell.ui.panel;

import com.finalshell.core.CX3_2;
import com.finalshell.core.GA;
import com.finalshell.core.I22;
import com.finalshell.core.PY;
import com.finalshell.core.R8;
import com.finalshell.core.Sa2;
import com.finalshell.core.W2_3;
import com.finalshell.core.Y9_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class SZ extends JScrollPane implements W2_3, Sa2, CX3_2 {
   public static String V;
   public static String b;

   public SZ(Component var1) {
      this(var1, true);
   }

   public SZ(Component var1, boolean var2) {
      this(var1, var2, true);
   }

   public SZ(Component var1, boolean var2, boolean var3) {
   super(var1);
      String var10000 = L();
      String var4 = var10000;
      this.u(var2);
      this.A$R8().L(var3);
      SZ var5 = this;
      if (var4 == null) {
         this.i$R8().L(var3);
         if (var3) {
            return;
         }

         var5 = this;
      }

      var5.setCorner(b, null);
   }

   public R8 Y() {
      return new R8(1);
   }

   public R8 W$R8() {
      return new R8(0);
   }

   public R8 i$R8() {
      return (R8)super.getVerticalScrollBar();
   }

   public R8 A$R8() {
      return (R8)super.getHorizontalScrollBar();
   }

   public boolean l() {
      return this.u().k();
   }

   public SZ u(boolean var1) {
      this.u().Y(var1);
      return this;
   }

   public int X() {
      return this.u().R();
   }

   public SZ g(int var1) {
      this.u().Q(var1);
      return this;
   }

   public int B$int() {
      return this.u().C$int();
   }

   public SZ G(int var1) {
      this.u().R(var1);
      return this;
   }

   public Insets e() {
      return this.u().A();
   }

   public SZ K(Insets var1) {
      this.u().a(var1);
      return this;
   }

   public SZ x(int var1, int var2, int var3, int var4) {
      return this.K(new Insets(var1, var2, var3, var4));
   }

   public SZ Q(int var1) {
      return this.x(var1, var1, var1, var1);
   }

   public boolean z() {
      return this.u().D();
   }

   public SZ r(boolean var1) {
      this.u().B(var1);
      return this;
   }

   public boolean C() {
      return this.u().K();
   }

   public SZ L(boolean var1) {
      this.u().S(var1);
      return this;
   }

   public Color W$Color() {
      return this.u().G();
   }

   public SZ L(Color var1) {
      this.u().g(var1);
      return this;
   }

   public Color o() {
      return this.u().z();
   }

   public SZ t(Color var1) {
      this.u().d(var1);
      return this;
   }

   public void O(boolean var1) {
      String var10000 = L();
      R8 var3 = this.A$R8();
      String var2 = var10000;
      R8 var5 = var3;
      if (var2 == null) {
         if (var3 != null) {
            var3.s(var1);
         }

         var5 = this.i$R8();
      }

      R8 var4 = var5;
      if (var2 == null && var4 != null) {
         var4.s(var1);
      }
   }

   public void u(String var1) {
      GA.B(this, var1);
   }

   public Shape B$Shape() {
      return this.u().B();
   }

   public Y9_2 u() {
      return (Y9_2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/SZ.L ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/ui/panel/SZ.getUI ()Ljavax/swing/plaf/ScrollPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/SZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/SZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/SZ.getUI ()Ljavax/swing/plaf/ScrollPaneUI;
      // 25: instanceof com/finalshell/core/Y9_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/SZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zo Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 175
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/Y9_2
      // 40: invokevirtual com/finalshell/ui/panel/SZ.setUI (Ljavax/swing/plaf/ScrollPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/Y9_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/Y9_2.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/SZ.setUI (Ljavax/swing/plaf/ScrollPaneUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/SZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/SZ.getUI ()Ljavax/swing/plaf/ScrollPaneUI;
      // 67: invokevirtual com/finalshell/ui/panel/SZ.setUI (Ljavax/swing/plaf/ScrollPaneUI;)V
      // 6a: return
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public SZ m(int var1) {
      return (SZ)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public SZ I(int var1) {
      return (SZ)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public SZ O$SZ(int var1) {
      return (SZ)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public SZ p$SZ(int var1) {
      return (SZ)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public SZ s(int var1) {
      return (SZ)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public SZ X(int var1) {
      return (SZ)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public SZ v(int var1, int var2) {
      return (SZ)PY.O(this, var1, var2);
   }

   @Override
   public void o(String var1) {
      I22.f(this, var1);
   }

   @Override
   public void I() {
      I22.p(this);
   }

   @Override
   public String q() {
      return I22.O(this);
   }

   @Override
   public JScrollBar createVerticalScrollBar() {
      return this.Y();
   }

   @Override
   public JScrollBar createHorizontalScrollBar() {
      return this.W$R8();
   }

   @Override
   public Component W(int var1, int var2) {
      return this.v(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.X(var1);
   }

   public Component p$Component(int var1) {
      return this.s(var1);
   }

   @Override
   public Component D(int var1) {
      return this.p$SZ(var1);
   }

   @Override
   public Component V(int var1) {
      return this.O$SZ(var1);
   }

   @Override
   public Component x(int var1) {
      return this.I(var1);
   }

   public Component O$Component(int var1) {
      return this.m(var1);
   }

   public static void d(String var0) {
      V = var0;
   }

   public static String L() {
      return V;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (L() != null) {
         d("e5XDRc");
      }

      char[] var10003 = "AvQ(\u00136UD~N9\u001e*H_wC?".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      } else {
         var6 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 58;
               break;
            case 1:
               var23 = 14;
               break;
            case 2:
               var23 = 49;
               break;
            case 3:
               var23 = 90;
               break;
            case 4:
               var23 = 118;
               break;
            case 5:
               var23 = 94;
               break;
            default:
               var23 = 48;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





