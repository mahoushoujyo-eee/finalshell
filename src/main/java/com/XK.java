package com;

import java.util.List;

class XK implements com.yW_3 {
   @Override
   public void Z(String var1, String var2) {
      this.I();
   }

   @Override
   public void G(com.oj_4 var1) {
      this.i(var1);
   }

   @Override
   public void t(com.oj_4 var1) {
      this.i(var1);
   }

   @Override
   public void U() {
      this.I();
   }

   private void I() {
      boolean var1 = i2_2.K();
      if (var1) {
         if (i2_2.c.size() > 0) {
            i2_2.R();
         }

         i2_2.G();
      }
   }

   private void i(com.oj_4 var1) {
      boolean var10000 = i2_2.K();
      List var3 = E4.j(var1);
      boolean var2 = var10000;
      if (var2) {
         if (i2_2.c.size() > 0) {
            for (String var5 : var3) {
               i2_2.A(var5);
               if (!var2) {
                  return;
               }

               if (!var2) {
                  break;
               }
            }
         }

         i2_2.t(var3);
      }
   }
}





