import java.util.ArrayList;
import java.util.HashSet;

public class z1 {
   Qu_2 R;
   int F = 0;
   ArrayList k;
   HashSet n;

   z1(Qu_2 var1) {
      this.R = var1;
      this.k = new ArrayList();
      this.n = new HashSet();
   }

   synchronized void k(int var1) {
      String[] var2 = QI.N();
      if (var2 != null && !this.n.contains(var1)) {
         this.k.add(var1);
         this.n.add(var1);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   synchronized void h() {
      int var2 = 0;
      int var3 = Yh_2.a;
      String[] var10000 = QI.N();
      int var4 = this.k.size();
      String[] var1 = var10000;
      int var5 = var4 / var3;
      int var9 = var4 % var3;
      if (var1 != null) {
         if (var9 != 0) {
            var5++;
         }

         var9 = var5;
      }

      if (var1 != null) {
         if (var9 == 0) {
            var5 = 1;
         }

         var9 = var3;
      }

      int var6 = var9;
      int var10 = var4;
      if (var1 != null) {
         if (var4 <= var6) {
            this.R.F(this.k);
            this.R.F(this.k);
            if (var1 != null) {
               return;
            }
         }

         var10 = 0;
      }

      int var7 = var10;
      if (var1 == null || var7 < var5) {
         do {
            ArrayList var8 = this.m(var2, var6, this.k);
            this.R.F(var8);
            this.R.F(var8);
            var2 += var3;
            int var11 = var2 + var6;
            if (var1 != null) {
               if (var11 > var4) {
                  var6 = var4 - (var5 - 1) * var3;
                  var7++;
               } else {
                  var7++;
               }
            } else {
               var6 = var11 - var4;
               var7++;
            }
         } while (var7 < var5);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   ArrayList m(int var1, int var2, ArrayList var3) {
      ArrayList var5 = new ArrayList();
      String[] var10000 = QI.N();
      int var6 = 0;
      String[] var4 = var10000;
      ArrayList var7;
      if (var4 == null) {
         var7 = var5;
      } else if (var6 >= var2) {
         var7 = var5;
         if (var4 != null) {
            return var5;
         }
      } else {
         var7 = var5;
      }

      while (true) {
         var7.add((Integer)var3.get(var1 + var6));
         if (++var6 >= var2) {
            var7 = var5;
            if (var4 != null) {
               return var5;
            }
         } else {
            var7 = var5;
         }
      }
   }
}





