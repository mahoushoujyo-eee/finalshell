package com.finalshell.ui.model;

import com.finalshell.core.C_9;
import java.util.ListIterator;

public abstract class J implements ListIterator {
   protected final ListIterator r;

   public J(ListIterator var1) {
      this.r = var1;
   }

   @Override
   public boolean hasNext() {
      return this.r.hasNext();
   }

   @Override
   public Object next() {
      return this.r.next();
   }

   @Override
   public boolean hasPrevious() {
      return this.r.hasPrevious();
   }

   @Override
   public Object previous() {
      return this.r.previous();
   }

   @Override
   public int nextIndex() {
      return this.r.nextIndex();
   }

   @Override
   public int previousIndex() {
      return this.r.previousIndex();
   }

   @Override
   public void remove() {
      this.r.remove();
   }

   @Override
   public void set(@C_9 Object var1) {
      this.r.set(var1);
   }

   @Override
   public void add(@C_9 Object var1) {
      this.r.add(var1);
   }
}





