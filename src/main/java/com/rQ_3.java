package com;

import com.m.V;
import java.awt.Component;
import javax.swing.JTree;

public class rQ_3 extends V {
   protected com.cQ_3 v;

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      String[] var10000 = GQ.W();
      this.v = (com.cQ_3)var2;
      ne_4 var8 = (ne_4)super.getTreeCellEditorComponent(var1, var2, var3, var4, var5, var6);
      var8.setText(this.v.w());
      String[] var7 = var10000;
      if (var7 == null) {
         com.ky_4.K(new String[5]);
      }

      return var8;
   }

   @Override
   public Object getCellEditorValue() {
      this.v.v(this.m.G().toString());
      return this.v;
   }
}





