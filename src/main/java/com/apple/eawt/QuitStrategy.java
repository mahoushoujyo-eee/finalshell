package com.apple.eawt;

public final class QuitStrategy {
   private static QuitStrategy[] $VALUES;
   public static QuitStrategy[] values() {
      return (QuitStrategy[])$VALUES.clone();
   }

   public static QuitStrategy valueOf(String name) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public QuitStrategy(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      $VALUES = new QuitStrategy[0];
   }
}





