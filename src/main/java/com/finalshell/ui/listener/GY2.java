package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

public class GY2 implements MouseListener {
   final JTableHeader h;
   final Uo2 O;

   GY2(Uo2 var1, JTableHeader var2) {
      this.O = var1;
      this.h = var2;
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
      Object var3 = 143473320133899645L;
      int var2 = ((JTableHeader)Ref.g(143473320133899645L, var3)).columnAtPoint(var1.getPoint());
      Object var5 = 221825175318552888L;
      var2 = ((Uo2)Ref.g(221825175318552888L, var5)).convertColumnIndexToModel(var2);
      Object var7 = 221825175318552888L;
      ((Uo2)Ref.g(221825175318552888L, var7)).getRowSorter().toggleSortOrder(var2);
   }
}





