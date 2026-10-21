class ny_2 extends Thread {
   final oy_4 W;
   private static final long a;

   ny_2(oy_4 var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         System.gc();
      }
   }

   static {
      long var0 = 6962483420017977830L;
      long var10002 = 6962483420017982062L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





