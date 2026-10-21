import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class UJ implements ActionListener {
   final JFrame E;
   final U f;
   final K_ S;

   UJ(K_ var1, JFrame var2, U var3) {
      this.S = var1;
      this.E = var2;
      this.f = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = Jx_2.O();
      JFrame var10000 = (JFrame)com.c.c(483503609442551270L).get(this);
      if (var2 == null) {
         if (!var10000.isVisible()) {
            ((JFrame)com.c.c(483503609442551270L).get(this)).pack();
            ((JFrame)com.c.c(483503609442551270L).get(this)).setLocationRelativeTo((U)com.c.c(337283081855578108L).get(this));
         }

         ((JFrame)com.c.c(483503609442551270L).get(this)).setVisible(true);
         var10000 = (JFrame)com.c.c(483503609442551270L).get(this);
      }

      var10000.toFront();
   }
}





