package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.XN;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Pb4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import javax.swing.text.View;

public class Yh2_2 extends BasicMenuItemUI implements L0_2 {
   public Insets O = OP.c;
   public int J = OP.L;
   public Color P = OP.l;
   public Color e = OP.I;
   public Color p;
   public Color t;
   public Color B;
   public Color x;
   public int s;
   public boolean I;
   public int l;
   public Og4 w;
   public PropertyChangeListener C;
   public XN f;
   public static String[] a;
   public static String[] c;
   public static long[] i;
   public static Integer[] j;

   public Yh2_2() {
      this.p = OP.x;
      this.t = OP.M;
      this.B = OP.R;
      this.x = OP.S;
      this.s = OP.E;
      this.I = OP.o;
      this.l = OP.J;
      this.w = OP.P;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new Yh2_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.menuItem);
      LookAndFeel.installProperty(this.menuItem, a(25224, -23116), Boolean.FALSE);
      this.menuItem.setIconTextGap(OP.v);
      WO.t(this.menuItem, this.w);
      this.h$void();
      this.C = new com.finalshell.ui.listener.Fu2(this);
      this.menuItem.addPropertyChangeListener(a(25226, 22175), this.C);
      this.f = XN.y(this.menuItem);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      WO.C(this.menuItem, this.w);
      this.menuItem.removePropertyChangeListener(a(25225, 19862), this.C);
      this.C = null;
      XN.s(this.f, this.menuItem);
      this.f = null;
      super.uninstallUI(var1);
   }

   public void h$void() {
      Insets var6;
      int[] var1 = Pb4.g();
      JMenuItem var10000 = this.menuItem;
      if (var1 != null) {
         if (this.menuItem == null) {
            return;
         }

         var10000 = this.menuItem;
      }

      byte var5 = (byte)((FN.l((JComponent)var10000)) ? 1 : 0);
      if (var1 != null) {
         if (var5 != 0) {
            return;
         }

         var5 = (byte)((this.menuItem.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      }

      Insets var3;
      label83: {
         byte var2 = var5;
         var3 = new Insets(this.O.top, var2 != 0 ? this.O.left : this.O.right, this.O.bottom, var2 != 0 ? this.O.right : this.O.left);
         if (var1 != null) {
            if (this.w != null) {
               Insets var4;
               int var7;
               int var10001;
               label66: {
                  var4 = this.w.B(this.menuItem);
                  var3.top = var3.top + var4.top;
                  var6 = var3;
                  var10001 = var3.bottom;
                  Insets var10002 = var4;
                  if (var1 != null) {
                     var3.bottom = var3.bottom + var4.bottom;
                     var6 = var3;
                     var10001 = var3.left;
                     if (var2 != 0) {
                        var7 = var4.left;
                        break label66;
                     }

                     var10002 = var4;
                  }

                  var7 = var10002.right;
               }

               var6.left = var10001 + var7;
               var7 = var2;
               if (var1 != null) {
                  var7 = var2 != 0 ? var4.right : var4.left;
               }

               var3.right += var7;
               if (var1 != null) {
                  break label83;
               }
            }

            var3.top = var3.top + Registry.lookupField(387072536670683426L).getInt(null) + 2;
         }

         int var9 = var2;
         if (var1 != null) {
            var9 = var2 != 0 ? 4 : a(6864, 2997439150569465652L);
         }

         var3.left = var3.left + var9 + this.J;
         var3.bottom = var3.bottom + Registry.lookupField(387072536670683426L).getInt(null);
         var9 = var2;
         if (var1 != null) {
            var9 = var2 != 0 ? a(32590, 4534993889300628140L) : 4;
         }

         var3.right = var3.right + var9 + this.J;
      }

      this.menuItem.setBorder(GA.y(var3));
   }

   public Insets s() {
      return this.O;
   }

   public void L(Insets var1) {
      this.O = var1;
      this.h$void();
   }

   public int W() {
      return this.J;
   }

   public void d(int var1) {
      this.J = var1;
      this.h$void();
   }

   public Color S$Color() {
      return this.P;
   }

   public void T(Color var1) {
      this.P = var1;
   }

   public Color f() {
      return this.e;
   }

   public void G(Color var1) {
      this.e = var1;
   }

   public Color w() {
      return this.p;
   }

   public void C(Color var1) {
      this.p = var1;
   }

   public Color x() {
      return this.t;
   }

   public void u(Color var1) {
      this.t = var1;
   }

   public Color z() {
      return this.B;
   }

   public void a(Color var1) {
      this.B = var1;
   }

   public Color B() {
      return this.x;
   }

   public void o(Color var1) {
      this.x = var1;
   }

   public int A() {
      return this.s;
   }

   public void U(int var1) {
      this.s = var1;
   }

   public boolean X() {
      return this.I;
   }

   public void E(boolean var1) {
      this.I = var1;
   }

   public int h$int() {
      return this.l;
   }

   public void v(int var1) {
      this.l = var1;
   }

   public Og4 j() {
      return this.w;
   }

   public void P(Og4 var1) {
      WO.C(this.menuItem, this.w);
      this.w = var1;
      WO.t(this.menuItem, this.w);
      this.h$void();
   }

   public Paint S$Paint() {
      return this.e;
   }

   public Paint u() {
      return this.p;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      boolean var17;
      JMenuItem var6;
      int[] var3;
      Graphics2D var4;
      Object var5;
      byte var7;
      int var8;
      Insets var10;
      int var11;
      int var12;
      boolean var31;
      label135: {
         label138: {
            var4 = (Graphics2D)var1;
            var5 = RV.X(var4);
            int[] var10000 = Pb4.g();
            var6 = (JMenuItem)var2;
            var7 = (byte)((var6.getComponentOrientation().isLeftToRight()) ? 1 : 0);
            var8 = var6.getWidth();
            var3 = var10000;
            int var9 = var6.getHeight();
            var10 = var6.getInsets();
            var11 = var10.top;
            var12 = var9 - var10.top - var10.bottom;
            ButtonModel var13 = var6.getModel();
            var31 = var6.isEnabled();
            if (var3 != null) {
               if (!var31) {
                  break label138;
               }

               var31 = var13.isArmed();
            }

            if (var3 == null) {
               break label135;
            }

            if (var31) {
               var31 = (1) != 0;
               break label135;
            }
         }

         var31 = (0) != 0;
      }

      boolean var14 = (boolean)var31;
      int var15 = WT.r(var6, this.I);
      var31 = (var15) != 0;
      if (var3 != null) {
         var31 = (var15 > 0 ? var6.getIconTextGap() : 0) != 0;
      }

      int var16;
      label123: {
         var16 = (var31) ? 1 : 0;
         var31 = (var7) != 0;
         if (var3 != null) {
            if (var7 != 0) {
               var31 = (var10.left) != 0;
               break label123;
            }

            var31 = (var8 - var10.right) != 0;
         }

         var31 -= var15;
      }

      int var42;
      label117: {
         var17 = var31;
         this.W(var4, var6, var17, var11, var15, var12, var14, (boolean)var7);
         this.j(var4, var6, var17, var11, var15, var12, var14, (boolean)var7);
         var42 = var7;
         if (var3 != null) {
            if (var7 != 0) {
               var42 = var15 + var16;
               break label117;
            }

            var42 = var16;
         }

         var42 = -var42;
      }

      String var18;
      label111: {
         label139: {
            var17 += var42;
            var18 = var6.getText();
            String var35 = var18;
            if (var3 != null) {
               if (var18 == null) {
                  break label139;
               }

               var35 = var18;
            }

            var31 = (var35.length()) != 0;
            if (var3 == null) {
               break label111;
            }

            if (var31 > 0) {
               var31 = (1) != 0;
               break label111;
            }
         }

         var31 = (0) != 0;
      }

      label146: {
         int var19;
         String var20;
         int var21;
         label98: {
            var19 = (var31) ? 1 : 0;
            var20 = WT.s(var6);
            var21 = var20 != null ? 1 : 0;
            var31 = (var19) != 0;
            if (var3 != null) {
               if (var19 != 0) {
                  break label98;
               }

               var31 = (var21) != 0;
            }

            if (!var31) {
               break label146;
            }
         }

         Map var22 = FN.Y(var4);
         var31 = (var19) != 0;
         if (var3 != null) {
            if (var19 != 0) {
               FontMetrics var23;
               label86: {
                  var23 = var6.getFontMetrics(var6.getFont());
                  View var24 = (View)var6.getClientProperty(a(25230, -16400));
                  View var39 = var24;
                  if (var3 != null) {
                     if (var24 == null) {
                        var31 = (var23.stringWidth(var18)) != 0;
                        break label86;
                     }

                     var39 = var24;
                  }

                  var31 = ((int)var39.getPreferredSpan(0)) != 0;
               }

               int var25 = (var31) ? 1 : 0;
               var42 = var7;
               if (var3 != null) {
                  var42 = var7 != 0 ? 0 : var25;
               }

               var17 -= var42;
               this.n(var4, var6, var23, var17, var11, var25, var12, var14, (boolean)var7);
            }

            var31 = (var21) != 0;
         }

         if (var31) {
            FontMetrics var29 = var6.getFontMetrics(this.acceleratorFont);
            int var30 = var29.stringWidth(var20);
            var31 = (var7) != 0;
            if (var3 != null) {
               var31 = (var7 != 0 ? var8 - var10.right - var30 : var10.left) != 0;
            }

            var17 = var31;
            this.f(var4, var6, var20, var29, var17, var11, var30, var12, var14, (boolean)var7);
         }

         FN.k(var4, var22);
      }

      RV.X(var4, var5);
      if (var3 == null) {
         Ky4.K(new String[3]);
      }
   }

   public void W(Graphics2D var1, JMenuItem var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      label18: {
         int[] var9 = Pb4.g();
         Og4 var10000 = this.w;
         if (var9 != null) {
            if (this.w == null) {
               break label18;
            }

            var10000 = this.w;
         }

         var10000.u(var1, FN.N(var2), var2);
         if (var9 != null) {
            return;
         }
      }

      if (var7) {
         var1.setPaint(new GradientPaint(0.0F, 0.0F, this.e, 0.0F, (float)var2.getHeight(), this.p));
         var1.fillRect(0, 0, var2.getWidth(), var2.getHeight());
      }
   }

   public void j(Graphics2D var1, JMenuItem var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int var20;
      int[] var9;
      Icon var16;
      label91: {
         int[] var10000 = Pb4.g();
         boolean var10 = var2.isEnabled();
         var9 = var10000;
         boolean var15 = var2.isSelected();
         if (var9 != null) {
            if (var15 && var2.getSelectedIcon() != null) {
               var16 = var10 ? var2.getSelectedIcon() : var2.getDisabledSelectedIcon();
               break label91;
            }

            var15 = var10;
         }

         var16 = var15 ? var2.getIcon() : var2.getDisabledIcon();
      }

      Icon var11 = var16;
      if (var11 != null) {
      int var17;
         label95: {
            var17 = (int)(var8);
            if (var9 != null) {
               if (var8) {
                  var17 = this.l;
                  if (var9 == null) {
                     break label95;
                  }

                  if (this.l != 2) {
                     var17 = this.l;
                     if (var9 == null) {
                        break label95;
                     }

                     if (this.l != a(15761, 1441300930009464944L)) {
                        var17 = 0;
                        break label95;
                     }
                  }

                  var17 = 1;
                  break label95;
               }

               var17 = this.l;
            }

            label77:
            if (var9 != null) {
               if (var17 != 4) {
                  var17 = this.l;
                  if (var9 == null) {
                     break label77;
                  }

                  if (this.l != a(12760, 1976303101620587579L)) {
                     var17 = 0;
                     break label77;
                  }
               }

               var17 = 1;
            }
         }

         int var12 = var17;
         int var18 = this.l;
         if (var9 != null) {
            var18 = this.l == 0 ? 1 : 0;
         }

         label97: {
            int var13 = var18;
            int var19 = var12;
            if (var9 != null) {
               if (var12 != 0) {
                  var20 = var3;
                  break label97;
               }

               var19 = var13;
            }

            if (var9 != null) {
               if (var19 != 0) {
                  var20 = var3 + var5 / 2 - var11.getIconWidth() / 2;
                  break label97;
               }

               var19 = var3 + var5;
            }

            var20 = var19 - var11.getIconWidth();
         }

         int var14 = var20;
         var11.paintIcon(var2, var1, var14, var4 + var6 / 2 - var11.getIconHeight() / 2);
      }
   }

   public void n(Graphics2D var1, JMenuItem var2, FontMetrics var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      int[] var10;
      Color var15;
      label36: {
         var10 = Pb4.g();
         JMenuItem var10001 = var2;
         if (var10 != null) {
            if (!var2.isEnabled()) {
               var15 = this.P;
               break label36;
            }

            var10001 = var2;
         }

         var15 = var10001.getForeground();
      }

      Font var11;
      label39: {
         label29: {
            var1.setPaint(var15);
            var11 = RV.b(var1, var2.getFont());
            View var12 = (View)var2.getClientProperty(a(25227, -15632));
            View var10000 = var12;
            if (var10 != null) {
               if (var12 == null) {
                  break label29;
               }

               var10000 = var12;
            }

            var10000.paint(var1, new Rectangle(var4, var5, var6, var7));
            if (var10 != null) {
               break label39;
            }
         }

         int var14 = A9.R$boolean();
         if (var10 != null) {
            var14 = var14 != 0 ? -1 : var2.getDisplayedMnemonicIndex();
         }

         int var13 = var14;
         FN.W(var1, var2.getText(), var13, var4, var5 + var7 / 2 + GA.d(var3));
      }

      RV.j(var1, var11);
   }

   public void f(Graphics2D var1, JMenuItem var2, String var3, FontMetrics var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      if (var9 && this.t != null) {
         int var11 = var4.getHeight();
         var1.setPaint(this.t);
         var1.fillRoundRect(var5 - 3, var6 + var8 / 2 - var11 / 2, var7 + a(26947, 4322182182839997603L), var11, 4, 4);
      }

      Font var12 = RV.b(var1, this.acceleratorFont);
      var1.setPaint(var2.isEnabled() ? this.B : this.x);
      var1.drawString(var3, var5, var6 + var8 / 2 + GA.d(var4));
      RV.j(var1, var12);
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      View var17;
      int var20;
      int[] var2;
      JMenuItem var3;
      Insets var4;
      FontMetrics var6;
      int var7;
      int var9;
      int var10;
      label74: {
         FontMetrics var5;
         label70: {
            int[] var10000 = Pb4.g();
            var3 = (JMenuItem)var1;
            var4 = var3.getInsets();
            var5 = var3.getFontMetrics(var3.getFont());
            var6 = var3.getFontMetrics(this.acceleratorFont);
            var7 = WT.r(var3, this.I);
            View var8 = (View)var3.getClientProperty(a(25227, -15632));
            var2 = var10000;
            var17 = var8;
            if (var2 != null) {
               if (var8 == null) {
                  break label70;
               }

               var17 = var8;
            }

            var9 = (int)var17.getPreferredSpan(0);
            var10 = (int)var8.getPreferredSpan(1);
            if (var2 != null) {
               break label74;
            }
         }

         int var19;
         label62: {
            label75: {
               String var11 = var3.getText();
               String var18 = var11;
               if (var2 != null) {
                  if (var11 == null) {
                     break label75;
                  }

                  var18 = var11;
               }

               var19 = var18.length();
               if (var2 == null) {
                  break label62;
               }

               if (var19 > 0) {
                  var19 = var5.stringWidth(var11);
                  break label62;
               }
            }

            var19 = 0;
         }

         var9 = var19;
         var10 = var5.getHeight();
      }

      label51: {
         label76: {
            var20 = var9;
            if (var2 != null) {
               if (var9 <= 0) {
                  break label76;
               }

               var20 = var7;
            }

            if (var2 == null) {
               break label51;
            }

            if (var20 > 0) {
               var20 = var3.getIconTextGap();
               break label51;
            }
         }

         var20 = 0;
      }

      int var13;
      int var16;
      label39: {
         var16 = var20;
         String var12 = WT.s(var3);
         var13 = var12 != null ? this.s + var6.stringWidth(var12) : 0;
         Icon var21 = var3.getIcon();
         if (var2 != null) {
            if (var21 == null) {
               var20 = 0;
               break label39;
            }

            var21 = var3.getIcon();
         }

         var20 = var21.getIconHeight();
      }

      int var14 = var20;
      int var15 = Gw2.E(new int[]{var14, var10, var6.getHeight()});
      return new Dimension(var4.left + var7 + var16 + var9 + var13 + var4.right, var4.top + var15 + var4.bottom);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ 25226) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 80;
               break;
            case 1:
               var10000 = 193;
               break;
            case 2:
               var10000 = 85;
               break;
            case 3:
               var10000 = 204;
               break;
            case 4:
               var10000 = 116;
               break;
            case 5:
               var10000 = 145;
               break;
            case 6:
               var10000 = 3;
               break;
            case 7:
               var10000 = 161;
               break;
            case 8:
               var10000 = 223;
               break;
            case 9:
               var10000 = 2;
               break;
            case 10:
               var10000 = 31;
               break;
            case 11:
               var10000 = 111;
               break;
            case 12:
               var10000 = 160;
               break;
            case 13:
               var10000 = 42;
               break;
            case 14:
               var10000 = 241;
               break;
            case 15:
               var10000 = 59;
               break;
            case 16:
               var10000 = 196;
               break;
            case 17:
               var10000 = 78;
               break;
            case 18:
               var10000 = 224;
               break;
            case 19:
               var10000 = 228;
               break;
            case 20:
               var10000 = 186;
               break;
            case 21:
               var10000 = 227;
               break;
            case 22:
               var10000 = 47;
               break;
            case 23:
               var10000 = 117;
               break;
            case 24:
               var10000 = 110;
               break;
            case 25:
               var10000 = 192;
               break;
            case 26:
               var10000 = 166;
               break;
            case 27:
               var10000 = 26;
               break;
            case 28:
               var10000 = 21;
               break;
            case 29:
               var10000 = 253;
               break;
            case 30:
               var10000 = 182;
               break;
            case 31:
               var10000 = 73;
               break;
            case 32:
               var10000 = 203;
               break;
            case 33:
               var10000 = 68;
               break;
            case 34:
               var10000 = 96;
               break;
            case 35:
               var10000 = 33;
               break;
            case 36:
               var10000 = 65;
               break;
            case 37:
               var10000 = 29;
               break;
            case 38:
               var10000 = 15;
               break;
            case 39:
               var10000 = 159;
               break;
            case 40:
               var10000 = 119;
               break;
            case 41:
               var10000 = 171;
               break;
            case 42:
               var10000 = 208;
               break;
            case 43:
               var10000 = 173;
               break;
            case 44:
               var10000 = 36;
               break;
            case 45:
               var10000 = 25;
               break;
            case 46:
               var10000 = 107;
               break;
            case 47:
               var10000 = 234;
               break;
            case 48:
               var10000 = 32;
               break;
            case 49:
               var10000 = 178;
               break;
            case 50:
               var10000 = 37;
               break;
            case 51:
               var10000 = 189;
               break;
            case 52:
               var10000 = 230;
               break;
            case 53:
               var10000 = 16;
               break;
            case 54:
               var10000 = 239;
               break;
            case 55:
               var10000 = 40;
               break;
            case 56:
               var10000 = 7;
               break;
            case 57:
               var10000 = 5;
               break;
            case 58:
               var10000 = 134;
               break;
            case 59:
               var10000 = 172;
               break;
            case 60:
               var10000 = 248;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 206;
               break;
            case 63:
               var10000 = 194;
               break;
            case 64:
               var10000 = 235;
               break;
            case 65:
               var10000 = 83;
               break;
            case 66:
               var10000 = 129;
               break;
            case 67:
               var10000 = 34;
               break;
            case 68:
               var10000 = 153;
               break;
            case 69:
               var10000 = 104;
               break;
            case 70:
               var10000 = 140;
               break;
            case 71:
               var10000 = 24;
               break;
            case 72:
               var10000 = 157;
               break;
            case 73:
               var10000 = 69;
               break;
            case 74:
               var10000 = 167;
               break;
            case 75:
               var10000 = 112;
               break;
            case 76:
               var10000 = 28;
               break;
            case 77:
               var10000 = 81;
               break;
            case 78:
               var10000 = 131;
               break;
            case 79:
               var10000 = 23;
               break;
            case 80:
               var10000 = 254;
               break;
            case 81:
               var10000 = 125;
               break;
            case 82:
               var10000 = 8;
               break;
            case 83:
               var10000 = 121;
               break;
            case 84:
               var10000 = 150;
               break;
            case 85:
               var10000 = 179;
               break;
            case 86:
               var10000 = 246;
               break;
            case 87:
               var10000 = 135;
               break;
            case 88:
               var10000 = 191;
               break;
            case 89:
               var10000 = 63;
               break;
            case 90:
               var10000 = 158;
               break;
            case 91:
               var10000 = 198;
               break;
            case 92:
               var10000 = 49;
               break;
            case 93:
               var10000 = 156;
               break;
            case 94:
               var10000 = 103;
               break;
            case 95:
               var10000 = 106;
               break;
            case 96:
               var10000 = 122;
               break;
            case 97:
               var10000 = 120;
               break;
            case 98:
               var10000 = 126;
               break;
            case 99:
               var10000 = 212;
               break;
            case 100:
               var10000 = 128;
               break;
            case 101:
               var10000 = 93;
               break;
            case 102:
               var10000 = 154;
               break;
            case 103:
               var10000 = 45;
               break;
            case 104:
               var10000 = 162;
               break;
            case 105:
               var10000 = 0;
               break;
            case 106:
               var10000 = 139;
               break;
            case 107:
               var10000 = 113;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 86;
               break;
            case 110:
               var10000 = 142;
               break;
            case 111:
               var10000 = 97;
               break;
            case 112:
               var10000 = 64;
               break;
            case 113:
               var10000 = 109;
               break;
            case 114:
               var10000 = 238;
               break;
            case 115:
               var10000 = 39;
               break;
            case 116:
               var10000 = 231;
               break;
            case 117:
               var10000 = 101;
               break;
            case 118:
               var10000 = 19;
               break;
            case 119:
               var10000 = 243;
               break;
            case 120:
               var10000 = 149;
               break;
            case 121:
               var10000 = 100;
               break;
            case 122:
               var10000 = 137;
               break;
            case 123:
               var10000 = 62;
               break;
            case 124:
               var10000 = 46;
               break;
            case 125:
               var10000 = 89;
               break;
            case 126:
               var10000 = 219;
               break;
            case 127:
               var10000 = 200;
               break;
            case 128:
               var10000 = 225;
               break;
            case 129:
               var10000 = 77;
               break;
            case 130:
               var10000 = 187;
               break;
            case 131:
               var10000 = 249;
               break;
            case 132:
               var10000 = 88;
               break;
            case 133:
               var10000 = 138;
               break;
            case 134:
               var10000 = 17;
               break;
            case 135:
               var10000 = 229;
               break;
            case 136:
               var10000 = 147;
               break;
            case 137:
               var10000 = 115;
               break;
            case 138:
               var10000 = 170;
               break;
            case 139:
               var10000 = 174;
               break;
            case 140:
               var10000 = 176;
               break;
            case 141:
               var10000 = 76;
               break;
            case 142:
               var10000 = 220;
               break;
            case 143:
               var10000 = 114;
               break;
            case 144:
               var10000 = 209;
               break;
            case 145:
               var10000 = 66;
               break;
            case 146:
               var10000 = 183;
               break;
            case 147:
               var10000 = 185;
               break;
            case 148:
               var10000 = 27;
               break;
            case 149:
               var10000 = 222;
               break;
            case 150:
               var10000 = 201;
               break;
            case 151:
               var10000 = 14;
               break;
            case 152:
               var10000 = 217;
               break;
            case 153:
               var10000 = 13;
               break;
            case 154:
               var10000 = 164;
               break;
            case 155:
               var10000 = 71;
               break;
            case 156:
               var10000 = 1;
               break;
            case 157:
               var10000 = 22;
               break;
            case 158:
               var10000 = 144;
               break;
            case 159:
               var10000 = 75;
               break;
            case 160:
               var10000 = 57;
               break;
            case 161:
               var10000 = 55;
               break;
            case 162:
               var10000 = 199;
               break;
            case 163:
               var10000 = 54;
               break;
            case 164:
               var10000 = 195;
               break;
            case 165:
               var10000 = 175;
               break;
            case 166:
               var10000 = 95;
               break;
            case 167:
               var10000 = 53;
               break;
            case 168:
               var10000 = 152;
               break;
            case 169:
               var10000 = 233;
               break;
            case 170:
               var10000 = 155;
               break;
            case 171:
               var10000 = 188;
               break;
            case 172:
               var10000 = 251;
               break;
            case 173:
               var10000 = 165;
               break;
            case 174:
               var10000 = 79;
               break;
            case 175:
               var10000 = 211;
               break;
            case 176:
               var10000 = 90;
               break;
            case 177:
               var10000 = 43;
               break;
            case 178:
               var10000 = 242;
               break;
            case 179:
               var10000 = 148;
               break;
            case 180:
               var10000 = 58;
               break;
            case 181:
               var10000 = 221;
               break;
            case 182:
               var10000 = 56;
               break;
            case 183:
               var10000 = 180;
               break;
            case 184:
               var10000 = 87;
               break;
            case 185:
               var10000 = 9;
               break;
            case 186:
               var10000 = 146;
               break;
            case 187:
               var10000 = 197;
               break;
            case 188:
               var10000 = 118;
               break;
            case 189:
               var10000 = 130;
               break;
            case 190:
               var10000 = 214;
               break;
            case 191:
               var10000 = 141;
               break;
            case 192:
               var10000 = 132;
               break;
            case 193:
               var10000 = 18;
               break;
            case 194:
               var10000 = 98;
               break;
            case 195:
               var10000 = 10;
               break;
            case 196:
               var10000 = 38;
               break;
            case 197:
               var10000 = 240;
               break;
            case 198:
               var10000 = 4;
               break;
            case 199:
               var10000 = 72;
               break;
            case 200:
               var10000 = 60;
               break;
            case 201:
               var10000 = 202;
               break;
            case 202:
               var10000 = 168;
               break;
            case 203:
               var10000 = 74;
               break;
            case 204:
               var10000 = 61;
               break;
            case 205:
               var10000 = 232;
               break;
            case 206:
               var10000 = 84;
               break;
            case 207:
               var10000 = 67;
               break;
            case 208:
               var10000 = 41;
               break;
            case 209:
               var10000 = 169;
               break;
            case 210:
               var10000 = 218;
               break;
            case 211:
               var10000 = 181;
               break;
            case 212:
               var10000 = 136;
               break;
            case 213:
               var10000 = 177;
               break;
            case 214:
               var10000 = 44;
               break;
            case 215:
               var10000 = 82;
               break;
            case 216:
               var10000 = 226;
               break;
            case 217:
               var10000 = 50;
               break;
            case 218:
               var10000 = 11;
               break;
            case 219:
               var10000 = 92;
               break;
            case 220:
               var10000 = 143;
               break;
            case 221:
               var10000 = 213;
               break;
            case 222:
               var10000 = 123;
               break;
            case 223:
               var10000 = 207;
               break;
            case 224:
               var10000 = 99;
               break;
            case 225:
               var10000 = 247;
               break;
            case 226:
               var10000 = 133;
               break;
            case 227:
               var10000 = 215;
               break;
            case 228:
               var10000 = 250;
               break;
            case 229:
               var10000 = 30;
               break;
            case 230:
               var10000 = 252;
               break;
            case 231:
               var10000 = 151;
               break;
            case 232:
               var10000 = 127;
               break;
            case 233:
               var10000 = 48;
               break;
            case 234:
               var10000 = 124;
               break;
            case 235:
               var10000 = 245;
               break;
            case 236:
               var10000 = 35;
               break;
            case 237:
               var10000 = 20;
               break;
            case 238:
               var10000 = 244;
               break;
            case 239:
               var10000 = 205;
               break;
            case 240:
               var10000 = 210;
               break;
            case 241:
               var10000 = 255;
               break;
            case 242:
               var10000 = 94;
               break;
            case 243:
               var10000 = 216;
               break;
            case 244:
               var10000 = 70;
               break;
            case 245:
               var10000 = 102;
               break;
            case 246:
               var10000 = 236;
               break;
            case 247:
               var10000 = 190;
               break;
            case 248:
               var10000 = 163;
               break;
            case 249:
               var10000 = 51;
               break;
            case 250:
               var10000 = 52;
               break;
            case 251:
               var10000 = 237;
               break;
            case 252:
               var10000 = 184;
               break;
            case 253:
               var10000 = 12;
               break;
            case 254:
               var10000 = 108;
               break;
            default:
               var10000 = 6;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15840;
      if (j[var3] == null) {
         j[var3] = (int)(i[var3] ^ var1);
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long[] var6;
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "æ\u0097§Ü\u0080Y\u008e\u008aX¤_\u0080`CÝ\u009e,+Ë\u009d\u0004A?9\u00ad\u0006øÀåË_\u0091";
      int var12 = "æ\u0097§Ü\u0080Y\u008e\u008aX¤_\u0080`CÝ\u009e,+Ë\u009d\u0004A?9\u00ad\u0006øÀåË_\u0091".length();
      char var9 = 20;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 114;
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
                        var65 = 24;
                        break;
                     case 1:
                        var65 = 44;
                        break;
                     case 2:
                        var65 = 38;
                        break;
                     case 3:
                        var65 = 101;
                        break;
                     case 4:
                        var65 = 35;
                        break;
                     case 5:
                        var65 = 66;
                        break;
                     default:
                        var65 = 33;
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
                     c = new String[5];
                     long var0 = 2561882545638317819L;
                     var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u009fé§@\u008f¸Ê^\u0013Òá}*¬\u001e\u0081+Ç\fÞ'_\\P";
                     int var5 = "\u009fé§@\u008f¸Ê^\u0013Òá}*¬\u001e\u0081+Ç\fÞ'_\\P".length();
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
                                    i = var6;
                                    j = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "2ÝV>%\u0092\u0092Ëm¢\u009e¸¬\u00819È";
                                 var5 = "2ÝV>%\u0092\u0092Ëm¢\u009e¸¬\u00819È".length();
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

                  var10 = "ê\u0019ÂéÈ\u001bc&\u0001Õ\u0090J}þ\u009aÍ ¥®¨\u0004\fut\u0000";
                  var12 = "ê\u0019ÂéÈ\u001bc&\u0001Õ\u0090J}þ\u009aÍ ¥®¨\u0004\fut\u0000".length();
                  var9 = 20;
                  var17 = -1;
            }

            var10000 = 63;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





