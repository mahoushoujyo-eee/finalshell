import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

class y9_2 implements Runnable {
   final ak_2 H;

   y9_2(ak_2 var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      String var1 = ak_2.u();
      ak_2 var10000 = (ak_2)com.c.c(446953166655942254L).get(this);
      if (var1 != null) {
         if (!com.c.c(370516434131129032L).getBoolean(var10000)) {
            return;
         }

         var10000 = (ak_2)com.c.c(446953166655942254L).get(this);
      }

      JScrollBar var2 = ((JScrollPane)com.c.c(535617497140980511L).get(var10000)).getVerticalScrollBar();
      var2.setValue(var2.getMaximum());
   }
}





