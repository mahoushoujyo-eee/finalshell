package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EditPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class TS implements ActionListener {
   public final EditPanel Q;

   public TS(EditPanel var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 262462492588429207L;
      Ref.g(262462492588429207L, var2);
      Object var4 = 329993788740527022L;
      Ref.g(329993788740527022L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 363445102399037940L;
      Object[] var6 = var10003;
      Ref.h(363445102399037940L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





