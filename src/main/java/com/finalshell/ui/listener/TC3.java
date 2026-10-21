package com.finalshell.ui.listener;

import com.finalshell.core.TM;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;

public class TC3 implements FocusListener {
   public final TM O;

   public TC3(TM var1) {
      this.O = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Object var2 = 152236502500346171L;
      Ref.g(152236502500346171L, var2);
      Object var4 = 494766072002035328L;
      Ref.g(494766072002035328L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 149160680229662748L;
      Object[] var6 = var10003;
      Ref.h(149160680229662748L, var6, var7);
      Object[] var10004 = Registry.packArgs(true);
      long var9 = 438941361784812150L;
      Object[] var8 = var10004;
      Ref.h(438941361784812150L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Object var2 = 152236502500346171L;
      Ref.g(152236502500346171L, var2);
      Object var4 = 123645524365861271L;
      ((Connection5)Ref.g(123645524365861271L, var4)).stopEditing();
   }
}





