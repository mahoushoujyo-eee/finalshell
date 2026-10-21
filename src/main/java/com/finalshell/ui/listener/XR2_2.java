package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class XR2_2 implements ActionListener {
   public final ShowInFolderPanel m;

   public XR2_2(ShowInFolderPanel var1) {
      this.m = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 398122351850797043L;
      Ref.g(398122351850797043L, var2);
      Object var4 = 352347871280815957L;
      Ref.g(352347871280815957L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 506366507584924367L;
      Object[] var6 = var10003;
      Ref.h(506366507584924367L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





