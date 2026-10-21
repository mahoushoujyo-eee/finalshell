import javax.swing.SwingUtilities;

class x2 implements Runnable {
   final Vn_2 e;

   x2(Vn_2 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      SwingUtilities.invokeLater(new mF(this));
   }
}





