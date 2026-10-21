package com.finalshell.ui.listener;

import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.QuickConnectPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AF implements ChangeListener {
   public final QuickConnectPanel d;

   public AF(QuickConnectPanel var1) {
      this.d = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      Object var2 = 468394628993116963L;
      Ref.g(468394628993116963L, var2);
      Object var4 = 368966479006037777L;
      Ref.g(368966479006037777L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 168252186092657055L;
      Object[] var6 = var10003;
      Ref.h(168252186092657055L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object var8 = 468394628993116963L;
      Ref.g(468394628993116963L, var8);
      Object var10 = 368966479006037777L;
      ((Vn2)Ref.g(368966479006037777L, var10)).repaint();
   }
}





