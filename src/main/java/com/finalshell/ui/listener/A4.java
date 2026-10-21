package com.finalshell.ui.listener;

import com.finalshell.core.K4_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A4 implements ActionListener {
   public final C4 f;

   public A4(C4 var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C4 var3;
      label40: {
         boolean var2;
         var2 = K4_2.V();
         var10000 = (int)(C4.P(this.f));
         label36:
         if (!var2) {
            if (var10000 != 0) {
               var10000 = C4.C$int(this.f);
               if (var2) {
                  break label36;
               }

               if (var10000 < C4.S.size() - 1) {
                  C4.N(this.f);
                  C4.T$JRadioButton(this.f).repaint();
                  if (!var2) {
                     return;
                  }
               }
            }

            var3 = this.f;
            if (var2) {
               break label40;
            }

            var10000 = (int)(C4.P(this.f));
         }

         if (var10000 == 0) {
            var3 = this.f;
            if (var2) {
               break label40;
            }

            if (C4.C$int(this.f) > 0) {
               C4.B(this.f);
               C4.T$JRadioButton(this.f).repaint();
               if (!var2) {
                  return;
               }
            }
         }

         var3 = this.f;
      }

      C4.t(var3).Y();
   }
   private static int var10000;
}





