package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class BM3 implements ActionListener {
   public final JCheckBox u;
   public final ShowDeletedPanel L;

   public BM3(ShowDeletedPanel var1, JCheckBox var2) {
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      Object var3 = 615289893081121817L;
      Ref.g(615289893081121817L, var3);
      Object var5 = 354859781990372885L;
      Ref.g(354859781990372885L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 258495433430833129L;
      Object[] var7 = var10003;
      Ref.h(258495433430833129L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw new RuntimeException(var14.getTargetException());
      }

      Object var9 = 526023401269638701L;
      boolean var10005 = ((JCheckBox)Ref.g(526023401269638701L, var9)).isSelected();
      if (var2 == null) {
         var10005 = !var10005;
      }

      Object[] var15 = Registry.packArgs(var10005);
      long var12 = 422508769180655952L;
      Object[] var11 = var15;
      Ref.h(422508769180655952L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw new RuntimeException(var13.getTargetException());
      }
   }
}





