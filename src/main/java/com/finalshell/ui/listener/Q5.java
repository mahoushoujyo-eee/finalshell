package com.finalshell.ui.listener;

import com.finalshell.core.LI3_2;
import com.finalshell.core.U82;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TerminateProcessPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Q5 implements ActionListener {
   final TerminateProcessPanel i;

   Q5(TerminateProcessPanel var1) {
      this.i = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var6 = 158542760097367785L;
      Ref.g(158542760097367785L, var6);
      Object var8 = 342129762932297171L;
      int var2 = ((Uo2)Ref.g(342129762932297171L, var8)).getSelectedRow();
      Object var10 = 158542760097367785L;
      Ref.g(158542760097367785L, var10);
      Object var12 = 342129762932297171L;
      int var3 = ((Uo2)Ref.g(342129762932297171L, var12)).convertRowIndexToModel(var2);
      Object var14 = 158542760097367785L;
      Ref.g(158542760097367785L, var14);
      Object var16 = 435109479173232140L;
      Ref.g(435109479173232140L, var16);
      ArrayList var10007 = Registry.emptyArgs();
      long var19 = 245965692335108743L;
      Object[] var18 = var10007;
      var10007 = Ref.h(245965692335108743L, var18, var19);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      LI3_2 var4 = (LI3_2)var10007.get(var3);
      U82 var10008 = (U82)(Registry.emptyArgs());
      long var21 = 382054480216091309L;
      Object[] var20 = var10008;
      var10008 = Ref.h(382054480216091309L, var20, var21);

      try {
         var10008 = (U82)var10008;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      U82 var5 = var10008;
      new StringBuilder();
      Object[] var10010 = Registry.emptyArgs();
      long var23 = 340521912883652737L;
      Object[] var22 = var10010;
      var10010 = Ref.h(340521912883652737L, var22, var23);

      try {
         var35 = (Integer)var10010;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Registry.packArgs(var5.append(var35).append("").toString());
      long var24 = 396962080382410298L;
      Ref.h2(396962080382410298L, var24);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }
   }
}





