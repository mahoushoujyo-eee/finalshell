package com;

import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TexturePaint;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class Wb_2 extends JComponent implements Pp_2, rF_3, SwingConstants {
   private BufferedImage f;
   private BufferedImage r;
   private Xx_2 h;
   private int K;
   private int C;
   private float E;
   private Insets b;
   private Dimension S = null;
   private BufferedImage a = null;
   private static String O;
   private static final String c;

   public Wb_2() {
      this((Image)null);
   }

   public Wb_2(String var1) {
      this(Xg_2.L(var1));
   }

   public Wb_2(Class var1, String var2) {
      this(Xg_2.Z(var1, var2));
   }

   public Wb_2(URL var1) {
      this(Xg_2.a(var1));
   }

   public Wb_2(Icon var1) {
      this(Xg_2.i(var1));
   }

   public Wb_2(ImageIcon var1) {
      this(var1.getImage());
   }

   public Wb_2(Image var1) {
      this(Xg_2.v(var1));
   }

   public Wb_2(BufferedImage var1) {
      this.f = var1;
      this.r = null;
      this.h = Xx_2.preferred;
      this.K = 0;
      this.C = 0;
      this.E = 1.0F;
      com.FN.Y(this);
      this.setOpaque(false);
      this.addPropertyChangeListener(c, new com.Td_2(this));
   }

   protected void c() {
      String var1 = m();
      BufferedImage var10001 = this.f;
      if (var1 != null) {
         var10001 = this.f != null ? Xg_2.h((Image)this.f) : null;
      }

      this.r = var10001;
      this.a = null;
   }

   private void Y() {
      String var1 = m();
      com.Wb_2 var10000 = this;
      if (var1 != null) {
         if (this.r != null) {
            this.r.flush();
            this.r = null;
         }

         var10000 = this;
      }

      var10000.a = null;
   }

   public int X() {
      String var1 = m();
      BufferedImage var10000 = this.f;
      if (var1 != null) {
         if (this.f == null) {
            return -1;
         }

         var10000 = this.f;
      }

      return var10000.getWidth();
   }

   public int d() {
      String var1 = m();
      BufferedImage var10000 = this.f;
      if (var1 != null) {
         if (this.f == null) {
            return -1;
         }

         var10000 = this.f;
      }

      return var10000.getHeight();
   }

   public BufferedImage y() {
      return this.f;
   }

   public ImageIcon U() {
      return new ImageIcon(this.f);
   }

   public BufferedImage S() {
      return this.a;
   }

   public ImageIcon w() {
      return this.a != null ? new ImageIcon(this.a) : null;
   }

   public com.Wb_2 A(Icon var1) {
      this.H(Xg_2.i(var1));
      return this;
   }

   public com.Wb_2 o(ImageIcon var1) {
      this.t(var1.getImage());
      return this;
   }

   public com.Wb_2 t(Image var1) {
      this.H(Xg_2.v(var1));
      return this;
   }

   public com.Wb_2 H(BufferedImage var1) {
      String var10000 = m();
      this.f = var1;
      String var2 = var10000;
      com.Wb_2 var3 = this;
      if (var2 != null) {
         if (!this.isEnabled()) {
            this.c();
         }

         this.revalidate();
         this.repaint();
         var3 = this;
      }

      return var3;
   }

   public Xx_2 y$Xx_2() {
      return this.h;
   }

   public com.Wb_2 K(Xx_2 var1) {
      this.h = var1;
      this.U();
      return this;
   }

   public int m() {
      return this.K;
   }

   public com.Wb_2 A(int var1) {
      this.K = var1;
      this.U();
      return this;
   }

   public int h() {
      return this.C;
   }

   public com.Wb_2 N(int var1) {
      this.C = var1;
      this.U();
      return this;
   }

   public float y$float() {
      return this.E;
   }

   public com.Wb_2 i(float var1) {
      this.E = var1;
      this.U();
      return this;
   }

   protected void U$void() {
      String var1 = m();
      com.Wb_2 var10000 = this;
      if (var1 != null) {
         if (!this.isShowing()) {
            return;
         }

         var10000 = this;
      }

      var10000.repaint();
   }

   public Insets x() {
      return this.b;
   }

   public com.Wb_2 D(Insets var1) {
      this.b = var1;
      this.z();
      return this;
   }

   public com.Wb_2 g(int var1, int var2, int var3, int var4) {
      return this.D(new Insets(var1, var2, var3, var4));
   }

   public com.Wb_2 s(int var1) {
      return this.g(var1, var1, var1, var1);
   }

   protected void z() {
      String var1 = m();
      com.Wb_2 var10000 = this;
      if (var1 != null) {
         if (this.b != null) {
            this.setBorder(BorderFactory.createEmptyBorder(this.b.top, this.b.left, this.b.bottom, this.b.right));
            if (var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.setBorder(null);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      String var10000 = m();
      super.paintComponent(var1);
      String var2 = var10000;
      if (!(this.E <= 0.0F)) {
         Graphics2D var3 = (Graphics2D)var1;
         Float var10001 = this.E;
         float var25;
         int var10002 = (var25 = this.E - 1.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10002 = var10002 < 0 ? 1 : 0;
         }

         Composite var4;
         var4 = RV.a(var3, var10001, (boolean)var10002);
         BufferedImage var5 = this.B();
         label128:
         if (var5 != null) {
            Insets var6 = this.getInsets();
            int var12 = this.getSize().equals(this.T());
            if (var2 != null) {
               if (var12 != 0) {
                  var3.drawImage(var5, var6.left, var6.top, null);
                  if (var2 != null) {
                     break label128;
                  }
               }

               var12 = com.aH.H[this.h.ordinal()];
            }

            label120: {
               label135: {
                  if (var2 != null) {
                     switch (var12) {
                        case 1:
                           var12 = this.K;
                           break;
                        case 2:
                           break label135;
                        case 3:
                           break label120;
                        default:
                           break label128;
                     }
                  }

                  label136: {
                     int var20 = 2;
                     if (var2 != null) {
                        if (var12 == 2) {
                           var13 = var6.left;
                           break label136;
                        }

                        var12 = this.K;
                        var20 = 4;
                     }

                     if (var2 != null) {
                        if (var12 == var20) {
                           var13 = this.getWidth() - var5.getWidth() - var6.right;
                           break label136;
                        }

                        var12 = this.G(var6);
                        var20 = var5.getWidth() / 2;
                     }

                     var13 = var12 - var20;
                  }

                  int var7;
                  label137: {
                     var7 = var13;
                     int var14 = this.C;
                     int var21 = 1;
                     if (var2 != null) {
                        if (this.C == 1) {
                           var15 = var6.top;
                           break label137;
                        }

                        var14 = this.C;
                        var21 = 3;
                     }

                     if (var2 != null) {
                        if (var14 == var21) {
                           var15 = this.getHeight() - var5.getHeight() - var6.bottom;
                           break label137;
                        }

                        var14 = this.S(var6);
                        var21 = var5.getHeight() / 2;
                     }

                     var15 = var14 - var21;
                  }

                  int var8 = var15;
                  var3.drawImage(var5, var7, var8, null);
                  if (var2 != null) {
                     break label128;
                  }
               }

               BufferedImage var9 = this.C(var6);
               var3.drawImage(var9, this.G(var6) - var9.getWidth() / 2, this.S(var6) - var9.getHeight() / 2, null);
               if (var2 != null) {
                  break label128;
               }
            }

            label138: {
               int var16 = this.K;
               int var22 = 2;
               if (var2 != null) {
                  if (this.K == 2) {
                     var17 = var6.left;
                     break label138;
                  }

                  var16 = this.K;
                  var22 = 4;
               }

               if (var2 != null) {
                  if (var16 == var22) {
                     var17 = this.getWidth() - var5.getWidth() - var6.right;
                     break label138;
                  }

                  var16 = this.G(var6);
                  var22 = var5.getWidth() / 2;
               }

               var17 = var16 - var22;
            }

            int var10;
            label139: {
               var10 = var17;
               int var18 = this.C;
               int var23 = 1;
               if (var2 != null) {
                  if (this.C == 1) {
                     var19 = var6.top;
                     break label139;
                  }

                  var18 = this.C;
                  var23 = 3;
               }

               if (var2 != null) {
                  if (var18 == var23) {
                     var19 = this.getHeight() - var5.getHeight() - var6.bottom;
                     break label139;
                  }

                  var18 = this.S(var6);
                  var23 = var5.getHeight() / 2;
               }

               var19 = var18 - var23;
            }

            int var11 = var19;
            var3.setPaint(new TexturePaint(var5, new Double((double)var10, (double)var11, (double)var5.getWidth(), (double)var5.getHeight())));
            var3.fillRect(var6.left, var6.top, this.getWidth() - var6.left - var6.right, this.getHeight() - var6.top - var6.bottom);
         }

         float var26;
         var10002 = (var26 = this.E - 1.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10002 = var10002 < 0 ? 1 : 0;
         }

         RV.E(var3, var4, (boolean)var10002);
      }
   }

   protected int G(Insets var1) {
      return var1.left + (this.getWidth() - var1.left - var1.right) / 2;
   }

   protected int S(Insets var1) {
      return var1.top + (this.getHeight() - var1.top - var1.bottom) / 2;
   }

   protected BufferedImage C(Insets var1) {
      String var2 = m();
      com.Wb_2 var10000 = this;
      if (var2 != null) {
         if (this.f.getWidth() <= this.getWidth()) {
            if (var2 == null) {
               return this.f;
            }

            if (this.f.getHeight() <= this.getHeight()) {
               return this.f;
            }
         }

         var10000 = this;
      }

      label56: {
         Dimension var3 = var10000.getSize();
         var3.setSize(var3.width - var1.left - var1.right, var3.height - var1.top - var1.bottom);
         BufferedImage var5 = this.a;
         if (var2 != null) {
            if (this.a != null) {
               if (var2 == null) {
                  return this.a;
               }

               if (this.S == null) {
                  return this.a;
               }

               if (var2 == null) {
                  return this.a;
               }

               if (this.S.equals(var3)) {
                  return this.a;
               }
            }

            var10000 = this;
            if (var2 == null) {
               break label56;
            }

            var5 = this.a;
         }

         if (var5 != null) {
            this.a.flush();
            this.a = null;
         }

         this.a = Xg_2.g(this.B(), var3);
         var10000 = this;
      }

      var10000.S = this.getSize();
      return this.a;
   }

   protected BufferedImage B() {
      String var1 = m();
      com.Wb_2 var10000 = this;
      if (var1 != null) {
         if (!this.isEnabled()) {
            if (var1 == null) {
               return this.f;
            }

            if (this.r != null) {
               return this.r;
            }
         }

         var10000 = this;
      }

      return var10000.f;
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = m();
      com.Wb_2 var10000 = this;
      if (var1 != null) {
         if (this.isPreferredSizeSet()) {
            return super.getPreferredSize();
         }

         var10000 = this;
      }

      return var10000.T();
   }

   protected Dimension T() {
      Insets var1 = this.getInsets();
      return new Dimension(
         var1.left + (this.f != null ? this.f.getWidth() : 0) + var1.right, var1.top + (this.f != null ? this.f.getHeight() : 0) + var1.bottom
      );
   }

   @Override
   public MouseAdapter o(com.O5 var1) {
      return com.Fs_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, com.O5 var2) {
      return com.Fs_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(com.O5 var1) {
      return com.Fs_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(com.O5 var1) {
      return com.Fs_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(com.O5 var1) {
      return com.Fs_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(HT var1, com.O5 var2) {
      return com.Fs_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(com.O5 var1) {
      return com.Fs_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, com.O5 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(com.O5 var1) {
      return com.Fs_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(com.O5 var1) {
      return com.Fs_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr_2 var1) {
      return com.Fs_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr_2 var1) {
      return com.Fs_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr_2 var1) {
      return com.Fs_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(com.Cs_2 var1, Sr_2 var2) {
      return com.Fs_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(com.az_2 var1) {
      return com.Fs_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(com.az_2 var1) {
      return com.Fs_2.t(this, var1);
   }

   @Override
   public com.Wd_2 p(String var1) {
      return com.ac_2.I(this, var1);
   }

   @Override
   public com.Wd_2 d(Icon var1, String var2) {
      return com.ac_2.d(this, var1, var2);
   }

   @Override
   public com.Wd_2 V(String var1, com.WF var2) {
      return com.ac_2.B(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(Icon var1, String var2, com.WF var3) {
      return com.ac_2.g(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 y(String var1, com.WF var2, int var3) {
      return com.ac_2.l(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 Y(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.R(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 g(JComponent var1) {
      return com.ac_2.k(this, var1);
   }

   @Override
   public com.Wd_2 I(JComponent var1, int var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 j(JComponent var1, com.WF var2) {
      return com.ac_2.R(this, var1, var2);
   }

   @Override
   public com.Wd_2 g(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.B(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 s(String var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 u(Icon var1, String var2) {
      return com.ac_2.o(this, var1, var2);
   }

   @Override
   public com.Wd_2 u(String var1, com.WF var2) {
      return com.ac_2.q(this, var1, var2);
   }

   @Override
   public com.Wd_2 h(Icon var1, String var2, com.WF var3) {
      return com.ac_2.P(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 f(String var1, com.WF var2, int var3) {
      return com.ac_2.r(this, var1, var2, var3);
   }

   @Override
   public com.Wd_2 o(Icon var1, String var2, com.WF var3, int var4) {
      return com.ac_2.V(this, var1, var2, var3, var4);
   }

   @Override
   public com.Wd_2 B(JComponent var1) {
      return com.ac_2.Q(this, var1);
   }

   @Override
   public com.Wd_2 p(JComponent var1, int var2) {
      return com.ac_2.S(this, var1, var2);
   }

   @Override
   public com.Wd_2 n(JComponent var1, com.WF var2) {
      return com.ac_2.I(this, var1, var2);
   }

   @Override
   public com.Wd_2 X(JComponent var1, com.WF var2, int var3) {
      return com.ac_2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(com.Wd_2 var1) {
      com.ac_2.s(this, var1);
   }

   @Override
   public void O() {
      com.ac_2.o(this);
   }

   @Override
   public void q(com.Wd_2[] var1) {
      com.ac_2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      com.ac_2.S(this, var1);
   }

   static void O(com.Wb_2 var0) {
      var0.Y();
   }

   public static void W(String var0) {
      O = var0;
   }

   public static String m$String() {
      return O;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (m() == null) {
         W("aoZJfc");
      }

      char[] var10003 = "\\T\u0017*=[+".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 123;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      } else {
         var6 = 123;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 66;
               break;
            case 1:
               var23 = 65;
               break;
            case 2:
               var23 = 13;
               break;
            case 3:
               var23 = 51;
               break;
            case 4:
               var23 = 42;
               break;
            case 5:
               var23 = 69;
               break;
            default:
               var23 = 52;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





