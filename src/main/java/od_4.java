import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class od_4 implements ActionListener {
   final U h;

   od_4(U var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = F8.y();
      cB_3 var10000 = (cB_3)com.c.c(194285877583497070L).get(null);
      if (var2 == null) {
         if (var10000 == null) {
            com.c.c(194285877583497070L).set(null, new cB_3((U)com.c.c(147680755442349247L).get(this)));
         }

         ((cB_3)com.c.c(194285877583497070L).get(null)).setVisible(true);
         var10000 = (cB_3)com.c.c(194285877583497070L).get(null);
      }

      var10000.toFront();
   }
}





