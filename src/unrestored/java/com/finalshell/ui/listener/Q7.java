package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import com.finalshell.ui.frame.TerminalHelpFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class Q7 implements ActionListener {
   public final JCheckBox U;
   public final TerminalHelpFrame h;

   public Q7(TerminalHelpFrame var1, JCheckBox var2) {
      this.h = var1;
      this.U = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = Backspace.F();
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 306266403902896148L;
      Object[] var5 = var10002;
      Ref.h(306266403902896148L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw new RuntimeException(var17.getTargetException());
      }

      Object var7 = 522942075709586275L;
      boolean var10004 = ((JCheckBox)Ref.g(522942075709586275L, var7)).isSelected();
      if (var2 != null) {
         var10004 = !var10004;
      }

      Object[] var18 = Registry.packArgs(var10004);
      long var10 = 590278996794808699L;
      Object[] var9 = var18;
      Ref.h(590278996794808699L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw new RuntimeException(var16.getTargetException());
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
         throw new RuntimeException(var15.getTargetException());
      }
   }
}





