package com.finalshell.core;

import com.thoughtworks.xstream.converters.basic.StringConverter;

public class FX extends StringConverter {
   @Override
   public Object fromString(String var1) {
      return LE_2.o((String)super.fromString(var1));
   }

   @Override
   public String toString(Object var1) {
      return LE_2.E(super.toString(var1));
   }
}





