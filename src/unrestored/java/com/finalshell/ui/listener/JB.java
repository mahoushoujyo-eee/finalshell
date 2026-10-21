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

public class JB implements ActionListener {
   public final TerminateProcessPanel J;

   public JB(TerminateProcessPanel var1) {
      this.J = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var8 = 237335482123466263L;
      Ref.g(237335482123466263L, var8);
      Object var10 = 342129762932297171L;
      int var3 = ((Uo2)Ref.g(342129762932297171L, var10)).getSelectedRow();
      Object var12 = 237335482123466263L;
      Ref.g(237335482123466263L, var12);
      Object var14 = 342129762932297171L;
      int var4 = ((Uo2)Ref.g(342129762932297171L, var14)).convertRowIndexToModel(var3);
      Uo2.i();
      Object var16 = 237335482123466263L;
      Ref.g(237335482123466263L, var16);
      Object var18 = 435109479173232140L;
      Object var10007 = Ref.g(435109479173232140L, var18);
      ArrayList var10008 = Registry.emptyArgs();
      long var21 = 245965692335108743L;
      Object var20 = var10008;
      var10008 = Ref.h(245965692335108743L, var20, var21);

      try {
         var10008 = (ArrayList)var10008;
      } catch (InvocationTargetException var31) {
         throw new RuntimeException(var31.getTargetException());
      }

      LI3_2 var5 = (LI3_2)var10008.get(var4);
      Object var2 = var10007;
      Object[] var34 = Registry.emptyArgs();
      long var23 = 382054480216091309L;
      Object[] var22 = var34;
      Ref.h(382054480216091309L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw new RuntimeException(var30.getTargetException());
      }

      String var10009 = (String)(Registry.emptyArgs());
      long var25 = 372900192662778876L;
      Object var24 = var10009;
      var10009 = Ref.h(372900192662778876L, var24, var25);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var29) {
         throw new RuntimeException(var29.getTargetException());
      }

      String var7 = var10009;
      String var37 = var7;
      if (var2 == null) {
         if (var7 == null) {
            var7 = "";
         }

         var37 = var7;
      }

      Registry.packArgs(var37);
      long var26 = 396962080382410298L;
      Ref.h2(396962080382410298L, var26);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw new RuntimeException(var28.getTargetException());
      }
   }
}





