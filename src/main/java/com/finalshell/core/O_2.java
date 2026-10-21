package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import javax.swing.JComponent;

public class O_2 extends Lz2_2 implements RJ, WR_2 {
   protected boolean F = M2.i;
   protected boolean K = M2.F;
   protected int v = M2.G;
   protected int q = M2.s;
   protected float M = M2.u;
   protected Stroke X = M2.J;
   protected Color f = M2.v;
   protected Color Q = M2.T;
   protected boolean N = M2.k;
   protected boolean I = M2.d;
   protected boolean o = true;
   protected boolean C = true;
   protected boolean y = true;
   protected boolean P = true;
   protected boolean O = false;
   protected boolean W = false;
   protected boolean m = false;
   protected boolean J = false;
   protected P62 t;
   protected boolean u = false;
   protected boolean a;
   protected boolean x;
   protected boolean l;
   protected int b;
   protected int j;
   public static String[] g;
   public static String[] h;
   public static long[] i;
   public static Integer[] k;

   public void A$void(JComponent var1) {
      super.A(var1);
      this.t = new Y(this);
      ON.b(var1, this.t);
   }

   @Override
   public void X(JComponent var1) {
      ON.i(this.t);
      this.t = null;
      super.X(var1);
   }

   public Shape s(JComponent var1, Rectangle var2) {
      int[] var3 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var3 == null) {
         if (this.F) {
            return var2;
         }

         var10000 = this;
      }

