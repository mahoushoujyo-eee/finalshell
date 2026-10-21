package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iW_3 implements ActionListener {
   final com.QX A;

   iW_3(com.QX var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var3 = 9.599999F;
      String[] var10000 = com.QX.Y();
      float var4 = 0.10416667F;
      String[] var2 = var10000;
      int var5 = this.A.M.equals(iC_3.fadeIn);
      if (var2 == null) {
         if (var5 != 0) {
            com.QX var6 = this.A;
            if (var2 == null) {
               if (this.A.F < 1.0F) {
                  this.A.F = Math.min(this.A.F + 0.10416667F, 1.0F);
                  this.A.repaint();
                  if (var2 == null) {
                     return;
                  }
               }

               var6 = this.A;
            }

            var6.C.Y();
            if (var2 == null) {
               return;
            }
         }

         var5 = this.A.M.equals(iC_3.fadeOut);
      }

      label46: {
         if (var2 == null) {
            if (var5 == 0) {
               return;
            }

            var7 = this.A;
            if (var2 != null) {
               break label46;
            }

            float var8;
            var5 = (var8 = this.A.F - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
         }

         if (var5 > 0) {
            this.A.F = Math.max(this.A.F - 0.10416667F, 0.0F);
            this.A.repaint();
            if (var2 == null) {
               return;
            }
         }

         this.A.Z();
         var7 = this.A;
      }

      var7.C.Y();
   }
}





