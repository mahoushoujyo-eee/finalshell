package com.finalshell.ui.panel;

import com.finalshell.core.Ax2;
import com.finalshell.core.B6;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.Eh2;
import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.GO;
import com.finalshell.core.IA;
import com.finalshell.core.IB;
import com.finalshell.core.Nx4;
import com.finalshell.core.P9;
import com.finalshell.core.PY;
import com.finalshell.core.RV;
import com.finalshell.core.Sa2;
import com.finalshell.ui.model.Ed2;
import com.finalshell.ui.model.PV;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D.Double;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ou4 extends JComponent implements MouseListener, MouseMotionListener, FocusListener, Eh2, Sa2 {
   public static Color t;
   public static Color O;
   public static Color p;
   public static Color D;
   public static Color E;
   public static float[] l;
   public static Color[] M;
   public static Color[] d;
   public final List F = new ArrayList(1);
   public Ed2 a;
   public int m = IA.t;
   public int x = IA.i;
   public Dimension q = IA.Y;
   public Insets J = IA.X;
   public boolean y = IA.W;
   public PV w = null;
   public boolean g = false;
   public static long[] b;
   public static Integer[] c;

   public Ou4() {
      this((Ed2)Cl4_2.E(Ed2.class));
   }

   public Ou4(Ed2 var1) {
      this.Q(var1);
      this.setFocusable(true);
      this.setFont(IA.G);
      this.setForeground(IA.x);
      this.addFocusListener(this);
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.repaint();
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = Nx4.R();
      int var10000 = (this.isEnabled()) ? 1 : 0;
      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      }

      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getClickCount();
      }

      if (var10000 == 2) {
         PV var3 = this.q(var1.getPoint());
         if (var3 != null) {
            Color var4 = B6.D(this, var3.N());
            if (var2 == 0) {
               if (var4 == null) {
                  return;
               }

               var3.C(var4);
               this.j();
            }

            this.repaint();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Ou4 var8;
      int var2 = Nx4.c$int();
      int var10000 = (this.isEnabled()) ? 1 : 0;
      if (var2 != 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.isFocusOwner()) ? 1 : 0;
      }

      if (var2 != 0) {
         if (var10000 == 0) {
            this.requestFocusInWindow();
         }

         var10000 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      }

      if (var2 != 0) {
         if (var10000 != 0) {
            PV var3 = this.q(var1.getPoint());
            PV var6 = var3;
            if (var2 != 0) {
               label82:
               if (var3 != null) {
                  if (FN.O(var1)) {
                     this.w = var3.H();
                     this.w.P(this.i(this.w.I()));
                     this.a.H(this.w);
                     this.g = false;
                     this.j();
                     this.repaint();
                     if (var2 != 0) {
                        break label82;
                     }
                  }

                  this.w = var3;
                  this.g = false;
               }

               var6 = this.w;
            }

            label76:
            if (var6 == null && var1.getY() > 0) {
               float var4 = this.D(var1);
               Ou4 var7 = this;
               if (var2 != 0) {
                  if (!this.H(var4)) {
                     break label76;
                  }

                  this.w = new PV(var4, this.P(var4));
                  this.a.H(this.w);
                  this.g = false;
                  this.j();
                  var7 = this;
               }

               var7.repaint();
            }

            if (var2 != 0) {
               return;
            }
         }

         var10000 = (FN.N(var1)) ? 1 : 0;
      }

      label99: {
         label63:
         if (var2 != 0) {
            if (var10000 == 0) {
               var10000 = (FN.L(var1)) ? 1 : 0;
               if (var2 == 0) {
                  break label63;
               }

               if (var10000 == 0) {
                  return;
               }
            }

            var8 = this;
            if (var2 == 0) {
               break label99;
            }

            var10000 = this.a.C$int();
         }

         if (var10000 <= 2) {
            return;
         }

         var8 = this;
      }

      PV var5 = var8.q(var1.getPoint());
      if (var2 != 0) {
         if (var5 == null) {
            return;
         }

         this.a.W(var5);
         this.j();
      }

      this.repaint();
   }

   public PV q(Point var1) {
      int var10000 = Nx4.R();
      PV var3 = null;
      int var2 = var10000;
      int var4 = this.a.C$int() - 1;

      while (var4 >= 0) {
         PV var5 = this.a.B(var4);
         if (var2 == 0) {
            if (this.H(var5).contains(var1)) {
               var3 = var5;
               break;
            }

            var4--;
         }
      }

      return var3;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var5;
      int var2 = Nx4.R();
      Ou4 var10000 = this;
      if (var2 == 0) {
         if (!this.isEnabled()) {
            return;
         }

         var10000 = this;
      }

      if (var10000.w != null) {
         label59: {
            var5 = var1.getY();
            label52:
            if (var2 == 0) {
               if (var5 < a(22662, 2094445192968756174L)) {
                  int var6 = this.a.C$int();
                  int var10001 = (this.g) ? 1 : 0;
                  if (var2 == 0) {
                     var10001 = this.g ? 1 : 0;
                  }

                  var5 = var6 + var10001;
                  if (var2 != 0) {
                     break label52;
                  }

                  if (var5 > 2) {
                     var10000 = this;
                     if (var2 == 0) {
                        if (this.g) {
                           return;
                        }

                        this.g = true;
                        this.a.W(this.w);
                        this.j();
                        var10000 = this;
                     }

                     var10000.repaint();
                     if (var2 == 0) {
                        return;
                     }
                  }
               }

               var10000 = this;
               if (var2 != 0) {
                  break label59;
               }

               var5 = (this.g) ? 1 : 0;
            }

            if (var5 != 0) {
               this.g = false;
               this.a.H(this.w);
            }

            var10000 = this;
         }

         float var3 = var10000.D(var1);
         var3 = this.i(var3);
         this.w.P(var3);
         this.j();
         this.repaint();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2 = Nx4.R();
      boolean var10000 = this.isEnabled();
      if (var2 == 0) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      if (var10000) {
         this.w = null;
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   public boolean H(float var1) {
      int var2 = Nx4.R();
      boolean var10000 = this.a.Z$boolean(var1);
      if (var2 == 0) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public float i(float var1) {
      float var5;
      int var2 = Nx4.c$int();
      int var10000 = (this.a.Z$boolean(var1)) ? 1 : 0;
      if (var2 != 0) {
         if (!var10000) {
            return var1;
         }

         float var4;
         var10000 = (var4 = var1 - 1.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (!var10000) {
            do {
               if (!this.a.Z$boolean(var1)) {
                  return var1;
               }

               float var3 = var1 - 0.001F;
               if (var2 == 0) {
                  return var3;
               }

               var1 = var3;
            } while (var2 != 0);
         }

         var10000 = (this.a.Z$boolean(var1)) ? 1 : 0;
      }

      while (var10000 != 0) {
         var5 = var1 + 0.001F;
         if (var2 == 0) {
            return var5;
         }

         var1 = var5;
         if (var2 == 0) {
            break;
         }

         var10000 = (this.a.Z$boolean(var1)) ? 1 : 0;
      }

      return var1;
   }

   public Rectangle L(int var1) {
      return this.H((PV)this.a.X().get(var1));
   }

   public Rectangle H(PV var1) {
      float var2 = var1.I();
      Rectangle var3 = this.R();
      int var4 = var3.x + 2 + Math.round((float)(var3.width - 4) * var2) - this.q.width / 2;
      int var5 = var3.y + var3.height - this.q.height / 2;
      return new Rectangle(var4, var5, this.q.width, this.q.height);
   }

   public float D(MouseEvent var1) {
      return this.C(var1.getPoint());
   }

   public float C(Point var1) {
      Rectangle var2 = this.R();
      int var3 = var2.x + 2;
      int var4 = var2.width - 4;
      return (float)Math.max(0, Math.min(var1.x - var3, var4)) / (float)var4;
   }

   public Color P(float var1) {
      return this.a.Z$Color(var1);
   }

   public Ed2 l() {
      return this.a;
   }

   public void Q(Ed2 var1) {
      int var2 = Nx4.c$int();
      Ou4 var10000 = this;
      if (var2 != 0) {
         if (Ax2.Z(this.a, new Object[]{var1})) {
            return;
         }

         this.a = var1;
         this.w = null;
         this.j();
         var10000 = this;
      }

      var10000.repaint();
   }

   public int D() {
      return this.m;
   }

   public void B(int var1) {
      this.m = var1;
      this.P();
   }

   public int L() {
      return this.x;
   }

   public void m$void(int var1) {
      this.x = var1;
   }

   public Dimension K() {
      return this.q;
   }

   public void h(Dimension var1) {
      this.q = var1;
   }

   public Insets a$Insets() {
      return this.J;
   }

   public void G(Insets var1) {
      this.J = var1;
      this.P();
   }

   public void I(int var1, int var2, int var3, int var4) {
      this.G(new Insets(var1, var2, var3, var4));
   }

   public void P(int var1) {
      this.I(var1, var1, var1, var1);
   }

   public void P() {
      this.setBorder(BorderFactory.createEmptyBorder(this.J.top, this.J.left, this.J.bottom, this.J.right));
   }

   public boolean Y() {
      return this.y;
   }

   public void o(boolean var1) {
      this.y = var1;
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      Object var3 = RV.X(var2);
      Rectangle var4 = this.R();
      this.r(var2, var4, this.j(var4), this.U(var4), false);
      this.P(var2, var4);
      RV.X(var2, var3);
   }

   public void P(Graphics2D var1, Rectangle var2) {
      FontMetrics var8;
      int var4 = var2.x + 2;
      int var5 = var2.width - 4;
      int var6 = var2.y + var2.height - this.q.height / 2;
      int var7 = var6 + this.q.height;
      var8 = var1.getFontMetrics();
      int var9 = var7 - GA.d(var8) - 1;
      int var10000 = Nx4.R();
      int var10 = 0;
      int var3 = var10000;

      while (var10 < this.a.C$int()) {
         PV var11 = this.a.B(var10);
         float var12 = var11.I();
         int var13 = var4 + Math.round((float)var5 * var12) - this.q.width / 2;
         Rectangle var14 = new Rectangle(var13, var6, this.q.width, this.q.height);
         this.r(var1, var14, var11.N(), this.n(var14), true);
         label35:
         if (var3 == 0) {
            if (this.y && var10 < this.a.C$int() - 1) {
               PV var15 = this.a.B(var10 + 1);
               int var16 = var13 + this.q.width;
               int var17 = var4 + Math.round((float)var5 * var15.I()) - this.q.width / 2;
               int var18 = Math.round((var15.I() - var12) * 100.0F);
               int var19 = var8.stringWidth(var18 + "");
               if (var3 != 0) {
                  break label35;
               }

               if (var17 - var16 > var19 + 4) {
                  int var20 = (var16 + var17) / 2 - var19 / 2;
                  var1.setPaint(this.isEnabled() ? p : D);
                  var1.drawString(var18 + "", var20, var7);
                  if (var3 != 0) {
                     break label35;
                  }

                  if (var17 - var16 > var19 + a(15632, 247772978569068126L)) {
                     var1.setPaint(new GradientPaint((float)(var16 + 2), 0.0F, GO.l, (float)(var20 - 2), 0.0F, Color.LIGHT_GRAY));
                     var1.drawLine(var16 + 2, var9, var20 - 2, var9);
                     var1.setPaint(new GradientPaint((float)(var20 + var19 + 2), 0.0F, Color.LIGHT_GRAY, (float)(var17 - 2), 0.0F, GO.l));
                     var1.drawLine(var20 + var19 + 2, var9, var17 - 2, var9);
                  }
               }
            }

            var10++;
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   public void r(Graphics2D var1, Rectangle var2, Paint var3, Paint var4, boolean var5) {
      label40: {
         boolean var10000;
         int var6 = Nx4.c$int();
         var10000 = this.isEnabled();
         label36:
         if (var6 != 0) {
            if (var10000) {
               var10000 = var5;
               if (var6 == 0) {
                  break label36;
               }

               if (!var5) {
                  RV.Y(
                     var1,
                     new Double((double)var2.x, (double)var2.y, (double)(var2.width - 1), (double)(var2.height - 1), 4.0, 4.0),
                     this.isFocusOwner() ? GO.c : GO.N,
                     this.m
                  );
               }
            }

            var1.setPaint(var3);
            var1.fillRoundRect(var2.x + 1, var2.y + 1, var2.width - 2, var2.height - 2, 2, 2);
            var1.setPaint(E);
            var1.drawRoundRect(var2.x + 1, var2.y + 1, var2.width - 3, var2.height - 3, 2, 2);
            if (var6 == 0) {
               break label40;
            }

            var10000 = var5;
         }

         if (var10000) {
            var1.setPaint(
               new GradientPaint(
                  (float)(var2.x + 2),
                  (float)(var2.y + 2),
                  P9.i(a(28019, 5362165453006663222L)),
                  (float)(var2.x + var2.width * 2 / 3),
                  (float)(var2.y + var2.height - 2),
                  GO.l
               )
            );
            var1.fillRect(var2.x + 2, var2.y + 2, var2.width - 4, var2.height - 4);
         }

         var1.setPaint(var4);
         var1.fillRect(var2.x + 2, var2.y + 2, var2.width - 4, var2.height - 4);
      }

      var1.setPaint(this.isEnabled() ? t : O);
      var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 1, 4, 4);
   }

   public LinearGradientPaint j(Rectangle var1) {
      return new LinearGradientPaint((float)(var1.x + 1), 0.0F, (float)(var1.x + var1.width - 1), 0.0F, this.a.l(), this.a.H());
   }

   public LinearGradientPaint U(Rectangle var1) {
      return this.u(var1, l, M);
   }

   public LinearGradientPaint n(Rectangle var1) {
      return this.u(var1, l, d);
   }

   public LinearGradientPaint u(Rectangle var1, float[] var2, Color[] var3) {
      return new LinearGradientPaint(0.0F, (float)(var1.y + 2), 0.0F, (float)(var1.y + var1.height - 2), var2, var3);
   }

   public Rectangle R() {
      Insets var1 = this.getInsets();
      return new Rectangle(
         var1.left + Math.max(this.q.width / 2, this.m) - 2,
         var1.top + this.m,
         this.getWidth() - var1.left - var1.right - Math.max(this.q.width, this.m * 2) + 4,
         this.x
      );
   }

   public List e$List() {
      return this.F;
   }

   public void t(ChangeListener var1) {
      this.F.add(var1);
   }

   public void s(ChangeListener var1) {
      this.F.remove(var1);
   }

   public void j() {
      int var10000 = Nx4.R();
      ChangeEvent var2 = new ChangeEvent(this);
      Iterator var3 = this.F.iterator();
      int var1 = var10000;

      while (var3.hasNext()) {
         ChangeListener var4 = (ChangeListener)var3.next();
         var4.stateChanged(var2);
         if (var1 != 0) {
            break;
         }
      }
   }

   @Override
   public void p(String var1) {
      Cl4_2.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
      Cl4_2.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      Cl4_2.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this, var1);
   }

   @Override
   public void w() {
      Cl4_2.O(this);
   }

   public void m$void() {
      Cl4_2.G(this);
   }

   public void e$void() {
      Cl4_2.H(this);
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public Ou4 v(int var1) {
      return (Ou4)PY.Q(this, var1);
   }

   public int m$int() {
      return PY.m(this);
   }

   public Ou4 f(int var1) {
      return (Ou4)PY.j(this, var1);
   }

   @Override
   public int A() {
      return PY.S(this);
   }

   public Ou4 m$ou_4(int var1) {
      return (Ou4)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public Ou4 w(int var1) {
      return (Ou4)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public Ou4 y(int var1) {
      return (Ou4)PY.b(this, var1);
   }

   public int a$int() {
      return PY.i(this);
   }

   public Ou4 O$ou_4(int var1) {
      return (Ou4)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var5;
      int var10000 = Nx4.R();
      Insets var2 = this.getInsets();
      int var1 = var10000;
      int var3 = var2.left + this.q.width * 5 + Math.max(this.q.width, this.m * 2) - 4 + var2.right;
      var10000 = var2.top + this.m * 2 + this.x + this.q.height / 2;
      int var10001 = this.q.height % 2;
      if (var1 == 0) {
         var10001 = var10001 == 0 ? 0 : 1;
      }

      int var4 = var10000 + var10001 + var2.bottom;
      var5 = new Dimension(var3, var4);
      return PY.W(this, var5);
   }

   public Ou4 P(int var1, int var2) {
      return (Ou4)PY.O(this, var1, var2);
   }

   @Override
   public Component W(int var1, int var2) {
      return this.P(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.O$ou_4(var1);
   }

   @Override
   public Component p(int var1) {
      return this.y(var1);
   }

   @Override
   public Component D(int var1) {
      return this.w(var1);
   }

   @Override
   public Component V(int var1) {
      return this.m$ou_4(var1);
   }

   @Override
   public Component x(int var1) {
      return this.f(var1);
   }

   public Component O$Component(int var1) {
      return this.v(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 841;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      boolean var5;
      long var0 = 2638340195432351686L;
      long[] var6 = new long[13];
      int var3 = 0;
      String var4 = "\u0098\u0097»x;.\u0085Ê/ìÇ6~óãþ4dDx\u0015\u0080Êyµ\u0092\u0015Yª\u0017v\në\u0003Õc}ÈÁ*X\r_âÿ\n\u001bØ³ø±ã)\u001dÚíØWf õíù\u0096{\b\u0010\u0082\\ã\u001d\u0000b´'b\u009d<ÐÇÃØP42ó\u0092a";
      var5 = "\u0098\u0097»x;.\u0085Ê/ìÇ6~óãþ4dDx\u0015\u0080Êyµ\u0092\u0015Yª\u0017v\në\u0003Õc}ÈÁ*X\r_âÿ\n\u001bØ³ø±ã)\u001dÚíØWf õíù\u0096{\b\u0010\u0082\\ã\u001d\u0000b´'b\u009d<ÐÇÃØP42ó\u0092a";
         // [VF] .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     b = var6;
                     c = new Integer[13];
                     t = Color.DARK_GRAY;
                     O = Color.LIGHT_GRAY;
                     p = Color.BLACK;
                     D = new Color(a(22837, 2579124458518370932L), a(7894, 873826364048579993L), a(7894, 873826364048579993L));
                     E = P9.i(a(5365, 8137916030943860661L));
                     l = new float[]{0.0F, 0.4F, 0.41F, 1.0F};
                     M = new Color[]{
                        P9.i(a(1281, 7779477744796665420L)),
                        P9.i(a(3724, 5664088593583410631L)),
                        P9.i(a(16673, 4108041831790396008L)),
                        P9.i(a(12974, 7573593731571790308L))
                     };
                     d = new Color[]{P9.i(a(22196, 3846895884366435831L)), P9.i(a(11570, 1901542599536979568L)), P9.i(a(24390, 6293472599324974090L)), GO.l};
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\"©Ù+\u0083Íé\u0084i\u001dÙî,4)D";
                  var5 = "\"©Ù+\u0083Íé\u0084i\u001dÙî,4)D".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





