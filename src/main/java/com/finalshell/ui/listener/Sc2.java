package com.finalshell.ui.listener;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Sc2 extends ComponentAdapter {
   final SetBackgroundImagePanel G;

   Sc2(SetBackgroundImagePanel var1) {
      this.G = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      SetBackgroundImagePanel.I(this.G);
   }
}





