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

public class Dd2 implements ActionListener {
   public final TerminateProcessPanel P;

   public Dd2(TerminateProcessPanel var1) {
      this.P = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Uo2.i();
      Object var8 = 433939107928182312L;
      Object var10002 = Ref.g(433939107928182312L, var8);
      Object var10 = 342129762932297171L;
      int var3 = ((Uo2)Ref.g(342129762932297171L, var10)).getSelectedRow();
      Object var2 = var10002;
      Object var12 = 433939107928182312L;
      Ref.g(433939107928182312L, var12);
      Object var14 = 342129762932297171L;
      int var4 = ((Uo2)Ref.g(342129762932297171L, var14)).convertRowIndexToModel(var3);
      Object var16 = 433939107928182312L;
      Ref.g(433939107928182312L, var16);
      Object var18 = 435109479173232140L;
      Ref.g(435109479173232140L, var18);
      ArrayList var10007 = Registry.emptyArgs();
      long var21 = 245965692335108743L;
      Object var20 = var10007;
      var10007 = Ref.h(245965692335108743L, var20, var21);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var33) {
         throw new RuntimeException(var33.getTargetException());
      }

      LI3_2 var5 = (LI3_2)var10007.get(var4);
      Object[] var10008 = Registry.emptyArgs();
      long var23 = 382054480216091309L;
      Object[] var22 = var10008;
      Ref.h(382054480216091309L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw new RuntimeException(var32.getTargetException());
      }

      Object[] var10009 = Registry.emptyArgs();
      long var25 = 412318774197756267L;
      Object[] var24 = var10009;
      Ref.h(412318774197756267L, var24, var25);
      String var10010 = (String)(Registry.emptyArgs());
      long var27 = 505915899939017355L;
      Object var26 = var10010;
      var10010 = Ref.h(505915899939017355L, var26, var27);

      try {
         var10010 = (String)var10010;
      } catch (InvocationTargetException var31) {
         throw new RuntimeException(var31.getTargetException());
      }

      String var7 = var10010;
      String var38 = var7;
      if (var2 == null) {
         if (var7 == null) {
            var7 = "";
         }

         var38 = var7;
      }

      Registry.packArgs(var38);
      long var28 = 396962080382410298L;
      Ref.h2(396962080382410298L, var28);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw new RuntimeException(var30.getTargetException());
      }
   }
}





