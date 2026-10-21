package com.I;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class w implements Comparator {
   private List K = Arrays.asList(com.I.L.values());

   public int C(x var1, x var2) {
      return Integer.valueOf(this.K.indexOf(var1.B())).compareTo(this.K.indexOf(var2.B()));
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.C((x)var1, (x)var2);
   }
}





