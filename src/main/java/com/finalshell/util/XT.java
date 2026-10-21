package com.finalshell.util;

import java.util.HashMap;

public class XT extends HashMap {
   XT(int var1) {
      super(var1);
      this.put(boolean.class, "Z");
      this.put(char.class, "C");
      this.put(byte.class, "B");
      this.put(short.class, "S");
      this.put(int.class, "I");
      this.put(long.class, "J");
      this.put(float.class, "F");
      this.put(double.class, "D");
   }
}





