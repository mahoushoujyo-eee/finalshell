package com.finalshell.ui.listener;

import com.finalshell.core.WC_2;
import com.finalshell.ui.panel.QB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dv4 implements ActionListener {
   final QB X;

   Dv4(QB var1) {
      this.X = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var10000 = WC_2.V();
      Object var3 = this.X.c;
      synchronized (this.X.c){} // $VF: monitorenter 
      int[] var2 = var10000;

      try {
         label34: {
            QB var7 = this.X;
            if (var2 == null) {
               if (this.X.y < 1.0F) {
                  this.X.y = Math.min(this.X.y + this.X.A, 1.0F);
                  this.X.t(this.X.y);
                  if (var2 == null) {
                     break label34;
                  }
               }

               this.X.l.Y();
               this.X.l = null;
               this.X.r = false;
               var7 = this.X;
            }

            var7.T();
         }

         this.X.i();
         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }
}





