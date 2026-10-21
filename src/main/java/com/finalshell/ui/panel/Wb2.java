package com.finalshell.ui.panel;

import com.finalshell.core.AH;
import com.finalshell.core.Ac2;
import com.finalshell.core.Az2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.O5;
import com.finalshell.core.Pp2;
import com.finalshell.core.RF3;
import com.finalshell.core.RV;
import com.finalshell.core.Sr2;
import com.finalshell.core.Xg2;
import com.finalshell.ui.listener.Td_2;
import com.finalshell.ui.model.Cs2;
import com.finalshell.ui.model.HT;
import com.finalshell.ui.model.WF;
import com.finalshell.ui.model.Xx2;
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

public class Wb2 extends JComponent implements Pp2, RF3, SwingConstants {
   public BufferedImage f;
   public BufferedImage r;
   public Xx2 h;
   public int K;
   public int C;
   public float E;
   public Insets b;
   public Dimension S = null;
   public BufferedImage a = null;
   public static String O;
   public static String c;

   public Wb2() {
      this((Image)null);
   }

   public Wb2(String var1) {
      this(Xg2.L(var1));
   }

   public Wb2(Class var1, String var2) {
      this(Xg2.Z(var1, var2));
   }

   public Wb2(URL var1) {
      this(Xg2.a(var1));
   }

   public Wb2(Icon var1) {
      this(Xg2.i(var1));
   }

   public Wb2(ImageIcon var1) {
      this(var1.getImage());
   }

   public Wb2(Image var1) {
      this(Xg2.v(var1));
   }

   public Wb2(BufferedImage var1) {
      this.f = var1;
      this.r = null;
      this.h = Xx2.preferred;
      this.K = 0;
      this.C = 0;
      this.E = 1.0F;
      FN.Y(this);
      this.setOpaque(false);
      this.addPropertyChangeListener(c, new Td_2(this));
   }

   public void c() {
      String var1 = m$String();
      BufferedImage var10001 = this.f;
      if (var1 != null) {
         var10001 = this.f != null ? Xg2.h((Image)this.f) : null;
      }

      this.r = var10001;
      this.a = null;
   }

   public void Y() {
      String var1 = m$String();
      Wb2 var10000 = this;
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
      String var1 = m$String();
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
      String var1 = m$String();
      BufferedImage var10000 = this.f;
      if (var1 != null) {
         if (this.f == null) {
            return -1;
         }

         var10000 = this.f;
      }

      return var10000.getHeight();
   }

   public BufferedImage y$BufferedImage() {
      return this.f;
   }

   public ImageIcon U$ImageIcon() {
      return new ImageIcon(this.f);
   }

   public BufferedImage S() {
      return this.a;
   }

   public ImageIcon w() {
      return this.a != null ? new ImageIcon(this.a) : null;
   }

   public Wb2 A(Icon var1) {
      this.H(Xg2.i(var1));
      return this;
   }

   public Wb2 o(ImageIcon var1) {
      this.t(var1.getImage());
      return this;
   }

   public Wb2 t(Image var1) {
      this.H(Xg2.v(var1));
      return this;
   }

