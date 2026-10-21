package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.HashSet;

public class AT {
   public Qm2 X;
   public int O = 0;
   public ArrayList m;
   public HashSet q;

   public AT(Qm2 var1) {
      this.X = var1;
      this.m = new ArrayList();
      this.q = new HashSet();
   }

   public synchronized void C(int var1) {
      Ky4[] var2 = Qm2.J();
      if (var2 != null && !this.q.contains(var1)) {
         this.m.add(var1);
         this.q.add(var1);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public synchronized void t() {
      int var2 = 0;
      int var3 = Cs2.x;
      Ky4[] var10000 = Qm2.J();
      int var4 = this.m.size();
      Ky4[] var1 = var10000;
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
            this.X.J.Y(this.m);
            this.X.J.Y(this.m);
            if (var1 != null) {
               return;
            }
         }

         var10 = 0;
      }

      int var7 = var10;
      if (var1 == null || var7 < var5) {
         do {
            ArrayList var8 = this.P(var2, var6, this.m);
            this.X.J.Y(var8);
            this.X.J.Y(var8);
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
   public ArrayList P(int var1, int var2, ArrayList var3) {
      Ky4[] var10000 = Qm2.J();
      ArrayList var5 = new ArrayList();
      Ky4[] var4 = var10000;
      int var6 = 0;
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





