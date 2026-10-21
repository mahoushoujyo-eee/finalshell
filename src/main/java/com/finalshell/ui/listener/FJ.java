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
      ((UpdateFrame)Registry.lookupField(529321737223656579L).get(null)).setLocationRelativeTo(null);
      Registry.lookupField(529321737223656579L).get(null);
      Object[] var10001 = Registry.packArgs(true);
      long var3 = 610529704363663802L;
      Object[] var2 = var10001;
      Ref.h(610529704363663802L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      ((UpdateFrame)Registry.lookupField(529321737223656579L).get(null)).requestFocus();
   }
}





