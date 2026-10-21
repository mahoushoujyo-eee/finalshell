package com.finalshell.ui.listener;

import com.finalshell.core.LI3_2;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TerminateProcessPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class DQ implements ActionListener {
   final TerminateProcessPanel V;

   DQ(TerminateProcessPanel var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Uo2.k();
      Object var8 = 614503233350805414L;
      Object var10002 = Ref.g(614503233350805414L, var8);
      Object var10 = 342129762932297171L;
      int var3 = ((Uo2)Ref.g(342129762932297171L, var10)).getSelectedRow();
      Object var2 = var10002;
      Object var12 = 614503233350805414L;
      Ref.g(614503233350805414L, var12);
      Object var14 = 342129762932297171L;
      int var4 = ((Uo2)Ref.g(342129762932297171L, var14)).convertRowIndexToModel(var3);
      Object var16 = 614503233350805414L;
      Ref.g(614503233350805414L, var16);
      Object var18 = 435109479173232140L;
      Ref.g(435109479173232140L, var18);
      ArrayList var10007 = Registry.emptyArgs();
      long var21 = 245965692335108743L;
      Object[] var20 = var10007;
      var10007 = Ref.h(245965692335108743L, var20, var21);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      LI3_2 var5 = (LI3_2)var10007.get(var4);
      Object[] var10008 = Registry.emptyArgs();
      long var23 = 382054480216091309L;
      Object[] var22 = var10008;
      Ref.h(382054480216091309L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      String var10009 = (String)(Registry.emptyArgs());
      long var25 = 577747074549625554L;
      Object[] var24 = var10009;
      var10009 = Ref.h(577747074549625554L, var24, var25);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var7 = var10009;
      String var36 = var7;
      if (var2 != false) {
         if (var7 == null) {
            var7 = "";
         }

         var36 = var7;
      }

      Registry.packArgs(var36);
      long var26 = 396962080382410298L;
      Ref.h2(396962080382410298L, var26);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }
   }
}





