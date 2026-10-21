package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class Dq_2 extends JComponent implements SwingConstants, com.W2 {
   private ImageIcon A;
   private ImageIcon p;
   private int o = _5.h;
   private int e = _5.Z;
   private boolean s = _5.k;
   private Color R = _5.g;
   private boolean B = _5.b;
   private int P = _5.d;
   private int b = _5.s;
   private float U = _5.x;
   private float y;
   private boolean r;
   private boolean X;
   private float c;
   private boolean I;
   private float L;
   private boolean h;
   private float H;
   private static final long[] a;
   private static final Integer[] d;

   public Dq_2() {
      this((ImageIcon)null);
   }

   public Dq_2(String var1) {
      this(Xg_2.L(var1));
   }

   public Dq_2(Class var1, String var2) {
      this(Xg_2.Z(var1, var2));
   }

   public Dq_2(Image var1) {
      this.y = _5.y;
      this.r = _5.J;
      this.X = _5.N;
      this.c = _5.r;
      this.I = _5.t;
      this.L = _5.B;
      this.h = _5.L;
      this.H = _5.V;
      com.FN.Y(this);
      this.f(var1);
   }

   public Dq_2(ImageIcon var1) {
      this.y = _5.y;
      this.r = _5.J;
      this.X = _5.N;
      this.c = _5.r;
      this.I = _5.t;
      this.L = _5.B;
      this.h = _5.L;
      this.H = _5.V;
      com.FN.Y(this);
      this.V(var1);
   }

   public ImageIcon A() {
      return this.p;
   }

   public ImageIcon n() {
      return this.A;
   }

   public void f(Image var1) {
      this.t(var1, true);
   }

   public void t(Image var1, boolean var2) {
      this.q(new ImageIcon(var1), var2);
   }

   public void V(ImageIcon var1) {
      this.q(var1, true);
   }

   public void q(ImageIcon var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.A = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public int V() {
      return this.o;
   }

   public void i(int var1) {
      this.o = var1;
      this.repaint();
   }

   public int p() {
      return this.e;
   }

   public void y(int var1) {
      this.e = var1;
      this.repaint();
   }

   public boolean W() {
      return this.s;
   }

   public void H(boolean var1) {
      this.g(var1, true);
   }

   public void g(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.s = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public Color t() {
      return this.R;
   }

   public void V(Color var1) {
      this.p(var1, true);
   }

   public void p(Color var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.R = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public boolean s() {
      return this.B;
   }

   public void a(boolean var1) {
      this.N(var1, true);
   }

   public void N(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.B = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public int Z() {
      return this.P;
   }

   public void t(int var1) {
      this.g(var1, true);
   }

   public void g(int var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.P = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public int S() {
      return this.b;
   }

   public void K(int var1) {
      this.Q(var1, true);
   }

   public void Q(int var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.b = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public boolean f() {
      return this.r;
   }

   public void P(boolean var1) {
      this.a(var1, true);
   }

   public void a(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.r = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public boolean y() {
      return this.X;
   }

   public void y(boolean var1) {
      this.n(var1, true);
   }

   public void n(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.X = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public float u() {
      return this.c;
   }

   public void t(float var1) {
      this.N(var1, true);
   }

   public void N(float var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.c = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public boolean p$boolean() {
      return this.I;
   }

   public void i(boolean var1) {
      this.T(var1, true);
   }

   public void T(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.I = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public float i() {
      return this.L;
   }

   public void k(float var1) {
      this.W(var1, true);
   }

   public void W(float var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.L = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public boolean c() {
      return this.h;
   }

   public void K(boolean var1) {
      this.H(var1, true);
   }

   public void H(boolean var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.h = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public float d() {
      return this.H;
   }

   public void a(float var1) {
      this.d(var1, true);
   }

   public void d(float var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.H = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public float x() {
      return this.U;
   }

   public void c(float var1) {
      this.n(var1, true);
   }

   public void n(float var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.U = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public float j() {
      return this.y;
   }

   public void i(float var1) {
      this.F(var1, true);
   }

   public void F(float var1, boolean var2) {
      String var3 = com.Wb_2.m();
      com.Dq_2 var10000 = this;
      if (var3 != null) {
         this.y = var1;
         if (!var2) {
            return;
         }

         var10000 = this;
      }

      var10000.A();
   }

   public void A$void() {
      String var1 = com.Wb_2.m();
      ImageIcon var10000 = this.A;
      if (var1 != null) {
         if (this.A == null) {
            this.p = null;
            this.repaint();
            return;
         }

         var10000 = this.A;
      }

      BufferedImage var2 = Xg_2.m(var10000.getImage());
      int var7 = this.r;
      if (var1 != null) {
         if (this.r) {
            com.oa_4.P(var2, var2);
         }

         var7 = this.X;
      }

      if (var1 != null) {
         if (var7 != 0) {
            com.oa_4.u(var2, var2, this.c);
         }

         var7 = this.I;
      }

      label105: {
         label112: {
            label103:
            if (var1 != null) {
               if (var7 != 0) {
                  var7 = this.h;
                  if (var1 == null) {
                     break label103;
                  }

                  if (this.h) {
                     com.oa_4.p(var2, var2, 0.0F, 0.0F, this.H, this.L, this.U, this.y);
                     if (var1 != null) {
                        break label112;
                     }
                  }
               }

               var7 = this.I;
            }

            if (var1 != null) {
               if (var7 != 0) {
                  com.oa_4.V((Image)var2, (Image)var2, this.L, this.U, this.y);
                  if (var1 != null) {
                     break label112;
                  }
               }

               var7 = this.h;
            }

            if (var1 == null) {
               break label105;
            }

            if (var7 != 0) {
               com.oa_4.n(var2, var2, this.H, this.U, this.y);
            }
         }

         var7 = this.b;
      }

      label84: {
         label113: {
            label114: {
               if (var1 != null) {
                  if (var7 > 0) {
                     var2 = Xg_2.A(
                        new Double(0.0, 0.0, (double)this.A.getIconWidth(), (double)this.A.getIconHeight(), (double)(this.b * 2), (double)(this.b * 2)), var2
                     );
                  }

                  var8 = this;
                  if (var1 == null) {
                     break label114;
                  }

                  var7 = this.P;
               }

               if (var7 <= 0) {
                  var8 = this;
                  if (var1 == null) {
                     break label114;
                  }

                  if (!this.B) {
                     var9 = this;
                     if (var1 == null) {
                        break label84;
                     }

                     if (!this.s) {
                        break label113;
                     }
                  }
               }

               var8 = this;
            }

            Dimension var3 = var8.getPreferredSize();
            BufferedImage var4 = Xg_2.g(var3.width, var3.height, 3);
            Graphics2D var5 = var4.createGraphics();
            RV.X(var5);
            Shape var6 = this.N();
            RV.y(var5, var6, _5.R, new Color(a(2748, 1861594135011962130L), a(5993, 734356782593650882L), a(5993, 734356782593650882L)), this.P);
            var5.drawImage(var2, this.P, this.P, null);
            boolean var10 = this.B;
            if (var1 != null) {
               if (this.B) {
                  var5.setPaint(
                     new GradientPaint(
                        0.0F,
                        (float)this.P,
                        new Color(a(2240, 4825450199560105833L), a(18030, 988576894238286276L), a(18030, 988576894238286276L), a(22105, 7321094231105171958L)),
                        0.0F,
                        (float)(this.P + (var3.height - this.P * 2) / 2),
                        new Color(a(18030, 988576894238286276L), a(18030, 988576894238286276L), a(18030, 988576894238286276L), a(19645, 1130331558466775829L))
                     )
                  );
                  var5.fill(this.R());
               }

               var10 = this.s;
            }

            if (var10) {
               var5.setPaint(this.R);
               var5.draw(var6);
            }

            var5.dispose();
            var2 = var4;
         }

         this.p = new ImageIcon(var2);
         var9 = this;
      }

      var9.repaint();
   }

   private Shape R() {
      Dimension var1 = this.getPreferredSize();
      return (Shape)(this.b > 0
         ? new Double(
            (double)this.P,
            (double)this.P,
            (double)(var1.width - this.P * 2),
            (double)((var1.height - this.P * 2) / 2),
            (double)(this.b * 2),
            (double)(this.b * 2)
         )
         : new Rectangle(this.P, this.P, var1.width - this.P * 2, (var1.height - this.P * 2) / 2));
   }

   private Shape N() {
      return this.H(0, 0);
   }

   private Shape H(int var1, int var2) {
      Dimension var3 = this.getPreferredSize();
      return (Shape)(this.b > 0
         ? new Double(
            (double)(var1 + this.P),
            (double)(var2 + this.P),
            (double)(var3.width - this.P * 2 - 1),
            (double)(var3.height - this.P * 2 - 1),
            (double)(this.b * 2),
            (double)(this.b * 2)
         )
         : new Rectangle(var1 + this.P, var2 + this.P, var3.width - this.P * 2 - 1, var3.height - this.P * 2 - 1));
   }

   @Override
   protected void paintComponent(Graphics var1) {
      String var10000 = com.Wb_2.m();
      super.paintComponent(var1);
      String var2 = var10000;
      com.Dq_2 var4 = this;
      if (var2 != null) {
         if (this.p == null) {
            return;
         }

         var4 = this;
      }

      Point var3 = var4.j();
      var1.drawImage(this.p.getImage(), var3.x, var3.y, null);
   }

   private Point j$Point() {
      String var1;
      int var3;
      int var4;
      label50: {
         int var2 = this.p.getIconWidth();
         String var10000 = com.Wb_2.m();
         var3 = this.p.getIconHeight();
         var1 = var10000;
         int var6 = this.o;
         int var10001 = 2;
         if (var1 != null) {
            if (this.o == 2) {
               var4 = 0;
               if (var1 != null) {
                  break label50;
               }
            }

            var6 = this.o;
            var10001 = 4;
         }

         if (var1 != null) {
            if (var6 == var10001) {
               var4 = this.getWidth() - var2;
               if (var1 != null) {
                  break label50;
               }
            }

            var6 = this.getWidth() / 2;
            var10001 = var2 / 2;
         }

         var4 = var6 - var10001;
      }

      int var7 = this.e;
      int var8 = 1;
      if (var1 != null) {
         if (this.e == 1) {
            byte var5 = 0;
            if (var1 != null) {
               return new Point(var4, var5);
            }
         }

         var7 = this.e;
         var8 = 3;
      }

      if (var1 != null) {
         if (var7 == var8) {
            int var9 = this.getHeight() - var3;
            if (var1 != null) {
               return new Point(var4, var9);
            }
         }

         var7 = this.getHeight() / 2;
         var8 = var3 / 2;
      }

      int var10 = var7 - var8;
      return new Point(var4, var10);
   }

   @Override
   public Dimension getPreferredSize() {
      return this.A != null ? new Dimension(this.P * 2 + this.A.getIconWidth(), this.P * 2 + this.A.getIconHeight()) : new Dimension(0, 0);
   }

   @Override
   public Shape B() {
      Point var1 = this.j();
      return this.H(var1.x, var1.y);
   }

   static {
      long var0 = 2794543755217359759L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "=üÑócàã\u0017ãî\u0089P©?2´ÐÒº\u0098Ý\u001a|\u0019\u0014ôH¶s×8º";
      int var5 = "=üÑócàã\u0017ãî\u0089P©?2´ÐÒº\u0098Ý\u001a|\u0019\u0014ôH¶s×8º".length();
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
                     a = var6;
                     d = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "õL|Ê++\"Ù\u0080n\u009e4\u0092RþÇ";
                  var5 = "õL|Ê++\"Ù\u0080n\u009e4\u0092RþÇ".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10155;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }
}





