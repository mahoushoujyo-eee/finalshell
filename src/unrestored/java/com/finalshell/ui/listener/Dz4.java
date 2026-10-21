package com.finalshell.ui.listener;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Dz4 extends ComponentAdapter {
   public final SetBackgroundImagePanel w;

   public Dz4(SetBackgroundImagePanel var1) {
      this.w = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      SetBackgroundImagePanel.I(this.w);
   }
}





