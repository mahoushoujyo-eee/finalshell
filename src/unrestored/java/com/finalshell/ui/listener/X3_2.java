package com.finalshell.ui.listener;

import com.finalshell.core.Rt4;
import com.finalshell.core.WC_2;
import javax.swing.JTextField;

public class X3_2 extends XA3 {
   public final JTextField B;
   public final Rt4 O;

   public X3_2(Rt4 var1, JTextField var2) {
      super(var1);
      this.O = var1;
      this.B = var2;
   }

   @Override
   public void y(Object var1) {
      String var3;
      label14: {
         int[] var2 = WC_2.V();
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





