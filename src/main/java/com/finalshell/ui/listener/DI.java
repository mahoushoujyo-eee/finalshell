package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

public class DI implements ActionListener {
   final U62 r;
   final JMenuItem Y;
   final CompleteFullPathPanel P;

   DI(CompleteFullPathPanel var1, U62 var2, JMenuItem var3) {
      this.P = var1;
      this.r = var2;
      this.Y = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 610756112525548103L;
      Ref.g(610756112525548103L, var2);
      Object var4 = 443747423670745632L;
      Object[] var10003 = Registry.packArgs(((JMenuItem)Ref.g(443747423670745632L, var4)).isSelected());
      long var7 = 336543365265728522L;
      Object[] var6 = var10003;
      Ref.h(336543365265728522L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var11 = 578864097947885485L;
      Object[] var10 = var10005;
      Ref.h(578864097947885485L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





