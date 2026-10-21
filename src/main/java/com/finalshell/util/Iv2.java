package com.finalshell.util;

import com.finalshell.core.Oi4;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class Iv2 extends AbstractCollection {
   final Xy4 w;

   public Iv2(Xy4 var1) {
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

   Iv2(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





