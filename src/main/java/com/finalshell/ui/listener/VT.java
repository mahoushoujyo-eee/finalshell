package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SetByKeyboardDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class VT implements ActionListener {
   public final SetByKeyboardDialog x;

   public VT(SetByKeyboardDialog var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 336936761151075309L;
      Ref.g(336936761151075309L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 616233312058416360L;
      Object[] var4 = var10002;
      Ref.h(616233312058416360L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





