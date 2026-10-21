package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TR_2 extends T4 {
   public List Z = new ArrayList();
   public Map H = new HashMap();

   public List b() {
      return this.Z;
   }

   public void y(Component var1, Integer var2) {
      this.H.put(var1, var2);
   }

   public Integer O(Component var1) {
      return (Integer)this.H.get(var1);
   }

   public int z(Component var1) {
      return this.Z.indexOf(var1);
   }

   public Component j(int var1) {
      return (Component)this.Z.get(var1);
   }

   @Override
   public void A(Component var1, Object var2) {
      this.Z.add(var1);
   }

   @Override
   public void F(Component var1) {
      this.Z.remove(var1);
   }

   public void u(int var1, Component var2) {
      this.Z.add(var1, var2);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      Dimension var9;
      Insets var3 = var1.getInsets();
      int var4 = var3.left + var3.right;
      int var10000 = T4.O();
      int var5 = var3.top + var3.bottom;
      int var2 = var10000;
      Iterator var6 = this.Z.iterator();

      while (true) {
         if (var6.hasNext()) {
            Component var7 = (Component)var6.next();
            var9 = var7.getPreferredSize();
            if (var2 != 0) {
               break;
            }

            Dimension var8 = var9;
            var4 = Math.max(var4, var3.left + var8.width + var3.right);
            var5 += var8.height;
            if (var2 == 0) {
               continue;
            }
         }

         var9 = new Dimension(var4, var5);
         break;
      }

      return var9;
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = T4.O();
      Insets var3 = var1.getInsets();
      int var4 = var3.top;
      int var2 = var10000;

      for (Component var6 : this.Z) {
         Dimension var7 = var6.getPreferredSize();
         Integer var8 = (Integer)this.H.get(var6);
         var6.setBounds(var3.left, var8 == null ? var4 : var4 + var8, var1.getWidth() - var3.left - var3.right, var7.height);
         var4 += var7.height;
         if (var2 != 0) {
            break;
         }
      }
   }
}





