package com;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;

class Oy_2 extends com.O7 {
   Border c;
   final com.WK O;

   Oy_2(com.WK var1) {
      this.O = var1;
      this.c = Sm_2.H();
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      JLabel var7 = (JLabel)super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
      var7.setBorder(this.c);
      var7.setHorizontalAlignment(2);
      return var7;
   }
}





