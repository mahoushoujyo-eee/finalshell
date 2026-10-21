package com;

import java.awt.ComponentOrientation;

class YI extends com.YO {
   @Override
   public void Z(String var1, String var2) {
      ComponentOrientation var3 = ComponentOrientation.getOrientation(i2_2.Z(var1));
      ComponentOrientation var4 = ComponentOrientation.getOrientation(i2_2.Z(var2));
      if (var3.isLeftToRight() != var4.isLeftToRight()) {
         com.FN.D();
      }
   }
}





