package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;

public class Q implements Comparator {
   final Collator x;

   Q(Collator var1) {
      this.x = var1;
   }

   public int x(Tf4 var1, Tf4 var2) {
      Object var3 = 189199077318277082L;
      Collator var10001 = (Collator)Ref.g(189199077318277082L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 179612178163941306L;
      Object[] var5 = var10003;
      var10003 = Ref.h(179612178163941306L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var10005 = (String)(Registry.emptyArgs());
      long var8 = 179612178163941306L;
      Object[] var7 = var10005;
      var10005 = Ref.h(179612178163941306L, var7, var8);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      return var10003.compare((String)var2, (String)var10005);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Tf4)var1, (Tf4)var2);
      long var4 = 356098581812760084L;
      Object[] var3 = var10001;
      var10001 = Ref.h(356098581812760084L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





