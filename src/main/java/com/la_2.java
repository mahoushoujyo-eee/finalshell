package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.text.Document;

class La_2 implements PropertyChangeListener {
   final eK_3 O;

   La_2(eK_3 var1) {
      this.O = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String var2;
      Object var5;
      var5 = com.FV.D();
      Object var3 = var1.getOldValue();
      var2 = (String)var5;
      var5 = var3;
      label35:
      if (var2 == null) {
         if (var3 != null) {
            var5 = var3;
            if (var2 != null) {
               break label35;
            }

            if (var3 instanceof Document) {
               ((Document)var3).removeDocumentListener(this.O);
            }
         }

         var5 = var1.getNewValue();
      }

      Object var4 = var5;
      var5 = var4;
      if (var2 == null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      if (var2 == null) {
         if (!(var5 instanceof Document)) {
            return;
         }

         var5 = var4;
      }

      ((Document)var5).addDocumentListener(this.O);
   }
}





