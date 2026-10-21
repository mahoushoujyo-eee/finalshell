public class nL {
   public int j = 0;
   public UR T;
   String r;

   public nL(UR var1, int var2) {
      this.j = var2;
      this.T = var1;
      this.r = var1.v + "-" + var2;
   }

   @Override
   public boolean equals(Object var1) {
      nL var2 = (nL)var1;
      return var2.r.equals(this.r);
   }

   @Override
   public int hashCode() {
      return this.r.hashCode();
   }
}





