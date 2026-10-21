package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import org.fife.rsta.ui.search.SearchEvent;

// $VF: synthetic class
public class Fc4 {
   public static int[] f;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      f = new int[SearchEvent.Type.values().length];

      try {
         ((int[])Ref.g(145952206637596212L, null))[SearchEvent.Type.MARK_ALL.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         ((int[])Ref.g(145952206637596212L, null))[SearchEvent.Type.FIND.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         ((int[])Ref.g(145952206637596212L, null))[SearchEvent.Type.REPLACE.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         ((int[])Ref.g(145952206637596212L, null))[SearchEvent.Type.REPLACE_ALL.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}





