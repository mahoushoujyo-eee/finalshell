package com.finalshell.task;

import com.finalshell.core.C;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.TA;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

public class Bp2 implements Runnable {
   String D;
   final TA E;

   Bp2(TA var1) {
      this.E = var1;
      long var3 = 547712353249085906L;
      Object var2 = null;
      Ref.s(547712353249085906L, var2, var3);
   }

   @Override
   public void run() {
      Object var3 = 136255156672474390L;
      Ref.g(136255156672474390L, var3);
      Object var5 = 293785544051389437L;
      ((C)Ref.g(293785544051389437L, var5)).setEnabled(false);
      Address.i();
      Object var7 = 136255156672474390L;
      Ref.g(136255156672474390L, var7);
      Object var9 = 233423413271348758L;
      Ref.g(233423413271348758L, var9);
      Object var11 = 294487557435087442L;
      Object var10006 = Ref.g(294487557435087442L, var11);
      Object[] var10007 = Registry.emptyArgs();
      long var14 = 212042562452272939L;
      Object[] var13 = var10007;
      Ref.h(212042562452272939L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object var1 = var10006;
      if (var1 != false) {
         Object var15 = 547712353249085906L;
         if ((String)Ref.g(547712353249085906L, var15) != null) {
            var10007 = null;
            Object var17 = 547712353249085906L;
            JOptionPane.showMessageDialog(this, (String)Ref.g(547712353249085906L, var17));
         }
      }

      Object var19 = 136255156672474390L;
      Ref.g(136255156672474390L, var19);
      Object var21 = 293785544051389437L;
      ((C)Ref.g(293785544051389437L, var21)).setEnabled(true);
   }
}





