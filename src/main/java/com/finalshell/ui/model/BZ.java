package com.finalshell.ui.model;

import com.finalshell.core.LN3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class BZ implements Comparator {
   final Comparator X = Collator.getInstance(Locale.CHINA);

   BZ() {
   }

   public int M(LN3 var1, LN3 var2) {
      Object var3 = 632033503626148307L;
      Comparator var10001 = (Comparator)Ref.g(632033503626148307L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 286931176286176762L;
      Object[] var5 = var10003;
      var10003 = Ref.h(286931176286176762L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var10005 = (String)(Registry.emptyArgs());
      long var8 = 286931176286176762L;
      Object[] var7 = var10005;
      var10005 = Ref.h(286931176286176762L, var7, var8);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      return var10003.compare(var2, var10005);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((LN3)var1, (LN3)var2);
      long var4 = 442883042118595617L;
      Object[] var3 = var10001;
      var10001 = Ref.h(442883042118595617L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





