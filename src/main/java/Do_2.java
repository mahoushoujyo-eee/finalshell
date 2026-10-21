class Do_2 implements Runnable {
   final xQ D;
   private static final long a;

   Do_2(xQ var1) {
      this.D = var1;
   }

   @Override
   public void run() {
      this.D.x();

      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
      }

      this.D.d();
   }

   static {
      long var0 = 3013584503645805643L;
      long var10002 = 3013584503645806499L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





