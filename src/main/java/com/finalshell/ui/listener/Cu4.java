package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EffectPreview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Cu4 implements ActionListener {
   public final EffectPreview I;

   public Cu4(EffectPreview var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 402213984830087612L;
      Ref.g(402213984830087612L, var2);
      Object var4 = 402213984830087612L;
      Ref.g(402213984830087612L, var4);
      Object var6 = 203837641958439669L;
      Object[] var10004 = Registry.packArgs(Ref.g(203837641958439669L, var6));
      long var9 = 363947850905951070L;
      Object[] var8 = var10004;
      Ref.h(363947850905951070L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





