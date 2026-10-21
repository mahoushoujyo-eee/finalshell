package com.finalshell.ui.listener;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class OS3 implements ActionListener {
   public final User A;

   public OS3(User var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 488088738135170022L;
      Ref.g(488088738135170022L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 619196899730172169L;
      Object[] var4 = var10002;
      Ref.h(619196899730172169L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





