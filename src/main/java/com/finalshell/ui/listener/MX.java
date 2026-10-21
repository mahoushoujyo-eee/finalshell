package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CustomAcceleratePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class MX implements ActionListener {
   final CustomAcceleratePanel P;

   MX(CustomAcceleratePanel var1) {
      this.P = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 361822850997322065L;
      Ref.g(361822850997322065L, var2);
      Object var4 = 566743455951098104L;
      Ref.g(566743455951098104L, var4);
      Object var6 = 361822850997322065L;
      Object var10004 = Ref.g(361822850997322065L, var6);
      Object var8 = 447445157306867736L;
      Registry.packArgs(var10004, Ref.g(447445157306867736L, var8));
      long var10 = 274988989695972769L;
      Ref.h2(274988989695972769L, var10);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





