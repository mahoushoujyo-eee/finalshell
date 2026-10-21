class oe_4 extends Thread {
   final Bh_2 X;
   private static final long a;

   oe_4(Bh_2 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.X.s();
      }
   }

   static {
      long var0 = 8819303886834341408L;
      long var10002 = 8819303886834341320L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





