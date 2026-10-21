package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class R62 extends Rp4 {
   protected List l;

   public R62(File[] var1) {
      this.l = AL_2.e(var1);
      this.F = new com.finalshell.ui.model.D2_2();
      this.m = Nk2.C;
   }

   public R62(List var1) {
      this.l = var1;
      this.F = new com.finalshell.ui.model.D2_2();
      this.m = Nk2.C;
   }

   public R62(On2 var1, File[] var2) {
      this.l = AL_2.e(var2);
      this.F = new com.finalshell.ui.model.D2_2();
      this.m = var1;
   }

   public R62(On2 var1, List var2) {
      this.l = var2;
      this.F = new com.finalshell.ui.model.D2_2();
      this.m = var1;
   }

   public com.finalshell.ui.model.CY3 D() {
      return this.l.size() == 1 ? new com.finalshell.ui.model.CY3((File)this.l.get(0)) : new com.finalshell.ui.model.CY3(null);
   }

   public void b(com.finalshell.ui.model.CY3 var1, Np2 var2) {
      try {
         Np2 var10000;
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
      String[] var10000 = CB3.C$arrString();
      Iterator var3 = this.l.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
      ArrayList var5;
            File var4 = (File)var3.next();
            var5 = var2;
            if (var1 == null) {
               break;
            }

            var2.add(new com.finalshell.ui.model.CY3(var4));
            if (var1 != null) {
      ArrayList var5;
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public List B(com.finalshell.ui.model.CY3 var1) {
      String[] var10000 = CB3.C$arrString();
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

               var4.add(new com.finalshell.ui.model.CY3(var8));
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

   public On2 j(com.finalshell.ui.model.CY3 var1) {
      return var1.D() == null ? null : super.h(var1);
   }

   public boolean l(com.finalshell.ui.model.CY3 var1) {
      String[] var2 = CB3.C$arrString();
      File var10000 = var1.D();
      if (var2 != null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var1.D();
      }

      boolean var3 = Cz2.z(var10000);
      return var2 == null ? var3 : !var3;
   }

   @Override
   public boolean y(CB3 var1) {
      return this.l((com.finalshell.ui.model.CY3)var1);
   }

   @Override
   public On2 h(CB3 var1) {
      return this.j((com.finalshell.ui.model.CY3)var1);
   }

   @Override
   public void w(CB3 var1, Np2 var2) {
      this.b((com.finalshell.ui.model.CY3)var1, var2);
   }

   @Override
   public CB3 z() {
      return this.D();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}






