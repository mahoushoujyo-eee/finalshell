package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JW implements MouseListener {
   public final Address O;

   public JW(Address var1) {
      this.O = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Object var3 = 389694495067679276L;
         Ref.g(389694495067679276L, var3);
         Object var5 = 150762093507542450L;
         com.finalshell.core.Km2 var10004 = (com.finalshell.core.Km2)Ref.g(150762093507542450L, var5);
         Object var7 = 389694495067679276L;
         Object var10006 = Ref.g(389694495067679276L, var7);
         Object var9 = 246488842365380158L;
         Kl4 var10007 = (Kl4)Ref.g(246488842365380158L, var9);
         Object var11 = 389694495067679276L;
         Object var10009 = Ref.g(389694495067679276L, var11);
         Object var13 = 627973027287447539L;
var10007 = new JW(this, (Kl4)var10009, (Connection4)Ref.g(627973027287447539L, var13));
         Object var2 = var10006;
         ((SetExternalEditorPanel)var2).show((Component)var1.getSource(), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Address.g();
      Object var3 = 389694495067679276L;
      Ref.g(389694495067679276L, var3);
      Object var5 = 150762093507542450L;
      ((com.finalshell.core.Km2)Ref.g(150762093507542450L, var5)).requestFocus();
      Object var7 = 389694495067679276L;
      Object var10004 = Ref.g(389694495067679276L, var7);
      Object var9 = 150762093507542450L;
      ((com.finalshell.core.Km2)Ref.g(150762093507542450L, var9)).clearSelection();
      Object var2 = var10004;
      Object var11 = 389694495067679276L;
      Ref.g(389694495067679276L, var11);
      Object var13 = 150762093507542450L;
      Object var10006 = ((com.finalshell.core.Km2)Ref.g(150762093507542450L, var13)).getCellEditor();
      if (var2 == null) {
         if (var10006 == null) {
            return;
         }

         var10006 = this;
         Object var15 = 389694495067679276L;
         Ref.g(389694495067679276L, var15);
         Object var17 = 150762093507542450L;
         ((com.finalshell.core.Km2)Ref.g(150762093507542450L, var17)).getCellEditor();
      }

      var10006.stopCellEditing();
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





