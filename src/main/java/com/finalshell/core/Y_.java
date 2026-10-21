package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class Y_ extends Lz2_2 implements WR_2 {
   public boolean N = false;
   public boolean E = false;
   public boolean J;
   public boolean f;
   public boolean r;
   public boolean o;
   public boolean P;
   public boolean s;
   public boolean R;
   public boolean g;
   public boolean K;
   public int a;
   public PF3 h;
   public PF3 W;
   public PF3 v;
   public PF3 S;
   public PF3 n;
   public PF3 C;
   public PF3 Y;
   public P62 x;
   public boolean i;

   public Y_() {
      int var10000 = Yp2.f();
      this.J = true;
      int var1 = var10000;
      this.f = true;
      this.r = true;
      this.o = true;
      this.P = true;
      this.s = true;
      this.R = true;
      this.g = true;
      this.K = false;
      this.a = 0;
      this.h = null;
      this.W = null;
      this.v = null;
      this.S = null;
      this.n = null;
      this.C = null;
      this.Y = null;
      this.i = false;
      if (var1 != 0) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void A(JComponent var1) {
      super.A(var1);
      this.x = new CR3(this);
      ON.b(var1, this.x);
   }

   @Override
   public void X(JComponent var1) {
      ON.i(this.x);
      this.x = null;
      super.X(var1);
   }

   public boolean o() {
      return this.N;
   }

   public void O(boolean var1) {
      int var2 = Yp2.T();
      Y_ var10000 = this;
      if (var2 != 0) {
         if (this.N == var1) {
            return;
         }

         this.N = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean C$boolean() {
      return this.E;
   }

   public void V(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.E == var1) {
            return;
         }

         this.E = var1;
         var10000 = this;
      }

      var10000.l();
   }

   public boolean K$boolean() {
      return this.J;
   }

   @Override
   public void D(boolean var1) {
      int var2 = Yp2.T();
      Y_ var10000 = this;
      if (var2 != 0) {
         if (this.J == var1) {
            return;
         }

         this.J = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean n() {
      return this.f;
   }

   @Override
   public void C(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.f == var1) {
            return;
         }

         this.f = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean F$boolean() {
      return this.r;
   }

   @Override
   public void p(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.r == var1) {
            return;
         }

         this.r = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean t() {
      return this.o;
   }

   @Override
   public void w(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.o == var1) {
            return;
         }

         this.o = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   @Override
   public void I(boolean var1, boolean var2, boolean var3, boolean var4) {
      Y_ var10000;
      int var5 = Yp2.T();
      var10000 = this;
      label28:
      if (var5 != 0) {
         if (this.J == var1) {
            var10000 = this;
            if (var5 == 0) {
               break label28;
            }

            if (this.f == var2) {
               var10000 = this;
               if (var5 == 0) {
                  break label28;
               }

               if (this.r == var3) {
                  var10000 = this;
                  if (var5 == 0) {
                     break label28;
                  }

                  if (this.o == var4) {
                     return;
                  }
               }
            }
         }

         this.J = var1;
         this.f = var2;
         this.r = var3;
         this.o = var4;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean B() {
      return this.P;
   }

   @Override
   public void X(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.P == var1) {
            return;
         }

         this.P = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean j() {
      return this.s;
   }

   @Override
   public void H(boolean var1) {
      int var2 = Yp2.T();
      Y_ var10000 = this;
      if (var2 != 0) {
         if (this.s == var1) {
            return;
         }

         this.s = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean q() {
      return this.R;
   }

   @Override
   public void B(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.R == var1) {
            return;
         }

         this.R = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean X() {
      return this.g;
   }

   @Override
   public void m(boolean var1) {
      int var2 = Yp2.f();
      Y_ var10000 = this;
      if (var2 == 0) {
         if (this.g == var1) {
            return;
         }

         this.g = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   @Override
   public void X(boolean var1, boolean var2, boolean var3, boolean var4) {
      Y_ var10000;
      int var5 = Yp2.T();
      var10000 = this;
      label28:
      if (var5 != 0) {
         if (this.P == var1) {
            var10000 = this;
            if (var5 == 0) {
               break label28;
            }

            if (this.s == var2) {
               var10000 = this;
               if (var5 == 0) {
                  break label28;
               }

               if (this.R == var3) {
                  var10000 = this;
                  if (var5 == 0) {
                     break label28;
                  }

                  if (this.g == var4) {
                     return;
                  }
               }
            }
         }

         this.P = var1;
         this.s = var2;
         this.R = var3;
         this.g = var4;
         var10000 = this;
      }

      var10000.Z();
   }

   public boolean l() {
      return this.K;
   }

   public void E(boolean var1) {
      int var2 = Yp2.T();
      Y_ var10000 = this;
      if (var2 != 0) {
         if (this.K == var1) {
            return;
         }

         this.K = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public int k() {
      return this.a;
   }

   public void v(int var1) {
      int var2 = Yp2.T();
      Y_ var10000 = this;
      if (var2 != 0) {
         if (this.a == var1) {
            return;
         }

         this.a = var1;
         var10000 = this;
      }

      var10000.Z();
   }

   public PF3 F$pF_3() {
      return this.h;
   }

   public void T(PF3 var1) {
      Y_ var4;
      label30: {
         int var10000 = Yp2.T();
         this.h = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 != 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 == 0) {
               break label30;
            }

            var3 = this.E;
         }

         if (var3) {
            var4 = this;
            if (var2 == 0) {
               break label30;
            }

            if (this.i) {
               return;
            }
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 V() {
      return this.W;
   }

   public void G(PF3 var1) {
      int var10000 = Yp2.T();
      this.W = var1;
      int var2 = var10000;
      boolean var3 = this.N;
      if (var2 != 0) {
         if (this.N) {
            return;
         }

         var3 = this.E;
      }

      label33: {
         if (var2 != 0) {
            if (!var3) {
               return;
            }

            var4 = this;
            if (var2 == 0) {
               break label33;
            }

            var3 = this.i;
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 i() {
      return this.v;
   }

   public void s(PF3 var1) {
      Y_ var4;
      label24: {
         int var10000 = Yp2.f();
         this.v = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 == 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 != 0) {
               break label24;
            }

            var3 = this.U();
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 G() {
      return this.S;
   }

   public void P(PF3 var1) {
      Y_ var4;
      label24: {
         int var10000 = Yp2.f();
         this.S = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 == 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 != 0) {
               break label24;
            }

            var3 = this.J$boolean();
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 c() {
      return this.n;
   }

   public void D(PF3 var1) {
      Y_ var4;
      label24: {
         int var10000 = Yp2.f();
         this.n = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 == 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 != 0) {
               break label24;
            }

            var3 = this.s();
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 C$pF_3() {
      return this.C;
   }

   public void n(PF3 var1) {
      Y_ var4;
      label24: {
         int var10000 = Yp2.T();
         this.C = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 != 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 == 0) {
               break label24;
            }

            var3 = this.u();
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   public PF3 x() {
      return this.Y;
   }

   public void O(PF3 var1) {
      Y_ var4;
      label24: {
         int var10000 = Yp2.T();
         this.Y = var1;
         int var2 = var10000;
         boolean var3 = this.N;
         if (var2 != 0) {
            if (this.N) {
               return;
            }

            var4 = this;
            if (var2 == 0) {
               break label24;
            }

            var3 = this.E();
         }

         if (!var3) {
            return;
         }

         var4 = this;
      }

      var4.Z();
   }

   @Override
   public Insets B(JComponent var1) {
      int var10000 = Yp2.f();
      PF3 var3 = this.J$pF_3();
      int var2 = var10000;
      Y_ var9 = this;
      if (var2 == 0) {
         label122:
         if (!this.N) {
            PF3 var10 = var3;
            if (var2 == 0) {
               if (var3 == null) {
                  break label122;
               }

               var10 = var3;
            }

            Insets var4 = var10.U$Insets();
            boolean var11 = this.J;
            if (var2 == 0) {
               if (!this.J) {
                  int var13;
                  label108: {
                     label107: {
                        PF3 var5 = this.K$pF_3();
                        if (this.P) {
      int var10001;
                           var10001 = var5;
                           if (var2 != 0) {
                              break label107;
                           }

                           if (var5 != null) {
                              var10001 = var5;
                              break label107;
                           }
                        }

                        var13 = 0;
                        break label108;
                     }

                     var13 = var10001.R().height;
                  }

                  var4.top = var13 + this.a;
               }

               var11 = this.f;
            }

            if (var2 == 0) {
               if (!var11) {
                  int var15;
                  label93: {
                     label92: {
                        PF3 var6 = this.L();
                        if (this.s) {
      PF3 var14;
                           var14 = var6;
                           if (var2 != 0) {
                              break label92;
                           }

                           if (var6 != null) {
                              var14 = var6;
                              break label92;
                           }
                        }

                        var15 = 0;
                        break label93;
                     }

                     var15 = var14.R().width;
                  }

                  var4.left = var15 + this.a;
               }

               var11 = this.r;
            }

            label132: {
               if (var2 == 0) {
                  if (!var11) {
                     int var17;
                     label76: {
                        label75: {
                           PF3 var7 = this.M();
                           if (this.R) {
      PF3 var16;
                              var16 = var7;
                              if (var2 != 0) {
                                 break label75;
                              }

                              if (var7 != null) {
                                 var16 = var7;
                                 break label75;
                              }
                           }

                           var17 = 0;
                           break label76;
                        }

                        var17 = var16.R().height;
                     }

                     var4.bottom = var17 + this.a;
                  }

                  var12 = this;
                  if (var2 != 0) {
                     break label132;
                  }

                  var11 = this.o;
               }

               if (var11) {
                  return var4;
               }

               var12 = this;
            }

            int var19;
            label59: {
               label58: {
                  PF3 var8 = var12.h();
                  if (this.g) {
      PF3 var18;
                     var18 = var8;
                     if (var2 != 0) {
                        break label58;
                     }

                     if (var8 != null) {
                        var18 = var8;
                        break label58;
                     }
                  }

                  var19 = 0;
                  break label59;
               }

               var19 = var18.R().width;
            }

            var4.right = var19 + this.a;
            return var4;
         }

         var9 = this;
      }

      return var9.B(var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int var4 = Yp2.f();
      Y_ var10000 = this;
      if (var4 == 0) {
         if (this.N) {
            return;
         }

         var10000 = this;
      }

      label87: {
         PF3 var5 = var10000.J$pF_3();
         PF3 var14 = var5;
         if (var4 == 0) {
            if (var5 == null) {
               break label87;
            }

            var14 = var5;
         }

         var14.n(var1, this.R(var5, var2, var3));
      }

      boolean var15 = this.J$boolean();
      if (var4 == 0) {
         label79: {
            if (var15) {
               var10000 = this;
               if (var4 != 0) {
                  break label79;
               }

               PF3 var6 = this.K$pF_3();
               if (var6 != null) {
                  Dimension var7 = var6.R();
                  var6.l(var1, var2.x, var2.y, var2.width, var7.height);
               }
            }

            var10000 = this;
         }

         var15 = var10000.s();
      }

      if (var4 == 0) {
         label69: {
            if (var15) {
               var10000 = this;
               if (var4 != 0) {
                  break label69;
               }

               PF3 var8 = this.L();
               if (var8 != null) {
                  Dimension var11 = var8.R();
                  var8.l(var1, var2.x, var2.y, var11.width, var2.height);
               }
            }

            var10000 = this;
         }

         var15 = var10000.u();
      }

      label98: {
         if (var4 == 0) {
            label58: {
               if (var15) {
                  var10000 = this;
                  if (var4 != 0) {
                     break label58;
                  }

                  PF3 var9 = this.M();
                  if (var9 != null) {
                     Dimension var12 = var9.R();
                     var9.l(var1, var2.x, var2.y + var2.height - var12.height, var2.width, var12.height);
                  }
               }

               var10000 = this;
            }

            if (var4 != 0) {
               break label98;
            }

            var15 = var10000.E();
         }

         if (!var15) {
            return;
         }

         var10000 = this;
      }

      PF3 var10 = var10000.h();
      PF3 var19 = var10;
      if (var4 == 0) {
         if (var10 == null) {
            return;
         }

         var19 = var10;
      }

      Dimension var13 = var19.R();
      var10.l(var1, var2.x + var2.width - var13.width, var2.y, var13.width, var2.height);
   }

   public PF3 J$pF_3() {
      int var1 = Yp2.f();
      Y_ var10000 = this;
      if (var1 == 0) {
         if (this.i) {
            if (var1 != 0) {
               return this.h;
            }

            if (this.W != null) {
               return this.W;
            }
         }

         var10000 = this;
      }

      return var10000.h;
   }

   public PF3 K$pF_3() {
      int var1 = Yp2.T();
      Y_ var10000 = this;
      if (var1 != 0) {
         if (this.S != null) {
            return this.S;
         }

         var10000 = this;
      }

      return var10000.v;
   }

   public PF3 L() {
      int var1 = Yp2.T();
      Y_ var10000 = this;
      if (var1 != 0) {
         if (this.n != null) {
            return this.n;
         }

         var10000 = this;
      }

      return var10000.v;
   }

   public PF3 M() {
      int var1 = Yp2.f();
      Y_ var10000 = this;
      if (var1 == 0) {
         if (this.C != null) {
            return this.C;
         }

         var10000 = this;
      }

      return var10000.v;
   }

   public PF3 h() {
      int var1 = Yp2.f();
      Y_ var10000 = this;
      if (var1 == 0) {
         if (this.Y != null) {
            return this.Y;
         }

         var10000 = this;
      }

      return var10000.v;
   }

   public boolean U() {
      int var1 = Yp2.f();
      boolean var10000 = this.J$boolean();
      if (var1 == 0) {
         if (!var10000) {
            var10000 = this.s();
            if (var1 != 0) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.u();
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = this.E();
                  if (var1 != 0) {
                     return var10000;
                  }

                  if (!var10000) {
                     return false;
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean J$boolean() {
      int var1 = Yp2.f();
      boolean var10000 = this.J;
      if (var1 == 0) {
         if (this.J) {
            return false;
         }

         var10000 = this.P;
      }

      return var1 != 0 ? var10000 : var10000;
   }

   public boolean s() {
      int var1 = Yp2.f();
      boolean var10000 = this.f;
      if (var1 == 0) {
         if (this.f) {
            return false;
         }

         var10000 = this.s;
      }

      return var1 != 0 ? var10000 : var10000;
   }

   public boolean u() {
      int var1 = Yp2.f();
      boolean var10000 = this.r;
      if (var1 == 0) {
         if (this.r) {
            return false;
         }

         var10000 = this.R;
      }

      return var1 != 0 ? var10000 : var10000;
   }

   public boolean E() {
      int var1 = Yp2.f();
      boolean var10000 = this.o;
      if (var1 == 0) {
         if (this.o) {
            return false;
         }

         var10000 = this.g;
      }

      return var1 != 0 ? var10000 : var10000;
   }

   public Rectangle R(PF3 var1, Rectangle var2, JComponent var3) {
      int var4 = Yp2.f();
      if (!this.N && var1 != null) {
         Insets var5 = this.K ? var1.U$Insets() : var1.x();
         int var10000 = this.J;
         if (var4 == 0) {
            var10000 = this.J ? 0 : var5.top;
         }

         int var6 = ((((var10000) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         var10000 = this.f;
         if (var4 == 0) {
            var10000 = this.f ? 0 : var5.left;
         }

         int var7 = ((((var10000) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         var10000 = this.r;
         if (var4 == 0) {
            var10000 = this.r ? 0 : var5.bottom;
         }

         int var8 = ((((var10000) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         var10000 = this.o;
         if (var4 == 0) {
            var10000 = this.o ? 0 : var5.right;
         }

         int var9 = var10000;
         return new Rectangle(var2.x - var7, var2.y - var6, var2.width + var7 + var9, var2.height + var6 + var8);
      } else {
         return var2;
      }
   }
}





