package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class At2 implements ActionListener {
   public final ShowDeletedPanel P;

   public At2(ShowDeletedPanel var1) {
      this.P = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 629580077382533674L;
      Ref.g(629580077382533674L, var2);
      Object var4 = 354859781990372885L;
      Ref.g(354859781990372885L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 258495433430833129L;
      Object[] var6 = var10003;
      Ref.h(258495433430833129L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 432130153322869667L;
      Object[] var8 = var10004;
      Ref.h(432130153322869667L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }
   }
}





