package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Td2 implements ActionListener {
   public final AppendCarriageReturnCRPanel a;

   public Td2(AppendCarriageReturnCRPanel var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 570867865580487675L;
      Ref.g(570867865580487675L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 525165286654267194L;
      Object[] var4 = var10002;
      Ref.h(525165286654267194L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





