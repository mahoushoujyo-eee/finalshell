class OC implements Runnable {
   final To_2 w;

   OC(To_2 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      this.w.v();
   }
}





