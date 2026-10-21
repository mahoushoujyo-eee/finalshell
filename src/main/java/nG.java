import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class nG extends MouseAdapter {
   final Y_ I;

   nG(Y_ var1) {
      this.I = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = Y_.j();
      nG var10000 = this;
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }

         var10000 = this;
      }

      ((nA)com.c.c(474934089651157961L).get(com.c.c(273957854721752233L).get(var10000))).clearSelection();
   }
}





