package com.finalshell.ui.listener;

import com.finalshell.core.K4_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class Y8 implements ActionListener {
   final JComponent S;
   final C4 y;

   Y8(C4 var1, JComponent var2) {
      this.y = var1;
      this.S = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C4 var3;
      label40: {
         boolean var2;
         var2 = K4_2.Z$boolean();
         var10000 = C4.i(this.y);
         label36:
         if (var2) {
            if (var10000 != 0) {
               var10000 = C4.D(this.y);
               if (!var2) {
                  break label36;
               }

               if (var10000 < 5) {
                  C4.w(this.y);
                  this.S.repaint();
                  if (var2) {
                     return;
                  }
               }
            }

            var3 = this.y;
            if (!var2) {
               break label40;
            }

            var10000 = C4.i(this.y);
         }

         if (var10000 == 0) {
            var3 = this.y;
            if (!var2) {
               break label40;
            }

            if (C4.D(this.y) > 0) {
               C4.E(this.y);
               this.S.repaint();
               if (var2) {
                  return;
               }
            }
         }

         var3 = this.y;
      }

      C4.T$WC(var3).Y();
   }
}





