package com.finalshell.core;

import com.finalshell.ui.model.Oj4;
import java.util.List;

public class XK implements YW3 {
   @Override
   public void Z(String var1, String var2) {
      this.I();
   }

   @Override
   public void G(Oj4 var1) {
      this.i(var1);
   }

   @Override
   public void t(Oj4 var1) {
      this.i(var1);
   }

   @Override
   public void U() {
      this.I();
   }

   public void I() {
      boolean var1 = I22.K$boolean();
      if (var1) {
         if (I22.c.size() > 0) {
            I22.R$void();
         }

         I22.G();
      }
   }

   public void i(Oj4 var1) {
      boolean var10000 = I22.K$boolean();
      List var3 = E4.j(var1);
      boolean var2 = var10000;
      if (var2) {
         if (I22.c.size() > 0) {
            for (String var5 : var3) {
               I22.A(var5);
               if (!var2) {
                  return;
               }

               if (!var2) {
                  break;
               }
            }
         }

         I22.t(var3);
      }
   }
}





