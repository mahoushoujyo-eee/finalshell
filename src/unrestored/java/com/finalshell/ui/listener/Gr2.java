package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Gr2 implements ActionListener {
   public final ConnectionProperty V;

   public Gr2(ConnectionProperty var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 222971910568398589L;
      Object[] var2 = var10001;
      Ref.h(222971910568398589L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }
}





