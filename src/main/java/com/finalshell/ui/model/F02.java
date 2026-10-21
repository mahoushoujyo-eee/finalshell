package com.finalshell.ui.model;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Yf2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class F02 implements Comparator {
   public final Yf2 I;

   public F02(Yf2 var1) {
      this.I = var1;
   }

   public int g(Lv4_2 var1, Lv4_2 var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 365199820804367683L;
      Object[] var3 = var10001;
      var10001 = Ref.h(365199820804367683L, var3, var4);

      try {
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 365199820804367683L;
      Object[] var5 = var10003;
      var10003 = Ref.h(365199820804367683L, var5, var6);

      try {
         var11 = (Long)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return Long.compare((long)var1, var11);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Lv4_2)var1, (Lv4_2)var2);
      long var4 = 142285341576578234L;
      Object[] var3 = var10001;
      var10001 = Ref.h(142285341576578234L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





