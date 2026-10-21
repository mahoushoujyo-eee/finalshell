package com.finalshell.ui.model;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Ub4 implements Comparator {
   final ClearListDialog J;

   Ub4(ClearListDialog var1) {
      this.J = var1;
   }

   public int c(L1 var1, L1 var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var10 = 236277018693765536L;
      Object[] var9 = var10001;
      var10001 = Ref.h(236277018693765536L, var9, var10);

      try {
         var16 = (Integer)var10001;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      double var4 = (double)var16;
      ClearListDialog.i$arrString();
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 236277018693765536L;
      Object[] var11 = var10003;
      var10003 = Ref.h(236277018693765536L, var11, var12);

      try {
         var18 = (Integer)var10003;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      double var6 = (double)var18;
      byte var8 = 0;
      double var19;
      int var10002 = (var19 = var4 - var6) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
      if (var2 == null) {
         if (var10002 > 0) {
            var8 = -1;
            if (var2 == null) {
               return var8;
            }
         }

         double var20;
         var10002 = (var20 = var6 - var4) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         return var10002;
      } else {
         if (var10002 > 0) {
            var8 = 1;
         }

         return var8;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((L1)var1, (L1)var2);
      long var4 = 574993626918362268L;
      Object[] var3 = var10001;
      var10001 = Ref.h(574993626918362268L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





