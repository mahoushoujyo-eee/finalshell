package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class rK_3 implements ActionListener {
   private Long f;
   final File G;
   final com.o3_2 x;
   final com.WC V;

   rK_3(File var1, com.o3_2 var2, com.WC var3) {
      this.G = var1;
      this.x = var2;
      this.V = var3;
      this.f = null;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.FV.D();
      rK_3 var10000 = this;
      if (var2 == null) {
         if (this.G.exists()) {
            label22: {
               long var3 = this.G.lastModified();
               var10000 = this;
               if (var2 == null) {
                  if (this.f == var3) {
                     break label22;
                  }

                  this.x.o(this.G);
                  var10000 = this;
               }

               var10000.f = var3;
            }

            if (var2 == null) {
               return;
            }
         }

         this.x.p(this.G);
         var10000 = this;
      }

      var10000.V.Y();
   }
}





