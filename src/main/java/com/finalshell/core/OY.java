package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class OY implements Comparable {
   public DM3 v;
   int t;

   public OY(DM3 var1, int var2) {
      long var4 = 159590777020539491L;
      Ref.s(159590777020539491L, var1, var4);
      Registry.lookupField(198606278652726872L).setInt(this, var2);
   }

   public int d(OY var1) {
      Object var2 = 159590777020539491L;
      Registry.packArgs(
         Ref.g(159590777020539491L, var2), Registry.lookupField(198606278652726872L).getInt(this), Registry.lookupField(198606278652726872L).getInt(var1)
      );
      long var4 = 295920266311443483L;
      Object var10002 = Ref.h2(295920266311443483L, var4);

      try {
         return (Integer)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public int compareTo(Object var1) {
      Object[] var10001 = Registry.packArgs((OY)var1);
      long var3 = 462876887609621738L;
      Object[] var2 = var10001;
      var10001 = Ref.h(462876887609621738L, var2, var3);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





