import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class cF_3 implements MouseListener {
   final JTableHeader q;
   final Km_2 g;

   cF_3(Km_2 var1, JTableHeader var2) {
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
      int var2 = ((JTableHeader)com.c.c(172586457176593954L).get(this)).columnAtPoint(var1.getPoint());
      var2 = ((Km_2)com.c.c(326943774223488780L).get(this)).convertColumnIndexToModel(var2);
      ((Km_2)com.c.c(326943774223488780L).get(this)).getRowSorter().toggleSortOrder(var2);
   }
}





