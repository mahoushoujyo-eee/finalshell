package com.finalshell.ui.panel;

import java.awt.Dimension;
import java.awt.Insets;

public class KI3 extends Ky4 {
   public final K32 Q;

   public KI3(K32 var1) {
      this.Q = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var2;
      K32 var8;
      label52: {
         label53: {
            int[] var1;
            label54: {
               label55: {
                  int[] var10000 = K32.L$arrint();
                  var2 = super.getPreferredSize();
                  var1 = var10000;
                  var8 = this.Q;
                  if (var1 != null) {
                     if (this.Q.r != 1) {
                        var8 = this.Q;
                        if (var1 == null) {
                           break label53;
                        }

                        if (this.Q.r != 3) {
                           break label54;
                        }
                     }

                     var8 = this.Q;
                     if (var1 == null) {
                        break label55;
                     }

                     var8 = this.Q.Y;
                  }

                  if (var8 != null) {
                     Insets var3 = this.getInsets();
                     var2.width = var3.left + this.Q.Y.getPreferredSize().width + var3.right;
                  }

                  var8 = this.Q;
               }

               if (!(var8.k < 1.0F)) {
                  return var2;
               }

               var2.height = Math.round((float)var2.height * this.Q.k);
               if (var1 != null) {
                  return var2;
               }
            }

            var8 = this.Q;
            if (var1 == null) {
               break label52;
            }

            var8 = this.Q.Y;
         }

         if (var8 != null) {
            Insets var4 = this.getInsets();
            var2.height = var4.top + this.Q.Y.getPreferredSize().height + var4.bottom;
         }

         var8 = this.Q;
      }

      if (var8.k < 1.0F) {
         var2.width = Math.round((float)var2.width * this.Q.k);
      }

      return var2;
   }
}





