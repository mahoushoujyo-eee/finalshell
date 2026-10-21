import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class VF implements MouseListener {
   final JTableHeader x;
   final UT l;

   VF(UT var1, JTableHeader var2) {
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
      int var2 = ((JTableHeader)com.c.c(313909129214188963L).get(this)).columnAtPoint(var1.getPoint());
      var2 = ((UT)com.c.c(446650158343393491L).get(this)).convertColumnIndexToModel(var2);
      ((UT)com.c.c(446650158343393491L).get(this)).getRowSorter().toggleSortOrder(var2);
   }
}





