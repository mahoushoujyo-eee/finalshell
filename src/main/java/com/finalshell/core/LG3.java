package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public final class LG3 {
   @Contract(
      value = "null -> null; !null -> new",
      pure = true
   )
   @Nullable
   public static Color H(@Nullable XF3 var0) {
      return var0 == null ? null : new Color(var0.p(), true);
   }

   @Contract("null -> null; !null -> new")
   @Nullable
   public static XF3 l(@Nullable Color var0) {
      return var0 == null ? null : new XF3(var0.getRGB(), true);
   }

   @Contract("null -> null; !null -> new")
   @Nullable
   public static Et2 J(@Nullable Color var0) {
      int var1 = ConnectionProperty.y();
      Color var10000 = var0;
      if (var1 == 0) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      return Et2.R(l(var10000));
   }
}





