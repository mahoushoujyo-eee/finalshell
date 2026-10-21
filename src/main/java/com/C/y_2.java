package com.C;

import com.GO;
import com.Gw_2;
import com.P9;
import com.RV;
import com._V;
import com.wt_4;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class y_2 extends com.Lz_2 implements wt_4 {
   protected boolean l = _V.d;
   protected boolean q = _V.S;
   protected int t = _V.o;
   protected Insets k = _V.X;
   protected Color J = _V.T;
   protected Color e = _V.v;
   protected Color F = _V.C;
   protected Color W = _V.z;
   protected Color h;
   protected Color R;
   protected Color G;
   protected Color x;
   protected Color O;
   protected Color b;
   protected boolean Y;
   protected com.WC Q;
   protected float D;
   protected boolean C;
   protected boolean p;
   protected boolean L;
   protected Rectangle v;
   protected Rectangle K;
   protected Insets i;
   protected Insets m;
   protected Insets j;
   protected MouseAdapter n;

   public y_2() {
      this.h = _V.O;
      this.R = _V.e;
      this.G = _V.G;
      this.x = _V.M;
      this.O = _V.h;
      this.b = _V.a;
   }

   public void T(JScrollBar var1) {
      super.A(var1);
      this.Y = true;
      this.n = new i_2(this);
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
      if (var2 == null) {
         if (this.q == var1) {
            return;
         }

         this.q = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public int s() {
      return this.t;
   }

   public void t(int var1) {
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
      if (var2 == null) {
         if (this.t == var1) {
            return;
         }

         this.t = var1;
         var10000 = this;
      }

      var10000.p();
   }

   public Insets N() {
      return this.k;
   }

   public void w(Insets var1) {
      com.C.y_2 var3;
      label26: {
         int[] var2 = com.C.W.B();
         Insets var10000 = this.k;
         if (var2 == null) {
            if (this.k != var1) {
               this.k = var1;
               this.s();
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

      var3.s();
   }

   protected void s$void() {
      this.i = new Insets(this.k.top, this.k.right, this.k.bottom, this.k.left);
      this.m = new Insets(this.k.left, this.k.bottom, this.k.right, this.k.top);
      this.j = new Insets(this.k.right, this.k.top, this.k.left, this.k.bottom);
   }

   public Color n() {
      return this.J;
   }

   public void I(Color var1) {
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      com.C.y_2 var3;
      label53: {
         int[] var2 = com.C.W.B();
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
                  this.Q = new com.WC(GO.q, new com.C.P(this));
               }

               this.D = 1.0F;
               this.Q.u();
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
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
      int[] var2 = com.C.W.B();
      int var10000 = this.q;
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

   protected void v(Graphics2D var1, Rectangle var2) {
   }

   protected void O(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      label43: {
         int[] var4 = com.C.W.B();
         int var10000 = this.q;
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
               byte var5 = var2.getComponentOrientation().isLeftToRight();
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

   protected void Z(Graphics2D var1, JScrollBar var2, Rectangle var3) {
   }

   protected void E(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      Insets var4 = this.v(var2);
      int var5 = var3.width - var4.left - var4.right;
      int var6 = var3.height - var4.top - var4.bottom;
      int var7 = Gw_2.G(new int[]{this.t, var5 - 1, var6 - 1});
      var1.setPaint(this.c(var2));
      var1.fillRoundRect(var3.x + var4.left, var3.y + var4.top, var5, var6, var7, var7);
      var1.setPaint(this.o(var2));
      var1.drawRoundRect(var3.x + var4.left, var3.y + var4.top, var5 - 1, var6 - 1, var7, var7);
   }

   protected Insets v(JScrollBar var1) {
      return (Insets)com.c.c(118658416480315900L).get(null);
   }

   protected Color o(JScrollBar var1) {
      int[] var2 = com.C.W.B();
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

   protected Color c(JScrollBar var1) {
      int[] var2 = com.C.W.B();
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
      int[] var1 = com.C.W.B();
      com.C.y_2 var10000 = this;
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
   public Boolean d(JComponent var1) {
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





