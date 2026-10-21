class O5 implements Runnable {
   final xQ w;
   private final String r;

   O5(xQ var1, String var2) {
      this.w = var1;
      this.r = var2;
   }

   @Override
   public void run() {
      this.w.s.remove(this.r);
   }
}





