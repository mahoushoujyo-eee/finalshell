import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class K2 implements MouseListener {
   final JTableHeader o;
   final y6_2 d;

   K2(y6_2 var1, JTableHeader var2) {
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
      int var2 = ((JTableHeader)com.c.c(357005092518068968L).get(this)).columnAtPoint(var1.getPoint());
      var2 = ((y6_2)com.c.c(519351686960629696L).get(this)).convertColumnIndexToModel(var2);
      ((y6_2)com.c.c(519351686960629696L).get(this)).getRowSorter().toggleSortOrder(var2);
   }
}





