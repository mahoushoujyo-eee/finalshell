package com.finalshell.ui.listener;

import com.finalshell.core.Kw4;
import com.finalshell.core.UT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CopyPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class LR3 implements ActionListener {
   final CopyPanel Y;

   LR3(CopyPanel var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 168139779687005458L;
      Ref.g(168139779687005458L, var5);
      Object var7 = 483411846868584119L;
      int var2 = ((UT)Ref.g(483411846868584119L, var7)).getSelectedRow();
      Object var9 = 168139779687005458L;
      Ref.g(168139779687005458L, var9);
      Object var11 = 483411846868584119L;
      int var3 = ((UT)Ref.g(483411846868584119L, var11)).convertRowIndexToModel(var2);
      Object var13 = 168139779687005458L;
      Ref.g(168139779687005458L, var13);
      Object var15 = 541329565900929595L;
      Ref.g(541329565900929595L, var15);
      ArrayList var10007 = Registry.emptyArgs();
      long var18 = 312359756468558646L;
      Object[] var17 = var10007;
      var10007 = Ref.h(312359756468558646L, var17, var18);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Kw4 var4 = (Kw4)var10007.get(var3);
      new StringBuilder();
      Object[] var10009 = Registry.emptyArgs();
      long var20 = 134324574424375296L;
      Object[] var19 = var10009;
      var10009 = Ref.h(134324574424375296L, var19, var20);

      try {
         var29 = (Integer)var10009;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Registry.packArgs(var4.append(var29).append("").toString());
      long var21 = 396962080382410298L;
      Ref.h2(396962080382410298L, var21);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





