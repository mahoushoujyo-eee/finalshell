package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class L2 extends HG {
   public final com.finalshell.core.D z;

   public L2(com.finalshell.core.D var1) {
      this.z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      int var10000 = (this.z.u$boolean()) ? 1 : 0;
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.z.t$boolean()) ? 1 : 0;
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (FN.B(var1)) ? 1 : 0;
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

            var10000 = (this.z.j$boolean()) ? 1 : 0;
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
      L2 var10000;
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      var10000 = this;
      label17:
      if (var2 != null) {
         if (this.B) {
            var10000 = this;
            if (var2 == null) {
               break label17;
            }

            if (this.z.j$boolean()) {
               this.k = new Point(this.k.x + this.z.X, this.k.y + this.z.X);
               this.z.J();
            }
         }

         var10000 = this;
      }

      var10000.mouseDragged(var1);
   }
}





