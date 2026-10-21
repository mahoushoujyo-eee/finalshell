package com;

import java.awt.Component;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ks_4 extends com.ky_4 implements SwingConstants, Eh_2 {
   protected boolean v = com.BC.c;
   protected com.LX G = com.BC.Z;
   protected int T = com.BC.l;
   protected ImageIcon w = com.BC.q;
   protected ImageIcon i = com.BC.d;
   protected boolean e = com.BC.W;
   protected boolean r = com.BC.p;
   protected int F = com.BC.x;
   protected List H = new ArrayList(1);
   protected List y = new ArrayList();
   protected List C = new ArrayList();
   protected com.k3_2 j = null;

   public ks_4() {
      this.h(com.BC.Z);
   }

   public ks_4(com.LX var1) {
      this.h(var1);
   }

   protected void h(com.LX var1) {
      this.i(true);
      this.u(false);
      this.setLayout(new com.T0(this));
      this.m(var1);
   }

   public boolean w() {
      return this.v;
   }

   public void v(boolean var1) {
      this.v = var1;
      this.B();
   }

   protected void B() {
      int[] var10000 = com.k3_2.L();
      Iterator var2 = this.y.iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         com.k3_2 var3 = (com.k3_2)var2.next();
         var3.l(this.v);
         if (var1 == null) {
            break;
         }
      }
   }

   public int Z() {
      return this.T;
   }

   public void o(int var1) {
      this.T = var1;
      this.t();
   }

   public ImageIcon B$ImageIcon() {
      return this.w;
   }

   public void g(ImageIcon var1) {
      this.w = var1;
      this.c();
   }

   public ImageIcon r() {
      return this.i;
   }

   public void z(ImageIcon var1) {
      this.i = var1;
      this.c();
   }

   protected void c() {
      int[] var10000 = com.k3_2.L();
      Iterator var2 = this.y.iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         com.k3_2 var3 = (com.k3_2)var2.next();
         var3.x(this.w);
         var3.I(this.i);
         if (var1 == null) {
            break;
         }
      }
   }

   public com.LX y() {
      return this.G;
   }

   public void m(com.LX var1) {
      this.G = var1;
      this.t();
   }

   public boolean H() {
      return this.e;
   }

   public void q(boolean var1) {
      this.e = var1;
      this.revalidate();
   }

   public boolean e() {
      return this.r;
   }

   public void g(boolean var1) {
      this.r = var1;
      this.H(-1, true);
   }

   protected void H(int var1, boolean var2) {
      label105: {
         int var7;
         label108: {
            byte var4;
            int var10001;
            label109: {
               int[] var3;
               label102: {
                  label110: {
                     int[] var10000 = com.k3_2.L();
                     var4 = 0;
                     var3 = var10000;
                     var7 = var2;
                     if (var3 != null) {
                        if (var2 != 0) {
                           var7 = this.r;
                           if (var3 == null) {
                              break label102;
                           }

                           if (this.r) {
                              break label110;
                           }

                           int var5 = 0;

                           while (var5 < this.y.size()) {
                              com.k3_2 var6 = (com.k3_2)this.y.get(var5);
                              var7 = var1;
                              var10001 = -1;
                              if (var3 == null) {
                                 break label109;
                              }

                              if (var3 != null) {
                                 label91: {
                                    if (var1 == -1) {
                                       var7 = var6.Y();
                                       if (var3 == null) {
                                          break label91;
                                       }

                                       if (var7 != 0) {
                                          var1 = var5;
                                       }
                                    }

                                    var7 = var1;
                                 }

                                 var10001 = -1;
                              }

                              label113: {
                                 label114: {
                                    if (var3 != null) {
                                       if (var7 == var10001) {
                                          break label113;
                                       }

                                       var7 = var5;
                                       if (var3 == null) {
                                          break label114;
                                       }

                                       var10001 = var1;
                                    }

                                    if (var7 == var10001) {
                                       break label113;
                                    }

                                    var7 = var6.Y();
                                 }

                                 if (var3 != null && var7 != 0) {
                                    var4 = 1;
                                    var6.u(false);
                                 }
                              }

                              var5++;
                              if (var3 == null) {
                                 break;
                              }
                           }

                           if (var3 != null) {
                              break label110;
                           }
                        }

                        var7 = this.I();
                     }

                     if (var3 == null) {
                        break label102;
                     }

                     if (var7 == 0) {
                        this.j.u(true);
                     }
                  }

                  var7 = var1;
               }

               if (var3 == null) {
                  break label108;
               }

               var10001 = -1;
            }

            if (var7 != var10001) {
               break label105;
            }

            var7 = var4;
         }

         if (var7 == 0) {
            return;
         }
      }

      this.l();
   }

   public int O() {
      return this.F;
   }

   public void k(int var1) {
      this.F = var1;
      this.revalidate();
   }

   public com.k3_2 V(String var1, Component var2) {
      return this.e(this.y.size(), var1, var2);
   }

   public com.k3_2 e(int var1, String var2, Component var3) {
      return this.I(var1, new com.k3_2(var2, var3));
   }

   public com.k3_2 d(Icon var1, String var2, Component var3) {
      return this.M(this.y.size(), var1, var2, var3);
   }

   public com.k3_2 M(int var1, Icon var2, String var3, Component var4) {
      return this.I(var1, new com.k3_2(var2, var3, var4));
   }

   public com.k3_2 A(Component var1, Component var2) {
      return this.t(this.y.size(), var1, var2);
   }

   public com.k3_2 t(int var1, Component var2, Component var3) {
      com.k3_2 var4 = new com.k3_2("", var3);
      var4.u(var2);
      return this.I(var1, var4);
   }

   protected com.k3_2 I(int var1, com.k3_2 var2) {
      var2.l(this.v);
      int[] var10000 = com.k3_2.L();
      var2.x(this.w);
      var2.I(this.i);
      int[] var3 = var10000;
      if (var3 != null) {
         if (!this.r && var3 != null && this.k()) {
            var2.x(false, false);
         }

         var2.B(new com.Kr_2(this, var2));
      }

      com.dO_3 var4 = new com.dO_3(this);
      var2.m(var4);
      this.C.add(var4);
      this.f(var1, new Component[]{var2});
      this.y.add(var1, var2);
      this.t();
      this.l();
      return var2;
   }

   public void b(int var1) {
      this.m((com.k3_2)this.y.get(var1));
   }

   protected void m(com.k3_2 var1) {
      int[] var10000 = com.k3_2.L();
      int var3 = this.y.indexOf(var1);
      int[] var2 = var10000;
      if (var2 != null) {
         if (var3 == -1) {
            return;
         }

         var1.B(null);
         var1.B((Pv_2)this.C.get(var3));
         this.C.remove(var3);
         this.remove(var1);
         this.y.remove(var3);
      }

      if (var2 != null) {
         if (var1 == this.j) {
            this.j = null;
         }

         this.t();
      }
   }

   public List n() {
      return com.aL.J((Collection)this.y);
   }

   public List N() {
      return this.y;
   }

   public com.k3_2 M(int var1) {
      return (com.k3_2)this.y.get(var1);
   }

   protected void t() {
      int[] var10000 = com.k3_2.L();
      boolean var2 = this.G.equals(com.LX.united);
      int[] var1 = var10000;
      boolean var3 = this.G.equals(com.LX.separated);
      int var7 = this.T;
      if (var1 != null) {
         var7 = this.T == 0 ? 1 : 0;
      }

      int var4 = var7;
      int var10001 = var2;
      if (var1 != null) {
         var10001 = !var2;
      }

      this.T((boolean)var10001);
      int var5 = 0;

      while (true) {
         if (var5 < this.y.size()) {
            com.k3_2 var6 = (com.k3_2)this.y.get(var5);
            if (var1 == null) {
               break;
            }

            var10001 = var4;
            if (var1 != null) {
               var10001 = var4 != 0 ? 2 : 1;
            }

            label95: {
               var6.D(var10001);
               if (var1 != null) {
                  if (var3) {
                     var6.D(PF.p);
                     var6.I(var3, var3, var3, var3);
                     if (var1 != null) {
                        break label95;
                     }
                  }

                  var6.D(0);
               }

               label83: {
                  label96: {
                     var10001 = var4;
                     if (var1 != null) {
                        if (var4 != 0) {
                           break label96;
                        }

                        var10001 = var5;
                     }

                     if (var1 == null) {
                        break label83;
                     }

                     if (var10001 > 0) {
                        var10001 = 1;
                        break label83;
                     }
                  }

                  var10001 = 0;
               }

               int var10002;
               label72: {
                  label97: {
                     var10002 = var4;
                     if (var1 != null) {
                        if (var4 == 0) {
                           break label97;
                        }

                        var10002 = var5;
                     }

                     if (var1 == null) {
                        break label72;
                     }

                     if (var10002 > 0) {
                        var10002 = 1;
                        break label72;
                     }
                  }

                  var10002 = 0;
               }

               var6.I((boolean)var10001, (boolean)var10002, false, false);
            }

            var5++;
            if (var1 != null) {
               continue;
            }
         }

         this.revalidate();
         this.repaint();
         break;
      }
   }

   public boolean k() {
      int[] var10000 = com.k3_2.L();
      Iterator var2 = this.y.iterator();
      int[] var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            com.k3_2 var3 = (com.k3_2)var2.next();
            var4 = var3.Y();
            if (var1 == null) {
               break;
            }

            if (var1 == null) {
               return var4;
            }

            if (var4) {
               return true;
            }

            if (var1 != null) {
               continue;
            }
         }

         var4 = false;
         break;
      }

      return var4;
   }

   public int b() {
      int[] var10000 = com.k3_2.L();
      Iterator var2 = this.y.iterator();
      int[] var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            com.k3_2 var3 = (com.k3_2)var2.next();
            var4 = var3.Y();
            if (var1 == null) {
               break;
            }

            if (var1 == null) {
               return var4;
            }

            if (var4 != 0) {
               return this.y.indexOf(var3);
            }

            if (var1 != null) {
               continue;
            }
         }

         var4 = -1;
         break;
      }

      return var4;
   }

   public int I() {
      int[] var10000 = com.k3_2.L();
      int var2 = 0;
      int[] var1 = var10000;
      Iterator var3 = this.y.iterator();

      while (true) {
         if (var3.hasNext()) {
            com.k3_2 var4 = (com.k3_2)var3.next();
            var5 = var4.Y();
            if (var1 == null) {
               break;
            }

            if (var5 != 0) {
               var2++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public Icon L(int var1) {
      return ((com.k3_2)this.y.get(var1)).u();
   }

   public void B(int var1, Icon var2) {
      ((com.k3_2)this.y.get(var1)).C(var2);
   }

   public String d(int var1) {
      return ((com.k3_2)this.y.get(var1)).Q();
   }

   public void g(int var1, String var2) {
      ((com.k3_2)this.y.get(var1)).u(var2);
   }

   public Component a(int var1) {
      return ((com.k3_2)this.y.get(var1)).t();
   }

   public void H(int var1, Component var2) {
      ((com.k3_2)this.y.get(var1)).u(var2);
   }

   public Component b$Component(int var1) {
      return ((com.k3_2)this.y.get(var1)).F();
   }

   public void d(int var1, Component var2) {
      ((com.k3_2)this.y.get(var1)).V(var2);
   }

   public Insets E(int var1) {
      return ((com.k3_2)this.y.get(var1)).h();
   }

   public void O(int var1, Insets var2) {
      ((com.k3_2)this.y.get(var1)).j(var2);
   }

   public void c(int var1, int var2, int var3, int var4, int var5) {
      this.O(var1, new Insets(var2, var3, var4, var5));
   }

   public void b(int var1, int var2) {
      this.c(var1, var2, var2, var2, var2);
   }

   public List s() {
      int[] var10000 = com.k3_2.L();
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.y.iterator();
      int[] var1 = var10000;

      while (var3.hasNext()) {
         com.k3_2 var4 = (com.k3_2)var3.next();
         if (var1 != null && var4.Y()) {
            var2.add(var4);
         }

         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public void G(List var1) {
      int[] var10000 = com.k3_2.L();
      Iterator var3 = this.y.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         com.k3_2 var4;
         boolean var5;
         label28: {
            label36: {
               var4 = (com.k3_2)var3.next();
               List var10001 = var1;
               if (var2 != null) {
                  if (var1 == null) {
                     break label36;
                  }

                  var10001 = var1;
               }

               var5 = var10001.contains(var4);
               if (var2 == null) {
                  break label28;
               }

               if (var5) {
                  var5 = true;
                  break label28;
               }
            }

            var5 = false;
         }

         var4.u(var5);
         if (var2 == null) {
            break;
         }
      }
   }

   public List P() {
      int[] var10000 = com.k3_2.L();
      ArrayList var2 = new ArrayList();
      int[] var1 = var10000;
      int var3 = 0;

      while (var3 < this.y.size()) {
         if (var1 != null && ((com.k3_2)this.y.get(var3)).Y()) {
            var2.add(var3);
         }

         var3++;
         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public void h(List var1) {
      int[] var10000 = com.k3_2.L();
      int var3 = 0;
      int[] var2 = var10000;

      while (var3 < this.y.size()) {
         boolean var5;
         label28: {
            label36: {
               var4 = (com.k3_2)this.y.get(var3);
               List var10001 = var1;
               if (var2 != null) {
                  if (var1 == null) {
                     break label36;
                  }

                  var10001 = var1;
               }

               var5 = var10001.contains(var3);
               if (var2 == null) {
                  break label28;
               }

               if (var5) {
                  var5 = true;
                  break label28;
               }
            }

            var5 = false;
         }

         var4.u(var5);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public List x() {
      return com.aL.J((Collection)this.H);
   }

   public void w(List var1) {
      this.H = var1;
   }

   public void j(com.Bn_2 var1) {
      this.H.add(var1);
   }

   public void N(com.Bn_2 var1) {
      this.H.remove(var1);
   }

   protected void l() {
      int[] var10000 = com.k3_2.L();
      Iterator var2 = com.aL.J((Collection)this.H).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         com.Bn_2 var3 = (com.Bn_2)var2.next();
         var3.E();
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   public void p(String var1) {
      com.cl_4.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
      com.cl_4.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      com.cl_4.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      com.cl_4.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      com.cl_4.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      com.cl_4.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      com.cl_4.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      com.cl_4.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      com.cl_4.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      com.cl_4.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      com.cl_4.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      com.cl_4.a(this, var1);
   }

   @Override
   public void w$void() {
      com.cl_4.O(this);
   }

   @Override
   public void m() {
      com.cl_4.G(this);
   }

   @Override
   public void e$void() {
      com.cl_4.H(this);
   }
}





