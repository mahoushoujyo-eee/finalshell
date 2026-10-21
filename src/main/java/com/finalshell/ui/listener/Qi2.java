package com.finalshell.ui.listener;

import com.finalshell.core.KV;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ResetPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

public class Qi2 implements ActionListener {
   public final Y12_2 Y;
   public final com.finalshell.core.C Z;
   public final ResetPanel R;

   public Qi2(ResetPanel var1, Y12_2 var2, com.finalshell.core.C var3) {
      this.R = var1;
      this.Y = var2;
      this.Z = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b$arrString();
      if (var2 == null) {
         Object var3 = 237790637254787750L;
         Ref.g(237790637254787750L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 410760064034581011L;
         Object[] var5 = var10002;
         var10002 = Ref.h(410760064034581011L, var5, var6);

         try {
            var25 = (Boolean)var10002;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         if (!var25) {
            Object var7 = 592211566194312411L;
            Ref.g(592211566194312411L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 208504098353916469L;
            Object[] var9 = var10004;
            Ref.h(208504098353916469L, var9, var10);
            Object var11 = 592211566194312411L;
            Ref.g(592211566194312411L, var11);
            Object var13 = 635187916850230994L;
            JPopupMenu var10006 = (JPopupMenu)Ref.g(635187916850230994L, var13);
            Object var15 = 406703713933802543L;
            com.finalshell.core.C var10008 = (com.finalshell.core.C)Ref.g(406703713933802543L, var15);
            Object var17 = 406703713933802543L;
            var10008.show(2, (int)this, ((com.finalshell.core.C)Ref.g(406703713933802543L, var17)).getHeight());
            if (var2 == null) {
               return;
            }
         }
      }

      Object var19 = 592211566194312411L;
      Ref.g(592211566194312411L, var19);
      Object var21 = 635187916850230994L;
      ((JPopupMenu)Ref.g(635187916850230994L, var21)).setVisible(false);
   }
}





