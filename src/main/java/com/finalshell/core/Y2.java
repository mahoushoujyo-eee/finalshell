package com.finalshell.core;

import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class Y2 extends Lz2_2 implements Wt4 {
   public boolean l = V_3.d;
   public boolean q = V_3.S;
   public int t = V_3.o;
   public Insets k = V_3.X;
   public Color J = V_3.T;
   public Color e = V_3.v;
   public Color F = V_3.C;
   public Color W = V_3.z;
   public Color h;
   public Color R;
   public Color G;
   public Color x;
   public Color O;
   public Color b;
   public boolean Y;
   public WC_2 Q;
   public float D;
   public boolean C;
   public boolean p;
   public boolean L;
   public Rectangle v;
   public Rectangle K;
   public Insets i;
   public Insets m;
   public Insets j;
   public MouseAdapter n;

   public Y2() {
      this.h = V_3.O;
      this.R = V_3.e;
      this.G = V_3.G;
      this.x = V_3.M;
      this.O = V_3.h;
      this.b = V_3.a;
   }

   public void T(JScrollBar var1) {
      super.A(var1);
      this.Y = true;
      this.n = new com.finalshell.ui.listener.I2(this);
      var1.addMouseListener(this.n);
      var1.addMouseMotionListener(this.n);
   }

   public void C(JScrollBar var1) {
      var1.removeMouseListener(this.n);
      var1.removeMouseMotionListener(this.n);
      super.X(var1);
   }

   public boolean C() {
      return this.l;
   }

   @Override
   public void R(boolean var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.l == var1) {
            return;
         }

         this.l = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean z() {
      return this.q;
   }

   @Override
   public void G(boolean var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.q == var1) {
            return;
         }

         this.q = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public int s$int() {
      return this.t;
   }

   public void t(int var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.t == var1) {
            return;
         }

         this.t = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Insets N$Insets() {
      return this.k;
   }

   public void w(Insets var1) {
      Y2 var3;
      label26: {
         int[] var2 = W_2.B$arrint();
         Insets var10000 = this.k;
         if (var2 == null) {
            if (this.k != var1) {
               this.k = var1;
               this.s$void();
               this.p();
               if (var2 == null) {
                  return;
               }
            }

            var3 = this;
            if (var2 != null) {
               break label26;
            }

            var10000 = this.i;
         }

         if (var10000 != null) {
            return;
         }

         var3 = this;
      }

      var3.s$void();
   }

   public void s$void() {
      this.i = new Insets(this.k.top, this.k.right, this.k.bottom, this.k.left);
      this.m = new Insets(this.k.left, this.k.bottom, this.k.right, this.k.top);
      this.j = new Insets(this.k.right, this.k.top, this.k.left, this.k.bottom);
   }

   public Color n() {
      return this.J;
   }

   public void I(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.J == var1) {
            return;
         }

         this.J = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color N$Color() {
      return this.e;
   }

   public void a(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.e == var1) {
            return;
         }

         this.e = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color H() {
      return this.F;
   }

   public void F(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.F == var1) {
            return;
         }

         this.F = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color m() {
      return this.W;
   }

   public void r(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.W == var1) {
            return;
         }

         this.W = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color W() {
      return this.h;
   }

   public void i(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.h == var1) {
            return;
         }

         this.h = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color J() {
      return this.R;
   }

   public void Z(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.R == var1) {
            return;
         }

         this.R = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color Z() {
      return this.G;
   }

   public void h(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.G == var1) {
            return;
         }

         this.G = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color x() {
      return this.x;
   }

   public void t(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.x == var1) {
            return;
         }

         this.x = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color V() {
      return this.O;
   }

   public void w(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.O == var1) {
            return;
         }

         this.O = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Color E() {
      return this.b;
   }

   public void N(Color var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.b == var1) {
            return;
         }

         this.b = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public boolean O() {
      return this.C;
   }

   public void P(boolean var1) {
      Y2 var3;
      label53: {
         int[] var2 = W_2.B$arrint();
         boolean var10000 = this.C;
         if (var2 == null) {
            if (this.C == var1) {
               return;
            }

            this.C = var1;
            var3 = this;
            if (var2 != null) {
               break label53;
            }

            var10000 = this.Y;
         }

         if (var10000) {
            if (var1) {
               var3 = this;
               if (var2 == null) {
                  if (this.Q != null) {
                     this.Q.Y();
                  }

                  var3 = this;
               }

               var3.p();
               if (var2 == null) {
                  return;
               }
            }

            if (var2 == null) {
               if (this.Q == null) {
                  this.Q = new WC_2(GO.q, new com.finalshell.ui.listener.P(this));
               }

               this.D = 1.0F;
               this.Q.u$WC();
            }

            if (var2 == null) {
               return;
            }
         }

         var3 = this;
      }

      var3.D = var1 ? 1.0F : 0.0F;
      this.p();
   }

   public boolean P() {
      return this.p;
   }

   public void I(boolean var1) {
      int[] var2 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var2 == null) {
         if (this.p == var1) {
            return;
         }

         this.p = var1;
         var10000 = this;
      }

      var10000.p();
   }

   @Override
   public void j(boolean var1) {
      this.L = var1;
   }

   @Override
   public void R(Rectangle var1) {
      this.v = var1;
   }

   @Override
   public void j(Rectangle var1) {
      this.K = var1;
   }

   public Boolean O(JScrollBar var1) {
      return this.q;
   }

   public Insets K(JScrollBar var1) {
      int[] var2 = W_2.B$arrint();
      int var10000 = (this.q) ? 1 : 0;
      if (var2 == null) {
         if (!this.q) {
            return null;
         }

         var10000 = var1.getOrientation();
      }

      if (var2 == null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var3 = var10000;
      return new Insets(var3 != 0 ? 1 : 0, var3 != 0 ? 0 : 1, 0, 0);
   }

   public void V(Graphics2D var1, Rectangle var2, JScrollBar var3) {
      Object var4 = RV.X(var1);
      this.E(var1, var3, this.K);
      this.v(var1, this.K);
      RV.X(var1, var4);
   }

   public void v(Graphics2D var1, Rectangle var2) {
   }

   public void O(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      label43: {
         int[] var4 = W_2.B$arrint();
         int var10000 = (this.q) ? 1 : 0;
         if (var4 == null) {
            if (!this.q) {
               return;
            }

            var1.setPaint(this.e);
            var1.fillRect(var3.x, var3.y, var3.width, var3.height);
            if (var4 != null) {
               break label43;
            }

            var10000 = var2.getOrientation();
         }

         if (var10000 == 1) {
            label27: {
               byte var5 = (var2.getComponentOrientation().isLeftToRight()) ? 1 : 0;
               var10000 = var5;
               if (var4 == null) {
                  if (var5 != 0) {
                     var10000 = var3.x;
                     break label27;
                  }

                  var10000 = var3.x + var3.width;
               }

               var10000 -= 1;
            }

            int var6 = var10000;
            var1.setColor(this.J);
            var1.drawLine(var6, var3.y, var6, var3.height - 1);
            if (var4 == null) {
               return;
            }
         }

         var1.setColor(this.J);
      }

      var1.drawLine(var3.x, var3.y, var3.x + var3.width - 1, var3.y);
   }

   public void Z(Graphics2D var1, JScrollBar var2, Rectangle var3) {
   }

   public void E(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      Insets var4 = this.v(var2);
      int var5 = var3.width - var4.left - var4.right;
      int var6 = var3.height - var4.top - var4.bottom;
      int var7 = Gw2.G(new int[]{this.t, var5 - 1, var6 - 1});
      var1.setPaint(this.c(var2));
      var1.fillRoundRect(var3.x + var4.left, var3.y + var4.top, var5, var6, var7, var7);
      var1.setPaint(this.o(var2));
      var1.drawRoundRect(var3.x + var4.left, var3.y + var4.top, var5 - 1, var6 - 1, var7, var7);
   }

   public Insets v(JScrollBar var1) {
      return (Insets)Registry.lookupField(118658416480315900L).get(null);
   }

   public Color o(JScrollBar var1) {
      int[] var2 = W_2.B$arrint();
      boolean var10000 = var1.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return this.h;
         }

         if (var2 != null) {
            return this.O;
         }

         var10000 = this.p;
      }

      if (!var10000) {
         var10000 = this.L;
         if (var2 == null) {
            if (this.L) {
               return this.O;
            }

            if (var2 != null) {
               return P9.N(this.F, this.G, this.D);
            }

            var10000 = this.C;
         }

         return var10000 ? this.G : P9.N(this.F, this.G, this.D);
      } else {
         return this.O;
      }
   }

   public Color c(JScrollBar var1) {
      int[] var2 = W_2.B$arrint();
      boolean var10000 = var1.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return this.R;
         }

         if (var2 != null) {
            return this.b;
         }

         var10000 = this.p;
      }

      if (!var10000) {
         var10000 = this.L;
         if (var2 == null) {
            if (this.L) {
               return this.b;
            }

            if (var2 != null) {
               return P9.N(this.W, this.x, this.D);
            }

            var10000 = this.C;
         }

         return var10000 ? this.x : P9.N(this.W, this.x, this.D);
      } else {
         return this.b;
      }
   }

   public void p() {
      int[] var1 = W_2.B$arrint();
      Y2 var10000 = this;
      if (var1 == null) {
         if (this.K != null) {
            this.M(this.K);
            if (var1 == null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.l();
   }

   @Override
   public Insets B(JComponent var1) {
      return this.K((JScrollBar)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.O((JScrollBar)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.C((JScrollBar)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.T((JScrollBar)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.V(var1, var2, (JScrollBar)var3);
   }
}





