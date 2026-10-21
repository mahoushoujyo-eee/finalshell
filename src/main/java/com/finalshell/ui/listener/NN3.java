package com.finalshell.ui.listener;

import com.finalshell.core.Rq2;
import com.finalshell.core.Rv4;
import com.finalshell.core.Yc2_2;
import com.finalshell.ui.panel.CI;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NN3 extends MouseAdapter {
   final Yc2_2 t;

   NN3(Yc2_2 var1) {
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

   public void F(MouseEvent var1) {
      String[] var10000 = CI.c();
      int var3 = Yc2_2.q(this.t).locationToIndex(var1.getPoint());
      String[] var2 = var10000;
      Rectangle var4 = Yc2_2.V(this.t).getCellBounds(var3, var3);
      NN3 var5 = this;
      if (var2 == null) {
         label28:
         if (Yc2_2.k(this.t).isEnabled()) {
            Rectangle var6 = var4;
            if (var2 == null) {
               if (var4 == null) {
                  break label28;
               }

               var6 = var4;
            }

            label43: {
               int var7 = (var6.contains(var1.getPoint())) ? 1 : 0;
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

   public void k() {
      String[] var1 = CI.c();
      NN3 var10000 = this;
      if (var1 == null) {
         if (this.t.h == -1) {
            return;
         }

         var10000 = this;
      }

      var10000.r(this.t.h, -1);
   }

   public void r(int var1, int var2) {
      String[] var3;
      Yc2_2 var8;
      String[] var10000 = CI.c();
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
               Rectangle var4 = Yc2_2.C(this.t).getCellBounds(var1, var1);
               var8 = this.t;
               if (var3 != null) {
                  break label32;
               }

               Rectangle var5 = Yc2_2.Q(this.t).getCellBounds(var2, var2);
               Rectangle var6 = Rv4.B(var4, var5);
               if (var6 != null) {
                  Yc2_2.T(this.t).repaint(var6);
               }
            }
         }

         var8 = this.t;
      }

      Rq2 var7 = var8.A();
      Rq2 var9 = var7;
      if (var3 == null) {
         if (var7 == null) {
            return;
         }

         var9 = var7;
      }

      var9.M(Yc2_2.l(this.t), var1, 0, var2, 0);
   }
}





