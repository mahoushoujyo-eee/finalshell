package com;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class u1 extends MouseAdapter {
   final Xs_2 t;

   u1(Xs_2 var1) {
      this.t = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.q(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.q(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.Q();
   }

   private void q(MouseEvent var1) {
      label34: {
         boolean var2;
         Point var4;
         u1 var6;
         label37: {
            label38: {
               boolean var10000 = PQ.G();
               Point var3 = var1.getPoint();
               var2 = var10000;
               var4 = new Point(Xs_2.M(this.t).columnAtPoint(var3), Xs_2.F(this.t).rowAtPoint(var3));
               var5 = var4.x;
               byte var10001 = -1;
               if (var2) {
                  if (var4.x == -1) {
                     break label34;
                  }

                  var5 = var4.y;
                  if (!var2) {
                     break label38;
                  }

                  var10001 = -1;
               }

               if (var5 == var10001) {
                  break label34;
               }

               var6 = this;
               if (!var2) {
                  break label37;
               }

               var5 = com.ax_2.Z(this.t.V, new Object[]{var4});
            }

            if (var5 != 0) {
               return;
            }

            var6 = this;
         }

         var6.R(this.t.V, var4);
         if (var2) {
            return;
         }
      }

      this.Q();
   }

   private void Q() {
      boolean var1 = PQ.G();
      u1 var10000 = this;
      if (var1) {
         if (this.t.V == null) {
            return;
         }

         var10000 = this;
      }

      var10000.R(this.t.V, null);
   }

   private void R(Point var1, Point var2) {
      int var10000 = PQ.G();
      this.t.V = var2;
      boolean var3 = (boolean)var10000;
      Rq_2 var4 = this.t.Q();
      if (var4 != null) {
         label49: {
            Point var9 = var1;
            if (var3) {
               if (var1 == null) {
                  var10000 = -1;
                  break label49;
               }

               var9 = var1;
            }

            var10000 = var9.y;
         }

         int var5;
         label43: {
            var5 = var10000;
            Point var11 = var1;
            if (var3) {
               if (var1 == null) {
                  var10000 = -1;
                  break label43;
               }

               var11 = var1;
            }

            var10000 = var11.x;
         }

         int var6;
         label37: {
            var6 = var10000;
            Point var13 = var2;
            if (var3) {
               if (var2 == null) {
                  var10000 = -1;
                  break label37;
               }

               var13 = var2;
            }

            var10000 = var13.y;
         }

         int var7;
         label31: {
            var7 = var10000;
            Point var15 = var2;
            if (var3) {
               if (var2 == null) {
                  var10000 = -1;
                  break label31;
               }

               var15 = var2;
            }

            var10000 = var15.x;
         }

         int var8 = var10000;
         var4.M(Xs_2.w(this.t), var5, var6, var7, var8);
      }
   }
}





