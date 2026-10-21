package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.LookAndFeel;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;

public class _n_2 extends BasicSliderUI implements com.L0 {
   protected Color R;
   protected Color G;
   protected int L;
   protected int O;
   protected int c;
   protected boolean D;
   protected Color f;
   protected Color h;
   protected Color N;
   protected int a;
   protected int F;
   protected boolean T;
   protected Color e;
   protected Color I;
   protected int b;
   protected int M;
   protected int u;
   protected int K;
   protected boolean Y;
   protected boolean Q;
   protected int l;
   protected boolean g;
   protected boolean t;
   protected Insets n;
   protected com.og_4 q;
   protected boolean p;
   protected PropertyChangeListener P;
   protected MouseWheelListener S;
   protected ChangeListener w;
   protected MouseAdapter z;
   protected boolean y;
   protected int B;
   protected com.WC v;
   private static int r;
   private static final String[] d;
   private static final String[] i;
   private static final long j;

   public _n_2(JSlider var1) {
      super(var1);
      this.R = pM_3.h;
      this.G = pM_3.a;
      this.L = pM_3.r;
      this.O = pM_3.J;
      this.c = pM_3.G;
      this.D = pM_3.D;
      this.f = pM_3.R;
      this.h = pM_3.g;
      this.N = pM_3.c;
      this.a = pM_3.S;
      this.F = pM_3.b;
      this.T = pM_3.p;
      this.e = pM_3.j;
      this.I = pM_3.Z;
      this.b = pM_3.t;
      this.M = pM_3.n;
      int var10000 = W();
      this.u = pM_3.u;
      this.K = pM_3.e;
      this.Y = pM_3.o;
      int var2 = var10000;
      this.Q = pM_3.X;
      this.l = pM_3.F;
      this.g = pM_3.q;
      this.t = pM_3.K;
      this.n = com.o__2.u;
      this.q = com.o__2.C;
      this.p = pM_3.s;
      this.y = false;
      this.B = 0;
      if (var2 == 0) {
         com.ky_4.K(new String[1]);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new _n_2((JSlider)var0);
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      com.FN.Y(this.slider);
      LookAndFeel.installProperty(this.slider, a(8152, -28050), Boolean.FALSE);
      this.slider.setForeground(GO.V);
      int var10000 = G();
      com.WO.t(this.slider, this.q);
      this.h();
      this.P = new com.Cl_2(this);
      this.slider.addPropertyChangeListener(a(8154, 31839), this.P);
      this.S = new SD(this);
      this.slider.addMouseWheelListener(this.S);
      this.w = new com.CM(this);
      this.slider.addChangeListener(this.w);
      this.v = new com.WC(a(8153, 9385), j, new com.Fl_2(this));
      this.z = new com.li_4(this, var1);
      this.slider.addMouseListener(this.z);
      this.slider.addMouseMotionListener(this.z);
      int var2 = var10000;
      if (com.ky_4.F() != null) {
         z(++var2);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      com.WO.C(this.slider, this.q);
      this.slider.removePropertyChangeListener(a(8155, -4476), this.P);
      this.slider.removeMouseWheelListener(this.S);
      this.slider.removeChangeListener(this.w);
      this.slider.removeMouseListener(this.z);
      this.slider.removeMouseMotionListener(this.z);
      super.uninstallUI(var1);
   }

   @Override
   public void h() {
      int var1 = W();
      JSlider var10000 = this.slider;
      if (var1 != 0) {
         if (this.slider == null) {
            return;
         }

         var10000 = this.slider;
      }

      byte var5 = com.FN.l((JComponent)var10000);
      if (var1 != 0) {
         if (var5 != 0) {
            return;
         }

         var5 = this.slider.getComponentOrientation().isLeftToRight();
      }

      byte var2 = var5;
      Insets var3 = new Insets(this.n.top, var2 != 0 ? this.n.left : this.n.right, this.n.bottom, var2 != 0 ? this.n.right : this.n.left);
      _n_2 var6 = this;
      if (var1 != 0) {
         if (this.q != null) {
            Insets var4;
            int var8;
            int var10001;
            label47: {
               var4 = this.q.B(this.slider);
               var3.top = var3.top + var4.top;
               var7 = var3;
               var10001 = var3.bottom;
               Insets var10002 = var4;
               if (var1 != 0) {
                  var3.bottom = var3.bottom + var4.bottom;
                  var7 = var3;
                  var10001 = var3.left;
                  if (var2 != 0) {
                     var8 = var4.left;
                     break label47;
                  }

                  var10002 = var4;
               }

               var8 = var10002.right;
            }

            var7.left = var10001 + var8;
            var8 = var2;
            if (var1 != 0) {
               var8 = var2 != 0 ? var4.right : var4.left;
            }

            var3.right += var8;
         }

         var6 = this;
      }

      var6.slider.setBorder(GA.y(var3));
   }

   public boolean h$boolean() {
      return this.g;
   }

   public void J(boolean var1) {
      this.g = var1;
   }

   public boolean f() {
      return this.t;
   }

   public void F(boolean var1) {
      this.t = var1;
   }

   public boolean G() {
      return this.p;
   }

   public void j(boolean var1) {
      this.p = var1;
   }

   public Color O() {
      return this.R;
   }

   public void l(Color var1) {
      this.R = var1;
   }

   public Color u() {
      return this.G;
   }

   public void h(Color var1) {
      this.G = var1;
   }

   public int Y() {
      return this.L;
   }

   public void y(int var1) {
      this.L = var1;
   }

   public int M() {
      return this.O;
   }

   public void E(int var1) {
      this.O = var1;
   }

   public int P() {
      return this.c;
   }

   public void M(int var1) {
      this.c = var1;
   }

   public boolean L() {
      return this.D;
   }

   public void D(boolean var1) {
      this.D = var1;
   }

   public Color d() {
      return this.f;
   }

   public void x(Color var1) {
      this.f = var1;
   }

   public Color b() {
      return this.h;
   }

   public void w(Color var1) {
      this.h = var1;
   }

   public Color s() {
      return this.N;
   }

   public void B(Color var1) {
      this.N = var1;
   }

   public int V() {
      return this.a;
   }

   public void s(int var1) {
      this.a = var1;
   }

   public int h$int() {
      return this.F;
   }

   public void q(int var1) {
      this.F = var1;
   }

   public boolean T() {
      return this.T;
   }

   public void p(boolean var1) {
      this.T = var1;
   }

   public Color A() {
      return this.e;
   }

   public void g(Color var1) {
      this.e = var1;
   }

   public Color f$Color() {
      return this.I;
   }

   public void k(Color var1) {
      this.I = var1;
   }

   public int p() {
      return this.b;
   }

   public void L(int var1) {
      this.b = var1;
   }

   public int I() {
      return this.M;
   }

   public void H(int var1) {
      this.M = var1;
   }

   public int l() {
      return this.u;
   }

   public void j(int var1) {
      this.u = var1;
   }

   public int S() {
      return this.K;
   }

   public void l(int var1) {
      this.K = var1;
   }

   public boolean x() {
      return this.Y;
   }

   public void m(boolean var1) {
      this.Y = var1;
   }

   public boolean s$boolean() {
      return this.Q;
   }

   public void K(boolean var1) {
      this.Q = var1;
   }

   public int i() {
      return this.l;
   }

   public void V(int var1) {
      this.l = var1;
   }

   public Insets r() {
      return this.n;
   }

   public void p(Insets var1) {
      this.n = var1;
      this.h();
   }

   public com.og_4 o() {
      return this.q;
   }

   public void S(com.og_4 var1) {
      com.WO.C(this.slider, this.q);
      this.q = var1;
      com.WO.t(this.slider, this.q);
      this.h();
   }

   @Override
   protected Dimension getThumbSize() {
      return this.slider.getOrientation() == 0 ? new Dimension(this.b, this.M) : new Dimension(this.M, this.b);
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int var3 = G();
      _n_2 var10000 = this;
      if (var3 == 0) {
         if (this.q != null) {
            this.q.u((Graphics2D)var1, com.FN.N(var2), var2);
         }

         var10000 = this;
      }

      var10000.paint(var1, var2);
   }

   @Override
   public void paintFocus(Graphics var1) {
   }

   @Override
   public void paintThumb(Graphics var1) {
      int var2 = W();
      if (this.T) {
         Graphics2D var3;
         Object var4;
         Shape var5;
         label24: {
            label23: {
               var3 = (Graphics2D)var1;
               var4 = RV.X(var3);
               var5 = this.l();
               if (var2 != 0) {
                  if (this.slider.getOrientation() != 0) {
                     break label23;
                  }

                  var3.setPaint(new GradientPaint(0.0F, (float)this.thumbRect.y, this.e, 0.0F, (float)(this.thumbRect.y + this.thumbRect.height), this.I));
               }

               if (var2 != 0) {
                  break label24;
               }
            }

            var3.setPaint(new GradientPaint((float)this.thumbRect.x, 0.0F, this.e, (float)(this.thumbRect.x + this.thumbRect.width), 0.0F, this.I));
         }

         var3.fill(var5);
         var3.setPaint(this.slider.isEnabled() ? GO.Ff : GO.FX);
         var3.draw(var5);
         RV.X(var3, var4);
      }
   }

   protected Color r$Color() {
      return P9.N(GO.N, GO.Ff, this.i());
   }

   protected float i$float() {
      return (float)this.B / 5.0F;
   }

   protected Shape l$Shape() {
      int var1 = W();
      int var10000 = this.Y;
      if (var1 != 0) {
         if (!this.Y) {
            return new Double(
               (double)this.thumbRect.x,
               (double)this.thumbRect.y,
               (double)this.thumbRect.width,
               (double)this.thumbRect.height,
               (double)(this.u * 2),
               (double)(this.u * 2)
            );
         }

         var10000 = this.slider.getPaintLabels();
      }

      label77:
      if (var1 != 0) {
         if (var10000 == 0) {
            var10000 = this.slider.getPaintTicks();
            if (var1 == 0) {
               break label77;
            }

            if (var10000 == 0) {
               return new Double(
                  (double)this.thumbRect.x,
                  (double)this.thumbRect.y,
                  (double)this.thumbRect.width,
                  (double)this.thumbRect.height,
                  (double)(this.u * 2),
                  (double)(this.u * 2)
               );
            }
         }

         var10000 = this.slider.getOrientation();
      }

      if (var10000 == 0) {
         GeneralPath var3;
         label40: {
            var3 = new GeneralPath(0);
            var3.moveTo((float)this.thumbRect.x, (float)(this.thumbRect.y + this.u));
            var3.quadTo((float)this.thumbRect.x, (float)this.thumbRect.y, (float)(this.thumbRect.x + this.u), (float)this.thumbRect.y);
            var3.lineTo((float)(this.thumbRect.x + this.thumbRect.width - this.u), (float)this.thumbRect.y);
            var3.quadTo(
               (float)(this.thumbRect.x + this.thumbRect.width),
               (float)this.thumbRect.y,
               (float)(this.thumbRect.x + this.thumbRect.width),
               (float)(this.thumbRect.y + this.u)
            );
            var3.lineTo((float)(this.thumbRect.x + this.thumbRect.width), (float)(this.thumbRect.y + this.thumbRect.height - this.l));
            if (var1 != 0) {
               if (this.Q) {
                  var3.lineTo((float)(this.thumbRect.x + this.thumbRect.width / 2), (float)(this.thumbRect.y + this.thumbRect.height));
                  var3.lineTo((float)this.thumbRect.x, (float)(this.thumbRect.y + this.thumbRect.height - this.l));
                  if (var1 != 0) {
                     break label40;
                  }
               }

               var3.quadTo(
                  (float)(this.thumbRect.x + this.thumbRect.width),
                  (float)(this.thumbRect.y + this.thumbRect.height - this.l / 2),
                  (float)(this.thumbRect.x + this.thumbRect.width / 2),
                  (float)(this.thumbRect.y + this.thumbRect.height)
               );
            }

            var3.quadTo(
               (float)this.thumbRect.x,
               (float)(this.thumbRect.y + this.thumbRect.height - this.l / 2),
               (float)this.thumbRect.x,
               (float)(this.thumbRect.y + this.thumbRect.height - this.l)
            );
         }

         var3.closePath();
         return var3;
      } else {
         GeneralPath var2;
         label64: {
            label84: {
               var2 = new GeneralPath(0);
               boolean var4 = this.slider.getComponentOrientation().isLeftToRight();
               if (var1 != 0) {
                  if (var4) {
                     label58: {
                        var2.moveTo((float)this.thumbRect.x, (float)(this.thumbRect.y + this.u));
                        var2.quadTo((float)this.thumbRect.x, (float)this.thumbRect.y, (float)(this.thumbRect.x + this.u), (float)this.thumbRect.y);
                        var2.lineTo((float)(this.thumbRect.x + this.thumbRect.width - this.l), (float)this.thumbRect.y);
                        if (var1 != 0) {
                           if (this.Q) {
                              var2.lineTo((float)(this.thumbRect.x + this.thumbRect.width), (float)(this.thumbRect.y + this.thumbRect.height / 2));
                              var2.lineTo((float)(this.thumbRect.x + this.thumbRect.width - this.l), (float)(this.thumbRect.y + this.thumbRect.height));
                              if (var1 != 0) {
                                 break label58;
                              }
                           }

                           var2.quadTo(
                              (float)(this.thumbRect.x + this.thumbRect.width - this.l / 2),
                              (float)this.thumbRect.y,
                              (float)(this.thumbRect.x + this.thumbRect.width),
                              (float)(this.thumbRect.y + this.thumbRect.height / 2)
                           );
                        }

                        var2.quadTo(
                           (float)(this.thumbRect.x + this.thumbRect.width - this.l / 2),
                           (float)(this.thumbRect.y + this.thumbRect.height),
                           (float)(this.thumbRect.x + this.thumbRect.width - this.l),
                           (float)(this.thumbRect.y + this.thumbRect.height)
                        );
                     }

                     var2.lineTo((float)(this.thumbRect.x + this.u), (float)(this.thumbRect.y + this.thumbRect.height));
                     var2.quadTo(
                        (float)this.thumbRect.x,
                        (float)(this.thumbRect.y + this.thumbRect.height),
                        (float)this.thumbRect.x,
                        (float)(this.thumbRect.y + this.thumbRect.height - this.u)
                     );
                     if (var1 != 0) {
                        break label64;
                     }
                  }

                  var2.moveTo((float)(this.thumbRect.x + this.thumbRect.width - this.u), (float)this.thumbRect.y);
                  var2.quadTo(
                     (float)(this.thumbRect.x + this.thumbRect.width),
                     (float)this.thumbRect.y,
                     (float)(this.thumbRect.x + this.thumbRect.width),
                     (float)(this.thumbRect.y + this.u)
                  );
                  var2.lineTo((float)(this.thumbRect.x + this.thumbRect.width), (float)(this.thumbRect.y + this.thumbRect.height - this.u));
                  var2.quadTo(
                     (float)(this.thumbRect.x + this.thumbRect.width),
                     (float)(this.thumbRect.y + this.thumbRect.height),
                     (float)(this.thumbRect.x + this.thumbRect.width - this.u),
                     (float)(this.thumbRect.y + this.thumbRect.height)
                  );
                  var2.lineTo((float)(this.thumbRect.x + this.l), (float)(this.thumbRect.y + this.thumbRect.height));
                  if (var1 == 0) {
                     break label84;
                  }

                  var4 = this.Q;
               }

               if (var4) {
                  var2.lineTo((float)this.thumbRect.x, (float)(this.thumbRect.y + this.thumbRect.height / 2));
                  var2.lineTo((float)(this.thumbRect.x + this.l), (float)this.thumbRect.y);
                  if (var1 != 0) {
                     break label64;
                  }
               }

               var2.quadTo(
                  (float)(this.thumbRect.x + this.l / 2),
                  (float)(this.thumbRect.y + this.thumbRect.height),
                  (float)this.thumbRect.x,
                  (float)(this.thumbRect.y + this.thumbRect.height / 2)
               );
            }

            var2.quadTo((float)(this.thumbRect.x + this.l / 2), (float)this.thumbRect.y, (float)(this.thumbRect.x + this.l), (float)this.thumbRect.y);
         }

         var2.closePath();
         return var2;
      }
   }

   @Override
   public void paintTrack(Graphics var1) {
      int var10000 = W();
      Graphics2D var3 = (Graphics2D)var1;
      int var2 = var10000;
      Object var4 = RV.X(var3);
      Shape var5 = this.S();
      var10000 = this.slider.isEnabled();
      if (var2 != 0) {
         if (var10000 != 0) {
            RV.Y(var3, var5, this.slider.isFocusOwner() ? GO.c : GO.r, this.c);
         }

         var10000 = this.slider.getOrientation();
      }

      label92: {
         if (var10000 == 0) {
            var3.setPaint(new GradientPaint(0.0F, (float)this.trackRect.y, this.R, 0.0F, (float)(this.trackRect.y + this.trackRect.height), this.G));
            if (var2 != 0) {
               break label92;
            }
         }

         var3.setPaint(new GradientPaint((float)this.trackRect.x, 0.0F, this.R, (float)(this.trackRect.x + this.trackRect.width), 0.0F, this.G));
      }

      Graphics2D var9 = var3;
      if (var2 != 0) {
         var3.fill(var5);
         if (this.D) {
            Shape var6 = this.r();
            if (this.slider.isEnabled()) {
               RV.Y(var3, var6, GO.r, this.F);
            }

            label83: {
               Rectangle var7;
               label82: {
                  var7 = var5.getBounds();
                  if (var2 != 0) {
                     if (this.slider.getOrientation() != 0) {
                        break label82;
                     }

                     var3.setPaint(new GradientPaint(0.0F, (float)(var7.y + this.F), this.f, 0.0F, (float)(var7.y + var7.height - this.F), this.h));
                  }

                  if (var2 != 0) {
                     break label83;
                  }
               }

               var3.setPaint(new GradientPaint((float)(var7.x + this.F), 0.0F, this.f, (float)(var7.x + var7.width - this.F), 0.0F, this.h));
            }

            Color var10;
            label74: {
               var3.fill(var6);
               _n_2 var10001 = this;
               if (var2 != 0) {
                  if (!this.slider.isEnabled()) {
                     var10 = GO.FX;
                     break label74;
                  }

                  var10001 = this;
               }

               var10 = var10001.N;
            }

            var3.setPaint(var10);
            var3.draw(var6);
         }

         var9 = var3;
      }

      Color var13;
      label97: {
         boolean var11 = this.slider.isEnabled();
         if (var2 != 0) {
            if (!var11) {
               var13 = GO.FX;
               break label97;
            }

            var11 = this.t;
         }

         label59: {
            label58: {
               if (var2 != 0) {
                  if (!var11) {
                     break label58;
                  }

                  var12 = this;
                  if (var2 == 0) {
                     break label59;
                  }

                  var11 = this.isDragging();
               }

               if (!var11) {
                  var12 = this;
                  break label59;
               }
            }

            var13 = GO.Ff;
            break label97;
         }

         var13 = var12.r();
      }

      var9.setPaint(var13);
      var3.draw(var5);
      RV.X(var3, var4);
   }

   protected Shape S$Shape() {
      int var1 = G();
      int var10000 = this.O;
      if (var1 == 0) {
         if (this.O > 0) {
            if (this.slider.getOrientation() == 0) {
               return new Double(
                  (double)(this.trackRect.x - this.O),
                  (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2),
                  (double)(this.trackRect.width + this.O * 2 - 1),
                  (double)this.L,
                  (double)(this.O * 2),
                  (double)(this.O * 2)
               );
            }

            return new Double(
               (double)(this.trackRect.x + this.trackRect.width / 2 - this.L / 2),
               (double)(this.trackRect.y - this.O),
               (double)this.L,
               (double)(this.trackRect.height + this.O * 2 - 1),
               (double)(this.O * 2),
               (double)(this.O * 2)
            );
         }

         var10000 = this.slider.getOrientation();
      }

      return var10000 == 0
         ? new java.awt.geom.Rectangle2D.Double(
            (double)this.trackRect.x, (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2), (double)(this.trackRect.width - 1), (double)this.L
         )
         : new java.awt.geom.Rectangle2D.Double(
            (double)(this.trackRect.x + this.trackRect.width / 2 - this.L / 2), (double)this.trackRect.y, (double)this.L, (double)(this.trackRect.height - 1)
         );
   }

   protected Shape r$Shape() {
      int var1 = G();
      int var10000 = this.O;
      if (var1 == 0) {
         if (this.O > 0) {
            var10000 = this.slider.getOrientation();
            if (var1 == 0) {
               if (var10000 == 0) {
                  var10000 = this.slider.getComponentOrientation().isLeftToRight();
                  if (var1 == 0) {
                     if (var10000 != 0) {
                        int var6 = this.trackRect.x - this.O + this.F;
                        int var9 = this.thumbRect.x + this.thumbRect.width / 2 + this.a - var6;
                        if (var1 == 0) {
                           return new Double(
                              (double)var6,
                              (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F),
                              (double)var9,
                              (double)(this.L - this.F * 2),
                              (double)(this.a * 2),
                              (double)(this.a * 2)
                           );
                        }
                     }

                     var10000 = this.thumbRect.x + this.thumbRect.width / 2 - this.a;
                  }

                  int var14 = var10000;
                  int var16 = this.trackRect.x + this.trackRect.width + this.O - this.F - 1 - var14;
                  return new Double(
                     (double)var14,
                     (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F),
                     (double)var16,
                     (double)(this.L - this.F * 2),
                     (double)(this.a * 2),
                     (double)(this.a * 2)
                  );
               }

               var10000 = this.thumbRect.y + this.thumbRect.height / 2;
            }

            int var5 = var10000;
            int var8 = this.trackRect.y + this.trackRect.height + this.O - this.F - var5 - 1;
            return new Double(
               (double)(this.trackRect.x + this.F + this.trackRect.width / 2 - this.L / 2),
               (double)var5,
               (double)(this.L - this.F * 2),
               (double)var8,
               (double)(this.a * 2),
               (double)(this.a * 2)
            );
         }

         var10000 = this.slider.getOrientation();
      }

      if (var1 == 0) {
         if (var10000 == 0) {
            var10000 = this.slider.getComponentOrientation().isLeftToRight();
            if (var1 == 0) {
               if (var10000 != 0) {
                  int var4 = this.trackRect.x + this.F;
                  int var7 = this.thumbRect.x + this.thumbRect.width / 2 - var4;
                  if (var1 == 0) {
                     return new java.awt.geom.Rectangle2D.Double(
                        (double)var4, (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F), (double)var7, (double)(this.L - this.F * 2)
                     );
                  }
               }

               var10000 = this.thumbRect.x + this.thumbRect.width / 2;
            }

            int var13 = var10000;
            int var15 = this.trackRect.x + this.trackRect.width - this.F - 1 - var13;
            return new java.awt.geom.Rectangle2D.Double(
               (double)var13, (double)(this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F), (double)var15, (double)(this.L - this.F * 2)
            );
         }

         var10000 = this.trackRect.y + this.F;
      }

      int var2 = var10000;
      int var3 = this.thumbRect.y + this.thumbRect.height / 2 - var2;
      return new java.awt.geom.Rectangle2D.Double(
         (double)(this.trackRect.x + this.F + this.trackRect.width / 2 - this.L / 2), (double)var2, (double)(this.L - this.F * 2), (double)var3
      );
   }

   static JSlider x(_n_2 var0) {
      return var0.slider;
   }

   static JSlider o(_n_2 var0) {
      return var0.slider;
   }

   static JSlider I(_n_2 var0) {
      return var0.slider;
   }

   static JSlider H(_n_2 var0) {
      return var0.slider;
   }

   static JSlider T(_n_2 var0) {
      return var0.slider;
   }

   static JSlider a(_n_2 var0) {
      return var0.slider;
   }

   static JSlider l(_n_2 var0) {
      return var0.slider;
   }

   static JSlider r(_n_2 var0) {
      return var0.slider;
   }

   static JSlider q(_n_2 var0) {
      return var0.slider;
   }

   static JSlider K(_n_2 var0) {
      return var0.slider;
   }

   static JSlider s(_n_2 var0) {
      return var0.slider;
   }

   static JSlider X(_n_2 var0) {
      return var0.slider;
   }

   public static void z(int var0) {
      r = var0;
   }

   public static int W() {
      return r;
   }

   public static int G$int() {
      int var0 = W();
      return var0 == 0 ? 55 : 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "®Å®}\u0003 ªÒý¯\u0000CÆo~:XTç?\u0014v@µÍ`6Æ\u0010p÷±Hð\u000e¸\u0016\u0080Ñü\u008f";
      int var6 = "®Å®}\u0003 ªÒý¯\u0000CÆo~:XTç?\u0014v@µÍ`6Æ\u0010p÷±Hð\u000e¸\u0016\u0080Ñü\u008f".length();
      char var3 = 20;
      z(93);
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 38;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 62;
                        break;
                     case 1:
                        var50 = 126;
                        break;
                     case 2:
                        var50 = 60;
                        break;
                     case 3:
                        var50 = 26;
                        break;
                     case 4:
                        var50 = 28;
                        break;
                     case 5:
                        var50 = 62;
                        break;
                     default:
                        var50 = 76;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     d = var7;
                     i = new String[4];
                     long var0 = 7735517806301404264L;
                     long var27 = 7735517806301404224L ^ var0;
                     byte var18 = -1;
                     j = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "\u0085þFë\u0085Ô\u0019t\u0099D\u0091¡\u0094Nu>ôF´'Ïë\u0095¹\u0088Ç¦\u0017æOëZ";
                  var6 = "\u0085þFë\u0085Ô\u0019t\u0099D\u0091¡\u0094Nu>ôF´'Ïë\u0095¹\u0088Ç¦\u0017æOëZ".length();
                  var3 = 6;
                  var10 = -1;
            }

            var10000 = 15;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8154) & 65535;
      if (i[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 146;
               break;
            case 1:
               var10000 = 40;
               break;
            case 2:
               var10000 = 101;
               break;
            case 3:
               var10000 = 22;
               break;
            case 4:
               var10000 = 9;
               break;
            case 5:
               var10000 = 244;
               break;
            case 6:
               var10000 = 226;
               break;
            case 7:
               var10000 = 245;
               break;
            case 8:
               var10000 = 135;
               break;
            case 9:
               var10000 = 242;
               break;
            case 10:
               var10000 = 200;
               break;
            case 11:
               var10000 = 210;
               break;
            case 12:
               var10000 = 121;
               break;
            case 13:
               var10000 = 84;
               break;
            case 14:
               var10000 = 232;
               break;
            case 15:
               var10000 = 4;
               break;
            case 16:
               var10000 = 106;
               break;
            case 17:
               var10000 = 15;
               break;
            case 18:
               var10000 = 142;
               break;
            case 19:
               var10000 = 229;
               break;
            case 20:
               var10000 = 208;
               break;
            case 21:
               var10000 = 17;
               break;
            case 22:
               var10000 = 241;
               break;
            case 23:
               var10000 = 25;
               break;
            case 24:
               var10000 = 116;
               break;
            case 25:
               var10000 = 42;
               break;
            case 26:
               var10000 = 190;
               break;
            case 27:
               var10000 = 64;
               break;
            case 28:
               var10000 = 239;
               break;
            case 29:
               var10000 = 51;
               break;
            case 30:
               var10000 = 201;
               break;
            case 31:
               var10000 = 134;
               break;
            case 32:
               var10000 = 71;
               break;
            case 33:
               var10000 = 49;
               break;
            case 34:
               var10000 = 68;
               break;
            case 35:
               var10000 = 170;
               break;
            case 36:
               var10000 = 145;
               break;
            case 37:
               var10000 = 233;
               break;
            case 38:
               var10000 = 92;
               break;
            case 39:
               var10000 = 0;
               break;
            case 40:
               var10000 = 80;
               break;
            case 41:
               var10000 = 65;
               break;
            case 42:
               var10000 = 23;
               break;
            case 43:
               var10000 = 183;
               break;
            case 44:
               var10000 = 120;
               break;
            case 45:
               var10000 = 74;
               break;
            case 46:
               var10000 = 252;
               break;
            case 47:
               var10000 = 11;
               break;
            case 48:
               var10000 = 193;
               break;
            case 49:
               var10000 = 47;
               break;
            case 50:
               var10000 = 180;
               break;
            case 51:
               var10000 = 150;
               break;
            case 52:
               var10000 = 55;
               break;
            case 53:
               var10000 = 102;
               break;
            case 54:
               var10000 = 224;
               break;
            case 55:
               var10000 = 81;
               break;
            case 56:
               var10000 = 133;
               break;
            case 57:
               var10000 = 203;
               break;
            case 58:
               var10000 = 168;
               break;
            case 59:
               var10000 = 217;
               break;
            case 60:
               var10000 = 41;
               break;
            case 61:
               var10000 = 194;
               break;
            case 62:
               var10000 = 164;
               break;
            case 63:
               var10000 = 228;
               break;
            case 64:
               var10000 = 63;
               break;
            case 65:
               var10000 = 128;
               break;
            case 66:
               var10000 = 247;
               break;
            case 67:
               var10000 = 159;
               break;
            case 68:
               var10000 = 54;
               break;
            case 69:
               var10000 = 151;
               break;
            case 70:
               var10000 = 31;
               break;
            case 71:
               var10000 = 103;
               break;
            case 72:
               var10000 = 10;
               break;
            case 73:
               var10000 = 82;
               break;
            case 74:
               var10000 = 220;
               break;
            case 75:
               var10000 = 246;
               break;
            case 76:
               var10000 = 225;
               break;
            case 77:
               var10000 = 177;
               break;
            case 78:
               var10000 = 58;
               break;
            case 79:
               var10000 = 130;
               break;
            case 80:
               var10000 = 122;
               break;
            case 81:
               var10000 = 24;
               break;
            case 82:
               var10000 = 176;
               break;
            case 83:
               var10000 = 29;
               break;
            case 84:
               var10000 = 107;
               break;
            case 85:
               var10000 = 38;
               break;
            case 86:
               var10000 = 249;
               break;
            case 87:
               var10000 = 243;
               break;
            case 88:
               var10000 = 56;
               break;
            case 89:
               var10000 = 99;
               break;
            case 90:
               var10000 = 26;
               break;
            case 91:
               var10000 = 174;
               break;
            case 92:
               var10000 = 160;
               break;
            case 93:
               var10000 = 195;
               break;
            case 94:
               var10000 = 27;
               break;
            case 95:
               var10000 = 207;
               break;
            case 96:
               var10000 = 231;
               break;
            case 97:
               var10000 = 175;
               break;
            case 98:
               var10000 = 179;
               break;
            case 99:
               var10000 = 191;
               break;
            case 100:
               var10000 = 197;
               break;
            case 101:
               var10000 = 96;
               break;
            case 102:
               var10000 = 44;
               break;
            case 103:
               var10000 = 112;
               break;
            case 104:
               var10000 = 52;
               break;
            case 105:
               var10000 = 204;
               break;
            case 106:
               var10000 = 126;
               break;
            case 107:
               var10000 = 70;
               break;
            case 108:
               var10000 = 202;
               break;
            case 109:
               var10000 = 236;
               break;
            case 110:
               var10000 = 119;
               break;
            case 111:
               var10000 = 37;
               break;
            case 112:
               var10000 = 110;
               break;
            case 113:
               var10000 = 13;
               break;
            case 114:
               var10000 = 254;
               break;
            case 115:
               var10000 = 182;
               break;
            case 116:
               var10000 = 221;
               break;
            case 117:
               var10000 = 111;
               break;
            case 118:
               var10000 = 93;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 124;
               break;
            case 121:
               var10000 = 53;
               break;
            case 122:
               var10000 = 136;
               break;
            case 123:
               var10000 = 188;
               break;
            case 124:
               var10000 = 240;
               break;
            case 125:
               var10000 = 162;
               break;
            case 126:
               var10000 = 143;
               break;
            case 127:
               var10000 = 230;
               break;
            case 128:
               var10000 = 83;
               break;
            case 129:
               var10000 = 78;
               break;
            case 130:
               var10000 = 115;
               break;
            case 131:
               var10000 = 57;
               break;
            case 132:
               var10000 = 94;
               break;
            case 133:
               var10000 = 72;
               break;
            case 134:
               var10000 = 36;
               break;
            case 135:
               var10000 = 206;
               break;
            case 136:
               var10000 = 139;
               break;
            case 137:
               var10000 = 91;
               break;
            case 138:
               var10000 = 117;
               break;
            case 139:
               var10000 = 8;
               break;
            case 140:
               var10000 = 187;
               break;
            case 141:
               var10000 = 132;
               break;
            case 142:
               var10000 = 60;
               break;
            case 143:
               var10000 = 18;
               break;
            case 144:
               var10000 = 173;
               break;
            case 145:
               var10000 = 189;
               break;
            case 146:
               var10000 = 88;
               break;
            case 147:
               var10000 = 131;
               break;
            case 148:
               var10000 = 48;
               break;
            case 149:
               var10000 = 167;
               break;
            case 150:
               var10000 = 161;
               break;
            case 151:
               var10000 = 21;
               break;
            case 152:
               var10000 = 234;
               break;
            case 153:
               var10000 = 253;
               break;
            case 154:
               var10000 = 85;
               break;
            case 155:
               var10000 = 250;
               break;
            case 156:
               var10000 = 7;
               break;
            case 157:
               var10000 = 171;
               break;
            case 158:
               var10000 = 98;
               break;
            case 159:
               var10000 = 123;
               break;
            case 160:
               var10000 = 144;
               break;
            case 161:
               var10000 = 43;
               break;
            case 162:
               var10000 = 140;
               break;
            case 163:
               var10000 = 149;
               break;
            case 164:
               var10000 = 157;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 219;
               break;
            case 167:
               var10000 = 33;
               break;
            case 168:
               var10000 = 12;
               break;
            case 169:
               var10000 = 154;
               break;
            case 170:
               var10000 = 87;
               break;
            case 171:
               var10000 = 153;
               break;
            case 172:
               var10000 = 213;
               break;
            case 173:
               var10000 = 79;
               break;
            case 174:
               var10000 = 129;
               break;
            case 175:
               var10000 = 155;
               break;
            case 176:
               var10000 = 227;
               break;
            case 177:
               var10000 = 104;
               break;
            case 178:
               var10000 = 185;
               break;
            case 179:
               var10000 = 172;
               break;
            case 180:
               var10000 = 147;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 138;
               break;
            case 183:
               var10000 = 156;
               break;
            case 184:
               var10000 = 105;
               break;
            case 185:
               var10000 = 97;
               break;
            case 186:
               var10000 = 222;
               break;
            case 187:
               var10000 = 166;
               break;
            case 188:
               var10000 = 75;
               break;
            case 189:
               var10000 = 165;
               break;
            case 190:
               var10000 = 16;
               break;
            case 191:
               var10000 = 1;
               break;
            case 192:
               var10000 = 46;
               break;
            case 193:
               var10000 = 59;
               break;
            case 194:
               var10000 = 39;
               break;
            case 195:
               var10000 = 235;
               break;
            case 196:
               var10000 = 61;
               break;
            case 197:
               var10000 = 211;
               break;
            case 198:
               var10000 = 216;
               break;
            case 199:
               var10000 = 192;
               break;
            case 200:
               var10000 = 30;
               break;
            case 201:
               var10000 = 77;
               break;
            case 202:
               var10000 = 19;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 238;
               break;
            case 205:
               var10000 = 67;
               break;
            case 206:
               var10000 = 114;
               break;
            case 207:
               var10000 = 35;
               break;
            case 208:
               var10000 = 209;
               break;
            case 209:
               var10000 = 50;
               break;
            case 210:
               var10000 = 205;
               break;
            case 211:
               var10000 = 66;
               break;
            case 212:
               var10000 = 95;
               break;
            case 213:
               var10000 = 125;
               break;
            case 214:
               var10000 = 118;
               break;
            case 215:
               var10000 = 89;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 215;
               break;
            case 219:
               var10000 = 69;
               break;
            case 220:
               var10000 = 137;
               break;
            case 221:
               var10000 = 184;
               break;
            case 222:
               var10000 = 181;
               break;
            case 223:
               var10000 = 3;
               break;
            case 224:
               var10000 = 108;
               break;
            case 225:
               var10000 = 2;
               break;
            case 226:
               var10000 = 28;
               break;
            case 227:
               var10000 = 251;
               break;
            case 228:
               var10000 = 148;
               break;
            case 229:
               var10000 = 76;
               break;
            case 230:
               var10000 = 196;
               break;
            case 231:
               var10000 = 218;
               break;
            case 232:
               var10000 = 14;
               break;
            case 233:
               var10000 = 113;
               break;
            case 234:
               var10000 = 86;
               break;
            case 235:
               var10000 = 152;
               break;
            case 236:
               var10000 = 32;
               break;
            case 237:
               var10000 = 6;
               break;
            case 238:
               var10000 = 186;
               break;
            case 239:
               var10000 = 178;
               break;
            case 240:
               var10000 = 20;
               break;
            case 241:
               var10000 = 109;
               break;
            case 242:
               var10000 = 214;
               break;
            case 243:
               var10000 = 223;
               break;
            case 244:
               var10000 = 158;
               break;
            case 245:
               var10000 = 34;
               break;
            case 246:
               var10000 = 73;
               break;
            case 247:
               var10000 = 255;
               break;
            case 248:
               var10000 = 163;
               break;
            case 249:
               var10000 = 237;
               break;
            case 250:
               var10000 = 127;
               break;
            case 251:
               var10000 = 62;
               break;
            case 252:
               var10000 = 90;
               break;
            case 253:
               var10000 = 141;
               break;
            case 254:
               var10000 = 198;
               break;
            default:
               var10000 = 199;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }
}





