import java.util.HashMap;

public class Qe_2 {
   HashMap f;
   long q;

   public Qe_2(long var1) {
      this.q = var1;
      this.f = new HashMap();
   }

   @Override
   public boolean equals(Object var1) {
      String[] var10000 = QI.N();
      Qe_2 var3 = (Qe_2)var1;
      String[] var2 = var10000;
      long var5;
      int var4 = (var5 = this.q - var3.q) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var2 != null) {
         if (!var4) {
            return true;
         }

         var4 = 0;
      }

      return (boolean)var4;
   }

   @Override
   public int hashCode() {
      return Long.toString(this.q).hashCode();
   }

   public void I(bE_3 var1, Kw_2 var2) {
      this.f.put(var1, var2);
   }

   public void h(bE_3 var1) {
      this.f.remove(var1);
   }

   public int r() {
      return this.f.size();
   }

   public HashMap b() {
      return this.f;
   }
}





