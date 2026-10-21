package com.finalshell.core;

import com.finalshell.ui.panel.II;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;

public class Ea2 extends EY {
   public II F = null;

   public Ea2(II var1) {
      this.F = var1;
   }

   @Override
   public boolean d(List var1) {
      String var10000 = com.finalshell.ui.panel.Wb2.m$String();
      boolean var3 = false;
      String var2 = var10000;
      if (this.F != null) {
         for (File var5 : var1) {
            boolean var6 = Xg2.P(var5.getName());
            if (var2 == null) {
               return var6;
            }

            label26: {
               if (var2 != null) {
                  if (!var6) {
                     break label26;
                  }

                  this.F.V(new ImageIcon(var5.getAbsolutePath()));
                  var6 = true;
               }

               var3 = var6;
            }

            if (var2 == null) {
               break;
            }
         }
      }

      return var3;
   }
}





