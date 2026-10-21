package com.finalshell.ui.dialog;

import com.finalshell.core.AL_2;
import com.finalshell.core.C0_2;
import com.finalshell.core.D7;
import com.finalshell.core.E2;
import com.finalshell.core.E_2;
import com.finalshell.core.FG;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.Kt4;
import com.finalshell.core.LT3;
import com.finalshell.core.Lr4;
import com.finalshell.core.N_2;
import com.finalshell.core.Ox4;
import com.finalshell.core.R7;
import com.finalshell.core.Ry2;
import com.finalshell.core.TF;
import com.finalshell.core.Xk2;
import com.finalshell.core.YT3;
import com.finalshell.ui.listener.DL;
import com.finalshell.ui.listener.Fa2;
import com.finalshell.ui.listener.Hm2;
import com.finalshell.ui.listener.L__2;
import com.finalshell.ui.listener.Ng4;
import com.finalshell.ui.listener.RZ;
import com.finalshell.ui.listener.Wm4;
import com.finalshell.ui.listener.Wy_2;
import com.finalshell.ui.model.B1;
import com.finalshell.ui.model.M;
import com.finalshell.ui.model.Nq4;
import com.finalshell.ui.model.Xh4;
import com.finalshell.ui.model.YR3;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public class Ds2 extends Y2 implements D7, LT3 {
   protected boolean v = E2.c;
   protected Xh4 s = E2.G;
   protected Ky4 o;
   protected boolean r = false;
   protected B1 G = null;
   protected B1 I = null;
   protected Nq4 n = null;
   protected List Q = new ArrayList(1);
   public static int[] g;
   public static String[] b;
   public static String[] c;

   public Ds2() {
   }

   public Ds2(Frame var1) {
      super(var1);
   }

   public Ds2(Frame var1, String var2) {
      super(var1, var2);
   }

   public Ds2(Dialog var1) {
      super(var1);
   }

   public Ds2(Dialog var1, String var2) {
      super(var1, var2);
   }

   public Ds2(Component var1) {
      super(var1);
   }

   public Ds2(Component var1, String var2) {
      super(var1, var2);
   }

   public Ds2(Window var1) {
      super(var1);
   }

   public Ds2(Window var1, String var2) {
      super(var1, var2);
   }

   @Override
   protected void j$void() {
      label15: {
         super.j$void();
         this.getRootPane().setWindowDecorationStyle(0);
         this.setUndecorated(true);
         int[] var10000 = U$arrint();
         this.Z(false);
         this.o = new Ky4();
         this.o.S(a(-14040, 6571));
         this.setContentPane(this.o);
         int[] var1 = var10000;
         boolean var5 = Xk2.R();
         if (var1 == null) {
            if (var5) {
               break label15;
            }

            var5 = Xk2.d();
         }

         if (var5) {
            L__2 var2 = new L__2(this);
            this.addComponentListener(var2);
         }
      }

      Hm2 var4 = new Hm2(this);
      this.o.addMouseListener(var4);
      this.o.addMouseMotionListener(var4);
      this.addWindowFocusListener(new YT3(this));
      Wm4 var3 = new Wm4(this);
      this.addComponentListener(var3);
      this.addWindowListener(var3);
   }

   @Override
   public String A() {
      return this.o.A$String();
   }

   @Override
   public void S(String var1) {
      this.o.S(var1);
   }

   public void t(Color var1) {
      this.o.setBackground(var1);
   }

   public Color v() {
      return this.o.getBackground();
   }

   public Insets F() {
      return this.o.O$Insets();
   }

   public Ds2 S(Insets var1) {
      this.o.b(var1);
      return this;
   }

   public Ds2 A(int var1, int var2, int var3, int var4) {
      this.o.N(var1, var2, var3, var4);
      return this;
   }

   public Ds2 B(int var1) {
      this.o.C(var1);
      return this;
   }

   public N_2 g() {
      return (N_2)this.o.l();
   }

   public void r(N_2 var1) {
      this.o.L(var1);
   }

   public boolean j$boolean() {
      return this.v;
   }

   public void Q(boolean var1) {
      this.v = var1;
   }

   public Xh4 V() {
      return this.s;
   }

   public void J(Xh4 var1) {
      this.s = var1;
   }

   public Color B$Color() {
      return this.g().o();
   }

   public void J(Color var1) {
      Ox4.E(this.o, a(-14048, -13795), var1);
   }

   @Override
   public int S() {
      return this.g().U();
   }

   @Override
   public void U$void(int var1) {
      Ox4.E(this.o, a(-14039, -12912), var1);
   }

   @Override
   public int G() {
      return this.g().j();
   }

   @Override
   public void L(int var1) {
      Ox4.E(this.o, a(-14033, -1438), var1);
   }

   public float d() {
      return this.g().A();
   }

   public void C(float var1) {
      Ox4.E(this.o, a(-14045, -32285), var1);
   }

   public int e() {
      return this.g().h();
   }

   public void f(int var1) {
      Ox4.E(this.o, a(-14047, 10559), var1);
   }

   public float m() {
      return this.g().P();
   }

   public void v(float var1) {
      Ox4.E(this.o, a(-14034, 18833), var1);
   }

   protected M Q$M() {
      return this.g().M();
   }

   protected void e(M var1) {
      Ox4.E(this.o, a(-14035, -19132), var1);
   }

   protected int f() {
      return this.g().I();
   }

   protected void x(int var1) {
      Ox4.E(this.o, a(-14038, -31209), var1);
   }

   protected int r$int() {
      return this.g().i();
   }

   protected void M(int var1) {
      Ox4.E(this.o, a(-14037, -19018), var1);
   }

   protected int B$int() {
      return this.g().B();
   }

   protected void l(int var1) {
      Ox4.E(this.o, a(-14036, 2596), var1);
   }

   public boolean r$boolean() {
      return this.g().G();
   }

   public void P(boolean var1) {
      Ox4.E(this.o, a(-14043, -28901), var1);
   }

   public Ds2 g(YR3 var1) {
      int[] var10000 = U$arrint();
      this.r = false;
      this.G = null;
      int[] var2 = var10000;
      this.e(M.simple);
      Dimension var3 = Toolkit.getDefaultToolkit().getScreenSize();
      this.pack();
      if (var2 == null) {
         switch (FG.V[var1.ordinal()]) {
            case 1:
               this.setLocation(var3.width / 2 - this.getWidth() / 2, var3.height / 2 - this.getHeight() / 2);
               if (var2 == null) {
                  break;
               }
            case 2:
               this.setLocation(0, 0);
               if (var2 == null) {
                  break;
               }
            case 3:
               this.setLocation(var3.width - this.getWidth(), 0);
               if (var2 == null) {
                  break;
               }
            case 4:
               this.setLocation(0, var3.height - this.getHeight());
               if (var2 == null) {
                  break;
               }
            case 5:
               this.setLocation(var3.width - this.getWidth(), var3.height - this.getHeight());
               if (var2 == null) {
                  break;
               }
            case 6:
               this.setLocation(var3.width / 2 - this.getWidth() / 2, 0);
               if (var2 == null) {
                  break;
               }
            case 7:
               this.setLocation(var3.width / 2 - this.getWidth() / 2, var3.height - this.getHeight());
               if (var2 == null) {
                  break;
               }
            case 8:
               this.setLocation(0, var3.height / 2 - this.getHeight() / 2);
               if (var2 == null) {
                  break;
               }
            case 9:
               this.setLocation(var3.width - this.getWidth(), var3.height / 2 - this.getHeight() / 2);
         }

         this.setVisible(true);
      }

      return this;
   }

   public Ds2 u(Point var1) {
      return this.Y(var1.x, var1.y);
   }

   public Ds2 Y(int var1, int var2) {
      this.r = false;
      this.G = null;
      this.e(M.simple);
      this.pack();
      this.setLocation(var1 - this.G(), var2 - this.G());
      this.setVisible(true);
      return this;
   }

   public Ds2 O(Component var1) {
      return this.d(var1, this.G);
   }

   public Ds2 d(Component var1, B1 var2) {
      return this.I(var1, var2, Nq4.centered);
   }

   public Ds2 I(Component var1, B1 var2, Nq4 var3) {
      return this.J(var1, null, var2, var3);
   }

   public Ds2 S(Component var1, int var2, int var3) {
      return this.H(var1, var2, var3, this.G);
   }

   public Ds2 H(Component var1, int var2, int var3, B1 var4) {
      return this.Z(var1, var2, var3, var4, Nq4.centered);
   }

   public Ds2 Z(Component var1, int var2, int var3, B1 var4, Nq4 var5) {
      return this.F(var1, var2, var3, 0, 0, var4, var5);
   }

   public Ds2 M(Component var1, int var2, int var3, int var4, int var5) {
      return this.c(var1, var2, var3, var4, var5, this.G);
   }

   public Ds2 c(Component var1, int var2, int var3, int var4, int var5, B1 var6) {
      return this.F(var1, var2, var3, var4, var5, var6, Nq4.centered);
   }

   public Ds2 F(Component var1, int var2, int var3, int var4, int var5, B1 var6, Nq4 var7) {
      Rectangle var8 = new Rectangle(var2, var3, var4, var5);
      return this.J(var1, new Lr4(this, var8), var6, var7);
   }

   public Ds2 g(Component var1, E_2 var2) {
      return this.w(var1, var2, this.G);
   }

   public Ds2 w(Component var1, E_2 var2, B1 var3) {
      return this.J(var1, var2, var3, Nq4.centered);
   }

   public Ds2 J(Component var1, E_2 var2, B1 var3, Nq4 var4) {
      int[] var5;
      label26: {
         var5 = U$arrint();
         Ds2 var10000 = this;
         if (var5 == null) {
            if (!this.isShowing()) {
               break label26;
            }

            var10000 = this;
         }

         var10000.Q$void();
      }

      TF var6 = var2 == null ? null : new TF(this, var1, var2);
      this.r = true;
      B1 var10001 = var3;
      if (var5 == null) {
         var10001 = var3 != null ? var3 : B1.down;
      }

      this.G = var10001;
      this.n = var4;
      this.pack();
      this.F(var1, var6);
      this.N(var1, var6);
      this.setVisible(true);
      this.J();
      return this;
   }

   protected void F(Component var1, E_2 var2) {
      label16: {
         int[] var3 = U$arrint();
         if (var3 == null) {
            if (var2 == null) {
               break label16;
            }

            this.R((Rectangle)var2.J());
         }

         if (var3 == null) {
            return;
         }
      }

      this.L(var1);
   }

   protected void L(Component var1) {
      int[] var2 = U$arrint();
      boolean var10000 = var1 instanceof Window;
      if (var2 == null) {
         if (var10000) {
            this.e(M.simple);
            Rectangle var3 = var1.getBounds();
            Dimension var4 = this.getSize();
            this.I = null;
            this.setLocation(var3.x + var3.width / 2 - var4.width / 2, var3.y + var3.height / 2 - var4.height / 2);
            if (var2 == null) {
               return;
            }
         }

         var10000 = var1.isShowing();
      }

      if (var10000) {
         this.R(com.finalshell.core.FN.f$Rectangle(var1));
      }
   }

   protected void R(Rectangle var1) {
      this.e(M.dropdown);
      Dimension var3 = this.getSize();
      int var4 = this.G();
      U$arrint();
      int var5 = this.S();
      int var6 = this.e();
      Dimension var7 = new Dimension(var3.width - var4 * 2, var3.height - var4 * 2);
      Rectangle var8 = this.getGraphicsConfiguration().getBounds();
      boolean var9 = this.getComponentOrientation().isLeftToRight();
      B1 var10 = this.Z(var1, var9, var6, var7, var8);
      this.x(var10.m(var9));
      this.I = var10;
      Point var11 = this.D(var1, var9, var5, var6, var7, var8, var10);
      var11.x -= var4;
      var11.y -= var4;
      this.l(-1);
      this.M(this.W(var1, var10, var11));
      this.setLocation(var11);
      if (Ky4.F$arrString() != null) {
         Z(new int[3]);
      }
   }

   protected void N(Component var1, E_2 var2) {
      Window var4;
      RZ var5;
      Wy_2 var6;
      Ng4 var7;
      Fa2 var8;
      label11: {
         var4 = com.finalshell.core.FN.L(var1);
         var5 = new RZ(this, this, var4);
         var4.addComponentListener(var5);
         var6 = new Wy_2(this, var1, var2, var5);
         var4.addComponentListener(var6);
         int[] var10000 = U$arrint();
         var7 = new Ng4(this, var1, var2, var5);
         int[] var3 = var10000;
         var1.addComponentListener(var7);
         if (var1 instanceof JComponent) {
            var8 = new Fa2(this, var1, var2, var5);
            ((JComponent)var1).addAncestorListener(var8);
            if (var3 == null) {
               break label11;
            }
         }

         var8 = null;
      }

      DL var9 = new DL(this, var1, var2, var5);
      this.addPropertyChangeListener(a(-14046, -27750), var9);
      this.D(new Ry2(this, var4, var6, var5, var1, var7, var8, var9));
   }

   protected int W(Rectangle var1, B1 var2, Point var3) {
      int[] var4 = U$arrint();
      int var10000 = FG.L[var2.ordinal()];
      if (var4 == null) {
         switch (var10000) {
            case 1:
            case 2:
               return var1.x + var1.width / 2 - var3.x;
            case 3:
            case 4:
               return var1.y + var1.height / 2 - var3.y;
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   protected Point D(Rectangle var1, boolean var2, int var3, int var4, Dimension var5, Rectangle var6, B1 var7) {
      int[] var8;
      Point var9;
      B1 var14;
      label138: {
         int[] var10000 = U$arrint();
         var9 = this.p(var1, var2, var7);
         var8 = var10000;
         var14 = var7;
         B1 var10001 = B1.up;
         if (var8 == null) {
            if (var7 == B1.up) {
               Nq4 var20 = this.n;
               if (var8 == null) {
                  if (this.n == Nq4.centered) {
                     Point var13 = new Point(var9.x - var5.width / 2, var9.y - var4 - var5.height);
                     return this.i(this.z(var13, var6), var5, var6);
                  }

                  var20 = this.n;
               }

               if (var20 == (var2 ? Nq4.leading : Nq4.trailing)) {
                  return this.z(new Point(var9.x + var4 * 2 + var3 - var5.width, var9.y - var4 - var5.height), var6);
               }

               if (this.n == (var2 ? Nq4.trailing : Nq4.leading)) {
                  return this.i(new Point(var9.x - var4 * 2 - var3, var9.y - var4 - var5.height), var5, var6);
               }

               return null;
            }

            var14 = var7;
            if (var8 != null) {
               break label138;
            }

            var10001 = B1.down;
         }

         if (var14 == var10001) {
            Nq4 var15 = this.n;
            if (var8 == null) {
               if (this.n == Nq4.centered) {
                  Point var10 = new Point(var9.x - var5.width / 2, var9.y + var4);
                  return this.i(this.z(var10, var6), var5, var6);
               }

               var15 = this.n;
            }

            if (var15 == (var2 ? Nq4.leading : Nq4.trailing)) {
               return this.z(new Point(var9.x + var4 * 2 + var3 - var5.width, var9.y + var4), var6);
            }

            if (this.n == (var2 ? Nq4.trailing : Nq4.leading)) {
               return this.i(new Point(var9.x - var4 * 2 - var3, var9.y + var4), var5, var6);
            }

            return null;
         }

         var14 = var7;
      }

      if (var14 == (var2 ? B1.left : B1.right)) {
         Nq4 var16 = this.n;
         Nq4 var21 = Nq4.centered;
         if (var8 == null) {
            if (this.n == Nq4.centered) {
               Point var11 = new Point(var9.x - var4 - var5.width, var9.y - var5.height / 2);
               return this.B(this.k(var11, var6), var5, var6);
            }

            var16 = this.n;
            var21 = Nq4.leading;
         }

         if (var8 == null) {
            if (var16 == var21) {
               return this.k(new Point(var9.x - var4 - var5.width, var9.y + var4 * 2 + var3 - var5.height), var6);
            }

            if (var8 != null) {
               return this.B(new Point(var9.x - var4 - var5.width, var9.y - var4 * 2 - var3), var5, var6);
            }

            var16 = this.n;
            var21 = Nq4.trailing;
         }

         if (var16 == var21) {
            return this.B(new Point(var9.x - var4 - var5.width, var9.y - var4 * 2 - var3), var5, var6);
         }
      } else if (var7 == (var2 ? B1.right : B1.left)) {
         Nq4 var18 = this.n;
         Nq4 var22 = Nq4.centered;
         if (var8 == null) {
            if (this.n == Nq4.centered) {
               Point var12 = new Point(var9.x + var4, var9.y - var5.height / 2);
               return this.B(this.k(var12, var6), var5, var6);
            }

            var18 = this.n;
            var22 = Nq4.leading;
         }

         if (var8 == null) {
            if (var18 == var22) {
               return this.k(new Point(var9.x + var4, var9.y + var4 * 2 + var3 - var5.height), var6);
            }

            if (var8 != null) {
               return this.B(new Point(var9.x + var4, var9.y - var4 * 2 - var3), var5, var6);
            }

            var18 = this.n;
            var22 = Nq4.trailing;
         }

         if (var18 == var22) {
            return this.B(new Point(var9.x + var4, var9.y - var4 * 2 - var3), var5, var6);
         }
      }

      return null;
   }

   protected Point k(Point var1, Rectangle var2) {
      int[] var3 = U$arrint();
      Point var10000 = var1;
      if (var3 == null) {
         if (var1.y < var2.y) {
            var1.y = var2.y;
         }

         var10000 = var1;
      }

      return var10000;
   }

   protected Point B(Point var1, Dimension var2, Rectangle var3) {
      int[] var4 = U$arrint();
      Point var10000 = var1;
      if (var4 == null) {
         if (var1.y + var2.height > var3.y + var3.height) {
            var1.y = var3.y + var3.height - var2.height;
         }

         var10000 = var1;
      }

      return var10000;
   }

   protected Point z(Point var1, Rectangle var2) {
      int[] var3 = U$arrint();
      Point var10000 = var1;
      if (var3 == null) {
         if (var1.x < var2.x) {
            var1.x = var2.x;
         }

         var10000 = var1;
      }

      return var10000;
   }

   protected Point i(Point var1, Dimension var2, Rectangle var3) {
      int[] var4 = U$arrint();
      Point var10000 = var1;
      if (var4 == null) {
         if (var1.x + var2.width > var3.x + var3.width) {
            var1.x = var3.x + var3.width - var2.width;
         }

         var10000 = var1;
      }

      return var10000;
   }

   protected B1 Z(Rectangle var1, boolean var2, int var3, Dimension var4, Rectangle var5) {
      int[] var10000 = U$arrint();
      B1[] var7 = this.G.r();
      int var8 = var7.length;
      int[] var6 = var10000;
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
      B1 var12;
            B1 var10 = var7[var9];
            Point var11 = this.p(var1, var2, var10);
            var12 = var10;
            if (var6 != null) {
               break;
            }

            label65: {
               label66: {
                  B1 var10001 = B1.up;
                  if (var6 == null) {
                     if (var10 == B1.up) {
                        if (var11.y - var3 - var4.height > var5.y) {
                           return var10;
                        }
                        break label65;
                     }

                     var12 = var10;
                     if (var6 != null) {
                        break label66;
                     }

                     var10001 = B1.down;
                  }

                  if (var12 == var10001) {
                     if (var11.y + var3 + var4.height < var5.y + var5.height) {
                        return var10;
                     }
                     break label65;
                  }

                  var12 = var10;
               }

               if (var12 == (var2 ? B1.left : B1.right)) {
                  if (var11.x - var3 - var4.width > var5.x) {
                     return var10;
                  }
               } else if (var10 == (var2 ? B1.right : B1.left) && var11.x + var3 + var4.width < var5.x + var5.width) {
                  return var10;
               }
            }

            var9++;
            if (var6 == null) {
               continue;
            }
         }

         var12 = this.G;
         break;
      }

      return var12;
   }

   protected Point p(Rectangle var1, boolean var2, B1 var3) {
      int[] var4 = U$arrint();
      if (this.s == Xh4.componentCenter) {
         return new Point(var1.x + var1.width / 2, var1.y + var1.height / 2);
      } else {
         B1 var10000;
         label46: {
            var10000 = var3;
            B1 var10001 = B1.up;
            if (var4 == null) {
               if (var3 == B1.up) {
                  return new Point(var1.x + var1.width / 2, var1.y);
               }

               var10000 = var3;
               if (var4 != null) {
                  break label46;
               }

               var10001 = B1.down;
            }

            if (var10000 == var10001) {
               return new Point(var1.x + var1.width / 2, var1.y + var1.height);
            }

            var10000 = var3;
         }

         if (var10000 == (var2 ? B1.left : B1.right)) {
            return new Point(var1.x, var1.y + var1.height / 2);
         } else {
            return var3 == (var2 ? B1.right : B1.left) ? new Point(var1.x + var1.width, var1.y + var1.height / 2) : null;
         }
      }
   }

   public B1 U$B1() {
      return this.G;
   }

   public void g(B1 var1) {
      this.G = var1;
   }

   public B1 I() {
      return this.I;
   }

   public void v(B1 var1) {
      this.I = var1;
   }

   public void D(Kt4 var1) {
      this.Q.add(var1);
   }

   public void b(Kt4 var1) {
      this.Q.remove(var1);
   }

   public void J() {
      int[] var10000 = U$arrint();
      Iterator var2 = AL_2.J((Collection)this.Q).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Kt4 var3 = (Kt4)var2.next();
         var3.j(this);
         if (var1 != null) {
            break;
         }
      }
   }

   public void Q$void() {
      int[] var10000 = U$arrint();
      Iterator var2 = AL_2.J((Collection)this.Q).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Kt4 var3 = (Kt4)var2.next();
         var3.u(this);
         if (var1 != null) {
            break;
         }
      }
   }

   public void r$void() {
      int[] var10000 = U$arrint();
      Iterator var2 = AL_2.J((Collection)this.Q).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Kt4 var3 = (Kt4)var2.next();
         var3.X(this);
         if (var1 != null) {
            break;
         }
      }
   }

   public void U$void() {
      int[] var10000 = U$arrint();
      Iterator var2 = AL_2.J((Collection)this.Q).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         Kt4 var3 = (Kt4)var2.next();
         var3.f(this);
         if (var1 != null) {
            break;
         }
      }
   }

   @Override
   public R7 D(C0_2 var1) {
      return Fs2_2.r(this, var1);
   }

   @Override
   public R7 L(C0_2 var1) {
      return Fs2_2.E(this, var1);
   }

   @Override
   public R7 v(C0_2 var1) {
      return Fs2_2.w(this, var1);
   }

   @Override
   public R7 H(C0_2 var1) {
      return Fs2_2.F(this, var1);
   }

   public static void Z(int[] var0) {
      g = var0;
   }

   public static int[] U$arrint() {
      return g;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -14039) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 240;
               break;
            case 1:
               var10000 = 208;
               break;
            case 2:
               var10000 = 160;
               break;
            case 3:
               var10000 = 95;
               break;
            case 4:
               var10000 = 205;
               break;
            case 5:
               var10000 = 41;
               break;
            case 6:
               var10000 = 28;
               break;
            case 7:
               var10000 = 251;
               break;
            case 8:
               var10000 = 12;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 62;
               break;
            case 11:
               var10000 = 58;
               break;
            case 12:
               var10000 = 190;
               break;
            case 13:
               var10000 = 130;
               break;
            case 14:
               var10000 = 133;
               break;
            case 15:
               var10000 = 55;
               break;
            case 16:
               var10000 = 17;
               break;
            case 17:
               var10000 = 229;
               break;
            case 18:
               var10000 = 85;
               break;
            case 19:
               var10000 = 168;
               break;
            case 20:
               var10000 = 8;
               break;
            case 21:
               var10000 = 193;
               break;
            case 22:
               var10000 = 225;
               break;
            case 23:
               var10000 = 194;
               break;
            case 24:
               var10000 = 90;
               break;
            case 25:
               var10000 = 89;
               break;
            case 26:
               var10000 = 235;
               break;
            case 27:
               var10000 = 10;
               break;
            case 28:
               var10000 = 245;
               break;
            case 29:
               var10000 = 52;
               break;
            case 30:
               var10000 = 59;
               break;
            case 31:
               var10000 = 188;
               break;
            case 32:
               var10000 = 70;
               break;
            case 33:
               var10000 = 198;
               break;
            case 34:
               var10000 = 137;
               break;
            case 35:
               var10000 = 66;
               break;
            case 36:
               var10000 = 74;
               break;
            case 37:
               var10000 = 132;
               break;
            case 38:
               var10000 = 143;
               break;
            case 39:
               var10000 = 79;
               break;
            case 40:
               var10000 = 154;
               break;
            case 41:
               var10000 = 37;
               break;
            case 42:
               var10000 = 200;
               break;
            case 43:
               var10000 = 227;
               break;
            case 44:
               var10000 = 236;
               break;
            case 45:
               var10000 = 161;
               break;
            case 46:
               var10000 = 24;
               break;
            case 47:
               var10000 = 116;
               break;
            case 48:
               var10000 = 11;
               break;
            case 49:
               var10000 = 7;
               break;
            case 50:
               var10000 = 255;
               break;
            case 51:
               var10000 = 82;
               break;
            case 52:
               var10000 = 13;
               break;
            case 53:
               var10000 = 135;
               break;
            case 54:
               var10000 = 249;
               break;
            case 55:
               var10000 = 35;
               break;
            case 56:
               var10000 = 158;
               break;
            case 57:
               var10000 = 223;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 96;
               break;
            case 60:
               var10000 = 110;
               break;
            case 61:
               var10000 = 123;
               break;
            case 62:
               var10000 = 34;
               break;
            case 63:
               var10000 = 93;
               break;
            case 64:
               var10000 = 119;
               break;
            case 65:
               var10000 = 122;
               break;
            case 66:
               var10000 = 183;
               break;
            case 67:
               var10000 = 252;
               break;
            case 68:
               var10000 = 182;
               break;
            case 69:
               var10000 = 21;
               break;
            case 70:
               var10000 = 215;
               break;
            case 71:
               var10000 = 43;
               break;
            case 72:
               var10000 = 243;
               break;
            case 73:
               var10000 = 196;
               break;
            case 74:
               var10000 = 189;
               break;
            case 75:
               var10000 = 126;
               break;
            case 76:
               var10000 = 237;
               break;
            case 77:
               var10000 = 173;
               break;
            case 78:
               var10000 = 149;
               break;
            case 79:
               var10000 = 98;
               break;
            case 80:
               var10000 = 134;
               break;
            case 81:
               var10000 = 128;
               break;
            case 82:
               var10000 = 174;
               break;
            case 83:
               var10000 = 84;
               break;
            case 84:
               var10000 = 209;
               break;
            case 85:
               var10000 = 140;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 129;
               break;
            case 88:
               var10000 = 46;
               break;
            case 89:
               var10000 = 101;
               break;
            case 90:
               var10000 = 38;
               break;
            case 91:
               var10000 = 114;
               break;
            case 92:
               var10000 = 250;
               break;
            case 93:
               var10000 = 214;
               break;
            case 94:
               var10000 = 42;
               break;
            case 95:
               var10000 = 228;
               break;
            case 96:
               var10000 = 220;
               break;
            case 97:
               var10000 = 61;
               break;
            case 98:
               var10000 = 197;
               break;
            case 99:
               var10000 = 56;
               break;
            case 100:
               var10000 = 49;
               break;
            case 101:
               var10000 = 192;
               break;
            case 102:
               var10000 = 179;
               break;
            case 103:
               var10000 = 76;
               break;
            case 104:
               var10000 = 239;
               break;
            case 105:
               var10000 = 115;
               break;
            case 106:
               var10000 = 202;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 33;
               break;
            case 109:
               var10000 = 244;
               break;
            case 110:
               var10000 = 30;
               break;
            case 111:
               var10000 = 22;
               break;
            case 112:
               var10000 = 171;
               break;
            case 113:
               var10000 = 120;
               break;
            case 114:
               var10000 = 213;
               break;
            case 115:
               var10000 = 121;
               break;
            case 116:
               var10000 = 203;
               break;
            case 117:
               var10000 = 15;
               break;
            case 118:
               var10000 = 64;
               break;
            case 119:
               var10000 = 234;
               break;
            case 120:
               var10000 = 94;
               break;
            case 121:
               var10000 = 109;
               break;
            case 122:
               var10000 = 14;
               break;
            case 123:
               var10000 = 247;
               break;
            case 124:
               var10000 = 224;
               break;
            case 125:
               var10000 = 83;
               break;
            case 126:
               var10000 = 32;
               break;
            case 127:
               var10000 = 206;
               break;
            case 128:
               var10000 = 108;
               break;
            case 129:
               var10000 = 88;
               break;
            case 130:
               var10000 = 2;
               break;
            case 131:
               var10000 = 211;
               break;
            case 132:
               var10000 = 125;
               break;
            case 133:
               var10000 = 150;
               break;
            case 134:
               var10000 = 81;
               break;
            case 135:
               var10000 = 112;
               break;
            case 136:
               var10000 = 91;
               break;
            case 137:
               var10000 = 233;
               break;
            case 138:
               var10000 = 176;
               break;
            case 139:
               var10000 = 127;
               break;
            case 140:
               var10000 = 80;
               break;
            case 141:
               var10000 = 26;
               break;
            case 142:
               var10000 = 105;
               break;
            case 143:
               var10000 = 9;
               break;
            case 144:
               var10000 = 3;
               break;
            case 145:
               var10000 = 20;
               break;
            case 146:
               var10000 = 162;
               break;
            case 147:
               var10000 = 201;
               break;
            case 148:
               var10000 = 195;
               break;
            case 149:
               var10000 = 31;
               break;
            case 150:
               var10000 = 75;
               break;
            case 151:
               var10000 = 181;
               break;
            case 152:
               var10000 = 232;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 163;
               break;
            case 155:
               var10000 = 217;
               break;
            case 156:
               var10000 = 155;
               break;
            case 157:
               var10000 = 142;
               break;
            case 158:
               var10000 = 164;
               break;
            case 159:
               var10000 = 178;
               break;
            case 160:
               var10000 = 185;
               break;
            case 161:
               var10000 = 144;
               break;
            case 162:
               var10000 = 157;
               break;
            case 163:
               var10000 = 51;
               break;
            case 164:
               var10000 = 246;
               break;
            case 165:
               var10000 = 4;
               break;
            case 166:
               var10000 = 19;
               break;
            case 167:
               var10000 = 167;
               break;
            case 168:
               var10000 = 156;
               break;
            case 169:
               var10000 = 44;
               break;
            case 170:
               var10000 = 16;
               break;
            case 171:
               var10000 = 187;
               break;
            case 172:
               var10000 = 97;
               break;
            case 173:
               var10000 = 186;
               break;
            case 174:
               var10000 = 104;
               break;
            case 175:
               var10000 = 65;
               break;
            case 176:
               var10000 = 191;
               break;
            case 177:
               var10000 = 145;
               break;
            case 178:
               var10000 = 169;
               break;
            case 179:
               var10000 = 212;
               break;
            case 180:
               var10000 = 148;
               break;
            case 181:
               var10000 = 78;
               break;
            case 182:
               var10000 = 53;
               break;
            case 183:
               var10000 = 118;
               break;
            case 184:
               var10000 = 210;
               break;
            case 185:
               var10000 = 54;
               break;
            case 186:
               var10000 = 36;
               break;
            case 187:
               var10000 = 6;
               break;
            case 188:
               var10000 = 103;
               break;
            case 189:
               var10000 = 138;
               break;
            case 190:
               var10000 = 218;
               break;
            case 191:
               var10000 = 77;
               break;
            case 192:
               var10000 = 47;
               break;
            case 193:
               var10000 = 106;
               break;
            case 194:
               var10000 = 147;
               break;
            case 195:
               var10000 = 92;
               break;
            case 196:
               var10000 = 87;
               break;
            case 197:
               var10000 = 1;
               break;
            case 198:
               var10000 = 72;
               break;
            case 199:
               var10000 = 73;
               break;
            case 200:
               var10000 = 166;
               break;
            case 201:
               var10000 = 238;
               break;
            case 202:
               var10000 = 29;
               break;
            case 203:
               var10000 = 253;
               break;
            case 204:
               var10000 = 27;
               break;
            case 205:
               var10000 = 86;
               break;
            case 206:
               var10000 = 113;
               break;
            case 207:
               var10000 = 165;
               break;
            case 208:
               var10000 = 177;
               break;
            case 209:
               var10000 = 184;
               break;
            case 210:
               var10000 = 230;
               break;
            case 211:
               var10000 = 67;
               break;
            case 212:
               var10000 = 216;
               break;
            case 213:
               var10000 = 0;
               break;
            case 214:
               var10000 = 204;
               break;
            case 215:
               var10000 = 226;
               break;
            case 216:
               var10000 = 68;
               break;
            case 217:
               var10000 = 111;
               break;
            case 218:
               var10000 = 48;
               break;
            case 219:
               var10000 = 63;
               break;
            case 220:
               var10000 = 242;
               break;
            case 221:
               var10000 = 221;
               break;
            case 222:
               var10000 = 57;
               break;
            case 223:
               var10000 = 60;
               break;
            case 224:
               var10000 = 99;
               break;
            case 225:
               var10000 = 45;
               break;
            case 226:
               var10000 = 231;
               break;
            case 227:
               var10000 = 124;
               break;
            case 228:
               var10000 = 151;
               break;
            case 229:
               var10000 = 175;
               break;
            case 230:
               var10000 = 146;
               break;
            case 231:
               var10000 = 102;
               break;
            case 232:
               var10000 = 222;
               break;
            case 233:
               var10000 = 131;
               break;
            case 234:
               var10000 = 18;
               break;
            case 235:
               var10000 = 180;
               break;
            case 236:
               var10000 = 117;
               break;
            case 237:
               var10000 = 40;
               break;
            case 238:
               var10000 = 71;
               break;
            case 239:
               var10000 = 254;
               break;
            case 240:
               var10000 = 199;
               break;
            case 241:
               var10000 = 23;
               break;
            case 242:
               var10000 = 50;
               break;
            case 243:
               var10000 = 139;
               break;
            case 244:
               var10000 = 136;
               break;
            case 245:
               var10000 = 207;
               break;
            case 246:
               var10000 = 100;
               break;
            case 247:
               var10000 = 219;
               break;
            case 248:
               var10000 = 69;
               break;
            case 249:
               var10000 = 170;
               break;
            case 250:
               var10000 = 152;
               break;
            case 251:
               var10000 = 172;
               break;
            case 252:
               var10000 = 153;
               break;
            case 253:
               var10000 = 39;
               break;
            case 254:
               var10000 = 107;
               break;
            default:
               var10000 = 248;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "Jéú\u007fý\bwá\u001a=O7w\u008c\u000e\u0087êZ[Ã!\u008d¥\u009fè\u0004ì·5\nª¬Ò×\u001eE ]\u008cp\n©^Á\u0092+´\u0016v\u0081\u0007\u000fùä¸ÞSd\u009b|¦óP\u0085¢gI\ní5;\tRð\u0093g\u0097\u0096\fÖã»\u0080T\u00ad\u008f\u0019\f\u008b\u0085¶\u000bÀ\u0081\u009fr·ñ\u0011Ë.³ë\u000b\u0082\u0001öh\u009aù Ì\u0086\u008eí\u0011ÅÇ>Wò8\u009c\u0018\u0014Çÿ\u0099\u009dbA3\b";
      int var4 = "Jéú\u007fý\bwá\u001a=O7w\u008c\u000e\u0087êZ[Ã!\u008d¥\u009fè\u0004ì·5\nª¬Ò×\u001eE ]\u008cp\n©^Á\u0092+´\u0016v\u0081\u0007\u000fùä¸ÞSd\u009b|¦óP\u0085¢gI\ní5;\tRð\u0093g\u0097\u0096\fÖã»\u0080T\u00ad\u008f\u0019\f\u008b\u0085¶\u000bÀ\u0081\u009fr·ñ\u0011Ë.³ë\u000b\u0082\u0001öh\u009aù Ì\u0086\u008eí\u0011ÅÇ>Wò8\u009c\u0018\u0014Çÿ\u0099\u009dbA3\b"
         .length();
      char var1 = 5;
      int var8 = -1;
      Z(null);

      label52:
      while (true) {
         byte var10000 = 49;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 125;
                        break;
                     case 1:
                        var46 = 6;
                        break;
                     case 2:
                        var46 = 66;
                        break;
                     case 3:
                        var46 = 121;
                        break;
                     case 4:
                        var46 = 66;
                        break;
                     case 5:
                        var46 = 86;
                        break;
                     default:
                        var46 = 38;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     b = var5;
                     c = new String[13];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0080ðÒ\u0018²'\u0092Ó`6pNcÀ+UKz»Q\u000eÝ-\u0015\u009cídTùVrÉu³ô";
                  var4 = "\u0080ðÒ\u0018²'\u0092Ó`6pNcÀ+UKz»Q\u000eÝ-\u0015\u009cídTùVrÉu³ô".length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 97;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





