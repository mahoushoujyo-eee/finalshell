import java.net.InetAddress;

public class oN_3 {
   InetAddress l;
   int W;
   int n;

   oN_3(InetAddress var1, int var2) {
      int[] var10000 = Cy_2.u();
      this.l = var1;
      int[] var3 = var10000;
      this.W = var2;
      this.n = (var1.toString() + var1).hashCode();
      if (var3 == null) {
         com.ky_4.K(new String[4]);
      }
   }

   @Override
   public int hashCode() {
      return this.n;
   }

   @Override
   public boolean equals(Object var1) {
      int[] var10000 = Cy_2.u();
      oN_3 var3 = (oN_3)var1;
      int[] var2 = var10000;
      if (var1 == null) {
         return false;
      } else {
         byte var4 = this.l.equals(var3.l);
         int var10001 = this.W;
         if (var2 != null) {
            var10001 = this.W == var3.W ? 1 : 0;
         }

         int var5 = var4 & var10001;
         if (com.ky_4.F() != null) {
            Cy_2.c(new int[3]);
         }

         return (boolean)var5;
      }
   }
}





