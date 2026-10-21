class Vr_2 implements Runnable {
   final QI t;
   private final UD o;

   Vr_2(QI var1, UD var2) {
      this.t = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      this.o.X();
   }
}





