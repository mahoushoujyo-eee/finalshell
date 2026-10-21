package com.finalshell.ui.listener;

import com.finalshell.core.XL;
import com.finalshell.ui.model.Du2;
import com.finalshell.ui.panel.XW;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SM implements ActionListener {
   final XW r;
   final XL g;

   SM(XL var1, XW var2) {
      this.g = var1;
      this.r = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var10000 = Du2.W();
      int var3 = 0;
      boolean var2 = var10000;

      while (var3 < XL.I(this.g)) {
         label21: {
            XL var6 = this.g;
            if (!var2) {
               if (XL.X(this.g).size() > 0) {
                  int var4 = com.finalshell.core.Gw2.K(XL.X(this.g).size());
                  Point var5 = (Point)XL.X(this.g).remove(var4);
                  int[] var7 = XL.Q(this.g)[var5.x];
                  var7[var5.y] = var7[var5.y] + XL.K(this.g);
                  this.r.repaint();
                  if (!var2) {
                     break label21;
                  }
               }

               var6 = this.g;
            }

            XL.h(var6).Y();
         }

         var3++;
         if (var2) {
            break;
         }
      }
   }
}





