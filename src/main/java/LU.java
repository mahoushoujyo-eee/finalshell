import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class LU extends MouseAdapter {
   final z_ K;

   LU(z_ var1) {
      this.K = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.ky_4[] var2 = z_.t();
      LU var10000 = this;
      if (var2 == null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }

         var10000 = this;
      }

      ((Yy_2)com.c.c(155517873227409293L).get(com.c.c(393319315918218150L).get(var10000))).clearSelection();
   }
}





