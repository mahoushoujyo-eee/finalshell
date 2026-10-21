package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.lang.reflect.InvocationTargetException;

public class N22 implements AdjustmentListener {
   final com.finalshell.ui.panel.OG3 S;
   final ClearListDialog G;

   N22(ClearListDialog var1, com.finalshell.ui.panel.OG3 var2) {
      this.G = var1;
      this.S = var2;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      Object var2 = 266620224043742390L;
      Ref.g(266620224043742390L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 494456998971578926L;
      Object[] var4 = var10002;
      Ref.h(494456998971578926L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





