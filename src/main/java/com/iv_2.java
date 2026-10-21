package com;

import java.util.AbstractCollection;
import java.util.Iterator;

final class Iv_2 extends AbstractCollection {
   final xy_4 w;

   private Iv_2(xy_4 var1) {
      this.w = var1;
   }

   @Override
   public Iterator iterator() {
      return this.w.P();
   }

   @Override
   public int size() {
      return this.w.t;
   }

   @Override
   public boolean contains(Object var1) {
      return this.w.containsValue(var1);
   }

   @Override
   public void clear() {
      this.w.clear();
   }

   Iv_2(xy_4 var1, com.oi_4 var2) {
      this(var1);
   }
}





