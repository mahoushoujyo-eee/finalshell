import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class gY implements MouseListener {
   final JTableHeader h;
   final Uo_2 O;

   gY(Uo_2 var1, JTableHeader var2) {
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
      int var2 = ((JTableHeader)com.c.c(143473320133899645L).get(this)).columnAtPoint(var1.getPoint());
      var2 = ((Uo_2)com.c.c(221825175318552888L).get(this)).convertColumnIndexToModel(var2);
      ((Uo_2)com.c.c(221825175318552888L).get(this)).getRowSorter().toggleSortOrder(var2);
   }
}





