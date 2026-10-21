package com.finalshell.ui.model;

import com.finalshell.ui.frame.XD3;
import java.util.Comparator;

public class T7 implements Comparator {
   final XD3 l;

   T7(XD3 var1) {
      this.l = var1;
   }

   public int v(Object[] var1, Object[] var2) {
      return ((String)var1[0]).compareTo((String)var2[0]);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.v((Object[])var1, (Object[])var2);
   }
}





