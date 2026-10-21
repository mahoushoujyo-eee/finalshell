package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ae2 implements ActionListener {
   public final ShowInFolderPanel w;

   public Ae2(ShowInFolderPanel var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 306052910204871929L;
      Ref.g(306052910204871929L, var2);
      Object var4 = 352347871280815957L;
      Ref.g(352347871280815957L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 474059151073329876L;
      Object[] var6 = var10003;
      Ref.h(474059151073329876L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





