package com;

import java.text.NumberFormat;

public class O9 extends com.O1 {
   private NumberFormat I;

   @Override
   public void J(Object var1) {
      boolean var2 = com.Oe_2.a();
      com.O9 var10000 = this;
      if (var2) {
         if (this.I == null) {
            this.I = NumberFormat.getInstance();
         }

         var10000 = this;
      }

      var10000.setText(var1 == null ? "" : this.I.format(var1));
   }
}





