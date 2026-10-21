package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class FJ implements ActionListener {
   public final com.finalshell.ui.frame.MainFrame n;

   public FJ(com.finalshell.ui.frame.MainFrame var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ((UpdateFrame)Ref.g(529321737223656579L, null)).setLocationRelativeTo(null);
      Ref.g(529321737223656579L, null);
      Object[] var10001 = Registry.packArgs(true);
      long var3 = 610529704363663802L;
      Object[] var2 = var10001;
      Ref.h(610529704363663802L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }

      ((UpdateFrame)Ref.g(529321737223656579L, null)).requestFocus();
   }
}





