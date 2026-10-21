import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class U6 implements MouseListener {
   final JTableHeader W;
   final JR q;

   U6(JR var1, JTableHeader var2) {
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
      int var2 = ((JTableHeader)com.c.c(213655465850951838L).get(this)).columnAtPoint(var1.getPoint());
      var2 = ((JR)com.c.c(223559612432591090L).get(this)).convertColumnIndexToModel(var2);
      ((JR)com.c.c(223559612432591090L).get(this)).getRowSorter().toggleSortOrder(var2);
   }
}





