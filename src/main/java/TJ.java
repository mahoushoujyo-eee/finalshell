class TJ implements Runnable {
   final Bg_2 b;
   private final String i;
   private final int M;

   TJ(Bg_2 var1, String var2, int var3) {
      this.b = var1;
      this.i = var2;
      this.M = var3;
   }

   @Override
   public void run() {
      try {
         new n6(this.i, this.M);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





