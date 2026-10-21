package com.finalshell.ui.adapter;

import java.text.DateFormat;

public class Or2 extends Oa2 {
   public DateFormat u;

   @Override
   public void J(Object var1) {
      boolean var2 = Oe2.a();
      Or2 var10000 = this;
      if (var2) {
         if (this.u == null) {
            this.u = DateFormat.getDateInstance();
         }

         var10000 = this;
      }

      var10000.setText(var1 == null ? "" : this.u.format(var1));
   }
}





