package com.finalshell.ui.adapter;

import com.finalshell.reflect.Ref;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class F3 extends DefaultTableCellRenderer {
   JLabel p;
   public static long a;

   public F3() {
      JLabel var10001 = new JLabel();
      long var2 = 417667448505604278L;
      JLabel var1 = var10001;
      Ref.s(417667448505604278L, var1, var2);
      Object var3 = 417667448505604278L;
      ((JLabel)Ref.g(417667448505604278L, var3)).setBorder(BorderFactory.createEmptyBorder(0, (int)a, 0, 0));
      Object var5 = 417667448505604278L;
      ((JLabel)Ref.g(417667448505604278L, var5)).setOpaque(false);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Object var7 = 417667448505604278L;
      ((JLabel)Ref.g(417667448505604278L, var7)).setText(var2.toString());
      Object var9 = 417667448505604278L;
      return (JLabel)Ref.g(417667448505604278L, var9);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3611884370304039577L;
      long var10002 = 7260341071144680094L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





