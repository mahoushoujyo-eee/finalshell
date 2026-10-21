import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class uy_4 implements MouseListener {
   final tq_4 k;

   uy_4(tq_4 var1) {
      this.k = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.c.c(410066848429556838L).setInt(com.c.c(148840961226333717L).get(this), -1);
      ((tq_4)com.c.c(148840961226333717L).get(this)).repaint();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var3;
      tq_4 var5;
      label24: {
         String[] var10000 = FK.i();
         var3 = ((tq_4)com.c.c(148840961226333717L).get(this)).rowAtPoint(var1.getPoint());
         String[] var2 = var10000;
         int var4 = var1.getButton();
         if (var2 == null) {
            if (var4 != 3) {
               return;
            }

            var5 = (tq_4)com.c.c(148840961226333717L).get(this);
            if (var2 != null) {
               break label24;
            }

            var4 = var5.isRowSelected(var3);
         }

         if (var4 != 0) {
            return;
         }

         var5 = (tq_4)com.c.c(148840961226333717L).get(this);
      }

      var5.getSelectionModel().setSelectionInterval(var3, var3);
   }
}





