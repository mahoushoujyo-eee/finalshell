package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

public class N9 implements ActionListener {
   public final U62 R;
   public final JMenuItem l;
   public final CompleteFullPathPanel X;

   public N9(CompleteFullPathPanel var1, U62 var2, JMenuItem var3) {
      this.X = var1;
      this.R = var2;
      this.l = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 259074561425004063L;
      Ref.g(259074561425004063L, var2);
      Object var4 = 380230102801320326L;
      Object[] var10003 = Registry.packArgs(((JMenuItem)Ref.g(380230102801320326L, var4)).isSelected());
      long var7 = 602514315018253524L;
      Object[] var6 = var10003;
      Ref.h(602514315018253524L, var6, var7);

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





