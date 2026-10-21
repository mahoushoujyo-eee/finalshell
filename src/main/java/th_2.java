class Th_2 extends Thread {
   final tp_4 m;

   Th_2(tp_4 var1) {
      this.m = var1;
   }

   @Override
   public void run() {
      this.m.i(this.m.g, this.m.F + 1);
   }
}





