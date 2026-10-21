import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

class lX_3 extends MouseAdapter {
   final JPopupMenu e;
   final CV A;

   lX_3(CV var1, JPopupMenu var2) {
      this.A = var1;
      this.e = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var10000 = Uo_2.k();
      super.mousePressed(var1);
      boolean var2 = (boolean)var10000;
      var10000 = var1.getButton();
      if (var2) {
         if (var10000 != 3) {
            return;
         }

         var10000 = ((JTable)com.c.c(166263389195533693L).get(com.c.c(413667648482217310L).get(this))).rowAtPoint(var1.getPoint());
      }

      int var3 = var10000;
      int var4 = ((JTable)com.c.c(166263389195533693L).get(com.c.c(413667648482217310L).get(this))).convertRowIndexToModel(var3);
      ((JTable)com.c.c(166263389195533693L).get(com.c.c(413667648482217310L).get(this))).getSelectionModel().setSelectionInterval(var4, var4);
      ((JPopupMenu)com.c.c(253282387591500605L).get(this))
         .show((JTable)com.c.c(166263389195533693L).get(com.c.c(413667648482217310L).get(this)), var1.getX(), var1.getY());
   }
}





