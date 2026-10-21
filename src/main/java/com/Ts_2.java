package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.SwingConstants;

public class Ts_2 extends com.T4 implements SwingConstants {
   protected boolean F = true;
   protected boolean a = true;
   protected int d = 0;
   protected int W = 0;
   protected int J;
   protected int v;
   protected boolean o;
   protected int M;
   protected int S;
   protected ArrayList I;
   private static final long b;

   public Ts_2() {
      this(false);
   }

   public Ts_2(boolean var1) {
      this(var1, 0, 0);
   }

   public Ts_2(int var1, int var2) {
      this(false, var1, var2);
   }

   public Ts_2(boolean var1, int var2, int var3) {
      this.J = (int)b;
      this.v = 1;
      this.o = false;
      this.M = 0;
      this.S = 0;
      this.a = var1;
      this.d = var2;
      this.W = var3;
   }

   public boolean a() {
      return this.F;
   }

   public void o(boolean var1) {
      this.F = var1;
   }

   public boolean i() {
      return this.a;
   }

   public void Q(boolean var1) {
      this.a = var1;
   }

   public int I() {
      return this.d;
   }

   public void F(int var1) {
      this.d = var1;
   }

   public int E() {
      return this.W;
   }

   public void Q(int var1) {
      this.W = var1;
   }

   public int F() {
      return this.J;
   }

   public void V(int var1) {
      this.J = var1;
   }

   public int q() {
      return this.v;
   }

   public void p(int var1) {
      this.v = var1;
   }

   public boolean m() {
      return this.o;
   }

   public void q(boolean var1) {
      this.o = var1;
   }

   public int S() {
      return this.M;
   }

   public int v() {
      return this.S;
   }

   public ArrayList Z() {
      return this.I;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      this.layoutContainer(var1);
      return new Dimension(this.M, this.S);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      this.layoutContainer(var1);
      return new Dimension(0, this.S);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var2 = com.T4.O();
      Container var10000 = var1;
      if (var2 == 0) {
         if (var1.getComponentCount() == 0) {
            this.M = 0;
            this.S = 0;
            this.I = new ArrayList(0);
            return;
         }

         var10000 = var1;
      }

      Insets var3 = var10000.getInsets();
      int var4 = var1.getWidth() - var3.left - var3.right;
      int var5 = 0;
      int var6 = 0;
      this.M = 0;
      this.S = 0;
      int var7 = 0;
      int var8 = 0;
      this.I = new ArrayList();
      int var9 = 0;

      while (true) {
         if (var9 < var1.getComponentCount()) {
            Component var10 = var1.getComponent(var9);
            Dimension var11 = var10.getPreferredSize();
            var22 = var6;
            if (var2 != 0) {
               break;
            }

            label128:
            if (var2 == 0) {
               label136:
               if (var6 > 0) {
                  com.Ts_2 var23 = this;
                  if (var2 == 0) {
                     if (!this.m()) {
                        var22 = var7 + this.d + var11.width;
                        if (var2 != 0) {
                           break label128;
                        }

                        if (var22 <= var4) {
                           break label136;
                        }
                     }

                     ((nR_3)this.I.get(var5)).A(var7);
                     ((nR_3)this.I.get(var5)).V(var8);
                     this.M = Math.max(this.M, var7);
                     var23 = this;
                  }

                  int var10002 = var5;
                  if (var2 == 0) {
                     var10002 = var5 > 0 ? this.W : 0;
                  }

                  var23.S += var10002 + var8;
                  var6 = 0;
                  var7 = 0;
                  var8 = 0;
                  var5++;
               }

               var22 = this.F;
            }

            if (var2 == 0) {
               var22 = var22 != 0 ? Math.min(var11.width, var4) : var11.width;
            }

            int var12 = var22;
            int var10001 = var6;
            if (var2 == 0) {
               var10001 = var6 > 0 ? this.d : 0;
            }

            var7 += var10001 + var12;
            var8 = Math.max(var8, var11.height);
            var6++;
            if (var2 == 0) {
               if (var5 >= this.I.size()) {
                  this.I.add(new nR_3());
               }

               ((nR_3)this.I.get(var5)).Z(var10);
               var9++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         ((nR_3)this.I.get(var5)).A(var7);
         ((nR_3)this.I.get(var5)).V(var8);
         int var28 = var5;
         if (var2 == 0) {
            var28 = var5 > 0 ? this.W : 0;
         }

         this.S += var28 + var8;
         this.S = this.S + var3.top + var3.bottom;
         var22 = this.e(var1, var3);
         break;
      }

      int var19 = var22;

      for (nR_3 var21 : this.I) {
         var9 = this.r(var1, var3, var21);
         int var13 = 0;
         Iterator var14 = var21.X().iterator();

         while (true) {
            if (var14.hasNext()) {
               Component var15 = (Component)var14.next();
               Dimension var16 = var15.getPreferredSize();
               var24 = this.F;
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  var24 = this.F ? Math.min(var16.width, var4) : var16.width;
               }

               int var17 = var24;
               int var25 = this.a;
               if (var2 == 0) {
                  int var27;
                  label106: {
                     if (this.a) {
                        var26 = var13 + 1;
                        var27 = var21.X().size();
                        if (var2 != 0) {
                           break label106;
                        }

                        if (var26 == var27) {
                           var26 = this.J;
                           var27 = 2;
                           if (var2 != 0) {
                              break label106;
                           }

                           if (this.J == 2) {
                              var17 = var3.left + var4 - var9;
                           }
                        }
                     }

                     var15.setBounds(var9, var19, var17, var21.Z());
                     var26 = var9;
                     var27 = var17 + this.d;
                  }

                  var25 = var26 + var27;
               }

               var9 = var25;
               var13++;
               if (var2 == 0) {
                  continue;
               }
            }

            var24 = var19 + var21.Z() + this.W;
            break;
         }

         var19 = var24;
         if (var2 != 0) {
            break;
         }
      }
   }

   protected int r(Container var1, Insets var2, nR_3 var3) {
      int var4;
      int var6;
      int var10001;
      label34: {
         label33: {
            var4 = com.T4.b();
            var6 = this.a;
            if (var4 != 0) {
               if (!this.a) {
                  var6 = this.J;
                  var10001 = 2;
                  if (var4 == 0) {
                     break label34;
                  }

                  if (this.J != 2) {
                     break label33;
                  }
               }

               var6 = var2.left;
            }

            int var5 = var6;
            if (var4 != 0) {
               return var5;
            }
         }

         var6 = this.J;
         var10001 = 4;
      }

      if (var4 != 0) {
         if (var6 == var10001) {
            int var7 = var1.getWidth() - var2.right - var3.g();
            if (var4 != 0) {
               return var7;
            }
         }

         var6 = var1.getWidth() / 2;
         var10001 = var3.g() / 2;
      }

      return var6 - var10001;
   }

   protected int e(Container var1, Insets var2) {
      int var3 = com.T4.b();
      int var10000 = this.v;
      int var10001 = 1;
      if (var3 != 0) {
         if (this.v == 1) {
            int var4 = var2.top;
            if (var3 != 0) {
               return var4;
            }
         }

         var10000 = this.v;
         var10001 = 3;
      }

      if (var3 != 0) {
         if (var10000 == var10001) {
            int var5 = var1.getHeight() - var2.bottom - this.S;
            if (var3 != 0) {
               return var5;
            }
         }

         var10000 = var2.top + var1.getHeight() / 2;
         var10001 = this.S / 2;
      }

      return var10000 - var10001;
   }

   static {
      long var0 = 7103382440556308555L;
      long var10002 = -4979340691808507831L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





