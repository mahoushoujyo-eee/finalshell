package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class Dm2 implements ActionListener {
   final JCheckBox w;
   final ShowDeletedPanel F;

   Dm2(ShowDeletedPanel var1, JCheckBox var2) {
      this.F = var1;
      this.w = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 306266403902896148L;
      Object[] var4 = var10002;
      Ref.h(306266403902896148L, var4, var5);
      Object var6 = 232060552651646481L;
      Object[] var10004 = Registry.packArgs(((JCheckBox)Ref.g(232060552651646481L, var6)).isSelected());
      long var9 = 482363562455089409L;
      Object[] var8 = var10004;
      Ref.h(482363562455089409L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10006 = Registry.emptyArgs();
      long var13 = 578864097947885485L;
      Object[] var12 = var10006;
      Ref.h(578864097947885485L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





