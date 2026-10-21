import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class dK_3 extends MouseAdapter {
   final zw_2 b;

   dK_3(zw_2 var1) {
      this.b = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2 = zw_2.V();
      dK_3 var10000 = this;
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }

         var10000 = this;
      }

      ((nH)com.c.c(548989663897657123L).get(com.c.c(562032403762553071L).get(var10000))).clearSelection();
   }
}





