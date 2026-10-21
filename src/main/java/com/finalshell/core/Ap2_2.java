package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.HashMap;

public class Ap2_2 {
   public int u;
   public Ow4 A;
   public int r;
   public HashMap U;
   public ArrayList o;
   public int K;
   public int J;
   public int n;
   public int Q;
   public int t;
   public int H;
   public static String[] m;
   public static long a;

   public Ap2_2(int var1) {
      F();
      this.r = -1;
      this.U = new HashMap();
      this.o = new ArrayList();
      this.K = -1;
      this.u = var1;
      if (Ky4.F$arrString() != null) {
         q(new String[1]);
      }
   }

   public void t(char var1, int var2, boolean var3) {
      String[] var10000 = F();
      byte var5 = 1;
      String[] var4 = var10000;
      byte var8 = (var3) ? 1 : 0;
      if (var4 == null) {
         if (var3 != 0) {
            var5 = 2;
         }

         var8 = 0;
      }

      label56: {
         label57: {
            label58: {
               byte var6 = var8;
               Ow4 var9 = this.A;
               if (var4 == null) {
                  if (this.A != null) {
                     var10 = var2 - this.r;
                     if (var4 != null) {
                        break label57;
                     }

                     if (var10 <= var5) {
                        break label58;
                     }
                  }

                  var9 = this.A;
               }

               if (var4 == null) {
                  if (var9 != null && var2 - this.r <= var6 + 1) {
                     this.A.a(var2);
                     if (var4 == null) {
                        break label58;
                     }

                     Ky4.K(new String[2]);
                  }

                  var9 = new Ow4(var2);
               }

               Ow4 var7 = var9;
               var7.z(this);
               this.o.add(var7);
               this.U.put(var2, var7);
               this.A = var7;
            }

            this.r = var2;
            var11 = this;
            if (var4 != null) {
               break label56;
            }

            var10 = this.K;
         }

         if (var10 < 0) {
            this.K = var2;
         }

         this.J = var2;
         var11 = this;
      }

      var11.A.f(var1, (boolean)var3);
   }

   public int x(int var1) {
      String[] var10000 = F();
      byte var3 = -1;
      String[] var2 = var10000;
      if (var1 > 5) {
      }

      int var4 = 0;

      while (true) {
         label29:
         if (var4 < this.o.size()) {
            Ow4 var5 = (Ow4)this.o.get(var4);
            if (var2 == null) {
               var6 = var5.T();
               if (var2 != null) {
                  break;
               }

               if (var6 < var1 && var1 - var5.T() < (int)a && var2 == null) {
                  break label29;
               }

               var4++;
            }

            if (var2 == null) {
      byte var6;
      byte var6;
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public int I() {
      return this.u;
   }

   public void Q(int var1) {
      this.u = var1;
   }

   public ArrayList O() {
      return this.o;
   }

   public void U(ArrayList var1) {
      this.o = var1;
   }

   public int i() {
      return this.K;
   }

   public void X(int var1) {
      this.K = var1;
   }

   public int V() {
      return this.J;
   }

   public void g(int var1) {
      this.J = var1;
   }

   public static void q(String[] var0) {
      m = var0;
   }

   public static String[] F() {
      return m;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (F() != null) {
         q(new String[2]);
      }

      long var0 = 344147190590422132L;
      long var10002 = 6492846569389767806L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}






