package com.finalshell.ui.listener;

import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class DG implements PopupMenuListener {
   final Y12_2 W;

   DG(Y12_2 var1) {
      this.W = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      Object var2 = 214973477385371850L;
      Registry.lookupField(126803268638211778L).setLong(Ref.g(214973477385371850L, var2), System.currentTimeMillis());
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
   }
}





