package com.finalshell.ui.listener;

import com.finalshell.core.Y62_2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

public class K2 implements MouseListener {
   public final JTableHeader o;
   public final Y62_2 d;

   public K2(Y62_2 var1, JTableHeader var2) {
      this.d = var1;
      this.o = var2;
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
      Object var3 = 357005092518068968L;
      int var2 = ((JTableHeader)Ref.g(357005092518068968L, var3)).columnAtPoint(var1.getPoint());
      Object var5 = 519351686960629696L;
      var2 = ((Y62_2)Ref.g(519351686960629696L, var5)).convertColumnIndexToModel(var2);
      Object var7 = 519351686960629696L;
      ((Y62_2)Ref.g(519351686960629696L, var7)).getRowSorter().toggleSortOrder(var2);
   }
}





