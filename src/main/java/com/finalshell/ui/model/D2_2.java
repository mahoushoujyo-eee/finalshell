package com.finalshell.ui.model;

import com.finalshell.core.DE;
import java.util.Comparator;

public class D2_2 implements Comparator {
   public int j(CY3 var1, CY3 var2) {
      return DE.n.I(var1.D(), var2.D());
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.j((CY3)var1, (CY3)var2);
   }
}





