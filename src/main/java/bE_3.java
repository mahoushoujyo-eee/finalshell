public class bE_3 {
   public int M = 0;
   public UR I;
   String w;

   public bE_3(UR var1, int var2) {
      this.M = var2;
      this.I = var1;
      this.w = var1.v + "-" + var2;
   }

   @Override
   public boolean equals(Object var1) {
      bE_3 var2 = (bE_3)var1;
      return var2.w.equals(this.w);
   }

   @Override
   public int hashCode() {
      return this.w.hashCode();
   }
}





