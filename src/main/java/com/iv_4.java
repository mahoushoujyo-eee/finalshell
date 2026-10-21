package com;

import java.util.AbstractSet;
import java.util.Iterator;

final class iv_4 extends AbstractSet {
   final xy_4 s;

   private iv_4(xy_4 var1) {
      this.s = var1;
   }

   @Override
   public Iterator iterator() {
      return this.s.e();
   }

   @Override
   public int size() {
      return this.s.t;
   }

   @Override
   public boolean contains(Object var1) {
      return this.s.containsKey(var1);
   }

   @Override
   public boolean remove(Object var1) {
      return this.s.O(var1) != null;
   }

   @Override
   public void clear() {
      this.s.clear();
   }

   iv_4(xy_4 var1, com.oi_4 var2) {
      this(var1);
   }
}





