package com.finalshell.ui.listener;

import com.finalshell.ui.model.IC3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IW3 implements ActionListener {
   public final com.finalshell.ui.panel.QX A;

   public IW3(com.finalshell.ui.panel.QX var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var3 = 9.599999F;
      String[] var10000 = com.finalshell.ui.panel.QX.Y();
      float var4 = 0.10416667F;
      String[] var2 = var10000;
      int var5 = (this.A.M.equals(IC3.fadeIn)) ? 1 : 0;
      if (var2 == null) {
         if (var5 != 0) {
            com.finalshell.ui.panel.QX var6 = this.A;
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

         var5 = (this.A.M.equals(IC3.fadeOut)) ? 1 : 0;
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
   private static Object var7;
   private static Object C;
}





