package com;

import java.util.ArrayList;
import javax.swing.text.Segment;

public final class WP {
   private ArrayList O = new ArrayList(2);
   private static com.WP L = new com.WP();

   private WP() {
   }

   public static Segment x() {
      int var0 = L.O.size();
      return var0 > 0 ? (Segment)L.O.remove(var0 - 1) : new Segment();
   }

   public static void D(Segment var0) {
      var0.array = null;
      var0.count = 0;
      L.O.add(var0);
   }
}





