package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CommandListPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ag2 implements ActionListener {
   public final CommandListPanel Q;

   public Ag2(CommandListPanel var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 626222931422942615L;
      Ref.g(626222931422942615L, var2);
      Object var4 = 567366698646146944L;
      Ref.g(567366698646146944L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 243017095898527761L;
      Object[] var6 = var10003;
      Ref.h(243017095898527761L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