      return var10000.g(var1, true);
   }

   public boolean s() {
      return this.F;
   }

   public void O(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.F == var1) {
            return;
         }

         this.F = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean i() {
      return this.K;
   }

   public void V(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.K == var1) {
            return;
         }

         this.K = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public int w() {
      return this.v;
   }

   public void D(int var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.v == var1) {
            return;
         }

         this.v = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public int X() {
      return this.q;
   }

   public void E(int var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.q == var1) {
            return;
         }

         this.q = var1;
         var10000 = this;
      }

      var10000.x();
   }

   public float n$float() {
      return this.M;
   }

   public void K(float var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.M == var1) {
            return;
         }

         this.M = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Stroke H$Stroke() {
      return this.X;
   }

   public void X(Stroke var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.X == var1) {
            return;
         }

         this.X = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color K() {
      return this.f;
   }

   public void K(Color var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.f == var1) {
            return;
         }

         this.f = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public Color r() {
      return this.Q;
   }

   public void v(Color var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.Q == var1) {
            return;
         }

         this.Q = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public boolean y() {
      return this.N;
   }

   public void W(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.N == var1) {
            return;
         }

         this.N = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public boolean z() {
      return this.I;
   }

   public void h(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.I == var1) {
            return;
         }

         this.I = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public boolean h() {
      return this.o;
   }

   @Override
   public void D(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.o == var1) {
            return;
         }

         this.o = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean n$boolean() {
      return this.C;
   }

   @Override
   public void C(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.C == var1) {
            return;
         }

         this.C = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean R() {
      return this.y;
   }

   @Override
   public void p(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.y == var1) {
            return;
         }

         this.y = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean S() {
      return this.P;
   }

   @Override
   public void w(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.P == var1) {
            return;
         }

         this.P = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   @Override
   public void I(boolean var1, boolean var2, boolean var3, boolean var4) {
      O_2 var10000;
      int[] var5 = W_2.B$arrint();
      var10000 = this;
      label28:
      if (var5 == null) {
         if (this.o == var1) {
            var10000 = this;
            if (var5 != null) {
               break label28;
            }

            if (this.C == var2) {
               var10000 = this;
               if (var5 != null) {
                  break label28;
               }

               if (this.y == var3) {
                  var10000 = this;
                  if (var5 != null) {
                     break label28;
                  }

                  if (this.P == var4) {
                     return;
                  }
               }
            }
         }

         this.o = var1;
         this.C = var2;
         this.y = var3;
         this.P = var4;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean T() {
      return this.O;
   }

   @Override
   public void X(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.O == var1) {
            return;
         }

         this.O = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean Z() {
      return this.W;
   }

   @Override
   public void H(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.W == var1) {
            return;
         }

         this.W = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean V() {
      return this.m;
   }

   @Override
   public void B(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.m == var1) {
            return;
         }

         this.m = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean H$boolean() {
      return this.J;
   }

   @Override
   public void m(boolean var1) {
      int[] var2 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var2 == null) {
         if (this.J == var1) {
            return;
         }

         this.J = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   @Override
   public void X(boolean var1, boolean var2, boolean var3, boolean var4) {
      O_2 var10000;
      int[] var5 = W_2.B$arrint();
      var10000 = this;
      label28:
      if (var5 == null) {
         if (this.O == var1) {
            var10000 = this;
            if (var5 != null) {
               break label28;
            }

            if (this.W == var2) {
               var10000 = this;
               if (var5 != null) {
                  break label28;
               }

               if (this.m == var3) {
                  var10000 = this;
                  if (var5 != null) {
                     break label28;
                  }

                  if (this.J == var4) {
                     return;
                  }
               }
            }
         }

         this.O = var1;
         this.W = var2;
         this.m = var3;
         this.J = var4;
         var10000 = this;
      }

      var10000.Z();
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.F;
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var2 = W_2.B$arrint();
      int var10000 = (this.F) ? 1 : 0;
      if (var2 == null) {
         if (this.F) {
            return null;
         }

         var10000 = this.q + 1;
      }

      int var3 = var10000;
      byte var4 = (var1.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      int var13 = var4;
      if (var2 == null) {
         var13 = (var4 != 0 ? this.C : this.P) ? 1 : 0;
      }

      byte var5 = (byte)var13;
      var13 = var4;
      if (var2 == null) {
         var13 = (var4 != 0 ? this.W : this.J) ? 1 : 0;
      }

      byte var6 = var13;
      var13 = var4;
      if (var2 == null) {
         var13 = (var4 != 0 ? this.P : this.C) ? 1 : 0;
      }

      byte var7 = var13;
      var13 = var4;
      if (var2 == null) {
         var13 = (var4 != 0 ? this.J : this.W) ? 1 : 0;
      }

      byte var8;
      label104: {
         var8 = var13;
         var13 = (this.o) ? 1 : 0;
         if (var2 == null) {
            if (this.o) {
               var13 = var3;
               break label104;
            }

            var13 = (this.O) ? 1 : 0;
         }

         if (var2 == null) {
            var13 = var13 != 0 ? 1 : 0;
         }
      }

      int var9;
      label98: {
         var9 = var13;
         var13 = var5;
         if (var2 == null) {
            if (var5 != 0) {
               var13 = var3;
               break label98;
            }

            var13 = var6;
         }

         if (var2 == null) {
            var13 = var13 != 0 ? 1 : 0;
         }
      }

      int var10;
      label92: {
         var10 = var13;
         var13 = (this.y) ? 1 : 0;
         if (var2 == null) {
            if (this.y) {
               var13 = var3;
               break label92;
            }

            var13 = (this.m) ? 1 : 0;
         }

         if (var2 == null) {
            var13 = var13 != 0 ? 1 : 0;
         }
      }

      int var11;
      label86: {
         var11 = var13;
         var13 = var7;
         if (var2 == null) {
            if (var7 != 0) {
               var13 = var3;
               break label86;
            }

            var13 = var8;
         }

         if (var2 == null) {
            var13 = var13 != 0 ? 1 : 0;
         }
      }

      int var12 = var13;
      return new Insets(var9, var10, var11, var12);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = W_2.B$arrint();
      O_2 var10000 = this;
      if (var4 == null) {
         if (this.F) {
            return;
         }

         this.a = var3.getComponentOrientation().isLeftToRight();
         var10000 = this;
      }

      boolean var15;
      label120: {
         O_2 var10001 = this;
         if (var4 == null) {
            if (this.a) {
               var15 = this.C;
               break label120;
            }

            var10001 = this;
         }

         var15 = var10001.P;
      }

      label114: {
         var10000.x = var15;
         O_2 var16 = this;
         if (var4 == null) {
            if (this.a) {
               var15 = this.P;
               break label114;
            }

            var16 = this;
         }

         var15 = var16.C;
      }

      this.l = var15;
      this.b = var3.getWidth();
      this.j = var3.getHeight();
      var10 = this.o;
      label107:
      if (var4 == null) {
         if (!this.o) {
            var10 = this.P;
            if (var4 != null) {
               break label107;
            }

            if (!this.P) {
               var10 = this.y;
               if (var4 != null) {
                  break label107;
               }

               if (!this.y) {
                  var10 = this.C;
                  if (var4 != null) {
                     break label107;
                  }

                  if (!this.C) {
                     var10 = 0;
                     break label107;
                  }
               }
            }
         }

         var10 = 1;
      }

      byte var5;
      label93: {
         label92: {
            var5 = var10;
            byte var11 = var5;
            if (var4 == null) {
               if (var5 != 0) {
                  break label92;
               }

               var12 = this;
               if (var4 != null) {
                  break label93;
               }

               var11 = (this.N) ? 1 : 0;
            }

            if (var11 == 0) {
      int[] var13;
      int[] var13;
               return;
            }
         }

         var12 = RV.X(var1);
      }

      Object var6;
      byte var7;
      Shape var8;
      Shape var9;
      var6 = var12;
      var7 = (var3.isEnabled()) ? 1 : 0;
      var8 = this.g(var3, false);
      var9 = this.g(var3, true);
      var13 = var5;
      label80:
      if (var4 == null) {
         if (var5 != 0) {
            var13 = this.q;
            if (var4 != null) {
               break label80;
            }

            if (this.q > 0) {
               this.A(var1, var2, var3, var8);
            }
         }

         var13 = this.N;
      }

      if (var4 == null) {
         if (var13 != 0) {
            this.S(var1, var2, var3, var9);
         }

         var13 = var5;
      }

      label132: {
         if (var4 == null) {
            if (var13 == 0) {
               break label132;
            }

            var13 = var7;
         }

         label70: {
            if (var13 != 0) {
               if (this.f == null) {
                  break label132;
               }
            } else {
               var10000 = this;
               if (var4 != null) {
                  break label70;
               }

               if (this.Q == null) {
                  break label132;
               }
            }

            var10000 = this;
         }

         var10000.f(var1, var2, var3, var8);
      }

      RV.X(var1, var6);
   }

   protected void A(Graphics2D var1, Rectangle var2, JComponent var3, Shape var4) {
      int[] var5 = W_2.B$arrint();
      int var10000 = this.q;
      int var10001 = 4;
      if (var5 == null) {
         if (this.q < 4) {
            Float var21 = this.M;
            float var31;
            int var10002 = (var31 = this.M - 1.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            if (var5 == null) {
               var10002 = var10002 < 0 ? 1 : 0;
            }

            Composite var6;
            label109: {
               label108: {
                  var6 = RV.a(var1, var21, (boolean)var10002);
                  boolean var13 = (this.K) != 0;
                  if (var5 == null) {
                     if (!this.K) {
                        break label108;
                     }

                     var13 = this.u;
                  }

                  if (var13) {
                     var14 = GO.c;
                     break label109;
                  }
               }

               var14 = GO.r;
            }

            Color var7 = var14;
            RV.Y(var1, var4, var7, this.q);
            float var32;
            var10002 = (var32 = this.M - 1.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            if (var5 == null) {
               var10002 = var10002 < 0 ? 1 : 0;
            }

            RV.E(var1, var6, (boolean)var10002);
            if (var5 == null) {
               return;
            }
         }

         var10000 = this.q;
         var10001 = this.v;
      }

      PF3 var11;
      label94: {
         var11 = ((Fk2.I(var10000, var10001, this.M)) ? 1 : 0) ? 1 : 0;
         var10000 = (this.x) != 0;
         if (var5 == null) {
            if (this.x) {
               var10000 = 0;
               break label94;
            }

            var10000 = -this.q;
         }

         var10000 *= 2;
      }

      int var12;
      label88: {
         var12 = ((var10000) ? 1 : 0) ? 1 : 0;
         var10001 = ((this.x) != 0) != 0;
         if (var5 == null) {
            if (this.x) {
               var10001 = 0;
               break label88;
            }

            var10001 = this.q;
         }

         var10001 *= 2;
      }

      label82: {
         var10000 = ((this.b + var10001) ? 1 : 0) ? 1 : 0;
         var10001 = ((this.l) != 0) != 0;
         if (var5 == null) {
            if (this.l) {
               var10001 = 0;
               break label82;
            }

            var10001 = this.q;
         }

         var10001 *= 2;
      }

      int var8;
      label76: {
         var8 = ((var10000 + var10001) ? 1 : 0) ? 1 : 0;
         var10000 = ((this.o) != 0) != 0;
         if (var5 == null) {
            if (this.o) {
               var10000 = 0;
               break label76;
            }

            var10000 = -this.q;
         }

         var10000 *= 2;
      }

      int var9;
      label70: {
         var9 = ((var10000) ? 1 : 0) ? 1 : 0;
         var10001 = ((this.o) != 0) != 0;
         if (var5 == null) {
            if (this.o) {
               var10001 = 0;
               break label70;
            }

            var10001 = this.q;
         }

         var10001 *= 2;
      }

      label64: {
         var10000 = ((this.j + var10001) ? 1 : 0) ? 1 : 0;
         var10001 = ((this.y) != 0) != 0;
         if (var5 == null) {
            if (this.y) {
               var10001 = 0;
               break label64;
            }

            var10001 = this.q;
         }

         var10001 *= 2;
      }

      int var10 = var10000 + var10001;
      var11.l(var1, var12, var9, var8, var10);
   }

   protected void S(Graphics2D var1, Rectangle var2, JComponent var3, Shape var4) {
      label11: {
         int[] var5 = W_2.B$arrint();
         if (this.I) {
            Rectangle var6 = var4.getBounds();
            var1.setPaint(GA.m(0, var6.y, 0, var6.y + var6.height));
            if (var5 == null) {
               break label11;
            }
         }

         var1.setPaint(var3.getBackground());
      }

      var1.fill(var4);
   }

   protected void f(Graphics2D var1, Rectangle var2, JComponent var3, Shape var4) {
      int[] var5;
      Stroke var6;
      int var10000;
      var5 = W_2.B$arrint();
      var6 = RV.d(var1, this.X, this.X != null);
      var1.setPaint(var3.isEnabled() ? this.f : this.Q);
      var1.draw(var4);
      var10000 = this.o;
      label173:
      if (var5 == null) {
         if (!this.o) {
            var10000 = this.O;
            if (var5 != null) {
               break label173;
            }

            if (this.O) {
               var10000 = this.x;
               if (var5 == null) {
                  var10000 = this.x ? this.q : 0;
               }

               int var7 = var10000;
               int var10003 = (((var7 + var3.getWidth()) ? 1 : 0) ? 1 : 0) ? 1 : 0;
               int var10004 = this.x;
               if (var5 == null) {
                  var10004 = this.x ? this.q : 0;
               }

               var10003 -= var10004;
               var10004 = this.l;
               if (var5 == null) {
                  var10004 = this.l ? this.q + 1 : 0;
               }

               var1.drawLine(var7, 0, var10003 - var10004, 0);
            }
         }

         var10000 = this.y;
      }

      label166:
      if (var5 == null) {
         if (var10000 == 0) {
            var10000 = this.m;
            if (var5 != null) {
               break label166;
            }

            if (this.m) {
               var10000 = this.x;
               if (var5 == null) {
                  var10000 = this.x ? this.q : 0;
               }

               int var8 = var10000;
               int var10002 = var3.getHeight() - 1;
               int var15 = (((var8 + var3.getWidth()) ? 1 : 0) ? 1 : 0) ? 1 : 0;
               int var19 = this.x;
               if (var5 == null) {
                  var19 = this.x ? this.q : 0;
               }

               var15 -= var19;
               var19 = this.l;
               if (var5 == null) {
                  var19 = this.l ? this.q + 1 : 0;
               }

               var1.drawLine(var8, var10002, var15 - var19, var3.getHeight() - 1);
            }
         }

         var10000 = this.C;
      }

      label159:
      if (var5 == null) {
         if (var10000 == 0) {
            var10000 = this.W;
            if (var5 != null) {
               break label159;
            }

            if (this.W) {
               var10000 = this.o;
               if (var5 == null) {
                  var10000 = this.o ? this.q : 0;
               }

               int var9 = var10000;
               int var21 = (((var9 + var3.getHeight()) ? 1 : 0) ? 1 : 0) ? 1 : 0;
               int var10005 = this.o;
               if (var5 == null) {
                  var10005 = this.o ? this.q : 0;
               }

               var21 -= var10005;
               var10005 = this.y;
               if (var5 == null) {
                  var10005 = this.y ? this.q + 1 : 0;
               }

               var1.drawLine(0, var9, 0, var21 - var10005);
            }
         }

         var10000 = this.P;
      }

      label180: {
         if (var5 == null) {
            if (var10000 != 0) {
               break label180;
            }

            var10000 = this.J;
         }

         if (var5 == null) {
            if (var10000 == 0) {
               break label180;
            }

            var10000 = this.o;
         }

         if (var5 == null) {
            var10000 = var10000 != 0 ? this.q : 0;
         }

         int var10 = var10000;
         int var10001 = var3.getWidth() - 1;
         int var17 = var3.getWidth() - 1;
         int var23 = (((var10 + var3.getHeight()) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         int var26 = this.o;
         if (var5 == null) {
            var26 = this.o ? this.q : 0;
         }

         var23 -= var26;
         var26 = this.y;
         if (var5 == null) {
            var26 = this.y ? this.q + 1 : 0;
         }

         var1.drawLine(var10001, var10, var17, var23 - var26);
      }

      RV.t(var1, var6, this.X != null);
   }

   protected Shape g(JComponent var1, boolean var2) {
      return O42.k(var1, var2 ? a(16515, 458) : a(16514, 3058), new T2_2(this, var1, var2), this.A$arrObject(var1));
   }

   protected Object[] A$arrObject(JComponent var1) {
      Object[] var10000 = new Object[a(5707, 8040048458137009893L)];
      var10000[0] = this.b;
      var10000[1] = this.j;
      var10000[2] = this.a;
      var10000[3] = this.v;
      var10000[4] = this.q;
      var10000[5] = this.o;
      var10000[a(99, 8450514311306275016L)] = this.C;
      var10000[a(3354, 6159643100633621941L)] = this.y;
      var10000[a(26206, 1639371874851262194L)] = this.P;
      var10000[a(5470, 3863090353741004275L)] = this.O;
      var10000[a(22432, 5440591444549091081L)] = this.W;
      var10000[a(23639, 3463740015491003647L)] = this.m;
      var10000[a(9101, 6460277869894552359L)] = this.J;
      return var10000;
   }

   protected Shape o(JComponent var1, boolean var2) {
      int[] var3 = W_2.B$arrint();
      int var10000 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            GeneralPath var7 = new GeneralPath(0);
            boolean var8 = false;
            boolean var6 = false;
            boolean var12 = this.o;
            if (var3 == null) {
               if (this.o) {
                  float var19;
                  label261: {
                     var13 = (((var7) ? 1 : 0) ? 1 : 0) ? 1 : 0;
                     int var10001 = this.x;
                     if (var3 == null) {
                        if (!this.x) {
                           var19 = 0.0F;
                           break label261;
                        }

                        var10001 = this.q + this.v;
                     }

                     var19 = (float)var10001;
                  }

                  label255: {
                     float var27 = (float)this.q;
                     if (var3 == null) {
                        var7.moveTo(var19, var27);
                        if (this.l) {
                           var7.lineTo((float)(this.b - this.q - this.v - 1), (float)this.q);
                           var7.quadTo((float)(this.b - this.q - 1), (float)this.q, (float)(this.b - this.q - 1), (float)(this.q + this.v));
                           if (var3 == null) {
                              break label255;
                           }
                        }

                        var13 = var7;
                        var19 = (float)(this.b - 1);
                        var27 = (float)this.q;
                     }

                     var13.lineTo(var19, var27);
                  }

                  var8 = true;
               }

               var12 = this.l;
            }

            label246: {
               if (var3 == null) {
                  if (var12) {
                     var12 = var8;
                     if (var3 == null) {
                        if (!var8) {
                           float var20;
                           float var29;
                           label237: {
                              var20 = ((((float)(this.b - this.q - 1)) ? 1 : 0) ? 1 : 0) ? 1 : 0;
                              int var28 = this.o;
                              if (var3 == null) {
                                 if (!this.o) {
                                    var29 = 0.0F;
                                    break label237;
                                 }

                                 var28 = this.q + this.v;
                              }

                              var29 = (float)var28;
                           }

                           var7.moveTo(var20, var29);
                           var6 = true;
                        }

                        var12 = this.y;
                     }

                     label229: {
                        if (var12) {
                           var7.lineTo((float)(this.b - this.q - 1), (float)(this.j - this.q - this.v - 1));
                           var7.quadTo(
                              (float)(this.b - this.q - 1), (float)(this.j - this.q - 1), (float)(this.b - this.q - this.v - 1), (float)(this.j - this.q - 1)
                           );
                           if (var3 == null) {
                              break label229;
                           }
                        }

                        var7.lineTo((float)(this.b - this.q - 1), (float)(this.j - 1));
                     }

                     var8 = true;
                     if (var3 == null) {
                        break label246;
                     }
                  }

                  var12 = false;
               }

               var8 = var12;
            }

            label220: {
               var12 = this.y;
               if (var3 == null) {
                  if (this.y) {
                     var12 = var8;
                     if (var3 == null) {
                        if (!var8) {
                           float var22;
                           label211: {
                              int var21 = this.l;
                              if (var3 == null) {
                                 if (this.l) {
                                    var22 = (float)(this.b - this.q - this.v - 1);
                                    break label211;
                                 }

                                 var21 = this.b - 1;
                              }

                              var22 = (float)var21;
                           }

                           var7.moveTo(var22, (float)(this.j - this.q - 1));
                           var6 = true;
                        }

                        var12 = this.x;
                     }

                     label203: {
                        if (var12) {
                           var7.lineTo((float)(this.q + this.v), (float)(this.j - this.q - 1));
                           var7.quadTo((float)this.q, (float)(this.j - this.q - 1), (float)this.q, (float)(this.j - this.q - this.v - 1));
                           if (var3 == null) {
                              break label203;
                           }
                        }

                        var7.lineTo(0.0F, (float)(this.j - this.q - 1));
                     }

                     var8 = true;
                     if (var3 == null) {
                        break label220;
                     }
                  }

                  var12 = false;
               }

               var8 = var12;
            }

            var12 = this.x;
            if (var3 == null) {
               if (!this.x) {
                  return var7;
               }

               var12 = var8;
            }

            if (var3 == null) {
               if (!var12) {
                  float var23;
                  float var31;
                  label183: {
                     var23 = ((((float)this.q) ? 1 : 0) ? 1 : 0) ? 1 : 0;
                     int var30 = this.y;
                     if (var3 == null) {
                        if (this.y) {
                           var31 = (float)(this.j - this.q - this.v - 1);
                           break label183;
                        }

                        var30 = this.j - 1;
                     }

                     var31 = (float)var30;
                  }

                  var7.moveTo(var23, var31);
                  var6 = true;
               }

               var12 = this.o;
            }

            label353: {
               if (var3 == null) {
                  if (!var12) {
                     break label353;
                  }

                  var7.lineTo((float)this.q, (float)(this.q + this.v));
                  if (var3 != null) {
                     return var7;
                  }

                  var7.quadTo((float)this.q, (float)this.q, (float)(this.q + this.v), (float)this.q);
                  var12 = var6;
               }

               if (var12) {
                  return var7;
               }

               var7.closePath();
               if (var3 == null) {
                  return var7;
               }
            }

            var7.lineTo((float)this.q, 0.0F);
            return var7;
         }

         var10000 = 4;
      }

      Point[] var4 = new Point[var10000];
      boolean[] var5 = new boolean[4];
      int var10003 = this.x;
      if (var3 == null) {
         var10003 = this.x ? this.q : 0;
      }

      int var10004 = this.o;
      if (var3 == null) {
         var10004 = this.o ? this.q : 0;
      }

      boolean var10002;
      label338: {
         label355: {
            var4[0] = this.J(var10003, var10004);
            var10002 = this.x;
            if (var3 == null) {
               if (!this.x) {
                  break label355;
               }

               var10002 = this.o;
            }

            if (var3 != null) {
               break label338;
            }

            if (var10002) {
               var10002 = true;
               break label338;
            }
         }

         var10002 = false;
      }

      label327: {
         var5[0] = var10002;
         O_2 var32 = this;
         if (var3 == null) {
            if (this.l) {
               var10003 = this.b - this.q;
               break label327;
            }

            var32 = this;
         }

         var10003 = var32.b;
      }

      var10004 = this.o;
      if (var3 == null) {
         var10004 = this.o ? this.q : 0;
      }

      label320: {
         label356: {
            var4[1] = this.J(var10003, var10004);
            var10002 = this.l;
            if (var3 == null) {
               if (!this.l) {
                  break label356;
               }

               var10002 = this.o;
            }

            if (var3 != null) {
               break label320;
            }

            if (var10002) {
               var10002 = true;
               break label320;
            }
         }

         var10002 = false;
      }

      label309: {
         var5[1] = var10002;
         O_2 var34 = this;
         if (var3 == null) {
            if (this.l) {
               var10003 = this.b - this.q;
               break label309;
            }

            var34 = this;
         }

         var10003 = var34.b;
      }

      label303: {
         O_2 var38 = this;
         if (var3 == null) {
            if (this.y) {
               var10004 = this.j - this.q;
               break label303;
            }

            var38 = this;
         }

         var10004 = var38.j;
      }

      label297: {
         label357: {
            var4[2] = this.J(var10003, var10004);
            var10002 = this.l;
            if (var3 == null) {
               if (!this.l) {
                  break label357;
               }

               var10002 = this.y;
            }

            if (var3 != null) {
               break label297;
            }

            if (var10002) {
               var10002 = true;
               break label297;
            }
         }

         var10002 = false;
      }

      var5[2] = var10002;
      var10003 = this.x;
      if (var3 == null) {
         var10003 = this.x ? this.q : 0;
      }

      label285: {
         O_2 var40 = this;
         if (var3 == null) {
            if (this.y) {
               var10004 = this.j - this.q;
               break label285;
            }

            var40 = this;
         }

         var10004 = var40.j;
      }

      label279: {
         label358: {
            var4[3] = this.J(var10003, var10004);
            var10002 = this.x;
            if (var3 == null) {
               if (!this.x) {
                  break label358;
               }

               var10002 = this.y;
            }

            if (var3 != null) {
               break label279;
            }

            if (var10002) {
               var10002 = true;
               break label279;
            }
         }

         var10002 = false;
      }

      var5[3] = var10002;
      var10000 = this.v;
      if (var3 == null) {
         var10000 = this.v > 0 ? this.v + 1 : 0;
      }

      return GA.m(var10000, var4, var5);
   }

   @Override
   public Shape D(Component var1, Rectangle var2) {
      return this.s((JComponent)var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16515) & 65535;
      if (h[var2] == null) {
         char[] var3 = g[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 212;
               break;
            case 1:
               var10000 = 184;
               break;
            case 2:
               var10000 = 224;
               break;
            case 3:
               var10000 = 6;
               break;
            case 4:
               var10000 = 158;
               break;
            case 5:
               var10000 = 154;
               break;
            case 6:
               var10000 = 105;
               break;
            case 7:
               var10000 = 171;
               break;
            case 8:
               var10000 = 241;
               break;
            case 9:
               var10000 = 162;
               break;
            case 10:
               var10000 = 29;
               break;
            case 11:
               var10000 = 128;
               break;
            case 12:
               var10000 = 94;
               break;
            case 13:
               var10000 = 226;
               break;
            case 14:
               var10000 = 32;
               break;
            case 15:
               var10000 = 153;
               break;
            case 16:
               var10000 = 0;
               break;
            case 17:
               var10000 = 208;
               break;
            case 18:
               var10000 = 31;
               break;
            case 19:
               var10000 = 183;
               break;
            case 20:
               var10000 = 151;
               break;
            case 21:
               var10000 = 178;
               break;
            case 22:
               var10000 = 86;
               break;
            case 23:
               var10000 = 23;
               break;
            case 24:
               var10000 = 58;
               break;
            case 25:
               var10000 = 191;
               break;
            case 26:
               var10000 = 235;
               break;
            case 27:
               var10000 = 119;
               break;
            case 28:
               var10000 = 80;
               break;
            case 29:
               var10000 = 111;
               break;
            case 30:
               var10000 = 230;
               break;
            case 31:
               var10000 = 233;
               break;
            case 32:
               var10000 = 3;
               break;
            case 33:
               var10000 = 182;
               break;
            case 34:
               var10000 = 221;
               break;
            case 35:
               var10000 = 255;
               break;
            case 36:
               var10000 = 5;
               break;
            case 37:
               var10000 = 49;
               break;
            case 38:
               var10000 = 189;
               break;
            case 39:
               var10000 = 1;
               break;
            case 40:
               var10000 = 120;
               break;
            case 41:
               var10000 = 100;
               break;
            case 42:
               var10000 = 201;
               break;
            case 43:
               var10000 = 249;
               break;
            case 44:
               var10000 = 195;
               break;
            case 45:
               var10000 = 30;
               break;
            case 46:
               var10000 = 113;
               break;
            case 47:
               var10000 = 87;
               break;
            case 48:
               var10000 = 210;
               break;
            case 49:
               var10000 = 17;
               break;
            case 50:
               var10000 = 103;
               break;
            case 51:
               var10000 = 204;
               break;
            case 52:
               var10000 = 170;
               break;
            case 53:
               var10000 = 223;
               break;
            case 54:
               var10000 = 122;
               break;
            case 55:
               var10000 = 140;
               break;
            case 56:
               var10000 = 207;
               break;
            case 57:
               var10000 = 12;
               break;
            case 58:
               var10000 = 107;
               break;
            case 59:
               var10000 = 51;
               break;
            case 60:
               var10000 = 149;
               break;
            case 61:
               var10000 = 131;
               break;
            case 62:
               var10000 = 97;
               break;
            case 63:
               var10000 = 98;
               break;
            case 64:
               var10000 = 143;
               break;
            case 65:
               var10000 = 216;
               break;
            case 66:
               var10000 = 218;
               break;
            case 67:
               var10000 = 155;
               break;
            case 68:
               var10000 = 117;
               break;
            case 69:
               var10000 = 203;
               break;
            case 70:
               var10000 = 190;
               break;
            case 71:
               var10000 = 179;
               break;
            case 72:
               var10000 = 41;
               break;
            case 73:
               var10000 = 50;
               break;
            case 74:
               var10000 = 57;
               break;
            case 75:
               var10000 = 24;
               break;
            case 76:
               var10000 = 16;
               break;
            case 77:
               var10000 = 83;
               break;
            case 78:
               var10000 = 157;
               break;
            case 79:
               var10000 = 147;
               break;
            case 80:
               var10000 = 14;
               break;
            case 81:
               var10000 = 42;
               break;
            case 82:
               var10000 = 9;
               break;
            case 83:
               var10000 = 137;
               break;
            case 84:
               var10000 = 71;
               break;
            case 85:
               var10000 = 192;
               break;
            case 86:
               var10000 = 61;
               break;
            case 87:
               var10000 = 104;
               break;
            case 88:
               var10000 = 88;
               break;
            case 89:
               var10000 = 52;
               break;
            case 90:
               var10000 = 222;
               break;
            case 91:
               var10000 = 73;
               break;
            case 92:
               var10000 = 95;
               break;
            case 93:
               var10000 = 248;
               break;
            case 94:
               var10000 = 252;
               break;
            case 95:
               var10000 = 209;
               break;
            case 96:
               var10000 = 188;
               break;
            case 97:
               var10000 = 124;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 67;
               break;
            case 100:
               var10000 = 166;
               break;
            case 101:
               var10000 = 21;
               break;
            case 102:
               var10000 = 20;
               break;
            case 103:
               var10000 = 245;
               break;
            case 104:
               var10000 = 76;
               break;
            case 105:
               var10000 = 13;
               break;
            case 106:
               var10000 = 121;
               break;
            case 107:
               var10000 = 150;
               break;
            case 108:
               var10000 = 135;
               break;
            case 109:
               var10000 = 239;
               break;
            case 110:
               var10000 = 211;
               break;
            case 111:
               var10000 = 56;
               break;
            case 112:
               var10000 = 225;
               break;
            case 113:
               var10000 = 160;
               break;
            case 114:
               var10000 = 34;
               break;
            case 115:
               var10000 = 26;
               break;
            case 116:
               var10000 = 250;
               break;
            case 117:
               var10000 = 7;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 110;
               break;
            case 120:
               var10000 = 66;
               break;
            case 121:
               var10000 = 90;
               break;
            case 122:
               var10000 = 48;
               break;
            case 123:
               var10000 = 19;
               break;
            case 124:
               var10000 = 36;
               break;
            case 125:
               var10000 = 85;
               break;
            case 126:
               var10000 = 148;
               break;
            case 127:
               var10000 = 234;
               break;
            case 128:
               var10000 = 231;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 108;
               break;
            case 131:
               var10000 = 82;
               break;
            case 132:
               var10000 = 37;
               break;
            case 133:
               var10000 = 25;
               break;
            case 134:
               var10000 = 251;
               break;
            case 135:
               var10000 = 176;
               break;
            case 136:
               var10000 = 174;
               break;
            case 137:
               var10000 = 40;
               break;
            case 138:
               var10000 = 39;
               break;
            case 139:
               var10000 = 164;
               break;
            case 140:
               var10000 = 92;
               break;
            case 141:
               var10000 = 144;
               break;
            case 142:
               var10000 = 156;
               break;
            case 143:
               var10000 = 43;
               break;
            case 144:
               var10000 = 115;
               break;
            case 145:
               var10000 = 228;
               break;
            case 146:
               var10000 = 246;
               break;
            case 147:
               var10000 = 27;
               break;
            case 148:
               var10000 = 186;
               break;
            case 149:
               var10000 = 163;
               break;
            case 150:
               var10000 = 96;
               break;
            case 151:
               var10000 = 180;
               break;
            case 152:
               var10000 = 229;
               break;
            case 153:
               var10000 = 127;
               break;
            case 154:
               var10000 = 159;
               break;
            case 155:
               var10000 = 173;
               break;
            case 156:
               var10000 = 175;
               break;
            case 157:
               var10000 = 247;
               break;
            case 158:
               var10000 = 69;
               break;
            case 159:
               var10000 = 4;
               break;
            case 160:
               var10000 = 181;
               break;
            case 161:
               var10000 = 15;
               break;
            case 162:
               var10000 = 142;
               break;
            case 163:
               var10000 = 10;
               break;
            case 164:
               var10000 = 45;
               break;
            case 165:
               var10000 = 65;
               break;
            case 166:
               var10000 = 133;
               break;
            case 167:
               var10000 = 206;
               break;
            case 168:
               var10000 = 232;
               break;
            case 169:
               var10000 = 53;
               break;
            case 170:
               var10000 = 146;
               break;
            case 171:
               var10000 = 152;
               break;
            case 172:
               var10000 = 93;
               break;
            case 173:
               var10000 = 54;
               break;
            case 174:
               var10000 = 253;
               break;
            case 175:
               var10000 = 2;
               break;
            case 176:
               var10000 = 185;
               break;
            case 177:
               var10000 = 112;
               break;
            case 178:
               var10000 = 215;
               break;
            case 179:
               var10000 = 220;
               break;
            case 180:
               var10000 = 145;
               break;
            case 181:
               var10000 = 243;
               break;
            case 182:
               var10000 = 172;
               break;
            case 183:
               var10000 = 79;
               break;
            case 184:
               var10000 = 214;
               break;
            case 185:
               var10000 = 141;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 240;
               break;
            case 188:
               var10000 = 242;
               break;
            case 189:
               var10000 = 199;
               break;
            case 190:
               var10000 = 213;
               break;
            case 191:
               var10000 = 244;
               break;
            case 192:
               var10000 = 161;
               break;
            case 193:
               var10000 = 106;
               break;
            case 194:
               var10000 = 237;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 165;
               break;
            case 197:
               var10000 = 114;
               break;
            case 198:
               var10000 = 38;
               break;
            case 199:
               var10000 = 219;
               break;
            case 200:
               var10000 = 196;
               break;
            case 201:
               var10000 = 101;
               break;
            case 202:
               var10000 = 11;
               break;
            case 203:
               var10000 = 81;
               break;
            case 204:
               var10000 = 132;
               break;
            case 205:
               var10000 = 74;
               break;
            case 206:
               var10000 = 193;
               break;
            case 207:
               var10000 = 187;
               break;
            case 208:
               var10000 = 18;
               break;
            case 209:
               var10000 = 8;
               break;
            case 210:
               var10000 = 202;
               break;
            case 211:
               var10000 = 123;
               break;
            case 212:
               var10000 = 236;
               break;
            case 213:
               var10000 = 136;
               break;
            case 214:
               var10000 = 238;
               break;
            case 215:
               var10000 = 60;
               break;
            case 216:
               var10000 = 91;
               break;
            case 217:
               var10000 = 78;
               break;
            case 218:
               var10000 = 134;
               break;
            case 219:
               var10000 = 125;
               break;
            case 220:
               var10000 = 44;
               break;
            case 221:
               var10000 = 59;
               break;
            case 222:
               var10000 = 198;
               break;
            case 223:
               var10000 = 205;
               break;
            case 224:
               var10000 = 62;
               break;
            case 225:
               var10000 = 68;
               break;
            case 226:
               var10000 = 139;
               break;
            case 227:
               var10000 = 75;
               break;
            case 228:
               var10000 = 72;
               break;
            case 229:
               var10000 = 46;
               break;
            case 230:
               var10000 = 168;
               break;
            case 231:
               var10000 = 109;
               break;
            case 232:
               var10000 = 63;
               break;
            case 233:
               var10000 = 116;
               break;
            case 234:
               var10000 = 22;
               break;
            case 235:
               var10000 = 197;
               break;
            case 236:
               var10000 = 77;
               break;
            case 237:
               var10000 = 89;
               break;
            case 238:
               var10000 = 55;
               break;
            case 239:
               var10000 = 130;
               break;
            case 240:
               var10000 = 84;
               break;
            case 241:
               var10000 = 64;
               break;
            case 242:
               var10000 = 70;
               break;
            case 243:
               var10000 = 227;
               break;
            case 244:
               var10000 = 217;
               break;
            case 245:
               var10000 = 126;
               break;
            case 246:
               var10000 = 254;
               break;
            case 247:
               var10000 = 99;
               break;
            case 248:
               var10000 = 138;
               break;
            case 249:
               var10000 = 118;
               break;
            case 250:
               var10000 = 35;
               break;
            case 251:
               var10000 = 200;
               break;
            case 252:
               var10000 = 28;
               break;
            case 253:
               var10000 = 129;
               break;
            case 254:
               var10000 = 167;
               break;
            default:
               var10000 = 47;
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

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26799;
      if (k[var3] == null) {
         k[var3] = (int)(i[var3] ^ var1);
      }

      return k[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "ÿD\u0085\u0083\bYc¢\u0007Ü\u0006\u000f\u0004\u008aKØ®";
      int var12 = "ÿD\u0085\u0083\bYc¢\u0007Ü\u0006\u000f\u0004\u008aKØ®".length();
      char var9 = '\n';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 78;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 78;
               var10006 = var14;
            } else {
               var27 = 78;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 78;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 4;
                     break;
                  case 1:
                     var47 = 101;
                     break;
                  case 2:
                     var47 = 48;
                     break;
                  case 3:
                     var47 = 6;
                     break;
                  case 4:
                     var47 = 81;
                     break;
                  case 5:
                     var47 = 26;
                     break;
                  default:
                     var47 = 43;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            g = var13;
            h = new String[2];
            long var0 = 4139849137200922019L;
            long[] var6 = new long[8];
            int var3 = 0;
            String var4 = "\u0094\u000fq\nòâ\u0098\u0011ð\u0002BÈº¿\u0083K\u0012'P ³i\u0000YSRKºñ×óY\u0089:7^pR\u0095mwü¥h\u009fð¶\u0088";
            int var5 = "\u0094\u000fq\nòâ\u0098\u0011ð\u0002BÈº¿\u0083K\u0012'P ³i\u0000YSRKºñ×óY\u0089:7^pR\u0095mwü¥h\u009fð¶\u0088".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           i = var6;
                           k = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Ã5¤)ÚñÂ &\u00159D\u007f4ÉW";
                        var5 = "Ã5¤)ÚñÂ &\u00159D\u007f4ÉW".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}






