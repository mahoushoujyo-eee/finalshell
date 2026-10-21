package com.finalshell.core;

import java.net.DatagramPacket;

public class UD {
   public static String[] E;

   public UD(DatagramPacket var1) {
   }

   public void X() {
   }

   public static void W(String[] var0) {
      E = var0;
   }

   public static String[] L() {
      return E;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (L() == null) {
         W(new String[3]);
      }
   }
}





