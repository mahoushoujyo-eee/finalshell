package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

public class CF3 implements MouseListener {
   final JTableHeader q;
   final com.finalshell.core.Km2 g;

   CF3(com.finalshell.core.Km2 var1, JTableHeader var2) {
      this.g = var1;
      this.q = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Object var3 = 172586457176593954L;
      int var2 = ((JTableHeader)Ref.g(172586457176593954L, var3)).columnAtPoint(var1.getPoint());
      Object var5 = 326943774223488780L;
      var2 = ((com.finalshell.core.Km2)Ref.g(326943774223488780L, var5)).convertColumnIndexToModel(var2);
      Object var7 = 326943774223488780L;
      ((com.finalshell.core.Km2)Ref.g(326943774223488780L, var7)).getRowSorter().toggleSortOrder(var2);
   }
}





