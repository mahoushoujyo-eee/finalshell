package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class XX2 implements ActionListener {
   final FilePermissionPanel h;

   XX2(FilePermissionPanel var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 445491176920083315L;
      Ref.g(445491176920083315L, var2);
      Object var4 = 305402254993059552L;
      Ref.g(305402254993059552L, var4);
      Object var6 = 445491176920083315L;
      Ref.g(445491176920083315L, var6);
      Object var8 = 520425198075199721L;
      Object[] var10005 = Registry.packArgs(Ref.g(520425198075199721L, var8));
      long var11 = 574420144857961258L;
      Object[] var10 = var10005;
      Ref.h(574420144857961258L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





