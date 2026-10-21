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

public class K__2 implements ActionListener {
   final RouteTracePanel j;

   K__2(RouteTracePanel var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 622049133513456979L;
      Ref.g(622049133513456979L, var5);
      Object var7 = 266946451169580014L;
      int var2 = ((UA3)Ref.g(266946451169580014L, var7)).getSelectedRow();
      if (var2 > -1) {
         Object var9 = 622049133513456979L;
         Ref.g(622049133513456979L, var9);
         Object var11 = 434008521855552520L;
         Ref.g(434008521855552520L, var11);
         ArrayList var10005 = Registry.emptyArgs();
         long var14 = 508702504224153155L;
         Object[] var13 = var10005;
         var10005 = Ref.h(508702504224153155L, var13, var14);

         try {
            var10005 = (ArrayList)var10005;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         L9 var3 = (L9)var10005.get(var2);
         String var10006 = (String)(Registry.emptyArgs());
         long var16 = 564648154927582737L;
         Object[] var15 = var10006;
         var10006 = Ref.h(564648154927582737L, var15, var16);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         String var4 = var10006;
         if (var4 != null) {
            Registry.emptyArgs();
            long var17 = 270389152141252877L;
            Ref.h2(270389152141252877L, var17);
            Object[] var10008 = Registry.emptyArgs();
            long var20 = 634817973682994708L;
            Object[] var19 = var10008;
            Ref.h(634817973682994708L, var19, var20);
            Object[] var10009 = Registry.emptyArgs();
            long var22 = 240567170779145617L;
            Object[] var21 = var10009;
            Ref.h(240567170779145617L, var21, var22);
            Object[] var10010 = Registry.emptyArgs();
            long var24 = 226341449505323490L;
            Object[] var23 = var10010;
            Ref.h(226341449505323490L, var23, var24);
            Object[] var10011 = Registry.emptyArgs();
            long var26 = 153346140499032202L;
            Object[] var25 = var10011;
            Ref.h(153346140499032202L, var25, var26);
            Object[] var10012 = Registry.emptyArgs();
            long var28 = 221034384446077256L;
            Object[] var27 = var10012;
            Ref.h(221034384446077256L, var27, var28);
            Object[] var10013 = Registry.packArgs(var4, null);
            long var30 = 407547220859876749L;
            Object[] var29 = var10013;
            Ref.h(407547220859876749L, var29, var30);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }
         }
      }
   }
}





