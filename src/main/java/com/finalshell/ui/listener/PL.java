package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class PL implements ActionListener {
   final ShowInFolderPanel E;

   PL(ShowInFolderPanel var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 541147220212417411L;
      Ref.g(541147220212417411L, var2);
      Object var4 = 352347871280815957L;
      Ref.g(352347871280815957L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 307385892414745374L;
      Object[] var6 = var10003;
      Ref.h(307385892414745374L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





