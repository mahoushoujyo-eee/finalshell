class WM extends Thread {
   private static final long a;
   private static final long b;

   @Override
   public void run() {
      byte[] var1 = new byte[(int)a];
      boolean var2 = false;

      while (true) {
         try {
            Thread.sleep(b);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }

         OF.j = OF.s / 2;
         OF.s = 0;
      }
   }

   static {
      long var2 = 2123588059801587817L;
      long var10002 = 813483654242905833L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 4246234471418882046L;
      var10002 = 4246234471418880046L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





