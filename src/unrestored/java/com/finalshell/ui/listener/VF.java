package com.finalshell.ui.listener;

import com.finalshell.core.UT;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

public class VF implements MouseListener {
   public final JTableHeader x;
   public final UT l;

   public VF(UT var1, JTableHeader var2) {
      this.l = var1;
      this.x = var2;
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
      Object var3 = 313909129214188963L;
      int var2 = ((JTableHeader)Ref.g(313909129214188963L, var3)).columnAtPoint(var1.getPoint());
      Object var5 = 446650158343393491L;
      var2 = ((UT)Ref.g(446650158343393491L, var5)).convertColumnIndexToModel(var2);
      Object var7 = 446650158343393491L;
      ((UT)Ref.g(446650158343393491L, var7)).getRowSorter().toggleSortOrder(var2);
   }
}





