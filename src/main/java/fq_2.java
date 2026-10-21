class Fq_2 extends Thread {
   final cM_3 e;
   private static final long a;

   Fq_2(cM_3 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         this.e.T();
      }
   }

   static {
      long var0 = 9045522668680755593L;
      long var10002 = 9045522668680755809L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





