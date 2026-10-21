package org.l;

import java.util.ListIterator;

public class Y extends org.l.j {
   public Y(ListIterator var1) {
      super(var1);
   }

   @Override
   public boolean hasNext() {
      return super.hasPrevious();
   }

   @Override
   public boolean hasPrevious() {
      return super.hasNext();
   }

   @Override
   public Object next() {
      return super.previous();
   }

   @Override
   public Object previous() {
      return super.next();
   }

   @Override
   public int nextIndex() {
      throw new UnsupportedOperationException();
   }

   @Override
   public int previousIndex() {
      throw new UnsupportedOperationException();
   }
}





