package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TT extends T4 {
   protected List L = new ArrayList(2);
   public static long[] a;
   public static Integer[] b;

   public List i() {
      return this.L;
   }

   public void K(List var1) {
      this.L = var1;
   }

   public void S(LayoutManager var1) {
      this.L.add(var1);
   }

   public void X(LayoutManager var1) {
      this.L.remove(var1);
   }

   @Override
   public void addLayoutComponent(Component var1, Object var2) {
      int var10000 = T4.b();
      Iterator var4 = this.L.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         label19: {
            LayoutManager var5 = (LayoutManager)var4.next();
            LayoutManager var6 = var5;
            if (var3 != 0) {
               if (!(var5 instanceof LayoutManager2)) {
                  break label19;
               }

               var6 = var5;
            }

            ((LayoutManager2)var6).addLayoutComponent(var1, var2);
         }

         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      int var10000 = T4.b();
      Iterator var4 = this.L.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         LayoutManager var5 = (LayoutManager)var4.next();
         var5.addLayoutComponent(var1, var2);
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void removeLayoutComponent(Component var1) {
      int var10000 = T4.b();
      Iterator var3 = this.L.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         LayoutManager var4 = (LayoutManager)var3.next();
         var4.removeLayoutComponent(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public void A(Component var1, Object var2) {
      int var10000 = T4.O();
      Iterator var4 = this.L.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         label40: {
            LayoutManager var5 = (LayoutManager)var4.next();
            LayoutManager var6 = var5;
            if (var3 == 0) {
               if (var5 instanceof LayoutManager2) {
                  ((LayoutManager2)var5).addLayoutComponent(var1, var2);
                  if (var3 == 0) {
                     break label40;
                  }
               }

               var6 = var5;
            }

            String var7;
            label25: {
               var7 = (String)var2;
               if (var3 == 0) {
                  if (var2 == null) {
                     var7 = null;
                     break label25;
                  }

                  var7 = (String)var2;
               }

               var7 = var7.toString();
            }

            var6.addLayoutComponent(var7, var1);
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public void F(Component var1) {
      int var10000 = T4.b();
      Iterator var3 = this.L.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         LayoutManager var4 = (LayoutManager)var3.next();
         var4.removeLayoutComponent(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var10000 = T4.O();
      Dimension var3 = new Dimension(0, 0);
      int var2 = var10000;
      Iterator var4 = this.L.iterator();

      while (true) {
         if (var4.hasNext()) {
            LayoutManager var5 = (LayoutManager)var4.next();
            var6 = FN.h(var3, var5.preferredLayoutSize(var1));
            if (var2 != 0) {
               break;
            }

            var3 = var6;
            if (var2 == 0) {
      int var6;
      int var6;
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      int var10000 = T4.b();
      Dimension var3 = new Dimension(0, 0);
      Iterator var4 = this.L.iterator();
      int var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            LayoutManager var5 = (LayoutManager)var4.next();
            var6 = FN.h(var3, var5.minimumLayoutSize(var1));
            if (var2 == 0) {
               break;
            }

            var3 = var6;
            if (var2 != 0) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      int var10000 = T4.b();
      Dimension var3 = new Dimension(b(12582, 6338170939742045446L), b(3620, 717116607235029509L));
      int var2 = var10000;

      for (LayoutManager var5 : this.L) {
         if (var5 instanceof LayoutManager2) {
            var3 = FN.p(var3, ((LayoutManager2)var5).maximumLayoutSize(var1));
         }

         if (var2 == 0) {
            break;
         }
      }

      return var3;
   }

   @Override
   public void invalidateLayout(Container var1) {
      int var10000 = T4.O();
      Iterator var3 = this.L.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         label19: {
            LayoutManager var4 = (LayoutManager)var3.next();
            LayoutManager var5 = var4;
            if (var2 == 0) {
               if (!(var4 instanceof LayoutManager2)) {
                  break label19;
               }

               var5 = var4;
            }

            ((LayoutManager2)var5).invalidateLayout(var1);
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = T4.O();
      Iterator var3 = this.L.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         LayoutManager var4 = (LayoutManager)var3.next();
         var4.layoutContainer(var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29728;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7005113298715388120L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u009f\f3È7³\u0012!«§i\u0012vr\u00ad\"";
      int var5 = "\u009f\f3È7³\u0012!«§i\u0012vr\u00ad\"".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}






