package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AutoSelectTab;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class BY3 implements ActionListener {
   public final JCheckBox L;
   public final AutoSelectTab T;

   public BY3(AutoSelectTab var1, JCheckBox var2) {
      this.T = var1;
      this.L = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      AutoSelectTab.p();
      Object var4 = 327110933233628239L;
      boolean var3 = ((JCheckBox)Ref.g(327110933233628239L, var4)).isSelected();
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      Ref.h(306266403902896148L, var8, var9);
      Object[] var10004 = Registry.packArgs(var3);
      long var11 = 131102818206165459L;
      Object[] var10 = var10004;
      Ref.h(131102818206165459L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10006 = Registry.emptyArgs();
      long var15 = 578864097947885485L;
      Object[] var14 = var10006;
      Ref.h(578864097947885485L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Registry.emptyArgs();
      long var16 = 387891768327084408L;
      Ref.h2(387891768327084408L, var16);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         AutoSelectTab.t(this == null);
      }
   }
}





