package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.PV3;
import com.finalshell.ui.model.Ij4;
import com.finalshell.ui.model.Kq2;
import com.finalshell.ui.model.So2;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D.Double;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

public class KV_2 extends BasicTabbedPaneUI implements W2_3, L0_2 {
   public Ij4 R = E_2_2.V;
   public Color j;
   public Color F;
   public Color k;
   public Color b;
   public int r;
   public int M;
   public boolean V;
   public Insets c;
   public Insets T;
   public Og4 C;
   public int K;
   public int n;
   public So2 t;
   public Color I;
   public Color g;
   public boolean e;
   public boolean q;
   public Color B;
   public boolean f;
   public final Map l;
   public final Map w;
   public FocusAdapter a;
   public static String d;

   public KV_2() {
      this.j = E_2_2.g;
      this.F = E_2_2.l;
      this.k = E_2_2.s;
      this.b = E_2_2.Y;
      this.r = E_2_2.b;
      this.M = E_2_2.Z;
      this.V = E_2_2.C;
      this.c = E_2_2.j;
      this.T = E_2_2.r;
      this.C = E_2_2.h;
      this.K = E_2_2.R;
      this.n = E_2_2.U;
      this.t = E_2_2.u;
      this.I = E_2_2.f;
      this.g = E_2_2.m;
      this.e = E_2_2.P;
      this.q = E_2_2.k;
      this.B = E_2_2.e;
      this.f = E_2_2.O;
      this.l = new HashMap();
      this.w = new HashMap();
   }

   public static ComponentUI createUI(JComponent var0) {
      return new KV_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.tabPane);
      this.tabPane.setBackground(this.B);
      WO.t(this.tabPane, this.C);
      this.h$void();
      this.a = new PV3(this);
      this.tabPane.addFocusListener(this.a);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      WO.C(this.tabPane, this.C);
      String var2 = var10000;
      KV_2 var3 = this;
      if (var2 != null) {
         if (this.a != null) {
            var1.removeFocusListener(this.a);
         }

         var3 = this;
      }

