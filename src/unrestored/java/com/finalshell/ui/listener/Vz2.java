package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Dz2;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Vz2 implements ActionListener {
   public final SetExternalEditorPanel u;

   public Vz2(SetExternalEditorPanel var1) {
      this.u = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 259214779978464137L;
      Ref.g(259214779978464137L, var4);
      Object var6 = 166731455568463101L;
      int var2 = ((com.finalshell.core.Km2)Ref.g(166731455568463101L, var6)).getSelectedRow();
      Object var8 = 259214779978464137L;
      Ref.g(259214779978464137L, var8);
      Object var10 = 166731455568463101L;
      int var3 = ((com.finalshell.core.Km2)Ref.g(166731455568463101L, var10)).convertRowIndexToModel(var2);
      Ref.g(388376917454860932L, null);
      Object[] var10005 = Registry.packArgs(new Dz2(this, var2));
      long var13 = 434592463220957006L;
      Object[] var12 = var10005;
      Ref.h(434592463220957006L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }
   }
}





