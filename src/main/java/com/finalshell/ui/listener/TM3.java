package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class TM3 implements ActionListener {
   final SetExternalEditorPanel Q;

   TM3(SetExternalEditorPanel var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 443674542551930624L;
      Ref.g(443674542551930624L, var2);
      Object var4 = 166731455568463101L;
      Ref.g(166731455568463101L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 386440316720074980L;
      Object[] var6 = var10003;
      Ref.h(386440316720074980L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 553191921490783868L;
      Object[] var8 = var10004;
      Ref.h(553191921490783868L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