   public Wb2 H(BufferedImage var1) {
      String var10000 = m$String();
      this.f = var1;
      String var2 = var10000;
      Wb2 var3 = this;
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

   public Xx2 y$Xx_2() {
      return this.h;
   }

   public Wb2 K(Xx2 var1) {
      this.h = var1;
      this.U$void();
      return this;
   }

   public int m$int() {
      return this.K;
   }

   public Wb2 A(int var1) {
      this.K = var1;
      this.U$void();
      return this;
   }

   public int h() {
      return this.C;
   }

   public Wb2 N(int var1) {
      this.C = var1;
      this.U$void();
      return this;
   }

   public float y$float() {
      return this.E;
   }

   public Wb2 i(float var1) {
      this.E = var1;
      this.U$void();
      return this;
   }

   public void U$void() {
      String var1 = m$String();
      Wb2 var10000 = this;
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

   public Wb2 D(Insets var1) {
      this.b = var1;
      this.z();
      return this;
   }

   public Wb2 g(int var1, int var2, int var3, int var4) {
      return this.D(new Insets(var1, var2, var3, var4));
   }

   public Wb2 s(int var1) {
      return this.g(var1, var1, var1, var1);
   }

   public void z() {
      String var1 = m$String();
      Wb2 var10000 = this;
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
   public void paintComponent(Graphics var1) {
      int var13;
      int var15;
      int var17;
      int var19;
      String var10000 = m$String();
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
         var4 = (RV.a(var3, var10001, var10002)) != 0;
         BufferedImage var5 = this.B();
         label128:
         if (var5 != null) {
            Insets var6 = this.getInsets();
            int var12 = (this.getSize().equals(this.T())) ? 1 : 0;
            if (var2 != null) {
               if (var12 != 0) {
                  var3.drawImage(var5, var6.left, var6.top, null);
                  if (var2 != null) {
                     break label128;
                  }
               }

               var12 = AH.H[this.h.ordinal()];
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

         RV.E(var3, var4, var10002);
      }
   }

   public int G(Insets var1) {
      return var1.left + (this.getWidth() - var1.left - var1.right) / 2;
   }

   public int S(Insets var1) {
      return var1.top + (this.getHeight() - var1.top - var1.bottom) / 2;
   }

   public BufferedImage C(Insets var1) {
      String var2 = m$String();
      Wb2 var10000 = this;
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

         this.a = Xg2.g(this.B(), var3);
         var10000 = this;
      }

      var10000.S = this.getSize();
      return this.a;
   }

   public BufferedImage B() {
      String var1 = m$String();
      Wb2 var10000 = this;
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
      String var1 = m$String();
      Wb2 var10000 = this;
      if (var1 != null) {
         if (this.isPreferredSizeSet()) {
            return super.getPreferredSize();
         }

         var10000 = this;
      }

      return var10000.T();
   }

   public Dimension T() {
      Insets var1 = this.getInsets();
      return new Dimension(
         var1.left + (this.f != null ? this.f.getWidth() : 0) + var1.right, var1.top + (this.f != null ? this.f.getHeight() : 0) + var1.bottom
      );
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(HT var1, O5 var2) {
      return Fs2_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(O5 var1) {
      return Fs2_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(O5 var1) {
      return Fs2_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(O5 var1) {
      return Fs2_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(HT var1, O5 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(O5 var1) {
      return Fs2_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(O5 var1) {
      return Fs2_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr2 var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(Cs2 var1, Sr2 var2) {
      return Fs2_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(Az2 var1) {
      return Fs2_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(Az2 var1) {
      return Fs2_2.t(this, var1);
   }

   @Override
   public Wd2 p(String var1) {
      return Ac2.I(this, var1);
   }

   @Override
   public Wd2 d(Icon var1, String var2) {
      return Ac2.d(this, var1, var2);
   }

   @Override
   public Wd2 V(String var1, WF var2) {
      return Ac2.B(this, var1, var2);
   }

   @Override
   public Wd2 X(Icon var1, String var2, WF var3) {
      return Ac2.g(this, var1, var2, var3);
   }

   @Override
   public Wd2 y(String var1, WF var2, int var3) {
      return Ac2.l(this, var1, var2, var3);
   }

   @Override
   public Wd2 Y(Icon var1, String var2, WF var3, int var4) {
      return Ac2.R(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 g(JComponent var1) {
      return Ac2.k(this, var1);
   }

   @Override
   public Wd2 I(JComponent var1, int var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 j(JComponent var1, WF var2) {
      return Ac2.R(this, var1, var2);
   }

   @Override
   public Wd2 g(JComponent var1, WF var2, int var3) {
      return Ac2.B(this, var1, var2, var3);
   }

   @Override
   public Wd2 s(String var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 u(Icon var1, String var2) {
      return Ac2.o(this, var1, var2);
   }

   @Override
   public Wd2 u(String var1, WF var2) {
      return Ac2.q(this, var1, var2);
   }

   @Override
   public Wd2 h(Icon var1, String var2, WF var3) {
      return Ac2.P(this, var1, var2, var3);
   }

   @Override
   public Wd2 f(String var1, WF var2, int var3) {
      return Ac2.r(this, var1, var2, var3);
   }

   @Override
   public Wd2 o(Icon var1, String var2, WF var3, int var4) {
      return Ac2.V(this, var1, var2, var3, var4);
   }

   @Override
   public Wd2 B(JComponent var1) {
      return Ac2.Q(this, var1);
   }

   @Override
   public Wd2 p(JComponent var1, int var2) {
      return Ac2.S(this, var1, var2);
   }

   @Override
   public Wd2 n(JComponent var1, WF var2) {
      return Ac2.I(this, var1, var2);
   }

   @Override
   public Wd2 X(JComponent var1, WF var2, int var3) {
      return Ac2.U(this, var1, var2, var3);
   }

   @Override
   public void Q(Wd2 var1) {
      Ac2.s(this, var1);
   }

   @Override
   public void O() {
      Ac2.o(this);
   }

   @Override
   public void q(Wd2[] var1) {
      Ac2.Y(this, var1);
   }

   @Override
   public void W(List var1) {
      Ac2.S(this, var1);
   }

   public static void O(Wb2 var0) {
      var0.Y();
   }

   public static void W(String var0) {
      O = var0;
   }

   public static String m$String() {
      return O;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (m$String() == null) {
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





