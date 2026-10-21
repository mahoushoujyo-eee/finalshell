package com.finalshell.ui.listener;

import com.finalshell.reflect.Registry;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class XY implements PopupMenuListener {
   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      Registry.lookupField(255505359833607161L).setLong(null, System.currentTimeMillis());
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
   }
}





