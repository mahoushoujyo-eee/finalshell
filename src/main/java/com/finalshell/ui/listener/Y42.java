package com.finalshell.ui.listener;

import com.finalshell.core.NA_2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ImportPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Y42 implements MouseListener {
   final NA_2 L;

   Y42(NA_2 var1) {
      this.L = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      ImportPanel.j();
      Object var4 = 151107122339903167L;
      int var3 = ((NA_2)Ref.g(151107122339903167L, var4)).rowAtPoint(var1.getPoint());
      Y42 var10001 = var1.getButton();
      byte var10002 = 3;
      if (this != null) {
         label28: {
            if (var10001 == 3) {
               var10001 = this;
               Object var6 = 151107122339903167L;
               boolean var10 = ((NA_2)Ref.g(151107122339903167L, var6)).isRowSelected(var3);
               if (this == null) {
                  break label28;
               }

               if (!var10) {
                  Object var8 = 151107122339903167L;
                  ((NA_2)Ref.g(151107122339903167L, var8)).getSelectionModel().setSelectionInterval(var3, var3);
               }
            }

            var10001 = var1.getButton();
         }

         var10002 = 1;
      }

      if (this != null) {
         if (var10001 != var10002) {
            return;
         }

         var10001 = var1.getClickCount();
         var10002 = 2;
      }

      if (var10001 == var10002) {
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





