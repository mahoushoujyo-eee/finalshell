package com.A;

import com.HG;
import java.awt.Point;
import java.awt.event.MouseEvent;

class l extends HG {
   final com.A.d z;

   l(com.A.d var1) {
      this.z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int[] var2 = com.A.y_2.M();
      int var10000 = this.z.u();
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.z.t();
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getClickCount();
      }

      label51: {
         if (var2 != null) {
            if (var10000 != 2) {
               return;
            }

            var3 = this.z;
            if (var2 == null) {
               break label51;
            }

            var10000 = this.z.j();
         }

         if (var10000 != 0) {
            this.z.J();
            if (var2 != null) {
               return;
            }
         }

         var3 = this.z;
      }

      var3.p();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      l var10000;
      int[] var2 = com.A.y_2.M();
      var10000 = this;
      label17:
      if (var2 != null) {
         if (this.B) {
            var10000 = this;
            if (var2 == null) {
               break label17;
            }

            if (this.z.j()) {
               this.k = new Point(this.k.x + this.z.X, this.k.y + this.z.X);
               this.z.J();
            }
         }

         var10000 = this;
      }

      var10000.mouseDragged(var1);
   }
}





