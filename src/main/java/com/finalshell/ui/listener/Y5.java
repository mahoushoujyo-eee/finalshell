package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

public class Y5 implements ActionListener {
   final AppendCarriageReturnCRPanel x;

   Y5(AppendCarriageReturnCRPanel var1) {
      this.x = var1;
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
      Object var6 = 444456035672562901L;
      Ref.g(444456035672562901L, var6);
      Object var8 = 274811053631936956L;
      Object[] var10005 = Registry.packArgs(((JCheckBoxMenuItem)Ref.g(274811053631936956L, var8)).isSelected());
      long var11 = 192311363740458831L;
      Object[] var10 = var10005;
      Ref.h(192311363740458831L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10007 = Registry.emptyArgs();
      long var15 = 578864097947885485L;
      Object[] var14 = var10007;
      Ref.h(578864097947885485L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }
}





