package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ZU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class DX implements ActionListener {
   public final ZU d;

   public DX(ZU var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 534389193064556675L;
      Ref.g(534389193064556675L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 376283276208306086L;
      Object[] var4 = var10002;
      Ref.h(376283276208306086L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





