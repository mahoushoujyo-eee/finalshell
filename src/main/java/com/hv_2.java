package com;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

public class Hv_2 implements en_4 {
   protected final Map k = new WeakHashMap();

   @Override
   public void Q(Component var1, G9 var2) {
      boolean var3;
      boolean var4;
      label76: {
         boolean var10000 = i2_2.K();
         var4 = var1 instanceof JComponent;
         var3 = var10000;
         var10000 = this.k.containsKey(var1);
         if (var3) {
            if (!var10000) {
               break label76;
            }

            var10000 = var4;
         }

         if (var10000) {
            ((JComponent)var1).setToolTipText(null);
         }

         com.ac_2.S(var1, (List)this.k.get(var1));
         ((List)this.k.get(var1)).clear();
      }

      G9 var8 = var2;
      if (var3) {
         if (var2 == null) {
            return;
         }

         var8 = var2;
      }

      List var9 = var8.e();
      if (var3) {
         if (var9 == null) {
            return;
         }

         var9 = var2.e();
      }

      if (var3) {
         if (var9.size() <= 0) {
            return;
         }

         var9 = var2.e();
      }

      for (com.Wp_2 var6 : var9) {
         label79: {
            com.Wp_2 var10 = var6;
            if (var3) {
               if (var6.w().equals(GX.swing)) {
                  if (!var4) {
                     break label79;
                  }

                  ((JComponent)var1).setToolTipText(var6.A());
                  if (var3) {
                     break label79;
                  }
               }

               var10 = var6;
            }

            if (var10.h() != null) {
               this.E(com.ac_2.l(var1, var6.A(), var6.m(), var6.h()));
               if (var3) {
                  break label79;
               }
            }

            this.E(com.ac_2.I(var1, var6.A()));
         }

         if (!var3) {
            break;
         }
      }
   }

   protected void E(com.Wd_2 var1) {
      boolean var10000 = i2_2.K();
      Component var3 = var1.N();
      boolean var2 = var10000;
      var10000 = this.k.containsKey(var3);
      if (var2) {
         if (!var10000) {
            this.k.put(var3, new ArrayList());
         }

         ((List)this.k.get(var3)).add(var1);
      }
   }
}





