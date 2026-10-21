import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class DG implements PopupMenuListener {
   final y1_2 W;

   DG(y1_2 var1) {
      this.W = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      com.c.c(126803268638211778L).setLong(com.c.c(214973477385371850L).get(this), System.currentTimeMillis());
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
   }
}





