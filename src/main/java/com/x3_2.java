package com;

import javax.swing.JTextField;

class x3_2 extends xA_3 {
   final JTextField B;
   final rt_4 O;

   x3_2(rt_4 var1, JTextField var2) {
      super(var1);
      this.O = var1;
      this.B = var2;
   }

   @Override
   public void y(Object var1) {
      String var3;
      label14: {
         int[] var2 = com.WC.V();
         var3 = (String)var1;
         if (var2 == null) {
            if (var1 == null) {
               var3 = "";
               break label14;
            }

            var3 = (String)var1;
         }

         var3 = var3.toString();
      }

      this.B.setText(var3);
   }

   @Override
   public Object G() {
      return this.B.getText();
   }
}





