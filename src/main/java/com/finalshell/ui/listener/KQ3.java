package com.finalshell.ui.listener;

import com.finalshell.core.C_C;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

public class KQ3 implements ActionListener {
   final Y12_2 y;
   final SelectDownloadFolderPanel Y;
   public static long a;

   KQ3(SelectDownloadFolderPanel var1, Y12_2 var2) {
      this.Y = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      if (var2 == null) {
         Object var4 = 468253182890378749L;
         Ref.g(468253182890378749L, var4);
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 410760064034581011L;
         Object[] var6 = var10002;
         var10002 = Ref.h(410760064034581011L, var6, var7);

         try {
            var30 = (Boolean)var10002;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         if (!var30) {
            Object var8 = 164442468897949047L;
            Ref.g(164442468897949047L, var8);
            Object var10 = 468326905894456044L;
            Dimension var3 = ((JPopupMenu)Ref.g(468326905894456044L, var10)).getPreferredSize();
            Object var12 = 164442468897949047L;
            Ref.g(164442468897949047L, var12);
            Object var14 = 468326905894456044L;
            JPopupMenu var10006 = (JPopupMenu)Ref.g(468326905894456044L, var14);
            Object var16 = 164442468897949047L;
            Ref.g(164442468897949047L, var16);
            Object var18 = 435031631667149019L;
            C_C var10009 = (C_C)Ref.g(435031631667149019L, var18);
            int var10010 = (int)a;
            Object var20 = 164442468897949047L;
            Object var10012 = Ref.g(164442468897949047L, var20);
            Object var22 = 435031631667149019L;
            var10010.show(this, (int)var10012, ((C_C)Ref.g(435031631667149019L, var22)).getHeight() + 4);
            if (var2 == null) {
               return;
            }
         }
      }

      Object var24 = 164442468897949047L;
      Ref.g(164442468897949047L, var24);
      Object var26 = 468326905894456044L;
      ((JPopupMenu)Ref.g(468326905894456044L, var26)).setVisible(false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1654064544388987467L;
      long var10002 = 7960623010776368560L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





