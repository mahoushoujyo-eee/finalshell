package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class FD3 implements ActionListener {
   final ShowDeletedPanel r;

   FD3(ShowDeletedPanel var1) {
      this.r = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 360766863932579759L;
      Ref.g(360766863932579759L, var2);
      Object var4 = 354859781990372885L;
      Ref.g(354859781990372885L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 258495433430833129L;
      Object[] var6 = var10003;
      Ref.h(258495433430833129L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 606838486540289950L;
      Object[] var8 = var10004;
      Ref.h(606838486540289950L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





