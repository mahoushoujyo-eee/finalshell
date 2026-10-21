import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class KZ extends MouseAdapter {
   final zK Z;

   KZ(zK var1) {
      this.Z = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = zK.B();
      KZ var10000 = this;
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }

         var10000 = this;
      }

      ((LQ)com.c.c(240160579628937511L).get(com.c.c(203606650134368525L).get(var10000))).clearSelection();
   }
}





