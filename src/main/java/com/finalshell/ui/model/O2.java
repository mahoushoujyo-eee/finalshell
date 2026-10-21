package com.finalshell.ui.model;

import com.finalshell.core.A_4;
import com.finalshell.core.F3_3;
import java.util.Iterator;

public class O2 implements Iterable {
   final Iterable Z;
   final A_4 r;

   O2(Iterable var1, A_4 var2) {
      this.Z = var1;
      this.r = var2;
   }

   @Override
   public Iterator iterator() {
      return F3_3.e(this.Z.iterator(), this.r);
   }
}





