package com;

import java.util.Comparator;

public class Ho_2 implements Comparator {
   public int i(PV var1, PV var2) {
      return Float.compare(var1.I(), var2.I());
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.i((PV)var1, (PV)var2);
   }
}





