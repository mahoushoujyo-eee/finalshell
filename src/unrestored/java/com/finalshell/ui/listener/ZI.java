package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class ZI implements ActionListener {
   public final ShowInFolderPanel Y;

   public ZI(ShowInFolderPanel var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 149365723442700070L;
      Ref.g(149365723442700070L, var2);
      Object var4 = 352347871280815957L;
      Ref.g(352347871280815957L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 147572432609874581L;
      Object[] var6 = var10003;
      Ref.h(147572432609874581L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





