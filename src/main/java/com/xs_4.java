package com;

import java.io.File;
import javax.swing.text.JTextComponent;

public class xs_4 extends xA_3 {
   final rY_3 U;

   protected xs_4(rY_3 var1) {
      super(var1);
      this.U = var1;
   }

   public void E(com.cY_3 var1) {
      File var2 = var1.D();
      ((ne_4)rY_3.x(this.U)).v(new com.Wb_2(com.Cz_2.B(var2)));
      com.Cz_2.D((JTextComponent)rY_3.P(this.U), var2);
      super.y(var1);
   }

   @Override
   public boolean p() {
      File var2 = ((com.cY_3)this.j).D();
      String[] var10000 = com.cB_3.C();
      String var3 = ((ne_4)rY_3.T(this.U)).getText();
      String[] var1 = var10000;
      boolean var5 = var3.equals(var2.getName());
      if (var1 != null) {
         if (!var5) {
            File var4 = new File(var2.getParent(), var3);
            boolean var6 = var2.renameTo(var4);
            if (var1 != null) {
               if (var6) {
                  ((com.cY_3)this.j).h(var4);
               }

               var6 = super.p();
            }

            return var6;
         }

         super.a();
         var5 = true;
      }

      return var5;
   }

   @Override
   public void y(Object var1) {
      this.E((com.cY_3)var1);
   }
}





