package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Cy2_3 extends Y_3 {
   public Cy2_3(short var1) {
      super(var1);
   }

   public static Y_3 T(short var0, DataInputStream var1) {
      return new Cy2_3(var0);
   }

   @Override
   public void T(DataOutputStream var1) {
   }

   public static Y_3 w(short var0, DataInputStream var1) {
      return T(var0, var1);
   }
}





