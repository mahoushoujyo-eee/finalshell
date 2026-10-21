package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.F82;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;

public class TA3 implements Comparator {
   final HashMap j;
   final F82 y;

   TA3(F82 var1, HashMap var2) {
      this.y = var1;
      this.j = var2;
   }

   public int I(Thread var1, Thread var2) {
      Object var5 = 590353382428314736L;
      Long var3 = (Long)((HashMap)Ref.g(590353382428314736L, var5)).get(var1.getId());
      Object var7 = 590353382428314736L;
      Long var4 = (Long)((HashMap)Ref.g(590353382428314736L, var7)).get(var2.getId());
      return var4.compareTo(var3);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Thread)var1, (Thread)var2);
      long var4 = 537215676255985544L;
      Object[] var3 = var10001;
      var10001 = Ref.h(537215676255985544L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





