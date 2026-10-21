package com.finalshell.ui.model;

import com.finalshell.core.X2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class W implements Comparator {
   public List K = Arrays.asList(L.values());

   public int C(X2 var1, X2 var2) {
      return Integer.valueOf(this.K.indexOf(var1.B$L())).compareTo(this.K.indexOf(var2.B$L()));
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.C((X2)var1, (X2)var2);
   }
}





