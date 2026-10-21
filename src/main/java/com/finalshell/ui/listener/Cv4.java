package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EnvironmentVariablePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class Cv4 implements ActionListener {
   public final EnvironmentVariablePanel A;

   public Cv4(EnvironmentVariablePanel var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 256066470752085455L;
      Ref.g(256066470752085455L, var5);
      Object var7 = 166263389195533693L;
      int var2 = ((JTable)Ref.g(166263389195533693L, var7)).getSelectedRow();
      Object var9 = 256066470752085455L;
      Ref.g(256066470752085455L, var9);
      Object var11 = 166263389195533693L;
      int var3 = ((JTable)Ref.g(166263389195533693L, var11)).convertRowIndexToModel(var2);
      Object var13 = 256066470752085455L;
      Ref.g(256066470752085455L, var13);
      Object var15 = 166263389195533693L;
      String var4 = (String)((JTable)Ref.g(166263389195533693L, var15)).getModel().getValueAt(var3, 1);
      Registry.packArgs(var4);
      long var17 = 396962080382410298L;
      Ref.h2(396962080382410298L, var17);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }
}





