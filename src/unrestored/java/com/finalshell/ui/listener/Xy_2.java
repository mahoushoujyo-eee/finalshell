package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Xy_2 implements ActionListener {
   public final SelectDownloadFolderPanel a;

   public Xy_2(SelectDownloadFolderPanel var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 526651191822188854L;
      Ref.g(526651191822188854L, var2);
      Object var4 = 269586463206323716L;
      Ref.g(269586463206323716L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 248904686894997647L;
      Object[] var6 = var10003;
      Registry.packArgs(Ref.h(248904686894997647L, var6, var7));
      long var8 = 555473894912140963L;
      Ref.h2(555473894912140963L, var8);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }
   }
}





