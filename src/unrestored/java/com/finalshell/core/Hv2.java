package com.finalshell.core;

import com.finalshell.ui.model.GX;
import com.finalshell.ui.model.Wp2;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

public class Hv2 implements En4 {
   public final Map k = new WeakHashMap();

   @Override
   public void Q(Component var1, com.finalshell.ui.model.G9 var2) {
      boolean var3;
      boolean var4;
      label76: {
         boolean var10000 = I22.K$boolean();
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

         Ac2.S(var1, (List)this.k.get(var1));
         ((List)this.k.get(var1)).clear();
      }

      com.finalshell.ui.model.G9 var8 = var2;
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

      for (Wp2 var6 : var9) {
         label79: {
            Wp2 var10 = var6;
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
               this.E(Ac2.l(var1, var6.A(), var6.m(), var6.h()));
               if (var3) {
                  break label79;
               }
            }

            this.E(Ac2.I(var1, var6.A()));
         }

         if (!var3) {
            break;
         }
      }
   }

   public void E(com.finalshell.ui.panel.Wd2 var1) {
      boolean var10000 = I22.K$boolean();
      Component var3 = var1.N$Component();
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





