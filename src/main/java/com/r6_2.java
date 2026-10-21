package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class r6_2 extends rp_4 {
   protected List l;

   public r6_2(File[] var1) {
      this.l = com.aL.e(var1);
      this.F = new d_2();
      this.m = Nk_2.C;
   }

   public r6_2(List var1) {
      this.l = var1;
      this.F = new d_2();
      this.m = Nk_2.C;
   }

   public r6_2(com.On_2 var1, File[] var2) {
      this.l = com.aL.e(var2);
      this.F = new d_2();
      this.m = var1;
   }

   public r6_2(com.On_2 var1, List var2) {
      this.l = var2;
      this.F = new d_2();
      this.m = var1;
   }

   public com.cY_3 D() {
      return this.l.size() == 1 ? new com.cY_3((File)this.l.get(0)) : new com.cY_3(null);
   }

   public void b(com.cY_3 var1, Np_2 var2) {
      try {
         Np_2 var10000;
         List var10001;
         label20: {
            try {
               var10000 = var2;
               if (var1.D() == null) {
                  var10001 = this.F();
                  break label20;
               }
            } catch (Throwable var4) {
               throw a(var4);
            }

            var10001 = this.B(var1);
         }

         var10000.S(var10001);
      } catch (Throwable var5) {
         var2.l(var5);
      }
   }

   protected List F() {
      ArrayList var2 = new ArrayList(this.l.size());
      String[] var10000 = com.cB_3.C();
      Iterator var3 = this.l.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            File var4 = (File)var3.next();
            var5 = var2;
            if (var1 == null) {
               break;
            }

            var2.add(new com.cY_3(var4));
            if (var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public List B(com.cY_3 var1) {
      String[] var10000 = com.cB_3.C();
      File[] var3 = var1.D().listFiles();
      String[] var2 = var10000;
      File[] var9 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return new ArrayList(0);
         }

         var9 = var3;
      }

      if (var9.length != 0) {
         ArrayList var4 = new ArrayList(var3.length);
         File[] var5 = var3;
         int var6 = var3.length;
         int var7 = 0;

         while (true) {
            if (var7 < var6) {
               File var8 = var5[var7];
               var10 = var4;
               if (var2 == null) {
                  break;
               }

               var4.add(new com.cY_3(var8));
               var7++;
               if (var2 != null) {
                  continue;
               }
            }

            var10 = var4;
            break;
         }

         return var10;
      } else {
         return new ArrayList(0);
      }
   }

   public com.On_2 j(com.cY_3 var1) {
      return var1.D() == null ? null : super.h(var1);
   }

   public boolean l(com.cY_3 var1) {
      String[] var2 = com.cB_3.C();
      File var10000 = var1.D();
      if (var2 != null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var1.D();
      }

      boolean var3 = com.Cz_2.z(var10000);
      return var2 == null ? var3 : !var3;
   }

   @Override
   public boolean y(com.cB_3 var1) {
      return this.l((com.cY_3)var1);
   }

   @Override
   public com.On_2 h(com.cB_3 var1) {
      return this.j((com.cY_3)var1);
   }

   @Override
   public void w(com.cB_3 var1, Np_2 var2) {
      this.b((com.cY_3)var1, var2);
   }

   @Override
   public com.cB_3 z() {
      return this.D();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





