package com.finalshell.core;

import com.finalshell.network.SW;
import java.awt.event.KeyEvent;

public class RV3 extends Wc2{
   public final SW M;
   public final com.finalshell.ui.dialog.DA G;

   public RV3(com.finalshell.ui.dialog.DA var1, SW var2) {
      this.G = var1;
      this.M = var2;
   }

   @Override
   public void j(KeyEvent var1) {
      this.G.c();
   }
}





