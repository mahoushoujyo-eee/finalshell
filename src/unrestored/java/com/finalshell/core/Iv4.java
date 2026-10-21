package com.finalshell.core;

import com.finalshell.util.Xy4;
import java.util.AbstractSet;
import java.util.Iterator;

public final class Iv4 extends AbstractSet {
   public final Xy4 s;

   public Iv4(Xy4 var1) {
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

   public Iv4(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





