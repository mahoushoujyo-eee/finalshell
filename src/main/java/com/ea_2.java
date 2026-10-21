package com;

import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;

public class Ea_2 extends EY {
   private II F = null;

   public Ea_2(II var1) {
      this.F = var1;
   }

   @Override
   public boolean d(List var1) {
      String var10000 = com.Wb_2.m();
      boolean var3 = false;
      String var2 = var10000;
      if (this.F != null) {
         for (File var5 : var1) {
            boolean var6 = Xg_2.P(var5.getName());
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





