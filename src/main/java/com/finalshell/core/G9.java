package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.util.ArrayList;
import java.util.HashSet;

public class G9 {
   UR f;
   int h = 0;
   ArrayList A;
   HashSet a;

   G9(UR var1) {
      this.f = var1;
      this.A = new ArrayList();
      this.a = new HashSet();
   }

   synchronized void S(int var1) {
      String[] var2 = PingMessageR.N();
      if (var2 != null && !this.a.contains(var1)) {
         this.A.add(var1);
         this.a.add(var1);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   synchronized void x() {
      String[] var10000 = PingMessageR.N();
      int var2 = 0;
      int var3 = Yh2.a;
      int var4 = this.A.size();
      int var5 = var4 / var3;
      String[] var1 = var10000;
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
            this.f.z.s(this.A);
            this.f.z.s(this.A);
            if (var1 != null) {
               return;
            }
         }

         var10 = 0;
      }

      int var7 = var10;
      if (var1 == null || var7 < var5) {
         do {
            ArrayList var8 = this.m(var2, var6, this.A);
            this.f.z.s(var8);
            this.f.z.s(var8);
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
      String[] var10000 = PingMessageR.N();
      ArrayList var5 = new ArrayList();
      String[] var4 = var10000;
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





