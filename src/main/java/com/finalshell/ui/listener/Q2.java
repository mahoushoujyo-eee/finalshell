package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Q2 implements ActionListener {
   public final SetExternalEditorPanel d;

   public Q2(SetExternalEditorPanel var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 636455380658783577L;
      Ref.g(636455380658783577L, var2);
      Object var4 = 166731455568463101L;
      Registry.packArgs(Ref.g(166731455568463101L, var4));
      long var6 = 211273487601650149L;
      Ref.h2(211273487601650149L, var6);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





