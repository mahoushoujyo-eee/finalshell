package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.util.ArrayList;

public class Vg2 {
   public boolean W;
   public ArrayList m;
   public com.finalshell.ui.panel.Z7 k;

   public Vg2() {
      Registry.lookupField(395354275000751234L).setBoolean(this, true);
      ArrayList var10001 = new ArrayList();
      long var2 = 613743990550512135L;
      ArrayList var1 = var10001;
      Ref.s(613743990550512135L, var1, var2);
   }

   public void Z(String var1) {
      Object var2 = 613743990550512135L;
      ((ArrayList)Ref.g(613743990550512135L, var2)).add(var1);
   }

   public ArrayList Q() {
      Object var1 = 613743990550512135L;
      return (ArrayList)Ref.g(613743990550512135L, var1);
   }

   public boolean x() {
      return Registry.lookupField(395354275000751234L).getBoolean(this);
   }

   public void j(boolean var1) {
      Registry.lookupField(395354275000751234L).setBoolean(this, var1);
   }

   public com.finalshell.ui.panel.Z7 G() {
      Object var1 = 118947669256734443L;
      return (com.finalshell.ui.panel.Z7)Ref.g(118947669256734443L, var1);
   }

   public void n(com.finalshell.ui.panel.Z7 var1) {
      long var3 = 118947669256734443L;
      Ref.s(118947669256734443L, var1, var3);
   }
}





