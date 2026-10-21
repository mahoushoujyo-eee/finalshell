package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Gt2_2 implements Di4_2 {
   @Override
   public void O(DataInputStream var1, DataOutputStream var2, String var3, String var4) throws IOException {
      var2.writeInt(var3.getBytes().length);
      var2.write(var3.getBytes());
      var2.writeInt(var4.getBytes().length);
      var2.write(var4.getBytes());
   }
}





