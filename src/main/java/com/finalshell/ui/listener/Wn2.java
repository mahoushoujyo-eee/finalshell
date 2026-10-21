package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EffectPreview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Wn2 implements ActionListener {
   final EffectPreview Y;

   Wn2(EffectPreview var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 606640237838480290L;
      Ref.g(606640237838480290L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 419624596741622746L;
      Object[] var4 = var10002;
      Ref.h(419624596741622746L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





