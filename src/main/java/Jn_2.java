class Jn_2 implements Runnable {
   final xQ p;
   private final String t;

   Jn_2(xQ var1, String var2) {
      this.p = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      this.p.Q.remove(this.t);
   }
}





