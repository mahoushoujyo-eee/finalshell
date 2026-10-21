class p_2 extends Thread {
   final Dl_2 s;
   private static final long a;

   p_2(Dl_2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.s.D();
      }
   }

   static {
      long var0 = 2537106207605726704L;
      long var10002 = 2537106207605726744L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





