import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

class cg_4 implements Runnable {
   final VN b;

   cg_4(VN var1) {
      this.b = var1;
   }

   @Override
   public void run() {
      int var1 = z2.w();
      VN var10000 = (VN)com.c.c(462021172812617353L).get(this);
      if (var1 != 0) {
         if (!com.c.c(376642468236131701L).getBoolean(var10000)) {
            return;
         }

         var10000 = (VN)com.c.c(462021172812617353L).get(this);
      }

      JScrollBar var2 = ((JScrollPane)com.c.c(291624504329155555L).get(var10000)).getVerticalScrollBar();
      var2.setValue(var2.getMaximum());
   }
}





