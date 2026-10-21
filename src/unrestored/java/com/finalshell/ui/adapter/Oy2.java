package com.finalshell.ui.adapter;

import com.finalshell.core.Sm2;
import com.finalshell.core.WK_2;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;

public class Oy2 extends O7 {
   public Border c;
   public final WK_2 O;

   public Oy2(WK_2 var1) {
      this.O = var1;
      this.c = Sm2.H();
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      JLabel var7 = (JLabel)super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
      var7.setBorder(this.c);
      var7.setHorizontalAlignment(2);
      return var7;
   }
}





