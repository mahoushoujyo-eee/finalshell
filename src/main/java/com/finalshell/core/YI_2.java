package com.finalshell.core;

import java.awt.ComponentOrientation;

public class YI_2 extends YO {
   YI_2() {
   }

   @Override
   public void Z(String var1, String var2) {
      ComponentOrientation var3 = ComponentOrientation.getOrientation(I22.Z(var1));
      ComponentOrientation var4 = ComponentOrientation.getOrientation(I22.Z(var2));
      if (var3.isLeftToRight() != var4.isLeftToRight()) {
         FN.D();
      }
   }
}





