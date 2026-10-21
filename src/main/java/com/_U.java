package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _U implements ActionListener {
   final com.QB o;

   _U(com.QB var1) {
      this.o = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var10000 = com.WC.V();
      Object var3 = this.o.c;
      synchronized (this.o.c){} // $VF: monitorenter 
      int[] var2 = var10000;

      try {
         label34: {
            com.QB var7 = this.o;
            if (var2 == null) {
               if (this.o.y > 0.0F) {
                  this.o.y = Math.max(this.o.y - this.o.A, 0.0F);
                  this.o.t(this.o.y);
                  if (var2 == null) {
                     break label34;
                  }
               }

               this.o.D();
               this.o.S.Y();
               this.o.S = null;
               var7 = this.o;
            }

            var7.U = false;
         }

         this.o.f();
         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }
}





