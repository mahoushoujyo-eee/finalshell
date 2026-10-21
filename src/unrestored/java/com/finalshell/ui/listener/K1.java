package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class K1 implements ActionListener {
   public final SetExternalEditorPanel T;

   public K1(SetExternalEditorPanel var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 511132564964720768L;
      Ref.g(511132564964720768L, var2);
      Object var4 = 476201740043670453L;
      Ref.g(476201740043670453L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 346382751221538814L;
      Object[] var6 = var10003;
      Ref.h(346382751221538814L, var6, var7);
      Object var8 = 511132564964720768L;
      Ref.g(511132564964720768L, var8);
      Object var10 = 166731455568463101L;
      Object[] var10006 = Registry.packArgs(((com.finalshell.core.Km2)Ref.g(166731455568463101L, var10)).getParent(), false);
      long var13 = 560385712601905617L;
      Object[] var12 = var10006;
      Ref.h(560385712601905617L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }
   }
}





