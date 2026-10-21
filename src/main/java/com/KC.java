package com;

import java.awt.Component;
import java.util.List;
import javax.swing.JComponent;

public class KC implements en_4 {
   @Override
   public void Q(Component var1, G9 var2) {
      boolean var10000 = i2_2.K();
      boolean var4 = var1 instanceof JComponent;
      boolean var3 = var10000;
      if (var4) {
         JComponent var5 = (JComponent)var1;
         var5.setToolTipText(null);
         G9 var8 = var2;
         if (var3) {
            if (var2 == null) {
               return;
            }

            var8 = var2;
         }

         List var9 = var8.e();
         if (var3) {
            if (var9 == null) {
               return;
            }

            var9 = var2.e();
         }

         if (var3) {
            if (var9.size() <= 0) {
               return;
            }

            var9 = var2.e();
         }

         for (com.Wp_2 var7 : var9) {
            label32: {
               var10000 = var7.w().equals(GX.swing);
               if (var3) {
                  if (!var10000) {
                     break label32;
                  }

                  var10000 = var4;
               }

               if (var10000) {
                  var5.setToolTipText(var7.A());
               }
            }

            if (!var3) {
               break;
            }
         }
      }
   }
}





