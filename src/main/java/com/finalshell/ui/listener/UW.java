package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TerminalHint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class UW implements ActionListener {
   final JCheckBox k;
   final TerminalHint e;

   UW(TerminalHint var1, JCheckBox var2) {
      this.e = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 142067958742870066L;
      boolean var2 = ((JCheckBox)Ref.g(142067958742870066L, var3)).isSelected();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      Ref.h(306266403902896148L, var7, var8);
      Object[] var10004 = Registry.packArgs(var2);
      long var10 = 205923000048875104L;
      Object[] var9 = var10004;
      Ref.h(205923000048875104L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 578864097947885485L;
      Object[] var13 = var10006;
      Ref.h(578864097947885485L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }
}





