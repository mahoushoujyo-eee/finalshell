package com.finalshell.ui.listener;

import com.finalshell.core.JR;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

public class U6 implements MouseListener {
   public final JTableHeader W;
   public final JR q;

   public U6(JR var1, JTableHeader var2) {
      this.q = var1;
      this.W = var2;
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
      Object var3 = 213655465850951838L;
      int var2 = ((JTableHeader)Ref.g(213655465850951838L, var3)).columnAtPoint(var1.getPoint());
      Object var5 = 223559612432591090L;
      var2 = ((JR)Ref.g(223559612432591090L, var5)).convertColumnIndexToModel(var2);
      Object var7 = 223559612432591090L;
      ((JR)Ref.g(223559612432591090L, var7)).getRowSorter().toggleSortOrder(var2);
   }
}





