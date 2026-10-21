package com.finalshell.ui.listener;

import com.finalshell.core.Kn2;
import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import com.finalshell.ui.model.FT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class H_2 implements ActionListener {
   final FT C;
   final Tq4 S;

   H_2(Tq4 var1, FT var2) {
      this.S = var1;
      this.C = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var6 = 149897507471451438L;
      Registry.packArgs(Ref.g(149897507471451438L, var6));
      long var8 = 614911790858755507L;
      Object var10002 = Ref.h2(614911790858755507L, var8);

      try {
         var33 = (Integer)var10002;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      int var3 = var33;
      ClearListDialog.i$arrString();
      Object var10 = 149897507471451438L;
      int var4 = ((Tq4)Ref.g(149897507471451438L, var10)).convertRowIndexToModel(var3);
      Object var12 = 627204587718858522L;
      Ref.g(627204587718858522L, var12);
      Object[] var10006 = Registry.packArgs(var4, var4);
      long var15 = 130061847059020450L;
      Object[] var14 = var10006;
      L1 var5 = (L1)Ref.h(130061847059020450L, var14, var15);
      Object var16 = 627204587718858522L;
      Object var10007 = Ref.g(627204587718858522L, var16);
      Object[] var10008 = Registry.packArgs(var4);
      long var19 = 372393177963272891L;
      Object[] var18 = var10008;
      Ref.h(372393177963272891L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var2 = var10007;
      Object var20 = 149897507471451438L;
      Ref.g(149897507471451438L, var20);
      Object var22 = 381104070567601967L;
      Kn2 var10009 = (Kn2)Ref.g(381104070567601967L, var22);
      if (var2 == null) {
         if (var10009 == null) {
            return;
         }

         Object var24 = 149897507471451438L;
         Ref.g(149897507471451438L, var24);
         Object var26 = 381104070567601967L;
         Kn2 var10011 = (Kn2)Ref.g(381104070567601967L, var26);
      }

      Object[] var10010 = Registry.packArgs(var5, var4);
      long var29 = 154759019688621270L;
      Object[] var28 = var10010;
      Ref.h(154759019688621270L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





