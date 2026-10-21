package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Xw2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class JY implements ActionListener {
   final Xw2 X;

   JY(Xw2 var1) {
      this.X = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 363576065253439937L;
      Ref.g(363576065253439937L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 297395466930437108L;
      Object[] var4 = var10002;
      Ref.h(297395466930437108L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





