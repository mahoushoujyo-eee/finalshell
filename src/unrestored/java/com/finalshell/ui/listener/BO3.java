package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.JH;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class BO3 implements ActionListener {
   public final SetExternalEditorPanel L;

   public BO3(SetExternalEditorPanel var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ref.g(388376917454860932L, null);
      Object[] var10001 = Registry.packArgs(new JH(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }
}





