package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;

public class TY3 implements Comparator {
   public final Collator z;

   public TY3(Collator var1) {
      this.z = var1;
   }

   public int M(Ck4 var1, Ck4 var2) {
      Object var3 = 615483345678269545L;
      Collator var10001 = (Collator)Ref.g(615483345678269545L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 396085629172753019L;
      Object var5 = var10003;
      var10003 = Ref.h(396085629172753019L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var10005 = (String)(Registry.emptyArgs());
      long var8 = 396085629172753019L;
      Object var7 = var10005;
      var10005 = Ref.h(396085629172753019L, var7, var8);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      return var10003.compare((String)var2, (String)var10005);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((Ck4)var1, (Ck4)var2);
      long var4 = 480492505117277245L;
      Object var3 = var10001;
      var10001 = Ref.h(480492505117277245L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





