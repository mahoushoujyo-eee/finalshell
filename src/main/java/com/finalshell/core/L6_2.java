package com.finalshell.core;

import com.finalshell.util.Xy4;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class L6_2 extends AbstractSet {
   final Xy4 E;

   public L6_2(Xy4 var1) {
      this.E = var1;
   }

   @Override
   public Iterator iterator() {
      return this.E.O();
   }

   @Override
   public boolean contains(Object var1) {
      int var2 = Ph2.u();
      NI var10000 = (NI)var1;
      if (var2 == 0) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         var10000 = (NI)var1;
      }

      Entry var3 = var10000;
      NI var4 = this.E.j(var3.getKey());
      var10000 = var4;
      if (var2 == 0) {
         if (var4 == null) {
            return false;
         }

         var10000 = var4;
      }

      boolean var6 = var10000.equals(var3);
      return var2 != 0 ? var6 : var6;
   }

   @Override
   public boolean remove(Object var1) {
      return this.E.H(var1) != null;
   }

   @Override
   public int size() {
      return this.E.t;
   }

   @Override
   public void clear() {
      this.E.clear();
   }

   L6_2(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





