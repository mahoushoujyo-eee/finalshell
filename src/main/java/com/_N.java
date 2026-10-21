package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _N implements ActionListener {
   final com.kf_4 G;

   _N(com.kf_4 var1) {
      this.G = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.kf_4 var6;
      label49: {
         label54: {
            boolean var2;
            label47: {
               com.Tk_2 var3;
               label55: {
                  boolean var10000 = com.Tk_2.B();
                  var3 = this.G.N();
                  var2 = var10000;
                  var3.C(var3.w() + (com.kf_4.I(this.G) ? 0.1F : -0.1F));
                  boolean var4 = com.kf_4.I(this.G);
                  if (!var2) {
                     if (var4) {
                        var5 = var3;
                        if (var2) {
                           break label47;
                        }

                        if (var3.w() >= 1.0F) {
                           break label55;
                        }
                     }

                     var6 = this.G;
                     if (var2) {
                        break label49;
                     }

                     var4 = com.kf_4.I(this.G);
                  }

                  if (var4) {
                     break label54;
                  }

                  var5 = var3;
                  if (var2) {
                     break label47;
                  }

                  if (!(var3.w() <= 0.0F)) {
                     break label54;
                  }
               }

               var5 = var3;
            }

            var5.C(com.kf_4.I(this.G) ? 1.0F : 0.0F);
            this.G.revalidate();
            com.kf_4.R(this.G, false);
            com.kf_4.f(this.G).Y();
            if (!var2) {
               return;
            }
         }

         var6 = this.G;
      }

      var6.revalidate();
   }
}





