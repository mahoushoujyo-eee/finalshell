package com.finalshell.ui.listener;

import com.finalshell.core.Fm2;
import com.finalshell.core.UE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NT implements ActionListener {
   public final Fm2 g;

   public NT(Fm2 var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Fm2 var3;
      label40: {
         boolean var2;
         var2 = UE.o();
         var10000 = this.g.m;
         label36:
         if (var2) {
            if (this.g.m) {
               var10000 = this.g.G;
               if (!var2) {
                  break label36;
               }

               if (this.g.G < 5) {
                  this.g.G++;
                  this.g.U.repaint();
                  if (var2) {
                     return;
                  }
               }
            }

            var3 = this.g;
            if (!var2) {
               break label40;
            }

            var10000 = this.g.m;
         }

         if (var10000 == 0) {
            var3 = this.g;
            if (!var2) {
               break label40;
            }

            if (this.g.G > 0) {
               this.g.G--;
               this.g.U.repaint();
               if (var2) {
                  return;
               }
            }
         }

         var3 = this.g;
      }

      var3.g.Y();
   }
}





