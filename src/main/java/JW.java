import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.TableCellEditor;

class JW implements MouseListener {
   final F6 O;

   JW(F6 var1) {
      this.O = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         nx_2 var2 = new nx_2(
            (Km_2)com.c.c(150762093507542450L).get(com.c.c(389694495067679276L).get(this)),
            (kl_4)com.c.c(246488842365380158L).get(com.c.c(389694495067679276L).get(this)),
            (a3)com.c.c(627973027287447539L).get(com.c.c(389694495067679276L).get(this))
         );
         var2.show((Component)var1.getSource(), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var10000 = F6.g();
      ((Km_2)com.c.c(150762093507542450L).get(com.c.c(389694495067679276L).get(this))).requestFocus();
      ((Km_2)com.c.c(150762093507542450L).get(com.c.c(389694495067679276L).get(this))).clearSelection();
      boolean var2 = var10000;
      TableCellEditor var3 = ((Km_2)com.c.c(150762093507542450L).get(com.c.c(389694495067679276L).get(this))).getCellEditor();
      if (!var2) {
         if (var3 == null) {
            return;
         }

         var3 = ((Km_2)com.c.c(150762093507542450L).get(com.c.c(389694495067679276L).get(this))).getCellEditor();
      }

      var3.stopCellEditing();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





