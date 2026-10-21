package com.finalshell.core;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.KeyEvent;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class AR extends AD_2 {
   public final SetBackgroundImagePanel b;

   public AR(SetBackgroundImagePanel var1, ZT var2, Predicate var3) {
      super(var2, var3);
      this.b = var1;
   }

   @Override
   public boolean X(@Nullable KeyEvent var1) {
      return var1 != null || SetBackgroundImagePanel.e(this.b) != null;
   }
}





