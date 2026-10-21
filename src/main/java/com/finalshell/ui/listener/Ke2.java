package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ProgressDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ke2 implements ActionListener {
   public final ProgressDialog c;

   public Ke2(ProgressDialog var1) {
      this.c = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 260425465387371054L;
      Ref.g(260425465387371054L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 343871400640450352L;
      Object[] var4 = var10002;
      Ref.h(343871400640450352L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





