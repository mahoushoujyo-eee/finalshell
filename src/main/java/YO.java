class YO extends Thread {
   final tp_4 U;
   private static final long a;

   YO(tp_4 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.U.R();
      }
   }

   static {
      long var0 = 8393351857207357747L;
      long var10002 = 8393351857207357741L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





