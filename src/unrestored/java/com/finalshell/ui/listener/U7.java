package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class U7 implements ActionListener {
   public final AppendCarriageReturnCRPanel N;

   public U7(AppendCarriageReturnCRPanel var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 428333818942586083L;
      Ref.g(428333818942586083L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 239861906826915435L;
      Object[] var4 = var10002;
      Ref.h(239861906826915435L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





