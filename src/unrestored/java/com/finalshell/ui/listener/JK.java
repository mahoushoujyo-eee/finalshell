package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CommandListPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class JK implements ActionListener {
   public final CommandListPanel p;

   public JK(CommandListPanel var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 371719257939546729L;
      Ref.g(371719257939546729L, var2);
      Object var4 = 567366698646146944L;
      Ref.g(567366698646146944L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 239861906826915435L;
      Object[] var6 = var10003;
      Ref.h(239861906826915435L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





