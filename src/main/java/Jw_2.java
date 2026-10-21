class Jw_2 implements Runnable {
   final UX W;

   Jw_2(UX var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      try {
         CK.s();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





