package com.finalshell.ui.model;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Ya2 implements Comparator {
   Ya2() {
   }

   public int m(L1 var1, L1 var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 162488024198852693L;
      Object[] var3 = var10001;
      var10001 = Ref.h(162488024198852693L, var3, var4);

      try {
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 162488024198852693L;
      Object[] var5 = var10003;
      var10003 = Ref.h(162488024198852693L, var5, var6);

      try {
         var11 = (Long)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return Long.compare((long)var1, var11);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((L1)var1, (L1)var2);
      long var4 = 494023454285602972L;
      Object[] var3 = var10001;
      var10001 = Ref.h(494023454285602972L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





