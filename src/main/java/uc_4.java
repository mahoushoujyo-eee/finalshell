import java.util.Vector;

class uc_4 extends Vector {
   String B;

   uc_4(String var1) {
      com.c.c(532695623178604839L).set(this, var1);
   }

   uc_4(String var1, Object[] var2) {
      String var10000 = aA.z();
      com.c.c(532695623178604839L).set(this, var1);
      int var4 = 0;
      String var3 = var10000;
      int var5 = var2.length;

      while (var4 < var5) {
         this.add(var2[var4]);
         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      return "[" + (String)com.c.c(532695623178604839L).get(this) + "]";
   }
}





