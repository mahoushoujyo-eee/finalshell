package com;

import java.io.File;
import javax.swing.text.JTextComponent;

public class xO_3 extends xA_3 {
   final rZ_3 h;

   protected xO_3(rZ_3 var1) {
      super(var1);
      this.h = var1;
   }

   public void s(File var1) {
      ((ne_4)rZ_3.c(this.h)).v(new com.Wb_2(com.Cz_2.B(var1)));
      com.Cz_2.D((JTextComponent)rZ_3.n(this.h), var1);
      super.y(var1);
   }

   @Override
   public boolean p() {
      String var10000 = com.kz_4.M();
      String var2 = ((ne_4)rZ_3.k(this.h)).getText();
      String var1 = var10000;
      boolean var4 = var2.equals(((File)this.j).getName());
      if (var1 != null) {
         if (!var4) {
            File var3 = new File(((File)this.j).getParent(), var2);
            boolean var5 = ((File)this.j).renameTo(var3);
            if (var1 != null) {
               if (var5) {
                  this.j = var3;
               }

               var5 = super.p();
            }

            return var5;
         }

         super.a();
         var4 = true;
      }

      return var4;
   }

   @Override
   public void y(Object var1) {
      this.s((File)var1);
   }
}





