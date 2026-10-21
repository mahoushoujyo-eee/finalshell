package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

public class QS implements ActionListener {
   final JComboBox Q;
   final AppendCarriageReturnCRPanel p;

   QS(AppendCarriageReturnCRPanel var1, JComboBox var2) {
      this.p = var1;
      this.Q = var2;
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
      Object var6 = 383176209834630470L;
      Object[] var10004 = Registry.packArgs(((JComboBox)Ref.g(383176209834630470L, var6)).getSelectedIndex() + 1);
      long var9 = 146547271088066633L;
      Object[] var8 = var10004;
      Ref.h(146547271088066633L, var8, var9);

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





