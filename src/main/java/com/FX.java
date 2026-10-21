package com;

import com.thoughtworks.xstream.converters.basic.StringConverter;

public class FX extends StringConverter {
   @Override
   public Object fromString(String var1) {
      return com.LE.o((String)super.fromString(var1));
   }

   @Override
   public String toString(Object var1) {
      return com.LE.E(super.toString(var1));
   }
}





