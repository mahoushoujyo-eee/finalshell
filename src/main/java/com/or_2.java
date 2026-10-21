package com;

import java.text.DateFormat;

public class Or_2 extends com.Oa_2 {
   private DateFormat u;

   @Override
   public void J(Object var1) {
      boolean var2 = com.Oe_2.a();
      com.Or_2 var10000 = this;
      if (var2) {
         if (this.u == null) {
            this.u = DateFormat.getDateInstance();
         }

         var10000 = this;
      }

      var10000.setText(var1 == null ? "" : this.u.format(var1));
   }
}





