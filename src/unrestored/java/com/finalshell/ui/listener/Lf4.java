package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Lf4 implements ActionListener {
   public final SetExternalEditorPanel Z;

   public Lf4(SetExternalEditorPanel var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 153207977196130125L;
      Ref.g(153207977196130125L, var2);
      Object var4 = 476201740043670453L;
      Ref.g(476201740043670453L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 346382751221538814L;
      Object[] var6 = var10003;
      Ref.h(346382751221538814L, var6, var7);
      Object var8 = 153207977196130125L;
      Ref.g(153207977196130125L, var8);
      Object var10 = 166731455568463101L;
      Object[] var10006 = Registry.packArgs(((com.finalshell.core.Km2)Ref.g(166731455568463101L, var10)).getParent());
      long var13 = 182461097517585968L;
      Object[] var12 = var10006;
      Ref.h(182461097517585968L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }
   }
}





