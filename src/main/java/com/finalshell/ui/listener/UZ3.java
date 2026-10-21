package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class UZ3 implements ActionListener {
   final AppendCarriageReturnCRPanel p;

   UZ3(AppendCarriageReturnCRPanel var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 122514867018944481L;
      Ref.g(122514867018944481L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 243017095898527761L;
      Object[] var4 = var10002;
      Ref.h(243017095898527761L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





