package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K02;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CU implements ActionListener {
   public final Fg2 Z;

   public CU(Fg2 var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Kz4.M();
      this.Z.f.X += 0.1F;
      String var2 = var10000;
      K02 var3 = this.Z.f;
      if (var2 != null) {
         if (this.Z.f.X < 1.0F) {
            this.Z.f.repaint();
            if (var2 != null) {
               return;
            }
         }

         this.Z.f.X = 1.0F;
         this.Z.f.repaint();
         var3 = this.Z.f;
      }

      var3.v.Y();
   }
}





