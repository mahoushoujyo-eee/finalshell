package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class CA extends Y_3 {
   public CA(short var1) {
      super(var1);
   }

   public static Y_3 v(short var0, DataInputStream var1) {
      return new CA(var0);
   }

   @Override
   public void T(DataOutputStream var1) {
   }

   public static Y_3 K(short var0, DataInputStream var1) {
      return v(var0, var1);
   }
}





