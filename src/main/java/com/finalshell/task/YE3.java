package com.finalshell.task;

import com.finalshell.core.Ne4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportExportPanel;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.lang.reflect.InvocationTargetException;

public class YE3 implements Runnable {
   public final String t;
   public final ImportExportPanel I;
   public final ShowDeletedPanel R;

   public YE3(ShowDeletedPanel var1, String var2, ImportExportPanel var3) {
      this.R = var1;
      this.t = var2;
      this.I = var3;
   }

   @Override
   public void run() {
      F8.y();
      Object var3 = 544368388325236100L;
      String var2 = (String)Ref.g(544368388325236100L, var3);
      Object var5 = 492207895670547820L;
      Ref.g(492207895670547820L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 606838486540289950L;
      Object[] var7 = var10003;
      Ref.h(606838486540289950L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Object var9 = 583933236218406261L;
      ((ShowDeletedPanel)Ref.g(583933236218406261L, var9)).repaint();
      Object var11 = 583933236218406261L;
      Ref.g(583933236218406261L, var11);
      Object var13 = 354859781990372885L;
      Ref.g(354859781990372885L, var13);
      Object var15 = 257294914128163735L;
      Ref.g(257294914128163735L, var15);
      Object[] var10008 = Registry.emptyArgs();
      long var18 = 149160680229662748L;
      Object[] var17 = var10008;
      Ref.h(149160680229662748L, var17, var18);
      Object[] var10009 = Registry.emptyArgs();
      long var20 = 615229640085119640L;
      Object[] var19 = var10009;
      Ref.h(615229640085119640L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object var21 = 583933236218406261L;
      ShowDeletedPanel var10010 = (ShowDeletedPanel)Ref.g(583933236218406261L, var21);
      if (this == null) {
         Registry.lookupField(576761866492028513L).setBoolean(var10010, false);
         Object var23 = 583933236218406261L;
         Object var10012 = Ref.g(583933236218406261L, var23);
         Object var25 = 503453149395465632L;
         if (var10012.equals(((Ne4)Ref.g(503453149395465632L, var25)).getText().trim())) {
            return;
         }

         Object var27 = 583933236218406261L;
         ShowDeletedPanel var10013 = (ShowDeletedPanel)Ref.g(583933236218406261L, var27);
      }

      Object[] var10011 = Registry.emptyArgs();
      long var30 = 428473676051130971L;
      Object[] var29 = var10011;
      Ref.h(428473676051130971L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }
}





