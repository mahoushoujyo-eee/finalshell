package com;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class nN_3 extends MouseAdapter {
   final com.Yc_2 t;

   nN_3(com.Yc_2 var1) {
      this.t = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.F(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.F(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.k();
   }

   private void F(MouseEvent var1) {
      String[] var10000 = com.CI.c();
      int var3 = com.Yc_2.q(this.t).locationToIndex(var1.getPoint());
      String[] var2 = var10000;
      Rectangle var4 = com.Yc_2.V(this.t).getCellBounds(var3, var3);
      nN_3 var5 = this;
      if (var2 == null) {
         label28:
         if (com.Yc_2.k(this.t).isEnabled()) {
            Rectangle var6 = var4;
            if (var2 == null) {
               if (var4 == null) {
                  break label28;
               }

               var6 = var4;
            }

            label43: {
               int var7 = var6.contains(var1.getPoint());
               if (var2 == null) {
                  if (var7 == 0) {
                     break label28;
                  }

                  var8 = this;
                  if (var2 != null) {
                     break label43;
                  }

                  var7 = this.t.h;
               }

               if (var7 == var3) {
                  return;
               }

               var8 = this;
            }

            var8.r(this.t.h, var3);
            if (var2 == null) {
               return;
            }
         }

         var5 = this;
      }

      var5.k();
   }

   private void k() {
      String[] var1 = com.CI.c();
      nN_3 var10000 = this;
      if (var1 == null) {
         if (this.t.h == -1) {
            return;
         }

         var10000 = this;
      }

      var10000.r(this.t.h, -1);
   }

   private void r(int var1, int var2) {
      String[] var3;
      com.Yc_2 var8;
      String[] var10000 = com.CI.c();
      this.t.h = var2;
      var3 = var10000;
      var8 = this.t;
      label32:
      if (var3 == null) {
         if (this.t.O) {
            var8 = this.t;
            if (var3 != null) {
               break label32;
            }

            if (this.t.H) {
               Rectangle var4 = com.Yc_2.C(this.t).getCellBounds(var1, var1);
               var8 = this.t;
               if (var3 != null) {
                  break label32;
               }

               Rectangle var5 = com.Yc_2.Q(this.t).getCellBounds(var2, var2);
               Rectangle var6 = rv_4.B(var4, var5);
               if (var6 != null) {
                  com.Yc_2.T(this.t).repaint(var6);
               }
            }
         }

         var8 = this.t;
      }

      Rq_2 var7 = var8.A();
      Rq_2 var9 = var7;
      if (var3 == null) {
         if (var7 == null) {
            return;
         }

         var9 = var7;
      }

      var9.M(com.Yc_2.l(this.t), var1, 0, var2, 0);
   }
}





