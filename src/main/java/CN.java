import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

class CN extends MouseAdapter {
   final CV I;

   CN(CV var1) {
      this.I = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = Uo_2.i();
      CN var10000 = this;
      if (!var2) {
         super.mousePressed(var1);
         if (var1.getButton() != 1) {
            return;
         }

         var10000 = this;
      }

      ((JTable)com.c.c(166263389195533693L).get(com.c.c(174330978349075902L).get(var10000))).clearSelection();
   }
}





