package com.finalshell.core;

import com.finalshell.ui.listener.FH2;
import com.finalshell.ui.listener.X1;
import com.finalshell.ui.listener.ZM;
import com.finalshell.ui.panel.By_2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class Ej2 extends BasicProgressBarUI implements W2_3, L0_2 {
   public static AffineTransform M;
   public Color G = Wl2.X;
   public Color W = Wl2.T;
   public Color z = Wl2.m;
   public Color B;
   public Color y;
   public Color d;
   public Color h;
   public Color O;
   public Color k;
   public int D;
   public int Y;
   public int Z;
   public boolean Q;
   public int P;
   public final int v;
   public int F;
   public WC_2 X;
   public PropertyChangeListener t;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public Ej2() {
      this.B = Wl2.k;
      this.y = Wl2.V;
      this.d = Wl2.E;
      this.h = Wl2.Y;
      this.O = Wl2.K;
      int var10000 = By_2.J();
      this.k = Wl2.N;
      this.D = Wl2.A;
      this.Y = Wl2.h;
      this.Z = Wl2.R;
      this.Q = Wl2.U;
      this.P = Wl2.c;
      this.v = a(19684, 7610382587420619153L);
      int var1 = var10000;
      this.F = 0;
      this.X = null;
      if (Ky4.F$arrString() != null) {
         By_2.Z(++var1);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new Ej2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.progressBar);
      LookAndFeel.installProperty(this.progressBar, a(29835, 13665), Boolean.FALSE);
      this.progressBar.setBorderPainted(false);
      this.progressBar.setForeground(Color.DARK_GRAY);
      this.h();
      this.t = new com.finalshell.ui.listener.C_a_2(this);
      this.progressBar.addPropertyChangeListener(a(29832, -9542), this.t);
      this.progressBar.addPropertyChangeListener(a(29833, -6543), this.t);
      this.o(this.progressBar);
      var1.addAncestorListener(new FH2(this));
   }

   @Override
   public void uninstallUI(JComponent var1) {
      int var10000 = By_2.y();
      var1.removePropertyChangeListener(this.t);
      int var2 = var10000;
      Ej2 var3 = this;
      if (var2 != 0) {
         if (this.X != null) {
            this.X.Y();
         }

         var3 = this;
      }

      var3.uninstallUI(var1);
   }

   @Override
   public void h() {
      int var1 = By_2.y();
      JProgressBar var10000 = this.progressBar;
      if (var1 != 0) {
         if (this.progressBar == null) {
            return;
         }

         var10000 = this.progressBar;
      }

      if (var1 != 0) {
         if (FN.l((JComponent)var10000)) {
            return;
         }

         var10000 = this.progressBar;
      }

      var10000.setBorder(GA.C(this.Z + 1, this.Z + 1, this.Z + 1, this.Z + 1));
   }

   public int A() {
      return this.D;
   }

   public void K(int var1) {
      this.D = var1;
   }

   public int W() {
      return this.Y;
   }

   public void y(int var1) {
      this.Y = var1;
   }

   public int J$int() {
      return this.Z;
   }

   public void i(int var1) {
      this.Z = var1;
      this.h();
   }

   public boolean f() {
      return this.Q;
   }

   public void i(boolean var1) {
      this.Q = var1;
   }

   public int Y() {
      return this.P;
   }

   public void j(int var1) {
      this.P = var1;
   }

   public Color j() {
      return this.G;
   }

   public void M(Color var1) {
      this.G = var1;
   }

   public Color l() {
      return this.W;
   }

   public void m(Color var1) {
      this.W = var1;
   }

   public Color z() {
      return this.z;
   }

   public void f(Color var1) {
      this.z = var1;
   }

   public Color p() {
      return this.B;
   }

   public void G(Color var1) {
      this.B = var1;
   }

   public Color H() {
      return this.y;
   }

   public void Y(Color var1) {
      this.y = var1;
   }

   public Color g() {
      return this.d;
   }

   public void C(Color var1) {
      this.d = var1;
   }

   public Color N() {
      return this.h;
   }

   public void Q(Color var1) {
      this.h = var1;
   }

   public Color D() {
      return this.O;
   }

   public void u(Color var1) {
      this.O = var1;
   }

   public Color J$Color() {
      return this.k;
   }

   public void e(Color var1) {
      this.k = var1;
   }

   @Override
   public Shape B() {
      return GA.X(this.progressBar, this.J$int(), this.A());
   }

   public void o(JProgressBar var1) {
      int var2 = By_2.y();
      if (var2 != 0 && this.X != null) {
         this.X.Y();
      }

      JProgressBar var10000 = var1;
      if (var2 != 0) {
         if (FN.L(var1) == null) {
            return;
         }

         var10000 = var1;
      }

      boolean var3 = var10000.isShowing();
      if (var2 != 0) {
         if (!var3) {
            return;
         }

         var3 = var1.isEnabled();
      }

      if (var2 != 0) {
         if (!var3) {
            return;
         }

         var3 = var1.isIndeterminate();
      }

      label25: {
         if (var3) {
            this.F = 0;
            this.X = new WC_2(a(29837, -493), GO.FK, new ZM(this, var1));
            this.X.r(false);
            if (var2 != 0) {
               break label25;
            }
         }

         this.F = a(1938, 9050229893902891744L);
         this.X = new WC_2(a(29834, 17307), GO.FK, new X1(this, var1));
      }

      this.X.r(false);
      this.X.u$WC();
   }

   @Override
   public Dimension getPreferredInnerHorizontal() {
      Dimension var1 = super.getPreferredInnerHorizontal();
      var1.width = this.P;
      return var1;
   }

   @Override
   public Dimension getPreferredInnerVertical() {
      Dimension var1 = super.getPreferredInnerVertical();
      var1.height = this.P;
      return var1;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      Object var3 = RV.O(var1);
      super.paint(var1, var2);
      RV.s(var1, var3);
   }

   @Override
   public void paintIndeterminate(Graphics var1, JComponent var2) {
      JComponent var16;
      Graphics2D var17;
      Graphics2D var4 = (Graphics2D)var1;
      this.b(var2, var4);
      Shape var5 = this.c(var2);
      Shape var6 = var4.getClip();
      Area var7 = new Area(var5);
      int var10000 = By_2.y();
      var7.intersect(new Area(var6));
      var4.setClip(var7);
      GeneralPath var8 = this.K(var2);
      AffineTransform var9 = new AffineTransform();
      int var3 = var10000;
      var9.translate((double)this.F, 0.0);
      var8.transform(var9);
      byte var10 = 0;

      while (true) {
         if (var10 < var2.getWidth() - this.Z * 2 - 4 - 1 + a(9218, 744703668060313971L)) {
            var4.setPaint(new GradientPaint(0.0F, (float)this.Z, this.z, 0.0F, (float)(var2.getHeight() - this.Z), this.B));
            var4.fill(var8);
            if (var3 != 0) {
               var10000 = (this.Q) ? 1 : 0;
               if (var3 == 0) {
                  break;
               }

               if (this.Q) {
                  var4.setPaint(this.h);
                  var4.draw(var8);
               }

               var10 += 40;
               var8.transform(M);
            }

            if (var3 != 0) {
               continue;
            }

            Ky4.K(new String[2]);
         }

         var10000 = (this.progressBar.isStringPainted()) ? 1 : 0;
         break;
      }

      label69: {
         label51:
         if (var3 != 0) {
            label70: {
               if (var10000 != 0) {
                  var16 = this.progressBar;
                  if (var3 == 0) {
                     break label70;
                  }

                  if (this.progressBar.getString() != null) {
                     var10000 = this.progressBar.getString().trim().length();
                     if (var3 == 0) {
                        break label51;
                     }

                     if (var10000 > 0) {
                        int var11 = var4.getFontMetrics().stringWidth(this.progressBar.getString());
                        float var12 = (float)var11 / (float)(this.progressBar.getWidth() * 2);
                        float var13 = 0.5F - var12;
                        float var14 = 0.5F + var12;
                        var4.setPaint(
                           new LinearGradientPaint(
                              0.0F,
                              0.0F,
                              (float)this.progressBar.getWidth(),
                              0.0F,
                              new float[]{var13 / 2.0F, var13, var14, var14 + (1.0F - var14) / 2.0F},
                              new Color[]{GO.l, this.O, this.O, GO.l}
                           )
                        );
                        var4.fill(var5);
                     }
                  }
               }

               var17 = var4;
               if (var3 == 0) {
                  break label69;
               }

               var4.setClip(var6);
               var16 = var2;
            }

            var10000 = (var16.isEnabled()) ? 1 : 0;
         }

         if (var10000 != 0) {
            RV.Y(var4, var5, GO.r, this.Z);
         }

         var17 = var4;
      }

      var17.setPaint(var2.isEnabled() ? this.y : this.d);
      var4.draw(var5);
      this.J(var4);
   }

   @Override
   public void paintDeterminate(Graphics var1, JComponent var2) {
      int var10000 = By_2.y();
      Graphics2D var4 = (Graphics2D)var1;
      int var3 = var10000;
      this.b(var2, var4);
      Ej2 var8 = this;
      if (var3 != 0) {
         if (this.progressBar.getValue() > this.progressBar.getMinimum()) {
            Shape var5 = this.U(var2);
            var10000 = (var2.isEnabled()) ? 1 : 0;
            if (var3 != 0) {
               if (var10000 != 0) {
                  RV.Y(var4, var5, GO.r, this.Z);
               }

               var10000 = this.progressBar.getOrientation();
            }

            label75: {
               if (var3 != 0) {
                  if (var10000 == 0) {
                     var4.setPaint(new GradientPaint(0.0F, (float)this.Z, this.z, 0.0F, (float)(var2.getHeight() - this.Z), this.B));
                     if (var3 != 0) {
                        break label75;
                     }
                  }

                  var10000 = (this.progressBar.getComponentOrientation().isLeftToRight()) ? 1 : 0;
               }

               if (var10000 != 0) {
                  var4.setPaint(new GradientPaint((float)this.Z, 0.0F, this.z, (float)(var2.getWidth() - this.Z), 0.0F, this.B));
                  if (var3 != 0) {
                     break label75;
                  }
               }

               var4.setPaint(new GradientPaint((float)this.Z, 0.0F, this.B, (float)(var2.getWidth() - this.Z), 0.0F, this.z));
            }

            Graphics2D var10 = var4;
            if (var3 != 0) {
               var4.fill(var5);
               if (var2.isEnabled()) {
                  Shape var6;
                  label77: {
                     var6 = var4.getClip();
                     Area var7 = new Area(var5);
                     var7.intersect(new Area(var6));
                     var4.setClip(var7);
                     var10000 = this.progressBar.getOrientation();
                     if (var3 != 0) {
                        if (var10000 == 0) {
                           var4.setPaint(
                              new RadialGradientPaint(
                                 (float)(this.Z * 2 + this.F + a(25459, 2939179844087422464L)),
                                 (float)(this.progressBar.getHeight() / 2),
                                 60.0F,
                                 new float[]{0.0F, 1.0F},
                                 new Color[]{this.k, GO.l}
                              )
                           );
                           if (var3 != 0) {
                              break label77;
                           }
                        }

                        var10000 = (this.progressBar.getComponentOrientation().isLeftToRight()) ? 1 : 0;
                     }

                     if (var10000 != 0) {
                        var4.setPaint(
                           new RadialGradientPaint(
                              (float)(var2.getWidth() / 2),
                              (float)(var2.getHeight() - this.Z * 2 - this.F - a(25765, 8939289877014059473L)),
                              60.0F,
                              new float[]{0.0F, 1.0F},
                              new Color[]{this.k, GO.l}
                           )
                        );
                        if (var3 != 0) {
                           break label77;
                        }
                     }

                     var4.setPaint(
                        new RadialGradientPaint(
                           (float)(var2.getWidth() / 2),
                           (float)(this.Z * 2 + this.F + a(25765, 8939289877014059473L)),
                           60.0F,
                           new float[]{0.0F, 1.0F},
                           new Color[]{this.k, GO.l}
                        )
                     );
                  }

                  var4.fill(var5);
                  var4.setClip(var6);
               }

               var10 = var4;
            }

            var10.setPaint(var2.isEnabled() ? this.y : this.d);
            var4.draw(var5);
         }

         var8 = this;
      }

      var8.J(var4);
   }

   public void J(Graphics2D var1) {
      int var2;
      JProgressBar var5;
      label71: {
         var2 = By_2.J();
         int var10000 = (this.progressBar.isStringPainted()) ? 1 : 0;
         if (var2 == 0) {
            if (var10000 == 0) {
               return;
            }

            var5 = this.progressBar;
            if (var2 != 0) {
               break label71;
            }

            var10000 = this.progressBar.getOrientation();
         }

         if (var10000 == 1) {
            var1.translate(this.progressBar.getWidth() / 2, this.progressBar.getHeight() / 2);
            int var10001 = (this.progressBar.getComponentOrientation().isLeftToRight()) ? 1 : 0;
            if (var2 == 0) {
               var10001 = var10001 != 0 ? -1 : 1;
            }

            var1.rotate((double)var10001 * Math.PI / 2.0);
            var1.translate(-this.progressBar.getWidth() / 2, -this.progressBar.getHeight() / 2);
         }

         var5 = this.progressBar;
      }

      String var3;
      Point var4;
      label58: {
         var3 = var5.getString();
         var4 = GA.A(var1.getFontMetrics(), var3);
         if (var2 == 0) {
            if (this.progressBar.isEnabled()) {
               break label58;
            }

            var1.setPaint(Color.WHITE);
         }

         var1.drawString(var3, this.progressBar.getWidth() / 2 + var4.x + 1, this.progressBar.getHeight() / 2 + var4.y + 1);
      }

      Color var8;
      label52: {
         JProgressBar var7 = this.progressBar;
         if (var2 == 0) {
            if (!this.progressBar.isEnabled()) {
               var8 = GO.y;
               break label52;
            }

            var7 = this.progressBar;
         }

         var8 = var7.getForeground();
      }

      var1.setPaint(var8);
      Graphics2D var6 = var1;
      if (var2 == 0) {
         var1.drawString(var3, this.progressBar.getWidth() / 2 + var4.x, this.progressBar.getHeight() / 2 + var4.y);
         if (this.progressBar.getOrientation() != 1) {
            return;
         }

         var6 = var1;
      }

      int var9 = (this.progressBar.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      if (var2 == 0) {
         var9 = var9 != 0 ? 1 : -1;
      }

      var6.rotate((double)var9 * Math.PI / 2.0);
   }

   public void b(JComponent var1, Graphics2D var2) {
      int var10000 = By_2.J();
      Shape var4 = this.c(var1);
      int var3 = var10000;
      var10000 = (var1.isEnabled()) ? 1 : 0;
      if (var3 == 0) {
         if (var10000 != 0) {
            RV.Y(var2, var4, GO.r, this.Z);
         }

         var10000 = this.progressBar.getOrientation();
      }

      label23: {
         if (var10000 == 0) {
            var2.setPaint(new GradientPaint(0.0F, (float)this.Z, this.G, 0.0F, (float)(var1.getHeight() - this.Z), this.W));
            if (var3 == 0) {
               break label23;
            }
         }

         var2.setPaint(new GradientPaint((float)this.Z, 0.0F, this.G, (float)(var1.getWidth() - this.Z), 0.0F, this.W));
      }

      var2.fill(var4);
      var2.setPaint(var1.isEnabled() ? this.y : this.d);
      var2.draw(var4);
   }

   public Shape c(JComponent var1) {
      return (Shape)(this.D > 0
         ? new Double(
            (double)this.Z,
            (double)this.Z,
            (double)(var1.getWidth() - this.Z * 2 - 1),
            (double)(var1.getHeight() - this.Z * 2 - 1),
            (double)(this.D * 2),
            (double)(this.D * 2)
         )
         : new java.awt.geom.Rectangle2D.Double(
            (double)this.Z, (double)this.Z, (double)(var1.getWidth() - this.Z * 2 - 1), (double)(var1.getHeight() - this.Z * 2 - 1)
         ));
   }

   public Shape U(JComponent var1) {
      int var10000 = By_2.J();
      int var3 = this.w();
      int var2 = var10000;
      var10000 = this.progressBar.getOrientation();
      if (var2 == 0) {
         if (var10000 == 0) {
            if (this.Y > 0) {
               return new Double(
                  (double)(this.Z * 2),
                  (double)(this.Z * 2),
                  (double)(var3 - 1),
                  (double)(var1.getHeight() - this.Z * 4 - 1),
                  (double)(this.Y * 2),
                  (double)(this.Y * 2)
               );
            }

            return new java.awt.geom.Rectangle2D.Double(
               (double)(this.Z * 2), (double)(this.Z * 2), (double)(var3 - 1), (double)(var1.getHeight() - this.Z * 4 - 1)
            );
         }

         var10000 = (this.progressBar.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      }

      if (var2 == 0) {
         if (var10000 != 0) {
            if (this.Y > 0) {
               return new Double(
                  (double)(this.Z * 2),
                  (double)(var1.getHeight() - var3 - this.Z * 2),
                  (double)(var1.getWidth() - this.Z * 4 - 1),
                  (double)(var3 - 1),
                  (double)(this.Y * 2),
                  (double)(this.Y * 2)
               );
            }

            return new java.awt.geom.Rectangle2D.Double(
               (double)(this.Z * 2), (double)(var1.getHeight() - var3 - this.Z * 2), (double)(var1.getWidth() - this.Z * 4 - 1), (double)(var3 - 1)
            );
         }

         var10000 = this.Y;
      }

      return (Shape)(var10000 > 0
         ? new Double(
            (double)(this.Z * 2),
            (double)(this.Z * 2),
            (double)(var1.getWidth() - this.Z * 4 - 1),
            (double)(var3 - 1),
            (double)(this.Y * 2),
            (double)(this.Y * 2)
         )
         : new java.awt.geom.Rectangle2D.Double((double)(this.Z * 2), (double)(this.Z * 2), (double)(var1.getWidth() - this.Z * 4 - 1), (double)(var3 - 1)));
   }

   public int w() {
      int var1 = By_2.y();
      int var10000 = (this.progressBar.isIndeterminate()) ? 1 : 0;
      if (var1 != 0) {
         if (var10000 != 0) {
            var10000 = this.progressBar.getOrientation();
            if (var1 != 0) {
               if (var10000 == 0) {
                  int var2 = this.progressBar.getWidth() - this.Z * 4;
                  if (var1 != 0) {
                     return var2;
                  }
               }

               var10000 = this.progressBar.getHeight() - this.Z * 4;
            }

            int var4 = var10000;
            if (var1 != 0) {
               return var4;
            }
         }

         var10000 = this.progressBar.getOrientation();
      }

      if (var1 != 0) {
         if (var10000 == 0) {
            int var5 = (int)(
               (float)(this.progressBar.getWidth() - this.Z * 4)
                  * (
                     (float)(this.progressBar.getValue() - this.progressBar.getMinimum())
                        / (float)(this.progressBar.getMaximum() - this.progressBar.getMinimum())
                  )
            );
            if (var1 != 0) {
               return var5;
            }
         }

         var10000 = (int)(
            (float)(this.progressBar.getHeight() - this.Z * 4)
               * ((float)(this.progressBar.getValue() - this.progressBar.getMinimum()) / (float)(this.progressBar.getMaximum() - this.progressBar.getMinimum()))
         );
      }

      return var10000;
   }

   public GeneralPath K(JComponent var1) {
      GeneralPath var2 = new GeneralPath(0);
      var2.moveTo((float)(this.Z * 2 - a(24828, 5754316187628838282L)), (float)(var1.getHeight() - this.Z - 1));
      var2.lineTo((float)(this.Z * 2 - a(5976, 8244334151043213864L)), (float)this.Z);
      var2.lineTo((float)(this.Z * 2), (float)this.Z);
      var2.lineTo((float)(this.Z * 2 - a(23526, 6615173419979679377L)), (float)(var1.getHeight() - this.Z - 1));
      var2.closePath();
      return var2;
   }

   public static JProgressBar P(Ej2 var0) {
      return var0.progressBar;
   }

   public static void X(Ej2 var0, JProgressBar var1) {
      var0.o(var1);
   }

   public static JProgressBar c(Ej2 var0) {
      return var0.progressBar;
   }

   public static JProgressBar O(Ej2 var0) {
      return var0.progressBar;
   }

   public static int g(Ej2 var0) {
      return var0.F;
   }

   public static int L(Ej2 var0) {
      return var0.F++;
   }

   public static int X(Ej2 var0, int var1) {
      return var0.F = var1;
   }

   public static int I(Ej2 var0) {
      return var0.w();
   }

   public static int C(Ej2 var0, int var1) {
      return var0.F += var1;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 29833) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 93;
               break;
            case 1:
               var10000 = 179;
               break;
            case 2:
               var10000 = 38;
               break;
            case 3:
               var10000 = 62;
               break;
            case 4:
               var10000 = 67;
               break;
            case 5:
               var10000 = 16;
               break;
            case 6:
               var10000 = 236;
               break;
            case 7:
               var10000 = 81;
               break;
            case 8:
               var10000 = 86;
               break;
            case 9:
               var10000 = 71;
               break;
            case 10:
               var10000 = 160;
               break;
            case 11:
               var10000 = 131;
               break;
            case 12:
               var10000 = 84;
               break;
            case 13:
               var10000 = 188;
               break;
            case 14:
               var10000 = 220;
               break;
            case 15:
               var10000 = 46;
               break;
            case 16:
               var10000 = 234;
               break;
            case 17:
               var10000 = 102;
               break;
            case 18:
               var10000 = 55;
               break;
            case 19:
               var10000 = 156;
               break;
            case 20:
               var10000 = 51;
               break;
            case 21:
               var10000 = 5;
               break;
            case 22:
               var10000 = 57;
               break;
            case 23:
               var10000 = 224;
               break;
            case 24:
               var10000 = 0;
               break;
            case 25:
               var10000 = 130;
               break;
            case 26:
               var10000 = 182;
               break;
            case 27:
               var10000 = 201;
               break;
            case 28:
               var10000 = 184;
               break;
            case 29:
               var10000 = 232;
               break;
            case 30:
               var10000 = 157;
               break;
            case 31:
               var10000 = 122;
               break;
            case 32:
               var10000 = 155;
               break;
            case 33:
               var10000 = 237;
               break;
            case 34:
               var10000 = 133;
               break;
            case 35:
               var10000 = 110;
               break;
            case 36:
               var10000 = 211;
               break;
            case 37:
               var10000 = 135;
               break;
            case 38:
               var10000 = 123;
               break;
            case 39:
               var10000 = 227;
               break;
            case 40:
               var10000 = 223;
               break;
            case 41:
               var10000 = 171;
               break;
            case 42:
               var10000 = 25;
               break;
            case 43:
               var10000 = 146;
               break;
            case 44:
               var10000 = 250;
               break;
            case 45:
               var10000 = 14;
               break;
            case 46:
               var10000 = 142;
               break;
            case 47:
               var10000 = 186;
               break;
            case 48:
               var10000 = 202;
               break;
            case 49:
               var10000 = 52;
               break;
            case 50:
               var10000 = 193;
               break;
            case 51:
               var10000 = 144;
               break;
            case 52:
               var10000 = 41;
               break;
            case 53:
               var10000 = 80;
               break;
            case 54:
               var10000 = 91;
               break;
            case 55:
               var10000 = 119;
               break;
            case 56:
               var10000 = 141;
               break;
            case 57:
               var10000 = 36;
               break;
            case 58:
               var10000 = 82;
               break;
            case 59:
               var10000 = 191;
               break;
            case 60:
               var10000 = 245;
               break;
            case 61:
               var10000 = 10;
               break;
            case 62:
               var10000 = 137;
               break;
            case 63:
               var10000 = 203;
               break;
            case 64:
               var10000 = 252;
               break;
            case 65:
               var10000 = 194;
               break;
            case 66:
               var10000 = 100;
               break;
            case 67:
               var10000 = 98;
               break;
            case 68:
               var10000 = 168;
               break;
            case 69:
               var10000 = 213;
               break;
            case 70:
               var10000 = 138;
               break;
            case 71:
               var10000 = 26;
               break;
            case 72:
               var10000 = 109;
               break;
            case 73:
               var10000 = 150;
               break;
            case 74:
               var10000 = 246;
               break;
            case 75:
               var10000 = 196;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 56;
               break;
            case 78:
               var10000 = 53;
               break;
            case 79:
               var10000 = 103;
               break;
            case 80:
               var10000 = 162;
               break;
            case 81:
               var10000 = 49;
               break;
            case 82:
               var10000 = 1;
               break;
            case 83:
               var10000 = 153;
               break;
            case 84:
               var10000 = 189;
               break;
            case 85:
               var10000 = 68;
               break;
            case 86:
               var10000 = 198;
               break;
            case 87:
               var10000 = 40;
               break;
            case 88:
               var10000 = 226;
               break;
            case 89:
               var10000 = 149;
               break;
            case 90:
               var10000 = 66;
               break;
            case 91:
               var10000 = 6;
               break;
            case 92:
               var10000 = 183;
               break;
            case 93:
               var10000 = 175;
               break;
            case 94:
               var10000 = 47;
               break;
            case 95:
               var10000 = 148;
               break;
            case 96:
               var10000 = 176;
               break;
            case 97:
               var10000 = 70;
               break;
            case 98:
               var10000 = 231;
               break;
            case 99:
               var10000 = 13;
               break;
            case 100:
               var10000 = 28;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 219;
               break;
            case 103:
               var10000 = 214;
               break;
            case 104:
               var10000 = 205;
               break;
            case 105:
               var10000 = 127;
               break;
            case 106:
               var10000 = 129;
               break;
            case 107:
               var10000 = 59;
               break;
            case 108:
               var10000 = 132;
               break;
            case 109:
               var10000 = 99;
               break;
            case 110:
               var10000 = 163;
               break;
            case 111:
               var10000 = 143;
               break;
            case 112:
               var10000 = 247;
               break;
            case 113:
               var10000 = 139;
               break;
            case 114:
               var10000 = 233;
               break;
            case 115:
               var10000 = 238;
               break;
            case 116:
               var10000 = 22;
               break;
            case 117:
               var10000 = 235;
               break;
            case 118:
               var10000 = 242;
               break;
            case 119:
               var10000 = 145;
               break;
            case 120:
               var10000 = 174;
               break;
            case 121:
               var10000 = 97;
               break;
            case 122:
               var10000 = 134;
               break;
            case 123:
               var10000 = 12;
               break;
            case 124:
               var10000 = 45;
               break;
            case 125:
               var10000 = 209;
               break;
            case 126:
               var10000 = 124;
               break;
            case 127:
               var10000 = 217;
               break;
            case 128:
               var10000 = 166;
               break;
            case 129:
               var10000 = 19;
               break;
            case 130:
               var10000 = 64;
               break;
            case 131:
               var10000 = 180;
               break;
            case 132:
               var10000 = 197;
               break;
            case 133:
               var10000 = 69;
               break;
            case 134:
               var10000 = 39;
               break;
            case 135:
               var10000 = 29;
               break;
            case 136:
               var10000 = 253;
               break;
            case 137:
               var10000 = 2;
               break;
            case 138:
               var10000 = 35;
               break;
            case 139:
               var10000 = 115;
               break;
            case 140:
               var10000 = 15;
               break;
            case 141:
               var10000 = 118;
               break;
            case 142:
               var10000 = 140;
               break;
            case 143:
               var10000 = 208;
               break;
            case 144:
               var10000 = 23;
               break;
            case 145:
               var10000 = 212;
               break;
            case 146:
               var10000 = 37;
               break;
            case 147:
               var10000 = 210;
               break;
            case 148:
               var10000 = 190;
               break;
            case 149:
               var10000 = 161;
               break;
            case 150:
               var10000 = 31;
               break;
            case 151:
               var10000 = 165;
               break;
            case 152:
               var10000 = 218;
               break;
            case 153:
               var10000 = 112;
               break;
            case 154:
               var10000 = 101;
               break;
            case 155:
               var10000 = 200;
               break;
            case 156:
               var10000 = 79;
               break;
            case 157:
               var10000 = 32;
               break;
            case 158:
               var10000 = 104;
               break;
            case 159:
               var10000 = 65;
               break;
            case 160:
               var10000 = 243;
               break;
            case 161:
               var10000 = 90;
               break;
            case 162:
               var10000 = 225;
               break;
            case 163:
               var10000 = 206;
               break;
            case 164:
               var10000 = 255;
               break;
            case 165:
               var10000 = 204;
               break;
            case 166:
               var10000 = 58;
               break;
            case 167:
               var10000 = 44;
               break;
            case 168:
               var10000 = 105;
               break;
            case 169:
               var10000 = 114;
               break;
            case 170:
               var10000 = 106;
               break;
            case 171:
               var10000 = 116;
               break;
            case 172:
               var10000 = 136;
               break;
            case 173:
               var10000 = 169;
               break;
            case 174:
               var10000 = 20;
               break;
            case 175:
               var10000 = 88;
               break;
            case 176:
               var10000 = 48;
               break;
            case 177:
               var10000 = 244;
               break;
            case 178:
               var10000 = 85;
               break;
            case 179:
               var10000 = 9;
               break;
            case 180:
               var10000 = 96;
               break;
            case 181:
               var10000 = 7;
               break;
            case 182:
               var10000 = 11;
               break;
            case 183:
               var10000 = 164;
               break;
            case 184:
               var10000 = 42;
               break;
            case 185:
               var10000 = 3;
               break;
            case 186:
               var10000 = 94;
               break;
            case 187:
               var10000 = 18;
               break;
            case 188:
               var10000 = 107;
               break;
            case 189:
               var10000 = 240;
               break;
            case 190:
               var10000 = 229;
               break;
            case 191:
               var10000 = 73;
               break;
            case 192:
               var10000 = 27;
               break;
            case 193:
               var10000 = 126;
               break;
            case 194:
               var10000 = 178;
               break;
            case 195:
               var10000 = 75;
               break;
            case 196:
               var10000 = 95;
               break;
            case 197:
               var10000 = 121;
               break;
            case 198:
               var10000 = 172;
               break;
            case 199:
               var10000 = 154;
               break;
            case 200:
               var10000 = 185;
               break;
            case 201:
               var10000 = 78;
               break;
            case 202:
               var10000 = 72;
               break;
            case 203:
               var10000 = 167;
               break;
            case 204:
               var10000 = 17;
               break;
            case 205:
               var10000 = 158;
               break;
            case 206:
               var10000 = 248;
               break;
            case 207:
               var10000 = 83;
               break;
            case 208:
               var10000 = 92;
               break;
            case 209:
               var10000 = 241;
               break;
            case 210:
               var10000 = 195;
               break;
            case 211:
               var10000 = 222;
               break;
            case 212:
               var10000 = 251;
               break;
            case 213:
               var10000 = 147;
               break;
            case 214:
               var10000 = 181;
               break;
            case 215:
               var10000 = 173;
               break;
            case 216:
               var10000 = 170;
               break;
            case 217:
               var10000 = 221;
               break;
            case 218:
               var10000 = 8;
               break;
            case 219:
               var10000 = 152;
               break;
            case 220:
               var10000 = 187;
               break;
            case 221:
               var10000 = 216;
               break;
            case 222:
               var10000 = 177;
               break;
            case 223:
               var10000 = 113;
               break;
            case 224:
               var10000 = 21;
               break;
            case 225:
               var10000 = 77;
               break;
            case 226:
               var10000 = 249;
               break;
            case 227:
               var10000 = 151;
               break;
            case 228:
               var10000 = 159;
               break;
            case 229:
               var10000 = 61;
               break;
            case 230:
               var10000 = 60;
               break;
            case 231:
               var10000 = 239;
               break;
            case 232:
               var10000 = 43;
               break;
            case 233:
               var10000 = 30;
               break;
            case 234:
               var10000 = 76;
               break;
            case 235:
               var10000 = 192;
               break;
            case 236:
               var10000 = 120;
               break;
            case 237:
               var10000 = 33;
               break;
            case 238:
               var10000 = 254;
               break;
            case 239:
               var10000 = 111;
               break;
            case 240:
               var10000 = 63;
               break;
            case 241:
               var10000 = 74;
               break;
            case 242:
               var10000 = 125;
               break;
            case 243:
               var10000 = 128;
               break;
            case 244:
               var10000 = 89;
               break;
            case 245:
               var10000 = 50;
               break;
            case 246:
               var10000 = 34;
               break;
            case 247:
               var10000 = 199;
               break;
            case 248:
               var10000 = 4;
               break;
            case 249:
               var10000 = 117;
               break;
            case 250:
               var10000 = 215;
               break;
            case 251:
               var10000 = 54;
               break;
            case 252:
               var10000 = 24;
               break;
            case 253:
               var10000 = 228;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 230;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32114;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "Â .ÁÂ-\u0086\r¾E)z\u009f½ 1¦Vå;Ê\u0006ýÂ\u0082CN\f";
      int var12 = "Â .ÁÂ-\u0086\r¾E)z\u009f½ 1¦Vå;Ê\u0006ýÂ\u0082CN\f".length();
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 112;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 85;
                        break;
                     case 1:
                        var65 = 73;
                        break;
                     case 2:
                        var65 = 10;
                        break;
                     case 3:
                        var65 = 67;
                        break;
                     case 4:
                        var65 = 25;
                        break;
                     case 5:
                        var65 = 72;
                        break;
                     default:
                        var65 = 6;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[5];
                     long var0 = 5010098751501581439L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "gÂì¸\u0082\u00ad9\u0017\u0011/î\u001cý0¢CrÂ\táölVC\u001búOÚIKe$\u001eOó\u008dÔ\u0004¡Ý\\Ð$ßU\u009f\u009aú";
                     int var5 = "gÂì¸\u0082\u00ad9\u0017\u0011/î\u001cý0¢CrÂ\táölVC\u001búOÚIKe$\u001eOó\u008dÔ\u0004¡Ý\\Ð$ßU\u009f\u009aú".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    e = new Integer[8];
                                    M = new AffineTransform();
                                    M.translate(40.0, 0.0);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ó.\u0017VËJ%\u0092oc¥\u001a\\ç\b2";
                                 var5 = "ó.\u0017VËJ%\u0092oc¥\u001a\\ç\b2".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "BÄL\u0010ölÛZgßG\u0087ÏÖÆ]Ò»ü\b\u000f\u0003§\u0099m\u0019NuÍ&ÆªÝ\u0082§Ä_äÌº¦ÐÞ\n}>?Å¡A\u00ad";
                  var12 = "BÄL\u0010ölÛZgßG\u0087ÏÖÆ]Ò»ü\b\u000f\u0003§\u0099m\u0019NuÍ&ÆªÝ\u0082§Ä_äÌº¦ÐÞ\n}>?Å¡A\u00ad".length();
                  var9 = 25;
                  var17 = -1;
            }

            var10000 = 81;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





