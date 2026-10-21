package com.finalshell.ui.panel;

import com.finalshell.core.Ac2;
import com.finalshell.core.Az2;
import com.finalshell.core.BI;
import com.finalshell.core.CX3_2;
import com.finalshell.core.D7;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.O5;
import com.finalshell.core.Og4;
import com.finalshell.core.Ox4;
import com.finalshell.core.PY;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sa2;
import com.finalshell.core.Sr2;
import com.finalshell.core.W2_3;
import com.finalshell.core.WR_2;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Ky4 extends JPanel implements D7, W2_3, WR_2, Pp2, RF3, Sa2, CX3_2 {
   public static String[] L;
   public static String[] ab;
   public static String[] bb;

   public Ky4() {
      super(new BorderLayout());
   }

   public Ky4(boolean var1) {
      Ky4[] var10000 = BI.u();
      super(new BorderLayout());
      Ky4[] var2 = var10000;
      boolean var10001 = var1;
      if (var2 == null) {
         var10001 = !var1;
      }

      this.T(var10001);
   }

   public Ky4(boolean var1, LayoutManager var2) {
      Ky4[] var10000 = BI.u();
      super(var2);
      Ky4[] var3 = var10000;
      boolean var10001 = var1;
      if (var3 == null) {
         var10001 = !var1;
      }

      this.T(var10001);
   }

   public Ky4(boolean var1, Component var2) {
      Ky4[] var10000 = BI.u();
      super(new BorderLayout());
      Ky4[] var3 = var10000;
      boolean var10001 = var1;
      if (var3 == null) {
         var10001 = !var1;
      }

      this.T(var10001);
      this.add(var2, a(-27809, 6667));
   }

   public Ky4(Component var1) {
      super(new BorderLayout());
      this.add(var1, a(-27810, 31514));
   }

   public Ky4(Og4 var1) {
      super(new BorderLayout());
      this.L(var1);
   }

   public Ky4(LayoutManager var1, Og4 var2) {
      super(var1);
      this.L(var2);
   }

   public Ky4(Og4 var1, Component var2) {
      super(new BorderLayout());
      this.L(var1);
      this.add(var2, a(-27810, 31514));
   }

   public Ky4(LayoutManager var1, Og4 var2, Component[] var3) {
      super(var1);
      this.L(var2);
      this.S(var3);
   }

   public Ky4(LayoutManager var1) {
      super(var1);
   }

   public Ky4(LayoutManager var1, boolean var2) {
      super(var1, var2);
   }

   public Ky4(LayoutManager var1, Component[] var2) {
      super(var1);
      this.S(var2);
   }

   public Ky4(String var1) {
      super(new BorderLayout());
      this.S(var1);
   }

   public Ky4(String var1, LayoutManager var2) {
      super(var2);
      this.S(var1);
   }

   public Ky4(String var1, Component var2) {
      super(new BorderLayout());
      this.S(var1);
      this.add(var2, a(-27810, 31514));
   }

   public boolean o(Component var1) {
      Ky4[] var2 = BI.u();
      Component var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      return var10000.getParent() == this;
   }

   public Ky4 g(List var1, int var2) {
      Ky4[] var3 = BI.u();
      if (var1 != null) {
         int var4 = 0;
         int var5 = 0;

         while (var5 < var1.size()) {
            label25: {
               label24: {
                  Component var6 = (Component)var1.get(var5);
                  if (var3 == null) {
                     if (var6 == null) {
                        break label24;
                     }

                     this.add(var6, var2 + var5 - var4);
                  }

                  if (var3 == null) {
                     break label25;
                  }
               }

               var4++;
            }

            var5++;
            if (var3 != null) {
               break;
            }
         }
      }

      return this;
   }

   public Ky4 N(List var1, String var2) {
      Ky4[] var3 = BI.u();
      List var10000 = var1;
      if (var3 == null) {
         if (var1 == null) {
            return this;
         }

         var10000 = var1;
      }

      for (Component var5 : var10000) {
         if (var5 != null) {
            this.add(var5, var2);
         }

         if (var3 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 l(List var1) {
      Ky4[] var2 = BI.u();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return this;
         }

         var10000 = var1;
      }

      for (Component var4 : var10000) {
         if (var2 == null && var4 != null) {
            this.add(var4);
         }

         if (var2 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 f(int var1, Component[] var2) {
      Ky4[] var3 = BI.u();
      Component[] var10000 = var2;
      if (var3 == null) {
         if (var2 == null) {
            return this;
         }

         var10000 = var2;
      }

      int var7 = var10000.length;
      if (var3 == null) {
         if (var7 <= 0) {
            return this;
         }

         var7 = 0;
      }

      int var4 = var7;
      int var5 = 0;

      while (var5 < var2.length) {
         label30: {
            label29: {
               Component var6 = var2[var5];
               if (var3 == null) {
                  if (var6 == null) {
                     break label29;
                  }

                  this.add(var6, var1 + var5 - var4);
               }

               if (var3 == null) {
                  break label30;
               }
            }

            var4++;
         }

         var5++;
         if (var3 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 j(String var1, Component[] var2) {
      Ky4[] var3 = BI.u();
      Component[] var10000 = var2;
      if (var3 == null) {
         if (var2 == null) {
            return this;
         }

         var10000 = var2;
      }

      if (var3 == null) {
         if (var10000.length <= 0) {
            return this;
         }

         var10000 = var2;
      }

      Component[] var4 = var10000;
      int var5 = var4.length;
      int var6 = 0;

      while (var6 < var5) {
         Component var7 = var4[var6];
         if (var3 == null) {
            if (var7 != null) {
               this.add(var7, var1);
            }

            var6++;
         }

         if (var3 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 S(Component[] var1) {
      Ky4[] var2 = BI.u();
      Component[] var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return this;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000.length <= 0) {
            return this;
         }

         var10000 = var1;
      }

      Component[] var3 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         if (var2 == null) {
            if (var6 != null) {
               this.add(var6);
            }

            var5++;
         }

         if (var2 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 N(List var1) {
      Ky4[] var2 = BI.u();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return this;
         }

         var10000 = var1;
      }

      for (Component var4 : var10000) {
         if (var4 != null) {
            this.remove(var4);
         }

         if (var2 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 H(Component[] var1) {
      Ky4[] var2 = BI.u();
      Component[] var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return this;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000.length <= 0) {
            return this;
         }

         var10000 = var1;
      }

      Component[] var3 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         if (var2 == null) {
            if (var6 != null) {
               this.remove(var6);
            }

            var5++;
         }

         if (var2 != null) {
            break;
         }
      }

      return this;
   }

   public Ky4 P(Class var1) {
      Ky4[] var2 = BI.u();
      if (var1 != null) {
         int var3 = 0;

         while (var3 < this.getComponentCount()) {
            if (var2 != null) {
               return this;
            }

            Component var4 = this.getComponent(var3);
            if (var2 == null) {
               if (var1.isAssignableFrom(var4.getClass())) {
                  this.remove(var4);
               }

               var3++;
            }

            if (var2 != null) {
               break;
            }
         }
      }

      return this;
   }

   public Component K() {
      Ky4[] var1 = BI.u();
      Object var10000 = this;
      if (var1 == null) {
         if (this.getComponentCount() <= 0) {
            return null;
         }

         var10000 = this.getComponent(0);
      }

      return (Component)var10000;
   }

   public Component q$Component() {
      Ky4[] var1 = BI.u();
      Object var10000 = this;
      if (var1 == null) {
         if (this.getComponentCount() <= 0) {
            return null;
         }

         var10000 = this.getComponent(this.getComponentCount() - 1);
      }

      return (Component)var10000;
   }

   public boolean F$boolean() {
      return this.J().R();
   }

   public Ky4 T(boolean var1) {
      this.J().h(var1);
      return this;
   }

   public boolean m$boolean() {
      return this.J().f();
   }

   public Ky4 i(boolean var1) {
      this.J().g(var1);
      return this;
   }

   public Insets O$Insets() {
      return this.J().j();
   }

   public void b(Insets var1) {
      this.J().t(var1);
   }

   public Ky4 N(int var1, int var2, int var3, int var4) {
      this.b(new Insets(var1, var2, var3, var4));
      return this;
   }

   public Ky4 C(int var1) {
      return this.N(var1, var1, var1, var1);
   }

   public boolean c() {
      return this.J().s();
   }

   @Override
   public void D(boolean var1) {
      this.J().D(var1);
   }

   public boolean g$boolean() {
      return this.J().v();
   }

   @Override
   public void C(boolean var1) {
      this.J().C(var1);
   }

   public boolean S() {
      return this.J().M();
   }

   @Override
   public void p(boolean var1) {
      this.J().p(var1);
   }

   public boolean i$boolean() {
      return this.J().k();
   }

   @Override
   public void w(boolean var1) {
      this.J().w(var1);
   }

   @Override
   public void I(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.J().I(var1, var2, var3, var4);
   }

   public boolean s() {
      return this.J().G();
   }

   @Override
   public void X(boolean var1) {
      this.J().X(var1);
   }

   public boolean r() {
      return this.J().D();
   }

   @Override
   public void H(boolean var1) {
      this.J().H(var1);
   }

   public boolean b$boolean() {
      return this.J().K();
   }

   @Override
   public void B(boolean var1) {
      this.J().B(var1);
   }

   public boolean j() {
      return this.J().m();
   }

   @Override
   public void m(boolean var1) {
      this.J().m(var1);
   }

   @Override
   public void X(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.J().X(var1, var2, var3, var4);
   }

   public int q$int() {
      return this.J().d();
   }

   public Ky4 Y(int var1) {
      this.J().p(var1);
      return this;
   }

   public int E() {
      return this.J().B$int();
   }

   public Ky4 D$ky_4(int var1) {
      this.J().P(var1);
      return this;
   }

   public float e() {
      return this.J().V();
   }

   public Ky4 L(float var1) {
      this.J().a(var1);
      return this;
   }

   public Stroke b$Stroke() {
      return this.J().A$Stroke();
   }

   public Ky4 l(Stroke var1) {
      this.J().a(var1);
      return this;
   }

   public Color w() {
      return this.J().A$Color();
   }

   public Ky4 E(Color var1) {
      this.J().C(var1);
      return this;
   }

   public Color g$Color() {
      return this.J().O();
   }

   public Ky4 k(Color var1) {
      this.J().q(var1);
      return this;
   }

   public boolean h() {
      return this.J().r();
   }

   public Ky4 s(boolean var1) {
      this.J().P(var1);
      return this;
   }

   public boolean x() {
      return this.J().n();
   }

   public Ky4 u(boolean var1) {
      this.J().z(var1);
      return this;
   }

   public Og4 l() {
      return Ox4.y(this);
   }

   public Ky4 L(Og4 var1) {
      Ox4.b(this, var1);
      return this;
   }

   public String A$String() {
      return this.J().A$String();
   }

   @Override
   public void S(String var1) {
      this.J().S(var1);
   }

   @Override
   public Shape B() {
      return this.J().B$Shape();
   }

   public BI J() {
      return (BI)this.getUI();
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
      // 00: invokestatic com/finalshell/core/BI.u ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/ui/panel/Ky4.getUI ()Ljavax/swing/plaf/PanelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/Ky4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/Ky4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/Ky4.getUI ()Ljavax/swing/plaf/PanelUI;
      // 25: instanceof com/finalshell/core/BI
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/Ky4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.f Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 137
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/BI
      // 40: invokevirtual com/finalshell/ui/panel/Ky4.setUI (Ljavax/swing/plaf/PanelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/BI
      // 50: dup
      // 51: invokespecial com/finalshell/core/BI.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/Ky4.setUI (Ljavax/swing/plaf/PanelUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/Ky4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/Ky4.getUI ()Ljavax/swing/plaf/PanelUI;
      // 67: invokevirtual com/finalshell/ui/panel/Ky4.setUI (Ljavax/swing/plaf/PanelUI;)V
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

   public void O$void() {
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

   @Override
   public int M() {
      return PY.f(this);
   }

   public Ky4 t(int var1) {
      return (Ky4)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public Ky4 B(int var1) {
      return (Ky4)PY.j(this, var1);
   }

   public int A$int() {
      return PY.S(this);
   }

   public Ky4 H(int var1) {
      return (Ky4)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public Ky4 r(int var1) {
      return (Ky4)PY.w(this, var1);
   }

   public int i$int() {
      return PY.J(this);
   }

   public Ky4 Z(int var1) {
      return (Ky4)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public Ky4 P(int var1) {
      return (Ky4)PY.y(this, var1);
   }

   public Ky4 I(int var1, int var2) {
      return (Ky4)PY.O(this, var1, var2);
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
   public Component W(int var1, int var2) {
      return this.I(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.P(var1);
   }

   @Override
   public Component p(int var1) {
      return this.Z(var1);
   }

   public Component D$Component(int var1) {
      return this.r(var1);
   }

   @Override
   public Component V(int var1) {
      return this.H(var1);
   }

   @Override
   public Component x(int var1) {
      return this.B(var1);
   }

   @Override
   public Component O(int var1) {
      return this.t(var1);
   }

   public static void K(String[] var0) {
      L = var0;
   }

   public static String[] F$arrString() {
      return L;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -27809) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 237;
               break;
            case 1:
               var10000 = 29;
               break;
            case 2:
               var10000 = 40;
               break;
            case 3:
               var10000 = 219;
               break;
            case 4:
               var10000 = 96;
               break;
            case 5:
               var10000 = 158;
               break;
            case 6:
               var10000 = 28;
               break;
            case 7:
               var10000 = 43;
               break;
            case 8:
               var10000 = 144;
               break;
            case 9:
               var10000 = 92;
               break;
            case 10:
               var10000 = 168;
               break;
            case 11:
               var10000 = 76;
               break;
            case 12:
               var10000 = 85;
               break;
            case 13:
               var10000 = 227;
               break;
            case 14:
               var10000 = 54;
               break;
            case 15:
               var10000 = 148;
               break;
            case 16:
               var10000 = 113;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 12;
               break;
            case 19:
               var10000 = 142;
               break;
            case 20:
               var10000 = 170;
               break;
            case 21:
               var10000 = 249;
               break;
            case 22:
               var10000 = 23;
               break;
            case 23:
               var10000 = 35;
               break;
            case 24:
               var10000 = 179;
               break;
            case 25:
               var10000 = 171;
               break;
            case 26:
               var10000 = 86;
               break;
            case 27:
               var10000 = 83;
               break;
            case 28:
               var10000 = 78;
               break;
            case 29:
               var10000 = 8;
               break;
            case 30:
               var10000 = 67;
               break;
            case 31:
               var10000 = 147;
               break;
            case 32:
               var10000 = 44;
               break;
            case 33:
               var10000 = 139;
               break;
            case 34:
               var10000 = 224;
               break;
            case 35:
               var10000 = 31;
               break;
            case 36:
               var10000 = 152;
               break;
            case 37:
               var10000 = 110;
               break;
            case 38:
               var10000 = 188;
               break;
            case 39:
               var10000 = 225;
               break;
            case 40:
               var10000 = 178;
               break;
            case 41:
               var10000 = 134;
               break;
            case 42:
               var10000 = 174;
               break;
            case 43:
               var10000 = 116;
               break;
            case 44:
               var10000 = 156;
               break;
            case 45:
               var10000 = 215;
               break;
            case 46:
               var10000 = 70;
               break;
            case 47:
               var10000 = 183;
               break;
            case 48:
               var10000 = 74;
               break;
            case 49:
               var10000 = 239;
               break;
            case 50:
               var10000 = 63;
               break;
            case 51:
               var10000 = 45;
               break;
            case 52:
               var10000 = 119;
               break;
            case 53:
               var10000 = 18;
               break;
            case 54:
               var10000 = 233;
               break;
            case 55:
               var10000 = 32;
               break;
            case 56:
               var10000 = 213;
               break;
            case 57:
               var10000 = 87;
               break;
            case 58:
               var10000 = 229;
               break;
            case 59:
               var10000 = 137;
               break;
            case 60:
               var10000 = 132;
               break;
            case 61:
               var10000 = 157;
               break;
            case 62:
               var10000 = 20;
               break;
            case 63:
               var10000 = 109;
               break;
            case 64:
               var10000 = 108;
               break;
            case 65:
               var10000 = 59;
               break;
            case 66:
               var10000 = 55;
               break;
            case 67:
               var10000 = 185;
               break;
            case 68:
               var10000 = 228;
               break;
            case 69:
               var10000 = 236;
               break;
            case 70:
               var10000 = 82;
               break;
            case 71:
               var10000 = 38;
               break;
            case 72:
               var10000 = 220;
               break;
            case 73:
               var10000 = 231;
               break;
            case 74:
               var10000 = 4;
               break;
            case 75:
               var10000 = 97;
               break;
            case 76:
               var10000 = 210;
               break;
            case 77:
               var10000 = 135;
               break;
            case 78:
               var10000 = 202;
               break;
            case 79:
               var10000 = 127;
               break;
            case 80:
               var10000 = 65;
               break;
            case 81:
               var10000 = 90;
               break;
            case 82:
               var10000 = 222;
               break;
            case 83:
               var10000 = 191;
               break;
            case 84:
               var10000 = 118;
               break;
            case 85:
               var10000 = 49;
               break;
            case 86:
               var10000 = 241;
               break;
            case 87:
               var10000 = 190;
               break;
            case 88:
               var10000 = 79;
               break;
            case 89:
               var10000 = 33;
               break;
            case 90:
               var10000 = 130;
               break;
            case 91:
               var10000 = 47;
               break;
            case 92:
               var10000 = 242;
               break;
            case 93:
               var10000 = 126;
               break;
            case 94:
               var10000 = 164;
               break;
            case 95:
               var10000 = 46;
               break;
            case 96:
               var10000 = 206;
               break;
            case 97:
               var10000 = 162;
               break;
            case 98:
               var10000 = 128;
               break;
            case 99:
               var10000 = 149;
               break;
            case 100:
               var10000 = 68;
               break;
            case 101:
               var10000 = 56;
               break;
            case 102:
               var10000 = 189;
               break;
            case 103:
               var10000 = 52;
               break;
            case 104:
               var10000 = 51;
               break;
            case 105:
               var10000 = 25;
               break;
            case 106:
               var10000 = 180;
               break;
            case 107:
               var10000 = 172;
               break;
            case 108:
               var10000 = 21;
               break;
            case 109:
               var10000 = 192;
               break;
            case 110:
               var10000 = 98;
               break;
            case 111:
               var10000 = 184;
               break;
            case 112:
               var10000 = 167;
               break;
            case 113:
               var10000 = 19;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 0;
               break;
            case 116:
               var10000 = 61;
               break;
            case 117:
               var10000 = 182;
               break;
            case 118:
               var10000 = 71;
               break;
            case 119:
               var10000 = 166;
               break;
            case 120:
               var10000 = 111;
               break;
            case 121:
               var10000 = 115;
               break;
            case 122:
               var10000 = 37;
               break;
            case 123:
               var10000 = 53;
               break;
            case 124:
               var10000 = 11;
               break;
            case 125:
               var10000 = 69;
               break;
            case 126:
               var10000 = 235;
               break;
            case 127:
               var10000 = 22;
               break;
            case 128:
               var10000 = 238;
               break;
            case 129:
               var10000 = 27;
               break;
            case 130:
               var10000 = 103;
               break;
            case 131:
               var10000 = 154;
               break;
            case 132:
               var10000 = 36;
               break;
            case 133:
               var10000 = 221;
               break;
            case 134:
               var10000 = 50;
               break;
            case 135:
               var10000 = 141;
               break;
            case 136:
               var10000 = 26;
               break;
            case 137:
               var10000 = 247;
               break;
            case 138:
               var10000 = 223;
               break;
            case 139:
               var10000 = 2;
               break;
            case 140:
               var10000 = 199;
               break;
            case 141:
               var10000 = 187;
               break;
            case 142:
               var10000 = 232;
               break;
            case 143:
               var10000 = 81;
               break;
            case 144:
               var10000 = 197;
               break;
            case 145:
               var10000 = 101;
               break;
            case 146:
               var10000 = 203;
               break;
            case 147:
               var10000 = 99;
               break;
            case 148:
               var10000 = 104;
               break;
            case 149:
               var10000 = 136;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 252;
               break;
            case 152:
               var10000 = 95;
               break;
            case 153:
               var10000 = 161;
               break;
            case 154:
               var10000 = 200;
               break;
            case 155:
               var10000 = 75;
               break;
            case 156:
               var10000 = 173;
               break;
            case 157:
               var10000 = 122;
               break;
            case 158:
               var10000 = 88;
               break;
            case 159:
               var10000 = 10;
               break;
            case 160:
               var10000 = 14;
               break;
            case 161:
               var10000 = 254;
               break;
            case 162:
               var10000 = 107;
               break;
            case 163:
               var10000 = 216;
               break;
            case 164:
               var10000 = 5;
               break;
            case 165:
               var10000 = 181;
               break;
            case 166:
               var10000 = 176;
               break;
            case 167:
               var10000 = 160;
               break;
            case 168:
               var10000 = 234;
               break;
            case 169:
               var10000 = 196;
               break;
            case 170:
               var10000 = 72;
               break;
            case 171:
               var10000 = 41;
               break;
            case 172:
               var10000 = 153;
               break;
            case 173:
               var10000 = 94;
               break;
            case 174:
               var10000 = 163;
               break;
            case 175:
               var10000 = 209;
               break;
            case 176:
               var10000 = 6;
               break;
            case 177:
               var10000 = 212;
               break;
            case 178:
               var10000 = 64;
               break;
            case 179:
               var10000 = 9;
               break;
            case 180:
               var10000 = 186;
               break;
            case 181:
               var10000 = 195;
               break;
            case 182:
               var10000 = 146;
               break;
            case 183:
               var10000 = 143;
               break;
            case 184:
               var10000 = 123;
               break;
            case 185:
               var10000 = 39;
               break;
            case 186:
               var10000 = 58;
               break;
            case 187:
               var10000 = 240;
               break;
            case 188:
               var10000 = 230;
               break;
            case 189:
               var10000 = 15;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 24;
               break;
            case 192:
               var10000 = 250;
               break;
            case 193:
               var10000 = 255;
               break;
            case 194:
               var10000 = 205;
               break;
            case 195:
               var10000 = 121;
               break;
            case 196:
               var10000 = 1;
               break;
            case 197:
               var10000 = 133;
               break;
            case 198:
               var10000 = 201;
               break;
            case 199:
               var10000 = 80;
               break;
            case 200:
               var10000 = 177;
               break;
            case 201:
               var10000 = 165;
               break;
            case 202:
               var10000 = 7;
               break;
            case 203:
               var10000 = 3;
               break;
            case 204:
               var10000 = 66;
               break;
            case 205:
               var10000 = 93;
               break;
            case 206:
               var10000 = 17;
               break;
            case 207:
               var10000 = 91;
               break;
            case 208:
               var10000 = 105;
               break;
            case 209:
               var10000 = 62;
               break;
            case 210:
               var10000 = 204;
               break;
            case 211:
               var10000 = 73;
               break;
            case 212:
               var10000 = 150;
               break;
            case 213:
               var10000 = 42;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 245;
               break;
            case 216:
               var10000 = 89;
               break;
            case 217:
               var10000 = 34;
               break;
            case 218:
               var10000 = 120;
               break;
            case 219:
               var10000 = 218;
               break;
            case 220:
               var10000 = 155;
               break;
            case 221:
               var10000 = 207;
               break;
            case 222:
               var10000 = 16;
               break;
            case 223:
               var10000 = 112;
               break;
            case 224:
               var10000 = 244;
               break;
            case 225:
               var10000 = 243;
               break;
            case 226:
               var10000 = 251;
               break;
            case 227:
               var10000 = 84;
               break;
            case 228:
               var10000 = 100;
               break;
            case 229:
               var10000 = 30;
               break;
            case 230:
               var10000 = 208;
               break;
            case 231:
               var10000 = 214;
               break;
            case 232:
               var10000 = 125;
               break;
            case 233:
               var10000 = 13;
               break;
            case 234:
               var10000 = 169;
               break;
            case 235:
               var10000 = 57;
               break;
            case 236:
               var10000 = 129;
               break;
            case 237:
               var10000 = 140;
               break;
            case 238:
               var10000 = 246;
               break;
            case 239:
               var10000 = 77;
               break;
            case 240:
               var10000 = 198;
               break;
            case 241:
               var10000 = 175;
               break;
            case 242:
               var10000 = 226;
               break;
            case 243:
               var10000 = 106;
               break;
            case 244:
               var10000 = 131;
               break;
            case 245:
               var10000 = 194;
               break;
            case 246:
               var10000 = 145;
               break;
            case 247:
               var10000 = 60;
               break;
            case 248:
               var10000 = 248;
               break;
            case 249:
               var10000 = 102;
               break;
            case 250:
               var10000 = 217;
               break;
            case 251:
               var10000 = 48;
               break;
            case 252:
               var10000 = 253;
               break;
            case 253:
               var10000 = 193;
               break;
            case 254:
               var10000 = 124;
               break;
            default:
               var10000 = 138;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0080Éåçâj\u0006\u0097n\u0007\u0013¾ô";
      int var4 = "\u0080Éåçâj\u0006\u0097n\u0007\u0013¾ô".length();
      char var1 = 6;
      int var0 = -1;
      K(null);

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 46;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            } else {
               var13 = 46;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 74;
                     break;
                  case 1:
                     var29 = 52;
                     break;
                  case 2:
                     var29 = 18;
                     break;
                  case 3:
                     var29 = 14;
                     break;
                  case 4:
                     var29 = 49;
                     break;
                  case 5:
                     var29 = 52;
                     break;
                  default:
                     var29 = 47;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            ab = var5;
            bb = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





