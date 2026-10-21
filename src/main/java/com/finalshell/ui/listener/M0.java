package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class M0 implements ActionListener {
   public final FileContextMenuListener S;

   public M0(FileContextMenuListener var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 570022061691913965L;
      Ref.g(570022061691913965L, var2);
      Object var4 = 485704634840338368L;
      Ref.g(485704634840338368L, var4);
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





