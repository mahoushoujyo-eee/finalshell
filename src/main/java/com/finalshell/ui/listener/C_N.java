package com.finalshell.ui.listener;

import com.finalshell.core.Tk2;
import com.finalshell.ui.panel.Kf4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_N implements ActionListener {
   public final Kf4 G;

   public C_N(Kf4 var1) {
      this.G = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Kf4 var6;
      label49: {
         label54: {
            boolean var2;
            label47: {
               Tk2 var3;
               label55: {
                  boolean var10000 = Tk2.B();
                  var3 = this.G.N();
                  var2 = var10000;
                  var3.C(var3.w() + (Kf4.I(this.G) ? 0.1F : -0.1F));
                  boolean var4 = Kf4.I(this.G);
                  if (!var2) {
                     if (var4) {
      Tk2 var5;
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

                     var4 = Kf4.I(this.G);
                  }

                  if (var4) {
      Tk2 var5;
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

            var5.C(Kf4.I(this.G) ? 1.0F : 0.0F);
            this.G.revalidate();
            Kf4.R(this.G, false);
            Kf4.f(this.G).Y();
            if (!var2) {
               return;
            }
         }

         var6 = this.G;
      }

      var6.revalidate();
   }
}






