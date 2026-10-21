package com.finalshell.ui.model;

import com.finalshell.core.Dx4;
import com.finalshell.core.QT;

public final class Nr2 extends NZ {
   public Nr2(String var1, int var2) {
      super(var1, var2, null);
   }

   @Override
   public void r(QT var1, boolean var2) {
      label16: {
         String var3 = Dx4.g();
         if (var3 == null) {
            if (!var2) {
               break label16;
            }

            var1.h();
         }

         if (var3 == null) {
            return;
         }
      }

      var1.t();
   }
}





