package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K02;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class N52 implements ActionListener {
   public final K02 n;

   public N52(K02 var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Kz4.M();
      this.n.X -= 0.1F;
      String var2 = var10000;
      K02 var3 = this.n;
      if (var2 != null) {
         if (this.n.X > 0.0F) {
            this.n.repaint();
            if (var2 != null) {
               return;
            }
         }

         this.n.g();
         var3 = this.n;
      }

      var3.v.Y();
   }
}





