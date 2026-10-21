package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.core.O32;
import com.finalshell.core.WC_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class RK3 implements ActionListener {
   public Long f;
   public final File G;
   public final O32 x;
   public final WC_2 V;

   public RK3(File var1, O32 var2, WC_2 var3) {
      this.G = var1;
      this.x = var2;
      this.V = var3;
      this.f = null;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = FV_2.D();
      RK3 var10000 = this;
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





