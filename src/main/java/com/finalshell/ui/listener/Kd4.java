package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Kd4 implements ActionListener {
   public final SetExternalEditorPanel v;

   public Kd4(SetExternalEditorPanel var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 456933688134291740L;
      Ref.g(456933688134291740L, var2);
      Object var4 = 476201740043670453L;
      Ref.g(476201740043670453L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 346382751221538814L;
      Object[] var6 = var10003;
      Ref.h(346382751221538814L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 255651132142480546L;
      Object[] var8 = var10004;
      Ref.h(255651132142480546L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





