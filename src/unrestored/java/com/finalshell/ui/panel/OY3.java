package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.GA;
import com.finalshell.core.GO;
import com.finalshell.core.Lj2_2;
import com.finalshell.core.PY;
import com.finalshell.core.RV;
import com.finalshell.core.Sa2;
import com.finalshell.core.TI_2;
import com.finalshell.core.U_;
import com.finalshell.core.W2_3;
import com.finalshell.ui.listener.I42;
import com.finalshell.ui.listener.Ol2;
import com.finalshell.ui.model.OB3;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class OY3 extends JComponent implements SwingConstants, W2_3, Sa2 {
   private static Color[] var22;
   private static float[] var20;
   public Insets k;
   public int q;
   public int g;
   public int p;
   public int e;
   public int S;
   public int X;
   public int n;
   public Color P;
   public Color L;
   public boolean M;
   public int v;
   public int b;
   public int s;
   public int T;
   public boolean f;
   public OB3 c;
   public final List y;
   public int t;
   public float O;
   public boolean i;
   public int Q;
   public Shape r;
   public LinearGradientPaint l;
   public Shape R;
   public static boolean N;
   public static long[] a;
   public static Integer[] d;

   public OY3() {
      this(Collections.EMPTY_LIST);
   }

   public OY3(int var1) {
      this(J$List(var1));
   }

   public OY3(String[] var1) {
      this(s(var1));
   }

   public OY3(Component[] var1) {
      this(C(var1));
   }

   public OY3(U_[] var1) {
      this(AL_2.e(var1));
   }

   public OY3(List var1) {
   super();
   boolean var2;
      boolean var10000 = y$boolean();
      this.k = Lj2_2.U;
      this.q = Lj2_2.s;
      this.g = Lj2_2.G;
      this.p = Lj2_2.o;
      this.e = Lj2_2.H;
      this.S = Lj2_2.B;
      this.X = Lj2_2.c;
      this.n = Lj2_2.a;
      this.P = Lj2_2.w;
      this.L = Lj2_2.D;
      this.M = Lj2_2.z;
      this.v = Lj2_2.I;
      this.b = Lj2_2.r;
      this.s = Lj2_2.K;
      this.T = Lj2_2.S;
      this.f = Lj2_2.F;
      this.c = Lj2_2.l;
      this.y = new ArrayList();
      this.t = 0;
      this.O = 0.0F;
      var2 = var10000;
      this.i = false;
      this.Q = 0;
      this.j(var1);
      this.setLayout(new TI_2(this));
      I42 var3 = new I42(this);
      this.addMouseListener(var3);
      this.addMouseMotionListener(var3);
      this.addComponentListener(new Ol2(this));
      if (Ky4.F$arrString() != null) {
         x(!var2);
      }
   }

   public Insets W() {
      return this.k;
   }

   public void A(Insets var1) {
      this.k = var1;
      this.revalidate();
   }

   public void V(int var1, int var2, int var3, int var4) {
      this.A(new Insets(var1, var2, var3, var4));
   }

   public void K(int var1) {
      this.V(var1, var1, var1, var1);
   }

   public int S$int() {
      return this.q;
   }

   public void x$void(int var1) {
      this.q = var1;
      this.revalidate();
   }

   public int T$int() {
      return this.g;
   }

   public void E(int var1) {
      this.g = var1;
      this.revalidate();
   }

   public int w$int() {
      return this.p;
   }

   public void b(int var1) {
      this.p = var1;
      this.repaint();
   }

   public int k$int() {
      return this.e;
   }

   public void C(int var1) {
      this.e = var1;
      this.revalidate();
   }

   public int R$int() {
      return this.S;
   }

   public void f(int var1) {
      this.S = var1;
      this.repaint();
   }

   public int h() {
      return this.X;
   }

   public void a(int var1) {
      this.X = var1;
      this.revalidate();
   }

   public int X$int() {
      return this.n;
   }

   public void G(int var1) {
      this.n = var1;
      this.revalidate();
   }

   public Color N$Color() {
      return this.P;
   }

   public void o(Color var1) {
      this.P = var1;
      this.repaint();
   }

   public Color F$Color() {
      return this.L;
   }

   public void F(Color var1) {
      this.L = var1;
      this.repaint();
   }

   public boolean R$boolean() {
      return this.M;
   }

   public void i(boolean var1) {
      boolean var2;
      OY3 var7;
      label69: {
         label77: {
            var2 = Z();
            boolean var10000 = this.M;
            if (!var2) {
               if (this.M == var1) {
                  return;
               }

               var7 = this;
               if (var2) {
                  break label77;
               }

               this.M = var1;
               var10000 = var1;
            }

            if (var10000) {
               for (U_ var4 : this.y) {
                  if (var2) {
                     break label69;
                  }

                  if (!var2 && var4.j() != null) {
                     this.add(var4.j());
                  }

                  if (var2) {
                     break;
                  }
               }

               if (!var2) {
                  break label69;
               }
            }

            var7 = this;
         }

         for (U_ var6 : var7.y) {
            if (var2) {
               return;
            }

            if (var6.j() != null) {
               this.remove(var6.j());
            }

            if (var2) {
               break;
            }
         }
      }

      this.revalidate();
   }

   public int o() {
      return this.v;
   }

   public void O$void(int var1) {
      this.v = var1;
      this.revalidate();
   }

   public int q() {
      return this.b;
   }

   public void P(int var1) {
      this.b = var1;
      this.revalidate();
   }

   public int F$int() {
      return this.s;
   }

   public void z(int var1) {
      this.s = var1;
      this.revalidate();
   }

   public int t() {
      return this.T;
   }

   public void g(int var1) {
      this.T = var1;
      this.revalidate();
   }

   public boolean w$boolean() {
      return this.f;
   }

   public void h(boolean var1) {
      this.f = var1;
   }

   public OB3 r() {
      return this.c;
   }

   public void d(OB3 var1) {
      this.c = var1;
   }

   public int y$int() {
      return this.y.size();
   }

   public List k$List() {
      return AL_2.J((Collection)this.y);
   }

   public U_ J$u_(int var1) {
      return (U_)this.y.get(var1);
   }

   public void Y(String[] var1) {
      this.j(s(var1));
   }

   public void J(Component[] var1) {
      this.j(C(var1));
   }

   public void j(List var1) {
      this.X$void();
      this.v(var1);
   }

   public void K(String[] var1) {
      if (var1 != null) {
         this.v(s(var1));
      }
   }

   public void R(Component[] var1) {
      if (var1 != null) {
         this.v(C(var1));
      }
   }

   public void v(List var1) {
      boolean var2;
      var2 = Z();
      List var10000 = var1;
      if (!var2) {
         if (var1 == null) {
            return;
         }

         var10000 = this.y;
      }

      var10000.addAll(var1);
      OY3 var5 = this;
      if (!var2) {
         label39:
         if (this.M) {
            for (U_ var4 : var1) {
               if (var2) {
                  break label39;
               }

               if (!var2 && var4.j() != null) {
                  this.add(var4.j());
               }

               if (var2) {
                  break;
               }
            }

            this.revalidate();
         }

         var5 = this;
      }

      var5.L();
   }

   public void s(int var1) {
      this.c(this.J$u_(var1));
   }

   public void c(U_ var1) {
      this.t(var1);
      this.revalidate();
   }

   public void I(int var1) {
      this.X$void();
      this.v(J$List(var1));
      this.revalidate();
   }

   public void X$void() {
      boolean var1 = y$boolean();
      List var10000 = this.y;
      if (var1) {
         if (this.y.size() <= 0) {
            return;
         }

         var10000 = this.y;
      }

      for (U_ var3 : AL_2.J((Collection)var10000)) {
         this.t(var3);
         if (!var1) {
            break;
         }
      }
   }

   public void t(U_ var1) {
      boolean var2;
      var2 = y$boolean();
      if (var2) {
         if (this.M) {
            Component var3 = var1.j();
            if (!var2) {
               return;
            }

            if (var3 != null) {
               var3.getParent().remove(var3);
            }
         }

         this.y.remove(var1);
      }

      this.L();
   }

   public U_ M$u_() {
      return (U_)this.y.get(this.V());
   }

   public void v(U_ var1) {
      this.d$void(this.y.indexOf(var1));
   }

   public int V() {
      return this.t;
   }

   public void d$void(int var1) {
      boolean var2;
      var2 = y$boolean();
      int var10000 = var1;
      if (var2) {
         if (var1 == this.t) {
            return;
         }

         var10000 = var1;
      }

      if (var2) {
         if (var10000 < 0) {
            var1 = 0;
         }

         var10000 = var1;
      }

      label26: {
         int var10001 = this.y.size();
         if (var2) {
            if (var10000 < var10001) {
               break label26;
            }

            var10000 = this.y.size();
            var10001 = 1;
         }

         var1 = var10000 - var10001;
      }

      this.t = var1;
      this.O = 0.0F;
      this.j();
   }

   public void L() {
      OY3 var2;
      boolean var1 = Z();
      int var10000 = this.t;
      if (!var1) {
         if (this.t >= this.y$int()) {
            this.d$void(this.y$int() - 1);
         }

         var10000 = this.t;
      }

      label33: {
         if (!var1) {
            if (var10000 >= 0) {
               return;
            }

            var2 = this;
            if (var1) {
               break label33;
            }

            var10000 = this.y$int();
         }

         if (var10000 <= 0) {
            return;
         }

         var2 = this;
      }

      var2.d$void(0);
   }

   public float O$float() {
      return this.O;
   }

   public void o(float var1) {
      boolean var2;
      var2 = Z();
      float var6;
      int var10000 = (var6 = var1 - this.O) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (!var2) {
         if (var10000 == 0) {
            return;
         }

         float var7;
         var10000 = (var7 = var1 - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      label44: {
         if (!var2) {
            if (var10000 < 0) {
               float var3 = Math.abs(var1);
               int var4 = this.t - Math.round(var3 - var3 % 1.0F) - 1;
               var1 = var4 < 0 ? 0.0F : 1.0F - var3 % 1.0F;
               this.d$void(var4);
               if (!var2) {
                  break label44;
               }
            }

            float var8;
            var10000 = (var8 = var1 - 1.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
         }

         if (!var2) {
            if (var10000 < 0) {
               break label44;
            }

            var10000 = this.t + Math.round(var1 - var1 % 1.0F);
         }

         int var5 = var10000;
         var1 = var5 >= this.y.size() ? 0.0F : var1 % 1.0F;
         this.d$void(var5);
      }

      this.O = var1;
      this.j();
   }

   public float N$float() {
      return ((float)this.t + this.O) / (float)(this.y.size() - 1);
   }

   public float M(Point var1) {
      boolean var2;
      int var4;
      var2 = y$boolean();
      int var10000 = this.v;
      if (var2) {
         var10000 = this.v == 0 ? 1 : 0;
      }

      int var3 = var10000;
      var4 = (int)(this.T$Point());
      Point var5 = this.J();
      float var6 = (float)this.O$int();
      var10000 = var3;
      if (var2) {
         if (var3 != 0) {
            var10000 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
            if (var2) {
               if (var10000 != 0) {
                  var10000 = var1.x;
                  int var11 = var4.x;
                  if (var2) {
                     if (var1.x < var4.x) {
                        return 0.0F;
                     }

                     var10000 = var1.x;
                     var11 = var5.x;
                  }

                  if (var2) {
                     if (var10000 > var11) {
                        return (float)(this.y.size() - 1);
                     }

                     var10000 = this.y.size() - 1;
                     var11 = var1.x - var4.x;
                  }

                  return (float)(var10000 * var11) / var6;
               }

               var10000 = var1.x;
            }

            int var10 = var4.x;
            if (var2) {
               if (var10000 > var4.x) {
                  return 0.0F;
               }

               var10000 = var1.x;
               var10 = var5.x;
            }

            if (var2) {
               if (var10000 < var10) {
                  return (float)(this.y.size() - 1);
               }

               var10000 = this.y.size();
               var10 = 1;
            }

            return (float)(var10000 - var10) * (var6 - (float)(var1.x - var5.x)) / var6;
         }

         var10000 = var1.y;
      }

      int var10001 = var4.y;
      if (var2) {
         if (var10000 < var4.y) {
            return 0.0F;
         }

         var10000 = var1.y;
         var10001 = var5.y;
      }

      if (var2) {
         if (var10000 > var10001) {
            return (float)(this.y.size() - 1);
         }

         var10000 = this.y.size() - 1;
         var10001 = var1.y - var4.y;
      }

      return (float)(var10000 * var10001) / var6;
   }

   public void N(float var1) {
      var1 = (float)(this.y.size() - 1) * var1;
      this.d$void(Math.round(var1 - var1 % 1.0F));
      this.o(var1 % 1.0F);
   }

   @Override
   public void paintComponent(Graphics var1) {
      Graphics2D var2;
      super.paintComponent(var1);
      var2 = (Graphics2D)var1;
      Object var3 = RV.X(var2);
      GA.i(var2, this, this.X$Shape(), GO.r, this.q, true, true);
      var2.setPaint(this.u());
      var2.fill(this.I());
      RV.X(var2, var3);
   }

   @Override
   public Shape B() {
      return this.X$Shape();
   }

   public void g() {
      this.r = null;
      this.repaint();
   }

   public void j() {
      this.l = null;
      this.R = null;
      this.repaint();
   }

   public void P() {
      this.r = null;
      this.l = null;
      this.R = null;
      this.repaint();
   }

   public Shape X$Shape() {
      boolean var1 = Z();
      Shape var10000 = this.r;
      if (!var1) {
         if (this.r == null) {
            this.r = this.S$Shape();
         }

         var10000 = this.r;
      }

      return var10000;
   }

   public Shape S$Shape() {
      Area var2;
      Area var4;
      boolean var10000 = Z();
      var2 = new Area(this.C());
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.y.size()) {
            var4 = var2;
            if (var1) {
               break;
            }

            var2.add(new Area(this.H$Shape(var3)));
            var3++;
            if (!var1) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public Shape H$Shape(int var1) {
      Point var2 = this.S$Point(var1);
      return (Shape)(this.p * 2 >= this.g
         ? new Double((double)(var2.x - this.g / 2), (double)(var2.y - this.g / 2), (double)this.g, (double)this.g)
         : new java.awt.geom.RoundRectangle2D.Double(
            (double)(var2.x - this.g / 2), (double)(var2.y - this.g / 2), (double)this.g, (double)this.g, (double)(this.p * 2), (double)(this.p * 2)
         ));
   }

   public LinearGradientPaint u() {
      boolean var1 = y$boolean();
      LinearGradientPaint var10000 = this.l;
      if (var1) {
         if (this.l == null) {
            this.l = this.y$LinearGradientPaint();
         }

         var10000 = this.l;
      }

      return var10000;
   }

   public LinearGradientPaint y$LinearGradientPaint() {
      float var18;
      Color var7;
      Color var15;
      int var10000 = (y$boolean()) ? 1 : 0;
      Point var2 = this.T$Point();
      boolean var1 = (var10000) != 0;
      float var3 = (float)this.t + this.O;
      int var4 = this.y.size() - 1;
      var10000 = var4;
      if (var1) {
         var10000 = var4 > 0 ? this.O$int() / var4 : 0;
      }

      int var5;
      float var6;
      label62: {
         var5 = var10000;
         var6 = (float)this.e * 1.5F + (float)var5 * var3;
         OY3 var14 = this;
         if (var1) {
            if (this.isEnabled()) {
               var15 = this.P;
               break label62;
            }

            var14 = this;
         }

         var15 = var14.L;
      }

      var7 = var15;
      var10000 = this.v;
      if (var1) {
         if (this.v == 0) {
            byte var12;
            label52: {
               var12 = (byte)((this.getComponentOrientation().isLeftToRight()) ? 1 : 0);
               var10000 = var12;
               if (var1) {
                  if (var12 != 0) {
                     var18 = (float)(var2.x - this.e / 2);
                     break label52;
                  }

                  var10000 = var2.x + this.e / 2;
               }

               var18 = (float)var10000 - var6;
            }

            float var9;
            label46: {
               var9 = var18;
               byte var19 = var12;
               if (var1) {
                  if (var12 != 0) {
                     var20 = new float[]{0.0F, ((float)this.e + (float)var5 * var3) / var6, 1.0F};
                     break label46;
                  }

                  var19 = 3;
               }

               var20 = new float[var19];
               var20[0] = 0.0F;
               var20[1] = 1.0F - ((float)this.e + (float)var5 * var3) / var6;
               var20[2] = 1.0F;
            }

            float[] var10;
            label40: {
               var10 = var20;
               byte var21 = var12;
               if (var1) {
                  if (var12 != 0) {
                     var22 = new Color[]{var7, var7, GO.l};
                     break label40;
                  }

                  var21 = 3;
               }

               var22 = new Color[var21];
               var22[0] = GO.l;
               var22[1] = var7;
               var22[2] = var7;
            }

            Color[] var11 = var22;
            return new LinearGradientPaint(var9, 0.0F, var9 + var6, 0.0F, var10, var11);
         }

         var10000 = var2.y - this.e / 2;
      }

      float var8 = (float)var10000;
      return new LinearGradientPaint(
         0.0F, var8, 0.0F, var8 + var6, new float[]{0.0F, ((float)this.e + (float)var5 * var3) / var6, 1.0F}, new Color[]{var7, var7, GO.l}
      );
   }

   public Shape I() {
      boolean var1 = y$boolean();
      Shape var10000 = this.R;
      if (var1) {
         if (this.R == null) {
            this.R = this.K();
         }

         var10000 = this.R;
      }

      return var10000;
   }

   public Shape K() {
      Area var2;
      Area var4;
      boolean var10000 = Z();
      var2 = new Area(this.e());
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.y.size()) {
            var4 = var2;
            if (var1) {
               break;
            }

            var2.add(new Area(this.p$Shape(var3)));
            var3++;
            if (!var1) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public Shape p$Shape(int var1) {
      Point var2 = this.S$Point(var1);
      return (Shape)(this.S * 2 >= this.e
         ? new Double((double)(var2.x - this.e / 2), (double)(var2.y - this.e / 2), (double)this.e, (double)this.e)
         : new java.awt.geom.RoundRectangle2D.Double(
            (double)(var2.x - this.e / 2), (double)(var2.y - this.e / 2), (double)this.e, (double)this.e, (double)(this.S * 2), (double)(this.S * 2)
         ));
   }

   public Shape C() {
      int var4;
      int var10000 = (y$boolean()) ? 1 : 0;
      Point var2 = this.T$Point();
      boolean var1 = (var10000) != 0;
      Point var3 = this.J();
      var10000 = this.v;
      if (var1) {
         if (this.v != 0) {
            return new java.awt.geom.Rectangle2D.Double(
               (double)((float)var2.x - (float)this.X / 2.0F), (double)var2.y, (double)this.X, (double)(var3.y - var2.y)
            );
         }

         var10000 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      }

      var4 = var10000;
      return new java.awt.geom.Rectangle2D.Double(
         var4 != 0 ? (double)var2.x : (double)var3.x,
         (double)((float)var2.y - (float)this.X / 2.0F),
         var4 != 0 ? (double)(var3.x - var2.x) : (double)(var2.x - var3.x),
         (double)this.X
      );
   }

   public Shape e() {
      int var4;
      int var10000 = (Z()) ? 1 : 0;
      Point var2 = this.T$Point();
      boolean var1 = (var10000) != 0;
      Point var3 = this.J();
      var10000 = this.v;
      if (!var1) {
         if (this.v != 0) {
            return new java.awt.geom.Rectangle2D.Double(
               (double)((float)var2.x + 0.5F - (float)this.n / 2.0F), (double)var2.y, (double)this.n, (double)(var3.y - var2.y)
            );
         }

         var10000 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      }

      var4 = var10000;
      return new java.awt.geom.Rectangle2D.Double(
         var4 != 0 ? (double)var2.x : (double)var3.x,
         (double)((float)var2.y + 0.5F - (float)this.n / 2.0F),
         var4 != 0 ? (double)(var3.x - var2.x) : (double)(var2.x - var3.x),
         (double)this.n
      );
   }

   public Point T$Point() {
      return this.S$Point(0);
   }

   public Point J() {
      return this.S$Point(this.y.size() - 1);
   }

   public Point S$Point(int var1) {
      int var18;
      boolean var2;
      Dimension var3 = this.U().L();
      int var10000 = (Z()) ? 1 : 0;
      byte var4 = (byte)((this.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      var2 = (var10000) != 0;
      int var5 = this.y.size() - 1;
      var10000 = this.v;
      if (!var2) {
         if (this.v == 0) {
            label108: {
               var10000 = var5;
               if (!var2) {
                  if (var5 <= 0) {
                     var10000 = 0;
                     break label108;
                  }

                  var10000 = this.O$int();
               }

               int var29;
               label85: {
                  var29 = var4;
                  if (!var2) {
                     if (var4 != 0) {
                        var29 = var1;
                        break label85;
                     }

                     var29 = var5;
                  }

                  var29 -= var1;
               }

               var10000 = var10000 * var29 / var5;
            }

            int var13 = var10000;
            int var14 = this.k.left + this.Q + var13;
            int var15 = this.getHeight() - this.k.top - this.k.bottom;
            int var30 = var3.height;
            if (!var2) {
               var30 = var3.height > 0 ? this.s : 0;
            }

            int var16 = var3.height + var30;
            int var17 = var16 + this.g + this.q * 2;
            var10000 = this.b;
            if (!var2) {
               var10000 = this.b == a(8665, 9126392506985866727L) ? 1 : 0;
            }

            var18 = var10000;
            var10000 = this.k.top + var15 / 2 - var17 / 2;
            var30 = var18;
            if (!var2) {
               var30 = var18 != 0 ? var16 : 0;
            }

            int var19 = var10000 + var30 + this.q + this.g / 2;
            return new Point(var14, var19);
         }

         var10000 = var5;
      }

      if (!var2) {
         var10000 = var10000 > 0 ? this.O$int() * var1 / var5 : 0;
      }

      int var6 = var10000;
      int var7 = this.k.top + this.Q + var6;
      int var8 = this.getWidth() - this.k.left - this.k.right;
      int var10001 = var3.width;
      if (!var2) {
         var10001 = var3.width > 0 ? this.s : 0;
      }

      int var9;
      int var10;
      label100: {
         var9 = var3.width + var10001;
         var10 = var9 + this.g + this.q * 2;
         var10000 = var4;
         if (!var2) {
            if (var4 != 0) {
               var10000 = this.b;
               if (!var2) {
                  var10000 = this.b == a(10896, 7841008706659741356L) ? 1 : 0;
               }
               break label100;
            }

            var10000 = this.b;
         }

         if (!var2) {
            var10000 = var10000 == a(20142, 5809520768553486993L) ? 1 : 0;
         }
      }

      int var11 = var10000;
      var10000 = this.k.left + var8 / 2 - var10 / 2;
      var10001 = var11;
      if (!var2) {
         var10001 = var11 != 0 ? var9 : 0;
      }

      int var12 = var10000 + var10001 + this.q + this.g / 2;
      return new Point(var12, var7);
   }

   public int O$int() {
      boolean var1 = Z();
      int var10000 = this.v;
      if (!var1) {
         if (this.v == 0) {
            return this.getWidth() - this.Q * 2 - this.k.left - this.k.right - 1;
         }

         var10000 = this.getHeight() - this.Q * 2 - this.k.top - this.k.bottom;
      }

      return var10000 - 1;
   }

   public int k(Point var1) {
      boolean var2;
      byte var10000 = (byte)((y$boolean()) ? 1 : 0);
      int var3 = 0;
      var2 = ((boolean)var10000) != 0;

      while (true) {
         if (var3 < this.y.size()) {
            var10000 = (byte)((this.H$Shape(var3).contains(var1)) ? 1 : 0);
            if (!var2) {
               break;
            }

            if (!var2) {
               return var10000;
            }

            if (var10000 != 0) {
               return var3;
            }

            var3++;
            if (var2) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   public int M$int() {
      return PY.f(this);
   }

   public OY3 S$oY_3(int var1) {
      return (OY3)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public OY3 o(int var1) {
      return (OY3)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public OY3 F(int var1) {
      return (OY3)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public OY3 T(int var1) {
      return (OY3)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public OY3 H$oY_3(int var1) {
      return (OY3)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public OY3 V$oY_3(int var1) {
      return (OY3)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public OY3 V(int var1, int var2) {
      return (OY3)PY.O(this, var1, var2);
   }

   public TI_2 U() {
      return (TI_2)this.getLayout();
   }

   public static List s(String[] var0) {
      ArrayList var2;
      ArrayList var7;
      var2 = new ArrayList();
      boolean var10000 = y$boolean();
      String[] var3 = var0;
      boolean var1 = var10000;
      int var4 = var0.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            String var6 = var3[var5];
            var7 = var2;
            if (!var1) {
               break;
            }

            var2.add(new U_(var6));
            var5++;
            if (var1) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static List C(Component[] var0) {
      ArrayList var2;
      ArrayList var7;
      var2 = new ArrayList();
      boolean var10000 = y$boolean();
      Component[] var3 = var0;
      int var4 = var0.length;
      boolean var1 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Component var6 = var3[var5];
            var7 = var2;
            if (!var1) {
               break;
            }

            var2.add(new U_(var6));
            var5++;
            if (var1) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static List J$List(int var0) {
      ArrayList var2;
      ArrayList var4;
      boolean var10000 = y$boolean();
      var2 = new ArrayList(var0);
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var0) {
            var4 = var2;
            if (!var1) {
               break;
            }

            var2.add(new U_());
            var3++;
            if (var1) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   @Override
   public Component W(int var1, int var2) {
      return this.V(var1, var2);
   }

   public Component d$Component(int var1) {
      return this.V$oY_3(var1);
   }

   public Component p$Component(int var1) {
      return this.H$oY_3(var1);
   }

   @Override
   public Component D(int var1) {
      return this.T(var1);
   }

   public Component V$Component(int var1) {
      return this.F(var1);
   }

   public Component x$Component(int var1) {
      return this.o(var1);
   }

   public Component O$Component(int var1) {
      return this.S$oY_3(var1);
   }

   public static void x(boolean var0) {
      N = var0;
   }

   public static boolean y$boolean() {
      return N;
   }

   public static boolean Z() {
      boolean var0 = y$boolean();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17470;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      int var2;
      byte[] var7;
      long var0 = 2323685241019508444L;
      long[] var6 = new long[3];
      int var3 = 0;
      x(true);
      String var4 = "Oá[§ódÃ1\u008bKëª\u008c+¬F~\u0085e\u0002AûÈz";
      int var5 = "Oá[§ódÃ1\u008bKëª\u008c+¬F~\u0085e\u0002AûÈz".length();
      var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      d = new Integer[3];
   }
}





