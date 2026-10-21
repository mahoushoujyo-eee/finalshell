package com.finalshell.ui.adapter;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.AbstractAction;

public class Od2 extends AbstractAction {
   public final U W;

   public Od2(U var1, String var2) {
      super(var2);
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 236214990303510116L;
      Ref.g(236214990303510116L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 222971910568398589L;
      Object[] var4 = var10002;
      Ref.h(222971910568398589L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