      var3.uninstallUI(var1);
   }

   @Override
   public Shape B() {
      return GA.X(this.tabPane, this.N$int(), this.e());
   }

   public void h$void() {
      String var1;
      KV_2 var3;
      label36: {
         var1 = com.finalshell.ui.panel.Hd2.X();
         JTabbedPane var10000 = this.tabPane;
         if (var1 != null) {
            if (this.tabPane == null) {
               return;
            }

            var3 = this;
            if (var1 == null) {
               break label36;
            }

            var10000 = this.tabPane;
         }

         if (FN.l((JComponent)var10000)) {
            return;
         }

         var3 = this;
      }

      Insets var2 = var3.H(this.tabPane);
      var3 = this;
      if (var1 != null) {
         if (this.R.equals(Ij4.standalone)) {
            this.tabPane.setBorder(GA.y(FN.Z(var2, new Insets(this.M, this.M, this.M, this.M))));
            if (var1 != null) {
               return;
            }
         }

         var3 = this;
      }

      var3.tabPane.setBorder(GA.y(var2));
   }

   public Insets H(JComponent var1) {
      String var2 = com.finalshell.ui.panel.Hd2.X();
      Og4 var10000 = this.C;
      if (var2 != null) {
         if (this.C == null) {
            return new Insets(0, 0, 0, 0);
         }

         var10000 = this.C;
      }

      return var10000.B(var1);
   }

   public int N$int() {
      return this.M;
   }

   public void M$void(int var1) {
      this.M = var1;
      this.h$void();
   }

   public boolean S() {
      return this.V;
   }

   public void J(boolean var1) {
      this.V = var1;
   }

   public int e() {
      return this.r;
   }

   public void l(int var1) {
      this.r = var1;
   }

   public Insets h$Insets() {
      return this.c;
   }

   public void Z(Insets var1) {
      this.c = var1;
   }

   public Insets r$Insets() {
      return this.T;
   }

   public void S(Insets var1) {
      this.T = var1;
   }

   public Color O() {
      return this.j;
   }

   public void R(Color var1) {
      this.j = var1;
   }

   public Color n() {
      return this.F;
   }

   public void t(Color var1) {
      this.F = var1;
   }

   public Color T() {
      return this.k;
   }

   public void T(Color var1) {
      this.k = var1;
   }

   public Color z() {
      return this.b;
   }

   public void u(Color var1) {
      this.b = var1;
   }

   public void x(int var1, Color var2) {
      this.l.put(var1, var2);
   }

   public Color m(int var1) {
      return (Color)this.l.get(var1);
   }

   public void v(int var1, Og4 var2) {
      this.w.put(var1, var2);
   }

   public Og4 k(int var1) {
      return (Og4)this.w.get(var1);
   }

   public Ij4 t() {
      return this.R;
   }

   public void e(Ij4 var1) {
      this.R = var1;
      this.h$void();
   }

   public Og4 Q() {
      return this.C;
   }

   public void G(Og4 var1) {
      WO.C(this.tabPane, this.C);
      this.C = var1;
      WO.t(this.tabPane, this.C);
      this.h$void();
   }

   public int s() {
      return this.K;
   }

   public void g(int var1) {
      this.K = var1;
   }

   public int c() {
      return this.n;
   }

   public void j(int var1) {
      this.n = var1;
   }

   public So2 d() {
      return this.t;
   }

   public void x(So2 var1) {
      this.t = var1;
   }

   public Color r$Color() {
      return this.I;
   }

   public void P(Color var1) {
      this.I = var1;
   }

   public Color k() {
      return this.g;
   }

   public void k(Color var1) {
      this.g = var1;
   }

   public boolean U() {
      return this.e;
   }

   public void I(boolean var1) {
      this.e = var1;
   }

   public boolean h$boolean() {
      return this.q;
   }

   public void m(boolean var1) {
      this.q = var1;
   }

   public Color D() {
      return this.B;
   }

   public void H(Color var1) {
      this.B = var1;
   }

   public boolean f() {
      return this.f;
   }

   public void R(boolean var1) {
      this.f = var1;
   }

   @Override
   public int getTabRunIndent(int var1, int var2) {
      return this.K;
   }

   @Override
   public int getTabRunOverlay(int var1) {
      return this.n;
   }

   @Override
   public boolean shouldPadTabRun(int var1, int var2) {
      String var3 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = (this.t.equals(So2.never)) ? 1 : 0;
      if (var3 != null) {
         if (var10000 != 0) {
            return 0 != 0;
         }

         var10000 = (this.t.equals(So2.always)) ? 1 : 0;
      }

      if (var3 == null) {
         return var10000 != 0;
      } else if (var10000 != 0) {
         return 1 != 0;
      } else {
         var10000 = (this.t.equals(So2.multiline)) ? 1 : 0;
         if (var3 != null) {
            if (var10000 == 0) {
               return 0 != 0;
            }

            var10000 = this.runCount;
         }

         if (var3 == null) {
            return var10000 != 0;
         } else {
            return (boolean)((var10000 > 1 ? 1 : 0) != 0);
         }
      }
   }

   @Override
   public boolean shouldRotateTabRuns(int var1) {
      return true;
   }

   @Override
   public Insets getContentBorderInsets(int var1) {
      return new Insets(0, 0, 0, 0);
   }

   @Override
   public Insets getTabAreaInsets(int var1) {
      Insets var2 = new Insets(0, 0, 0, 0);
      rotateInsets(this.R.equals(Ij4.standalone) ? new Insets(var1 == 4 ? 1 : 0, 1, 0, 2) : new Insets(-1, -1, 0, 0), var2, var1);
      return var2;
   }

   @Override
   public Insets getTabInsets(int var1, int var2) {
      return new Insets(3, 3, 3, 3);
   }

   @Override
   public Insets getSelectedTabPadInsets(int var1) {
      return new Insets(0, 0, 0, 0);
   }

   @Override
   public int getTabLabelShiftX(int var1, int var2, boolean var3) {
      return 0;
   }

   @Override
   public int getTabLabelShiftY(int var1, int var2, boolean var3) {
      return 0;
   }

   @Override
   public void paintTabBorder(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
   }

   @Override
   public void paintTabBackground(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      Color var10 = (Color)Registry.lookupField(381952515264332318L).get(null);
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      Graphics2D var11 = (Graphics2D)var1;
      Object var12 = RV.X(var11);
      GeneralPath var13 = this.P(Kq2.border, var2, var4, var5, var6, var7, var8);
      String var9 = var10000;
      if (this.R.equals(Ij4.standalone)) {
      }

      label96: {
         GeneralPath var14 = this.P(Kq2.background, var2, var4, var5, var6, var7, var8);
         KV_2 var26 = this;
         if (var9 != null) {
            if (this.w.containsKey(var3) && var8) {
               Shape var15 = RV.n(var11, var14);
               Og4 var16 = (Og4)this.w.get(var3);
               var16.u(var11, new Rectangle(var4, var5, var6, var7), this.tabPane);
               RV.w(var11, var15);
               if (var9 != null) {
                  break label96;
               }
            }

            var26 = this;
         }

         label84: {
            Point var20;
            Point var22;
            label97: {
               label98: {
                  var20 = var26.X(var2, var4, var5, var6, var7);
                  var22 = this.K(var2, var4, var5, var6, var7);
                  boolean var27 = var8;
                  if (var9 != null) {
                     if (!var8) {
                        break label97;
                     }

                     var28 = this;
                     if (var9 == null) {
                        break label98;
                     }

                     var27 = this.q;
                  }

                  if (var27) {
                     var11.setPaint(new GradientPaint((float)var20.x, (float)var20.y, var10, (float)var22.x, (float)var22.y, this.F));
                     if (var9 != null) {
                        break label84;
                     }
                  }

                  var28 = this;
               }

               Color var17 = var28.tabPane.getBackgroundAt(var3);
               if (var9 != null && var17 == null) {
                  this.tabPane.getBackground();
               }

               Color var18 = (Color)Registry.lookupField(584289422366901854L).get(null);
               Color var19 = (Color)Registry.lookupField(430348892393272046L).get(null);
               var11.setPaint(new GradientPaint((float)var20.x, (float)var20.y, var18, (float)var22.x, (float)var22.y, var19));
               if (var9 != null) {
                  break label84;
               }
            }

            Color var24 = (Color)Registry.lookupField(566846571211444497L).get(null);
            Color var25 = (Color)Registry.lookupField(541361405791730915L).get(null);
            var11.setPaint(new GradientPaint((float)var20.x, (float)var20.y, var24, (float)var22.x, (float)var22.y, var25));
         }

         var11.fill(var8 ? var13 : var14);
      }

      Color var21 = (Color)Registry.lookupField(522287300181092171L).get(null);
      boolean var29 = var8;
      if (var9 != null) {
         if (var8) {
            var21 = (Color)Registry.lookupField(379314975479057356L).get(null);
         }

         var11.setPaint(var21);
         var11.draw(var13);
         var29 = var8;
      }

      label66: {
         label100: {
            if (var9 != null) {
               if (!var29) {
                  break label100;
               }

               var29 = this.tabPane.isFocusOwner();
            }

            if (var9 == null) {
               break label66;
            }

            if (var29) {
               var29 = true;
               break label66;
            }
         }

         var29 = false;
      }

      boolean var23 = var29;
      if (var9 != null) {
         if (this.R.equals(Ij4.standalone)) {
            GA.l(var11, null, GO.F3, var13, null, var23);
         }

         RV.X(var11, var12);
      }
   }

   @Override
   public void paintText(Graphics var1, int var2, Font var3, FontMetrics var4, int var5, String var6, Rectangle var7, boolean var8) {
      String var9;
      label70: {
         String var10000 = com.finalshell.ui.panel.Hd2.X();
         var1.setFont(var3);
         var9 = var10000;
         View var10 = this.getTextViewForTab(var5);
         View var14 = var10;
         if (var9 != null) {
            if (var10 == null) {
               break label70;
            }

            var14 = var10;
         }

         var14.paint(var1, var7);
         if (var9 != null) {
            return;
         }
      }

      int var11 = this.tabPane.getDisplayedMnemonicIndexAt(var5);
      if (var9 != null) {
         label37:
         if (this.tabPane.isEnabled()) {
            JTabbedPane var15 = this.tabPane;
            int var10001 = var5;
            if (var9 != null) {
               if (!this.tabPane.isEnabledAt(var5)) {
                  break label37;
               }

               var15 = this.tabPane;
               var10001 = var5;
            }

            Color var12 = var15.getForegroundAt(var10001);
            label58:
            if (var9 != null) {
               label56:
               if (var8) {
                  label54: {
                     label76: {
                        boolean var16 = var12 instanceof UIResource;
                        if (var9 != null) {
                           if (!var16) {
      Graphics2D var18;
      Graphics2D var18;
                              break label56;
                           }

                           var17 = this.l;
                           var18 = var5;
                           if (var9 == null) {
                              break label76;
                           }

                           var16 = var17.containsKey(var18);
                        }

                        if (!var16) {
                           break label54;
                        }

                        var17 = this.l;
                        var18 = var5;
                     }

                     var12 = (Color)var17.get(var18);
                     if (var9 != null) {
                        break label56;
                     }
                  }

                  Color var13 = UIManager.getColor(d);
                  if (var9 == null) {
                     break label58;
                  }

                  if (var13 != null) {
                     var12 = var13;
                  }
               }

               var1.setColor(var12);
               FN.W(var1, var6, var11, var7.x, var7.y + var4.getAscent());
            }

            if (var9 != null) {
               return;
            }
         }

         var1.setColor(this.tabPane.getBackgroundAt(var5).brighter());
         FN.W(var1, var6, var11, var7.x, var7.y + var4.getAscent());
         var1.setColor(this.tabPane.getBackgroundAt(var5).darker());
      }

      FN.W(var1, var6, var11, var7.x - 1, var7.y + var4.getAscent() - 1);
   }

   public GeneralPath P(Kq2 var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      String var8;
      int var12;
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      Insets var9 = this.tabPane.getInsets();
      var8 = ((var10000) ? 1 : 0) ? 1 : 0;
      var12 = (this.R.equals(Ij4.attached)) != 0;
      label80:
      if (var8 != null) {
         int var10001;
         label78: {
            if (var12 != 0) {
               var12 = var7;
               if (var8 == null) {
                  break label80;
               }

               if (var7 != 0) {
                  var12 = var2;
                  var10001 = 1;
                  if (var8 == null) {
                     break label78;
                  }

                  if (var2 == 1) {
                     var12 = var3;
                     var10001 = var9.left;
                     if (var8 == null) {
                        break label78;
                     }

                     if (var3 == var9.left) {
                        var3--;
                        var5++;
                     }
                  }
               }
            }

            var4 -= 2;
            var6 += 2;
            var12 = var5;
            var10001 = Registry.lookupField(262617833768908696L).getInt(null);
         }

         var5 = ((var12 - var10001) ? 1 : 0) ? 1 : 0;
         var12 = ((this.R.equals(Ij4.standalone)) != 0) != 0;
      }

      if (var8 != null && var12 == 0) {
         boolean var14 = false;
      }

      int var10;
      GeneralPath var11;
      var10 = (Registry.lookupField(626885163274229183L).getInt(null)) != 0;
      var11 = ((new GeneralPath(0)) ? 1 : 0) ? 1 : 0;
      var12 = (var7) != 0;
      label64:
      if (var8 != null) {
         if (var7 == 0) {
            var12 = this.e;
            if (var8 == null) {
               break label64;
            }

            if (this.e) {
               return var11;
            }
         }

         var12 = var2;
      }

      byte var16 = 1;
      if (var8 != null) {
         if (var12 == 1) {
            var11.moveTo((float)var3, (float)(var4 + var6 + this.K(var1)));
            var11.lineTo((float)var3, (float)(var4 + var10));
            var11.quadTo((float)var3, (float)var4, (float)(var3 + var10), (float)var4);
            var11.lineTo((float)(var3 + var5 - var10), (float)var4);
            var11.quadTo((float)(var3 + var5), (float)var4, (float)(var3 + var5), (float)(var4 + var10));
            var11.lineTo((float)(var3 + var5), (float)(var4 + var6 + this.K(var1)));
            if (var8 != null) {
               return var11;
            }
         }

         var12 = var2;
         var16 = 3;
      }

      if (var8 != null) {
         if (var12 == var16) {
            var11.moveTo((float)var3, (float)(var4 - this.K(var1)));
            var11.lineTo((float)var3, (float)(var4 + var6 - var10));
            var11.quadTo((float)var3, (float)(var4 + var6), (float)(var3 + var10), (float)(var4 + var6));
            var11.lineTo((float)(var3 + var5 - var10), (float)(var4 + var6));
            var11.quadTo((float)(var3 + var5), (float)(var4 + var6), (float)(var3 + var5), (float)(var4 + var6 - var10));
            var11.lineTo((float)(var3 + var5), (float)(var4 - this.K(var1)));
            if (var8 != null) {
               return var11;
            }
         }

         var12 = var2;
         var16 = 2;
      }

      if (var12 == var16) {
         var11.moveTo((float)(var3 + var5 + this.K(var1)), (float)var4);
         var11.lineTo((float)(var3 + var10), (float)var4);
         var11.quadTo((float)var3, (float)var4, (float)var3, (float)(var4 + var10));
         var11.lineTo((float)var3, (float)(var4 + var6 - var10));
         var11.quadTo((float)var3, (float)(var4 + var6), (float)(var3 + var10), (float)(var4 + var6));
         var11.lineTo((float)(var3 + var5 + this.K(var1)), (float)(var4 + var6));
         if (var8 != null) {
            return var11;
         }
      }

      var11.moveTo((float)(var3 - this.K(var1)), (float)var4);
      var11.lineTo((float)(var3 + var5 - var10), (float)var4);
      var11.quadTo((float)(var3 + var5), (float)var4, (float)(var3 + var5), (float)(var4 + var10));
      var11.lineTo((float)(var3 + var5), (float)(var4 + var6 - var10));
      var11.quadTo((float)(var3 + var5), (float)(var4 + var6), (float)(var3 + var5 - var10), (float)(var4 + var6));
      var11.lineTo((float)(var3 - this.K(var1)), (float)(var4 + var6));
      return var11;
   }

   public int K(Kq2 var1) {
      String var2 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = var1.equals(Kq2.shade);
      if (var2 != null) {
         if (var10000 != 0) {
            var10000 = this.r;
            if (var2 != null) {
               var10000 = this.r > 0 ? this.r : 1;
            }

            return -var10000;
         }

         var10000 = var1.equals(Kq2.border);
      }

      if (var2 != null) {
         if (var10000 != 0) {
            return -1;
         }

         var10000 = var1.equals(Kq2.backgroundPainter);
      }

      if (var2 != null) {
         if (var10000 != 0) {
            return 2;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public Point X(int var1, int var2, int var3, int var4, int var5) {
      String var6 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = var1;
      byte var10001 = 1;
      if (var6 != null) {
         if (var1 == 1) {
            return new Point(var2, var3);
         }

         var10000 = var1;
         var10001 = 3;
      }

      if (var6 != null) {
         if (var10000 == var10001) {
            return new Point(var2, var3 + var5);
         }

         var10000 = var1;
         var10001 = 2;
      }

      return var10000 == var10001 ? new Point(var2, var3) : new Point(var2 + var4, var3);
   }

   public Point K(int var1, int var2, int var3, int var4, int var5) {
      String var6 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = var1;
      byte var10001 = 1;
      if (var6 != null) {
         if (var1 == 1) {
            return new Point(var2, var3 + var5 - 4);
         }

         var10000 = var1;
         var10001 = 3;
      }

      if (var6 != null) {
         if (var10000 == var10001) {
            return new Point(var2, var3 + 4);
         }

         var10000 = var1;
         var10001 = 2;
      }

      return var10000 == var10001 ? new Point(var2 + var4 - 4, var3) : new Point(var2 + 4, var3);
   }

   @Override
   public void paintContentBorder(Graphics var1, int var2, int var3) {
      String var4;
      Graphics2D var5;
      Object var6;
      int var7;
      Insets var8;
      label113: {
         label112: {
            var5 = (Graphics2D)var1;
            String var10000 = com.finalshell.ui.panel.Hd2.X();
            var6 = RV.X(var5);
            var4 = var10000;
            var7 = this.M$int(var2);
            var8 = this.tabPane.getInsets();
            if (var4 != null) {
               if (var2 != 1 && var2 != 3) {
                  break label112;
               }

               var8.right++;
            }

            if (var4 != null) {
               break label113;
            }
         }

         var8.bottom++;
      }

      label116: {
         Rectangle var9 = var3 != -1 ? this.getTabBounds(this.tabPane, var3) : null;
         Shape var10 = this.j(var2, var7, var8, var9);
         int var15 = this.R.equals(Ij4.standalone);
         if (var4 != null) {
            if (var15 != 0) {
               label118: {
                  GeneralPath var11 = new GeneralPath(0);
                  var11.append(new Double(0.0, 0.0, (double)this.tabPane.getWidth(), (double)this.tabPane.getHeight()), false);
                  var11.append(var10, false);
                  var15 = this.w.containsKey(var3);
                  if (var4 != null) {
                     if (var15 != 0) {
                        Shape var12 = RV.n(var5, var10);
                        ((Og4)this.w.get(var3)).u(var5, var10.getBounds(), this.tabPane);
                        RV.w(var5, var12);
                        if (var4 != null) {
                           break label118;
                        }
                     }

                     var15 = var3;
                  }

                  Color var14 = var15 != -1 ? this.tabPane.getBackgroundAt(var3) : null;
                  Color var10001 = var14;
                  if (var4 != null) {
                     var10001 = var14 != null ? var14 : this.tabPane.getBackground();
                  }

                  var5.setPaint(var10001);
                  var5.fill(var10);
               }

               var5.setPaint(this.g);
               GA.l(var5, null, GO.F3, var10, null, this.tabPane.isFocusOwner());
               if (var4 != null) {
                  break label116;
               }
            }

            var15 = this.w.containsKey(var3);
         }

         label119: {
            if (var4 != null) {
               if (var15 != 0) {
                  ((Og4)this.w.get(var3)).u(var5, var10.getBounds(), this.tabPane);
                  if (var4 != null) {
                     break label119;
                  }
               }

               var15 = var3;
            }

            Color var13 = var15 != -1 ? this.tabPane.getBackgroundAt(var3) : null;
            Color var18 = var13;
            if (var4 != null) {
               var18 = var13 != null ? var13 : this.tabPane.getBackground();
            }

            var5.setPaint(var18);
            var5.fill(var10);
         }

         var5.setPaint(this.g);
         if (var4 == null) {
            return;
         }

         label78:
         if (var2 == 1) {
            if (var9 != null) {
               var15 = var8.left;
               int var19 = var9.x;
               if (var4 != null) {
                  if (var8.left < var9.x) {
                     var5.drawLine(var8.left, var8.top + var7, var9.x, var8.top + var7);
                  }

                  var15 = var9.x + var9.width;
                  var19 = this.tabPane.getWidth() - var8.right;
               }

               if (var15 >= var19) {
                  break label78;
               }

               var5.drawLine(var9.x + var9.width, var8.top + var7, this.tabPane.getWidth() - var8.right, var8.top + var7);
               if (var4 != null) {
                  break label78;
               }
            }

            var5.drawLine(var8.left, var8.top + var7, this.tabPane.getWidth() - var8.right, var8.top + var7);
         }
      }

      RV.X(var5, var6);
   }

   public int M$int(int var1) {
      String var2 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = var1;
      byte var10001 = 1;
      if (var2 != null) {
         label22:
         if (var1 != 1) {
            var10000 = var1;
            var10001 = 3;
            if (var2 != null) {
               if (var1 == 3) {
                  break label22;
               }

               var10000 = this.calculateTabAreaWidth(var1, this.runCount, this.maxTabWidth);
               var10001 = 1;
            }

            return var10000 - var10001;
         }

         var10000 = this.calculateTabAreaHeight(var1, this.runCount, this.maxTabHeight);
         var10001 = 1;
      }

      return var10000 - var10001;
   }

   public Shape j(int var1, int var2, Insets var3, Rectangle var4) {
      String var5 = com.finalshell.ui.panel.Hd2.X();
      int var10000 = this.R.equals(Ij4.standalone);
      if (var5 != null) {
         if (var10000 != 0) {
            if (var4 != null) {
               GeneralPath var11 = new GeneralPath(0);
               var10000 = var1;
               int var38 = 1;
               if (var5 != null) {
                  if (var1 == 1) {
                     int var13;
                     label282: {
                        var13 = var3.top + var2 - 1;
                        GeneralPath var26 = var11;
                        float var39 = (float)var4.x;
                        float var10002 = (float)var13;
                        if (var5 != null) {
                           var11.moveTo(var39, var10002);
                           if (var4.x > var3.left + this.r && this.r > 0) {
                              var11.lineTo((float)(var3.left + this.r), (float)var13);
                              var11.quadTo((float)var3.left, (float)var13, (float)var3.left, (float)(var13 + this.r));
                              if (var5 != null) {
                                 break label282;
                              }
                           }

                           var26 = var11;
                           var39 = (float)var3.left;
                           var10002 = (float)var13;
                        }

                        var26.lineTo(var39, var10002);
                     }

                     label335: {
                        var10000 = this.r;
                        if (var5 != null) {
                           if (this.r > 0) {
                              var11.lineTo((float)var3.left, (float)(this.tabPane.getHeight() - var3.bottom - this.r));
                              var11.quadTo(
                                 (float)var3.left,
                                 (float)(this.tabPane.getHeight() - var3.bottom),
                                 (float)(var3.left + this.r),
                                 (float)(this.tabPane.getHeight() - var3.bottom)
                              );
                              var11.lineTo((float)(this.tabPane.getWidth() - var3.right - this.r), (float)(this.tabPane.getHeight() - var3.bottom));
                              var11.quadTo(
                                 (float)(this.tabPane.getWidth() - var3.right),
                                 (float)(this.tabPane.getHeight() - var3.bottom),
                                 (float)(this.tabPane.getWidth() - var3.right),
                                 (float)(this.tabPane.getHeight() - var3.bottom - this.r)
                              );
                              if (var5 != null) {
                                 break label335;
                              }
                           }

                           var10000 = this.f;
                        }

                        if (var10000 != 0) {
                           var11.moveTo((float)(this.tabPane.getWidth() - var3.right), (float)(this.tabPane.getHeight() - var3.bottom));
                           if (var5 != null) {
                              break label335;
                           }
                        }

                        var11.lineTo((float)var3.left, (float)(this.tabPane.getHeight() - var3.bottom));
                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)(this.tabPane.getHeight() - var3.bottom));
                     }

                     label336: {
                        var10000 = var4.x + var4.width;
                        label262:
                        if (var5 != null) {
                           if (var10000 < this.tabPane.getWidth() - var3.right - this.r) {
                              var10000 = this.r;
                              if (var5 == null) {
                                 break label262;
                              }

                              if (this.r > 0) {
                                 var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)(var13 + this.r));
                                 var11.quadTo(
                                    (float)(this.tabPane.getWidth() - var3.right),
                                    (float)var13,
                                    (float)(this.tabPane.getWidth() - var3.right - this.r),
                                    (float)var13
                                 );
                                 if (var5 != null) {
                                    break label336;
                                 }
                              }
                           }

                           var10000 = this.f;
                        }

                        if (var10000 != 0) {
                           var11.moveTo((float)(this.tabPane.getWidth() - var3.right), (float)var13);
                           if (var5 != null) {
                              break label336;
                           }
                        }

                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)var13);
                     }

                     var11.lineTo((float)(var4.x + var4.width), (float)var13);
                     if (var5 != null) {
                        return var11;
                     }
                  }

                  var10000 = var1;
                  var38 = 3;
               }

               if (var5 != null) {
                  if (var10000 == var38) {
                     int var14;
                     label240: {
                        var14 = this.tabPane.getHeight() - var3.bottom - var2;
                        GeneralPath var29 = var11;
                        float var40 = (float)var4.x;
                        float var43 = (float)var14;
                        if (var5 != null) {
                           var11.moveTo(var40, var43);
                           if (var4.x > var3.left + this.r && this.r > 0) {
                              var11.lineTo((float)(var3.left + this.r), (float)var14);
                              var11.quadTo((float)var3.left, (float)var14, (float)var3.left, (float)(var14 - this.r));
                              if (var5 != null) {
                                 break label240;
                              }
                           }

                           var29 = var11;
                           var40 = (float)var3.left;
                           var43 = (float)var14;
                        }

                        var29.lineTo(var40, var43);
                     }

                     label232: {
                        if (this.r > 0) {
                           var11.lineTo((float)var3.left, (float)(var3.top + this.r));
                           var11.quadTo((float)var3.left, (float)var3.top, (float)(var3.left + this.r), (float)var3.top);
                           var11.lineTo((float)(this.tabPane.getWidth() - var3.right - this.r), (float)var3.top);
                           var11.quadTo(
                              (float)(this.tabPane.getWidth() - var3.right),
                              (float)var3.top,
                              (float)(this.tabPane.getWidth() - var3.right),
                              (float)(var3.top + this.r)
                           );
                           if (var5 != null) {
                              break label232;
                           }
                        }

                        var11.lineTo((float)var3.left, (float)var3.top);
                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)var3.top);
                     }

                     label227: {
                        label226: {
                           var10000 = var4.x + var4.width;
                           if (var5 != null) {
                              if (var10000 >= this.tabPane.getWidth() - var3.right - this.r) {
                                 break label226;
                              }

                              var10000 = this.r;
                           }

                           if (var10000 > 0) {
                              var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)(var14 - this.r));
                              var11.quadTo(
                                 (float)(this.tabPane.getWidth() - var3.right),
                                 (float)var14,
                                 (float)(this.tabPane.getWidth() - var3.right - this.r),
                                 (float)var14
                              );
                              if (var5 != null) {
                                 break label227;
                              }
                           }
                        }

                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)var14);
                     }

                     var11.lineTo((float)(var4.x + var4.width), (float)var14);
                     if (var5 != null) {
                        return var11;
                     }
                  }

                  var10000 = var1;
                  var38 = 2;
               }

               if (var5 != null) {
                  if (var10000 == var38) {
                     int var15;
                     label209: {
                        var15 = var3.left + var2;
                        GeneralPath var31 = var11;
                        float var41 = (float)var15;
                        float var44 = (float)var4.y;
                        if (var5 != null) {
                           var11.moveTo(var41, var44);
                           if (var4.y > var3.top + this.r && this.r > 0) {
                              var11.lineTo((float)var15, (float)(var3.top + this.r));
                              var11.quadTo((float)var15, (float)var3.top, (float)(var15 + this.r), (float)var3.top);
                              if (var5 != null) {
                                 break label209;
                              }
                           }

                           var31 = var11;
                           var41 = (float)var15;
                           var44 = (float)var3.top;
                        }

                        var31.lineTo(var41, var44);
                     }

                     label201: {
                        if (this.r > 0) {
                           var11.lineTo((float)(this.tabPane.getWidth() - var3.right - this.r), (float)var3.top);
                           var11.quadTo(
                              (float)(this.tabPane.getWidth() - var3.right),
                              (float)var3.top,
                              (float)(this.tabPane.getWidth() - var3.right),
                              (float)(var3.top + this.r)
                           );
                           var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)(this.tabPane.getHeight() - var3.bottom - this.r));
                           var11.quadTo(
                              (float)(this.tabPane.getWidth() - var3.right),
                              (float)(this.tabPane.getHeight() - var3.bottom),
                              (float)(this.tabPane.getWidth() - var3.right - this.r),
                              (float)(this.tabPane.getHeight() - var3.bottom)
                           );
                           if (var5 != null) {
                              break label201;
                           }
                        }

                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)var3.top);
                        var11.lineTo((float)(this.tabPane.getWidth() - var3.right), (float)(this.tabPane.getHeight() - var3.bottom));
                     }

                     label196: {
                        label195: {
                           var10000 = var4.y + var4.height;
                           if (var5 != null) {
                              if (var10000 >= this.tabPane.getHeight() - var3.bottom - this.r) {
                                 break label195;
                              }

                              var10000 = this.r;
                           }

                           if (var10000 > 0) {
                              var11.lineTo((float)(var15 + this.r), (float)(this.tabPane.getHeight() - var3.bottom));
                              var11.quadTo(
                                 (float)var15,
                                 (float)(this.tabPane.getHeight() - var3.bottom),
                                 (float)var15,
                                 (float)(this.tabPane.getHeight() - var3.bottom - this.r)
                              );
                              if (var5 != null) {
                                 break label196;
                              }
                           }
                        }

                        var11.lineTo((float)var15, (float)(this.tabPane.getHeight() - var3.bottom));
                     }

                     var11.lineTo((float)var15, (float)(var4.y + var4.height));
                     if (var5 != null) {
                        return var11;
                     }
                  }

                  var10000 = this.tabPane.getWidth() - var3.right;
                  var38 = var2;
               }

               int var16;
               label182: {
                  var16 = var10000 - var38;
                  GeneralPath var33 = var11;
                  float var42 = (float)var16;
                  float var45 = (float)var4.y;
                  if (var5 != null) {
                     var11.moveTo(var42, var45);
                     if (var4.y > var3.top + this.r && this.r > 0) {
                        var11.lineTo((float)var16, (float)(var3.top + this.r));
                        var11.quadTo((float)var16, (float)var3.top, (float)(var16 - this.r), (float)var3.top);
                        if (var5 != null) {
                           break label182;
                        }
                     }

                     var33 = var11;
                     var42 = (float)var16;
                     var45 = (float)var3.top;
                  }

                  var33.lineTo(var42, var45);
               }

               label174: {
                  if (this.r > 0) {
                     var11.lineTo((float)(var3.left + this.r), (float)var3.top);
                     var11.quadTo((float)var3.left, (float)var3.top, (float)var3.left, (float)(var3.top + this.r));
                     var11.lineTo((float)var3.left, (float)(this.tabPane.getHeight() - var3.bottom - this.r));
                     var11.quadTo(
                        (float)var3.left,
                        (float)(this.tabPane.getHeight() - var3.bottom),
                        (float)(var3.left + this.r),
                        (float)(this.tabPane.getHeight() - var3.bottom)
                     );
                     if (var5 != null) {
                        break label174;
                     }
                  }

                  var11.lineTo((float)var3.left, (float)var3.top);
                  var11.lineTo((float)var3.left, (float)(this.tabPane.getHeight() - var3.bottom));
               }

               label169: {
                  label168: {
                     var10000 = var4.y + var4.height;
                     if (var5 != null) {
                        if (var10000 >= this.tabPane.getHeight() - var3.bottom - this.r) {
                           break label168;
                        }

                        var10000 = this.r;
                     }

                     if (var10000 > 0) {
                        var11.lineTo((float)(var16 - this.r), (float)(this.tabPane.getHeight() - var3.bottom));
                        var11.quadTo(
                           (float)var16,
                           (float)(this.tabPane.getHeight() - var3.bottom),
                           (float)var16,
                           (float)(this.tabPane.getHeight() - var3.bottom - this.r)
                        );
                        if (var5 != null) {
                           break label169;
                        }
                     }
                  }

                  var11.lineTo((float)var16, (float)(this.tabPane.getHeight() - var3.bottom));
               }

               var11.lineTo((float)var16, (float)(var4.y + var4.height));
               return var11;
            }

            var10000 = var1;
            if (var5 != null) {
               var10000 = var1 == 1 ? 1 : 0;
            }

            int var10 = var10000;
            var10000 = var1;
            if (var5 != null) {
               var10000 = var1 == 3 ? 1 : 0;
            }

            int var12 = var10000;
            var10000 = var1;
            if (var5 != null) {
               var10000 = var1 == 2 ? 1 : 0;
            }

            int var17 = var10000;
            var10000 = var1;
            if (var5 != null) {
               var10000 = var1 == 4 ? 1 : 0;
            }

            int var18 = var10000;
            return new java.awt.geom.RoundRectangle2D.Double(
               (double)(var3.left + (var17 != 0 ? var2 : 0)),
               (double)(var3.top + (var10 != 0 ? var2 : 0)),
               (double)(this.tabPane.getWidth() - var3.left - var3.right - (var17 == 0 && var18 == 0 ? 0 : var2)),
               (double)(this.tabPane.getHeight() - var3.top - var3.bottom - (var10 == 0 && var12 == 0 ? 0 : var2)),
               (double)(this.r * 2),
               (double)(this.r * 2)
            );
         }

         var10000 = var3.left;
      }

      int var10001 = var1;
      if (var5 != null) {
         var10001 = var1 == 2 ? var2 : 0;
      }

      int var6 = var10000 + var10001;
      var10001 = var1;
      if (var5 != null) {
         var10001 = var1 == 1 ? var2 : 0;
      }

      int var7;
      var7 = var3.top + var10001;
      var10000 = this.tabPane.getWidth() - var3.left - var3.right;
      var10001 = var1;
      label325:
      if (var5 != null) {
         if (var1 != 2) {
            var10001 = var1;
            if (var5 == null) {
               break label325;
            }

            if (var1 != 4) {
               var10001 = 0;
               break label325;
            }
         }

         var10001 = var2;
      }

      int var8;
      var8 = var10000 - var10001;
      var10000 = this.tabPane.getHeight() - var3.top - var3.bottom;
      var10001 = var1;
      label317:
      if (var5 != null) {
         if (var1 != 1) {
            var10001 = var1;
            if (var5 == null) {
               break label317;
            }

            if (var1 != 3) {
               var10001 = 0;
               break label317;
            }
         }

         var10001 = var2;
      }

      int var9 = var10000 - var10001;
      return new Rectangle(var6, var7, var8 + 1, var9);
   }

   public Shape N$Shape() {
      java.awt.geom.RoundRectangle2D.Double var2 = null;
      int var3 = this.tabPane.getTabPlacement();
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      int var4 = this.M$int(var3);
      String var1 = var10000;
      Insets var5 = this.tabPane.getInsets();
      int var6 = var3;
      byte var10001 = 1;
      if (var1 != null) {
         if (var3 == 1) {
            var2 = new java.awt.geom.RoundRectangle2D.Double(
               (double)var5.left,
               (double)(var5.top + var4),
               (double)(this.tabPane.getWidth() - var5.left - var5.right),
               (double)(this.tabPane.getHeight() - var5.top - var4 - var5.bottom),
               (double)(this.r * 2),
               (double)(this.r * 2)
            );
            return var2;
         }

         var6 = var3;
         var10001 = 3;
      }

      if (var1 != null) {
         if (var6 == var10001) {
            var2 = new java.awt.geom.RoundRectangle2D.Double(
               (double)var5.left,
               (double)var5.top,
               (double)(this.tabPane.getWidth() - var5.left - var5.right),
               (double)(this.tabPane.getHeight() - var5.top - var4 - var5.bottom),
               (double)(this.r * 2),
               (double)(this.r * 2)
            );
            return var2;
         }

         var6 = var3;
         var10001 = 2;
      }

      if (var1 != null) {
         if (var6 == var10001) {
            var2 = new java.awt.geom.RoundRectangle2D.Double(
               (double)(var5.left + var4),
               (double)var5.top,
               (double)(this.tabPane.getWidth() - var5.left - var4 - var5.right),
               (double)(this.tabPane.getHeight() - var5.top - var5.bottom),
               (double)(this.r * 2),
               (double)(this.r * 2)
            );
            return var2;
         }

         var6 = var3;
         var10001 = 4;
      }

      if (var6 == var10001) {
         var2 = new java.awt.geom.RoundRectangle2D.Double(
            (double)var5.left,
            (double)var5.top,
            (double)(this.tabPane.getWidth() - var5.left - var4 - var5.right),
            (double)(this.tabPane.getHeight() - var5.top - var5.bottom),
            (double)(this.r * 2),
            (double)(this.r * 2)
         );
      }

      return var2;
   }

   @Override
   public void paintFocusIndicator(Graphics var1, int var2, Rectangle[] var3, int var4, Rectangle var5, Rectangle var6, boolean var7) {
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      label13: {
         String var3 = com.finalshell.ui.panel.Hd2.X();
         Og4 var10000 = this.C;
         if (var3 != null) {
            if (this.C == null) {
               break label13;
            }

            var10000 = this.C;
         }

         var10000.u((Graphics2D)var1, FN.N(var2), var2);
      }

      Map var4 = FN.B(var1);
      super.paint(var1, var2);
      FN.O(var1, var4);
   }

   public static JTabbedPane q(KV_2 var0) {
      return var0.tabPane;
   }

   public static JTabbedPane C(KV_2 var0) {
      return var0.tabPane;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "HWmjf)O}Xj&p(syU{mg\u000bpnShzl8qx".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 100;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      } else {
         var6 = 100;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 120;
               break;
            case 1:
               var23 = 82;
               break;
            case 2:
               var23 = 107;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 103;
               break;
            case 5:
               var23 = 41;
               break;
            default:
               var23 = 123;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}






