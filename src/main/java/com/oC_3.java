package com;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuUI;
import javax.swing.text.View;

public class oC_3 extends BasicMenuUI implements com.L0 {
   public static final ImageIcon r;
   public static final ImageIcon U;
   protected int n;
   protected int b;
   protected Insets W;
   protected int J;
   protected Color v;
   protected Color V;
   protected Color y;
   protected int D;
   protected boolean Y;
   protected int a;
   protected com.og_4 o;
   protected PropertyChangeListener c;
   protected MouseAdapter w;
   protected XN u;
   protected boolean i;
   private static final String[] d;
   private static final String[] e;
   private static final long[] f;
   private static final Integer[] g;

   public oC_3() {
      this.n = com.OP.b;
      this.b = com.OP.T;
      this.W = com.OP.c;
      this.J = com.OP.L;
      this.v = com.OP.l;
      this.V = com.OP.I;
      this.y = com.OP.x;
      this.D = com.OP.E;
      this.Y = com.OP.o;
      this.a = com.OP.J;
      this.o = com.OP.P;
      this.i = false;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new com.oC_3();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      com.FN.Y(this.menuItem);
      LookAndFeel.installProperty(this.menuItem, a(-11705, 10519), Boolean.FALSE);
      this.menuItem.setBackground(this.y);
      this.menuItem.setIconTextGap(com.OP.v);
      com.WO.t(this.menuItem, this.o);
      this.h();
      this.c = new w5_2(this);
      this.menuItem.addPropertyChangeListener(a(-11706, -5928), this.c);
      this.w = new com.kS_3(this);
      this.menuItem.addMouseListener(this.w);
      this.u = XN.y(this.menuItem);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      com.WO.C(this.menuItem, this.o);
      this.menuItem.removePropertyChangeListener(a(-11699, 14042), this.c);
      this.c = null;
      this.menuItem.removeMouseListener(this.w);
      this.w = null;
      XN.s(this.u, this.menuItem);
      this.u = null;
      super.uninstallUI(var1);
   }

