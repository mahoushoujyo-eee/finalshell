package com.finalshell.ui.model;

import com.finalshell.core.F3_3;
import java.util.Iterator;

public class E2 implements Iterable {
   public final Iterable z;
   public final Class e;

   public E2(Iterable var1, Class var2) {
      this.z = var1;
      this.e = var2;
   }

   @Override
   public Iterator iterator() {
      return F3_3.P(this.z.iterator(), this.e);
   }
}





