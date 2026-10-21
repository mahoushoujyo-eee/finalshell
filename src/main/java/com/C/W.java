package com.C;

import com.P9;
import com.RJ;
import com.RV;
import com.pF_3;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class W extends com.Lz_2 implements RJ, SwingConstants {
   protected com.C.M R = com.C.q_2.k;
   protected Color a = com.C.q_2.V;
   protected int J = com.C.q_2.o;
   protected int T = com.C.q_2.n;
   protected float I = com.C.q_2.w;
   protected int q = com.C.q_2.W;
   protected float M = com.C.q_2.L;
   protected boolean Y = true;
   protected int u = 1;
   protected int v = 0;
   protected int F = -1;
   private static int[] w;
   private static final String[] b;
   private static final String[] f;
   private static final long[] i;
   private static final Integer[] j;

   public com.C.M M() {
      return this.R;
   }

   public void b(com.C.M var1) {
      int[] var2 = B();
      com.C.W var10000 = this;
      if (var2 == null) {
         if (this.R == var1) {
            return;
         }

         this.R = var1;
         var10000 = this;
      }

      if (var2 == null) {
         if (!var10000.Y) {
            return;
         }

         var10000 = this;
      }

      var10000.Z();
   }

   public Color o() {
      return this.a;
   }

   public void M(Color var1) {
      int[] var2 = B();
      com.C.W var10000 = this;
      if (var2 == null) {
         if (this.a == var1) {
            return;
         }

         this.a = var1;
         var10000 = this;
      }

      if (var2 == null) {
         if (!var10000.Y) {
            return;
         }

         var10000 = this;
      }

      var10000.l();
   }

   public int U() {
      return this.J;
   }

   public void p(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.J;
         if (var2 == null) {
            if (this.J == var1) {
               return;
            }

            this.J = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public int j() {
      return this.T;
   }

   public void X(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.T;
         if (var2 == null) {
            if (this.T == var1) {
               return;
            }

            this.T = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.Z();
   }

   public float A() {
      return this.I;
   }

   public void a(float var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         float var4;
         int var10000 = (var4 = this.I - var1) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            this.I = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public int h() {
      return this.q;
   }

   public void O(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.q;
         if (var2 == null) {
            if (this.q == var1) {
               return;
            }

            this.q = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.Z();
   }

   public float P() {
      return this.M;
   }

   public void N(float var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         float var4;
         int var10000 = (var4 = this.M - var1) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            this.M = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public boolean Y() {
      return this.Y;
   }

   public void d(boolean var1) {
      int[] var2 = B();
      com.C.W var10000 = this;
      if (var2 == null) {
         if (this.Y == var1) {
            return;
         }

         this.Y = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public int I() {
      return this.u;
   }

   public void l(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.u;
         if (var2 == null) {
            if (this.u == var1) {
               return;
            }

            this.u = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public int i() {
      return this.v;
   }

   public void P(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.v;
         if (var2 == null) {
            if (this.v == var1) {
               return;
            }

            this.v = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public int B() {
      return this.F;
   }

   public void f(int var1) {
      com.C.W var3;
      label24: {
         int[] var2 = B();
         int var10000 = this.F;
         if (var2 == null) {
            if (this.F == var1) {
               return;
            }

            this.F = var1;
            var3 = this;
            if (var2 != null) {
               break label24;
            }

            var10000 = this.Y;
         }

         if (var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.l();
   }

   public Shape g(JComponent var1, Rectangle var2) {
      return this.z(var1, var2.getSize(), false);
   }

   @Override
   public Boolean d(JComponent var1) {
      int[] var2 = B();
      boolean var10000 = this.Y;
      if (var2 == null) {
         var10000 = !this.Y;
      }

      return var10000;
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var10000 = B();
      boolean var3 = var1.getComponentOrientation().isLeftToRight();
      int[] var2 = var10000;
      Insets var4 = new Insets(this.U.top, var3 ? this.U.left : this.U.right, this.U.bottom, var3 ? this.U.right : this.U.left);
      if (var2 == null) {
         if (this.Y) {
            int var5 = this.c();
            var4.top += var5 + 1;
            var4.left += var5 + 1;
            var4.bottom += var5 + 1;
            var4.right += var5 + 1;
            if (var2 == null) {
               return var4;
            }
         }

         var4.top++;
         var4.left++;
         var4.bottom++;
      }

      var4.right++;
      return var4;
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = B();
      if (var4 == null) {
         if (com.c.c(561607727435803442L).getBoolean(null)) {
            Object var5;
            label24: {
               var5 = RV.X(var1);
               com.C.W var10000 = this;
               if (var4 == null) {
                  if (this.Y) {
                     this.C(var1, var3);
                     if (var4 == null) {
                        break label24;
                     }
                  }

                  var10000 = this;
               }

               var10000.m(var1, var3);
            }

            RV.X(var1, var5);
            if (var4 == null) {
               return;
            }
         }

         var1.setColor((Color)com.c.c(175950046904982516L).get(null));
      }

      var1.fillRect(0, 0, (int)var2.getWidth(), (int)var2.getHeight());
   }

   protected void C(Graphics2D var1, JComponent var2) {
      Dimension var3 = var2.getSize();
      this.E(var1, var2, var3);
      this.s(var1, var2, var3);
      this.S(var1, var2, var3);
   }

   protected void m(Graphics2D var1, JComponent var2) {
      var1.setColor(this.U(var2));
      var1.fillRoundRect(1, 1, var2.getWidth() - 2, var2.getHeight() - 2, this.J * 2, this.J * 2);
      var1.setColor(this.a);
      var1.drawRoundRect(0, 0, var2.getWidth() - 1, var2.getHeight() - 1, this.J * 2, this.J * 2);
   }

   protected void E(Graphics2D var1, JComponent var2, Dimension var3) {
      int[] var4 = B();
      int var10000 = this.T;
      if (var4 == null) {
         if (this.T <= 0) {
            return;
         }

         var10000 = this.T;
      }

      pF_3 var5 = com.Fk_2.I(var10000, this.J * 2, this.j());
      var5.k(var2);
      var5.n(var1, this.w(var3));
   }

   protected float j$float() {
      return this.I;
   }

   protected void s(Graphics2D var1, JComponent var2, Dimension var3) {
      int[] var10000 = B();
      Color var5 = this.U(var2);
      int[] var4 = var10000;
      if (var4 == null) {
         if (var5 == null) {
            return;
         }

         var1.setColor(var5);
      }

      var1.fill(this.z(var2, var3, true));
   }

   protected void S(Graphics2D var1, JComponent var2, Dimension var3) {
      int[] var4 = B();
      if (var4 == null) {
         if (this.a == null) {
            return;
         }

         var1.setPaint(this.a);
      }

      var1.draw(this.z(var2, var3, false));
   }

   protected Color U(JComponent var1) {
      int[] var10000 = B();
      Color var3 = this.t(var1);
      int[] var2 = var10000;
      int var4 = this.Y;
      if (var2 == null) {
         if (!this.Y) {
            return var3;
         }

         float var6;
         var4 = (var6 = this.M - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      }

      return var4 < 0 ? P9.M(var3, Math.max(0, Math.min((int)(this.M * 255.0F), a(615, 5561332905992221973L)))) : var3;
   }

   protected Color t(JComponent var1) {
      return var1.getBackground();
   }

   protected Rectangle w(Dimension var1) {
      switch (c_2.q[this.R.ordinal()]) {
         case 1:
            return new Rectangle(0, 0, var1.width, var1.height);
         case 2:
            int var2 = Math.max(0, this.q - this.T);
            return new Rectangle(var2, var2, var1.width - var2 * 2, var1.height - var2 * 2);
         default:
            return null;
      }
   }

   protected Shape z(JComponent var1, Dimension var2, boolean var3) {
      switch (c_2.q[this.R.ordinal()]) {
         case 1:
            return com.o4_2.k(var1, var3 ? a(30367, 32490) : a(30363, 8664), new com.C.K(this, var1, var2, var3), this.j(var1, var2));
         case 2:
            return com.o4_2.k(var1, var3 ? a(30366, -27350) : a(30365, 11346), new u(this, var1, var2, var3), this.j(var1, var2));
         default:
            return null;
      }
   }

   protected Object[] j(JComponent var1, Dimension var2) {
      Object[] var10000 = new Object[a(2100, 1832195399082049346L)];
      var10000[0] = this.J;
      var10000[1] = this.T;
      var10000[2] = this.q;
      var10000[3] = this.u;
      var10000[4] = this.v;
      var10000[5] = this.F;
      var10000[a(30040, 817117853046538796L)] = var2;
      var10000[a(19129, 4763160731544829384L)] = var1.getComponentOrientation().isLeftToRight();
      return var10000;
   }

   protected GeneralPath E(JComponent var1, Dimension var2, boolean var3) {
      int[] var4 = B();
      int var10000 = var3;
      if (var4 == null) {
         var10000 = var3 != 0 ? 1 : 0;
      }

      int var5 = var10000;
      GeneralPath var6 = new GeneralPath(0);
      int var7 = this.T + var5;
      int var8 = this.T + var5;
      int var9 = var2.height - 1 - this.T;
      int var10 = var2.width - 1 - this.T;
      var6.moveTo((float)var8, (float)(var7 + this.J));
      var6.quadTo((float)var8, (float)var7, (float)(var8 + this.J), (float)var7);
      var6.lineTo((float)(var10 - this.J), (float)var7);
      var6.quadTo((float)var10, (float)var7, (float)var10, (float)(var7 + this.J));
      var6.lineTo((float)var10, (float)(var9 - this.J));
      var6.quadTo((float)var10, (float)var9, (float)(var10 - this.J), (float)var9);
      var6.lineTo((float)(var8 + this.J), (float)var9);
      var6.quadTo((float)var8, (float)var9, (float)var8, (float)(var9 - this.J));
      var6.closePath();
      if (com.ky_4.F() != null) {
         p(new int[3]);
      }

      return var6;
   }

   protected GeneralPath a(JComponent var1, Dimension var2, boolean var3) {
      int[] var4 = B();
      int var10000 = this.u;
      if (var4 == null) {
         var10000 = this.u == 1 ? 1 : 0;
      }

      int var5 = var10000;
      var10000 = this.u;
      if (var4 == null) {
         var10000 = this.u == 3 ? 1 : 0;
      }

      int var6;
      var6 = var10000;
      var10000 = this.u;
      label206:
      if (var4 == null) {
         if (this.u != 2) {
            var10000 = this.u;
            if (var4 != null) {
               break label206;
            }

            if (this.u != a(569, 5871564829272143182L)) {
               var10000 = 0;
               break label206;
            }
         }

         var10000 = 1;
      }

      int var7;
      var7 = var10000;
      var10000 = this.u;
      label198:
      if (var4 == null) {
         if (this.u != 4) {
            var10000 = this.u;
            if (var4 != null) {
               break label198;
            }

            if (this.u != a(15986, 6925261996336072962L)) {
               var10000 = 0;
               break label198;
            }
         }

         var10000 = 1;
      }

      int var8 = var10000;
      var10000 = var3;
      if (var4 == null) {
         var10000 = var3 != 0 ? 1 : 0;
      }

      int var9;
      int var10;
      byte var11;
      int var12;
      var9 = var10000;
      var10 = this.c();
      var11 = var1.getComponentOrientation().isLeftToRight();
      var12 = var10 + var9 + this.J + this.q * 2;
      var10000 = var5;
      label189:
      if (var4 == null) {
         if (var5 == 0) {
            var10000 = var6;
            if (var4 != null) {
               break label189;
            }

            if (var6 == 0) {
               var10000 = var2.height;
               break label189;
            }
         }

         var10000 = var2.width;
      }

      label223: {
         int var13;
         int var32;
         label180: {
            label179: {
               label178: {
                  label213: {
                     label214: {
                        label215: {
                           var13 = var10000;
                           if (var4 == null) {
                              if (this.F != 0) {
                                 var10000 = var13;
                                 var32 = var10 * 2 + this.J * 2 + this.q * 4;
                                 if (var4 != null) {
                                    break label214;
                                 }

                                 if (var13 >= var32) {
                                    break label215;
                                 }
                              }

                              var10000 = var13 / 2 - var10 - this.J - this.q * 2;
                           }

                           if (var4 == null) {
                              break label223;
                           }

                           com.ky_4.K(new String[5]);
                        }

                        var10000 = this.F;
                        if (var4 != null) {
                           break label213;
                        }

                        var32 = 2;
                     }

                     label162:
                     if (var10000 != var32) {
                        var10000 = this.F;
                        var32 = a(30740, 2625630301212774241L);
                        if (var4 == null) {
                           if (var10000 == var32) {
                              if (var4 != null) {
                                 break label213;
                              }

                              if (var11 != 0) {
                                 break label162;
                              }
                           }

                           var10000 = this.F;
                           var32 = a(20507, 1570435901443221352L);
                        }

                        if (var4 != null) {
                           break label180;
                        }

                        if (var10000 != var32) {
                           break label178;
                        }

                        var10000 = var11;
                        if (var4 != null) {
                           break label179;
                        }

                        if (var11 != 0) {
                           break label178;
                        }
                     }

                     boolean var28 = false;
                  }

                  if (var4 == null) {
                     break label223;
                  }
               }

               var10000 = this.F;
            }

            var32 = 4;
         }

         label137: {
            label136: {
               label135: {
                  label134: {
                     if (var4 == null) {
                        label130:
                        if (var10000 != var32) {
                           var10000 = this.F;
                           var32 = a(20507, 1570435901443221352L);
                           if (var4 == null) {
                              if (var10000 == var32) {
                                 if (var4 != null) {
                                    break label134;
                                 }

                                 if (var11 != 0) {
                                    break label130;
                                 }
                              }

                              var10000 = this.F;
                              var32 = a(30740, 2625630301212774241L);
                           }

                           if (var4 != null) {
                              break label137;
                           }

                           if (var10000 != var32) {
                              break label135;
                           }

                           var10000 = var11;
                           if (var4 != null) {
                              break label136;
                           }

                           if (var11 != 0) {
                              break label135;
                           }
                        }

                        var10000 = var13;
                        var32 = var12 * 2;
                     }

                     var10000 -= var32;
                  }

                  if (var4 == null) {
                     break label223;
                  }
               }

               var10000 = this.v;
            }

            var32 = var10 + this.J + this.q * 2;
         }

         if (var4 == null) {
            if (var10000 < var32) {
               boolean var31 = false;
               break label223;
            }

            var10000 = this.v - var12;
            var32 = var13 - var12 * 2;
         }

         Math.min(var10000, var32);
      }

      com.c.c(171887325614565497L).setInt(null, com.c.c(171887325614565497L).getInt(null) + 1);
      int var15 = this.q;
      int var16 = var2.width - 1 - var10;
      int var17 = var2.height - 1 - var10;
      int var18 = var10 + var9;
      GeneralPath var19 = new GeneralPath(0);
      var19.moveTo((float)var18, (float)(var15 + this.J));
      var19.quadTo((float)var18, (float)var15, (float)(var18 + this.J), (float)var15);
      if (var5 != 0) {
      }

      var19.lineTo((float)(var16 - this.J), (float)var15);
      var19.quadTo((float)var16, (float)var15, (float)var16, (float)(var15 + this.J));
      if (var8 != 0) {
      }

      var19.lineTo((float)var16, (float)(var17 - this.J));
      var19.quadTo((float)var16, (float)var17, (float)(var16 - this.J), (float)var17);
      if (var6 != 0) {
      }

      var19.lineTo((float)(var18 + this.J), (float)var17);
      var19.quadTo((float)var18, (float)var17, (float)var18, (float)(var17 - this.J));
      if (var7 != 0) {
      }

      var19.closePath();
      return var19;
   }

   protected Shape d(JComponent var1, Dimension var2, boolean var3) {
      return com.o4_2.k(var1, var3 ? a(30364, 21365) : a(30362, 18941), new com.C.l_2(this, var1, var2, var3), this.j(var1, var2));
   }

   protected GeneralPath G(JComponent var1, Dimension var2, boolean var3) {
      int[] var4 = B();
      int var10000 = this.u;
      if (var4 == null) {
         var10000 = this.u == 1 ? 1 : 0;
      }

      int var5 = var10000;
      var10000 = this.u;
      if (var4 == null) {
         var10000 = this.u == 3 ? 1 : 0;
      }

      int var6;
      var6 = var10000;
      var10000 = this.u;
      label220:
      if (var4 == null) {
         if (this.u != 2) {
            var10000 = this.u;
            if (var4 != null) {
               break label220;
            }

            if (this.u != a(30740, 2625630301212774241L)) {
               var10000 = 0;
               break label220;
            }
         }

         var10000 = 1;
      }

      int var7;
      var7 = var10000;
      var10000 = this.u;
      label212:
      if (var4 == null) {
         if (this.u != 4) {
            var10000 = this.u;
            if (var4 != null) {
               break label212;
            }

            if (this.u != a(20507, 1570435901443221352L)) {
               var10000 = 0;
               break label212;
            }
         }

         var10000 = 1;
      }

      int var8 = var10000;
      var10000 = var3;
      if (var4 == null) {
         var10000 = var3 != 0 ? 1 : 0;
      }

      int var9;
      int var10;
      byte var11;
      int var12;
      var9 = var10000;
      var10 = this.c();
      var11 = var1.getComponentOrientation().isLeftToRight();
      var12 = var10 + var9 + this.J + this.q * 2;
      var10000 = var5;
      label203:
      if (var4 == null) {
         if (var5 == 0) {
            var10000 = var6;
            if (var4 != null) {
               break label203;
            }

            if (var6 == 0) {
               var10000 = var2.height;
               break label203;
            }
         }

         var10000 = var2.width;
      }

      int var14;
      label226: {
         int var13;
         int var32;
         label194: {
            label193: {
               label192: {
                  label227: {
                     label228: {
                        label189: {
                           var13 = var10000;
                           var10000 = this.F;
                           if (var4 == null) {
                              if (this.F != 0) {
                                 var10000 = var13;
                                 var32 = var10 * 2 + this.J * 2 + this.q * 4;
                                 if (var4 != null) {
                                    break label228;
                                 }

                                 if (var13 >= var32) {
                                    break label189;
                                 }
                              }

                              var10000 = var13 / 2 - var10 - this.J - this.q * 2;
                           }

                           var14 = var10000;
                           if (var4 == null) {
                              break label226;
                           }
                        }

                        var10000 = this.F;
                        if (var4 != null) {
                           break label227;
                        }

                        var32 = 2;
                     }

                     label176:
                     if (var10000 != var32) {
                        var10000 = this.F;
                        var32 = a(30740, 2625630301212774241L);
                        if (var4 == null) {
                           if (var10000 == var32) {
                              var10000 = var11;
                              if (var4 != null) {
                                 break label227;
                              }

                              if (var11 != 0) {
                                 break label176;
                              }
                           }

                           var10000 = this.F;
                           var32 = a(20507, 1570435901443221352L);
                        }

                        if (var4 != null) {
                           break label194;
                        }

                        if (var10000 != var32) {
                           break label192;
                        }

                        var10000 = var11;
                        if (var4 != null) {
                           break label193;
                        }

                        if (var11 != 0) {
                           break label192;
                        }
                     }

                     var10000 = 0;
                  }

                  var14 = var10000;
                  if (var4 == null) {
                     break label226;
                  }
               }

               var10000 = this.F;
            }

            var32 = 4;
         }

         label152: {
            label151: {
               label150: {
                  label149: {
                     if (var4 == null) {
                        label145:
                        if (var10000 != var32) {
                           var10000 = this.F;
                           var32 = a(20507, 1570435901443221352L);
                           if (var4 == null) {
                              if (var10000 == var32) {
                                 var10000 = var11;
                                 if (var4 != null) {
                                    break label149;
                                 }

                                 if (var11 != 0) {
                                    break label145;
                                 }
                              }

                              var10000 = this.F;
                              var32 = a(30740, 2625630301212774241L);
                           }

                           if (var4 != null) {
                              break label152;
                           }

                           if (var10000 != var32) {
                              break label150;
                           }

                           var10000 = var11;
                           if (var4 != null) {
                              break label151;
                           }

                           if (var11 != 0) {
                              break label150;
                           }
                        }

                        var10000 = var13;
                        var32 = var12 * 2;
                     }

                     var10000 -= var32;
                  }

                  var14 = var10000;
                  if (var4 == null) {
                     break label226;
                  }
               }

               var10000 = this.v;
            }

            var32 = var10 + this.J + this.q * 2;
         }

         label122: {
            if (var4 == null) {
               if (var10000 < var32) {
                  var10000 = 0;
                  break label122;
               }

               var10000 = this.v - var12;
               var32 = var13 - var12 * 2;
            }

            var10000 = Math.min(var10000, var32);
         }

         var14 = var10000;
      }

      int var15 = var10 + var9;
      int var16 = var2.width - 1 - var10;
      int var17 = var2.height - 1 - var10;
      int var18 = var10 + var9;
      GeneralPath var19 = new GeneralPath(0);
      var10000 = var5;
      if (var4 == null) {
         if (var5 != 0) {
            var19.moveTo((float)(var18 + this.J + var14 + this.q), (float)var15);
            var19.lineTo((float)(var18 + this.J + var14 + this.q * 2), (float)(var15 - this.q));
            var19.lineTo((float)(var18 + this.J + var14 + this.q * 2 + 1), (float)(var15 - this.q));
            var19.lineTo((float)(var18 + this.J + var14 + this.q * 3 + 1), (float)var15);
            var19.closePath();
         }

         var10000 = var8;
      }

      if (var4 == null) {
         if (var10000 != 0) {
            var19.lineTo((float)var16, (float)(var15 + this.J + var14 + this.q));
            var19.lineTo((float)(var16 + this.q), (float)(var15 + this.J + var14 + this.q * 2));
            var19.lineTo((float)(var16 + this.q), (float)(var15 + this.J + var14 + this.q * 2 + 1));
            var19.lineTo((float)var16, (float)(var15 + this.J + var14 + this.q * 3 + 1));
         }

         var10000 = var6;
      }

      if (var4 == null) {
         if (var10000 != 0) {
            var19.moveTo((float)(var18 + this.J + var14 + this.q * 3 + 1), (float)var17);
            var19.lineTo((float)(var18 + this.J + var14 + this.q * 2 + 1), (float)(var17 + this.q));
            var19.lineTo((float)(var18 + this.J + var14 + this.q * 2), (float)(var17 + this.q));
            var19.lineTo((float)(var18 + this.J + var14 + this.q), (float)var17);
            var19.closePath();
         }

         var10000 = var7;
      }

      if (var10000 != 0) {
         var19.lineTo((float)var18, (float)(var15 + this.J + var14 + this.q * 3 + 1));
         var19.lineTo((float)(var18 - this.q), (float)(var15 + this.J + var14 + this.q * 2 + 1));
         var19.lineTo((float)(var18 - this.q), (float)(var15 + this.J + var14 + this.q * 2));
         var19.lineTo((float)var18, (float)(var15 + this.J + var14 + this.q));
      }

      return var19;
   }

   protected int c() {
      int[] var1 = B();
      com.C.W var10000 = this;
      if (var1 == null) {
         if (this.R == com.C.M.dropdown) {
            return Math.max(this.q, this.T);
         }

         var10000 = this;
      }

      return var10000.T;
   }

   @Override
   public Shape D(Component var1, Rectangle var2) {
      return this.g((JComponent)var1, var2);
   }

   public static void p(int[] var0) {
      w = var0;
   }

   public static int[] B$int() {
      return w;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[6];
      int var11 = 0;
      String var10 = "Ð/«~{ñ\u009b»³\u0084@¾\u000f\u000b+ù#Ü ¯£3á\u0096Ã\u0014yu\u009e5Ý\u0098O\u0096)$\u0015\u0011a\u0010\u0094\u0092þdñ\u008b\u000f\u008e:`Ü\u0002¥´1VÑú\u008e\u0096ã!";
      int var12 = "Ð/«~{ñ\u009b»³\u0084@¾\u000f\u000b+ù#Ü ¯£3á\u0096Ã\u0014yu\u009e5Ý\u0098O\u0096)$\u0015\u0011a\u0010\u0094\u0092þdñ\u008b\u000f\u008e:`Ü\u0002¥´1VÑú\u008e\u0096ã!"
         .length();
      char var9 = '\r';
      int var17 = -1;
      p(null);

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
                        var65 = 59;
                        break;
                     case 1:
                        var65 = 71;
                        break;
                     case 2:
                        var65 = 109;
                        break;
                     case 3:
                        var65 = 3;
                        break;
                     case 4:
                        var65 = 121;
                        break;
                     case 5:
                        var65 = 115;
                        break;
                     default:
                        var65 = 120;
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
                     b = var13;
                     f = new String[6];
                     long var0 = 8914948556394539063L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "à\u0013\u008bö\u0095\u009c]ÝºhÈ0FÌ\u000fTIýà©\u0092Øá>?î\u0005\u008au\u0016\u0095øaÌ¢J\u0097¤×}ðs÷xò¶]s";
                     int var5 = "à\u0013\u008bö\u0095\u009c]ÝºhÈ0FÌ\u000fTIýà©\u0092Øá>?î\u0005\u008au\u0016\u0095øaÌ¢J\u0097¤×}ðs÷xò¶]s".length();
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
                                    j = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "fØÒ$,¿*\u001d\u0085+bs\u0081\u008d'\\";
                                 var5 = "fØÒ$,¿*\u001d\u0085+bs\u0081\u008d'\\".length();
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

                  var10 = "¿\u0019/Ñ\u0082mÍA\u0010·[\nÁ\u001aéº<\u000eZa\u0010¶\rüÍ°3;;©ÌÏ\u009a¡\u008bè";
                  var12 = "¿\u0019/Ñ\u0082mÍA\u0010·[\nÁ\u001aéº<\u000eZa\u0010¶\rüÍ°3;;©ÌÏ\u009a¡\u008bè".length();
                  var9 = 22;
                  var17 = -1;
            }

            var10000 = 51;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30366) & 65535;
      if (f[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 59;
               break;
            case 1:
               var10000 = 111;
               break;
            case 2:
               var10000 = 178;
               break;
            case 3:
               var10000 = 82;
               break;
            case 4:
               var10000 = 181;
               break;
            case 5:
               var10000 = 26;
               break;
            case 6:
               var10000 = 255;
               break;
            case 7:
               var10000 = 157;
               break;
            case 8:
               var10000 = 180;
               break;
            case 9:
               var10000 = 94;
               break;
            case 10:
               var10000 = 161;
               break;
            case 11:
               var10000 = 72;
               break;
            case 12:
               var10000 = 117;
               break;
            case 13:
               var10000 = 128;
               break;
            case 14:
               var10000 = 56;
               break;
            case 15:
               var10000 = 90;
               break;
            case 16:
               var10000 = 173;
               break;
            case 17:
               var10000 = 28;
               break;
            case 18:
               var10000 = 176;
               break;
            case 19:
               var10000 = 191;
               break;
            case 20:
               var10000 = 155;
               break;
            case 21:
               var10000 = 208;
               break;
            case 22:
               var10000 = 87;
               break;
            case 23:
               var10000 = 205;
               break;
            case 24:
               var10000 = 40;
               break;
            case 25:
               var10000 = 102;
               break;
            case 26:
               var10000 = 120;
               break;
            case 27:
               var10000 = 244;
               break;
            case 28:
               var10000 = 38;
               break;
            case 29:
               var10000 = 202;
               break;
            case 30:
               var10000 = 182;
               break;
            case 31:
               var10000 = 27;
               break;
            case 32:
               var10000 = 168;
               break;
            case 33:
               var10000 = 119;
               break;
            case 34:
               var10000 = 83;
               break;
            case 35:
               var10000 = 70;
               break;
            case 36:
               var10000 = 211;
               break;
            case 37:
               var10000 = 138;
               break;
            case 38:
               var10000 = 251;
               break;
            case 39:
               var10000 = 86;
               break;
            case 40:
               var10000 = 153;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 242;
               break;
            case 43:
               var10000 = 237;
               break;
            case 44:
               var10000 = 73;
               break;
            case 45:
               var10000 = 240;
               break;
            case 46:
               var10000 = 192;
               break;
            case 47:
               var10000 = 19;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 227;
               break;
            case 50:
               var10000 = 241;
               break;
            case 51:
               var10000 = 147;
               break;
            case 52:
               var10000 = 69;
               break;
            case 53:
               var10000 = 197;
               break;
            case 54:
               var10000 = 37;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 127;
               break;
            case 57:
               var10000 = 75;
               break;
            case 58:
               var10000 = 71;
               break;
            case 59:
               var10000 = 134;
               break;
            case 60:
               var10000 = 238;
               break;
            case 61:
               var10000 = 96;
               break;
            case 62:
               var10000 = 171;
               break;
            case 63:
               var10000 = 116;
               break;
            case 64:
               var10000 = 9;
               break;
            case 65:
               var10000 = 5;
               break;
            case 66:
               var10000 = 232;
               break;
            case 67:
               var10000 = 36;
               break;
            case 68:
               var10000 = 95;
               break;
            case 69:
               var10000 = 199;
               break;
            case 70:
               var10000 = 185;
               break;
            case 71:
               var10000 = 97;
               break;
            case 72:
               var10000 = 47;
               break;
            case 73:
               var10000 = 164;
               break;
            case 74:
               var10000 = 48;
               break;
            case 75:
               var10000 = 210;
               break;
            case 76:
               var10000 = 11;
               break;
            case 77:
               var10000 = 0;
               break;
            case 78:
               var10000 = 141;
               break;
            case 79:
               var10000 = 92;
               break;
            case 80:
               var10000 = 201;
               break;
            case 81:
               var10000 = 1;
               break;
            case 82:
               var10000 = 77;
               break;
            case 83:
               var10000 = 106;
               break;
            case 84:
               var10000 = 194;
               break;
            case 85:
               var10000 = 139;
               break;
            case 86:
               var10000 = 249;
               break;
            case 87:
               var10000 = 126;
               break;
            case 88:
               var10000 = 125;
               break;
            case 89:
               var10000 = 124;
               break;
            case 90:
               var10000 = 32;
               break;
            case 91:
               var10000 = 65;
               break;
            case 92:
               var10000 = 230;
               break;
            case 93:
               var10000 = 189;
               break;
            case 94:
               var10000 = 115;
               break;
            case 95:
               var10000 = 133;
               break;
            case 96:
               var10000 = 145;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 217;
               break;
            case 99:
               var10000 = 84;
               break;
            case 100:
               var10000 = 170;
               break;
            case 101:
               var10000 = 57;
               break;
            case 102:
               var10000 = 188;
               break;
            case 103:
               var10000 = 223;
               break;
            case 104:
               var10000 = 246;
               break;
            case 105:
               var10000 = 253;
               break;
            case 106:
               var10000 = 137;
               break;
            case 107:
               var10000 = 100;
               break;
            case 108:
               var10000 = 152;
               break;
            case 109:
               var10000 = 148;
               break;
            case 110:
               var10000 = 216;
               break;
            case 111:
               var10000 = 196;
               break;
            case 112:
               var10000 = 158;
               break;
            case 113:
               var10000 = 222;
               break;
            case 114:
               var10000 = 146;
               break;
            case 115:
               var10000 = 214;
               break;
            case 116:
               var10000 = 129;
               break;
            case 117:
               var10000 = 149;
               break;
            case 118:
               var10000 = 51;
               break;
            case 119:
               var10000 = 142;
               break;
            case 120:
               var10000 = 34;
               break;
            case 121:
               var10000 = 132;
               break;
            case 122:
               var10000 = 67;
               break;
            case 123:
               var10000 = 54;
               break;
            case 124:
               var10000 = 231;
               break;
            case 125:
               var10000 = 250;
               break;
            case 126:
               var10000 = 179;
               break;
            case 127:
               var10000 = 23;
               break;
            case 128:
               var10000 = 74;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 64;
               break;
            case 132:
               var10000 = 89;
               break;
            case 133:
               var10000 = 163;
               break;
            case 134:
               var10000 = 233;
               break;
            case 135:
               var10000 = 79;
               break;
            case 136:
               var10000 = 53;
               break;
            case 137:
               var10000 = 200;
               break;
            case 138:
               var10000 = 220;
               break;
            case 139:
               var10000 = 209;
               break;
            case 140:
               var10000 = 21;
               break;
            case 141:
               var10000 = 239;
               break;
            case 142:
               var10000 = 247;
               break;
            case 143:
               var10000 = 17;
               break;
            case 144:
               var10000 = 187;
               break;
            case 145:
               var10000 = 162;
               break;
            case 146:
               var10000 = 91;
               break;
            case 147:
               var10000 = 248;
               break;
            case 148:
               var10000 = 226;
               break;
            case 149:
               var10000 = 150;
               break;
            case 150:
               var10000 = 8;
               break;
            case 151:
               var10000 = 6;
               break;
            case 152:
               var10000 = 195;
               break;
            case 153:
               var10000 = 45;
               break;
            case 154:
               var10000 = 169;
               break;
            case 155:
               var10000 = 30;
               break;
            case 156:
               var10000 = 41;
               break;
            case 157:
               var10000 = 14;
               break;
            case 158:
               var10000 = 136;
               break;
            case 159:
               var10000 = 184;
               break;
            case 160:
               var10000 = 154;
               break;
            case 161:
               var10000 = 166;
               break;
            case 162:
               var10000 = 112;
               break;
            case 163:
               var10000 = 254;
               break;
            case 164:
               var10000 = 243;
               break;
            case 165:
               var10000 = 25;
               break;
            case 166:
               var10000 = 29;
               break;
            case 167:
               var10000 = 52;
               break;
            case 168:
               var10000 = 43;
               break;
            case 169:
               var10000 = 4;
               break;
            case 170:
               var10000 = 31;
               break;
            case 171:
               var10000 = 212;
               break;
            case 172:
               var10000 = 204;
               break;
            case 173:
               var10000 = 203;
               break;
            case 174:
               var10000 = 224;
               break;
            case 175:
               var10000 = 215;
               break;
            case 176:
               var10000 = 46;
               break;
            case 177:
               var10000 = 118;
               break;
            case 178:
               var10000 = 104;
               break;
            case 179:
               var10000 = 85;
               break;
            case 180:
               var10000 = 219;
               break;
            case 181:
               var10000 = 140;
               break;
            case 182:
               var10000 = 225;
               break;
            case 183:
               var10000 = 42;
               break;
            case 184:
               var10000 = 229;
               break;
            case 185:
               var10000 = 235;
               break;
            case 186:
               var10000 = 68;
               break;
            case 187:
               var10000 = 109;
               break;
            case 188:
               var10000 = 10;
               break;
            case 189:
               var10000 = 99;
               break;
            case 190:
               var10000 = 62;
               break;
            case 191:
               var10000 = 236;
               break;
            case 192:
               var10000 = 12;
               break;
            case 193:
               var10000 = 165;
               break;
            case 194:
               var10000 = 245;
               break;
            case 195:
               var10000 = 44;
               break;
            case 196:
               var10000 = 61;
               break;
            case 197:
               var10000 = 105;
               break;
            case 198:
               var10000 = 78;
               break;
            case 199:
               var10000 = 175;
               break;
            case 200:
               var10000 = 98;
               break;
            case 201:
               var10000 = 76;
               break;
            case 202:
               var10000 = 55;
               break;
            case 203:
               var10000 = 15;
               break;
            case 204:
               var10000 = 58;
               break;
            case 205:
               var10000 = 22;
               break;
            case 206:
               var10000 = 63;
               break;
            case 207:
               var10000 = 123;
               break;
            case 208:
               var10000 = 221;
               break;
            case 209:
               var10000 = 172;
               break;
            case 210:
               var10000 = 13;
               break;
            case 211:
               var10000 = 16;
               break;
            case 212:
               var10000 = 206;
               break;
            case 213:
               var10000 = 103;
               break;
            case 214:
               var10000 = 193;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 228;
               break;
            case 217:
               var10000 = 108;
               break;
            case 218:
               var10000 = 93;
               break;
            case 219:
               var10000 = 7;
               break;
            case 220:
               var10000 = 66;
               break;
            case 221:
               var10000 = 234;
               break;
            case 222:
               var10000 = 60;
               break;
            case 223:
               var10000 = 121;
               break;
            case 224:
               var10000 = 122;
               break;
            case 225:
               var10000 = 80;
               break;
            case 226:
               var10000 = 167;
               break;
            case 227:
               var10000 = 252;
               break;
            case 228:
               var10000 = 114;
               break;
            case 229:
               var10000 = 18;
               break;
            case 230:
               var10000 = 110;
               break;
            case 231:
               var10000 = 88;
               break;
            case 232:
               var10000 = 144;
               break;
            case 233:
               var10000 = 2;
               break;
            case 234:
               var10000 = 3;
               break;
            case 235:
               var10000 = 101;
               break;
            case 236:
               var10000 = 131;
               break;
            case 237:
               var10000 = 35;
               break;
            case 238:
               var10000 = 190;
               break;
            case 239:
               var10000 = 218;
               break;
            case 240:
               var10000 = 113;
               break;
            case 241:
               var10000 = 135;
               break;
            case 242:
               var10000 = 50;
               break;
            case 243:
               var10000 = 39;
               break;
            case 244:
               var10000 = 81;
               break;
            case 245:
               var10000 = 186;
               break;
            case 246:
               var10000 = 156;
               break;
            case 247:
               var10000 = 159;
               break;
            case 248:
               var10000 = 143;
               break;
            case 249:
               var10000 = 174;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 207;
               break;
            case 252:
               var10000 = 183;
               break;
            case 253:
               var10000 = 24;
               break;
            case 254:
               var10000 = 20;
               break;
            default:
               var10000 = 213;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30578;
      if (j[var3] == null) {
         j[var3] = (int)(i[var3] ^ var1);
      }

      return j[var3];
   }
}





