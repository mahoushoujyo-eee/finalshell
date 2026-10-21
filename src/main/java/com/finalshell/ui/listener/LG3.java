package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class LG3 implements ActionListener {
   public final FileContextMenuListener g;

   public LG3(FileContextMenuListener var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 374154302224367849L;
      Ref.g(374154302224367849L, var2);
      Object var4 = 485704634840338368L;
      Ref.g(485704634840338368L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 239861906826915435L;
      Object[] var6 = var10003;
      Ref.h(239861906826915435L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





