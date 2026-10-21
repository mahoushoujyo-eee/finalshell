import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class y4_2 implements MouseListener {
   final nA L;

   y4_2(nA var1) {
      this.L = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = Y_.j();
      int var3 = ((nA)com.c.c(151107122339903167L).get(this)).rowAtPoint(var1.getPoint());
      String[] var2 = var10000;
      int var4 = var1.getButton();
      byte var10001 = 3;
      if (var2 != null) {
         label28: {
            if (var4 == 3) {
               var4 = ((nA)com.c.c(151107122339903167L).get(this)).isRowSelected(var3);
               if (var2 == null) {
                  break label28;
               }

               if (var4 == 0) {
                  ((nA)com.c.c(151107122339903167L).get(this)).getSelectionModel().setSelectionInterval(var3, var3);
               }
            }

            var4 = var1.getButton();
         }

         var10001 = 1;
      }

      if (var2 != null) {
         if (var4 != var10001) {
            return;
         }

         var4 = var1.getClickCount();
         var10001 = 2;
      }

      if (var4 == var10001) {
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
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





