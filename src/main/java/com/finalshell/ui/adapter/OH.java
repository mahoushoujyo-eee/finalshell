package com.finalshell.ui.adapter;

import javax.swing.Icon;

public class OH extends Oa2 {
   public OH() {
      this.setHorizontalAlignment(0);
   }

   @Override
   public void J(Object var1) {
      Icon var3;
      label14: {
         boolean var2 = Oe2.a();
         var3 = (Icon)var1;
         if (var2) {
            if (!(var1 instanceof Icon)) {
               var3 = null;
               break label14;
            }

            var3 = (Icon)var1;
         }

         var3 = var3;
      }

      this.setIcon(var3);
   }
}





