class QF implements Runnable {
   final oE_3 I;
   private static final long a;

   QF(oE_3 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      ((nq_2)com.c.c(549465658310609690L).get(com.c.c(442764781923245602L).get(this))).setVisible(false);
   }

   static {
      long var0 = 6469273428450883857L;
      long var10002 = 6469273428450884613L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





