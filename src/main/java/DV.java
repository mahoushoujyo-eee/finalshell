class DV implements Runnable {
   @Override
   public void run() {
      bi_4.O = true;
      byte[] var1 = new byte[1];

      try {
         int var2 = bN_3.J.read(var1, 0, var1.length);
      } catch (Exception var3) {
         bi_4.B = true;
      }

      bi_4.O = false;
   }
}





