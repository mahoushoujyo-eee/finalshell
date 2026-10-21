package com.finalshell.ui.listener;

import com.finalshell.core.Terminal;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Zm2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

public class T5 implements ActionListener {
   final JComboBox Z;
   final Zm2 J;

   T5(Zm2 var1, JComboBox var2) {
      this.J = var1;
      this.Z = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 574177068818506467L;
      Terminal var2 = (Terminal)((JComboBox)Ref.g(574177068818506467L, var3)).getSelectedItem();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      Ref.h(306266403902896148L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 179372822256513033L;
      Object[] var9 = var10005;
      var10005 = Ref.h(179372822256513033L, var9, var10);

      try {
         var21 = (Integer)var10005;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var10005 = Registry.packArgs(var21);
      long var12 = 533514141162061900L;
      Object[] var11 = var10005;
      Ref.h(533514141162061900L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 578864097947885485L;
      Object[] var15 = var10007;
      Ref.h(578864097947885485L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }
}





