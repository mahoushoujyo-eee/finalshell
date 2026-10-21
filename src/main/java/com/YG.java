package com;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class YG extends com.C.y_2 {
   protected pF_3 y = null;
   protected pF_3 T = null;
   protected pF_3 E = null;
   protected pF_3 f;
   protected pF_3 w;
   protected pF_3 s;
   protected pF_3 S;
   protected pF_3 A;
   protected pF_3 X;
   protected pF_3 r;
   protected pF_3 g;
   protected pF_3 I;
   protected pF_3 M;
   protected pF_3 u;
   protected p6_2 N;
   protected boolean P;

   public YG() {
      int var10000 = com.Yp_2.f();
      this.f = null;
      int var1 = var10000;
      this.w = null;
      this.s = null;
      this.S = null;
      this.A = null;
      this.X = null;
      this.r = null;
      this.g = null;
      this.I = null;
      this.M = null;
      this.u = null;
      this.P = false;
      if (com.ky_4.F() != null) {
         com.Yp_2.u(++var1);
      }
   }

   @Override
   public void T(JScrollBar var1) {
      super.T(var1);
      this.Y = false;
      this.N = new com.cw_4(this);
      com.ON.b(var1, this.N);
   }

   @Override
   public void C(JScrollBar var1) {
      com.ON.i(this.N);
      this.N = null;
      super.C(var1);
   }

   public pF_3 M() {
      return this.y;
   }

   public void B(pF_3 var1) {
      this.y = var1;
   }

   public pF_3 q() {
      return this.T;
   }

   public void D(pF_3 var1) {
      this.T = var1;
   }

   public pF_3 f() {
      return this.E;
   }

   public void P(pF_3 var1) {
      this.E = var1;
   }

   public pF_3 g() {
      return this.f;
   }

   public void X(pF_3 var1) {
      this.f = var1;
   }

   public pF_3 J() {
      return this.w;
   }

   public void t(pF_3 var1) {
      this.w = var1;
   }

   public pF_3 y() {
      return this.s;
   }

   public void C(pF_3 var1) {
      this.s = var1;
   }

   public pF_3 Q() {
      return this.S;
   }

   public void N(pF_3 var1) {
      this.S = var1;
   }

   public pF_3 i() {
      return this.A;
   }

   public void J(pF_3 var1) {
      this.A = var1;
   }

   public pF_3 R() {
      return this.X;
   }

   public void U(pF_3 var1) {
      this.X = var1;
   }

   public pF_3 d() {
      return this.r;
   }

   public void Z(pF_3 var1) {
      this.r = var1;
   }

   public pF_3 C() {
      return this.g;
   }

   public void I(pF_3 var1) {
      this.g = var1;
   }

   public pF_3 a() {
      return this.I;
   }

   public void L(pF_3 var1) {
      this.I = var1;
   }

   public pF_3 H() {
      return this.M;
   }

   public void k(pF_3 var1) {
      this.M = var1;
   }

   public pF_3 I() {
      return this.u;
   }

   public void h(pF_3 var1) {
      this.u = var1;
   }

   @Override
   protected void O(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      int var4 = com.Yp_2.T();
      com.YG var10000 = this;
      if (var4 != 0) {
         if (!this.q) {
            return;
         }

         var10000 = this;
      }

      pF_3 var5 = var10000.H(var2);
      pF_3 var6 = var5;
      if (var4 != 0) {
         if (var5 == null) {
            return;
         }

         var6 = var5;
      }

      var6.n(var1, var3);
   }

   protected pF_3 H(JScrollBar var1) {
      int var2 = com.Yp_2.f();
      int var10000 = var1.getOrientation();
      if (var2 == 0) {
         if (var10000 == 0) {
            com.YG var5 = this;
            if (var2 == 0) {
               if (this.P) {
                  if (var2 != 0) {
                     return this.y;
                  }

                  if (this.T != null) {
                     return this.T;
                  }
               }

               var5 = this;
            }

            return var5.y;
         }

         if (var2 != 0) {
            return this.A;
         }

         var10000 = this.P;
      }

      if (var10000 != 0) {
         if (var2 != 0) {
            return this.A;
         }

         if (this.X != null) {
            return this.X;
         }
      }

      return this.A;
   }

   @Override
   protected void Z(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      int var4 = com.Yp_2.T();
      com.YG var10000 = this;
      if (var4 != 0) {
         if (!this.q) {
            return;
         }

         var10000 = this;
      }

      pF_3 var5 = var10000.x(var2);
      pF_3 var6 = var5;
      if (var4 != 0) {
         if (var5 == null) {
            return;
         }

         var6 = var5;
      }

      var6.n(var1, var3);
   }

   protected pF_3 x(JScrollBar var1) {
      int var2 = com.Yp_2.T();
      int var10000 = var1.getOrientation();
      if (var2 != 0) {
         if (var10000 == 0) {
            com.YG var5 = this;
            if (var2 != 0) {
               if (this.P) {
                  if (var2 == 0) {
                     return this.E;
                  }

                  if (this.f != null) {
                     return this.f;
                  }
               }

               var5 = this;
            }

            return var5.E;
         }

         if (var2 == 0) {
            return this.r;
         }

         var10000 = this.P;
      }

      if (var10000 != 0) {
         if (var2 == 0) {
            return this.r;
         }

         if (this.g != null) {
            return this.g;
         }
      }

      return this.r;
   }

   @Override
   protected void E(Graphics2D var1, JScrollBar var2, Rectangle var3) {
      pF_3 var4 = this.Q(var2);
      if (var4 != null) {
         Insets var5 = this.v(var2);
         var4.l(var1, var3.x + var5.left, var3.y + var5.top, var3.width - var5.left - var5.right, var3.height - var5.top - var5.bottom);
      }
   }

   protected pF_3 Q(JScrollBar var1) {
      int var2;
      int var4;
      label106: {
         label100: {
            label107: {
               label108: {
                  var2 = com.Yp_2.f();
                  var4 = var1.getOrientation();
                  if (var2 == 0) {
                     if (var4 == 0) {
                        label111: {
                           label66: {
                              label112: {
                                 var6 = this;
                                 if (var2 == 0) {
                                    if (!this.p) {
                                       var7 = this.L;
                                       if (var2 != 0) {
                                          break label111;
                                       }

                                       if (!this.L) {
                                          break label112;
                                       }
                                    }

                                    var6 = this;
                                 }

                                 if (var2 != 0) {
                                    break label66;
                                 }

                                 if (var6.S != null) {
                                    return this.S;
                                 }
                              }

                              var6 = this;
                           }

                           if (var2 != 0) {
                              return var6.w;
                           }

                           var7 = var6.P;
                        }

                        if (var7) {
                           if (var2 != 0) {
                              return this.w;
                           }

                           if (this.T != null) {
                              return this.s;
                           }
                        }

                        return this.w;
                     }

                     var3 = this;
                     if (var2 != 0) {
                        break label108;
                     }

                     var4 = this.p;
                  }

                  if (var4 == 0) {
                     var4 = this.L;
                     if (var2 != 0) {
                        break label106;
                     }

                     if (!this.L) {
                        break label107;
                     }
                  }

                  var3 = this;
               }

               if (var2 != 0) {
                  break label100;
               }

               if (var3.u != null) {
                  return this.u;
               }
            }

            var3 = this;
         }

         if (var2 != 0) {
            return var3.I;
         }

         var4 = var3.P;
      }

      if (var4) {
         if (var2 != 0) {
            return this.I;
         }

         if (this.X != null) {
            return this.M;
         }
      }

      return this.I;
   }

   @Override
   public void X(JComponent var1) {
      this.C((JScrollBar)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.T((JScrollBar)var1);
   }
}





