package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CustomAcceleratePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class X0 implements ActionListener {
   public final CustomAcceleratePanel M;

   public X0(CustomAcceleratePanel var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 516194669640382242L;
      Ref.g(516194669640382242L, var2);
      Object var4 = 447445157306867736L;
      Registry.packArgs(Ref.g(447445157306867736L, var4));
      long var6 = 264379078899316637L;
      Ref.h2(264379078899316637L, var6);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





