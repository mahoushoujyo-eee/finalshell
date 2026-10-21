package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

public class X42 implements ActionListener {
   public final U62 B;
   public final JMenuItem o;
   public final CompleteFullPathPanel f;

   public X42(CompleteFullPathPanel var1, U62 var2, JMenuItem var3) {
      this.f = var1;
      this.B = var2;
      this.o = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 557870258033868492L;
      Ref.g(557870258033868492L, var2);
      Object var4 = 386340424945963541L;
      Object[] var10003 = Registry.packArgs(((JMenuItem)Ref.g(386340424945963541L, var4)).isSelected());
      long var7 = 185034444943029152L;
      Object[] var6 = var10003;
      Ref.h(185034444943029152L, var6, var7);

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





