package com.finalshell.ui.model;

import java.util.Iterator;

public abstract class O_3 implements Iterator {
   public final Iterator r;

   public O_3(Iterator var1) {
      this.r = var1;
   }

   @Override
   public boolean hasNext() {
      return this.r.hasNext();
   }

   @Override
   public final Object next() {
      return this.w(this.r.next());
   }

   @Override
   public void remove() {
      this.r.remove();
   }

   protected abstract Object w(Object var1);
}





