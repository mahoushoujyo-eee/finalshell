package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D.Double;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class Ls_2 extends com.LA implements SwingConstants {
   protected int J = a(986, 4646918253451563445L);
   protected int e = a(18862, 3078307197075266499L);
   protected com.OK R = com.OK.onLine;
   protected Color D = null;
   protected Color Q = null;
   protected boolean z = true;
   protected int C;
   protected int S;
   protected String F;
   protected int G;
   protected int K;
   protected boolean r;
   protected FontMetrics f;
   protected int p;
   protected int s;
   protected int t;
   protected int m;
   protected double y;
   protected double Y;
   protected Shape a;
   protected boolean b;
   private static final long[] g;
   private static final Integer[] j;

   public Ls_2() {
      this(null);
   }

   public Ls_2(String var1) {
      this(var1, a(20926, 1382016466012767184L));
   }

   public Ls_2(String var1, int var2) {
      this(var1, var2, 1);
   }

   public Ls_2(String var1, int var2, int var3) {
      this.F = var1;
      this.C = var2;
      this.S = var3;
   }

   public int h() {
      return this.J;
   }

   public void o(int var1) {
      this.J = var1;
      this.Z();
   }

   public int W() {
      return this.e;
   }

   public void u(int var1) {
      this.e = var1;
      this.Z();
   }

   public int s() {
      return this.S;
   }

   public void T(int var1) {
      this.S = var1;
      this.Z();
   }

   public int g() {
      return this.C;
   }

   public void S(int var1) {
      this.C = var1;
      this.l();
   }

   public com.OK n() {
      return this.R;
   }

   public void G(com.OK var1) {
      this.R = var1;
      this.l();
   }

   public Color d() {
      return this.D;
   }

   public void Q(Color var1) {
      this.D = var1;
      this.l();
   }

   public Color R() {
      return this.Q;
   }

   public void S(Color var1) {
      this.Q = var1;
      this.l();
   }

   public boolean x() {
      return this.z;
   }

   public void U(boolean var1) {
      this.z = var1;
      this.l();
   }

   public String e() {
      return this.F;
   }

   public void D(String var1) {
      this.F = var1;
      this.Z();
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var10000 = com.Lz_2.M();
      Insets var3 = super.B(var1);
      int[] var2 = var10000;
      int var4 = this.k();
      if (var2 == null) {
         if (var4 != 0) {
            return var3;
         }

         var4 = this.S;
      }

      switch (var4) {
         case 1:
            var3.top = var3.top + this.Z(var1);
            if (var2 == null) {
               break;
            }
         case 2:
            var3.left = var3.left + this.Z(var1);
            if (var2 == null) {
               break;
            }
         case 3:
            var3.bottom = var3.bottom + this.Z(var1);
            if (var2 == null) {
               break;
            }
         case 4:
            var3.right = var3.right + this.Z(var1);
      }

      return var3;
   }

   @Override
   public Dimension d(JComponent var1) {
      int[] var2 = com.Lz_2.M();
      int var10000 = this.k();
      if (var2 == null) {
         if (var10000 != 0) {
            return super.d(var1);
         }

         var10000 = this.Z(var1);
      }

      int var3 = var10000;
      int var4 = var1.getFontMetrics(var1.getFont()).stringWidth(this.F);
      int var5 = Math.max(this.i, this.w);
      int var6 = Math.max(var3, var5);
      switch (this.S) {
         case 1:
         case 3:
            return new Dimension(var5 * 2 + var4 + this.J * 2 + this.e * 2, var6 + var5);
         case 2:
         case 4:
            return new Dimension(var6 + var5, var5 * 2 + var4 + this.J * 2 + this.e * 2);
         default:
            return null;
      }
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4;
      com.Ls_2 var10;
      FontMetrics var15;
      label126: {
         int[] var10000 = com.Lz_2.M();
         this.G = var3.getWidth();
         var4 = var10000;
         var10 = this;
         JComponent var10001 = var3;
         if (var4 == null) {
            this.K = var3.getHeight();
            this.r = this.k();
            var10 = this;
            if (this.r) {
               var15 = null;
               break label126;
            }

            var10001 = var3;
         }

         var15 = var10001.getFontMetrics(var3.getFont());
      }

      label120: {
         var10.f = var15;
         com.Ls_2 var16 = this;
         if (var4 == null) {
            if (this.r) {
               var17 = 0;
               break label120;
            }

            var16 = this;
         }

         var17 = var16.f.stringWidth(this.F);
      }

      label114: {
         label129: {
            this.s = var17;
            this.p = this.Z(var3);
            this.t = this.f(var3);
            this.m = this.Y();
            this.y = (double)this.i / 2.0;
            this.Y = this.h();
            this.a = this.F();
            var18 = this.z;
            if (var4 == null) {
               if (!this.z) {
                  break label129;
               }

               var18 = this.r;
            }

            if (var4 == null) {
               if (var18) {
                  break label129;
               }

               var18 = this.R.equals(com.OK.onLine);
            }

            if (var4 != null) {
               break label114;
            }

            if (var18) {
               var18 = true;
               break label114;
            }
         }

         var18 = false;
      }

      Object var5;
      Stroke var6;
      label97: {
         label130: {
            label131: {
               this.b = var18;
               var5 = RV.X(var1);
               var6 = RV.d(var1, this.h, this.h != null);
               var10 = this;
               if (var4 == null) {
                  if (this.Q != null) {
                     var12 = this.b;
                     if (var4 != null) {
                        break label131;
                     }

                     if (!this.b) {
                        var1.setPaint(this.Q);
                        var1.fill(this.a);
                     }
                  }

                  var10 = this;
               }

               if (var4 != null) {
                  break label130;
               }

               var12 = var10.b;
            }

            if (!var12) {
               var13 = null;
               break label97;
            }

            var10 = this;
         }

         var13 = var10.A();
      }

      Shape var7 = var13;
      Shape var8 = RV.t(var1, var7, this.b);
      if (var4 == null) {
         if (this.Q != null && this.b) {
            var1.setPaint(this.Q);
            var1.fill(this.a);
         }

         var1.setPaint(this.L);
         var1.draw(this.a);
         RV.n(var1, var8, this.b);
      }

      label132: {
         RV.t(var1, var6, this.h != null);
         Graphics2D var14 = var1;
         if (var4 == null) {
            RV.X(var1, var5);
            if (this.r) {
               break label132;
            }

            var14 = var1;
         }

         Color var19 = this.D;
         if (var4 == null) {
            var19 = this.D != null ? this.D : var3.getForeground();
         }

         var14.setPaint(var19);
         switch (this.S) {
            case 1:
            case 3:
               Map var9 = com.FN.Y(var1);
               var1.drawString(this.F, this.t, this.m);
               com.FN.k(var1, var9);
            case 2:
            case 4:
         }
      }

      if (var4 != null) {
         com.ky_4.K(new String[4]);
      }
   }

   protected int f(JComponent var1) {
      int[] var2;
      byte var3;
      int var5;
      int var10;
      label117: {
         int[] var10000 = com.Lz_2.M();
         var3 = var1.getComponentOrientation().isLeftToRight();
         var2 = var10000;
         var5 = this.C;
         var10 = 2;
         if (var2 == null) {
            label78:
            if (this.C != 2) {
               var5 = this.C;
               var10 = a(27132, 3878701385492872080L);
               if (var2 == null) {
                  if (var5 == var10) {
                     if (var2 != null) {
                        return var3;
                     }

                     if (var3 != 0) {
                        break label78;
                     }
                  }

                  var5 = this.C;
                  var10 = a(21876, 6684196394433054493L);
               }

               if (var2 != null) {
                  break label117;
               }

               label83: {
                  if (var5 == var10) {
                     var5 = var3;
                     if (var2 != null) {
                        break label83;
                     }

                     if (var3 == 0) {
                        break label78;
                     }
                  }

                  var5 = this.C;
               }

               var10 = 4;
               break label117;
            }

            var5 = Math.max(this.i, this.w) + this.J;
            var10 = this.e;
         }

         return var5 + var10;
      }

      if (var2 == null) {
         label58:
         if (var5 != var10) {
            var5 = this.C;
            var10 = a(22830, 3292205106735680326L);
            if (var2 == null) {
               if (var5 == var10) {
                  if (var2 != null) {
                     return var3;
                  }

                  if (var3 != 0) {
                     break label58;
                  }
               }

               var5 = this.C;
               var10 = a(27132, 3878701385492872080L);
            }

            if (var2 == null) {
               if (var5 == var10) {
                  if (var2 != null) {
                     return var3;
                  }

                  if (var3 == 0) {
                     break label58;
                  }
               }

               var5 = this.G / 2;
               var10 = this.s / 2;
            }

            return var5 - var10;
         }

         var5 = this.G - Math.max(this.i, this.w) - this.J - this.e;
         var10 = this.s;
      }

      return var5 - var10;
   }

   protected int Y() {
      int[] var1;
      int var3;
      label45: {
         var1 = com.Lz_2.M();
         FontMetrics var10000 = this.f;
         if (var1 == null) {
            if (this.f == null) {
               var3 = 0;
               break label45;
            }

            var10000 = this.f;
         }

         var3 = var10000.getDescent();
      }

      int var2 = var3;
      var3 = this.S;
      if (var1 == null) {
         switch (this.S) {
            case 1:
               var3 = this.R.equals(com.OK.aboveLive);
               if (var1 == null) {
                  if (var3 != 0) {
                     return this.p - this.i - var2;
                  }

                  var3 = this.p;
               }

               return var3 - var2;
            case 2:
            case 4:
            default:
               var3 = 0;
               break;
            case 3:
               var3 = this.R.equals(com.OK.belowLine);
               if (var1 == null) {
                  if (var3 != 0) {
                     return this.K - this.i - var2;
                  }

                  var3 = this.K;
               }

               return var3 - var2;
         }
      }

      return var3;
   }

   protected double h$double() {
      int[] var1 = com.Lz_2.M();
      boolean var10000 = this.r;
      if (var1 == null) {
         if (this.r) {
            return this.y;
         }

         var10000 = this.R.equals(com.OK.onLine);
      }

      if (var1 == null) {
         if (var10000) {
            return (double)this.p / 2.0;
         }

         if (var1 != null) {
            return this.y;
         }

         var10000 = this.R.equals(com.OK.aboveLive);
      }

      return var10000 ? (double)this.p - this.y : this.y;
   }

   protected int Z(JComponent var1) {
      int[] var2 = com.Lz_2.M();
      int var10000 = this.k();
      if (var2 == null) {
         if (var10000 != 0) {
            return this.i;
         }

         var10000 = var1.getFontMetrics(var1.getFont()).getHeight();
      }

      int var3 = var10000;
      var10000 = this.R.equals(com.OK.onLine);
      if (var2 == null) {
         if (var10000 != 0) {
            return var3;
         }

         var10000 = var3;
      }

      return var10000 + this.i;
   }

   protected boolean k() {
      return this.F == null;
   }

   protected Shape F() {
      Double var1 = null;
      switch (this.S) {
         case 1:
            var1 = new Double(this.y, this.Y, (double)this.G - this.y * 2.0, (double)this.K - this.Y - this.y);
            break;
         case 2:
            var1 = new Double(this.Y, this.y, (double)this.G - this.Y - this.y, (double)this.K - this.y * 2.0);
            break;
         case 3:
            var1 = new Double(this.y, this.y, (double)this.G - this.y * 2.0, (double)this.K - this.Y - this.y);
            break;
         case 4:
            var1 = new Double(this.y, this.y, (double)this.G - this.Y - this.y, (double)this.K - this.y * 2.0);
      }

      return (Shape)(this.w > 0
         ? new java.awt.geom.RoundRectangle2D.Double(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight(), (double)(this.w * 2), (double)(this.w * 2))
         : var1);
   }

   protected Shape A() {
      int[] var1 = com.Lz_2.M();
      int var10000 = this.r;
      if (var1 == null) {
         if (this.r) {
            return null;
         }

         var10000 = this.S;
      }

      switch (var10000) {
         case 1:
            return new java.awt.geom.RoundRectangle2D.Double(
               (double)(this.t - this.e), this.Y - (double)(this.p / 2), (double)(this.s + this.e * 2), (double)this.p, 3.0, 3.0
            );
         case 2:
            return null;
         case 3:
            return new java.awt.geom.RoundRectangle2D.Double(
               (double)(this.t - this.e), (double)this.K - this.Y - (double)(this.p / 2), (double)(this.s + this.e * 2), (double)this.p, 3.0, 3.0
            );
         case 4:
            return null;
         default:
            return null;
      }
   }

   static {
      long var0 = 2740504910442671185L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "ù\u007f®\\\u001c8\u0017ËìÝão3\u00157\u0091Fµ¶\u009cnH¯\u008b\u0018ÈA\u0001Éd}à";
      int var5 = "ù\u007f®\\\u001c8\u0017ËìÝão3\u00157\u0091Fµ¶\u009cnH¯\u008b\u0018ÈA\u0001Éd}à".length();
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
                     g = var6;
                     j = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Õ\u000b\u001d¹6\u0093'\u001cÕ\u0088\u009büï\u0007+G";
                  var5 = "Õ\u000b\u001d¹6\u0093'\u001cÕ\u0088\u009büï\u0007+G".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21100;
      if (j[var3] == null) {
         j[var3] = (int)(g[var3] ^ var1);
      }

      return j[var3];
   }
}





