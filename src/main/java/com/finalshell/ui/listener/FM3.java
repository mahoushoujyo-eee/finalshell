package com.finalshell.ui.listener;

import com.finalshell.core.DT;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.model.Fr4;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FM3 implements MouseListener {
   final SelectDownloadFolderPanel i;

   FM3(SelectDownloadFolderPanel var1) {
      this.i = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Object var3 = 399794680803283247L;
         SelectDownloadFolderPanel var10003 = (SelectDownloadFolderPanel)Ref.g(399794680803283247L, var3);
         Object var5 = 399794680803283247L;
         Ref.g(399794680803283247L, var5);
         Object var7 = 622126560416402693L;
         DT var10006 = (DT)Ref.g(622126560416402693L, var7);
         Object var9 = 399794680803283247L;
         Object var10008 = Ref.g(399794680803283247L, var9);
         Object var11 = 344912960350819457L;
new FM3(this, (DT)var10008, (Fr4)Ref.g(344912960350819457L, var11));
         Object var13 = 399794680803283247L;
         Object var10007 = Ref.g(399794680803283247L, var13);
         Object var15 = 622126560416402693L;
         ((ShowInFolderPanel)var10007).show((DT)Ref.g(622126560416402693L, var15), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 399794680803283247L;
      Ref.g(399794680803283247L, var2);
      Object var4 = 622126560416402693L;
      ((DT)Ref.g(622126560416402693L, var4)).clearSelection();
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





