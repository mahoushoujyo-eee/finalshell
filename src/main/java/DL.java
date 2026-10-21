class DL implements Runnable {
   final f9_2 X;
   private final Qm_2 i;

   DL(f9_2 var1, Qm_2 var2) {
      this.X = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      this.i.Q = true;
      this.i.u(true);
   }
}