   @Override
   public void h() {
      int[] var1 = pb_4.g();
      JMenuItem var10000 = this.menuItem;
      if (var1 != null) {
         if (this.menuItem == null) {
            return;
         }

         var10000 = this.menuItem;
      }

      byte var5 = com.FN.l((JComponent)var10000);
      if (var1 != null) {
         if (var5 != 0) {
            return;
         }

         var5 = this.menuItem.getComponentOrientation().isLeftToRight();
      }

      Insets var3;
      label83: {
         byte var2 = var5;
         var3 = new Insets(this.W.top, var2 != 0 ? this.W.left : this.W.right, this.W.bottom, var2 != 0 ? this.W.right : this.W.left);
         if (var1 != null) {
            if (this.o != null) {
               Insets var4;
               int var7;
               int var10001;
               label66: {
                  var4 = this.o.B(this.menuItem);
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

            var3.top = var3.top + com.c.c(387072536670683426L).getInt(null) + 2;
         }

         int var9 = var2;
         if (var1 != null) {
            var9 = var2 != 0 ? 4 : a(9093, 3479927969145857597L);
         }

         var3.left = var3.left + var9 + this.J;
         var3.bottom = var3.bottom + com.c.c(387072536670683426L).getInt(null);
         var9 = var2;
         if (var1 != null) {
            var9 = var2 != 0 ? a(23805, 3731844113962654022L) : 4;
         }

         var3.right = var3.right + var9 + this.J;
      }

      this.menuItem.setBorder(GA.y(var3));
   }

   public int F() {
      return this.n;
   }

   public void C(int var1) {
      this.n = var1;
   }

   public int t() {
      return this.b;
   }

   public void P(int var1) {
      this.b = var1;
   }

   public Insets o() {
      return this.W;
   }

   public void S(Insets var1) {
      this.W = var1;
      this.h();
   }

   public int q() {
      return this.J;
   }

   public void f(int var1) {
      this.J = var1;
      this.h();
   }

   public Color P() {
      return this.v;
   }

   public void E(Color var1) {
      this.v = var1;
   }

   public Color w() {
      return this.V;
   }

   public void l(Color var1) {
      this.V = var1;
   }

   public Color Q() {
      return this.y;
   }

   public void W(Color var1) {
      this.y = var1;
   }

   public int L() {
      return this.D;
   }

   public void v(int var1) {
      this.D = var1;
   }

   public boolean T() {
      return this.Y;
   }

   public void K(boolean var1) {
      this.Y = var1;
   }

   public int f() {
      return this.a;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public com.og_4 P$comog_4() {
      return this.o;
   }

   public void z(com.og_4 var1) {
      com.WO.C(this.menuItem, this.o);
      this.o = var1;
      com.WO.t(this.menuItem, this.o);
      this.h();
   }

   public Paint J() {
      return this.V;
   }

   public Paint Y() {
      return this.y;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int[] var3;
      Graphics2D var4;
      Object var5;
      JMenu var6;
      byte var7;
      int var8;
      Insets var10;
      int var11;
      int var12;
      boolean var28;
      label111: {
         label110: {
            label114: {
               var4 = (Graphics2D)var1;
               var5 = RV.X(var4);
               var6 = (JMenu)var2;
               var7 = var6.getComponentOrientation().isLeftToRight();
               var8 = var6.getWidth();
               int var9 = var6.getHeight();
               int[] var10000 = pb_4.g();
               var10 = var6.getInsets();
               var11 = var10.top;
               var12 = var9 - var10.top - var10.bottom;
               ButtonModel var13 = var6.getModel();
               var3 = var10000;
               var28 = var6.isEnabled();
               if (var3 != null) {
                  if (!var28) {
                     break label114;
                  }

                  var28 = var13.isArmed();
               }

               if (var3 == null) {
                  break label111;
               }

               if (var28) {
                  break label110;
               }

               var28 = var13.isSelected();
               if (var3 == null) {
                  break label111;
               }

               if (var28) {
                  break label110;
               }
            }

            var28 = 0;
            break label111;
         }

         var28 = 1;
      }

      boolean var14 = (boolean)var28;
      this.M(var4, var6, var14, (boolean)var7);
      int var15 = com.WT.r(var6, this.Y);
      var28 = var15;
      if (var3 != null) {
         var28 = var15 > 0 ? var6.getIconTextGap() : 0;
      }

      int var16;
      label93: {
         var16 = var28;
         var28 = var7;
         if (var3 != null) {
            if (var7 != 0) {
               var28 = var10.left;
               break label93;
            }

            var28 = var8 - var10.right;
         }

         var28 -= var15;
      }

      int var17;
      int var35;
      label87: {
         var17 = var28;
         this.v(var4, var6, var17, var11, var15, var12, var14, (boolean)var7);
         var35 = var7;
         if (var3 != null) {
            if (var7 != 0) {
               var35 = var15 + var16;
               break label87;
            }

            var35 = var16;
         }

         var35 = -var35;
      }

      label81: {
         var17 += var35;
         String var18 = var6.getText();
         String var32 = var18;
         if (var3 != null) {
            if (var18 == null) {
               break label81;
            }

            var32 = var18;
         }

         if (var32.length() > 0) {
            Map var19;
            Font var20;
            FontMetrics var21;
            label74: {
               var19 = com.FN.Y(var4);
               var20 = RV.b(var1, var6.getFont());
               var21 = var6.getFontMetrics(var6.getFont());
               View var22 = (View)var6.getClientProperty(a(-11710, 26908));
               View var33 = var22;
               if (var3 != null) {
                  if (var22 == null) {
                     var28 = var21.stringWidth(var18);
                     break label74;
                  }

                  var33 = var22;
               }

               var28 = (int)var33.getPreferredSpan(0);
            }

            int var23 = var28;
            var35 = var7;
            if (var3 != null) {
               var35 = var7 != 0 ? 0 : var23;
            }

            var17 -= var35;
            this.C(var4, var6, var21, var17, var11, var23, var12, var14, (boolean)var7);
            RV.j(var1, var20);
            com.FN.k(var4, var19);
         }
      }

      Icon var26 = this.d(var6);
      if (var3 != null) {
         if (var26 != null) {
            Composite var27 = RV.a(var4, 0.4F, var14);
            int var10003 = var7;
            if (var3 != null) {
               var10003 = var7 != 0 ? var8 - var10.right - var26.getIconWidth() : var10.left;
            }

            var26.paintIcon(var6, var4, var10003, var11 + var12 / 2 - var26.getIconHeight() / 2);
            RV.E(var4, var27, var14);
         }

         RV.X(var4, var5);
      }

      if (com.ky_4.F() != null) {
         pb_4.C(new int[4]);
      }
   }

   protected void M(Graphics2D var1, JMenu var2, boolean var3, boolean var4) {
      int[] var5;
      label73: {
         var5 = pb_4.g();
         com.og_4 var10000 = this.o;
         if (var5 != null) {
            if (this.o == null) {
               break label73;
            }

            var10000 = this.o;
         }

         var10000.u(var1, com.FN.N(var2), var2);
         if (var5 != null) {
            return;
         }
      }

      boolean var6 = var2.getParent() instanceof JPopupMenu;
      if (var5 != null) {
         if (var6) {
            if (!var3) {
               return;
            }

            var1.setPaint(new GradientPaint(0.0F, 0.0F, this.V, 0.0F, (float)var2.getHeight(), this.y));
            var1.fillRect(0, 0, var2.getWidth(), var2.getHeight());
            if (var5 != null) {
               return;
            }
         }

         var6 = var2.isEnabled();
      }

      if (var5 != null) {
         if (!var6) {
            return;
         }

         var6 = var3;
      }

      label52: {
         if (var5 != null) {
            if (var6) {
               break label52;
            }

            var6 = this.i;
         }

         if (!var6) {
            return;
         }
      }

      Color var10002;
      int var10003;
      int var10004;
      boolean var10005;
      boolean var10006;
      label44: {
         label77: {
            var10002 = GO.r;
            var10003 = this.b;
            var10004 = this.n;
            var10005 = var2.isEnabled();
            var10006 = var3;
            if (var5 != null) {
               if (var3) {
                  break label77;
               }

               var10006 = this.i;
            }

            if (var5 == null) {
               break label44;
            }

            if (var10006) {
               var10006 = true;
               break label44;
            }
         }

         var10006 = false;
      }

      GA.R(var1, var2, var10002, var10003, var10004, var10005, var10006, var3 ? GO.J : GO.N);
   }

   protected void v(Graphics2D var1, JMenu var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int[] var9;
      Icon var14;
      label83: {
         var9 = pb_4.g();
         JMenu var10000 = var2;
         if (var9 != null) {
            if (var2.isEnabled()) {
               var14 = var2.getIcon();
               break label83;
            }

            var10000 = var2;
         }

         var14 = var10000.getDisabledIcon();
      }

      Icon var10 = var14;
      if (var10 != null) {
         label87: {
            var15 = var8;
            if (var9 != null) {
               if (var8 != 0) {
                  var15 = this.a;
                  if (var9 == null) {
                     break label87;
                  }

                  if (this.a != 2) {
                     var15 = this.a;
                     if (var9 == null) {
                        break label87;
                     }

                     if (this.a != a(11390, 2078188565459806660L)) {
                        var15 = 0;
                        break label87;
                     }
                  }

                  var15 = 1;
                  break label87;
               }

               var15 = this.a;
            }

            label70:
            if (var9 != null) {
               if (var15 != 4) {
                  var15 = this.a;
                  if (var9 == null) {
                     break label70;
                  }

                  if (this.a != a(28013, 280899500326414548L)) {
                     var15 = 0;
                     break label70;
                  }
               }

               var15 = 1;
            }
         }

         int var11 = var15;
         int var16 = this.a;
         if (var9 != null) {
            var16 = this.a == 0 ? 1 : 0;
         }

         label89: {
            int var12 = var16;
            int var17 = var11;
            if (var9 != null) {
               if (var11 != 0) {
                  var18 = var3;
                  break label89;
               }

               var17 = var12;
            }

            if (var9 != null) {
               if (var17 != 0) {
                  var18 = var3 + var5 / 2 - var10.getIconWidth() / 2;
                  break label89;
               }

               var17 = var3 + var5;
            }

            var18 = var17 - var10.getIconWidth();
         }

         int var13 = var18;
         var10.paintIcon(var2, var1, var13, var4 + var6 / 2 - var10.getIconHeight() / 2);
      }
   }

   protected void C(Graphics2D var1, JMenu var2, FontMetrics var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      int[] var10;
      Color var14;
      label36: {
         var10 = pb_4.g();
         JMenu var10001 = var2;
         if (var10 != null) {
            if (!var2.isEnabled()) {
               var14 = this.v;
               break label36;
            }

            var10001 = var2;
         }

         var14 = var10001.getForeground();
      }

      label29: {
         var1.setPaint(var14);
         View var11 = (View)var2.getClientProperty(a(-11708, -8083));
         View var10000 = var11;
         if (var10 != null) {
            if (var11 == null) {
               break label29;
            }

            var10000 = var11;
         }

         var10000.paint(var1, new Rectangle(var4, var5, var6, var7));
         if (var10 != null) {
            return;
         }
      }

      int var13 = com.a9.R();
      if (var10 != null) {
         var13 = var13 != 0 ? -1 : var2.getDisplayedMnemonicIndex();
      }

      int var12 = var13;
      com.FN.W(var1, var2.getText(), var12, var4, var5 + var7 / 2 + GA.d(var3));
   }

   protected Icon d(JMenu var1) {
      int[] var2 = pb_4.g();
      boolean var10000 = var1.getParent() instanceof JPopupMenu;
      if (var2 != null) {
         if (!var10000) {
            return null;
         }

         var10000 = var1.getComponentOrientation().isLeftToRight();
      }

      boolean var3 = var10000;
      var10000 = var1.isEnabled();
      if (var2 != null) {
         if (var10000) {
            return var3 ? r : U;
         }

         var10000 = var3;
      }

      return var10000 ? Xg_2.H(a(-11707, -21878), r) : Xg_2.H(a(-11709, 15456), U);
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      int[] var2;
      JMenu var3;
      Insets var4;
      FontMetrics var6;
      int var7;
      int var9;
      int var10;
      label74: {
         FontMetrics var5;
         label70: {
            var3 = (JMenu)var1;
            int[] var10000 = pb_4.g();
            var4 = var3.getInsets();
            var5 = var3.getFontMetrics(var3.getFont());
            var6 = var3.getFontMetrics(this.acceleratorFont);
            var2 = var10000;
            var7 = com.WT.r(var3, this.Y);
            View var8 = (View)var3.getClientProperty(a(-11708, -8083));
            View var17 = var8;
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

      int var20;
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
         Icon var12 = this.d(var3);
         var13 = var12 != null ? this.D + var12.getIconWidth() : 0;
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
      int var15 = Gw_2.E(new int[]{var14, var10, var6.getHeight()});
      return new Dimension(var4.left + var7 + var16 + var9 + var13 + var4.right, var4.top + var15 + var4.bottom);
   }

   static JMenuItem l(com.oC_3 var0) {
      return var0.menuItem;
   }

   static JMenuItem w(com.oC_3 var0) {
      return var0.menuItem;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "±\tA\u0007\u0013ñbµ´\u0000ÜFO}¢(0\u0090Ñ\u0004Ò\u0003¯l\u0006S.tP\u0000\u009b\u00146ZY#2ß8\u0082\u0011A0Qô\u0099\u0097Z\u0081õ\u0013?\u0014ÜÅMCîO8å\u0093\u0012£$/b}\u0018\u0019\u0013\u0010Ð\u0013Uª|®ÈòüR\u000bä°äA¦!ûS`Å\u0012m\u0011Ú\u0004`\u0091\f¹y\u0081{zgk»_\u0085\u0010";
      int var12 = "±\tA\u0007\u0013ñbµ´\u0000ÜFO}¢(0\u0090Ñ\u0004Ò\u0003¯l\u0006S.tP\u0000\u009b\u00146ZY#2ß8\u0082\u0011A0Qô\u0099\u0097Z\u0081õ\u0013?\u0014ÜÅMCîO8å\u0093\u0012£$/b}\u0018\u0019\u0013\u0010Ð\u0013Uª|®ÈòüR\u000bä°äA¦!ûS`Å\u0012m\u0011Ú\u0004`\u0091\f¹y\u0081{zgk»_\u0085\u0010"
         .length();
      char var9 = 19;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 16;
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
                        var65 = 13;
                        break;
                     case 1:
                        var65 = 125;
                        break;
                     case 2:
                        var65 = 78;
                        break;
                     case 3:
                        var65 = 39;
                        break;
                     case 4:
                        var65 = 109;
                        break;
                     case 5:
                        var65 = 93;
                        break;
                     default:
                        var65 = 38;
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
                     d = var13;
                     e = new String[9];
                     long var0 = 6953005946931731015L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "ò\u000fRª\u0082\u00812\u0098¸¸\u000eÍ\u0018éü}";
                     int var5 = "ò\u000fRª\u0082\u00812\u0098¸¸\u000eÍ\u0018éü}".length();
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
                                    f = var6;
                                    g = new Integer[4];
                                    r = new ImageIcon(com.oC_3.class.getResource(a(-11711, 21810)));
                                    U = new ImageIcon(com.oC_3.class.getResource(a(-11712, -15809)));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "0\u009f´øåë\u0003\u0006f\u001cÐª \u0089ó\u0089";
                                 var5 = "0\u009f´øåë\u0003\u0006f\u001cÐª \u0089ó\u0089".length();
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

                  var10 = "aruî\u0014J\u009az\u0097úå\u008di\u000b\u0090ßÇ¥ç\u00119ý50\u008b";
                  var12 = "aruî\u0014J\u009az\u0097úå\u008di\u000b\u0090ßÇ¥ç\u00119ý50\u008b".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 29;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -11707) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 157;
               break;
            case 1:
               var10000 = 223;
               break;
            case 2:
               var10000 = 94;
               break;
            case 3:
               var10000 = 145;
               break;
            case 4:
               var10000 = 140;
               break;
            case 5:
               var10000 = 45;
               break;
            case 6:
               var10000 = 239;
               break;
            case 7:
               var10000 = 142;
               break;
            case 8:
               var10000 = 75;
               break;
            case 9:
               var10000 = 78;
               break;
            case 10:
               var10000 = 147;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 95;
               break;
            case 13:
               var10000 = 77;
               break;
            case 14:
               var10000 = 216;
               break;
            case 15:
               var10000 = 67;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 130;
               break;
            case 18:
               var10000 = 10;
               break;
            case 19:
               var10000 = 55;
               break;
            case 20:
               var10000 = 252;
               break;
            case 21:
               var10000 = 244;
               break;
            case 22:
               var10000 = 226;
               break;
            case 23:
               var10000 = 19;
               break;
            case 24:
               var10000 = 232;
               break;
            case 25:
               var10000 = 89;
               break;
            case 26:
               var10000 = 28;
               break;
            case 27:
               var10000 = 32;
               break;
            case 28:
               var10000 = 108;
               break;
            case 29:
               var10000 = 39;
               break;
            case 30:
               var10000 = 181;
               break;
            case 31:
               var10000 = 38;
               break;
            case 32:
               var10000 = 6;
               break;
            case 33:
               var10000 = 119;
               break;
            case 34:
               var10000 = 153;
               break;
            case 35:
               var10000 = 61;
               break;
            case 36:
               var10000 = 245;
               break;
            case 37:
               var10000 = 190;
               break;
            case 38:
               var10000 = 14;
               break;
            case 39:
               var10000 = 52;
               break;
            case 40:
               var10000 = 43;
               break;
            case 41:
               var10000 = 184;
               break;
            case 42:
               var10000 = 195;
               break;
            case 43:
               var10000 = 144;
               break;
            case 44:
               var10000 = 254;
               break;
            case 45:
               var10000 = 76;
               break;
            case 46:
               var10000 = 146;
               break;
            case 47:
               var10000 = 222;
               break;
            case 48:
               var10000 = 79;
               break;
            case 49:
               var10000 = 73;
               break;
            case 50:
               var10000 = 74;
               break;
            case 51:
               var10000 = 236;
               break;
            case 52:
               var10000 = 250;
               break;
            case 53:
               var10000 = 85;
               break;
            case 54:
               var10000 = 53;
               break;
            case 55:
               var10000 = 251;
               break;
            case 56:
               var10000 = 58;
               break;
            case 57:
               var10000 = 141;
               break;
            case 58:
               var10000 = 255;
               break;
            case 59:
               var10000 = 20;
               break;
            case 60:
               var10000 = 106;
               break;
            case 61:
               var10000 = 231;
               break;
            case 62:
               var10000 = 22;
               break;
            case 63:
               var10000 = 34;
               break;
            case 64:
               var10000 = 105;
               break;
            case 65:
               var10000 = 225;
               break;
            case 66:
               var10000 = 9;
               break;
            case 67:
               var10000 = 31;
               break;
            case 68:
               var10000 = 113;
               break;
            case 69:
               var10000 = 114;
               break;
            case 70:
               var10000 = 127;
               break;
            case 71:
               var10000 = 36;
               break;
            case 72:
               var10000 = 30;
               break;
            case 73:
               var10000 = 240;
               break;
            case 74:
               var10000 = 217;
               break;
            case 75:
               var10000 = 17;
               break;
            case 76:
               var10000 = 201;
               break;
            case 77:
               var10000 = 99;
               break;
            case 78:
               var10000 = 246;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 180;
               break;
            case 81:
               var10000 = 137;
               break;
            case 82:
               var10000 = 202;
               break;
            case 83:
               var10000 = 117;
               break;
            case 84:
               var10000 = 80;
               break;
            case 85:
               var10000 = 170;
               break;
            case 86:
               var10000 = 220;
               break;
            case 87:
               var10000 = 24;
               break;
            case 88:
               var10000 = 197;
               break;
            case 89:
               var10000 = 164;
               break;
            case 90:
               var10000 = 161;
               break;
            case 91:
               var10000 = 25;
               break;
            case 92:
               var10000 = 187;
               break;
            case 93:
               var10000 = 162;
               break;
            case 94:
               var10000 = 49;
               break;
            case 95:
               var10000 = 64;
               break;
            case 96:
               var10000 = 129;
               break;
            case 97:
               var10000 = 102;
               break;
            case 98:
               var10000 = 191;
               break;
            case 99:
               var10000 = 143;
               break;
            case 100:
               var10000 = 221;
               break;
            case 101:
               var10000 = 247;
               break;
            case 102:
               var10000 = 174;
               break;
            case 103:
               var10000 = 139;
               break;
            case 104:
               var10000 = 218;
               break;
            case 105:
               var10000 = 234;
               break;
            case 106:
               var10000 = 13;
               break;
            case 107:
               var10000 = 109;
               break;
            case 108:
               var10000 = 65;
               break;
            case 109:
               var10000 = 46;
               break;
            case 110:
               var10000 = 104;
               break;
            case 111:
               var10000 = 167;
               break;
            case 112:
               var10000 = 35;
               break;
            case 113:
               var10000 = 3;
               break;
            case 114:
               var10000 = 2;
               break;
            case 115:
               var10000 = 51;
               break;
            case 116:
               var10000 = 241;
               break;
            case 117:
               var10000 = 121;
               break;
            case 118:
               var10000 = 62;
               break;
            case 119:
               var10000 = 126;
               break;
            case 120:
               var10000 = 33;
               break;
            case 121:
               var10000 = 183;
               break;
            case 122:
               var10000 = 131;
               break;
            case 123:
               var10000 = 185;
               break;
            case 124:
               var10000 = 206;
               break;
            case 125:
               var10000 = 7;
               break;
            case 126:
               var10000 = 227;
               break;
            case 127:
               var10000 = 21;
               break;
            case 128:
               var10000 = 212;
               break;
            case 129:
               var10000 = 168;
               break;
            case 130:
               var10000 = 60;
               break;
            case 131:
               var10000 = 110;
               break;
            case 132:
               var10000 = 208;
               break;
            case 133:
               var10000 = 136;
               break;
            case 134:
               var10000 = 203;
               break;
            case 135:
               var10000 = 56;
               break;
            case 136:
               var10000 = 133;
               break;
            case 137:
               var10000 = 172;
               break;
            case 138:
               var10000 = 210;
               break;
            case 139:
               var10000 = 205;
               break;
            case 140:
               var10000 = 82;
               break;
            case 141:
               var10000 = 176;
               break;
            case 142:
               var10000 = 156;
               break;
            case 143:
               var10000 = 196;
               break;
            case 144:
               var10000 = 132;
               break;
            case 145:
               var10000 = 27;
               break;
            case 146:
               var10000 = 194;
               break;
            case 147:
               var10000 = 12;
               break;
            case 148:
               var10000 = 71;
               break;
            case 149:
               var10000 = 159;
               break;
            case 150:
               var10000 = 107;
               break;
            case 151:
               var10000 = 188;
               break;
            case 152:
               var10000 = 249;
               break;
            case 153:
               var10000 = 8;
               break;
            case 154:
               var10000 = 134;
               break;
            case 155:
               var10000 = 233;
               break;
            case 156:
               var10000 = 128;
               break;
            case 157:
               var10000 = 237;
               break;
            case 158:
               var10000 = 50;
               break;
            case 159:
               var10000 = 91;
               break;
            case 160:
               var10000 = 111;
               break;
            case 161:
               var10000 = 5;
               break;
            case 162:
               var10000 = 122;
               break;
            case 163:
               var10000 = 224;
               break;
            case 164:
               var10000 = 66;
               break;
            case 165:
               var10000 = 186;
               break;
            case 166:
               var10000 = 47;
               break;
            case 167:
               var10000 = 90;
               break;
            case 168:
               var10000 = 54;
               break;
            case 169:
               var10000 = 1;
               break;
            case 170:
               var10000 = 98;
               break;
            case 171:
               var10000 = 70;
               break;
            case 172:
               var10000 = 169;
               break;
            case 173:
               var10000 = 228;
               break;
            case 174:
               var10000 = 209;
               break;
            case 175:
               var10000 = 235;
               break;
            case 176:
               var10000 = 152;
               break;
            case 177:
               var10000 = 175;
               break;
            case 178:
               var10000 = 63;
               break;
            case 179:
               var10000 = 29;
               break;
            case 180:
               var10000 = 87;
               break;
            case 181:
               var10000 = 120;
               break;
            case 182:
               var10000 = 103;
               break;
            case 183:
               var10000 = 193;
               break;
            case 184:
               var10000 = 112;
               break;
            case 185:
               var10000 = 88;
               break;
            case 186:
               var10000 = 81;
               break;
            case 187:
               var10000 = 96;
               break;
            case 188:
               var10000 = 26;
               break;
            case 189:
               var10000 = 0;
               break;
            case 190:
               var10000 = 207;
               break;
            case 191:
               var10000 = 199;
               break;
            case 192:
               var10000 = 57;
               break;
            case 193:
               var10000 = 138;
               break;
            case 194:
               var10000 = 204;
               break;
            case 195:
               var10000 = 177;
               break;
            case 196:
               var10000 = 154;
               break;
            case 197:
               var10000 = 163;
               break;
            case 198:
               var10000 = 118;
               break;
            case 199:
               var10000 = 178;
               break;
            case 200:
               var10000 = 69;
               break;
            case 201:
               var10000 = 158;
               break;
            case 202:
               var10000 = 182;
               break;
            case 203:
               var10000 = 116;
               break;
            case 204:
               var10000 = 97;
               break;
            case 205:
               var10000 = 242;
               break;
            case 206:
               var10000 = 125;
               break;
            case 207:
               var10000 = 198;
               break;
            case 208:
               var10000 = 219;
               break;
            case 209:
               var10000 = 100;
               break;
            case 210:
               var10000 = 192;
               break;
            case 211:
               var10000 = 253;
               break;
            case 212:
               var10000 = 86;
               break;
            case 213:
               var10000 = 15;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 16;
               break;
            case 216:
               var10000 = 160;
               break;
            case 217:
               var10000 = 4;
               break;
            case 218:
               var10000 = 173;
               break;
            case 219:
               var10000 = 48;
               break;
            case 220:
               var10000 = 155;
               break;
            case 221:
               var10000 = 243;
               break;
            case 222:
               var10000 = 101;
               break;
            case 223:
               var10000 = 189;
               break;
            case 224:
               var10000 = 211;
               break;
            case 225:
               var10000 = 23;
               break;
            case 226:
               var10000 = 200;
               break;
            case 227:
               var10000 = 59;
               break;
            case 228:
               var10000 = 42;
               break;
            case 229:
               var10000 = 44;
               break;
            case 230:
               var10000 = 165;
               break;
            case 231:
               var10000 = 92;
               break;
            case 232:
               var10000 = 171;
               break;
            case 233:
               var10000 = 11;
               break;
            case 234:
               var10000 = 148;
               break;
            case 235:
               var10000 = 248;
               break;
            case 236:
               var10000 = 41;
               break;
            case 237:
               var10000 = 229;
               break;
            case 238:
               var10000 = 40;
               break;
            case 239:
               var10000 = 93;
               break;
            case 240:
               var10000 = 214;
               break;
            case 241:
               var10000 = 124;
               break;
            case 242:
               var10000 = 135;
               break;
            case 243:
               var10000 = 83;
               break;
            case 244:
               var10000 = 179;
               break;
            case 245:
               var10000 = 115;
               break;
            case 246:
               var10000 = 215;
               break;
            case 247:
               var10000 = 213;
               break;
            case 248:
               var10000 = 18;
               break;
            case 249:
               var10000 = 238;
               break;
            case 250:
               var10000 = 166;
               break;
            case 251:
               var10000 = 68;
               break;
            case 252:
               var10000 = 37;
               break;
            case 253:
               var10000 = 123;
               break;
            case 254:
               var10000 = 84;
               break;
            default:
               var10000 = 150;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1465;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }
}





