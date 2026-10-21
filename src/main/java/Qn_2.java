import javax.swing.SwingUtilities;

class Qn_2 implements Runnable {
   final U Z;

   Qn_2(U var1) {
      this.Z = var1;
   }

   @Override
   public void run() {
      SwingUtilities.invokeLater(new fS_3(this));
   }
}





