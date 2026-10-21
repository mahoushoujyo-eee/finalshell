package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.Connection5;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class DD implements Comparator {
   public final Connection5 R;

   public DD(Connection5 var1) {
      this.R = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      AA.z();
      Object var6 = 168418258401192889L;
      Object var10002 = Ref.g(168418258401192889L, var6);
      Object[] var10003 = Registry.packArgs(var1);
      long var9 = 396550792733905567L;
      Object[] var8 = var10003;
      var10003 = Ref.h(396550792733905567L, var8, var9);

      try {
         var17 = (Integer)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      int var4 = var17;
      Object var3 = var10002;
      Object var10 = 168418258401192889L;
      Ref.g(168418258401192889L, var10);
      Object[] var10004 = Registry.packArgs(var2);
      long var13 = 396550792733905567L;
      Object[] var12 = var10004;
      var10004 = Ref.h(396550792733905567L, var12, var13);

      try {
         var19 = (Integer)var10004;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      int var5 = var19;
      int var20 = var4;
      int var10005 = var5;
      if (var3 == null) {
         if (var4 > var5) {
            return 1;
         }

         var20 = var4;
         if (var3 != null) {
            return var4;
         }

         var10005 = var5;
      }

      return var20 < var10005 ? -1 : 0;
   }
}





