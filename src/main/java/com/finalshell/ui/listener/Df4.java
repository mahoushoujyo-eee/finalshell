package com.finalshell.ui.listener;

import com.finalshell.core.KD;
import com.finalshell.core.Qe2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AcceleratePanel;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Df4 implements ActionListener {
   public final AcceleratePanel d;

   public Df4(AcceleratePanel var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      Object var3 = 220996271143196752L;
      Ref.g(220996271143196752L, var3);
      Object var5 = 442601371933228411L;
      Df4 var10002 = ((Qe2_2)Ref.g(442601371933228411L, var5)).isSelected();
      if (var2 == null) {
         if (var10002 == null) {
            Object var7 = 220996271143196752L;
            Registry.lookupField(144708592452319805L).setInt(Ref.g(220996271143196752L, var7), Registry.lookupField(168555354480801721L).getInt(null));
            Object var9 = 220996271143196752L;
            Ref.g(220996271143196752L, var9);
            Object var11 = 442601371933228411L;
            ((Qe2_2)Ref.g(442601371933228411L, var11)).setSelected(true);
            if (var2 == null) {
               return;
            }
         }

         var10002 = this;
         Object var13 = 220996271143196752L;
         Ref.g(220996271143196752L, var13);
         Object var15 = 266390688568107078L;
         ((Qe2_2)Ref.g(266390688568107078L, var15)).isSelected();
      }

      KD var10004;
      label46: {
         if (var2 == null) {
            if (var10002 == null) {
               Object var17 = 220996271143196752L;
               Ref.g(220996271143196752L, var17);
               Object var19 = 266390688568107078L;
               ((Qe2_2)Ref.g(266390688568107078L, var19)).setSelected(true);
               Object var21 = 220996271143196752L;
               Ref.g(220996271143196752L, var21);
               Object var23 = 220996271143196752L;
               Ref.g(220996271143196752L, var23);
               Object var25 = 503182329446332632L;
               Object[] var10008 = Registry.packArgs(Ref.g(503182329446332632L, var25));
               long var28 = 602040225738704982L;
               Object[] var27 = var10008;
               Ref.h(602040225738704982L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               if (var2 == null) {
                  return;
               }
            }

            var10002 = this;
            Object var29 = 220996271143196752L;
            Ref.g(220996271143196752L, var29);
            Object var31 = 624825723918235119L;
            var10004 = (KD)Ref.g(624825723918235119L, var31);
            if (var2 != null) {
               break label46;
            }

            var10004.isSelected();
         }

         if (var10002 == null) {
            return;
         }

         Object var33 = 220996271143196752L;
         Ref.g(220996271143196752L, var33);
         Object var35 = 624825723918235119L;
         var10004 = (KD)Ref.g(624825723918235119L, var35);
      }

      var10004.setSelected(true);
      Object var37 = 220996271143196752L;
      Registry.lookupField(144708592452319805L).setInt(Ref.g(220996271143196752L, var37), Registry.lookupField(553670676087696590L).getInt(null));
   }
}





