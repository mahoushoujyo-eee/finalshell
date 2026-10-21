package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class MZ implements Comparator {
   public final ConnectionInfoPanel c;

   public MZ(ConnectionInfoPanel var1) {
      this.c = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      ConnectionInfoPanel.I();
      Object var6 = 316017134182938101L;
      Object var10002 = Ref.g(316017134182938101L, var6);
      Object var10003 = Registry.packArgs(var1);
      long var9 = 539671799132134878L;
      Object var8 = var10003;
      var10003 = Ref.h(539671799132134878L, var8, var9);

      try {
         var17 = (Integer)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      int var4 = var17;
      Object var3 = var10002;
      Object var10 = 316017134182938101L;
      Ref.g(316017134182938101L, var10);
      Object var10004 = Registry.packArgs(var2);
      long var13 = 539671799132134878L;
      Object var12 = var10004;
      var10004 = Ref.h(539671799132134878L, var12, var13);

      try {
         var19 = (Integer)var10004;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      int var5 = var19;
      int var20 = var4;
      int var10005 = var5;
      if (var3 != null) {
         if (var4 > var5) {
            return 1;
         }

         var20 = var4;
         if (var3 == null) {
            return var4;
         }

         var10005 = var5;
      }

      return var20 < var10005 ? -1 : 0;
   }
}





