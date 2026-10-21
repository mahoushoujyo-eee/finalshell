package com.finalshell.ui.model;

import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class OY3 implements Comparator {
   public final Comparator i = Collator.getInstance(Locale.CHINA);

   public int K(YE var1, YE var2) {
      Object var3 = 422340630205271856L;
      Comparator var10001 = (Comparator)Ref.g(422340630205271856L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 474678417197598864L;
      Object[] var5 = var10003;
      var10003 = Ref.h(474678417197598864L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var10005 = (String)(Registry.emptyArgs());
      long var8 = 474678417197598864L;
      Object[] var7 = var10005;
      var10005 = Ref.h(474678417197598864L, var7, var8);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      return var10003.compare(var2, var10005);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((YE)var1, (YE)var2);
      long var4 = 269433259277020478L;
      Object[] var3 = var10001;
      var10001 = Ref.h(269433259277020478L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





