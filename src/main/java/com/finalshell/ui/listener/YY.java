package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportMenuPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class YY implements ActionListener {
   public final ImportMenuPanel R;

   public YY(ImportMenuPanel var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 440306660689296436L;
      Ref.g(440306660689296436L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 630053839701158881L;
      Object[] var4 = var10002;
      Ref.h(630053839701158881L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





