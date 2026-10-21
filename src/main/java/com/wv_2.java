package com;

import javax.swing.JLabel;

class Wv_2 extends JLabel {
   final xW_3 t;

   Wv_2(xW_3 var1) {
      this.t = var1;
   }

   @Override
   public String getText() {
      String[] var1 = com.Cn_2.Q();
      wH_3 var10000 = com.Cn_2.l(this.t.u);
      if (var1 != null) {
         if (var10000 == null) {
            return null;
         }

         var10000 = com.Cn_2.l(this.t.u);
      }

      int var2 = var10000.F(this.t);
      return var2 != -1 ? com.Cn_2.l(this.t.u).r(var2) : null;
   }
}





