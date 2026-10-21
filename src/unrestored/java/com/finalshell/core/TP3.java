package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

public class TP3 implements WindowFocusListener {
   public final ClearListDialog u;

   public TP3(ClearListDialog var1) {
      this.u = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      Object var2 = 121931801821845954L;
      Ref.setLong(351178736107776851L, Ref.g(121931801821845954L, var2), System.currentTimeMillis());
      Object var4 = 121931801821845954L;
      Ref.g(121931801821845954L, var4);
      Object var6 = 265132846717086219L;
      ((Dv2)Ref.g(265132846717086219L, var6)).requestFocus();
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      Object var2 = 121931801821845954L;
      Ref.g(121931801821845954L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 496821856781947383L;
      Object[] var4 = var10002;
      Ref.h(496821856781947383L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }

      Object var6 = 121931801821845954L;
      Ref.setLong(447109474318907086L, Ref.g(121931801821845954L, var6), System.currentTimeMillis());
   }
}





