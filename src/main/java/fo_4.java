import javax.swing.SwingUtilities;

class fo_4 implements tk_4 {
   final m6 t;

   fo_4(m6 var1) {
      this.t = var1;
   }

   @Override
   public void R(U var1) {
      SwingUtilities.invokeLater(new Bd_2(this, var1));
   }
}





