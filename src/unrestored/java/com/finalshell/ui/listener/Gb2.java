package com.finalshell.ui.listener;

import com.finalshell.core.L9;
import com.finalshell.core.UA3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Gb2 implements ActionListener {
   public final RouteTracePanel I;

   public Gb2(RouteTracePanel var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3;
      int[] var10000 = L9.X();
      var3 = null;
      int[] var2 = var10000;
      Object var6 = 344394816027910510L;
      Ref.g(344394816027910510L, var6);
      Object var8 = 266946451169580014L;
      int var4 = ((UA3)Ref.g(266946451169580014L, var8)).getSelectedRow();
      label45:
      if (var4 > -1) {
         Object var10 = 344394816027910510L;
         Ref.g(344394816027910510L, var10);
         Object var12 = 434008521855552520L;
         Ref.g(434008521855552520L, var12);
         ArrayList var10005 = Registry.emptyArgs();
         long var15 = 508702504224153155L;
         Object var14 = var10005;
         var10005 = Ref.h(508702504224153155L, var14, var15);

         try {
            var10005 = (ArrayList)var10005;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         L9 var5 = (L9)var10005.get(var4);
         String var10006 = (String)(Registry.emptyArgs());
         long var17 = 564648154927582737L;
         Object var16 = var10006;
         var10006 = Ref.h(564648154927582737L, var16, var17);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         if (var2 == null) {
            if (var10006 == null) {
               break label45;
            }

            var10006 = (String)(var5);
            Object[] var10007 = Registry.emptyArgs();
            long var19 = 564648154927582737L;
            Object[] var18 = var10007;
            Ref.h(564648154927582737L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }
         }

         var3 = var10006;
      }

      Registry.packArgs(var3);
      long var20 = 396962080382410298L;
      Ref.h2(396962080382410298L, var20);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }
   }
}





