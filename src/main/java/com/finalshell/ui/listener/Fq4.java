package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.PasswordDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Fq4 implements ActionListener {
   public final PasswordDialog l;

   public Fq4(PasswordDialog var1) {
      this.l = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 367248770647231229L;
      Ref.g(367248770647231229L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 506035368637771784L;
      Object[] var4 = var10002;
      Ref.h(506035368637771784L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





