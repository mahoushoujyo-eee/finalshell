class bI_3 implements Runnable {
   private static final long a;

   @Override
   public void run() {
      byte[] var1 = new byte[(int)a];
      bi_4.O = true;

      try {
         while (true) {
            bN_3.y.write(var1, 0, var1.length);
         }
      } catch (Exception var3) {
         bi_4.B = true;
         bi_4.O = false;
      }
   }

   static {
      long var0 = 1816430452161470275L;
      long var10002 = 8094915517783560003L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





