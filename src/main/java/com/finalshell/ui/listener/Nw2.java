package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

public class Nw2 implements ActionListener {
   final JCheckBoxMenuItem N;
   final AppendCarriageReturnCRPanel b;

   Nw2(AppendCarriageReturnCRPanel var1, JCheckBoxMenuItem var2) {
      this.b = var1;
      this.N = var2;
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
      Object var6 = 448435972851242762L;
      Object[] var10004 = Registry.packArgs(((JCheckBoxMenuItem)Ref.g(448435972851242762L, var6)).isSelected());
      long var9 = 518015604357966671L;
      Object[] var8 = var10004;
      Ref.h(518015604357966671L, var8, var9);

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





