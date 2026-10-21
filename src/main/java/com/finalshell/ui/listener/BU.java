package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Ki2;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

public class BU implements ActionListener {
   final JMenuItem Y;
   final SetExternalEditorPanel x;

   BU(SetExternalEditorPanel var1, JMenuItem var2) {
      this.x = var1;
      this.Y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Ki2(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





