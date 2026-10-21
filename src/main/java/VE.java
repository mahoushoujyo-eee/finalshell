class VE implements Runnable {
   final B2 U;
   private final UR z;

   VE(B2 var1, UR var2) {
      this.U = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      this.z.H = true;
      this.z.R(true);
   }
}





