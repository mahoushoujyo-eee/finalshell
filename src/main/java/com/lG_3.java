package com;

import java.awt.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public final class lG_3 {
   @Contract(
      value = "null -> null; !null -> new",
      pure = true
   )
   @Nullable
   public static Color H(@Nullable xF_3 var0) {
      return var0 == null ? null : new Color(var0.p(), true);
   }

   @Contract("null -> null; !null -> new")
   @Nullable
   public static xF_3 l(@Nullable Color var0) {
      return var0 == null ? null : new xF_3(var0.getRGB(), true);
   }

   @Contract("null -> null; !null -> new")
   @Nullable
   public static Et_2 J(@Nullable Color var0) {
      int var1 = _y_2.y();
      Color var10000 = var0;
      if (var1 == 0) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      return Et_2.R(l(var10000));
   }
}





