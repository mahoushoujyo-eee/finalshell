package com.finalshell.ui.listener;

import com.finalshell.core.DT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Fr4;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class M9 implements MouseListener {
   final SelectDownloadFolderPanel P;
   final Fr4 m;
   final DT T;

   M9(DT var1, SelectDownloadFolderPanel var2, Fr4 var3) {
      this.T = var1;
      this.P = var2;
      this.m = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      SelectDownloadFolderPanel.O$arrint();
      Object var5 = 256408289213989983L;
      int var3 = ((DT)Ref.g(256408289213989983L, var5)).rowAtPoint(var1.getPoint());
      int var10001 = var1.getButton();
      byte var10002 = 3;
      if (this == null) {
         if (var10001 == 3) {
            label38: {
               Object var7 = 256408289213989983L;
               Object var28 = (DT)Ref.g(256408289213989983L, var7);
               if (this == null) {
                  if (((DT)var28).isRowSelected(var3)) {
                     break label38;
                  }

                  var28 = this;
                  Object var9 = 256408289213989983L;
                  DT var10003 = (DT)Ref.g(256408289213989983L, var9);
               }

               ((DT)var28).getSelectionModel().setSelectionInterval(var3, var3);
            }

            Object var11 = 199773765280877583L;
            SelectDownloadFolderPanel var10005 = (SelectDownloadFolderPanel)Ref.g(199773765280877583L, var11);
            Object var13 = 256408289213989983L;
            Object var10007 = Ref.g(256408289213989983L, var13);
            Object var15 = 520595572764773303L;
            DT var10008 = (DT)Ref.g(520595572764773303L, var15);
            Object var17 = 504540812240479562L;
new M9(var10008, this, (Fr4)Ref.g(504540812240479562L, var17));
            Object var19 = 256408289213989983L;
            Object var30 = Ref.g(256408289213989983L, var19);
            Object var21 = 520595572764773303L;
            ((ShowInFolderPanel)var30).show((DT)Ref.g(520595572764773303L, var21), var1.getX(), var1.getY());
         }

         var10001 = var1.getButton();
         var10002 = 1;
      }

      if (this == null) {
         if (var10001 != var10002) {
            return;
         }

         var10001 = var1.getClickCount();
         var10002 = 2;
      }

      if (var10001 == var10002) {
         Object var23 = 199773765280877583L;
         Ref.g(199773765280877583L, var23);
         Object[] var29 = Registry.emptyArgs();
         long var26 = 506366507584924367L;
         Object[] var25 = var29;
         Ref.h(506366507584924367L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }
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





