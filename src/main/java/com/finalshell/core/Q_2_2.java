package com.finalshell.core;

import java.io.File;
import java.util.List;

public class Q_2_2 extends EY {
   public com.finalshell.ui.model.D2 p;
   public final com.finalshell.ui.panel.T k;

   public Q_2_2(com.finalshell.ui.panel.T var1, com.finalshell.ui.model.D2 var2) {
      this.k = var1;
      this.p = var2;
   }

   @Override
   public boolean d(List var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      int var10000 = var1.size();
      if (var2 == null) {
         if (var10000 > 0) {
            File var3 = (File)var1.get(0);
            if (var2 == null) {
               if (var1.size() == 1 && Cz2.z(var3)) {
                  this.k.M(var3, this.p);
                  if (var2 == null) {
                     return true;
                  }
               }

               this.k.M(var3.getParentFile(), this.p);
            }

            this.k.S(var1);
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }
}





