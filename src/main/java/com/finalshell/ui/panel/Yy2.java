package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Ac2;
import com.finalshell.core.Au2;
import com.finalshell.core.Az2;
import com.finalshell.core.D7;
import com.finalshell.core.E4;
import com.finalshell.core.EI;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.LS3;
import com.finalshell.core.Ld4;
import com.finalshell.core.O5;
import com.finalshell.core.O52;
import com.finalshell.core.Og4;
import com.finalshell.core.Ox4;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.Sr2;
import com.finalshell.core.Yb4;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.KH;
import com.finalshell.ui.model.WF;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Yy2 extends JLabel implements Pp2, RF3, D7, Au2, Yb4 {
   public List K;
   public boolean w;
   public int s;
   public int c;
   public int r;
   public int B;
   public int n;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public Yy2() {
   }

   public Yy2(Insets var1) {
      this.u(var1);
   }

   public Yy2(Icon var1) {
      super(var1);
   }

   public Yy2(Icon var1, Insets var2) {
      super(var1);
      this.u(var2);
   }

   public Yy2(int var1) {
      this.setHorizontalAlignment(var1);
   }

   public Yy2(int var1, Insets var2) {
      this.setHorizontalAlignment(var1);
      this.u(var2);
   }

   public Yy2(Icon var1, int var2) {
      super(var1, var2);
   }

   public Yy2(Icon var1, int var2, Insets var3) {
      super(var1, var2);
      this.u(var3);
   }

   public Yy2(String var1, Object[] var2) {
      super(E4.y(var1, var2));
      E4.a(this, var1, var2);
   }

   public Yy2(String var1, Insets var2, Object[] var3) {
      super(E4.y(var1, var3));
      E4.a(this, var1, var3);
      this.u(var2);
   }

   public Yy2(String var1, int var2, Object[] var3) {
      super(E4.y(var1, var3), var2);
      E4.a(this, var1, var3);
   }

   public Yy2(String var1, int var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2);
      E4.a(this, var1, var4);
      this.u(var3);
   }

   public Yy2(String var1, Icon var2, Object[] var3) {
      super(E4.y(var1, var3), var2, a(11060, 814836745173266294L));
      E4.a(this, var1, var3);
   }

   public Yy2(String var1, Icon var2, Insets var3, Object[] var4) {
      super(E4.y(var1, var4), var2, a(6330, 2532325966305582331L));
      E4.a(this, var1, var4);
      this.u(var3);
   }

   public Yy2(String var1, Icon var2, int var3, Object[] var4) {
      super(E4.y(var1, var4), var2, var3);
      E4.a(this, var1, var4);
   }

   public Yy2(String var1, Icon var2, int var3, Insets var4, Object[] var5) {
      super(E4.y(var1, var5), var2, var3);
      E4.a(this, var1, var5);
      this.u(var4);
   }

   @Override
   public void setText(String var1) {
      boolean var10000 = Oj2.V();
      ArrayList var3 = new ArrayList();
      String var4 = EI.C(var1, var3);
      boolean var2 = var10000;
      Yy2 var5 = this;
      if (!var2) {
         super.setText(var4);
         if (var3.size() <= 0) {
            return;
         }

         var5 = this;
      }

      var5.l(var3);
   }

   public Insets Y$Insets() {
      return this.V$o5_2().L();
   }

   public Yy2 u(Insets var1) {
      this.V$o5_2().h(var1);
      return this;
   }

   public Yy2 i(int var1, int var2, int var3, int var4) {
      this.u(new Insets(var1, var2, var3, var4));
      return this;
   }

   public Yy2 y(int var1) {
      return this.i(var1, var1, var1, var1);
   }

   public Og4 O$og_4() {
      return Ox4.y(this);
   }

   public Yy2 p(Og4 var1) {
      Ox4.b(this, var1);
      return this;
   }

   public List J() {
      return AL_2.J((Collection)this.B());
   }

   public void G(LS3 var1) {
      LS3 var2 = this.g(var1);
      this.firePropertyChange(a(18376, -9422), var2, var1);
   }

   public void M(List var1) {
      this.y(var1);
      this.firePropertyChange(a(18376, -9422), null, var1);
   }

   public void H(LS3 var1) {
      this.O(var1);
      this.firePropertyChange(a(18376, -9422), var1, null);
   }

   public void H(List var1) {
      this.o(var1);
      this.firePropertyChange(a(18377, -25548), var1, null);
   }

   public void l(List var1) {
      this.y();
      this.y(var1);
      this.firePropertyChange(a(18376, -9422), null, var1);
   }

   public void N() {
      this.y();
      this.firePropertyChange(a(18376, -9422), null, null);
   }

   public List B() {
      boolean var1 = Oj2.g();
      List var10000 = this.K;
      if (var1) {
         if (this.K == null) {
            this.K = new ArrayList(3);
         }

         var10000 = this.K;
      }

      return var10000;
   }

   public LS3 g(LS3 var1) {
      LS3 var2 = this.N(var1.H(), var1.F());
      this.B().add(var1);
      return var2;
   }

   public void y(List var1) {
      boolean var2 = Oj2.V();
      List var10000 = var1;
      if (!var2) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      for (LS3 var4 : var10000) {
         this.g(var4);
         if (var2) {
            break;
         }
      }
   }

   public void O(LS3 var1) {
      boolean var2 = Oj2.V();
      List var10000 = this.B();
      if (!var2) {
         if (var10000.remove(var1)) {
            return;
         }

         var10000 = this.B();
      }

      Iterator var3 = var10000.iterator();

      while (var3.hasNext()) {
         label25: {
            LS3 var4 = (LS3)var3.next();
            int var5 = var4.H();
            int var10001 = var1.H();
            if (!var2) {
               if (var5 != var10001) {
                  break label25;
               }

               var5 = var4.F();
               var10001 = var1.F();
            }

            if (var5 == var10001) {
               var3.remove();
               return;
            }
         }

         if (var2) {
            break;
         }
      }
   }

   public void o(List var1) {
      boolean var2 = Oj2.g();
      List var10000 = var1;
      if (var2) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      for (LS3 var4 : var10000) {
         this.O(var4);
         if (!var2) {
            break;
         }
      }
   }

   public void y() {
      this.B().clear();
   }

   public LS3 N(int var1, int var2) {
      int var10000 = (Oj2.g()) ? 1 : 0;
      Iterator var4 = this.B().iterator();
      boolean var3 = (var10000) != 0;

      while (var4.hasNext()) {
         label28: {
            LS3 var5 = (LS3)var4.next();
            var10000 = var5.H();
            int var10001 = var1;
            if (var3) {
               if (var10000 != var1) {
                  break label28;
               }

               if (!var3) {
                  return var5;
               }

               var10000 = var5.F();
               var10001 = var2;
            }

            if (var10000 == var10001) {
               var4.remove();
               return var5;
            }
         }

         if (!var3) {
            break;
         }
      }

      return null;
   }

   public boolean m() {
      return this.w;
   }

   public void n(boolean var1) {
      this.w = var1;
   }

   public int b() {
      return this.s;
   }

   public void c(int var1) {
      this.s = var1;
   }

   public int W() {
      return this.n;
   }

   public void N(int var1) {
      this.n = var1;
   }

   public int p() {
      return this.c;
   }

   public void r(int var1) {
      this.c = var1;
   }

   public int V$int() {
      return this.r;
   }

   public void Q(int var1) {
      this.r = var1;
   }

   @Override
   public String A() {
      return this.V$o5_2().A();
   }

   @Override
   public void S(String var1) {
      this.V$o5_2().S(var1);
   }

   public O52 V$o5_2() {
      return (O52)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Oj2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/ui/panel/Yy2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/Yy2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/Yy2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/Yy2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/finalshell/core/O52
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/Yy2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zu Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 267
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/O52
      // 40: invokevirtual com/finalshell/ui/panel/Yy2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/O52
      // 50: dup
      // 51: invokespecial com/finalshell/core/O52.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/Yy2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/Yy2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/Yy2.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/finalshell/ui/panel/Yy2.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return KH.styledLabel.n();
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
   public Dimension getMinimumSize() {
      boolean var1 = Oj2.V();
      Yy2 var10000 = this;
      if (!var1) {
         if (this.m()) {
            return new Dimension(1, 1);
         }

         var10000 = this;
      }

      return var10000.getMinimumSize();
   }

   @Override
   public Dimension getMaximumSize() {
      boolean var1 = Oj2.V();
      Yy2 var10000 = this;
      if (!var1) {
         if (this.m()) {
            return new Dimension(a(3629, 8153341273164630637L), a(24755, 6802100684756821232L));
         }

         var10000 = this;
      }

      return var10000.getMaximumSize();
   }

   public void g(int var1) {
      this.B = var1;
   }

   public int n() {
      return this.B;
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

   public Yy2 c() {
      return (Yy2)FN.A(this);
   }

   public Yy2 T(boolean var1) {
      return (Yy2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Yy2 e() {
      return (Yy2)FN.u(this);
   }

   public Yy2 X(boolean var1) {
      return (Yy2)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Yy2 Q$Yy_2() {
      return (Yy2)FN.C(this);
   }

   public Yy2 y(boolean var1) {
      return (Yy2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Yy2 I(boolean var1, boolean var2) {
      return (Yy2)FN.K(this, var1, var2);
   }

   public Yy2 v(int var1) {
      return (Yy2)FN.p(this, var1);
   }

   public Yy2 x(int var1) {
      return (Yy2)FN.O(this, var1);
   }

   public Yy2 m(int var1) {
      return (Yy2)FN.K(this, var1);
   }

   public int Y$int() {
      return FN.r$int(this);
   }

   public Yy2 g(int var1, boolean var2, boolean var3) {
      return (Yy2)FN.d(this, var1, var2, var3);
   }

   public Yy2 H(int var1, int var2) {
      return (Yy2)FN.m(this, var1, var2);
   }

   public Yy2 E(String var1) {
      return (Yy2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public Component N(String var1) {
      return this.E(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.H(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.g(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.m(var1);
   }

   @Override
   public Component o(int var1) {
      return this.x(var1);
   }

   @Override
   public Component i(int var1) {
      return this.v(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.I(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.y(var1);
   }

   public Component Q$Component() {
      return this.Q$Yy_2();
   }

   @Override
   public Component u(boolean var1) {
      return this.X(var1);
   }

   @Override
   public Component R() {
      return this.e();
   }

   @Override
   public Component c(boolean var1) {
      return this.T(var1);
   }

   @Override
   public Component a() {
      return this.c();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 18377) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 191;
               break;
            case 1:
               var10000 = 31;
               break;
            case 2:
               var10000 = 127;
               break;
            case 3:
               var10000 = 15;
               break;
            case 4:
               var10000 = 128;
               break;
            case 5:
               var10000 = 18;
               break;
            case 6:
               var10000 = 162;
               break;
            case 7:
               var10000 = 46;
               break;
            case 8:
               var10000 = 95;
               break;
            case 9:
               var10000 = 238;
               break;
            case 10:
               var10000 = 80;
               break;
            case 11:
               var10000 = 148;
               break;
            case 12:
               var10000 = 189;
               break;
            case 13:
               var10000 = 101;
               break;
            case 14:
               var10000 = 152;
               break;
            case 15:
               var10000 = 246;
               break;
            case 16:
               var10000 = 190;
               break;
            case 17:
               var10000 = 210;
               break;
            case 18:
               var10000 = 76;
               break;
            case 19:
               var10000 = 163;
               break;
            case 20:
               var10000 = 242;
               break;
            case 21:
               var10000 = 107;
               break;
            case 22:
               var10000 = 90;
               break;
            case 23:
               var10000 = 131;
               break;
            case 24:
               var10000 = 114;
               break;
            case 25:
               var10000 = 185;
               break;
            case 26:
               var10000 = 224;
               break;
            case 27:
               var10000 = 183;
               break;
            case 28:
               var10000 = 13;
               break;
            case 29:
               var10000 = 213;
               break;
            case 30:
               var10000 = 164;
               break;
            case 31:
               var10000 = 254;
               break;
            case 32:
               var10000 = 229;
               break;
            case 33:
               var10000 = 250;
               break;
            case 34:
               var10000 = 197;
               break;
            case 35:
               var10000 = 186;
               break;
            case 36:
               var10000 = 32;
               break;
            case 37:
               var10000 = 47;
               break;
            case 38:
               var10000 = 44;
               break;
            case 39:
               var10000 = 234;
               break;
            case 40:
               var10000 = 177;
               break;
            case 41:
               var10000 = 121;
               break;
            case 42:
               var10000 = 141;
               break;
            case 43:
               var10000 = 129;
               break;
            case 44:
               var10000 = 26;
               break;
            case 45:
               var10000 = 105;
               break;
            case 46:
               var10000 = 215;
               break;
            case 47:
               var10000 = 28;
               break;
            case 48:
               var10000 = 20;
               break;
            case 49:
               var10000 = 125;
               break;
            case 50:
               var10000 = 100;
               break;
            case 51:
               var10000 = 145;
               break;
            case 52:
               var10000 = 146;
               break;
            case 53:
               var10000 = 11;
               break;
            case 54:
               var10000 = 166;
               break;
            case 55:
               var10000 = 206;
               break;
            case 56:
               var10000 = 5;
               break;
            case 57:
               var10000 = 232;
               break;
            case 58:
               var10000 = 245;
               break;
            case 59:
               var10000 = 77;
               break;
            case 60:
               var10000 = 53;
               break;
            case 61:
               var10000 = 68;
               break;
            case 62:
               var10000 = 221;
               break;
            case 63:
               var10000 = 218;
               break;
            case 64:
               var10000 = 178;
               break;
            case 65:
               var10000 = 176;
               break;
            case 66:
               var10000 = 75;
               break;
            case 67:
               var10000 = 253;
               break;
            case 68:
               var10000 = 9;
               break;
            case 69:
               var10000 = 123;
               break;
            case 70:
               var10000 = 187;
               break;
            case 71:
               var10000 = 8;
               break;
            case 72:
               var10000 = 30;
               break;
            case 73:
               var10000 = 79;
               break;
            case 74:
               var10000 = 255;
               break;
            case 75:
               var10000 = 37;
               break;
            case 76:
               var10000 = 170;
               break;
            case 77:
               var10000 = 196;
               break;
            case 78:
               var10000 = 211;
               break;
            case 79:
               var10000 = 59;
               break;
            case 80:
               var10000 = 136;
               break;
            case 81:
               var10000 = 23;
               break;
            case 82:
               var10000 = 205;
               break;
            case 83:
               var10000 = 113;
               break;
            case 84:
               var10000 = 21;
               break;
            case 85:
               var10000 = 207;
               break;
            case 86:
               var10000 = 203;
               break;
            case 87:
               var10000 = 240;
               break;
            case 88:
               var10000 = 188;
               break;
            case 89:
               var10000 = 174;
               break;
            case 90:
               var10000 = 124;
               break;
            case 91:
               var10000 = 110;
               break;
            case 92:
               var10000 = 194;
               break;
            case 93:
               var10000 = 248;
               break;
            case 94:
               var10000 = 36;
               break;
            case 95:
               var10000 = 54;
               break;
            case 96:
               var10000 = 180;
               break;
            case 97:
               var10000 = 60;
               break;
            case 98:
               var10000 = 49;
               break;
            case 99:
               var10000 = 167;
               break;
            case 100:
               var10000 = 150;
               break;
            case 101:
               var10000 = 158;
               break;
            case 102:
               var10000 = 202;
               break;
            case 103:
               var10000 = 154;
               break;
            case 104:
               var10000 = 12;
               break;
            case 105:
               var10000 = 58;
               break;
            case 106:
               var10000 = 130;
               break;
            case 107:
               var10000 = 133;
               break;
            case 108:
               var10000 = 84;
               break;
            case 109:
               var10000 = 51;
               break;
            case 110:
               var10000 = 161;
               break;
            case 111:
               var10000 = 204;
               break;
            case 112:
               var10000 = 82;
               break;
            case 113:
               var10000 = 239;
               break;
            case 114:
               var10000 = 2;
               break;
            case 115:
               var10000 = 159;
               break;
            case 116:
               var10000 = 42;
               break;
            case 117:
               var10000 = 126;
               break;
            case 118:
               var10000 = 45;
               break;
            case 119:
               var10000 = 222;
               break;
            case 120:
               var10000 = 29;
               break;
            case 121:
               var10000 = 92;
               break;
            case 122:
               var10000 = 155;
               break;
            case 123:
               var10000 = 103;
               break;
            case 124:
               var10000 = 223;
               break;
            case 125:
               var10000 = 247;
               break;
            case 126:
               var10000 = 50;
               break;
            case 127:
               var10000 = 52;
               break;
            case 128:
               var10000 = 137;
               break;
            case 129:
               var10000 = 235;
               break;
            case 130:
               var10000 = 243;
               break;
            case 131:
               var10000 = 115;
               break;
            case 132:
               var10000 = 175;
               break;
            case 133:
               var10000 = 41;
               break;
            case 134:
               var10000 = 219;
               break;
            case 135:
               var10000 = 109;
               break;
            case 136:
               var10000 = 231;
               break;
            case 137:
               var10000 = 87;
               break;
            case 138:
               var10000 = 86;
               break;
            case 139:
               var10000 = 14;
               break;
            case 140:
               var10000 = 201;
               break;
            case 141:
               var10000 = 48;
               break;
            case 142:
               var10000 = 93;
               break;
            case 143:
               var10000 = 61;
               break;
            case 144:
               var10000 = 63;
               break;
            case 145:
               var10000 = 157;
               break;
            case 146:
               var10000 = 233;
               break;
            case 147:
               var10000 = 88;
               break;
            case 148:
               var10000 = 91;
               break;
            case 149:
               var10000 = 116;
               break;
            case 150:
               var10000 = 99;
               break;
            case 151:
               var10000 = 241;
               break;
            case 152:
               var10000 = 160;
               break;
            case 153:
               var10000 = 226;
               break;
            case 154:
               var10000 = 182;
               break;
            case 155:
               var10000 = 179;
               break;
            case 156:
               var10000 = 212;
               break;
            case 157:
               var10000 = 27;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 34;
               break;
            case 160:
               var10000 = 70;
               break;
            case 161:
               var10000 = 38;
               break;
            case 162:
               var10000 = 144;
               break;
            case 163:
               var10000 = 6;
               break;
            case 164:
               var10000 = 1;
               break;
            case 165:
               var10000 = 74;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 72;
               break;
            case 168:
               var10000 = 134;
               break;
            case 169:
               var10000 = 135;
               break;
            case 170:
               var10000 = 89;
               break;
            case 171:
               var10000 = 132;
               break;
            case 172:
               var10000 = 33;
               break;
            case 173:
               var10000 = 156;
               break;
            case 174:
               var10000 = 39;
               break;
            case 175:
               var10000 = 7;
               break;
            case 176:
               var10000 = 16;
               break;
            case 177:
               var10000 = 67;
               break;
            case 178:
               var10000 = 236;
               break;
            case 179:
               var10000 = 25;
               break;
            case 180:
               var10000 = 198;
               break;
            case 181:
               var10000 = 17;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 98;
               break;
            case 184:
               var10000 = 138;
               break;
            case 185:
               var10000 = 209;
               break;
            case 186:
               var10000 = 237;
               break;
            case 187:
               var10000 = 94;
               break;
            case 188:
               var10000 = 195;
               break;
            case 189:
               var10000 = 106;
               break;
            case 190:
               var10000 = 35;
               break;
            case 191:
               var10000 = 78;
               break;
            case 192:
               var10000 = 0;
               break;
            case 193:
               var10000 = 71;
               break;
            case 194:
               var10000 = 220;
               break;
            case 195:
               var10000 = 140;
               break;
            case 196:
               var10000 = 118;
               break;
            case 197:
               var10000 = 22;
               break;
            case 198:
               var10000 = 19;
               break;
            case 199:
               var10000 = 252;
               break;
            case 200:
               var10000 = 169;
               break;
            case 201:
               var10000 = 65;
               break;
            case 202:
               var10000 = 208;
               break;
            case 203:
               var10000 = 73;
               break;
            case 204:
               var10000 = 104;
               break;
            case 205:
               var10000 = 244;
               break;
            case 206:
               var10000 = 85;
               break;
            case 207:
               var10000 = 149;
               break;
            case 208:
               var10000 = 192;
               break;
            case 209:
               var10000 = 165;
               break;
            case 210:
               var10000 = 214;
               break;
            case 211:
               var10000 = 120;
               break;
            case 212:
               var10000 = 147;
               break;
            case 213:
               var10000 = 66;
               break;
            case 214:
               var10000 = 55;
               break;
            case 215:
               var10000 = 119;
               break;
            case 216:
               var10000 = 171;
               break;
            case 217:
               var10000 = 117;
               break;
            case 218:
               var10000 = 225;
               break;
            case 219:
               var10000 = 108;
               break;
            case 220:
               var10000 = 217;
               break;
            case 221:
               var10000 = 102;
               break;
            case 222:
               var10000 = 24;
               break;
            case 223:
               var10000 = 40;
               break;
            case 224:
               var10000 = 184;
               break;
            case 225:
               var10000 = 96;
               break;
            case 226:
               var10000 = 139;
               break;
            case 227:
               var10000 = 200;
               break;
            case 228:
               var10000 = 83;
               break;
            case 229:
               var10000 = 172;
               break;
            case 230:
               var10000 = 249;
               break;
            case 231:
               var10000 = 181;
               break;
            case 232:
               var10000 = 153;
               break;
            case 233:
               var10000 = 97;
               break;
            case 234:
               var10000 = 111;
               break;
            case 235:
               var10000 = 4;
               break;
            case 236:
               var10000 = 173;
               break;
            case 237:
               var10000 = 143;
               break;
            case 238:
               var10000 = 62;
               break;
            case 239:
               var10000 = 193;
               break;
            case 240:
               var10000 = 227;
               break;
            case 241:
               var10000 = 216;
               break;
            case 242:
               var10000 = 199;
               break;
            case 243:
               var10000 = 43;
               break;
            case 244:
               var10000 = 69;
               break;
            case 245:
               var10000 = 57;
               break;
            case 246:
               var10000 = 142;
               break;
            case 247:
               var10000 = 230;
               break;
            case 248:
               var10000 = 228;
               break;
            case 249:
               var10000 = 10;
               break;
            case 250:
               var10000 = 3;
               break;
            case 251:
               var10000 = 56;
               break;
            case 252:
               var10000 = 151;
               break;
            case 253:
               var10000 = 112;
               break;
            case 254:
               var10000 = 64;
               break;
            default:
               var10000 = 251;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17472;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "¡]-/v ,¨e®\n?ðþ\u009a\f\u0016c~\u008ct";
      int var12 = "¡]-/v ,¨e®\n?ðþ\u009a\f\u0016c~\u008ct".length();
      char var9 = '\n';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 80;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 80;
               var10006 = var14;
            } else {
               var27 = 80;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 80;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 25;
                     break;
                  case 1:
                     var47 = 122;
                     break;
                  case 2:
                     var47 = 4;
                     break;
                  case 3:
                     var47 = 7;
                     break;
                  case 4:
                     var47 = 58;
                     break;
                  case 5:
                     var47 = 76;
                     break;
                  default:
                     var47 = 87;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 5424140537285087492L;
            long[] var6 = new long[4];
            int var3 = 0;
            String var4 = "båm¿`Ñ$\u0096ç;TÞ=\u0088Íõ";
            int var5 = "båm¿`Ñ$\u0096ç;TÞ=\u0088Íõ".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           d = var6;
                           e = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Ê1)êIP~xîxL½N\fJ\u000b";
                        var5 = "Ê1)êIP~xîxL½N\fJ\u000b".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





